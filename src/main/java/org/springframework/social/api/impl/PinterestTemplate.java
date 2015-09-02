package org.springframework.social.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.api.BoardOperations;
import org.springframework.social.api.PinOperations;
import org.springframework.social.api.Pinterest;
import org.springframework.social.api.UserOperations;
import org.springframework.social.api.impl.json.PinterestModule;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestTemplate extends AbstractOAuth2ApiBinding implements Pinterest {
    private final static Logger log = LoggerFactory.getLogger(PinterestTemplate.class);
    private final UserOperations userOperations;

    public PinterestTemplate(String clientId, String accessToken) {
        this(clientId, accessToken, true);
    }

    private PinterestTemplate(String clientId, String accessToken, boolean isAuthorized) {
        super(accessToken);

        registerPinterestJsonModule(getRestTemplate());
        this.userOperations = new UserOperationsTemplate(this, isAuthorized);

    }

    @Override
    protected void configureRestTemplate(RestTemplate restTemplate) {
        super.configureRestTemplate(restTemplate);
        restTemplate.setErrorHandler(new PinterestErrorHandler());
    }

    @Override
    protected MappingJackson2HttpMessageConverter getJsonMessageConverter() {
        MappingJackson2HttpMessageConverter jsonMessageConverter = super.getJsonMessageConverter();
        configure(jsonMessageConverter);
        return jsonMessageConverter;
    }

    private void configure(MappingJackson2HttpMessageConverter jsonMessageConverter) {
        jsonMessageConverter.getObjectMapper().registerModule(new JodaModule());
        jsonMessageConverter.getObjectMapper().registerModule(new PinterestModule());
    }

    @Override
    public UserOperations userOperations() {
        return userOperations;
    }

    @Override
    public PinOperations pinOperations() {
        //TODO add implementation
        return null;
    }

    @Override
    public BoardOperations boardOperations() {
        //TODO add implementation
        return null;
    }

    private void registerPinterestJsonModule(RestTemplate restTemplate) {
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof MappingJackson2HttpMessageConverter) {
                MappingJackson2HttpMessageConverter jsonConverter = (MappingJackson2HttpMessageConverter) converter;
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.registerModule(new PinterestModule());
                jsonConverter.setObjectMapper(objectMapper);
            }
        }
    }
}

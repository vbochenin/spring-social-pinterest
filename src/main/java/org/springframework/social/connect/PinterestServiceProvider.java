package org.springframework.social.connect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.Pinterest;
import org.springframework.social.api.impl.PinterestTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2ServiceProvider;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestServiceProvider extends AbstractOAuth2ServiceProvider<Pinterest> {
    private final static Logger log = LoggerFactory.getLogger(PinterestServiceProvider.class);
    private final String clientId;

    public PinterestServiceProvider(String clientId, String clientSecret) {
        super(new PinterestOAuth2Template(clientId, clientSecret));
        this.clientId = clientId;
    }

    @Override
    public Pinterest getApi(String accessToken) {
        return new PinterestTemplate(clientId, accessToken);
    }
}

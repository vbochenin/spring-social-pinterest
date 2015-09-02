package org.springframework.social.api.impl.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.PinterestProfile;

import java.io.IOException;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
@JsonDeserialize(using = PinterestProfileContainer.Deserializer.class)
public class PinterestProfileContainer extends AbstractPinterestContainer<PinterestProfile> {
    private final static Logger log = LoggerFactory.getLogger(PinterestProfileContainer.class);

    public PinterestProfileContainer(PinterestProfile pinterestProfile) {
        super(pinterestProfile);
    }

    public static final class Deserializer extends AbstractPinterestContainerDeserializer<PinterestProfileContainer> {

        @Override
        public PinterestProfileContainer deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return deserializeResponse(jsonParser, PinterestProfileContainer.class, PinterestProfile.class);
        }
    }
}

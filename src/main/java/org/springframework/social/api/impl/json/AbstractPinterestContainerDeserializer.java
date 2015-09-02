package org.springframework.social.api.impl.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
abstract class AbstractPinterestContainerDeserializer<T> extends JsonDeserializer<T> {
    private final static Logger log = LoggerFactory.getLogger(AbstractPinterestContainerDeserializer.class);


    public T deserializeResponse(JsonParser jsonParser, Class<T> container, Class<?> containee) throws IOException, JsonProcessingException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldname = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if ("data".equals(fieldname)) {
                try {
                    return container.getConstructor(containee).newInstance(jsonParser.readValueAs(containee));
                } catch (Exception e) {

                    return null;
                }
            }
        }
        return null;
    }
}

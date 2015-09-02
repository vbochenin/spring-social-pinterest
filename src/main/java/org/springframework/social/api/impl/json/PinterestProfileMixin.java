package org.springframework.social.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.PinterestImage;

import java.util.Map;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class PinterestProfileMixin {
    private final static Logger log = LoggerFactory.getLogger(PinterestProfileMixin.class);

    @JsonProperty("id")
    String id;

    @JsonProperty("username")
    String username;

    @JsonProperty("first_name")
    String firstname;

    @JsonProperty("last_name")
    String lastname;

    @JsonProperty("bio")
    String bio;

    @JsonProperty("created_at")
    DateTime createdAt;

    @JsonProperty("counts")
    Map<String, Integer> counts;

    @JsonProperty("image")
    Map<String, PinterestImage> images;
}

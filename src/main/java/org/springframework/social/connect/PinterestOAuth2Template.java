package org.springframework.social.connect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestOAuth2Template extends OAuth2Template {
    private final static Logger log = LoggerFactory.getLogger(PinterestOAuth2Template.class);

    public PinterestOAuth2Template(String clientId, String clientSecret) {
        super(clientId, clientSecret, "https://api.pinterest.com/oauth/", "https://api.pinterest.com/v1/oauth/token");
    }
}

package org.springframework.social.connect;

import org.springframework.social.api.Pinterest;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestConnectionFactory extends OAuth2ConnectionFactory<Pinterest> {
    private static final String PINTEREST_PROVIDER = "pinterest";

    public PinterestConnectionFactory(String clientId, String clientSecret) {
        super(PINTEREST_PROVIDER, new PinterestServiceProvider(clientId, clientSecret), new PinterestAdapter());
    }

}

package org.springframework.social.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.BoardOperations;
import org.springframework.social.api.PinOperations;
import org.springframework.social.api.Pinterest;
import org.springframework.social.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestTemplate extends AbstractOAuth2ApiBinding implements Pinterest {
    private final static Logger log = LoggerFactory.getLogger(PinterestTemplate.class);

    public PinterestTemplate(String clientId, String accessToken) {
    }

    @Override
    public UserOperations userOperations() {
        //TODO add implementation
        return null;
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
}

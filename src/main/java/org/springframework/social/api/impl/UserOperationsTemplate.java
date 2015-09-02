package org.springframework.social.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.PinterestProfile;
import org.springframework.social.api.UserOperations;
import org.springframework.social.api.impl.json.PinterestProfileContainer;

import java.util.List;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class UserOperationsTemplate implements UserOperations {
    private final static Logger log = LoggerFactory.getLogger(UserOperationsTemplate.class);
    private final PinterestTemplate pinterestTemplate;
    private final boolean isAuthroized;

    private static final String API_URL_BASE = "https://api.pinterest.com/v1";


    public UserOperationsTemplate(PinterestTemplate pinterestTemplate, boolean isAuthorized) {
        this.pinterestTemplate = pinterestTemplate;
        this.isAuthroized = isAuthorized;
    }

    @Override
    public PinterestProfile getUser() {
        return pinterestTemplate.getRestTemplate().getForObject(API_URL_BASE + "/me", PinterestProfileContainer.class).getObject();
    }

    @Override
    public PinterestProfile getUser(String userId) {
        return pinterestTemplate.getRestTemplate().getForObject(API_URL_BASE + "/users/" + userId, PinterestProfileContainer.class).getObject();
    }

    @Override
    public List<PinterestProfile> getFollowers() {
        //TODO add implementation
        return null;
    }

    @Override
    public List<PinterestProfile> getFollowingUsers() {
        //TODO add implementation
        return null;
    }

    @Override
    public void follow(String userId) {
        //TODO add implementation
    }

    @Override
    public void unfollow(String userId) {
        //TODO add implementation

    }
}

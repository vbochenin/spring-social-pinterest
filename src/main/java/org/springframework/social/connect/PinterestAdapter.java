package org.springframework.social.connect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.Pinterest;
import org.springframework.social.api.PinterestProfile;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestAdapter implements ApiAdapter<Pinterest> {
    private final static Logger log = LoggerFactory.getLogger(PinterestAdapter.class);

    @Override
    public boolean test(Pinterest pinterest) {
        try {
            checkNotNull(pinterest);
            pinterest.userOperations().getUser();
            return true;
        } catch (Exception e) {
            log.error("Test failed: ", e);
            return false;
        }
    }

    @Override
    public void setConnectionValues(Pinterest Pinterest, ConnectionValues connectionValues) {
        PinterestProfile profile = Pinterest.userOperations().getUser();
        connectionValues.setProviderUserId(profile.getId());
        connectionValues.setDisplayName(profile.getUsername());
    }

    @Override
    public UserProfile fetchUserProfile(Pinterest pinterest) {
        PinterestProfile pinterestProfile = pinterest.userOperations().getUser();
        return new UserProfileBuilder()
                .setFirstName(pinterestProfile.getFirstName())
                .setLastName(pinterestProfile.getLastName())
                .setUsername(pinterestProfile.getUsername())
                .build();
    }

    @Override
    public void updateStatus(Pinterest pinterest, String message) {

    }
}

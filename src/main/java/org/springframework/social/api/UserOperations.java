package org.springframework.social.api;

/**
 * Basic operations with Pinterest user profiles
 *
 * @author vbochenin
 * @since 02/09/2015.
 */
public interface UserOperations {
    /**
     * Get basic information about authenticated user
     *
     * @return Pinterest profile
     */
    PinterestProfile getUser();

    /**
     * Get basic information about authenticated user
     *
     * @return Pinterest profile
     */
    PinterestProfile getUser(String userId);
}

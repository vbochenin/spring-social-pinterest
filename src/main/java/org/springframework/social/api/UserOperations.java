package org.springframework.social.api;

import java.util.List;

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


    /**
     * Get basic information about authenticated user’s followers
     *
     * @return list of pinterest profiles
     */
    List<PinterestProfile> getFollowers();


    /**
     * Get basic information about users the authenticated user follows
     *
     * @return list of pinterest profiles
     */
    List<PinterestProfile> getFollowingUsers();


    /**
     * Follow a user with defined id or username
     *
     * @param userId
     */
    void follow(String userId);

    /**
     * Unfollow a user with defined id or username
     *
     * @param userId
     */
    void unfollow(String userId);
}

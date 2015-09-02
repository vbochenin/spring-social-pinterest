package org.springframework.social.api;

import org.joda.time.DateTime;

import java.util.Map;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public interface PinterestProfile {

    /**
     * The user’s id
     *
     * @return
     */
    String getId();

    /**
     * The user’s Pinterest username
     *
     * @return
     */
    String getUsername();

    /**
     * The user’s first name
     *
     * @return
     */
    String getFirstName();

    /**
     * The user’s last name
     *
     * @return
     */
    String getLastName();

    /**
     * The user’s bio
     *
     * @return
     */
    String getBio();

    /**
     * Timestamp of creation date
     *
     * @return
     */
    DateTime getCreatedAt();


    /**
     * The stats/counts of the User (follower Pins, likes, boards)
     *
     * @return
     */
    Map<String, Integer> getCounts();

    /**
     * The images that represents the user. This is determined by the request.
     *
     * @return
     */
    Map<String, PinterestImage> getImages();
}

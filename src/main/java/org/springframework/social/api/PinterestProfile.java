package org.springframework.social.api;

import org.joda.time.DateTime;

import java.util.Map;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestProfile {

    private String id;
    private String username;
    private String firstname;
    private String lastname;
    private String bio;
    private DateTime createdAt;
    private Map<String, Integer> counts;
    private Map<String, PinterestImage> images;

    /**
     * The user’s id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * The user’s Pinterest username
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * The user’s first name
     *
     * @return
     */
    public String getFirstName() {
        return firstname;
    }

    /**
     * The user’s last name
     *
     * @return
     */
    public String getLastName() {
        return lastname;
    }

    /**
     * The user’s bio
     *
     * @return
     */
    public String getBio() {
        return bio;
    }

    /**
     * Timestamp of creation date
     *
     * @return
     */
    public DateTime getCreatedAt() {
        return createdAt;
    }


    /**
     * The stats/counts of the User (follower Pins, likes, boards)
     *
     * @return
     */
    public Map<String, Integer> getCounts() {
        return counts;
    }

    /**
     * The images that represents the user. This is determined by the request.
     *
     * @return
     */
    public Map<String, PinterestImage> getImages() {
        return images;
    }
}

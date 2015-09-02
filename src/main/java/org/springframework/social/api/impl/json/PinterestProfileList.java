package org.springframework.social.api.impl.json;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.PinterestProfile;

import java.util.List;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestProfileList {
    private final static Logger log = LoggerFactory.getLogger(PinterestProfileList.class);
    private List<PinterestProfile> list;

    public List<PinterestProfile> getList() {
        return list;
    }
}

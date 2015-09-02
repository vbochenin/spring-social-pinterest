package org.springframework.social.api.impl.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.api.PinterestProfile;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestModule extends SimpleModule {
    private final static Logger log = LoggerFactory.getLogger(PinterestModule.class);

    @Override
    public void setupModule(SetupContext context) {
        setMixInAnnotation(PinterestProfile.class, PinterestProfileMixin.class);
        super.setupModule(context);
    }
}

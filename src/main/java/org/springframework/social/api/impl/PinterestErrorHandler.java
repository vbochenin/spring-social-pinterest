package org.springframework.social.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public class PinterestErrorHandler extends DefaultResponseErrorHandler {
    private final static Logger log = LoggerFactory.getLogger(PinterestErrorHandler.class);


    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        //TODO add implementation
    }

}
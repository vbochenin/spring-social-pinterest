package org.springframework.social.api;

import org.springframework.social.ApiBinding;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
public interface Pinterest extends ApiBinding {

    UserOperations userOperations();

    PinOperations pinOperations();

    BoardOperations boardOperations();
}

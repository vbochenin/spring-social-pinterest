package org.springframework.social.api.impl.json;

/**
 * @author vbochenin
 * @since 02/09/2015.
 */
abstract class AbstractPinterestContainer<T> {
    private final T object;

    AbstractPinterestContainer(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}

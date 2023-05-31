package com.example.springbootblogrestapi.exceptions;

import org.springframework.http.HttpStatus;

/**
 * The type Blog api exception.
 */
public class BlogAPIException extends RuntimeException {

    private final HttpStatus status;
    private final String message;

    /**
     * Instantiates a new Blog api exception.
     *
     * @param status  the status
     * @param message the message
     */
    public BlogAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * Instantiates a new Blog api exception.
     *
     * @param message  the message
     * @param status   the status
     * @param message1 the message 1
     */
    public BlogAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

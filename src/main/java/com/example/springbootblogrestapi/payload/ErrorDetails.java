package com.example.springbootblogrestapi.payload;

import java.util.Date;

/**
 * The type Error details.
 */
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    /**
     * Instantiates a new Error details.
     *
     * @param timestamp the timestamp
     * @param message   the message
     * @param details   the details
     */
    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets details.
     *
     * @return the details
     */
    public String getDetails() {
        return details;
    }
}
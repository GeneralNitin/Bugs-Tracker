package com.devops.bugstracker.exceptions;

public class BugsTrackerException extends Exception {

    public BugsTrackerException() {
        super();
    }

    public BugsTrackerException(String message) {
        super(message);
    }

    public BugsTrackerException(String message, Throwable cause) {
        super(message, cause);
    }

    public BugsTrackerException(Throwable cause) {
        super(cause);
    }

    protected BugsTrackerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

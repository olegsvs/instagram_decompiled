package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    public static final long serialVersionUID = 123;
    public JsonLocation _location;

    public String getMessageSuffix() {
        return null;
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }

    public JsonProcessingException(String str, Throwable th) {
        this(str, null, th);
    }

    public JsonProcessingException(Throwable th) {
        this(null, null, th);
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(message);
        if (messageSuffix != null) {
            stringBuilder.append(messageSuffix);
        }
        if (location != null) {
            stringBuilder.append('\n');
            stringBuilder.append(" at ");
            stringBuilder.append(location.toString());
        }
        return stringBuilder.toString();
    }

    public String getOriginalMessage() {
        return super.getMessage();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(getMessage());
        return stringBuilder.toString();
    }
}

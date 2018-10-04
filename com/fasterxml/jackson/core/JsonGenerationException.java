package com.fasterxml.jackson.core;

public final class JsonGenerationException extends JsonProcessingException {
    public JsonGenerationException(String str) {
        super(str, (JsonLocation) null);
    }
}

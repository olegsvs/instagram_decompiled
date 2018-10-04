package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.core.JsonParser$NumberType;

public interface JsonIntegerFormatVisitor extends JsonValueFormatVisitor {

    public class Base extends JsonValueFormatVisitor$Base implements JsonIntegerFormatVisitor {
        public void numberType(JsonParser$NumberType jsonParser$NumberType) {
        }
    }

    void numberType(JsonParser$NumberType jsonParser$NumberType);
}

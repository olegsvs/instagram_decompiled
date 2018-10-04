package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;

public interface JsonFormatVisitable {
    void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType);
}

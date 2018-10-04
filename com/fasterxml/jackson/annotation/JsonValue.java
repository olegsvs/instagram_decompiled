package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonValue {
    boolean value() default true;
}

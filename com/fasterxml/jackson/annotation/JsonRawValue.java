package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonRawValue {
    boolean value() default true;
}

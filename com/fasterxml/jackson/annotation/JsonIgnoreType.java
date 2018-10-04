package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonIgnoreType {
    boolean value() default true;
}

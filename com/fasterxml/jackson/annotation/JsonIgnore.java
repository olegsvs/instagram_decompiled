package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonIgnore {
    boolean value() default true;
}

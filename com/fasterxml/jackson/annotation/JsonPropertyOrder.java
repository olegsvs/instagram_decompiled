package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonPropertyOrder {
    boolean alphabetic() default false;

    String[] value() default {};
}

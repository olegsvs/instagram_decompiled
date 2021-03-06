package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonIdentityInfo {
    Class generator();

    String property() default "@id";

    Class scope() default Object.class;
}

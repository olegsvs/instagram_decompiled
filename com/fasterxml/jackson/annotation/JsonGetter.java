package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonGetter {
    String value() default "";
}

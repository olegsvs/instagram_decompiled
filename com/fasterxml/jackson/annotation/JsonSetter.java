package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonSetter {
    String value() default "";
}

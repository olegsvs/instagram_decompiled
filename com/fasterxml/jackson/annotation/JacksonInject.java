package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JacksonInject {
    String value() default "";
}

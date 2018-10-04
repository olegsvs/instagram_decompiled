package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonTypeName {
    String value() default "";
}

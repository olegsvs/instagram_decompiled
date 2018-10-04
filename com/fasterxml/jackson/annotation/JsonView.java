package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonView {
    Class[] value() default {};
}

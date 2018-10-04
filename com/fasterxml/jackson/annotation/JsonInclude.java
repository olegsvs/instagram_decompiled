package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY
    }

    Include value() default Include.ALWAYS;
}

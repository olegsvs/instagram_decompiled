package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonProperty {
    public static final String USE_DEFAULT_NAME = "";

    boolean required() default false;

    String value() default "";
}

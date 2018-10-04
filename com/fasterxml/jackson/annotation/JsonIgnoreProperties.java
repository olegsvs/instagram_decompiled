package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonIgnoreProperties {
    boolean ignoreUnknown() default false;

    String[] value() default {};
}

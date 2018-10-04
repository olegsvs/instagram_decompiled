package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonUnwrapped {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}

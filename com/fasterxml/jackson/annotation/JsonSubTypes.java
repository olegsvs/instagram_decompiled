package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonSubTypes {

    public @interface Type {
        String name() default "";

        Class value();
    }

    Type[] value();
}

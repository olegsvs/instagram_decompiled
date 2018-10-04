package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonBackReference {
    String value() default "defaultReference";
}

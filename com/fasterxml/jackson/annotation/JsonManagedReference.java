package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonManagedReference {
    String value() default "defaultReference";
}

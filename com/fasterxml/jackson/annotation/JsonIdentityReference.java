package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonIdentityReference {
    boolean alwaysAsId() default false;
}

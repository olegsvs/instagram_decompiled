package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;

@JacksonAnnotation
public @interface JsonNaming {
    Class value();
}

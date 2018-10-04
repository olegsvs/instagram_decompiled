package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;

@JacksonAnnotation
public @interface JsonPOJOBuilder {

    public class Value {
        public final String buildMethodName;
        public final String withPrefix;

        public Value(JsonPOJOBuilder jsonPOJOBuilder) {
            this.buildMethodName = jsonPOJOBuilder.buildMethodName();
            this.withPrefix = jsonPOJOBuilder.withPrefix();
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}

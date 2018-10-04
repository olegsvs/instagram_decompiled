package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.JacksonAnnotation;

@JacksonAnnotation
public @interface JsonSerializableSchema {
    public static final String NO_VALUE = "##irrelevant";

    String id() default "";

    String schemaItemDefinition() default "##irrelevant";

    String schemaObjectPropertiesDefinition() default "##irrelevant";

    String schemaType() default "any";
}

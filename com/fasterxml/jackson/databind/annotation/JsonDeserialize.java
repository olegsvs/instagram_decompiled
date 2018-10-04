package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.JsonDeserializer$None;
import com.fasterxml.jackson.databind.KeyDeserializer$None;
import com.fasterxml.jackson.databind.util.Converter$None;

@JacksonAnnotation
public @interface JsonDeserialize {
    Class as() default NoClass.class;

    Class builder() default NoClass.class;

    Class contentAs() default NoClass.class;

    Class contentConverter() default Converter$None.class;

    Class contentUsing() default JsonDeserializer$None.class;

    Class converter() default Converter$None.class;

    Class keyAs() default NoClass.class;

    Class keyUsing() default KeyDeserializer$None.class;

    Class using() default JsonDeserializer$None.class;
}

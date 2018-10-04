package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.JsonSerializer.None;
import com.fasterxml.jackson.databind.util.Converter$None;

@JacksonAnnotation
public @interface JsonSerialize {

    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY
    }

    public enum Typing {
        DYNAMIC,
        STATIC
    }

    Class as() default NoClass.class;

    Class contentAs() default NoClass.class;

    Class contentConverter() default Converter$None.class;

    Class contentUsing() default None.class;

    Class converter() default Converter$None.class;

    Inclusion include() default Inclusion.ALWAYS;

    Class keyAs() default NoClass.class;

    Class keyUsing() default None.class;

    Typing typing() default Typing.DYNAMIC;

    Class using() default None.class;
}

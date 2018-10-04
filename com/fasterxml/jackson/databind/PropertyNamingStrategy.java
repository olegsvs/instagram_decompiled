package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

public abstract class PropertyNamingStrategy implements Serializable {
    public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = new PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy();
    public static final PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE = new PropertyNamingStrategy$PascalCaseStrategy();

    public String nameForConstructorParameter(MapperConfig mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    public String nameForField(MapperConfig mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String nameForGetterMethod(MapperConfig mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String nameForSetterMethod(MapperConfig mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }
}

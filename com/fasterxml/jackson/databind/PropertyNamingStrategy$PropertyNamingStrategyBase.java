package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

public abstract class PropertyNamingStrategy$PropertyNamingStrategyBase extends PropertyNamingStrategy {
    public abstract String translate(String str);

    public String nameForConstructorParameter(MapperConfig mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return translate(str);
    }

    public String nameForField(MapperConfig mapperConfig, AnnotatedField annotatedField, String str) {
        return translate(str);
    }

    public String nameForGetterMethod(MapperConfig mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return translate(str);
    }

    public String nameForSetterMethod(MapperConfig mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return translate(str);
    }
}

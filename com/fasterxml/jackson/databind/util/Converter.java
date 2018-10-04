package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public interface Converter {
    Object convert(Object obj);

    JavaType getInputType(TypeFactory typeFactory);

    JavaType getOutputType(TypeFactory typeFactory);
}

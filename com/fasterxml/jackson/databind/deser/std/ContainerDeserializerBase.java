package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

public abstract class ContainerDeserializerBase extends StdDeserializer {
    public abstract JsonDeserializer getContentDeserializer();

    public abstract JavaType getContentType();

    public ContainerDeserializerBase(Class cls) {
        super(cls);
    }
}

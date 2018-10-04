package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.Serializable;

public final class MinimalPrettyPrinter implements PrettyPrinter, Serializable {
    public String _rootValueSeparator;

    public final void beforeArrayValues(JsonGenerator jsonGenerator) {
    }

    public final void beforeObjectEntries(JsonGenerator jsonGenerator) {
    }

    public MinimalPrettyPrinter() {
        this(" ");
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = " ";
        this._rootValueSeparator = str;
    }

    public final void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(',');
    }

    public final void writeEndArray(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(']');
    }

    public final void writeEndObject(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw('}');
    }

    public final void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(',');
    }

    public final void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(':');
    }

    public final void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
    }

    public final void writeStartArray(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('[');
    }

    public final void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('{');
    }
}

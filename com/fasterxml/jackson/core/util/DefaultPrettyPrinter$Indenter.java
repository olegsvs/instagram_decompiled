package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;

public interface DefaultPrettyPrinter$Indenter {
    boolean isInline();

    void writeIndentation(JsonGenerator jsonGenerator, int i);
}

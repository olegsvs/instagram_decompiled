package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Serializable;

public class DefaultPrettyPrinter$NopIndenter implements DefaultPrettyPrinter$Indenter, Serializable {
    public static final DefaultPrettyPrinter$NopIndenter instance = new DefaultPrettyPrinter$NopIndenter();

    public boolean isInline() {
        return true;
    }

    public void writeIndentation(JsonGenerator jsonGenerator, int i) {
    }
}

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;

public final class DefaultPrettyPrinter$FixedSpaceIndenter extends DefaultPrettyPrinter$NopIndenter {
    public static final DefaultPrettyPrinter$FixedSpaceIndenter instance = new DefaultPrettyPrinter$FixedSpaceIndenter();

    public final boolean isInline() {
        return true;
    }

    public final void writeIndentation(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(' ');
    }
}

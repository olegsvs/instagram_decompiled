package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;

public final class DefaultPrettyPrinter implements PrettyPrinter, Instantiatable, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    public DefaultPrettyPrinter$Indenter _arrayIndenter;
    public transient int _nesting;
    public DefaultPrettyPrinter$Indenter _objectIndenter;
    public final SerializableString _rootSeparator;
    public boolean _spacesInObjectEntries;

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter(SerializableString serializableString) {
        this._arrayIndenter = DefaultPrettyPrinter$FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultPrettyPrinter$Lf2SpacesIndenter.instance;
        this._spacesInObjectEntries = true;
        this._nesting = 0;
        this._rootSeparator = serializableString;
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, SerializableString serializableString) {
        this._arrayIndenter = DefaultPrettyPrinter$FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultPrettyPrinter$Lf2SpacesIndenter.instance;
        this._spacesInObjectEntries = true;
        this._nesting = 0;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._rootSeparator = serializableString;
    }

    public final void beforeArrayValues(JsonGenerator jsonGenerator) {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public final void beforeObjectEntries(JsonGenerator jsonGenerator) {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public final DefaultPrettyPrinter createInstance() {
        return new DefaultPrettyPrinter(this);
    }

    public final void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(',');
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public final void writeEndArray(JsonGenerator jsonGenerator, int i) {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(' ');
        }
        jsonGenerator.writeRaw(']');
    }

    public final void writeEndObject(JsonGenerator jsonGenerator, int i) {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(' ');
        }
        jsonGenerator.writeRaw('}');
    }

    public final void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(',');
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public final void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        if (this._spacesInObjectEntries) {
            jsonGenerator.writeRaw(" : ");
        } else {
            jsonGenerator.writeRaw(':');
        }
    }

    public final void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        SerializableString serializableString = this._rootSeparator;
        if (serializableString != null) {
            jsonGenerator.writeRaw(serializableString);
        }
    }

    public final void writeStartArray(JsonGenerator jsonGenerator) {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.writeRaw('[');
    }

    public final void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('{');
        if (!this._objectIndenter.isInline()) {
            this._nesting++;
        }
    }
}

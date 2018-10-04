package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;

public abstract class JsonGeneratorImpl extends GeneratorBase {
    public static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    public CharacterEscapes _characterEscapes;
    public final IOContext _ioContext;
    public int _maximumNonEscapedChar;
    public int[] _outputEscapes = sOutputEscapes;
    public SerializableString _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public JsonGeneratorImpl(IOContext iOContext, int i, ObjectCodec objectCodec) {
        super(i, objectCodec);
        this._ioContext = iOContext;
        if (isEnabled(Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    public final CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public final int getHighestEscapedChar() {
        return this._maximumNonEscapedChar;
    }

    public final JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        if (characterEscapes == null) {
            this._outputEscapes = sOutputEscapes;
        } else {
            this._outputEscapes = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    public final JsonGenerator setHighestNonEscapedChar(int i) {
        if (i < 0) {
            i = 0;
        }
        this._maximumNonEscapedChar = i;
        return this;
    }

    public final JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this._rootValueSeparator = serializableString;
        return this;
    }

    public final Version version() {
        return VersionUtil.versionFor(getClass());
    }

    public final void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }
}

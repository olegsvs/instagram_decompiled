package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;

public class MappingJsonFactory extends JsonFactory {
    private static final long serialVersionUID = -6744103724013275513L;

    public String getFormatName() {
        return JsonFactory.FORMAT_NAME_JSON;
    }

    public MappingJsonFactory() {
        this(null);
    }

    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper((JsonFactory) this));
        }
    }

    public JsonFactory copy() {
        _checkInvalidCopy(MappingJsonFactory.class);
        return new MappingJsonFactory(null);
    }

    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }

    public MatchStrength hasFormat(InputAccessor inputAccessor) {
        return getClass() == MappingJsonFactory.class ? hasJSONFormat(inputAccessor) : null;
    }
}

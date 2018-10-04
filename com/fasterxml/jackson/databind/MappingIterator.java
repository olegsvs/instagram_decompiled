package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MappingIterator implements Iterator, Closeable {
    public static final MappingIterator EMPTY_ITERATOR = new MappingIterator(null, null, null, null, false, null);
    public final boolean _closeParser;
    public final DeserializationContext _context;
    public final JsonDeserializer _deserializer;
    public boolean _hasNextChecked;
    public JsonParser _parser;
    public final JavaType _type;
    public final Object _updatedValue;

    public MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer jsonDeserializer) {
        this(javaType, jsonParser, deserializationContext, jsonDeserializer, true, null);
    }

    public MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer jsonDeserializer, boolean z, Object obj) {
        this._type = javaType;
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        if (obj == null) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (z && jsonParser != null && jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            jsonParser.clearCurrentToken();
        }
    }

    public void close() {
        JsonParser jsonParser = this._parser;
        if (jsonParser != null) {
            jsonParser.close();
        }
    }

    public static MappingIterator emptyIterator() {
        return EMPTY_ITERATOR;
    }

    public JsonLocation getCurrentLocation() {
        return this._parser.getCurrentLocation();
    }

    public JsonParser getParser() {
        return this._parser;
    }

    public FormatSchema getParserSchema() {
        return this._parser.getSchema();
    }

    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e) {
            throw new RuntimeJsonMappingException(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public boolean hasNextValue() {
        JsonParser jsonParser = this._parser;
        if (jsonParser != null) {
            if (!this._hasNextChecked) {
                JsonToken currentToken = jsonParser.getCurrentToken();
                this._hasNextChecked = true;
                if (currentToken == null) {
                    JsonToken nextToken = this._parser.nextToken();
                    if (nextToken == null || nextToken == JsonToken.END_ARRAY) {
                        jsonParser = this._parser;
                        this._parser = null;
                        if (this._closeParser) {
                            jsonParser.close();
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public Object next() {
        try {
            return nextValue();
        } catch (JsonMappingException e) {
            throw new RuntimeJsonMappingException(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public Object nextValue() {
        if (!this._hasNextChecked) {
            if (hasNextValue()) {
            }
            throw new NoSuchElementException();
        }
        JsonParser jsonParser = this._parser;
        if (jsonParser != null) {
            Object deserialize;
            this._hasNextChecked = false;
            Object obj = this._updatedValue;
            if (obj == null) {
                deserialize = this._deserializer.deserialize(jsonParser, this._context);
            } else {
                this._deserializer.deserialize(jsonParser, this._context, obj);
                deserialize = this._updatedValue;
            }
            this._parser.clearCurrentToken();
            return deserialize;
        }
        throw new NoSuchElementException();
    }

    public List readAll() {
        return readAll(new ArrayList());
    }

    public List readAll(List list) {
        while (hasNextValue()) {
            list.add(nextValue());
        }
        return list;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}

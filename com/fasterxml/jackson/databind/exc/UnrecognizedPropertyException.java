package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collection;
import java.util.Collections;

public class UnrecognizedPropertyException extends JsonMappingException {
    private static final int MAX_DESC_LENGTH = 200;
    private static final long serialVersionUID = 1;
    public transient String _propertiesAsString;
    public final Collection _propertyIds;
    public final Class _referringClass;
    public final String _unrecognizedPropertyName;

    public UnrecognizedPropertyException(String str, JsonLocation jsonLocation, Class cls, String str2, Collection collection) {
        super(str, jsonLocation);
        this._referringClass = cls;
        this._unrecognizedPropertyName = str2;
        this._propertyIds = collection;
    }

    public static UnrecognizedPropertyException from(JsonParser jsonParser, Object obj, String str, Collection collection) {
        if (obj != null) {
            Class cls;
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unrecognized field \"");
            String str2 = str;
            stringBuilder.append(str);
            stringBuilder.append("\" (class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append("), not marked as ignorable");
            JsonMappingException unrecognizedPropertyException = new UnrecognizedPropertyException(stringBuilder.toString(), jsonParser.getCurrentLocation(), cls, str2, collection);
            unrecognizedPropertyException.prependPath(obj, str);
            return unrecognizedPropertyException;
        }
        throw new IllegalArgumentException();
    }

    public Collection getKnownPropertyIds() {
        Collection collection = this._propertyIds;
        if (collection == null) {
            return null;
        }
        return Collections.unmodifiableCollection(collection);
    }

    public String getMessageSuffix() {
        String str = this._propertiesAsString;
        if (str != null || this._propertyIds == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        int size = this._propertyIds.size();
        if (size != 1) {
            stringBuilder.append(" (");
            stringBuilder.append(size);
            stringBuilder.append(" known properties: ");
            for (Object valueOf : this._propertyIds) {
                stringBuilder.append(", \"");
                stringBuilder.append(String.valueOf(valueOf));
                stringBuilder.append('\"');
                if (stringBuilder.length() > MAX_DESC_LENGTH) {
                    stringBuilder.append(" [truncated]");
                    break;
                }
            }
        }
        stringBuilder.append(" (one known property: \"");
        stringBuilder.append(String.valueOf(this._propertyIds.iterator().next()));
        stringBuilder.append('\"');
        stringBuilder.append("])");
        str = stringBuilder.toString();
        this._propertiesAsString = str;
        return str;
    }

    public Class getReferringClass() {
        return this._referringClass;
    }

    public String getUnrecognizedPropertyName() {
        return this._unrecognizedPropertyName;
    }
}

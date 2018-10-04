package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.Serializable;
import java.util.HashMap;

public abstract class TypeDeserializerBase extends TypeDeserializer implements Serializable {
    private static final long serialVersionUID = 278445030337366675L;
    public final JavaType _baseType;
    public final JavaType _defaultImpl;
    public JsonDeserializer _defaultImplDeserializer;
    public final HashMap _deserializers;
    public final TypeIdResolver _idResolver;
    public final BeanProperty _property;
    public final boolean _typeIdVisible;
    public final String _typePropertyName;

    public abstract TypeDeserializer forProperty(BeanProperty beanProperty);

    public abstract As getTypeInclusion();

    public TypeDeserializerBase(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, Class cls) {
        this._baseType = javaType;
        this._idResolver = typeIdResolver;
        this._typePropertyName = str;
        this._typeIdVisible = z;
        this._deserializers = new HashMap();
        if (cls == null) {
            this._defaultImpl = null;
        } else {
            this._defaultImpl = javaType.forcedNarrowBy(cls);
        }
        this._property = null;
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }

    public final JsonDeserializer _findDefaultImplDeserializer(DeserializationContext deserializationContext) {
        ResolvedType resolvedType = this._defaultImpl;
        if (resolvedType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
        } else if (resolvedType.getRawClass() != NoClass.class) {
            JsonDeserializer jsonDeserializer;
            synchronized (this._defaultImpl) {
                if (this._defaultImplDeserializer == null) {
                    this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
                }
                jsonDeserializer = this._defaultImplDeserializer;
            }
            return jsonDeserializer;
        }
        return NullifyingDeserializer.instance;
    }

    public final JsonDeserializer _findDeserializer(DeserializationContext deserializationContext, String str) {
        JsonDeserializer jsonDeserializer;
        synchronized (this._deserializers) {
            jsonDeserializer = (JsonDeserializer) this._deserializers.get(str);
            if (jsonDeserializer == null) {
                JavaType typeFromId = this._idResolver.typeFromId(str);
                if (typeFromId != null) {
                    if (this._baseType != null && this._baseType.getClass() == typeFromId.getClass()) {
                        typeFromId = this._baseType.narrowBy(typeFromId.getRawClass());
                    }
                    jsonDeserializer = deserializationContext.findContextualValueDeserializer(typeFromId, this._property);
                } else if (this._defaultImpl != null) {
                    jsonDeserializer = _findDefaultImplDeserializer(deserializationContext);
                } else {
                    throw deserializationContext.unknownTypeException(this._baseType, str);
                }
                this._deserializers.put(str, jsonDeserializer);
            }
        }
        return jsonDeserializer;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    public Class getDefaultImpl() {
        ResolvedType resolvedType = this._defaultImpl;
        return resolvedType == null ? null : resolvedType.getRawClass();
    }

    public final String getPropertyName() {
        return this._typePropertyName;
    }

    public TypeIdResolver getTypeIdResolver() {
        return this._idResolver;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(getClass().getName());
        stringBuilder.append("; base-type:");
        stringBuilder.append(this._baseType);
        stringBuilder.append("; id-resolver: ");
        stringBuilder.append(this._idResolver);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

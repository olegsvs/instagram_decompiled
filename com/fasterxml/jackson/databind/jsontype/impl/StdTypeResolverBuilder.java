package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;

public class StdTypeResolverBuilder implements TypeResolverBuilder {
    public TypeIdResolver _customIdResolver;
    public Class _defaultImpl;
    public Id _idType;
    public As _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection collection) {
        StdTypeResolverBuilder stdTypeResolverBuilder = this;
        if (this._idType == Id.NONE) {
            return null;
        }
        JavaType javaType2 = javaType;
        TypeIdResolver idResolver = idResolver(deserializationConfig, javaType2, collection, false, true);
        switch (stdTypeResolverBuilder._includeAs.ordinal()) {
            case 0:
                return new AsPropertyTypeDeserializer(javaType2, idResolver, stdTypeResolverBuilder._typeProperty, stdTypeResolverBuilder._typeIdVisible, stdTypeResolverBuilder._defaultImpl);
            case 1:
                return new AsWrapperTypeDeserializer(javaType2, idResolver, stdTypeResolverBuilder._typeProperty, stdTypeResolverBuilder._typeIdVisible, stdTypeResolverBuilder._defaultImpl);
            case 2:
                return new AsArrayTypeDeserializer(javaType2, idResolver, stdTypeResolverBuilder._typeProperty, stdTypeResolverBuilder._typeIdVisible, stdTypeResolverBuilder._defaultImpl);
            case 3:
                return new AsExternalTypeDeserializer(javaType2, idResolver, stdTypeResolverBuilder._typeProperty, stdTypeResolverBuilder._typeIdVisible, stdTypeResolverBuilder._defaultImpl);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Do not know how to construct standard type serializer for inclusion type: ");
                stringBuilder.append(stdTypeResolverBuilder._includeAs);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection collection) {
        StdTypeResolverBuilder stdTypeResolverBuilder = this;
        if (this._idType == Id.NONE) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, collection, true, false);
        switch (stdTypeResolverBuilder._includeAs.ordinal()) {
            case 0:
                return new AsPropertyTypeSerializer(idResolver, null, stdTypeResolverBuilder._typeProperty);
            case 1:
                return new AsWrapperTypeSerializer(idResolver, null);
            case 2:
                return new AsArrayTypeSerializer(idResolver, null);
            case 3:
                return new AsExternalTypeSerializer(idResolver, null, stdTypeResolverBuilder._typeProperty);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Do not know how to construct standard type serializer for inclusion type: ");
                stringBuilder.append(stdTypeResolverBuilder._includeAs);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public StdTypeResolverBuilder defaultImpl(Class cls) {
        this._defaultImpl = cls;
        return this;
    }

    public Class getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public TypeIdResolver idResolver(MapperConfig mapperConfig, JavaType javaType, Collection collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        if (this._idType != null) {
            switch (this._idType.ordinal()) {
                case 0:
                    return null;
                case 1:
                    return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
                case 2:
                    return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
                case 3:
                    return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z, z2);
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Do not know how to construct standard type id resolver for idType: ");
                    stringBuilder.append(this._idType);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }
        throw new IllegalStateException("Can not build, 'init()' not yet called");
    }

    public StdTypeResolverBuilder inclusion(As as) {
        if (as != null) {
            this._includeAs = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs can not be null");
    }

    public StdTypeResolverBuilder init(Id id, TypeIdResolver typeIdResolver) {
        if (id != null) {
            this._idType = id;
            this._customIdResolver = typeIdResolver;
            this._typeProperty = id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType can not be null");
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(Id.NONE, null);
    }

    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }
}

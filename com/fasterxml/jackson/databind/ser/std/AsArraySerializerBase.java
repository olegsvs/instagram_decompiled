package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class AsArraySerializerBase extends ContainerSerializer implements ContextualSerializer {
    public PropertySerializerMap _dynamicSerializers;
    public final JsonSerializer _elementSerializer;
    public final JavaType _elementType;
    public final BeanProperty _property;
    public final boolean _staticTyping;
    public final TypeSerializer _valueTypeSerializer;

    public abstract void serializeContents(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract AsArraySerializerBase withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer);

    public AsArraySerializerBase(AsArraySerializerBase asArraySerializerBase, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super((ContainerSerializer) asArraySerializerBase);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = asArraySerializerBase._dynamicSerializers;
    }

    public AsArraySerializerBase(Class cls, JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer) {
        boolean z2 = false;
        super(cls, false);
        this._elementType = javaType;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = PropertySerializerMap.emptyMap();
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonArrayFormatVisitor expectArrayFormat = jsonFormatVisitorWrapper == null ? null : jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (expectArrayFormat != null) {
            JavaType moreSpecificType = jsonFormatVisitorWrapper.getProvider().getTypeFactory().moreSpecificType(this._elementType, javaType.getContentType());
            if (moreSpecificType != null) {
                JsonFormatVisitable jsonFormatVisitable = this._elementSerializer;
                if (jsonFormatVisitable == null) {
                    jsonFormatVisitable = jsonFormatVisitorWrapper.getProvider().findValueSerializer(moreSpecificType, this._property);
                }
                expectArrayFormat.itemsFormat(jsonFormatVisitable, moreSpecificType);
                return;
            }
            throw new JsonMappingException("Could not resolve type");
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        JsonSerializer jsonSerializer = null;
        if (beanProperty != null) {
            Annotated member = beanProperty.getMember();
            if (member != null) {
                Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(member);
                if (findContentSerializer != null) {
                    jsonSerializer = serializerProvider.serializerInstance(member, findContentSerializer);
                }
            }
        }
        if (jsonSerializer == null) {
            jsonSerializer = this._elementSerializer;
        }
        JsonSerializer findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findConvertingContentSerializer == null) {
            if (this._elementType != null && (this._staticTyping || hasContentTypeAnnotation(serializerProvider, beanProperty))) {
                findConvertingContentSerializer = serializerProvider.findValueSerializer(this._elementType, beanProperty);
            }
        } else if (findConvertingContentSerializer instanceof ContextualSerializer) {
            findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
        }
        if (findConvertingContentSerializer == this._elementSerializer && beanProperty == this._property) {
            if (this._valueTypeSerializer == typeSerializer) {
                return this;
            }
        }
        return withResolved(beanProperty, typeSerializer, findConvertingContentSerializer);
    }

    public JsonSerializer getContentSerializer() {
        return this._elementSerializer;
    }

    public JavaType getContentType() {
        return this._elementType;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JavaType contentType;
        JsonNode createSchemaNode = createSchemaNode("array", true);
        JsonNode jsonNode = null;
        if (type != null) {
            contentType = serializerProvider.constructType(type).getContentType();
            if (contentType == null && (type instanceof ParameterizedType)) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    contentType = serializerProvider.constructType(actualTypeArguments[0]);
                }
            }
        } else {
            contentType = null;
        }
        if (contentType == null) {
            ResolvedType resolvedType = this._elementType;
            if (resolvedType != null) {
                contentType = resolvedType;
            }
        }
        if (contentType != null) {
            if (contentType.getRawClass() != Object.class) {
                JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(contentType, this._property);
                if (findValueSerializer instanceof SchemaAware) {
                    jsonNode = ((SchemaAware) findValueSerializer).getSchema(serializerProvider, null);
                }
            }
            if (jsonNode == null) {
                jsonNode = JsonSchema.getDefaultSchemaNode();
            }
            createSchemaNode.put(DialogModule.KEY_ITEMS, jsonNode);
        }
        return createSchemaNode;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj)) {
            serializeContents(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray();
        serializeContents(obj, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(obj, jsonGenerator);
        serializeContents(obj, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForArray(obj, jsonGenerator);
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map.Entry;

@JacksonStdImpl
public class EnumMapSerializer extends ContainerSerializer implements ContextualSerializer {
    public final EnumValues _keyEnums;
    public final BeanProperty _property;
    public final boolean _staticTyping;
    public final JsonSerializer _valueSerializer;
    public final JavaType _valueType;
    public final TypeSerializer _valueTypeSerializer;

    public EnumMapSerializer(JavaType javaType, boolean z, EnumValues enumValues, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        boolean z2 = false;
        super(EnumMap.class, false);
        this._property = null;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueType = javaType;
        this._keyEnums = enumValues;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
    }

    public EnumMapSerializer(EnumMapSerializer enumMapSerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer) {
        super((ContainerSerializer) enumMapSerializer);
        this._property = beanProperty;
        this._staticTyping = enumMapSerializer._staticTyping;
        this._valueType = enumMapSerializer._valueType;
        this._keyEnums = enumMapSerializer._keyEnums;
        this._valueTypeSerializer = enumMapSerializer._valueTypeSerializer;
        this._valueSerializer = jsonSerializer;
    }

    public EnumMapSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new EnumMapSerializer(this._valueType, this._staticTyping, this._keyEnums, typeSerializer, this._valueSerializer);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            JsonObjectFormatVisitor expectObjectFormat = jsonFormatVisitorWrapper.expectObjectFormat(javaType);
            if (expectObjectFormat != null) {
                JavaType containedType = javaType.containedType(1);
                JsonSerializer jsonSerializer = this._valueSerializer;
                if (jsonSerializer == null && containedType != null) {
                    jsonSerializer = jsonFormatVisitorWrapper.getProvider().findValueSerializer(containedType, this._property);
                }
                if (containedType == null) {
                    containedType = jsonFormatVisitorWrapper.getProvider().constructType(Object.class);
                }
                EnumValues enumValues = this._keyEnums;
                if (enumValues == null) {
                    JavaType containedType2 = javaType.containedType(0);
                    if (containedType2 != null) {
                        JsonSerializer jsonSerializer2;
                        if (containedType2 == null) {
                            jsonSerializer2 = null;
                        } else {
                            jsonSerializer2 = jsonFormatVisitorWrapper.getProvider().findValueSerializer(containedType2, this._property);
                        }
                        if (jsonSerializer2 instanceof EnumSerializer) {
                            enumValues = ((EnumSerializer) jsonSerializer2).getEnumValues();
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can not resolve Enum type of EnumMap: ");
                    stringBuilder.append(javaType);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                for (Entry entry : r0.internalMap().entrySet()) {
                    String value = ((SerializedString) entry.getValue()).getValue();
                    if (jsonSerializer == null) {
                        jsonSerializer = jsonFormatVisitorWrapper.getProvider().findValueSerializer(entry.getKey().getClass(), this._property);
                    }
                    expectObjectFormat.property(value, jsonSerializer, containedType);
                }
            }
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer serializerInstance;
        JsonSerializer findConvertingContentSerializer;
        if (beanProperty != null) {
            Annotated member = beanProperty.getMember();
            if (member != null) {
                Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(member);
                if (findContentSerializer != null) {
                    serializerInstance = serializerProvider.serializerInstance(member, findContentSerializer);
                    if (serializerInstance == null) {
                        serializerInstance = this._valueSerializer;
                    }
                    findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, serializerInstance);
                    if (findConvertingContentSerializer != null) {
                        if (this._staticTyping) {
                            return withValueSerializer(beanProperty, serializerProvider.findValueSerializer(this._valueType, beanProperty));
                        }
                    } else if (this._valueSerializer instanceof ContextualSerializer) {
                        findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
                    }
                    return findConvertingContentSerializer == this._valueSerializer ? withValueSerializer(beanProperty, findConvertingContentSerializer) : this;
                }
            }
        }
        serializerInstance = null;
        if (serializerInstance == null) {
            serializerInstance = this._valueSerializer;
        }
        findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, serializerInstance);
        if (findConvertingContentSerializer != null) {
            if (this._valueSerializer instanceof ContextualSerializer) {
                findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
            }
        } else if (this._staticTyping) {
            return withValueSerializer(beanProperty, serializerProvider.findValueSerializer(this._valueType, beanProperty));
        }
        if (findConvertingContentSerializer == this._valueSerializer) {
        }
    }

    public JsonSerializer getContentSerializer() {
        return this._valueSerializer;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("object", true);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                int i = 0;
                ResolvedType constructType = serializerProvider.constructType(actualTypeArguments[0]);
                ResolvedType constructType2 = serializerProvider.constructType(actualTypeArguments[1]);
                JsonNode objectNode = JsonNodeFactory.instance.objectNode();
                Enum[] enumArr = (Enum[]) constructType.getRawClass().getEnumConstants();
                int length = enumArr.length;
                while (i < length) {
                    JsonNode schema;
                    Enum enumR = enumArr[i];
                    JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(constructType2.getRawClass(), this._property);
                    if (findValueSerializer instanceof SchemaAware) {
                        schema = ((SchemaAware) findValueSerializer).getSchema(serializerProvider, null);
                    } else {
                        schema = JsonSchema.getDefaultSchemaNode();
                    }
                    objectNode.put(serializerProvider.getConfig().getAnnotationIntrospector().findEnumValue(enumR), schema);
                    i++;
                }
                createSchemaNode.put("properties", objectNode);
            }
        }
        return createSchemaNode;
    }

    public boolean hasSingleElement(EnumMap enumMap) {
        return enumMap.size() == 1;
    }

    public boolean isEmpty(EnumMap enumMap) {
        if (enumMap != null) {
            if (!enumMap.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void serialize(EnumMap enumMap, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        if (!enumMap.isEmpty()) {
            serializeContents(enumMap, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeContents(EnumMap enumMap, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            serializeContentsUsing(enumMap, jsonGenerator, serializerProvider, jsonSerializer);
            return;
        }
        EnumValues enumValues = this._keyEnums;
        int isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ^ 1;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        Class cls = null;
        JsonSerializer jsonSerializer2 = null;
        for (Entry entry : enumMap.entrySet()) {
            Object value = entry.getValue();
            if (isEnabled == 0 || value != null) {
                Enum enumR = (Enum) entry.getKey();
                if (enumValues == null) {
                    enumValues = ((EnumSerializer) ((StdSerializer) serializerProvider.findValueSerializer(enumR.getDeclaringClass(), this._property))).getEnumValues();
                }
                jsonGenerator.writeFieldName(enumValues.serializedValueFor(enumR));
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class cls2 = value.getClass();
                    if (cls2 != cls) {
                        jsonSerializer2 = serializerProvider.findValueSerializer(cls2, this._property);
                        cls = cls2;
                    }
                    if (typeSerializer == null) {
                        try {
                            jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
                        } catch (Throwable e) {
                            wrapAndThrow(serializerProvider, e, (Object) enumMap, ((Enum) entry.getKey()).name());
                        }
                    } else {
                        jsonSerializer2.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                    }
                }
            }
        }
    }

    public void serializeContentsUsing(EnumMap enumMap, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer jsonSerializer) {
        EnumValues enumValues = this._keyEnums;
        int isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ^ 1;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        for (Entry entry : enumMap.entrySet()) {
            Object value = entry.getValue();
            if (isEnabled == 0 || value != null) {
                Enum enumR = (Enum) entry.getKey();
                if (enumValues == null) {
                    enumValues = ((EnumSerializer) ((StdSerializer) serializerProvider.findValueSerializer(enumR.getDeclaringClass(), this._property))).getEnumValues();
                }
                jsonGenerator.writeFieldName(enumValues.serializedValueFor(enumR));
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Throwable e) {
                        wrapAndThrow(serializerProvider, e, (Object) enumMap, ((Enum) entry.getKey()).name());
                    }
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public void serializeWithType(EnumMap enumMap, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForObject(enumMap, jsonGenerator);
        if (!enumMap.isEmpty()) {
            serializeContents(enumMap, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForObject(enumMap, jsonGenerator);
    }

    public EnumMapSerializer withValueSerializer(BeanProperty beanProperty, JsonSerializer jsonSerializer) {
        if (this._property == beanProperty && jsonSerializer == this._valueSerializer) {
            return this;
        }
        return new EnumMapSerializer(this, beanProperty, jsonSerializer);
    }
}

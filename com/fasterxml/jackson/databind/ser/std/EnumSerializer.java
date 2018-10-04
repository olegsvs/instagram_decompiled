package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;

@JacksonStdImpl
public class EnumSerializer extends StdScalarSerializer implements ContextualSerializer {
    public final Boolean _serializeAsIndex;
    public final EnumValues _values;

    public EnumSerializer(EnumValues enumValues) {
        this(enumValues, null);
    }

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(Enum.class, false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
    }

    public static Boolean _isShapeWrittenUsingIndex(Class cls, Value value, boolean z) {
        Shape shape = value == null ? null : value.getShape();
        if (!(shape == null || shape == Shape.ANY)) {
            if (shape != Shape.SCALAR) {
                if (shape == Shape.STRING) {
                    return Boolean.FALSE;
                }
                if (shape.isNumeric()) {
                    return Boolean.TRUE;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported serialization shape (");
                stringBuilder.append(shape);
                stringBuilder.append(") for Enum ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(", not supported as ");
                stringBuilder.append(z ? "class" : "property");
                stringBuilder.append(" annotation");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return null;
    }

    public final boolean _serializeAsIndex(SerializerProvider serializerProvider) {
        Boolean bool = this._serializeAsIndex;
        if (bool != null) {
            return bool.booleanValue();
        }
        return serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper.getProvider().isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)) {
            JsonIntegerFormatVisitor expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
            if (expectIntegerFormat != null) {
                expectIntegerFormat.numberType(JsonParser$NumberType.INT);
                return;
            }
            return;
        }
        JsonValueFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (javaType != null && expectStringFormat != null && javaType.isEnumType()) {
            Set linkedHashSet = new LinkedHashSet();
            for (SerializedString value : this._values.values()) {
                linkedHashSet.add(value.getValue());
            }
            expectStringFormat.enumTypes(linkedHashSet);
        }
    }

    public static EnumSerializer construct(Class cls, SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return construct(cls, serializationConfig, beanDescription, beanDescription.findExpectedFormat(null));
    }

    public static EnumSerializer construct(Class cls, SerializationConfig serializationConfig, BeanDescription beanDescription, Value value) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        return new EnumSerializer(serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? EnumValues.constructFromToString(cls, annotationIntrospector) : EnumValues.constructFromName(cls, annotationIntrospector), _isShapeWrittenUsingIndex(cls, value, true));
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        if (beanProperty != null) {
            Value findFormat = serializerProvider.getAnnotationIntrospector().findFormat(beanProperty.getMember());
            if (findFormat != null) {
                Boolean _isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(beanProperty.getType().getRawClass(), findFormat, false);
                if (_isShapeWrittenUsingIndex != this._serializeAsIndex) {
                    return new EnumSerializer(this._values, _isShapeWrittenUsingIndex);
                }
            }
        }
        return this;
    }

    public EnumValues getEnumValues() {
        return this._values;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        if (_serializeAsIndex(serializerProvider)) {
            return createSchemaNode("integer", true);
        }
        JsonNode createSchemaNode = createSchemaNode("string", true);
        if (type != null && serializerProvider.constructType(type).isEnumType()) {
            ArrayNode putArray = createSchemaNode.putArray("enum");
            for (SerializedString value : this._values.values()) {
                putArray.add(value.getValue());
            }
        }
        return createSchemaNode;
    }

    public final void serialize(Enum enumR, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (_serializeAsIndex(serializerProvider)) {
            jsonGenerator.writeNumber(enumR.ordinal());
        } else {
            jsonGenerator.writeString(this._values.serializedValueFor(enumR));
        }
    }
}

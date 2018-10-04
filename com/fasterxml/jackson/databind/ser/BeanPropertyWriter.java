package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class BeanPropertyWriter implements BeanProperty {
    public static final Object MARKER_FOR_EMPTY = new Object();
    public final Method _accessorMethod;
    public final JavaType _cfgSerializationType;
    public final Annotations _contextAnnotations;
    public final JavaType _declaredType;
    public PropertySerializerMap _dynamicSerializers;
    public final Field _field;
    public final Class[] _includeInViews;
    public HashMap _internalSettings;
    public final boolean _isRequired;
    public final AnnotatedMember _member;
    public final SerializedString _name;
    public JavaType _nonTrivialBaseType;
    public JsonSerializer _nullSerializer;
    public JsonSerializer _serializer;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public TypeSerializer _typeSerializer;
    public final PropertyName _wrapperName;

    public BeanPropertyWriter(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z, Object obj) {
        this._member = annotatedMember;
        this._contextAnnotations = annotations;
        this._name = new SerializedString(beanPropertyDefinition.getName());
        this._wrapperName = beanPropertyDefinition.getWrapperName();
        this._declaredType = javaType;
        this._serializer = jsonSerializer;
        this._dynamicSerializers = jsonSerializer == null ? PropertySerializerMap.emptyMap() : null;
        this._typeSerializer = typeSerializer;
        this._cfgSerializationType = javaType2;
        this._isRequired = beanPropertyDefinition.isRequired();
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not pass member of type ");
            stringBuilder.append(annotatedMember.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._includeInViews = beanPropertyDefinition.findViews();
        this._nullSerializer = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        Map map = beanPropertyWriter._internalSettings;
        if (map != null) {
            this._internalSettings = new HashMap(map);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
        this._isRequired = beanPropertyWriter._isRequired;
    }

    public JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            findAndAddSerializer = propertySerializerMap.findAndAddSerializer(serializerProvider.constructSpecializedType(javaType, cls), serializerProvider, this);
        } else {
            findAndAddSerializer = propertySerializerMap.findAndAddSerializer(cls, serializerProvider, this);
        }
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public void _handleSelfReference(Object obj, JsonSerializer jsonSerializer) {
        if (!jsonSerializer.usesObjectId()) {
            throw new JsonMappingException("Direct self-reference leading to cycle");
        }
    }

    public void assignNullSerializer(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this._nullSerializer;
        if (jsonSerializer2 != null) {
            if (jsonSerializer2 != jsonSerializer) {
                throw new IllegalStateException("Can not override null serializer");
            }
        }
        this._nullSerializer = jsonSerializer;
    }

    public void assignSerializer(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this._serializer;
        if (jsonSerializer2 != null) {
            if (jsonSerializer2 != jsonSerializer) {
                throw new IllegalStateException("Can not override serializer");
            }
        }
        this._serializer = jsonSerializer;
    }

    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor) {
        if (jsonObjectFormatVisitor == null) {
            return;
        }
        if (isRequired()) {
            jsonObjectFormatVisitor.property((BeanProperty) this);
        } else {
            jsonObjectFormatVisitor.optionalProperty((BeanProperty) this);
        }
    }

    public void depositSchemaProperty(ObjectNode objectNode, SerializerProvider serializerProvider) {
        JsonNode schema;
        ResolvedType serializationType = getSerializationType();
        Type genericPropertyType = serializationType == null ? getGenericPropertyType() : serializationType.getRawClass();
        JsonSerializer serializer = getSerializer();
        if (serializer == null) {
            Class rawSerializationType = getRawSerializationType();
            if (rawSerializationType == null) {
                rawSerializationType = getPropertyType();
            }
            serializer = serializerProvider.findValueSerializer(rawSerializationType, (BeanProperty) this);
        }
        boolean isRequired = isRequired() ^ 1;
        if (serializer instanceof SchemaAware) {
            schema = ((SchemaAware) serializer).getSchema(serializerProvider, genericPropertyType, isRequired);
        } else {
            schema = JsonSchema.getDefaultSchemaNode();
        }
        objectNode.put(getName(), schema);
    }

    public final Object get(Object obj) {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.invoke(obj, new Object[0]);
        }
        return this._field.get(obj);
    }

    public Annotation getAnnotation(Class cls) {
        return this._member.getAnnotation(cls);
    }

    public Annotation getContextAnnotation(Class cls) {
        return this._contextAnnotations.get(cls);
    }

    public Type getGenericPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getGenericReturnType();
        }
        return this._field.getGenericType();
    }

    public Object getInternalSetting(Object obj) {
        HashMap hashMap = this._internalSettings;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(obj);
    }

    public AnnotatedMember getMember() {
        return this._member;
    }

    public String getName() {
        return this._name.getValue();
    }

    public Class getPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getReturnType();
        }
        return this._field.getType();
    }

    public Class getRawSerializationType() {
        ResolvedType resolvedType = this._cfgSerializationType;
        return resolvedType == null ? null : resolvedType.getRawClass();
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    public SerializedString getSerializedName() {
        return this._name;
    }

    public JsonSerializer getSerializer() {
        return this._serializer;
    }

    public JavaType getType() {
        return this._declaredType;
    }

    public Class[] getViews() {
        return this._includeInViews;
    }

    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public boolean isRequired() {
        return this._isRequired;
    }

    public boolean isRequired(AnnotationIntrospector annotationIntrospector) {
        return this._isRequired;
    }

    public Object removeInternalSetting(Object obj) {
        HashMap hashMap = this._internalSettings;
        if (hashMap == null) {
            return null;
        }
        Object remove = hashMap.remove(obj);
        if (this._internalSettings.size() != 0) {
            return remove;
        }
        this._internalSettings = null;
        return remove;
    }

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String transform = nameTransformer.transform(this._name.getValue());
        if (transform.equals(this._name.toString())) {
            return this;
        }
        return new BeanPropertyWriter(this, new SerializedString(transform));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serializeAsColumn(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.SerializerProvider r7) {
        /*
        r4 = this;
        r3 = r4.get(r5);
        if (r3 != 0) goto L_0x0013;
    L_0x0006:
        r1 = r4._nullSerializer;
        if (r1 == 0) goto L_0x000f;
    L_0x000a:
        r0 = 0;
        r1.serialize(r0, r6, r7);
        goto L_0x0012;
    L_0x000f:
        r6.writeNull();
    L_0x0012:
        return;
    L_0x0013:
        r2 = r4._serializer;
        if (r2 != 0) goto L_0x0027;
    L_0x0017:
        r1 = r3.getClass();
        r0 = r4._dynamicSerializers;
        r2 = r0.serializerFor(r1);
        if (r2 != 0) goto L_0x0027;
    L_0x0023:
        r2 = r4._findAndAddDynamic(r0, r1, r7);
    L_0x0027:
        r1 = r4._suppressableValue;
        if (r1 == 0) goto L_0x0040;
    L_0x002b:
        r0 = MARKER_FOR_EMPTY;
        if (r0 != r1) goto L_0x0039;
    L_0x002f:
        r0 = r2.isEmpty(r3);
        if (r0 == 0) goto L_0x0040;
    L_0x0035:
        r4.serializeAsPlaceholder(r5, r6, r7);
        return;
    L_0x0039:
        r0 = r1.equals(r3);
        if (r0 == 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0035;
    L_0x0040:
        if (r3 != r5) goto L_0x0045;
    L_0x0042:
        r4._handleSelfReference(r5, r2);
    L_0x0045:
        r0 = r4._typeSerializer;
        if (r0 != 0) goto L_0x004d;
    L_0x0049:
        r2.serialize(r3, r6, r7);
        goto L_0x0012;
    L_0x004d:
        r2.serializeWithType(r3, r6, r7, r0);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsColumn(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj2 = get(obj);
        if (obj2 != null) {
            JsonSerializer jsonSerializer = this._serializer;
            if (jsonSerializer == null) {
                Class cls = obj2.getClass();
                PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                jsonSerializer = propertySerializerMap.serializerFor(cls);
                if (jsonSerializer == null) {
                    jsonSerializer = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                }
            }
            Object obj3 = this._suppressableValue;
            if (obj3 != null) {
                if (MARKER_FOR_EMPTY == obj3) {
                    if (jsonSerializer.isEmpty(obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 == obj) {
                _handleSelfReference(obj, jsonSerializer);
            }
            jsonGenerator.writeFieldName(this._name);
            TypeSerializer typeSerializer = this._typeSerializer;
            if (typeSerializer == null) {
                jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer.serializeWithType(obj2, jsonGenerator, serializerProvider, typeSerializer);
            }
        } else if (this._nullSerializer != null) {
            jsonGenerator.writeFieldName(this._name);
            this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
        }
    }

    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        obj = this._nullSerializer;
        if (obj != null) {
            obj.serialize(null, jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.writeNull();
        }
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("property '");
        stringBuilder.append(getName());
        stringBuilder.append("' (");
        if (this._accessorMethod != null) {
            stringBuilder.append("via method ");
            stringBuilder.append(this._accessorMethod.getDeclaringClass().getName());
            stringBuilder.append("#");
            stringBuilder.append(this._accessorMethod.getName());
        } else {
            stringBuilder.append("field \"");
            stringBuilder.append(this._field.getDeclaringClass().getName());
            stringBuilder.append("#");
            stringBuilder.append(this._field.getName());
        }
        if (this._serializer == null) {
            stringBuilder.append(", no static serializer");
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", static serializer of type ");
            stringBuilder2.append(this._serializer.getClass().getName());
            stringBuilder.append(stringBuilder2.toString());
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }
}

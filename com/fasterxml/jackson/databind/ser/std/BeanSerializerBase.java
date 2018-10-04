package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class BeanSerializerBase extends StdSerializer implements ContextualSerializer, SchemaAware, ResolvableSerializer, JsonFormatVisitable {
    public static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    public final AnyGetterWriter _anyGetterWriter;
    public final BeanPropertyWriter[] _filteredProps;
    public final ObjectIdWriter _objectIdWriter;
    public final Object _propertyFilterId;
    public final BeanPropertyWriter[] _props;
    public final Shape _serializationShape;
    public final AnnotatedMember _typeId;

    public abstract BeanSerializerBase asArraySerializer();

    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract BeanSerializerBase withIgnorals(String[] strArr);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter);

    public BeanSerializerBase(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        Shape shape = null;
        if (beanSerializerBuilder == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = beanSerializerBuilder.getTypeId();
        this._anyGetterWriter = beanSerializerBuilder.getAnyGetter();
        this._propertyFilterId = beanSerializerBuilder.getFilterId();
        this._objectIdWriter = beanSerializerBuilder.getObjectIdWriter();
        Value findExpectedFormat = beanSerializerBuilder.getBeanDescription().findExpectedFormat(null);
        if (findExpectedFormat != null) {
            shape = findExpectedFormat.getShape();
        }
        this._serializationShape = shape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase) {
        this(beanSerializerBase, beanSerializerBase._props, beanSerializerBase._filteredProps);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter) {
        super(beanSerializerBase._handledType);
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, rename(beanSerializerBase._props, nameTransformer), rename(beanSerializerBase._filteredProps, nameTransformer));
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        ArrayList arrayList;
        super(beanSerializerBase._handledType);
        HashSet arrayToSet = ArrayBuilders.arrayToSet(strArr);
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase._props;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase._filteredProps;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList2 = new ArrayList(length);
        BeanPropertyWriter[] beanPropertyWriterArr3 = null;
        if (beanPropertyWriterArr2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(length);
        }
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (!arrayToSet.contains(beanPropertyWriter.getName())) {
                arrayList2.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList.add(beanPropertyWriterArr2[i]);
                }
            }
        }
        this._props = (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]);
        if (arrayList != null) {
            beanPropertyWriterArr3 = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        }
        this._filteredProps = beanPropertyWriterArr3;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    private final String _customTypeId(Object obj) {
        obj = this._typeId.getValue(obj);
        if (obj == null) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableObjectId findObjectId = serializerProvider.findObjectId(obj, objectIdWriter.generator);
        if (!findObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter)) {
            Object generateId = findObjectId.generateId(obj);
            if (objectIdWriter.alwaysAsId) {
                objectIdWriter.serializer.serialize(generateId, jsonGenerator, serializerProvider);
                return;
            }
            String _customTypeId = this._typeId == null ? null : _customTypeId(obj);
            if (_customTypeId == null) {
                typeSerializer.writeTypePrefixForObject(obj, jsonGenerator);
            } else {
                typeSerializer.writeCustomTypePrefixForObject(obj, jsonGenerator, _customTypeId);
            }
            findObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);
            if (this._propertyFilterId != null) {
                serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
            } else {
                serializeFields(obj, jsonGenerator, serializerProvider);
            }
            if (_customTypeId == null) {
                typeSerializer.writeTypeSuffixForObject(obj, jsonGenerator);
            } else {
                typeSerializer.writeCustomTypeSuffixForObject(obj, jsonGenerator, _customTypeId);
            }
        }
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z) {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableObjectId findObjectId = serializerProvider.findObjectId(obj, objectIdWriter.generator);
        if (!findObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter)) {
            Object generateId = findObjectId.generateId(obj);
            if (objectIdWriter.alwaysAsId) {
                objectIdWriter.serializer.serialize(generateId, jsonGenerator, serializerProvider);
                return;
            }
            if (z) {
                jsonGenerator.writeStartObject();
            }
            findObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);
            if (this._propertyFilterId != null) {
                serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
            } else {
                serializeFields(obj, jsonGenerator, serializerProvider);
            }
            if (z) {
                jsonGenerator.writeEndObject();
            }
        }
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonObjectFormatVisitor expectObjectFormat = jsonFormatVisitorWrapper == null ? null : jsonFormatVisitorWrapper.expectObjectFormat(javaType);
        if (expectObjectFormat != null) {
            int i = 0;
            BeanPropertyWriter[] beanPropertyWriterArr;
            if (this._propertyFilterId != null) {
                BeanPropertyFilter findFilter = findFilter(jsonFormatVisitorWrapper.getProvider());
                while (true) {
                    beanPropertyWriterArr = this._props;
                    if (i < beanPropertyWriterArr.length) {
                        findFilter.depositSchemaProperty(beanPropertyWriterArr[i], expectObjectFormat, jsonFormatVisitorWrapper.getProvider());
                        i++;
                    } else {
                        return;
                    }
                }
            }
            while (true) {
                beanPropertyWriterArr = this._props;
                if (i < beanPropertyWriterArr.length) {
                    beanPropertyWriterArr[i].depositSchemaProperty(expectObjectFormat);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Annotated member;
        String[] findPropertiesToIgnore;
        ObjectIdInfo findObjectIdInfo;
        ObjectIdInfo findObjectReferenceInfo;
        Type generatorType;
        JavaType javaType;
        String propertyName;
        int length;
        int i;
        BeanPropertyWriter beanPropertyWriter;
        Object obj;
        JsonSerializer withObjectIdWriter;
        Value findFormat;
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Shape shape = null;
        if (beanProperty != null) {
            if (annotationIntrospector != null) {
                member = beanProperty.getMember();
                if (member == null) {
                    findPropertiesToIgnore = annotationIntrospector.findPropertiesToIgnore(member);
                    findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
                    if (findObjectIdInfo == null) {
                        findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
                        generatorType = findObjectReferenceInfo.getGeneratorType();
                        javaType = serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0];
                        if (generatorType != ObjectIdGenerators$PropertyGenerator.class) {
                            propertyName = findObjectReferenceInfo.getPropertyName();
                            length = this._props.length;
                            i = 0;
                            while (i != length) {
                                beanPropertyWriter = this._props[i];
                                if (propertyName.equals(beanPropertyWriter.getName())) {
                                    i++;
                                } else {
                                    if (i > 0) {
                                        obj = this._props;
                                        System.arraycopy(obj, 0, obj, 1, i);
                                        this._props[0] = beanPropertyWriter;
                                        obj = this._filteredProps;
                                        if (obj != null) {
                                            BeanPropertyWriter beanPropertyWriter2 = obj[i];
                                            System.arraycopy(obj, 0, obj, 1, i);
                                            this._filteredProps[0] = beanPropertyWriter2;
                                        }
                                    }
                                    objectIdWriter = ObjectIdWriter.construct(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(findObjectReferenceInfo, beanPropertyWriter), findObjectReferenceInfo.getAlwaysAsId());
                                }
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid Object Id definition for ");
                            stringBuilder.append(this._handledType.getName());
                            stringBuilder.append(": can not find property with name '");
                            stringBuilder.append(propertyName);
                            stringBuilder.append("'");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        objectIdWriter = ObjectIdWriter.construct(javaType, findObjectReferenceInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(member, findObjectReferenceInfo), findObjectReferenceInfo.getAlwaysAsId());
                    } else if (objectIdWriter != null) {
                        objectIdWriter = this._objectIdWriter.withAlwaysAsId(annotationIntrospector.findObjectReferenceInfo(member, new ObjectIdInfo(JsonProperty.USE_DEFAULT_NAME, null, null)).getAlwaysAsId());
                    }
                } else {
                    findPropertiesToIgnore = null;
                }
                if (objectIdWriter != null) {
                    objectIdWriter = objectIdWriter.withSerializer(serializerProvider.findValueSerializer(objectIdWriter.idType, beanProperty));
                    if (objectIdWriter != this._objectIdWriter) {
                        withObjectIdWriter = withObjectIdWriter(objectIdWriter);
                        if (!(findPropertiesToIgnore == null || findPropertiesToIgnore.length == 0)) {
                            withObjectIdWriter = withObjectIdWriter.withIgnorals(findPropertiesToIgnore);
                        }
                        if (member != null) {
                            findFormat = annotationIntrospector.findFormat(member);
                            if (findFormat != null) {
                                shape = findFormat.getShape();
                            }
                        }
                        if (shape == null) {
                            shape = this._serializationShape;
                        }
                        return shape != Shape.ARRAY ? withObjectIdWriter.asArraySerializer() : withObjectIdWriter;
                    }
                }
                withObjectIdWriter = this;
                withObjectIdWriter = withObjectIdWriter.withIgnorals(findPropertiesToIgnore);
                if (member != null) {
                    findFormat = annotationIntrospector.findFormat(member);
                    if (findFormat != null) {
                        shape = findFormat.getShape();
                    }
                }
                if (shape == null) {
                    shape = this._serializationShape;
                }
                if (shape != Shape.ARRAY) {
                }
            }
        }
        member = null;
        if (member == null) {
            findPropertiesToIgnore = null;
        } else {
            findPropertiesToIgnore = annotationIntrospector.findPropertiesToIgnore(member);
            findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (findObjectIdInfo == null) {
                findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
                generatorType = findObjectReferenceInfo.getGeneratorType();
                javaType = serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0];
                if (generatorType != ObjectIdGenerators$PropertyGenerator.class) {
                    objectIdWriter = ObjectIdWriter.construct(javaType, findObjectReferenceInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(member, findObjectReferenceInfo), findObjectReferenceInfo.getAlwaysAsId());
                } else {
                    propertyName = findObjectReferenceInfo.getPropertyName();
                    length = this._props.length;
                    i = 0;
                    while (i != length) {
                        beanPropertyWriter = this._props[i];
                        if (propertyName.equals(beanPropertyWriter.getName())) {
                            i++;
                        } else {
                            if (i > 0) {
                                obj = this._props;
                                System.arraycopy(obj, 0, obj, 1, i);
                                this._props[0] = beanPropertyWriter;
                                obj = this._filteredProps;
                                if (obj != null) {
                                    BeanPropertyWriter beanPropertyWriter22 = obj[i];
                                    System.arraycopy(obj, 0, obj, 1, i);
                                    this._filteredProps[0] = beanPropertyWriter22;
                                }
                            }
                            objectIdWriter = ObjectIdWriter.construct(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(findObjectReferenceInfo, beanPropertyWriter), findObjectReferenceInfo.getAlwaysAsId());
                        }
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Invalid Object Id definition for ");
                    stringBuilder2.append(this._handledType.getName());
                    stringBuilder2.append(": can not find property with name '");
                    stringBuilder2.append(propertyName);
                    stringBuilder2.append("'");
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
            } else if (objectIdWriter != null) {
                objectIdWriter = this._objectIdWriter.withAlwaysAsId(annotationIntrospector.findObjectReferenceInfo(member, new ObjectIdInfo(JsonProperty.USE_DEFAULT_NAME, null, null)).getAlwaysAsId());
            }
        }
        if (objectIdWriter != null) {
            objectIdWriter = objectIdWriter.withSerializer(serializerProvider.findValueSerializer(objectIdWriter.idType, beanProperty));
            if (objectIdWriter != this._objectIdWriter) {
                withObjectIdWriter = withObjectIdWriter(objectIdWriter);
                withObjectIdWriter = withObjectIdWriter.withIgnorals(findPropertiesToIgnore);
                if (member != null) {
                    findFormat = annotationIntrospector.findFormat(member);
                    if (findFormat != null) {
                        shape = findFormat.getShape();
                    }
                }
                if (shape == null) {
                    shape = this._serializationShape;
                }
                if (shape != Shape.ARRAY) {
                }
            }
        }
        withObjectIdWriter = this;
        withObjectIdWriter = withObjectIdWriter.withIgnorals(findPropertiesToIgnore);
        if (member != null) {
            findFormat = annotationIntrospector.findFormat(member);
            if (findFormat != null) {
                shape = findFormat.getShape();
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        if (shape != Shape.ARRAY) {
        }
    }

    public JsonSerializer findConvertingSerializer(SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) {
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findSerializationConverter = annotationIntrospector.findSerializationConverter(beanPropertyWriter.getMember());
            if (findSerializationConverter != null) {
                Converter converterInstance = serializerProvider.converterInstance(beanPropertyWriter.getMember(), findSerializationConverter);
                JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
                return new StdDelegatingSerializer(converterInstance, outputType, serializerProvider.findValueSerializer(outputType, (BeanProperty) beanPropertyWriter));
            }
        }
        return null;
    }

    public BeanPropertyFilter findFilter(SerializerProvider serializerProvider) {
        Object obj = this._propertyFilterId;
        FilterProvider filterProvider = serializerProvider.getFilterProvider();
        if (filterProvider != null) {
            return filterProvider.findFilter(obj);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not resolve BeanPropertyFilter with id '");
        stringBuilder.append(obj);
        stringBuilder.append("'; no FilterProvider configured");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("object", true);
        JsonSerializableSchema jsonSerializableSchema = (JsonSerializableSchema) this._handledType.getAnnotation(JsonSerializableSchema.class);
        if (jsonSerializableSchema != null) {
            String id = jsonSerializableSchema.id();
            if (id != null && id.length() > 0) {
                createSchemaNode.put("id", id);
            }
        }
        JsonNode objectNode = createSchemaNode.objectNode();
        BeanPropertyFilter findFilter = this._propertyFilterId != null ? findFilter(serializerProvider) : null;
        int i = 0;
        while (true) {
            BeanPropertyWriter[] beanPropertyWriterArr = this._props;
            if (i < beanPropertyWriterArr.length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (findFilter == null) {
                    beanPropertyWriter.depositSchemaProperty(objectNode, serializerProvider);
                } else {
                    findFilter.depositSchemaProperty(beanPropertyWriter, objectNode, serializerProvider);
                }
                i++;
            } else {
                createSchemaNode.put("properties", objectNode);
                return createSchemaNode;
            }
        }
    }

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (!(beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null)) {
            if (nameTransformer != NameTransformer.NOP) {
                int length = beanPropertyWriterArr.length;
                BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
                for (int i = 0; i < length; i++) {
                    BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                    if (beanPropertyWriter != null) {
                        beanPropertyWriterArr2[i] = beanPropertyWriter.rename(nameTransformer);
                    }
                }
                return beanPropertyWriterArr2;
            }
        }
        return beanPropertyWriterArr;
    }

    public void resolve(SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            BeanPropertyWriter beanPropertyWriter;
            BeanProperty beanProperty = this._props[i];
            if (!(beanProperty.willSuppressNulls() || beanProperty.hasNullSerializer())) {
                JsonSerializer findNullValueSerializer = serializerProvider.findNullValueSerializer(beanProperty);
                if (findNullValueSerializer != null) {
                    beanProperty.assignNullSerializer(findNullValueSerializer);
                    if (i < length) {
                        beanPropertyWriter = this._filteredProps[i];
                        if (beanPropertyWriter != null) {
                            beanPropertyWriter.assignNullSerializer(findNullValueSerializer);
                        }
                    }
                }
            }
            if (!beanProperty.hasSerializer()) {
                JsonSerializer findConvertingSerializer = findConvertingSerializer(serializerProvider, beanProperty);
                if (findConvertingSerializer == null) {
                    JavaType serializationType = beanProperty.getSerializationType();
                    if (serializationType == null) {
                        serializationType = serializerProvider.constructType(beanProperty.getGenericPropertyType());
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanProperty.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    findConvertingSerializer = serializerProvider.findValueSerializer(serializationType, beanProperty);
                    if (serializationType.isContainerType()) {
                        TypeSerializer typeSerializer = (TypeSerializer) serializationType.getContentType().getTypeHandler();
                        if (typeSerializer != null && (findConvertingSerializer instanceof ContainerSerializer)) {
                            findConvertingSerializer = ((ContainerSerializer) findConvertingSerializer).withValueTypeSerializer(typeSerializer);
                        }
                    }
                }
                beanProperty.assignSerializer(findConvertingSerializer);
                if (i < length) {
                    beanPropertyWriter = this._filteredProps[i];
                    if (beanPropertyWriter != null) {
                        beanPropertyWriter.assignSerializer(findConvertingSerializer);
                    }
                }
            }
        }
        AnyGetterWriter anyGetterWriter = this._anyGetterWriter;
        if (anyGetterWriter != null) {
            anyGetterWriter.resolve(serializerProvider);
        }
    }

    public void serializeFields(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
            if (this._anyGetterWriter != null) {
                this._anyGetterWriter.getAndSerialize(obj, jsonGenerator, serializerProvider);
            }
        } catch (Throwable e) {
            wrapAndThrow(serializerProvider, e, obj, 0 == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[0].getName());
        } catch (Throwable e2) {
            JsonMappingException jsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(new Reference(obj, 0 == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[0].getName()));
            throw jsonMappingException;
        }
    }

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        BeanPropertyFilter findFilter = findFilter(serializerProvider);
        if (findFilter == null) {
            serializeFields(obj, jsonGenerator, serializerProvider);
            return;
        }
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    findFilter.serializeAsField(obj, jsonGenerator, serializerProvider, beanPropertyWriter);
                }
                i++;
            }
            if (this._anyGetterWriter != null) {
                this._anyGetterWriter.getAndSerialize(obj, jsonGenerator, serializerProvider);
            }
        } catch (Throwable e) {
            wrapAndThrow(serializerProvider, e, obj, 0 == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[0].getName());
        } catch (Throwable e2) {
            JsonMappingException jsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(new Reference(obj, 0 == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[0].getName()));
            throw jsonMappingException;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        String _customTypeId = this._typeId == null ? null : _customTypeId(obj);
        if (_customTypeId == null) {
            typeSerializer.writeTypePrefixForObject(obj, jsonGenerator);
        } else {
            typeSerializer.writeCustomTypePrefixForObject(obj, jsonGenerator, _customTypeId);
        }
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        if (_customTypeId == null) {
            typeSerializer.writeTypeSuffixForObject(obj, jsonGenerator);
        } else {
            typeSerializer.writeCustomTypeSuffixForObject(obj, jsonGenerator, _customTypeId);
        }
    }

    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }
}

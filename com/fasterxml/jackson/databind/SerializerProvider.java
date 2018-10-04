package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class SerializerProvider extends DatabindContext {
    public static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final JsonSerializer DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final JsonSerializer DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    public static final JavaType TYPE_OBJECT = TypeFactory.defaultInstance().uncheckedSimpleType(Object.class);
    public final SerializationConfig _config;
    public DateFormat _dateFormat;
    public JsonSerializer _keySerializer;
    public final ReadOnlyClassToSerializerMap _knownSerializers;
    public JsonSerializer _nullKeySerializer;
    public JsonSerializer _nullValueSerializer;
    public final RootNameLookup _rootNames;
    public final Class _serializationView;
    public final SerializerCache _serializerCache;
    public final SerializerFactory _serializerFactory;
    public JsonSerializer _unknownTypeSerializer;

    public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectIdGenerator);

    public abstract JsonSerializer serializerInstance(Annotated annotated, Object obj);

    public SerializerProvider() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new SerializerCache();
        this._knownSerializers = null;
        this._rootNames = new RootNameLookup();
        this._serializationView = null;
    }

    public SerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        if (serializationConfig != null) {
            this._serializerFactory = serializerFactory;
            this._config = serializationConfig;
            this._serializerCache = serializerProvider._serializerCache;
            this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
            this._keySerializer = serializerProvider._keySerializer;
            this._nullValueSerializer = serializerProvider._nullValueSerializer;
            this._nullKeySerializer = serializerProvider._nullKeySerializer;
            this._rootNames = serializerProvider._rootNames;
            this._knownSerializers = this._serializerCache.getReadOnlyLookupMap();
            this._serializationView = serializationConfig.getActiveView();
            return;
        }
        throw new NullPointerException();
    }

    public JsonSerializer _createAndCacheUntypedSerializer(JavaType javaType) {
        try {
            JsonSerializer _createUntypedSerializer = _createUntypedSerializer(javaType);
            if (_createUntypedSerializer != null) {
                this._serializerCache.addAndResolveNonTypedSerializer(javaType, _createUntypedSerializer, this);
            }
            return _createUntypedSerializer;
        } catch (JavaType javaType2) {
            throw new JsonMappingException(javaType2.getMessage(), null, javaType2);
        }
    }

    public JsonSerializer _createAndCacheUntypedSerializer(Class cls) {
        try {
            JsonSerializer _createUntypedSerializer = _createUntypedSerializer(this._config.constructType(cls));
            if (_createUntypedSerializer != null) {
                this._serializerCache.addAndResolveNonTypedSerializer(cls, _createUntypedSerializer, this);
            }
            return _createUntypedSerializer;
        } catch (Class cls2) {
            throw new JsonMappingException(cls2.getMessage(), null, cls2);
        }
    }

    public JsonSerializer _createUntypedSerializer(JavaType javaType) {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        dateFormat = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat;
        return dateFormat;
    }

    public JsonSerializer _findExplicitUntypedSerializer(Class cls) {
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(cls);
            if (untypedValueSerializer == null) {
                return _createAndCacheUntypedSerializer(cls);
            }
        }
        return untypedValueSerializer;
    }

    public JsonSerializer _handleContextual(JsonSerializer jsonSerializer, BeanProperty beanProperty) {
        return jsonSerializer instanceof ContextualSerializer ? ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty) : jsonSerializer;
    }

    public JsonSerializer _handleContextualResolvable(JsonSerializer jsonSerializer, BeanProperty beanProperty) {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return _handleContextual(jsonSerializer, beanProperty);
    }

    public JsonSerializer _handleResolvable(JsonSerializer jsonSerializer) {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return jsonSerializer;
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javaType) {
        if (!javaType.isPrimitive() || !ClassUtil.wrapperType(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Incompatible types: declared root type (");
            stringBuilder.append(javaType);
            stringBuilder.append(") vs ");
            stringBuilder.append(obj.getClass().getName());
            throw new JsonMappingException(stringBuilder.toString());
        }
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(j));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(new Date(j)));
        }
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeDateValue(long j, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(j);
        } else {
            jsonGenerator.writeString(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(date.getTime());
        } else {
            jsonGenerator.writeString(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeFieldName(str);
        if (obj == null) {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } else {
            findTypedValueSerializer(obj.getClass(), true, null).serialize(obj, jsonGenerator, this);
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) {
        getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) {
        if (obj == null) {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } else {
            findTypedValueSerializer(obj.getClass(), true, null).serialize(obj, jsonGenerator, this);
        }
    }

    public JsonSerializer findKeySerializer(JavaType javaType, BeanProperty beanProperty) {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this._config, javaType, this._keySerializer), beanProperty);
    }

    public JsonSerializer findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) {
        return getDefaultNullKeySerializer();
    }

    public JsonSerializer findNullValueSerializer(BeanProperty beanProperty) {
        return getDefaultNullValueSerializer();
    }

    public JsonSerializer findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) {
        JsonSerializer typedValueSerializer = this._knownSerializers.typedValueSerializer(javaType);
        if (typedValueSerializer == null) {
            typedValueSerializer = this._serializerCache.typedValueSerializer(javaType);
            if (typedValueSerializer == null) {
                typedValueSerializer = findValueSerializer(javaType, beanProperty);
                TypeSerializer createTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
                if (createTypeSerializer != null) {
                    typedValueSerializer = new TypeWrappedSerializer(createTypeSerializer.forProperty(beanProperty), typedValueSerializer);
                }
                if (z) {
                    this._serializerCache.addTypedSerializer(javaType, typedValueSerializer);
                }
            }
        }
        return typedValueSerializer;
    }

    public JsonSerializer findTypedValueSerializer(Class cls, boolean z, BeanProperty beanProperty) {
        JsonSerializer typedValueSerializer = this._knownSerializers.typedValueSerializer(cls);
        if (typedValueSerializer == null) {
            typedValueSerializer = this._serializerCache.typedValueSerializer(cls);
            if (typedValueSerializer == null) {
                typedValueSerializer = findValueSerializer(cls, beanProperty);
                SerializerFactory serializerFactory = this._serializerFactory;
                MapperConfig mapperConfig = this._config;
                TypeSerializer createTypeSerializer = serializerFactory.createTypeSerializer(mapperConfig, mapperConfig.constructType(cls));
                if (createTypeSerializer != null) {
                    typedValueSerializer = new TypeWrappedSerializer(createTypeSerializer.forProperty(beanProperty), typedValueSerializer);
                }
                if (z) {
                    this._serializerCache.addTypedSerializer(cls, typedValueSerializer);
                }
            }
        }
        return typedValueSerializer;
    }

    public JsonSerializer findValueSerializer(JavaType javaType, BeanProperty beanProperty) {
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = _createAndCacheUntypedSerializer(javaType);
                if (untypedValueSerializer == null) {
                    return getUnknownTypeSerializer(javaType.getRawClass());
                }
            }
        }
        return _handleContextual(untypedValueSerializer, beanProperty);
    }

    public JsonSerializer findValueSerializer(Class cls, BeanProperty beanProperty) {
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(cls);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls));
                if (untypedValueSerializer == null) {
                    untypedValueSerializer = _createAndCacheUntypedSerializer(cls);
                    if (untypedValueSerializer == null) {
                        return getUnknownTypeSerializer(cls);
                    }
                }
            }
        }
        return _handleContextual(untypedValueSerializer, beanProperty);
    }

    public final Class getActiveView() {
        return this._serializationView;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final SerializationConfig getConfig() {
        return this._config;
    }

    public JsonSerializer getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public JsonSerializer getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public final FilterProvider getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final Class getSerializationView() {
        return this._serializationView;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JsonSerializer getUnknownTypeSerializer(Class cls) {
        return this._unknownTypeSerializer;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public void setDefaultKeySerializer(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            this._keySerializer = jsonSerializer;
            return;
        }
        throw new IllegalArgumentException("Can not pass null JsonSerializer");
    }

    public void setNullKeySerializer(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            this._nullKeySerializer = jsonSerializer;
            return;
        }
        throw new IllegalArgumentException("Can not pass null JsonSerializer");
    }

    public void setNullValueSerializer(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            this._nullValueSerializer = jsonSerializer;
            return;
        }
        throw new IllegalArgumentException("Can not pass null JsonSerializer");
    }
}

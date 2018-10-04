package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectMapper extends ObjectCodec implements Versioned, Serializable {
    public static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
    public static final BaseSettings DEFAULT_BASE = new BaseSettings(DEFAULT_INTROSPECTOR, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), TimeZone.getTimeZone("GMT"), Base64Variants.getDefaultVariant());
    public static final ClassIntrospector DEFAULT_INTROSPECTOR = BasicClassIntrospector.instance;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    public static final VisibilityChecker STD_VISIBILITY_CHECKER = VisibilityChecker$Std.defaultInstance();
    public static final PrettyPrinter _defaultPrettyPrinter = new DefaultPrettyPrinter();
    private static final long serialVersionUID = 1;
    public DeserializationConfig _deserializationConfig;
    public DefaultDeserializationContext _deserializationContext;
    public InjectableValues _injectableValues;
    public final JsonFactory _jsonFactory;
    public final HashMap _mixInAnnotations;
    public final ConcurrentHashMap _rootDeserializers;
    public final RootNameLookup _rootNames;
    public SerializationConfig _serializationConfig;
    public SerializerFactory _serializerFactory;
    public DefaultSerializerProvider _serializerProvider;
    public SubtypeResolver _subtypeResolver;
    public TypeFactory _typeFactory;

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$2 */
    public /* synthetic */ class C01502 {
        /* renamed from: $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping */
        public static final /* synthetic */ int[] f50707x3ef634e7 = new int[DefaultTyping.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.values();
            r0 = r0.length;
            r0 = new int[r0];
            f50707x3ef634e7 = r0;
            r2 = f50707x3ef634e7;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = f50707x3ef634e7;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = f50707x3ef634e7;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.2.<clinit>():void");
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._mixInAnnotations = new HashMap();
        this._rootDeserializers = new ConcurrentHashMap(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                this._jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        this._rootNames = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        BaseSettings baseSettings = DEFAULT_BASE;
        this._serializationConfig = new SerializationConfig(baseSettings, this._subtypeResolver, this._mixInAnnotations);
        this._deserializationConfig = new DeserializationConfig(baseSettings, this._subtypeResolver, this._mixInAnnotations);
        if (defaultSerializerProvider == null) {
            defaultSerializerProvider = new Impl();
        }
        this._serializerProvider = defaultSerializerProvider;
        if (defaultDeserializationContext == null) {
            defaultDeserializationContext = new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
        }
        this._deserializationContext = defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this._mixInAnnotations = new HashMap();
        this._rootDeserializers = new ConcurrentHashMap(64, 0.6f, 2);
        JsonFactory copy = objectMapper._jsonFactory.copy();
        this._jsonFactory = copy;
        copy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver;
        this._rootNames = new RootNameLookup();
        this._typeFactory = objectMapper._typeFactory;
        this._serializationConfig = objectMapper._serializationConfig;
        Map hashMap = new HashMap(objectMapper._mixInAnnotations);
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, hashMap);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, hashMap);
        this._serializerProvider = objectMapper._serializerProvider;
        this._deserializationContext = objectMapper._deserializationContext;
        this._serializerFactory = objectMapper._serializerFactory;
    }

    public void _checkInvalidCopy(Class cls) {
        if (getClass() != cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed copy(): ");
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" (version: ");
            stringBuilder.append(version());
            stringBuilder.append(") does not override copy(); it has to");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private final void _configAndWriteCloseable(com.fasterxml.jackson.core.JsonGenerator r4, java.lang.Object r5, com.fasterxml.jackson.databind.SerializationConfig r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r5;
        r2 = (java.io.Closeable) r2;
        r1 = 0;
        r0 = r3._serializerProvider(r6);	 Catch:{ all -> 0x0017 }
        r0.serializeValue(r4, r5);	 Catch:{ all -> 0x0017 }
        r4.close();	 Catch:{ all -> 0x0015 }
        r2.close();	 Catch:{ all -> 0x0012 }
        return;	 Catch:{ all -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0019;
    L_0x0015:
        r0 = move-exception;
        goto L_0x0019;
    L_0x0017:
        r0 = move-exception;
        r1 = r4;
    L_0x0019:
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r1.close();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        if (r2 == 0) goto L_0x0023;
    L_0x0020:
        r2.close();	 Catch:{ IOException -> 0x0023 }
    L_0x0023:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._configAndWriteCloseable(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.SerializationConfig):void");
    }

    public final void _configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r3.getSerializationConfig();
        r0 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
        r0 = r2.isEnabled(r0);
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r4.useDefaultPrettyPrinter();
    L_0x000f:
        r0 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
        r0 = r2.isEnabled(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0 = r5 instanceof java.io.Closeable;
        if (r0 == 0) goto L_0x001f;
    L_0x001b:
        r3._configAndWriteCloseable(r4, r5, r2);
        return;
    L_0x001f:
        r1 = 0;
        r0 = r3._serializerProvider(r2);	 Catch:{ all -> 0x002c }
        r0.serializeValue(r4, r5);	 Catch:{ all -> 0x002c }
        r1 = 1;	 Catch:{ all -> 0x002c }
        r4.close();	 Catch:{ all -> 0x002c }
        return;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        if (r1 != 0) goto L_0x0032;
    L_0x002f:
        r4.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object):void");
    }

    public final void _configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator r4, java.lang.Object r5, java.lang.Class r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.getSerializationConfig();
        r2 = r0.withView(r6);
        r0 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
        r0 = r2.isEnabled(r0);
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r4.useDefaultPrettyPrinter();
    L_0x0013:
        r0 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
        r0 = r2.isEnabled(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x001b:
        r0 = r5 instanceof java.io.Closeable;
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r3._configAndWriteCloseable(r4, r5, r2);
        return;
    L_0x0023:
        r1 = 0;
        r0 = r3._serializerProvider(r2);	 Catch:{ all -> 0x0030 }
        r0.serializeValue(r4, r5);	 Catch:{ all -> 0x0030 }
        r1 = 1;	 Catch:{ all -> 0x0030 }
        r4.close();	 Catch:{ all -> 0x0030 }
        return;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        if (r1 != 0) goto L_0x0036;
    L_0x0033:
        r4.close();	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, java.lang.Class):void");
    }

    public Object _convert(Object obj, JavaType javaType) {
        Class rawClass = javaType.getRawClass();
        if (rawClass != Object.class && !javaType.hasGenericTypes() && rawClass.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        JsonGenerator tokenBuffer = new TokenBuffer(this);
        try {
            Object nullValue;
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(asParser);
            if (_initForReading == JsonToken.VALUE_NULL) {
                nullValue = _findRootDeserializer(createDeserializationContext(asParser, deserializationConfig), javaType).getNullValue();
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DeserializationContext createDeserializationContext = createDeserializationContext(asParser, deserializationConfig);
                        nullValue = _findRootDeserializer(createDeserializationContext, javaType).deserialize(asParser, createDeserializationContext);
                    }
                }
                nullValue = null;
            }
            asParser.close();
            return nullValue;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public PrettyPrinter _defaultPrettyPrinter() {
        return _defaultPrettyPrinter;
    }

    public JsonDeserializer _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        JsonDeserializer jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer != null) {
            this._rootDeserializers.put(javaType, findRootValueDeserializer);
            return findRootValueDeserializer;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not find a deserializer for type ");
        stringBuilder.append(javaType);
        throw new JsonMappingException(stringBuilder.toString());
    }

    public JsonToken _initForReading(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                throw JsonMappingException.from(jsonParser, "No content to map due to end-of-input");
            }
        }
        return currentToken;
    }

    public java.lang.Object _readMapAndClose(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.JavaType r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r2 = r5;	 Catch:{ all -> 0x0049 }
        r3 = r6;	 Catch:{ all -> 0x0049 }
        r1 = r5._initForReading(r6);	 Catch:{ all -> 0x0049 }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;	 Catch:{ all -> 0x0049 }
        r6 = r7;	 Catch:{ all -> 0x0049 }
        if (r1 != r0) goto L_0x001c;	 Catch:{ all -> 0x0049 }
    L_0x000b:
        r0 = r5.getDeserializationConfig();	 Catch:{ all -> 0x0049 }
        r0 = r5.createDeserializationContext(r3, r0);	 Catch:{ all -> 0x0049 }
        r0 = r5._findRootDeserializer(r0, r7);	 Catch:{ all -> 0x0049 }
        r0 = r0.getNullValue();	 Catch:{ all -> 0x0049 }
        goto L_0x0042;	 Catch:{ all -> 0x0049 }
    L_0x001c:
        r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;	 Catch:{ all -> 0x0049 }
        if (r1 == r0) goto L_0x0041;	 Catch:{ all -> 0x0049 }
    L_0x0020:
        r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;	 Catch:{ all -> 0x0049 }
        if (r1 != r0) goto L_0x0025;	 Catch:{ all -> 0x0049 }
    L_0x0024:
        goto L_0x0041;	 Catch:{ all -> 0x0049 }
    L_0x0025:
        r5 = r5.getDeserializationConfig();	 Catch:{ all -> 0x0049 }
        r4 = r2.createDeserializationContext(r3, r5);	 Catch:{ all -> 0x0049 }
        r7 = r2._findRootDeserializer(r4, r7);	 Catch:{ all -> 0x0049 }
        r0 = r5.useRootWrapping();	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x003c;	 Catch:{ all -> 0x0049 }
    L_0x0037:
        r0 = r2._unwrapAndDeserialize(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0049 }
        goto L_0x0042;	 Catch:{ all -> 0x0049 }
    L_0x003c:
        r0 = r7.deserialize(r3, r4);	 Catch:{ all -> 0x0049 }
        goto L_0x0042;	 Catch:{ all -> 0x0049 }
    L_0x0041:
        r0 = 0;	 Catch:{ all -> 0x0049 }
    L_0x0042:
        r3.clearCurrentToken();	 Catch:{ all -> 0x0049 }
        r3.close();	 Catch:{ IOException -> 0x0048 }
    L_0x0048:
        return r0;
    L_0x0049:
        r0 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x004d }
    L_0x004d:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) {
        Object nullValue;
        ObjectMapper objectMapper = this;
        JsonParser jsonParser2 = jsonParser;
        JsonToken _initForReading = _initForReading(jsonParser);
        JavaType javaType2 = javaType;
        if (_initForReading == JsonToken.VALUE_NULL) {
            nullValue = _findRootDeserializer(createDeserializationContext(jsonParser2, deserializationConfig), javaType).getNullValue();
        } else {
            if (_initForReading != JsonToken.END_ARRAY) {
                if (_initForReading != JsonToken.END_OBJECT) {
                    DeserializationContext createDeserializationContext = createDeserializationContext(jsonParser2, deserializationConfig);
                    javaType = _findRootDeserializer(createDeserializationContext, javaType);
                    nullValue = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser2, createDeserializationContext, deserializationConfig, javaType2, javaType) : javaType.deserialize(jsonParser2, createDeserializationContext);
                }
            }
            nullValue = null;
        }
        jsonParser2.clearCurrentToken();
        return nullValue;
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer jsonDeserializer) {
        String rootName = deserializationConfig.getRootName();
        if (rootName == null) {
            rootName = this._rootNames.findRootName(javaType, (MapperConfig) deserializationConfig).getValue();
        }
        StringBuilder stringBuilder;
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Current token not START_OBJECT (needed to unwrap root name '");
            stringBuilder.append(rootName);
            stringBuilder.append("'), but ");
            stringBuilder.append(jsonParser.getCurrentToken());
            throw JsonMappingException.from(jsonParser, stringBuilder.toString());
        } else if (jsonParser.nextToken() == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            if (rootName.equals(currentName)) {
                jsonParser.nextToken();
                Object deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                    return deserialize;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Current token not END_OBJECT (to match wrapper object with root name '");
                stringBuilder.append(rootName);
                stringBuilder.append("'), but ");
                stringBuilder.append(jsonParser.getCurrentToken());
                throw JsonMappingException.from(jsonParser, stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Root name '");
            stringBuilder.append(currentName);
            stringBuilder.append("' does not match expected ('");
            stringBuilder.append(rootName);
            stringBuilder.append("') for type ");
            stringBuilder.append(javaType);
            throw JsonMappingException.from(jsonParser, stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Current token not FIELD_NAME (to contain expected root name '");
            stringBuilder.append(rootName);
            stringBuilder.append("'), but ");
            stringBuilder.append(jsonParser.getCurrentToken());
            throw JsonMappingException.from(jsonParser, stringBuilder.toString());
        }
    }

    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema == null) {
            return;
        }
        if (!this._jsonFactory.canUseSchema(formatSchema)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not use FormatSchema of type ");
            stringBuilder.append(formatSchema.getClass().getName());
            stringBuilder.append(" for format ");
            stringBuilder.append(this._jsonFactory.getFormatName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private final void _writeCloseableValue(com.fasterxml.jackson.core.JsonGenerator r4, java.lang.Object r5, com.fasterxml.jackson.databind.SerializationConfig r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r5;
        r2 = (java.io.Closeable) r2;
        r0 = r3._serializerProvider(r6);	 Catch:{ all -> 0x001d }
        r0.serializeValue(r4, r5);	 Catch:{ all -> 0x001d }
        r0 = com.fasterxml.jackson.databind.SerializationFeature.FLUSH_AFTER_WRITE_VALUE;	 Catch:{ all -> 0x001d }
        r0 = r6.isEnabled(r0);	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0015;	 Catch:{ all -> 0x001d }
    L_0x0012:
        r4.flush();	 Catch:{ all -> 0x001d }
    L_0x0015:
        r1 = 0;	 Catch:{ all -> 0x001d }
        r2.close();	 Catch:{ all -> 0x001a }
        return;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        r2 = r1;
        goto L_0x001e;
    L_0x001d:
        r0 = move-exception;
    L_0x001e:
        if (r2 == 0) goto L_0x0023;
    L_0x0020:
        r2.close();	 Catch:{ IOException -> 0x0023 }
    L_0x0023:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._writeCloseableValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.SerializationConfig):void");
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        if (javaType != null) {
            _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, jsonFormatVisitorWrapper);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public void acceptJsonFormatVisitor(Class cls, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        acceptJsonFormatVisitor(this._typeFactory.constructType((Type) cls), jsonFormatVisitorWrapper);
    }

    public ObjectMapper addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._deserializationConfig = this._deserializationConfig.withHandler(deserializationProblemHandler);
        return this;
    }

    public final void addMixInAnnotations(Class cls, Class cls2) {
        this._mixInAnnotations.put(new ClassKey(cls), cls2);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType);
    }

    public boolean canSerialize(Class cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public ObjectMapper configure(Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        SerializationConfig with;
        DeserializationConfig with2;
        if (z) {
            with = this._serializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            with = this._serializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._serializationConfig = with;
        if (z) {
            with2 = this._deserializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            with2 = this._deserializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._deserializationConfig = with2;
        return this;
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public JavaType constructType(Type type) {
        return this._typeFactory.constructType(type);
    }

    public Object convertValue(Object obj, TypeReference typeReference) {
        return convertValue(obj, this._typeFactory.constructType(typeReference));
    }

    public Object convertValue(Object obj, JavaType javaType) {
        return obj == null ? null : _convert(obj, javaType);
    }

    public Object convertValue(Object obj, Class cls) {
        return obj == null ? null : _convert(obj, this._typeFactory.constructType((Type) cls));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    public ObjectMapper enableDefaultTyping() {
        return enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, As.WRAPPER_ARRAY);
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, As as) {
        return setDefaultTyping(new ObjectMapper$DefaultTypeResolverBuilder(defaultTyping).init(Id.CLASS, null).inclusion(as));
    }

    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(new ObjectMapper$DefaultTypeResolverBuilder(defaultTyping).init(Id.CLASS, null).inclusion(As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules(findModules());
    }

    public final Class findMixInClassFor(Class cls) {
        HashMap hashMap = this._mixInAnnotations;
        return hashMap == null ? null : (Class) hashMap.get(new ClassKey(cls));
    }

    public static List findModules() {
        return findModules(null);
    }

    public static List findModules(ClassLoader classLoader) {
        List arrayList = new ArrayList();
        Iterator it = (classLoader == null ? ServiceLoader.load(Module.class) : ServiceLoader.load(Module.class, classLoader)).iterator();
        while (it.hasNext()) {
            arrayList.add((Module) it.next());
        }
        return arrayList;
    }

    public JsonSchema generateJsonSchema(Class cls) {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public JsonFactory getJsonFactory() {
        return this._jsonFactory;
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public SerializerFactory getSerializerFactory() {
        return this._serializerFactory;
    }

    public SerializerProvider getSerializerProvider() {
        return this._serializerProvider;
    }

    public SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public final int mixInCount() {
        HashMap hashMap = this._mixInAnnotations;
        return hashMap == null ? 0 : hashMap.size();
    }

    public TreeNode readTree(JsonParser jsonParser) {
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.getCurrentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        TreeNode treeNode = (JsonNode) _readValue(deserializationConfig, jsonParser, JSON_NODE_TYPE);
        if (treeNode == null) {
            treeNode = getNodeFactory().nullNode();
        }
        return treeNode;
    }

    public JsonNode readTree(File file) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(file), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public JsonNode readTree(InputStream inputStream) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(inputStream), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public JsonNode readTree(Reader reader) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(reader), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public JsonNode readTree(String str) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(str), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public JsonNode readTree(URL url) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(url), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public JsonNode readTree(byte[] bArr) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(bArr), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public final Object readValue(JsonParser jsonParser, ResolvedType resolvedType) {
        return _readValue(getDeserializationConfig(), jsonParser, (JavaType) resolvedType);
    }

    public Object readValue(JsonParser jsonParser, TypeReference typeReference) {
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(typeReference));
    }

    public Object readValue(JsonParser jsonParser, JavaType javaType) {
        return _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    public Object readValue(JsonParser jsonParser, Class cls) {
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(File file, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(File file, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public Object readValue(File file, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(InputStream inputStream, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(InputStream inputStream, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public Object readValue(InputStream inputStream, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(Reader reader, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(Reader reader, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public Object readValue(Reader reader, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(String str, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(String str, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(str), javaType);
    }

    public Object readValue(String str, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(URL url, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(URL url, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public Object readValue(URL url, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(byte[] bArr, int i, int i2, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(byte[] bArr, int i, int i2, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public Object readValue(byte[] bArr, int i, int i2, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((Type) cls));
    }

    public Object readValue(byte[] bArr, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(typeReference));
    }

    public Object readValue(byte[] bArr, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public Object readValue(byte[] bArr, Class cls) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((Type) cls));
    }

    public MappingIterator readValues(JsonParser jsonParser, ResolvedType resolvedType) {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public MappingIterator readValues(JsonParser jsonParser, TypeReference typeReference) {
        return readValues(jsonParser, this._typeFactory.constructType(typeReference));
    }

    public MappingIterator readValues(JsonParser jsonParser, JavaType javaType) {
        JsonParser jsonParser2 = jsonParser;
        DeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new MappingIterator(javaType, jsonParser2, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), null, null);
    }

    public MappingIterator readValues(JsonParser jsonParser, Class cls) {
        return readValues(jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader() {
        return new ObjectReader(this, getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return new ObjectReader(this, getDeserializationConfig().with(base64Variant));
    }

    public ObjectReader reader(FormatSchema formatSchema) {
        FormatSchema formatSchema2 = formatSchema;
        _verifySchemaType(formatSchema);
        return new ObjectReader(this, getDeserializationConfig(), null, null, formatSchema2, this._injectableValues);
    }

    public ObjectReader reader(TypeReference typeReference) {
        return reader(this._typeFactory.constructType(typeReference));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return new ObjectReader(this, getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return new ObjectReader(this, getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return new ObjectReader(this, getDeserializationConfig(), null, null, null, injectableValues);
    }

    public ObjectReader reader(JavaType javaType) {
        return new ObjectReader(this, getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return new ObjectReader(this, getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectReader reader(Class cls) {
        return reader(this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader readerForUpdating(Object obj) {
        Object obj2 = obj;
        return new ObjectReader(this, getDeserializationConfig(), this._typeFactory.constructType(obj.getClass()), obj2, null, this._injectableValues);
    }

    public ObjectReader readerWithView(Class cls) {
        return new ObjectReader(this, getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModule(Module module) {
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (module.version() != null) {
            module.setupModule(new ObjectMapper$1(this, this));
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public ObjectMapper registerModules(Iterable iterable) {
        for (Module registerModule : iterable) {
            registerModule(registerModule);
        }
        return this;
    }

    public ObjectMapper registerModules(Module... moduleArr) {
        for (Module registerModule : moduleArr) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public void registerSubtypes(Class... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.with(base64Variant);
        this._deserializationConfig = this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder typeResolverBuilder) {
        this._deserializationConfig = this._deserializationConfig.with(typeResolverBuilder);
        this._serializationConfig = this._serializationConfig.with(typeResolverBuilder);
        return this;
    }

    public void setFilters(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
    }

    public Object setHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._deserializationConfig = this._deserializationConfig.with(handlerInstantiator);
        this._serializationConfig = this._serializationConfig.with(handlerInstantiator);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.with(locale);
        this._serializationConfig = this._serializationConfig.with(locale);
        return this;
    }

    public final void setMixInAnnotations(Map map) {
        this._mixInAnnotations.clear();
        if (map != null && map.size() > 0) {
            for (Entry entry : map.entrySet()) {
                this._mixInAnnotations.put(new ClassKey((Class) entry.getKey()), entry.getValue());
            }
        }
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(Include include) {
        this._serializationConfig = this._serializationConfig.withSerializationInclusion(include);
        return this;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerFactory) {
        this._serializerFactory = serializerFactory;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(SubtypeResolver subtypeResolver) {
        this._subtypeResolver = subtypeResolver;
        this._deserializationConfig = this._deserializationConfig.with(subtypeResolver);
        this._serializationConfig = this._serializationConfig.with(subtypeResolver);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.with(timeZone);
        this._serializationConfig = this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.with(typeFactory);
        this._serializationConfig = this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
        this._deserializationConfig = this._deserializationConfig.withVisibility(propertyAccessor, visibility);
        this._serializationConfig = this._serializationConfig.withVisibility(propertyAccessor, visibility);
        return this;
    }

    public void setVisibilityChecker(VisibilityChecker visibilityChecker) {
        this._deserializationConfig = this._deserializationConfig.with(visibilityChecker);
        this._serializationConfig = this._serializationConfig.with(visibilityChecker);
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    public Object treeToValue(TreeNode treeNode, Class cls) {
        try {
            if (cls == Object.class || !cls.isAssignableFrom(treeNode.getClass())) {
                return readValue(treeAsTokens(treeNode), cls);
            }
            return treeNode;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (TreeNode treeNode2) {
            throw new IllegalArgumentException(treeNode2.getMessage(), treeNode2);
        }
    }

    public JsonNode valueToTree(Object obj) {
        if (obj == null) {
            return null;
        }
        JsonGenerator tokenBuffer = new TokenBuffer(this);
        try {
            writeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            JsonNode jsonNode = (JsonNode) readTree(asParser);
            asParser.close();
            return jsonNode;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public void writeTree(JsonGenerator jsonGenerator, JsonNode jsonNode) {
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, jsonNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT)) {
            jsonGenerator.useDefaultPrettyPrinter();
        }
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(File file, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputStream, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(Writer writer, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(writer), obj);
    }

    public byte[] writeValueAsBytes(Object obj) {
        OutputStream byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(byteArrayBuilder, JsonEncoding.UTF8), obj);
            byte[] toByteArray = byteArrayBuilder.toByteArray();
            byteArrayBuilder.release();
            return toByteArray;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) {
        Writer segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return new ObjectWriter(this, getSerializationConfig());
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return new ObjectWriter(this, getSerializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return new ObjectWriter(this, getSerializationConfig(), formatSchema);
    }

    public ObjectWriter writer(PrettyPrinter prettyPrinter) {
        if (prettyPrinter == null) {
            prettyPrinter = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return new ObjectWriter(this, getSerializationConfig(), null, prettyPrinter);
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return new ObjectWriter(this, getSerializationConfig().with(serializationFeature));
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return new ObjectWriter(this, getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter writer(FilterProvider filterProvider) {
        return new ObjectWriter(this, getSerializationConfig().withFilters(filterProvider));
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return new ObjectWriter(this, getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        return new ObjectWriter(this, getSerializationConfig(), null, _defaultPrettyPrinter());
    }

    public ObjectWriter writerWithType(TypeReference typeReference) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (typeReference == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(typeReference);
        }
        return new ObjectWriter(this, serializationConfig, javaType, null);
    }

    public ObjectWriter writerWithType(JavaType javaType) {
        return new ObjectWriter(this, getSerializationConfig(), javaType, null);
    }

    public ObjectWriter writerWithType(Class cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return new ObjectWriter(this, serializationConfig, javaType, null);
    }

    public ObjectWriter writerWithView(Class cls) {
        return new ObjectWriter(this, getSerializationConfig().withView(cls));
    }
}

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class ObjectWriter implements Versioned, Serializable {
    public static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = -7024829992408267532L;
    public final SerializationConfig _config;
    public final JsonFactory _jsonFactory;
    public final PrettyPrinter _prettyPrinter;
    public final JsonSerializer _rootSerializer;
    public final JavaType _rootType;
    public final FormatSchema _schema;
    public final SerializerFactory _serializerFactory;
    public final DefaultSerializerProvider _serializerProvider;

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._jsonFactory = objectMapper._jsonFactory;
        this._rootType = null;
        this._rootSerializer = null;
        this._prettyPrinter = null;
        this._schema = null;
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, FormatSchema formatSchema) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._jsonFactory = objectMapper._jsonFactory;
        this._rootType = null;
        this._rootSerializer = null;
        this._prettyPrinter = null;
        this._schema = formatSchema;
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._jsonFactory = objectMapper._jsonFactory;
        if (javaType != null) {
            javaType = javaType.withStaticTyping();
        }
        this._rootType = javaType;
        this._prettyPrinter = prettyPrinter;
        this._schema = null;
        this._rootSerializer = _prefetchRootSerializer(serializationConfig, javaType);
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._jsonFactory = objectWriter._jsonFactory;
        this._schema = objectWriter._schema;
        this._rootType = objectWriter._rootType;
        this._rootSerializer = objectWriter._rootSerializer;
        this._prettyPrinter = objectWriter._prettyPrinter;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, JavaType javaType, JsonSerializer jsonSerializer, PrettyPrinter prettyPrinter, FormatSchema formatSchema) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._jsonFactory = objectWriter._jsonFactory;
        this._rootType = javaType;
        this._rootSerializer = jsonSerializer;
        this._prettyPrinter = prettyPrinter;
        this._schema = formatSchema;
    }

    public final void _configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator r5, java.lang.Object r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r4._configureJsonGenerator(r5);
        r1 = r4._config;
        r0 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
        r0 = r1.isEnabled(r0);
        if (r0 == 0) goto L_0x0017;
    L_0x000d:
        r0 = r6 instanceof java.io.Closeable;
        if (r0 == 0) goto L_0x0017;
    L_0x0011:
        r0 = r4._config;
        r4._writeCloseable(r5, r6, r0);
        return;
    L_0x0017:
        r3 = 0;
        r0 = r4._rootType;	 Catch:{ all -> 0x0038 }
        if (r0 != 0) goto L_0x0026;	 Catch:{ all -> 0x0038 }
    L_0x001c:
        r0 = r4._config;	 Catch:{ all -> 0x0038 }
        r0 = r4._serializerProvider(r0);	 Catch:{ all -> 0x0038 }
        r0.serializeValue(r5, r6);	 Catch:{ all -> 0x0038 }
        goto L_0x0033;	 Catch:{ all -> 0x0038 }
    L_0x0026:
        r0 = r4._config;	 Catch:{ all -> 0x0038 }
        r2 = r4._serializerProvider(r0);	 Catch:{ all -> 0x0038 }
        r1 = r4._rootType;	 Catch:{ all -> 0x0038 }
        r0 = r4._rootSerializer;	 Catch:{ all -> 0x0038 }
        r2.serializeValue(r5, r6, r1, r0);	 Catch:{ all -> 0x0038 }
    L_0x0033:
        r3 = 1;	 Catch:{ all -> 0x0038 }
        r5.close();	 Catch:{ all -> 0x0038 }
        return;	 Catch:{ all -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        if (r3 != 0) goto L_0x003e;
    L_0x003b:
        r5.close();	 Catch:{ IOException -> 0x003e }
    L_0x003e:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectWriter._configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object):void");
    }

    private void _configureJsonGenerator(JsonGenerator jsonGenerator) {
        PrettyPrinter prettyPrinter = this._prettyPrinter;
        if (prettyPrinter != null) {
            if (prettyPrinter == NULL_PRETTY_PRINTER) {
                jsonGenerator.setPrettyPrinter(null);
            } else {
                if (prettyPrinter instanceof Instantiatable) {
                    prettyPrinter = (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance();
                }
                jsonGenerator.setPrettyPrinter(prettyPrinter);
            }
        } else if (this._config.isEnabled(SerializationFeature.INDENT_OUTPUT)) {
            jsonGenerator.useDefaultPrettyPrinter();
        }
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonGenerator.setSchema(formatSchema);
        }
    }

    public com.fasterxml.jackson.databind.JsonSerializer _prefetchRootSerializer(com.fasterxml.jackson.databind.SerializationConfig r4, com.fasterxml.jackson.databind.JavaType r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = 0;
        if (r5 == 0) goto L_0x0019;
    L_0x0003:
        r1 = r3._config;
        r0 = com.fasterxml.jackson.databind.SerializationFeature.EAGER_SERIALIZER_FETCH;
        r0 = r1.isEnabled(r0);
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0019;
    L_0x000e:
        r1 = r3._serializerProvider(r4);	 Catch:{ JsonProcessingException -> 0x0018 }
        r0 = 1;	 Catch:{ JsonProcessingException -> 0x0018 }
        r0 = r1.findTypedValueSerializer(r5, r0, r2);	 Catch:{ JsonProcessingException -> 0x0018 }
        return r0;	 Catch:{ JsonProcessingException -> 0x0018 }
    L_0x0018:
        return r2;
    L_0x0019:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectWriter._prefetchRootSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
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

    private final void _writeCloseable(com.fasterxml.jackson.core.JsonGenerator r6, java.lang.Object r7, com.fasterxml.jackson.databind.SerializationConfig r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r4 = r7;
        r4 = (java.io.Closeable) r4;
        r3 = 0;
        r0 = r5._rootType;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0010;	 Catch:{ all -> 0x0029 }
    L_0x0008:
        r0 = r5._serializerProvider(r8);	 Catch:{ all -> 0x0029 }
        r0.serializeValue(r6, r7);	 Catch:{ all -> 0x0029 }
        goto L_0x001b;	 Catch:{ all -> 0x0029 }
    L_0x0010:
        r2 = r5._serializerProvider(r8);	 Catch:{ all -> 0x0029 }
        r1 = r5._rootType;	 Catch:{ all -> 0x0029 }
        r0 = r5._rootSerializer;	 Catch:{ all -> 0x0029 }
        r2.serializeValue(r6, r7, r1, r0);	 Catch:{ all -> 0x0029 }
    L_0x001b:
        r6.close();	 Catch:{ all -> 0x0026 }
        r4.close();	 Catch:{ all -> 0x0022 }
        return;	 Catch:{ all -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        r6 = r3;
        r4 = r3;
        goto L_0x002a;
    L_0x0026:
        r0 = move-exception;
        r6 = r3;
        goto L_0x002a;
    L_0x0029:
        r0 = move-exception;
    L_0x002a:
        if (r6 == 0) goto L_0x002f;
    L_0x002c:
        r6.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        if (r4 == 0) goto L_0x0034;
    L_0x0031:
        r4.close();	 Catch:{ IOException -> 0x0034 }
    L_0x0034:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectWriter._writeCloseable(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.SerializationConfig):void");
    }

    private final void _writeCloseableValue(com.fasterxml.jackson.core.JsonGenerator r5, java.lang.Object r6, com.fasterxml.jackson.databind.SerializationConfig r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r3 = r6;
        r3 = (java.io.Closeable) r3;
        r0 = r4._rootType;	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x000f;	 Catch:{ all -> 0x002f }
    L_0x0007:
        r0 = r4._serializerProvider(r7);	 Catch:{ all -> 0x002f }
        r0.serializeValue(r5, r6);	 Catch:{ all -> 0x002f }
        goto L_0x001a;	 Catch:{ all -> 0x002f }
    L_0x000f:
        r2 = r4._serializerProvider(r7);	 Catch:{ all -> 0x002f }
        r1 = r4._rootType;	 Catch:{ all -> 0x002f }
        r0 = r4._rootSerializer;	 Catch:{ all -> 0x002f }
        r2.serializeValue(r5, r6, r1, r0);	 Catch:{ all -> 0x002f }
    L_0x001a:
        r1 = r4._config;	 Catch:{ all -> 0x002f }
        r0 = com.fasterxml.jackson.databind.SerializationFeature.FLUSH_AFTER_WRITE_VALUE;	 Catch:{ all -> 0x002f }
        r0 = r1.isEnabled(r0);	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0027;	 Catch:{ all -> 0x002f }
    L_0x0024:
        r5.flush();	 Catch:{ all -> 0x002f }
    L_0x0027:
        r1 = 0;	 Catch:{ all -> 0x002f }
        r3.close();	 Catch:{ all -> 0x002c }
        return;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0030;
    L_0x002f:
        r0 = move-exception;
    L_0x0030:
        if (r3 == 0) goto L_0x0035;
    L_0x0032:
        r3.close();	 Catch:{ IOException -> 0x0035 }
    L_0x0035:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectWriter._writeCloseableValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.SerializationConfig):void");
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        if (javaType != null) {
            _serializerProvider(this._config).acceptJsonFormatVisitor(javaType, jsonFormatVisitorWrapper);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public boolean canSerialize(Class cls) {
        return _serializerProvider(this._config).hasSerializerFor(cls);
    }

    public SerializationConfig getConfig() {
        return this._config;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public JsonFactory getJsonFactory() {
        return this._jsonFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean hasPrefetchedSerializer() {
        return this._rootSerializer != null;
    }

    public boolean isEnabled(Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectWriter with(Base64Variant base64Variant) {
        SerializationConfig with = this._config.with(base64Variant);
        return with == this._config ? this : new ObjectWriter(this, with);
    }

    public ObjectWriter with(PrettyPrinter prettyPrinter) {
        PrettyPrinter prettyPrinter2 = prettyPrinter;
        ObjectWriter objectWriter = this;
        if (prettyPrinter == this._prettyPrinter) {
            return this;
        }
        if (prettyPrinter == null) {
            prettyPrinter2 = NULL_PRETTY_PRINTER;
        }
        return new ObjectWriter(objectWriter, this._config, this._rootType, this._rootSerializer, prettyPrinter2, this._schema);
    }

    public ObjectWriter with(SerializationFeature serializationFeature) {
        SerializationConfig with = this._config.with(serializationFeature);
        return with == this._config ? this : new ObjectWriter(this, with);
    }

    public ObjectWriter with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        SerializationConfig with = this._config.with(serializationFeature, serializationFeatureArr);
        return with == this._config ? this : new ObjectWriter(this, with);
    }

    public ObjectWriter with(FilterProvider filterProvider) {
        if (filterProvider == this._config.getFilterProvider()) {
            return this;
        }
        return new ObjectWriter(this, this._config.withFilters(filterProvider));
    }

    public ObjectWriter with(DateFormat dateFormat) {
        SerializationConfig with = this._config.with(dateFormat);
        return with == this._config ? this : new ObjectWriter(this, with);
    }

    public ObjectWriter with(Locale locale) {
        SerializationConfig with = this._config.with(locale);
        return with == this._config ? this : new ObjectWriter(this, with);
    }

    public ObjectWriter with(TimeZone timeZone) {
        SerializationConfig with = this._config.with(timeZone);
        return with == this._config ? this : new ObjectWriter(this, with);
    }

    public ObjectWriter withDefaultPrettyPrinter() {
        return with(new DefaultPrettyPrinter());
    }

    public ObjectWriter withFeatures(SerializationFeature... serializationFeatureArr) {
        SerializationConfig withFeatures = this._config.withFeatures(serializationFeatureArr);
        return withFeatures == this._config ? this : new ObjectWriter(this, withFeatures);
    }

    public ObjectWriter withRootName(String str) {
        SerializationConfig withRootName = this._config.withRootName(str);
        return withRootName == this._config ? this : new ObjectWriter(this, withRootName);
    }

    public ObjectWriter withSchema(FormatSchema formatSchema) {
        ObjectWriter objectWriter = this;
        if (this._schema == formatSchema) {
            return this;
        }
        _verifySchemaType(formatSchema);
        return new ObjectWriter(objectWriter, this._config, this._rootType, this._rootSerializer, this._prettyPrinter, formatSchema);
    }

    public ObjectWriter withType(TypeReference typeReference) {
        return withType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    public ObjectWriter withType(JavaType javaType) {
        JavaType withStaticTyping = javaType.withStaticTyping();
        return new ObjectWriter(this, this._config, withStaticTyping, _prefetchRootSerializer(this._config, withStaticTyping), this._prettyPrinter, this._schema);
    }

    public ObjectWriter withType(Class cls) {
        return withType(this._config.constructType(cls));
    }

    public ObjectWriter withView(Class cls) {
        SerializationConfig withView = this._config.withView(cls);
        return withView == this._config ? this : new ObjectWriter(this, withView);
    }

    public ObjectWriter without(SerializationFeature serializationFeature) {
        SerializationConfig without = this._config.without(serializationFeature);
        return without == this._config ? this : new ObjectWriter(this, without);
    }

    public ObjectWriter without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        SerializationConfig without = this._config.without(serializationFeature, serializationFeatureArr);
        return without == this._config ? this : new ObjectWriter(this, without);
    }

    public ObjectWriter withoutFeatures(SerializationFeature... serializationFeatureArr) {
        SerializationConfig withoutFeatures = this._config.withoutFeatures(serializationFeatureArr);
        return withoutFeatures == this._config ? this : new ObjectWriter(this, withoutFeatures);
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        _configureJsonGenerator(jsonGenerator);
        if (this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, this._config);
            return;
        }
        if (this._rootType == null) {
            _serializerProvider(this._config).serializeValue(jsonGenerator, obj);
        } else {
            _serializerProvider(this._config).serializeValue(jsonGenerator, obj, this._rootType, this._rootSerializer);
        }
        if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
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
}

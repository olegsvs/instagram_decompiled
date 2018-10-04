package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectReader extends ObjectCodec implements Versioned, Serializable {
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    private static final long serialVersionUID = -4251443320039569153L;
    public final DeserializationConfig _config;
    public final DefaultDeserializationContext _context;
    public final DataFormatReaders _dataFormatReaders;
    public final InjectableValues _injectableValues;
    public final JsonFactory _jsonFactory;
    public final JsonDeserializer _rootDeserializer;
    public final ConcurrentHashMap _rootDeserializers;
    public final RootNameLookup _rootNames;
    public final FormatSchema _schema;
    public final boolean _unwrapRoot;
    public final Object _valueToUpdate;
    public final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._jsonFactory = objectMapper._jsonFactory;
        this._rootNames = objectMapper._rootNames;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        if (obj != null) {
            if (javaType.isArrayType()) {
                throw new IllegalArgumentException("Can not update an array value");
            }
        }
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(deserializationConfig, javaType);
        this._dataFormatReaders = null;
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._jsonFactory = jsonFactory;
        this._rootNames = objectReader._rootNames;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._jsonFactory = objectReader._jsonFactory;
        this._rootNames = objectReader._rootNames;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._jsonFactory = objectReader._jsonFactory;
        this._rootNames = objectReader._rootNames;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        if (obj != null) {
            if (javaType.isArrayType()) {
                throw new IllegalArgumentException("Can not update an array value");
            }
        }
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = dataFormatReaders;
    }

    public Object _bind(JsonParser jsonParser, Object obj) {
        JsonToken _initForReading = _initForReading(jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(createDeserializationContext(jsonParser, this._config), this._valueType).getNullValue();
            }
        } else if (_initForReading != JsonToken.END_ARRAY) {
            if (_initForReading != JsonToken.END_OBJECT) {
                DeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, this._config);
                JsonDeserializer _findRootDeserializer = _findRootDeserializer(createDeserializationContext, this._valueType);
                if (this._unwrapRoot) {
                    obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext, this._valueType, _findRootDeserializer);
                } else if (obj == null) {
                    obj = _findRootDeserializer.deserialize(jsonParser, createDeserializationContext);
                } else {
                    _findRootDeserializer.deserialize(jsonParser, createDeserializationContext, obj);
                }
            }
        }
        jsonParser.clearCurrentToken();
        return obj;
    }

    public java.lang.Object _bindAndClose(com.fasterxml.jackson.core.JsonParser r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3._schema;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r4.setSchema(r0);
    L_0x0007:
        r1 = _initForReading(r4);	 Catch:{ all -> 0x0050 }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;	 Catch:{ all -> 0x0050 }
        if (r1 != r0) goto L_0x0022;	 Catch:{ all -> 0x0050 }
    L_0x000f:
        if (r5 != 0) goto L_0x004c;	 Catch:{ all -> 0x0050 }
    L_0x0011:
        r0 = r3._config;	 Catch:{ all -> 0x0050 }
        r1 = r3.createDeserializationContext(r4, r0);	 Catch:{ all -> 0x0050 }
        r0 = r3._valueType;	 Catch:{ all -> 0x0050 }
        r0 = r3._findRootDeserializer(r1, r0);	 Catch:{ all -> 0x0050 }
        r5 = r0.getNullValue();	 Catch:{ all -> 0x0050 }
        goto L_0x004c;	 Catch:{ all -> 0x0050 }
    L_0x0022:
        r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;	 Catch:{ all -> 0x0050 }
        if (r1 == r0) goto L_0x004c;	 Catch:{ all -> 0x0050 }
    L_0x0026:
        r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;	 Catch:{ all -> 0x0050 }
        if (r1 != r0) goto L_0x002b;	 Catch:{ all -> 0x0050 }
    L_0x002a:
        goto L_0x004c;	 Catch:{ all -> 0x0050 }
    L_0x002b:
        r0 = r3._config;	 Catch:{ all -> 0x0050 }
        r2 = r3.createDeserializationContext(r4, r0);	 Catch:{ all -> 0x0050 }
        r0 = r3._valueType;	 Catch:{ all -> 0x0050 }
        r1 = r3._findRootDeserializer(r2, r0);	 Catch:{ all -> 0x0050 }
        r0 = r3._unwrapRoot;	 Catch:{ all -> 0x0050 }
        if (r0 == 0) goto L_0x0042;	 Catch:{ all -> 0x0050 }
    L_0x003b:
        r0 = r3._valueType;	 Catch:{ all -> 0x0050 }
        r5 = r3._unwrapAndDeserialize(r4, r2, r0, r1);	 Catch:{ all -> 0x0050 }
        goto L_0x004c;	 Catch:{ all -> 0x0050 }
    L_0x0042:
        if (r5 != 0) goto L_0x0049;	 Catch:{ all -> 0x0050 }
    L_0x0044:
        r5 = r1.deserialize(r4, r2);	 Catch:{ all -> 0x0050 }
        goto L_0x004c;	 Catch:{ all -> 0x0050 }
    L_0x0049:
        r1.deserialize(r4, r2, r5);	 Catch:{ all -> 0x0050 }
    L_0x004c:
        r4.close();	 Catch:{ IOException -> 0x004f }
    L_0x004f:
        return r5;
    L_0x0050:
        r0 = move-exception;
        r4.close();	 Catch:{ IOException -> 0x0054 }
    L_0x0054:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndClose(com.fasterxml.jackson.core.JsonParser, java.lang.Object):java.lang.Object");
    }

    public com.fasterxml.jackson.databind.JsonNode _bindAndCloseAsTree(com.fasterxml.jackson.core.JsonParser r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1._schema;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r2.setSchema(r0);
    L_0x0007:
        r0 = r1._bindAsTree(r2);	 Catch:{ all -> 0x000f }
        r2.close();	 Catch:{ IOException -> 0x000e }
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = move-exception;
        r2.close();	 Catch:{ IOException -> 0x0013 }
    L_0x0013:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndCloseAsTree(com.fasterxml.jackson.core.JsonParser):com.fasterxml.jackson.databind.JsonNode");
    }

    public MappingIterator _bindAndReadValues(JsonParser jsonParser, Object obj) {
        FormatSchema formatSchema = this._schema;
        JsonParser jsonParser2 = jsonParser;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        jsonParser.nextToken();
        DeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, this._config);
        JavaType javaType = this._valueType;
        return new MappingIterator(javaType, jsonParser2, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), true, this._valueToUpdate);
    }

    public JsonNode _bindAsTree(JsonParser jsonParser) {
        JsonNode jsonNode;
        JsonToken _initForReading = _initForReading(jsonParser);
        if (!(_initForReading == JsonToken.VALUE_NULL || _initForReading == JsonToken.END_ARRAY)) {
            if (_initForReading != JsonToken.END_OBJECT) {
                DeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, this._config);
                JsonDeserializer _findRootDeserializer = _findRootDeserializer(createDeserializationContext, JSON_NODE_TYPE);
                if (this._unwrapRoot) {
                    jsonNode = (JsonNode) _unwrapAndDeserialize(jsonParser, createDeserializationContext, JSON_NODE_TYPE, _findRootDeserializer);
                } else {
                    jsonNode = (JsonNode) _findRootDeserializer.deserialize(jsonParser, createDeserializationContext);
                }
                jsonParser.clearCurrentToken();
                return jsonNode;
            }
        }
        jsonNode = NullNode.instance;
        jsonParser.clearCurrentToken();
        return jsonNode;
    }

    public Object _detectBindAndClose(Match match, boolean z) {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser createParserWithMatch = match.createParserWithMatch();
        if (z) {
            createParserWithMatch.enable(Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndClose(createParserWithMatch, this._valueToUpdate);
    }

    public Object _detectBindAndClose(byte[] bArr, int i, int i2) {
        Match findFormat = this._dataFormatReaders.findFormat(bArr, i, i2);
        if (!findFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, findFormat);
        }
        return findFormat.getReader()._bindAndClose(findFormat.createParserWithMatch(), this._valueToUpdate);
    }

    public JsonNode _detectBindAndCloseAsTree(InputStream inputStream) {
        inputStream = this._dataFormatReaders.findFormat(inputStream);
        if (!inputStream.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, inputStream);
        }
        JsonParser createParserWithMatch = inputStream.createParserWithMatch();
        createParserWithMatch.enable(Feature.AUTO_CLOSE_SOURCE);
        return inputStream.getReader()._bindAndCloseAsTree(createParserWithMatch);
    }

    public MappingIterator _detectBindAndReadValues(Match match, boolean z) {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser createParserWithMatch = match.createParserWithMatch();
        if (z) {
            createParserWithMatch.enable(Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndReadValues(createParserWithMatch, this._valueToUpdate);
    }

    public JsonDeserializer _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        JsonDeserializer jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer == null) {
            if (javaType != null) {
                jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(javaType);
                if (jsonDeserializer == null) {
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
            } else {
                throw new JsonMappingException("No value type configured for ObjectReader");
            }
        }
        return jsonDeserializer;
    }

    public static JsonToken _initForReading(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                throw JsonMappingException.from(jsonParser, "No content to map due to end-of-input");
            }
        }
        return currentToken;
    }

    public InputStream _inputStream(File file) {
        return new FileInputStream(file);
    }

    public InputStream _inputStream(URL url) {
        return url.openStream();
    }

    public com.fasterxml.jackson.databind.JsonDeserializer _prefetchRootDeserializer(com.fasterxml.jackson.databind.DeserializationConfig r4, com.fasterxml.jackson.databind.JavaType r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = 0;
        if (r5 == 0) goto L_0x002c;
    L_0x0003:
        r1 = r3._config;
        r0 = com.fasterxml.jackson.databind.DeserializationFeature.EAGER_DESERIALIZER_FETCH;
        r0 = r1.isEnabled(r0);
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x002c;
    L_0x000e:
        r0 = r3._rootDeserializers;
        r1 = r0.get(r5);
        r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1;
        if (r1 != 0) goto L_0x002d;
    L_0x0018:
        r0 = r3._config;	 Catch:{ JsonProcessingException -> 0x002d }
        r0 = r3.createDeserializationContext(r2, r0);	 Catch:{ JsonProcessingException -> 0x002d }
        r2 = r0.findRootValueDeserializer(r5);	 Catch:{ JsonProcessingException -> 0x002d }
        if (r2 == 0) goto L_0x002c;	 Catch:{ JsonProcessingException -> 0x002d }
    L_0x0024:
        r0 = r3._rootDeserializers;	 Catch:{ JsonProcessingException -> 0x002a }
        r0.put(r5, r2);	 Catch:{ JsonProcessingException -> 0x002a }
        goto L_0x002c;	 Catch:{ JsonProcessingException -> 0x002a }
    L_0x002a:
        r1 = r2;
        goto L_0x002d;
    L_0x002c:
        return r2;
    L_0x002d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._prefetchRootDeserializer(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public void _reportUndetectableSource(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not use source of type ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(" with format auto-detection: must be byte- not char-based");
        throw new JsonParseException(stringBuilder.toString(), JsonLocation.NA);
    }

    public void _reportUnkownFormat(DataFormatReaders dataFormatReaders, Match match) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not detect format from input, does not look like any of detectable formats ");
        stringBuilder.append(dataFormatReaders.toString());
        throw new JsonParseException(stringBuilder.toString(), JsonLocation.NA);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer jsonDeserializer) {
        String rootName = this._config.getRootName();
        if (rootName == null) {
            rootName = this._rootNames.findRootName(javaType, this._config).getValue();
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
                Object deserialize;
                jsonParser.nextToken();
                Object obj = this._valueToUpdate;
                if (obj == null) {
                    deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                    deserialize = this._valueToUpdate;
                }
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

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        if (this._dataFormatReaders != null) {
            return new ObjectReader(this, deserializationConfig).withFormatDetection(this._dataFormatReaders.with(deserializationConfig));
        }
        return new ObjectReader(this, deserializationConfig);
    }

    public JsonNode createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._context.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public JsonNode createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public DeserializationConfig getConfig() {
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

    public boolean isEnabled(Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public TreeNode readTree(JsonParser jsonParser) {
        return _bindAsTree(jsonParser);
    }

    public JsonNode readTree(InputStream inputStream) {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(this._jsonFactory.createParser(inputStream));
    }

    public JsonNode readTree(Reader reader) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(this._jsonFactory.createParser(reader));
    }

    public JsonNode readTree(String str) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        return _bindAndCloseAsTree(this._jsonFactory.createParser(str));
    }

    public Object readValue(JsonParser jsonParser) {
        return _bind(jsonParser, this._valueToUpdate);
    }

    public Object readValue(JsonParser jsonParser, ResolvedType resolvedType) {
        return withType((JavaType) resolvedType).readValue(jsonParser);
    }

    public Object readValue(JsonParser jsonParser, TypeReference typeReference) {
        return withType(typeReference).readValue(jsonParser);
    }

    public Object readValue(JsonParser jsonParser, JavaType javaType) {
        return withType(javaType).readValue(jsonParser);
    }

    public Object readValue(JsonParser jsonParser, Class cls) {
        return withType(cls).readValue(jsonParser);
    }

    public Object readValue(JsonNode jsonNode) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(jsonNode);
        }
        return _bindAndClose(treeAsTokens(jsonNode), this._valueToUpdate);
    }

    public Object readValue(File file) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(file)), true);
        }
        return _bindAndClose(this._jsonFactory.createParser(file), this._valueToUpdate);
    }

    public Object readValue(InputStream inputStream) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndClose(dataFormatReaders.findFormat(inputStream), false);
        }
        return _bindAndClose(this._jsonFactory.createParser(inputStream), this._valueToUpdate);
    }

    public Object readValue(Reader reader) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndClose(this._jsonFactory.createParser(reader), this._valueToUpdate);
    }

    public Object readValue(String str) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        return _bindAndClose(this._jsonFactory.createParser(str), this._valueToUpdate);
    }

    public Object readValue(URL url) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return _bindAndClose(this._jsonFactory.createParser(url), this._valueToUpdate);
    }

    public Object readValue(byte[] bArr) {
        if (this._dataFormatReaders != null) {
            return _detectBindAndClose(bArr, 0, bArr.length);
        }
        return _bindAndClose(this._jsonFactory.createParser(bArr), this._valueToUpdate);
    }

    public Object readValue(byte[] bArr, int i, int i2) {
        if (this._dataFormatReaders != null) {
            return _detectBindAndClose(bArr, i, i2);
        }
        return _bindAndClose(this._jsonFactory.createParser(bArr, i, i2), this._valueToUpdate);
    }

    public MappingIterator readValues(JsonParser jsonParser) {
        JsonParser jsonParser2 = jsonParser;
        DeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, this._config);
        JavaType javaType = this._valueType;
        return new MappingIterator(javaType, jsonParser2, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), false, this._valueToUpdate);
    }

    public MappingIterator readValues(File file) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(file)), false);
        }
        return _bindAndReadValues(this._jsonFactory.createParser(file), this._valueToUpdate);
    }

    public MappingIterator readValues(InputStream inputStream) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(inputStream), false);
        }
        return _bindAndReadValues(this._jsonFactory.createParser(inputStream), this._valueToUpdate);
    }

    public MappingIterator readValues(Reader reader) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser createParser = this._jsonFactory.createParser(reader);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            createParser.setSchema(formatSchema);
        }
        createParser.nextToken();
        DeserializationContext createDeserializationContext = createDeserializationContext(createParser, this._config);
        JavaType javaType = this._valueType;
        return new MappingIterator(javaType, createParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), true, this._valueToUpdate);
    }

    public MappingIterator readValues(String str) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser createParser = this._jsonFactory.createParser(str);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            createParser.setSchema(formatSchema);
        }
        createParser.nextToken();
        DeserializationContext createDeserializationContext = createDeserializationContext(createParser, this._config);
        JavaType javaType = this._valueType;
        return new MappingIterator(javaType, createParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), true, this._valueToUpdate);
    }

    public MappingIterator readValues(URL url) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return _bindAndReadValues(this._jsonFactory.createParser(url), this._valueToUpdate);
    }

    public final MappingIterator readValues(byte[] bArr) {
        return readValues(bArr, 0, bArr.length);
    }

    public MappingIterator readValues(byte[] bArr, int i, int i2) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(bArr, i, i2), false);
        }
        return _bindAndReadValues(this._jsonFactory.createParser(bArr), this._valueToUpdate);
    }

    public Iterator readValues(JsonParser jsonParser, ResolvedType resolvedType) {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public Iterator readValues(JsonParser jsonParser, TypeReference typeReference) {
        return withType(typeReference).readValues(jsonParser);
    }

    public Iterator readValues(JsonParser jsonParser, JavaType javaType) {
        return withType(javaType).readValues(jsonParser);
    }

    public Iterator readValues(JsonParser jsonParser, Class cls) {
        return withType(cls).readValues(jsonParser);
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    public Object treeToValue(TreeNode treeNode, Class cls) {
        try {
            return readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (TreeNode treeNode2) {
            throw new IllegalArgumentException(treeNode2.getMessage(), treeNode2);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with(this._config.with(base64Variant));
    }

    public ObjectReader with(FormatSchema formatSchema) {
        ObjectReader objectReader = this;
        FormatSchema formatSchema2 = formatSchema;
        if (this._schema == formatSchema) {
            return this;
        }
        _verifySchemaType(formatSchema);
        return new ObjectReader(objectReader, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, formatSchema2, this._injectableValues, objectReader._dataFormatReaders);
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._jsonFactory) {
            return this;
        }
        ObjectCodec objectReader = new ObjectReader(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(objectReader);
        }
        return objectReader;
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader with(InjectableValues injectableValues) {
        ObjectReader objectReader = this;
        InjectableValues injectableValues2 = this._injectableValues;
        InjectableValues injectableValues3 = injectableValues;
        if (injectableValues2 == injectableValues) {
            return objectReader;
        }
        return new ObjectReader(objectReader, objectReader._config, objectReader._valueType, objectReader._rootDeserializer, objectReader._valueToUpdate, objectReader._schema, injectableValues3, objectReader._dataFormatReaders);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public ObjectReader with(Locale locale) {
        return _with(this._config.with(locale));
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with(this._config.with(timeZone));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataFormatReaders) {
        return new ObjectReader(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new DataFormatReaders(objectReaderArr));
    }

    public ObjectReader withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return _with(this._config.withHandler(deserializationProblemHandler));
    }

    public ObjectReader withRootName(String str) {
        return _with(this._config.withRootName(str));
    }

    public ObjectReader withType(TypeReference typeReference) {
        return withType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    public ObjectReader withType(JavaType javaType) {
        ObjectReader objectReader = this;
        JavaType javaType2 = javaType;
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        JsonDeserializer _prefetchRootDeserializer = _prefetchRootDeserializer(this._config, javaType);
        javaType = this._dataFormatReaders;
        if (javaType != null) {
            javaType = javaType.withType(javaType2);
        }
        return new ObjectReader(objectReader, this._config, javaType2, _prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, javaType);
    }

    public ObjectReader withType(Class cls) {
        return withType(this._config.constructType(cls));
    }

    public ObjectReader withType(Type type) {
        return withType(this._config.getTypeFactory().constructType(type));
    }

    public ObjectReader withValueToUpdate(Object obj) {
        ObjectReader objectReader = this;
        Object obj2 = obj;
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj != null) {
            JavaType javaType = this._valueType;
            if (javaType == null) {
                javaType = this._config.constructType(obj.getClass());
            }
            return new ObjectReader(objectReader, this._config, javaType, this._rootDeserializer, obj2, this._schema, this._injectableValues, objectReader._dataFormatReaders);
        }
        throw new IllegalArgumentException("cat not update null value");
    }

    public ObjectReader withView(Class cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }
}

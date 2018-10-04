package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.HashSet;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    public final AnnotatedMethod _buildMethod;

    public BuilderBasedDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map map, HashSet hashSet, boolean z, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z, z2);
        this._buildMethod = beanDeserializerBuilder.getBuildMethod();
        if (this._objectIdReader != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not use Object Id with Builder-based deserialization (type ");
            stringBuilder.append(beanDescription.getType());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        this(builderBasedDeserializer, builderBasedDeserializer._ignoreAllUnknown);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super((BeanDeserializerBase) builderBasedDeserializer, objectIdReader);
        this._buildMethod = builderBasedDeserializer._buildMethod;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super((BeanDeserializerBase) builderBasedDeserializer, nameTransformer);
        this._buildMethod = builderBasedDeserializer._buildMethod;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, HashSet hashSet) {
        super((BeanDeserializerBase) builderBasedDeserializer, hashSet);
        this._buildMethod = builderBasedDeserializer._buildMethod;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, boolean z) {
        super((BeanDeserializerBase) builderBasedDeserializer, z);
        this._buildMethod = builderBasedDeserializer._buildMethod;
    }

    public final java.lang.Object _deserialize(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2._injectables;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r2.injectValues(r4, r5);
    L_0x0007:
        r0 = r2._unwrappedPropertyHandler;
        if (r0 == 0) goto L_0x0010;
    L_0x000b:
        r0 = r2.deserializeWithUnwrapped(r3, r4, r5);
        return r0;
    L_0x0010:
        r0 = r2._externalTypeIdHandler;
        if (r0 == 0) goto L_0x0019;
    L_0x0014:
        r0 = r2.deserializeWithExternalTypeId(r3, r4, r5);
        return r0;
    L_0x0019:
        r0 = r2._needViewProcesing;
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r0 = r4.getActiveView();
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r0 = r2.deserializeWithView(r3, r4, r5, r0);
        return r0;
    L_0x0028:
        r1 = r3.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 != r0) goto L_0x0034;
    L_0x0030:
        r1 = r3.nextToken();
    L_0x0034:
        r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (r1 != r0) goto L_0x006f;
    L_0x0038:
        r1 = r3.getCurrentName();
        r3.nextToken();
        r0 = r2._beanProperties;
        r0 = r0.find(r1);
        if (r0 == 0) goto L_0x0051;
    L_0x0047:
        r5 = r0.deserializeSetAndReturn(r3, r4, r5);	 Catch:{ Exception -> 0x004c }
        goto L_0x0030;	 Catch:{ Exception -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        r2.wrapAndThrow(r0, r5, r1, r4);
        goto L_0x0030;
    L_0x0051:
        r0 = r2._ignorableProps;
        if (r0 == 0) goto L_0x0061;
    L_0x0055:
        r0 = r2._ignorableProps;
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0061;
    L_0x005d:
        r3.skipChildren();
        goto L_0x0030;
    L_0x0061:
        r0 = r2._anySetter;
        if (r0 == 0) goto L_0x006b;
    L_0x0065:
        r0 = r2._anySetter;
        r0.deserializeAndSet(r3, r4, r5, r1);
        goto L_0x0030;
    L_0x006b:
        r2.handleUnknownProperty(r3, r4, r5, r1);
        goto L_0x0030;
    L_0x006f:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object build;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        JsonToken currentToken = jsonParser.getCurrentToken();
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (startBuilding.assignParameter(findCreatorProperty.getCreatorIndex(), findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        build = propertyBasedCreator.build(deserializationContext, startBuilding);
                        if (build.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, build, tokenBuffer);
                        }
                        if (tokenBuffer != null) {
                            build = handleUnknownProperties(deserializationContext, build, tokenBuffer);
                        }
                        return _deserialize(jsonParser, deserializationContext, build);
                    } catch (Throwable e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), currentName, deserializationContext);
                    }
                } else {
                    continue;
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, find.deserialize(jsonParser, deserializationContext));
                } else if (this._ignorableProps != null && this._ignorableProps.contains(currentName)) {
                    jsonParser.skipChildren();
                } else if (this._anySetter != null) {
                    startBuilding.bufferAnyProperty(this._anySetter, currentName, this._anySetter.deserialize(jsonParser, deserializationContext));
                } else {
                    if (tokenBuffer == null) {
                        tokenBuffer = new TokenBuffer(jsonParser.getCodec());
                    }
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            build = propertyBasedCreator.build(deserializationContext, startBuilding);
            if (tokenBuffer == null) {
                return build;
            }
            if (build.getClass() != this._beanType.getRawClass()) {
                return handlePolymorphic(null, deserializationContext, build, tokenBuffer);
            }
            return handleUnknownProperties(deserializationContext, build, tokenBuffer);
        } catch (Throwable e2) {
            wrapInstantiationProblem(e2, deserializationContext);
            return null;
        }
    }

    public BeanAsArrayBuilderDeserializer asArrayDeserializer() {
        return new BeanAsArrayBuilderDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            JsonToken nextToken = jsonParser.nextToken();
            if (this._vanillaProcessing) {
                return finishBuild(deserializationContext, vanillaDeserialize(jsonParser, deserializationContext, nextToken));
            }
        }
        switch (BuilderBasedDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()]) {
            case 1:
                return finishBuild(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 2:
                return finishBuild(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 3:
                return finishBuild(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 4:
                return jsonParser.getEmbeddedObject();
            case 5:
            case 6:
                return finishBuild(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return finishBuild(deserializationContext, deserializeFromArray(jsonParser, deserializationContext));
            case 8:
            case 9:
                break;
            default:
                throw deserializationContext.mappingException(getBeanClass());
        }
        return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return finishBuild(deserializationContext, _deserialize(jsonParser, deserializationContext, obj));
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!this._nonStandardCreation) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault);
            }
            if (this._needViewProcesing) {
                Class activeView = deserializationContext.getActiveView();
                if (activeView != null) {
                    return deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
                }
            }
            while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Throwable e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                    }
                } else if (this._ignorableProps != null && this._ignorableProps.contains(currentName)) {
                    jsonParser.skipChildren();
                } else if (this._anySetter != null) {
                    try {
                        this._anySetter.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault, currentName);
                    } catch (Throwable e2) {
                        wrapAndThrow(e2, createUsingDefault, currentName, deserializationContext);
                    }
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                jsonParser.nextToken();
            }
            return createUsingDefault;
        } else if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext);
        } else {
            if (this._externalTypeIdHandler != null) {
                return deserializeWithExternalTypeId(jsonParser, deserializationContext);
            }
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        throw new IllegalStateException("Deserialization with Builder, External type id, @JsonCreator not yet implemented");
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (startBuilding.assignParameter(findCreatorProperty.getCreatorIndex(), findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    currentToken = jsonParser.nextToken();
                    try {
                        startBuilding = propertyBasedCreator.build(deserializationContext, startBuilding);
                        while (currentToken == JsonToken.FIELD_NAME) {
                            jsonParser.nextToken();
                            tokenBuffer.copyCurrentStructure(jsonParser);
                            currentToken = jsonParser.nextToken();
                        }
                        tokenBuffer.writeEndObject();
                        if (startBuilding.getClass() == this._beanType.getRawClass()) {
                            return this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, startBuilding, tokenBuffer);
                        }
                        throw deserializationContext.mappingException("Can not create polymorphic instances with unwrapped values");
                    } catch (Throwable e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), currentName, deserializationContext);
                    }
                } else {
                    continue;
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, find.deserialize(jsonParser, deserializationContext));
                } else if (this._ignorableProps == null || !this._ignorableProps.contains(currentName)) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                    if (this._anySetter != null) {
                        startBuilding.bufferAnyProperty(this._anySetter, currentName, this._anySetter.deserialize(jsonParser, deserializationContext));
                    }
                } else {
                    jsonParser.skipChildren();
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            return this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, propertyBasedCreator.build(deserializationContext, startBuilding), tokenBuffer);
        } catch (Throwable e2) {
            wrapInstantiationProblem(e2, deserializationContext);
            return null;
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        return deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Throwable e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                    }
                    jsonParser.nextToken();
                }
            } else if (this._ignorableProps == null || !this._ignorableProps.contains(currentName)) {
                if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, obj)) {
                    if (this._anySetter != null) {
                        try {
                            this._anySetter.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                        } catch (Throwable e2) {
                            wrapAndThrow(e2, obj, currentName, deserializationContext);
                        }
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                    }
                }
                jsonParser.nextToken();
            }
            jsonParser.skipChildren();
            jsonParser.nextToken();
        }
        return start.complete(jsonParser, deserializationContext, obj);
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.writeStartObject();
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Throwable e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                    }
                    jsonParser.nextToken();
                }
            } else if (this._ignorableProps == null || !this._ignorableProps.contains(currentName)) {
                tokenBuffer.writeFieldName(currentName);
                tokenBuffer.copyCurrentStructure(jsonParser);
                if (this._anySetter != null) {
                    try {
                        this._anySetter.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault, currentName);
                    } catch (Throwable e2) {
                        wrapAndThrow(e2, createUsingDefault, currentName, deserializationContext);
                    }
                }
                jsonParser.nextToken();
            }
            jsonParser.skipChildren();
            jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, createUsingDefault, tokenBuffer);
        return createUsingDefault;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.writeStartObject();
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Throwable e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                    }
                    currentToken = jsonParser.nextToken();
                }
            } else if (this._ignorableProps == null || !this._ignorableProps.contains(currentName)) {
                tokenBuffer.writeFieldName(currentName);
                tokenBuffer.copyCurrentStructure(jsonParser);
                if (this._anySetter != null) {
                    this._anySetter.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                }
                currentToken = jsonParser.nextToken();
            }
            jsonParser.skipChildren();
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, obj, tokenBuffer);
        return obj;
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class cls) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                if (find.visibleInView(cls)) {
                    try {
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Throwable e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                    }
                    currentToken = jsonParser.nextToken();
                }
            } else if (this._ignorableProps == null || !this._ignorableProps.contains(currentName)) {
                if (this._anySetter != null) {
                    this._anySetter.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                }
                currentToken = jsonParser.nextToken();
            }
            jsonParser.skipChildren();
            currentToken = jsonParser.nextToken();
        }
        return obj;
    }

    public final Object finishBuild(DeserializationContext deserializationContext, Object obj) {
        try {
            return this._buildMethod.getMember().invoke(obj, new Object[0]);
        } catch (Throwable e) {
            wrapInstantiationProblem(e, deserializationContext);
            return null;
        }
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                try {
                    createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                } catch (Throwable e) {
                    wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
            }
            jsonParser.nextToken();
        }
        return createUsingDefault;
    }

    public BuilderBasedDeserializer withIgnorableProperties(HashSet hashSet) {
        return new BuilderBasedDeserializer(this, hashSet);
    }

    public BuilderBasedDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }
}

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, HashSet hashSet) {
        super(beanDeserializerBase, hashSet);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    public BeanDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map map, HashSet hashSet, boolean z, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z, z2);
    }

    private final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        if (jsonToken == null) {
            return _missingToken(jsonParser, deserializationContext);
        }
        switch (BeanDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
            case 1:
                return deserializeFromString(jsonParser, deserializationContext);
            case 2:
                return deserializeFromNumber(jsonParser, deserializationContext);
            case 3:
                return deserializeFromDouble(jsonParser, deserializationContext);
            case 4:
                return jsonParser.getEmbeddedObject();
            case 5:
            case 6:
                return deserializeFromBoolean(jsonParser, deserializationContext);
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return deserializeFromArray(jsonParser, deserializationContext);
            case 8:
            case 9:
                if (this._vanillaProcessing) {
                    return vanillaDeserialize(jsonParser, deserializationContext, jsonToken);
                }
                if (this._objectIdReader != null) {
                    return deserializeWithObjectId(jsonParser, deserializationContext);
                }
                return deserializeFromObject(jsonParser, deserializationContext);
            default:
                throw deserializationContext.mappingException(getBeanClass());
        }
    }

    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object build;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        JsonToken currentToken = jsonParser.getCurrentToken();
        Object obj = null;
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (startBuilding.assignParameter(findCreatorProperty.getCreatorIndex(), findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        obj = propertyBasedCreator.build(deserializationContext, startBuilding);
                    } catch (Throwable e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), currentName, deserializationContext);
                    }
                    if (obj.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, obj, tokenBuffer);
                    }
                    if (tokenBuffer != null) {
                        obj = handleUnknownProperties(deserializationContext, obj, tokenBuffer);
                    }
                    return deserialize(jsonParser, deserializationContext, obj);
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
        } catch (Throwable e2) {
            wrapInstantiationProblem(e2, deserializationContext);
            build = null;
        }
        if (tokenBuffer == null) {
            return build;
        }
        if (build.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic(null, deserializationContext, build, tokenBuffer);
        }
        return handleUnknownProperties(deserializationContext, build, tokenBuffer);
    }

    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) {
        throw deserializationContext.endOfInputException(getBeanClass());
    }

    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT) {
            return _deserializeOther(jsonParser, deserializationContext, currentToken);
        }
        if (this._vanillaProcessing) {
            return vanillaDeserialize(jsonParser, deserializationContext, jsonParser.nextToken());
        }
        jsonParser.nextToken();
        if (this._objectIdReader != null) {
            return deserializeWithObjectId(jsonParser, deserializationContext);
        }
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        if (this._needViewProcesing) {
            Class activeView = deserializationContext.getActiveView();
            if (activeView != null) {
                return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
            }
        }
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Throwable e) {
                    wrapAndThrow(e, obj, currentName, deserializationContext);
                }
            } else if (this._ignorableProps != null && this._ignorableProps.contains(currentName)) {
                jsonParser.skipChildren();
            } else if (this._anySetter != null) {
                this._anySetter.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
            } else {
                handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
            }
            currentToken = jsonParser.nextToken();
        }
        return obj;
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
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
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
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
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
                if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, startBuilding)) {
                    if (startBuilding.assignParameter(findCreatorProperty.getCreatorIndex(), findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        currentToken = jsonParser.nextToken();
                        try {
                            startBuilding = propertyBasedCreator.build(deserializationContext, startBuilding);
                            while (currentToken == JsonToken.FIELD_NAME) {
                                jsonParser.nextToken();
                                tokenBuffer.copyCurrentStructure(jsonParser);
                                currentToken = jsonParser.nextToken();
                            }
                            if (startBuilding.getClass() == this._beanType.getRawClass()) {
                                return start.complete(jsonParser, deserializationContext, startBuilding);
                            }
                            throw deserializationContext.mappingException("Can not create polymorphic instances with unwrapped values");
                        } catch (Throwable e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), currentName, deserializationContext);
                        }
                    } else {
                        continue;
                    }
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, find.deserialize(jsonParser, deserializationContext));
                } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, null)) {
                    if (this._ignorableProps != null && this._ignorableProps.contains(currentName)) {
                        jsonParser.skipChildren();
                    } else if (this._anySetter != null) {
                        startBuilding.bufferAnyProperty(this._anySetter, currentName, this._anySetter.deserialize(jsonParser, deserializationContext));
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            return start.complete(jsonParser, deserializationContext, startBuilding, propertyBasedCreator);
        } catch (Throwable e2) {
            wrapInstantiationProblem(e2, deserializationContext);
            return null;
        }
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
                        tokenBuffer.close();
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
                if (jsonParser.getCurrentToken().isScalarValue()) {
                    start.handleTypePropertyValue(jsonParser, deserializationContext, currentName, obj);
                }
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
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
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
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
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
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
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
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

    public JsonDeserializer unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class) {
            return this;
        }
        return new BeanDeserializer((BeanDeserializerBase) this, nameTransformer);
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
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

    public BeanDeserializer withIgnorableProperties(HashSet hashSet) {
        return new BeanDeserializer((BeanDeserializerBase) this, hashSet);
    }

    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer((BeanDeserializerBase) this, objectIdReader);
    }
}

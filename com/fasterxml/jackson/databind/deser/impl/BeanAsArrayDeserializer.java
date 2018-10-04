package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.HashSet;

public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    public final BeanDeserializerBase _delegate;
    public final SettableBeanProperty[] _orderedProperties;

    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
    }

    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not deserialize a POJO (of type ");
        stringBuilder.append(this._beanType.getRawClass().getName());
        stringBuilder.append(") from non-Array representation (token: ");
        stringBuilder.append(jsonParser.getCurrentToken());
        stringBuilder.append("): type/property designed to be serialized as JSON Array");
        throw deserializationContext.mappingException(stringBuilder.toString());
    }

    public Object _deserializeNonVanilla(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._nonStandardCreation) {
            return _deserializeWithCreator(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int i = 0;
        int length = settableBeanPropertyArr.length;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                break;
            } else if (i == length) {
                break;
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                i++;
                if (settableBeanProperty == null || !(activeView == null || settableBeanProperty.visibleInView(activeView))) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Throwable e) {
                        wrapAndThrow(e, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                }
            }
        }
        if (this._ignoreAllUnknown) {
            while (jsonParser.nextToken() != jsonToken) {
                jsonParser.skipChildren();
            }
            return createUsingDefault;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected JSON values; expected at most ");
        stringBuilder.append(length);
        stringBuilder.append(" properties (in JSON Array)");
        throw deserializationContext.mappingException(stringBuilder.toString());
    }

    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        Object obj = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.skipChildren();
            } else if (obj != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Throwable e) {
                    wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(name);
                if (findCreatorProperty != null) {
                    if (startBuilding.assignParameter(findCreatorProperty.getCreatorIndex(), findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.build(deserializationContext, startBuilding);
                            if (obj.getClass() != this._beanType.getRawClass()) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type ");
                                stringBuilder.append(this._beanType.getRawClass().getName());
                                stringBuilder.append(", actual type ");
                                stringBuilder.append(obj.getClass().getName());
                                throw deserializationContext.mappingException(stringBuilder.toString());
                            }
                        } catch (Throwable e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), name, deserializationContext);
                        }
                    } else {
                        continue;
                    }
                } else if (!startBuilding.readIdProperty(name)) {
                    startBuilding.bufferProperty(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                }
            }
            i++;
        }
        if (obj == null) {
            try {
                obj = propertyBasedCreator.build(deserializationContext, startBuilding);
            } catch (Throwable e3) {
                wrapInstantiationProblem(e3, deserializationContext);
                return null;
            }
        }
        return obj;
    }

    public Object _deserializeWithCreator(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        if (this._beanType.isAbstract()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate abstract type ");
            stringBuilder.append(this._beanType);
            stringBuilder.append(" (need to add/enable type information?)");
            throw JsonMappingException.from(jsonParser, stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No suitable constructor found for type ");
        stringBuilder.append(this._beanType);
        stringBuilder.append(": can not instantiate from JSON object (need to add/enable type information?)");
        throw JsonMappingException.from(jsonParser, stringBuilder.toString());
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() != JsonToken.START_ARRAY) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return _deserializeNonVanilla(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int i = 0;
        int length = settableBeanPropertyArr.length;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                break;
            } else if (i == length) {
                break;
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Throwable e) {
                        wrapAndThrow(e, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i++;
            }
        }
        if (this._ignoreAllUnknown) {
            while (jsonParser.nextToken() != jsonToken) {
                jsonParser.skipChildren();
            }
            return createUsingDefault;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected JSON values; expected at most ");
        stringBuilder.append(length);
        stringBuilder.append(" properties (in JSON Array)");
        throw deserializationContext.mappingException(stringBuilder.toString());
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int i = 0;
        int length = settableBeanPropertyArr.length;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                break;
            } else if (i == length) {
                break;
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Throwable e) {
                        wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i++;
            }
        }
        if (this._ignoreAllUnknown) {
            while (jsonParser.nextToken() != jsonToken) {
                jsonParser.skipChildren();
            }
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected JSON values; expected at most ");
        stringBuilder.append(length);
        stringBuilder.append(" properties (in JSON Array)");
        throw deserializationContext.mappingException(stringBuilder.toString());
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserializeFromNonArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    public BeanAsArrayDeserializer withIgnorableProperties(HashSet hashSet) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnorableProperties(hashSet), this._orderedProperties);
    }

    public BeanAsArrayDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }
}

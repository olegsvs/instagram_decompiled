package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class ThrowableDeserializer extends BeanDeserializer {
    public static final String PROP_NAME_MESSAGE = "message";
    private static final long serialVersionUID = 1;

    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super((BeanDeserializerBase) beanDeserializer, nameTransformer);
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate abstract type ");
            stringBuilder.append(this._beanType);
            stringBuilder.append(" (need to add/enable type information?)");
            throw JsonMappingException.from(jsonParser, stringBuilder.toString());
        }
        boolean canCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean canCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!canCreateFromString) {
            if (!canCreateUsingDefault) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can not deserialize Throwable of type ");
                stringBuilder.append(this._beanType);
                stringBuilder.append(" without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator");
                throw new JsonMappingException(stringBuilder.toString());
            }
        }
        Object obj = null;
        Object[] objArr = null;
        int i = 0;
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find != null) {
                if (obj != null) {
                    find.deserializeAndSet(jsonParser, deserializationContext, obj);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[(size + size)];
                    }
                    int i2 = i + 1;
                    objArr[i] = find;
                    i = i2 + 1;
                    objArr[i2] = find.deserialize(jsonParser, deserializationContext);
                }
            } else if ("message".equals(currentName) && canCreateFromString) {
                obj = this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
                if (objArr != null) {
                    for (int i3 = 0; i3 < i; i3 += 2) {
                        ((SettableBeanProperty) objArr[i3]).set(obj, objArr[i3 + 1]);
                    }
                    objArr = null;
                }
            } else if (this._ignorableProps != null && this._ignorableProps.contains(currentName)) {
                jsonParser.skipChildren();
            } else if (this._anySetter != null) {
                this._anySetter.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
            } else {
                handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
            }
            jsonParser.nextToken();
        }
        if (obj == null) {
            if (canCreateFromString) {
                obj = this._valueInstantiator.createFromString(deserializationContext, null);
            } else {
                obj = this._valueInstantiator.createUsingDefault(deserializationContext);
            }
            if (objArr != null) {
                for (int i4 = 0; i4 < i; i4 += 2) {
                    ((SettableBeanProperty) objArr[i4]).set(obj, objArr[i4 + 1]);
                }
            }
        }
        return obj;
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != ThrowableDeserializer.class) {
            return this;
        }
        return new ThrowableDeserializer(this, nameTransformer);
    }
}

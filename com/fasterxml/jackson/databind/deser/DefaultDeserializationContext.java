package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer$None;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer$None;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.LinkedHashMap;

public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    public transient LinkedHashMap _objectIds;

    public final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            super(impl, deserializationConfig, jsonParser, injectableValues);
        }

        public Impl(Impl impl, DeserializerFactory deserializerFactory) {
            super((DefaultDeserializationContext) impl, deserializerFactory);
        }

        public Impl(DeserializerFactory deserializerFactory) {
            super(deserializerFactory, null);
        }

        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            return new Impl(this, deserializationConfig, jsonParser, injectableValues);
        }

        public DefaultDeserializationContext with(DeserializerFactory deserializerFactory) {
            return new Impl(this, deserializerFactory);
        }
    }

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues);

    public abstract DefaultDeserializationContext with(DeserializerFactory deserializerFactory);

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, injectableValues);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializerFactory deserializerFactory) {
        super((DeserializationContext) defaultDeserializationContext, deserializerFactory);
    }

    public DefaultDeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        super(deserializerFactory, deserializerCache);
    }

    public JsonDeserializer deserializerInstance(Annotated annotated, Object obj) {
        JsonDeserializer jsonDeserializer = null;
        if (obj != null) {
            if (obj instanceof JsonDeserializer) {
                obj = (JsonDeserializer) obj;
            } else if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls != JsonDeserializer$None.class) {
                    if (cls != NoClass.class) {
                        if (JsonDeserializer.class.isAssignableFrom(cls)) {
                            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                            if (handlerInstantiator != null) {
                                jsonDeserializer = handlerInstantiator.deserializerInstance(this._config, annotated, cls);
                            }
                            obj = jsonDeserializer == null ? (JsonDeserializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : jsonDeserializer;
                        } else {
                            r1 = new StringBuilder();
                            r1.append("AnnotationIntrospector returned Class ");
                            r1.append(cls.getName());
                            r1.append("; expected Class<JsonDeserializer>");
                            throw new IllegalStateException(r1.toString());
                        }
                    }
                }
            } else {
                r1 = new StringBuilder();
                r1.append("AnnotationIntrospector returned deserializer definition of type ");
                r1.append(obj.getClass().getName());
                r1.append("; expected type JsonDeserializer or Class<JsonDeserializer> instead");
                throw new IllegalStateException(r1.toString());
            }
            if (obj instanceof ResolvableDeserializer) {
                ((ResolvableDeserializer) obj).resolve(this);
            }
            return obj;
        }
        return null;
    }

    public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectIdGenerator) {
        IdKey key = objectIdGenerator.key(obj);
        LinkedHashMap linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap();
        } else {
            ReadableObjectId readableObjectId = (ReadableObjectId) linkedHashMap.get(key);
            if (readableObjectId != null) {
                return readableObjectId;
            }
        }
        ReadableObjectId readableObjectId2 = new ReadableObjectId(obj);
        this._objectIds.put(key, readableObjectId2);
        return readableObjectId2;
    }

    public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) {
        KeyDeserializer keyDeserializer = null;
        if (obj != null) {
            if (obj instanceof KeyDeserializer) {
                obj = (KeyDeserializer) obj;
            } else if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls != KeyDeserializer$None.class) {
                    if (cls != NoClass.class) {
                        if (KeyDeserializer.class.isAssignableFrom(cls)) {
                            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                            if (handlerInstantiator != null) {
                                keyDeserializer = handlerInstantiator.keyDeserializerInstance(this._config, annotated, cls);
                            }
                            obj = keyDeserializer == null ? (KeyDeserializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : keyDeserializer;
                        } else {
                            r1 = new StringBuilder();
                            r1.append("AnnotationIntrospector returned Class ");
                            r1.append(cls.getName());
                            r1.append("; expected Class<KeyDeserializer>");
                            throw new IllegalStateException(r1.toString());
                        }
                    }
                }
            } else {
                r1 = new StringBuilder();
                r1.append("AnnotationIntrospector returned key deserializer definition of type ");
                r1.append(obj.getClass().getName());
                r1.append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
                throw new IllegalStateException(r1.toString());
            }
            if (obj instanceof ResolvableDeserializer) {
                ((ResolvableDeserializer) obj).resolve(this);
            }
            return obj;
        }
        return null;
    }
}

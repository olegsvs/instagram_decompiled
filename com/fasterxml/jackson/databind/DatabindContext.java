package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.Converter$None;
import java.lang.reflect.Type;

public abstract class DatabindContext {
    public abstract Class getActiveView();

    public abstract AnnotationIntrospector getAnnotationIntrospector();

    public abstract MapperConfig getConfig();

    public abstract TypeFactory getTypeFactory();

    public final boolean canOverrideAccessModifiers() {
        return getConfig().canOverrideAccessModifiers();
    }

    public JavaType constructSpecializedType(JavaType javaType, Class cls) {
        return getConfig().constructSpecializedType(javaType, cls);
    }

    public JavaType constructType(Type type) {
        return getTypeFactory().constructType(type);
    }

    public Converter converterInstance(Annotated annotated, Object obj) {
        Converter converter = null;
        if (obj != null) {
            if (obj instanceof Converter) {
                return (Converter) obj;
            }
            StringBuilder stringBuilder;
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls != Converter$None.class) {
                    if (cls != NoClass.class) {
                        if (Converter.class.isAssignableFrom(cls)) {
                            MapperConfig config = getConfig();
                            HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
                            if (handlerInstantiator != null) {
                                converter = handlerInstantiator.converterInstance(config, annotated, cls);
                            }
                            if (converter == null) {
                                converter = (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
                            }
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("AnnotationIntrospector returned Class ");
                            stringBuilder.append(cls.getName());
                            stringBuilder.append("; expected Class<Converter>");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("AnnotationIntrospector returned Converter definition of type ");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append("; expected type Converter or Class<Converter> instead");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return converter;
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return getConfig().isEnabled(mapperFeature);
    }

    public ObjectIdGenerator objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        ObjectIdGenerator objectIdGenerator;
        Class generatorType = objectIdInfo.getGeneratorType();
        MapperConfig config = getConfig();
        HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
        if (handlerInstantiator == null) {
            objectIdGenerator = null;
        } else {
            objectIdGenerator = handlerInstantiator.objectIdGeneratorInstance(config, annotated, generatorType);
        }
        if (objectIdGenerator == null) {
            objectIdGenerator = (ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers());
        }
        return objectIdGenerator.forScope(objectIdInfo.getScope());
    }
}

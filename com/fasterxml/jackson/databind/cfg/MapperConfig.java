package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class MapperConfig implements MixInResolver, Serializable {
    private static final long serialVersionUID = 8891625428805876137L;
    public final BaseSettings _base;
    public final int _mapperFeatures;

    public abstract Class getActiveView();

    public abstract SubtypeResolver getSubtypeResolver();

    public abstract BeanDescription introspectClassAnnotations(JavaType javaType);

    public abstract BeanDescription introspectDirectClassAnnotations(JavaType javaType);

    public abstract boolean useRootWrapping();

    public abstract MapperConfig with(MapperFeature... mapperFeatureArr);

    public abstract MapperConfig without(MapperFeature... mapperFeatureArr);

    public MapperConfig(BaseSettings baseSettings, int i) {
        this._base = baseSettings;
        this._mapperFeatures = i;
    }

    public MapperConfig(MapperConfig mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public static int collectFeatureDefaults(Class cls) {
        int i = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            ConfigFeature configFeature = (ConfigFeature) enumR;
            if (configFeature.enabledByDefault()) {
                i |= configFeature.getMask();
            }
        }
        return i;
    }

    public JavaType constructSpecializedType(JavaType javaType, Class cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls);
    }

    public final JavaType constructType(TypeReference typeReference) {
        return getTypeFactory().constructType(typeReference.getType(), (TypeBindings) null);
    }

    public final JavaType constructType(Class cls) {
        return getTypeFactory().constructType(cls, (TypeBindings) null);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._base.getAnnotationIntrospector();
    }

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public ClassIntrospector getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public final TypeResolverBuilder getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public VisibilityChecker getDefaultVisibilityChecker() {
        return this._base.getVisibilityChecker();
    }

    public final HandlerInstantiator getHandlerInstantiator() {
        return this._base.getHandlerInstantiator();
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public BeanDescription introspectClassAnnotations(Class cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public BeanDescription introspectDirectClassAnnotations(Class cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return (mapperFeature.getMask() & this._mapperFeatures) != 0;
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class cls) {
        HandlerInstantiator handlerInstantiator = getHandlerInstantiator();
        if (handlerInstantiator != null) {
            TypeIdResolver typeIdResolverInstance = handlerInstantiator.typeIdResolverInstance(this, annotated, cls);
            if (typeIdResolverInstance != null) {
                return typeIdResolverInstance;
            }
        }
        return (TypeIdResolver) ClassUtil.createInstance(cls, canOverrideAccessModifiers());
    }

    public TypeResolverBuilder typeResolverBuilderInstance(Annotated annotated, Class cls) {
        HandlerInstantiator handlerInstantiator = getHandlerInstantiator();
        if (handlerInstantiator != null) {
            TypeResolverBuilder typeResolverBuilderInstance = handlerInstantiator.typeResolverBuilderInstance(this, annotated, cls);
            if (typeResolverBuilderInstance != null) {
                return typeResolverBuilderInstance;
            }
        }
        return (TypeResolverBuilder) ClassUtil.createInstance(cls, canOverrideAccessModifiers());
    }
}

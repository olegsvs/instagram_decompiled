package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public abstract class MapperConfigBase extends MapperConfig implements Serializable {
    private static final int DEFAULT_MAPPER_FEATURES = MapperConfig.collectFeatureDefaults(MapperFeature.class);
    private static final long serialVersionUID = -8378230381628000111L;
    public final Map _mixInAnnotations;
    public final String _rootName;
    public final SubtypeResolver _subtypeResolver;
    public final Class _view;

    public abstract MapperConfigBase with(Base64Variant base64Variant);

    public abstract MapperConfigBase with(AnnotationIntrospector annotationIntrospector);

    public abstract MapperConfigBase with(PropertyNamingStrategy propertyNamingStrategy);

    public abstract MapperConfigBase with(HandlerInstantiator handlerInstantiator);

    public abstract MapperConfigBase with(ClassIntrospector classIntrospector);

    public abstract MapperConfigBase with(VisibilityChecker visibilityChecker);

    public abstract MapperConfigBase with(SubtypeResolver subtypeResolver);

    public abstract MapperConfigBase with(TypeResolverBuilder typeResolverBuilder);

    public abstract MapperConfigBase with(TypeFactory typeFactory);

    public abstract MapperConfigBase with(DateFormat dateFormat);

    public abstract MapperConfigBase with(Locale locale);

    public abstract MapperConfigBase with(TimeZone timeZone);

    public abstract MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector);

    public abstract MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector);

    public abstract MapperConfigBase withRootName(String str);

    public abstract MapperConfigBase withView(Class cls);

    public abstract MapperConfigBase withVisibility(PropertyAccessor propertyAccessor, Visibility visibility);

    public MapperConfigBase(BaseSettings baseSettings, SubtypeResolver subtypeResolver, Map map) {
        super(baseSettings, DEFAULT_MAPPER_FEATURES);
        this._mixInAnnotations = map;
        this._subtypeResolver = subtypeResolver;
        this._rootName = null;
        this._view = null;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase) {
        super(mapperConfigBase);
        this._mixInAnnotations = mapperConfigBase._mixInAnnotations;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, int i) {
        super(mapperConfigBase._base, i);
        this._mixInAnnotations = mapperConfigBase._mixInAnnotations;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, BaseSettings baseSettings) {
        super(baseSettings, mapperConfigBase._mapperFeatures);
        this._mixInAnnotations = mapperConfigBase._mixInAnnotations;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, SubtypeResolver subtypeResolver) {
        super(mapperConfigBase);
        this._mixInAnnotations = mapperConfigBase._mixInAnnotations;
        this._subtypeResolver = subtypeResolver;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, Class cls) {
        super(mapperConfigBase);
        this._mixInAnnotations = mapperConfigBase._mixInAnnotations;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootName = mapperConfigBase._rootName;
        this._view = cls;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, String str) {
        super(mapperConfigBase);
        this._mixInAnnotations = mapperConfigBase._mixInAnnotations;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootName = str;
        this._view = mapperConfigBase._view;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, Map map) {
        super(mapperConfigBase);
        this._mixInAnnotations = map;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
    }

    public final Class findMixInClassFor(Class cls) {
        Map map = this._mixInAnnotations;
        return map == null ? null : (Class) map.get(new ClassKey(cls));
    }

    public final Class getActiveView() {
        return this._view;
    }

    public final String getRootName() {
        return this._rootName;
    }

    public final SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public final int mixInCount() {
        Map map = this._mixInAnnotations;
        return map == null ? 0 : map.size();
    }
}

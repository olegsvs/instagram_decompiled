package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class DeserializationConfig extends MapperConfigBase implements Serializable {
    private static final long serialVersionUID = -4227480407273773599L;
    public final int _deserFeatures;
    public final JsonNodeFactory _nodeFactory;
    public final LinkedNode _problemHandlers;

    private DeserializationConfig(DeserializationConfig deserializationConfig, int i, int i2) {
        super((MapperConfigBase) deserializationConfig, i);
        this._deserFeatures = i2;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super((MapperConfigBase) deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver) {
        super((MapperConfigBase) deserializationConfig, subtypeResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, LinkedNode linkedNode) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = linkedNode;
        this._nodeFactory = deserializationConfig._nodeFactory;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class cls) {
        super((MapperConfigBase) deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, String str) {
        super((MapperConfigBase) deserializationConfig, str);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, Map map) {
        super((MapperConfigBase) deserializationConfig, map);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
    }

    public DeserializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, Map map) {
        super(baseSettings, subtypeResolver, map);
        this._deserFeatures = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
        this._nodeFactory = JsonNodeFactory.instance;
        this._problemHandlers = null;
    }

    private final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            return super.getAnnotationIntrospector();
        }
        return NopAnnotationIntrospector.instance;
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public VisibilityChecker getDefaultVisibilityChecker() {
        VisibilityChecker defaultVisibilityChecker = super.getDefaultVisibilityChecker();
        if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withSetterVisibility(Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_CREATORS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withCreatorVisibility(Visibility.NONE);
        }
        return !isEnabled(MapperFeature.AUTO_DETECT_FIELDS) ? defaultVisibilityChecker.withFieldVisibility(Visibility.NONE) : defaultVisibilityChecker;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public LinkedNode getProblemHandlers() {
        return this._problemHandlers;
    }

    public BeanDescription introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public BeanDescription introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public BeanDescription introspectForBuilder(JavaType javaType) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public BeanDescription introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public boolean useRootWrapping() {
        if (this._rootName == null) {
            return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
        }
        return this._rootName.length() > 0;
    }

    public DeserializationConfig with(Base64Variant base64Variant) {
        return _withBase(this._base.with(base64Variant));
    }

    public DeserializationConfig with(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withAnnotationIntrospector(annotationIntrospector));
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature mask2 : deserializationFeatureArr) {
            mask |= mask2.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask);
    }

    public DeserializationConfig with(PropertyNamingStrategy propertyNamingStrategy) {
        return _withBase(this._base.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    public DeserializationConfig with(HandlerInstantiator handlerInstantiator) {
        return _withBase(this._base.withHandlerInstantiator(handlerInstantiator));
    }

    public DeserializationConfig with(ClassIntrospector classIntrospector) {
        return _withBase(this._base.withClassIntrospector(classIntrospector));
    }

    public DeserializationConfig with(VisibilityChecker visibilityChecker) {
        return _withBase(this._base.withVisibilityChecker(visibilityChecker));
    }

    public DeserializationConfig with(SubtypeResolver subtypeResolver) {
        return this._subtypeResolver == subtypeResolver ? this : new DeserializationConfig(this, subtypeResolver);
    }

    public DeserializationConfig with(TypeResolverBuilder typeResolverBuilder) {
        return _withBase(this._base.withTypeResolverBuilder(typeResolverBuilder));
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        if (this._nodeFactory == jsonNodeFactory) {
            return this;
        }
        return new DeserializationConfig(this, jsonNodeFactory);
    }

    public DeserializationConfig with(TypeFactory typeFactory) {
        return _withBase(this._base.withTypeFactory(typeFactory));
    }

    public DeserializationConfig with(DateFormat dateFormat) {
        return _withBase(this._base.withDateFormat(dateFormat));
    }

    public DeserializationConfig with(Locale locale) {
        return _withBase(this._base.with(locale));
    }

    public DeserializationConfig with(TimeZone timeZone) {
        return _withBase(this._base.with(timeZone));
    }

    public DeserializationConfig with(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mask : mapperFeatureArr) {
            i |= mask.getMask();
        }
        return i == this._mapperFeatures ? this : new DeserializationConfig(this, i, this._deserFeatures);
    }

    public DeserializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withAppendedAnnotationIntrospector(annotationIntrospector));
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i |= mask.getMask();
        }
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i);
    }

    public DeserializationConfig withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        if (LinkedNode.contains(this._problemHandlers, deserializationProblemHandler)) {
            return this;
        }
        return new DeserializationConfig(this, new LinkedNode(deserializationProblemHandler, this._problemHandlers));
    }

    public DeserializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withInsertedAnnotationIntrospector(annotationIntrospector));
    }

    public DeserializationConfig withNoProblemHandlers() {
        if (this._problemHandlers == null) {
            return this;
        }
        return new DeserializationConfig(this, (LinkedNode) null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.DeserializationConfig withRootName(java.lang.String r2) {
        /*
        r1 = this;
        if (r2 != 0) goto L_0x0007;
    L_0x0002:
        r0 = r1._rootName;
        if (r0 != 0) goto L_0x0010;
    L_0x0006:
        return r1;
    L_0x0007:
        r0 = r1._rootName;
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0006;
    L_0x0010:
        r0 = new com.fasterxml.jackson.databind.DeserializationConfig;
        r0.<init>(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationConfig.withRootName(java.lang.String):com.fasterxml.jackson.databind.DeserializationConfig");
    }

    public DeserializationConfig withView(Class cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    public DeserializationConfig withVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
        return _withBase(this._base.withVisibility(propertyAccessor, visibility));
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int mask = (deserializationFeature.getMask() ^ -1) & this._deserFeatures;
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = (deserializationFeature.getMask() ^ -1) & this._deserFeatures;
        for (DeserializationFeature mask2 : deserializationFeatureArr) {
            mask &= mask2.getMask() ^ -1;
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask);
    }

    public DeserializationConfig without(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mask : mapperFeatureArr) {
            i &= mask.getMask() ^ -1;
        }
        return i == this._mapperFeatures ? this : new DeserializationConfig(this, i, this._deserFeatures);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i &= mask.getMask() ^ -1;
        }
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i);
    }
}

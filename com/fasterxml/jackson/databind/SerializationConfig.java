package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class SerializationConfig extends MapperConfigBase implements Serializable {
    private static final long serialVersionUID = 8849092838541724233L;
    public final FilterProvider _filterProvider;
    public final int _serFeatures;
    public Include _serializationInclusion;

    private SerializationConfig(SerializationConfig serializationConfig, int i, int i2) {
        super((MapperConfigBase) serializationConfig, i);
        this._serializationInclusion = null;
        this._serFeatures = i2;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Include include) {
        super(serializationConfig);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = include;
        this._filterProvider = serializationConfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super((MapperConfigBase) serializationConfig, baseSettings);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver) {
        super((MapperConfigBase) serializationConfig, subtypeResolver);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationConfig, FilterProvider filterProvider) {
        super(serializationConfig);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class cls) {
        super((MapperConfigBase) serializationConfig, cls);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationConfig, String str) {
        super((MapperConfigBase) serializationConfig, str);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
    }

    public SerializationConfig(SerializationConfig serializationConfig, Map map) {
        super((MapperConfigBase) serializationConfig, map);
        this._serializationInclusion = null;
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
    }

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, Map map) {
        super(baseSettings, subtypeResolver, map);
        this._serializationInclusion = null;
        this._serFeatures = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
        this._filterProvider = null;
    }

    private final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            return super.getAnnotationIntrospector();
        }
        return AnnotationIntrospector.nopInstance();
    }

    public VisibilityChecker getDefaultVisibilityChecker() {
        VisibilityChecker defaultVisibilityChecker = super.getDefaultVisibilityChecker();
        if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withGetterVisibility(Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withIsGetterVisibility(Visibility.NONE);
        }
        return !isEnabled(MapperFeature.AUTO_DETECT_FIELDS) ? defaultVisibilityChecker.withFieldVisibility(Visibility.NONE) : defaultVisibilityChecker;
    }

    public FilterProvider getFilterProvider() {
        return this._filterProvider;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    public Include getSerializationInclusion() {
        Include include = this._serializationInclusion;
        if (include != null) {
            return include;
        }
        return Include.ALWAYS;
    }

    public BeanDescription introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public BeanDescription introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[SerializationConfig: flags=0x");
        stringBuilder.append(Integer.toHexString(this._serFeatures));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean useRootWrapping() {
        if (this._rootName == null) {
            return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
        }
        return this._rootName.length() > 0;
    }

    public SerializationConfig with(Base64Variant base64Variant) {
        return _withBase(this._base.with(base64Variant));
    }

    public SerializationConfig with(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withAnnotationIntrospector(annotationIntrospector));
    }

    public SerializationConfig with(PropertyNamingStrategy propertyNamingStrategy) {
        return _withBase(this._base.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        for (SerializationFeature mask2 : serializationFeatureArr) {
            mask |= mask2.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask);
    }

    public SerializationConfig with(HandlerInstantiator handlerInstantiator) {
        return _withBase(this._base.withHandlerInstantiator(handlerInstantiator));
    }

    public SerializationConfig with(ClassIntrospector classIntrospector) {
        return _withBase(this._base.withClassIntrospector(classIntrospector));
    }

    public SerializationConfig with(VisibilityChecker visibilityChecker) {
        return _withBase(this._base.withVisibilityChecker(visibilityChecker));
    }

    public SerializationConfig with(SubtypeResolver subtypeResolver) {
        return subtypeResolver == this._subtypeResolver ? this : new SerializationConfig(this, subtypeResolver);
    }

    public SerializationConfig with(TypeResolverBuilder typeResolverBuilder) {
        return _withBase(this._base.withTypeResolverBuilder(typeResolverBuilder));
    }

    public SerializationConfig with(TypeFactory typeFactory) {
        return _withBase(this._base.withTypeFactory(typeFactory));
    }

    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = new SerializationConfig(this, this._base.withDateFormat(dateFormat));
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig with(Locale locale) {
        return _withBase(this._base.with(locale));
    }

    public SerializationConfig with(TimeZone timeZone) {
        return _withBase(this._base.with(timeZone));
    }

    public SerializationConfig with(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mask : mapperFeatureArr) {
            i |= mask.getMask();
        }
        return i == this._mapperFeatures ? this : new SerializationConfig(this, i, this._serFeatures);
    }

    public SerializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withAppendedAnnotationIntrospector(annotationIntrospector));
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        for (SerializationFeature mask : serializationFeatureArr) {
            i |= mask.getMask();
        }
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i);
    }

    public SerializationConfig withFilters(FilterProvider filterProvider) {
        return filterProvider == this._filterProvider ? this : new SerializationConfig(this, filterProvider);
    }

    public SerializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withInsertedAnnotationIntrospector(annotationIntrospector));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.SerializationConfig withRootName(java.lang.String r2) {
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
        r0 = new com.fasterxml.jackson.databind.SerializationConfig;
        r0.<init>(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.SerializationConfig.withRootName(java.lang.String):com.fasterxml.jackson.databind.SerializationConfig");
    }

    public SerializationConfig withSerializationInclusion(Include include) {
        return this._serializationInclusion == include ? this : new SerializationConfig(this, include);
    }

    public SerializationConfig withView(Class cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig withVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
        return _withBase(this._base.withVisibility(propertyAccessor, visibility));
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int mask = (serializationFeature.getMask() ^ -1) & this._serFeatures;
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = (serializationFeature.getMask() ^ -1) & this._serFeatures;
        for (SerializationFeature mask2 : serializationFeatureArr) {
            mask &= mask2.getMask() ^ -1;
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask);
    }

    public SerializationConfig without(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mask : mapperFeatureArr) {
            i &= mask.getMask() ^ -1;
        }
        return i == this._mapperFeatures ? this : new SerializationConfig(this, i, this._serFeatures);
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        for (SerializationFeature mask : serializationFeatureArr) {
            i &= mask.getMask() ^ -1;
        }
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i);
    }
}

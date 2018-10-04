package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BeanDeserializerBuilder {
    public SettableAnyProperty _anySetter;
    public HashMap _backRefProperties;
    public final BeanDescription _beanDesc;
    public AnnotatedMethod _buildMethod;
    public Value _builderConfig;
    public final boolean _defaultViewInclusion;
    public HashSet _ignorableProps;
    public boolean _ignoreAllUnknown;
    public List _injectables;
    public ObjectIdReader _objectIdReader;
    public final Map _properties = new LinkedHashMap();
    public ValueInstantiator _valueInstantiator;

    public void addCreatorProperty(BeanPropertyDefinition beanPropertyDefinition) {
    }

    public BeanDeserializerBuilder(BeanDescription beanDescription, DeserializationConfig deserializationConfig) {
        this._beanDesc = beanDescription;
        this._defaultViewInclusion = deserializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
    }

    public BeanDeserializerBuilder(BeanDeserializerBuilder beanDeserializerBuilder) {
        this._beanDesc = beanDeserializerBuilder._beanDesc;
        this._defaultViewInclusion = beanDeserializerBuilder._defaultViewInclusion;
        this._anySetter = beanDeserializerBuilder._anySetter;
        this._ignoreAllUnknown = beanDeserializerBuilder._ignoreAllUnknown;
        this._properties.putAll(beanDeserializerBuilder._properties);
        this._backRefProperties = _copy(beanDeserializerBuilder._backRefProperties);
        this._ignorableProps = beanDeserializerBuilder._ignorableProps;
        this._valueInstantiator = beanDeserializerBuilder._valueInstantiator;
        this._objectIdReader = beanDeserializerBuilder._objectIdReader;
        this._buildMethod = beanDeserializerBuilder._buildMethod;
        this._builderConfig = beanDeserializerBuilder._builderConfig;
    }

    private static HashMap _copy(HashMap hashMap) {
        return hashMap == null ? null : new HashMap(hashMap);
    }

    public void addBackReferenceProperty(String str, SettableBeanProperty settableBeanProperty) {
        if (this._backRefProperties == null) {
            this._backRefProperties = new HashMap(4);
        }
        this._backRefProperties.put(str, settableBeanProperty);
        Map map = this._properties;
        if (map != null) {
            map.remove(settableBeanProperty.getName());
        }
    }

    public void addCreatorProperty(SettableBeanProperty settableBeanProperty) {
        addProperty(settableBeanProperty);
    }

    public void addIgnorable(String str) {
        if (this._ignorableProps == null) {
            this._ignorableProps = new HashSet();
        }
        this._ignorableProps.add(str);
    }

    public void addInjectable(String str, JavaType javaType, Annotations annotations, AnnotatedMember annotatedMember, Object obj) {
        if (this._injectables == null) {
            this._injectables = new ArrayList();
        }
        this._injectables.add(new ValueInjector(str, javaType, annotations, annotatedMember, obj));
    }

    public void addOrReplaceProperty(SettableBeanProperty settableBeanProperty, boolean z) {
        this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanProperty2 == null) {
            return;
        }
        if (settableBeanProperty2 != settableBeanProperty) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Duplicate property '");
            stringBuilder.append(settableBeanProperty.getName());
            stringBuilder.append("' for ");
            stringBuilder.append(this._beanDesc.getType());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public JsonDeserializer build() {
        BeanDeserializerBuilder beanDeserializerBuilder = this;
        Collection<SettableBeanProperty> values = this._properties.values();
        BeanPropertyMap beanPropertyMap = new BeanPropertyMap(values);
        beanPropertyMap.assignIndexes();
        boolean z = this._defaultViewInclusion ^ true;
        if (!z) {
            for (SettableBeanProperty hasViews : values) {
                if (hasViews.hasViews()) {
                    z = true;
                    break;
                }
            }
        }
        ObjectIdReader objectIdReader = beanDeserializerBuilder._objectIdReader;
        if (objectIdReader != null) {
            beanPropertyMap = beanPropertyMap.withProperty(new ObjectIdValueProperty(objectIdReader, true));
        }
        return new BeanDeserializer(beanDeserializerBuilder, beanDeserializerBuilder._beanDesc, beanPropertyMap, beanDeserializerBuilder._backRefProperties, beanDeserializerBuilder._ignorableProps, beanDeserializerBuilder._ignoreAllUnknown, z);
    }

    public AbstractDeserializer buildAbstract() {
        return new AbstractDeserializer(this, this._beanDesc, this._backRefProperties);
    }

    public JsonDeserializer buildBuilderBased(JavaType javaType, String str) {
        BeanDeserializerBuilder beanDeserializerBuilder = this;
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod != null) {
            Class rawReturnType = annotatedMethod.getRawReturnType();
            if (javaType.getRawClass().isAssignableFrom(rawReturnType)) {
                Collection<SettableBeanProperty> values = this._properties.values();
                BeanPropertyMap beanPropertyMap = new BeanPropertyMap(values);
                beanPropertyMap.assignIndexes();
                str = this._defaultViewInclusion ^ 1;
                if (str == null) {
                    for (SettableBeanProperty hasViews : values) {
                        if (hasViews.hasViews()) {
                            str = true;
                            break;
                        }
                    }
                }
                ObjectIdReader objectIdReader = this._objectIdReader;
                if (objectIdReader != null) {
                    beanPropertyMap = beanPropertyMap.withProperty(new ObjectIdValueProperty(objectIdReader, true));
                }
                return new BuilderBasedDeserializer(beanDeserializerBuilder, this._beanDesc, beanPropertyMap, this._backRefProperties, this._ignorableProps, beanDeserializerBuilder._ignoreAllUnknown, str);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Build method '");
            stringBuilder.append(this._buildMethod.getFullName());
            stringBuilder.append(" has bad return type (");
            stringBuilder.append(rawReturnType.getName());
            stringBuilder.append("), not compatible with POJO type (");
            stringBuilder.append(javaType.getRawClass().getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Builder class ");
        stringBuilder.append(this._beanDesc.getBeanClass().getName());
        stringBuilder.append(" does not have build method '");
        stringBuilder.append(str);
        stringBuilder.append("()'");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public SettableBeanProperty findProperty(String str) {
        return (SettableBeanProperty) this._properties.get(str);
    }

    public SettableAnyProperty getAnySetter() {
        return this._anySetter;
    }

    public AnnotatedMethod getBuildMethod() {
        return this._buildMethod;
    }

    public Value getBuilderConfig() {
        return this._builderConfig;
    }

    public List getInjectables() {
        return this._injectables;
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public Iterator getProperties() {
        return this._properties.values().iterator();
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean hasProperty(String str) {
        return findProperty(str) != null;
    }

    public SettableBeanProperty removeProperty(String str) {
        return (SettableBeanProperty) this._properties.remove(str);
    }

    public void setAnySetter(SettableAnyProperty settableAnyProperty) {
        if (this._anySetter != null) {
            if (settableAnyProperty != null) {
                throw new IllegalStateException("_anySetter already set to non-null");
            }
        }
        this._anySetter = settableAnyProperty;
    }

    public void setIgnoreUnknownProperties(boolean z) {
        this._ignoreAllUnknown = z;
    }

    public void setObjectIdReader(ObjectIdReader objectIdReader) {
        this._objectIdReader = objectIdReader;
    }

    public void setPOJOBuilder(AnnotatedMethod annotatedMethod, Value value) {
        this._buildMethod = annotatedMethod;
        this._builderConfig = value;
    }

    public void setValueInstantiator(ValueInstantiator valueInstantiator) {
        this._valueInstantiator = valueInstantiator;
    }
}

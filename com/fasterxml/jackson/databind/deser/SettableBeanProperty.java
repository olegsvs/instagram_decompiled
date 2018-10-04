package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.NullProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class SettableBeanProperty implements BeanProperty, Serializable {
    public static final JsonDeserializer MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
    private static final long serialVersionUID = -1026580169193933453L;
    public final transient Annotations _contextAnnotations;
    public final boolean _isRequired;
    public String _managedReferenceName;
    public final NullProvider _nullProvider;
    public final String _propName;
    public int _propertyIndex;
    public final JavaType _type;
    public JsonDeserializer _valueDeserializer;
    public final TypeDeserializer _valueTypeDeserializer;
    public ViewMatcher _viewMatcher;
    public final PropertyName _wrapperName;

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj);

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj);

    public abstract Annotation getAnnotation(Class cls);

    public int getCreatorIndex() {
        return -1;
    }

    public Object getInjectableValueId() {
        return null;
    }

    public abstract AnnotatedMember getMember();

    public abstract void set(Object obj, Object obj2);

    public abstract Object setAndReturn(Object obj, Object obj2);

    public abstract SettableBeanProperty withName(String str);

    public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer jsonDeserializer);

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._isRequired = settableBeanProperty._isRequired;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._nullProvider = settableBeanProperty._nullProvider;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, JsonDeserializer jsonDeserializer) {
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._isRequired = settableBeanProperty._isRequired;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        NullProvider nullProvider = null;
        if (jsonDeserializer == null) {
            this._nullProvider = null;
            this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
        } else {
            Object nullValue = jsonDeserializer.getNullValue();
            if (nullValue != null) {
                nullProvider = new NullProvider(this._type, nullValue);
            }
            this._nullProvider = nullProvider;
            this._valueDeserializer = jsonDeserializer;
        }
        this._viewMatcher = settableBeanProperty._viewMatcher;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, String str) {
        this._propertyIndex = -1;
        this._propName = str;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._isRequired = settableBeanProperty._isRequired;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._nullProvider = settableBeanProperty._nullProvider;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
    }

    public SettableBeanProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations) {
        this(beanPropertyDefinition.getName(), javaType, beanPropertyDefinition.getWrapperName(), typeDeserializer, annotations, beanPropertyDefinition.isRequired());
    }

    public SettableBeanProperty(String str, JavaType javaType, PropertyName propertyName, TypeDeserializer typeDeserializer, Annotations annotations) {
        this(str, javaType, propertyName, typeDeserializer, annotations, false);
    }

    public SettableBeanProperty(String str, JavaType javaType, PropertyName propertyName, TypeDeserializer typeDeserializer, Annotations annotations, boolean z) {
        this._propertyIndex = -1;
        if (str != null) {
            if (str.length() != 0) {
                this._propName = InternCache.instance.intern(str);
                this._type = javaType;
                this._wrapperName = propertyName;
                this._isRequired = z;
                this._contextAnnotations = annotations;
                this._viewMatcher = null;
                this._nullProvider = null;
                if (typeDeserializer != null) {
                    typeDeserializer = typeDeserializer.forProperty(this);
                }
                this._valueTypeDeserializer = typeDeserializer;
                this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
            }
        }
        this._propName = JsonProperty.USE_DEFAULT_NAME;
        this._type = javaType;
        this._wrapperName = propertyName;
        this._isRequired = z;
        this._contextAnnotations = annotations;
        this._viewMatcher = null;
        this._nullProvider = null;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(this);
        }
        this._valueTypeDeserializer = typeDeserializer;
        this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
    }

    public IOException _throwAsIOE(Exception exception) {
        if (exception instanceof IOException) {
            throw ((IOException) exception);
        } else if (exception instanceof RuntimeException) {
            throw ((RuntimeException) exception);
        } else {
            while (exception.getCause() != null) {
                exception = exception.getCause();
            }
            throw new JsonMappingException(exception.getMessage(), null, exception);
        }
    }

    public void _throwAsIOE(Exception exception, Object obj) {
        if (exception instanceof IllegalArgumentException) {
            String str;
            if (obj == null) {
                str = "[NULL]";
            } else {
                str = obj.getClass().getName();
            }
            StringBuilder stringBuilder = new StringBuilder("Problem deserializing property '");
            stringBuilder.append(getName());
            stringBuilder.append("' (expected type: ");
            stringBuilder.append(getType());
            stringBuilder.append("; actual type: ");
            stringBuilder.append(str);
            stringBuilder.append(")");
            str = exception.getMessage();
            if (str != null) {
                stringBuilder.append(", problem: ");
                stringBuilder.append(str);
            } else {
                stringBuilder.append(" (no error message provided)");
            }
            throw new JsonMappingException(stringBuilder.toString(), null, exception);
        }
        _throwAsIOE(exception);
    }

    public void assignIndex(int i) {
        if (this._propertyIndex == -1) {
            this._propertyIndex = i;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Property '");
        stringBuilder.append(getName());
        stringBuilder.append("' already had index (");
        stringBuilder.append(this._propertyIndex);
        stringBuilder.append("), trying to assign ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor) {
        if (isRequired()) {
            jsonObjectFormatVisitor.property((BeanProperty) this);
        } else {
            jsonObjectFormatVisitor.optionalProperty((BeanProperty) this);
        }
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            NullProvider nullProvider = this._nullProvider;
            return nullProvider == null ? null : nullProvider.nullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public Annotation getContextAnnotation(Class cls) {
        return this._contextAnnotations.get(cls);
    }

    public final Class getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    public final String getName() {
        return this._propName;
    }

    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    public JavaType getType() {
        return this._type;
    }

    public JsonDeserializer getValueDeserializer() {
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        return jsonDeserializer == MISSING_VALUE_DESERIALIZER ? null : jsonDeserializer;
    }

    public TypeDeserializer getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasValueDeserializer() {
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        return (jsonDeserializer == null || jsonDeserializer == MISSING_VALUE_DESERIALIZER) ? false : true;
    }

    public boolean hasValueTypeDeserializer() {
        return this._valueTypeDeserializer != null;
    }

    public boolean hasViews() {
        return this._viewMatcher != null;
    }

    public boolean isRequired() {
        return this._isRequired;
    }

    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    public void setViews(Class[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = ViewMatcher.construct(clsArr);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[property '");
        stringBuilder.append(getName());
        stringBuilder.append("']");
        return stringBuilder.toString();
    }

    public boolean visibleInView(Class cls) {
        ViewMatcher viewMatcher = this._viewMatcher;
        if (viewMatcher != null) {
            if (!viewMatcher.isVisibleForView(cls)) {
                return false;
            }
        }
        return true;
    }
}

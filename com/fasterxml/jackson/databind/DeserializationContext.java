package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DeserializationContext extends DatabindContext implements Serializable {
    private static final int MAX_ERROR_STR_LEN = 500;
    private static final long serialVersionUID = -7727373309391091315L;
    public transient ArrayBuilders _arrayBuilders;
    public final DeserializerCache _cache;
    public final DeserializationConfig _config;
    public transient DateFormat _dateFormat;
    public final DeserializerFactory _factory;
    public final int _featureFlags;
    public final InjectableValues _injectableValues;
    public transient ObjectBuffer _objectBuffer;
    public transient JsonParser _parser;
    public final Class _view;

    public abstract JsonDeserializer deserializerInstance(Annotated annotated, Object obj);

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectIdGenerator);

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj);

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory) {
        this._cache = deserializationContext._cache;
        this._factory = deserializerFactory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._injectableValues = deserializationContext._injectableValues;
    }

    public DeserializationContext(DeserializerFactory deserializerFactory) {
        this(deserializerFactory, null);
    }

    public DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        if (deserializerFactory != null) {
            this._factory = deserializerFactory;
            if (deserializerCache == null) {
                deserializerCache = new DeserializerCache();
            }
            this._cache = deserializerCache;
            this._featureFlags = 0;
            this._config = null;
            this._injectableValues = null;
            this._view = null;
            return;
        }
        throw new IllegalArgumentException("Can not pass null DeserializerFactory");
    }

    public String _calcName(Class cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(_calcName(cls.getComponentType()));
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }

    public String _desc(String str) {
        if (str.length() <= 500) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, 500));
        stringBuilder.append("]...[");
        stringBuilder.append(str.substring(str.length() - 500));
        return stringBuilder.toString();
    }

    public java.lang.String _valueDesc() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1._parser;	 Catch:{ Exception -> 0x000b }
        r0 = r0.getText();	 Catch:{ Exception -> 0x000b }
        r0 = r1._desc(r0);	 Catch:{ Exception -> 0x000b }
        return r0;	 Catch:{ Exception -> 0x000b }
    L_0x000b:
        r0 = "[N/A]";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationContext._valueDesc():java.lang.String");
    }

    public Calendar constructCalendar(Date date) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.setTime(date);
        return instance;
    }

    public final JavaType constructType(Class cls) {
        return this._config.constructType(cls);
    }

    public String determineClassName(Object obj) {
        return ClassUtil.getClassDescription(obj);
    }

    public JsonMappingException endOfInputException(Class cls) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end-of-input when trying to deserialize a ");
        stringBuilder.append(cls.getName());
        return JsonMappingException.from(jsonParser, stringBuilder.toString());
    }

    public Class findClass(String str) {
        return ClassUtil.findClass(str);
    }

    public final JsonDeserializer findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) {
        JsonDeserializer findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return (findValueDeserializer == null || !(findValueDeserializer instanceof ContextualDeserializer)) ? findValueDeserializer : ((ContextualDeserializer) findValueDeserializer).createContextual(this, beanProperty);
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) {
        InjectableValues injectableValues = this._injectableValues;
        if (injectableValues != null) {
            return injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No 'injectableValues' configured, can not inject value with id [");
        stringBuilder.append(obj);
        stringBuilder.append("]");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) {
        KeyDeserializer findKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        return findKeyDeserializer instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) findKeyDeserializer).createContextual(this, beanProperty) : findKeyDeserializer;
    }

    public final JsonDeserializer findRootValueDeserializer(JavaType javaType) {
        JsonDeserializer findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (findValueDeserializer == null) {
            return null;
        }
        if (findValueDeserializer instanceof ContextualDeserializer) {
            findValueDeserializer = ((ContextualDeserializer) findValueDeserializer).createContextual(this, null);
        }
        TypeDeserializer findTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return findTypeDeserializer != null ? new TypeWrappedDeserializer(findTypeDeserializer.forProperty(null), findValueDeserializer) : findValueDeserializer;
    }

    public final Class getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ArrayBuilders();
        }
        return this._arrayBuilders;
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    public DateFormat getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        dateFormat = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat;
        return dateFormat;
    }

    public DeserializerFactory getFactory() {
        return this._factory;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer jsonDeserializer, Object obj, String str) {
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers != null) {
            while (problemHandlers != null) {
                if (((DeserializationProblemHandler) problemHandlers.value()).handleUnknownProperty(this, jsonParser, jsonDeserializer, obj, str)) {
                    return true;
                }
                problemHandlers = problemHandlers.next();
            }
        }
        return false;
    }

    public boolean hasValueDeserializerFor(JavaType javaType) {
        return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
    }

    public JsonMappingException instantiationException(Class cls, String str) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not construct instance of ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(", problem: ");
        stringBuilder.append(str);
        return JsonMappingException.from(jsonParser, stringBuilder.toString());
    }

    public JsonMappingException instantiationException(Class cls, Throwable th) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not construct instance of ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(", problem: ");
        stringBuilder.append(th.getMessage());
        return JsonMappingException.from(jsonParser, stringBuilder.toString(), th);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public final ObjectBuffer leaseObjectBuffer() {
        ObjectBuffer objectBuffer = this._objectBuffer;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this._objectBuffer = null;
        return objectBuffer;
    }

    public JsonMappingException mappingException(Class cls) {
        return mappingException(cls, this._parser.getCurrentToken());
    }

    public JsonMappingException mappingException(Class cls, JsonToken jsonToken) {
        cls = _calcName(cls);
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not deserialize instance of ");
        stringBuilder.append(cls);
        stringBuilder.append(" out of ");
        stringBuilder.append(jsonToken);
        stringBuilder.append(" token");
        return JsonMappingException.from(jsonParser, stringBuilder.toString());
    }

    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public Date parseDate(String str) {
        try {
            return getDateFormat().parse(str);
        } catch (ParseException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse Date value '");
            stringBuilder.append(str);
            stringBuilder.append("': ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void reportUnknownProperty(Object obj, String str, JsonDeserializer jsonDeserializer) {
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            Collection collection;
            if (jsonDeserializer == null) {
                collection = null;
            } else {
                collection = jsonDeserializer.getKnownPropertyNames();
            }
            throw UnrecognizedPropertyException.from(this._parser, obj, str, collection);
        }
    }

    public final void returnObjectBuffer(ObjectBuffer objectBuffer) {
        if (this._objectBuffer == null || objectBuffer.initialCapacity() >= this._objectBuffer.initialCapacity()) {
            this._objectBuffer = objectBuffer;
        }
    }

    public JsonMappingException unknownTypeException(JavaType javaType, String str) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not resolve type id '");
        stringBuilder.append(str);
        stringBuilder.append("' into a subtype of ");
        stringBuilder.append(javaType);
        return JsonMappingException.from(jsonParser, stringBuilder.toString());
    }

    public JsonMappingException weirdKeyException(Class cls, String str, String str2) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not construct Map key of type ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" from String \"");
        stringBuilder.append(_desc(str));
        stringBuilder.append("\": ");
        stringBuilder.append(str2);
        return InvalidFormatException.from(jsonParser, stringBuilder.toString(), str, cls);
    }

    public JsonMappingException weirdNumberException(Class cls, String str) {
        return weirdStringException(null, cls, str);
    }

    public JsonMappingException weirdNumberException(Number number, Class cls, String str) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not construct instance of ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" from number value (");
        stringBuilder.append(_valueDesc());
        stringBuilder.append("): ");
        stringBuilder.append(str);
        return InvalidFormatException.from(jsonParser, stringBuilder.toString(), null, cls);
    }

    public JsonMappingException weirdStringException(Class cls, String str) {
        return weirdStringException(null, cls, str);
    }

    public JsonMappingException weirdStringException(String str, Class cls, String str2) {
        JsonParser jsonParser = this._parser;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not construct instance of ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" from String value '");
        stringBuilder.append(_valueDesc());
        stringBuilder.append("': ");
        stringBuilder.append(str2);
        return InvalidFormatException.from(jsonParser, stringBuilder.toString(), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected token (");
        stringBuilder.append(jsonParser.getCurrentToken());
        stringBuilder.append("), expected ");
        stringBuilder.append(jsonToken);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        return JsonMappingException.from(jsonParser, stringBuilder.toString());
    }
}

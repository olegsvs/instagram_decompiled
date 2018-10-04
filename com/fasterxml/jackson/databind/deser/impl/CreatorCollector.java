package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Member;
import java.util.HashMap;

public class CreatorCollector {
    public final BeanDescription _beanDesc;
    public AnnotatedWithParams _booleanCreator;
    public final boolean _canFixAccess;
    public AnnotatedWithParams _defaultConstructor;
    public CreatorProperty[] _delegateArgs;
    public AnnotatedWithParams _delegateCreator;
    public AnnotatedWithParams _doubleCreator;
    public AnnotatedParameter _incompleteParameter;
    public AnnotatedWithParams _intCreator;
    public AnnotatedWithParams _longCreator;
    public CreatorProperty[] _propertyBasedArgs = null;
    public AnnotatedWithParams _propertyBasedCreator;
    public AnnotatedWithParams _stringCreator;

    public CreatorCollector(BeanDescription beanDescription, boolean z) {
        this._beanDesc = beanDescription;
        this._canFixAccess = z;
    }

    private AnnotatedMember _fixAccess(AnnotatedMember annotatedMember) {
        if (annotatedMember != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) annotatedMember.getAnnotated());
        }
        return annotatedMember;
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        this._booleanCreator = verifyNonDup(annotatedWithParams, this._booleanCreator, "boolean");
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, CreatorProperty[] creatorPropertyArr) {
        this._delegateCreator = verifyNonDup(annotatedWithParams, this._delegateCreator, "delegate");
        this._delegateArgs = creatorPropertyArr;
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        this._doubleCreator = verifyNonDup(annotatedWithParams, this._doubleCreator, "double");
    }

    public void addIncompeteParameter(AnnotatedParameter annotatedParameter) {
        if (this._incompleteParameter == null) {
            this._incompleteParameter = annotatedParameter;
        }
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams) {
        this._intCreator = verifyNonDup(annotatedWithParams, this._intCreator, "int");
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams) {
        this._longCreator = verifyNonDup(annotatedWithParams, this._longCreator, "long");
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, CreatorProperty[] creatorPropertyArr) {
        this._propertyBasedCreator = verifyNonDup(annotatedWithParams, this._propertyBasedCreator, "property-based");
        if (creatorPropertyArr.length > 1) {
            HashMap hashMap = new HashMap();
            int i = 0;
            int length = creatorPropertyArr.length;
            while (i < length) {
                String name = creatorPropertyArr[i].getName();
                if (name.length() != 0 || creatorPropertyArr[i].getInjectableValueId() == null) {
                    Integer num = (Integer) hashMap.put(name, Integer.valueOf(i));
                    if (num != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Duplicate creator property \"");
                        stringBuilder.append(name);
                        stringBuilder.append("\" (index ");
                        stringBuilder.append(num);
                        stringBuilder.append(" vs ");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                i++;
            }
        }
        this._propertyBasedArgs = creatorPropertyArr;
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams) {
        this._stringCreator = verifyNonDup(annotatedWithParams, this._stringCreator, "String");
    }

    public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationConfig) {
        JavaType javaType;
        ValueInstantiator stdValueInstantiator = new StdValueInstantiator(deserializationConfig, this._beanDesc.getType());
        if (this._delegateCreator == null) {
            javaType = null;
        } else {
            CreatorProperty[] creatorPropertyArr = this._delegateArgs;
            int i = 0;
            if (creatorPropertyArr != null) {
                int length = creatorPropertyArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (this._delegateArgs[i2] == null) {
                        i = i2;
                        break;
                    }
                }
            }
            javaType = this._beanDesc.bindingsForBeanType().resolveType(this._delegateCreator.getGenericParameterType(i));
        }
        stdValueInstantiator.configureFromObjectSettings(this._defaultConstructor, this._delegateCreator, javaType, this._delegateArgs, this._propertyBasedCreator, this._propertyBasedArgs);
        stdValueInstantiator.configureFromStringCreator(this._stringCreator);
        stdValueInstantiator.configureFromIntCreator(this._intCreator);
        stdValueInstantiator.configureFromLongCreator(this._longCreator);
        stdValueInstantiator.configureFromDoubleCreator(this._doubleCreator);
        stdValueInstantiator.configureFromBooleanCreator(this._booleanCreator);
        stdValueInstantiator.configureIncompleteParameter(this._incompleteParameter);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._defaultConstructor != null;
    }

    public void setDefaultConstructor(AnnotatedConstructor annotatedConstructor) {
        this._defaultConstructor = (AnnotatedWithParams) _fixAccess(annotatedConstructor);
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        if (annotatedWithParams instanceof AnnotatedConstructor) {
            setDefaultConstructor((AnnotatedConstructor) annotatedWithParams);
        } else {
            this._defaultConstructor = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
        }
    }

    public AnnotatedWithParams verifyNonDup(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, String str) {
        if (annotatedWithParams2 != null) {
            if (annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Conflicting ");
                stringBuilder.append(str);
                stringBuilder.append(" creators: already had ");
                stringBuilder.append(annotatedWithParams2);
                stringBuilder.append(", encountered ");
                stringBuilder.append(annotatedWithParams);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }
}

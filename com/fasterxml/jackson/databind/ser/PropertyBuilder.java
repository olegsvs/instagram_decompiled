package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;

public class PropertyBuilder {
    public final AnnotationIntrospector _annotationIntrospector = this._config.getAnnotationIntrospector();
    public final BeanDescription _beanDesc;
    public final SerializationConfig _config;
    public Object _defaultBean;
    public final Include _outputProps;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1 */
    public /* synthetic */ class C01551 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[Include.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = r0;
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.1.<clinit>():void");
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        this._outputProps = beanDescription.findSerializationInclusion(serializationConfig.getSerializationInclusion());
    }

    public Object _throwWrapped(Exception exception, String str, Object obj) {
        while (exception.getCause() != null) {
            exception = exception.getCause();
        }
        if (exception instanceof Error) {
            throw ((Error) exception);
        } else if (exception instanceof RuntimeException) {
            throw ((RuntimeException) exception);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to get property '");
            stringBuilder.append(str);
            stringBuilder.append("' of default ");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(" instance");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter buildWriter(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r13, com.fasterxml.jackson.databind.JavaType r14, com.fasterxml.jackson.databind.JsonSerializer r15, com.fasterxml.jackson.databind.jsontype.TypeSerializer r16, com.fasterxml.jackson.databind.jsontype.TypeSerializer r17, com.fasterxml.jackson.databind.introspect.AnnotatedMember r18, boolean r19) {
        /*
        r12 = this;
        r6 = r14;
        r4 = r18;
        r0 = r19;
        r9 = r12.findSerializationType(r4, r0, r14);
        r3 = r13;
        r1 = r17;
        if (r17 == 0) goto L_0x0055;
    L_0x000e:
        if (r9 != 0) goto L_0x0011;
    L_0x0010:
        r9 = r14;
    L_0x0011:
        r0 = r9.getContentType();
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r9 = r9.withContentTypeHandler(r1);
        r9.getContentType();
        goto L_0x0055;
    L_0x001f:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Problem trying to create BeanPropertyWriter for property '";
        r1.append(r0);
        r0 = r13.getName();
        r1.append(r0);
        r0 = "' (of type ";
        r1.append(r0);
        r0 = r12._beanDesc;
        r0 = r0.getType();
        r1.append(r0);
        r0 = "); serialization type ";
        r1.append(r0);
        r1.append(r9);
        r0 = " has no content";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0055:
        r11 = 0;
        r10 = 0;
        r1 = r12._annotationIntrospector;
        r0 = r12._outputProps;
        r0 = r1.findSerializationInclusion(r4, r0);
        if (r0 == 0) goto L_0x009a;
    L_0x0061:
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x006a;
            case 1: goto L_0x0069;
            case 2: goto L_0x0081;
            case 3: goto L_0x007d;
            default: goto L_0x0068;
        };
    L_0x0068:
        goto L_0x009a;
    L_0x0069:
        r10 = 1;
    L_0x006a:
        r0 = r14.isContainerType();
        if (r0 == 0) goto L_0x009b;
    L_0x0070:
        r1 = r12._config;
        r0 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
        r0 = r1.isEnabled(r0);
        if (r0 != 0) goto L_0x009b;
    L_0x007a:
        r11 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY;
        goto L_0x009b;
    L_0x007d:
        r11 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY;
    L_0x007f:
        r10 = 1;
        goto L_0x009b;
    L_0x0081:
        r0 = r13.getName();
        r11 = r12.getDefaultValue(r0, r4);
        if (r11 != 0) goto L_0x008c;
    L_0x008b:
        goto L_0x007f;
    L_0x008c:
        r0 = r11.getClass();
        r0 = r0.isArray();
        if (r0 == 0) goto L_0x009a;
    L_0x0096:
        r11 = com.fasterxml.jackson.databind.util.ArrayBuilders.getArrayComparator(r11);
    L_0x009a:
        r10 = 0;
    L_0x009b:
        r2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
        r0 = r12._beanDesc;
        r5 = r0.getClassAnnotations();
        r7 = r15;
        r8 = r16;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r0 = r12._annotationIntrospector;
        r0 = r0.findUnwrappingNameTransformer(r4);
        if (r0 == 0) goto L_0x00b5;
    L_0x00b1:
        r2 = r2.unwrappingWriter(r0);
    L_0x00b5:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) {
        Class findSerializationType = this._annotationIntrospector.findSerializationType(annotated);
        if (findSerializationType != null) {
            Class rawClass = javaType.getRawClass();
            if (findSerializationType.isAssignableFrom(rawClass)) {
                javaType = javaType.widenBy(findSerializationType);
            } else if (rawClass.isAssignableFrom(findSerializationType)) {
                javaType = this._config.constructSpecializedType(javaType, findSerializationType);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Illegal concrete-type annotation for method '");
                stringBuilder.append(annotated.getName());
                stringBuilder.append("': class ");
                stringBuilder.append(findSerializationType.getName());
                stringBuilder.append(" not a super-type of (declared) class ");
                stringBuilder.append(rawClass.getName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            z = true;
        }
        JavaType modifySecondaryTypesByAnnotation = BasicSerializerFactory.modifySecondaryTypesByAnnotation(this._config, annotated, javaType);
        if (modifySecondaryTypesByAnnotation != javaType) {
            javaType = modifySecondaryTypesByAnnotation;
            z = true;
        }
        if (!z) {
            Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
            if (findSerializationTyping != null) {
                z = findSerializationTyping == Typing.STATIC;
            }
        }
        return z ? javaType : null;
    }

    public Annotations getClassAnnotations() {
        return this._beanDesc.getClassAnnotations();
    }

    public Object getDefaultBean() {
        if (this._defaultBean == null) {
            Object instantiateBean = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            this._defaultBean = instantiateBean;
            if (instantiateBean == null) {
                Class annotated = this._beanDesc.getClassInfo().getAnnotated();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Class ");
                stringBuilder.append(annotated.getName());
                stringBuilder.append(" has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return this._defaultBean;
    }

    public Object getDefaultValue(String str, AnnotatedMember annotatedMember) {
        Object defaultBean = getDefaultBean();
        try {
            return annotatedMember.getValue(defaultBean);
        } catch (Exception e) {
            return _throwWrapped(e, str, defaultBean);
        }
    }
}

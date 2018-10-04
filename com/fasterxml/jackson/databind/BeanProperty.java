package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.Named;
import java.lang.annotation.Annotation;

public interface BeanProperty extends Named {

    public class Std implements BeanProperty {
        public final Annotations _contextAnnotations;
        public final boolean _isRequired;
        public final AnnotatedMember _member;
        public final String _name;
        public final JavaType _type;
        public final PropertyName _wrapperName;

        public Std(String str, JavaType javaType, PropertyName propertyName, Annotations annotations, AnnotatedMember annotatedMember, boolean z) {
            this._name = str;
            this._type = javaType;
            this._wrapperName = propertyName;
            this._isRequired = z;
            this._member = annotatedMember;
            this._contextAnnotations = annotations;
        }

        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Instances of ");
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" should not get visited");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        public Annotation getAnnotation(Class cls) {
            Annotated annotated = this._member;
            return annotated == null ? null : annotated.getAnnotation(cls);
        }

        public Annotation getContextAnnotation(Class cls) {
            Annotations annotations = this._contextAnnotations;
            return annotations == null ? null : annotations.get(cls);
        }

        public AnnotatedMember getMember() {
            return this._member;
        }

        public String getName() {
            return this._name;
        }

        public JavaType getType() {
            return this._type;
        }

        public PropertyName getWrapperName() {
            return this._wrapperName;
        }

        public boolean isRequired() {
            return this._isRequired;
        }

        public Std withType(JavaType javaType) {
            return new Std(this._name, javaType, this._wrapperName, this._contextAnnotations, this._member, this._isRequired);
        }
    }

    void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor);

    Annotation getAnnotation(Class cls);

    Annotation getContextAnnotation(Class cls);

    AnnotatedMember getMember();

    String getName();

    JavaType getType();

    PropertyName getWrapperName();

    boolean isRequired();
}

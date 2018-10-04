package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.PropertyName;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable {
    public final AnnotationIntrospector _annotationIntrospector;
    public POJOPropertyBuilder$Linked _ctorParameters;
    public POJOPropertyBuilder$Linked _fields;
    public final boolean _forSerialization;
    public POJOPropertyBuilder$Linked _getters;
    public final String _internalName;
    public final String _name;
    public POJOPropertyBuilder$Linked _setters;

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$1 */
    public class C01581 implements POJOPropertyBuilder$WithMember {
        public Class[] withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$2 */
    public class C01592 implements POJOPropertyBuilder$WithMember {
        public ReferenceProperty withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$3 */
    public class C01603 implements POJOPropertyBuilder$WithMember {
        public Boolean withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$4 */
    public class C01614 implements POJOPropertyBuilder$WithMember {
        public Boolean withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$5 */
    public class C01625 implements POJOPropertyBuilder$WithMember {
        public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
            ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
            return findObjectIdInfo != null ? POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo) : findObjectIdInfo;
        }
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, String str) {
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = str;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }

    public POJOPropertyBuilder(String str, AnnotationIntrospector annotationIntrospector, boolean z) {
        this._internalName = str;
        this._name = str;
        this._annotationIntrospector = annotationIntrospector;
        this._forSerialization = z;
    }

    private boolean _anyExplicitNames(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        while (pOJOPropertyBuilder$Linked != null) {
            if (pOJOPropertyBuilder$Linked.explicitName != null && pOJOPropertyBuilder$Linked.explicitName.length() > 0) {
                return true;
            }
            pOJOPropertyBuilder$Linked = pOJOPropertyBuilder$Linked.next;
        }
        return false;
    }

    private boolean _anyIgnorals(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        while (pOJOPropertyBuilder$Linked != null) {
            if (pOJOPropertyBuilder$Linked.isMarkedIgnored) {
                return true;
            }
            pOJOPropertyBuilder$Linked = pOJOPropertyBuilder$Linked.next;
        }
        return false;
    }

    private boolean _anyVisible(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        while (pOJOPropertyBuilder$Linked != null) {
            if (pOJOPropertyBuilder$Linked.isVisible) {
                return true;
            }
            pOJOPropertyBuilder$Linked = pOJOPropertyBuilder$Linked.next;
        }
        return false;
    }

    private AnnotationMap _mergeAnnotations(int i, POJOPropertyBuilder$Linked... pOJOPropertyBuilder$LinkedArr) {
        AnnotationMap allAnnotations = ((AnnotatedMember) pOJOPropertyBuilder$LinkedArr[i].value).getAllAnnotations();
        for (int i2 = i + 1; i2 < pOJOPropertyBuilder$LinkedArr.length; i2++) {
            if (pOJOPropertyBuilder$LinkedArr[i2] != null) {
                return AnnotationMap.merge(allAnnotations, _mergeAnnotations(i2, pOJOPropertyBuilder$LinkedArr));
            }
        }
        return allAnnotations;
    }

    private POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        return pOJOPropertyBuilder$Linked == null ? pOJOPropertyBuilder$Linked : pOJOPropertyBuilder$Linked.withoutIgnored();
    }

    private POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        return pOJOPropertyBuilder$Linked == null ? pOJOPropertyBuilder$Linked : pOJOPropertyBuilder$Linked.withoutNonVisible();
    }

    private POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        return pOJOPropertyBuilder$Linked == null ? pOJOPropertyBuilder$Linked : pOJOPropertyBuilder$Linked.trimByVisibility();
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, String str, boolean z, boolean z2) {
        this._ctorParameters = new POJOPropertyBuilder$Linked(annotatedParameter, this._ctorParameters, str, z, z2);
    }

    public void addField(AnnotatedField annotatedField, String str, boolean z, boolean z2) {
        this._fields = new POJOPropertyBuilder$Linked(annotatedField, this._fields, str, z, z2);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, String str, boolean z, boolean z2) {
        this._getters = new POJOPropertyBuilder$Linked(annotatedMethod, this._getters, str, z, z2);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, String str, boolean z, boolean z2) {
        this._setters = new POJOPropertyBuilder$Linked(annotatedMethod, this._setters, str, z, z2);
    }

    public boolean anyIgnorals() {
        if (!(_anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters))) {
            if (!_anyIgnorals(this._ctorParameters)) {
                return false;
            }
        }
        return true;
    }

    public boolean anyVisible() {
        if (!(_anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters))) {
            if (!_anyVisible(this._ctorParameters)) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    public boolean couldSerialize() {
        if (this._getters == null) {
            if (this._fields == null) {
                return false;
            }
        }
        return true;
    }

    public String findNewName() {
        POJOPropertyBuilder$Linked findRenamed = findRenamed(this._ctorParameters, findRenamed(this._setters, findRenamed(this._getters, findRenamed(this._fields, null))));
        if (findRenamed == null) {
            return null;
        }
        return findRenamed.explicitName;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new C01625());
    }

    public ReferenceProperty findReferenceType() {
        return (ReferenceProperty) fromMemberAnnotations(new C01592());
    }

    private POJOPropertyBuilder$Linked findRenamed(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2) {
        while (pOJOPropertyBuilder$Linked != null) {
            String str = pOJOPropertyBuilder$Linked.explicitName;
            if (str != null) {
                if (!str.equals(this._name)) {
                    if (pOJOPropertyBuilder$Linked2 == null) {
                        pOJOPropertyBuilder$Linked2 = pOJOPropertyBuilder$Linked;
                    } else if (!str.equals(pOJOPropertyBuilder$Linked2.explicitName)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Conflicting property name definitions: '");
                        stringBuilder.append(pOJOPropertyBuilder$Linked2.explicitName);
                        str = "' (for ";
                        stringBuilder.append(str);
                        stringBuilder.append(pOJOPropertyBuilder$Linked2.value);
                        stringBuilder.append(") vs '");
                        stringBuilder.append(pOJOPropertyBuilder$Linked.explicitName);
                        stringBuilder.append(str);
                        stringBuilder.append(pOJOPropertyBuilder$Linked.value);
                        stringBuilder.append(")");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            pOJOPropertyBuilder$Linked = pOJOPropertyBuilder$Linked.next;
        }
        return pOJOPropertyBuilder$Linked2;
    }

    public Class[] findViews() {
        return (Class[]) fromMemberAnnotations(new C01581());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fromMemberAnnotations(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember r3) {
        /*
        r2 = this;
        r0 = r2._annotationIntrospector;
        r1 = 0;
        if (r0 == 0) goto L_0x0037;
    L_0x0005:
        r0 = r2._forSerialization;
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = r2._getters;
        if (r0 == 0) goto L_0x0029;
    L_0x000d:
        r0 = r0.value;
        r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0;
        r1 = r3.withMember(r0);
        goto L_0x0029;
    L_0x0016:
        r0 = r2._ctorParameters;
        if (r0 == 0) goto L_0x0022;
    L_0x001a:
        r0 = r0.value;
        r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0;
        r1 = r3.withMember(r0);
    L_0x0022:
        if (r1 != 0) goto L_0x0029;
    L_0x0024:
        r0 = r2._setters;
        if (r0 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x000d;
    L_0x0029:
        if (r1 != 0) goto L_0x0037;
    L_0x002b:
        r0 = r2._fields;
        if (r0 == 0) goto L_0x0037;
    L_0x002f:
        r0 = r0.value;
        r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0;
        r1 = r3.withMember(r0);
    L_0x0037:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.fromMemberAnnotations(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember):java.lang.Object");
    }

    public AnnotatedMember getAccessor() {
        AnnotatedMember getter = getGetter();
        return getter == null ? getField() : getter;
    }

    public AnnotatedParameter getConstructorParameter() {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this._ctorParameters;
        if (pOJOPropertyBuilder$Linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) pOJOPropertyBuilder$Linked.value).getOwner() instanceof AnnotatedConstructor)) {
            pOJOPropertyBuilder$Linked = pOJOPropertyBuilder$Linked.next;
            if (pOJOPropertyBuilder$Linked == null) {
                return (AnnotatedParameter) this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) pOJOPropertyBuilder$Linked.value;
    }

    public AnnotatedField getField() {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this._fields;
        if (pOJOPropertyBuilder$Linked == null) {
            return null;
        }
        AnnotatedMember annotatedMember = (AnnotatedField) pOJOPropertyBuilder$Linked.value;
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2 = this._fields.next;
        while (pOJOPropertyBuilder$Linked2 != null) {
            AnnotatedMember annotatedMember2 = (AnnotatedField) pOJOPropertyBuilder$Linked2.value;
            Class declaringClass = annotatedMember.getDeclaringClass();
            Class declaringClass2 = annotatedMember2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedMember = annotatedMember2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                pOJOPropertyBuilder$Linked2 = pOJOPropertyBuilder$Linked2.next;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Multiple fields representing property \"");
            stringBuilder.append(getName());
            stringBuilder.append("\": ");
            stringBuilder.append(annotatedMember.getFullName());
            stringBuilder.append(" vs ");
            stringBuilder.append(annotatedMember2.getFullName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return annotatedMember;
    }

    public AnnotatedMethod getGetter() {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this._getters;
        if (pOJOPropertyBuilder$Linked == null) {
            return null;
        }
        AnnotatedMember annotatedMember = (AnnotatedMethod) pOJOPropertyBuilder$Linked.value;
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2 = this._getters.next;
        while (pOJOPropertyBuilder$Linked2 != null) {
            AnnotatedMember annotatedMember2 = (AnnotatedMethod) pOJOPropertyBuilder$Linked2.value;
            Class declaringClass = annotatedMember.getDeclaringClass();
            Class declaringClass2 = annotatedMember2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedMember = annotatedMember2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                pOJOPropertyBuilder$Linked2 = pOJOPropertyBuilder$Linked2.next;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Conflicting getter definitions for property \"");
            stringBuilder.append(getName());
            stringBuilder.append("\": ");
            stringBuilder.append(annotatedMember.getFullName());
            stringBuilder.append(" vs ");
            stringBuilder.append(annotatedMember2.getFullName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return annotatedMember;
    }

    public String getInternalName() {
        return this._internalName;
    }

    public AnnotatedMember getMutator() {
        AnnotatedMember constructorParameter = getConstructorParameter();
        if (constructorParameter != null) {
            return constructorParameter;
        }
        constructorParameter = getSetter();
        return constructorParameter == null ? getField() : constructorParameter;
    }

    public String getName() {
        return this._name;
    }

    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        return getMutator();
    }

    public AnnotatedMethod getSetter() {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this._setters;
        if (pOJOPropertyBuilder$Linked == null) {
            return null;
        }
        AnnotatedMember annotatedMember = (AnnotatedMethod) pOJOPropertyBuilder$Linked.value;
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2 = this._setters.next;
        while (pOJOPropertyBuilder$Linked2 != null) {
            AnnotatedMember annotatedMember2 = (AnnotatedMethod) pOJOPropertyBuilder$Linked2.value;
            Class declaringClass = annotatedMember.getDeclaringClass();
            Class declaringClass2 = annotatedMember2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedMember = annotatedMember2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                pOJOPropertyBuilder$Linked2 = pOJOPropertyBuilder$Linked2.next;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Conflicting setter definitions for property \"");
            stringBuilder.append(getName());
            stringBuilder.append("\": ");
            stringBuilder.append(annotatedMember.getFullName());
            stringBuilder.append(" vs ");
            stringBuilder.append(annotatedMember2.getFullName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return annotatedMember;
    }

    public PropertyName getWrapperName() {
        Annotated primaryMember = getPrimaryMember();
        if (primaryMember != null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            if (annotationIntrospector != null) {
                return annotationIntrospector.findWrapperName(primaryMember);
            }
        }
        return null;
    }

    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    public boolean hasField() {
        return this._fields != null;
    }

    public boolean hasGetter() {
        return this._getters != null;
    }

    public boolean hasSetter() {
        return this._setters != null;
    }

    public boolean isExplicitlyIncluded() {
        if (!(_anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters))) {
            if (!_anyExplicitNames(this._ctorParameters)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRequired() {
        Boolean bool = (Boolean) fromMemberAnnotations(new C01614());
        return bool != null && bool.booleanValue();
    }

    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new C01603());
        return bool != null && bool.booleanValue();
    }

    private static POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2) {
        if (pOJOPropertyBuilder$Linked == null) {
            return pOJOPropertyBuilder$Linked2;
        }
        return pOJOPropertyBuilder$Linked2 == null ? pOJOPropertyBuilder$Linked : POJOPropertyBuilder$Linked.append(pOJOPropertyBuilder$Linked, pOJOPropertyBuilder$Linked2);
    }

    public void mergeAnnotations(boolean z) {
        AnnotationMap _mergeAnnotations;
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked;
        if (z) {
            if (this._getters != null) {
                _mergeAnnotations = _mergeAnnotations(0, this._getters, this._fields, this._ctorParameters, this._setters);
                pOJOPropertyBuilder$Linked = this._getters;
                this._getters = pOJOPropertyBuilder$Linked.withValue(((AnnotatedMethod) pOJOPropertyBuilder$Linked.value).withAnnotations(_mergeAnnotations));
                return;
            }
            if (this._fields != null) {
                _mergeAnnotations = _mergeAnnotations(0, this._fields, this._ctorParameters, this._setters);
                pOJOPropertyBuilder$Linked = this._fields;
                this._fields = pOJOPropertyBuilder$Linked.withValue(((AnnotatedField) pOJOPropertyBuilder$Linked.value).withAnnotations(_mergeAnnotations));
                return;
            }
            return;
        }
        if (this._ctorParameters != null) {
            _mergeAnnotations = _mergeAnnotations(0, this._ctorParameters, this._setters, this._fields, this._getters);
            pOJOPropertyBuilder$Linked = this._ctorParameters;
            this._ctorParameters = pOJOPropertyBuilder$Linked.withValue(((AnnotatedParameter) pOJOPropertyBuilder$Linked.value).withAnnotations(_mergeAnnotations));
            return;
        }
        if (this._setters != null) {
            _mergeAnnotations = _mergeAnnotations(0, this._setters, this._fields, this._getters);
            pOJOPropertyBuilder$Linked = this._setters;
            this._setters = pOJOPropertyBuilder$Linked.withValue(((AnnotatedMethod) pOJOPropertyBuilder$Linked.value).withAnnotations(_mergeAnnotations));
            return;
        }
        if (this._fields != null) {
            _mergeAnnotations = _mergeAnnotations(0, this._fields, this._getters);
            pOJOPropertyBuilder$Linked = this._fields;
            this._fields = pOJOPropertyBuilder$Linked.withValue(((AnnotatedField) pOJOPropertyBuilder$Linked.value).withAnnotations(_mergeAnnotations));
        }
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public void removeNonVisible() {
        removeNonVisible(false);
    }

    public void removeNonVisible(boolean z) {
        this._getters = _removeNonVisible(this._getters);
        this._ctorParameters = _removeNonVisible(this._ctorParameters);
        if (z || this._getters == null) {
            this._fields = _removeNonVisible(this._fields);
            this._setters = _removeNonVisible(this._setters);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Property '");
        stringBuilder.append(this._name);
        stringBuilder.append("'; ctors: ");
        stringBuilder.append(this._ctorParameters);
        stringBuilder.append(", field(s): ");
        stringBuilder.append(this._fields);
        stringBuilder.append(", getter(s): ");
        stringBuilder.append(this._getters);
        stringBuilder.append(", setter(s): ");
        stringBuilder.append(this._setters);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    public POJOPropertyBuilder withName(String str) {
        return new POJOPropertyBuilder(this, str);
    }
}

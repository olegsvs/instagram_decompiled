package com.fasterxml.jackson.databind.introspect;

public final class POJOPropertyBuilder$Linked {
    public final String explicitName;
    public final boolean isMarkedIgnored;
    public final boolean isVisible;
    public final POJOPropertyBuilder$Linked next;
    public final Object value;

    public POJOPropertyBuilder$Linked(Object obj, POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked, String str, boolean z, boolean z2) {
        this.value = obj;
        this.next = pOJOPropertyBuilder$Linked;
        String str2 = null;
        if (str != null) {
            if (str.length() != 0) {
                str2 = str;
            }
        }
        this.explicitName = str2;
        this.isVisible = z;
        this.isMarkedIgnored = z2;
    }

    public static POJOPropertyBuilder$Linked append(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2) {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked3 = pOJOPropertyBuilder$Linked.next;
        if (pOJOPropertyBuilder$Linked3 == null) {
            return pOJOPropertyBuilder$Linked.withNext(pOJOPropertyBuilder$Linked2);
        }
        return pOJOPropertyBuilder$Linked.withNext(append(pOJOPropertyBuilder$Linked3, pOJOPropertyBuilder$Linked2));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.value.toString());
        stringBuilder.append("[visible=");
        stringBuilder.append(this.isVisible);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        if (this.next == null) {
            return stringBuilder2;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(", ");
        stringBuilder.append(this.next.toString());
        return stringBuilder.toString();
    }

    public POJOPropertyBuilder$Linked trimByVisibility() {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this.next;
        if (pOJOPropertyBuilder$Linked == null) {
            return this;
        }
        POJOPropertyBuilder$Linked trimByVisibility = pOJOPropertyBuilder$Linked.trimByVisibility();
        if (this.explicitName == null) {
            if (trimByVisibility.explicitName == null) {
                boolean z = this.isVisible;
                if (z != trimByVisibility.isVisible) {
                    if (z) {
                        trimByVisibility = withNext(null);
                    }
                }
            }
            return trimByVisibility;
        } else if (trimByVisibility.explicitName == null) {
            return withNext(null);
        }
        return withNext(trimByVisibility);
    }

    public POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked) {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked2 = pOJOPropertyBuilder$Linked;
        if (pOJOPropertyBuilder$Linked == this.next) {
            return this;
        }
        return new POJOPropertyBuilder$Linked(this.value, pOJOPropertyBuilder$Linked2, this.explicitName, this.isVisible, this.isMarkedIgnored);
    }

    public POJOPropertyBuilder$Linked withValue(Object obj) {
        Object obj2 = obj;
        if (obj == this.value) {
            return this;
        }
        return new POJOPropertyBuilder$Linked(obj2, this.next, this.explicitName, this.isVisible, this.isMarkedIgnored);
    }

    public POJOPropertyBuilder$Linked withoutIgnored() {
        if (this.isMarkedIgnored) {
            POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this.next;
            return pOJOPropertyBuilder$Linked == null ? null : pOJOPropertyBuilder$Linked.withoutIgnored();
        }
        pOJOPropertyBuilder$Linked = this.next;
        if (pOJOPropertyBuilder$Linked != null) {
            POJOPropertyBuilder$Linked withoutIgnored = pOJOPropertyBuilder$Linked.withoutIgnored();
            if (withoutIgnored != this.next) {
                return withNext(withoutIgnored);
            }
        }
        return this;
    }

    public POJOPropertyBuilder$Linked withoutNonVisible() {
        POJOPropertyBuilder$Linked pOJOPropertyBuilder$Linked = this.next;
        POJOPropertyBuilder$Linked withoutNonVisible = pOJOPropertyBuilder$Linked == null ? null : pOJOPropertyBuilder$Linked.withoutNonVisible();
        return this.isVisible ? withNext(withoutNonVisible) : withoutNonVisible;
    }
}

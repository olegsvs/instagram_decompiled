package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

public final class MapBuilder {

    public final class Builder {
        private Map mMap = MapBuilder.newHashMap();
        private boolean mUnderConstruction = true;

        public final Map build() {
            if (this.mUnderConstruction) {
                this.mUnderConstruction = false;
                return this.mMap;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        public final Builder put(Object obj, Object obj2) {
            if (this.mUnderConstruction) {
                this.mMap.put(obj, obj2);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HashMap newHashMap() {
        return new HashMap();
    }

    public static Map of(Object obj, Object obj2) {
        Map newHashMap = newHashMap();
        newHashMap.put(obj, obj2);
        return newHashMap;
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4) {
        Map newHashMap = newHashMap();
        newHashMap.put(obj, obj2);
        newHashMap.put(obj3, obj4);
        return newHashMap;
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map newHashMap = newHashMap();
        newHashMap.put(obj, obj2);
        newHashMap.put(obj3, obj4);
        newHashMap.put(obj5, obj6);
        return newHashMap;
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Map newHashMap = newHashMap();
        newHashMap.put(obj, obj2);
        newHashMap.put(obj3, obj4);
        newHashMap.put(obj5, obj6);
        newHashMap.put(obj7, obj8);
        return newHashMap;
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Map newHashMap = newHashMap();
        newHashMap.put(obj, obj2);
        newHashMap.put(obj3, obj4);
        newHashMap.put(obj5, obj6);
        newHashMap.put(obj7, obj8);
        newHashMap.put(obj9, obj10);
        return newHashMap;
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        Map newHashMap = newHashMap();
        newHashMap.put(obj, obj2);
        newHashMap.put(obj3, obj4);
        newHashMap.put(obj5, obj6);
        newHashMap.put(obj7, obj8);
        newHashMap.put(obj9, obj10);
        newHashMap.put(obj11, obj12);
        return newHashMap;
    }
}

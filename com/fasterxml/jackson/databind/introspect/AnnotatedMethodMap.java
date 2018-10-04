package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class AnnotatedMethodMap implements Iterable {
    public LinkedHashMap _methods;

    public void add(AnnotatedMethod annotatedMethod) {
        if (this._methods == null) {
            this._methods = new LinkedHashMap();
        }
        this._methods.put(new MemberKey(annotatedMethod.getAnnotated()), annotatedMethod);
    }

    public AnnotatedMethod find(String str, Class[] clsArr) {
        LinkedHashMap linkedHashMap = this._methods;
        if (linkedHashMap == null) {
            return null;
        }
        return (AnnotatedMethod) linkedHashMap.get(new MemberKey(str, clsArr));
    }

    public AnnotatedMethod find(Method method) {
        LinkedHashMap linkedHashMap = this._methods;
        if (linkedHashMap == null) {
            return null;
        }
        return (AnnotatedMethod) linkedHashMap.get(new MemberKey(method));
    }

    public boolean isEmpty() {
        LinkedHashMap linkedHashMap = this._methods;
        if (linkedHashMap != null) {
            if (linkedHashMap.size() != 0) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        LinkedHashMap linkedHashMap = this._methods;
        if (linkedHashMap != null) {
            return linkedHashMap.values().iterator();
        }
        return Collections.emptyList().iterator();
    }

    public AnnotatedMethod remove(AnnotatedMethod annotatedMethod) {
        return remove(annotatedMethod.getAnnotated());
    }

    public AnnotatedMethod remove(Method method) {
        LinkedHashMap linkedHashMap = this._methods;
        return linkedHashMap != null ? (AnnotatedMethod) linkedHashMap.remove(new MemberKey(method)) : null;
    }

    public int size() {
        LinkedHashMap linkedHashMap = this._methods;
        return linkedHashMap == null ? 0 : linkedHashMap.size();
    }
}

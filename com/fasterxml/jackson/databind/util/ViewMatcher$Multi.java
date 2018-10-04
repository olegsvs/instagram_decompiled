package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public final class ViewMatcher$Multi extends ViewMatcher implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class[] _views;

    public ViewMatcher$Multi(Class[] clsArr) {
        this._views = clsArr;
    }

    public boolean isVisibleForView(Class cls) {
        int length = this._views.length;
        int i = 0;
        while (i < length) {
            Class cls2 = this._views[i];
            if (cls != cls2) {
                if (!cls2.isAssignableFrom(cls)) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}

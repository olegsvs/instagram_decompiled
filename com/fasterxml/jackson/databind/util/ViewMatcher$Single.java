package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public final class ViewMatcher$Single extends ViewMatcher implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class _view;

    public ViewMatcher$Single(Class cls) {
        this._view = cls;
    }

    public boolean isVisibleForView(Class cls) {
        Class cls2 = this._view;
        if (cls != cls2) {
            if (!cls2.isAssignableFrom(cls)) {
                return false;
            }
        }
        return true;
    }
}

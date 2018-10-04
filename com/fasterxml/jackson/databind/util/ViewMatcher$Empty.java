package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public final class ViewMatcher$Empty extends ViewMatcher implements Serializable {
    public static final ViewMatcher$Empty instance = new ViewMatcher$Empty();
    private static final long serialVersionUID = 1;

    public boolean isVisibleForView(Class cls) {
        return false;
    }

    private ViewMatcher$Empty() {
    }
}

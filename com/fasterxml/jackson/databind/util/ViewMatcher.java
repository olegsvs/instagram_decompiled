package com.fasterxml.jackson.databind.util;

public abstract class ViewMatcher {
    public abstract boolean isVisibleForView(Class cls);

    public static ViewMatcher construct(Class[] clsArr) {
        if (clsArr != null) {
            switch (clsArr.length) {
                case 0:
                    break;
                case 1:
                    return new ViewMatcher$Single(clsArr[0]);
                default:
                    return new ViewMatcher$Multi(clsArr);
            }
        }
        return ViewMatcher$Empty.instance;
    }
}

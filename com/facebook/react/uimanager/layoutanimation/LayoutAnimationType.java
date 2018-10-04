package com.facebook.react.uimanager.layoutanimation;

public enum LayoutAnimationType {
    CREATE("create"),
    UPDATE("update"),
    DELETE("delete");
    
    private final String mName;

    private LayoutAnimationType(String str) {
        this.mName = str;
    }

    public final String toString() {
        return this.mName;
    }
}

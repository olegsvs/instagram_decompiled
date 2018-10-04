package com.facebook.react.uimanager.layoutanimation;

public enum InterpolatorType {
    LINEAR("linear"),
    EASE_IN("easeIn"),
    EASE_OUT("easeOut"),
    EASE_IN_EASE_OUT("easeInEaseOut"),
    SPRING("spring");
    
    private final String mName;

    private InterpolatorType(String str) {
        this.mName = str;
    }

    public static InterpolatorType fromString(String str) {
        for (InterpolatorType interpolatorType : values()) {
            if (interpolatorType.toString().equalsIgnoreCase(str)) {
                return interpolatorType;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported interpolation type : ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final String toString() {
        return this.mName;
    }
}

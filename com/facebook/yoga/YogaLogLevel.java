package com.facebook.yoga;

public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    
    private final int mIntValue;

    private YogaLogLevel(int i) {
        this.mIntValue = i;
    }
}

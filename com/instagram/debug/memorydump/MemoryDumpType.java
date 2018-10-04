package com.instagram.debug.memorydump;

import java.util.Locale;

public enum MemoryDumpType {
    CRASH(1, "crash"),
    LEAK(2, "leak"),
    DAILY(3, "daily");
    
    private final int id;
    private final String patternPrefix;

    private MemoryDumpType(int i, String str) {
        this.id = i;
        this.patternPrefix = str;
    }

    public int getId() {
        return this.id;
    }

    public String getPatternPrefix() {
        return this.patternPrefix;
    }

    public String getString() {
        return name().toLowerCase(Locale.US);
    }
}

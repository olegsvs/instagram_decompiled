package com.facebook.common.dextricks;

public final class IsArt {
    public static final boolean yes;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = (property.startsWith("1.") || property.startsWith("0.")) ? false : true;
        yes = z;
    }
}

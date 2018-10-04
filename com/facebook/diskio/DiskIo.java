package com.facebook.diskio;

import X.AnonymousClass0CF;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

public class DiskIo {
    private static int sDataOption;
    private static List sDexBaseNames = Collections.emptyList();
    private static int sMetadataOption;

    public static native void madviseFile(boolean z, boolean z2, boolean z3, boolean z4);

    public static void mlockColdstartSet() {
    }

    public static native void mstarMadviseOatFile(String str, int i, int i2);

    public static void munlockColdstartSet() {
    }

    private static native void raiseMemlockLimit();

    static {
        AnonymousClass0CF.m856E("diskio");
    }

    public static void configureMadvise(int i, int i2) {
        sMetadataOption = i | sMetadataOption;
        sDataOption |= i2;
    }

    public static void configureMprotect() {
        sMetadataOption |= 8;
        sDataOption |= 8;
    }

    public static void madviseMprotectOat() {
        mstarMadviseOatFile(JsonProperty.USE_DEFAULT_NAME, sMetadataOption, sDataOption);
    }
}

package com.instagram.creation.photo.crop;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;
import java.util.HashMap;

public class JHeadBridge {
    private static native synchronized HashMap getImageInfo(String str);

    static {
        AnonymousClass0CF.E("igjhead");
    }

    public static HashMap getExifData(String str) {
        try {
            return getImageInfo(str);
        } catch (String str2) {
            AnonymousClass0Dc.I("JHeadBridge", str2, "Failed to read exif for shared photo", new Object[0]);
            return null;
        }
    }
}

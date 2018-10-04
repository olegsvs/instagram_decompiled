package com.facebook.cameracore.assets.xplatcache;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridClassBase;
import java.nio.ByteBuffer;

public class ARDFileResourceMeta extends HybridClassBase {
    public native ByteBuffer getExtra();

    static {
        AnonymousClass0CF.E("ardcache-jni");
    }
}

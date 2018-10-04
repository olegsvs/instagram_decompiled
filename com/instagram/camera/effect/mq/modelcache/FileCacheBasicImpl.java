package com.instagram.camera.effect.mq.modelcache;

import X.AnonymousClass0CF;
import com.facebook.cameracore.assets.xplatcache.ARDFileCache;
import com.facebook.cameracore.assets.xplatcache.ARDFileCacheEntry;
import com.facebook.jni.HybridData;
import java.util.Map.Entry;

public class FileCacheBasicImpl extends ARDFileCache {
    private final String mDirectory;

    private static native HybridData initHybrid(String str, long j);

    public native void clear();

    public native void commit(String str);

    public native void flush();

    public native Entry[] getAllMetas();

    public native ARDFileCacheEntry getCacheEntry(String str);

    public native ARDFileCacheEntry getCacheEntryWithoutPromotion(String str);

    public native long getSize();

    public native ARDFileCacheEntry insertAndLock(String str);

    public native boolean remove(String str);

    public native void unlock(String str);

    public native boolean updateExtra(String str, byte[] bArr);

    static {
        AnonymousClass0CF.E("igardcache-jni");
    }

    public FileCacheBasicImpl(String str, long j) {
        this.mDirectory = str;
        this.mHybridData = initHybrid(str, j);
    }

    public final String getDirectory() {
        return this.mDirectory;
    }
}

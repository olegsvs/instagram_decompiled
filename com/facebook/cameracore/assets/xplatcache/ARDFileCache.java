package com.facebook.cameracore.assets.xplatcache;

import com.facebook.jni.HybridData;
import java.util.Map.Entry;

public abstract class ARDFileCache {
    public HybridData mHybridData;

    public abstract void clear();

    public abstract void commit(String str);

    public abstract void flush();

    public abstract Entry[] getAllMetas();

    public abstract ARDFileCacheEntry getCacheEntry(String str);

    public abstract ARDFileCacheEntry getCacheEntryWithoutPromotion(String str);

    public abstract long getSize();

    public abstract ARDFileCacheEntry insertAndLock(String str);

    public abstract boolean remove(String str);

    public abstract void unlock(String str);

    public abstract boolean updateExtra(String str, byte[] bArr);
}

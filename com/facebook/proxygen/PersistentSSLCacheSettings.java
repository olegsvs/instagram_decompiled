package com.facebook.proxygen;

public class PersistentSSLCacheSettings {
    public int cacheCapacity;
    public boolean enableCrossDomainTickets;
    public String filename;
    public int syncInterval;

    public PersistentSSLCacheSettings(String str, int i, int i2, boolean z) {
        this.filename = str;
        this.cacheCapacity = i;
        this.syncInterval = i2;
        this.enableCrossDomainTickets = z;
    }
}

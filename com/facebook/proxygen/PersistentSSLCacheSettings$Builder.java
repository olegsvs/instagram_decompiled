package com.facebook.proxygen;

public class PersistentSSLCacheSettings$Builder {
    public int cacheCapacity = 50;
    public boolean enableCrossDomainTickets = false;
    public String filename;
    public int syncInterval = 150;

    public PersistentSSLCacheSettings$Builder(String str) {
        this.filename = str;
    }

    public PersistentSSLCacheSettings build() {
        return new PersistentSSLCacheSettings(this.filename, this.cacheCapacity, this.syncInterval, this.enableCrossDomainTickets);
    }

    public PersistentSSLCacheSettings$Builder capacity(int i) {
        this.cacheCapacity = i;
        return this;
    }

    public PersistentSSLCacheSettings$Builder enableCrossDomainTickets(boolean z) {
        this.enableCrossDomainTickets = z;
        return this;
    }

    public PersistentSSLCacheSettings$Builder syncInterval(int i) {
        this.syncInterval = i;
        return this;
    }
}

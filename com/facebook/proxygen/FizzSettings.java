package com.facebook.proxygen;

public class FizzSettings {
    public final PersistentSSLCacheSettings cacheSettings;
    public final boolean compatMode;
    public final boolean enabled;
    public String hostnamePolicy;
    public final int maxPskUses;
    public final boolean persistentCacheEnabled;
    public final boolean sendEarlyData;
    public final boolean useJavaCrypto;

    public FizzSettings(boolean z, String str, boolean z2, PersistentSSLCacheSettings persistentSSLCacheSettings, boolean z3, boolean z4, int i, boolean z5) {
        this.enabled = z;
        this.hostnamePolicy = str;
        this.persistentCacheEnabled = z2;
        this.cacheSettings = persistentSSLCacheSettings;
        this.sendEarlyData = z3;
        this.compatMode = z4;
        this.maxPskUses = i;
        this.useJavaCrypto = z5;
    }
}

package com.facebook.proxygen;

public class FizzSettings$Builder {
    public PersistentSSLCacheSettings cacheSettings;
    public boolean compatMode = true;
    public boolean enabled = false;
    public String hostnamePolicy;
    public int maxPskUses = 5;
    public boolean persistentCacheEnabled = false;
    public boolean sendEarlyData = false;
    public boolean useJavaCrypto = false;

    public FizzSettings build() {
        return new FizzSettings(this.enabled, this.hostnamePolicy, this.persistentCacheEnabled, this.cacheSettings, this.sendEarlyData, this.compatMode, this.maxPskUses, this.useJavaCrypto);
    }

    public FizzSettings$Builder setCompatMode(boolean z) {
        this.compatMode = z;
        return this;
    }

    public FizzSettings$Builder setEnabled(boolean z) {
        this.enabled = z;
        return this;
    }

    public FizzSettings$Builder setHostnamePolicy(String str) {
        this.hostnamePolicy = str;
        return this;
    }

    public FizzSettings$Builder setMaxPskUses(int i) {
        this.maxPskUses = i;
        return this;
    }

    public FizzSettings$Builder setPersistentCacheEnabled(boolean z) {
        this.persistentCacheEnabled = z;
        return this;
    }

    public FizzSettings$Builder setPersistentCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.cacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public FizzSettings$Builder setSendEarlyData(boolean z) {
        this.sendEarlyData = z;
        return this;
    }

    public FizzSettings$Builder setUseJavaCrypto(boolean z) {
        this.useJavaCrypto = z;
        return this;
    }
}

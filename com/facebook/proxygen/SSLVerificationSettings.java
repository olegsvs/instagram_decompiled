package com.facebook.proxygen;

public class SSLVerificationSettings {
    private boolean enableTimestampVerification;
    private boolean enforceCertKeyLengthVerification;
    private long trustedReferenceTimestamp;

    public SSLVerificationSettings(boolean z, boolean z2, long j) {
        this.enableTimestampVerification = z;
        this.enforceCertKeyLengthVerification = z2;
        this.trustedReferenceTimestamp = j;
    }
}

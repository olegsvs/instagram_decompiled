package com.facebook.proxygen;

public class SSLVerificationSettings$Builder {
    private boolean enableTimestampVerification = false;
    private boolean enforceCertKeyLengthVerification = false;
    private long trustedReferenceTimestamp = 0;

    public SSLVerificationSettings build() {
        return new SSLVerificationSettings(this.enableTimestampVerification, this.enforceCertKeyLengthVerification, this.trustedReferenceTimestamp);
    }

    public SSLVerificationSettings$Builder setEnableTimestampVerification(boolean z) {
        this.enableTimestampVerification = z;
        return this;
    }

    public SSLVerificationSettings$Builder setEnforceCertKeyLengthVerification(boolean z) {
        this.enforceCertKeyLengthVerification = z;
        return this;
    }

    public SSLVerificationSettings$Builder setTrustedReferenceTimestamp(long j) {
        this.trustedReferenceTimestamp = j;
        return this;
    }
}

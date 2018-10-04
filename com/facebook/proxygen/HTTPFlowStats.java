package com.facebook.proxygen;

import java.net.InetAddress;

public class HTTPFlowStats {
    private final boolean mCertCacheHit;
    private final boolean mConnEstablished;
    private final ConnQuality mConnQuality;
    private final long mDnsLatency;
    private String mHostname;
    private final boolean mIsPush;
    private final int mLocalPort;
    private final boolean mNewConnection;
    private final String mProtocol;
    private final int mReqBodyBytes;
    private final int mReqHeaderBytes;
    private final int mReqHeaderCompBytes;
    private final boolean mReqSent;
    private final long mRequestSendTime;
    private final int mRspBodyBytes;
    private final long mRspBodyBytesTime;
    private final int mRspBodyCompBytes;
    private final int mRspHeaderBytes;
    private final int mRspHeaderCompBytes;
    private final boolean mRspReceived;
    private final long mRtt;
    private InetAddress mServerAddr = null;
    private final String mServerQuality;
    private final long mTcpLatency;
    private final long mTimeToFirstByte;
    private final long mTimeToLastByte;
    private final long mTlsLatency;
    private final long mTotalConnect;

    public HTTPFlowStats(java.lang.String r3, java.lang.String r4, int r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, java.lang.String r35, com.facebook.proxygen.ConnQuality r36, long r37, boolean r39) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>();
        r2.mHostname = r3;
        r0 = 0;
        r2.mServerAddr = r0;
        r0 = "";
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x0016;
    L_0x0010:
        r0 = java.net.InetAddress.getByName(r4);	 Catch:{ UnknownHostException -> 0x0016 }
        r2.mServerAddr = r0;	 Catch:{ UnknownHostException -> 0x0016 }
    L_0x0016:
        r2.mLocalPort = r5;
        r2.mConnEstablished = r6;
        r2.mNewConnection = r7;
        r2.mReqSent = r8;
        r2.mRspReceived = r9;
        r2.mCertCacheHit = r10;
        r2.mProtocol = r11;
        r2.mReqHeaderBytes = r12;
        r2.mReqHeaderCompBytes = r13;
        r2.mReqBodyBytes = r14;
        r2.mRspHeaderBytes = r15;
        r0 = r16;
        r2.mRspHeaderCompBytes = r0;
        r0 = r17;
        r2.mRspBodyBytes = r0;
        r0 = r18;
        r2.mRspBodyCompBytes = r0;
        r0 = r19;
        r2.mDnsLatency = r0;
        r0 = r21;
        r2.mTcpLatency = r0;
        r0 = r23;
        r2.mTlsLatency = r0;
        r0 = r25;
        r2.mRtt = r0;
        r0 = r27;
        r2.mTimeToFirstByte = r0;
        r0 = r29;
        r2.mTimeToLastByte = r0;
        r0 = r31;
        r2.mTotalConnect = r0;
        r0 = r33;
        r2.mRspBodyBytesTime = r0;
        r0 = r35;
        r2.mServerQuality = r0;
        r0 = r36;
        r2.mConnQuality = r0;
        r0 = r37;
        r2.mRequestSendTime = r0;
        r0 = r39;
        r2.mIsPush = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.HTTPFlowStats.<init>(java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, java.lang.String, int, int, int, int, int, int, int, long, long, long, long, long, long, long, long, java.lang.String, com.facebook.proxygen.ConnQuality, long, boolean):void");
    }

    public boolean getCertCacheHit() {
        return this.mCertCacheHit;
    }

    public ConnQuality getConnQuality() {
        return this.mConnQuality;
    }

    public long getDnsLatency() {
        return this.mDnsLatency;
    }

    public String getHostname() {
        return this.mHostname;
    }

    public boolean getIsConnectionEstablished() {
        return this.mConnEstablished;
    }

    public boolean getIsNewConnection() {
        return this.mNewConnection;
    }

    public int getLocalPort() {
        return this.mLocalPort;
    }

    public String getNegotiatedProtocol() {
        return this.mProtocol;
    }

    public int getRequestBodyBytes() {
        return this.mReqBodyBytes;
    }

    public int getRequestHeaderBytes() {
        return this.mReqHeaderBytes;
    }

    public int getRequestHeaderCompressedBytes() {
        return this.mReqHeaderCompBytes;
    }

    public long getRequestSendTime() {
        return this.mRequestSendTime;
    }

    public boolean getRequestSent() {
        return this.mReqSent;
    }

    public int getResponseBodyBytes() {
        return this.mRspBodyBytes;
    }

    public int getResponseBodyCompressedBytes() {
        return this.mRspBodyCompBytes;
    }

    public int getResponseHeaderBytes() {
        return this.mRspHeaderBytes;
    }

    public int getResponseHeaderCompressedBytes() {
        return this.mRspHeaderCompBytes;
    }

    public boolean getResponseReceived() {
        return this.mRspReceived;
    }

    public long getRspBodyBytesTime() {
        return this.mRspBodyBytesTime;
    }

    public long getRtt() {
        return this.mRtt;
    }

    public InetAddress getServerAddress() {
        return this.mServerAddr;
    }

    public String getServerQuality() {
        return this.mServerQuality;
    }

    public long getTcpLatency() {
        return this.mTcpLatency;
    }

    public long getTimeToFirstByte() {
        return this.mTimeToFirstByte;
    }

    public long getTimeToLastByte() {
        return this.mTimeToLastByte;
    }

    public long getTlsLatency() {
        return this.mTlsLatency;
    }

    public long getTotalConnectTime() {
        return this.mTotalConnect;
    }

    public long getTotalRequestTime() {
        return this.mTimeToLastByte + this.mTotalConnect;
    }

    public boolean isPush() {
        return this.mIsPush;
    }
}

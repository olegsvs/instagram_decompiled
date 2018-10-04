package com.facebook.proxygen;

public class ConnQuality {
    private final long mCwnd;
    private final long mMss;
    private final long mRtt;
    private final long mRtx;
    private final long mTotalBytesWritten;
    private final long mUpstreamLatency;

    public ConnQuality(long j, long j2, long j3, long j4, long j5, long j6) {
        this.mRtt = j;
        this.mRtx = j2;
        this.mCwnd = j3;
        this.mMss = j4;
        this.mTotalBytesWritten = j5;
        this.mUpstreamLatency = j6;
    }

    public long getCwnd() {
        return this.mCwnd;
    }

    public long getMss() {
        return this.mMss;
    }

    public long getRtt() {
        return this.mRtt;
    }

    public long getRtx() {
        return this.mRtx;
    }

    public long getTotalBytesWritten() {
        return this.mTotalBytesWritten;
    }

    public long getUpstreamLatency() {
        return this.mUpstreamLatency;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\"rtt\":");
        stringBuilder.append(this.mRtt);
        stringBuilder.append(",\"rtx\":");
        stringBuilder.append(this.mRtx);
        stringBuilder.append(",\"cwnd\":");
        stringBuilder.append(this.mCwnd);
        stringBuilder.append(",\"mss\":");
        stringBuilder.append(this.mMss);
        stringBuilder.append(",\"tbw\":");
        stringBuilder.append(this.mTotalBytesWritten);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

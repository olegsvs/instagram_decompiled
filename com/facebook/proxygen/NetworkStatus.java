package com.facebook.proxygen;

public class NetworkStatus {
    private final String mDownloadBwQuality;
    private final long mFlowControlHit;
    private final String mLatencyQuality;
    private final boolean mMayHaveNetwork;
    private final long mOpenedConn;
    private long mReqBwEgressAvg;
    private double mReqBwEgressStdDev;
    private long mReqBwIngressAvg;
    private double mReqBwIngressStdDev;
    private final long mRttAvg;
    private final double mRttStdDev;
    private final String mUploadBwQuality;

    private String describeNetworkQuality(int i) {
        switch (i) {
            case 1:
                return "poor";
            case 2:
                return "moderate";
            case 3:
                return "good";
            case 4:
                return "excellent";
            default:
                return "unknown";
        }
    }

    public NetworkStatus(long j, double d, long j2, double d2, long j3, double d3, long j4, long j5, boolean z, int i, int i2, int i3) {
        this.mReqBwIngressAvg = j;
        this.mReqBwIngressStdDev = d;
        this.mReqBwEgressAvg = j2;
        this.mReqBwEgressStdDev = d2;
        this.mRttAvg = j3;
        this.mRttStdDev = d3;
        this.mOpenedConn = j4;
        this.mFlowControlHit = j5;
        this.mMayHaveNetwork = z;
        this.mLatencyQuality = describeNetworkQuality(i);
        this.mUploadBwQuality = describeNetworkQuality(i2);
        this.mDownloadBwQuality = describeNetworkQuality(i3);
    }

    public String getDownloadBwQuality() {
        return this.mDownloadBwQuality;
    }

    public long getFlowControlHit() {
        return this.mFlowControlHit;
    }

    public String getLatencyQuality() {
        return this.mLatencyQuality;
    }

    public boolean getMayHaveNetwork() {
        return this.mMayHaveNetwork;
    }

    public long getOpenedConn() {
        return this.mOpenedConn;
    }

    public long getReqBwEgressAvg() {
        return this.mReqBwEgressAvg;
    }

    public double getReqBwEgressStdDev() {
        return this.mReqBwEgressStdDev;
    }

    public long getReqBwIngressAvg() {
        return this.mReqBwIngressAvg;
    }

    public double getReqBwIngressStdDev() {
        return this.mReqBwIngressStdDev;
    }

    public long getRttAvg() {
        return this.mRttAvg;
    }

    public double getRttStdDev() {
        return this.mRttStdDev;
    }

    public String getUploadBwQuality() {
        return this.mUploadBwQuality;
    }
}

package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.webrtc.StatsReport;

/* renamed from: X.6Da */
public final class AnonymousClass6Da extends AnonymousClass5ir implements AnonymousClass5YG {
    public AnonymousClass6Da(StatsReport statsReport) {
        super(statsReport);
    }

    public final long DP() {
        return m28340C("packetsLost", 0);
    }

    /* renamed from: F */
    public final long m29534F() {
        return m28340C("googAvgEncodeMs", 0);
    }

    /* renamed from: G */
    public final boolean m29535G() {
        return m28342E("googBandwidthLimitedResolution", false);
    }

    /* renamed from: H */
    public final boolean m29536H() {
        return m28342E("googCpuLimitedResolution", false);
    }

    /* renamed from: I */
    public final int m29537I() {
        return m28339B("googEncodeUsagePercent", 0);
    }

    /* renamed from: J */
    public final long m29538J() {
        return m28340C("googFirsReceived", 0);
    }

    public final long JQ() {
        return m28340C("qpSum", 0);
    }

    /* renamed from: K */
    public final int m29539K() {
        return m28339B("googFrameHeightInput", 0);
    }

    /* renamed from: L */
    public final int m29540L() {
        return m28339B("googFrameHeightSent", 0);
    }

    /* renamed from: M */
    public final int m29541M() {
        return m28339B("googFrameRateInput", 0);
    }

    /* renamed from: N */
    public final int m29542N() {
        return m28339B("googFrameRateSent", 0);
    }

    /* renamed from: O */
    public final int m29543O() {
        return m28339B("googFrameWidthInput", 0);
    }

    /* renamed from: P */
    public final int m29544P() {
        return m28339B("googFrameWidthSent", 0);
    }

    /* renamed from: Q */
    public final long m29545Q() {
        return m28340C("googNacksReceived", 0);
    }

    /* renamed from: R */
    public final long m29546R() {
        return m28340C("packetsSent", 0);
    }

    /* renamed from: S */
    public final long m29547S() {
        return m28340C("googPlisReceived", 0);
    }

    /* renamed from: T */
    public final long m29548T() {
        return m28340C("googRtt", 0);
    }

    public final String rJ() {
        return m28341D("codecImplementationName", JsonProperty.USE_DEFAULT_NAME);
    }

    public final String tJ() {
        return m28341D("googCodecName", JsonProperty.USE_DEFAULT_NAME);
    }
}

package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import org.webrtc.StatsReport;

/* renamed from: X.6DZ */
public final class AnonymousClass6DZ extends AnonymousClass5ir implements AnonymousClass5YF {
    public AnonymousClass6DZ(StatsReport statsReport) {
        super(statsReport);
    }

    public final long DP() {
        return m28340C("packetsLost", 0);
    }

    /* renamed from: F */
    public final long m29530F() {
        return m28340C("audioInputLevel", 0);
    }

    /* renamed from: G */
    public final long m29531G() {
        return m28340C("packetsSent", 0);
    }

    /* renamed from: H */
    public final double m29532H() {
        return m28338A("googResidualEchoLikelihood", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    /* renamed from: I */
    public final long m29533I() {
        return m28340C("googRtt", 0);
    }

    public final double JT() {
        return m28338A("totalAudioEnergy", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    public final double MT() {
        return m28338A("totalSamplesDuration", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    public final long XN() {
        return m28340C("googJitterReceived", 0);
    }
}

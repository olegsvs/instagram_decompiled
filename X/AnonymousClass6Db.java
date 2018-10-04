package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import org.webrtc.StatsReport;

/* renamed from: X.6Db */
public final class AnonymousClass6Db extends AnonymousClass5ir implements AnonymousClass5YF {
    public AnonymousClass6Db(StatsReport statsReport) {
        super(statsReport);
    }

    public final long DP() {
        return m28340C("packetsLost", 0);
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

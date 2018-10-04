package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.webrtc.StatsReport;

/* renamed from: X.6Dc */
public final class AnonymousClass6Dc extends AnonymousClass5ir implements AnonymousClass5YG {
    public AnonymousClass6Dc(StatsReport statsReport) {
        super(statsReport);
    }

    public final long DP() {
        return m28340C("packetsLost", 0);
    }

    public final long JQ() {
        return m28340C("qpSum", 0);
    }

    public final String rJ() {
        return m28341D("codecImplementationName", JsonProperty.USE_DEFAULT_NAME);
    }

    public final String tJ() {
        return m28341D("googCodecName", JsonProperty.USE_DEFAULT_NAME);
    }
}

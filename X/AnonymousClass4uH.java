package X;

/* renamed from: X.4uH */
public final class AnonymousClass4uH {
    /* renamed from: B */
    public static void m25318B(StringBuilder stringBuilder, AnonymousClass6DR anonymousClass6DR) {
        if (anonymousClass6DR != null) {
            stringBuilder.append("BWE:");
            stringBuilder.append("\n | AvailableReceiveBandwidth: ");
            stringBuilder.append(anonymousClass6DR.m29522G());
            stringBuilder.append("\n | AvailableSendBandwidth: ");
            stringBuilder.append(anonymousClass6DR.m29523H());
            stringBuilder.append("\n | BucketDelay: ");
            stringBuilder.append(anonymousClass6DR.m29524I());
            stringBuilder.append("\n | TransmitBitrate: ");
            stringBuilder.append(anonymousClass6DR.m29527L());
            stringBuilder.append("\n | TargetEncBitrate: ");
            stringBuilder.append(anonymousClass6DR.m29526K());
            stringBuilder.append("\n | RetransmitBitrate: ");
            stringBuilder.append(anonymousClass6DR.m29525J());
            stringBuilder.append("\n | ActualEncBitrate: ");
            stringBuilder.append(anonymousClass6DR.m29521F());
            stringBuilder.append("\n");
        }
    }

    /* renamed from: C */
    public static void m25319C(StringBuilder stringBuilder, AnonymousClass6DZ anonymousClass6DZ) {
        if (anonymousClass6DZ != null) {
            stringBuilder.append("Audio (sending)");
            stringBuilder.append("\n");
            stringBuilder.append(" | Packets: ");
            stringBuilder.append(anonymousClass6DZ.m29531G());
            stringBuilder.append(" Lost: ");
            stringBuilder.append(anonymousClass6DZ.DP());
            stringBuilder.append(" Rtt: ");
            stringBuilder.append(anonymousClass6DZ.m29533I());
            stringBuilder.append(" Jitter: ");
            stringBuilder.append(anonymousClass6DZ.XN());
            stringBuilder.append("\n");
            stringBuilder.append(" | Level: ");
            stringBuilder.append(anonymousClass6DZ.m29530F());
            stringBuilder.append(" Energy: ");
            stringBuilder.append(anonymousClass6DZ.JT());
            stringBuilder.append("\n");
            stringBuilder.append(" | Echo: ");
            stringBuilder.append(anonymousClass6DZ.m29532H());
            stringBuilder.append(" Duration: ");
            stringBuilder.append(anonymousClass6DZ.MT());
            stringBuilder.append(" s");
            stringBuilder.append("\n");
        }
    }

    /* renamed from: D */
    public static void m25320D(StringBuilder stringBuilder, AnonymousClass6Da anonymousClass6Da) {
        if (anonymousClass6Da != null) {
            stringBuilder.append("Video (sending)");
            stringBuilder.append("\n");
            stringBuilder.append(" | Packets: ");
            stringBuilder.append(anonymousClass6Da.m29546R());
            stringBuilder.append(" Lost: ");
            stringBuilder.append(anonymousClass6Da.DP());
            stringBuilder.append(" Rtt: ");
            stringBuilder.append(anonymousClass6Da.m29548T());
            stringBuilder.append("\n");
            stringBuilder.append(" | Input: ");
            stringBuilder.append(anonymousClass6Da.m29543O());
            stringBuilder.append("x");
            stringBuilder.append(anonymousClass6Da.m29539K());
            stringBuilder.append(" ");
            stringBuilder.append(anonymousClass6Da.m29541M());
            stringBuilder.append(" fps");
            stringBuilder.append("\n");
            stringBuilder.append(" | Sent: ");
            stringBuilder.append(anonymousClass6Da.m29544P());
            stringBuilder.append("x");
            stringBuilder.append(anonymousClass6Da.m29540L());
            stringBuilder.append(" ");
            stringBuilder.append(anonymousClass6Da.m29542N());
            stringBuilder.append(" fps");
            if (anonymousClass6Da.m29536H()) {
                stringBuilder.append(" cpu");
            }
            if (anonymousClass6Da.m29535G()) {
                stringBuilder.append(" bw");
            }
            stringBuilder.append("\n");
            stringBuilder.append(" | Encoder: ");
            stringBuilder.append(anonymousClass6Da.rJ());
            stringBuilder.append(" (");
            stringBuilder.append(anonymousClass6Da.tJ());
            stringBuilder.append(") ");
            stringBuilder.append(anonymousClass6Da.m29534F());
            stringBuilder.append(" ms (");
            stringBuilder.append(anonymousClass6Da.m29537I());
            stringBuilder.append("%) ");
            stringBuilder.append("\n");
            stringBuilder.append(" | Plis: ");
            stringBuilder.append(anonymousClass6Da.m29547S());
            stringBuilder.append(" Nacks: ");
            stringBuilder.append(anonymousClass6Da.m29545Q());
            stringBuilder.append(" Firs: ");
            stringBuilder.append(anonymousClass6Da.m29538J());
            stringBuilder.append("\n");
        }
    }

    /* renamed from: E */
    public static void m25321E(StringBuilder stringBuilder, AnonymousClass6Db anonymousClass6Db) {
        if (anonymousClass6Db != null) {
            stringBuilder.append("Audio (receiving)");
            stringBuilder.append("\n");
            stringBuilder.append(" | Packets: ");
            stringBuilder.append(anonymousClass6Db.m28340C("packetsReceived", 0));
            stringBuilder.append(" Lost: ");
            stringBuilder.append(anonymousClass6Db.DP());
            stringBuilder.append("\n");
            stringBuilder.append(" | Jitter: ");
            stringBuilder.append(anonymousClass6Db.XN());
            stringBuilder.append(" Buffer: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googJitterBufferMs", 0));
            stringBuilder.append(" ms Preferred: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googPreferredJitterBufferMs", 0));
            stringBuilder.append(" ms");
            stringBuilder.append("\n");
            stringBuilder.append(" | Delay: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googCurrentDelayMs", 0));
            stringBuilder.append(" Duration: ");
            stringBuilder.append(anonymousClass6Db.MT());
            stringBuilder.append(" s");
            stringBuilder.append("\n");
            stringBuilder.append(" | Level: ");
            stringBuilder.append(anonymousClass6Db.m28340C("audioOutputLevel", 0));
            stringBuilder.append(" Energy: ");
            stringBuilder.append(anonymousClass6Db.JT());
            stringBuilder.append("\n");
            stringBuilder.append("Audio Decoding");
            stringBuilder.append("\n");
            stringBuilder.append(" | Normal: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingNormal", 0));
            stringBuilder.append(" | Muted: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingMuted", 0));
            stringBuilder.append("\n");
            stringBuilder.append(" | PLCCNG: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingPLCCNG", 0));
            stringBuilder.append(" | CNG: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingCNG", 0));
            stringBuilder.append(" | PLC: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingPLC", 0));
            stringBuilder.append("\n");
            stringBuilder.append(" | CTN: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingCTN", 0));
            stringBuilder.append(" | CTSG: ");
            stringBuilder.append(anonymousClass6Db.m28340C("googDecodingCTSG", 0));
            stringBuilder.append("\n");
        }
    }

    /* renamed from: F */
    public static void m25322F(StringBuilder stringBuilder, AnonymousClass6Dc anonymousClass6Dc) {
        if (anonymousClass6Dc != null) {
            stringBuilder.append("Video (receiving)");
            stringBuilder.append("\n");
            stringBuilder.append(" | Packets: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("packetsReceived", 0));
            stringBuilder.append(" Lost: ");
            stringBuilder.append(anonymousClass6Dc.DP());
            stringBuilder.append("\n");
            stringBuilder.append(" | Received: ");
            stringBuilder.append(anonymousClass6Dc.m28339B("googFrameWidthReceived", 0));
            stringBuilder.append("x");
            stringBuilder.append(anonymousClass6Dc.m28339B("googFrameHeightReceived", 0));
            stringBuilder.append(" ");
            stringBuilder.append(anonymousClass6Dc.m28339B("googFrameRateReceived", 0));
            stringBuilder.append(" fps");
            stringBuilder.append("\n");
            stringBuilder.append(" | Decoder: ");
            stringBuilder.append(anonymousClass6Dc.rJ());
            stringBuilder.append(" (");
            stringBuilder.append(anonymousClass6Dc.tJ());
            stringBuilder.append(") ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googDecodeMs", 0));
            stringBuilder.append(" ms ");
            stringBuilder.append(anonymousClass6Dc.m28339B("googFrameRateDecoded", 0));
            stringBuilder.append(" fps (");
            stringBuilder.append(anonymousClass6Dc.m28339B("googFrameRateOutput", 0));
            stringBuilder.append(")");
            stringBuilder.append("\n");
            stringBuilder.append(" | Jitter: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googJitterBufferMs", 0));
            stringBuilder.append(" ms Lost: ");
            stringBuilder.append(anonymousClass6Dc.DP());
            stringBuilder.append("\n");
            stringBuilder.append(" | Plis: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googPlisSent", 0));
            stringBuilder.append(" Nacks: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googNacksSent", 0));
            stringBuilder.append(" Firs: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googFirsSent", 0));
            stringBuilder.append("\n");
            stringBuilder.append(" | Delay: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googCurrentDelayMs", 0));
            stringBuilder.append(" Render: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googRenderDelayMs", 0));
            stringBuilder.append(" Frame: ");
            stringBuilder.append(anonymousClass6Dc.m28340C("googInterframeDelayMax", 0));
            stringBuilder.append("\n");
        }
    }
}

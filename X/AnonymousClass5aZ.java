package X;

import android.util.Pair;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.5aZ */
public final class AnonymousClass5aZ {
    /* renamed from: B */
    public String f66639B = null;
    /* renamed from: C */
    public Pair f66640C;
    /* renamed from: D */
    public Integer f66641D = null;
    /* renamed from: E */
    public Pair f66642E;
    /* renamed from: F */
    public Pair f66643F;
    /* renamed from: G */
    public int f66644G = -1;
    /* renamed from: H */
    public Integer f66645H = null;
    /* renamed from: I */
    public Integer f66646I = null;
    /* renamed from: J */
    public String f66647J;
    /* renamed from: K */
    public String f66648K;
    /* renamed from: L */
    public Pair f66649L;
    /* renamed from: M */
    public Pair f66650M;
    /* renamed from: N */
    public double f66651N = -1.0d;
    /* renamed from: O */
    public long f66652O;
    /* renamed from: P */
    public WeakReference f66653P;
    /* renamed from: Q */
    public double f66654Q = -1.0d;
    /* renamed from: R */
    public String f66655R = null;
    /* renamed from: S */
    public AnonymousClass5jJ f66656S;

    /* renamed from: A */
    public final void m27720A(AnonymousClass0NN anonymousClass0NN) {
        String str = this.f66648K;
        if (str != null) {
            anonymousClass0NN.F("rtmp_stats", str);
        }
        if (this.f66656S != null) {
            AnonymousClass0db C;
            String str2 = "webrtc_stats";
            AnonymousClass0db C2 = AnonymousClass0db.C();
            if (this.f66656S.f68540B != null) {
                AnonymousClass6DR anonymousClass6DR = this.f66656S.f68540B;
                C = AnonymousClass0db.C();
                C.D("ActualEncBitrate", anonymousClass6DR.m29521F());
                C.D("AvailableReceiveBandwidth", anonymousClass6DR.m29522G());
                C.D("AvailableSendBandwidth", anonymousClass6DR.m29523H());
                C.D("BucketDelay", anonymousClass6DR.m29524I());
                C.D("RetransmitBitrate", anonymousClass6DR.m29525J());
                C.D("TargetEncBitrate", anonymousClass6DR.m29526K());
                C.D("TransmitBitrate", anonymousClass6DR.m29527L());
                C2.E("bwe", C);
            }
            if (this.f66656S.f68541C != null) {
                AnonymousClass5YF anonymousClass5YF = this.f66656S.f68541C.f68543B;
                if (anonymousClass5YF != null) {
                    String str3 = MediaStreamTrack.AUDIO_TRACK_KIND;
                    C = AnonymousClass0db.C();
                    C.D("AudioInputLevel", anonymousClass5YF.m29530F());
                    C.B("TotalAudioEnergy", anonymousClass5YF.JT());
                    C.D("BytesSent", anonymousClass5YF.m28340C("bytesSent", 0));
                    C.D("PacketsSent", anonymousClass5YF.m29531G());
                    C.D("PacketsLost", anonymousClass5YF.DP());
                    C.B("ResidualEchoLikelihood", anonymousClass5YF.m29532H());
                    C.D("Rtt", anonymousClass5YF.m29533I());
                    C.D("JitterReceived", anonymousClass5YF.XN());
                    C.B("TotalSamplesDuration", anonymousClass5YF.MT());
                    C2.E(str3, C);
                }
                AnonymousClass6Da anonymousClass6Da = this.f66656S.f68541C.f68544C;
                if (anonymousClass6Da != null) {
                    String str4 = MediaStreamTrack.VIDEO_TRACK_KIND;
                    C = AnonymousClass0db.C();
                    C.D("AdaptationChanges", anonymousClass6Da.m28340C("googAdaptationChanges", 0));
                    C.D("AvgEncodeMs", anonymousClass6Da.m29534F());
                    C.C("EncodeUsagePercent", anonymousClass6Da.m29537I());
                    C.I("BandwidthLimitedResolution", anonymousClass6Da.m29535G());
                    C.I("CpuLimitedResolution", anonymousClass6Da.m29536H());
                    C.D("QPSum", anonymousClass6Da.JQ());
                    C.G("CodecName", anonymousClass6Da.tJ());
                    C.G("CodecImplementationName", anonymousClass6Da.rJ());
                    C.D("BytesSent", anonymousClass6Da.m28340C("bytesSent", 0));
                    C.D("PacketsSent", anonymousClass6Da.m29546R());
                    C.D("PacketsLost", anonymousClass6Da.DP());
                    C.D("FirsReceived", anonymousClass6Da.m29538J());
                    C.D("PlisReceived", anonymousClass6Da.m29547S());
                    C.D("NacksReceived", anonymousClass6Da.m29545Q());
                    C.D("Rtt", anonymousClass6Da.m29548T());
                    C.C("FrameHeightInput", anonymousClass6Da.m29539K());
                    C.C("FrameWidthInput", anonymousClass6Da.m29543O());
                    C.C("FrameRateInput", anonymousClass6Da.m29541M());
                    C.C("FrameHeightSent", anonymousClass6Da.m29540L());
                    C.C("FrameWidthSent", anonymousClass6Da.m29544P());
                    C.C("FrameRateSent", anonymousClass6Da.m29542N());
                    C2.E(str4, C);
                }
            }
            anonymousClass0NN.D(str2, C2);
        }
    }

    /* renamed from: B */
    public final String m27721B() {
        return AnonymousClass0IE.E("%s (%.2f)\n%s", new Object[]{AnonymousClass0dw.E(this.f66652O), Float.valueOf(((float) this.f66652O) / 1000.0f), toString()});
    }

    /* renamed from: B */
    public static String m27718B(Pair pair) {
        if (pair == null) {
            return null;
        }
        return AnonymousClass0IE.E("%dx%d", new Object[]{pair.first, pair.second});
    }

    /* renamed from: C */
    public static void m27719C(AnonymousClass5aZ anonymousClass5aZ) {
        WeakReference weakReference = anonymousClass5aZ.f66653P;
        AnonymousClass5ao anonymousClass5ao = weakReference != null ? (AnonymousClass5ao) weakReference.get() : null;
        if (anonymousClass5ao != null) {
            AnonymousClass0Sy.F(new AnonymousClass5O7(anonymousClass5ao, anonymousClass5aZ));
        }
    }

    /* renamed from: C */
    public final boolean m27722C() {
        return this.f66651N >= StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    /* renamed from: D */
    public final boolean m27723D() {
        return this.f66654Q >= StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    /* renamed from: E */
    public final void m27724E(int i, int i2) {
        this.f66640C = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        AnonymousClass5aZ.m27719C(this);
    }

    /* renamed from: F */
    public final void m27725F(int i, int i2) {
        this.f66643F = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        AnonymousClass5aZ.m27719C(this);
    }

    /* renamed from: G */
    public final void m27726G(int i, int i2) {
        this.f66649L = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        AnonymousClass5aZ.m27719C(this);
    }

    /* renamed from: H */
    public final void m27727H(int i, int i2) {
        this.f66650M = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        AnonymousClass5aZ.m27719C(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f66639B != null) {
            stringBuilder.append("Type: ");
            stringBuilder.append(this.f66639B);
            stringBuilder.append("\n");
        }
        if (this.f66655R != null) {
            stringBuilder.append("Encoder: ");
            stringBuilder.append(this.f66655R);
            stringBuilder.append("\n");
        }
        if ((this.f66640C != null ? 1 : null) != null) {
            stringBuilder.append("Camera: ");
            stringBuilder.append(this.f66640C.first);
            stringBuilder.append("x");
            stringBuilder.append(this.f66640C.second);
            stringBuilder.append("\n");
        }
        if ((this.f66649L != null ? 1 : null) != null) {
            String str = this.f66647J;
            if (str == null) {
                str = "Screen";
            }
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(this.f66649L.first);
            stringBuilder.append("x");
            stringBuilder.append(this.f66649L.second);
            if ((this.f66646I != null ? 1 : null) != null) {
                stringBuilder.append(" @ ");
                stringBuilder.append(this.f66646I);
                stringBuilder.append(" fps");
            }
            stringBuilder.append("\n");
        }
        if ((this.f66650M != null ? 1 : null) != null) {
            stringBuilder.append("Live Encoder: ");
            stringBuilder.append(this.f66650M.first);
            stringBuilder.append("x");
            stringBuilder.append(this.f66650M.second);
            if ((this.f66645H != null ? 1 : null) != null) {
                stringBuilder.append(" @ ");
                stringBuilder.append(this.f66645H);
                stringBuilder.append(" fps");
            }
            stringBuilder.append("\n");
        }
        if ((this.f66642E != null ? 1 : null) != null) {
            stringBuilder.append("DVR Encoder: ");
            stringBuilder.append(this.f66642E.first);
            stringBuilder.append("x");
            stringBuilder.append(this.f66642E.second);
            if ((this.f66641D != null ? 1 : null) != null) {
                stringBuilder.append(" @ ");
                stringBuilder.append(this.f66641D);
                stringBuilder.append(" fps");
            }
            stringBuilder.append("\n");
        }
        if (m27723D()) {
            stringBuilder.append(AnonymousClass0IE.E("Live Bitrate: %.1f kbps\n", new Object[]{Double.valueOf(this.f66654Q)}));
        }
        if (m27722C()) {
            String E = this.f66644G > 0 ? AnonymousClass0IE.E(" (lag: %d)", new Object[]{Integer.valueOf(this.f66644G)}) : JsonProperty.USE_DEFAULT_NAME;
            stringBuilder.append(AnonymousClass0IE.E("Throughput: %.1f kbps%s\n", new Object[]{Double.valueOf(this.f66651N), E}));
        }
        return stringBuilder.toString();
    }
}

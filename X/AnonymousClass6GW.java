package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$CallStartResult;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$EndScreenType;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;
import com.instagram.video.videocall.intf.VideoCallSource;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6GW */
public final class AnonymousClass6GW implements AnonymousClass69e {
    /* renamed from: B */
    public long f73740B;
    /* renamed from: C */
    public int f73741C;
    /* renamed from: D */
    public long f73742D;
    /* renamed from: E */
    public long f73743E;
    /* renamed from: F */
    public VideoCallSource f73744F;
    /* renamed from: G */
    public AnonymousClass69c f73745G = AnonymousClass69c.FRONT;
    /* renamed from: H */
    public boolean f73746H = true;
    /* renamed from: I */
    public final AnonymousClass0Nr f73747I;
    /* renamed from: J */
    public long f73748J;
    /* renamed from: K */
    public int f73749K;
    /* renamed from: L */
    public int f73750L;
    /* renamed from: M */
    public long f73751M;
    /* renamed from: N */
    public int f73752N;
    /* renamed from: O */
    public long f73753O;
    /* renamed from: P */
    public boolean f73754P = true;
    /* renamed from: Q */
    public long f73755Q;
    /* renamed from: R */
    public AnonymousClass6Gd f73756R;
    /* renamed from: S */
    public final Map f73757S = new HashMap();
    /* renamed from: T */
    public AnonymousClass69d f73758T = AnonymousClass69d.FULL;
    /* renamed from: U */
    public long f73759U;
    /* renamed from: V */
    public long f73760V;
    /* renamed from: W */
    public long f73761W;
    /* renamed from: X */
    public long f73762X;
    /* renamed from: Y */
    public final Set f73763Y = new HashSet();
    /* renamed from: Z */
    public String f73764Z;
    /* renamed from: a */
    public long f73765a;
    /* renamed from: b */
    public long f73766b;
    /* renamed from: c */
    public final Set f73767c = new HashSet();
    /* renamed from: d */
    public boolean f73768d;
    /* renamed from: e */
    public final AnonymousClass0NT f73769e;
    /* renamed from: f */
    private long f73770f;
    /* renamed from: g */
    private long f73771g;
    /* renamed from: h */
    private long f73772h;
    /* renamed from: i */
    private long f73773i;
    /* renamed from: j */
    private long f73774j;
    /* renamed from: k */
    private long f73775k;
    /* renamed from: l */
    private final long f73776l;
    /* renamed from: m */
    private boolean f73777m;
    /* renamed from: n */
    private long f73778n;
    /* renamed from: o */
    private long f73779o;

    public AnonymousClass6GW(Context context, VideoCallSource videoCallSource, int i, AnonymousClass6Gd anonymousClass6Gd) {
        this.f73744F = videoCallSource;
        this.f73769e = new AnonymousClass69f(videoCallSource.f4474B.A());
        this.f73776l = TimeUnit.SECONDS.toMillis((long) i);
        this.f73756R = anonymousClass6Gd;
        AnonymousClass0Gn.B().A("last_videocall_id", null);
        AnonymousClass0Gn.B().A("last_videocall_waterfall_id", null);
        AnonymousClass0Gn.B().A("last_videocall_time", null);
        AnonymousClass0Gn.B().A("last_videocall_type", null);
        this.f73747I = new AnonymousClass0Nr(context);
    }

    /* renamed from: B */
    public static long m29784B(long j) {
        return j == 0 ? 0 : SystemClock.elapsedRealtime() - j;
    }

    public final void BNA(boolean z) {
        this.f73746H = z ^ 1;
    }

    public final void Ba() {
        new AnonymousClass1jH(this, AnonymousClass69Y.END_CALL_ATTEMPT).f26063B.R();
    }

    /* renamed from: C */
    public static List m29785C(AnonymousClass6GW anonymousClass6GW) {
        List arrayList = new ArrayList();
        for (Entry entry : anonymousClass6GW.f73757S.entrySet()) {
            if (((AnonymousClass69W) entry.getValue()).f72323C.f72557D) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    private void m29786D() {
        this.f73779o += AnonymousClass6GW.m29784B(this.f73778n);
        this.f73778n = 0;
    }

    /* renamed from: E */
    private void m29787E(String str, AnonymousClass69Y anonymousClass69Y) {
        AnonymousClass0Gn.B().A("last_videocall_waterfall_id", this.f73769e.E());
        AnonymousClass0Gn.B().A("last_videocall_type", str);
        this.f73741C = this.f73747I.A();
        this.f73771g = SystemClock.elapsedRealtime();
        new AnonymousClass1jH(this, anonymousClass69Y).f26063B.R();
    }

    /* renamed from: F */
    private void m29788F(AnonymousClass69Y anonymousClass69Y, VideoCallWaterfall$CallStartResult videoCallWaterfall$CallStartResult, Integer num, String str) {
        boolean z;
        AnonymousClass26t C;
        if (videoCallWaterfall$CallStartResult != VideoCallWaterfall$CallStartResult.SUCCESS) {
            if (videoCallWaterfall$CallStartResult != VideoCallWaterfall$CallStartResult.USER_CANCEL) {
                z = false;
                C = AnonymousClass1jH.C(AnonymousClass1jH.F(new AnonymousClass1jH(this, anonymousClass69Y), z, videoCallWaterfall$CallStartResult.name().toLowerCase(Locale.ENGLISH), (float) AnonymousClass6GW.m29784B(this.f73771g)));
                if (num != null) {
                    C.A(TraceFieldType.ErrorCode, num.intValue());
                }
                if (str != null) {
                    C.C("error_message", str);
                }
                C.f26063B.R();
                if (z) {
                    this.f73742D = SystemClock.elapsedRealtime();
                    AnonymousClass0Gn.B().A("last_videocall_time", DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime()));
                }
            }
        }
        z = true;
        C = AnonymousClass1jH.C(AnonymousClass1jH.F(new AnonymousClass1jH(this, anonymousClass69Y), z, videoCallWaterfall$CallStartResult.name().toLowerCase(Locale.ENGLISH), (float) AnonymousClass6GW.m29784B(this.f73771g)));
        if (num != null) {
            C.A(TraceFieldType.ErrorCode, num.intValue());
        }
        if (str != null) {
            C.C("error_message", str);
        }
        C.f26063B.R();
        if (z) {
            this.f73742D = SystemClock.elapsedRealtime();
            AnonymousClass0Gn.B().A("last_videocall_time", DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime()));
        }
    }

    /* renamed from: G */
    private void m29789G(AnonymousClass6DR anonymousClass6DR) {
        if (anonymousClass6DR != null) {
            new AnonymousClass1jH(this, AnonymousClass69Y.RTC_BWE_STATS).B("TargetEncBitrate", anonymousClass6DR.m29526K()).B("RetransmitBitrate", anonymousClass6DR.m29525J()).B("BucketDelay", anonymousClass6DR.m29524I()).B("AvailableSendBandwidth", anonymousClass6DR.m29523H()).B("AvailableReceiveBandwidth", anonymousClass6DR.m29522G()).B("ActualEncBitrate", anonymousClass6DR.m29521F()).B("TransmitBitrate", anonymousClass6DR.m29527L()).f26063B.R();
        }
    }

    /* renamed from: H */
    private void m29790H(AnonymousClass5jK anonymousClass5jK) {
        if (anonymousClass5jK != null) {
            AnonymousClass0NN anonymousClass0NN = new AnonymousClass1jH(this, AnonymousClass69Y.RTC_LOCAL_STATS).C("StreamId", anonymousClass5jK.OS()).f26063B;
            AnonymousClass6DZ anonymousClass6DZ = anonymousClass5jK.f68543B;
            AnonymousClass5ir anonymousClass5ir = anonymousClass5jK.f68544C;
            if (anonymousClass6DZ != null) {
                anonymousClass0NN.A("AudioTotalSamplesDuration", anonymousClass6DZ.MT());
                anonymousClass0NN.C("AudioAudioInputLevel", anonymousClass6DZ.m29530F());
                anonymousClass0NN.C("AudioPacketsSent", anonymousClass6DZ.m29531G());
                anonymousClass0NN.C("AudioPacketsLost", anonymousClass6DZ.DP());
                anonymousClass0NN.C("AudioBytesSent", anonymousClass6DZ.m28340C("bytesSent", 0));
                anonymousClass0NN.C("AudioJitterReceived", anonymousClass6DZ.XN());
                anonymousClass0NN.C("AudioRtt", anonymousClass6DZ.m29533I());
                anonymousClass0NN.A("AudioResidualEchoLikelihood", anonymousClass6DZ.m29532H());
            }
            if (anonymousClass5ir != null) {
                anonymousClass0NN.C("VideoPacketsSent", anonymousClass5ir.m29546R());
                anonymousClass0NN.C("VideoPacketsLost", anonymousClass5ir.DP());
                anonymousClass0NN.C("VideoBytesSent", anonymousClass5ir.m28340C("bytesSent", 0));
                anonymousClass0NN.C("VideoNacksReceived", anonymousClass5ir.m29545Q());
                anonymousClass0NN.C("VideoFirsReceived", anonymousClass5ir.m29538J());
                anonymousClass0NN.C("VideoPlisReceived", anonymousClass5ir.m29547S());
                anonymousClass0NN.C("VideoRtt", anonymousClass5ir.m29548T());
                anonymousClass0NN.F("VideoCodecName", anonymousClass5ir.tJ());
                anonymousClass0NN.F("VideoCodecIml", anonymousClass5ir.rJ());
                anonymousClass0NN.C("VideoQPSum", anonymousClass5ir.JQ());
                anonymousClass0NN.B("VideoEncodeUsagePercent", anonymousClass5ir.m29537I());
                anonymousClass0NN.C("VideoAdaptationChanges", anonymousClass5ir.m28340C("googAdaptationChanges", 0));
                anonymousClass0NN.C("VideoAvgEncodeMs", anonymousClass5ir.m29534F());
                anonymousClass0NN.H("VideoCpuLimitedResolution", anonymousClass5ir.m29536H());
                anonymousClass0NN.H("VideoBandwidthLimitedResolution", anonymousClass5ir.m29535G());
                anonymousClass0NN.B("VideoFrameRateInput", anonymousClass5ir.m29541M());
                anonymousClass0NN.B("VideoFrameWidthInput", anonymousClass5ir.m29543O());
                anonymousClass0NN.B("VideoFrameHeightInput", anonymousClass5ir.m29539K());
                anonymousClass0NN.B("VideoFrameRateSent", anonymousClass5ir.m29542N());
                anonymousClass0NN.B("VideoFrameWidthSent", anonymousClass5ir.m29544P());
                anonymousClass0NN.B("VideoFrameHeightSent", anonymousClass5ir.m29540L());
            }
            anonymousClass0NN.R();
        }
    }

    public final void HC(String str, long j) {
        if (this.f73766b == 0) {
            this.f73766b = SystemClock.elapsedRealtime() - j;
        }
        this.f73767c.add(str);
    }

    public final void Ha(VideoCallWaterfall$EndScreenType videoCallWaterfall$EndScreenType) {
        new AnonymousClass1jH(this, AnonymousClass69Y.END_SCREEN_IMPRESSION).C("end_screen_type", videoCallWaterfall$EndScreenType.name().toLowerCase(Locale.ENGLISH)).f26063B.R();
    }

    /* renamed from: I */
    private void m29791I() {
        long B = AnonymousClass6GW.m29784B(this.f73774j);
        switch (this.f73758T.ordinal()) {
            case 0:
                this.f73748J += B;
                return;
            case 1:
                this.f73755Q += B;
                return;
            case 2:
                this.f73740B += B;
                return;
            default:
                return;
        }
    }

    public final void Ja(AnonymousClass69b anonymousClass69b, Exception exception) {
        new AnonymousClass1jH(this, AnonymousClass69Y.VC_ERROR).C("action", anonymousClass69b.m29235A()).C("reason", exception.getMessage()).C("error_message", exception.getMessage()).f26063B.R();
    }

    public final void NWA(AnonymousClass6Ae anonymousClass6Ae) {
        boolean z;
        String A = anonymousClass6Ae.m29281A();
        Object obj = (AnonymousClass69W) this.f73757S.get(A);
        if (obj == null) {
            obj = new AnonymousClass69W(anonymousClass6Ae);
            z = false;
        } else {
            z = obj.f72323C.f72557D;
            if (!obj.f72323C.f72557D && anonymousClass6Ae.f72557D) {
                obj.f72324D = SystemClock.elapsedRealtime();
            }
            obj.f72323C = anonymousClass6Ae;
            obj.f72322B = false;
        }
        this.f73757S.put(A, obj);
        this.f73763Y.add(A);
        if (!z && anonymousClass6Ae.f72557D) {
            String A2 = anonymousClass6Ae.m29281A();
            if (this.f73757S.containsKey(A2)) {
                new AnonymousClass1jH(this, AnonymousClass69Y.VIDEO_SHOULD_START).C("participant_id", A2).C("type", ((AnonymousClass69W) this.f73757S.get(A2)).f72322B ? "new" : "updated").f26063B.R();
            }
        }
    }

    public final void PRA(AnonymousClass69d anonymousClass69d) {
        m29791I();
        this.f73774j = SystemClock.elapsedRealtime();
        this.f73758T = anonymousClass69d;
    }

    public final void Pa() {
        if (this.f73777m) {
            this.f73777m = false;
            String str = "rejoin";
            long j = this.f73775k;
            if (j == 0) {
                str = "join";
                j = this.f73771g;
            }
            new AnonymousClass1jH(this, AnonymousClass69Y.FIRST_VIDEO_FRAME_RECEIVED).C("type", str).B("response_time", AnonymousClass6GW.m29784B(j)).f26063B.R();
        }
    }

    public final void Qa() {
        new AnonymousClass1jH(this, AnonymousClass69Y.FIRST_PARTICIPANT_JOINED).f26063B.R();
    }

    public final void Sb(String str) {
        AnonymousClass26t anonymousClass1jH = new AnonymousClass1jH(this, AnonymousClass69Y.RTC_TSLOGS);
        anonymousClass1jH.C("tslog", str);
        anonymousClass1jH.f26063B.R();
    }

    public final void Tb(String str, String str2) {
        new AnonymousClass1jH(this, AnonymousClass69Y.USER_FEEDBACK).C(str, str2).f26063B.R();
    }

    public final void Ub() {
        new AnonymousClass1jH(this, AnonymousClass69Y.VC_BACKGROUNDED).f26063B.R();
        this.f73772h = SystemClock.elapsedRealtime();
    }

    public final void Vb() {
        new AnonymousClass1jH(this, AnonymousClass69Y.VC_FOREGROUNDED).B("resume_time", AnonymousClass6GW.m29784B(this.f73772h)).f26063B.R();
    }

    public final void WSA(String str) {
        this.f73764Z = str;
        AnonymousClass0Gn.B().A("last_videocall_id", str);
    }

    public final void Wb(String str) {
        if (this.f73757S.containsKey(str)) {
            AnonymousClass69W anonymousClass69W = (AnonymousClass69W) this.f73757S.get(str);
            AnonymousClass26t C = new AnonymousClass1jH(this, AnonymousClass69Y.VIDEO_STARTED_PLAYING).C("participant_id", str).C("type", anonymousClass69W.f72322B ? "new" : "updated");
            String str2 = "response_time";
            long j = 0;
            if (anonymousClass69W.f72324D != 0) {
                j = SystemClock.elapsedRealtime() - anonymousClass69W.f72324D;
            }
            C.B(str2, j).f26063B.R();
        }
    }

    public final void ZZ() {
        AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.AUDIO_FOCUS_RESUMED)).f26063B.R();
    }

    public final void aZ(int i) {
        AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.AUDIO_FOCUS_LOST)).A("reason", i).f26063B.R();
    }

    public final void aa() {
        this.f73777m = true;
        m29787E("join", AnonymousClass69Y.JOIN_CALL_ATTEMPT);
    }

    public final void bZ() {
        AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.AUDIO_FOCUS_REJECTED)).f26063B.R();
    }

    public final void ba(VideoCallWaterfall$CallStartResult videoCallWaterfall$CallStartResult, Integer num, String str) {
        m29788F(AnonymousClass69Y.JOIN_CALL_RESULT, videoCallWaterfall$CallStartResult, num, str);
    }

    public final void cZ(boolean z) {
        AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.AUDIO_ROUTE_UPDATED)).D("headset_attached", z).f26063B.R();
    }

    public final void ca() {
        new AnonymousClass1jH(this, AnonymousClass69Y.VC_MAXIMIZED).f26063B.R();
    }

    public final void da() {
        new AnonymousClass1jH(this, AnonymousClass69Y.MEDIA_UPDATE_RECEIVED).f26063B.R();
    }

    public final void ea() {
        new AnonymousClass1jH(this, AnonymousClass69Y.VC_MINIMIZED).f26063B.R();
    }

    public final void hZ() {
        this.f73770f = SystemClock.elapsedRealtime();
        new AnonymousClass1jH(this, AnonymousClass69Y.RTC_DISCONNECTED).f26063B.R();
    }

    public final void iZ(VideoCallWaterfall$LeaveReason videoCallWaterfall$LeaveReason) {
        this.f73743E = SystemClock.elapsedRealtime();
        m29786D();
        m29791I();
        this.f73767c.clear();
        this.f73765a += AnonymousClass6GW.m29784B(this.f73766b);
        AnonymousClass1jH.D(AnonymousClass1jH.E(AnonymousClass1jH.C(AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.CALL_ENDED))))).C("reason", videoCallWaterfall$LeaveReason.name().toLowerCase(Locale.ENGLISH)).f26063B.R();
    }

    public final void ia() {
        AnonymousClass26t C = AnonymousClass1jH.C(AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.PARTICIPANT_STATUS_UPDATED)));
        List C2 = AnonymousClass6GW.m29785C(C.f21938B);
        C.A("video_participant_count", C2.size());
        String[] strArr = (String[]) C2.toArray(new String[C2.size()]);
        C.f26063B.I("video_participant_list", strArr);
        AnonymousClass1jH.D(AnonymousClass1jH.E(C)).f26063B.R();
    }

    public final void jZ() {
        new AnonymousClass1jH(this, AnonymousClass69Y.RTC_RECONNECTED).B("resume_time", AnonymousClass6GW.m29784B(this.f73770f)).f26063B.R();
    }

    public final void kZ() {
        boolean z;
        AnonymousClass26t E;
        long j;
        String str;
        AnonymousClass26t anonymousClass1jH = new AnonymousClass1jH(this, AnonymousClass69Y.CALL_SUMMARY);
        anonymousClass1jH.A("total_participant_count", anonymousClass1jH.f21938B.f73763Y.size());
        anonymousClass1jH.f26063B.I("full_participant_list", (String[]) anonymousClass1jH.f21938B.f73763Y.toArray(new String[anonymousClass1jH.f21938B.f73763Y.size()]));
        anonymousClass1jH.A("start_battery_level", anonymousClass1jH.f21938B.f73741C);
        anonymousClass1jH.A("end_battery_level", anonymousClass1jH.f21938B.f73747I.A());
        String str2 = "is_battery_charging";
        if (!anonymousClass1jH.f21938B.f73768d) {
            if (!anonymousClass1jH.f21938B.f73747I.D()) {
                z = false;
                anonymousClass1jH.D(str2, z);
                anonymousClass1jH.B("duration_full_screen", anonymousClass1jH.f21938B.f73748J);
                anonymousClass1jH.B("duration_minimized_screen", anonymousClass1jH.f21938B.f73755Q);
                anonymousClass1jH.B("duration_backgrounded", anonymousClass1jH.f21938B.f73740B);
                E = AnonymousClass1jH.E(anonymousClass1jH);
                E.B("total_local_audio_packet_sent", E.f21938B.f73760V);
                E.B("total_local_audio_packet_loss", E.f21938B.f73759U);
                E.B("total_local_video_packet_sent", E.f21938B.f73762X);
                E.B("total_local_video_packet_loss", E.f21938B.f73761W);
                j = 0;
                E.B("avg_local_audio_packet_rtt", E.f21938B.f73750L != 0 ? 0 : E.f21938B.f73751M / ((long) E.f21938B.f73750L));
                str = "avg_local_video_packet_rtt";
                if (E.f21938B.f73752N == 0) {
                    j = E.f21938B.f73753O / ((long) E.f21938B.f73752N);
                }
                E.B(str, j);
                E.B("talk_time", this.f73779o).B("video_stall_time", this.f73765a).f26063B.R();
            }
        }
        z = true;
        anonymousClass1jH.D(str2, z);
        anonymousClass1jH.B("duration_full_screen", anonymousClass1jH.f21938B.f73748J);
        anonymousClass1jH.B("duration_minimized_screen", anonymousClass1jH.f21938B.f73755Q);
        anonymousClass1jH.B("duration_backgrounded", anonymousClass1jH.f21938B.f73740B);
        E = AnonymousClass1jH.E(anonymousClass1jH);
        E.B("total_local_audio_packet_sent", E.f21938B.f73760V);
        E.B("total_local_audio_packet_loss", E.f21938B.f73759U);
        E.B("total_local_video_packet_sent", E.f21938B.f73762X);
        E.B("total_local_video_packet_loss", E.f21938B.f73761W);
        j = 0;
        if (E.f21938B.f73750L != 0) {
        }
        E.B("avg_local_audio_packet_rtt", E.f21938B.f73750L != 0 ? 0 : E.f21938B.f73751M / ((long) E.f21938B.f73750L));
        str = "avg_local_video_packet_rtt";
        if (E.f21938B.f73752N == 0) {
            j = E.f21938B.f73753O / ((long) E.f21938B.f73752N);
        }
        E.B(str, j);
        E.B("talk_time", this.f73779o).B("video_stall_time", this.f73765a).f26063B.R();
    }

    public final void lMA(boolean z) {
        this.f73754P = z ^ 1;
    }

    public final void la() {
        new AnonymousClass1jH(this, AnonymousClass69Y.REJOIN_ATTEMPT).f26063B.R();
        this.f73777m = true;
        this.f73775k = SystemClock.elapsedRealtime();
    }

    public final void ma(Exception exception) {
        String str;
        AnonymousClass1jH anonymousClass1jH = new AnonymousClass1jH(this, AnonymousClass69Y.REJOIN_RESULT);
        boolean z = exception == null;
        if (exception == null) {
            str = null;
        } else {
            str = exception.getMessage();
        }
        AnonymousClass1jH.C(AnonymousClass1jH.F(anonymousClass1jH, z, str, (float) AnonymousClass6GW.m29784B(this.f73775k))).f26063B.R();
    }

    public final void oJA(AnonymousClass6Ae anonymousClass6Ae) {
        this.f73757S.remove(anonymousClass6Ae.m29281A());
        if (this.f73757S.isEmpty()) {
            m29786D();
        }
    }

    public final void ra(AnonymousClass5jJ anonymousClass5jJ) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f73776l;
        if (j > 0 && elapsedRealtime - this.f73773i > j) {
            this.f73773i = elapsedRealtime;
            m29789G(anonymousClass5jJ.f68540B);
            m29790H(anonymousClass5jJ.f68541C);
            for (AnonymousClass5jL anonymousClass5jL : Collections.unmodifiableMap(anonymousClass5jJ.f68542D).values()) {
                AnonymousClass0NN anonymousClass0NN = new AnonymousClass1jH(this, AnonymousClass69Y.RTC_REMOTE_STATS).C("StreamId", anonymousClass5jL.OS()).f26063B;
                AnonymousClass5ir anonymousClass5ir = anonymousClass5jL.f68546B;
                AnonymousClass5ir anonymousClass5ir2 = anonymousClass5jL.f68547C;
                if (anonymousClass5ir != null) {
                    anonymousClass0NN.A("AudioTotalSamplesDuration", anonymousClass5ir.MT());
                    anonymousClass0NN.C("AudioAudioOutputLevel", anonymousClass5ir.m28340C("audioOutputLevel", 0));
                    anonymousClass0NN.C("AudioPacketsReceived", anonymousClass5ir.m28340C("packetsReceived", 0));
                    anonymousClass0NN.C("AudioPacketsLost", anonymousClass5ir.DP());
                    anonymousClass0NN.C("AudioBytesReceived", anonymousClass5ir.m28340C("bytesReceived", 0));
                    anonymousClass0NN.C("AudioJitterReceived", anonymousClass5ir.XN());
                    anonymousClass0NN.C("AudioCurrentDelayMs", anonymousClass5ir.m28340C("googCurrentDelayMs", 0));
                    anonymousClass0NN.C("AudioJitterBufferMs", anonymousClass5ir.m28340C("googJitterBufferMs", 0));
                }
                if (anonymousClass5ir2 != null) {
                    anonymousClass0NN.C("VideoPacketsReceived", anonymousClass5ir2.m28340C("packetsReceived", 0));
                    anonymousClass0NN.C("VideoPacketsLost", anonymousClass5ir2.DP());
                    anonymousClass0NN.C("VideoBytesReceived", anonymousClass5ir2.m28340C("bytesReceived", 0));
                    anonymousClass0NN.C("VideoCurrentDelayMs", anonymousClass5ir2.m28340C("googCurrentDelayMs", 0));
                    anonymousClass0NN.C("VideoFirsSent", anonymousClass5ir2.m28340C("googFirsSent", 0));
                    anonymousClass0NN.C("VideoPlisSent", anonymousClass5ir2.m28340C("googPlisSent", 0));
                    anonymousClass0NN.C("VideoNacksSent", anonymousClass5ir2.m28340C("googNacksSent", 0));
                    anonymousClass0NN.F("VideoCodecName", anonymousClass5ir2.tJ());
                    anonymousClass0NN.F("VideoCodecIml", anonymousClass5ir2.rJ());
                    anonymousClass0NN.C("VideoQPSum", anonymousClass5ir2.JQ());
                    anonymousClass0NN.C("VideoFramesDecoded", (long) anonymousClass5ir2.m28339B("framesDecoded", 0));
                    anonymousClass0NN.C("VideoDecodeMs", anonymousClass5ir2.m28340C("googDecodeMs", 0));
                    anonymousClass0NN.B("VideoFrameRateOutput", anonymousClass5ir2.m28339B("googFrameRateOutput", 0));
                    anonymousClass0NN.B("VideoFrameRateReceived", anonymousClass5ir2.m28339B("googFrameRateReceived", 0));
                    anonymousClass0NN.B("VideoFrameHeightReceived", anonymousClass5ir2.m28339B("googFrameHeightReceived", 0));
                    anonymousClass0NN.B("VideoFrameWidthReceived", anonymousClass5ir2.m28339B("googFrameWidthReceived", 0));
                }
                anonymousClass0NN.R();
            }
        }
        if (anonymousClass5jJ.f68541C != null) {
            Object obj = anonymousClass5jJ.f68541C.f68543B;
            Object obj2 = anonymousClass5jJ.f68541C.f68544C;
            if (obj != null) {
                this.f73760V = obj.m29531G();
                this.f73759U = obj.DP();
                this.f73751M += obj.m29533I();
                this.f73750L++;
            }
            if (obj2 != null) {
                this.f73762X = obj2.m29546R();
                this.f73761W = obj2.DP();
                this.f73753O += obj2.m29548T();
                this.f73752N++;
            }
        }
    }

    public final void tB(AnonymousClass6Ae anonymousClass6Ae) {
        NWA(anonymousClass6Ae);
        this.f73749K++;
        if (this.f73757S.size() == 1) {
            this.f73778n = SystemClock.elapsedRealtime();
            this.f73774j = SystemClock.elapsedRealtime();
        }
    }

    public final void tJA(String str) {
        this.f73767c.remove(str);
        if (this.f73767c.isEmpty()) {
            this.f73765a += AnonymousClass6GW.m29784B(this.f73766b);
            this.f73766b = 0;
        }
    }

    public final void uZ() {
        new AnonymousClass1jH(this, AnonymousClass69Y.CONNECTING_SCREEN_IMPRESSION).f26063B.R();
    }

    public final void vZ() {
        m29787E("create", AnonymousClass69Y.INITIATE_CALL_ATTEMPT);
    }

    public final void va(AnonymousClass69b anonymousClass69b) {
        AnonymousClass1jH.C(AnonymousClass1jH.B(new AnonymousClass1jH(this, AnonymousClass69Y.SETTING_CHANGED))).C("action", anonymousClass69b.m29235A()).f26063B.R();
    }

    public final void wZ(VideoCallWaterfall$CallStartResult videoCallWaterfall$CallStartResult, Integer num, String str) {
        m29788F(AnonymousClass69Y.INITIATE_CALL_RESULT, videoCallWaterfall$CallStartResult, num, str);
    }

    public final void yMA(boolean z) {
        this.f73745G = z ? AnonymousClass69c.FRONT : AnonymousClass69c.BACK;
    }
}

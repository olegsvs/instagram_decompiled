package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.video.live.api.IgLiveBroadcastType;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.StringWriter;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.68O */
public final class AnonymousClass68O extends AnonymousClass5ao {
    /* renamed from: k */
    private static final long f72085k = TimeUnit.SECONDS.toMillis(20);
    /* renamed from: B */
    public AnonymousClass68w f72086B;
    /* renamed from: C */
    public AnonymousClass68p f72087C;
    /* renamed from: D */
    public final AnonymousClass5Nl f72088D;
    /* renamed from: E */
    public long f72089E;
    /* renamed from: F */
    public long f72090F;
    /* renamed from: G */
    public AnonymousClass5OB f72091G;
    /* renamed from: H */
    public final Handler f72092H;
    /* renamed from: I */
    public AnonymousClass0Q5 f72093I;
    /* renamed from: J */
    public boolean f72094J;
    /* renamed from: K */
    public boolean f72095K;
    /* renamed from: L */
    public AnonymousClass6Fy f72096L;
    /* renamed from: M */
    public final AnonymousClass5aa f72097M;
    /* renamed from: N */
    public final AnonymousClass5Nw f72098N;
    /* renamed from: O */
    public AnonymousClass5O9 f72099O;
    /* renamed from: P */
    public boolean f72100P;
    /* renamed from: Q */
    public final AnonymousClass0Fz f72101Q;
    /* renamed from: R */
    public boolean f72102R;
    /* renamed from: S */
    public boolean f72103S;
    /* renamed from: T */
    public Runnable f72104T;
    /* renamed from: U */
    public AnonymousClass5PF f72105U;
    /* renamed from: V */
    public boolean f72106V;
    /* renamed from: W */
    public AnonymousClass68N f72107W;
    /* renamed from: X */
    public final AnonymousClass5Nr f72108X;
    /* renamed from: Y */
    public AnonymousClass47L f72109Y;
    /* renamed from: Z */
    public int f72110Z;
    /* renamed from: a */
    public Surface f72111a;
    /* renamed from: b */
    public int f72112b;
    /* renamed from: c */
    private final AnonymousClass3oO f72113c;
    /* renamed from: d */
    private final boolean f72114d;
    /* renamed from: e */
    private AnonymousClass3AL f72115e;
    /* renamed from: f */
    private final AnonymousClass1ax f72116f;
    /* renamed from: g */
    private final AnonymousClass1XZ f72117g;
    /* renamed from: h */
    private boolean f72118h;
    /* renamed from: i */
    private long f72119i;
    /* renamed from: j */
    private AnonymousClass3AG f72120j;

    public final void Ro() {
    }

    public final void Xk() {
    }

    public AnonymousClass68O(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass5aa anonymousClass5aa, AnonymousClass5Nl anonymousClass5Nl, AnonymousClass1ax anonymousClass1ax, AnonymousClass44N anonymousClass44N, AnonymousClass38H anonymousClass38H) {
        Context context2 = context;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        AnonymousClass38H anonymousClass38H2 = anonymousClass38H;
        boolean z = anonymousClass38H != null && AnonymousClass0RC.I(context, anonymousClass0Cm);
        super(context2, anonymousClass0Cm2, anonymousClass38H2, z, anonymousClass44N);
        this.f72092H = new Handler(Looper.getMainLooper());
        this.f72107W = AnonymousClass68N.Begin;
        this.f72095K = true;
        this.f72099O = new AnonymousClass68E(this);
        this.f72117g = new AnonymousClass680(this);
        this.f72113c = new AnonymousClass681(this);
        this.f72116f = anonymousClass1ax;
        this.f72088D = anonymousClass5Nl;
        this.f72097M = anonymousClass5aa;
        this.f72097M.f66660E = this.f66744B;
        this.f72098N = new AnonymousClass5Nw(anonymousClass5aa);
        this.f72101Q = anonymousClass0Fz;
        this.f72114d = ((Boolean) AnonymousClass0CC.NS.H(anonymousClass0Cm)).booleanValue();
        this.f72108X = new AnonymousClass5Nr(f72085k, new AnonymousClass685(this), new AnonymousClass68D(this));
        this.f72108X.f62858E = true;
    }

    /* renamed from: A */
    public final void mo6275A() {
        super.mo6275A();
        this.f72097M.f66671P.I(AnonymousClass0uY.f11854L);
        m29161C();
        this.f72105U = null;
        AnonymousClass0JQ.f2915B.Q(null);
    }

    /* renamed from: B */
    public static void m29142B(AnonymousClass68O anonymousClass68O) {
        DLog.d(DLogTag.LIVE, "Completed LiveSwap", new Object[0]);
        AnonymousClass68O anonymousClass68O2 = anonymousClass68O;
        if (!AnonymousClass68O.m29151K(anonymousClass68O2)) {
            if (anonymousClass68O2.f72091G != null) {
                AnonymousClass68O.m29154N(anonymousClass68O2, BroadcastType.LIVESWAP_RTC);
                anonymousClass68O2.f72091G.UWA();
                AnonymousClass68O.m29152L(anonymousClass68O2, AnonymousClass5MI.LIVE_SWAP);
                AnonymousClass3AL.C(anonymousClass68O2.f72115e, anonymousClass68O2.m29163E());
                anonymousClass68O2.f72115e = null;
                if (anonymousClass68O2.f72086B != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass5aa.m27728B(anonymousClass68O2.f72097M, AnonymousClass5MJ.BROADCAST_LIVESWAP).F("audio_buffer_duration_seconds", Double.toString(anonymousClass68O2.f72086B.f72229I.f63435Q.getAudioQueueDurationInSeconds())).F("video_buffer_duration_seconds", Double.toString(anonymousClass68O2.f72086B.f72229I.f63435Q.getVideoQueueDurationInSeconds())).F("last_audio_pts", Double.toString((double) AnonymousClass5aa.m27734H(anonymousClass68O2.f72086B.f72229I.f63427I))).F("last_video_pts", Double.toString((double) AnonymousClass5aa.m27734H(anonymousClass68O2.f72086B.f72229I.f63429K))).F("last_audio_pts_streamtime", Double.toString((double) AnonymousClass5aa.m27734H(anonymousClass68O2.f72086B.f72229I.f63427I))).F("call_started_to_socket_writability_latency_seconds", Double.toString((double) AnonymousClass5aa.m27734H(elapsedRealtime - anonymousClass68O2.f72090F))).F("call_joined_to_socket_writability_latency_seconds", Double.toString((double) AnonymousClass5aa.m27734H(elapsedRealtime - anonymousClass68O2.f72089E))).R();
                    anonymousClass68O2.f72086B.NJA(false, null);
                    anonymousClass68O2.f72119i = anonymousClass68O2.f72086B.LT();
                    anonymousClass68O2.f72086B = null;
                }
                DLog.d(DLogTag.LIVE, "Complete LiveSwap", new Object[0]);
            }
        }
    }

    /* renamed from: C */
    public static AnonymousClass5OB m29143C(AnonymousClass68O anonymousClass68O) {
        AnonymousClass5ao anonymousClass5ao = anonymousClass68O;
        if (anonymousClass5ao.f72087C == null) {
            int i;
            Context context = anonymousClass5ao.f66745C;
            if (anonymousClass5ao.f66744B.f66654Q > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                i = (int) anonymousClass5ao.f66744B.f66654Q;
            } else {
                i = ((Integer) AnonymousClass0CC.kS.H(anonymousClass5ao.f66751I)).intValue();
            }
            AnonymousClass4u4 anonymousClass4u4 = new AnonymousClass4u4(anonymousClass5ao.f66751I.f1759C, ((Integer) anonymousClass5ao.f66744B.f66643F.first).intValue(), ((Integer) anonymousClass5ao.f66744B.f66643F.second).intValue(), false, AnonymousClass1P3.B(new AnonymousClass670(i, (int) ((((float) (anonymousClass5ao.f72109Y.f50467r / JsonMappingException.MAX_REFS_TO_LIST)) / 100.0f) * ((float) 120)), (int) ((((float) (anonymousClass5ao.f72109Y.f50467r / JsonMappingException.MAX_REFS_TO_LIST)) / 100.0f) * ((float) 120))), anonymousClass5ao.f66751I));
            anonymousClass4u4.f58325D.f58308H = false;
            AnonymousClass5aZ anonymousClass5aZ = anonymousClass5ao.f66744B;
            AnonymousClass1ax anonymousClass1ax = anonymousClass5ao.f72116f;
            AnonymousClass5PF anonymousClass5PF = anonymousClass5ao.f72105U;
            AnonymousClass1XZ anonymousClass1XZ = anonymousClass5ao.f72117g;
            AnonymousClass5O9 anonymousClass5O9 = anonymousClass5ao.f72099O;
            AnonymousClass3oO anonymousClass3oO = anonymousClass5ao.f72113c;
            AnonymousClass5PF anonymousClass5PF2 = anonymousClass5PF;
            AnonymousClass1XZ anonymousClass1XZ2 = anonymousClass1XZ;
            AnonymousClass5O9 anonymousClass5O92 = anonymousClass5O9;
            AnonymousClass5aZ anonymousClass5aZ2 = anonymousClass5aZ;
            AnonymousClass1ax anonymousClass1ax2 = anonymousClass1ax;
            Context context2 = context;
            anonymousClass5ao.f72087C = new AnonymousClass68p(context2, anonymousClass4u4, anonymousClass5aZ2, anonymousClass1ax2, anonymousClass5PF2, anonymousClass1XZ2, anonymousClass5O92, anonymousClass3oO, anonymousClass5ao.f72093I.f4259C, ((Boolean) AnonymousClass0CC.TS.H(anonymousClass5ao.f66751I)).booleanValue());
        }
        return anonymousClass5ao.f72087C;
    }

    /* renamed from: C */
    public final void m29161C() {
        if (!AnonymousClass68O.m29151K(this)) {
            Runnable runnable = this.f72104T;
            if (runnable != null) {
                AnonymousClass0OR.G(this.f72092H, runnable, -1644273960);
            }
            this.f72108X.m26379A();
            AnonymousClass68O.m29156P(this);
            m29159S(true, new AnonymousClass68H(this));
            this.f72107W = AnonymousClass68N.Stopped;
        }
    }

    /* renamed from: D */
    public static Integer m29144D(AnonymousClass0Q6 anonymousClass0Q6) {
        return anonymousClass0Q6.B() ? Integer.valueOf(((AnonymousClass0Pn) anonymousClass0Q6.f4288C).getStatusCode()) : null;
    }

    /* renamed from: D */
    public final void m29162D(BroadcastFailureType broadcastFailureType, LiveStreamingError liveStreamingError) {
        m29161C();
        AnonymousClass0Dc.R("IgLiveStreamingController", "endBroadcastWithFailure(%s): %s", new Object[]{broadcastFailureType, liveStreamingError});
        this.f72098N.m26385A(liveStreamingError);
        if (!this.f72094J) {
            this.f72094J = true;
            AnonymousClass0Sy.F(new AnonymousClass689(this, broadcastFailureType, liveStreamingError));
        }
    }

    /* renamed from: E */
    public final AnonymousClass3oZ m29163E() {
        AnonymousClass0Q5 anonymousClass0Q5 = this.f72093I;
        return new AnonymousClass3oZ(anonymousClass0Q5 != null ? anonymousClass0Q5.f4259C : null, this.f72091G == this.f72087C, this.f72107W == AnonymousClass68N.Started);
    }

    /* renamed from: E */
    public static String m29145E(AnonymousClass0Q6 anonymousClass0Q6) {
        if (!anonymousClass0Q6.B() || ((AnonymousClass0Pn) anonymousClass0Q6.f4288C).A() == null) {
            return anonymousClass0Q6.A() ? anonymousClass0Q6.f4287B.getMessage() : null;
        } else {
            return ((AnonymousClass0Pn) anonymousClass0Q6.f4288C).A();
        }
    }

    /* renamed from: F */
    public static void m29146F(AnonymousClass68O anonymousClass68O, AnonymousClass0Q6 anonymousClass0Q6) {
        anonymousClass68O.f72093I = (AnonymousClass0Q5) anonymousClass0Q6.f4288C;
        String E = AnonymousClass68O.m29145E(anonymousClass0Q6);
        AnonymousClass0Dc.H("IgLiveStreamingController", "Initializing Broadcast Failure (%d): %s", new Object[]{AnonymousClass68O.m29144D(anonymousClass0Q6), E});
        anonymousClass68O.f72097M.m27738B(false, E);
        Throwable th = anonymousClass0Q6.f4287B;
        AnonymousClass0Q5 anonymousClass0Q5 = anonymousClass68O.f72093I;
        Object obj = 1;
        if (anonymousClass0Q5 == null || anonymousClass0Q5.f4262F != 1) {
            obj = null;
        }
        anonymousClass68O.m29162D(obj != null ? BroadcastFailureType.InitFailureWithUserMessage : BroadcastFailureType.InitFailure, new AnonymousClass5ap("API broadcast Init", E, th));
    }

    /* renamed from: F */
    public final boolean m29164F(Exception exception) {
        if (!(exception instanceof AnonymousClass5Nj)) {
            return false;
        }
        AnonymousClass5Nj anonymousClass5Nj = (AnonymousClass5Nj) exception;
        m29162D(anonymousClass5Nj.f62824B, new AnonymousClass5ap(anonymousClass5Nj.f62825C, anonymousClass5Nj.getMessage(), (Throwable) exception));
        return true;
    }

    /* renamed from: G */
    public final void m29165G() {
        if (!AnonymousClass68O.m29151K(this)) {
            this.f72116f.f20389B = this.f72093I.f4259C;
            try {
                String str;
                int i;
                AnonymousClass5OB C;
                Context context = this.f66745C;
                AnonymousClass0Q5 anonymousClass0Q5 = this.f72093I;
                AnonymousClass5Nl anonymousClass5Nl = this.f72088D;
                int i2 = this.f72112b;
                int i3 = this.f72110Z;
                AnonymousClass0LH.I(anonymousClass0Q5 != null, "Error: execute() called before init().");
                AnonymousClass47L parseFromJson = AnonymousClass47M.parseFromJson("{}");
                parseFromJson.f50428E = anonymousClass0Q5.f4259C;
                parseFromJson.f50451b = anonymousClass0Q5.f4285c;
                Pair F = AnonymousClass2NH.F(anonymousClass0Q5.f4284b, i2, i3);
                parseFromJson.f50472w = String.valueOf(System.currentTimeMillis());
                parseFromJson.f50470u = ((Integer) F.first).intValue();
                parseFromJson.f50469t = ((Integer) F.second).intValue();
                parseFromJson.f50467r = anonymousClass0Q5.f4282Z;
                parseFromJson.f50468s = anonymousClass0Q5.f4283a;
                parseFromJson.f50466q = 0;
                parseFromJson.f50426C = "baseline";
                if (anonymousClass0Q5.f4277U != null) {
                    str = anonymousClass0Q5.f4277U;
                } else {
                    str = AnonymousClass26l.B(context.getResources(), C0164R.raw.instavideo_arb);
                }
                parseFromJson.f50465p = str;
                parseFromJson.f50461l = anonymousClass0Q5.f4278V;
                parseFromJson.f50464o = anonymousClass0Q5.f4281Y;
                parseFromJson.f50462m = anonymousClass0Q5.f4279W;
                parseFromJson.f50450a = anonymousClass0Q5.f4268L;
                if (anonymousClass0Q5.f4280X > 0) {
                    i = anonymousClass0Q5.f4280X;
                } else {
                    i = ((Integer) AnonymousClass0CC.OQ.G()).intValue();
                }
                parseFromJson.f50463n = i;
                parseFromJson.f50453d = anonymousClass0Q5.f4269M;
                parseFromJson.f50455f = anonymousClass0Q5.f4271O;
                parseFromJson.f50456g = anonymousClass0Q5.f4272P;
                parseFromJson.f50459j = anonymousClass0Q5.f4275S;
                parseFromJson.f50460k = anonymousClass0Q5.f4276T;
                parseFromJson.f50454e = anonymousClass0Q5.f4270N;
                parseFromJson.f50457h = anonymousClass0Q5.f4273Q;
                parseFromJson.f50458i = anonymousClass0Q5.f4274R;
                parseFromJson.f50431H = Integer.valueOf(anonymousClass0Q5.f4260D != null ? anonymousClass0Q5.f4260D.intValue() : 60);
                parseFromJson.f50432I = Integer.valueOf(anonymousClass0Q5.f4261E != null ? anonymousClass0Q5.f4261E.intValue() : 3);
                parseFromJson.f50471v = anonymousClass0Q5.f4286d;
                parseFromJson.f50425B = anonymousClass0Q5.f4258B;
                if (anonymousClass5Nl.f62842F) {
                    parseFromJson.f50447X = Boolean.valueOf(true);
                    parseFromJson.f50433J = 48000;
                    parseFromJson.f50434K = 1;
                    parseFromJson.f50435L = 0;
                    parseFromJson.f50436M = 44100;
                    parseFromJson.f50441R = 24;
                    int B = AnonymousClass68Q.m29178B(anonymousClass5Nl.f62841E, parseFromJson.f50470u);
                    if (i2 < B && ((Boolean) AnonymousClass0CC.pR.G()).booleanValue()) {
                        B = i2;
                    }
                    Pair F2 = AnonymousClass2NH.F(B, i2, i3);
                    parseFromJson.f50443T = ((Integer) F2.first).intValue();
                    parseFromJson.f50442S = ((Integer) F2.second).intValue();
                    parseFromJson.f50440Q = (int) (((float) (parseFromJson.f50443T * parseFromJson.f50442S)) * anonymousClass5Nl.f62839C);
                }
                parseFromJson.f50444U = anonymousClass0Q5.f4264H;
                parseFromJson.f50445V = anonymousClass0Q5.f4265I;
                parseFromJson.f50446W = anonymousClass0Q5.f4266J;
                Writer stringWriter = new StringWriter();
                JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
                createGenerator.writeStartObject();
                if (parseFromJson.f50451b != null) {
                    createGenerator.writeStringField("rtmp_publish_url", parseFromJson.f50451b);
                }
                if (parseFromJson.f50472w != null) {
                    createGenerator.writeStringField("social_context_entity_id", parseFromJson.f50472w);
                }
                if (parseFromJson.f50428E != null) {
                    createGenerator.writeStringField("id", parseFromJson.f50428E);
                }
                if (parseFromJson.f50449Z != null) {
                    createGenerator.writeNumberField("min_broadacst_duration", parseFromJson.f50449Z.longValue());
                }
                if (parseFromJson.f50448Y != null) {
                    createGenerator.writeNumberField("max_time_in_seconds", parseFromJson.f50448Y.longValue());
                }
                if (parseFromJson.f50459j != null) {
                    createGenerator.writeNumberField("speed_test_ui_timeout", parseFromJson.f50459j.longValue());
                }
                if (parseFromJson.f50455f != null) {
                    createGenerator.writeNumberField("stream_network_speed_test_payload_chunk_size_in_bytes", parseFromJson.f50455f.intValue());
                }
                if (parseFromJson.f50456g != null) {
                    createGenerator.writeNumberField("stream_network_speed_test_payload_size_in_bytes", parseFromJson.f50456g.intValue());
                }
                if (parseFromJson.f50460k != null) {
                    createGenerator.writeNumberField("stream_network_speed_test_payload_timeout_in_seconds", parseFromJson.f50460k.intValue());
                }
                if (parseFromJson.f50431H != null) {
                    createGenerator.writeNumberField("stream_network_connection_retry_count", parseFromJson.f50431H.intValue());
                }
                if (parseFromJson.f50432I != null) {
                    createGenerator.writeNumberField("stream_network_connection_retry_delay_in_seconds", parseFromJson.f50432I.intValue());
                }
                if (parseFromJson.f50454e != null) {
                    createGenerator.writeNumberField("speed_test_minimum_bandwidth_threshold", parseFromJson.f50454e.doubleValue());
                }
                if (parseFromJson.f50457h != null) {
                    createGenerator.writeNumberField("speed_test_retry_max_count", parseFromJson.f50457h.intValue());
                }
                if (parseFromJson.f50458i != null) {
                    createGenerator.writeNumberField("speed_test_retry_time_delay", parseFromJson.f50458i.doubleValue());
                }
                if (parseFromJson.f50453d != null) {
                    createGenerator.writeBooleanField("disable_speed_test", parseFromJson.f50453d.booleanValue());
                }
                if (parseFromJson.f50452c != null) {
                    createGenerator.writeNumberField("send_stream_interrupted_interval_in_seconds", parseFromJson.f50452c.longValue());
                }
                if (parseFromJson.f50447X != null) {
                    createGenerator.writeBooleanField("stream_disk_recording_enabled", parseFromJson.f50447X.booleanValue());
                }
                if (parseFromJson.f50430G != null) {
                    createGenerator.writeNumberField("client_render_duration_ms", parseFromJson.f50430G.longValue());
                }
                if (parseFromJson.f50429F != null) {
                    createGenerator.writeNumberField("broadcaster_interruption_limit_in_seconds", parseFromJson.f50429F.intValue());
                }
                if (parseFromJson.f50426C != null) {
                    createGenerator.writeStringField("android_video_profile", parseFromJson.f50426C);
                }
                createGenerator.writeNumberField("stream_video_width", parseFromJson.f50470u);
                createGenerator.writeNumberField("stream_video_height", parseFromJson.f50469t);
                createGenerator.writeNumberField("stream_video_bit_rate", parseFromJson.f50467r);
                createGenerator.writeNumberField("stream_video_fps", parseFromJson.f50468s);
                createGenerator.writeNumberField("stream_video_allow_b_frames", parseFromJson.f50466q);
                if (parseFromJson.f50450a != null) {
                    createGenerator.writeBooleanField("pass_thru_enabled", parseFromJson.f50450a.booleanValue());
                }
                if (parseFromJson.f50465p != null) {
                    createGenerator.writeStringField("stream_video_adaptive_bitrate_config", parseFromJson.f50465p);
                }
                createGenerator.writeNumberField("stream_audio_sample_rate", parseFromJson.f50464o);
                createGenerator.writeNumberField("stream_audio_channels", parseFromJson.f50462m);
                createGenerator.writeNumberField("stream_audio_bit_rate", parseFromJson.f50461l);
                createGenerator.writeNumberField("stream_audio_profile", parseFromJson.f50463n);
                if (parseFromJson.f50437N != null) {
                    createGenerator.writeNumberField("stream_disk_recording_available_space_threshold_mb", parseFromJson.f50437N.doubleValue());
                }
                if (parseFromJson.f50439P != null) {
                    createGenerator.writeNumberField("stream_disk_recording_space_check_interval_in_seconds", parseFromJson.f50439P.intValue());
                }
                createGenerator.writeNumberField("stream_disk_recording_video_width", parseFromJson.f50443T);
                createGenerator.writeNumberField("stream_disk_recording_video_height", parseFromJson.f50442S);
                createGenerator.writeNumberField("stream_disk_recording_video_bitrate", parseFromJson.f50440Q);
                createGenerator.writeNumberField("stream_disk_recording_video_fps", parseFromJson.f50441R);
                createGenerator.writeNumberField("stream_disk_recording_audio_sample_rate", parseFromJson.f50436M);
                createGenerator.writeNumberField("stream_disk_recording_audio_channels", parseFromJson.f50434K);
                createGenerator.writeNumberField("stream_disk_recording_audio_bitrate", parseFromJson.f50433J);
                createGenerator.writeNumberField("stream_disk_recording_audio_profile", parseFromJson.f50435L);
                if (parseFromJson.f50471v != null) {
                    createGenerator.writeBooleanField("connect_with_1rtt", parseFromJson.f50471v.booleanValue());
                }
                if (parseFromJson.f50425B != null) {
                    createGenerator.writeBooleanField("allow_resolution_change", parseFromJson.f50425B.booleanValue());
                }
                if (parseFromJson.f50444U != null) {
                    createGenerator.writeBooleanField("live_trace_enabled", parseFromJson.f50444U.booleanValue());
                }
                if (parseFromJson.f50445V != null) {
                    createGenerator.writeNumberField("live_trace_sample_interval_in_seconds", parseFromJson.f50445V.intValue());
                }
                if (parseFromJson.f50446W != null) {
                    createGenerator.writeNumberField("live_trace_sampling_source", parseFromJson.f50446W.intValue());
                }
                createGenerator.writeEndObject();
                createGenerator.close();
                this.f72109Y = AnonymousClass47M.parseFromJson(stringWriter.toString());
                this.f66744B.m27725F(this.f72109Y.f50470u, this.f72109Y.f50469t);
                if (this.f72114d) {
                    C = AnonymousClass68O.m29143C(this);
                } else {
                    if (this.f72086B == null) {
                        this.f72086B = new AnonymousClass68w(this.f66745C, this.f66750H.getLooper(), this.f72109Y, this.f72088D, this.f72112b, this.f72110Z, this.f72097M, this.f66744B, this.f72098N, this.f72099O);
                    }
                    C = this.f72086B;
                }
                this.f72091G = C;
                AnonymousClass68O.m29154N(this, this.f72091G.FJ());
                this.f72091G.DW(new AnonymousClass68K(this));
            } catch (Exception e) {
                m29162D(BroadcastFailureType.InitFailure, new AnonymousClass5ap("ApiInitBroadcast", e));
            }
        }
    }

    /* renamed from: G */
    public static void m29147G(AnonymousClass68O anonymousClass68O, AnonymousClass0Q5 anonymousClass0Q5) {
        anonymousClass68O.f72093I = anonymousClass0Q5;
        AnonymousClass5aa anonymousClass5aa = anonymousClass68O.f72097M;
        String str = anonymousClass0Q5.f4259C;
        anonymousClass5aa.f66659D = str;
        AnonymousClass0dz anonymousClass0dz = anonymousClass5aa.f66671P;
        AnonymousClass0e1 anonymousClass0e1 = AnonymousClass0uY.f11854L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("broadcast_id:");
        stringBuilder.append(anonymousClass5aa.f66659D);
        anonymousClass0dz.B(anonymousClass0e1, stringBuilder.toString());
        AnonymousClass0Gn.B().A("last_broadcast_id", str);
        AnonymousClass0Gn.B().A("last_broadcast_waterfall_id", anonymousClass5aa.f66705x.E());
        anonymousClass68O.f72097M.m27738B(true, null);
        anonymousClass68O.m29165G();
    }

    /* renamed from: H */
    public static void m29148H(AnonymousClass68O anonymousClass68O) {
        anonymousClass68O.f72097M.f66673R = true;
        if (anonymousClass68O.f72118h) {
            anonymousClass68O.f72118h = false;
            AnonymousClass68O.m29152L(anonymousClass68O, AnonymousClass5MI.CONNECTION);
        }
    }

    /* renamed from: H */
    public final void m29166H(boolean z) {
        this.f72097M.f66663H = z ? AnonymousClass5MD.FRONT : AnonymousClass5MD.BACK;
    }

    /* renamed from: I */
    public final void m29167I(AnonymousClass3AL anonymousClass3AL) {
        AnonymousClass0LH.I(this.f72115e == null, "Only one invite is allowed simultaneously.");
        AnonymousClass3oZ E = m29163E();
        if (E.f44810C) {
            anonymousClass3AL.B(E);
            return;
        }
        this.f72115e = anonymousClass3AL;
        DLog.d(DLogTag.LIVE, "Start LiveSwap", new Object[0]);
        AnonymousClass5aa.m27728B(this.f72097M, AnonymousClass5MJ.BROADCAST_LIVESWAP_STARTED).R();
        if (!this.f72100P) {
            Object obj = this.f72091G;
            if (obj != null && this.f72086B == obj) {
                this.f72100P = true;
                AnonymousClass68O.m29150J(this, AnonymousClass5MI.LIVE_SWAP, false, null, new AnonymousClass68J(this));
                AnonymousClass68O.m29154N(this, BroadcastType.LIVESWAP_TRANSITION);
            }
        }
    }

    /* renamed from: I */
    public static void m29149I(AnonymousClass68O anonymousClass68O, String str) {
        anonymousClass68O.f72097M.f66673R = false;
        if (!anonymousClass68O.f72118h) {
            anonymousClass68O.f72118h = true;
            AnonymousClass68O.m29150J(anonymousClass68O, AnonymousClass5MI.CONNECTION, true, str, null);
        }
    }

    /* renamed from: J */
    public final void m29168J(AnonymousClass5LW anonymousClass5LW) {
        this.f66748F.IWA(anonymousClass5LW.f62421F, anonymousClass5LW.f62420E);
        this.f66744B.m27724E(anonymousClass5LW.f62418C, anonymousClass5LW.f62417B);
    }

    /* renamed from: J */
    public static void m29150J(AnonymousClass68O anonymousClass68O, AnonymousClass5MI anonymousClass5MI, boolean z, String str, AnonymousClass3AG anonymousClass3AG) {
        if (anonymousClass68O.f72107W == AnonymousClass68N.Started) {
            if (!anonymousClass68O.m29158R()) {
                anonymousClass68O.f72108X.f62858E = true;
                anonymousClass68O.m29159S(z, anonymousClass3AG);
                AnonymousClass5aa anonymousClass5aa = anonymousClass68O.f72097M;
                AnonymousClass0OR.G(anonymousClass5aa.f66699r, anonymousClass5aa.f66700s, -1027356553);
                AnonymousClass5aa.m27736J(anonymousClass5aa);
                AnonymousClass5aa anonymousClass5aa2 = anonymousClass68O.f72097M;
                if (anonymousClass5MI == AnonymousClass5MI.CONNECTION) {
                    anonymousClass5aa2.f66668M.incrementAndGet();
                }
                AnonymousClass5aa.m27729C(anonymousClass5aa2, AnonymousClass5MJ.BROADCAST_PAUSED).F("reason", anonymousClass5MI.f62557B).F("reason_info", str).R();
                anonymousClass68O.m29170L();
            }
        }
    }

    /* renamed from: K */
    public final void m29169K(AnonymousClass5LW anonymousClass5LW, Exception exception) {
        Object obj = exception == null ? 1 : null;
        if (obj != null) {
            m29166H(anonymousClass5LW.f62419D);
            AnonymousClass0HV.D(this.f66751I).PA(anonymousClass5LW.f62419D);
            AnonymousClass5aa anonymousClass5aa = this.f72097M;
            AnonymousClass5MD anonymousClass5MD = anonymousClass5LW.f62419D ? AnonymousClass5MD.FRONT : AnonymousClass5MD.BACK;
            anonymousClass5aa.f66688g.incrementAndGet();
            AnonymousClass5aa.m27728B(anonymousClass5aa, AnonymousClass5MJ.BROADCAST_CAMERA_FLIP).F("camera", anonymousClass5MD.f62519B).R();
            this.f72097M.m27741E("switchCamera", "{'width': %d, 'height': %d, 'front':'%b'}", Integer.valueOf(anonymousClass5LW.f62418C), Integer.valueOf(anonymousClass5LW.f62417B), Boolean.valueOf(anonymousClass5LW.f62419D));
        } else {
            this.f72098N.m26385A(new AnonymousClass5ap("switchCamera", exception));
        }
        if (obj != null) {
            m29168J(anonymousClass5LW);
        }
    }

    /* renamed from: K */
    public static boolean m29151K(AnonymousClass68O anonymousClass68O) {
        return anonymousClass68O.f72107W == AnonymousClass68N.Stopped;
    }

    /* renamed from: L */
    public final void m29170L() {
        if (!m29158R() || this.f72100P) {
            AnonymousClass0Sy.F(new AnonymousClass68C(this));
        } else {
            AnonymousClass0Sy.F(new AnonymousClass68A(this));
        }
    }

    /* renamed from: L */
    public static void m29152L(AnonymousClass68O anonymousClass68O, AnonymousClass5MI anonymousClass5MI) {
        if (!anonymousClass68O.m29158R() || anonymousClass68O.f72107W != AnonymousClass68N.Started || anonymousClass68O.f72118h) {
            return;
        }
        if (!anonymousClass68O.f72095K) {
            anonymousClass68O.f72108X.f62858E = false;
            AnonymousClass3AL anonymousClass68F = new AnonymousClass68F(anonymousClass68O, anonymousClass5MI);
            AnonymousClass5OB anonymousClass5OB = anonymousClass68O.f72091G;
            if (anonymousClass5OB != null) {
                anonymousClass5OB.ZUA(new AnonymousClass67z(anonymousClass68O, anonymousClass68F));
            } else {
                anonymousClass68F.A(new IllegalStateException("mCurrentStreamingSession == NULL"));
            }
        }
    }

    /* renamed from: M */
    public static void m29153M(AnonymousClass68O anonymousClass68O, String str, Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rollback Live Swap: ");
        stringBuilder.append(str);
        AnonymousClass0Dc.G("IgLiveStreamingController", stringBuilder.toString(), exception);
        AnonymousClass5aa anonymousClass5aa = anonymousClass68O.f72097M;
        AnonymousClass5aa.m27728B(anonymousClass5aa, AnonymousClass5MJ.BROADCAST_LIVESWAP_FAILED).F("reason", str).F("error", exception.getMessage()).B("remote_ended", AnonymousClass5aa.m27735I(Boolean.valueOf(false))).R();
        AnonymousClass68O.m29154N(anonymousClass68O, BroadcastType.LIVESWAP_RTMP);
        AnonymousClass3AL.B(anonymousClass68O.f72115e, exception);
        anonymousClass68O.f72115e = null;
        anonymousClass68O.f72100P = false;
        AnonymousClass68O.m29152L(anonymousClass68O, AnonymousClass5MI.LIVE_SWAP);
        AnonymousClass68p anonymousClass68p = anonymousClass68O.f72087C;
        if (anonymousClass68p != null) {
            anonymousClass68p.NJA(false, null);
            anonymousClass68O.f72087C = null;
        }
    }

    /* renamed from: N */
    public static void m29154N(AnonymousClass68O anonymousClass68O, BroadcastType broadcastType) {
        AnonymousClass5aa anonymousClass5aa = anonymousClass68O.f72097M;
        String name = broadcastType.name();
        anonymousClass5aa.f66661F = name;
        AnonymousClass0Gn.B().A("last_broadcast_type", name);
        AnonymousClass5aZ anonymousClass5aZ = anonymousClass68O.f66744B;
        anonymousClass5aZ.f66639B = broadcastType.name();
        AnonymousClass5aZ.m27719C(anonymousClass5aZ);
    }

    /* renamed from: O */
    public static void m29155O(AnonymousClass68O anonymousClass68O) {
        if (anonymousClass68O.f72107W == AnonymousClass68N.Begin) {
            anonymousClass68O.f72107W = AnonymousClass68N.Initializing;
            IgLiveBroadcastType igLiveBroadcastType = anonymousClass68O.f72114d ? IgLiveBroadcastType.RTC : IgLiveBroadcastType.RTMP_SWAP_ENABLED;
            int i = anonymousClass68O.f72112b;
            int i2 = anonymousClass68O.f72110Z;
            AnonymousClass5aa anonymousClass5aa = anonymousClass68O.f72097M;
            anonymousClass5aa.f66657B = AnonymousClass0Gd.E();
            AnonymousClass5MQ.m26328C(AnonymousClass5aa.m27731E(anonymousClass5aa, AnonymousClass5MJ.BROADCAST_CREATE_ATTEMPT), anonymousClass5aa.f66665J, anonymousClass5aa.f66670O).R();
            AnonymousClass5aa.m27733G(anonymousClass5aa, AnonymousClass5MH.CREATE_ATTEMPT);
            if (((Boolean) AnonymousClass0CC.lR.H(anonymousClass68O.f66751I)).booleanValue()) {
                AnonymousClass0JQ.f2915B.Q(new AnonymousClass1RL(anonymousClass68O, i));
            } else {
                AnonymousClass0GA C = AnonymousClass0Pz.C(anonymousClass68O.f66751I, igLiveBroadcastType, anonymousClass68O.f72088D.f62840D, i, i2, anonymousClass68O.f72088D.f62838B);
                C.f2849B = new AnonymousClass0Qi(anonymousClass68O);
                AnonymousClass0Px.B(anonymousClass68O.f66745C, anonymousClass68O.f72101Q, C);
            }
        }
        if (!AnonymousClass68O.m29151K(anonymousClass68O) && anonymousClass68O.f72111a != null) {
            anonymousClass68O.f66748F.dSA(anonymousClass68O.f72111a);
        }
    }

    /* renamed from: P */
    public static void m29156P(AnonymousClass68O anonymousClass68O) {
        anonymousClass68O.f66748F.releaseSurface();
        anonymousClass68O.f66747E.wUA();
    }

    /* renamed from: Q */
    public static void m29157Q(AnonymousClass68O anonymousClass68O) {
        if (!AnonymousClass68O.m29151K(anonymousClass68O)) {
            long j = anonymousClass68O.f72119i;
            AnonymousClass5OB anonymousClass5OB = anonymousClass68O.f72086B;
            if (anonymousClass5OB != null) {
                j += anonymousClass5OB.LT();
            }
            AnonymousClass68p anonymousClass68p = anonymousClass68O.f72087C;
            if (anonymousClass68p != null) {
                j += anonymousClass68p.LT();
            }
            anonymousClass68O.f72097M.f66658C = j;
            AnonymousClass0Sy.F(new AnonymousClass5O6(anonymousClass68O, j));
            AnonymousClass5aZ anonymousClass5aZ = anonymousClass68O.f66744B;
            anonymousClass5aZ.f66652O = j;
            AnonymousClass5aZ.m27719C(anonymousClass5aZ);
        }
    }

    public final void Qo(SurfaceTexture surfaceTexture) {
        this.f66747E.WUA(this.f66745C, surfaceTexture, this.f72112b, this.f72110Z, AnonymousClass0HV.D(this.f66751I).S(), new AnonymousClass68M(this));
        AnonymousClass68O.m29152L(this, AnonymousClass5MI.APP_INACTIVE);
    }

    /* renamed from: R */
    private boolean m29158R() {
        return this.f72108X.f62858E;
    }

    /* renamed from: S */
    private void m29159S(boolean z, AnonymousClass3AG anonymousClass3AG) {
        this.f66748F.yUA();
        this.f72120j = new AnonymousClass67y(this, z, anonymousClass3AG);
    }

    public final void Yk() {
        AnonymousClass3AG anonymousClass3AG = this.f72120j;
        if (anonymousClass3AG != null) {
            anonymousClass3AG.B();
            this.f72120j = null;
        }
    }

    public final void hs() {
        AnonymousClass5OB anonymousClass5OB = this.f72091G;
        if (anonymousClass5OB != null) {
            anonymousClass5OB.Pc();
        }
    }

    public final void tm(int i, int i2, int i3, int i4) {
        i = this.f66744B;
        i.f66646I = Integer.valueOf(i4);
        AnonymousClass5aZ.m27719C(i);
    }
}

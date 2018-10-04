package com.instagram.video.videocall.activity;

import X.AnonymousClass0CB;
import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0E6;
import X.AnonymousClass0EE;
import X.AnonymousClass0F4;
import X.AnonymousClass0FZ;
import X.AnonymousClass0G5;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HT;
import X.AnonymousClass0IW;
import X.AnonymousClass0Iz;
import X.AnonymousClass0J7;
import X.AnonymousClass0LH;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Qp;
import X.AnonymousClass0Qz;
import X.AnonymousClass0T1;
import X.AnonymousClass0Un;
import X.AnonymousClass0bz;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass0vm;
import X.AnonymousClass1RN;
import X.AnonymousClass1Xh;
import X.AnonymousClass1Y1;
import X.AnonymousClass38H;
import X.AnonymousClass3ig;
import X.AnonymousClass5aE;
import X.AnonymousClass69V;
import X.AnonymousClass69X;
import X.AnonymousClass69d;
import X.AnonymousClass69e;
import X.AnonymousClass69t;
import X.AnonymousClass6AV;
import X.AnonymousClass6AY;
import X.AnonymousClass6AZ;
import X.AnonymousClass6Af;
import X.AnonymousClass6Ag;
import X.AnonymousClass6Ah;
import X.AnonymousClass6An;
import X.AnonymousClass6Aq;
import X.AnonymousClass6Ar;
import X.AnonymousClass6As;
import X.AnonymousClass6At;
import X.AnonymousClass6Au;
import X.AnonymousClass6Av;
import X.AnonymousClass6Aw;
import X.AnonymousClass6Ax;
import X.AnonymousClass6Ay;
import X.AnonymousClass6B4;
import X.AnonymousClass6B7;
import X.AnonymousClass6BF;
import X.AnonymousClass6BI;
import X.AnonymousClass6BK;
import X.AnonymousClass6BV;
import X.AnonymousClass6BX;
import X.AnonymousClass6Bg;
import X.AnonymousClass6Bh;
import X.AnonymousClass6Bj;
import X.AnonymousClass6GP;
import X.AnonymousClass6GQ;
import X.AnonymousClass6GR;
import X.AnonymousClass6GS;
import X.AnonymousClass6GT;
import X.AnonymousClass6GX;
import X.AnonymousClass6Go;
import X.AnonymousClass6Gp;
import X.AnonymousClass6Gq;
import X.AnonymousClass6Gw;
import X.AnonymousClass6Gx;
import X.AnonymousClass6Gy;
import X.AnonymousClass6H1;
import X.AnonymousClass6H3;
import X.AnonymousClass6H4;
import X.AnonymousClass6H8;
import X.AnonymousClass6HX;
import android.app.Activity;
import android.app.PictureInPictureParams.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.Rational;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.ui.widget.pilelayout.PileLayout;
import com.instagram.video.videocall.intf.VideoCallSource;
import com.instagram.video.videocall.service.VideoCallService;
import com.instagram.video.videocall.view.VideoCallSurfaceContainerView;
import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

public class VideoCallActivity extends IgFragmentActivity implements AnonymousClass0EE {
    /* renamed from: B */
    public VideoCallSource f4483B;
    /* renamed from: C */
    public AnonymousClass6GQ f4484C;
    /* renamed from: D */
    public boolean f4485D;
    /* renamed from: E */
    public boolean f4486E;
    /* renamed from: F */
    public boolean f4487F;
    /* renamed from: G */
    public AnonymousClass0Cm f4488G;
    /* renamed from: H */
    public VideoCallAudience f4489H;
    /* renamed from: I */
    public VideoCallInfo f4490I;
    /* renamed from: J */
    public AnonymousClass0Qz f4491J;
    /* renamed from: K */
    public String f4492K;
    /* renamed from: L */
    public AnonymousClass6Aw f4493L;
    /* renamed from: M */
    public AnonymousClass6H1 f4494M;
    /* renamed from: N */
    private boolean f4495N;
    /* renamed from: O */
    private final AnonymousClass0Un f4496O = new AnonymousClass69V(this);
    /* renamed from: P */
    private final AnonymousClass6GP f4497P = new AnonymousClass6GP(this);
    /* renamed from: Q */
    private boolean f4498Q;
    /* renamed from: R */
    private AnonymousClass6AV f4499R;

    public final String getModuleName() {
        return "video_call";
    }

    /* renamed from: B */
    public static Intent m4063B(Context context, String str, VideoCallSource videoCallSource, VideoCallAudience videoCallAudience, VideoCallInfo videoCallInfo) {
        Intent intent = new Intent(context, VideoCallActivity.class);
        intent.putExtra("IgSessionManager.USER_ID", str);
        intent.putExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST", videoCallAudience);
        if (videoCallInfo != null) {
            intent.putExtra("VideoCallActivity.ARGUMENT_CALL_ID", videoCallInfo);
        }
        intent.putExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE", videoCallSource);
        intent.setExtrasClassLoader(VideoCallActivity.class.getClassLoader());
        intent.addFlags(75563008);
        if (AnonymousClass0T1.m4441B(context, Activity.class) == null) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    /* renamed from: C */
    public static void m4064C(VideoCallActivity videoCallActivity, AnonymousClass69X anonymousClass69X) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("finishCallActivity: requesting to destroy activity ");
        stringBuilder.append(anonymousClass69X);
        stringBuilder.toString();
        AnonymousClass0Iz.f2854L.m2407J(videoCallActivity, anonymousClass69X.A());
        if ((VERSION.SDK_INT >= 21 ? 1 : null) != null) {
            videoCallActivity.finishAndRemoveTask();
        } else {
            videoCallActivity.finish();
        }
        videoCallActivity.overridePendingTransition(0, 0);
    }

    /* renamed from: D */
    public static void m4065D(VideoCallActivity videoCallActivity) {
        if (videoCallActivity.f4499R.D() && videoCallActivity.f4499R.C() && videoCallActivity.f4493L.A()) {
            Rational rational = new Rational(AnonymousClass0Nm.m3431J(videoCallActivity), AnonymousClass0Nm.m3430I(videoCallActivity));
            Builder builder = new Builder();
            builder.setAspectRatio(rational);
            try {
                videoCallActivity.f4485D = videoCallActivity.enterPictureInPictureMode(builder.build());
                AnonymousClass0Iz.f2854L.m2407J(videoCallActivity, AnonymousClass69X.f72330H.A());
            } catch (Throwable e) {
                AnonymousClass0Dc.m1244G("VideoCallActivity", "Failed to enter PIP mode", e);
                videoCallActivity.f4485D = false;
            }
        }
    }

    /* renamed from: E */
    public static void m4066E(VideoCallActivity videoCallActivity) {
        videoCallActivity.f4495N = false;
        AnonymousClass6Aw anonymousClass6Aw = videoCallActivity.f4493L;
        AnonymousClass6Gx anonymousClass6Gx = new AnonymousClass6Gx(anonymousClass6Aw);
        anonymousClass6Aw.f72641B.A(anonymousClass6Gx);
        anonymousClass6Aw.f72642C.f72812C = new AnonymousClass6Gy(anonymousClass6Aw, anonymousClass6Gx);
        anonymousClass6Aw.f72642C.A();
        if (!videoCallActivity.f4486E) {
            AnonymousClass6H1 anonymousClass6H1 = videoCallActivity.f4494M;
            anonymousClass6H1.f73875G.E(videoCallActivity.f4483B);
        }
    }

    /* renamed from: F */
    public static void m4067F(VideoCallActivity videoCallActivity) {
        if (VERSION.SDK_INT >= 21) {
            videoCallActivity.getWindow().getDecorView().setSystemUiVisibility(1792);
            AnonymousClass0vm.m8369D(videoCallActivity, AnonymousClass0Ca.m937C(videoCallActivity, videoCallActivity.f4486E ? C0164R.color.transparent : C0164R.color.black_50_transparent));
        }
    }

    public final void onBackPressed() {
        if (this.f4486E) {
            m4064C(this, AnonymousClass69X.f72332J);
            return;
        }
        if (!this.f4494M.f73870B.f73832B.f72677B.m5670E()) {
            m4065D(this);
        }
        if (!this.f4485D) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        View findViewById;
        int B = AnonymousClass0cQ.m5852B(this, -1761164523);
        Intent intent = getIntent();
        this.f4486E = intent.getBooleanExtra("VideoCallActivity.VIDEO_CALL_ACTIVITY_ARGUMENT_RING", false);
        Window window = getWindow();
        boolean z = this.f4486E;
        window.addFlags(524288);
        if (z) {
            window.addFlags(6291584);
        }
        super.onCreate(bundle);
        setContentView(C0164R.layout.layout_videocall_capture);
        AnonymousClass0G5.m1728I(r0);
        m4067F(r0);
        setVolumeControlStream(Process.WAIT_RESULT_TIMEOUT);
        r0.f4487F = intent.getBooleanExtra("VideoCallActivity.ARGUMENT_CALL_RESUME", false);
        r0.f4490I = (VideoCallInfo) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_CALL_ID");
        r0.f4489H = (VideoCallAudience) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST");
        r0.f4492K = intent.getStringExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_ID");
        r0.f4488G = AnonymousClass0Ce.m950G((Bundle) AnonymousClass0LH.m2927E(getIntent().getExtras()));
        r0.f4483B = (VideoCallSource) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE");
        r0.f4491J = AnonymousClass0Qz.m4087C(r0.f4488G, getApplicationContext());
        if (r0.f4487F) {
            AnonymousClass0Iz.f2854L.m2407J(r0, "ONGOING_VIDEO_CALL_NOTIFICATION");
        }
        View view = (ViewGroup) findViewById(C0164R.id.videocall_root);
        AnonymousClass0mE.f9733B.m9031f(view, new AnonymousClass1RN(r0));
        View anonymousClass5aE = new AnonymousClass5aE(r0);
        AnonymousClass6GX anonymousClass6GX = new AnonymousClass6GX(r0, r0.f4488G, anonymousClass5aE, anonymousClass5aE, ((Boolean) AnonymousClass0CC.mi.m846H(r0.f4488G)).booleanValue() ? AnonymousClass38H.B(r0, r0.f4488G) : null, ((Integer) AnonymousClass0CC.li.m846H(r0.f4488G)).intValue(), r0.f4491J.f4527F);
        r0.f4499R = new AnonymousClass6AV(getApplicationContext(), VERSION.SDK_INT, r0.f4488G);
        AnonymousClass6HX anonymousClass6HX = new AnonymousClass6HX(r0.f4488G, r0.f4491J, anonymousClass6GX, r0.f4499R, r0.f4497P);
        ViewStub viewStub = (ViewStub) view.findViewById(C0164R.id.videocall_controls_stub);
        if (((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.ki, r0.f4499R.f72530B)).booleanValue()) {
            viewStub.setLayoutResource(C0164R.layout.layout_videocall_controls_redesign);
        } else {
            viewStub.setLayoutResource(C0164R.layout.layout_videocall_controls);
        }
        viewStub.inflate();
        Context context = view.getContext();
        ViewGroup viewGroup = view;
        AnonymousClass6H4 anonymousClass6H4 = new AnonymousClass6H4(context.getResources(), viewGroup, view.findViewById(C0164R.id.top_controls_tray), view.findViewById(C0164R.id.close_button), view.findViewById(C0164R.id.minimize_button), view.findViewById(C0164R.id.add_users_indicator), view.findViewById(C0164R.id.bottom_controls_tray), (ImageView) view.findViewById(C0164R.id.camera_button), (ImageView) view.findViewById(C0164R.id.audio_button), view.findViewById(C0164R.id.camera_switch_button), view.findViewById(C0164R.id.camera_ar_effect_button), new AnonymousClass1Xh(), new AccelerateDecelerateInterpolator(), AnonymousClass0Ca.m939E(context, C0164R.drawable.mic), AnonymousClass0Ca.m939E(context, C0164R.drawable.mic_off), AnonymousClass0Ca.m939E(context, C0164R.drawable.video_camera), AnonymousClass0Ca.m939E(context, C0164R.drawable.video_camera_off), 300);
        AnonymousClass6AV anonymousClass6AV = r0.f4499R;
        boolean B2 = anonymousClass6AV.B();
        boolean A = anonymousClass6AV.A();
        AnonymousClass6Af anonymousClass6Af = new AnonymousClass6Af();
        anonymousClass6Af.f72558B = true;
        anonymousClass6Af.f72559C = true;
        anonymousClass6Af.f72564H = false;
        anonymousClass6Af.f72566J = true;
        anonymousClass6Af.f72563G = true;
        if (B2) {
            anonymousClass6Af.f72565I = true;
        } else {
            anonymousClass6Af.f72565I = false;
        }
        if (A) {
            anonymousClass6Af.f72562F = true;
        } else {
            anonymousClass6Af.f72562F = false;
        }
        AnonymousClass6Ag A2 = anonymousClass6Af.A();
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(C0164R.dimen.videocall_tap_area_vertical_margin);
        AnonymousClass6Gq anonymousClass6Gq = new AnonymousClass6Gq(anonymousClass6H4, anonymousClass6HX, anonymousClass6AV, A2, dimensionPixelSize, ((float) AnonymousClass0Nm.m3430I(r0)) - dimensionPixelSize);
        AnonymousClass6Ar anonymousClass6Ar = new AnonymousClass6Ar(r0.f4488G, anonymousClass6Gq);
        AnonymousClass0Cm anonymousClass0Cm = r0.f4488G;
        PileLayout pileLayout = (PileLayout) view.findViewById(C0164R.id.videocall_participant_indicator_container);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C0164R.id.videocall_participant_indicator_outer_container);
        VideoCallSurfaceContainerView videoCallSurfaceContainerView = (VideoCallSurfaceContainerView) view.findViewById(C0164R.id.videocall_surface_view_frame);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0164R.id.videocall_participants_grid_container);
        TextView textView = (TextView) view.findViewById(C0164R.id.videocall_participant_status_message);
        AnonymousClass6Bg anonymousClass6Bg = new AnonymousClass6Bg(view, ((Boolean) AnonymousClass0CC.Mj.m846H(anonymousClass0Cm)).booleanValue());
        AnonymousClass3ig B3 = AnonymousClass3ig.B(view, C0164R.id.videocall_minimized_calling_stub);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(C0164R.dimen.videocall_avatar_container_margin_side);
        boolean booleanValue = ((Boolean) AnonymousClass0CC.Kj.m846H(anonymousClass0Cm)).booleanValue();
        AnonymousClass6Bh anonymousClass6Bh = new AnonymousClass6Bh(view, pileLayout, frameLayout, textView, videoCallSurfaceContainerView, recyclerView, new AnonymousClass6Aq(), anonymousClass6Bg, B3, dimensionPixelSize2, ((Integer) AnonymousClass0CC.Oj.m846H(anonymousClass0Cm)).intValue(), booleanValue, booleanValue ? ((Boolean) AnonymousClass0CC.Jj.m846H(anonymousClass0Cm)).booleanValue() : false);
        AnonymousClass0Ci B4 = r0.f4488G.m1037B();
        VideoCallAudience videoCallAudience = r0.f4489H;
        AnonymousClass6Ax anonymousClass6Ax = new AnonymousClass6Ax(r0, ((Integer) AnonymousClass0CC.pm.m846H(r0.f4488G)).intValue());
        AnonymousClass6Go anonymousClass6Go = r0.f4491J.f4531J;
        AnonymousClass6H3 anonymousClass6H3 = r0.f4491J.f4541T;
        boolean z2 = !AnonymousClass0CB.m840J() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("show_vc_stats", false);
        AnonymousClass6Gw anonymousClass6Gw = new AnonymousClass6Gw(B4, videoCallAudience, anonymousClass5aE, anonymousClass6Ax, anonymousClass6Bh, anonymousClass6Go, anonymousClass6H3, anonymousClass6HX, anonymousClass6Ar, z2);
        r0.f4484C = new AnonymousClass6GQ(r0);
        AnonymousClass6GR anonymousClass6GR = new AnonymousClass6GR(r0);
        VideoCallAudience videoCallAudience2 = r0.f4489H;
        AnonymousClass6BI anonymousClass6BI = new AnonymousClass6BI(view.getContext(), view, AnonymousClass3ig.B(view, C0164R.id.videocall_minimized_end_stub), AnonymousClass3ig.B(view, C0164R.id.videocall_end_stub), new AnonymousClass1Xh(), new AnonymousClass6BK(view.getContext()), r0.f4488G.m1037B());
        AnonymousClass6GQ anonymousClass6GQ = r0.f4484C;
        AnonymousClass6Au anonymousClass6Au = new AnonymousClass6Au(videoCallAudience2, anonymousClass6BI, anonymousClass6HX, anonymousClass6GQ, new AnonymousClass6At(anonymousClass6GQ), new Handler(Looper.getMainLooper()));
        AnonymousClass0Cm anonymousClass0Cm2 = r0.f4488G;
        Context context2 = view.getContext();
        AnonymousClass6AZ anonymousClass6AZ = new AnonymousClass6AZ(AnonymousClass6B4.B(anonymousClass0Cm2, context2), AnonymousClass0F4.f2058E, new AnonymousClass6AY(), new Handler(Looper.getMainLooper()), new AnonymousClass0Qp((AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)), AnonymousClass0HT.f2637C);
        AnonymousClass3ig B5 = AnonymousClass3ig.B(view, C0164R.id.videocall_incoming_call_ringer_stub);
        Context context3 = view.getContext();
        AnonymousClass6BV anonymousClass6BV = new AnonymousClass6BV(B5, new AnonymousClass6BK(context3), new Scroller(context3), context3.getResources().getDimensionPixelSize(C0164R.dimen.videocall_incoming_ring_button_translation));
        Resources resources = context2.getResources();
        AnonymousClass6Av anonymousClass6Av = new AnonymousClass6Av(anonymousClass6AZ, anonymousClass6BV, resources.getDimensionPixelSize(C0164R.dimen.videocall_incoming_ring_swipe_up_distance), resources.getDimensionPixelSize(C0164R.dimen.videocall_incoming_ring_swipe_down_distance));
        Resources resources2 = getResources();
        AnonymousClass6As anonymousClass6As = new AnonymousClass6As(new AnonymousClass6BF(r0, resources2.getString(C0164R.string.videocall_create_call_while_in_call_headline), resources2.getString(C0164R.string.videocall_create_call_while_in_call_body), resources2.getString(C0164R.string.ok)), anonymousClass6HX, anonymousClass6GR, r0.f4488G, r0);
        r0.f4493L = new AnonymousClass6Aw(new AnonymousClass6An(r0), new AnonymousClass6Bj(view));
        AnonymousClass6GS anonymousClass6GS = new AnonymousClass6GS(r0);
        AnonymousClass0Cm anonymousClass0Cm3 = r0.f4488G;
        AnonymousClass6GT anonymousClass6GT = new AnonymousClass6GT(anonymousClass0Cm3);
        AnonymousClass0bz B6 = AnonymousClass0bz.m5663B(view.getContext());
        if (((Boolean) AnonymousClass0CC.Kj.m846H(anonymousClass0Cm3)).booleanValue()) {
            findViewById = view.findViewById(C0164R.id.videocall_participants_grid_container);
        } else {
            findViewById = view.findViewById(C0164R.id.videocall_surface_view_frame);
        }
        AnonymousClass6Gp anonymousClass6Gp = new AnonymousClass6Gp(new AnonymousClass6B7(anonymousClass6GT, B6, new AnonymousClass1Y1(true, true, false), findViewById, AnonymousClass0Nm.m3427F(view.getContext())));
        AnonymousClass0Cm anonymousClass0Cm4 = r0.f4488G;
        Context context4 = view.getContext();
        if (((Boolean) AnonymousClass0CC.Kj.m846H(anonymousClass0Cm4)).booleanValue()) {
            view = view.findViewById(C0164R.id.videocall_participants_grid_container);
        }
        r0.f4494M = new AnonymousClass6H1(r0, anonymousClass6HX, new AnonymousClass6H8(new AnonymousClass6BK(context4), view), r0.f4499R, anonymousClass6Gq, anonymousClass6Gw, anonymousClass6Au, anonymousClass6Av, anonymousClass6As, anonymousClass6Gp, anonymousClass6GS);
        AnonymousClass0J7.f2895B.mo521C(r0.f4488G, r0.f4496O);
        AnonymousClass0cQ.m5853C(r0, -702842647, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.m5852B(this, 1244208617);
        super.onDestroy();
        AnonymousClass6H1 anonymousClass6H1 = this.f4494M;
        AnonymousClass6HX anonymousClass6HX = anonymousClass6H1.f73875G;
        anonymousClass6HX.f74096E.f73782D = null;
        anonymousClass6HX.f74096E.f73793O.m4799C(new AnonymousClass69t());
        AnonymousClass6AZ anonymousClass6AZ = anonymousClass6H1.f73874F.f72636F;
        anonymousClass6AZ.B();
        anonymousClass6AZ.f72544H.A();
        AnonymousClass0J7.f2895B.mo544Z(this.f4488G, this.f4496O);
        AnonymousClass0cQ.m5853C(this, 1571628949, B);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        VideoCallInfo videoCallInfo = (VideoCallInfo) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_CALL_ID");
        if (!intent.getBooleanExtra("VideoCallActivity.VIDEO_CALL_ACTIVITY_ARGUMENT_RING", false)) {
            if (!this.f4486E) {
                if (videoCallInfo != null) {
                    if (!videoCallInfo.equals(this.f4490I) && ((Boolean) AnonymousClass0CC.qi.m846H(this.f4488G)).booleanValue()) {
                        this.f4490I = videoCallInfo;
                    }
                    this.f4483B = (VideoCallSource) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE");
                    this.f4489H = (VideoCallAudience) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST");
                    if (this.f4493L.A()) {
                        this.f4494M.B(videoCallInfo, this.f4483B);
                    }
                } else if (!this.f4485D) {
                    AnonymousClass0Dc.m1245H("VideoCallActivity", "onNewIntent: video call info doesn't exist. Intent=%s", intent);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("New intent received but no valid action performed: Intent=");
                    stringBuilder.append(intent.toString());
                    AnonymousClass0Gn.m1876C("VideoCallActivity_onNewIntent", stringBuilder.toString());
                } else if (!intent.getBooleanExtra("VideoCallActivity.ARGUMENT_CALL_RESUME", false)) {
                    this.f4483B = (VideoCallSource) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE");
                    this.f4489H = (VideoCallAudience) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST");
                    this.f4494M.A(this.f4483B);
                }
            }
        }
        this.f4498Q = true;
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.m5852B(this, 456157920);
        Boolean.valueOf(this.f4485D);
        super.onPause();
        if (!this.f4485D) {
            this.f4494M.D();
        }
        AnonymousClass0cQ.m5853C(this, 14009935, B);
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Boolean.valueOf(z);
        Boolean.valueOf(isFinishing());
        super.onPictureInPictureModeChanged(z, configuration);
        if (!isFinishing()) {
            AnonymousClass6Gw anonymousClass6Gw;
            AnonymousClass6HX anonymousClass6HX;
            AnonymousClass69e D;
            if (z) {
                z = this.f4494M;
                anonymousClass6Gw = z.f73878J;
                anonymousClass6Gw.f73851D = true;
                AnonymousClass6Gw.E(anonymousClass6Gw);
                for (AnonymousClass6BX B : anonymousClass6Gw.f73859L.f72804M.values()) {
                    B.B();
                }
                anonymousClass6Gw.f73859L.f72803L.setVisibility(8);
                AnonymousClass6Gw.C(anonymousClass6Gw);
                configuration = z.f73872D;
                configuration.f72627H = true;
                if (configuration.f72622C) {
                    configuration.B(configuration.f72621B, 0, configuration.f72628I);
                }
                z.f73879K.f72612C = true;
                z.f73871C.F();
                z.f73870B.A();
                anonymousClass6HX = z.f73875G;
                D = anonymousClass6HX.D();
                D.PRA(AnonymousClass69d.f72423F);
                D.ea();
                anonymousClass6HX.f74104M.m4097I(true);
                z.f73875G.F();
                return;
            }
            z = this.f4494M;
            anonymousClass6Gw = z.f73878J;
            anonymousClass6Gw.f73851D = false;
            AnonymousClass6Gw.E(anonymousClass6Gw);
            for (AnonymousClass6BX B2 : anonymousClass6Gw.f73859L.f72804M.values()) {
                B2.A();
            }
            AnonymousClass6Gw.C(anonymousClass6Gw);
            configuration = z.f73872D;
            configuration.f72627H = false;
            if (configuration.f72622C) {
                configuration.B(configuration.f72621B, 0, configuration.f72628I);
            }
            z.f73879K.f72612C = false;
            anonymousClass6HX = z.f73875G;
            D = anonymousClass6HX.D();
            D.PRA(AnonymousClass69d.f72422E);
            D.ca();
            anonymousClass6HX.f74104M.m4097I(false);
            if (!z.f73872D.f72622C) {
                z.f73871C.G();
            }
        }
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.m5852B(this, 2024480989);
        Boolean.valueOf(this.f4485D);
        super.onResume();
        AnonymousClass0Iz.f2854L.m2405H(this);
        if (this.f4493L.A()) {
            if (!this.f4495N) {
                this.f4495N = true;
                if (this.f4487F) {
                    VideoCallInfo A = this.f4491J.m4089A();
                    if (A == null) {
                        AnonymousClass6H1.B(this.f4494M, AnonymousClass6Ah.f72580F, false);
                    } else {
                        this.f4494M.B(A, this.f4483B);
                    }
                } else {
                    VideoCallInfo videoCallInfo = this.f4490I;
                    if (videoCallInfo == null) {
                        this.f4494M.A(this.f4483B);
                    } else if (this.f4486E) {
                        this.f4494M.E(this.f4489H, videoCallInfo, this.f4484C, this.f4483B, true);
                    } else {
                        this.f4494M.B(videoCallInfo, this.f4483B);
                    }
                }
            }
            if (!this.f4485D) {
                AnonymousClass6H1 anonymousClass6H1 = this.f4494M;
                anonymousClass6H1.f73878J.f73850C = anonymousClass6H1.f73877I;
                anonymousClass6H1.f73871C.f73836E = anonymousClass6H1;
                AnonymousClass6Gq anonymousClass6Gq = anonymousClass6H1.f73871C;
                anonymousClass6Gq.f73835D.f73897N = anonymousClass6Gq;
                anonymousClass6Gq.f73833B.f74097F = anonymousClass6Gq;
                AnonymousClass6Au anonymousClass6Au = anonymousClass6H1.f73872D;
                anonymousClass6Au.f72623D.f72716E = anonymousClass6Au.f72624E;
                AnonymousClass6Av anonymousClass6Av = anonymousClass6H1.f73874F;
                anonymousClass6Av.f72636F.A(anonymousClass6Av.f72634D);
                if (anonymousClass6Av.f72638H) {
                    AnonymousClass6AZ anonymousClass6AZ = anonymousClass6Av.f72636F;
                    if (!anonymousClass6AZ.f72541E.hasMessages(0)) {
                        anonymousClass6AZ.f72541E.f72536C = new WeakReference(anonymousClass6AZ.f72540D);
                        AnonymousClass6AY anonymousClass6AY = anonymousClass6AZ.f72541E;
                        anonymousClass6AY.A(Math.max(0, anonymousClass6AY.f72535B - (SystemClock.elapsedRealtime() - anonymousClass6AY.f72537D)));
                    }
                }
                AnonymousClass6As.B(anonymousClass6H1.f73879K);
                AnonymousClass6Gp anonymousClass6Gp = anonymousClass6H1.f73870B;
                anonymousClass6Gp.f73832B.f72680E = anonymousClass6Gp;
                anonymousClass6H1.f73880L.f73906B = anonymousClass6H1;
                anonymousClass6H1.f73875G.f74104M.f4540S.f73817B = anonymousClass6H1;
                anonymousClass6H1.f73875G.f74093B = anonymousClass6H1;
                anonymousClass6H1.f73875G.f74100I = anonymousClass6H1;
                anonymousClass6H1.f73875G.f74094C = anonymousClass6H1;
                AnonymousClass6HX anonymousClass6HX = anonymousClass6H1.f73875G;
                AnonymousClass69e D = anonymousClass6HX.D();
                D.Vb();
                D.PRA(AnonymousClass69d.f72422E);
                anonymousClass6HX.f74104M.m4097I(false);
                anonymousClass6HX.E(anonymousClass6HX.f74095D);
                anonymousClass6HX.f74104M.f4540S.f73818C = anonymousClass6HX.f74105N;
                if (anonymousClass6HX.f74104M.m4091C()) {
                    AnonymousClass6Ay anonymousClass6Ay = anonymousClass6HX.f74104M.f4538Q;
                    Intent intent = new Intent(anonymousClass6Ay.f72648B, VideoCallService.class);
                    intent.setAction("com.instagram.android.intent.action.CHANGE_VIDEO_CALL_SERVICE_FOREGROUND_STATUS");
                    AnonymousClass0IW.m2248N(intent, anonymousClass6Ay.f72648B);
                    if (((Boolean) AnonymousClass0CC.ii.m846H(anonymousClass6HX.f74103L)).booleanValue()) {
                        AnonymousClass6HX.C(anonymousClass6HX);
                    }
                }
                if (!(anonymousClass6H1.f73875G.f74104M.m4091C() || anonymousClass6H1.f73875G.f74099H)) {
                    if (!anonymousClass6H1.f73874F.f72638H) {
                        if (!anonymousClass6H1.f73874F.f72638H) {
                            AnonymousClass6H1.B(anonymousClass6H1, null, false);
                        }
                    }
                }
                anonymousClass6H1.f73878J.D();
            }
        } else if (this.f4486E) {
            this.f4494M.E(this.f4489H, this.f4490I, this.f4484C, this.f4483B, false);
        } else {
            m4066E(this);
        }
        if (!this.f4498Q) {
            this.f4485D = false;
        }
        this.f4498Q = false;
        AnonymousClass0cQ.m5853C(this, -1364121164, B);
    }

    public final void onStop() {
        int B = AnonymousClass0cQ.m5852B(this, -1600639669);
        Boolean.valueOf(this.f4485D);
        super.onStop();
        if (this.f4485D) {
            this.f4494M.D();
            this.f4485D = false;
            m4064C(this, AnonymousClass69X.f72331I);
        }
        AnonymousClass0cQ.m5853C(this, -199135278, B);
    }

    public final void onUserLeaveHint() {
        if (this.f4486E) {
            m4064C(this, AnonymousClass69X.f72332J);
        } else {
            m4065D(this);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m4067F(this);
        }
    }
}

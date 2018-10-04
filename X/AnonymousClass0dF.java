package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;
import com.instagram.camera.effect.mq.IgCameraControllerImpl;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.switchbutton.IgSwitch;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0dF */
public final class AnonymousClass0dF extends AnonymousClass0VA implements AnonymousClass0EE, AnonymousClass0dG, AnonymousClass0TV, AnonymousClass0dH, AnonymousClass4KE, AnonymousClass0dI, AnonymousClass0dJ, AnonymousClass0Uy {
    public static boolean iB;
    public static boolean jB;
    private final TouchInterceptorFrameLayout AB;
    /* renamed from: B */
    public final Activity f7362B;
    private Drawable BB;
    /* renamed from: C */
    public final String f7363C;
    private int CB = -1;
    /* renamed from: D */
    public final View f7364D;
    private final AnonymousClass4LH DB;
    /* renamed from: E */
    public final AnonymousClass32q f7365E;
    private final AnonymousClass3Il EB;
    /* renamed from: F */
    public AnonymousClass0c4 f7366F;
    private final AnonymousClass4LU FB;
    /* renamed from: G */
    public final AnonymousClass0eB f7367G;
    private final AnonymousClass4Nv GB = new AnonymousClass4Nv(this);
    /* renamed from: H */
    public final AnonymousClass38H f7368H;
    private final AnonymousClass4Nw HB = new AnonymousClass4Nw(this);
    /* renamed from: I */
    public final AnonymousClass4Kx f7369I;
    private final AnonymousClass3DU IB;
    /* renamed from: J */
    public final AnonymousClass4UE f7370J;
    private float JB;
    /* renamed from: K */
    public final AnonymousClass4L1 f7371K;
    private final boolean KB;
    /* renamed from: L */
    public final AnonymousClass0Uw f7372L;
    private final boolean LB;
    /* renamed from: M */
    public final AnonymousClass4LZ f7373M;
    private boolean MB;
    /* renamed from: N */
    public final AnonymousClass5bK f7374N;
    private final boolean NB;
    /* renamed from: O */
    public String f7375O;
    private final boolean OB;
    /* renamed from: P */
    public final AnonymousClass0Uv f7376P;
    private final boolean PB;
    /* renamed from: Q */
    public final AnonymousClass0eH f7377Q;
    private final boolean QB;
    /* renamed from: R */
    public final AnonymousClass0kV f7378R;
    private final AnonymousClass0hj RB = new AnonymousClass0hj();
    /* renamed from: S */
    public final AnonymousClass4M8 f7379S;
    private final AnonymousClass4N9 SB;
    /* renamed from: T */
    public final AnonymousClass4MO f7380T;
    private final int TB;
    /* renamed from: U */
    public final AnonymousClass4Mo f7381U;
    private final AnonymousClass5Tq UB;
    /* renamed from: V */
    public final AnonymousClass4QM f7382V;
    private AnonymousClass4NM VB;
    /* renamed from: W */
    public final AnonymousClass4Mw f7383W;
    private AnonymousClass4Nx WB;
    /* renamed from: X */
    public final boolean f7384X;
    private final ViewGroup XB;
    /* renamed from: Y */
    public final AnonymousClass5T9 f7385Y;
    private final ViewGroup YB;
    /* renamed from: Z */
    public final AnonymousClass5Tf f7386Z;
    private final TouchInterceptorFrameLayout ZB;
    /* renamed from: a */
    public final AnonymousClass5Tg f7387a;
    private Medium aB;
    /* renamed from: b */
    public final AnonymousClass3y8 f7388b;
    private final AnonymousClass1U5 bB;
    /* renamed from: c */
    public final ViewGroup f7389c;
    private final boolean cB;
    /* renamed from: d */
    public final AnonymousClass0IJ f7390d;
    private final boolean dB;
    /* renamed from: e */
    public final int f7391e;
    private final boolean eB;
    /* renamed from: f */
    public final AnonymousClass5TB f7392f;
    private final boolean fB;
    /* renamed from: g */
    public final AnonymousClass4TU f7393g;
    private final AnonymousClass4PI gB;
    /* renamed from: h */
    public final InteractiveDrawableContainer f7394h;
    private final AnonymousClass4Q9 hB;
    /* renamed from: i */
    public final AnonymousClass5TC f7395i;
    /* renamed from: j */
    public final AnonymousClass4Nf f7396j;
    /* renamed from: k */
    public final AnonymousClass4Nh f7397k;
    /* renamed from: l */
    public final boolean f7398l;
    /* renamed from: m */
    public final boolean f7399m;
    /* renamed from: n */
    public final boolean f7400n;
    /* renamed from: o */
    public final boolean f7401o;
    /* renamed from: p */
    public final AnonymousClass0Uw f7402p;
    /* renamed from: q */
    public final AnonymousClass4QI f7403q;
    /* renamed from: r */
    public final AnonymousClass4PD f7404r;
    /* renamed from: s */
    public final AnonymousClass4Ud f7405s;
    /* renamed from: t */
    public final AnonymousClass4L2 f7406t;
    /* renamed from: u */
    public final AnonymousClass0Cm f7407u;
    /* renamed from: v */
    public final AnonymousClass5TY f7408v;
    /* renamed from: w */
    public int f7409w = 1;
    /* renamed from: x */
    public boolean f7410x;
    /* renamed from: y */
    private final AnonymousClass4KF f7411y;
    /* renamed from: z */
    private final AnonymousClass0eK f7412z;

    public AnonymousClass0dF(X.AnonymousClass4Ni r83) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Iterative traversal limit reached, method: X.0dF.<init>(X.4Ni):void
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r82 = this;
        r0 = r82;
        r0.<init>();
        r1 = new X.0hj;
        r1.<init>();
        r0.RB = r1;
        r1 = new X.4Nv;
        r5 = 0;
        r1.<init>(r0);
        r0.GB = r1;
        r1 = new X.4Nw;
        r1.<init>(r0);
        r0.HB = r1;
        r1 = -1;
        r0.CB = r1;
        r7 = 1;
        r0.f7409w = r7;
        r2 = "igcam_qcc_constr";
        r1 = -1745360632; // 0xffffffff97f7e908 float:-1.6020826E-24 double:NaN;
        X.AnonymousClass0CN.m901B(r2, r1);
        r1 = "igcam_time_to_partially_visible";
        r6 = 0;
        X.AnonymousClass0CL.m883B(r1, r6);
        r1 = r83;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53417B;	 Catch:{ all -> 0x12ac }
        r0.f7362B = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.HB;	 Catch:{ all -> 0x12ac }
        r0.f7407u = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53419D;	 Catch:{ all -> 0x12ac }
        r0.f7366F = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53456o;	 Catch:{ all -> 0x12ac }
        r0.f7390d = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r2 = r2.getFragmentManager();	 Catch:{ all -> 0x12ac }
        r2 = r2.getBackStackEntryCount();	 Catch:{ all -> 0x12ac }
        r0.f7391e = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53429N;	 Catch:{ all -> 0x12ac }
        r0.f7375O = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53431P;	 Catch:{ all -> 0x12ac }
        r0.f7376P = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53460s;	 Catch:{ all -> 0x12ac }
        r0.aB = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53421F;	 Catch:{ all -> 0x12ac }
        r0.f7363C = r2;	 Catch:{ all -> 0x12ac }
        r4 = new X.0kV;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r4.<init>(r3, r2);	 Catch:{ all -> 0x12ac }
        r0.f7378R = r4;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r2 = android.view.ViewConfiguration.get(r2);	 Catch:{ all -> 0x12ac }
        r2 = r2.getScaledMinimumFlingVelocity();	 Catch:{ all -> 0x12ac }
        r0.TB = r2;	 Catch:{ all -> 0x12ac }
        r4 = new X.0Uw;	 Catch:{ all -> 0x12ac }
        r3 = "QuickCaptureController";	 Catch:{ all -> 0x12ac }
        r2 = X.AnonymousClass3AM.f38534I;	 Catch:{ all -> 0x12ac }
        r4.<init>(r3, r2);	 Catch:{ all -> 0x12ac }
        r0.f7402p = r4;	 Catch:{ all -> 0x12ac }
        r4 = r1.f53463v;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53426K;	 Catch:{ all -> 0x12ac }
        if (r2 == 0) goto L_0x0088;	 Catch:{ all -> 0x12ac }
    L_0x0085:
        r17 = 1;	 Catch:{ all -> 0x12ac }
        goto L_0x008a;	 Catch:{ all -> 0x12ac }
    L_0x0088:
        r17 = 0;	 Catch:{ all -> 0x12ac }
    L_0x008a:
        r3 = r1.f53452k;	 Catch:{ all -> 0x12ac }
        r3.A(r0);	 Catch:{ all -> 0x12ac }
        r8 = "igcam_inflate_qcc_layout";	 Catch:{ all -> 0x12ac }
        r3 = -1010716475; // 0xffffffffc3c1b0c5 float:-387.381 double:NaN;	 Catch:{ all -> 0x12ac }
        X.AnonymousClass0CN.m901B(r8, r3);	 Catch:{ all -> 0x12ac }
        r3 = r4.getContext();	 Catch:{ all -> 0x12a2 }
        r8 = android.view.LayoutInflater.from(r3);	 Catch:{ all -> 0x12a2 }
        r3 = 2131428086; // 0x7f0b02f6 float:1.8477807E38 double:1.053065394E-314;	 Catch:{ all -> 0x12a2 }
        r3 = r8.inflate(r3, r4, r6);	 Catch:{ all -> 0x12a2 }
        r3 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r3;	 Catch:{ all -> 0x12a2 }
        r0.AB = r3;	 Catch:{ all -> 0x12a2 }
        r10 = X.AnonymousClass0Ea.f1980C;	 Catch:{ all -> 0x12a2 }
        r9 = "includes_layout_inflation";	 Catch:{ all -> 0x12a2 }
        r8 = 17629194; // 0x10d000a float:2.5897638E-38 double:8.709979E-317;	 Catch:{ all -> 0x12a2 }
        r3 = 1;	 Catch:{ all -> 0x12a2 }
        r10.m1437K(r8, r9, r3);	 Catch:{ all -> 0x12a2 }
        r3 = -344802128; // 0xffffffffeb72bcb0 float:-2.934511E26 double:NaN;	 Catch:{ all -> 0x12a2 }
        X.AnonymousClass0CN.m902C(r3);	 Catch:{ all -> 0x12ac }
        r3 = r1.KB;	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x00c1;	 Catch:{ all -> 0x12ac }
    L_0x00bf:
        r15 = 1;	 Catch:{ all -> 0x12ac }
        goto L_0x00c2;	 Catch:{ all -> 0x12ac }
    L_0x00c1:
        r15 = 0;	 Catch:{ all -> 0x12ac }
    L_0x00c2:
        r3 = r1.f53446e;	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x00d4;	 Catch:{ all -> 0x12ac }
    L_0x00c6:
        r3 = r0.f7362B;	 Catch:{ all -> 0x00d1 }
        r3 = X.AnonymousClass0RC.m4121D(r3);	 Catch:{ all -> 0x00d1 }
        if (r3 == 0) goto L_0x00d4;	 Catch:{ all -> 0x00d1 }
    L_0x00ce:
        r31 = 1;	 Catch:{ all -> 0x00d1 }
        goto L_0x00d6;	 Catch:{ all -> 0x00d1 }
    L_0x00d1:
        r1 = move-exception;
        goto L_0x12ad;
    L_0x00d4:
        r31 = 0;
    L_0x00d6:
        r11 = r1.f53459r;	 Catch:{ all -> 0x12ac }
        r10 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r8 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298494; // 0x7f0908be float:1.8214963E38 double:1.053001367E-314;	 Catch:{ all -> 0x12ac }
        r9 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r9 = (android.view.ViewStub) r9;	 Catch:{ all -> 0x12ac }
        r8 = new X.4TU;	 Catch:{ all -> 0x12ac }
        r3 = X.AnonymousClass27x.C(r10);	 Catch:{ all -> 0x12ac }
        r19 = X.AnonymousClass4TW.B(r11, r3);	 Catch:{ all -> 0x12ac }
        if (r17 != 0) goto L_0x00fa;	 Catch:{ all -> 0x12ac }
    L_0x00f1:
        r3 = X.AnonymousClass27x.B(r10);	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x00fa;	 Catch:{ all -> 0x12ac }
    L_0x00f7:
        r22 = 1;	 Catch:{ all -> 0x12ac }
        goto L_0x00fc;	 Catch:{ all -> 0x12ac }
    L_0x00fa:
        r22 = 0;	 Catch:{ all -> 0x12ac }
    L_0x00fc:
        r3 = X.AnonymousClass0CC.dN;	 Catch:{ all -> 0x12ac }
        r3 = r3.m846H(r10);	 Catch:{ all -> 0x12ac }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x12ac }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x12ac }
        r23 = r3 ^ 1;	 Catch:{ all -> 0x12ac }
        r21 = r15;	 Catch:{ all -> 0x12ac }
        r24 = r17;	 Catch:{ all -> 0x12ac }
        r18 = r8;	 Catch:{ all -> 0x12ac }
        r20 = r9;	 Catch:{ all -> 0x12ac }
        r18.<init>(r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x12ac }
        r0.f7393g = r8;	 Catch:{ all -> 0x12ac }
        r11 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r12 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r10 = r0.f7376P;	 Catch:{ all -> 0x12ac }
        r9 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r3 = r11.f54370K;	 Catch:{ all -> 0x12ac }
        if (r3 != 0) goto L_0x013e;	 Catch:{ all -> 0x12ac }
    L_0x0123:
        r8 = r11.f54378S;	 Catch:{ all -> 0x12ac }
        r3 = 2131297065; // 0x7f090329 float:1.8212064E38 double:1.053000661E-314;	 Catch:{ all -> 0x12ac }
        r8 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r8 = (android.view.ViewStub) r8;	 Catch:{ all -> 0x12ac }
        if (r8 != 0) goto L_0x0136;	 Catch:{ all -> 0x12ac }
    L_0x0130:
        r3 = new X.4TT;	 Catch:{ all -> 0x12ac }
        r3.<init>();	 Catch:{ all -> 0x12ac }
        goto L_0x013c;	 Catch:{ all -> 0x12ac }
    L_0x0136:
        r3 = X.AnonymousClass0J7.f2895B;	 Catch:{ all -> 0x12ac }
        r3 = r3.mo524F(r10, r12, r8, r9);	 Catch:{ all -> 0x12ac }
    L_0x013c:
        r11.f54370K = r3;	 Catch:{ all -> 0x12ac }
    L_0x013e:
        r3 = r11.f54370K;	 Catch:{ all -> 0x12ac }
        r0.EB = r3;	 Catch:{ all -> 0x12ac }
        r9 = r1.f53424I;	 Catch:{ all -> 0x12ac }
        if (r17 == 0) goto L_0x0149;	 Catch:{ all -> 0x12ac }
    L_0x0146:
        r8 = r2.f27808C;	 Catch:{ all -> 0x00d1 }
        goto L_0x014a;	 Catch:{ all -> 0x00d1 }
    L_0x0149:
        r8 = r5;	 Catch:{ all -> 0x00d1 }
    L_0x014a:
        if (r9 != 0) goto L_0x0151;	 Catch:{ all -> 0x00d1 }
    L_0x014c:
        r3 = X.AnonymousClass3DU.f39295T;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0151:
        r3 = X.AnonymousClass0cD.TEXT;	 Catch:{ all -> 0x12ac }
        if (r9 == r3) goto L_0x019a;	 Catch:{ all -> 0x12ac }
    L_0x0155:
        r3 = com.instagram.model.direct.DirectVisualMessageReplyViewModel.B(r8);	 Catch:{ all -> 0x00d1 }
        if (r3 == 0) goto L_0x015c;	 Catch:{ all -> 0x00d1 }
    L_0x015b:
        goto L_0x019a;	 Catch:{ all -> 0x00d1 }
    L_0x015c:
        r8 = X.AnonymousClass4Nq.f53484F;	 Catch:{ all -> 0x00d1 }
        r3 = r9.ordinal();	 Catch:{ all -> 0x00d1 }
        r3 = r8[r3];	 Catch:{ all -> 0x00d1 }
        switch(r3) {
            case 1: goto L_0x0192;
            case 2: goto L_0x018d;
            case 3: goto L_0x0188;
            case 4: goto L_0x0183;
            case 5: goto L_0x017e;
            case 6: goto L_0x0179;
            case 7: goto L_0x0174;
            case 8: goto L_0x016f;
            case 9: goto L_0x016a;
            default: goto L_0x0167;
        };	 Catch:{ all -> 0x00d1 }
    L_0x0167:
        r3 = X.AnonymousClass3DU.f39295T;	 Catch:{ all -> 0x00d1 }
        goto L_0x0197;	 Catch:{ all -> 0x00d1 }
    L_0x016a:
        r3 = X.AnonymousClass3DU.f39299X;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x016f:
        r3 = X.AnonymousClass3DU.f39291P;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0174:
        r3 = X.AnonymousClass3DU.f39298W;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0179:
        r3 = X.AnonymousClass3DU.f39296U;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x017e:
        r3 = X.AnonymousClass3DU.f39292Q;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0183:
        r3 = X.AnonymousClass3DU.f39290O;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0188:
        r3 = X.AnonymousClass3DU.f39300Y;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x018d:
        r3 = X.AnonymousClass3DU.f39293R;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0192:
        r3 = X.AnonymousClass3DU.f39294S;	 Catch:{ all -> 0x00d1 }
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x0197:
        r0.IB = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x019e;	 Catch:{ all -> 0x00d1 }
    L_0x019a:
        r3 = X.AnonymousClass3DU.f39300Y;	 Catch:{ all -> 0x12ac }
        r0.IB = r3;	 Catch:{ all -> 0x12ac }
    L_0x019e:
        r8 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298495; // 0x7f0908bf float:1.8214965E38 double:1.0530013674E-314;	 Catch:{ all -> 0x12ac }
        r3 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = (android.view.ViewGroup) r3;	 Catch:{ all -> 0x12ac }
        r0.YB = r3;	 Catch:{ all -> 0x12ac }
        r8 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r3 = X.AnonymousClass38H.B(r8, r3);	 Catch:{ all -> 0x12ac }
        r0.f7368H = r3;	 Catch:{ all -> 0x12ac }
        r8 = X.AnonymousClass0CC.rD;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r3 = r8.m846H(r3);	 Catch:{ all -> 0x12ac }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x12ac }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x01d7;	 Catch:{ all -> 0x12ac }
    L_0x01c5:
        r8 = X.AnonymousClass0CC.pD;	 Catch:{ all -> 0x00d1 }
        r3 = r0.f7407u;	 Catch:{ all -> 0x00d1 }
        r3 = r8.m846H(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x00d1 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x00d1 }
        if (r3 == 0) goto L_0x01d7;	 Catch:{ all -> 0x00d1 }
    L_0x01d5:
        r3 = 1;	 Catch:{ all -> 0x00d1 }
        goto L_0x01d8;	 Catch:{ all -> 0x00d1 }
    L_0x01d7:
        r3 = 0;	 Catch:{ all -> 0x00d1 }
    L_0x01d8:
        r0.PB = r3;	 Catch:{ all -> 0x12ac }
        r14 = new X.4KF;	 Catch:{ all -> 0x12ac }
        r13 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r12 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r11 = r0.YB;	 Catch:{ all -> 0x12ac }
        r10 = r0.f7368H;	 Catch:{ all -> 0x12ac }
        r9 = r0.IB;	 Catch:{ all -> 0x12ac }
        r8 = r1.f53422G;	 Catch:{ all -> 0x12ac }
        r3 = r0.PB;	 Catch:{ all -> 0x12ac }
        r25 = r3;	 Catch:{ all -> 0x12ac }
        r18 = r14;	 Catch:{ all -> 0x12ac }
        r19 = r13;	 Catch:{ all -> 0x12ac }
        r20 = r12;	 Catch:{ all -> 0x12ac }
        r21 = r11;	 Catch:{ all -> 0x12ac }
        r22 = r10;	 Catch:{ all -> 0x12ac }
        r23 = r9;	 Catch:{ all -> 0x12ac }
        r24 = r8;	 Catch:{ all -> 0x12ac }
        r18.<init>(r19, r20, r21, r22, r23, r24, r25);	 Catch:{ all -> 0x12ac }
        r0.f7411y = r14;	 Catch:{ all -> 0x12ac }
        r9 = new X.0Uw;	 Catch:{ all -> 0x12ac }
        r8 = "CaptureState";	 Catch:{ all -> 0x12ac }
        r3 = X.AnonymousClass3AN.f38554E;	 Catch:{ all -> 0x12ac }
        r9.<init>(r8, r3);	 Catch:{ all -> 0x12ac }
        r0.f7372L = r9;	 Catch:{ all -> 0x12ac }
        r9 = new X.4UE;	 Catch:{ all -> 0x12ac }
        r8 = r1.f53457p;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53453l;	 Catch:{ all -> 0x12ac }
        r9.<init>(r8, r3);	 Catch:{ all -> 0x12ac }
        r0.f7370J = r9;	 Catch:{ all -> 0x12ac }
        r9 = new X.4L2;	 Catch:{ all -> 0x12ac }
        r8 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298676; // 0x7f090974 float:1.8215332E38 double:1.053001457E-314;	 Catch:{ all -> 0x12ac }
        r8 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r9.<init>(r8, r3);	 Catch:{ all -> 0x12ac }
        r0.f7406t = r9;	 Catch:{ all -> 0x12ac }
        r8 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298671; // 0x7f09096f float:1.8215322E38 double:1.0530014544E-314;	 Catch:{ all -> 0x12ac }
        r3 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r0.f7364D = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53450i;	 Catch:{ all -> 0x12ac }
        r0.QB = r3;	 Catch:{ all -> 0x12ac }
        r3 = r0.QB;	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x0240;	 Catch:{ all -> 0x12ac }
    L_0x023a:
        r3 = r1.f53465x;	 Catch:{ all -> 0x00d1 }
        if (r3 == 0) goto L_0x0240;	 Catch:{ all -> 0x00d1 }
    L_0x023e:
        r3 = 1;	 Catch:{ all -> 0x00d1 }
        goto L_0x0241;	 Catch:{ all -> 0x00d1 }
    L_0x0240:
        r3 = 0;	 Catch:{ all -> 0x00d1 }
    L_0x0241:
        r0.dB = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53467z;	 Catch:{ all -> 0x12ac }
        r0.f7398l = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53448g;	 Catch:{ all -> 0x12ac }
        r0.f7401o = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.EB;	 Catch:{ all -> 0x12ac }
        r0.fB = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.AB;	 Catch:{ all -> 0x12ac }
        r0.f7399m = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53443b;	 Catch:{ all -> 0x12ac }
        r0.f7384X = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53442a;	 Catch:{ all -> 0x12ac }
        r0.OB = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.DB;	 Catch:{ all -> 0x12ac }
        r0.f7400n = r3;	 Catch:{ all -> 0x12ac }
        r3 = r1.CB;	 Catch:{ all -> 0x12ac }
        r0.eB = r3;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r3 = r3.f54386a;	 Catch:{ all -> 0x12ac }
        r23 = r3;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r3 = r3.f54365F;	 Catch:{ all -> 0x12ac }
        r83 = r3;	 Catch:{ all -> 0x12ac }
        r8 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298497; // 0x7f0908c1 float:1.8214969E38 double:1.0530013684E-314;	 Catch:{ all -> 0x12ac }
        r3 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = (com.instagram.ui.widget.interactive.InteractiveDrawableContainer) r3;	 Catch:{ all -> 0x12ac }
        r0.f7394h = r3;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7394h;	 Catch:{ all -> 0x12ac }
        r3.setOnlyHandleTouchesOnActiveDrawables(r7);	 Catch:{ all -> 0x12ac }
        r8 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298483; // 0x7f0908b3 float:1.821494E38 double:1.0530013615E-314;	 Catch:{ all -> 0x12ac }
        r16 = r8.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = r16;	 Catch:{ all -> 0x12ac }
        r3 = (com.instagram.ui.widget.interactive.InteractiveDrawableContainer) r3;	 Catch:{ all -> 0x12ac }
        r16 = r3;	 Catch:{ all -> 0x12ac }
        r8 = X.AnonymousClass0CC.Bf;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r3 = r8.m846H(r3);	 Catch:{ all -> 0x12ac }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x12ac }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x02f8;	 Catch:{ all -> 0x12ac }
    L_0x02a0:
        r3 = r16;	 Catch:{ all -> 0x00d1 }
        r3.setAlignmentGuideEnabled(r7);	 Catch:{ all -> 0x00d1 }
        r3 = r16.getContext();	 Catch:{ all -> 0x00d1 }
        r8 = android.view.LayoutInflater.from(r3);	 Catch:{ all -> 0x00d1 }
        r7 = 2131427382; // 0x7f0b0036 float:1.8476379E38 double:1.053065046E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r16;	 Catch:{ all -> 0x00d1 }
        r8 = r8.inflate(r7, r3, r6);	 Catch:{ all -> 0x00d1 }
        r3 = r0.f7407u;	 Catch:{ all -> 0x00d1 }
        r9 = r3.m1037B();	 Catch:{ all -> 0x00d1 }
        r3 = 2131296399; // 0x7f09008f float:1.8210714E38 double:1.053000332E-314;	 Catch:{ all -> 0x00d1 }
        r7 = r8.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7;	 Catch:{ all -> 0x00d1 }
        r3 = r9.DQ();	 Catch:{ all -> 0x00d1 }
        r7.setUrl(r3);	 Catch:{ all -> 0x00d1 }
        r3 = 2131296401; // 0x7f090091 float:1.8210718E38 double:1.053000333E-314;	 Catch:{ all -> 0x00d1 }
        r7 = r8.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r7 = (android.widget.TextView) r7;	 Catch:{ all -> 0x00d1 }
        r3 = r9.uT();	 Catch:{ all -> 0x00d1 }
        r7.setText(r3);	 Catch:{ all -> 0x00d1 }
        r3 = 2131296400; // 0x7f090090 float:1.8210716E38 double:1.0530003323E-314;	 Catch:{ all -> 0x00d1 }
        r7 = r8.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r7 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r7;	 Catch:{ all -> 0x00d1 }
        r3 = 0;	 Catch:{ all -> 0x00d1 }
        r7.setProgress(r3);	 Catch:{ all -> 0x00d1 }
        r3 = 1;	 Catch:{ all -> 0x00d1 }
        r7.setSegments(r3);	 Catch:{ all -> 0x00d1 }
        r3 = r16;	 Catch:{ all -> 0x00d1 }
        r3.setAlignmentGuideHeader(r8);	 Catch:{ all -> 0x00d1 }
        r7 = 2131427381; // 0x7f0b0035 float:1.8476377E38 double:1.0530650456E-314;	 Catch:{ all -> 0x00d1 }
        r3.setAlignmentGuideFooter(r7);	 Catch:{ all -> 0x00d1 }
    L_0x02f8:
        r3 = r0.AB;	 Catch:{ all -> 0x12ac }
        r4.addView(r3, r6);	 Catch:{ all -> 0x12ac }
        r4 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298356; // 0x7f090834 float:1.8214683E38 double:1.0530012987E-314;	 Catch:{ all -> 0x12ac }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = (android.view.ViewGroup) r3;	 Catch:{ all -> 0x12ac }
        r0.f7389c = r3;	 Catch:{ all -> 0x12ac }
        r4 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298496; // 0x7f0908c0 float:1.8214967E38 double:1.053001368E-314;	 Catch:{ all -> 0x12ac }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r3;	 Catch:{ all -> 0x12ac }
        r0.ZB = r3;	 Catch:{ all -> 0x12ac }
        r4 = r0.AB;	 Catch:{ all -> 0x12ac }
        r3 = 2131298479; // 0x7f0908af float:1.8214932E38 double:1.0530013595E-314;	 Catch:{ all -> 0x12ac }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = (android.view.ViewGroup) r3;	 Catch:{ all -> 0x12ac }
        r0.XB = r3;	 Catch:{ all -> 0x12ac }
        r24 = new X.5L7;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r3 = r24;	 Catch:{ all -> 0x12ac }
        r3.<init>(r4);	 Catch:{ all -> 0x12ac }
        r6 = new X.4M8;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r3 = r0.YB;	 Catch:{ all -> 0x12ac }
        r6.<init>(r4, r3);	 Catch:{ all -> 0x12ac }
        r0.f7379S = r6;	 Catch:{ all -> 0x12ac }
        r6 = new X.4Ud;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r6.<init>(r4, r3);	 Catch:{ all -> 0x12ac }
        r0.f7405s = r6;	 Catch:{ all -> 0x12ac }
        r4 = new X.32q;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r4.<init>(r3);	 Catch:{ all -> 0x12ac }
        r0.f7365E = r4;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r3 = X.AnonymousClass0RC.m4125H(r3);	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x0364;	 Catch:{ all -> 0x12ac }
    L_0x0354:
        r4 = X.AnonymousClass0CC.CV;	 Catch:{ all -> 0x00d1 }
        r3 = r0.f7407u;	 Catch:{ all -> 0x00d1 }
        r3 = r4.m846H(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x00d1 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x00d1 }
        if (r3 != 0) goto L_0x036c;	 Catch:{ all -> 0x00d1 }
    L_0x0364:
        r3 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r3 = X.AnonymousClass0RC.m4124G(r3);	 Catch:{ all -> 0x12ac }
        if (r3 == 0) goto L_0x037e;	 Catch:{ all -> 0x12ac }
    L_0x036c:
        r3 = new X.3y8;	 Catch:{ all -> 0x00d1 }
        r4 = r0.f7362B;	 Catch:{ all -> 0x00d1 }
        r5 = r0.f7390d;	 Catch:{ all -> 0x00d1 }
        r6 = r0.f7389c;	 Catch:{ all -> 0x00d1 }
        r7 = r0.f7407u;	 Catch:{ all -> 0x00d1 }
        r8 = r0.f7402p;	 Catch:{ all -> 0x00d1 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00d1 }
        r0.f7388b = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x0380;	 Catch:{ all -> 0x00d1 }
    L_0x037e:
        r0.f7388b = r5;	 Catch:{ all -> 0x12ac }
    L_0x0380:
        r4 = new X.0eK;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r4.<init>(r3);	 Catch:{ all -> 0x12ac }
        r0.f7412z = r4;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7412z;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7379S;	 Catch:{ all -> 0x12ac }
        r3 = r3.f7695B;	 Catch:{ all -> 0x12ac }
        r3.add(r4);	 Catch:{ all -> 0x12ac }
        r10 = new X.4Kx;	 Catch:{ all -> 0x12ac }
        r11 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r9 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r8 = r0.YB;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r7 = r3.f54367H;	 Catch:{ all -> 0x12ac }
        r6 = r0.IB;	 Catch:{ all -> 0x12ac }
        r5 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7412z;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7368H;	 Catch:{ all -> 0x12ac }
        r14 = r15;	 Catch:{ all -> 0x12ac }
        r36 = r17;	 Catch:{ all -> 0x12ac }
        r29 = r7;	 Catch:{ all -> 0x12a0 }
        r30 = r0;	 Catch:{ all -> 0x12a0 }
        r32 = r6;	 Catch:{ all -> 0x12a0 }
        r33 = r5;	 Catch:{ all -> 0x12a0 }
        r34 = r4;	 Catch:{ all -> 0x12a0 }
        r35 = r3;	 Catch:{ all -> 0x12a0 }
        r25 = r10;	 Catch:{ all -> 0x12a0 }
        r26 = r11;	 Catch:{ all -> 0x12a0 }
        r27 = r9;	 Catch:{ all -> 0x12a0 }
        r28 = r8;	 Catch:{ all -> 0x12a0 }
        r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);	 Catch:{ all -> 0x12a0 }
        r0.f7369I = r10;	 Catch:{ all -> 0x12ac }
        r5 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7369I;	 Catch:{ all -> 0x12ac }
        r3 = r3.f52871E;	 Catch:{ all -> 0x12ac }
        r4 = r3.size();	 Catch:{ all -> 0x12ac }
        r3 = 1;	 Catch:{ all -> 0x12ac }
        if (r4 <= r3) goto L_0x03d0;	 Catch:{ all -> 0x12ac }
    L_0x03cf:
        goto L_0x03d1;	 Catch:{ all -> 0x12ac }
    L_0x03d0:
        r3 = 0;	 Catch:{ all -> 0x12ac }
    L_0x03d1:
        if (r3 == 0) goto L_0x03d7;	 Catch:{ all -> 0x12ac }
    L_0x03d3:
        r4 = 2131166634; // 0x7f0705aa float:1.7947519E38 double:1.0529362194E-314;	 Catch:{ all -> 0x12ac }
        goto L_0x03da;	 Catch:{ all -> 0x12ac }
    L_0x03d7:
        r4 = 2131166633; // 0x7f0705a9 float:1.7947517E38 double:1.052936219E-314;	 Catch:{ all -> 0x12ac }
    L_0x03da:
        r3 = r5.f54378S;	 Catch:{ all -> 0x12ac }
        r3 = r3.getResources();	 Catch:{ all -> 0x12ac }
        r3 = r3.getDimensionPixelOffset(r4);	 Catch:{ all -> 0x12ac }
        r5.f54383X = r3;	 Catch:{ all -> 0x12ac }
        r12 = new X.0ct;	 Catch:{ all -> 0x12ac }
        r4 = r0.YB;	 Catch:{ all -> 0x12ac }
        r3 = 2131299812; // 0x7f090de4 float:1.8217636E38 double:1.053002018E-314;	 Catch:{ all -> 0x12ac }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x12ac }
        r3 = (android.view.ViewStub) r3;	 Catch:{ all -> 0x12ac }
        r12.<init>(r3);	 Catch:{ all -> 0x12ac }
        r11 = new X.4PD;	 Catch:{ all -> 0x12ac }
        r13 = r0.f7370J;	 Catch:{ all -> 0x12ac }
        r10 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r9 = r0.YB;	 Catch:{ all -> 0x12ac }
        r8 = r0.f7394h;	 Catch:{ all -> 0x12ac }
        r7 = r0.RB;	 Catch:{ all -> 0x12ac }
        r6 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r5 = r1.GB;	 Catch:{ all -> 0x12ac }
        r4 = r1.JB;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7393g;	 Catch:{ all -> 0x12ac }
        r48 = r3.B();	 Catch:{ all -> 0x12ac }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r54 = r12;	 Catch:{ all -> 0x12ac }
        r35 = r11;	 Catch:{ all -> 0x12a0 }
        r37 = r13;	 Catch:{ all -> 0x12a0 }
        r38 = r10;	 Catch:{ all -> 0x12a0 }
        r39 = r9;	 Catch:{ all -> 0x12a0 }
        r40 = r8;	 Catch:{ all -> 0x12a0 }
        r41 = r12;	 Catch:{ all -> 0x12a0 }
        r42 = r0;	 Catch:{ all -> 0x12a0 }
        r43 = r7;	 Catch:{ all -> 0x12a0 }
        r44 = r6;	 Catch:{ all -> 0x12a0 }
        r45 = r5;	 Catch:{ all -> 0x12a0 }
        r46 = r2;	 Catch:{ all -> 0x12a0 }
        r47 = r4;	 Catch:{ all -> 0x12a0 }
        r49 = r3;	 Catch:{ all -> 0x12a0 }
        r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49);	 Catch:{ all -> 0x12a0 }
        r0.f7404r = r11;	 Catch:{ all -> 0x12ac }
        r5 = new X.4PI;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7369I;	 Catch:{ all -> 0x12ac }
        r3 = r0.IB;	 Catch:{ all -> 0x12ac }
        r5.<init>(r4, r3, r0);	 Catch:{ all -> 0x12ac }
        r0.gB = r5;	 Catch:{ all -> 0x12ac }
        r4 = r1.IB;	 Catch:{ all -> 0x12ac }
        r3 = 1;	 Catch:{ all -> 0x12ac }
        if (r4 != r3) goto L_0x0444;	 Catch:{ all -> 0x12ac }
    L_0x0441:
        r69 = 1;	 Catch:{ all -> 0x12ac }
        goto L_0x0446;	 Catch:{ all -> 0x12ac }
    L_0x0444:
        r69 = 0;	 Catch:{ all -> 0x12ac }
    L_0x0446:
        if (r17 == 0) goto L_0x04e4;	 Catch:{ all -> 0x12ac }
    L_0x0448:
        r4 = r0.XB;	 Catch:{ all -> 0x00d1 }
        r3 = 2131297109; // 0x7f090355 float:1.8212154E38 double:1.0530006826E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (android.view.ViewStub) r3;	 Catch:{ all -> 0x00d1 }
        r6 = new X.4Ug;	 Catch:{ all -> 0x00d1 }
        r5 = r2.f27811F;	 Catch:{ all -> 0x00d1 }
        r4 = r0.XB;	 Catch:{ all -> 0x00d1 }
        r3 = r3.inflate();	 Catch:{ all -> 0x00d1 }
        r6.<init>(r5, r4, r3);	 Catch:{ all -> 0x00d1 }
        r3 = r6.f54639J;	 Catch:{ all -> 0x00d1 }
        r4 = r3.m5928A();	 Catch:{ all -> 0x00d1 }
        if (r69 == 0) goto L_0x049b;	 Catch:{ all -> 0x00d1 }
    L_0x0468:
        r3 = 2131298203; // 0x7f09079b float:1.8214373E38 double:1.053001223E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r3;	 Catch:{ all -> 0x00d1 }
        r6.f54634E = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 2131298527; // 0x7f0908df float:1.821503E38 double:1.053001383E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (android.widget.ImageView) r3;	 Catch:{ all -> 0x00d1 }
        r6.f54637H = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 2131298288; // 0x7f0907f0 float:1.8214545E38 double:1.053001265E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (android.widget.ImageView) r3;	 Catch:{ all -> 0x00d1 }
        r6.f54635F = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 153; // 0x99 float:2.14E-43 double:7.56E-322;	 Catch:{ all -> 0x00d1 }
        r6.f54636G = r3;	 Catch:{ all -> 0x00d1 }
        r3 = r2.f27811F;	 Catch:{ all -> 0x00d1 }
        if (r3 == 0) goto L_0x0495;	 Catch:{ all -> 0x00d1 }
    L_0x0491:
        r3 = 2131165739; // 0x7f07022b float:1.7945704E38 double:1.052935777E-314;	 Catch:{ all -> 0x00d1 }
        goto L_0x0498;	 Catch:{ all -> 0x00d1 }
    L_0x0495:
        r3 = 2131165738; // 0x7f07022a float:1.7945702E38 double:1.0529357767E-314;	 Catch:{ all -> 0x00d1 }
    L_0x0498:
        X.AnonymousClass4Ug.B(r6, r3);	 Catch:{ all -> 0x00d1 }
    L_0x049b:
        r3 = r2.f27811F;	 Catch:{ all -> 0x00d1 }
        if (r3 == 0) goto L_0x04d3;	 Catch:{ all -> 0x00d1 }
    L_0x049f:
        r3 = 2131298860; // 0x7f090a2c float:1.8215705E38 double:1.0530015477E-314;	 Catch:{ all -> 0x00d1 }
        r7 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r7 = (com.instagram.common.ui.widget.imageview.CircularImageView) r7;	 Catch:{ all -> 0x00d1 }
        r3 = 2131298862; // 0x7f090a2e float:1.821571E38 double:1.0530015487E-314;	 Catch:{ all -> 0x00d1 }
        r5 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r5 = (com.instagram.common.ui.widget.imageview.CircularImageView) r5;	 Catch:{ all -> 0x00d1 }
        r3 = r2.f27810E;	 Catch:{ all -> 0x00d1 }
        r5.setUrl(r3);	 Catch:{ all -> 0x00d1 }
        r3 = r2.f27811F;	 Catch:{ all -> 0x00d1 }
        X.AnonymousClass0LH.m2924B(r3);	 Catch:{ all -> 0x00d1 }
        r3 = r2.f27807B;	 Catch:{ all -> 0x00d1 }
        r7.setUrl(r3);	 Catch:{ all -> 0x00d1 }
        r3 = 2131298861; // 0x7f090a2d float:1.8215707E38 double:1.053001548E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r6.f54631B = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 2131298863; // 0x7f090a2f float:1.8215711E38 double:1.053001549E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r6.f54632C = r3;	 Catch:{ all -> 0x00d1 }
        goto L_0x04e1;	 Catch:{ all -> 0x00d1 }
    L_0x04d3:
        r3 = 2131298864; // 0x7f090a30 float:1.8215713E38 double:1.0530015497E-314;	 Catch:{ all -> 0x00d1 }
        r4 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r4 = (com.instagram.common.ui.widget.imageview.CircularImageView) r4;	 Catch:{ all -> 0x00d1 }
        r3 = r2.f27810E;	 Catch:{ all -> 0x00d1 }
        r4.setUrl(r3);	 Catch:{ all -> 0x00d1 }
    L_0x04e1:
        r5 = 0;	 Catch:{ all -> 0x00d1 }
        goto L_0x0566;	 Catch:{ all -> 0x00d1 }
    L_0x04e4:
        if (r69 == 0) goto L_0x0564;	 Catch:{ all -> 0x00d1 }
    L_0x04e6:
        r4 = r0.XB;	 Catch:{ all -> 0x00d1 }
        r3 = 2131297109; // 0x7f090355 float:1.8212154E38 double:1.0530006826E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (android.view.ViewStub) r3;	 Catch:{ all -> 0x00d1 }
        r4 = r3.inflate();	 Catch:{ all -> 0x00d1 }
        r6 = new X.4Ug;	 Catch:{ all -> 0x00d1 }
        r5 = 0;	 Catch:{ all -> 0x00d1 }
        r3 = 0;	 Catch:{ all -> 0x00d1 }
        r6.<init>(r3, r5, r4);	 Catch:{ all -> 0x00d1 }
        r7 = r0.f7362B;	 Catch:{ all -> 0x00d1 }
        r3 = r6.f54639J;	 Catch:{ all -> 0x00d1 }
        r4 = r3.m5928A();	 Catch:{ all -> 0x00d1 }
        r3 = 2131298864; // 0x7f090a30 float:1.8215713E38 double:1.0530015497E-314;	 Catch:{ all -> 0x00d1 }
        r8 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r8 = (com.instagram.common.ui.widget.imageview.CircularImageView) r8;	 Catch:{ all -> 0x00d1 }
        r3 = 2131230900; // 0x7f0800b4 float:1.8077866E38 double:1.052967971E-314;	 Catch:{ all -> 0x00d1 }
        r3 = X.AnonymousClass0Ca.m939E(r7, r3);	 Catch:{ all -> 0x00d1 }
        r8.setImageDrawable(r3);	 Catch:{ all -> 0x00d1 }
        r3 = 2131099955; // 0x7f060133 float:1.7812278E38 double:1.0529032756E-314;	 Catch:{ all -> 0x00d1 }
        r7 = X.AnonymousClass0Ca.m937C(r7, r3);	 Catch:{ all -> 0x00d1 }
        r3 = 10;	 Catch:{ all -> 0x00d1 }
        r8.m5924H(r3, r7);	 Catch:{ all -> 0x00d1 }
        r3 = 2131298203; // 0x7f09079b float:1.8214373E38 double:1.053001223E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r3;	 Catch:{ all -> 0x00d1 }
        r6.f54634E = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 2131298527; // 0x7f0908df float:1.821503E38 double:1.053001383E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (android.widget.ImageView) r3;	 Catch:{ all -> 0x00d1 }
        r6.f54637H = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 2131298288; // 0x7f0907f0 float:1.8214545E38 double:1.053001265E-314;	 Catch:{ all -> 0x00d1 }
        r3 = r4.findViewById(r3);	 Catch:{ all -> 0x00d1 }
        r3 = (android.widget.ImageView) r3;	 Catch:{ all -> 0x00d1 }
        r6.f54635F = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ all -> 0x00d1 }
        r6.f54636G = r3;	 Catch:{ all -> 0x00d1 }
        r3 = 2131165738; // 0x7f07022a float:1.7945702E38 double:1.0529357767E-314;	 Catch:{ all -> 0x00d1 }
        X.AnonymousClass4Ug.B(r6, r3);	 Catch:{ all -> 0x00d1 }
        r4 = new X.15z;	 Catch:{ all -> 0x00d1 }
        r3 = r6.f54639J;	 Catch:{ all -> 0x00d1 }
        r3 = r3.m5928A();	 Catch:{ all -> 0x00d1 }
        r4.<init>(r3);	 Catch:{ all -> 0x00d1 }
        r3 = new X.4Nr;	 Catch:{ all -> 0x00d1 }
        r3.<init>(r0);	 Catch:{ all -> 0x00d1 }
        r4.f14385E = r3;	 Catch:{ all -> 0x00d1 }
        r4.m9344A();	 Catch:{ all -> 0x00d1 }
        goto L_0x0566;	 Catch:{ all -> 0x00d1 }
    L_0x0564:
        r5 = 0;	 Catch:{ all -> 0x00d1 }
        r6 = r5;	 Catch:{ all -> 0x00d1 }
    L_0x0566:
        if (r17 != 0) goto L_0x056b;	 Catch:{ all -> 0x00d1 }
    L_0x0568:
        r0.FB = r5;	 Catch:{ all -> 0x00d1 }
        goto L_0x058c;	 Catch:{ all -> 0x00d1 }
    L_0x056b:
        r4 = new X.4LU;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r11 = r0;	 Catch:{ all -> 0x12ac }
        r9 = r4;	 Catch:{ all -> 0x12ac }
        r10 = r3;	 Catch:{ all -> 0x12ac }
        r12 = r2;	 Catch:{ all -> 0x12ac }
        r13 = r6;	 Catch:{ all -> 0x12ac }
        r9.<init>(r10, r11, r12, r13, r14);	 Catch:{ all -> 0x12ac }
        r0.FB = r4;	 Catch:{ all -> 0x12ac }
        r2 = r0.FB;	 Catch:{ all -> 0x12ac }
        r2.B();	 Catch:{ all -> 0x12ac }
        r2 = r0.FB;	 Catch:{ all -> 0x12ac }
        r2.A();	 Catch:{ all -> 0x12ac }
        r2 = r0.f7412z;	 Catch:{ all -> 0x12ac }
        r3 = r0.FB;	 Catch:{ all -> 0x12ac }
        r2 = r2.f7695B;	 Catch:{ all -> 0x12ac }
        r2.add(r3);	 Catch:{ all -> 0x12ac }
    L_0x058c:
        if (r15 == 0) goto L_0x05d6;	 Catch:{ all -> 0x12ac }
    L_0x058e:
        r2 = r1.JB;	 Catch:{ all -> 0x05d3 }
        if (r2 == 0) goto L_0x05d6;	 Catch:{ all -> 0x05d3 }
    L_0x0592:
        r11 = new X.4LZ;	 Catch:{ all -> 0x05d3 }
        r13 = r0.f7362B;	 Catch:{ all -> 0x05d3 }
        r10 = r0.f7370J;	 Catch:{ all -> 0x05d3 }
        r9 = r0.YB;	 Catch:{ all -> 0x05d3 }
        r8 = r0.ZB;	 Catch:{ all -> 0x05d3 }
        r7 = r0.f7394h;	 Catch:{ all -> 0x05d3 }
        r5 = r1.JB;	 Catch:{ all -> 0x05d3 }
        r4 = r0.FB;	 Catch:{ all -> 0x05d3 }
        r3 = r0.f7404r;	 Catch:{ all -> 0x05d3 }
        r2 = r1.KB;	 Catch:{ all -> 0x05d3 }
        r12 = r0.f7407u;	 Catch:{ all -> 0x05d3 }
        if (r23 == 0) goto L_0x05ad;	 Catch:{ all -> 0x05d3 }
    L_0x05aa:
        r51 = 1;	 Catch:{ all -> 0x05d3 }
        goto L_0x05af;	 Catch:{ all -> 0x05d3 }
    L_0x05ad:
        r51 = 0;	 Catch:{ all -> 0x05d3 }
    L_0x05af:
        r41 = r23;	 Catch:{ all -> 0x05d3 }
        r17 = 0;	 Catch:{ all -> 0x05d3 }
        r37 = r11;	 Catch:{ all -> 0x05d3 }
        r38 = r13;	 Catch:{ all -> 0x05d3 }
        r39 = r10;	 Catch:{ all -> 0x05d3 }
        r40 = r9;	 Catch:{ all -> 0x05d3 }
        r42 = r83;	 Catch:{ all -> 0x05d3 }
        r43 = r8;	 Catch:{ all -> 0x05d3 }
        r44 = r7;	 Catch:{ all -> 0x05d3 }
        r45 = r16;	 Catch:{ all -> 0x05d3 }
        r46 = r5;	 Catch:{ all -> 0x05d3 }
        r47 = r4;	 Catch:{ all -> 0x05d3 }
        r48 = r3;	 Catch:{ all -> 0x05d3 }
        r49 = r2;	 Catch:{ all -> 0x05d3 }
        r50 = r12;	 Catch:{ all -> 0x05d3 }
        r52 = r0;	 Catch:{ all -> 0x05d3 }
        r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52);	 Catch:{ all -> 0x05d3 }
        goto L_0x05d9;	 Catch:{ all -> 0x05d3 }
    L_0x05d3:
        r1 = move-exception;
        goto L_0x12ad;
    L_0x05d6:
        r17 = 0;
        r11 = 0;
    L_0x05d9:
        r0.f7373M = r11;	 Catch:{ all -> 0x12ac }
        r11 = new X.1U5;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r20 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7390d;	 Catch:{ all -> 0x12ac }
        r19 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r18 = r2;	 Catch:{ all -> 0x12ac }
        r15 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r14 = r1.f53437V;	 Catch:{ all -> 0x12ac }
        r12 = r1.f53430O;	 Catch:{ all -> 0x12ac }
        r10 = r1.f53432Q;	 Catch:{ all -> 0x12ac }
        r9 = r1.f53454m;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53451j;	 Catch:{ all -> 0x12ac }
        r8 = r1.f53464w;	 Catch:{ all -> 0x12ac }
        r7 = r1.f53455n;	 Catch:{ all -> 0x12ac }
        r5 = r1.FB;	 Catch:{ all -> 0x12ac }
        r4 = r1.f53418C;	 Catch:{ all -> 0x12ac }
        r13 = r1.f53418C;	 Catch:{ all -> 0x12ac }
        if (r13 != 0) goto L_0x0604;	 Catch:{ all -> 0x12ac }
    L_0x0601:
        r53 = 1;	 Catch:{ all -> 0x12ac }
        goto L_0x0606;	 Catch:{ all -> 0x12ac }
    L_0x0604:
        r53 = 0;	 Catch:{ all -> 0x12ac }
    L_0x0606:
        r37 = r11;	 Catch:{ all -> 0x12a0 }
        r38 = r0;	 Catch:{ all -> 0x12a0 }
        r39 = r20;	 Catch:{ all -> 0x12a0 }
        r40 = r19;	 Catch:{ all -> 0x12a0 }
        r41 = r18;	 Catch:{ all -> 0x12a0 }
        r42 = r15;	 Catch:{ all -> 0x12a0 }
        r43 = r14;	 Catch:{ all -> 0x12a0 }
        r44 = r12;	 Catch:{ all -> 0x12a0 }
        r45 = r10;	 Catch:{ all -> 0x12a0 }
        r46 = r9;	 Catch:{ all -> 0x12a0 }
        r47 = r2;	 Catch:{ all -> 0x12a0 }
        r49 = r8;	 Catch:{ all -> 0x12a0 }
        r50 = r7;	 Catch:{ all -> 0x12a0 }
        r51 = r5;	 Catch:{ all -> 0x12a0 }
        r52 = r4;	 Catch:{ all -> 0x12a0 }
        r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r50, r51, r52, r53);	 Catch:{ all -> 0x12a0 }
        r0.bB = r11;	 Catch:{ all -> 0x12ac }
        r9 = new X.0ct;	 Catch:{ all -> 0x12ac }
        r3 = r0.XB;	 Catch:{ all -> 0x12ac }
        r2 = 2131297179; // 0x7f09039b float:1.8212296E38 double:1.053000717E-314;	 Catch:{ all -> 0x12ac }
        r2 = r3.findViewById(r2);	 Catch:{ all -> 0x12ac }
        r2 = (android.view.ViewStub) r2;	 Catch:{ all -> 0x12ac }
        r9.<init>(r2);	 Catch:{ all -> 0x12ac }
        r22 = new X.4Lr;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r3 = r22;	 Catch:{ all -> 0x12ac }
        r2 = r16;	 Catch:{ all -> 0x12ac }
        r3.<init>(r4, r2, r9);	 Catch:{ all -> 0x12ac }
        r74 = new X.2VO;	 Catch:{ all -> 0x12ac }
        r74.<init>();	 Catch:{ all -> 0x12ac }
        r2 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r2 = X.AnonymousClass38I.B(r2);	 Catch:{ all -> 0x12ac }
        if (r2 == 0) goto L_0x0676;	 Catch:{ all -> 0x12ac }
    L_0x0651:
        r3 = X.AnonymousClass0CC.tD;	 Catch:{ all -> 0x00d1 }
        r2 = r0.f7407u;	 Catch:{ all -> 0x00d1 }
        r2 = r3.m846H(r2);	 Catch:{ all -> 0x00d1 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x00d1 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x00d1 }
        if (r2 == 0) goto L_0x0676;	 Catch:{ all -> 0x00d1 }
    L_0x0661:
        r21 = new X.38K;	 Catch:{ all -> 0x00d1 }
        r3 = r0.f7362B;	 Catch:{ all -> 0x00d1 }
        r2 = r21;	 Catch:{ all -> 0x00d1 }
        r2.<init>(r3);	 Catch:{ all -> 0x00d1 }
        r18 = new X.4NZ;	 Catch:{ all -> 0x00d1 }
        r5 = r0.f7389c;	 Catch:{ all -> 0x00d1 }
        r4 = r0.f7402p;	 Catch:{ all -> 0x00d1 }
        r3 = r18;	 Catch:{ all -> 0x00d1 }
        r3.<init>(r5, r4, r2);	 Catch:{ all -> 0x00d1 }
        goto L_0x067a;	 Catch:{ all -> 0x00d1 }
    L_0x0676:
        r18 = 0;	 Catch:{ all -> 0x00d1 }
        r21 = 0;	 Catch:{ all -> 0x00d1 }
    L_0x067a:
        r45 = new X.5UG;	 Catch:{ all -> 0x12ac }
        r45.<init>();	 Catch:{ all -> 0x12ac }
        r4 = new X.5Tq;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7390d;	 Catch:{ all -> 0x12ac }
        r3 = r2.getContext();	 Catch:{ all -> 0x12ac }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r4.<init>(r3, r2);	 Catch:{ all -> 0x12ac }
        r0.UB = r4;	 Catch:{ all -> 0x12ac }
        r8 = new X.5bK;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r32 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7370J;	 Catch:{ all -> 0x12ac }
        r30 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r29 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7372L;	 Catch:{ all -> 0x12ac }
        r28 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r27 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7390d;	 Catch:{ all -> 0x12ac }
        r49 = r2.getLoaderManager();	 Catch:{ all -> 0x12ac }
        r2 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r26 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53458q;	 Catch:{ all -> 0x12ac }
        r25 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.RB;	 Catch:{ all -> 0x12ac }
        r20 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7405s;	 Catch:{ all -> 0x12ac }
        r19 = r2;	 Catch:{ all -> 0x12ac }
        r15 = r0.f7365E;	 Catch:{ all -> 0x12ac }
        r14 = r0.UB;	 Catch:{ all -> 0x12ac }
        r13 = r0.f7373M;	 Catch:{ all -> 0x12ac }
        r12 = r1.IB;	 Catch:{ all -> 0x12ac }
        r11 = r1.f53429N;	 Catch:{ all -> 0x12ac }
        r10 = r0.XB;	 Catch:{ all -> 0x12ac }
        r7 = r0.f7390d;	 Catch:{ all -> 0x12ac }
        r5 = r1.f53447f;	 Catch:{ all -> 0x12ac }
        r4 = r1.BB;	 Catch:{ all -> 0x12ac }
        r3 = r1.f53428M;	 Catch:{ all -> 0x12ac }
        r2 = r0.FB;	 Catch:{ all -> 0x12ac }
        if (r2 == 0) goto L_0x06d9;	 Catch:{ all -> 0x12ac }
    L_0x06d2:
        r2 = r0.FB;	 Catch:{ all -> 0x00d1 }
        r2 = r2.f53037C;	 Catch:{ all -> 0x00d1 }
        r2 = r2.f27809D;	 Catch:{ all -> 0x00d1 }
        goto L_0x06da;	 Catch:{ all -> 0x00d1 }
    L_0x06d9:
        r2 = 0;	 Catch:{ all -> 0x00d1 }
    L_0x06da:
        r77 = r9;	 Catch:{ all -> 0x00d1 }
        r75 = r0;	 Catch:{ all -> 0x00d1 }
        r76 = r0;	 Catch:{ all -> 0x00d1 }
        r41 = r8;	 Catch:{ all -> 0x12a0 }
        r42 = r32;	 Catch:{ all -> 0x12a0 }
        r43 = r36;	 Catch:{ all -> 0x12a0 }
        r44 = r30;	 Catch:{ all -> 0x12a0 }
        r46 = r29;	 Catch:{ all -> 0x12a0 }
        r47 = r28;	 Catch:{ all -> 0x12a0 }
        r48 = r27;	 Catch:{ all -> 0x12a0 }
        r50 = r26;	 Catch:{ all -> 0x12a0 }
        r51 = r25;	 Catch:{ all -> 0x12a0 }
        r52 = r16;	 Catch:{ all -> 0x12a0 }
        r53 = r9;	 Catch:{ all -> 0x12a0 }
        r55 = r20;	 Catch:{ all -> 0x12a0 }
        r56 = r19;	 Catch:{ all -> 0x12a0 }
        r57 = r15;	 Catch:{ all -> 0x12a0 }
        r58 = r14;	 Catch:{ all -> 0x12a0 }
        r59 = r0;	 Catch:{ all -> 0x12a0 }
        r60 = r6;	 Catch:{ all -> 0x12a0 }
        r61 = r13;	 Catch:{ all -> 0x12a0 }
        r62 = r12;	 Catch:{ all -> 0x12a0 }
        r63 = r11;	 Catch:{ all -> 0x12a0 }
        r64 = r10;	 Catch:{ all -> 0x12a0 }
        r65 = r7;	 Catch:{ all -> 0x12a0 }
        r66 = r24;	 Catch:{ all -> 0x12a0 }
        r67 = r5;	 Catch:{ all -> 0x12a0 }
        r68 = r4;	 Catch:{ all -> 0x12a0 }
        r70 = r3;	 Catch:{ all -> 0x12a0 }
        r71 = r22;	 Catch:{ all -> 0x12a0 }
        r72 = r18;	 Catch:{ all -> 0x12a0 }
        r73 = r2;	 Catch:{ all -> 0x12a0 }
        r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76);	 Catch:{ all -> 0x12a0 }
        r0.f7374N = r8;	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = new X.5TE;	 Catch:{ all -> 0x129e }
        r3.<init>(r0);	 Catch:{ all -> 0x129e }
        r2 = r2.f66845L;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
        r2 = r1.f53462u;	 Catch:{ all -> 0x129e }
        r0.f7397k = r2;	 Catch:{ all -> 0x129e }
        r4 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r1.f53433R;	 Catch:{ all -> 0x129e }
        r2 = r1.f53425J;	 Catch:{ all -> 0x129e }
        r4.f66847N = r3;	 Catch:{ all -> 0x129e }
        r4.f66846M = r2;	 Catch:{ all -> 0x129e }
        r2 = r1.f53433R;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x073f;	 Catch:{ all -> 0x129e }
    L_0x073d:
        r2 = 1;	 Catch:{ all -> 0x129e }
        goto L_0x0740;	 Catch:{ all -> 0x129e }
    L_0x073f:
        r2 = 0;	 Catch:{ all -> 0x129e }
    L_0x0740:
        r0.KB = r2;	 Catch:{ all -> 0x129e }
        r3 = r1.f53434S;	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r2.f66849P = r3;	 Catch:{ all -> 0x129e }
        if (r3 == 0) goto L_0x074c;	 Catch:{ all -> 0x129e }
    L_0x074a:
        r2 = 1;	 Catch:{ all -> 0x129e }
        goto L_0x074d;	 Catch:{ all -> 0x129e }
    L_0x074c:
        r2 = 0;	 Catch:{ all -> 0x129e }
    L_0x074d:
        r0.LB = r2;	 Catch:{ all -> 0x129e }
        r2 = r1.JB;	 Catch:{ all -> 0x129e }
        if (r2 != 0) goto L_0x0767;	 Catch:{ all -> 0x129e }
    L_0x0753:
        r3 = X.AnonymousClass0CC.Of;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7407u;	 Catch:{ all -> 0x0764 }
        r2 = r3.m846H(r2);	 Catch:{ all -> 0x0764 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x0764 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x0764 }
        if (r2 == 0) goto L_0x077e;	 Catch:{ all -> 0x0764 }
    L_0x0763:
        goto L_0x0767;	 Catch:{ all -> 0x0764 }
    L_0x0764:
        r1 = move-exception;
        goto L_0x12ad;
    L_0x0767:
        r3 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r2 = r3.f66844K;	 Catch:{ all -> 0x129e }
        r4 = r2.B();	 Catch:{ all -> 0x129e }
        r3 = r3.K();	 Catch:{ all -> 0x129e }
        r2 = r4.getParent();	 Catch:{ all -> 0x129e }
        r2 = (android.view.ViewGroup) r2;	 Catch:{ all -> 0x129e }
        if (r3 != 0) goto L_0x077e;	 Catch:{ all -> 0x129e }
    L_0x077b:
        r2.bringChildToFront(r4);	 Catch:{ all -> 0x129e }
    L_0x077e:
        r2 = r1.f53461t;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0784;	 Catch:{ all -> 0x129e }
    L_0x0782:
        r2 = 1;	 Catch:{ all -> 0x129e }
        goto L_0x0785;	 Catch:{ all -> 0x129e }
    L_0x0784:
        r2 = 0;	 Catch:{ all -> 0x129e }
    L_0x0785:
        r0.NB = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.NB;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x079d;	 Catch:{ all -> 0x129e }
    L_0x078b:
        r2 = new X.4Nf;	 Catch:{ all -> 0x0764 }
        r3 = r0.f7362B;	 Catch:{ all -> 0x0764 }
        r4 = r0.f7407u;	 Catch:{ all -> 0x0764 }
        r5 = r0.f7394h;	 Catch:{ all -> 0x0764 }
        r7 = r0.f7374N;	 Catch:{ all -> 0x0764 }
        r8 = r1.f53461t;	 Catch:{ all -> 0x0764 }
        r6 = r16;	 Catch:{ all -> 0x0764 }
        r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0764 }
        goto L_0x079e;	 Catch:{ all -> 0x0764 }
    L_0x079d:
        r2 = 0;	 Catch:{ all -> 0x0764 }
    L_0x079e:
        r0.f7396j = r2;	 Catch:{ all -> 0x129e }
        r20 = new X.3Ek;	 Catch:{ all -> 0x129e }
        r3 = r0.f7389c;	 Catch:{ all -> 0x129e }
        r2 = r20;	 Catch:{ all -> 0x129e }
        r2.<init>(r3);	 Catch:{ all -> 0x129e }
        r8 = new X.0eH;	 Catch:{ all -> 0x129e }
        r7 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r6 = r0.YB;	 Catch:{ all -> 0x129e }
        r5 = r0.f7368H;	 Catch:{ all -> 0x129e }
        r36 = X.AnonymousClass36k.f37906H;	 Catch:{ all -> 0x129e }
        r4 = r0.f7412z;	 Catch:{ all -> 0x129e }
        r2 = r1.f53441Z;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x07c0;	 Catch:{ all -> 0x129e }
    L_0x07b9:
        r2 = r1.KB;	 Catch:{ all -> 0x0764 }
        if (r2 != 0) goto L_0x07c0;	 Catch:{ all -> 0x0764 }
    L_0x07bd:
        r39 = 1;	 Catch:{ all -> 0x0764 }
        goto L_0x07c2;	 Catch:{ all -> 0x0764 }
    L_0x07c0:
        r39 = 0;	 Catch:{ all -> 0x0764 }
    L_0x07c2:
        r3 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r2 = r0.f7390d;	 Catch:{ all -> 0x129e }
        r32 = r8;	 Catch:{ all -> 0x129e }
        r33 = r7;	 Catch:{ all -> 0x129e }
        r34 = r6;	 Catch:{ all -> 0x129e }
        r35 = r5;	 Catch:{ all -> 0x129e }
        r37 = r4;	 Catch:{ all -> 0x129e }
        r38 = r20;	 Catch:{ all -> 0x129e }
        r40 = r3;	 Catch:{ all -> 0x129e }
        r41 = r2;	 Catch:{ all -> 0x129e }
        r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41);	 Catch:{ all -> 0x129e }
        r0.f7377Q = r8;	 Catch:{ all -> 0x129e }
        r6 = new X.4QI;	 Catch:{ all -> 0x129e }
        r5 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r4 = r0.YB;	 Catch:{ all -> 0x129e }
        r3 = r0.f7368H;	 Catch:{ all -> 0x129e }
        r2 = r0.f7412z;	 Catch:{ all -> 0x129e }
        r6.<init>(r5, r4, r3, r2);	 Catch:{ all -> 0x129e }
        r0.f7403q = r6;	 Catch:{ all -> 0x129e }
        r2 = new X.5Tg;	 Catch:{ all -> 0x129e }
        r3 = r0.YB;	 Catch:{ all -> 0x129e }
        r4 = r0.f7390d;	 Catch:{ all -> 0x129e }
        r5 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r7 = new X.5TF;	 Catch:{ all -> 0x129e }
        r7.<init>(r0);	 Catch:{ all -> 0x129e }
        r6 = r0;	 Catch:{ all -> 0x129e }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x129e }
        r0.f7387a = r2;	 Catch:{ all -> 0x129e }
        r9 = new X.0eB;	 Catch:{ all -> 0x129e }
        r2 = r0.f7370J;	 Catch:{ all -> 0x129e }
        r28 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r27 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7362B;	 Catch:{ all -> 0x129e }
        r26 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r25 = r2;	 Catch:{ all -> 0x129e }
        r15 = r0.YB;	 Catch:{ all -> 0x129e }
        r14 = r0.f7393g;	 Catch:{ all -> 0x129e }
        r13 = r0.f7405s;	 Catch:{ all -> 0x129e }
        r12 = r0.f7369I;	 Catch:{ all -> 0x129e }
        r11 = r0.f7404r;	 Catch:{ all -> 0x129e }
        r10 = r0.f7387a;	 Catch:{ all -> 0x129e }
        r8 = r0.f7368H;	 Catch:{ all -> 0x129e }
        r7 = r0.f7388b;	 Catch:{ all -> 0x129e }
        if (r31 == 0) goto L_0x082c;	 Catch:{ all -> 0x129e }
    L_0x0821:
        r2 = r0.f7362B;	 Catch:{ all -> 0x0764 }
        r2 = X.AnonymousClass0RC.m4122E(r2);	 Catch:{ all -> 0x0764 }
        if (r2 == 0) goto L_0x082c;	 Catch:{ all -> 0x0764 }
    L_0x0829:
        r62 = 1;	 Catch:{ all -> 0x0764 }
        goto L_0x082e;	 Catch:{ all -> 0x0764 }
    L_0x082c:
        r62 = 0;	 Catch:{ all -> 0x0764 }
    L_0x082e:
        if (r23 != 0) goto L_0x0846;	 Catch:{ all -> 0x0764 }
    L_0x0830:
        r3 = X.AnonymousClass0CC.IL;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7407u;	 Catch:{ all -> 0x0764 }
        r3 = r3.m846H(r2);	 Catch:{ all -> 0x0764 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0764 }
        r2 = "hidden_at_startup";	 Catch:{ all -> 0x0764 }
        r2 = r3.equals(r2);	 Catch:{ all -> 0x0764 }
        if (r2 != 0) goto L_0x0843;	 Catch:{ all -> 0x0764 }
    L_0x0842:
        goto L_0x0846;	 Catch:{ all -> 0x0764 }
    L_0x0843:
        r63 = 0;	 Catch:{ all -> 0x0764 }
        goto L_0x0848;	 Catch:{ all -> 0x0764 }
    L_0x0846:
        r63 = 1;	 Catch:{ all -> 0x0764 }
    L_0x0848:
        r6 = r0.f7379S;	 Catch:{ all -> 0x129e }
        r5 = r0.f7377Q;	 Catch:{ all -> 0x129e }
        r4 = r0.f7411y;	 Catch:{ all -> 0x129e }
        r3 = r0.PB;	 Catch:{ all -> 0x129e }
        r2 = r0.f7403q;	 Catch:{ all -> 0x129e }
        r19 = 1;	 Catch:{ all -> 0x129e }
        r46 = r9;	 Catch:{ all -> 0x12a0 }
        r47 = r28;	 Catch:{ all -> 0x12a0 }
        r48 = r27;	 Catch:{ all -> 0x12a0 }
        r49 = r26;	 Catch:{ all -> 0x12a0 }
        r50 = r25;	 Catch:{ all -> 0x12a0 }
        r51 = r15;	 Catch:{ all -> 0x12a0 }
        r52 = r14;	 Catch:{ all -> 0x12a0 }
        r53 = r23;	 Catch:{ all -> 0x12a0 }
        r54 = r83;	 Catch:{ all -> 0x12a0 }
        r55 = r0;	 Catch:{ all -> 0x12a0 }
        r56 = r13;	 Catch:{ all -> 0x12a0 }
        r57 = r12;	 Catch:{ all -> 0x12a0 }
        r58 = r11;	 Catch:{ all -> 0x12a0 }
        r59 = r10;	 Catch:{ all -> 0x12a0 }
        r60 = r8;	 Catch:{ all -> 0x12a0 }
        r61 = r7;	 Catch:{ all -> 0x12a0 }
        r64 = r24;	 Catch:{ all -> 0x12a0 }
        r65 = r6;	 Catch:{ all -> 0x12a0 }
        r66 = r5;	 Catch:{ all -> 0x12a0 }
        r67 = r1;	 Catch:{ all -> 0x12a0 }
        r68 = r4;	 Catch:{ all -> 0x12a0 }
        r69 = r3;	 Catch:{ all -> 0x12a0 }
        r70 = r2;	 Catch:{ all -> 0x12a0 }
        r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70);	 Catch:{ all -> 0x12a0 }
        r0.f7367G = r9;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7411y;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7367G;	 Catch:{ all -> 0x12ac }
        r3.A(r2);	 Catch:{ all -> 0x12ac }
        r3 = r0.f7377Q;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7367G;	 Catch:{ all -> 0x12ac }
        r3.f7680Z = r2;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7403q;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7367G;	 Catch:{ all -> 0x12ac }
        r3.f53887F = r2;	 Catch:{ all -> 0x12ac }
        X.AnonymousClass0dF.m5987c(r0);	 Catch:{ all -> 0x12ac }
        r4 = new X.4Q9;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r4.<init>(r3, r2);	 Catch:{ all -> 0x12ac }
        r0.hB = r4;	 Catch:{ all -> 0x12ac }
        r2 = r0.hB;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7367G;	 Catch:{ all -> 0x12ac }
        r2 = r2.f53857C;	 Catch:{ all -> 0x12ac }
        r2.add(r3);	 Catch:{ all -> 0x12ac }
        r3 = r0.AB;	 Catch:{ all -> 0x12ac }
        r2 = r0.hB;	 Catch:{ all -> 0x12ac }
        r3.setOnKeyListener(r2);	 Catch:{ all -> 0x12ac }
        if (r31 == 0) goto L_0x08f0;	 Catch:{ all -> 0x12ac }
    L_0x08ba:
        r10 = new X.4Mw;	 Catch:{ all -> 0x00d1 }
        r9 = r0.f7370J;	 Catch:{ all -> 0x00d1 }
        r8 = r0.f7390d;	 Catch:{ all -> 0x00d1 }
        r7 = r0.f7376P;	 Catch:{ all -> 0x00d1 }
        if (r31 == 0) goto L_0x08c9;	 Catch:{ all -> 0x00d1 }
    L_0x08c4:
        r11 = r0.f7362B;	 Catch:{ all -> 0x00d1 }
        r11 = (X.AnonymousClass0Hk) r11;	 Catch:{ all -> 0x00d1 }
        goto L_0x08ca;	 Catch:{ all -> 0x00d1 }
    L_0x08c9:
        r11 = 0;	 Catch:{ all -> 0x00d1 }
    L_0x08ca:
        r6 = r0.AB;	 Catch:{ all -> 0x00d1 }
        r5 = r0.f7407u;	 Catch:{ all -> 0x00d1 }
        r4 = r0.f7391e;	 Catch:{ all -> 0x00d1 }
        r3 = r0.f7367G;	 Catch:{ all -> 0x00d1 }
        r2 = r0.f7368H;	 Catch:{ all -> 0x00d1 }
        r26 = r7;	 Catch:{ all -> 0x00d1 }
        r27 = r11;	 Catch:{ all -> 0x00d1 }
        r28 = r6;	 Catch:{ all -> 0x00d1 }
        r29 = r0;	 Catch:{ all -> 0x00d1 }
        r30 = r5;	 Catch:{ all -> 0x00d1 }
        r31 = r4;	 Catch:{ all -> 0x00d1 }
        r32 = r3;	 Catch:{ all -> 0x00d1 }
        r33 = r2;	 Catch:{ all -> 0x00d1 }
        r23 = r10;	 Catch:{ all -> 0x00d1 }
        r24 = r9;	 Catch:{ all -> 0x00d1 }
        r25 = r8;	 Catch:{ all -> 0x00d1 }
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);	 Catch:{ all -> 0x00d1 }
        r0.f7383W = r10;	 Catch:{ all -> 0x00d1 }
        goto L_0x08f3;	 Catch:{ all -> 0x00d1 }
    L_0x08f0:
        r2 = 0;	 Catch:{ all -> 0x00d1 }
        r0.f7383W = r2;	 Catch:{ all -> 0x12ac }
    L_0x08f3:
        r5 = new X.4N9;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r3 = r0.YB;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r5.<init>(r4, r3, r2);	 Catch:{ all -> 0x12ac }
        r0.SB = r5;	 Catch:{ all -> 0x12ac }
        r6 = new X.4LH;	 Catch:{ all -> 0x12ac }
        r5 = r0.f7374N;	 Catch:{ all -> 0x12ac }
        r4 = r0.f7404r;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7373M;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r6.<init>(r5, r4, r3, r2);	 Catch:{ all -> 0x12ac }
        r0.DB = r6;	 Catch:{ all -> 0x12ac }
        r12 = new X.4OF;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7374N;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7404r;	 Catch:{ all -> 0x12ac }
        r12.<init>(r3, r2);	 Catch:{ all -> 0x12ac }
        r11 = new X.5TB;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7370J;	 Catch:{ all -> 0x12ac }
        r24 = r2;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r25 = r2;	 Catch:{ all -> 0x12ac }
        r15 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r14 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r13 = r0.f7374N;	 Catch:{ all -> 0x12ac }
        r10 = r0.f7404r;	 Catch:{ all -> 0x12ac }
        r9 = r0.f7373M;	 Catch:{ all -> 0x12ac }
        r8 = r0.f7405s;	 Catch:{ all -> 0x12ac }
        r2 = r0.UB;	 Catch:{ all -> 0x12ac }
        r7 = r2.f64634B;	 Catch:{ all -> 0x12ac }
        r6 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r5 = r0.SB;	 Catch:{ all -> 0x12ac }
        r4 = r0.DB;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7412z;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53441Z;	 Catch:{ all -> 0x12ac }
        r23 = r11;	 Catch:{ all -> 0x12a0 }
        r26 = r15;	 Catch:{ all -> 0x12a0 }
        r27 = r14;	 Catch:{ all -> 0x12a0 }
        r28 = r0;	 Catch:{ all -> 0x12a0 }
        r29 = r13;	 Catch:{ all -> 0x12a0 }
        r30 = r10;	 Catch:{ all -> 0x12a0 }
        r31 = r9;	 Catch:{ all -> 0x12a0 }
        r32 = r8;	 Catch:{ all -> 0x12a0 }
        r33 = r7;	 Catch:{ all -> 0x12a0 }
        r34 = r6;	 Catch:{ all -> 0x12a0 }
        r35 = r5;	 Catch:{ all -> 0x12a0 }
        r36 = r4;	 Catch:{ all -> 0x12a0 }
        r37 = r12;	 Catch:{ all -> 0x12a0 }
        r38 = r21;	 Catch:{ all -> 0x12a0 }
        r39 = r18;	 Catch:{ all -> 0x12a0 }
        r40 = r3;	 Catch:{ all -> 0x12a0 }
        r41 = r20;	 Catch:{ all -> 0x12a0 }
        r42 = r2;	 Catch:{ all -> 0x12a0 }
        r43 = r74;	 Catch:{ all -> 0x12a0 }
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43);	 Catch:{ all -> 0x12a0 }
        r0.f7392f = r11;	 Catch:{ all -> 0x12ac }
        r11 = new X.5TY;	 Catch:{ all -> 0x12ac }
        r2 = r0.f7370J;	 Catch:{ all -> 0x12ac }
        r23 = r2;	 Catch:{ all -> 0x12ac }
        r15 = r0.f7402p;	 Catch:{ all -> 0x12ac }
        r14 = r0.f7362B;	 Catch:{ all -> 0x12ac }
        r13 = r0.f7389c;	 Catch:{ all -> 0x12ac }
        r10 = r0.f7374N;	 Catch:{ all -> 0x12ac }
        r9 = r0.f7373M;	 Catch:{ all -> 0x12ac }
        r8 = r0.f7405s;	 Catch:{ all -> 0x12ac }
        r2 = r0.UB;	 Catch:{ all -> 0x12ac }
        r7 = r2.f64637E;	 Catch:{ all -> 0x12ac }
        r6 = r0.f7407u;	 Catch:{ all -> 0x12ac }
        r5 = r0.SB;	 Catch:{ all -> 0x12ac }
        r4 = r0.DB;	 Catch:{ all -> 0x12ac }
        r3 = r0.f7412z;	 Catch:{ all -> 0x12ac }
        r2 = r1.f53441Z;	 Catch:{ all -> 0x12ac }
        r55 = r11;	 Catch:{ all -> 0x12a0 }
        r56 = r23;	 Catch:{ all -> 0x12a0 }
        r57 = r15;	 Catch:{ all -> 0x12a0 }
        r58 = r14;	 Catch:{ all -> 0x12a0 }
        r59 = r13;	 Catch:{ all -> 0x12a0 }
        r60 = r0;	 Catch:{ all -> 0x12a0 }
        r61 = r10;	 Catch:{ all -> 0x12a0 }
        r62 = r9;	 Catch:{ all -> 0x12a0 }
        r63 = r8;	 Catch:{ all -> 0x12a0 }
        r64 = r7;	 Catch:{ all -> 0x12a0 }
        r65 = r6;	 Catch:{ all -> 0x12a0 }
        r66 = r5;	 Catch:{ all -> 0x12a0 }
        r67 = r4;	 Catch:{ all -> 0x12a0 }
        r68 = r12;	 Catch:{ all -> 0x12a0 }
        r69 = r3;	 Catch:{ all -> 0x12a0 }
        r70 = r21;	 Catch:{ all -> 0x12a0 }
        r71 = r18;	 Catch:{ all -> 0x12a0 }
        r72 = r20;	 Catch:{ all -> 0x12a0 }
        r73 = r2;	 Catch:{ all -> 0x12a0 }
        r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74);	 Catch:{ all -> 0x12a0 }
        r0.f7408v = r11;	 Catch:{ all -> 0x129e }
        r3 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r2 = r22;	 Catch:{ all -> 0x129e }
        r2.A(r3);	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r2 = r2.f66860a;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r2 = r2.f66870k;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r2 = r2.f66853T;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
        r4 = new X.5T9;	 Catch:{ all -> 0x129e }
        r5 = r0.f7370J;	 Catch:{ all -> 0x129e }
        r6 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r7 = r0.f7367G;	 Catch:{ all -> 0x129e }
        r8 = r0.f7392f;	 Catch:{ all -> 0x129e }
        r9 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r10 = r0.YB;	 Catch:{ all -> 0x129e }
        r2 = r0.f7393g;	 Catch:{ all -> 0x129e }
        r11 = r2.f54368I;	 Catch:{ all -> 0x129e }
        r3 = r0.OB;	 Catch:{ all -> 0x129e }
        r2 = r1.f53444c;	 Catch:{ all -> 0x129e }
        r12 = r0;	 Catch:{ all -> 0x129e }
        r13 = r3;	 Catch:{ all -> 0x129e }
        r14 = r2;	 Catch:{ all -> 0x129e }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x129e }
        r0.f7385Y = r4;	 Catch:{ all -> 0x129e }
        r2 = r0.f7367G;	 Catch:{ all -> 0x129e }
        r3 = r0.f7385Y;	 Catch:{ all -> 0x129e }
        r2 = r2.f7602P;	 Catch:{ all -> 0x129e }
        r2.setVideoCaptureDelegate(r3);	 Catch:{ all -> 0x129e }
        r11 = new X.5Tf;	 Catch:{ all -> 0x129e }
        r10 = r0.f7370J;	 Catch:{ all -> 0x129e }
        r9 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r8 = r0.f7362B;	 Catch:{ all -> 0x129e }
        r7 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r6 = r0.f7389c;	 Catch:{ all -> 0x129e }
        r5 = r0.f7392f;	 Catch:{ all -> 0x129e }
        r4 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r3 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r2 = r0.DB;	 Catch:{ all -> 0x129e }
        r70 = r11;	 Catch:{ all -> 0x129e }
        r71 = r10;	 Catch:{ all -> 0x129e }
        r73 = r9;	 Catch:{ all -> 0x129e }
        r74 = r8;	 Catch:{ all -> 0x129e }
        r75 = r7;	 Catch:{ all -> 0x129e }
        r76 = r6;	 Catch:{ all -> 0x129e }
        r78 = r5;	 Catch:{ all -> 0x129e }
        r79 = r4;	 Catch:{ all -> 0x129e }
        r80 = r3;	 Catch:{ all -> 0x129e }
        r81 = r2;	 Catch:{ all -> 0x129e }
        r72 = r45;	 Catch:{ all -> 0x129e }
        r70.<init>(r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82);	 Catch:{ all -> 0x129e }
        r0.f7386Z = r11;	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r0.f7386Z;	 Catch:{ all -> 0x129e }
        r2 = r2.f66845L;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
        r2 = X.AnonymousClass4MP.C();	 Catch:{ all -> 0x129e }
        r2 = r2 ^ 1;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0aaa;	 Catch:{ all -> 0x129e }
    L_0x0a3b:
        r3 = r0.f7389c;	 Catch:{ all -> 0x0764 }
        r2 = 2131297524; // 0x7f0904f4 float:1.8212995E38 double:1.0530008877E-314;	 Catch:{ all -> 0x0764 }
        r2 = r3.findViewById(r2);	 Catch:{ all -> 0x0764 }
        r2 = (android.view.ViewStub) r2;	 Catch:{ all -> 0x0764 }
        r2.inflate();	 Catch:{ all -> 0x0764 }
        r3 = r0.f7389c;	 Catch:{ all -> 0x0764 }
        r2 = 2131297514; // 0x7f0904ea float:1.8212975E38 double:1.0530008827E-314;	 Catch:{ all -> 0x0764 }
        r11 = r3.findViewById(r2);	 Catch:{ all -> 0x0764 }
        r11 = (android.view.ViewGroup) r11;	 Catch:{ all -> 0x0764 }
        r10 = new X.5T4;	 Catch:{ all -> 0x0764 }
        r13 = r0.f7370J;	 Catch:{ all -> 0x0764 }
        r9 = r0.f7402p;	 Catch:{ all -> 0x0764 }
        r8 = r0.f7362B;	 Catch:{ all -> 0x0764 }
        r7 = r0.f7407u;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7390d;	 Catch:{ all -> 0x0764 }
        r25 = r2.getLoaderManager();	 Catch:{ all -> 0x0764 }
        r2 = r0.f7393g;	 Catch:{ all -> 0x0764 }
        r6 = r2.f54372M;	 Catch:{ all -> 0x0764 }
        r3 = r0.AB;	 Catch:{ all -> 0x0764 }
        r2 = 2131297527; // 0x7f0904f7 float:1.8213001E38 double:1.053000889E-314;	 Catch:{ all -> 0x0764 }
        r5 = r3.findViewById(r2);	 Catch:{ all -> 0x0764 }
        r5 = (android.widget.ImageView) r5;	 Catch:{ all -> 0x0764 }
        r3 = r0.AB;	 Catch:{ all -> 0x0764 }
        r2 = 2131297531; // 0x7f0904fb float:1.821301E38 double:1.053000891E-314;	 Catch:{ all -> 0x0764 }
        r4 = r3.findViewById(r2);	 Catch:{ all -> 0x0764 }
        r4 = (android.view.ViewGroup) r4;	 Catch:{ all -> 0x0764 }
        r3 = r1.f53445d;	 Catch:{ all -> 0x0764 }
        r12 = X.AnonymousClass0CC.sD;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7407u;	 Catch:{ all -> 0x0764 }
        r2 = r12.m846H(r2);	 Catch:{ all -> 0x0764 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x0764 }
        r32 = r2.booleanValue();	 Catch:{ all -> 0x0764 }
        r27 = r6;	 Catch:{ all -> 0x0764 }
        r28 = r5;	 Catch:{ all -> 0x0764 }
        r29 = r4;	 Catch:{ all -> 0x0764 }
        r30 = r0;	 Catch:{ all -> 0x0764 }
        r31 = r3;	 Catch:{ all -> 0x0764 }
        r20 = r10;	 Catch:{ all -> 0x0764 }
        r21 = r13;	 Catch:{ all -> 0x0764 }
        r22 = r9;	 Catch:{ all -> 0x0764 }
        r23 = r8;	 Catch:{ all -> 0x0764 }
        r24 = r7;	 Catch:{ all -> 0x0764 }
        r26 = r11;	 Catch:{ all -> 0x0764 }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);	 Catch:{ all -> 0x0764 }
        r0.f7380T = r10;	 Catch:{ all -> 0x0764 }
        goto L_0x0ae5;	 Catch:{ all -> 0x0764 }
    L_0x0aaa:
        r3 = r0.f7389c;	 Catch:{ all -> 0x129e }
        r2 = 2131297526; // 0x7f0904f6 float:1.8213E38 double:1.0530008887E-314;	 Catch:{ all -> 0x129e }
        r2 = r3.findViewById(r2);	 Catch:{ all -> 0x129e }
        r2 = (android.view.ViewStub) r2;	 Catch:{ all -> 0x129e }
        r2.inflate();	 Catch:{ all -> 0x129e }
        r3 = r0.f7389c;	 Catch:{ all -> 0x129e }
        r2 = 2131297514; // 0x7f0904ea float:1.8212975E38 double:1.0530008827E-314;	 Catch:{ all -> 0x129e }
        r9 = r3.findViewById(r2);	 Catch:{ all -> 0x129e }
        r9 = (android.view.ViewGroup) r9;	 Catch:{ all -> 0x129e }
        r4 = new X.5T7;	 Catch:{ all -> 0x129e }
        r5 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r6 = r0.f7362B;	 Catch:{ all -> 0x129e }
        r7 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r2 = r0.f7390d;	 Catch:{ all -> 0x129e }
        r8 = r2.getLoaderManager();	 Catch:{ all -> 0x129e }
        r2 = r0.f7393g;	 Catch:{ all -> 0x129e }
        r10 = r2.f54372M;	 Catch:{ all -> 0x129e }
        r3 = r0.AB;	 Catch:{ all -> 0x129e }
        r2 = 2131297527; // 0x7f0904f7 float:1.8213001E38 double:1.053000889E-314;	 Catch:{ all -> 0x129e }
        r11 = r3.findViewById(r2);	 Catch:{ all -> 0x129e }
        r11 = (android.widget.ImageView) r11;	 Catch:{ all -> 0x129e }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x129e }
        r0.f7380T = r4;	 Catch:{ all -> 0x129e }
    L_0x0ae5:
        r13 = new X.4QO;	 Catch:{ all -> 0x129e }
        r2 = r0.f7362B;	 Catch:{ all -> 0x129e }
        r13.<init>(r2);	 Catch:{ all -> 0x129e }
        r2 = r0.f7392f;	 Catch:{ all -> 0x129e }
        r3 = r2.f64343I;	 Catch:{ all -> 0x129e }
        r2 = r13.f53927C;	 Catch:{ all -> 0x129e }
        r2 = r2.contains(r3);	 Catch:{ all -> 0x129e }
        if (r2 != 0) goto L_0x0afd;	 Catch:{ all -> 0x129e }
    L_0x0af8:
        r2 = r13.f53927C;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
    L_0x0afd:
        r2 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r3 = r2.f64472J;	 Catch:{ all -> 0x129e }
        r2 = r13.f53927C;	 Catch:{ all -> 0x129e }
        r2 = r2.contains(r3);	 Catch:{ all -> 0x129e }
        if (r2 != 0) goto L_0x0b0e;	 Catch:{ all -> 0x129e }
    L_0x0b09:
        r2 = r13.f53927C;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
    L_0x0b0e:
        r12 = new X.4QM;	 Catch:{ all -> 0x129e }
        r15 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r14 = r0.f7362B;	 Catch:{ all -> 0x129e }
        r11 = r0.AB;	 Catch:{ all -> 0x129e }
        r10 = r0.f7368H;	 Catch:{ all -> 0x129e }
        r9 = r0.f7404r;	 Catch:{ all -> 0x129e }
        r8 = r0.f7387a;	 Catch:{ all -> 0x129e }
        r7 = r0.f7367G;	 Catch:{ all -> 0x129e }
        r6 = r0.f7380T;	 Catch:{ all -> 0x129e }
        r5 = r0.f7385Y;	 Catch:{ all -> 0x129e }
        r4 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r0.f7369I;	 Catch:{ all -> 0x129e }
        r2 = r0.FB;	 Catch:{ all -> 0x129e }
        r28 = r6;	 Catch:{ all -> 0x129e }
        r29 = r5;	 Catch:{ all -> 0x129e }
        r30 = r4;	 Catch:{ all -> 0x129e }
        r31 = r3;	 Catch:{ all -> 0x129e }
        r32 = r2;	 Catch:{ all -> 0x129e }
        r33 = r13;	 Catch:{ all -> 0x129e }
        r34 = r83;	 Catch:{ all -> 0x129e }
        r20 = r12;	 Catch:{ all -> 0x129e }
        r21 = r15;	 Catch:{ all -> 0x129e }
        r22 = r14;	 Catch:{ all -> 0x129e }
        r23 = r11;	 Catch:{ all -> 0x129e }
        r24 = r10;	 Catch:{ all -> 0x129e }
        r25 = r9;	 Catch:{ all -> 0x129e }
        r26 = r8;	 Catch:{ all -> 0x129e }
        r27 = r7;	 Catch:{ all -> 0x129e }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34);	 Catch:{ all -> 0x129e }
        r0.f7382V = r12;	 Catch:{ all -> 0x129e }
        r2 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r2.A(r0);	 Catch:{ all -> 0x129e }
        r3 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r2 = r0.f7369I;	 Catch:{ all -> 0x129e }
        r3.A(r2);	 Catch:{ all -> 0x129e }
        r3 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r2 = r0.f7380T;	 Catch:{ all -> 0x129e }
        r3.A(r2);	 Catch:{ all -> 0x129e }
        r3 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r2 = r0.f7392f;	 Catch:{ all -> 0x129e }
        r3.A(r2);	 Catch:{ all -> 0x129e }
        r3 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r2 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r3.A(r2);	 Catch:{ all -> 0x129e }
        r3 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3.A(r2);	 Catch:{ all -> 0x129e }
        r2 = r0.f7373M;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0b8e;	 Catch:{ all -> 0x129e }
    L_0x0b77:
        r2 = r0.f7373M;	 Catch:{ all -> 0x0764 }
        r3 = r0.f7367G;	 Catch:{ all -> 0x0764 }
        r2 = r2.f53060O;	 Catch:{ all -> 0x0764 }
        r2.add(r3);	 Catch:{ all -> 0x0764 }
        r2 = r0.f7373M;	 Catch:{ all -> 0x0764 }
        r2 = r2.f53060O;	 Catch:{ all -> 0x0764 }
        r2.add(r0);	 Catch:{ all -> 0x0764 }
        r3 = r0.f7382V;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7373M;	 Catch:{ all -> 0x0764 }
        r3.A(r2);	 Catch:{ all -> 0x0764 }
    L_0x0b8e:
        r10 = new X.5TC;	 Catch:{ all -> 0x129e }
        r9 = r0.f7402p;	 Catch:{ all -> 0x129e }
        r8 = r0.f7372L;	 Catch:{ all -> 0x129e }
        r7 = r0.f7393g;	 Catch:{ all -> 0x129e }
        r6 = r0.f7367G;	 Catch:{ all -> 0x129e }
        r5 = r0.f7387a;	 Catch:{ all -> 0x129e }
        r4 = r0.f7385Y;	 Catch:{ all -> 0x129e }
        r3 = r0.f7403q;	 Catch:{ all -> 0x129e }
        r2 = r0.f7404r;	 Catch:{ all -> 0x129e }
        r22 = r8;	 Catch:{ all -> 0x129e }
        r23 = r1;	 Catch:{ all -> 0x129e }
        r24 = r7;	 Catch:{ all -> 0x129e }
        r25 = r6;	 Catch:{ all -> 0x129e }
        r26 = r5;	 Catch:{ all -> 0x129e }
        r27 = r4;	 Catch:{ all -> 0x129e }
        r28 = r3;	 Catch:{ all -> 0x129e }
        r29 = r2;	 Catch:{ all -> 0x129e }
        r20 = r10;	 Catch:{ all -> 0x129e }
        r21 = r9;	 Catch:{ all -> 0x129e }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29);	 Catch:{ all -> 0x129e }
        r0.f7395i = r10;	 Catch:{ all -> 0x129e }
        r3 = r0.f7377Q;	 Catch:{ all -> 0x129e }
        r2 = r0.f7395i;	 Catch:{ all -> 0x129e }
        r3.f7686f = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r3 = r0.f7395i;	 Catch:{ all -> 0x129e }
        r2 = r2.f66845L;	 Catch:{ all -> 0x129e }
        r2.add(r3);	 Catch:{ all -> 0x129e }
        r3 = r0.f7394h;	 Catch:{ all -> 0x129e }
        r2 = r0.f7395i;	 Catch:{ all -> 0x129e }
        r3.B(r2);	 Catch:{ all -> 0x129e }
        r2 = new X.4Mo;	 Catch:{ all -> 0x129e }
        r3 = r0.f7389c;	 Catch:{ all -> 0x129e }
        r4 = r0.YB;	 Catch:{ all -> 0x129e }
        r5 = r0.f7380T;	 Catch:{ all -> 0x129e }
        r6 = r0.f7369I;	 Catch:{ all -> 0x129e }
        r7 = r0.f7404r;	 Catch:{ all -> 0x129e }
        r8 = r1.f53449h;	 Catch:{ all -> 0x129e }
        r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x129e }
        r0.f7381U = r2;	 Catch:{ all -> 0x129e }
        r6 = r0.f7381U;	 Catch:{ all -> 0x129e }
        r2 = 7;	 Catch:{ all -> 0x129e }
        r5 = new X.AnonymousClass0dJ[r2];	 Catch:{ all -> 0x129e }
        r5[r17] = r82;	 Catch:{ all -> 0x129e }
        r2 = r0.f7395i;	 Catch:{ all -> 0x129e }
        r5[r19] = r2;	 Catch:{ all -> 0x129e }
        r3 = r0.f7367G;	 Catch:{ all -> 0x129e }
        r2 = 2;	 Catch:{ all -> 0x129e }
        r5[r2] = r3;	 Catch:{ all -> 0x129e }
        r3 = 3;	 Catch:{ all -> 0x129e }
        r2 = r0.f7369I;	 Catch:{ all -> 0x129e }
        r5[r3] = r2;	 Catch:{ all -> 0x129e }
        r3 = 4;	 Catch:{ all -> 0x129e }
        r2 = r0.f7380T;	 Catch:{ all -> 0x129e }
        r5[r3] = r2;	 Catch:{ all -> 0x129e }
        r3 = 5;	 Catch:{ all -> 0x129e }
        r2 = r0.f7382V;	 Catch:{ all -> 0x129e }
        r5[r3] = r2;	 Catch:{ all -> 0x129e }
        r3 = 6;	 Catch:{ all -> 0x129e }
        r2 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r2 = X.AnonymousClass4KL.I(r2);	 Catch:{ all -> 0x129e }
        r5[r3] = r2;	 Catch:{ all -> 0x129e }
        r4 = r5.length;	 Catch:{ all -> 0x129e }
        r3 = 0;	 Catch:{ all -> 0x129e }
    L_0x0c0c:
        if (r3 >= r4) goto L_0x0c16;	 Catch:{ all -> 0x129e }
    L_0x0c0e:
        r2 = r5[r3];	 Catch:{ all -> 0x129e }
        r6.A(r2);	 Catch:{ all -> 0x129e }
        r3 = r3 + 1;	 Catch:{ all -> 0x129e }
        goto L_0x0c0c;	 Catch:{ all -> 0x129e }
    L_0x0c16:
        r2 = r0.f7373M;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0c21;	 Catch:{ all -> 0x129e }
    L_0x0c1a:
        r3 = r0.f7381U;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7373M;	 Catch:{ all -> 0x0764 }
        r3.A(r2);	 Catch:{ all -> 0x0764 }
    L_0x0c21:
        r2 = r0.NB;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0c2c;	 Catch:{ all -> 0x129e }
    L_0x0c25:
        r3 = r0.f7381U;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7396j;	 Catch:{ all -> 0x0764 }
        r3.A(r2);	 Catch:{ all -> 0x0764 }
    L_0x0c2c:
        r2 = r0.f7388b;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0c37;	 Catch:{ all -> 0x129e }
    L_0x0c30:
        r3 = r0.f7381U;	 Catch:{ all -> 0x0764 }
        r2 = r0.f7388b;	 Catch:{ all -> 0x0764 }
        r3.A(r2);	 Catch:{ all -> 0x0764 }
    L_0x0c37:
        r3 = r1.f53424I;	 Catch:{ all -> 0x129e }
        r2 = X.AnonymousClass0cD.GALLERY;	 Catch:{ all -> 0x129e }
        if (r3 != r2) goto L_0x0c3f;	 Catch:{ all -> 0x129e }
    L_0x0c3d:
        r2 = 1;	 Catch:{ all -> 0x129e }
        goto L_0x0c40;	 Catch:{ all -> 0x129e }
    L_0x0c3f:
        r2 = 0;	 Catch:{ all -> 0x129e }
    L_0x0c40:
        r0.cB = r2;	 Catch:{ all -> 0x129e }
        r13 = new X.4L1;	 Catch:{ all -> 0x129e }
        r2 = r0.f7370J;	 Catch:{ all -> 0x129e }
        r35 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7372L;	 Catch:{ all -> 0x129e }
        r34 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7407u;	 Catch:{ all -> 0x129e }
        r33 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.AB;	 Catch:{ all -> 0x129e }
        r32 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7385Y;	 Catch:{ all -> 0x129e }
        r31 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7374N;	 Catch:{ all -> 0x129e }
        r30 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7386Z;	 Catch:{ all -> 0x129e }
        r29 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7392f;	 Catch:{ all -> 0x129e }
        r28 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7408v;	 Catch:{ all -> 0x129e }
        r27 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7404r;	 Catch:{ all -> 0x129e }
        r26 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7387a;	 Catch:{ all -> 0x129e }
        r25 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7380T;	 Catch:{ all -> 0x129e }
        r24 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7381U;	 Catch:{ all -> 0x129e }
        r23 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7369I;	 Catch:{ all -> 0x129e }
        r22 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7367G;	 Catch:{ all -> 0x129e }
        r21 = r2;	 Catch:{ all -> 0x129e }
        r2 = r0.f7377Q;	 Catch:{ all -> 0x129e }
        r20 = r2;	 Catch:{ all -> 0x129e }
        r15 = r0.f7388b;	 Catch:{ all -> 0x129e }
        r14 = r0.f7383W;	 Catch:{ all -> 0x129e }
        r12 = r0.f7379S;	 Catch:{ all -> 0x129e }
        r11 = r0.f7365E;	 Catch:{ all -> 0x129e }
        r10 = r0.f7373M;	 Catch:{ all -> 0x129e }
        r9 = r0.FB;	 Catch:{ all -> 0x129e }
        r8 = r0.f7396j;	 Catch:{ all -> 0x129e }
        r7 = r0.f7394h;	 Catch:{ all -> 0x129e }
        r2 = r1.f53438W;	 Catch:{ all -> 0x129e }
        if (r2 == 0) goto L_0x0ca1;	 Catch:{ all -> 0x129e }
    L_0x0c98:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0764 }
        r2 = 23;	 Catch:{ all -> 0x0764 }
        if (r3 < r2) goto L_0x0ca1;	 Catch:{ all -> 0x0764 }
    L_0x0c9e:
        r72 = 1;	 Catch:{ all -> 0x0764 }
        goto L_0x0ca3;	 Catch:{ all -> 0x0764 }
    L_0x0ca1:
        r72 = 0;	 Catch:{ all -> 0x0764 }
    L_0x0ca3:
        r6 = r0.cB;	 Catch:{ all -> 0x129e }
        r5 = r0.f7391e;	 Catch:{ all -> 0x129e }
        r4 = r0.f7412z;	 Catch:{ all -> 0x129e }
        r3 = r0.f7406t;	 Catch:{ all -> 0x129e }
        r2 = r0.f7395i;	 Catch:{ all -> 0x129e }
        r43 = r13;	 Catch:{ all -> 0x12a0 }
        r44 = r35;	 Catch:{ all -> 0x12a0 }
        r46 = r34;	 Catch:{ all -> 0x12a0 }
        r47 = r33;	 Catch:{ all -> 0x12a0 }
        r48 = r32;	 Catch:{ all -> 0x12a0 }
        r49 = r0;	 Catch:{ all -> 0x12a0 }
        r50 = r31;	 Catch:{ all -> 0x12a0 }
        r51 = r30;	 Catch:{ all -> 0x12a0 }
        r52 = r29;	 Catch:{ all -> 0x12a0 }
        r53 = r28;	 Catch:{ all -> 0x12a0 }
        r54 = r27;	 Catch:{ all -> 0x12a0 }
        r55 = r26;	 Catch:{ all -> 0x12a0 }
        r56 = r25;	 Catch:{ all -> 0x12a0 }
        r57 = r24;	 Catch:{ all -> 0x12a0 }
        r58 = r23;	 Catch:{ all -> 0x12a0 }
        r59 = r22;	 Catch:{ all -> 0x12a0 }
        r60 = r21;	 Catch:{ all -> 0x12a0 }
        r61 = r20;	 Catch:{ all -> 0x12a0 }
        r62 = r18;	 Catch:{ all -> 0x12a0 }
        r63 = r15;	 Catch:{ all -> 0x12a0 }
        r64 = r14;	 Catch:{ all -> 0x12a0 }
        r65 = r12;	 Catch:{ all -> 0x12a0 }
        r66 = r11;	 Catch:{ all -> 0x12a0 }
        r67 = r10;	 Catch:{ all -> 0x12a0 }
        r68 = r9;	 Catch:{ all -> 0x12a0 }
        r69 = r8;	 Catch:{ all -> 0x12a0 }
        r70 = r7;	 Catch:{ all -> 0x12a0 }
        r71 = r16;	 Catch:{ all -> 0x12a0 }
        r73 = r6;	 Catch:{ all -> 0x12a0 }
        r74 = r5;	 Catch:{ all -> 0x12a0 }
        r75 = r4;	 Catch:{ all -> 0x12a0 }
        r76 = r3;	 Catch:{ all -> 0x12a0 }
        r77 = r2;	 Catch:{ all -> 0x12a0 }
        r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77);	 Catch:{ all -> 0x12a0 }
        r0.f7371K = r13;	 Catch:{ all -> 0x12aa }
        r7 = r0.f7371K;	 Catch:{ all -> 0x12aa }
        r2 = 2;	 Catch:{ all -> 0x12aa }
        r6 = new X.AnonymousClass0eE[r2];	 Catch:{ all -> 0x12aa }
        r2 = r0.f7395i;	 Catch:{ all -> 0x12aa }
        r6[r17] = r2;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7374N;	 Catch:{ all -> 0x12aa }
        r6[r19] = r2;	 Catch:{ all -> 0x12aa }
        r5 = r6.length;	 Catch:{ all -> 0x12aa }
        r4 = 0;	 Catch:{ all -> 0x12aa }
    L_0x0d03:
        if (r4 >= r5) goto L_0x0d17;	 Catch:{ all -> 0x12aa }
    L_0x0d05:
        r3 = r6[r4];	 Catch:{ all -> 0x12aa }
        r2 = r7.f52942l;	 Catch:{ all -> 0x12aa }
        r2 = r2.contains(r3);	 Catch:{ all -> 0x12aa }
        if (r2 != 0) goto L_0x0d14;	 Catch:{ all -> 0x12aa }
    L_0x0d0f:
        r2 = r7.f52942l;	 Catch:{ all -> 0x12aa }
        r2.add(r3);	 Catch:{ all -> 0x12aa }
    L_0x0d14:
        r4 = r4 + 1;	 Catch:{ all -> 0x12aa }
        goto L_0x0d03;	 Catch:{ all -> 0x12aa }
    L_0x0d17:
        r2 = r0.f7411y;	 Catch:{ all -> 0x12aa }
        r2.A(r0);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AN.f38554E;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dg.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AN.f38553D;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AN.f38553D;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dh.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AN.f38554E;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Df.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AN.f38552C;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AN.f38552C;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dg.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AN.f38553D;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dh.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AN.f38554E;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7371K;	 Catch:{ all -> 0x12aa }
        r3.m4797A(r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7382V;	 Catch:{ all -> 0x12aa }
        r3.m4797A(r2);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7372L;	 Catch:{ all -> 0x12aa }
        r4 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4KJ.class;	 Catch:{ all -> 0x12aa }
        r3 = r4.m1036A(r2);	 Catch:{ all -> 0x12aa }
        r3 = (X.AnonymousClass4KJ) r3;	 Catch:{ all -> 0x12aa }
        if (r3 != 0) goto L_0x0d73;	 Catch:{ all -> 0x12aa }
    L_0x0d6b:
        r3 = new X.4KJ;	 Catch:{ all -> 0x12aa }
        r3.<init>(r4);	 Catch:{ all -> 0x12aa }
        r4.m1039D(r2, r3);	 Catch:{ all -> 0x12aa }
    L_0x0d73:
        r5.m4797A(r3);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38534I;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EN.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dv.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r6 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EM.class;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dt.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ec.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EI.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3ET.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Eg.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38549X;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dq.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3ES.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3ER.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38546U;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ed.class;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7397k;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4Nh.f53415C;	 Catch:{ all -> 0x12aa }
        if (r3 != r2) goto L_0x0e5b;	 Catch:{ all -> 0x12aa }
    L_0x0dde:
        r3 = X.AnonymousClass0CC.MG;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass0E6.m1318D(r3, r2);	 Catch:{ all -> 0x12aa }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x12aa }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x0e08;	 Catch:{ all -> 0x12aa }
    L_0x0dee:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EC.class;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ee.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EC.class;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r3, r2, r5);	 Catch:{ all -> 0x12aa }
        goto L_0x0e1f;	 Catch:{ all -> 0x12aa }
    L_0x0e08:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EC.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ee.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EC.class;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r3, r2, r5);	 Catch:{ all -> 0x12aa }
    L_0x0e1f:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EQ.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EO.class;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r2, r3, r4);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38546U;	 Catch:{ all -> 0x12aa }
        r2.m4798B(r5, r3, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dn.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EQ.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3EP.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38546U;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r2, r5, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r2, r5, r4);	 Catch:{ all -> 0x12aa }
        goto L_0x0e80;	 Catch:{ all -> 0x12aa }
    L_0x0e5b:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EC.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ee.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3E5.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EC.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r5);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3E5.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r5);	 Catch:{ all -> 0x12aa }
    L_0x0e80:
        r2 = r0.f7388b;	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x0ec6;	 Catch:{ all -> 0x12aa }
    L_0x0e84:
        r2 = r0.f7362B;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass0RC.m4125H(r2);	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x0ec6;	 Catch:{ all -> 0x12aa }
    L_0x0e8c:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E8.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38538M;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E7.class;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r6);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E8.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38538M;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38538M;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EA.class;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r6);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E9.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38539N;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38539N;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EA.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
    L_0x0ec6:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dt.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dw.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dn.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3E1.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Eg.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38549X;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dq.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38534I;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3ES.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38549X;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Eh.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ef.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7398l;	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x0f2a;	 Catch:{ all -> 0x12aa }
    L_0x0f11:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3EM.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38534I;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r2, r5, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7397k;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4Nh.f53415C;	 Catch:{ all -> 0x12aa }
        if (r3 != r2) goto L_0x0f42;	 Catch:{ all -> 0x12aa }
    L_0x0f22:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r2, r5, r4);	 Catch:{ all -> 0x12aa }
        goto L_0x0f42;	 Catch:{ all -> 0x12aa }
    L_0x0f2a:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3Dn.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r2, r5, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7397k;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4Nh.f53415C;	 Catch:{ all -> 0x12aa }
        if (r3 != r2) goto L_0x0f42;	 Catch:{ all -> 0x12aa }
    L_0x0f39:
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r3, r5, r2);	 Catch:{ all -> 0x12aa }
    L_0x0f42:
        r3 = r0.f7397k;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4Nh.f53415C;	 Catch:{ all -> 0x12aa }
        if (r3 != r2) goto L_0x0f85;	 Catch:{ all -> 0x12aa }
    L_0x0f48:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EX.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38531F;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Di.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Eb.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dj.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38529D;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3ED.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38540O;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EL.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38545T;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EY.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38548W;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
    L_0x0f85:
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r6 = X.AnonymousClass3AM.f38535J;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3ER.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38546U;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EX.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38531F;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Di.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Eb.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3Dj.class;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38529D;	 Catch:{ all -> 0x12aa }
        r2.m4798B(r6, r5, r4);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass27x.B(r2);	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x0fbf;	 Catch:{ all -> 0x12aa }
    L_0x0fb8:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r2, r5, r4);	 Catch:{ all -> 0x12aa }
    L_0x0fbf:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dl.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r6, r2, r4);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3ED.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38540O;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EL.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38545T;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EY.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38548W;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EV.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38550Y;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38550Y;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass1UA.class;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r6);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7399m;	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x1000;	 Catch:{ all -> 0x12aa }
    L_0x0ff7:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E2.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
    L_0x1000:
        r2 = r0.f7400n;	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x100d;	 Catch:{ all -> 0x12aa }
    L_0x1004:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Ea.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
    L_0x100d:
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EM.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38534I;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EF.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38541P;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r6, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3AM.f38541P;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r3, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38531F;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38546U;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dm.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EG.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EE.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7397k;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4Nh.f53415C;	 Catch:{ all -> 0x12aa }
        if (r3 != r2) goto L_0x1077;	 Catch:{ all -> 0x12aa }
    L_0x105e:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38528C;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dm.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EG.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EE.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
    L_0x1077:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38529D;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Ds.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dk.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EH.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38530E;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EZ.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EU.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3E0.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3EK.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3Dx.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38533H;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E3.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38536K;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3ED.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38540O;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EL.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38545T;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EY.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38548W;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass09e.f1097C;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass0E6.m1318D(r3, r2);	 Catch:{ all -> 0x12aa }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x12aa }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x10f4;	 Catch:{ all -> 0x12aa }
    L_0x10e9:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38529D;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EK.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38542Q;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
    L_0x10f4:
        r3 = X.AnonymousClass09e.f1098D;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass0E6.m1318D(r3, r2);	 Catch:{ all -> 0x12aa }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x12aa }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x1124;	 Catch:{ all -> 0x12aa }
    L_0x1104:
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38542Q;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EJ.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38543R;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38543R;	 Catch:{ all -> 0x12aa }
        r2.m4798B(r5, r3, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r4);	 Catch:{ all -> 0x12aa }
    L_0x1124:
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38533H;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dp.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38536K;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3E4.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38540O;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38545T;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38548W;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38542Q;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dy.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r4, r2, r6);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38529D;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3E6.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38537L;	 Catch:{ all -> 0x12aa }
        r5.m4798B(r4, r3, r2);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r5 = X.AnonymousClass3AM.f38537L;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dr.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Do.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3Dn.class;	 Catch:{ all -> 0x12aa }
        r3.m4798B(r5, r2, r6);	 Catch:{ all -> 0x12aa }
        r4 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r3 = X.AnonymousClass3EB.class;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3AM.f38529D;	 Catch:{ all -> 0x12aa }
        r4.m4798B(r5, r3, r2);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38547V;	 Catch:{ all -> 0x12aa }
        r3 = r0.f7377Q;	 Catch:{ all -> 0x12aa }
        r2 = r2.f5588F;	 Catch:{ all -> 0x12aa }
        r2.put(r4, r3);	 Catch:{ all -> 0x12aa }
        r2 = r0.f7388b;	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x1201;	 Catch:{ all -> 0x12aa }
    L_0x11f6:
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = X.AnonymousClass3AM.f38538M;	 Catch:{ all -> 0x12aa }
        r3 = r0.f7388b;	 Catch:{ all -> 0x12aa }
        r2 = r2.f5588F;	 Catch:{ all -> 0x12aa }
        r2.put(r4, r3);	 Catch:{ all -> 0x12aa }
    L_0x1201:
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2.m4797A(r0);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2 = r0.f7371K;	 Catch:{ all -> 0x12aa }
        r2 = r2.f52909E;	 Catch:{ all -> 0x12aa }
        r3.m4797A(r2);	 Catch:{ all -> 0x12aa }
        r5 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r4 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass4KI.class;	 Catch:{ all -> 0x12aa }
        r3 = r4.m1036A(r2);	 Catch:{ all -> 0x12aa }
        r3 = (X.AnonymousClass4KI) r3;	 Catch:{ all -> 0x12aa }
        if (r3 != 0) goto L_0x1225;	 Catch:{ all -> 0x12aa }
    L_0x121d:
        r3 = new X.4KI;	 Catch:{ all -> 0x12aa }
        r3.<init>(r4);	 Catch:{ all -> 0x12aa }
        r4.m1039D(r2, r3);	 Catch:{ all -> 0x12aa }
    L_0x1225:
        r5.m4797A(r3);	 Catch:{ all -> 0x12aa }
        r3 = r0.f7388b;	 Catch:{ all -> 0x12aa }
        if (r3 == 0) goto L_0x1231;	 Catch:{ all -> 0x12aa }
    L_0x122c:
        r2 = r0.f7402p;	 Catch:{ all -> 0x12aa }
        r2.m4797A(r3);	 Catch:{ all -> 0x12aa }
    L_0x1231:
        r2 = r0.f7390d;	 Catch:{ all -> 0x12aa }
        r3 = r2.getContext();	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3G4.f39618D;	 Catch:{ all -> 0x12aa }
        if (r2 != 0) goto L_0x1248;	 Catch:{ all -> 0x12aa }
    L_0x123b:
        r4 = r3.getApplicationContext();	 Catch:{ all -> 0x12aa }
        r3 = "GalleryMetadataPreferences";	 Catch:{ all -> 0x12aa }
        r2 = 0;	 Catch:{ all -> 0x12aa }
        r2 = r4.getSharedPreferences(r3, r2);	 Catch:{ all -> 0x12aa }
        X.AnonymousClass3G4.f39618D = r2;	 Catch:{ all -> 0x12aa }
    L_0x1248:
        r5 = r1.f53420E;	 Catch:{ all -> 0x12aa }
        r4 = r1.f53427L;	 Catch:{ all -> 0x12aa }
        r3 = r0.IB;	 Catch:{ all -> 0x12aa }
        r2 = X.AnonymousClass3DU.f39299X;	 Catch:{ all -> 0x12aa }
        if (r3 != r2) goto L_0x125d;	 Catch:{ all -> 0x12aa }
    L_0x1252:
        r3 = r0.f7403q;	 Catch:{ all -> 0x12aa }
        r3.f53889H = r5;	 Catch:{ all -> 0x12aa }
        r2 = r3.f53889H;	 Catch:{ all -> 0x12aa }
        if (r2 == 0) goto L_0x125c;	 Catch:{ all -> 0x12aa }
    L_0x125a:
        r3.f53888G = r4;	 Catch:{ all -> 0x12aa }
    L_0x125c:
        goto L_0x1267;	 Catch:{ all -> 0x12aa }
    L_0x125d:
        if (r5 == 0) goto L_0x1267;	 Catch:{ all -> 0x12aa }
    L_0x125f:
        r3 = 0;	 Catch:{ all -> 0x12aa }
        if (r5 == 0) goto L_0x1267;	 Catch:{ all -> 0x12aa }
    L_0x1262:
        r2 = r0.f7367G;	 Catch:{ all -> 0x12aa }
        r2.m6249J(r5, r4, r3);	 Catch:{ all -> 0x12aa }
    L_0x1267:
        r1 = r1.f53466y;	 Catch:{ all -> 0x12aa }
        if (r1 == 0) goto L_0x1282;	 Catch:{ all -> 0x12aa }
    L_0x126b:
        r4 = r0.f7367G;	 Catch:{ all -> 0x12aa }
        r2 = r4.f7598L;	 Catch:{ all -> 0x12aa }
        r1 = X.AnonymousClass36l.f37917J;	 Catch:{ all -> 0x12aa }
        r1 = r2.J(r1);	 Catch:{ all -> 0x12aa }
        if (r1 == 0) goto L_0x127f;	 Catch:{ all -> 0x12aa }
    L_0x1277:
        r3 = r1.f37882L;	 Catch:{ all -> 0x12aa }
        r2 = 0;	 Catch:{ all -> 0x12aa }
        r1 = 0;	 Catch:{ all -> 0x12aa }
        r4.m6249J(r3, r2, r1);	 Catch:{ all -> 0x12aa }
        goto L_0x1282;	 Catch:{ all -> 0x12aa }
    L_0x127f:
        r1 = 1;	 Catch:{ all -> 0x12aa }
        r4.SB = r1;	 Catch:{ all -> 0x12aa }
    L_0x1282:
        r1 = r0.f7404r;	 Catch:{ all -> 0x12aa }
        r1.A();	 Catch:{ all -> 0x12aa }
        r0 = r0.f7407u;	 Catch:{ all -> 0x12aa }
        r1 = X.AnonymousClass30y.B(r0);	 Catch:{ all -> 0x12aa }
        r0 = 0;	 Catch:{ all -> 0x12aa }
        r1.f36880B = r0;	 Catch:{ all -> 0x12aa }
        r1 = r1.f36881C;	 Catch:{ all -> 0x12aa }
        r0 = X.AnonymousClass30y.class;	 Catch:{ all -> 0x12aa }
        r1.m1040E(r0);	 Catch:{ all -> 0x12aa }
        r0 = -1784728860; // 0xffffffff959f32e4 float:-6.429988E-26 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        return;
    L_0x129e:
        r1 = move-exception;
        goto L_0x12ad;
    L_0x12a0:
        r1 = move-exception;
        goto L_0x12ad;
    L_0x12a2:
        r1 = move-exception;
        r0 = 205947475; // 0xc468253 float:1.5292583E-31 double:1.01751572E-315;
        X.AnonymousClass0CN.m902C(r0);	 Catch:{ all -> 0x12aa }
        throw r1;	 Catch:{ all -> 0x12aa }
    L_0x12aa:
        r1 = move-exception;
        goto L_0x12ad;
    L_0x12ac:
        r1 = move-exception;
    L_0x12ad:
        r0 = 71505955; // 0x4431823 float:2.2933223E-36 double:3.5328636E-316;
        X.AnonymousClass0CN.m902C(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dF.<init>(X.4Ni):void");
    }

    /* renamed from: A */
    public final AnonymousClass3DU m6001A() {
        return this.f7369I.f52869C;
    }

    /* renamed from: B */
    public final List m6002B() {
        return AnonymousClass4OJ.B(this.f7407u, this.f7370J, this.f7386Z, this.f7392f, this.f7408v);
    }

    /* renamed from: B */
    public static void m5960B(AnonymousClass0dF anonymousClass0dF, AnonymousClass3nl anonymousClass3nl) {
        AnonymousClass36h f = AnonymousClass0dF.m5990f(anonymousClass0dF, anonymousClass3nl.f44605M);
        if (f != null) {
            anonymousClass3nl.f44604L = f;
        }
    }

    /* renamed from: C */
    public final void m6003C() {
        AnonymousClass3fB C = AnonymousClass3fB.C();
        Medium medium = C.f43114G;
        Medium medium2 = C.f43110C;
        AnonymousClass3f9 anonymousClass3f9 = C.f43113F;
        if (medium != null || medium2 != null) {
            AnonymousClass0dF.m5973O(this, false);
            this.f7402p.m4799C(new AnonymousClass3E1());
            AnonymousClass0dF.m5966H(this).f39476B = C.f43115H;
            if (anonymousClass3f9 == AnonymousClass3f9.f43099E) {
                m6015O(medium, medium2);
            } else {
                m6021U(medium, true);
            }
        }
    }

    /* renamed from: C */
    public static void m5961C(AnonymousClass0dF anonymousClass0dF, AnonymousClass3nn anonymousClass3nn) {
        AnonymousClass36h f = AnonymousClass0dF.m5990f(anonymousClass0dF, anonymousClass3nn.f44628O);
        if (f != null) {
            anonymousClass3nn.f44627N = f;
        }
    }

    /* renamed from: D */
    public static void m5962D(AnonymousClass0dF anonymousClass0dF, AnonymousClass0PB anonymousClass0PB) {
        if (!anonymousClass0dF.m5999o()) {
            boolean z = anonymousClass0dF.f7374N.P() && anonymousClass0dF.f7374N.A();
            switch (anonymousClass0dF.f7370J.B().ordinal()) {
                case 0:
                    AnonymousClass5TB.H(anonymousClass0dF.f7392f, null, AnonymousClass0Um.ALL, z, AnonymousClass3Fe.f39570D, anonymousClass0PB);
                    return;
                case 1:
                    AnonymousClass5TY.F(anonymousClass0dF.f7408v, null, AnonymousClass0Um.ALL, z, AnonymousClass3Fe.f39570D, anonymousClass0PB);
                    return;
                default:
                    throw new UnsupportedOperationException("Unknown media type");
            }
        }
    }

    /* renamed from: D */
    public final boolean m6004D() {
        if (!this.f7381U.G()) {
            return false;
        }
        if (this.f7377Q.m6283D()) {
            return false;
        }
        if (this.f7402p.f5584B == AnonymousClass3AM.f38529D) {
            return false;
        }
        if (this.f7402p.f5584B == AnonymousClass3AM.f38538M) {
            return false;
        }
        if (this.f7385Y.B()) {
            return false;
        }
        if (this.f7372L.f5584B == AnonymousClass3AN.f38553D && this.f7368H.R()) {
            return true;
        }
        return false;
    }

    public final void Dn(float f, float f2) {
        if (this.QB && f2 < 0.0f) {
            f2 *= 0.5f;
            float C = (float) AnonymousClass0dh.m6103C((double) Math.abs(f2), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) this.f7389c.getHeight(), 1.0d, 0.75d);
            this.f7389c.setTranslationY(-f2);
            if (this.dB) {
                this.f7389c.setScaleX(C);
                this.f7389c.setScaleY(C);
            }
            this.YB.setTranslationY(0.0f);
            if (!this.dB) {
                C = 1.0f - Math.abs(f2 / ((float) this.f7389c.getHeight()));
            }
            m6006F(C, this.bB.f19031M);
        }
        if (this.f7369I.f52869C != AnonymousClass3DU.f39291P) {
            return;
        }
        AnonymousClass36h F;
        if (f > 0.0f) {
            F = this.f7368H.F();
            if (F != null && AnonymousClass36l.f37914G.equals(F.f37895Y)) {
                this.f7377Q.m6285F();
                this.f7367G.m6256Q();
            }
            return;
        }
        F = this.f7368H.F();
        if (F == null || !AnonymousClass36l.f37914G.equals(F.f37895Y)) {
            this.f7367G.f7598L.b(AnonymousClass36l.f37914G);
        }
    }

    /* renamed from: E */
    public static void m5963E(AnonymousClass0dF anonymousClass0dF) {
        String str;
        int i;
        int i2;
        int i3;
        boolean z;
        AnonymousClass0HT.f2637C.m2001C();
        AnonymousClass3FK B = anonymousClass0dF.f7370J.B();
        switch (B.ordinal()) {
            case 0:
                AnonymousClass3nl C = anonymousClass0dF.f7370J.C();
                str = C.f44605M;
                i = C.f44614V;
                i2 = C.f44606N;
                i3 = C.f44611S;
                z = C.f44610R;
                break;
            case 1:
                AnonymousClass3nn D = anonymousClass0dF.f7370J.D();
                str = D.f44628O;
                i = D.f44645f;
                i2 = D.f44630Q;
                i3 = D.f44638Y;
                z = D.f44634U;
                break;
            default:
                throw new UnsupportedOperationException("Unknown media type");
        }
        if (anonymousClass0dF.f7400n) {
            AnonymousClass0JK.f2907B.mo551A(anonymousClass0dF.f7407u);
        }
        AnonymousClass0bz.m5663B(anonymousClass0dF.f7362B).m5666A(new AnonymousClass4Nm(anonymousClass0dF)).m5668C(AnonymousClass0JK.f2907B.mo553C().m3800B(anonymousClass0dF.f7407u.f1759C, str, B == AnonymousClass3FK.f39433G, i, i2, i3, z, anonymousClass0dF.f7400n));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: E */
    public final boolean m6005E() {
        /*
        r6 = this;
        r3 = r6.f7410x;
        r2 = 0;
        r6.f7410x = r2;
        r0 = r6.f7409w;
        r1 = 1;
        if (r0 != r1) goto L_0x000b;
    L_0x000a:
        return r2;
    L_0x000b:
        r4 = r6.f7397k;
        r0 = X.AnonymousClass4Nh.f53415C;
        if (r4 != r0) goto L_0x0013;
    L_0x0011:
        r5 = 1;
        goto L_0x0014;
    L_0x0013:
        r5 = 0;
    L_0x0014:
        if (r5 == 0) goto L_0x0031;
    L_0x0016:
        r0 = r6.f7402p;
        r4 = r0.f5584B;
        r0 = X.AnonymousClass3AM.f38528C;
        if (r4 == r0) goto L_0x0026;
    L_0x001e:
        r0 = r6.f7402p;
        r4 = r0.f5584B;
        r0 = X.AnonymousClass3AM.f38546U;
        if (r4 != r0) goto L_0x0031;
    L_0x0026:
        r2 = r6.f7402p;
        r0 = new X.3Dn;
        r0.<init>();
        r2.m4799C(r0);
        return r1;
    L_0x0031:
        r0 = r6.f7374N;
        r0 = r0.L();
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        return r1;
    L_0x003a:
        r4 = r6.f7386Z;
        r0 = r4.f64575V;
        r0 = r0.f47814K;
        r0 = r0.A();
        if (r0 != 0) goto L_0x004d;
    L_0x0046:
        r0 = r4.f64561H;
        if (r0 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004d;
    L_0x004b:
        r0 = 0;
        goto L_0x004e;
    L_0x004d:
        r0 = 1;
    L_0x004e:
        if (r0 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0039;
    L_0x0051:
        r0 = r6.f7367G;
        r0 = r0.m6250K();
        if (r0 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x0039;
    L_0x005a:
        r0 = r6.f7380T;
        r0 = r0.onBackPressed();
        if (r0 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0039;
    L_0x0063:
        r0 = r6.f7381U;
        r0 = r0.G();
        if (r0 != 0) goto L_0x006f;
    L_0x006b:
        X.AnonymousClass0dF.m5973O(r6, r1);
        return r1;
    L_0x006f:
        r0 = r6.f7388b;
        if (r0 == 0) goto L_0x007a;
    L_0x0073:
        r0 = r0.B();
        if (r0 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0039;
    L_0x007a:
        r0 = r6.f7402p;
        r0 = r0.f5584B;
        r0 = (X.AnonymousClass3AM) r0;
        r0 = r0.ordinal();
        switch(r0) {
            case 1: goto L_0x008b;
            case 4: goto L_0x009f;
            case 15: goto L_0x0088;
            default: goto L_0x0087;
        };
    L_0x0087:
        goto L_0x00ae;
    L_0x0088:
        if (r5 != 0) goto L_0x008b;
    L_0x008a:
        goto L_0x0039;
    L_0x008b:
        if (r3 != 0) goto L_0x0096;
    L_0x008d:
        r0 = r6.f7387a;
        r0 = r0.B();
        if (r0 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0039;
    L_0x0096:
        r0 = r6.f7385Y;
        r0 = r0.C();
        if (r0 == 0) goto L_0x00ae;
    L_0x009e:
        goto L_0x0039;
    L_0x009f:
        r0 = X.AnonymousClass0dF.m5975Q(r6);
        if (r0 != 0) goto L_0x00ab;
    L_0x00a5:
        r0 = X.AnonymousClass0dF.m5976R(r6);
        if (r0 == 0) goto L_0x000a;
    L_0x00ab:
        r2 = 1;
        goto L_0x000a;
    L_0x00ae:
        r0 = X.AnonymousClass0dF.m5976R(r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dF.E():boolean");
    }

    public final void Ew(String str, int i) {
        AnonymousClass0dF.m5988d(this);
    }

    /* renamed from: F */
    public final void m6006F(float f, int i) {
        if (this.BB == null || this.CB != i) {
            this.CB = i;
            this.BB = new ColorDrawable(this.CB);
            this.AB.setBackground(this.BB);
        }
        this.BB.mutate().setAlpha((int) (f * 255.0f));
    }

    /* renamed from: F */
    public static void m5964F(AnonymousClass0dF anonymousClass0dF) {
        anonymousClass0dF.f7376P.iG();
    }

    /* renamed from: G */
    public static void m5965G(AnonymousClass0dF anonymousClass0dF, AnonymousClass3DU anonymousClass3DU, AnonymousClass3DU anonymousClass3DU2) {
        AnonymousClass3FR H = AnonymousClass0dF.m5966H(anonymousClass0dF);
        switch (AnonymousClass3FL.f39435B[anonymousClass3DU.ordinal()]) {
            case 1:
                H.f39517q = true;
                break;
            case 2:
                H.mB = true;
                break;
            case 3:
                H.f39522v = true;
                break;
            case 4:
                H.f39479E = true;
                break;
            case 5:
                H.jB = true;
                break;
            case 6:
                H.KB = true;
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                H.WB = true;
                break;
            case 8:
                H.f39493S = true;
                break;
            case 9:
                H.PB = true;
                break;
            default:
                break;
        }
        AnonymousClass281.B(anonymousClass0dF.f7407u).ua(AnonymousClass4KL.D(anonymousClass3DU));
        if (anonymousClass3DU == AnonymousClass3DU.f39293R) {
            anonymousClass0dF.f7405s.A();
        }
        AnonymousClass4Mw anonymousClass4Mw = anonymousClass0dF.f7383W;
        boolean z = false;
        if (anonymousClass4Mw != null) {
            if ((anonymousClass3DU == AnonymousClass3DU.f39293R ? 1 : null) != null) {
                anonymousClass4Mw.f53286T.A();
            }
            AnonymousClass4Mw.C(anonymousClass4Mw);
            AnonymousClass4Mw.B(anonymousClass4Mw);
        }
        AnonymousClass4PD anonymousClass4PD = anonymousClass0dF.f7404r;
        if (anonymousClass3DU == AnonymousClass3DU.f39300Y) {
            z = true;
        }
        anonymousClass4PD.E(z);
        AnonymousClass5Tg anonymousClass5Tg = anonymousClass0dF.f7387a;
        if (AnonymousClass3DU.f39294S.equals(anonymousClass3DU)) {
            anonymousClass5Tg.D();
        } else if (AnonymousClass3DU.f39294S.equals(anonymousClass3DU2)) {
            anonymousClass5Tg.A(true);
        }
        anonymousClass0dF.EB.Jf(anonymousClass3DU);
        AnonymousClass0eB anonymousClass0eB = anonymousClass0dF.f7367G;
        int i = AnonymousClass4Ki.f52844C[anonymousClass3DU.ordinal()];
        if (i == 1) {
            AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass1U3(anonymousClass0eB), 1383036781);
        } else if (i == 10) {
            AnonymousClass0eB.m6219R(anonymousClass0eB);
        }
        anonymousClass0eB.m6257R(anonymousClass3DU);
        anonymousClass0eB.f7602P.setContinuousVideoCaptureEnabled(anonymousClass3DU.f39310J);
        AnonymousClass0eB.m6234g(anonymousClass0eB);
        AnonymousClass0eB.m6220S(anonymousClass0eB);
        anonymousClass0dF.f7369I.H(true);
        AnonymousClass3FR H2 = AnonymousClass0dF.m5966H(anonymousClass0dF);
        H2.f39486L = anonymousClass3DU;
        H2.f39488N.f39545D = anonymousClass3DU;
        if (anonymousClass3DU2.C()) {
            anonymousClass0dF.f7377Q.m6285F();
            anonymousClass0dF.f7367G.m6256Q();
            if (anonymousClass3DU2 == AnonymousClass3DU.f39299X) {
                AnonymousClass36h F = anonymousClass0dF.f7368H.F();
                if (F != null && F.E()) {
                    anonymousClass0dF.f7377Q.m6285F();
                    anonymousClass0dF.f7367G.m6256Q();
                }
                anonymousClass0dF.f7403q.A(true);
            }
        }
        if (anonymousClass3DU.C()) {
            AnonymousClass0eH anonymousClass0eH = anonymousClass0dF.f7377Q;
            anonymousClass0eH.f7664J = anonymousClass0eH.f7668N;
            anonymousClass0eH.f7667M = null;
            anonymousClass0eH.f7657C.R(0);
            if (anonymousClass3DU == AnonymousClass3DU.f39298W) {
                anonymousClass0dF.f7367G.f7598L.b(AnonymousClass36l.f37918K);
            } else if (anonymousClass3DU == AnonymousClass3DU.f39291P) {
                anonymousClass0dF.f7367G.f7598L.b(AnonymousClass36l.f37914G);
            } else {
                anonymousClass0dF.f7377Q.m6285F();
                anonymousClass0dF.f7403q.L();
                AnonymousClass38H anonymousClass38H = anonymousClass0dF.f7403q.f53884C;
                anonymousClass38H.W(anonymousClass38H.E());
                AnonymousClass3F9 anonymousClass3F9 = anonymousClass0dF.f7403q;
                anonymousClass3F9.H(true);
                anonymousClass3F9.I();
            }
        }
        AnonymousClass0eH anonymousClass0eH2 = anonymousClass0dF.f7377Q;
        anonymousClass0eH2.f7656B = AnonymousClass3DU.f39293R.equals(anonymousClass3DU) ? AnonymousClass36k.f37903E : AnonymousClass36k.f37906H;
        if (!AnonymousClass0LQ.m2954B(anonymousClass0eH2.f7668N, anonymousClass0eH2.f7664J)) {
            boolean B = AnonymousClass3G2.B(anonymousClass0eH2.f7689i.getContext(), anonymousClass3DU);
            if (anonymousClass0eH2.f7665K != B) {
                anonymousClass0eH2.f7665K = B;
                AnonymousClass0eH.m6267B(anonymousClass0eH2, B ? anonymousClass0eH2.f7664J : anonymousClass0eH2.f7668N, "user_action", anonymousClass0eH2.f7667M);
            }
        }
        AnonymousClass3DU anonymousClass3DU3 = AnonymousClass3DU.f39293R;
        if (anonymousClass3DU == anonymousClass3DU3 || anonymousClass3DU2 == anonymousClass3DU3) {
            AnonymousClass0eH.m6275J(anonymousClass0eH2);
        }
        AnonymousClass5TC anonymousClass5TC = anonymousClass0dF.f7395i;
        AnonymousClass5TC.C(anonymousClass5TC, anonymousClass3DU);
        AnonymousClass5TC.D(anonymousClass5TC, anonymousClass3DU);
    }

    /* renamed from: G */
    public final void m6007G(AnonymousClass4MO anonymousClass4MO) {
        AnonymousClass0dF.m5966H(this).f39509i = anonymousClass4MO.GO();
    }

    /* renamed from: H */
    public static AnonymousClass3FR m5966H(AnonymousClass0dF anonymousClass0dF) {
        return anonymousClass0dF.f7370J.E();
    }

    /* renamed from: H */
    public final void m6008H(AnonymousClass4MO anonymousClass4MO, List list) {
        if (this.f7409w != 1) {
            Medium medium;
            if (list.size() == 1) {
                medium = (Medium) list.get(0);
                if (medium.B()) {
                    m6009I(anonymousClass4MO, medium);
                    return;
                } else {
                    m6011K(anonymousClass4MO, medium);
                    return;
                }
            }
            AnonymousClass0dF.m5973O(this, false);
            anonymousClass4MO = this.f7386Z;
            AnonymousClass5Tf.E(anonymousClass4MO).XB = AnonymousClass3FO.f39458G;
            anonymousClass4MO.f64561H = true;
            AnonymousClass4RA anonymousClass4RA = anonymousClass4MO.f64576W;
            List arrayList = new ArrayList();
            for (Medium medium2 : list) {
                arrayList.add(new AnonymousClass3Fh(medium2));
            }
            anonymousClass4RA.A(arrayList);
            int i = 0;
            anonymousClass4MO.f64575V.f47816M.setItemAnimator(null);
            anonymousClass4MO.f64575V.B(false);
            AnonymousClass3z1 anonymousClass3z1 = anonymousClass4MO.f64575V;
            anonymousClass3z1.f47816M.setEnabled(false);
            anonymousClass3z1.f47807D.setEnabled(false);
            TreeMap treeMap = new TreeMap();
            int size = list.size();
            while (i < size) {
                AnonymousClass0GA anonymousClass0n3;
                Medium medium3 = (Medium) list.get(i);
                if (medium3.wY()) {
                    anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4Pn(anonymousClass4MO.f64556C, medium3));
                    anonymousClass0n3.f9990B = new AnonymousClass4R5(anonymousClass4MO, treeMap, i, size);
                } else {
                    Context context = anonymousClass4MO.f64556C;
                    anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4NP(context, context.getContentResolver(), medium3, true));
                    anonymousClass0n3.f9990B = new AnonymousClass4R6(anonymousClass4MO, treeMap, i, size);
                }
                AnonymousClass0Ix.m2384D(anonymousClass0n3);
                i++;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    public static java.lang.String m5967I(java.lang.String r1) {
        /*
        r0 = r1.hashCode();
        switch(r0) {
            case -1652106470: goto L_0x012e;
            case -1589609819: goto L_0x0123;
            case -1533607595: goto L_0x0119;
            case -1454341660: goto L_0x010e;
            case -1442985924: goto L_0x0103;
            case -1411076672: goto L_0x00f8;
            case -1385596165: goto L_0x00ed;
            case -939907210: goto L_0x00e3;
            case -897011542: goto L_0x00d8;
            case -815956085: goto L_0x00cd;
            case -811302394: goto L_0x00c2;
            case -590448175: goto L_0x00b8;
            case -399252132: goto L_0x00ac;
            case -257369816: goto L_0x00a0;
            case 3015911: goto L_0x0094;
            case 3387192: goto L_0x0088;
            case 25999906: goto L_0x007c;
            case 32781990: goto L_0x0070;
            case 109854522: goto L_0x0065;
            case 137920146: goto L_0x005a;
            case 171320519: goto L_0x004e;
            case 676472861: goto L_0x0043;
            case 1402446384: goto L_0x0037;
            case 1479815600: goto L_0x002b;
            case 1853668231: goto L_0x0020;
            case 1904101413: goto L_0x0015;
            case 1965399843: goto L_0x0009;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0139;
    L_0x0009:
        r0 = "profile_picture_tap_on_self_profile";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0011:
        r0 = 11;
        goto L_0x013a;
    L_0x0015:
        r0 = "activity_recreated";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x001d:
        r0 = 6;
        goto L_0x013a;
    L_0x0020:
        r0 = "camera_direct_inbox_button";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0028:
        r0 = 3;
        goto L_0x013a;
    L_0x002b:
        r0 = "quick_camera_launcher_shortcut_variant_glyph";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0033:
        r0 = 8;
        goto L_0x013a;
    L_0x0037:
        r0 = "ig_live_shutter_tapped";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x003f:
        r0 = 20;
        goto L_0x013a;
    L_0x0043:
        r0 = "your_story_placeholder";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x004b:
        r0 = 1;
        goto L_0x013a;
    L_0x004e:
        r0 = "story_captured_media_recovery";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0056:
        r0 = 12;
        goto L_0x013a;
    L_0x005a:
        r0 = "camera_action_bar_button_main_feed";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0062:
        r0 = 2;
        goto L_0x013a;
    L_0x0065:
        r0 = "swipe";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x006d:
        r0 = 5;
        goto L_0x013a;
    L_0x0070:
        r0 = "activity_newly_created";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0078:
        r0 = 15;
        goto L_0x013a;
    L_0x007c:
        r0 = "quick_camera_startup_uri";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0084:
        r0 = 14;
        goto L_0x013a;
    L_0x0088:
        r0 = "none";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0090:
        r0 = 16;
        goto L_0x013a;
    L_0x0094:
        r0 = "back";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x009c:
        r0 = 17;
        goto L_0x013a;
    L_0x00a0:
        r0 = "return_from_recipient_pickers_to_inbox";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00a8:
        r0 = 21;
        goto L_0x013a;
    L_0x00ac:
        r0 = "on_launch_direct_inbox";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00b4:
        r0 = 24;
        goto L_0x013a;
    L_0x00b8:
        r0 = "camera_action_bar_button_direct_tab";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00c0:
        r0 = 4;
        goto L_0x013a;
    L_0x00c2:
        r0 = "story_share_intent";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00ca:
        r0 = 13;
        goto L_0x013a;
    L_0x00cd:
        r0 = "instagram_title";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00d5:
        r0 = 25;
        goto L_0x013a;
    L_0x00d8:
        r0 = "startup_uri";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00e0:
        r0 = 19;
        goto L_0x013a;
    L_0x00e3:
        r0 = "your_story_dialog_option";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00eb:
        r0 = 0;
        goto L_0x013a;
    L_0x00ed:
        r0 = "external_url";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x00f5:
        r0 = 9;
        goto L_0x013a;
    L_0x00f8:
        r0 = "camera_upsell_dialog";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0100:
        r0 = 10;
        goto L_0x013a;
    L_0x0103:
        r0 = "return_from_main_camera_to_inbox";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x010b:
        r0 = 26;
        goto L_0x013a;
    L_0x010e:
        r0 = "story_posted_from_camera";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0116:
        r0 = 22;
        goto L_0x013a;
    L_0x0119:
        r0 = "quick_camera_launcher_shortcut_variant_avatar";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0121:
        r0 = 7;
        goto L_0x013a;
    L_0x0123:
        r0 = "back_stack_changed";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x012b:
        r0 = 23;
        goto L_0x013a;
    L_0x012e:
        r0 = "direct_push_notification";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0139;
    L_0x0136:
        r0 = 18;
        goto L_0x013a;
    L_0x0139:
        r0 = -1;
    L_0x013a:
        switch(r0) {
            case 0: goto L_0x016a;
            case 1: goto L_0x0167;
            case 2: goto L_0x0164;
            case 3: goto L_0x0161;
            case 4: goto L_0x015e;
            case 5: goto L_0x015b;
            case 6: goto L_0x0158;
            case 7: goto L_0x0155;
            case 8: goto L_0x0152;
            case 9: goto L_0x014f;
            case 10: goto L_0x014c;
            case 11: goto L_0x0149;
            case 12: goto L_0x0146;
            case 13: goto L_0x0143;
            case 14: goto L_0x0140;
            default: goto L_0x013d;
        };
    L_0x013d:
        r0 = "unknown";
        return r0;
    L_0x0140:
        r0 = "launcher_shortcut";
        return r0;
    L_0x0143:
        r0 = "story_share_intent";
        return r0;
    L_0x0146:
        r0 = "story_captured_media_recovery";
        return r0;
    L_0x0149:
        r0 = "self_profile_add_story";
        return r0;
    L_0x014c:
        r0 = "camera_upsell_dialog";
        return r0;
    L_0x014f:
        r0 = "external_url";
        return r0;
    L_0x0152:
        r0 = "launcher_shortcut_glyph";
        return r0;
    L_0x0155:
        r0 = "launcher_shortcut_avatar";
        return r0;
    L_0x0158:
        r0 = "app_foregrounded";
        return r0;
    L_0x015b:
        r0 = "swipe";
        return r0;
    L_0x015e:
        r0 = "quick_cam_button_direct_tab";
        return r0;
    L_0x0161:
        r0 = "direct_inbox_button";
        return r0;
    L_0x0164:
        r0 = "quick_cam_button";
        return r0;
    L_0x0167:
        r0 = "your_story_placeholder";
        return r0;
    L_0x016a:
        r0 = "your_story_dialog_option";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dF.I(java.lang.String):java.lang.String");
    }

    /* renamed from: I */
    public final void m6009I(AnonymousClass4MO anonymousClass4MO, Medium medium) {
        if (this.f7409w != 1) {
            AnonymousClass0dF.m5966H(this).XB = AnonymousClass3FO.f39458G;
            AnonymousClass0dF.m5973O(this, false);
            Context context = this.f7362B;
            AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4NP(context, context.getContentResolver(), medium));
            anonymousClass0n3.f9990B = new AnonymousClass4Nt(this, anonymousClass4MO);
            AnonymousClass0Ix.m2384D(anonymousClass0n3);
        }
    }

    /* renamed from: J */
    public static AnonymousClass4OL m5968J(AnonymousClass0dF anonymousClass0dF) {
        return anonymousClass0dF.f7370J.f54566H;
    }

    /* renamed from: J */
    public final void m6010J(AnonymousClass4MO anonymousClass4MO) {
        AnonymousClass281.B(this.f7407u).Ra();
        if (this.f7385Y.B()) {
            this.f7385Y.G(new AnonymousClass5TG(this));
            return;
        }
        this.f7402p.m4799C(new AnonymousClass3Dw());
        this.f7381U.H(true);
    }

    public final boolean Jn(boolean z, boolean z2, float f, float f2, float f3, float f4, float f5) {
        switch (AnonymousClass4Nq.f53481C[((AnonymousClass3AN) this.f7372L.f5584B).ordinal()]) {
            case 1:
                if (z2 && m6001A() != AnonymousClass3DU.f39293R) {
                    return m5989e(f2, f5);
                }
                if (z && this.f7381U.G() && this.f7369I.f52876J.isEnabled() && this.f7369I.A(f3, f4)) {
                    this.f7369I.f52876J.F(f);
                    return true;
                }
                break;
            case 2:
                if (z) {
                    if (this.f7374N.J()) {
                        AnonymousClass5bK anonymousClass5bK = this.f7374N;
                        if (anonymousClass5bK.f66854U) {
                            AnonymousClass4LP anonymousClass4LP = anonymousClass5bK.f66842I;
                            if (!(anonymousClass4LP == null || anonymousClass4LP.f53018E.f54644O == null)) {
                                anonymousClass4LP.f53018E.f54644O.F(f);
                            }
                        }
                        return true;
                    } else if (this.f7370J.B() == AnonymousClass3FK.f39430D) {
                        AnonymousClass5TB anonymousClass5TB = this.f7392f;
                        if (anonymousClass5TB.f64355U) {
                            r4 = true;
                            anonymousClass5TB.f64354T.m11374A(anonymousClass5TB.f64357W);
                            anonymousClass5TB.f64355U = false;
                        } else {
                            r4 = false;
                        }
                        return r4;
                    } else {
                        AnonymousClass5TY anonymousClass5TY = this.f7408v;
                        if (anonymousClass5TY.f64482T) {
                            r4 = true;
                            anonymousClass5TY.f64481S.m11374A(anonymousClass5TY.f64485W);
                            anonymousClass5TY.f64482T = false;
                        } else {
                            r4 = false;
                        }
                        return r4;
                    }
                } else if (z2) {
                    return this.f7374N.B(f2);
                }
                break;
            default:
                break;
        }
        return false;
    }

    /* renamed from: K */
    public static AnonymousClass4Oc m5969K(AnonymousClass0dF anonymousClass0dF) {
        return anonymousClass0dF.f7370J.f54567I;
    }

    /* renamed from: K */
    public final void m6011K(AnonymousClass4MO anonymousClass4MO, Medium medium) {
        if (this.f7409w != 1) {
            AnonymousClass0dF.m5966H(this).XB = AnonymousClass3FO.f39458G;
            AnonymousClass0dF.m5973O(this, false);
            AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4Pn(this.f7362B, medium));
            anonymousClass0n3.f9990B = new AnonymousClass4Nu(this, anonymousClass4MO);
            AnonymousClass0Ix.m2384D(anonymousClass0n3);
        }
    }

    public final void Kf(AnonymousClass3DU anonymousClass3DU, AnonymousClass3DU anonymousClass3DU2) {
        if (this.f7372L.f5584B == AnonymousClass3AN.f38553D) {
            AnonymousClass0dF.m5965G(this, anonymousClass3DU, anonymousClass3DU2);
        }
    }

    /* renamed from: L */
    public static AnonymousClass0OK m5970L(List list, AnonymousClass0Um anonymousClass0Um) {
        if (anonymousClass0Um == AnonymousClass0Um.NONE) {
            return AnonymousClass0OK.DIRECT_STORY_SHARE;
        }
        if (list == null || list.isEmpty()) {
            return AnonymousClass0OK.REEL_SHARE;
        }
        return AnonymousClass0OK.REEL_SHARE_AND_DIRECT_STORY_SHARE;
    }

    /* renamed from: L */
    public final void m6012L(float f, float f2) {
        AnonymousClass0dF anonymousClass0dF = this;
        if (this.f7372L.f5584B == AnonymousClass3AN.f38553D) {
            AnonymousClass5TC anonymousClass5TC = this.f7395i;
            AnonymousClass3DU C = anonymousClass5TC.f64369C.m6242C();
            float f3 = f;
            boolean z = ((double) f3) > 0.5d;
            boolean z2 = !z && anonymousClass5TC.f64374H.J(C);
            boolean D = AnonymousClass4MP.D();
            boolean z3 = !z && anonymousClass5TC.f64374H.G(C);
            boolean z4 = anonymousClass5TC.f64369C.f7590D;
            boolean C2 = anonymousClass5TC.f64374H.C(C);
            f = (z || !anonymousClass5TC.f64374H.E(C)) ? 0.0f : Float.MIN_VALUE;
            anonymousClass5TC.f64373G.F(f3, f2, z2, z, D, z3, z4, C2, f);
            AnonymousClass0eB anonymousClass0eB = anonymousClass0dF.f7367G;
            float B = 1.0f - ((float) AnonymousClass0dh.m6102B((double) f3, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d));
            anonymousClass0eB.f7602P.setAlpha(B);
            boolean z5 = false;
            anonymousClass0eB.f7602P.setVisibility(B > 0.0f ? 0 : 4);
            if (((double) anonymousClass0eB.f7622j) < 0.01d) {
                z5 = true;
            }
            anonymousClass0eB.f7602P.setEnabled(z5);
        }
    }

    public final void Lf(AnonymousClass3DU anonymousClass3DU) {
        this.f7367G.m6257R(anonymousClass3DU);
        if (anonymousClass3DU == AnonymousClass3DU.f39299X) {
            this.f7403q.H(true);
            this.f7403q.J();
        }
    }

    /* renamed from: M */
    public final void m6013M(AnonymousClass0OA anonymousClass0OA, Bitmap bitmap, List list, AnonymousClass0Um anonymousClass0Um, AnonymousClass3Fe anonymousClass3Fe, AnonymousClass0EE anonymousClass0EE, int i, boolean z) {
        AnonymousClass3FK anonymousClass3FK;
        int i2;
        AnonymousClass0Um anonymousClass0Um2 = anonymousClass0Um;
        boolean z2 = anonymousClass0Um2 != AnonymousClass0Um.NONE;
        AnonymousClass0OA anonymousClass0OA2 = anonymousClass0OA;
        AnonymousClass0dF anonymousClass0dF = this;
        switch (anonymousClass0OA2.gB.ordinal()) {
            case 0:
                anonymousClass3FK = AnonymousClass3FK.f39430D;
                i2 = anonymousClass0dF.f7392f.f64338D;
                break;
            case 1:
                anonymousClass3FK = AnonymousClass3FK.f39433G;
                i2 = anonymousClass0dF.f7408v.f64466D;
                break;
            default:
                anonymousClass3FK = AnonymousClass3FK.f39432F;
                i2 = -1;
                break;
        }
        int h = m5992h();
        AnonymousClass3Fe anonymousClass3Fe2 = anonymousClass3Fe;
        if (anonymousClass3Fe2 != AnonymousClass3Fe.f39571E) {
            AnonymousClass36h D;
            String str;
            AnonymousClass2Fy D2 = AnonymousClass2G6.D(anonymousClass0OA2);
            anonymousClass0OA = D2 != null ? AnonymousClass3DS.B(D2) : null;
            AnonymousClass0Cm anonymousClass0Cm = anonymousClass0dF.f7407u;
            int i3 = anonymousClass0OA2.aC;
            AnonymousClass0ZS eI = anonymousClass0OA2.eI();
            String str2 = anonymousClass0OA2.f3808V;
            AnonymousClass4Kx anonymousClass4Kx = anonymousClass0dF.f7369I;
            AnonymousClass0eI anonymousClass0eI = anonymousClass0dF.f7377Q;
            if (anonymousClass0OA2.aC != 1) {
                D = anonymousClass0dF.f7368H.D(anonymousClass0OA2.f3832t);
            } else {
                D = anonymousClass0dF.f7368H.F();
            }
            String str3 = anonymousClass0OA2.oB;
            if (D == null) {
                str = null;
            } else {
                str = D.f37882L;
            }
            List E = AnonymousClass4KL.E(str, i2);
            Map anonymousClass0O7 = new AnonymousClass0O7(1);
            if (str != null) {
                int F = AnonymousClass4KL.F(str, anonymousClass0eI, anonymousClass4Kx);
                if (F != Process.WAIT_RESULT_TIMEOUT) {
                    anonymousClass0O7.put(str, String.valueOf(F));
                }
            }
            int D3 = i3 == 1 ? AnonymousClass4KL.D(anonymousClass4Kx.f52869C) : h == 4 ? 11 : h == 7 ? 13 : 12;
            AnonymousClass281.B(anonymousClass0Cm).wa(AnonymousClass4KL.J(i3), AnonymousClass4KL.K(anonymousClass3FK), AnonymousClass4KL.C(str2), D3, AnonymousClass4KL.L(eI), E, anonymousClass0O7, str3, anonymousClass0OA);
        }
        AnonymousClass3FR H = AnonymousClass0dF.m5966H(anonymousClass0dF);
        H.MB = new ArrayList(Collections.singletonList(anonymousClass0OA2));
        H.hB = anonymousClass3Fe2;
        List list2 = list;
        boolean z3 = (list == null || list2.isEmpty()) ? false : true;
        H.RB = z3;
        H.SB = list != null ? list2.size() : 0;
        H.VB = z2;
        AnonymousClass0J7.f2895B.mo542X(anonymousClass0dF.f7407u, anonymousClass0OA2, list2);
        if (anonymousClass0OA2.m3590j() && AnonymousClass0Co.m1042B(anonymousClass0dF.f7407u)) {
            Toast.makeText(anonymousClass0dF.f7362B, C0164R.string.direct_send_gated_feature_employee_warning, 0).show();
        }
        if (anonymousClass0dF.f7396j != null) {
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass5BP());
        }
        if (z) {
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
            anonymousClass0Iz.m2408K(anonymousClass0EE2, anonymousClass0dF.f7391e + i, null);
            anonymousClass0Iz.m2403F(anonymousClass0EE2, anonymousClass0dF.f7362B);
            anonymousClass0Iz.m2405H(anonymousClass0dF.f7367G);
            anonymousClass0dF.f7370J.G();
            z3 = AnonymousClass0dF.m5983Y(anonymousClass0dF, list2, z2);
            Bitmap bitmap2 = bitmap;
            if (z3) {
                anonymousClass0dF.f7366F.m5675C(bitmap2);
            }
            anonymousClass0dF.f7376P.kE(anonymousClass0Um2, bitmap2, list2);
        }
    }

    /* renamed from: M */
    public static void m5971M(AnonymousClass0dF anonymousClass0dF, AnonymousClass3nl anonymousClass3nl) {
        int i = anonymousClass3nl.f44612T;
        if (i == 1) {
            List arrayList = new ArrayList();
            arrayList.add(anonymousClass0dF.f7368H.F());
            AnonymousClass4KL.O(anonymousClass0dF.f7407u, 1, arrayList, anonymousClass0dF.f7367G.m6241B(), anonymousClass0dF.f7377Q, anonymousClass0dF.f7369I);
        } else if (i == 0) {
            AnonymousClass281.B(anonymousClass0dF.f7407u).Va(1);
        }
        anonymousClass0dF.f7370J.I(anonymousClass3nl);
        anonymousClass0dF.f7402p.m4799C(new AnonymousClass3EC(true));
    }

    public final void Mf(float f, int i, int i2, AnonymousClass3DU anonymousClass3DU, AnonymousClass3DU anonymousClass3DU2) {
        AnonymousClass3AN anonymousClass3AN = (AnonymousClass3AN) this.f7372L.f5584B;
        AnonymousClass4Mw anonymousClass4Mw = this.f7383W;
        float f2 = f;
        AnonymousClass3DU anonymousClass3DU3 = anonymousClass3DU;
        AnonymousClass3DU anonymousClass3DU4 = anonymousClass3DU2;
        if (anonymousClass4Mw != null) {
            AnonymousClass4Kx anonymousClass4Kx = this.f7369I;
            boolean z = anonymousClass4Kx.f52870D && anonymousClass4Kx.f52876J.getSeekingIndex() == anonymousClass4Kx.f52871E.indexOf(AnonymousClass3DU.f39295T);
            anonymousClass4Mw.A(f2, anonymousClass3DU3, anonymousClass3DU4, z, anonymousClass3AN);
        }
        this.f7379S.Mf(f, i, i2, anonymousClass3DU, anonymousClass3DU2);
    }

    /* renamed from: N */
    public final void m6014N(float f) {
        if (f == 1.0f) {
            this.f7402p.m4799C(new AnonymousClass3EP());
        } else if (f == 0.0f) {
            this.f7402p.m4799C(new AnonymousClass3EO());
        } else {
            this.f7402p.m4799C(new AnonymousClass3EQ());
        }
    }

    /* renamed from: N */
    public static void m5972N(AnonymousClass0dF anonymousClass0dF, AnonymousClass3nn anonymousClass3nn) {
        int i = anonymousClass3nn.f44642c;
        if (i == 1) {
            List arrayList = new ArrayList();
            arrayList.add(anonymousClass0dF.f7368H.F());
            AnonymousClass4KL.O(anonymousClass0dF.f7407u, 2, arrayList, anonymousClass0dF.f7367G.m6241B(), anonymousClass0dF.f7369I.f52869C == AnonymousClass3DU.f39299X ? anonymousClass0dF.f7403q : anonymousClass0dF.f7377Q, anonymousClass0dF.f7369I);
        } else if (i == 0) {
            AnonymousClass281.B(anonymousClass0dF.f7407u).Va(2);
        }
        AnonymousClass4UE anonymousClass4UE = anonymousClass0dF.f7370J;
        anonymousClass4UE.f54561C.clear();
        anonymousClass4UE.f54560B = 0;
        anonymousClass4UE.f54561C.add(new AnonymousClass3FJ(anonymousClass3nn));
        anonymousClass4UE.f54562D = AnonymousClass4QH.f53882E;
        anonymousClass0dF.f7402p.m4799C(new AnonymousClass3Ee());
    }

    /* renamed from: O */
    public static void m5973O(AnonymousClass0dF anonymousClass0dF, boolean z) {
        anonymousClass0dF.f7381U.F(z);
    }

    /* renamed from: O */
    public final void m6015O(Medium medium, Medium medium2) {
        if (this.f7409w != 1) {
            AnonymousClass0dF.m5966H(this).XB = m5991g();
            int h = m5992h();
            Context context = this.f7362B;
            AnonymousClass5TH anonymousClass5TH = new AnonymousClass5TH(this, h);
            boolean z = medium == null;
            if (z) {
                medium = medium2;
            }
            AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4NP(context, context.getContentResolver(), medium, z ^ 1));
            anonymousClass0n3.f9990B = new AnonymousClass4N0(z, context, anonymousClass5TH, medium2);
            AnonymousClass0Ix.m2384D(anonymousClass0n3);
        }
    }

    /* renamed from: P */
    public final void m6016P(String str) {
        AnonymousClass0dg.m6099K("on_fully_visible", true);
        if (this.f7409w == 1) {
            m6017Q(str);
        }
        if (this.f7409w == 2) {
            AnonymousClass0CL.m884C("igcam_partially_visible", 0);
            this.RB.m6816B(this.f7362B);
        }
        this.f7409w = 3;
        AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
        anonymousClass0Iz.m2404G(this.f7367G);
        anonymousClass0Iz.m2405H(this.f7367G);
        m5996l(3);
        if (((Boolean) AnonymousClass0CC.f1473if.m846H(this.f7407u)).booleanValue()) {
            if (this.VB == null) {
                this.VB = new AnonymousClass4NM();
            }
            AnonymousClass4NM anonymousClass4NM = this.VB;
            this.f7362B.registerReceiver(anonymousClass4NM.f53352C, anonymousClass4NM.f53351B);
        }
        AnonymousClass4LZ anonymousClass4LZ = this.f7373M;
        if (anonymousClass4LZ != null) {
            AnonymousClass4LZ.E(anonymousClass4LZ);
        }
        AnonymousClass4Nf anonymousClass4Nf = this.f7396j;
        if (anonymousClass4Nf != null) {
            if (anonymousClass4Nf.f53407C == -1) {
                anonymousClass4Nf.f53407C = anonymousClass4Nf.f53409E.A(anonymousClass4Nf.f53410F, anonymousClass4Nf.f53406B);
            }
            if (!((Boolean) AnonymousClass0CC.zf.m846H(anonymousClass4Nf.f53411G)).booleanValue()) {
                anonymousClass4Nf.A();
            }
        }
        AnonymousClass4PI anonymousClass4PI = this.gB;
        if (anonymousClass4PI.f53723D == AnonymousClass3DU.f39300Y) {
            anonymousClass4PI.f53722C.Kf(AnonymousClass3DU.f39300Y, anonymousClass4PI.f53721B.f52869C);
            anonymousClass4PI.f53723D = null;
        }
        if (!(iB || jB)) {
            jB = true;
            AnonymousClass0GA B = AnonymousClass0Jd.f2931B.mo628B(this.f7407u);
            B.f2849B = new AnonymousClass4No(this);
            AnonymousClass0Ix.m2384D(B);
        }
        if (str.equals("story_captured_media_recovery")) {
            AnonymousClass4OL parseFromJson;
            AnonymousClass0cz B2 = AnonymousClass0cy.m5934B(this.f7407u);
            AnonymousClass0LH.m2927E(B2);
            switch (B2.f7296E.ordinal()) {
                case 0:
                    AnonymousClass0dF.m5971M(this, B2.f7297F);
                    break;
                case 1:
                    AnonymousClass0dF.m5972N(this, B2.f7299H);
                    break;
                default:
                    break;
            }
            try {
                parseFromJson = AnonymousClass4OM.parseFromJson(B2.f7294C);
            } catch (Throwable e) {
                AnonymousClass0Gn.m1884K("CapturedMediaRecoveryInfo", "Failed to get reel composer waterfall", e, 1);
                parseFromJson = null;
            }
            this.f7375O = parseFromJson.f53536D;
            this.f7370J.f54566H = parseFromJson;
            AnonymousClass0dF.m5980V(this);
        } else if (str.equals("story_share_intent")) {
            m6003C();
        }
        if (this.cB) {
            this.f7381U.H(true);
        }
    }

    /* renamed from: P */
    public static boolean m5974P(AnonymousClass0dF anonymousClass0dF) {
        return anonymousClass0dF.FB != null ? true : null;
    }

    /* renamed from: Q */
    public final void m6017Q(String str) {
        int i = this.f7409w;
        if (i == 3) {
            AnonymousClass0Iz.f2854L.m2403F(this.f7367G, this.f7362B);
        } else if (i == 1) {
            AnonymousClass0CL.m884C("igcam_time_to_partially_visible", 0);
            AnonymousClass0CL.m883B("igcam_partially_visible", 0);
            AnonymousClass0CN.m901B("igcam_first_partially_visible", -267841602);
            try {
                AnonymousClass0Cm anonymousClass0Cm = this.f7407u;
                AnonymousClass3DU anonymousClass3DU = this.f7369I.f52869C;
                if (((AnonymousClass3FR) anonymousClass0Cm.m1036A(AnonymousClass3FR.class)) != null) {
                    AnonymousClass0Gn.m1880G("CommonStoryCameraWaterfallInfo", new IllegalArgumentException("CommonStoryCameraWaterfallInfo object already exist"));
                }
                AnonymousClass3FR anonymousClass3FR = new AnonymousClass3FR(anonymousClass0Cm, anonymousClass3DU);
                anonymousClass0Cm.m1039D(AnonymousClass3FR.class, anonymousClass3FR);
                AnonymousClass0Cm anonymousClass0Cm2 = this.f7407u;
                if (((AnonymousClass280) anonymousClass0Cm2.m1036A(AnonymousClass2VN.class)) != null) {
                    AnonymousClass0Gn.m1880G("IgCameraLoggerFactory", new IllegalArgumentException("IgCameraLoggerFactory object already exist"));
                }
                anonymousClass0Cm2.m1039D(AnonymousClass2VN.class, new AnonymousClass2VN(anonymousClass0Cm2));
                AnonymousClass281.B(this.f7407u).ya(AnonymousClass4KL.G(str));
                AnonymousClass0EE anonymousClass0EE;
                AnonymousClass0eG anonymousClass0eG;
                if (AnonymousClass0dF.m5974P(this)) {
                    AnonymousClass0NN B;
                    AnonymousClass4Oc anonymousClass4Oc = new AnonymousClass4Oc(anonymousClass3FR);
                    String C = this.FB.f53037C.f27809D.m4805C();
                    AnonymousClass3DU anonymousClass3DU2 = this.IB;
                    anonymousClass4Oc.f53577D = str;
                    if (!str.equals("thread_composer")) {
                        if (!str.equals("thread_reply_pill")) {
                            if (str.equals("reel_viewer_visual_reply_camera_button")) {
                                anonymousClass4Oc.f53576C = AnonymousClass3FR.FC;
                            } else if (str.equals("direct_permanent_media_reply_text")) {
                                anonymousClass4Oc.f53576C = AnonymousClass3FR.IC;
                            } else if (str.equals("direct_reshare_media_reply_text")) {
                                anonymousClass4Oc.f53576C = AnonymousClass3FR.JC;
                            } else {
                                anonymousClass4Oc.f53576C = AnonymousClass3FR.GC;
                            }
                            B = AnonymousClass0NN.m3291B("direct_story_creation_waterfall", anonymousClass4Oc.f53576C);
                            anonymousClass4Oc.f53575B.B(B);
                            anonymousClass4Oc.f53585L = C;
                            B.m3298F("thread_id", C).m3298F("entry_point", str).m3300H("entered_text_to_camera", anonymousClass3DU2 != AnonymousClass3DU.f39300Y);
                            B.m3310R();
                            this.f7370J.f54567I = anonymousClass4Oc;
                            anonymousClass0EE = anonymousClass4Oc.f53576C;
                            anonymousClass0eG = IgCameraControllerImpl.f7639R;
                            if (anonymousClass0eG != null) {
                                anonymousClass0eG.cMA(anonymousClass0EE);
                            }
                        }
                    }
                    anonymousClass4Oc.f53576C = AnonymousClass3FR.HC;
                    B = AnonymousClass0NN.m3291B("direct_story_creation_waterfall", anonymousClass4Oc.f53576C);
                    anonymousClass4Oc.f53575B.B(B);
                    anonymousClass4Oc.f53585L = C;
                    if (anonymousClass3DU2 != AnonymousClass3DU.f39300Y) {
                    }
                    B.m3298F("thread_id", C).m3298F("entry_point", str).m3300H("entered_text_to_camera", anonymousClass3DU2 != AnonymousClass3DU.f39300Y);
                    B.m3310R();
                    this.f7370J.f54567I = anonymousClass4Oc;
                    anonymousClass0EE = anonymousClass4Oc.f53576C;
                    anonymousClass0eG = IgCameraControllerImpl.f7639R;
                    if (anonymousClass0eG != null) {
                        anonymousClass0eG.cMA(anonymousClass0EE);
                    }
                } else {
                    AnonymousClass4OL anonymousClass4OL = new AnonymousClass4OL(anonymousClass3FR);
                    AnonymousClass0Cm anonymousClass0Cm3 = this.f7407u;
                    anonymousClass4OL.f53536D = str;
                    if (str.equals("direct_inbox_bottom_button")) {
                        anonymousClass4OL.f53535C = AnonymousClass3FR.BC;
                        anonymousClass4OL.f53539G = AnonymousClass3FR.CC;
                        anonymousClass4OL.f53537E = "direct_story_creation_waterfall";
                    } else {
                        anonymousClass4OL.f53535C = AnonymousClass3FR.DC;
                        anonymousClass4OL.f53539G = AnonymousClass3FR.EC;
                        anonymousClass4OL.f53537E = "reel_creation_waterfall";
                    }
                    AnonymousClass0NN B2 = AnonymousClass0NN.m3291B(anonymousClass4OL.f53537E, anonymousClass4OL.f53535C);
                    anonymousClass4OL.f53534B.B(B2);
                    if (!"launcher_shortcut_avatar".equals(str)) {
                        if (!"launcher_shortcut_glyph".equals(str)) {
                            B2.m3298F("entry_point", str);
                            B2.m3310R();
                            if (anonymousClass4OL.f53537E.equals("reel_creation_waterfall") && anonymousClass4OL.f53534B.VB) {
                                AnonymousClass0FO.m1608f("sent_to_stories", anonymousClass0Cm3);
                            }
                            this.f7370J.f54566H = anonymousClass4OL;
                            anonymousClass0EE = anonymousClass4OL.f53535C;
                            anonymousClass0eG = IgCameraControllerImpl.f7639R;
                            if (anonymousClass0eG != null) {
                                anonymousClass0eG.cMA(anonymousClass0EE);
                            }
                        }
                    }
                    B2.m3298F("entry_point", "launcher_shortcut");
                    B2.m3298F("entry_point_variant", str);
                    B2.m3310R();
                    AnonymousClass0FO.m1608f("sent_to_stories", anonymousClass0Cm3);
                    this.f7370J.f54566H = anonymousClass4OL;
                    anonymousClass0EE = anonymousClass4OL.f53535C;
                    anonymousClass0eG = IgCameraControllerImpl.f7639R;
                    if (anonymousClass0eG != null) {
                        anonymousClass0eG.cMA(anonymousClass0EE);
                    }
                }
                AnonymousClass0dF.m5980V(this);
                this.f7375O = str;
                AnonymousClass3FR H = AnonymousClass0dF.m5966H(this);
                AnonymousClass3DU anonymousClass3DU3 = this.f7369I.f52869C;
                H.f39486L = anonymousClass3DU3;
                H.f39488N.f39545D = anonymousClass3DU3;
                this.f7368H.A(this.GB);
                this.f7368H.f38204C.f7651M.add(this.HB);
                AnonymousClass4QM anonymousClass4QM = this.f7382V;
                anonymousClass4QM.f53904H.m6301B(anonymousClass4QM.f53918V, anonymousClass4QM.f53917U);
                this.f7402p.m4799C(new AnonymousClass3EN());
                this.AB.setVisibility(0);
                this.AB.requestFocus();
                this.f7367G.eGA();
                this.f7380T.eGA();
                this.f7392f.eGA();
                this.f7374N.eGA();
                this.f7369I.eGA();
                if (this.f7383W != null) {
                    AnonymousClass4Mw anonymousClass4Mw = this.f7383W;
                    if (AnonymousClass0HV.m2008D(anonymousClass4Mw.f53288V).m2024L()) {
                        View view = anonymousClass4Mw.f53281O;
                        if (view != null) {
                            ((ViewGroup) view.getParent()).removeView(anonymousClass4Mw.f53281O);
                            anonymousClass4Mw.f53281O = null;
                        }
                    }
                    IgSwitch igSwitch = anonymousClass4Mw.f53279M;
                    if (igSwitch != null) {
                        igSwitch.setChecked(AnonymousClass2FS.B(anonymousClass4Mw.f53288V).f28045C.getBoolean("ig_live_employee_only_mode", false));
                    }
                    AnonymousClass4Mw.C(anonymousClass4Mw);
                    AnonymousClass4Mw.B(anonymousClass4Mw);
                    anonymousClass4Mw.f53286T.B();
                }
                this.SB.eGA();
                m5996l(2);
                if (this.f7373M != null) {
                    this.f7373M.eGA();
                }
                AnonymousClass0CN.m902C(577665478);
            } catch (Throwable th) {
                AnonymousClass0CN.m902C(-933728941);
            }
        }
        this.f7409w = 2;
        m5995k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: Q */
    public static boolean m5975Q(X.AnonymousClass0dF r3) {
        /*
        r2 = r3.f7375O;
        r0 = r2.hashCode();
        r1 = 0;
        switch(r0) {
            case -1571629607: goto L_0x0051;
            case -1454328998: goto L_0x0047;
            case -177733909: goto L_0x003d;
            case 212740936: goto L_0x0033;
            case 443829090: goto L_0x0029;
            case 923053992: goto L_0x001f;
            case 1141557062: goto L_0x0015;
            case 1946869029: goto L_0x000b;
            default: goto L_0x000a;
        };
    L_0x000a:
        goto L_0x005b;
    L_0x000b:
        r0 = "reel_reshare_direct_tap";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x0013:
        r0 = 3;
        goto L_0x005c;
    L_0x0015:
        r0 = "reel_highlights_creation_toggle_reshare";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x001d:
        r0 = 6;
        goto L_0x005c;
    L_0x001f:
        r0 = "reel_highlights_long_press_reshare";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x0027:
        r0 = 4;
        goto L_0x005c;
    L_0x0029:
        r0 = "feed_post_to_story_button";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x0031:
        r0 = 2;
        goto L_0x005c;
    L_0x0033:
        r0 = "reel_highlights_viewer_direct_share_sheet_reshare";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x003b:
        r0 = 7;
        goto L_0x005c;
    L_0x003d:
        r0 = "reel_dashboard_poll_share_results_button";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x0045:
        r0 = 1;
        goto L_0x005c;
    L_0x0047:
        r0 = "archive_reel_share_button";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x004f:
        r0 = 0;
        goto L_0x005c;
    L_0x0051:
        r0 = "reel_highlights_viewer_options_reshare";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x0059:
        r0 = 5;
        goto L_0x005c;
    L_0x005b:
        r0 = -1;
    L_0x005c:
        switch(r0) {
            case 0: goto L_0x0060;
            case 1: goto L_0x0060;
            case 2: goto L_0x0060;
            case 3: goto L_0x0060;
            case 4: goto L_0x0060;
            case 5: goto L_0x0060;
            case 6: goto L_0x0060;
            case 7: goto L_0x0060;
            default: goto L_0x005f;
        };
    L_0x005f:
        return r1;
    L_0x0060:
        r0 = X.AnonymousClass0dF.m5976R(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dF.Q(X.0dF):boolean");
    }

    /* renamed from: R */
    public final void m6018R() {
        if (!this.f7374N.R()) {
            Collection B = this.f7365E.B(this.f7407u, this.f7374N.G(), this.f7374N.E().A(), this.f7374N.D());
            if (B.isEmpty()) {
                this.f7402p.m4799C(new AnonymousClass3ER());
                return;
            }
            AnonymousClass3FR H = AnonymousClass0dF.m5966H(this);
            H.f39482H.clear();
            H.f39482H.addAll(B);
            AnonymousClass0dF.m5986b(this, new AnonymousClass4Nn(this));
        }
    }

    /* renamed from: R */
    public static boolean m5976R(AnonymousClass0dF anonymousClass0dF) {
        if (AnonymousClass0dF.m5974P(anonymousClass0dF)) {
            AnonymousClass4Oc K = AnonymousClass0dF.m5969K(anonymousClass0dF);
            AnonymousClass3FN anonymousClass3FN = AnonymousClass3FN.f39450J;
            if (K.f53578E == null) {
                K.f53578E = anonymousClass3FN;
            }
            AnonymousClass0dF.m5997m(anonymousClass0dF);
        } else {
            AnonymousClass0dF.m5968J(anonymousClass0dF).A(AnonymousClass3FN.f39450J);
        }
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) anonymousClass0dF.f7402p.f5584B;
        anonymousClass0dF.f7402p.m4799C(new AnonymousClass3Dn());
        if (anonymousClass0dF.f7402p.f5584B != anonymousClass3AM) {
            return true;
        }
        if (!anonymousClass0dF.QB) {
            if (!AnonymousClass0dF.m5974P(anonymousClass0dF)) {
                return false;
            }
        }
        AnonymousClass1U5 anonymousClass1U5 = anonymousClass0dF.bB;
        anonymousClass1U5.m11566A("back", anonymousClass1U5.f19024F != null, null);
        return true;
    }

    /* renamed from: S */
    public final void m6019S() {
        if (AnonymousClass1Ba.m9838D(this.f7362B, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            AnonymousClass0dF.m5964F(this);
            AnonymousClass0dF.m5998n(this);
            return;
        }
        AnonymousClass1Ba.m9842H(this.f7362B, this, "android.permission.WRITE_EXTERNAL_STORAGE");
        this.WB = AnonymousClass4Nx.f53496C;
    }

    /* renamed from: S */
    public static void m5977S(AnonymousClass0dF anonymousClass0dF, AnonymousClass0PB anonymousClass0PB) {
        Collection B = anonymousClass0dF.f7365E.B(anonymousClass0dF.f7407u, anonymousClass0dF.f7374N.G(), anonymousClass0dF.f7374N.E().A(), anonymousClass0dF.f7374N.D());
        if (B.isEmpty()) {
            AnonymousClass0dF.m5962D(anonymousClass0dF, anonymousClass0PB);
            return;
        }
        AnonymousClass3FR H = AnonymousClass0dF.m5966H(anonymousClass0dF);
        H.f39482H.clear();
        H.f39482H.addAll(B);
        AnonymousClass0dF.m5986b(anonymousClass0dF, new AnonymousClass4Nl(anonymousClass0dF, anonymousClass0PB));
    }

    public final void St() {
        AnonymousClass0dF.m5981W(this);
        this.f7402p.m4799C(new AnonymousClass3Du());
        this.EB.St();
        this.f7367G.St();
        this.f7380T.St();
        this.f7392f.St();
        this.f7408v.St();
        this.f7374N.St();
        this.f7369I.St();
        this.SB.St();
        AnonymousClass5Tg anonymousClass5Tg = this.f7387a;
        if (anonymousClass5Tg.f64585B == AnonymousClass4RJ.f54068D) {
            AnonymousClass5Th anonymousClass5Th = anonymousClass5Tg.f64587D.f64630F;
            anonymousClass5Th.f64592E = anonymousClass5Th.f64589B.B();
            anonymousClass5Th.f64589B.F();
        }
        if (!this.f7404r.B()) {
            this.f7404r.St();
        }
        AnonymousClass4Mw anonymousClass4Mw = this.f7383W;
        AnonymousClass4LZ anonymousClass4LZ = this.f7373M;
        if (anonymousClass4LZ != null) {
            anonymousClass4LZ.St();
        }
        if (this.f7409w != 1) {
            this.RB.m6817C();
            this.f7381U.E();
        }
        AnonymousClass3y8 anonymousClass3y8 = this.f7388b;
        if (anonymousClass3y8 != null) {
            anonymousClass3y8.A();
        }
    }

    /* renamed from: T */
    public static void m5978T(AnonymousClass0dF anonymousClass0dF, AnonymousClass3FN anonymousClass3FN) {
        int i = anonymousClass0dF.f7409w;
        if (i != 1) {
            if (i == 3) {
                AnonymousClass0Iz.f2854L.m2403F(anonymousClass0dF.f7367G, anonymousClass0dF.f7362B);
            }
            anonymousClass0dF.f7409w = 1;
            if (AnonymousClass0dF.m5974P(anonymousClass0dF)) {
                AnonymousClass4Oc K = AnonymousClass0dF.m5969K(anonymousClass0dF);
                if (K.f53578E == null) {
                    K.f53578E = anonymousClass3FN;
                }
                AnonymousClass4Oc K2 = AnonymousClass0dF.m5969K(anonymousClass0dF);
                AnonymousClass3Fe anonymousClass3Fe = K2.f53575B.hB;
                AnonymousClass0NN B = AnonymousClass0NN.m3291B("direct_story_creation_waterfall", K2.f53576C);
                if (anonymousClass3Fe != null) {
                    K2.f53578E = AnonymousClass3FN.f39448H;
                }
                double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - K2.f53582I);
                Double.isNaN(elapsedRealtime);
                B.m3294B("exit_point", K2.f53578E.A()).m3298F("entry_point", K2.f53577D).m3298F("thread_id", K2.f53585L).m3293A("waterfall_duration", elapsedRealtime / 1000.0d);
                B.m3300H("navigated_to_text_to_cam_reply", K2.f53579F);
                boolean z = K2.f53581H;
                if (z) {
                    B.m3300H("has_big_text", z);
                }
                Boolean bool = K2.f53580G;
                if (bool != null) {
                    B.m3300H("thumbnail_position_changed", bool.booleanValue());
                }
                String str = K2.f53586M;
                if (str != null) {
                    B.m3298F("visual_reply_mode", str);
                }
                B.m3300H("background_color_toggle", K2.f53583J);
                B.m3300H("background_transparency_toggle", K2.f53584K);
                K2.f53575B.A(B);
                B.m3310R();
            } else {
                AnonymousClass3Fe anonymousClass3Fe2;
                AnonymousClass0NN B2;
                double elapsedRealtime2;
                if (anonymousClass0dF.m5993i() != null && AnonymousClass0dF.m5985a(anonymousClass0dF)) {
                    AnonymousClass4OK i2 = anonymousClass0dF.m5993i();
                    if (i2.f53532D == null) {
                        i2.f53532D = anonymousClass3FN;
                    }
                    AnonymousClass4OK i3 = anonymousClass0dF.m5993i();
                    anonymousClass3Fe2 = i3.f53530B.hB;
                    B2 = AnonymousClass0NN.m3291B("direct_story_creation_waterfall", AnonymousClass3FR.EC);
                    if (anonymousClass3Fe2 != null) {
                        i3.f53532D = AnonymousClass3FN.f39448H;
                    }
                    elapsedRealtime2 = (double) (SystemClock.elapsedRealtime() - i3.f53533E);
                    Double.isNaN(elapsedRealtime2);
                    B2.m3294B("exit_point", i3.f53532D.A()).m3298F("entry_point", i3.f53531C).m3293A("waterfall_duration", elapsedRealtime2 / 1000.0d);
                    i3.f53530B.A(B2);
                    B2.m3310R();
                }
                AnonymousClass0dF.m5968J(anonymousClass0dF).A(anonymousClass3FN);
                AnonymousClass4OL J = AnonymousClass0dF.m5968J(anonymousClass0dF);
                anonymousClass3Fe2 = J.f53534B.hB;
                B2 = AnonymousClass0NN.m3291B(J.f53537E, anonymousClass3Fe2 == AnonymousClass3Fe.f39571E ? J.f53539G : J.f53535C);
                if (anonymousClass3Fe2 != null) {
                    J.f53538F = anonymousClass3Fe2 == AnonymousClass3Fe.f39571E ? AnonymousClass3FN.f39448H : AnonymousClass3FN.f39447G;
                }
                elapsedRealtime2 = (double) (SystemClock.elapsedRealtime() - J.f53540H);
                Double.isNaN(elapsedRealtime2);
                B2.m3294B("exit_point", J.f53538F.A()).m3298F("entry_point", J.f53536D).m3293A("waterfall_duration", elapsedRealtime2 / 1000.0d);
                J.f53534B.A(B2);
                B2.m3310R();
            }
            anonymousClass0dF.f7407u.m1040E(AnonymousClass3FR.class);
            AnonymousClass281.B(anonymousClass0dF.f7407u).AOA(AnonymousClass4KL.H(anonymousClass3FN));
            anonymousClass0dF.f7368H.V(anonymousClass0dF.GB);
            anonymousClass0dF.f7368H.f38204C.f7651M.remove(anonymousClass0dF.HB);
            anonymousClass0dF.f7382V.f53904H.m6300A(null);
            anonymousClass0dF.AB.setVisibility(4);
            AnonymousClass0dF.m5973O(anonymousClass0dF, false);
            AnonymousClass0QP anonymousClass0QP = anonymousClass0dF.f7381U;
            anonymousClass0QP.f53255C.m5765J(anonymousClass0QP);
            anonymousClass0dF.f7380T.ln();
            anonymousClass0dF.f7367G.ln();
            anonymousClass0dF.f7369I.ln();
            anonymousClass0dF.f7374N.ln();
            anonymousClass0dF.f7367G.f7628p = false;
            AnonymousClass3Ek anonymousClass3Ek = anonymousClass0dF.f7377Q.f7660F;
            if (anonymousClass3Ek != null) {
                anonymousClass3Ek.f39353C.removeCallbacks(anonymousClass3Ek.f39356F);
            }
            AnonymousClass4Mw anonymousClass4Mw = anonymousClass0dF.f7383W;
            if (anonymousClass4Mw != null) {
                AnonymousClass0OR.m3627G(anonymousClass4Mw.f53277K, anonymousClass4Mw.f53282P, -965540753);
                AnonymousClass0JQ.f2915B.mo564C();
            }
            anonymousClass0dF.SB.ln();
            AnonymousClass4LZ anonymousClass4LZ = anonymousClass0dF.f7373M;
            if (anonymousClass4LZ != null) {
                anonymousClass4LZ.ln();
            }
            anonymousClass0dF.RB.m6817C();
            AnonymousClass4NM anonymousClass4NM = anonymousClass0dF.VB;
            if (anonymousClass4NM != null) {
                anonymousClass0dF.f7362B.unregisterReceiver(anonymousClass4NM.f53352C);
            }
            AnonymousClass3y8 anonymousClass3y8 = anonymousClass0dF.f7388b;
            if (anonymousClass3y8 != null) {
                anonymousClass3y8.A();
            }
            anonymousClass0dF.f7402p.m4799C(new AnonymousClass3EM());
        }
    }

    /* renamed from: T */
    public final void m6020T(AnonymousClass3nn anonymousClass3nn) {
        if (this.f7385Y.B()) {
            AnonymousClass5T9 anonymousClass5T9 = this.f7385Y;
            if (anonymousClass5T9.f64313E && AnonymousClass4Uf.C(anonymousClass3nn, anonymousClass5T9.f64320L)) {
                for (AnonymousClass3nn anonymousClass3FJ : AnonymousClass4Uf.B(anonymousClass3nn)) {
                    anonymousClass5T9.f64314F.add(new AnonymousClass3FJ(anonymousClass3FJ));
                }
            } else {
                anonymousClass5T9.f64314F.add(new AnonymousClass3FJ(anonymousClass3nn));
            }
            AnonymousClass5T9.C(anonymousClass5T9);
        } else if (this.OB && AnonymousClass4Uf.C(anonymousClass3nn, this.f7407u)) {
            AnonymousClass0dF.m5982X(this, anonymousClass3nn, AnonymousClass3FO.f39456E);
        } else {
            AnonymousClass0dF.m5972N(this, anonymousClass3nn);
        }
    }

    /* renamed from: U */
    public static void m5979U(AnonymousClass0dF anonymousClass0dF) {
        AnonymousClass1U5 anonymousClass1U5 = anonymousClass0dF.bB;
        String str = anonymousClass0dF.f7373M == null ? "story_replied" : "story_visual_reply";
        anonymousClass1U5.f19020B.setResult(-1);
        if ("story_visual_reply".equals(str)) {
            AnonymousClass1U5.m11565D(anonymousClass1U5, str);
            return;
        }
        RectF rectF = anonymousClass1U5.f19022D;
        if (rectF == null) {
            rectF = anonymousClass1U5.f19024F;
        }
        AnonymousClass1U5.m11564C(anonymousClass1U5, str, rectF != null, rectF, anonymousClass1U5.f19025G);
    }

    /* renamed from: U */
    public final void m6021U(Medium medium, boolean z) {
        if (this.f7409w != 1) {
            AnonymousClass3FO g = m5991g();
            AnonymousClass0dF.m5966H(this).XB = g;
            int h = m5992h();
            AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4Pn(this.f7362B, medium));
            anonymousClass0n3.f9990B = new AnonymousClass4Nj(this, h, z, g);
            AnonymousClass0Ix.m2384D(anonymousClass0n3);
        }
    }

    /* renamed from: V */
    public static void m5980V(AnonymousClass0dF anonymousClass0dF) {
        AnonymousClass4LP anonymousClass4LP = anonymousClass0dF.f7374N.f66842I;
        if (anonymousClass4LP != null) {
            AnonymousClass4LP.B(anonymousClass4LP).NB = anonymousClass4LP.f53015B.f53010D;
        }
        anonymousClass0dF.f7377Q.m6287H(AnonymousClass0dF.m5966H(anonymousClass0dF).f39488N);
        anonymousClass0dF.f7368H.f38204C.f7640B.f37965B = new AnonymousClass4Np(AnonymousClass0dF.m5966H(anonymousClass0dF), anonymousClass0dF.HB);
    }

    /* renamed from: V */
    public final void m6022V(String str, boolean z) {
        this.bB.m11566A(str, z, null);
    }

    /* renamed from: W */
    public final void m6023W(int i) {
        AnonymousClass0eB anonymousClass0eB = this.f7367G;
        int i2 = 0;
        if (i > 0 && anonymousClass0eB.f7593G == null) {
            int i3 = 1;
            if (!(!anonymousClass0eB.f7596J.Q() || anonymousClass0eB.f7596J.O() == 0 || anonymousClass0eB.f7596J.L() == 0)) {
                AnonymousClass44I anonymousClass44I = anonymousClass0eB.f7596J;
                Bitmap H = anonymousClass44I.H(anonymousClass44I.O() / 10, anonymousClass0eB.f7596J.L() / 10);
                BlurUtil.blurInPlace(H, 6);
                if (!(H.getPixel(0, 0) == 0 || H.getPixel(0, H.getHeight() - 1) == 0 || H.getPixel(H.getWidth() - 1, 0) == 0 || H.getPixel(H.getWidth() - 1, H.getHeight() - 1) == 0)) {
                    anonymousClass0eB.f7593G = new BitmapDrawable(anonymousClass0eB.f7588B.getResources(), H);
                    anonymousClass0eB.f7594H.setImageDrawable(anonymousClass0eB.f7593G);
                    if (i3 == 0) {
                        anonymousClass0eB.f7593G = new ColorDrawable(AnonymousClass0Ca.m937C(anonymousClass0eB.f7588B, C0164R.color.black_65_transparent));
                        anonymousClass0eB.f7596J.p();
                        anonymousClass0eB.f7594H.setImageDrawable(anonymousClass0eB.f7593G);
                    }
                }
            }
            i3 = 0;
            if (i3 == 0) {
                anonymousClass0eB.f7593G = new ColorDrawable(AnonymousClass0Ca.m937C(anonymousClass0eB.f7588B, C0164R.color.black_65_transparent));
                anonymousClass0eB.f7596J.p();
                anonymousClass0eB.f7594H.setImageDrawable(anonymousClass0eB.f7593G);
            }
        } else if (i == 0 && anonymousClass0eB.f7593G != null) {
            AnonymousClass44I anonymousClass44I2 = anonymousClass0eB.f7596J;
            if (anonymousClass44I2 != null) {
                anonymousClass44I2.m();
            }
            anonymousClass0eB.f7594H.setImageDrawable(null);
            anonymousClass0eB.f7593G = null;
        }
        ImageView imageView = anonymousClass0eB.f7594H;
        if (i <= 0) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        anonymousClass0eB.f7594H.setImageAlpha(i);
    }

    /* renamed from: W */
    public static void m5981W(AnonymousClass0dF anonymousClass0dF) {
        if (anonymousClass0dF.f7369I.f52869C == AnonymousClass3DU.f39299X) {
            anonymousClass0dF.f7368H.U();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void WBA(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
        r12 = this;
        r4 = r14;
        r3 = r13;
        r3 = (X.AnonymousClass3AM) r3;
        r4 = (X.AnonymousClass3AM) r4;
        r1 = X.AnonymousClass4Nq.f53480B;
        r0 = r3.ordinal();
        r2 = r1[r0];
        r1 = 2;
        r0 = r12;
        if (r2 == r1) goto L_0x0025;
    L_0x0012:
        switch(r2) {
            case 4: goto L_0x001d;
            case 5: goto L_0x0016;
            default: goto L_0x0015;
        };
    L_0x0015:
        goto L_0x0030;
    L_0x0016:
        r2 = r12.f7376P;
        r1 = 0;
        r2.Kk(r1);
        goto L_0x0030;
    L_0x001d:
        r1 = X.AnonymousClass3AM.f38546U;
        if (r4 == r1) goto L_0x0030;
    L_0x0021:
        X.AnonymousClass0dF.m5964F(r12);
        goto L_0x0030;
    L_0x0025:
        r2 = r12.f7397k;
        r1 = X.AnonymousClass4Nh.f53415C;
        if (r2 != r1) goto L_0x0030;
    L_0x002b:
        r1 = r15 instanceof X.AnonymousClass3Dn;
        if (r1 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0021;
    L_0x0030:
        r1 = r4.ordinal();
        switch(r1) {
            case 0: goto L_0x0089;
            case 1: goto L_0x0096;
            case 3: goto L_0x0039;
            case 4: goto L_0x0267;
            case 14: goto L_0x008e;
            case 15: goto L_0x00d1;
            case 22: goto L_0x00d1;
            default: goto L_0x0037;
        };
    L_0x0037:
        goto L_0x026f;
    L_0x0039:
        r2 = r12.f7395i;
        r0 = r2.f64369C;
        r1 = r0.m6242C();
        r0 = r2.f64371E;
        r6 = r0.f53436U;
        r5 = X.AnonymousClass4MP.D();
        r0 = r2.f64374H;
        r3 = r0.I();
        r0 = r2.f64374H;
        r1 = r0.F(r1);
        r4 = r2.f64373G;
        r2 = 0;
        r0 = r4.f54385Z;
        r0.hSA(r3);
        r0 = r4.f54371L;
        r0.hSA(r1);
        r0 = r4.f54386a;
        r3 = 1;
        r1 = 0;
        if (r0 != 0) goto L_0x006a;
    L_0x0068:
        r0 = 1;
        goto L_0x006b;
    L_0x006a:
        r0 = 0;
    L_0x006b:
        r4.C(r0);
        if (r5 == 0) goto L_0x0075;
    L_0x0070:
        r0 = r4.f54372M;
        r0.hSA(r2);
    L_0x0075:
        if (r6 == 0) goto L_0x0087;
    L_0x0077:
        r0 = 2;
        r2 = new X.AnonymousClass4Tc[r0];
        r0 = r4.f54380U;
        r2[r1] = r0;
        r0 = r4.f54373N;
        r2[r3] = r0;
        r1 = 0;
        r0 = 0;
        X.AnonymousClass4Td.C(r1, r0, r2);
    L_0x0087:
        goto L_0x026f;
    L_0x0089:
        X.AnonymousClass0dF.m5981W(r12);
        goto L_0x026f;
    L_0x008e:
        r1 = r12.f7376P;
        r0 = 1;
        r1.Kk(r0);
        goto L_0x026f;
    L_0x0096:
        r2 = r12.f7379S;
        r1 = r12.m6001A();
        r2.B(r1);
        r2 = r12.f7369I;
        r1 = 1;
        r2.H(r1);
        r1 = r12.f7370J;
        r1 = r1.f54569K;
        if (r1 == 0) goto L_0x00b4;
    L_0x00ab:
        r2 = r12.m6001A();
        r1 = X.AnonymousClass3DU.f39300Y;
        X.AnonymousClass0dF.m5965G(r12, r2, r1);
    L_0x00b4:
        r2 = r12.f7370J;
        r1 = 0;
        r2.f54569K = r1;
        r1 = r12.f7376P;
        r1.gk();
        r1 = r12.f7369I;
        r2 = r1.f52869C;
        r1 = X.AnonymousClass3DU.f39299X;
        if (r2 != r1) goto L_0x00cf;
    L_0x00c6:
        r1 = r12.f7403q;
        r0 = 1;
        r1.H(r0);
        r1.I();
    L_0x00cf:
        goto L_0x026f;
    L_0x00d1:
        r1 = X.AnonymousClass0dF.m5985a(r12);
        if (r1 == 0) goto L_0x00e1;
    L_0x00d7:
        r1 = X.AnonymousClass3AM.f38535J;
        if (r3 == r1) goto L_0x00df;
    L_0x00db:
        r1 = X.AnonymousClass3AM.f38530E;
        if (r3 != r1) goto L_0x00e1;
    L_0x00df:
        r1 = 1;
        goto L_0x00e2;
    L_0x00e1:
        r1 = 0;
    L_0x00e2:
        if (r1 == 0) goto L_0x010d;
    L_0x00e4:
        r4 = new X.4OK;
        r1 = X.AnonymousClass0dF.m5966H(r12);
        r4.<init>(r1);
        r1 = r12.f7375O;
        r4.f53531C = r1;
        r2 = "direct_story_creation_waterfall";
        r1 = X.AnonymousClass3FR.EC;
        r3 = X.AnonymousClass0NN.m3291B(r2, r1);
        r2 = "entry_point";
        r1 = r4.f53531C;
        r2 = r3.m3298F(r2, r1);
        r1 = r4.f53530B;
        r1.B(r2);
        r2.m3310R();
        r1 = r12.f7370J;
        r1.f54565G = r4;
    L_0x010d:
        r1 = r15 instanceof X.AnonymousClass3ER;
        if (r1 == 0) goto L_0x026f;
    L_0x0111:
        r3 = X.AnonymousClass0cO.m5772B();
        r1 = r12.f7362B;
        r2 = new android.widget.ImageView;
        r2.<init>(r1);
        r1 = r1.getWindow();
        r1 = r1.getDecorView();
        r1 = (android.view.ViewGroup) r1;
        r1.addView(r2);
        r1 = 8;
        r2.setVisibility(r1);
        r1 = new java.lang.ref.WeakReference;
        r1.<init>(r2);
        r3.f7120C = r1;
        r3 = r12.f7374N;
        r2 = r3.f66861b;
        r1 = X.AnonymousClass4Tu.f54468J;
        r1 = r2.B(r1);
        if (r1 == 0) goto L_0x0157;
    L_0x0141:
        r2 = r3.f66861b;
        r1 = X.AnonymousClass4Tu.f54466H;
        r1 = r2.B(r1);
        if (r1 == 0) goto L_0x0157;
    L_0x014b:
        r2 = r3.f66861b;
        r1 = X.AnonymousClass4Tu.f54465G;
        r1 = r2.B(r1);
        if (r1 == 0) goto L_0x0157;
    L_0x0155:
        r1 = 1;
        goto L_0x0158;
    L_0x0157:
        r1 = 0;
    L_0x0158:
        r4 = 0;
        r2 = 1;
        if (r1 == 0) goto L_0x0166;
    L_0x015c:
        r1 = r12.f7370J;
        r3 = r1.f54562D;
        r1 = X.AnonymousClass4QH.f53882E;
        if (r3 != r1) goto L_0x0166;
    L_0x0164:
        r9 = 1;
        goto L_0x0167;
    L_0x0166:
        r9 = 0;
    L_0x0167:
        r1 = r12.f7370J;
        r3 = r1.f54562D;
        r1 = X.AnonymousClass4QH.f53882E;
        if (r3 != r1) goto L_0x0171;
    L_0x016f:
        r10 = 1;
        goto L_0x0172;
    L_0x0171:
        r10 = 0;
    L_0x0172:
        r1 = r12.m6002B();
        r5 = r12.f7369I;
        r3 = r12.f7377Q;
        r14 = X.AnonymousClass4OJ.C(r1, r5, r3);
        r5 = r12.f7376P;
        r6 = r12.f7401o;
        r3 = r12.f7374N;
        r7 = r3.A();
        r3 = r12.f7374N;
        r8 = r3.P();
        r11 = 0;
        r12 = 0;
        r15 = 0;
        r13 = r1;
        r5 = r5.Ic(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        if (r5 != 0) goto L_0x0266;
    L_0x0198:
        r5 = X.AnonymousClass0J7.f2895B;
        r6 = r5.mo533O();
        r5 = r0.f7407u;
        r5 = r6.m2492A(r5);
        r8 = r0.f7401o;
        r7 = r5.f39972B;
        r6 = "DirectPrivateStoryRecipientFragment.SHOW_STORY_BUTTON";
        r7.putBoolean(r6, r8);
        r8 = r0.f7401o;
        r7 = r5.f39972B;
        r6 = "DirectPrivateStoryRecipientFragment.CAN_SHOW_EXTERNAL_SHARE_OPTIONS";
        r7.putBoolean(r6, r8);
        r6 = r0.f7374N;
        r8 = r6.A();
        r7 = r5.f39972B;
        r6 = "DirectPrivateStoryRecipientFragment.CAN_SHOW_FB_STORY_OPTION";
        r7.putBoolean(r6, r8);
        r6 = r0.f7374N;
        r8 = r6.P();
        r7 = r5.f39972B;
        r6 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB";
        r7.putBoolean(r6, r8);
        r7 = r5.f39972B;
        r6 = "DirectPrivateStoryRecipientFragment.CAN_SHOW_WHATSAPP_SHARE_OPTION";
        r7.putBoolean(r6, r9);
        r7 = r5.f39972B;
        r6 = "DirectPrivateStoryRecipientFragment.CAN_SHOW_HIGHLIGHTS_OPTION";
        r7.putBoolean(r6, r10);
        r6 = r0.f7390d;
        r7 = r6.getContext();
        r6 = 2130968827; // 0x7f0400fb float:1.7546319E38 double:1.05283849E-314;
        r7 = X.AnonymousClass0G5.m1721B(r7, r6, r4);
        r6 = r5.f39972B;
        r4 = "DirectPrivateStoryRecipientFragment.SHOW_SEARCH_IN_ACTION_BAR";
        r6.putBoolean(r4, r7);
        r4 = r0.f7390d;
        r6 = r4.getContext();
        r4 = 2130968828; // 0x7f0400fc float:1.754632E38 double:1.0528384903E-314;
        r7 = X.AnonymousClass0G5.m1721B(r6, r4, r2);
        r6 = r5.f39972B;
        r4 = "DirectPrivateStoryRecipientFragment.SHOULD_SHOW_SUGGESTED_AND_RECENT_TITLE_HEADERS";
        r6.putBoolean(r4, r7);
        r4 = r0.f7390d;
        r6 = r4.getContext();
        r4 = 2130968826; // 0x7f0400fa float:1.7546317E38 double:1.0528384893E-314;
        r6 = X.AnonymousClass0G5.m1721B(r6, r4, r2);
        r4 = r5.f39972B;
        r2 = "DirectPrivateStoryRecipientFragment.SHOW_SHARE_HEADER";
        r4.putBoolean(r2, r6);
        if (r1 == 0) goto L_0x0225;
    L_0x021c:
        r2 = r1.isEmpty();
        if (r2 != 0) goto L_0x0225;
    L_0x0222:
        r5.C(r1);
    L_0x0225:
        if (r14 == 0) goto L_0x022e;
    L_0x0227:
        r2 = r5.f39972B;
        r1 = "bundle_share_media_logging_info";
        r2.putParcelableArrayList(r1, r14);
    L_0x022e:
        r6 = new X.0Sn;
        r7 = com.instagram.modal.TransparentModalActivity.class;
        r8 = "direct_private_story_recipients";
        r9 = r5.f39972B;
        r1 = r0.f7390d;
        r2 = r1.getContext();
        r1 = android.app.Activity.class;
        r10 = X.AnonymousClass0T1.m4441B(r2, r1);
        r10 = (android.app.Activity) r10;
        r1 = r0.f7407u;
        r11 = r1.f1759C;
        r6.<init>(r7, r8, r9, r10, r11);
        r3 = r0.f7390d;
        r2 = X.AnonymousClass3AN.f38552C;
        r1 = r0.f7372L;
        r1 = r1.f5584B;
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x025c;
    L_0x0259:
        r1 = 4919; // 0x1337 float:6.893E-42 double:2.4303E-320;
        goto L_0x025e;
    L_0x025c:
        r1 = 4920; // 0x1338 float:6.894E-42 double:2.431E-320;
    L_0x025e:
        r6.m4404C(r3, r1);
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.m6014N(r1);
    L_0x0266:
        goto L_0x026f;
    L_0x0267:
        r1 = r12.f7376P;
        r1.hk();
        X.AnonymousClass0dF.m5981W(r12);
    L_0x026f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dF.WBA(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: X */
    public static void m5982X(AnonymousClass0dF anonymousClass0dF, AnonymousClass3nn anonymousClass3nn, AnonymousClass3FO anonymousClass3FO) {
        AnonymousClass0dF.m5973O(anonymousClass0dF, false);
        AnonymousClass5Tf anonymousClass5Tf = anonymousClass0dF.f7386Z;
        AnonymousClass3nn<AnonymousClass3nn> B = AnonymousClass4Uf.B(anonymousClass3nn);
        AnonymousClass5Tf.E(anonymousClass5Tf).XB = anonymousClass3FO;
        anonymousClass0dF = anonymousClass5Tf.f64576W;
        List arrayList = new ArrayList();
        for (AnonymousClass3nn anonymousClass3Fh : B) {
            arrayList.add(new AnonymousClass3Fh(anonymousClass3Fh));
        }
        anonymousClass0dF.A(arrayList);
        anonymousClass5Tf.f64575V.B(true);
        arrayList = new ArrayList(B.size());
        for (AnonymousClass3nn anonymousClass3Fh2 : B) {
            arrayList.add(new AnonymousClass3FJ(anonymousClass3Fh2));
            if (anonymousClass3FO == AnonymousClass3FO.f39458G) {
                AnonymousClass5Tf.E(anonymousClass5Tf).C();
            }
        }
        anonymousClass5Tf.f64557D.H(arrayList);
        anonymousClass5Tf.f64573T.m4799C(new AnonymousClass3E5());
    }

    /* renamed from: Y */
    public static boolean m5983Y(AnonymousClass0dF anonymousClass0dF, List list, boolean z) {
        return anonymousClass0dF.f7366F != null && z && (!AnonymousClass0EF.m1358I(anonymousClass0dF.f7362B) || list == null || list.isEmpty());
    }

    public final void Ym(boolean z, boolean z2, float f, float f2) {
        if (AnonymousClass4Nq.f53481C[((AnonymousClass3AN) this.f7372L.f5584B).ordinal()] == 2) {
            if (!z) {
                return;
            }
            if (this.f7370J.B() == AnonymousClass3FK.f39430D) {
                this.f7392f.f64357W = f;
            } else {
                this.f7408v.f64485W = f;
            }
        }
    }

    /* renamed from: Z */
    public static boolean m5984Z(AnonymousClass0dF anonymousClass0dF) {
        AnonymousClass0CC.OI.m843E(anonymousClass0dF.f7407u);
        if (!anonymousClass0dF.eB) {
            return false;
        }
        AnonymousClass0dF.m6000p(anonymousClass0dF, AnonymousClass0Um.FAVORITES);
        return true;
    }

    public final void Zt(Map map) {
        if (this.WB.equals(AnonymousClass4Nx.f53496C)) {
            String str = "android.permission.WRITE_EXTERNAL_STORAGE";
            if (AnonymousClass1Bb.DENIED_DONT_ASK_AGAIN.equals(map.get(str))) {
                Toast.makeText(this.f7362B, C0164R.string.save_fail_external_storage_permission_toast, 0).show();
            } else if (AnonymousClass1Bb.GRANTED.equals(map.get(str))) {
                AnonymousClass0dF.m5998n(this);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5985a(AnonymousClass0dF anonymousClass0dF) {
        return anonymousClass0dF.f7375O.equals("direct_inbox_bottom_button") ^ 1;
    }

    /* renamed from: b */
    public static void m5986b(AnonymousClass0dF anonymousClass0dF, OnClickListener onClickListener) {
        AnonymousClass32q.C(anonymousClass0dF.f7365E, anonymousClass0dF.XB.getContext(), new AnonymousClass4Nk(anonymousClass0dF), onClickListener, C0164R.string.stories_tagging_upsell_dialog_message);
    }

    /* renamed from: c */
    public static void m5987c(AnonymousClass0dF anonymousClass0dF) {
        if (((Boolean) AnonymousClass0CC.jD.m846H(anonymousClass0dF.f7407u)).booleanValue()) {
            AnonymousClass0Nm.m3441T(anonymousClass0dF.f7393g.f54365F, new AnonymousClass4Ns(anonymousClass0dF));
        }
    }

    /* renamed from: d */
    public static void m5988d(AnonymousClass0dF anonymousClass0dF) {
        AnonymousClass4LZ anonymousClass4LZ = anonymousClass0dF.f7373M;
        boolean z = true;
        Object obj = (anonymousClass4LZ == null || !"thumbnail".equals(anonymousClass4LZ.f53048C)) ? null : 1;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = anonymousClass0dF.ZB;
        if (obj == null || !anonymousClass0dF.f7404r.C()) {
            z = false;
        }
        touchInterceptorFrameLayout.setKeepObservingAfterRequestDisallowTouchEvent(z);
    }

    /* renamed from: e */
    private boolean m5989e(float f, float f2) {
        if (!this.QB || f2 <= ((float) this.TB) || this.JB >= 0.005f) {
            if (this.f7381U.D(f, this.JB)) {
                AnonymousClass4KL.I(this.f7407u).f52815B = true;
            }
            return false;
        }
        if (AnonymousClass0dF.m5974P(this)) {
            AnonymousClass4Oc K = AnonymousClass0dF.m5969K(this);
            AnonymousClass3FN anonymousClass3FN = AnonymousClass3FN.f39449I;
            if (K.f53578E == null) {
                K.f53578E = anonymousClass3FN;
            }
            AnonymousClass0dF.m5997m(this);
        } else {
            AnonymousClass0dF.m5968J(this).A(AnonymousClass3FN.f39449I);
        }
        this.bB.m11566A("swipe", true, null);
        return true;
    }

    /* renamed from: f */
    private static AnonymousClass36h m5990f(AnonymousClass0dF anonymousClass0dF, String str) {
        AnonymousClass3GB C = AnonymousClass3G4.C(str);
        if (C == null) {
            return null;
        }
        return anonymousClass0dF.f7368H.D(C.f39620B);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    private X.AnonymousClass3FO m5991g() {
        /*
        r4 = this;
        r1 = r4.f7375O;
        r0 = r1.hashCode();
        switch(r0) {
            case -1571629607: goto L_0x007b;
            case -1541756009: goto L_0x0071;
            case -1454328998: goto L_0x0067;
            case -811302394: goto L_0x005d;
            case -177733909: goto L_0x0053;
            case 212740936: goto L_0x0048;
            case 443829090: goto L_0x003e;
            case 827775034: goto L_0x0034;
            case 831216352: goto L_0x002a;
            case 923053992: goto L_0x001f;
            case 1141557062: goto L_0x0014;
            case 1946869029: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x0086;
    L_0x000a:
        r0 = "reel_reshare_direct_tap";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0012:
        r0 = 6;
        goto L_0x0087;
    L_0x0014:
        r0 = "reel_highlights_creation_toggle_reshare";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x001c:
        r0 = 10;
        goto L_0x0087;
    L_0x001f:
        r0 = "reel_highlights_long_press_reshare";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0027:
        r0 = 8;
        goto L_0x0087;
    L_0x002a:
        r0 = "reel_viewer_visual_reply_camera_button";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0032:
        r0 = 4;
        goto L_0x0087;
    L_0x0034:
        r0 = "direct_expiring_media_viewer";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x003c:
        r0 = 5;
        goto L_0x0087;
    L_0x003e:
        r0 = "feed_post_to_story_button";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0046:
        r0 = 3;
        goto L_0x0087;
    L_0x0048:
        r0 = "reel_highlights_viewer_direct_share_sheet_reshare";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0050:
        r0 = 11;
        goto L_0x0087;
    L_0x0053:
        r0 = "reel_dashboard_poll_share_results_button";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x005b:
        r0 = 2;
        goto L_0x0087;
    L_0x005d:
        r0 = "story_share_intent";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0065:
        r0 = 1;
        goto L_0x0087;
    L_0x0067:
        r0 = "archive_reel_share_button";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x006f:
        r0 = 0;
        goto L_0x0087;
    L_0x0071:
        r0 = "ig_question_answer_response_reshare";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0079:
        r0 = 7;
        goto L_0x0087;
    L_0x007b:
        r0 = "reel_highlights_viewer_options_reshare";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0083:
        r0 = 9;
        goto L_0x0087;
    L_0x0086:
        r0 = -1;
    L_0x0087:
        switch(r0) {
            case 0: goto L_0x00c3;
            case 1: goto L_0x00c0;
            case 2: goto L_0x00bd;
            case 3: goto L_0x00ba;
            case 4: goto L_0x00b7;
            case 5: goto L_0x00b7;
            case 6: goto L_0x00b4;
            case 7: goto L_0x00b1;
            case 8: goto L_0x00ae;
            case 9: goto L_0x00ab;
            case 10: goto L_0x00a8;
            case 11: goto L_0x00a5;
            default: goto L_0x008a;
        };
    L_0x008a:
        r3 = X.AnonymousClass3FO.f39467P;
        r2 = "unknown media import source";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unrecognized entry point for media import: ";
        r1.append(r0);
        r0 = r4.f7375O;
        r1.append(r0);
        r0 = r1.toString();
        X.AnonymousClass0Gn.m1881H(r2, r0);
        goto L_0x00c5;
    L_0x00a5:
        r3 = X.AnonymousClass3FO.f39461J;
        goto L_0x00c5;
    L_0x00a8:
        r3 = X.AnonymousClass3FO.f39459H;
        goto L_0x00c5;
    L_0x00ab:
        r3 = X.AnonymousClass3FO.f39462K;
        goto L_0x00c5;
    L_0x00ae:
        r3 = X.AnonymousClass3FO.f39460I;
        goto L_0x00c5;
    L_0x00b1:
        r3 = X.AnonymousClass3FO.f39464M;
        goto L_0x00c5;
    L_0x00b4:
        r3 = X.AnonymousClass3FO.f39465N;
        goto L_0x00c5;
    L_0x00b7:
        r3 = X.AnonymousClass3FO.f39468Q;
        goto L_0x00c5;
    L_0x00ba:
        r3 = X.AnonymousClass3FO.f39457F;
        goto L_0x00c5;
    L_0x00bd:
        r3 = X.AnonymousClass3FO.f39463L;
        goto L_0x00c5;
    L_0x00c0:
        r3 = X.AnonymousClass3FO.f39466O;
        goto L_0x00c5;
    L_0x00c3:
        r3 = X.AnonymousClass3FO.f39455D;
    L_0x00c5:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dF.g():X.3FO");
    }

    public final String getModuleName() {
        switch (((AnonymousClass3AN) this.f7371K.f52938h.f5584B).ordinal()) {
            case 0:
            case 1:
                return this.f7367G.getModuleName();
            case 2:
                return "reel_composer_preview";
            default:
                throw new IllegalStateException("unexpected CaptureState");
        }
    }

    public final void gi() {
        AnonymousClass0dF.m5978T(this, AnonymousClass3FN.f39450J);
        this.f7367G.gi();
        this.f7374N.gi();
        this.f7380T.gi();
        this.f7392f.gi();
        this.f7408v.gi();
        AnonymousClass4Mw anonymousClass4Mw = this.f7383W;
        if (anonymousClass4Mw != null) {
            AnonymousClass0OR.m3627G(anonymousClass4Mw.f53277K, anonymousClass4Mw.f53282P, -2119699912);
        }
        this.SB.gi();
        AnonymousClass4LZ anonymousClass4LZ = this.f7373M;
        if (anonymousClass4LZ != null) {
            anonymousClass4LZ.gi();
        }
        this.f7377Q.f7680Z = null;
        this.f7403q.f53887F = null;
        AnonymousClass3G4.D();
    }

    public final void gx() {
        this.bB.m11567B(this.f7375O);
        this.EB.gx();
        if (this.f7409w == 3) {
            this.f7402p.m4799C(new AnonymousClass3Dv());
            AnonymousClass3AN anonymousClass3AN = (AnonymousClass3AN) this.f7372L.f5584B;
            if (anonymousClass3AN == AnonymousClass3AN.f38553D) {
                this.f7367G.gx();
            } else if (anonymousClass3AN == AnonymousClass3AN.f38552C) {
                if ((this.f7370J.B() == AnonymousClass3FK.f39430D ? 1 : null) != null) {
                    this.f7392f.gx();
                } else if (this.f7402p.f5584B != AnonymousClass3AM.f38546U) {
                    this.f7408v.gx();
                }
            }
            this.f7380T.gx();
            this.f7374N.gx();
            this.f7369I.gx();
            AnonymousClass5Tg anonymousClass5Tg = this.f7387a;
            if (anonymousClass5Tg.f64585B == AnonymousClass4RJ.f54068D) {
                anonymousClass5Tg.f64587D.f64630F.A();
            }
            AnonymousClass4Mw anonymousClass4Mw = this.f7383W;
            this.SB.gx();
            AnonymousClass4LZ anonymousClass4LZ = this.f7373M;
            if (anonymousClass4LZ != null) {
                anonymousClass4LZ.gx();
            }
            if (this.f7409w != 1) {
                this.RB.m6816B(this.f7362B);
            }
        }
    }

    /* renamed from: h */
    private int m5992h() {
        if (this.f7375O.equals("story_share_intent")) {
            return 2;
        }
        if (this.f7375O.equals("reel_reshare_direct_tap")) {
            return 5;
        }
        if (this.KB) {
            return 4;
        }
        if (this.NB) {
            return 6;
        }
        return this.LB ? 7 : 0;
    }

    /* renamed from: i */
    private AnonymousClass4OK m5993i() {
        return this.f7370J.f54565G;
    }

    /* renamed from: j */
    private void m5994j(int i, Intent intent) {
        boolean z;
        boolean z2 = false;
        if (i != -1) {
            AnonymousClass0cO.m5772B().m5773A();
            if (m5993i() != null && AnonymousClass0dF.m5985a(this)) {
                AnonymousClass4OK i2 = m5993i();
                if (i == 1) {
                    z2 = true;
                }
                AnonymousClass0NN B = AnonymousClass0NN.m3291B("direct_story_creation_waterfall", AnonymousClass3FR.EC);
                i2.f53532D = z2 ? AnonymousClass3FN.f39445E : AnonymousClass3FN.f39450J;
                double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - i2.f53533E);
                Double.isNaN(elapsedRealtime);
                B.m3294B("exit_point", i2.f53532D.A()).m3298F("entry_point", i2.f53531C).m3293A("waterfall_duration", elapsedRealtime / 1000.0d);
                i2.f53530B.A(B);
                B.m3310R();
                this.f7370J.f54565G = null;
            }
        } else if (intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false)) {
            if (this.QB) {
                AnonymousClass1U5 anonymousClass1U5 = this.bB;
                String str = "button";
                WeakReference weakReference = AnonymousClass0cO.m5772B().f7120C;
                anonymousClass1U5.m11566A(str, anonymousClass1U5.f19024F != null, weakReference != null ? (ImageView) weakReference.get() : null);
            } else {
                AnonymousClass0cO.m5772B().m5773A();
            }
        }
        z2 = this.f7374N.P();
        if (intent == null) {
            z = z2;
        } else {
            z = intent.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", z2);
        }
        if (z != z2) {
            this.f7374N.f66865f.C(z);
        }
    }

    /* renamed from: k */
    private void m5995k() {
        Medium medium = this.aB;
        if (medium != null) {
            if (medium.f30927Q == 1) {
                m6015O(this.aB, null);
            } else {
                m6021U(this.aB, false);
            }
            this.aB = null;
        }
    }

    /* renamed from: l */
    private void m5996l(int i) {
        if (this.f7372L.f5584B != AnonymousClass3AN.f38552C && !this.PB) {
            Object obj = (this.MB && this.fB) ? 1 : null;
            if (i == 2 && obj != null) {
                this.f7367G.m6260U();
            } else if (i == 3) {
                this.f7367G.m6260U();
                this.MB = true;
            }
        }
    }

    /* renamed from: m */
    private static void m5997m(AnonymousClass0dF anonymousClass0dF) {
        if (anonymousClass0dF.m6001A() == AnonymousClass3DU.f39300Y) {
            Intent intent = new Intent();
            Object spannableStringBuilder = new SpannableStringBuilder(anonymousClass0dF.f7404r.f53671E.getText());
            AnonymousClass2Jl.B(spannableStringBuilder);
            intent.putExtra("text_mode_message_text", spannableStringBuilder.toString());
            anonymousClass0dF.f7362B.setResult(0, intent);
        }
    }

    /* renamed from: n */
    private static void m5998n(AnonymousClass0dF anonymousClass0dF) {
        int i;
        String str;
        AnonymousClass0dF anonymousClass0dF2 = anonymousClass0dF;
        switch (anonymousClass0dF2.f7370J.B().ordinal()) {
            case 0:
                AnonymousClass0GA anonymousClass0n3;
                AnonymousClass5TB anonymousClass5TB = anonymousClass0dF2.f7392f;
                AnonymousClass5TB.D(anonymousClass5TB).D();
                Bitmap A = anonymousClass5TB.f64339E.A();
                AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(anonymousClass5TB.f64336B);
                anonymousClass0Ur.m4776A(anonymousClass5TB.f64336B.getString(C0164R.string.processing));
                anonymousClass0Ur.show();
                AnonymousClass3nl C = anonymousClass5TB.f64337C.C();
                if ((anonymousClass5TB.f64341G.C().isEmpty() ^ 1) == 0) {
                    if (anonymousClass5TB.f64350P == null) {
                        anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4UB(anonymousClass5TB.f64336B.getApplicationContext(), anonymousClass5TB.f64356V, C, A, anonymousClass5TB.f64342H, AnonymousClass5TB.E(anonymousClass5TB), new AnonymousClass5TA(anonymousClass5TB, anonymousClass0Ur, C)));
                        AnonymousClass0Ix.m2384D(anonymousClass0n3);
                        i = anonymousClass0dF2.f7392f.f64338D;
                        break;
                    }
                }
                Context context = anonymousClass5TB.f64336B;
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass5TB.f64356V;
                anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass4L4(anonymousClass5TB.f64350P == null ? anonymousClass5TB.A(A) : null, context, C, anonymousClass5TB.f64341G.C().keySet(), anonymousClass5TB.f64350P, anonymousClass5TB, anonymousClass5TB.f64338D, anonymousClass5TB.f64343I.f64187O, A, anonymousClass0Cm, anonymousClass5TB.f64341G.f66867h.G()));
                anonymousClass0n3.f9990B = new AnonymousClass4NQ(anonymousClass5TB, anonymousClass0Ur);
                AnonymousClass0Ix.m2384D(anonymousClass0n3);
                i = anonymousClass0dF2.f7392f.f64338D;
            case 1:
                AnonymousClass5TY anonymousClass5TY = anonymousClass0dF2.f7408v;
                AnonymousClass5TY.D(anonymousClass5TY).D();
                AnonymousClass0Ur anonymousClass0Ur2 = new AnonymousClass0Ur(anonymousClass5TY.f64464B);
                AnonymousClass0GA anonymousClass0n32 = new AnonymousClass0n3(AnonymousClass4On.B(anonymousClass5TY.f64464B.getApplicationContext(), anonymousClass5TY.f64484V, anonymousClass5TY.f64474L, anonymousClass5TY.f64467E.A(), anonymousClass5TY.f64470H.f66867h.G()));
                anonymousClass0n32.f9990B = new AnonymousClass4Pt(anonymousClass5TY, anonymousClass0Ur2);
                AnonymousClass0Ix.m2384D(anonymousClass0n32);
                i = anonymousClass0dF2.f7408v.f64466D;
                break;
            default:
                throw new UnsupportedOperationException("Unknown media type");
        }
        AnonymousClass36h F = anonymousClass0dF2.f7368H.F();
        if (F == null) {
            str = null;
        } else {
            str = F.f37882L;
        }
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0dF2.f7407u;
        AnonymousClass3FK B = anonymousClass0dF2.f7370J.B();
        AnonymousClass3DU anonymousClass3DU = anonymousClass0dF2.f7369I.f52869C;
        int i2 = B == AnonymousClass3FK.f39430D ? 1 : B == AnonymousClass3FK.f39433G ? 2 : 3;
        AnonymousClass281.B(anonymousClass0Cm2).ta(i2, AnonymousClass4KL.D(anonymousClass3DU), AnonymousClass4KL.E(str, i));
    }

    /* renamed from: o */
    private boolean m5999o() {
        AnonymousClass0CC.NI.m843E(this.f7407u);
        if (!this.f7400n) {
            return false;
        }
        AnonymousClass0dF.m6000p(this, AnonymousClass0Um.ALL);
        return true;
    }

    /* renamed from: p */
    private static void m6000p(AnonymousClass0dF anonymousClass0dF, AnonymousClass0Um anonymousClass0Um) {
        View view;
        View view2;
        Bitmap A = anonymousClass0dF.f7370J.B() == AnonymousClass3FK.f39430D ? anonymousClass0dF.f7392f.A(anonymousClass0dF.DB.A()) : anonymousClass0dF.f7370J.B() == AnonymousClass3FK.f39433G ? anonymousClass0dF.f7408v.A(anonymousClass0dF.DB.A()) : null;
        List B = anonymousClass0dF.m6002B();
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0dF.f7407u;
        AnonymousClass0IL anonymousClass0IL = anonymousClass0dF.f7390d;
        boolean A2 = anonymousClass0dF.f7374N.A();
        boolean P = anonymousClass0dF.f7374N.P();
        ArrayList C = AnonymousClass4OJ.C(B, anonymousClass0dF.f7369I, anonymousClass0dF.f7377Q);
        AnonymousClass3Im A3 = AnonymousClass0J7.f2895B.mo533O().m2492A(anonymousClass0Cm);
        A3.f39972B.putSerializable("DirectPrivateStoryRecipientController.USER_STORY_TARGET", anonymousClass0Um);
        A3.f39972B.putBoolean("DirectPrivateStoryRecipientFragment.CAN_SHOW_EXTERNAL_SHARE_OPTIONS", true);
        A3.f39972B.putBoolean("DirectPrivateStoryRecipientFragment.CAN_SHOW_FB_STORY_OPTION", A2);
        A3.f39972B.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", P);
        A3.f39972B.putBoolean("DirectPrivateStoryRecipientFragment.DISABLE_FAST_SCROLL", true);
        if (!(B == null || B.isEmpty())) {
            A3.C(B);
        }
        if (C != null) {
            A3.f39972B.putParcelableArrayList("bundle_share_media_logging_info", C);
        }
        AnonymousClass0IL A4 = A3.A();
        A4.setTargetFragment(anonymousClass0IL, 13365);
        Context context = anonymousClass0IL.getContext();
        if (A == null) {
            view = null;
        } else {
            view = new ImageView(context);
            view.setImageBitmap(A);
        }
        AnonymousClass0bz B2 = AnonymousClass0bz.m5663B(context);
        if (view != null) {
            view2 = B2.f6940D;
            if (view2 != null) {
                B2.f6943G.removeView(view2);
            }
            B2.f6940D = view;
            B2.f6943G.addView(B2.f6940D);
        }
        B2.m5666A(new AnonymousClass4OG(AnonymousClass281.B(anonymousClass0Cm))).m5669D(anonymousClass0IL.getFragmentManager(), A4);
        if (A != null) {
            AnonymousClass3ih anonymousClass3ih = (AnonymousClass3ih) A4;
            view2 = anonymousClass3ih.oS();
            if (view2 != null) {
                AnonymousClass0Nm.m3442U(view2, new AnonymousClass4OI(anonymousClass3ih, view2, view, context));
            }
        }
        anonymousClass0dF.f7402p.m4799C(new AnonymousClass3Ea());
        anonymousClass0dF.f7370J.G();
    }

    public final void qy(boolean z, boolean z2, float f, float f2, float f3, float f4) {
        switch (((AnonymousClass3AN) this.f7372L.f5584B).ordinal()) {
            case 1:
                if (z2) {
                    this.f7381U.C(f2);
                    return;
                } else if (z && this.f7381U.G() && this.f7369I.f52876J.isEnabled() && this.f7369I.A(f3, f4)) {
                    this.f7369I.f52876J.B(f);
                    return;
                } else {
                    return;
                }
            case 2:
                if (z) {
                    if (this.f7374N.J()) {
                        AnonymousClass5bK anonymousClass5bK = this.f7374N;
                        if (anonymousClass5bK.f66854U) {
                            AnonymousClass4LP anonymousClass4LP = anonymousClass5bK.f66842I;
                            if (!(anonymousClass4LP == null || anonymousClass4LP.f53018E.f54644O == null)) {
                                anonymousClass4LP.f53018E.f54644O.B(f);
                            }
                        }
                        return;
                    } else if (this.f7370J.B() == AnonymousClass3FK.f39430D) {
                        z = this.f7392f;
                        if (z.f64355U) {
                            AnonymousClass5TB.D(z).f39489O = true;
                            z.f64354T.m11375B(f);
                        } else {
                            r2 = z.f64348N.getParent();
                            if (r2 != null) {
                                z.f64357W = 0.0f;
                                z.f64355U = true;
                                r2.requestDisallowInterceptTouchEvent(true);
                                z.f64354T.m11375B(0.0f);
                            }
                        }
                        return;
                    } else {
                        z = this.f7408v;
                        if (z.f64482T) {
                            AnonymousClass5TY.D(z).f39489O = true;
                            z.f64481S.m11375B(f);
                        } else {
                            r2 = z.f64487Y.getParent();
                            if (r2 != null) {
                                z.f64485W = 0.0f;
                                z.f64482T = true;
                                r2.requestDisallowInterceptTouchEvent(true);
                                z.f64481S.m11375B(0.0f);
                            }
                        }
                        return;
                    }
                } else if (z2) {
                    AnonymousClass5bK anonymousClass5bK2 = this.f7374N;
                    AnonymousClass5cl anonymousClass5cl = anonymousClass5bK2.f66835B;
                    if (anonymousClass5cl == null || anonymousClass5cl == anonymousClass5bK2.f66867h) {
                        AnonymousClass5cl anonymousClass5cl2 = anonymousClass5bK2.f66867h;
                        if (anonymousClass5cl2.f67423V == AnonymousClass4Pk.f53785C || anonymousClass5cl2.f67423V == AnonymousClass4Pk.f53798P) {
                            AnonymousClass5Se anonymousClass5Se = anonymousClass5cl2.f67404C;
                            if (!anonymousClass5Se.B() && f2 > 0.0f) {
                                anonymousClass5Se.f64081m.m4799C(new AnonymousClass3Dl());
                            }
                            if (anonymousClass5Se.B()) {
                                AnonymousClass5Se.F(anonymousClass5Se, f2);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final void ve() {
        AnonymousClass0QP anonymousClass0QP = this.f7381U;
        anonymousClass0QP.f53255C.m5756A(anonymousClass0QP);
        this.f7380T.ve();
        AnonymousClass0JI.getInstance().requestLocationUpdates(this.f7371K.f52922R, "CaptureStateCoordinator");
    }

    public final void xDA() {
        this.JB = this.f7381U.f53254B;
    }

    public final void xc(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        AnonymousClass0dF anonymousClass0dF = this;
        int i3 = i;
        int i4 = i2;
        if (i3 != 4920) {
            anonymousClass0dF.f7402p.m4799C(new AnonymousClass3EE(i3, i4, intent2));
        } else if (i4 == -1) {
            anonymousClass0dF.f7402p.m4799C(new AnonymousClass3EG(i3, i4, intent2));
        } else {
            anonymousClass0dF.f7402p.m4799C(new AnonymousClass3Dm());
        }
        AnonymousClass5bK anonymousClass5bK;
        String stringExtra;
        switch (i) {
            case 2:
                anonymousClass5bK = anonymousClass0dF.f7374N;
                if (i4 != -1) {
                    intent2 = null;
                }
                AnonymousClass5cl anonymousClass5cl = anonymousClass5bK.f66867h;
                Drawable drawable = null;
                Venue venue = intent2 != null ? (Venue) intent2.getParcelableExtra("venueId") : null;
                if (venue != null && anonymousClass5cl.f67423V == AnonymousClass4Pk.f53798P) {
                    Drawable anonymousClass2VC;
                    List B;
                    Resources resources;
                    int dimensionPixelSize;
                    int dimensionPixelSize2;
                    AnonymousClass27e anonymousClass27e;
                    AnonymousClass27e anonymousClass27e2;
                    AnonymousClass27e anonymousClass27e3;
                    List asList;
                    AnonymousClass2Lb anonymousClass2Lb;
                    anonymousClass5cl.f67436i.m4799C(new AnonymousClass3E0());
                    for (Drawable anonymousClass2VC2 : anonymousClass5cl.f67415N.F(AnonymousClass2VC.class)) {
                        if (anonymousClass2VC2.C(AnonymousClass27e.class)) {
                            B = anonymousClass2VC2.B(AnonymousClass27e.class);
                            drawable = anonymousClass2VC2;
                            if (drawable == null) {
                                for (AnonymousClass27e A : r0) {
                                    A.A(venue);
                                }
                                AnonymousClass5cl.B(anonymousClass5cl, drawable);
                                return;
                            }
                            resources = anonymousClass5cl.f67411J.getResources();
                            dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_text_size);
                            dimensionPixelSize2 = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding);
                            anonymousClass27e = new AnonymousClass27e(resources, AnonymousClass0Nm.m3431J(anonymousClass5cl.f67411J), dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.f26304I);
                            anonymousClass27e2 = new AnonymousClass27e(resources, AnonymousClass0Nm.m3431J(anonymousClass5cl.f67411J), dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.f26303H);
                            anonymousClass27e3 = new AnonymousClass27e(resources, AnonymousClass0Nm.m3431J(anonymousClass5cl.f67411J), dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.f26302G);
                            anonymousClass27e.A(venue);
                            anonymousClass27e2.A(venue);
                            anonymousClass27e3.A(venue);
                            asList = Arrays.asList(new String[]{"location_sticker_vibrant", "location_sticker_subtle", "location_sticker_rainbow"});
                            anonymousClass2VC2 = new AnonymousClass2VC(anonymousClass5cl.f67411J, new Drawable[]{anonymousClass27e, anonymousClass27e2, anonymousClass27e3});
                            anonymousClass2Lb = new AnonymousClass2Lb();
                            anonymousClass2Lb.f29352B = true;
                            anonymousClass2Lb.f29354D = 2.5f;
                            anonymousClass2Lb.f29364N = "TextOverlayController";
                            anonymousClass5cl.R(asList, anonymousClass2VC2, anonymousClass2Lb.A());
                            return;
                        }
                    }
                    B = null;
                    if (drawable == null) {
                        resources = anonymousClass5cl.f67411J.getResources();
                        dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_text_size);
                        dimensionPixelSize2 = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding);
                        anonymousClass27e = new AnonymousClass27e(resources, AnonymousClass0Nm.m3431J(anonymousClass5cl.f67411J), dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.f26304I);
                        anonymousClass27e2 = new AnonymousClass27e(resources, AnonymousClass0Nm.m3431J(anonymousClass5cl.f67411J), dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.f26303H);
                        anonymousClass27e3 = new AnonymousClass27e(resources, AnonymousClass0Nm.m3431J(anonymousClass5cl.f67411J), dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.f26302G);
                        anonymousClass27e.A(venue);
                        anonymousClass27e2.A(venue);
                        anonymousClass27e3.A(venue);
                        asList = Arrays.asList(new String[]{"location_sticker_vibrant", "location_sticker_subtle", "location_sticker_rainbow"});
                        anonymousClass2VC2 = new AnonymousClass2VC(anonymousClass5cl.f67411J, new Drawable[]{anonymousClass27e, anonymousClass27e2, anonymousClass27e3});
                        anonymousClass2Lb = new AnonymousClass2Lb();
                        anonymousClass2Lb.f29352B = true;
                        anonymousClass2Lb.f29354D = 2.5f;
                        anonymousClass2Lb.f29364N = "TextOverlayController";
                        anonymousClass5cl.R(asList, anonymousClass2VC2, anonymousClass2Lb.A());
                        return;
                    }
                    while (r3.hasNext()) {
                        A.A(venue);
                    }
                    AnonymousClass5cl.B(anonymousClass5cl, drawable);
                    return;
                }
                return;
            case 3:
                anonymousClass5bK = anonymousClass0dF.f7374N;
                if (i4 != -1) {
                    intent2 = null;
                }
                anonymousClass5bK.f66867h.O(intent2);
                return;
            case 4217:
                if (intent != null) {
                    BrandedContentTag brandedContentTag = (BrandedContentTag) intent2.getExtras().getParcelable("BRANDED_CONTENT_TAG");
                    stringExtra = intent2.getStringExtra("WEBLINK_URL");
                    String stringExtra2 = intent2.getStringExtra("IGTV_LINK_MEDIA_ID");
                    AnonymousClass4KL.N(anonymousClass0dF.f7407u, anonymousClass0dF.f7374N.D(), brandedContentTag);
                    anonymousClass0dF.f7374N.f66859Z.B(brandedContentTag, stringExtra, stringExtra2);
                    return;
                }
                return;
            case 4919:
            case 4920:
                m6014N(0.0f);
                m5994j(i4, intent2);
                return;
            case 5150:
                AnonymousClass4Mw anonymousClass4Mw = anonymousClass0dF.f7383W;
                if (anonymousClass4Mw != null) {
                    if (i4 == -1) {
                        Object obj = (intent == null || !intent2.hasExtra("IgLive.broadcast_id")) ? null : 1;
                        if (!(obj == null && ((Boolean) AnonymousClass0CC.NR.m846H(anonymousClass4Mw.f53288V)).booleanValue())) {
                            anonymousClass4Mw.f53273G.Gc("none");
                        }
                        if (obj != null) {
                            String stringExtra3 = intent2.getStringExtra("IgLive.broadcast_id");
                            RectF A2 = anonymousClass4Mw.f53274H.A();
                            double width = (double) A2.width();
                            Double.isNaN(width);
                            RectF rectF = new RectF(0.0f, 0.0f, (float) ((int) (width / 3.5d)), A2.height() / 2.0f);
                            AnonymousClass3F6 anonymousClass3F6 = anonymousClass4Mw.f53274H;
                            String B2 = AnonymousClass0Pm.m3895B(stringExtra3);
                            if (anonymousClass3F6.f39396D.getParent() == null) {
                                anonymousClass3F6.f39394B.addView(anonymousClass3F6.f39396D);
                            }
                            anonymousClass3F6.f39398F.set(anonymousClass3F6.A());
                            anonymousClass3F6.f39399G.set(rectF);
                            anonymousClass3F6.f39395C = AnonymousClass0rm.m7977F(B2, (int) anonymousClass3F6.f39398F.width(), (int) anonymousClass3F6.f39398F.height());
                            anonymousClass3F6.f39394B.bringChildToFront(anonymousClass3F6.f39396D);
                            anonymousClass3F6.f39396D.setVisibility(0);
                            anonymousClass3F6.f39396D.setTranslationX(0.0f);
                            anonymousClass3F6.f39396D.setTranslationY(0.0f);
                            anonymousClass3F6.f39396D.setScaleX(1.0f);
                            anonymousClass3F6.f39396D.setScaleY(1.0f);
                            anonymousClass3F6.f39396D.setImageBitmap(anonymousClass3F6.f39395C);
                            anonymousClass3F6.f39396D.postDelayed(new AnonymousClass3F5(anonymousClass3F6), 0);
                        }
                    } else {
                        if (intent != null && intent2.hasExtra("IgLive.error_message")) {
                            stringExtra = intent2.getStringExtra("IgLive.error_message");
                            AnonymousClass0cq anonymousClass0cq = new AnonymousClass0cq();
                            anonymousClass0cq.f7255B = AnonymousClass0Ca.m937C(anonymousClass4Mw.f53284R.getContext(), C0164R.color.red_5);
                            anonymousClass0cq.f7260G = stringExtra;
                            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0cs(anonymousClass0cq.m5927A()));
                        }
                        AnonymousClass0Iz.f2854L.m2405H(anonymousClass4Mw.f53287U);
                    }
                    return;
                }
                return;
            case 13364:
                m5994j(i4, intent2);
                return;
            default:
                return;
        }
    }
}

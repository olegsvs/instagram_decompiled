package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.4Kx */
public final class AnonymousClass4Kx implements AnonymousClass0QP, AnonymousClass0dG, AnonymousClass3BK, AnonymousClass0eD, AnonymousClass3F4, AnonymousClass0dJ, AnonymousClass0Uy {
    /* renamed from: h */
    private static final AnonymousClass0e5 f52867h = AnonymousClass0e5.C(80.0d, 10.0d);
    /* renamed from: B */
    public final Context f52868B;
    /* renamed from: C */
    public AnonymousClass3DU f52869C = AnonymousClass3DU.NORMAL;
    /* renamed from: D */
    public boolean f52870D;
    /* renamed from: E */
    public final List f52871E = new ArrayList();
    /* renamed from: F */
    public AnonymousClass3DU f52872F;
    /* renamed from: G */
    public final ImageView f52873G;
    /* renamed from: H */
    public AnonymousClass3DU f52874H;
    /* renamed from: I */
    public final ImageView f52875I;
    /* renamed from: J */
    public ReboundHorizontalScrollView f52876J;
    /* renamed from: K */
    public final AnonymousClass0cN f52877K;
    /* renamed from: L */
    public boolean f52878L;
    /* renamed from: M */
    public boolean f52879M;
    /* renamed from: N */
    private final AnonymousClass3DU[] f52880N = AnonymousClass1SS.f18783B;
    /* renamed from: O */
    private AnonymousClass0eK f52881O;
    /* renamed from: P */
    private AnonymousClass3DU f52882P;
    /* renamed from: Q */
    private String f52883Q;
    /* renamed from: R */
    private AnonymousClass4M6 f52884R;
    /* renamed from: S */
    private View f52885S;
    /* renamed from: T */
    private final View f52886T;
    /* renamed from: U */
    private float f52887U;
    /* renamed from: V */
    private final int f52888V;
    /* renamed from: W */
    private boolean f52889W;
    /* renamed from: X */
    private boolean f52890X;
    /* renamed from: Y */
    private boolean f52891Y;
    /* renamed from: Z */
    private final AnonymousClass0dH f52892Z;
    /* renamed from: a */
    private final View f52893a;
    /* renamed from: b */
    private final boolean f52894b;
    /* renamed from: c */
    private boolean f52895c = false;
    /* renamed from: d */
    private final AnonymousClass0Uw f52896d;
    /* renamed from: e */
    private String f52897e;
    /* renamed from: f */
    private boolean f52898f;
    /* renamed from: g */
    private AnonymousClass0Cm f52899g;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean Jn(boolean z, boolean z2, float f, float f2, float f3, float f4, float f5) {
        return false;
    }

    public final void St() {
    }

    public final void Ym(boolean z, boolean z2, float f, float f2) {
    }

    public final void eGA() {
    }

    public final void ln() {
    }

    public final void qy(boolean z, boolean z2, float f, float f2, float f3, float f4) {
    }

    public final void ty(ReboundHorizontalScrollView reboundHorizontalScrollView, AnonymousClass3BM anonymousClass3BM, AnonymousClass3BM anonymousClass3BM2) {
    }

    public final void wCA(View view, int i) {
    }

    public final void xDA() {
    }

    public AnonymousClass4Kx(AnonymousClass0Uw anonymousClass0Uw, Context context, View view, ViewGroup viewGroup, AnonymousClass0dH anonymousClass0dH, boolean z, AnonymousClass3DU anonymousClass3DU, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0eK anonymousClass0eK, AnonymousClass38H anonymousClass38H) {
        this.f52896d = anonymousClass0Uw;
        anonymousClass0Uw.A(this);
        this.f52868B = context;
        this.f52893a = view;
        this.f52886T = viewGroup;
        this.f52875I = (ImageView) this.f52893a.findViewById(C0164R.id.prior_mode_icon);
        this.f52873G = (ImageView) this.f52893a.findViewById(C0164R.id.next_mode_icon);
        this.f52892Z = anonymousClass0dH;
        this.f52894b = z;
        this.f52872F = anonymousClass3DU;
        this.f52899g = anonymousClass0Cm;
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f52877K = C.O(AnonymousClass4L1.f52905p).A(this);
        this.f52888V = context.getResources().getDimensionPixelSize(C0164R.dimen.quick_capture_format_picker_swipe_region_edge_exclusion);
        m23915E();
        m23920G(false);
        int D = AnonymousClass0G5.D(this.f52868B, C0164R.attr.quickCaptureFormatPickerIconTintColor);
        if (D != 0) {
            ColorFilter B = AnonymousClass0ca.B(D);
            this.f52875I.setColorFilter(B);
            this.f52873G.setColorFilter(B);
        }
        this.f52884R = new AnonymousClass4M6(this.f52868B, this.f52899g, anonymousClass38H);
        if (this.f52895c) {
            AnonymousClass4M6 anonymousClass4M6 = this.f52884R;
            anonymousClass4M6.f53158E.schedule(new AnonymousClass4M4(anonymousClass4M6));
        }
        this.f52881O = anonymousClass0eK;
    }

    /* renamed from: A */
    public final boolean m23916A(float f, float f2) {
        if (this.f52887U == 0.0f) {
            this.f52887U = AnonymousClass0Nm.L(this.f52886T).top;
        }
        float f3 = this.f52887U;
        Object obj = (f3 == 0.0f || f2 < f3) ? null : 1;
        Object obj2 = (f <= ((float) this.f52888V) || f >= ((float) (this.f52893a.getWidth() - this.f52888V))) ? null : 1;
        if (obj == null || obj2 == null) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final int m23917B(String str) {
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass3DU anonymousClass3DU;
            if (AnonymousClass0LQ.B(str, this.f52897e)) {
                anonymousClass3DU = AnonymousClass3DU.SUPERZOOM;
            } else if (AnonymousClass0LQ.B(str, this.f52883Q)) {
                anonymousClass3DU = AnonymousClass3DU.FOCUS;
            }
            int length = this.f52880N.length;
            int i = Process.WAIT_RESULT_TIMEOUT;
            int i2 = Process.WAIT_RESULT_TIMEOUT;
            for (int i3 = 0; i3 < length; i3++) {
                if (this.f52880N[i3] == anonymousClass3DU) {
                    i2 = i3;
                }
                if (this.f52880N[i3] == AnonymousClass3DU.NORMAL) {
                    i = i3;
                }
            }
            if (i != Process.WAIT_RESULT_TIMEOUT) {
                if (i2 != Process.WAIT_RESULT_TIMEOUT) {
                    return i2 - i;
                }
            }
        }
        return Process.WAIT_RESULT_TIMEOUT;
    }

    /* renamed from: B */
    public static void m23912B(AnonymousClass4Kx anonymousClass4Kx, AnonymousClass3DU anonymousClass3DU) {
        if (!anonymousClass4Kx.f52898f) {
            if (anonymousClass4Kx.m23913C(anonymousClass3DU)) {
                int indexOf = anonymousClass4Kx.f52871E.indexOf(anonymousClass3DU);
                int childCount = anonymousClass4Kx.f52876J.getChildCount();
                if (indexOf > -1 && indexOf < childCount) {
                    anonymousClass4Kx.f52869C = anonymousClass3DU;
                    if (anonymousClass4Kx.f52870D && anonymousClass4Kx.f52876J.getVisibility() == 0) {
                        for (int i = 0; i < childCount; i++) {
                            anonymousClass4Kx.f52876J.getChildAt(i).setAlpha(0.4f);
                        }
                        ReboundHorizontalScrollView reboundHorizontalScrollView = anonymousClass4Kx.f52876J;
                        reboundHorizontalScrollView.f38753I.L((double) ReboundHorizontalScrollView.m18882C(reboundHorizontalScrollView, indexOf));
                        anonymousClass4Kx.f52876J.getChildAt(indexOf).setAlpha(1.0f);
                        anonymousClass4Kx.f52892Z.Lf(anonymousClass3DU);
                    }
                }
            }
        }
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        this.f52898f = true;
    }

    public final void BEA(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        this.f52882P = null;
    }

    /* renamed from: C */
    public final void m23918C() {
        this.f52879M = false;
        this.f52878L = false;
        if (this.f52896d.f5584B != AnonymousClass3AM.SELECT_FACE_EFFECT) {
            this.f52877K.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
        m23926M();
    }

    /* renamed from: C */
    private boolean m23913C(AnonymousClass3DU anonymousClass3DU) {
        switch (AnonymousClass1Tx.f19007C[anonymousClass3DU.ordinal()]) {
            case 6:
                if (!this.f52890X) {
                    this.f52874H = AnonymousClass3DU.SUPERZOOM;
                    AnonymousClass4Kx.m23912B(this, AnonymousClass3DU.NORMAL);
                    this.f52881O.D();
                }
                return this.f52890X;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (!this.f52889W) {
                    this.f52874H = AnonymousClass3DU.FOCUS;
                    AnonymousClass4Kx.m23912B(this, AnonymousClass3DU.NORMAL);
                    this.f52881O.D();
                }
                return this.f52889W;
            case 8:
                if (!this.f52891Y) {
                    this.f52874H = AnonymousClass3DU.SUPERZOOMV3;
                    AnonymousClass4Kx.m23912B(this, AnonymousClass3DU.NORMAL);
                    this.f52881O.D();
                }
                return this.f52891Y;
            default:
                return true;
        }
    }

    /* renamed from: D */
    private void m23914D() {
        if (!this.f52870D) {
            this.f52870D = true;
            View findViewById = this.f52893a.findViewById(C0164R.id.format_picker);
            this.f52885S = findViewById;
            this.f52876J = (ReboundHorizontalScrollView) findViewById.findViewById(C0164R.id.format_picker_pager);
            if (!AnonymousClass0G5.B(this.f52868B, C0164R.attr.quickCaptureFormatPickerIndicatorVisible, true)) {
                this.f52885S.findViewById(C0164R.id.format_picker_indicator).setVisibility(8);
            }
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        this.f52898f = false;
    }

    public final void Dn(float f, float f2) {
        if (this.f52870D) {
            this.f52885S.setVisibility(f < 1.0f ? 0 : 4);
        }
    }

    /* renamed from: E */
    private void m23915E() {
        this.f52871E.clear();
        int i = 0;
        while (true) {
            AnonymousClass3DU[] anonymousClass3DUArr = this.f52880N;
            boolean z = true;
            if (i < anonymousClass3DUArr.length) {
                boolean booleanValue;
                AnonymousClass3DU anonymousClass3DU = anonymousClass3DUArr[i];
                switch (AnonymousClass1Tx.f19007C[anonymousClass3DU.ordinal()]) {
                    case 1:
                        booleanValue = ((Boolean) AnonymousClass0CC.kf.H(this.f52899g)).booleanValue();
                        break;
                    case 2:
                        booleanValue = this.f52894b;
                        break;
                    case 3:
                    case 4:
                    case 10:
                        booleanValue = true;
                        break;
                    case 5:
                        if (VERSION.SDK_INT < 18) {
                            z = false;
                            break;
                        }
                        break;
                    case 6:
                        booleanValue = this.f52890X;
                        break;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        booleanValue = this.f52889W;
                        if (!booleanValue || !((Boolean) AnonymousClass0CC.sX.H(this.f52899g)).booleanValue()) {
                            z = false;
                        }
                        this.f52895c = z;
                        break;
                    case 8:
                        booleanValue = this.f52891Y;
                        break;
                    case 9:
                        booleanValue = ((Boolean) AnonymousClass0CC.oZ.H(this.f52899g)).booleanValue();
                        break;
                    case 11:
                        if (!AnonymousClass38I.m18716B(this.f52868B) || !((Boolean) AnonymousClass0CC.Cc.H(this.f52899g)).booleanValue()) {
                            z = false;
                        }
                        anonymousClass3DU.f39307G = this.f52868B.getString(C0164R.string.reverse_nux_text);
                        break;
                    default:
                        booleanValue = false;
                        break;
                }
                booleanValue = z;
                if (booleanValue) {
                    this.f52871E.add(anonymousClass3DU);
                }
                i++;
            } else if (this.f52871E.size() != 1) {
                m23914D();
                this.f52876J.removeAllViews();
                for (AnonymousClass3DU anonymousClass3DU2 : this.f52871E) {
                    TextView textView = (TextView) LayoutInflater.from(this.f52868B).inflate(C0164R.layout.capture_format_label, this.f52876J, false);
                    if (anonymousClass3DU2.f39304D != null) {
                        textView.setText(anonymousClass3DU2.f39304D);
                    } else {
                        textView.setText(this.f52868B.getResources().getString(anonymousClass3DU2.f39305E));
                    }
                    textView.setTag(anonymousClass3DU2);
                    textView.setContentDescription(textView.getText());
                    if (anonymousClass3DU2 == AnonymousClass3DU.FOCUS && this.f52895c) {
                        ViewGroup viewGroup = this.f52876J;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.capture_format_label_shimmer_container, viewGroup, false);
                        shimmerFrameLayout.addView(textView);
                        shimmerFrameLayout.setIntensity(0.8f);
                        shimmerFrameLayout.setRepeatCount(-1);
                        shimmerFrameLayout.setRepeatMode(1);
                        this.f52876J.addView(shimmerFrameLayout);
                        AnonymousClass4M6 anonymousClass4M6 = this.f52884R;
                        anonymousClass4M6.f53157D = shimmerFrameLayout;
                        anonymousClass4M6.f53158E.schedule(new AnonymousClass4M3(anonymousClass4M6));
                    } else {
                        this.f52876J.addView(textView);
                    }
                }
                this.f52885S.setVisibility(0);
                this.f52873G.setVisibility(0);
                this.f52875I.setVisibility(0);
                this.f52876J.addOnLayoutChangeListener(new AnonymousClass4Kw(this));
                this.f52876J.m18891A(this);
                return;
            } else {
                if (this.f52870D) {
                    this.f52885S.setVisibility(8);
                    this.f52873G.setVisibility(8);
                    this.f52875I.setVisibility(8);
                }
                AnonymousClass4Kx.m23912B(this, AnonymousClass3DU.NORMAL);
                return;
            }
        }
    }

    /* renamed from: F */
    public final void m23919F() {
        this.f52879M = false;
        this.f52878L = false;
        this.f52877K.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        m23926M();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f52870D) {
            this.f52885S.setAlpha(1.0f - ((float) this.f52877K.E()));
        }
    }

    /* renamed from: G */
    public final void m23920G(boolean z) {
        this.f52875I.setVisibility(0);
        this.f52873G.setVisibility(0);
        float E = (float) this.f52877K.E();
        if (!this.f52879M) {
            E = 0.0f;
        }
        if (z) {
            this.f52877K.N((double) E);
        } else {
            this.f52877K.L((double) E);
        }
    }

    /* renamed from: H */
    public final void m23921H(boolean z) {
        this.f52876J.setEnabled(z);
    }

    /* renamed from: I */
    public final void m23922I(boolean z, AnonymousClass36h anonymousClass36h) {
        if (this.f52889W != z) {
            this.f52889W = z;
            if (z && anonymousClass36h != null) {
                AnonymousClass3DU anonymousClass3DU = AnonymousClass3DU.FOCUS;
                anonymousClass3DU.f39304D = anonymousClass36h.f37877G;
                anonymousClass3DU.f39307G = anonymousClass36h.f37878H;
                this.f52883Q = anonymousClass36h.f37882L;
            }
            m23915E();
        }
    }

    /* renamed from: J */
    public final void m23923J(boolean z, AnonymousClass36h anonymousClass36h) {
        if (this.f52890X != z) {
            this.f52890X = z;
            if (z) {
                if (anonymousClass36h == null) {
                    AnonymousClass0Gn.C("ig_camera", "Superzoom is available but effect is null");
                } else {
                    AnonymousClass3DU anonymousClass3DU = AnonymousClass3DU.SUPERZOOM;
                    anonymousClass3DU.f39304D = anonymousClass36h.f37877G;
                    anonymousClass3DU.f39307G = anonymousClass36h.f37878H;
                    this.f52897e = anonymousClass36h.f37882L;
                }
            }
            m23915E();
            if (this.f52890X) {
                AnonymousClass3DU anonymousClass3DU2 = this.f52874H;
                if (anonymousClass3DU2 != null) {
                    AnonymousClass4Kx.m23912B(this, anonymousClass3DU2);
                    this.f52874H = null;
                }
            }
        }
    }

    /* renamed from: K */
    public final void m23924K(boolean z, List list) {
        if (this.f52891Y != z) {
            this.f52891Y = z;
            AnonymousClass36h anonymousClass36h = !list.isEmpty() ? (AnonymousClass36h) list.get(0) : null;
            if (this.f52891Y && anonymousClass36h != null) {
                AnonymousClass3DU anonymousClass3DU = AnonymousClass3DU.SUPERZOOMV3;
                anonymousClass3DU.f39304D = anonymousClass36h.f37877G;
                anonymousClass3DU.f39307G = anonymousClass36h.f37878H;
            }
            m23915E();
        }
    }

    public final void Ko(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        int seekingIndex = reboundHorizontalScrollView.getSeekingIndex();
        if (seekingIndex == -1 || seekingIndex == i || reboundHorizontalScrollView.getScrollState() != AnonymousClass3BM.SETTLING) {
            AnonymousClass3DU anonymousClass3DU = this.f52869C;
            AnonymousClass3DU anonymousClass3DU2 = (AnonymousClass3DU) this.f52871E.get(i);
            this.f52869C = anonymousClass3DU2;
            if (anonymousClass3DU != anonymousClass3DU2) {
                this.f52892Z.Kf(anonymousClass3DU2, anonymousClass3DU);
                if (this.f52869C == AnonymousClass3DU.FOCUS && this.f52895c) {
                    this.f52884R.m23979A();
                }
            }
        }
    }

    /* renamed from: L */
    public final void m23925L(AnonymousClass3DU anonymousClass3DU, float f) {
        int indexOf = this.f52871E.indexOf(anonymousClass3DU);
        if (indexOf >= 0) {
            if (AnonymousClass0mE.I(this.f52876J)) {
                this.f52876J.m18893C(indexOf, f);
            } else {
                this.f52872F = anonymousClass3DU;
            }
        }
    }

    /* renamed from: M */
    public final void m23926M() {
        Drawable B = this.f52869C.m19072B(this.f52868B);
        Drawable A = this.f52869C.m19071A(this.f52868B);
        if (this.f52879M && this.f52878L && B != null) {
            this.f52875I.setImageDrawable(B);
            this.f52873G.setImageDrawable(B);
            return;
        }
        this.f52875I.setImageDrawable(A);
        this.f52873G.setImageDrawable(A);
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj2;
        if (AnonymousClass1Tx.f19006B[((AnonymousClass3AM) obj).ordinal()] == 1) {
            this.f52877K.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            this.f52876J.setEnabled(true);
        }
        if (AnonymousClass1Tx.f19006B[anonymousClass3AM.ordinal()] == 1) {
            this.f52877K.N(1.0d);
            this.f52876J.setEnabled(false);
        }
    }

    public final void Xm(ReboundHorizontalScrollView reboundHorizontalScrollView, int i) {
        this.f52882P = (AnonymousClass3DU) this.f52871E.get(i);
    }

    public final void gi() {
        this.f52877K.I();
    }

    public final void gx() {
        this.f52879M = false;
    }

    public final void it(float f, int i) {
        if (f == 0.0f) {
            m23921H(true);
        }
    }

    public final void oy(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
        float f2 = f;
        int i3 = i;
        int i4 = i2;
        AnonymousClass4Mr.m24023C(reboundHorizontalScrollView, f, i, i2);
        AnonymousClass3DU anonymousClass3DU = (AnonymousClass3DU) this.f52871E.get(i);
        AnonymousClass3DU anonymousClass3DU2 = (AnonymousClass3DU) this.f52871E.get(i2);
        if (!this.f52879M) {
            this.f52875I.setImageDrawable(anonymousClass3DU.m19071A(this.f52868B));
            this.f52873G.setImageDrawable(anonymousClass3DU2.m19071A(this.f52868B));
        }
        AnonymousClass4Mr.m24022B(this.f52875I, this.f52873G, f, i, i2);
        this.f52892Z.Mf(f2, i3, i4, anonymousClass3DU, anonymousClass3DU2);
        int indexOf = this.f52871E.indexOf(AnonymousClass3DU.LIVE) + 1;
        if (this.f52871E.indexOf(this.f52882P) > indexOf && anonymousClass3DU == AnonymousClass3DU.LIVE && !this.f52898f) {
            reboundHorizontalScrollView.setSpringConfig(f52867h);
            reboundHorizontalScrollView.m18893C(indexOf, reboundHorizontalScrollView.getVelocity());
        }
    }
}

package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.base.ui.sliderview.RulerView;
import com.instagram.creation.video.ui.FilmstripScrollView;

/* renamed from: X.3zs */
public final class AnonymousClass3zs extends AnonymousClass3IH implements AnonymousClass3Hl, AnonymousClass3Ib, AnonymousClass3Hm {
    /* renamed from: B */
    public AnonymousClass1Km f48080B;
    /* renamed from: C */
    public int f48081C;
    /* renamed from: D */
    public final Runnable f48082D = new AnonymousClass3IN(this);
    /* renamed from: E */
    public LinearLayout f48083E;
    /* renamed from: F */
    public FilmstripScrollView f48084F;
    /* renamed from: G */
    public double[] f48085G;
    /* renamed from: H */
    public int f48086H;
    /* renamed from: I */
    public float f48087I;
    /* renamed from: J */
    public View f48088J;
    /* renamed from: K */
    public Animation f48089K;
    /* renamed from: L */
    public ConstrainedTextureView f48090L;
    /* renamed from: M */
    public int f48091M;
    /* renamed from: N */
    public int f48092N;
    /* renamed from: O */
    public View f48093O;
    /* renamed from: P */
    public View f48094P;
    /* renamed from: Q */
    public boolean f48095Q;
    /* renamed from: R */
    public int f48096R;
    /* renamed from: S */
    public AnonymousClass0Cm f48097S;
    /* renamed from: T */
    public AnonymousClass3zu f48098T;
    /* renamed from: U */
    public AnonymousClass3zz f48099U;
    /* renamed from: V */
    private CreationSession f48100V;
    /* renamed from: W */
    private View f48101W;
    /* renamed from: X */
    private View f48102X;
    /* renamed from: Y */
    private View f48103Y;
    /* renamed from: Z */
    private double f48104Z;
    /* renamed from: a */
    private double f48105a;
    /* renamed from: b */
    private long f48106b;
    /* renamed from: c */
    private int f48107c;
    /* renamed from: d */
    private AnonymousClass0OA f48108d;
    /* renamed from: e */
    private Animation f48109e;
    /* renamed from: f */
    private int f48110f;
    /* renamed from: g */
    private RulerView f48111g;
    /* renamed from: h */
    private ProgressBar f48112h;
    /* renamed from: i */
    private int f48113i;

    public final String getModuleName() {
        return "video_trim";
    }

    public final void lFA(int i) {
    }

    /* renamed from: B */
    public static double m21932B(AnonymousClass3zs anonymousClass3zs) {
        double childCount = (double) anonymousClass3zs.f48083E.getChildCount();
        double d = anonymousClass3zs.f48105a;
        Double.isNaN(childCount);
        return childCount * d;
    }

    /* renamed from: C */
    public static double m21933C(Context context, AnonymousClass1Km anonymousClass1Km) {
        double M = (double) (((float) AnonymousClass3zs.m21943M(anonymousClass1Km)) / AnonymousClass3zs.m21942L(anonymousClass1Km));
        double J = (double) (AnonymousClass0Nm.J(context) - (context.getResources().getDimensionPixelOffset(C0164R.dimen.trim_handle_edge_padding) * 2));
        Double.isNaN(J);
        Double.isNaN(M);
        return J / M;
    }

    /* renamed from: D */
    public static double m21934D(AnonymousClass3zs anonymousClass3zs) {
        return Math.max(Math.min(anonymousClass3zs.m21945O((anonymousClass3zs.f48084F.getScrollX() + anonymousClass3zs.f48092N) - anonymousClass3zs.f48081C), (double) anonymousClass3zs.f48080B.f17216M), 3000.0d);
    }

    /* renamed from: E */
    public static double m21935E(AnonymousClass3zs anonymousClass3zs) {
        return Math.min(Math.max(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, anonymousClass3zs.m21945O((anonymousClass3zs.f48084F.getScrollX() + anonymousClass3zs.f48096R) - anonymousClass3zs.f48081C)), (double) (anonymousClass3zs.f48080B.f17216M - 3000));
    }

    /* renamed from: F */
    public static double m21936F(AnonymousClass3zs anonymousClass3zs, int i) {
        int i2 = anonymousClass3zs.f48107c * JsonMappingException.MAX_REFS_TO_LIST;
        double d = (double) i;
        Double.isNaN(d);
        d *= 1.0d;
        double d2 = (double) i2;
        Double.isNaN(d2);
        d /= d2;
        d2 = (double) anonymousClass3zs.f48086H;
        Double.isNaN(d2);
        return d * d2;
    }

    /* renamed from: G */
    public static void m21937G(AnonymousClass3zs anonymousClass3zs) {
        anonymousClass3zs.f48088J.setVisibility(0);
        anonymousClass3zs.f48088J.clearAnimation();
        anonymousClass3zs.f48088J.startAnimation(anonymousClass3zs.f48109e);
    }

    /* renamed from: H */
    public static void m21938H(AnonymousClass3zs anonymousClass3zs, AnonymousClass3IS anonymousClass3IS) {
        anonymousClass3zs.f48098T.m21955A();
        int childCount = anonymousClass3zs.f48083E.getChildCount();
        double width = (double) anonymousClass3zs.f48084F.getWidth();
        double d = anonymousClass3zs.f48105a;
        Double.isNaN(width);
        int i = ((int) (width / d)) + 1;
        width = (double) anonymousClass3zs.f48084F.getScrollX();
        d = anonymousClass3zs.f48105a;
        Double.isNaN(width);
        int i2 = (int) (width / d);
        int i3 = childCount - 1;
        int min = Math.min(i3, (i2 + i) - 1);
        childCount = Math.max(0, i2 - i);
        int max = Math.max(0, i2 - 1);
        int min2 = Math.min(min + 1, i3);
        int min3 = Math.min(i + min, i3);
        anonymousClass3zs.m21941K(i2, min);
        if (anonymousClass3IS == AnonymousClass3IS.RIGHT) {
            anonymousClass3zs.m21941K(min2, min3);
            anonymousClass3zs.m21941K(max, childCount);
            return;
        }
        anonymousClass3zs.m21941K(max, childCount);
        anonymousClass3zs.m21941K(min2, min3);
    }

    /* renamed from: I */
    public static void m21939I(AnonymousClass3zs anonymousClass3zs, int i) {
        anonymousClass3zs.f48092N = i;
        anonymousClass3zs.f48112h.setProgress(anonymousClass3zs.f48092N - anonymousClass3zs.f48096R);
        ((MarginLayoutParams) anonymousClass3zs.f48094P.getLayoutParams()).leftMargin = anonymousClass3zs.f48092N - (anonymousClass3zs.f48094P.getBackground().getIntrinsicWidth() / 2);
        anonymousClass3zs.f48094P.requestLayout();
        anonymousClass3zs.f48102X.getLayoutParams().width = anonymousClass3zs.f48084F.getWidth() - anonymousClass3zs.f48092N;
        anonymousClass3zs.f48102X.requestLayout();
        anonymousClass3zs.f48084F.invalidate();
    }

    /* renamed from: J */
    public static void m21940J(AnonymousClass3zs anonymousClass3zs, int i) {
        anonymousClass3zs.f48096R = i;
        anonymousClass3zs.m21946P((anonymousClass3zs.f48084F.getScrollX() + anonymousClass3zs.f48096R) - anonymousClass3zs.f48081C);
        anonymousClass3zs.f48112h.setMax(anonymousClass3zs.f48113i - anonymousClass3zs.f48096R);
        anonymousClass3zs.f48112h.setProgress(anonymousClass3zs.f48092N - anonymousClass3zs.f48096R);
        ((MarginLayoutParams) anonymousClass3zs.f48112h.getLayoutParams()).leftMargin = anonymousClass3zs.f48096R;
        ((MarginLayoutParams) anonymousClass3zs.f48093O.getLayoutParams()).leftMargin = anonymousClass3zs.f48096R - (anonymousClass3zs.f48093O.getBackground().getIntrinsicWidth() / 2);
        anonymousClass3zs.f48093O.requestLayout();
        anonymousClass3zs.f48101W.getLayoutParams().width = anonymousClass3zs.f48096R;
        anonymousClass3zs.f48101W.requestLayout();
        anonymousClass3zs.f48084F.invalidate();
    }

    /* renamed from: K */
    private void m21941K(int i, int i2) {
        this.f48098T.m21956B(new AnonymousClass3Ia(i, i2, this.f48105a, this.f48104Z, this.f48083E.hashCode()));
    }

    public final void KGA() {
        AnonymousClass3zs.m21937G(this);
        m21947Q(this.f48080B.f17220Q);
    }

    /* renamed from: L */
    private static float m21942L(AnonymousClass1Km anonymousClass1Km) {
        return ((float) anonymousClass1Km.f17216M) / (((float) AnonymousClass3zs.m21944N(anonymousClass1Km)) * 1000.0f);
    }

    /* renamed from: M */
    private static int m21943M(AnonymousClass1Km anonymousClass1Km) {
        double d = (double) anonymousClass1Km.f17216M;
        Double.isNaN(d);
        return Math.max(Math.min((int) Math.ceil(d / 1000.0d), ((Integer) AnonymousClass0CC.Ck.G()).intValue()), 15);
    }

    public final void MGA() {
        this.f48088J.clearAnimation();
        this.f48088J.startAnimation(this.f48089K);
    }

    /* renamed from: N */
    private static int m21944N(AnonymousClass1Km anonymousClass1Km) {
        return Math.round((((float) anonymousClass1Km.f17216M) / (((float) AnonymousClass3zs.m21943M(anonymousClass1Km)) * 1000.0f)) * 8.0f);
    }

    /* renamed from: O */
    private double m21945O(int i) {
        int i2 = this.f48107c * JsonMappingException.MAX_REFS_TO_LIST;
        double d = (double) i;
        Double.isNaN(d);
        d *= 1.0d;
        double d2 = (double) this.f48086H;
        Double.isNaN(d2);
        d /= d2;
        d2 = (double) i2;
        Double.isNaN(d2);
        return d * d2;
    }

    /* renamed from: P */
    private void m21946P(int i) {
        ((LayoutParams) this.f48088J.getLayoutParams()).leftMargin = (i - this.f48088J.getPaddingLeft()) + this.f48110f;
        this.f48088J.requestLayout();
    }

    /* renamed from: Q */
    private int m21947Q(int i) {
        if (i < this.f48080B.f17220Q) {
            i = this.f48080B.f17220Q;
        }
        double B = AnonymousClass3zs.m21932B(this);
        double d = (double) (this.f48110f * 2);
        Double.isNaN(d);
        B -= d;
        d = (double) i;
        Double.isNaN(d);
        B *= d;
        d = (double) this.f48106b;
        Double.isNaN(d);
        m21946P((int) (B / d));
        return i;
    }

    /* renamed from: b */
    public final void mo4873b() {
        AnonymousClass3zz anonymousClass3zz = this.f48099U;
        if (anonymousClass3zz != null) {
            anonymousClass3zz.m21968A();
        }
    }

    /* renamed from: d */
    public final void mo4874d() {
        AnonymousClass3zz anonymousClass3zz = this.f48099U;
        if (anonymousClass3zz != null) {
            anonymousClass3zz.m21976I();
        }
    }

    /* renamed from: e */
    public final void mo4875e() {
        AnonymousClass3zz anonymousClass3zz = this.f48099U;
        if (anonymousClass3zz != null) {
            anonymousClass3zz.m21977J();
        }
    }

    /* renamed from: f */
    public final void mo4876f() {
        this.f48098T = this.f39916D;
        this.f48098T.f48120G = this;
        this.f48083E.post(this.f48082D);
    }

    public final void hCA(double[] dArr) {
        if (getView() != null) {
            if (this.f48083E.getChildCount() == 0) {
                double d;
                float f = this.f48087I;
                int i = this.f48091M;
                double[] dArr2 = new double[i];
                float f2 = f / 2.0f;
                int i2 = 0;
                int i3 = 0;
                while (i2 < dArr.length - 1) {
                    Object obj;
                    int i4 = i2 + 1;
                    d = (double) f2;
                    if (dArr[i2] > d) {
                        dArr2[i3] = dArr[i2];
                    } else if (dArr[i2] > d || d > dArr[i4]) {
                        obj = null;
                        if (obj != null) {
                            f2 += f;
                            i3++;
                            if (i3 >= i) {
                                break;
                            }
                        }
                        i2 = i4;
                    } else {
                        double d2 = dArr[i2];
                        Double.isNaN(d);
                        double abs = Math.abs(d2 - d);
                        d2 = dArr[i4];
                        Double.isNaN(d);
                        dArr2[i3] = abs < Math.abs(d2 - d) ? dArr[i2] : dArr[i4];
                    }
                    obj = 1;
                    if (obj != null) {
                        f2 += f;
                        i3++;
                        if (i3 >= i) {
                            break;
                        }
                    }
                    i2 = i4;
                }
                while (i3 < i) {
                    dArr2[i3] = dArr[dArr.length - 1];
                    i3++;
                }
                for (int i5 = 0; i5 < dArr2.length; i5++) {
                    dArr2[i5] = dArr2[i5] * 1000.0d;
                }
                this.f48085G = dArr2;
                this.f48085G = dArr2;
                this.f48098T.m21958D(this.f48085G);
                for (double d3 : this.f48085G) {
                    Double.valueOf(d3);
                    View imageView = new ImageView(getContext());
                    imageView.setBackgroundResource(C0164R.drawable.trim_frame_bg);
                    imageView.setLayoutParams(new LinearLayout.LayoutParams((int) this.f48105a, (int) this.f48104Z));
                    imageView.setPadding(0, 0, 0, 0);
                    this.f48083E.addView(imageView);
                }
                AnonymousClass3zs.m21938H(this, AnonymousClass3IS.RIGHT);
                i3 = ((int) AnonymousClass3zs.m21932B(this)) + (this.f48081C * 2);
                int i6 = this.f48113i;
                if (i3 < i6) {
                    AnonymousClass0Nm.d(this.f48083E, i6 - i3);
                }
                double d4 = (double) this.f48080B.f17221R;
                double F = AnonymousClass3zs.m21936F(this, this.f48080B.f17220Q);
                Double.isNaN(d4);
                F -= d4;
                d3 = (double) this.f48081C;
                Double.isNaN(d3);
                F += d3;
                AnonymousClass3zs.m21939I(this, (int) Math.min(AnonymousClass3zs.m21936F(this, this.f48080B.getDuration()) + F, AnonymousClass3zs.m21932B(this) + F));
                AnonymousClass3zs.m21940J(this, (int) F);
                this.f48094P.setVisibility(0);
                this.f48093O.setVisibility(0);
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0164R.anim.import_filmstrip_slide_in_right);
                loadAnimation.setAnimationListener(new AnonymousClass3IQ(this, d4));
                this.f48103Y.startAnimation(loadAnimation);
            }
        } else if (isResumed()) {
            AnonymousClass0IG.F(C0164R.string.unknown_error_occured);
            getActivity().onBackPressed();
        }
    }

    public final void kG(Bitmap bitmap, int i, int i2) {
        if (this.f48083E.hashCode() == i2) {
            ((ImageView) this.f48083E.getChildAt(i)).setImageBitmap(bitmap);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 986663679);
        super.onCreate(bundle);
        AnonymousClass0PI anonymousClass0PI = (AnonymousClass0PI) getContext();
        this.f48100V = anonymousClass0PI.VK();
        this.f48097S = anonymousClass0PI.rT();
        getActivity().getWindow().addFlags(DexStore.LOAD_RESULT_MIXED_MODE);
        this.f48109e = AnimationUtils.loadAnimation(getContext(), C0164R.anim.import_play_fade_in);
        this.f48089K = AnimationUtils.loadAnimation(getContext(), C0164R.anim.import_play_fade_out);
        this.f48110f = getResources().getDimensionPixelSize(C0164R.dimen.trim_play_indicator_min_padding);
        AnonymousClass0cQ.G(this, 579643463, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1342957617);
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        super.onCreateView(layoutInflater2, viewGroup2, bundle);
        AnonymousClass0OA c = m19292c();
        this.f48108d = c;
        AnonymousClass1Km anonymousClass1Km = c.bC;
        this.f48080B = anonymousClass1Km;
        this.f48106b = anonymousClass1Km.f17216M;
        this.f48107c = AnonymousClass3zs.m21943M(this.f48080B);
        this.f48091M = AnonymousClass3zs.m21944N(this.f48080B);
        this.f48087I = AnonymousClass3zs.m21942L(this.f48080B);
        boolean D = AnonymousClass27D.m14491D(getContext());
        View inflate = layoutInflater2.inflate(D ? C0164R.layout.fragment_video_trim : C0164R.layout.fragment_video_trim_small, viewGroup2, false);
        this.f39915C = (FrameLayout) this.f39914B.findViewById(C0164R.id.creation_image_container);
        AnonymousClass3zy A = new AnonymousClass3zy().m21967A(this.f39915C.findViewById(C0164R.id.play_button));
        A.f48149G = this.f39915C.findViewById(C0164R.id.seek_frame_indicator);
        this.f48090L = this.f39917E.m19301A(getContext());
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f48090L.setAspectRatio(this.f48100V.m18966C());
        this.f39915C.addView(this.f48090L, 0, layoutParams);
        this.f48099U = new AnonymousClass3zz(getContext(), A, false, true, AnonymousClass0Ce.G(getArguments()));
        this.f39917E.f39952B = this.f48099U;
        this.f48090L.setSurfaceTextureListener(this.f39917E);
        this.f48090L.setOnClickListener(this.f48099U);
        this.f48099U.m21984Q(this.f48108d);
        this.f48099U.m21979L(this.f48108d.AD, this.f48108d.zC);
        this.f48099U.m21983P(this);
        this.f48099U.m21985R(this);
        this.f48083E = (LinearLayout) inflate.findViewById(C0164R.id.filmstrip_keyframes_holder);
        int i = this.f48107c <= 30 ? 5 : 10;
        AnonymousClass3zq anonymousClass3zq = new AnonymousClass3zq(this, i);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RulerView rulerView = (RulerView) inflate.findViewById(C0164R.id.time_ruler_view);
        this.f48111g = rulerView;
        rulerView.setPaddingTopRatio(0.5f);
        this.f48111g.setPaddingBottomRatio(0.0f);
        this.f48111g.setSmallLineRatio(0.5f);
        this.f48111g.setSmallToLargeLineFrequency(i);
        this.f48111g.setLineLabeler(anonymousClass3zq);
        this.f48081C = getResources().getDimensionPixelOffset(C0164R.dimen.trim_handle_edge_padding);
        this.f48111g.setLeftRightMarginPx(this.f48081C);
        int i2 = (displayMetrics.widthPixels - (this.f48081C * 2)) / this.f48107c;
        this.f48111g.setIncrementWidthPx(i2);
        FilmstripScrollView filmstripScrollView = (FilmstripScrollView) inflate.findViewById(C0164R.id.filmstrip_scrollview);
        this.f48084F = filmstripScrollView;
        filmstripScrollView.f39950B = new AnonymousClass3zr(this);
        this.f48102X = inflate.findViewById(C0164R.id.filmstrip_dimmer_right);
        this.f48101W = inflate.findViewById(C0164R.id.filmstrip_dimmer_left);
        this.f48094P = inflate.findViewById(C0164R.id.trim_handle_right);
        this.f48093O = inflate.findViewById(C0164R.id.trim_handle_left);
        this.f48088J = inflate.findViewById(C0164R.id.filmstrip_play_indicator);
        this.f48103Y = inflate.findViewById(C0164R.id.filmstrip_scrollview_container);
        this.f48086H = i2 * this.f48107c;
        this.f48113i = AnonymousClass0Nm.J(getContext());
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0164R.id.trim_length_bar);
        this.f48112h = progressBar;
        progressBar.setMax(this.f48086H);
        if (!D) {
            this.f48103Y.getLayoutParams().height = (int) AnonymousClass0Nm.E(getResources().getDisplayMetrics(), 66);
        }
        OnTouchListener anonymousClass3IO = new AnonymousClass3IO(this, new GestureDetector(getContext(), new AnonymousClass3IT(this)), new GestureDetector(getContext(), new AnonymousClass3IU(this)));
        this.f48094P.setOnTouchListener(anonymousClass3IO);
        this.f48102X.setOnTouchListener(anonymousClass3IO);
        this.f48093O.setOnTouchListener(anonymousClass3IO);
        this.f48101W.setOnTouchListener(anonymousClass3IO);
        this.f48090L.setOnTouchListener(new AnonymousClass3IP(this, new GestureDetector(getContext(), new AnonymousClass3IR(this))));
        AnonymousClass0cQ.G(this, 388403864, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -223253481);
        super.onDestroyView();
        AnonymousClass3zu anonymousClass3zu = this.f48098T;
        if (anonymousClass3zu != null) {
            anonymousClass3zu.f48120G = null;
            this.f48098T.m21958D(null);
            this.f48098T = null;
        }
        this.f48084F.f39950B = null;
        this.f39915C.removeView(this.f48090L);
        this.f39915C = null;
        this.f48090L = null;
        this.f48099U = null;
        this.f48083E.removeCallbacks(this.f48082D);
        this.f48083E = null;
        this.f48084F = null;
        this.f48103Y = null;
        this.f48102X = null;
        this.f48101W = null;
        this.f48088J = null;
        this.f48094P = null;
        this.f48093O = null;
        this.f48112h = null;
        AnonymousClass0cQ.G(this, -863457531, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 2095778849);
        AnonymousClass3zu anonymousClass3zu = this.f48098T;
        if (anonymousClass3zu != null) {
            anonymousClass3zu.m21955A();
        }
        this.f48099U.m21973F();
        this.f48099U.m21989V();
        super.onPause();
        AnonymousClass0cQ.G(this, 1633896488, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1722916628);
        super.onResume();
        this.f39917E.f39952B = this.f48099U;
        this.f48099U.m21989V();
        this.f48099U.m21975H();
        if (AnonymousClass3zs.m21932B(this) > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED && this.f48098T != null) {
            AnonymousClass3zs.m21938H(this, AnonymousClass3IS.RIGHT);
        }
        AnonymousClass0cQ.G(this, 1771801817, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass27D.m14490C(this.f39914B);
        this.f39915C.findViewById(C0164R.id.seek_frame_indicator).setVisibility(8);
        this.f48105a = AnonymousClass3zs.m21933C(getContext(), this.f48080B);
        this.f48104Z = (double) getResources().getDimensionPixelSize(C0164R.dimen.trim_preview_height_dp);
        AnonymousClass3zu anonymousClass3zu = this.f39916D;
        this.f48098T = anonymousClass3zu;
        if (anonymousClass3zu != null) {
            this.f48098T.f48120G = this;
            this.f48083E.post(this.f48082D);
        }
    }

    public final void wFA(int i) {
        m21947Q(i);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.base.ui.sliderview.RulerView;
import com.instagram.creation.base.ui.sliderview.SliderView;
import com.instagram.creation.photo.edit.luxfilter.LocalLaplacianFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filter.IgFilter;
import com.instagram.filterkit.filter.IgFilterGroup;

/* renamed from: X.3zL */
public final class AnonymousClass3zL implements AnonymousClass3Cu, AnonymousClass3Cg {
    /* renamed from: B */
    public View f47927B;
    /* renamed from: C */
    public SliderView f47928C;
    /* renamed from: D */
    public boolean f47929D;
    /* renamed from: E */
    public AnonymousClass0e5 f47930E;
    /* renamed from: F */
    public AnonymousClass3Cm f47931F;
    /* renamed from: G */
    public AnonymousClass3Cm f47932G;
    /* renamed from: H */
    public AnonymousClass3Cm f47933H;
    /* renamed from: I */
    public SurfaceCropFilter f47934I;
    /* renamed from: J */
    public View f47935J;
    /* renamed from: K */
    public AnonymousClass0cN f47936K;
    /* renamed from: L */
    public AnonymousClass0cN f47937L;
    /* renamed from: M */
    public AnonymousClass0e5 f47938M;
    /* renamed from: N */
    public AnonymousClass3Ct f47939N;
    /* renamed from: O */
    public ImageView f47940O;
    /* renamed from: P */
    public AnonymousClass3HF f47941P;
    /* renamed from: Q */
    public AnonymousClass0cN f47942Q;
    /* renamed from: R */
    public AnonymousClass0e6 f47943R;
    /* renamed from: S */
    public final AnonymousClass3HI f47944S = new AnonymousClass3HI();
    /* renamed from: T */
    public final AnonymousClass3HJ f47945T = new AnonymousClass3HJ();
    /* renamed from: U */
    public final AnonymousClass3HI f47946U = new AnonymousClass3HI();
    /* renamed from: V */
    public AnonymousClass0Cm f47947V;
    /* renamed from: W */
    private final String f47948W;
    /* renamed from: X */
    private boolean f47949X;
    /* renamed from: Y */
    private boolean f47950Y;
    /* renamed from: Z */
    private boolean f47951Z;
    /* renamed from: a */
    private final AnonymousClass3Gc f47952a;
    /* renamed from: b */
    private boolean f47953b;
    /* renamed from: c */
    private AnonymousClass3DE f47954c = AnonymousClass3DE.THREE;
    /* renamed from: d */
    private View f47955d;
    /* renamed from: e */
    private IgFilterGroup f47956e;
    /* renamed from: f */
    private GridLinesView f47957f;
    /* renamed from: g */
    private GridLinesView f47958g;
    /* renamed from: h */
    private boolean f47959h;
    /* renamed from: i */
    private boolean f47960i;
    /* renamed from: j */
    private final AnonymousClass3Gh f47961j;
    /* renamed from: k */
    private boolean f47962k;
    /* renamed from: l */
    private boolean f47963l;
    /* renamed from: m */
    private float f47964m;
    /* renamed from: n */
    private boolean f47965n;
    /* renamed from: o */
    private AnonymousClass3Cf f47966o;
    /* renamed from: p */
    private final AnonymousClass3HJ f47967p = new AnonymousClass3HJ();

    public final void wDA(boolean z) {
    }

    public AnonymousClass3zL(AnonymousClass0Cm anonymousClass0Cm, Resources resources, float f, boolean z, AnonymousClass3Gc anonymousClass3Gc, AnonymousClass3Gh anonymousClass3Gh) {
        this.f47947V = anonymousClass0Cm;
        this.f47948W = resources.getString(C0164R.string.adjust);
        this.f47964m = f;
        this.f47960i = z;
        this.f47952a = anonymousClass3Gc;
        this.f47961j = anonymousClass3Gh;
        this.f47943R = AnonymousClass0e6.B();
        this.f47930E = AnonymousClass0e5.C(30.0d, 9.0d);
        this.f47938M = AnonymousClass0e5.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.5d);
        AnonymousClass0cN C = this.f47943R.C();
        this.f47942Q = C;
        C.O(this.f47930E);
        AnonymousClass0cN C2 = this.f47943R.C();
        C2.f7105C = 0.001d;
        C2.f7110H = 0.001d;
        this.f47936K = C2;
        C2 = this.f47943R.C();
        C2.f7105C = 0.001d;
        C2.f7110H = 0.001d;
        this.f47937L = C2;
    }

    /* renamed from: A */
    public final void m21879A(GridLinesView gridLinesView, int i, int i2) {
        float width;
        CreationSession VK = ((AnonymousClass0PI) gridLinesView.getContext()).VK();
        int i3 = VK.m18967D().f38981D;
        CropInfo cropInfo = VK.m18967D().f38980C;
        if (i3 % 180 == 0) {
            width = ((float) cropInfo.f38970B.width()) / ((float) cropInfo.f38970B.height());
        } else {
            width = ((float) cropInfo.f38970B.height()) / ((float) cropInfo.f38970B.width());
        }
        gridLinesView.setGridlinesRect(AnonymousClass2Mh.m15231C(i, i2, width));
        gridLinesView.setSizeChangedListener(null);
    }

    /* renamed from: B */
    public static float m21869B(AnonymousClass3zL anonymousClass3zL, AnonymousClass3HF anonymousClass3HF) {
        switch (anonymousClass3HF.ordinal()) {
            case 0:
                return anonymousClass3zL.f47945T.f39777F;
            case 1:
                return anonymousClass3zL.f47945T.f39778G;
            default:
                return anonymousClass3zL.f47945T.f39779H;
        }
    }

    /* renamed from: C */
    public static void m21870C(AnonymousClass3zL anonymousClass3zL, AnonymousClass3HF anonymousClass3HF) {
        anonymousClass3zL.f47941P = anonymousClass3HF;
        boolean z = true;
        anonymousClass3zL.f47933H.setSelected(anonymousClass3HF == AnonymousClass3HF.ROTATION_Z);
        anonymousClass3zL.f47931F.setSelected(anonymousClass3HF == AnonymousClass3HF.ROTATION_X);
        AnonymousClass3Cm anonymousClass3Cm = anonymousClass3zL.f47932G;
        if (anonymousClass3HF != AnonymousClass3HF.ROTATION_Y) {
            z = false;
        }
        anonymousClass3Cm.setSelected(z);
    }

    public final String CT() {
        return this.f47948W;
    }

    /* renamed from: D */
    public static AnonymousClass3Cm m21871D(AnonymousClass3zL anonymousClass3zL, ViewGroup viewGroup, int i, int i2, AnonymousClass3HF anonymousClass3HF) {
        PillDegreeLabelManager pillDegreeLabelManager = (PillDegreeLabelManager) viewGroup.findViewById(i);
        pillDegreeLabelManager.setOnClickListener(new AnonymousClass3HC(anonymousClass3zL, anonymousClass3HF));
        pillDegreeLabelManager.setDegreeLabelResource(i2);
        pillDegreeLabelManager.setDegree(AnonymousClass3zL.m21869B(anonymousClass3zL, anonymousClass3HF));
        pillDegreeLabelManager.vTA();
        return pillDegreeLabelManager;
    }

    /* renamed from: E */
    private static float m21872E(float f, float f2, float f3) {
        return f2 + AnonymousClass2Mp.m15246E((double) (f - f2), (double) (4.0f / f3));
    }

    /* renamed from: F */
    private void m21873F() {
        boolean F = this.f47934I.m23041F(this.f47944S);
        this.f47929D = F;
        if (F) {
            this.f47934I.m23043H(this.f47946U);
            AnonymousClass3HI anonymousClass3HI = this.f47944S;
            anonymousClass3HI.f39772D = (anonymousClass3HI.f39772D + this.f47946U.f39772D) / 2.0f;
            anonymousClass3HI.f39770B = AnonymousClass3zL.m21872E(this.f47946U.f39770B, this.f47944S.f39770B, this.f47944S.f39772D);
            anonymousClass3HI.f39771C = AnonymousClass3zL.m21872E(this.f47946U.f39771C, this.f47944S.f39771C, this.f47944S.f39772D);
            this.f47934I.m23048M(anonymousClass3HI);
        }
    }

    /* renamed from: G */
    private void m21874G() {
        this.f47956e.m22018G(2, false);
        this.f47956e.m22018G(10, false);
        this.f47956e.m22018G(9, false);
        this.f47956e.m22018G(12, false);
        this.f47956e.m22018G(13, false);
        this.f47956e.m22018G(15, false);
        this.f47956e.m22018G(17, false);
        this.f47956e.m22018G(18, false);
        this.f47956e.m22018G(19, false);
        this.f47956e.m22018G(20, false);
    }

    /* renamed from: H */
    private void m21875H() {
        this.f47956e.m22018G(2, this.f47963l);
        this.f47956e.m22018G(10, this.f47959h);
        this.f47956e.m22018G(9, this.f47962k);
        this.f47956e.m22018G(12, this.f47950Y);
        this.f47956e.m22018G(13, this.f47949X);
        this.f47956e.m22018G(15, this.f47953b);
        this.f47956e.m22018G(17, this.f47965n);
        this.f47956e.m22018G(18, this.f47965n);
        this.f47956e.m22018G(19, this.f47965n);
        this.f47956e.m22018G(20, this.f47951Z);
    }

    public final void Hd(boolean z) {
        boolean z2 = false;
        m21876I(false);
        if (z) {
            if (this.f47934I.m23041F(this.f47944S)) {
                this.f47934I.m23048M(this.f47944S);
            }
            try {
                this.f47934I.m23042G();
            } catch (Throwable e) {
                AnonymousClass0Gn.G("Adjust tool exception", e);
                this.f47934I.m23055T(this.f47967p);
            }
            this.f47952a.f39675F.set(true);
            if (!(((LocalLaplacianFilter) this.f47956e.m22013B(10)) == null || this.f47961j.m19218D())) {
                z2 = true;
            }
            if (z2) {
                this.f47961j.m19219E();
            }
        } else {
            this.f47934I.m23055T(this.f47967p);
        }
        m21875H();
        this.f47956e.invalidate();
        this.f47939N.vJA();
        z2 = this.f47934I.m23045J();
        View view = this.f47955d;
        if (view instanceof AnonymousClass3ym) {
            ((AnonymousClass3ym) view).setChecked(z2);
        } else {
            view.setSelected(z2);
        }
        this.f47958g.setVisibility(8);
        this.f47957f.setVisibility(8);
        this.f47958g.setSizeChangedListener(null);
        this.f47957f.setSizeChangedListener(null);
        this.f47958g = null;
        this.f47957f = null;
        this.f47940O.setVisibility(8);
        this.f47940O = null;
        AnonymousClass3Cm anonymousClass3Cm = this.f47931F;
        if (anonymousClass3Cm != null) {
            anonymousClass3Cm.dV();
            this.f47931F = null;
        }
        anonymousClass3Cm = this.f47932G;
        if (anonymousClass3Cm != null) {
            anonymousClass3Cm.dV();
            this.f47932G = null;
        }
        this.f47933H.dV();
        this.f47933H = null;
        this.f47966o.m19023A();
        this.f47943R.F();
        this.f47935J.setOnTouchListener(null);
        this.f47935J = null;
        this.f47955d = null;
        this.f47956e = null;
        this.f47934I = null;
        this.f47935J = null;
        this.f47939N = null;
        this.f47928C = null;
        this.f47966o = null;
    }

    public final void Hn(float f, float f2) {
        AnonymousClass3HI anonymousClass3HI = new AnonymousClass3HI();
        AnonymousClass3zL anonymousClass3zL = this;
        boolean F = this.f47934I.m23041F(anonymousClass3HI);
        float f3 = f;
        f = f2;
        if (F || ((double) Math.abs(f3)) >= 0.001d || ((double) Math.abs(f2)) >= 0.001d) {
            AnonymousClass3HI anonymousClass3HI2 = new AnonymousClass3HI();
            anonymousClass3zL.f47934I.m23043H(anonymousClass3HI2);
            if (!F) {
                anonymousClass3HI.f39772D = anonymousClass3HI2.f39772D;
                anonymousClass3HI.f39770B = anonymousClass3HI2.f39770B;
                anonymousClass3HI.f39771C = anonymousClass3HI2.f39771C;
            }
            AnonymousClass3HE anonymousClass3HE = new AnonymousClass3HE(anonymousClass3zL, anonymousClass3HI2, anonymousClass3HI, f3, f);
        }
        anonymousClass3zL.f47939N.vJA();
    }

    /* renamed from: I */
    private void m21876I(boolean z) {
        if (this.f47927B != null) {
            if (z) {
                AnonymousClass0HV.D(this.f47947V).f2646B.edit().putBoolean("show_adjust_crop_nux", true).apply();
            }
            Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new AnonymousClass3H9(this, this.f47927B));
            this.f47927B.startAnimation(alphaAnimation);
            this.f47927B = null;
        }
    }

    public final void Is(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f5 != 1.0f || f3 != 0.0f || f4 != 0.0f) {
            if (f5 != 1.0f) {
                m21876I(true);
            }
            if (this.f47929D) {
                this.f47934I.m23049N(this.f47946U, false);
            }
            f /= (float) this.f47935J.getWidth();
            f2 /= (float) this.f47935J.getHeight();
            SurfaceCropFilter surfaceCropFilter = this.f47934I;
            synchronized (surfaceCropFilter) {
                PointF B = SurfaceCropFilter.m23024B(surfaceCropFilter);
                f = (f - 0.5f) * 2.0f;
                float f7 = (-(f2 - 0.5f)) * 2.0f;
                float f8 = B.x + (f / surfaceCropFilter.f50077E.f39780I);
                float f9 = B.y + (f7 / surfaceCropFilter.f50077E.f39780I);
                AnonymousClass3HJ anonymousClass3HJ = surfaceCropFilter.f50077E;
                anonymousClass3HJ.f39780I *= f5;
                B.x = f8 - (f / surfaceCropFilter.f50077E.f39780I);
                B.y = f9 - (f7 / surfaceCropFilter.f50077E.f39780I);
                PointF C = SurfaceCropFilter.m23025C(surfaceCropFilter, B.x, B.y);
                SurfaceCropFilter.m23026D(surfaceCropFilter, C.x, C.y);
                SurfaceCropFilter.m23027E(surfaceCropFilter);
            }
            this.f47934I.m23046K(f3 / ((float) this.f47935J.getWidth()), f4 / ((float) this.f47935J.getHeight()));
            m21873F();
            this.f47939N.vJA();
        }
    }

    /* renamed from: J */
    private void m21877J(GridLinesView gridLinesView) {
        if (gridLinesView.getWidth() == 0 && gridLinesView.getHeight() == 0) {
            gridLinesView.setSizeChangedListener(this);
        } else {
            m21879A(gridLinesView, gridLinesView.getWidth(), gridLinesView.getHeight());
        }
    }

    /* renamed from: K */
    private void m21878K(AnonymousClass3DE anonymousClass3DE) {
        int i = 0;
        this.f47958g.setVisibility(anonymousClass3DE == AnonymousClass3DE.THREE ? 0 : 8);
        GridLinesView gridLinesView = this.f47957f;
        if (anonymousClass3DE != AnonymousClass3DE.SIX) {
            i = 8;
        }
        gridLinesView.setVisibility(i);
    }

    public final void Kn() {
        this.f47943R.F();
        this.f47929D = false;
    }

    public final View MI(Context context) {
        View view;
        RulerView rulerView;
        if (this.f47960i) {
            view = (LinearLayout) LayoutInflater.from(context).inflate(C0164R.layout.adjust_layout, null, false);
            rulerView = (RulerView) view.findViewById(C0164R.id.angle_ruler_view);
            rulerView.setPaddingTopRatio(0.3f);
            rulerView.setPaddingBottomRatio(0.3f);
            rulerView.setSmallToLargeLineFrequency(1);
            ImageView imageView = (ImageView) ((Activity) context).findViewById(C0164R.id.actionbar_rotate90_button);
            this.f47940O = imageView;
            imageView.setImageResource(C0164R.drawable.straighten_glyph_rotate);
            this.f47931F = AnonymousClass3zL.m21871D(this, view, C0164R.id.rotate_x_container, C0164R.drawable.perspectivey_icon, AnonymousClass3HF.ROTATION_X);
            this.f47933H = AnonymousClass3zL.m21871D(this, view, C0164R.id.rotate_z_container, C0164R.drawable.rotation_icon, AnonymousClass3HF.ROTATION_Z);
            this.f47932G = AnonymousClass3zL.m21871D(this, view, C0164R.id.rotate_y_container, C0164R.drawable.perspectivex_icon, AnonymousClass3HF.ROTATION_Y);
            AnonymousClass3zL.m21870C(this, AnonymousClass3HF.ROTATION_Z);
        } else {
            view = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.sliderview_whiteout_layout, null, false);
            rulerView = (RulerView) view.findViewById(C0164R.id.angle_ruler_view);
            rulerView.setPaddingTopRatio(0.3f);
            rulerView.setPaddingBottomRatio(0.3f);
            rulerView.setSmallToLargeLineFrequency(1);
            this.f47940O = (ImageView) this.f47935J.findViewById(C0164R.id.filter_preview_rotate90_button);
            AnonymousClass3Cm anonymousClass3yi = new AnonymousClass3yi((LinearLayout) this.f47935J.findViewById(C0164R.id.degree_label_container), true);
            this.f47933H = anonymousClass3yi;
            anonymousClass3yi.setOnClickListener(new AnonymousClass3HD(this));
            this.f47933H.vTA();
        }
        this.f47940O.setOnClickListener(new AnonymousClass3HA(this));
        this.f47940O.setVisibility(0);
        SliderView sliderView = (SliderView) view.findViewById(C0164R.id.photo_sliderview);
        this.f47928C = sliderView;
        sliderView.setOnSlideListener(new AnonymousClass3zK(this));
        this.f47941P = AnonymousClass3HF.ROTATION_Z;
        if (this.f47967p.f39779H != 0.0f) {
            this.f47928C.m19067B(this.f47967p.f39779H, false);
        } else {
            this.f47928C.m19067B(this.f47964m, true);
        }
        view.post(new AnonymousClass3HB(this, view));
        return view;
    }

    public final void SLA() {
        this.f47934I.m23055T(this.f47945T);
        m21874G();
    }

    public final void TLA() {
        this.f47934I.m23044I(this.f47945T);
        this.f47934I.m23055T(this.f47967p);
        m21875H();
    }

    public final boolean Tz(View view, ViewGroup viewGroup, IgFilter igFilter, AnonymousClass3Ct anonymousClass3Ct) {
        this.f47955d = view;
        this.f47956e = (IgFilterGroup) igFilter;
        this.f47934I = (SurfaceCropFilter) this.f47956e.m22013B(1);
        this.f47939N = anonymousClass3Ct;
        this.f47934I.m23044I(this.f47945T);
        this.f47967p.m19234A(this.f47945T);
        AnonymousClass3Cf anonymousClass3Cf = new AnonymousClass3Cf();
        this.f47966o = anonymousClass3Cf;
        anonymousClass3Cf.f39089B = this;
        this.f47935J = viewGroup;
        this.f47935J.setOnTouchListener(this.f47966o);
        this.f47958g = (GridLinesView) viewGroup.findViewById(C0164R.id.straighten_grid_overlay_3);
        this.f47957f = (GridLinesView) viewGroup.findViewById(C0164R.id.straighten_grid_overlay_6);
        m21877J(this.f47958g);
        m21877J(this.f47957f);
        m21878K(this.f47954c);
        this.f47963l = this.f47956e.m22014C(2);
        this.f47959h = this.f47956e.m22014C(10);
        this.f47962k = this.f47956e.m22014C(9);
        this.f47950Y = this.f47956e.m22014C(12);
        this.f47949X = this.f47956e.m22014C(13);
        this.f47953b = this.f47956e.m22014C(15);
        this.f47965n = this.f47956e.m22014C(18);
        this.f47951Z = this.f47956e.m22014C(20);
        if (!AnonymousClass0HV.D(this.f47947V).f2646B.getBoolean("show_adjust_crop_nux", false)) {
            View view2 = this.f47935J;
            FrameLayout frameLayout = (FrameLayout) view2;
            view2 = LayoutInflater.from(view2.getContext()).inflate(C0164R.layout.adjust_crop_nux, frameLayout, false);
            this.f47927B = view2;
            frameLayout.addView(view2);
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.f47927B.startAnimation(alphaAnimation);
        }
        m21874G();
        this.f47956e.invalidate();
        this.f47939N.vJA();
        return true;
    }

    public final void VAA(float f, float f2) {
        AnonymousClass3DE A = this.f47954c.mo4792A();
        this.f47954c = A;
        m21878K(A);
    }

    public final boolean XW(AnonymousClass3ym anonymousClass3ym, IgFilter igFilter) {
        boolean z = true;
        SurfaceCropFilter surfaceCropFilter = (SurfaceCropFilter) ((IgFilterGroup) igFilter).m22013B(1);
        synchronized (surfaceCropFilter) {
            float f = surfaceCropFilter.f50077E.f39777F;
        }
        if (f == 0.0f) {
            synchronized (surfaceCropFilter) {
                f = surfaceCropFilter.f50077E.f39779H;
            }
            if (f == 0.0f) {
                synchronized (surfaceCropFilter) {
                    f = surfaceCropFilter.f50077E.f39778G;
                }
                if (f == 0.0f) {
                    z = false;
                }
            }
        }
        anonymousClass3ym.setChecked(z);
        return false;
    }

    public final void fAA(float f, float f2, float f3, float f4) {
        if (f3 != 0.0f || f4 != 0.0f) {
            if (this.f47929D) {
                this.f47934I.m23049N(this.f47946U, false);
            }
            this.f47934I.m23046K(f3 / ((float) this.f47935J.getWidth()), f4 / ((float) this.f47935J.getHeight()));
            m21873F();
            this.f47939N.vJA();
        }
    }
}

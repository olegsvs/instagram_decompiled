package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.5c4 */
public final class AnonymousClass5c4 implements AnonymousClass5YU {
    /* renamed from: B */
    public final int f67287B;
    /* renamed from: C */
    public final View f67288C;
    /* renamed from: D */
    public final IGTVViewerFragment f67289D;
    /* renamed from: E */
    public final Handler f67290E;
    /* renamed from: F */
    public final View f67291F;
    /* renamed from: G */
    public final View f67292G;
    /* renamed from: H */
    public int f67293H;
    /* renamed from: I */
    public long f67294I;
    /* renamed from: J */
    public final int f67295J;
    /* renamed from: K */
    public final TextView f67296K;
    /* renamed from: L */
    public final Runnable f67297L = new AnonymousClass4wl(this);
    /* renamed from: M */
    public final View f67298M;
    /* renamed from: N */
    public final AnonymousClass0cN f67299N;
    /* renamed from: O */
    public final AnonymousClass0n2 f67300O;
    /* renamed from: P */
    public final View f67301P;
    /* renamed from: Q */
    public AnonymousClass2CT f67302Q;
    /* renamed from: R */
    private AnonymousClass4wW f67303R;
    /* renamed from: S */
    private final View f67304S;
    /* renamed from: T */
    private final ImageView f67305T;
    /* renamed from: U */
    private boolean f67306U;
    /* renamed from: V */
    private final ImageView f67307V;
    /* renamed from: W */
    private final View f67308W;
    /* renamed from: X */
    private boolean f67309X;
    /* renamed from: Y */
    private boolean f67310Y;
    /* renamed from: Z */
    private Drawable f67311Z;
    /* renamed from: a */
    private int f67312a;
    /* renamed from: b */
    private final IgImageView f67313b;
    /* renamed from: c */
    private final ImageView f67314c;
    /* renamed from: d */
    private final TextView f67315d;
    /* renamed from: e */
    private long f67316e;
    /* renamed from: f */
    private final TextView f67317f;
    /* renamed from: g */
    private final TextView f67318g;
    /* renamed from: h */
    private Drawable f67319h;
    /* renamed from: i */
    private final SimpleVideoLayout f67320i;
    /* renamed from: j */
    private final View f67321j;
    /* renamed from: k */
    private int f67322k;
    /* renamed from: l */
    private final ProgressBar f67323l;

    public final void AGA(AnonymousClass4vx anonymousClass4vx) {
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Rh(AnonymousClass4vx anonymousClass4vx) {
    }

    public final void Xq(View view) {
    }

    public final void bf(AnonymousClass4uq anonymousClass4uq, float f, float f2, float f3) {
    }

    public final void cf(AnonymousClass4uq anonymousClass4uq, float f, float f2, float f3) {
    }

    public final void pFA(AnonymousClass4vx anonymousClass4vx) {
    }

    public final void qFA(AnonymousClass4vx anonymousClass4vx) {
    }

    public final void uFA(AnonymousClass4vx anonymousClass4vx) {
    }

    public AnonymousClass5c4(View view, IGTVViewerFragment iGTVViewerFragment) {
        Context context = view.getContext();
        this.f67290E = new Handler(Looper.getMainLooper());
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f67299N = C.A(this);
        this.f67292G = view;
        this.f67300O = new AnonymousClass0n2(context);
        this.f67292G.setBackgroundDrawable(this.f67300O);
        Resources resources = view.getResources();
        this.f67287B = resources.getDimensionPixelSize(C0164R.dimen.channel_item_margin);
        Drawable J = AnonymousClass0TJ.J(context, C0164R.drawable.igtv_description, -1);
        new AnonymousClass4ul(J).setBounds(0, 0, J.getIntrinsicWidth(), J.getIntrinsicHeight());
        resources.getDimensionPixelSize(C0164R.dimen.channel_item_margin);
        this.f67289D = iGTVViewerFragment;
        this.f67291F = view.findViewById(C0164R.id.header);
        this.f67301P = view.findViewById(C0164R.id.top_gradient);
        this.f67313b = (IgImageView) view.findViewById(C0164R.id.profile_picture);
        TextView textView = (TextView) view.findViewById(C0164R.id.username);
        this.f67318g = textView;
        textView.setTypeface(AnonymousClass0nA.E());
        this.f67317f = (TextView) view.findViewById(C0164R.id.header_subtitle);
        this.f67298M = view.findViewById(C0164R.id.profile_container);
        this.f67307V = (ImageView) view.findViewById(C0164R.id.loading_spinner);
        Drawable B = AnonymousClass4ur.m25348B(context);
        B.E(1.0f);
        B.D(true);
        B.F(1.0f);
        this.f67307V.setImageDrawable(B);
        this.f67321j = view.findViewById(C0164R.id.video_controls_container);
        this.f67322k = resources.getDimensionPixelSize(C0164R.dimen.video_scrubber_height);
        this.f67315d = (TextView) view.findViewById(C0164R.id.skip_info_text);
        this.f67311Z = AnonymousClass0Ca.E(context, C0164R.drawable.play_icon);
        this.f67320i = (SimpleVideoLayout) view.findViewById(C0164R.id.video_container);
        this.f67323l = (ProgressBar) view.findViewById(C0164R.id.progress_bar);
        View findViewById = view.findViewById(C0164R.id.more_button);
        this.f67308W = findViewById;
        findViewById.setVisibility(8);
        this.f67304S = view.findViewById(C0164R.id.bottom_control_bar_container);
        this.f67305T = (ImageView) view.findViewById(C0164R.id.cube_rotation_overlay);
        this.f67288C = view.findViewById(C0164R.id.dark_overlay);
        this.f67314c = (ImageView) view.findViewById(C0164R.id.skip_indicator);
        this.f67296K = (TextView) view.findViewById(C0164R.id.blocked_banner);
        Drawable E = AnonymousClass0Ca.E(context, C0164R.drawable.igtv_chevron_right);
        E.setBounds(0, 0, E.getIntrinsicWidth(), E.getIntrinsicHeight());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getString(C0164R.string.igtv_blocked_media));
        stringBuilder.append("  ");
        CharSequence stringBuilder2 = stringBuilder.toString();
        int length = stringBuilder2.length() - 1;
        int length2 = stringBuilder2.length();
        CharSequence spannableStringBuilder = new SpannableStringBuilder(stringBuilder2);
        spannableStringBuilder.setSpan(new ImageSpan(E, 1), length, length2, 33);
        this.f67296K.setText(spannableStringBuilder);
        this.f67295J = resources.getDimensionPixelSize(C0164R.dimen.igtv_item_banner_height);
        this.f67291F.addOnLayoutChangeListener(new AnonymousClass4wm(this, Math.round(AnonymousClass0Nm.C(context, 36))));
        Activity activity = (Activity) view.getContext();
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f67308W);
        anonymousClass15z.f14389I = 0.95f;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = this;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f67313b);
        anonymousClass15z.f14389I = 0.95f;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = this;
        anonymousClass15z.A();
        this.f67318g.setOnClickListener(new AnonymousClass4wn(this));
        this.f67314c.setImageDrawable(AnonymousClass0TJ.K(view.getContext(), C0164R.drawable.fast_forward, C0164R.color.white));
        m27980D();
        AnonymousClass4uq.m25339B((Context) activity).m25343A(this);
        AnonymousClass4v0.m25353B(activity).m25356A(this);
    }

    /* renamed from: A */
    public final void m27982A(float f) {
        if ((this.f67300O.f9986G ^ 1) == 0) {
            if (this.f67310Y) {
                this.f67299N.L((double) f);
            } else {
                this.f67299N.N((double) f);
            }
        }
    }

    public final SimpleVideoLayout AU() {
        return this.f67320i;
    }

    /* renamed from: B */
    private void m27978B(int i) {
        this.f67304S.setPadding(0, 0, 0, this.f67322k + i);
        this.f67321j.setPadding(0, 0, 0, i);
        View view = this.f67291F;
        view.setPadding(view.getPaddingLeft(), this.f67291F.getPaddingTop(), this.f67291F.getPaddingRight(), i);
    }

    /* renamed from: C */
    private void m27979C() {
        AnonymousClass0OR.G(this.f67290E, this.f67297L, 232085255);
        this.f67292G.setBackgroundDrawable(this.f67300O);
        this.f67300O.B();
    }

    public final void CGA(AnonymousClass4vx anonymousClass4vx, int i, int i2, boolean z) {
        if (this.f67303R != AnonymousClass4wW.TRANSITIONING_ONSCREEN) {
            this.f67323l.setProgress(i);
            this.f67323l.setMax(i2);
            if (this.f67309X) {
                m27981E();
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ((Math.abs(i2 - i) <= 100 ? 1 : null) == null && this.f67294I > 0 && (i - this.f67293H == 0 || z)) {
            this.f67316e += currentTimeMillis - this.f67294I;
        } else {
            this.f67316e = 0;
        }
        this.f67294I = currentTimeMillis;
        this.f67293H = i;
        currentTimeMillis = this.f67316e;
        m27982A(currentTimeMillis < 1000 ? 0.0f : (float) currentTimeMillis);
    }

    /* renamed from: D */
    private void m27980D() {
        float E = AnonymousClass0nB.E((float) this.f67299N.E(), 1000.0f, 1500.0f, 0.0f, 1.0f, true);
        this.f67288C.setAlpha(E);
        this.f67288C.setVisibility(E > 0.0f ? 0 : 4);
        float E2 = AnonymousClass0nB.E((float) this.f67299N.E(), 2000.0f, 2500.0f, 0.0f, 1.0f, true);
        this.f67307V.setAlpha(E2);
        this.f67307V.setVisibility(E2 > 0.0f ? 0 : 8);
    }

    /* renamed from: E */
    private void m27981E() {
        CharSequence spannableStringBuilder;
        int B = this.f67302Q.B();
        int i = this.f67302Q.f27415C;
        if (!this.f67302Q.A()) {
            if (B <= 0 || i < B) {
                if (B > 0) {
                    String E = AnonymousClass0dw.E((long) (B - i));
                    spannableStringBuilder = new SpannableStringBuilder(this.f67292G.getResources().getString(C0164R.string.igtv_skip_button_text_delay_skippable, new Object[]{E}));
                    this.f67315d.setOnClickListener(null);
                    this.f67309X = true;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(this.f67292G.getResources().getString(C0164R.string.igtv_skip_button_text_non_skippable));
                    this.f67315d.setOnClickListener(null);
                    this.f67309X = false;
                }
                this.f67315d.setText(spannableStringBuilder);
            }
        }
        spannableStringBuilder = new SpannableStringBuilder(this.f67292G.getResources().getString(C0164R.string.igtv_skip_button_text_skippable));
        i = this.f67292G.getResources().getDimensionPixelSize(C0164R.dimen.scrubber_skip_button_icon_size);
        this.f67311Z.setBounds(0, 0, i, i);
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new AnonymousClass2JU(this.f67311Z), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f67315d.setOnClickListener(new AnonymousClass4wp(this));
        this.f67302Q.f27416D = true;
        this.f67289D.mChannelPager.setDraggingEnabled(true);
        this.f67309X = false;
        this.f67315d.setText(spannableStringBuilder);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN == this.f67299N) {
            m27980D();
        }
    }

    public final void HOA(boolean z) {
        if (this.f67306U != z) {
            this.f67306U = z;
            if (z) {
                AnonymousClass0OR.G(this.f67290E, this.f67297L, 1998765990);
                AnonymousClass0OR.F(this.f67290E, this.f67297L, 200, -1640607474);
            } else if (!this.f67310Y) {
                m27979C();
            }
        }
    }

    public final AnonymousClass2CT NU() {
        return this.f67302Q;
    }

    public final ImageView aK() {
        return this.f67305T;
    }

    public final void bs(AnonymousClass4uz anonymousClass4uz, int i, AnonymousClass4v0 anonymousClass4v0) {
        switch (anonymousClass4uz.ordinal()) {
            case 0:
            case 2:
                m27978B(i);
                return;
            case 1:
                m27978B(0);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected type: ");
                stringBuilder.append(anonymousClass4uz);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void eMA(AnonymousClass4wW anonymousClass4wW) {
        if (this.f67303R != anonymousClass4wW) {
            this.f67303R = anonymousClass4wW;
            switch (AnonymousClass4wq.f58717C[this.f67303R.ordinal()]) {
                case 1:
                case 2:
                    this.f67291F.setLayerType(0, null);
                    this.f67304S.setLayerType(0, null);
                    this.f67301P.setLayerType(0, null);
                    this.f67305T.setLayerType(0, null);
                    this.f67321j.setLayerType(0, null);
                    return;
                case 3:
                    this.f67291F.setLayerType(2, null);
                    this.f67304S.setLayerType(2, null);
                    this.f67301P.setLayerType(2, null);
                    this.f67305T.setLayerType(2, null);
                    this.f67321j.setLayerType(2, null);
                    return;
                default:
                    return;
            }
        }
    }

    public final AnonymousClass4wX fT() {
        return AnonymousClass4wX.SPONSORED;
    }

    public final int getPosition() {
        return this.f67312a;
    }

    public final void pC(AnonymousClass2CT anonymousClass2CT, int i) {
        AnonymousClass2CT anonymousClass2CT2 = this.f67302Q;
        this.f67302Q = anonymousClass2CT;
        this.f67312a = i;
        AnonymousClass0LQ.B(anonymousClass2CT2, this.f67302Q);
        this.f67318g.setText(this.f67302Q.O());
        if (this.f67302Q.Y() && this.f67319h == null) {
            this.f67319h = AnonymousClass0Ca.E(this.f67318g.getContext(), C0164R.drawable.verified_profile);
        }
        this.f67318g.setCompoundDrawablesWithIntrinsicBounds(null, null, this.f67302Q.Y() ? this.f67319h : null, null);
        if (this.f67302Q.I() != null) {
            this.f67317f.setText(this.f67302Q.I());
        } else {
            this.f67317f.setText(C0164R.string.default_sponsored_label);
        }
        AnonymousClass0P7 G = this.f67302Q.G();
        this.f67323l.setProgress(this.f67302Q.f27415C);
        m27981E();
        this.f67313b.setUrl(this.f67302Q.N().DQ());
        if (G.aA()) {
            this.f67296K.setVisibility(0);
            this.f67296K.setOnClickListener(new AnonymousClass4wo(this, G));
            View view = this.f67291F;
            int i2 = this.f67287B;
            view.setPadding(i2, this.f67295J + i2, i2, 0);
        } else if (this.f67296K.getVisibility() == 0) {
            this.f67296K.setVisibility(8);
            this.f67296K.setOnClickListener(null);
            View view2 = this.f67291F;
            int i3 = this.f67287B;
            view2.setPadding(i3, i3, i3, 0);
        }
        IGTVViewerFragment.m27464L(this.f67289D);
    }

    public final boolean yCA(View view) {
        if (view == this.f67308W) {
            this.f67289D.m27491k(NU(), getPosition());
            return true;
        } else if (view != this.f67313b) {
            return false;
        } else {
            this.f67289D.m27492l(this.f67302Q.N(), this.f67302Q.X());
            return true;
        }
    }

    public final void yPA(boolean z) {
        if (this.f67310Y != z) {
            this.f67310Y = z;
            if (z) {
                this.f67294I = 0;
                this.f67293H = 0;
                AnonymousClass0OR.G(this.f67290E, this.f67297L, -664193668);
                this.f67292G.setBackgroundDrawable(null);
                this.f67300O.A();
                return;
            }
            m27981E();
            if (!this.f67306U) {
                m27979C();
            }
        }
    }
}

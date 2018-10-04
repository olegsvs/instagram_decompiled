package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5Vz */
public abstract class AnonymousClass5Vz extends AnonymousClass4gA implements AnonymousClass4eq, AnonymousClass4fY, AnonymousClass4fQ {
    /* renamed from: N */
    public static Set f65519N;
    /* renamed from: B */
    public final AnonymousClass0EE f65520B;
    /* renamed from: C */
    public final ImageView f65521C;
    /* renamed from: D */
    public final AnonymousClass0Ci f65522D;
    /* renamed from: E */
    public AnonymousClass5WQ f65523E;
    /* renamed from: F */
    public AnonymousClass4er f65524F;
    /* renamed from: G */
    public final FrameLayout f65525G;
    /* renamed from: H */
    public final AnonymousClass0Cm f65526H;
    /* renamed from: I */
    public ViewStub f65527I;
    /* renamed from: J */
    public TextView f65528J;
    /* renamed from: K */
    private final View f65529K;
    /* renamed from: L */
    private CircularImageView f65530L;
    /* renamed from: M */
    private ViewStub f65531M;

    /* renamed from: b */
    public abstract int mo6028b();

    /* renamed from: e */
    public abstract void mo6029e(AnonymousClass5WQ anonymousClass5WQ);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public AnonymousClass5Vz(View view, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass5bQ);
        this.f65526H = anonymousClass0Cm;
        this.f65522D = anonymousClass0Cm.B();
        this.f65520B = anonymousClass0EE;
        this.f65525G = (FrameLayout) view.findViewById(C0164R.id.message_content_container);
        ViewStub viewStub = (ViewStub) view.findViewById(C0164R.id.stub);
        viewStub.setInflatedId(C0164R.id.message_content);
        viewStub.setLayoutResource(mo6028b());
        View inflate = viewStub.inflate();
        this.f65529K = inflate;
        inflate.setClickable(true);
        this.f65531M = (ViewStub) view.findViewById(C0164R.id.sender_avatar_stub);
        this.f65527I = (ViewStub) view.findViewById(C0164R.id.will_not_upload_message_stub);
        this.f65521C = (ImageView) view.findViewById(C0164R.id.doubletap_heart);
        if (f65519N == null) {
            f65519N = new HashSet();
            for (AnonymousClass0V0 anonymousClass0V0 : AnonymousClass0V0.values()) {
                if (AnonymousClass0HV.D(this.f65526H).V(anonymousClass0V0.A())) {
                    f65519N.add(anonymousClass0V0);
                }
            }
        }
    }

    public View AQ() {
        return this.f65529K;
    }

    public void As(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass1aH.D(anonymousClass5WQ, V(), this.f65526H, AnonymousClass1aH.B(V(), this.f65526H, anonymousClass5WQ), this.f56219B, null, this.f65520B);
    }

    /* renamed from: B */
    public static void m27250B(AnonymousClass5Vz anonymousClass5Vz, AnonymousClass0W7 anonymousClass0W7) {
        AnonymousClass0V0 anonymousClass0V0 = anonymousClass0W7.f5915s;
        if (anonymousClass0V0 != null) {
            switch (anonymousClass0V0.ordinal()) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 12:
                case ParserMinimalBase.INT_CR /*13*/:
                case 14:
                case 16:
                case Process.SIGCONT /*18*/:
                case Process.SIGSTOP /*19*/:
                case Process.SIGTSTP /*20*/:
                    break;
                case 11:
                    if (AnonymousClass4gg.C(anonymousClass5Vz.f65526H, (AnonymousClass0YJ) anonymousClass0W7.f5876F)) {
                        LayoutParams layoutParams = anonymousClass5Vz.AQ().getLayoutParams();
                        layoutParams.width = AnonymousClass4ew.D(anonymousClass5Vz.V());
                        anonymousClass5Vz.AQ().setLayoutParams(layoutParams);
                        return;
                    }
                    break;
                default:
                    return;
            }
            AnonymousClass5Vz.m27251C(anonymousClass5Vz);
        }
    }

    /* renamed from: C */
    private static void m27251C(AnonymousClass5Vz anonymousClass5Vz) {
        LayoutParams layoutParams = anonymousClass5Vz.AQ().getLayoutParams();
        layoutParams.width = AnonymousClass4ew.C(anonymousClass5Vz.V());
        anonymousClass5Vz.AQ().setLayoutParams(layoutParams);
    }

    public boolean Fj(AnonymousClass5WQ anonymousClass5WQ) {
        if (!mo6032d(anonymousClass5WQ)) {
            return false;
        }
        this.f56219B.m27844G(anonymousClass5WQ.f65618B);
        AnonymousClass0V0 anonymousClass0V0 = this.f65523E.f65618B.f5915s;
        String A = anonymousClass0V0.A();
        if (!AnonymousClass0HV.D(this.f65526H).V(A)) {
            AnonymousClass0HV D = AnonymousClass0HV.D(this.f65526H);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("response_to_direct_liking_nux:");
            stringBuilder.append(A);
            D.f2646B.edit().putBoolean(stringBuilder.toString(), true).apply();
            f65519N.add(anonymousClass0V0);
        }
        View view = this.f65521C;
        if (view != null) {
            AnonymousClass4fJ.B(view, anonymousClass5WQ.f65618B, false, true);
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m27252I() {
        return this.f65523E != null;
    }

    /* renamed from: X */
    public final /* bridge */ /* synthetic */ void m27253X(AnonymousClass4gR anonymousClass4gR) {
        AnonymousClass5WQ anonymousClass5WQ = (AnonymousClass5WQ) anonymousClass4gR;
        if (this.f65524F == null) {
            this.f65524F = new AnonymousClass4er(this.f65526H, this, this.f56219B, AQ());
        }
        this.f65523E = anonymousClass5WQ;
        AnonymousClass0W7 anonymousClass0W7 = this.f65523E.f65618B;
        boolean S = anonymousClass0W7.S(this.f65522D);
        if (anonymousClass0W7.f5887Q == AnonymousClass0VM.WILL_NOT_UPLOAD) {
            if (this.f65528J == null) {
                this.f65528J = (TextView) this.f65527I.inflate();
                this.f65527I = null;
            }
            this.f65528J.setVisibility(0);
            this.f65528J.setText(AnonymousClass0Tf.f5226B.A(anonymousClass0W7.f5915s).aU());
        } else {
            TextView textView = this.f65528J;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        View view = this.f65521C;
        if (view != null) {
            AnonymousClass4fJ.C(view, anonymousClass0W7);
            AQ().getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4ev(this));
        }
        AnonymousClass5Vz.m27250B(this, anonymousClass0W7);
        this.f65524F.f56050B = anonymousClass5WQ;
        AQ().setOnTouchListener(this.f65524F);
        AnonymousClass4fZ.C(this.f65525G, anonymousClass5WQ, this.f56219B, S, this);
        mo6029e(this.f65523E);
    }

    /* renamed from: Y */
    public final void m27254Y(float f, float f2) {
        AnonymousClass4fZ.F(this.f65525G, Math.min(f / f2, 1.0f));
        super.Y(f, f2);
    }

    /* renamed from: Z */
    public void mo6027Z() {
        super.Z();
        AnonymousClass4fZ.E(this.f65525G);
        AQ().setOnTouchListener(null);
        this.f65523E = null;
        AnonymousClass4er anonymousClass4er = this.f65524F;
        if (anonymousClass4er != null) {
            anonymousClass4er.f56050B = null;
        }
    }

    /* renamed from: a */
    public final boolean m27256a() {
        return ((Boolean) AnonymousClass0CC.PG.H(this.f65526H)).booleanValue();
    }

    /* renamed from: c */
    public final String m27258c() {
        AnonymousClass5WQ anonymousClass5WQ = this.f65523E;
        return anonymousClass5WQ != null ? anonymousClass5WQ.f65627K.f56244E : null;
    }

    /* renamed from: d */
    public boolean mo6032d(AnonymousClass5WQ anonymousClass5WQ) {
        return anonymousClass5WQ.f65618B.f5885O != null;
    }

    /* renamed from: f */
    public final void m27261f(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        if (anonymousClass5WQ.f65626J) {
            String str = null;
            if (this.f65530L == null) {
                CircularImageView circularImageView = (CircularImageView) this.f65531M.inflate();
                this.f65530L = circularImageView;
                circularImageView.setOnClickListener(new AnonymousClass4eu(this));
                this.f65531M = null;
            }
            if (anonymousClass0W7.M() != null) {
                str = anonymousClass0W7.M().DQ();
            }
            if (str == null) {
                this.f65530L.A();
            } else {
                this.f65530L.setUrl(str);
            }
            this.f65530L.setVisibility(0);
            return;
        }
        circularImageView = this.f65530L;
        if (circularImageView != null) {
            circularImageView.setVisibility(8);
        }
    }

    public final void qGA(float f) {
        this.f65529K.setTranslationX(f);
    }

    public boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        return AnonymousClass1aH.C(anonymousClass5WQ, this.f56219B);
    }
}

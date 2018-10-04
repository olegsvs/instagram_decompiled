package X;

import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.5ba */
public class AnonymousClass5ba extends AnonymousClass5Vz {
    /* renamed from: B */
    public final IgProgressImageView f67031B;
    /* renamed from: C */
    public final ConstraintLayout f67032C;
    /* renamed from: D */
    public TightTextView f67033D;
    /* renamed from: E */
    public final ConstraintLayout f67034E;
    /* renamed from: F */
    public final CircularImageView f67035F;
    /* renamed from: G */
    public final TextView f67036G;
    /* renamed from: H */
    public final AnonymousClass0Cm f67037H;
    /* renamed from: I */
    public final TextView f67038I;
    /* renamed from: J */
    private AnonymousClass1dU f67039J;
    /* renamed from: K */
    private final AnonymousClass4gT f67040K;

    public AnonymousClass5ba(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f67037H = anonymousClass0Cm;
        this.f67040K = anonymousClass4gT;
        this.f67034E = (ConstraintLayout) view.findViewById(C0164R.id.message_content);
        this.f67032C = (ConstraintLayout) view.findViewById(C0164R.id.igtv_share_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.findViewById(C0164R.id.preview_image);
        this.f67031B = igProgressImageView;
        igProgressImageView.setEnableProgressBar(false);
        this.f67031B.setScaleType(ScaleType.CENTER_CROP);
        this.f67035F = (CircularImageView) view.findViewById(C0164R.id.avatar);
        this.f67038I = (TextView) view.findViewById(C0164R.id.username);
        this.f67036G = (TextView) view.findViewById(C0164R.id.title);
        this.f67033D = (TightTextView) view.findViewById(C0164R.id.message);
        this.f67039J = new AnonymousClass1dU(new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_reactions_bar_stub)), anonymousClass4gT, this.f56219B, this.f67037H.B());
        int J = (int) (((float) AnonymousClass0Nm.J(V())) / 2.5f);
        AnonymousClass0Nm.j(this.f67032C, J);
        AnonymousClass0Nm.j(this.f67031B, J);
    }

    public final boolean Fj(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass2E4.C(AnonymousClass0V0.FELIX_SHARE, this.f67037H, false);
        return super.Fj(anonymousClass5WQ);
    }

    /* renamed from: Z */
    public final void mo6027Z() {
        if (m27252I()) {
            AnonymousClass1dU anonymousClass1dU = this.f67039J;
            if (anonymousClass1dU != null) {
                AnonymousClass1dU.G(anonymousClass1dU, this.f65523E.f65618B);
            }
        }
        super.mo6027Z();
    }

    /* renamed from: b */
    public int mo6028b() {
        return C0164R.layout.message_content_igtv_share;
    }

    /* renamed from: e */
    public void mo6029e(AnonymousClass5WQ anonymousClass5WQ) {
        this.f67031B.D();
        this.f67035F.setVisibility(8);
        this.f67036G.setVisibility(8);
        this.f67038I.setVisibility(8);
        this.f67033D.setVisibility(8);
        m27261f(anonymousClass5WQ);
        AnonymousClass4gY anonymousClass4gY = (AnonymousClass4gY) anonymousClass5WQ.f65618B.f5876F;
        if (anonymousClass4gY != null) {
            AnonymousClass0P7 anonymousClass0P7 = anonymousClass4gY.f56268B;
            if (anonymousClass0P7 != null) {
                this.f67031B.setUrl(anonymousClass0P7.x(V()));
                this.f67036G.setVisibility(0);
                this.f67036G.setText(anonymousClass0P7.vC);
                AnonymousClass0Ci MA = anonymousClass0P7.MA();
                if (MA != null) {
                    this.f67035F.setVisibility(0);
                    this.f67035F.setUrl(MA.DQ());
                    this.f67038I.setVisibility(0);
                    this.f67038I.setText(MA.uT());
                }
            }
            Object obj = anonymousClass4gY.f56269C;
            if (!TextUtils.isEmpty(obj)) {
                AnonymousClass4fr.C(V(), this.f67033D, obj, false);
                this.f67033D.setVisibility(0);
                this.f67033D.setTextColor(AnonymousClass4et.D(this.f67040K, anonymousClass5WQ.f65618B, this.f67037H.B()));
                this.f67033D.setBackground(AnonymousClass4et.B(this.f67040K, anonymousClass5WQ.f65618B, this.f67037H.B()));
            }
            AnonymousClass1dU anonymousClass1dU = this.f67039J;
            if (anonymousClass1dU != null) {
                AnonymousClass1dU.E(anonymousClass1dU, anonymousClass5WQ, this.f67037H.B(), false, anonymousClass5WQ.f65619C);
            }
        }
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass4gY anonymousClass4gY = (AnonymousClass4gY) anonymousClass5WQ.f65618B.f5876F;
        if (!(anonymousClass4gY == null || anonymousClass4gY.f56268B == null)) {
            this.f56219B.m27838A(anonymousClass4gY.f56268B, AnonymousClass0Nm.L(this.f67031B));
        }
        return true;
    }
}

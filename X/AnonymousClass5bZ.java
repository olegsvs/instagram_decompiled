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
import java.util.concurrent.TimeUnit;

/* renamed from: X.5bZ */
public class AnonymousClass5bZ extends AnonymousClass5Vz {
    /* renamed from: B */
    public final IgProgressImageView f67021B;
    /* renamed from: C */
    public TightTextView f67022C;
    /* renamed from: D */
    public final ConstraintLayout f67023D;
    /* renamed from: E */
    public final CircularImageView f67024E;
    /* renamed from: F */
    public final TextView f67025F;
    /* renamed from: G */
    public final AnonymousClass0Cm f67026G;
    /* renamed from: H */
    public final TextView f67027H;
    /* renamed from: I */
    private AnonymousClass1dU f67028I;
    /* renamed from: J */
    private final AnonymousClass4gT f67029J;
    /* renamed from: K */
    private final TextView f67030K;

    public AnonymousClass5bZ(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f67026G = anonymousClass0Cm;
        this.f67029J = anonymousClass4gT;
        this.f67023D = (ConstraintLayout) view.findViewById(C0164R.id.message_content);
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.findViewById(C0164R.id.preview_image);
        this.f67021B = igProgressImageView;
        igProgressImageView.setEnableProgressBar(false);
        this.f67021B.setScaleType(ScaleType.CENTER_CROP);
        this.f67024E = (CircularImageView) view.findViewById(C0164R.id.avatar);
        this.f67027H = (TextView) view.findViewById(C0164R.id.username);
        this.f67025F = (TextView) view.findViewById(C0164R.id.title);
        this.f67022C = (TightTextView) view.findViewById(C0164R.id.message);
        this.f67030K = (TextView) view.findViewById(C0164R.id.video_duration);
        this.f67028I = new AnonymousClass1dU(new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_reactions_bar_stub)), anonymousClass4gT, this.f56219B, this.f67026G.B());
    }

    public final boolean Fj(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass2E4.C(AnonymousClass0V0.FELIX_SHARE, this.f67026G, false);
        return super.Fj(anonymousClass5WQ);
    }

    /* renamed from: Z */
    public final void mo6027Z() {
        if (m27252I()) {
            AnonymousClass1dU anonymousClass1dU = this.f67028I;
            if (anonymousClass1dU != null) {
                AnonymousClass1dU.G(anonymousClass1dU, this.f65523E.f65618B);
            }
        }
        super.mo6027Z();
    }

    /* renamed from: b */
    public int mo6028b() {
        return C0164R.layout.message_content_larger_media_igtv_share;
    }

    /* renamed from: e */
    public void mo6029e(AnonymousClass5WQ anonymousClass5WQ) {
        this.f67021B.D();
        this.f67024E.setVisibility(8);
        this.f67025F.setVisibility(8);
        this.f67027H.setVisibility(8);
        this.f67022C.setVisibility(8);
        m27261f(anonymousClass5WQ);
        AnonymousClass4gY anonymousClass4gY = (AnonymousClass4gY) anonymousClass5WQ.f65618B.f5876F;
        if (anonymousClass4gY != null) {
            AnonymousClass0P7 anonymousClass0P7 = anonymousClass4gY.f56268B;
            if (anonymousClass0P7 != null) {
                this.f67021B.setUrl(anonymousClass0P7.x(V()));
                this.f67025F.setVisibility(0);
                this.f67025F.setText(anonymousClass0P7.vC);
                this.f67030K.setText(AnonymousClass0dw.E(TimeUnit.MILLISECONDS.convert(anonymousClass0P7.NA().longValue(), TimeUnit.SECONDS)));
                AnonymousClass0Ci MA = anonymousClass0P7.MA();
                if (MA != null) {
                    this.f67024E.setVisibility(0);
                    this.f67024E.setUrl(MA.DQ());
                    this.f67027H.setVisibility(0);
                    this.f67027H.setText(MA.uT());
                }
            }
            Object obj = anonymousClass4gY.f56269C;
            if (!TextUtils.isEmpty(obj)) {
                AnonymousClass4fr.C(V(), this.f67022C, obj, false);
                this.f67022C.setVisibility(0);
                this.f67022C.setTextColor(AnonymousClass4et.D(this.f67029J, anonymousClass5WQ.f65618B, this.f67026G.B()));
                this.f67022C.setBackground(AnonymousClass4et.B(this.f67029J, anonymousClass5WQ.f65618B, this.f67026G.B()));
            }
            AnonymousClass1dU anonymousClass1dU = this.f67028I;
            if (anonymousClass1dU != null) {
                AnonymousClass1dU.E(anonymousClass1dU, anonymousClass5WQ, this.f67026G.B(), false, anonymousClass5WQ.f65619C);
            }
        }
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass4gY anonymousClass4gY = (AnonymousClass4gY) anonymousClass5WQ.f65618B.f5876F;
        if (!(anonymousClass4gY == null || anonymousClass4gY.f56268B == null)) {
            this.f56219B.m27838A(anonymousClass4gY.f56268B, AnonymousClass0Nm.L(this.f67021B));
        }
        return true;
    }
}

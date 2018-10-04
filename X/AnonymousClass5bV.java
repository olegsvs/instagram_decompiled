package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.5bV */
public class AnonymousClass5bV extends AnonymousClass5Vz {
    /* renamed from: B */
    private final IgProgressImageView f66975B;
    /* renamed from: C */
    private final boolean f66976C;
    /* renamed from: D */
    private final AnonymousClass5WD f66977D;
    /* renamed from: E */
    private final AnonymousClass4gT f66978E;
    /* renamed from: F */
    private final AnonymousClass0Cm f66979F;

    public AnonymousClass5bV(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        this(view, anonymousClass4gT, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE, false);
    }

    public AnonymousClass5bV(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, boolean z) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        super(view, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f66979F = anonymousClass0Cm;
        AnonymousClass4gT anonymousClass4gT2 = anonymousClass4gT;
        this.f66978E = anonymousClass4gT;
        this.f66976C = z;
        this.f66975B = (IgProgressImageView) view.findViewById(C0164R.id.image);
        this.f66977D = new AnonymousClass5WD(V(), anonymousClass0Cm2, anonymousClass4gT2, this.f56219B, null, new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_text_message_text_view_stub)));
    }

    /* renamed from: b */
    public int mo6028b() {
        return C0164R.layout.message_content_reply_to_author_media_share;
    }

    /* renamed from: e */
    public final void mo6029e(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) AnonymousClass0LH.E(anonymousClass0W7.G());
        this.f66975B.setAspectRatio(anonymousClass0P7.L());
        this.f66975B.setUrl(anonymousClass0P7.HA());
        if (!this.f66976C) {
            m27261f(anonymousClass5WQ);
        }
        AnonymousClass4ep.B(this.f66979F, anonymousClass5WQ, this.f66978E, this.f56219B);
        if (anonymousClass5WQ.f65620D == null) {
            this.f66977D.f65584D.D(8);
        } else if (anonymousClass0W7.T()) {
            this.f66977D.m27303A(anonymousClass5WQ, this.f66976C);
        } else {
            this.f66977D.m27304B(anonymousClass5WQ, this.f66976C);
        }
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        if (AnonymousClass1aH.C(anonymousClass5WQ, this.f56219B)) {
            return true;
        }
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) AnonymousClass0LH.E(anonymousClass5WQ.f65618B.G());
        this.f56219B.m27843F(anonymousClass0P7.NO(), anonymousClass0P7.MA().getId(), anonymousClass5WQ.f65618B.f5918v, anonymousClass0P7.PA());
        return true;
    }
}

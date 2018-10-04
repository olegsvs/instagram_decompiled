package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.5bY */
public class AnonymousClass5bY extends AnonymousClass5Vz {
    /* renamed from: B */
    private final ViewGroup f67013B;
    /* renamed from: C */
    private final FrameLayout f67014C;
    /* renamed from: D */
    private final AnonymousClass1dU f67015D;
    /* renamed from: E */
    private final TextView f67016E;
    /* renamed from: F */
    private final AnonymousClass4gT f67017F;
    /* renamed from: G */
    private final AnonymousClass4g7 f67018G;
    /* renamed from: H */
    private final TextView f67019H;
    /* renamed from: I */
    private final AnonymousClass0Cm f67020I;

    public AnonymousClass5bY(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f67017F = anonymousClass4gT;
        this.f67014C = (FrameLayout) view.findViewById(C0164R.id.message_content);
        this.f67013B = (ViewGroup) view.findViewById(C0164R.id.message_content_hashtag_bubble_container);
        this.f67019H = (TextView) view.findViewById(C0164R.id.title);
        this.f67016E = (TextView) view.findViewById(C0164R.id.subtitle);
        this.f67018G = new AnonymousClass4g7(view);
        this.f67020I = anonymousClass0Cm;
        this.f67015D = new AnonymousClass1dU(new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_reactions_bar_stub)), anonymousClass4gT, this.f56219B, this.f67020I.B());
    }

    /* renamed from: Z */
    public final void mo6027Z() {
        if (m27252I()) {
            AnonymousClass1dU.G(this.f67015D, this.f65523E.f65618B);
        }
        super.mo6027Z();
    }

    /* renamed from: b */
    public int mo6028b() {
        return C0164R.layout.message_content_hashtag;
    }

    /* renamed from: e */
    public final void mo6029e(AnonymousClass5WQ anonymousClass5WQ) {
        m27261f(anonymousClass5WQ);
        this.f67014C.setForeground(AnonymousClass4et.C(this.f67017F, anonymousClass5WQ.f65618B, this.f67020I.B()));
        this.f67013B.setBackground(AnonymousClass4et.B(this.f67017F, anonymousClass5WQ.f65618B, this.f67020I.B()));
        Hashtag hashtag = (Hashtag) anonymousClass5WQ.f65618B.f5876F;
        TextView textView = this.f67019H;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(hashtag.f2793M);
        textView.setText(stringBuilder.toString());
        this.f67019H.setTextColor(AnonymousClass4et.D(this.f67017F, anonymousClass5WQ.f65618B, this.f67020I.B()));
        this.f67016E.setText(AnonymousClass19B.D(V().getResources(), hashtag.f2789I));
        this.f67016E.setTextColor(AnonymousClass4et.E(this.f67017F, anonymousClass5WQ.f65618B, this.f67020I.B()));
        this.f67018G.A(anonymousClass5WQ.f65618B.f5901e);
        AnonymousClass1dU.D(this.f67015D, anonymousClass5WQ, this.f67020I.B());
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        if (AnonymousClass1aH.C(anonymousClass5WQ, this.f56219B)) {
            return true;
        }
        this.f56219B.Eg(((Hashtag) anonymousClass5WQ.f65618B.f5876F).f2793M, null, null);
        return true;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3Tr */
public final class AnonymousClass3Tr {
    /* renamed from: B */
    public final View f41550B;
    /* renamed from: C */
    public final View f41551C;
    /* renamed from: D */
    public final AnonymousClass0cA f41552D;
    /* renamed from: E */
    public final View f41553E;
    /* renamed from: F */
    public AnonymousClass0iq f41554F;
    /* renamed from: G */
    private final ColorFilterAlphaImageView f41555G;
    /* renamed from: H */
    private final String f41556H;
    /* renamed from: I */
    private final AnonymousClass3Tp f41557I = new AnonymousClass3Tp(this);

    public AnonymousClass3Tr(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0cA anonymousClass0cA, ViewGroup viewGroup, String str) {
        this.f41552D = anonymousClass0cA;
        this.f41556H = str;
        if (str.equals("notification_type_dot")) {
            this.f41553E = LayoutInflater.from(context).inflate(C0164R.layout.tab_button, viewGroup, false);
        } else if (this.f41556H.equals("notification_type_count")) {
            this.f41553E = LayoutInflater.from(context).inflate(C0164R.layout.tab_button_count, viewGroup, false);
        } else {
            throw new IllegalStateException("Unknown notification tab type passed");
        }
        this.f41551C = this.f41553E.findViewById(C0164R.id.notification);
        View view = this.f41553E;
        this.f41550B = view;
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.findViewById(C0164R.id.tab_icon);
        this.f41555G = colorFilterAlphaImageView;
        colorFilterAlphaImageView.f7196E = AnonymousClass0ca.B(255);
        colorFilterAlphaImageView.f7193B = AnonymousClass0ca.B(255);
        ColorFilterAlphaImageView.B(colorFilterAlphaImageView);
        this.f41555G.setImageResource(anonymousClass0cA.A());
        if (anonymousClass0cA == AnonymousClass0cA.PROFILE && AnonymousClass0Cd.f1698B.J()) {
            LayoutInflater.from(context).inflate(C0164R.layout.tab_profile_button, (ViewGroup) this.f41553E, true);
            ((CircularImageView) this.f41553E.findViewById(C0164R.id.tab_avatar)).setUrl(anonymousClass0Cm.B().DQ());
            this.f41555G.setVisibility(8);
        }
        this.f41553E.setContentDescription(context.getResources().getString(anonymousClass0cA.B()));
        this.f41553E.setTag(anonymousClass0cA);
    }

    /* renamed from: A */
    public final void m19717A() {
        AnonymousClass3Tr.m19716B(this);
        this.f41551C.setVisibility(8);
    }

    /* renamed from: B */
    public static void m19716B(AnonymousClass3Tr anonymousClass3Tr) {
        if (anonymousClass3Tr.f41554F != null) {
            anonymousClass3Tr.f41553E.removeCallbacks(null);
            anonymousClass3Tr.f41554F.A(false);
            anonymousClass3Tr.f41554F = null;
        }
    }

    /* renamed from: B */
    public final boolean m19718B() {
        View view = this.f41551C;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: C */
    public final void m19719C(int i) {
        if (!this.f41556H.equals("notification_type_count")) {
            this.f41551C.setVisibility(0);
        } else if (i > 0) {
            this.f41551C.setVisibility(0);
            if (i <= 99) {
                ((TextView) this.f41551C).setText(Integer.toString(i));
            } else {
                ((TextView) this.f41551C).setText(C0164R.string.tab_max_notification_max);
            }
        }
    }

    /* renamed from: D */
    public final void m19720D(AnonymousClass176 anonymousClass176, int i, int i2, AnonymousClass2Cc anonymousClass2Cc) {
        AnonymousClass173 C = new AnonymousClass173((Activity) this.f41553E.getContext(), anonymousClass176).C(this.f41550B);
        C.f14642H = AnonymousClass177.ABOVE_ANCHOR;
        C.f14646L = true;
        C.f14648N = AnonymousClass178.f14659J;
        C.f14638D = i2;
        C.f14640F = anonymousClass2Cc;
        C.f14636B = false;
        if (this.f41556H.equals("notification_type_count")) {
            C.f14647M = this.f41557I;
        }
        this.f41554F = C.A();
        this.f41553E.postDelayed(new AnonymousClass3Tq(this), (long) i);
    }
}

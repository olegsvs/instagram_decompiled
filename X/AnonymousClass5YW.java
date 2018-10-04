package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.5YW */
public final class AnonymousClass5YW extends AnonymousClass0oo implements AnonymousClass15J, AnonymousClass0Qe, AnonymousClass4ww {
    /* renamed from: B */
    public final IgImageView f66155B;
    /* renamed from: C */
    public final ImageView f66156C;
    /* renamed from: D */
    public final TextView f66157D;
    /* renamed from: E */
    public final TextView f66158E;
    /* renamed from: F */
    public final View f66159F;
    /* renamed from: G */
    public final ImageView f66160G;
    /* renamed from: H */
    public final TextView f66161H;
    /* renamed from: I */
    public AnonymousClass2CT f66162I;
    /* renamed from: J */
    private final AnonymousClass25k f66163J;
    /* renamed from: K */
    private final AnonymousClass4wz f66164K;
    /* renamed from: L */
    private final Drawable f66165L;
    /* renamed from: M */
    private final TextView f66166M;
    /* renamed from: N */
    private AnonymousClass4wu f66167N;
    /* renamed from: O */
    private final AnonymousClass4v1 f66168O;
    /* renamed from: P */
    private final View f66169P;
    /* renamed from: Q */
    private final Drawable f66170Q;
    /* renamed from: R */
    private final TextView f66171R;
    /* renamed from: S */
    private final Runnable f66172S = new AnonymousClass4wy(this);
    /* renamed from: T */
    private Drawable f66173T;

    public final void Xq(View view) {
    }

    public AnonymousClass5YW(AspectRatioFrameLayout aspectRatioFrameLayout, AnonymousClass4wx anonymousClass4wx, AnonymousClass4wz anonymousClass4wz, AnonymousClass4wu anonymousClass4wu) {
        int i;
        super(aspectRatioFrameLayout);
        Context context = aspectRatioFrameLayout.getContext();
        this.f66167N = anonymousClass4wu;
        if (AnonymousClass4wu.TV_BROWSE.equals(this.f66167N)) {
            i = -1;
        } else {
            i = AnonymousClass0Ca.C(context, C0164R.color.blue_5);
        }
        int C = AnonymousClass0Ca.C(context, AnonymousClass5YW.m27520H(this.f66167N));
        aspectRatioFrameLayout.setAspectRatio(0.643f);
        this.f66163J = new AnonymousClass25k(context, i, C, this.f66167N != AnonymousClass4wu.FEED_TRAY);
        aspectRatioFrameLayout.setBackgroundDrawable(this.f66163J);
        this.f66164K = anonymousClass4wz;
        this.f66161H = (TextView) aspectRatioFrameLayout.findViewById(C0164R.id.username);
        TextView textView = (TextView) aspectRatioFrameLayout.findViewById(C0164R.id.item_explore_context);
        this.f66157D = textView;
        textView.setTypeface(AnonymousClass0nA.E());
        this.f66158E = (TextView) aspectRatioFrameLayout.findViewById(C0164R.id.item_title);
        this.f66155B = (IgImageView) aspectRatioFrameLayout.findViewById(C0164R.id.item_avatar);
        this.f66159F = aspectRatioFrameLayout.findViewById(C0164R.id.item_owner_info);
        this.f66169P = aspectRatioFrameLayout.findViewById(C0164R.id.progress_header);
        this.f66171R = (TextView) aspectRatioFrameLayout.findViewById(C0164R.id.progress_label);
        textView = (TextView) aspectRatioFrameLayout.findViewById(C0164R.id.failed_message);
        this.f66166M = textView;
        textView.setTypeface(AnonymousClass0nA.E());
        this.f66168O = new AnonymousClass4v1(context);
        this.f66160G = (ImageView) aspectRatioFrameLayout.findViewById(C0164R.id.progress_bar);
        this.f66156C = (ImageView) aspectRatioFrameLayout.findViewById(C0164R.id.fully_viewed);
        this.f66160G.setImageDrawable(this.f66168O);
        this.f66170Q = AnonymousClass0Ca.E(context, C0164R.drawable.progress_header_drawable);
        this.f66165L = AnonymousClass0Ca.E(context, C0164R.drawable.failed_header_drawable);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(aspectRatioFrameLayout);
        anonymousClass15z.f14392L = true;
        anonymousClass15z.f14387G = false;
        anonymousClass15z.f14386F = false;
        anonymousClass15z.f14389I = 0.95f;
        anonymousClass15z.f14385E = this;
        anonymousClass15z.A();
        anonymousClass4wx.m25473A(this);
    }

    /* renamed from: B */
    public static void m27514B(AnonymousClass5YW anonymousClass5YW, boolean z) {
        AnonymousClass5YW.m27519G(anonymousClass5YW);
        if (anonymousClass5YW.f66162I.R()) {
            int M = anonymousClass5YW.f66162I.M();
            float E = AnonymousClass0nB.E((float) M, 0.0f, 100.0f, 0.0f, 1.0f, true);
            AnonymousClass4v1 anonymousClass4v1 = anonymousClass5YW.f66168O;
            anonymousClass4v1.f58449B = AnonymousClass0Ca.C(anonymousClass4v1.f58450C, C0164R.color.black_10_transparent);
            anonymousClass4v1 = anonymousClass5YW.f66168O;
            anonymousClass4v1.f58451D = AnonymousClass0Ca.C(anonymousClass4v1.f58450C, C0164R.color.grey_9);
            anonymousClass5YW.f66168O.m25367A(E, true);
            anonymousClass5YW.f66169P.setBackgroundDrawable(anonymousClass5YW.f66170Q);
            anonymousClass5YW.f66169P.setVisibility(0);
            anonymousClass5YW.f66160G.setVisibility(0);
            anonymousClass5YW.f66171R.setVisibility(0);
            TextView textView = anonymousClass5YW.f66171R;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(M);
            stringBuilder.append("%");
            textView.setText(stringBuilder.toString());
            anonymousClass5YW.f66171R.setTextColor(-16777216);
            anonymousClass5YW.f66171R.setTypeface(AnonymousClass0nA.E());
            return;
        }
        if (!anonymousClass5YW.f66162I.V()) {
            if (!anonymousClass5YW.f66162I.U()) {
                AnonymousClass2CT anonymousClass2CT = anonymousClass5YW.f66162I;
                Object obj = (anonymousClass2CT.S() && anonymousClass2CT.f27418F.aA()) ? 1 : null;
                if (obj != null) {
                    anonymousClass5YW.f66169P.setBackgroundDrawable(anonymousClass5YW.f66165L);
                    anonymousClass5YW.f66169P.setVisibility(0);
                    anonymousClass5YW.f66166M.setVisibility(0);
                    anonymousClass5YW.f66166M.setText(C0164R.string.igtv_blocked_media_item_header);
                    return;
                }
                anonymousClass5YW.f66169P.setBackgroundDrawable(null);
                anonymousClass4v1 = anonymousClass5YW.f66168O;
                anonymousClass4v1.f58449B = AnonymousClass0Ca.C(anonymousClass4v1.f58450C, C0164R.color.black_20_transparent);
                anonymousClass4v1 = anonymousClass5YW.f66168O;
                anonymousClass4v1.f58451D = AnonymousClass0Ca.C(anonymousClass4v1.f58450C, C0164R.color.white);
                AnonymousClass5YW.m27515C(anonymousClass5YW);
                M = anonymousClass5YW.f66162I.J();
                if (anonymousClass5YW.f66162I.Q() && !z) {
                    anonymousClass5YW.f66156C.setVisibility(0);
                    anonymousClass5YW.f66160G.setVisibility(4);
                    return;
                } else if (M <= 0 || z) {
                    anonymousClass5YW.f66160G.setVisibility(4);
                    return;
                } else {
                    anonymousClass5YW.f66160G.setVisibility(0);
                    anonymousClass5YW.f66168O.m25367A(((float) M) / ((float) anonymousClass5YW.f66162I.P()), false);
                    return;
                }
            }
        }
        anonymousClass5YW.f66169P.setBackgroundDrawable(anonymousClass5YW.f66165L);
        anonymousClass5YW.f66169P.setVisibility(0);
        anonymousClass5YW.f66166M.setVisibility(0);
        anonymousClass5YW.f66166M.setText(C0164R.string.igtv_failed_to_upload_header);
    }

    /* renamed from: C */
    public static void m27515C(AnonymousClass5YW anonymousClass5YW) {
        anonymousClass5YW.f66171R.setText(AnonymousClass0dw.E((long) anonymousClass5YW.f66162I.P()));
        anonymousClass5YW.f66171R.setTextColor(-1);
        anonymousClass5YW.f66171R.setTypeface(Typeface.DEFAULT);
        anonymousClass5YW.f66171R.setVisibility(0);
    }

    public final void Cv(AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass0Sy.F(this.f66172S);
    }

    /* renamed from: D */
    public static void m27516D(AnonymousClass5YW anonymousClass5YW, AnonymousClass4wx anonymousClass4wx) {
        anonymousClass5YW.f10370B.setSelected(AnonymousClass0LQ.B(anonymousClass4wx.f58743C, anonymousClass5YW.f66162I));
        if (AnonymousClass4wu.REEL_LINK_SELECTION.equals(anonymousClass5YW.f66167N)) {
            anonymousClass5YW.f66158E.setVisibility(anonymousClass5YW.f10370B.isSelected() ? 0 : 8);
        }
    }

    /* renamed from: E */
    public static void m27517E(AnonymousClass5YW anonymousClass5YW) {
        anonymousClass5YW.f66163J.A(anonymousClass5YW.f66162I.L(anonymousClass5YW.f10370B.getContext()));
    }

    /* renamed from: F */
    public static void m27518F(AnonymousClass5YW anonymousClass5YW, AnonymousClass2CT anonymousClass2CT) {
        anonymousClass5YW.f66155B.setUrl(anonymousClass2CT.N().DQ());
        anonymousClass5YW.f66161H.setText(anonymousClass2CT.O());
        if (anonymousClass2CT.Y() && anonymousClass5YW.f66173T == null) {
            anonymousClass5YW.f66173T = AnonymousClass0Ca.E(anonymousClass5YW.f66161H.getContext(), C0164R.drawable.verified_profile);
        }
        anonymousClass5YW.f66161H.setCompoundDrawablesWithIntrinsicBounds(null, null, anonymousClass2CT.Y() ? anonymousClass5YW.f66173T : null, null);
    }

    /* renamed from: G */
    public static void m27519G(AnonymousClass5YW anonymousClass5YW) {
        anonymousClass5YW.f66169P.setVisibility(0);
        anonymousClass5YW.f66169P.setTranslationY(0.0f);
        anonymousClass5YW.f66160G.setVisibility(8);
        anonymousClass5YW.f66171R.setVisibility(8);
        anonymousClass5YW.f66166M.setVisibility(8);
        anonymousClass5YW.f66156C.setVisibility(8);
    }

    /* renamed from: H */
    private static int m27520H(AnonymousClass4wu anonymousClass4wu) {
        switch (anonymousClass4wu.ordinal()) {
            case null:
                return C0164R.color.grey_9;
            case 1:
                return C0164R.color.grey_3;
            case 2:
                return C0164R.color.grey_1;
            default:
                return -1;
        }
    }

    public final void Uf(AnonymousClass4wx anonymousClass4wx, AnonymousClass2CT anonymousClass2CT, AnonymousClass2CT anonymousClass2CT2) {
        AnonymousClass2CT anonymousClass2CT3 = this.f66162I;
        if (anonymousClass2CT3 != null) {
            if (AnonymousClass0LQ.B(anonymousClass2CT3, anonymousClass2CT) || AnonymousClass0LQ.B(this.f66162I, anonymousClass2CT2)) {
                AnonymousClass5YW.m27516D(this, anonymousClass4wx);
            }
        }
    }

    public final boolean yCA(View view) {
        return this.f66164K.Vf(this.f66162I, this, AnonymousClass0Nm.L(view));
    }
}

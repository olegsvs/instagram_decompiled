package X;

import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.4xy */
public final class AnonymousClass4xy {
    /* renamed from: B */
    public static void m25493B(AnonymousClass4xx anonymousClass4xx, AnonymousClass5Yg anonymousClass5Yg, AnonymousClass0MI anonymousClass0MI, AnonymousClass0P7 anonymousClass0P7) {
        if (anonymousClass0MI != null) {
            if (!TextUtils.isEmpty(anonymousClass0MI.D())) {
                anonymousClass4xx.f58921G.setUrl(anonymousClass0MI.D());
            }
            if (!anonymousClass0MI.F().isEmpty()) {
                anonymousClass4xx.f58922H.setVisibility(0);
                if (anonymousClass0MI.W()) {
                    anonymousClass4xx.f58922H.D();
                } else {
                    anonymousClass4xx.f58922H.B();
                }
                anonymousClass4xx.f58920F.setIconDrawable(C0164R.drawable.reel_location_branding_icon);
                anonymousClass4xx.f58917C.findViewById(C0164R.id.reel).setContentDescription(anonymousClass4xx.f58921G.getResources().getString(C0164R.string.multi_author_story_description, new Object[]{anonymousClass0MI.f3385R.getName()}));
                AnonymousClass15z anonymousClass15z = new AnonymousClass15z(anonymousClass4xx.f58923I);
                anonymousClass15z.f14393M = true;
                anonymousClass15z.f14386F = true;
                anonymousClass15z.f14385E = new AnonymousClass4xw(anonymousClass5Yg, anonymousClass0MI, anonymousClass4xx);
                anonymousClass15z.A();
                return;
            }
        } else if (anonymousClass0P7 == null || anonymousClass0P7.f() == null) {
            anonymousClass4xx.f58921G.setImageDrawable(AnonymousClass0Ca.E(anonymousClass4xx.f58921G.getContext(), C0164R.drawable.instagram_location_outline_24));
            anonymousClass4xx.f58921G.setPadding(50, 50, 50, 50);
        } else {
            anonymousClass4xx.f58921G.setUrl(anonymousClass0P7.f().C(anonymousClass4xx.f58921G.getContext()));
        }
        anonymousClass4xx.f58922H.setVisibility(8);
        anonymousClass4xx.f58920F.setVisibility(8);
    }

    /* renamed from: C */
    public static void m25494C(AnonymousClass4xx anonymousClass4xx) {
        anonymousClass4xx.f58925K.setTextColor(AnonymousClass0Ca.C(anonymousClass4xx.f58925K.getContext(), C0164R.color.black));
        anonymousClass4xx.f58924J.setTextColor(AnonymousClass0Ca.C(anonymousClass4xx.f58924J.getContext(), C0164R.color.black));
        anonymousClass4xx.f58918D.setTextColor(AnonymousClass0Ca.C(anonymousClass4xx.f58918D.getContext(), C0164R.color.black));
    }
}

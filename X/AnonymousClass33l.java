package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.33l */
public final class AnonymousClass33l implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass33m f37461B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass34t f37462C;

    public AnonymousClass33l(AnonymousClass33m anonymousClass33m, AnonymousClass34t anonymousClass34t) {
        this.f37461B = anonymousClass33m;
        this.f37462C = anonymousClass34t;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 464168147);
        AnonymousClass0IL anonymousClass0IL = this.f37461B.f37463B;
        AnonymousClass34t anonymousClass34t = this.f37462C;
        String str = anonymousClass34t.f37630E;
        boolean z = anonymousClass34t.f37628C;
        String str2 = anonymousClass34t.f37627B;
        Bundle bundle;
        if (z) {
            bundle = new Bundle();
            bundle.putString("instagram_media_id", str);
            bundle.putString("callToActionType", str2);
            AnonymousClass0Il.getInstance().newReactNativeLauncher(anonymousClass0IL.f51259I).KRA("IgPromoteAdPreviewPlacementsRoute").LSA(anonymousClass0IL.getString(C0164R.string.preview_promotion)).kQA(bundle).cVA(anonymousClass0IL.getActivity()).B();
        } else {
            String str3 = anonymousClass0IL.f51254D;
            String U = AnonymousClass35n.m18492U(anonymousClass0IL.f51252B);
            AnonymousClass2NW.ADS_MANAGER_FINISH_STEP.m15343A().F("step", "promotion_settings").F("m_pk", U).F("ad_status", AnonymousClass35n.m18482K(anonymousClass0IL.f51252B)).F("entry_point", str3).R();
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
            AnonymousClass0Ir.f2848B.A();
            bundle = new Bundle();
            bundle.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_MEDIA_ID", str);
            bundle.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_CTA_TEXT", null);
            bundle.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_SPONSORED_LABEL", true);
            bundle.putBoolean("com.instgram.android.fragment.ARGUMENTS_KEY_EXTRA_REMOVE_LOCATION", true);
            bundle.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_RESET_FEEDBACK", true);
            AnonymousClass0IL anonymousClass4E3 = new AnonymousClass4E3();
            anonymousClass4E3.setArguments(bundle);
            anonymousClass0IZ.f2754D = anonymousClass4E3;
            anonymousClass0IZ.B();
        }
        AnonymousClass0cQ.L(this, 1819755858, M);
    }
}

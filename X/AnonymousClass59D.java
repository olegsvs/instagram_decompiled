package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.59D */
public final class AnonymousClass59D {
    /* renamed from: B */
    public String f60559B;
    /* renamed from: C */
    public String f60560C;
    /* renamed from: D */
    public AnonymousClass0Qb f60561D;
    /* renamed from: E */
    public AnonymousClass0iq f60562E;
    /* renamed from: F */
    private final Activity f60563F;
    /* renamed from: G */
    private final AnonymousClass0EE f60564G;
    /* renamed from: H */
    private String f60565H;
    /* renamed from: I */
    private String f60566I;

    public AnonymousClass59D(Context context, AnonymousClass0EE anonymousClass0EE) {
        this.f60563F = (Activity) context;
        this.f60564G = anonymousClass0EE;
    }

    /* renamed from: A */
    public final void m25846A(String str, String str2) {
        if (str != null || str2 != null) {
            PackageManager packageManager = this.f60563F.getPackageManager();
            if (!str2.isEmpty()) {
                AnonymousClass0IW.T(Uri.parse(str2), this.f60563F);
                AnonymousClass3ak.B(this.f60564G, this.f60565H, this.f60566I, "link");
            } else if (AnonymousClass0EF.H(packageManager, str)) {
                AnonymousClass3ak.B(this.f60564G, this.f60565H, this.f60566I, "app");
                AnonymousClass0IW.F(packageManager.getLaunchIntentForPackage(str), this.f60563F);
            } else {
                AnonymousClass3ak.B(this.f60564G, this.f60565H, this.f60566I, "store");
                AnonymousClass0EF.R(this.f60563F, str, "app_attribution");
            }
        }
    }

    /* renamed from: B */
    public final boolean m25847B() {
        AnonymousClass0iq anonymousClass0iq = this.f60562E;
        return anonymousClass0iq != null && anonymousClass0iq.B();
    }

    /* renamed from: C */
    public final void m25848C(View view, AnonymousClass0P7 anonymousClass0P7) {
        if (anonymousClass0P7 != null) {
            AnonymousClass1M8 anonymousClass1M8 = anonymousClass0P7.mC;
            String str = anonymousClass1M8 != null ? anonymousClass1M8.f17523E : null;
            anonymousClass1M8 = anonymousClass0P7.mC;
            String str2 = anonymousClass1M8 != null ? anonymousClass1M8.f17524F : null;
            anonymousClass1M8 = anonymousClass0P7.mC;
            String str3 = anonymousClass1M8 != null ? anonymousClass1M8.f17525G : null;
            anonymousClass1M8 = anonymousClass0P7.mC;
            m25849D(view, str, str2, str3, anonymousClass1M8 != null ? anonymousClass1M8.f17522D : null);
        }
    }

    /* renamed from: D */
    public final void m25849D(View view, String str, String str2, String str3, String str4) {
        this.f60565H = str;
        this.f60566I = str2;
        this.f60559B = str3;
        this.f60560C = str4;
        AnonymousClass0NN.B("reel_viewer_app_attribution_click", this.f60564G).F("app_attribution_id", str).F("app_name", str2).R();
        AnonymousClass0ui anonymousClass1RI = new AnonymousClass1RI(this);
        Activity activity = this.f60563F;
        AnonymousClass173 anonymousClass173 = new AnonymousClass173(activity, new AnonymousClass174(activity.getString(C0164R.string.app_attribution_tooltip_message, new Object[]{this.f60566I})));
        anonymousClass173.f14639E = false;
        AnonymousClass173 C = anonymousClass173.C(view);
        C.f14642H = AnonymousClass177.BELOW_ANCHOR;
        C.f14640F = anonymousClass1RI;
        AnonymousClass0iq A = C.A();
        this.f60562E = A;
        A.C();
    }
}

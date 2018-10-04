package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;

/* renamed from: X.5mB */
public final class AnonymousClass5mB extends AnonymousClass1gE {
    /* renamed from: B */
    public final Context f68865B;
    /* renamed from: C */
    private final Resources f68866C;

    /* renamed from: B */
    public final AnonymousClass3O2 m28415B() {
        return null;
    }

    public AnonymousClass5mB(Context context, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass1ew anonymousClass1ew, AnonymousClass0nS anonymousClass0nS, AnonymousClass1gD anonymousClass1gD, AnonymousClass0PZ anonymousClass0PZ, boolean z, AnonymousClass1ex anonymousClass1ex, AnonymousClass0Cm anonymousClass0Cm) {
        super(context, anonymousClass0Ro, anonymousClass1ew, anonymousClass0nS, anonymousClass1gD, anonymousClass0PZ, z, anonymousClass1ex, anonymousClass0Cm);
        this.f68865B = context;
        this.f68866C = context.getResources();
    }

    /* renamed from: A */
    public final AnonymousClass2Hx m28414A() {
        AnonymousClass2Hx anonymousClass2Hx = new AnonymousClass2Hx();
        anonymousClass2Hx.f28599E = this.f68866C.getColor(C0164R.color.grey_9);
        if (this.f21316C) {
            anonymousClass2Hx.f28600F = C0164R.drawable.empty_state_plus;
            anonymousClass2Hx.f28608N = this.f68866C.getString(C0164R.string.self_profile_empty_header);
            anonymousClass2Hx.f28606L = this.f68866C.getString(C0164R.string.self_profile_empty_body);
            anonymousClass2Hx.f28597C = this.f68866C.getString(C0164R.string.self_profile_empty_cta);
            anonymousClass2Hx.f28598D = new AnonymousClass5mA(this);
        } else {
            anonymousClass2Hx.f28600F = C0164R.drawable.empty_state_camera;
            anonymousClass2Hx.f28608N = this.f68866C.getString(C0164R.string.no_posts_yet);
        }
        return anonymousClass2Hx;
    }
}

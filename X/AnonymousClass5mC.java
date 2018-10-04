package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.5mC */
public final class AnonymousClass5mC extends AnonymousClass1gE {
    /* renamed from: B */
    private final Context f68867B;
    /* renamed from: C */
    private final boolean f68868C;

    /* renamed from: B */
    public final AnonymousClass3O2 m28417B() {
        return null;
    }

    public AnonymousClass5mC(Context context, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass1ew anonymousClass1ew, AnonymousClass0nS anonymousClass0nS, AnonymousClass1gD anonymousClass1gD, AnonymousClass0PZ anonymousClass0PZ, boolean z, AnonymousClass1ex anonymousClass1ex, AnonymousClass0Cm anonymousClass0Cm) {
        super(context, anonymousClass0Ro, anonymousClass1ew, anonymousClass0nS, anonymousClass1gD, anonymousClass0PZ, z, anonymousClass1ex, anonymousClass0Cm);
        this.f68867B = context;
        this.f68868C = ((Boolean) AnonymousClass0CC.fl.H(anonymousClass0Cm)).booleanValue();
    }

    /* renamed from: A */
    public final AnonymousClass2Hx m28416A() {
        AnonymousClass2Hx anonymousClass2Hx = new AnonymousClass2Hx();
        anonymousClass2Hx.f28600F = C0164R.drawable.empty_state_tag;
        anonymousClass2Hx.f28599E = AnonymousClass0Ca.C(this.f68867B, C0164R.color.grey_9);
        if (this.f21316C) {
            anonymousClass2Hx.f28608N = this.f68867B.getResources().getString(this.f68868C ? C0164R.string.photos_and_videos_of_you : C0164R.string.photos_of_you);
            anonymousClass2Hx.f28606L = this.f68867B.getResources().getString(this.f68868C ? C0164R.string.photos_and_videos_of_you_empty_body : C0164R.string.photos_of_you_empty_body);
        } else {
            anonymousClass2Hx.f28608N = this.f68867B.getResources().getString(C0164R.string.photos_of_user_empty_header);
        }
        return anonymousClass2Hx;
    }
}

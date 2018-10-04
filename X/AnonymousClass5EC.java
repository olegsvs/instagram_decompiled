package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.5EC */
public final class AnonymousClass5EC extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f61410B;
    /* renamed from: C */
    private final AnonymousClass3e8 f61411C;
    /* renamed from: D */
    private final boolean f61412D;
    /* renamed from: E */
    private final boolean f61413E;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5EC(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3e8 anonymousClass3e8, boolean z) {
        this.f61410B = context;
        this.f61411C = anonymousClass3e8;
        boolean z2 = (AnonymousClass0CS.f1647R.I() || AnonymousClass0CS.f1646Q.I() || !((Boolean) AnonymousClass0CC.ac.H(anonymousClass0Cm)).booleanValue()) ? false : true;
        this.f61412D = z2;
        this.f61413E = z;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int I = AnonymousClass0cQ.I(this, 710218174);
        if (view == null) {
            view = AnonymousClass3eA.C(this.f61410B, viewGroup);
        }
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) obj4;
        AnonymousClass3eA.B((AnonymousClass3e9) view.getTag(), (Hashtag) obj3, this.f61410B, anonymousClass3du.f42934B, this.f61411C, this.f61412D, false, this.f61413E, anonymousClass3du.f42936D);
        AnonymousClass0cQ.H(this, -1607538444, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Hashtag hashtag = (Hashtag) obj;
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) obj2;
        anonymousClass0p9.A(0);
    }
}

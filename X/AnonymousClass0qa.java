package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0qa */
public final class AnonymousClass0qa extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f10975B;
    /* renamed from: C */
    public final AnonymousClass0iB f10976C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass0qa(Context context, AnonymousClass0iB anonymousClass0iB) {
        this.f10975B = context;
        this.f10976C = anonymousClass0iB;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.m5859I(this, 753780577);
        if (view == null) {
            view = AnonymousClass0tM.m8165C(this.f10975B, viewGroup);
        }
        AnonymousClass0r0 anonymousClass0r0 = (AnonymousClass0r0) obj;
        AnonymousClass0qy anonymousClass0qy = (AnonymousClass0qy) obj2;
        int I2 = AnonymousClass0cQ.m5859I(this, -1243103846);
        AnonymousClass0tM.m8164B((AnonymousClass0tN) view.getTag(), anonymousClass0r0, anonymousClass0qy, this.f10976C);
        AnonymousClass0cQ.m5858H(this, -828685849, I2);
        AnonymousClass0cQ.m5858H(this, -665732790, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0r0 anonymousClass0r0 = (AnonymousClass0r0) obj;
        AnonymousClass0qy anonymousClass0qy = (AnonymousClass0qy) obj2;
        anonymousClass0p9.m7787A(0);
    }
}

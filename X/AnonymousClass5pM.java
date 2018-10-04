package X;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5pM */
public final class AnonymousClass5pM implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fX f69219B;
    /* renamed from: C */
    public final /* synthetic */ int f69220C;
    /* renamed from: D */
    public final /* synthetic */ RecyclerView f69221D;
    /* renamed from: E */
    public final /* synthetic */ String f69222E;

    public AnonymousClass5pM(AnonymousClass1fX anonymousClass1fX, String str, RecyclerView recyclerView, int i) {
        this.f69219B = anonymousClass1fX;
        this.f69222E = str;
        this.f69221D = recyclerView;
        this.f69220C = i;
    }

    public final void run() {
        AnonymousClass0MI R = this.f69219B.f21171J.R(this.f69222E);
        List arrayList = new ArrayList();
        arrayList.add(R);
        AnonymousClass1fX.C(this.f69219B, R, arrayList, this.f69221D, this.f69220C, AnonymousClass0Qf.PROFILE_HIGHLIGHT_PERMALINK, null);
    }
}

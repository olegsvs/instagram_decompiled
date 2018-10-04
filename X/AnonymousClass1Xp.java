package X;

import android.support.v7.widget.RecyclerView;
import com.instagram.model.fbfriend.FbFriend;

/* renamed from: X.1Xp */
public final class AnonymousClass1Xp extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass0sl f19872B;
    /* renamed from: C */
    private final RecyclerView f19873C;
    /* renamed from: D */
    private final AnonymousClass0si f19874D;

    public AnonymousClass1Xp(RecyclerView recyclerView, AnonymousClass0si anonymousClass0si, AnonymousClass0sl anonymousClass0sl) {
        this.f19873C = recyclerView;
        this.f19874D = anonymousClass0si;
        this.f19872B = anonymousClass0sl;
    }

    public final /* bridge */ /* synthetic */ void Vc(Object obj) {
        AnonymousClass0sl.m8126B(this.f19872B, ((FbFriend) obj).getId(), true);
    }

    public final Class WT() {
        return FbFriend.class;
    }

    public final /* bridge */ /* synthetic */ void Yc(Object obj, int i) {
        FbFriend fbFriend = (FbFriend) obj;
        AnonymousClass0sl anonymousClass0sl = this.f19872B;
        anonymousClass0sl.f11491B.put(fbFriend.getId(), new AnonymousClass1X7(anonymousClass0sl, i, System.currentTimeMillis()));
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        FbFriend fbFriend = (FbFriend) this.f19874D.f11484E.f11147D.get(i);
        if (fbFriend != null && AnonymousClass0wg.m8435B(this.f19873C, 0.75d) && AnonymousClass0wg.m8435B(this.f19873C.getLayoutManager().mo1888O(i), 0.5d)) {
            anonymousClass0wM.sWA(fbFriend.getId(), fbFriend, i);
        }
    }
}

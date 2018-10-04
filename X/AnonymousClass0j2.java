package X;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.instagram.model.fbfriend.FbFriend;
import java.util.Set;

/* renamed from: X.0j2 */
public final class AnonymousClass0j2 {
    /* renamed from: B */
    public final AnonymousClass0EE f9016B;
    /* renamed from: C */
    public final Context f9017C;
    /* renamed from: D */
    public Set f9018D;
    /* renamed from: E */
    public final AnonymousClass0Cm f9019E;
    /* renamed from: F */
    private final FragmentActivity f9020F;

    public AnonymousClass0j2(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, FragmentActivity fragmentActivity, Context context) {
        this.f9019E = anonymousClass0Cm;
        this.f9016B = anonymousClass0EE;
        this.f9020F = fragmentActivity;
        this.f9017C = context;
    }

    /* renamed from: A */
    public final void m7062A() {
        AnonymousClass0j2.m7061B(this, AnonymousClass0mb.SEE_ALL_TAP, 0, null);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f9020F);
        anonymousClass0IZ.f2754D = AnonymousClass0IY.m2265B().m2286U(AnonymousClass0a2.m5417B(this.f9019E), AnonymousClass0iy.FEED, AnonymousClass0a2.m5424I(this.f9019E));
        anonymousClass0IZ.m2308B();
    }

    /* renamed from: B */
    public static void m7061B(AnonymousClass0j2 anonymousClass0j2, AnonymousClass0mb anonymousClass0mb, int i, FbFriend fbFriend) {
        anonymousClass0mb.m7548B(anonymousClass0j2.f9016B, fbFriend != null ? fbFriend.getId() : null, i, anonymousClass0j2.f9019E);
    }
}

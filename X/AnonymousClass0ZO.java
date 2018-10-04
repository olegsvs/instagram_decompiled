package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.model.fbfriend.FbFriend;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ZO */
public final class AnonymousClass0ZO implements AnonymousClass0G2 {
    /* renamed from: J */
    public static final long f6325J = TimeUnit.DAYS.toMillis(1);
    /* renamed from: K */
    private static final String f6326K = "FbFriendsServiceImpl";
    /* renamed from: B */
    public long f6327B = -1;
    /* renamed from: C */
    public final AnonymousClass1ae f6328C = new AnonymousClass1ae();
    /* renamed from: D */
    public final AnonymousClass1ah f6329D = new AnonymousClass1ai(this);
    /* renamed from: E */
    public final AnonymousClass1UQ f6330E;
    /* renamed from: F */
    public final AnonymousClass1ah f6331F = new AnonymousClass1ag(this);
    /* renamed from: G */
    public final AnonymousClass1af f6332G = new AnonymousClass1af();
    /* renamed from: H */
    public final AnonymousClass0Cm f6333H;
    /* renamed from: I */
    private final AnonymousClass0F8 f6334I = new AnonymousClass1aj(this);

    public AnonymousClass0ZO(AnonymousClass0Cm anonymousClass0Cm, Context context) {
        this.f6333H = anonymousClass0Cm;
        this.f6330E = new AnonymousClass1UQ(context);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass1JV.class, this.f6334I);
    }

    /* renamed from: A */
    public final synchronized void m5365A() {
        synchronized (this) {
            if (this.f6327B == -1) {
                this.f6327B = this.f6330E.m11594B(this.f6333H, -1);
            }
        }
        if ((this.f6327B < System.currentTimeMillis() ? 1 : null) != null) {
            this.f6328C.m11935A(this.f6333H, this.f6329D);
        } else {
            AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass1UR(this.f6330E, this.f6333H, this.f6331F), 117330584);
        }
    }

    /* renamed from: B */
    public static synchronized void m5363B(AnonymousClass0ZO anonymousClass0ZO, boolean z) {
        synchronized (anonymousClass0ZO) {
            anonymousClass0ZO.f6327B = -1;
            anonymousClass0ZO.f6332G.m5163B();
            if (z) {
                anonymousClass0ZO.f6330E.m11593A(anonymousClass0ZO.f6333H);
            }
        }
    }

    /* renamed from: C */
    public static synchronized void m5364C(AnonymousClass0ZO anonymousClass0ZO, List list) {
        synchronized (anonymousClass0ZO) {
            AnonymousClass0ZO.m5363B(anonymousClass0ZO, false);
            for (FbFriend fbFriend : list) {
                String str;
                StringBuilder stringBuilder;
                if (TextUtils.isEmpty(fbFriend.getId())) {
                    str = f6326K;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Server returned a Facebook Friend  with either an invalid ID: ");
                    stringBuilder.append(fbFriend.getId());
                    AnonymousClass0Gn.m1876C(str, stringBuilder.toString());
                } else if (TextUtils.isEmpty(fbFriend.f9869C)) {
                    str = f6326K;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Server returned a Facebook Friend  with either an invalid full name: ");
                    stringBuilder.append(fbFriend.f9869C);
                    AnonymousClass0Gn.m1876C(str, stringBuilder.toString());
                } else {
                    anonymousClass0ZO.f6332G.m5162A(fbFriend);
                }
            }
        }
    }

    public final synchronized void onUserSessionWillEnd(boolean z) {
        AnonymousClass1ae anonymousClass1ae = this.f6328C;
        synchronized (anonymousClass1ae) {
            if (anonymousClass1ae.f20366C != null) {
                anonymousClass1ae.f20366C.m2381A();
                anonymousClass1ae.f20366C = null;
            }
        }
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass1JV.class, this.f6334I);
        AnonymousClass0ZO.m5363B(this, z);
    }
}

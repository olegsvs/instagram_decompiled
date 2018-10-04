package X;

import java.util.ArrayList;

/* renamed from: X.2lF */
public final class AnonymousClass2lF {
    /* renamed from: B */
    public long f33443B;
    /* renamed from: C */
    public int f33444C;
    /* renamed from: D */
    public long f33445D;
    /* renamed from: E */
    public long f33446E = -1;
    /* renamed from: F */
    public boolean f33447F;
    /* renamed from: G */
    public final AnonymousClass2lE f33448G = new AnonymousClass2lE(AnonymousClass2tT.class, 10);
    /* renamed from: H */
    public ArrayList f33449H;
    /* renamed from: I */
    public int f33450I;
    /* renamed from: J */
    public final /* synthetic */ AnonymousClass2lI f33451J;

    public AnonymousClass2lF(AnonymousClass2lI anonymousClass2lI, boolean z) {
        this.f33451J = anonymousClass2lI;
    }

    /* renamed from: A */
    public final void m17077A(String str) {
        if (this.f33447F) {
            this.f33449H = null;
            this.f33447F = false;
            this.f33443B = 0;
            this.f33450I = 0;
        }
    }

    /* renamed from: B */
    public static void m17076B(AnonymousClass2lF anonymousClass2lF, long j) {
        if (anonymousClass2lF.f33451J.f33514N) {
            anonymousClass2lF.f33445D = j;
            anonymousClass2lF.f33443B = j;
            anonymousClass2lF.f33450I = 0;
            return;
        }
        if (anonymousClass2lF.f33449H.size() > 0) {
            int i = (((AnonymousClass2tT) anonymousClass2lF.f33449H.get(0)).f35446F > (((long) anonymousClass2lF.f33444C) + anonymousClass2lF.f33445D) ? 1 : (((AnonymousClass2tT) anonymousClass2lF.f33449H.get(0)).f35446F == (((long) anonymousClass2lF.f33444C) + anonymousClass2lF.f33445D) ? 0 : -1));
        }
    }
}

package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0fk */
public final class AnonymousClass0fk implements AnonymousClass0G2 {
    /* renamed from: B */
    public final List f7982B = new ArrayList();
    /* renamed from: C */
    public String f7983C;
    /* renamed from: D */
    public final Set f7984D = new HashSet();

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* renamed from: A */
    public final synchronized String m6550A() {
        String M;
        M = (this.f7982B.isEmpty() || this.f7982B == null) ? JsonProperty.USE_DEFAULT_NAME : AnonymousClass0IE.m2145M(", ", this.f7982B);
        return M;
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0fk m6549B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0fk anonymousClass0fk;
        Class cls = AnonymousClass0fk.class;
        synchronized (cls) {
            anonymousClass0fk = (AnonymousClass0fk) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0fk == null) {
                anonymousClass0fk = new AnonymousClass0fk();
                anonymousClass0Cm.m1039D(cls, anonymousClass0fk);
            }
        }
        return anonymousClass0fk;
    }

    /* renamed from: B */
    public final String m6551B() {
        if (this.f7983C == null) {
            this.f7983C = UUID.randomUUID().toString();
        }
        return this.f7983C;
    }
}

package X;

import java.util.HashMap;

/* renamed from: X.3FQ */
public final class AnonymousClass3FQ {
    /* renamed from: B */
    public HashMap f39474B = new HashMap();
    /* renamed from: C */
    public String f39475C;

    /* renamed from: A */
    public final void m19112A(String str) {
        if (!str.equals(this.f39475C)) {
            AnonymousClass3FP anonymousClass3FP = (AnonymousClass3FP) this.f39474B.get(str);
            if (anonymousClass3FP == null) {
                anonymousClass3FP = new AnonymousClass3FP();
                this.f39474B.put(str, anonymousClass3FP);
            }
            anonymousClass3FP.m19110A();
            this.f39475C = str;
        }
    }
}

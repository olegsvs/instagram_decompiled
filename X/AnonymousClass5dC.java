package X;

import java.util.HashMap;

/* renamed from: X.5dC */
public final class AnonymousClass5dC extends HashMap {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5dA f67521B;

    public AnonymousClass5dC(AnonymousClass5dE anonymousClass5dE, AnonymousClass5dA anonymousClass5dA) {
        int i;
        this.f67521B = anonymousClass5dA;
        AnonymousClass5dG anonymousClass5dG = AnonymousClass5dG.ERROR_CODE;
        AnonymousClass5dA anonymousClass5dA2 = this.f67521B;
        boolean z = false;
        if (anonymousClass5dA2 == null) {
            i = 0;
        } else {
            i = anonymousClass5dA2.m28147A();
        }
        put(anonymousClass5dG, Integer.valueOf(i));
        AnonymousClass5dG anonymousClass5dG2 = AnonymousClass5dG.CALLBACK_RESULT;
        AnonymousClass5dA anonymousClass5dA3 = this.f67521B;
        if (anonymousClass5dA3 == null || anonymousClass5dA3 == AnonymousClass5dA.SUCCESS) {
            z = true;
        }
        put(anonymousClass5dG2, Boolean.valueOf(z));
    }
}

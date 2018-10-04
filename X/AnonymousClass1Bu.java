package X;

import java.util.concurrent.Callable;

/* renamed from: X.1Bu */
public final class AnonymousClass1Bu implements Callable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass17t f15465B;

    public AnonymousClass1Bu(AnonymousClass17t anonymousClass17t) {
        this.f15465B = anonymousClass17t;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass17t anonymousClass17t = this.f15465B;
        AnonymousClass0ES anonymousClass0ES = anonymousClass17t.f14852D;
        if (anonymousClass0ES != null) {
            anonymousClass17t.f14854F.m4070A((AnonymousClass0Qu) anonymousClass0ES.get(), null);
        }
        anonymousClass17t.f14854F.m4077H("access_token", anonymousClass17t.f14850B);
        StringBuilder stringBuilder = new StringBuilder(AnonymousClass0IE.m2137E("https://graph.%s/", AnonymousClass1aX.m11930B()));
        String str = anonymousClass17t.f14851C;
        if (str != null) {
            stringBuilder.append(str);
            stringBuilder.append("/");
        }
        stringBuilder.append(anonymousClass17t.f14856H);
        String stringBuilder2 = stringBuilder.toString();
        AnonymousClass0aB anonymousClass0aB = new AnonymousClass0aB(null);
        anonymousClass0aB.f6464D = anonymousClass17t.f14853E;
        switch (anonymousClass17t.f14853E.ordinal()) {
            case 1:
                anonymousClass0aB.f6466F = stringBuilder2;
                anonymousClass0aB.f6462B = anonymousClass17t.f14854F.m4071B();
                break;
            case 3:
            case 4:
                anonymousClass0aB.f6466F = anonymousClass17t.f14854F.m4074E(stringBuilder2);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        AnonymousClass0a8 B = anonymousClass0aB.m5435B();
        AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
        anonymousClass0gN.f8152H = AnonymousClass0Qv.API;
        anonymousClass0gN.f8146B = AnonymousClass0Qw.OnScreen;
        anonymousClass0gN.f8151G = "FacebookGraphApi";
        return new AnonymousClass0aC(B, anonymousClass0gN.m6617A());
    }
}

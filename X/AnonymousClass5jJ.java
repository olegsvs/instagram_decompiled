package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5jJ */
public final class AnonymousClass5jJ {
    /* renamed from: B */
    public AnonymousClass6DR f68540B;
    /* renamed from: C */
    public AnonymousClass5jK f68541C;
    /* renamed from: D */
    public final Map f68542D = new HashMap();

    /* renamed from: B */
    public static AnonymousClass5jK m28353B(AnonymousClass5jJ anonymousClass5jJ, String str) {
        if (anonymousClass5jJ.f68541C == null) {
            AnonymousClass5jK anonymousClass5jK = new AnonymousClass5jK();
            anonymousClass5jJ.f68541C = anonymousClass5jK;
            anonymousClass5jK.f68545D = str;
        }
        return anonymousClass5jJ.f68541C;
    }

    /* renamed from: C */
    public static AnonymousClass5jL m28354C(AnonymousClass5jJ anonymousClass5jJ, String str) {
        AnonymousClass5jL anonymousClass5jL = (AnonymousClass5jL) anonymousClass5jJ.f68542D.get(str);
        if (anonymousClass5jL != null) {
            return anonymousClass5jL;
        }
        anonymousClass5jL = new AnonymousClass5jL();
        anonymousClass5jL.f68548D = str;
        anonymousClass5jJ.f68542D.put(str, anonymousClass5jL);
        return anonymousClass5jL;
    }
}

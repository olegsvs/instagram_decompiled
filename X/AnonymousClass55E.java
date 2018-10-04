package X;

/* renamed from: X.55E */
public final class AnonymousClass55E extends AnonymousClass1cR {
    /* renamed from: B */
    public final /* synthetic */ String f59966B;

    public AnonymousClass55E(int i, String str) {
        this.f59966B = str;
        super(i);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void m25679A(Object obj, Object obj2) {
        AnonymousClass0mW anonymousClass0mW = (AnonymousClass0mW) obj;
        Integer num = (Integer) obj2;
        AnonymousClass0NN F = AnonymousClass0NN.C(AnonymousClass55F.m25680B("recommended_user_impression"), this.f59966B).F("uid", anonymousClass0mW.getId()).F("view", "fullscreen").F("algorithm", anonymousClass0mW.f9803B).F("impression_uuid", anonymousClass0mW.f9810I);
        if (num != null) {
            F.B("position", num.intValue());
        }
        AnonymousClass23M.B(F);
        F.R();
    }
}

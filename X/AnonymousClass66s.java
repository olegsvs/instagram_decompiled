package X;

/* renamed from: X.66s */
public final class AnonymousClass66s extends AnonymousClass1jB {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass66u f71878B;

    public AnonymousClass66s(AnonymousClass66u anonymousClass66u, String str) {
        this.f71878B = anonymousClass66u;
        super(str);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m29046B(AnonymousClass1HO anonymousClass1HO) {
        AnonymousClass5N0 anonymousClass5N0 = (AnonymousClass5N0) anonymousClass1HO;
        switch (anonymousClass5N0.f62686B.ordinal()) {
            case 0:
                AnonymousClass6FS.m29642E(this.f71878B.f71882D, anonymousClass5N0.f62688D, AnonymousClass1R4.ACTIVE);
                return;
            case 1:
                AnonymousClass6FS anonymousClass6FS = this.f71878B.f71882D;
                String str = anonymousClass5N0.f62688D;
                if (anonymousClass5N0.f62687C >= 3000) {
                    AnonymousClass6FS.m29642E(anonymousClass6FS, str, AnonymousClass1R4.STALLED);
                }
                return;
            default:
                return;
        }
    }
}

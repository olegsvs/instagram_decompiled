package X;

import java.net.URI;

/* renamed from: X.4db */
public final class AnonymousClass4db {
    /* renamed from: B */
    public float f55859B;
    /* renamed from: C */
    public String f55860C;
    /* renamed from: D */
    public boolean f55861D;
    /* renamed from: E */
    public String f55862E;
    /* renamed from: F */
    public AnonymousClass4di f55863F;
    /* renamed from: G */
    public float f55864G;

    private AnonymousClass4db(String str, String str2, float f, float f2, boolean z, AnonymousClass4di anonymousClass4di) {
        this.f55860C = str;
        this.f55862E = str2;
        this.f55864G = f;
        this.f55859B = f2;
        this.f55861D = z;
        this.f55863F = anonymousClass4di;
    }

    /* renamed from: B */
    public static AnonymousClass4db m24617B(AnonymousClass4db anonymousClass4db) {
        return new AnonymousClass4db(anonymousClass4db.f55860C, anonymousClass4db.f55862E, anonymousClass4db.f55864G, anonymousClass4db.f55859B, true, anonymousClass4db.f55863F);
    }

    /* renamed from: C */
    public static AnonymousClass4db m24618C(String str, String str2, float f, float f2, boolean z, AnonymousClass4di anonymousClass4di) {
        URI uri = new URI(str2);
        return new AnonymousClass4db(str, new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString(), f, f2, z, anonymousClass4di);
    }
}

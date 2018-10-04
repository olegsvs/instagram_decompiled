package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.43h */
public final class AnonymousClass43h extends AnonymousClass3uE {
    /* renamed from: B */
    private final long f49133B;
    /* renamed from: C */
    private final long f49134C;
    /* renamed from: D */
    private final AnonymousClass2rs f49135D;
    /* renamed from: E */
    private final AnonymousClass3uB f49136E;

    /* renamed from: C */
    public final List mo5184C() {
        return null;
    }

    public AnonymousClass43h(String str, long j, AnonymousClass2rO anonymousClass2rO, AnonymousClass3uG anonymousClass3uG, String str2, long j2, String str3) {
        AnonymousClass2rv anonymousClass2rv = anonymousClass3uG;
        super(str, j, anonymousClass2rO, anonymousClass2rv, str2, str3);
        Uri.parse(anonymousClass3uG.f46405F);
        anonymousClass3uG = anonymousClass3uG.f46403D;
        r2.f49135D = anonymousClass3uG <= 0 ? null : new AnonymousClass2rs(anonymousClass2rv.f46405F, 0, anonymousClass2rv.f46404E, anonymousClass3uG);
        r2.f49133B = anonymousClass2rv.f46401B;
        r2.f49134C = anonymousClass2rv.f46402C;
        r2.f49136E = r2.f49135D != null ? null : new AnonymousClass3uB(new AnonymousClass2rs(anonymousClass2rv.f46405F, null, 0, j2));
    }

    /* renamed from: A */
    public final long mo5182A() {
        return this.f49133B;
    }

    /* renamed from: B */
    public final long mo5183B() {
        return this.f49134C;
    }

    /* renamed from: D */
    public final AnonymousClass2rh mo5185D() {
        return this.f49136E;
    }

    /* renamed from: E */
    public final AnonymousClass2rs mo5186E() {
        return this.f49135D;
    }
}

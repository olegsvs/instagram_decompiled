package X;

import java.util.List;

/* renamed from: X.3uE */
public abstract class AnonymousClass3uE implements AnonymousClass2rR {
    /* renamed from: B */
    public final String f46392B;
    /* renamed from: C */
    public final String f46393C;
    /* renamed from: D */
    public final AnonymousClass2rO f46394D;
    /* renamed from: E */
    public final AnonymousClass2rs f46395E;
    /* renamed from: F */
    public final long f46396F;

    /* renamed from: A */
    public abstract long mo5182A();

    /* renamed from: B */
    public abstract long mo5183B();

    /* renamed from: C */
    public abstract List mo5184C();

    /* renamed from: D */
    public abstract AnonymousClass2rh mo5185D();

    /* renamed from: E */
    public abstract AnonymousClass2rs mo5186E();

    public AnonymousClass3uE(String str, long j, AnonymousClass2rO anonymousClass2rO, AnonymousClass2rv anonymousClass2rv, String str2, String str3) {
        this.f46394D = anonymousClass2rO;
        if (str2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".");
            stringBuilder.append(anonymousClass2rO.f35068Q);
            stringBuilder.append(".");
            stringBuilder.append(j);
            str2 = stringBuilder.toString();
        }
        this.f46392B = str2;
        this.f46395E = anonymousClass2rv.mo5190A(this);
        this.f46396F = AnonymousClass2u6.m17659L(anonymousClass2rv.f35163C, 1000000, anonymousClass2rv.f35164D);
        this.f46393C = str3;
    }

    /* renamed from: B */
    public static AnonymousClass3uE m21332B(String str, long j, AnonymousClass2rO anonymousClass2rO, AnonymousClass2rv anonymousClass2rv, String str2, String str3) {
        AnonymousClass2rv anonymousClass2rv2 = anonymousClass2rv;
        String str4 = str;
        long j2 = j;
        AnonymousClass2rO anonymousClass2rO2 = anonymousClass2rO;
        String str5 = str2;
        String str6 = str3;
        if (anonymousClass2rv instanceof AnonymousClass3uG) {
            return new AnonymousClass43h(str4, j2, anonymousClass2rO2, (AnonymousClass3uG) anonymousClass2rv2, str5, -1, str6);
        }
        if (anonymousClass2rv instanceof AnonymousClass3uF) {
            return new AnonymousClass43g(str, j, anonymousClass2rO, (AnonymousClass3uF) anonymousClass2rv2, str2, str3);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public final AnonymousClass2rO IM() {
        return this.f46394D;
    }
}

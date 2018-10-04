package X;

/* renamed from: X.06c */
public final class AnonymousClass06c implements Comparable {
    /* renamed from: B */
    public final long f375B;
    /* renamed from: C */
    public final AnonymousClass0C0 f376C;

    public AnonymousClass06c(AnonymousClass0C0 anonymousClass0C0, long j) {
        this.f376C = anonymousClass0C0;
        this.f375B = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.f375B).compareTo(Long.valueOf(((AnonymousClass06c) obj).f375B));
    }
}

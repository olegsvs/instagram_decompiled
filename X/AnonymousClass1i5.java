package X;

import com.facebook.location.ImmutableLocation;
import com.facebook.location.signalpackage.LocationSignalPackage;

/* renamed from: X.1i5 */
public final class AnonymousClass1i5 implements AnonymousClass1Fs {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1G9 f21604B;
    /* renamed from: C */
    public final /* synthetic */ ImmutableLocation f21605C;
    /* renamed from: D */
    public final /* synthetic */ boolean f21606D;

    public AnonymousClass1i5(AnonymousClass1G9 anonymousClass1G9, boolean z, ImmutableLocation immutableLocation) {
        this.f21604B = anonymousClass1G9;
        this.f21606D = z;
        this.f21605C = immutableLocation;
    }

    public final void jl(Throwable th) {
        AnonymousClass47e anonymousClass47e = new AnonymousClass47e();
        anonymousClass47e.f50527L = this.f21605C;
        AnonymousClass1G9.m10427B(this.f21604B, this.f21606D, anonymousClass47e.A());
    }

    public final /* bridge */ /* synthetic */ void uBA(Object obj) {
        AnonymousClass1G9.m10427B(this.f21604B, this.f21606D, (LocationSignalPackage) obj);
    }
}

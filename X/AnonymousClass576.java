package X;

import android.os.Bundle;

/* renamed from: X.576 */
public final class AnonymousClass576 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57K f60268B;
    /* renamed from: C */
    public final /* synthetic */ String f60269C;
    /* renamed from: D */
    public final /* synthetic */ Bundle f60270D;
    /* renamed from: E */
    public final /* synthetic */ boolean f60271E;
    /* renamed from: F */
    public final /* synthetic */ boolean f60272F;
    /* renamed from: G */
    public final /* synthetic */ boolean f60273G;
    /* renamed from: H */
    public final /* synthetic */ boolean f60274H;
    /* renamed from: I */
    public final /* synthetic */ String f60275I;
    /* renamed from: J */
    public final /* synthetic */ String f60276J;

    public AnonymousClass576(AnonymousClass57K anonymousClass57K, String str, String str2, String str3, boolean z, boolean z2, boolean z3, Bundle bundle, boolean z4) {
        this.f60268B = anonymousClass57K;
        this.f60275I = str;
        this.f60276J = str2;
        this.f60269C = str3;
        this.f60271E = z;
        this.f60273G = z2;
        this.f60274H = z3;
        this.f60270D = bundle;
        this.f60272F = z4;
    }

    public final void run() {
        AnonymousClass0Op A = AnonymousClass0GO.C().A();
        String str = this.f60275I;
        String str2 = this.f60276J;
        String str3 = this.f60269C;
        boolean z = this.f60271E;
        boolean z2 = this.f60273G;
        boolean z3 = this.f60274H;
        Bundle bundle = this.f60270D;
        boolean z4 = this.f60272F;
        boolean z5 = this.f60268B.f60316T != null && this.f60268B.f60316T.isChecked();
        AnonymousClass0IL J = A.J(str, str2, str3, z, z2, z3, bundle, z4, false, z5);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f60268B.getActivity());
        anonymousClass0IZ.f2754D = J;
        anonymousClass0IZ.B();
    }
}

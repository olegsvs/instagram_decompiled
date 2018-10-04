package X;

import android.os.Bundle;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
/* renamed from: X.1EL */
public final class AnonymousClass1EL extends AnonymousClass1FJ {
    /* renamed from: B */
    public AnonymousClass0U4 f15882B;
    /* renamed from: C */
    public final AnonymousClass1FS f15883C = new AnonymousClass1FS(this);
    /* renamed from: D */
    private AnonymousClass1TB f15884D;

    /* renamed from: B */
    public static void m10187B(AnonymousClass1EL anonymousClass1EL, boolean z) {
        Boolean.valueOf(z);
        AnonymousClass0U4 anonymousClass0U4 = anonymousClass1EL.f15882B;
        if (anonymousClass0U4 != null) {
            anonymousClass0U4.f5344K.remove(anonymousClass1EL.f15883C);
            anonymousClass1EL.f15882B.f5343J.f6196C = false;
            anonymousClass1EL.f15882B = null;
        }
        AnonymousClass1TB anonymousClass1TB = anonymousClass1EL.f15884D;
        if (anonymousClass1TB != null) {
            anonymousClass1TB.Kp(z);
            anonymousClass1EL.f15884D = null;
        }
    }

    public final boolean onStartJob(int i, Bundle bundle, AnonymousClass1TB anonymousClass1TB) {
        if (!AnonymousClass0Cd.f1698B.m970N()) {
            return false;
        }
        AnonymousClass0Cm H = AnonymousClass0Ce.m951H(this);
        this.f15884D = anonymousClass1TB;
        AnonymousClass0Sy.m4438G(new AnonymousClass4i8(this, H));
        return true;
    }

    public final boolean onStopJob(int i) {
        AnonymousClass0Sy.m4437F(new AnonymousClass1SJ(this));
        return true;
    }
}

package X;

import android.hardware.Camera;
import java.util.Iterator;

/* renamed from: X.3sn */
public final class AnonymousClass3sn implements AnonymousClass2nZ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Nc f45911B;

    public AnonymousClass3sn(AnonymousClass0Nc anonymousClass0Nc) {
        this.f45911B = anonymousClass0Nc;
    }

    public final void rGA(int i, int i2, int i3, boolean z, Camera camera) {
        this.f45911B.f3601G = i;
        Iterator it = this.f45911B.f3626f.iterator();
        while (it.hasNext()) {
            ((AnonymousClass2nZ) it.next()).rGA(i, i2, i3, z, camera);
        }
    }
}

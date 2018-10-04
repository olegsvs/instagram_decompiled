package X;

import android.hardware.Camera;
import java.util.List;

/* renamed from: X.3sz */
public final class AnonymousClass3sz implements AnonymousClass2nZ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2ns f45935B;

    public AnonymousClass3sz(AnonymousClass2ns anonymousClass2ns) {
        this.f45935B = anonymousClass2ns;
    }

    public final void rGA(int i, int i2, int i3, boolean z, Camera camera) {
        this.f45935B.f34103D = i;
        List list = this.f45935B.f34107H.f34059B;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AnonymousClass2nZ) list.get(i4)).rGA(i, i2, i3, z, camera);
        }
    }
}

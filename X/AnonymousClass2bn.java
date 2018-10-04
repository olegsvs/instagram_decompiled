package X;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.2bn */
public final class AnonymousClass2bn implements AnonymousClass2I2 {
    /* renamed from: B */
    private final List f31485B;

    public AnonymousClass2bn(List list) {
        this.f31485B = list;
    }

    public final void ILA(float f, float f2) {
        for (AnonymousClass2I2 ILA : this.f31485B) {
            ILA.ILA(f, f2);
        }
    }

    public final boolean Uo(MotionEvent motionEvent) {
        for (AnonymousClass2I2 Uo : this.f31485B) {
            if (Uo.Uo(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void destroy() {
        for (AnonymousClass2I2 destroy : this.f31485B) {
            destroy.destroy();
        }
    }

    public final boolean zDA(MotionEvent motionEvent) {
        for (AnonymousClass2I2 zDA : this.f31485B) {
            if (zDA.zDA(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}

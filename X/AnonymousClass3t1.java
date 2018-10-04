package X;

import android.hardware.Camera;
import android.util.SparseArray;

/* renamed from: X.3t1 */
public final class AnonymousClass3t1 implements AnonymousClass2nz {
    /* renamed from: B */
    public final SparseArray f45970B = new SparseArray();
    /* renamed from: C */
    private final SparseArray f45971C = new SparseArray();

    /* renamed from: A */
    public final AnonymousClass3t4 m21148A(int i) {
        AnonymousClass3t4 anonymousClass3t4 = (AnonymousClass3t4) this.f45971C.get(i);
        if (anonymousClass3t4 != null) {
            return anonymousClass3t4;
        }
        throw new NullPointerException("Null features!");
    }

    /* renamed from: B */
    public static void m21146B(AnonymousClass3t1 anonymousClass3t1, Camera camera, int i, boolean z) {
        if (((AnonymousClass3t4) anonymousClass3t1.f45971C.get(i)) == null || z) {
            anonymousClass3t1.f45971C.put(i, new AnonymousClass3t4(i, camera.getParameters()));
        }
    }

    public final AnonymousClass2o2 Bc(Camera camera, AnonymousClass2nA anonymousClass2nA, AnonymousClass0Ne anonymousClass0Ne) {
        int A = anonymousClass2nA.m17176A();
        if (camera != null) {
            AnonymousClass2o2 anonymousClass2o2 = (AnonymousClass2o2) this.f45970B.get(A);
            if (anonymousClass2o2 != null) {
                if (anonymousClass2o2 instanceof AnonymousClass3t5) {
                    AnonymousClass3t5 anonymousClass3t5 = (AnonymousClass3t5) anonymousClass2o2;
                    AnonymousClass3t4 A2 = m21148A(A);
                    anonymousClass3t5.f45994G = anonymousClass0Ne;
                    anonymousClass3t5.m21154B();
                    if (anonymousClass3t5.f45992E) {
                        throw new RuntimeException("Cannot start a new modification session, previous session not yet applied.");
                    }
                    anonymousClass3t5.f45990C = camera;
                    anonymousClass3t5.mo5131C();
                    anonymousClass3t5.f45991D = A2;
                    anonymousClass3t5.f45992E = true;
                }
                return anonymousClass2o2;
            }
            throw new NullPointerException("Null Modifier!");
        }
        throw new NullPointerException("Cannot modify parameters for a null camera.");
    }

    /* renamed from: C */
    public static void m21147C(AnonymousClass3t1 anonymousClass3t1, Camera camera, int i, boolean z, boolean z2) {
        if (((AnonymousClass2o2) anonymousClass3t1.f45970B.get(i)) == null || z) {
            anonymousClass3t1.f45970B.put(i, z2 ? new AnonymousClass43U(camera, i) : new AnonymousClass3t5(camera, i));
        }
    }

    public final String CM(AnonymousClass2nA anonymousClass2nA) {
        return m21148A(anonymousClass2nA.m17176A()).f45986C.flatten();
    }

    public final AnonymousClass2o0 bJ(AnonymousClass2nA anonymousClass2nA) {
        return m21148A(anonymousClass2nA.m17176A());
    }

    public final void iHA(Camera camera, AnonymousClass2nA anonymousClass2nA, boolean z, boolean z2) {
        int A = anonymousClass2nA.m17176A();
        if (camera != null) {
            AnonymousClass3t1.m21146B(this, camera, A, z);
            AnonymousClass3t1.m21147C(this, camera, A, z, z2);
            return;
        }
        throw new NullPointerException("camera is null!");
    }

    public final AnonymousClass2o5 mR(AnonymousClass2nA anonymousClass2nA) {
        return m21148A(anonymousClass2nA.m17176A());
    }
}

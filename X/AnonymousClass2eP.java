package X;

import android.opengl.GLES20;
import java.nio.IntBuffer;

/* renamed from: X.2eP */
public final class AnonymousClass2eP extends AnonymousClass2Vg {
    /* renamed from: B */
    private final IntBuffer f31968B = IntBuffer.allocate(1);

    public AnonymousClass2eP(String str, int i, int i2) {
        super(str, i, i2, 5124);
    }

    /* renamed from: A */
    public final void mo3584A() {
        GLES20.glUniform1iv(this.f26595B, 1, this.f31968B);
    }

    /* renamed from: C */
    public final void m16749C(int i) {
        this.f31968B.put(0, i);
        m16149B();
    }
}

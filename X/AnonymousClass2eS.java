package X;

import android.opengl.GLES20;
import java.nio.IntBuffer;

/* renamed from: X.2eS */
public final class AnonymousClass2eS extends AnonymousClass2Vg {
    /* renamed from: B */
    private final IntBuffer f31971B = IntBuffer.allocate(4);

    public AnonymousClass2eS(String str, int i, int i2) {
        super(str, i, i2, 35669);
    }

    /* renamed from: A */
    public final void mo3584A() {
        GLES20.glUniform4iv(this.f26595B, 1, this.f31971B);
    }
}

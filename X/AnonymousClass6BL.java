package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;

/* renamed from: X.6BL */
public final class AnonymousClass6BL extends ShaderFactory {
    /* renamed from: B */
    public final /* synthetic */ int[] f72729B;

    public AnonymousClass6BL(int[] iArr) {
        this.f72729B = iArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f72729B, AnonymousClass6BM.f72732D, TileMode.REPEAT);
    }
}

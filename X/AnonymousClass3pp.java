package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;

/* renamed from: X.3pp */
public final class AnonymousClass3pp extends AnonymousClass1c1 implements Callback {
    /* renamed from: B */
    private final SurfaceView f45059B;

    public AnonymousClass3pp(Context context) {
        this.f45059B = new SurfaceView(context);
        this.f45059B.getHolder().addCallback(this);
    }

    /* renamed from: A */
    public final Bitmap m20833A(int i) {
        Integer.valueOf(i);
        return null;
    }

    /* renamed from: B */
    public final Surface m20834B() {
        return m20836D() ? this.f45059B.getHolder().getSurface() : null;
    }

    /* renamed from: C */
    public final View m20835C() {
        return this.f45059B;
    }

    /* renamed from: D */
    public final boolean m20836D() {
        return this.f45059B.getHolder().getSurface().isValid();
    }

    /* renamed from: F */
    public final void m20837F(Object obj) {
        ((Surface) obj).release();
    }

    /* renamed from: G */
    public final void m20838G() {
    }

    /* renamed from: H */
    public final void m20839H(AnonymousClass15o anonymousClass15o) {
    }

    /* renamed from: I */
    public final void m20840I(int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f20557B.UCA(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f20557B.MCA(surfaceHolder.getSurface(), this.f45059B.getWidth(), this.f45059B.getHeight());
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f20557B.SCA(this, surfaceHolder.getSurface())) {
            surfaceHolder.getSurface().release();
        }
    }
}

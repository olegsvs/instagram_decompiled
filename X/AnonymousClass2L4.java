package X;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.C0164R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.2L4 */
public abstract class AnonymousClass2L4 implements Runnable, Renderer {
    /* renamed from: B */
    public boolean f29198B;
    /* renamed from: C */
    public AnonymousClass2LN f29199C;
    /* renamed from: D */
    public final AnonymousClass2LE f29200D;
    /* renamed from: E */
    public AnonymousClass2cG f29201E;
    /* renamed from: F */
    public final BlockingQueue f29202F = new LinkedBlockingQueue();
    /* renamed from: G */
    public final List f29203G = Collections.synchronizedList(new ArrayList());
    /* renamed from: H */
    public AnonymousClass4Lk f29204H;
    /* renamed from: I */
    public final Handler f29205I;
    /* renamed from: J */
    private final Point f29206J = new Point(0, 0);
    /* renamed from: K */
    private final Set f29207K = new HashSet();
    /* renamed from: L */
    private int f29208L;
    /* renamed from: M */
    private long f29209M;
    /* renamed from: N */
    private final float[] f29210N = new float[16];
    /* renamed from: O */
    private final AnonymousClass2L3 f29211O;

    /* renamed from: C */
    public abstract void mo3394C();

    /* renamed from: E */
    public abstract void mo3395E();

    /* renamed from: G */
    public abstract void mo3397G();

    /* renamed from: K */
    public abstract void mo3399K();

    /* renamed from: L */
    public abstract void mo3400L(AnonymousClass2cR anonymousClass2cR);

    /* renamed from: M */
    public abstract AnonymousClass2cR mo3401M();

    /* renamed from: N */
    public abstract void mo3402N();

    public AnonymousClass2L4(AnonymousClass2LE anonymousClass2LE, AnonymousClass2L3 anonymousClass2L3) {
        this.f29200D = anonymousClass2LE;
        this.f29211O = anonymousClass2L3;
        this.f29205I = new Handler(Looper.getMainLooper());
    }

    /* renamed from: A */
    public synchronized void mo3393A(AnonymousClass2Kw anonymousClass2Kw) {
        if (this.f29199C != null && this.f29199C.isValid()) {
            this.f29199C.oMA(this.f29206J);
            this.f29199C.PPA(this.f29210N);
            this.f29207K.add(this.f29199C);
            this.f29201E = this.f29199C.jF();
            if (this.f29201E != null) {
                this.f29203G.add(this.f29201E);
                this.f29201E.tUA(anonymousClass2Kw);
                this.f29209M = anonymousClass2Kw.f29192C;
            }
        }
    }

    /* renamed from: B */
    private static int m15127B(MotionEvent motionEvent) {
        return motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
    }

    /* renamed from: B */
    public final boolean m15129B() {
        return this.f29203G.isEmpty() ^ 1;
    }

    /* renamed from: D */
    public final void m15131D(AnonymousClass2Kw anonymousClass2Kw) {
        if (this.f29201E != null && anonymousClass2Kw.f29192C > this.f29209M) {
            this.f29201E.RF(anonymousClass2Kw);
            this.f29209M = anonymousClass2Kw.f29192C;
        }
    }

    /* renamed from: F */
    public void mo3396F(AnonymousClass2Kw anonymousClass2Kw) {
        if (this.f29201E != null) {
            anonymousClass2Kw.f29192C = Math.max(anonymousClass2Kw.f29192C, this.f29209M + 1);
            this.f29201E.NH(anonymousClass2Kw);
        }
    }

    /* renamed from: H */
    public void mo3398H(MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f29208L = AnonymousClass2L4.m15127B(motionEvent);
                mo3393A(new AnonymousClass2Kw(motionEvent));
                AnonymousClass0OR.D(this.f29205I, new AnonymousClass2L1(this), 1369396005);
                return;
            case 1:
            case 3:
                if (this.f29208L == AnonymousClass2L4.m15127B(motionEvent)) {
                    mo3396F(new AnonymousClass2Kw(motionEvent));
                    AnonymousClass0OR.D(this.f29205I, new AnonymousClass2L2(this), -1107456503);
                    return;
                }
                return;
            case 2:
                if (this.f29208L == AnonymousClass2L4.m15127B(motionEvent)) {
                    int historySize = motionEvent.getHistorySize();
                    for (int i = 0; i < historySize; i++) {
                        m15131D(new AnonymousClass2Kw(motionEvent, i));
                    }
                    m15131D(new AnonymousClass2Kw(motionEvent));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: I */
    public final boolean m15136I(String str) {
        boolean z;
        synchronized (this.f29203G) {
            for (AnonymousClass2cG IJ : this.f29203G) {
                if (str.equals(IJ.IJ().JJ())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: J */
    public final boolean m15137J() {
        boolean z;
        synchronized (this.f29203G) {
            for (AnonymousClass2cG IJ : this.f29203G) {
                if (IJ.IJ().jX()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public final void onDrawFrame(GL10 gl10) {
        mo3399K();
        mo3395E();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f29206J.set(i, i2);
        gl10.glViewport(0, 0, i, i2);
        Matrix.orthoM(this.f29210N, 0, 0.0f, (float) i, (float) i2, 0.0f, -1.0f, 1.0f);
        for (AnonymousClass2LN anonymousClass2LN : this.f29207K) {
            anonymousClass2LN.PPA(this.f29210N);
            anonymousClass2LN.oMA(this.f29206J);
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.f29211O.PCA(this.f29200D);
        AnonymousClass2LE anonymousClass2LE = this.f29200D;
        AnonymousClass28h B = AnonymousClass2LJ.m15148B(anonymousClass2LE, C0164R.raw.vertex_position, C0164R.raw.fragment);
        AnonymousClass2fD.f32192E = B;
        AnonymousClass2fD.f32191D = AnonymousClass2eO.m16744D(B, "uColor");
        AnonymousClass2fD.f32194G = new AnonymousClass2LL(AnonymousClass2fD.f32192E, 8);
        AnonymousClass2fD.f32194G.m15154C("aPosition", 2, 5126, null, null);
        ByteBuffer order = ByteBuffer.allocateDirect(AnonymousClass2fD.f32195H.length * 4).order(ByteOrder.nativeOrder());
        order.asFloatBuffer().put(AnonymousClass2fD.f32195H);
        order.rewind();
        AnonymousClass2fD.f32193F = new AnonymousClass2cD(anonymousClass2LE, order);
        GLES20.glEnable(3042);
        GLES20.glDisable(2929);
    }

    public final void run() {
        AnonymousClass2LE anonymousClass2LE = this.f29200D;
        while (!anonymousClass2LE.f29223C.isEmpty()) {
            ((Runnable) anonymousClass2LE.f29223C.remove()).run();
        }
        while (!this.f29198B && !this.f29202F.isEmpty()) {
            MotionEvent motionEvent = (MotionEvent) this.f29202F.poll();
            mo3398H(motionEvent);
            motionEvent.recycle();
        }
    }
}

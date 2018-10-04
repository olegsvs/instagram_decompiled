package X;

import android.content.Context;
import android.opengl.GLES20;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.28b */
public final class AnonymousClass28b {
    /* renamed from: B */
    public EGLContext f26568B;
    /* renamed from: C */
    public final AnonymousClass28a f26569C;
    /* renamed from: D */
    public final AnonymousClass28k f26570D;
    /* renamed from: E */
    public AtomicBoolean f26571E = new AtomicBoolean(false);
    /* renamed from: F */
    private final ReentrantLock f26572F;

    public AnonymousClass28b(Context context) {
        this.f26570D = new AnonymousClass28k(context);
        this.f26569C = new AnonymousClass28a(null);
        this.f26572F = new ReentrantLock(true);
    }

    /* renamed from: A */
    public final void m14564A() {
        if (!this.f26572F.isHeldByCurrentThread()) {
            this.f26572F.lock();
            this.f26569C.m14563B();
        }
    }

    /* renamed from: B */
    public final EGLSurface m14565B(Object obj) {
        return this.f26569C.m14562A(obj);
    }

    /* renamed from: C */
    public final void m14566C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r3.f26571E;
        r1 = 1;
        r0 = 0;
        r0 = r2.compareAndSet(r1, r0);
        if (r0 == 0) goto L_0x002d;
    L_0x000a:
        r0 = r3.f26570D;
        r0.m14589A();
        r3.m14567D();
        r3 = r3.f26569C;
        r2 = r3.f26562B;	 Catch:{ Exception -> 0x002d }
        r1 = r3.f26565E;	 Catch:{ Exception -> 0x002d }
        r0 = r3.f26564D;	 Catch:{ Exception -> 0x002d }
        r2.eglDestroyContext(r1, r0);	 Catch:{ Exception -> 0x002d }
        r2 = r3.f26562B;	 Catch:{ Exception -> 0x002d }
        r1 = r3.f26565E;	 Catch:{ Exception -> 0x002d }
        r0 = r3.f26566F;	 Catch:{ Exception -> 0x002d }
        r2.eglDestroySurface(r1, r0);	 Catch:{ Exception -> 0x002d }
        r1 = r3.f26562B;	 Catch:{ Exception -> 0x002d }
        r0 = r3.f26565E;	 Catch:{ Exception -> 0x002d }
        r1.eglTerminate(r0);	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.28b.C():void");
    }

    /* renamed from: D */
    public final void m14567D() {
        if (this.f26572F.isHeldByCurrentThread()) {
            AnonymousClass28a anonymousClass28a = this.f26569C;
            EGL10 egl10 = anonymousClass28a.f26562B;
            EGLDisplay eGLDisplay = anonymousClass28a.f26565E;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                this.f26572F.unlock();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eglMakeCurrent failed ");
            stringBuilder.append(AnonymousClass28a.m14561C(anonymousClass28a.f26562B.eglGetError()));
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: E */
    public final void m14568E(Object obj) {
        AnonymousClass28a anonymousClass28a = this.f26569C;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        anonymousClass28a.f26562B = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        anonymousClass28a.f26565E = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (anonymousClass28a.f26562B.eglInitialize(anonymousClass28a.f26565E, new int[2])) {
                EGLConfig B = AnonymousClass28a.m14560B(anonymousClass28a);
                anonymousClass28a.f26563C = B;
                if (B != null) {
                    EGL10 egl102 = anonymousClass28a.f26562B;
                    EGLDisplay eGLDisplay = anonymousClass28a.f26565E;
                    int[] iArr = new int[]{12440, 2, 12344};
                    AnonymousClass28a anonymousClass28a2 = anonymousClass28a.f26567G;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, B, anonymousClass28a2 == null ? EGL10.EGL_NO_CONTEXT : anonymousClass28a2.f26564D, iArr);
                    anonymousClass28a.f26564D = eglCreateContext;
                    this.f26568B = eglCreateContext;
                    this.f26569C.f26566F = m14565B(obj);
                    GLES20.glDisable(2929);
                    this.f26571E.set(true);
                    m14564A();
                    return;
                }
                throw new RuntimeException("eglConfig not initialized");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eglInitialize failed ");
            stringBuilder.append(AnonymousClass28a.m14561C(anonymousClass28a.f26562B.eglGetError()));
            throw new RuntimeException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("eglGetDisplay failed ");
        stringBuilder.append(AnonymousClass28a.m14561C(anonymousClass28a.f26562B.eglGetError()));
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: F */
    public final boolean m14569F() {
        AnonymousClass28a anonymousClass28a = this.f26569C;
        return anonymousClass28a.f26562B.eglSwapBuffers(anonymousClass28a.f26565E, anonymousClass28a.f26566F);
    }
}

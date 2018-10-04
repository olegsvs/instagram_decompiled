package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2f0 */
public final class AnonymousClass2f0 extends AnonymousClass2Pm implements AnonymousClass2Pr, AnonymousClass2Pz {
    /* renamed from: N */
    private static final String f32130N = "DefaultPhotoOutput";
    /* renamed from: B */
    public final AnonymousClass384 f32131B;
    /* renamed from: C */
    public int f32132C;
    /* renamed from: D */
    public boolean f32133D = false;
    /* renamed from: E */
    public int f32134E;
    /* renamed from: F */
    public int f32135F;
    /* renamed from: G */
    public int f32136G;
    /* renamed from: H */
    private WeakReference f32137H = new WeakReference(null);
    /* renamed from: I */
    private AnonymousClass1sr f32138I;
    /* renamed from: J */
    private Surface f32139J;
    /* renamed from: K */
    private SurfaceTexture f32140K;
    /* renamed from: L */
    private AnonymousClass1uu f32141L;
    /* renamed from: M */
    private final ThreadPoolExecutor f32142M;

    public final AnonymousClass1sn DN() {
        return null;
    }

    public final int IR() {
        return 1;
    }

    public final String qN() {
        return "DefaultPhotoOutput";
    }

    public AnonymousClass2f0(AnonymousClass384 anonymousClass384, AnonymousClass1re anonymousClass1re, AnonymousClass2Pl anonymousClass2Pl) {
        this.f32131B = anonymousClass384;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f32142M = threadPoolExecutor;
        threadPoolExecutor.prestartCoreThread();
    }

    /* renamed from: B */
    public static void m16774B(AnonymousClass2hZ anonymousClass2hZ, Throwable th) {
        if (anonymousClass2hZ != null) {
            if (!anonymousClass2hZ.f32575D) {
                boolean z = anonymousClass2hZ.f32576E;
            }
            anonymousClass2hZ.f32573B.f32598N.m15633C(anonymousClass2hZ.f32577F);
            AnonymousClass0OR.D(anonymousClass2hZ.f32573B.f32602R, new AnonymousClass2hY(anonymousClass2hZ, th), -461036077);
            anonymousClass2hZ.f32573B.f32594J = false;
            anonymousClass2hZ.f32573B.m16945E(AnonymousClass1rs.POSTCAPTURE);
        }
    }

    /* renamed from: B */
    public final void m16778B(File file, boolean z, AnonymousClass2hZ anonymousClass2hZ) {
        if (anonymousClass2hZ == null) {
            throw new IllegalArgumentException("savePhoto must either be given a callback");
        } else if (this.f32138I != null) {
            AnonymousClass2f0.m16774B(anonymousClass2hZ, new IllegalStateException("savePhoto called while already in the process of saving"));
        } else if (file == null && z) {
            AnonymousClass2f0.m16774B(anonymousClass2hZ, new IllegalArgumentException("Either a file or bitmap (or both) should be requested."));
        } else {
            this.f32138I = new AnonymousClass1sr(file, z, anonymousClass2hZ);
            Surface surface = this.f32139J;
        }
    }

    /* renamed from: C */
    public final void m16779C(int i, int i2) {
        if (!(this.f32136G == i && this.f32132C == i2)) {
            this.f32137H = new WeakReference(null);
        }
        this.f32136G = i;
        this.f32132C = i2;
        SurfaceTexture surfaceTexture = this.f32140K;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f32136G, this.f32132C);
        }
        this.f32133D = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public static boolean m16775C(X.AnonymousClass2f0 r3, android.graphics.Bitmap r4, java.io.File r5, boolean r6) {
        /*
        r3 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x002d }
        r3.<init>(r5);	 Catch:{ IOException -> 0x002d }
        r2 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x002d }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002d }
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ IOException -> 0x002d }
        r0 = 90;
        r4.compress(r1, r0, r2);	 Catch:{ IOException -> 0x002d }
        r2.flush();	 Catch:{ IOException -> 0x002d }
        r2.close();	 Catch:{ IOException -> 0x002d }
        r3.close();	 Catch:{ IOException -> 0x002d }
        r1 = 1;
        if (r6 == 0) goto L_0x0039;
    L_0x001d:
        if (r4 == 0) goto L_0x0028;
    L_0x001f:
        r0 = r4.isRecycled();
        if (r0 != 0) goto L_0x0028;
    L_0x0025:
        r4.recycle();
    L_0x0028:
        goto L_0x0039;
    L_0x0029:
        r1 = move-exception;
        if (r6 == 0) goto L_0x0045;
    L_0x002c:
        goto L_0x003a;
    L_0x002d:
        r2 = move-exception;
        r1 = f32130N;	 Catch:{ all -> 0x0029 }
        r0 = "Unable to create FileOutputStream";
        X.AnonymousClass0Dc.G(r1, r0, r2);	 Catch:{ all -> 0x0029 }
        r1 = 0;
        if (r6 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x001d;
    L_0x0039:
        return r1;
    L_0x003a:
        if (r4 == 0) goto L_0x0045;
    L_0x003c:
        r0 = r4.isRecycled();
        if (r0 != 0) goto L_0x0045;
    L_0x0042:
        r4.recycle();
    L_0x0045:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2f0.C(X.2f0, android.graphics.Bitmap, java.io.File, boolean):boolean");
    }

    public final AnonymousClass1xq CP() {
        return AnonymousClass1xq.CAPTURE_IMAGE;
    }

    /* renamed from: D */
    private Buffer m16776D() {
        try {
            Buffer buffer = (Buffer) this.f32137H.get();
            if (buffer == null) {
                buffer = ByteBuffer.allocateDirect((this.f32136G * this.f32132C) * 4);
                this.f32137H = new WeakReference(buffer);
            }
            buffer.rewind();
            GLES20.glReadPixels(0, 0, this.f32136G, this.f32132C, 6408, 5121, buffer);
            AnonymousClass1ul.m13687C("glReadPixels");
            return buffer;
        } catch (Throwable th) {
            AnonymousClass0Dc.G(f32130N, "Unable to create ByteBuffer", th);
            return null;
        }
    }

    /* renamed from: E */
    private boolean m16777E() {
        if (!this.f32133D) {
            int i = this.f32135F;
            if (i > 0) {
                int i2 = this.f32134E;
                if (i2 > 0) {
                    m16779C(i, i2);
                    return false;
                }
            }
        }
        if (this.f32138I == null) {
            return false;
        }
        return true;
    }

    public final AnonymousClass1xp KM() {
        return AnonymousClass1xp.DEFAULT;
    }

    public final void TCA() {
        if (m16777E()) {
            AnonymousClass1sr anonymousClass1sr = this.f32138I;
            this.f32138I = null;
            Buffer D = m16776D();
            if (D == null) {
                AnonymousClass2f0.m16774B(anonymousClass1sr.f23739B, new NullPointerException("Failed to get pixels from Surface"));
            } else {
                AnonymousClass0GG.B(this.f32142M, new AnonymousClass1sq(this, anonymousClass1sr, D), 1955510137);
            }
        }
    }

    public final void destroy() {
        release();
    }

    public final int getHeight() {
        return this.f32132C;
    }

    public final int getWidth() {
        return this.f32136G;
    }

    public final AnonymousClass1y5 kQ() {
        return new AnonymousClass2SD();
    }

    public final AnonymousClass1y5 lQ() {
        return new AnonymousClass2SK();
    }

    public final void release() {
        Surface surface = this.f32139J;
        if (surface != null) {
            surface.release();
            this.f32139J = null;
        }
        SurfaceTexture surfaceTexture = this.f32140K;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f32140K = null;
        }
        AnonymousClass1uu anonymousClass1uu = this.f32141L;
        if (anonymousClass1uu != null) {
            anonymousClass1uu.m13711A();
            this.f32141L = null;
        }
        super.release();
    }

    public final void vV(AnonymousClass2Ps anonymousClass2Ps, AnonymousClass2Pt anonymousClass2Pt) {
        this.f32141L = new AnonymousClass1ut().m13709A();
        this.f32140K = new SurfaceTexture(this.f32141L.f24087C);
        Surface surface = new Surface(this.f32140K);
        this.f32139J = surface;
        anonymousClass2Ps.m15629A(this, surface);
        AnonymousClass1sr anonymousClass1sr = this.f32138I;
        int i = this.f32135F;
        if (i > 0) {
            int i2 = this.f32134E;
            if (i2 > 0) {
                m16779C(i, i2);
            }
        }
        this.f32140K.setDefaultBufferSize(this.f32136G, this.f32132C);
    }
}

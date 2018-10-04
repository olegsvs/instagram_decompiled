package X;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3zu */
public final class AnonymousClass3zu {
    /* renamed from: L */
    public static final Handler f48114L = new Handler(Looper.getMainLooper());
    /* renamed from: B */
    public double[] f48115B;
    /* renamed from: C */
    public final ThreadPoolExecutor f48116C = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    /* renamed from: D */
    public double[] f48117D;
    /* renamed from: E */
    public MediaMetadataRetriever f48118E;
    /* renamed from: F */
    public final LruCache f48119F = new AnonymousClass3IX(this, this.f48121H);
    /* renamed from: G */
    public AnonymousClass3Ib f48120G;
    /* renamed from: H */
    private final int f48121H = ((int) (Runtime.getRuntime().maxMemory() / 10));
    /* renamed from: I */
    private int f48122I;
    /* renamed from: J */
    private int f48123J;
    /* renamed from: K */
    private AnonymousClass1Km f48124K;

    public AnonymousClass3zu(AnonymousClass1Km anonymousClass1Km, int i, int i2) {
        this.f48124K = anonymousClass1Km;
        this.f48123J = i;
        this.f48122I = i2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f48118E = mediaMetadataRetriever;
        mediaMetadataRetriever.setDataSource(this.f48124K.f17222S);
    }

    /* renamed from: A */
    public final void m21955A() {
        this.f48116C.getQueue().clear();
        f48114L.removeCallbacksAndMessages(null);
    }

    /* renamed from: B */
    public static Bitmap m21954B(AnonymousClass3zu anonymousClass3zu, long j) {
        int i;
        Throwable e;
        Bitmap K;
        Bitmap bitmap = (Bitmap) anonymousClass3zu.f48119F.get(Long.valueOf(j));
        if (bitmap == null) {
            bitmap = anonymousClass3zu.f48118E.getFrameAtTime(j, 2);
            if (bitmap != null) {
                int min = Math.min(bitmap.getHeight() / anonymousClass3zu.f48122I, bitmap.getWidth() / anonymousClass3zu.f48123J);
                if (min == 0) {
                    min = 1;
                }
                boolean z = false;
                if (anonymousClass3zu.f48124K.f17207D != -1) {
                    try {
                        int i2 = anonymousClass3zu.f48124K.f17207D;
                        CameraInfo cameraInfo = new CameraInfo();
                        Camera.getCameraInfo(i2, cameraInfo);
                        i = cameraInfo.orientation;
                        try {
                            if (cameraInfo.facing == 1) {
                                z = true;
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            AnonymousClass0Gn.G("getCroppedBitmap().getCameraInfo() failed", e);
                            K = AnonymousClass0rm.K(bitmap, bitmap.getWidth() / min, bitmap.getHeight() / min, i, z);
                            anonymousClass3zu.f48119F.put(Long.valueOf(j), K);
                            return K;
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        i = 0;
                        AnonymousClass0Gn.G("getCroppedBitmap().getCameraInfo() failed", e);
                        K = AnonymousClass0rm.K(bitmap, bitmap.getWidth() / min, bitmap.getHeight() / min, i, z);
                        anonymousClass3zu.f48119F.put(Long.valueOf(j), K);
                        return K;
                    }
                }
                i = 0;
                K = AnonymousClass0rm.K(bitmap, bitmap.getWidth() / min, bitmap.getHeight() / min, i, z);
                anonymousClass3zu.f48119F.put(Long.valueOf(j), K);
                return K;
            }
        }
        return bitmap;
    }

    /* renamed from: B */
    public final void m21956B(AnonymousClass3Ia anonymousClass3Ia) {
        int i;
        if (anonymousClass3Ia.f39949F < anonymousClass3Ia.f39945B) {
            for (i = anonymousClass3Ia.f39949F; i <= anonymousClass3Ia.f39945B; i++) {
                AnonymousClass0GG.B(this.f48116C, new AnonymousClass3IZ(this, i, anonymousClass3Ia), -38326630);
            }
            return;
        }
        for (i = anonymousClass3Ia.f39945B; i >= anonymousClass3Ia.f39949F; i--) {
            AnonymousClass0GG.B(this.f48116C, new AnonymousClass3IZ(this, i, anonymousClass3Ia), -38326630);
        }
    }

    /* renamed from: C */
    public final void m21957C() {
        double[] dArr = this.f48115B;
        if (dArr != null) {
            this.f48120G.hCA(dArr);
        } else {
            new AnonymousClass3IW(new File(this.f48124K.f17222S), this, this.f48124K.f17216M).B(new Void[0]);
        }
    }

    /* renamed from: D */
    public final void m21958D(double[] dArr) {
        this.f48117D = dArr;
        m21955A();
    }
}

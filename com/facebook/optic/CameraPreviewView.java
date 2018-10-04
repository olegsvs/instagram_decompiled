package com.facebook.optic;

import X.AnonymousClass0Nc;
import X.AnonymousClass0cQ;
import X.AnonymousClass2mb;
import X.AnonymousClass2mc;
import X.AnonymousClass2my;
import X.AnonymousClass2nA;
import X.AnonymousClass2nC;
import X.AnonymousClass2nG;
import X.AnonymousClass2nJ;
import X.AnonymousClass2nK;
import X.AnonymousClass2nL;
import X.AnonymousClass2nM;
import X.AnonymousClass2nN;
import X.AnonymousClass2nO;
import X.AnonymousClass2nP;
import X.AnonymousClass2nV;
import X.AnonymousClass2nY;
import X.AnonymousClass2nb;
import X.AnonymousClass2nf;
import X.AnonymousClass2ng;
import X.AnonymousClass2nk;
import X.AnonymousClass2nn;
import X.AnonymousClass2no;
import X.AnonymousClass3sq;
import X.AnonymousClass3sr;
import X.AnonymousClass3ss;
import X.AnonymousClass3sw;
import X.AnonymousClass3sx;
import X.AnonymousClass3xF;
import X.AnonymousClass3xG;
import X.AnonymousClass43I;
import X.AnonymousClass43R;
import X.AnonymousClass43S;
import X.AnonymousClass5en;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

public class CameraPreviewView extends TextureView implements SurfaceTextureListener {
    /* renamed from: g */
    public static final String f34027g = "CameraPreviewView";
    /* renamed from: B */
    public AnonymousClass2nG f34028B;
    /* renamed from: C */
    public AnonymousClass2nL f34029C;
    /* renamed from: D */
    public int f34030D;
    /* renamed from: E */
    public boolean f34031E;
    /* renamed from: F */
    public OrientationEventListener f34032F;
    /* renamed from: G */
    public AnonymousClass2nP f34033G;
    /* renamed from: H */
    public int f34034H;
    /* renamed from: I */
    public AnonymousClass2no f34035I;
    /* renamed from: J */
    public int f34036J;
    /* renamed from: K */
    public Matrix f34037K;
    /* renamed from: L */
    private float f34038L;
    /* renamed from: M */
    private GestureDetector f34039M;
    /* renamed from: N */
    private boolean f34040N;
    /* renamed from: O */
    private AnonymousClass2nA f34041O;
    /* renamed from: P */
    private AnonymousClass2nN f34042P;
    /* renamed from: Q */
    private AnonymousClass2nO f34043Q;
    /* renamed from: R */
    private AnonymousClass2nC f34044R;
    /* renamed from: S */
    private final CopyOnWriteArraySet f34045S;
    /* renamed from: T */
    private String f34046T;
    /* renamed from: U */
    private float f34047U;
    /* renamed from: V */
    private ScaleGestureDetector f34048V;
    /* renamed from: W */
    private int f34049W;
    /* renamed from: X */
    private boolean f34050X;
    /* renamed from: Y */
    private UUID f34051Y;
    /* renamed from: Z */
    private boolean f34052Z;
    /* renamed from: a */
    private boolean f34053a;
    /* renamed from: b */
    private AnonymousClass2nn f34054b;
    /* renamed from: c */
    private AnonymousClass3ss f34055c;
    /* renamed from: d */
    private boolean f34056d;
    /* renamed from: e */
    private boolean f34057e;
    /* renamed from: f */
    private AnonymousClass2nC f34058f;

    public CameraPreviewView(Context context) {
        this(context, null);
    }

    public CameraPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34032F = null;
        this.f34033G = null;
        this.f34041O = AnonymousClass2nA.BACK;
        boolean z = true;
        this.f34057e = true;
        this.f34040N = true;
        this.f34056d = false;
        this.f34054b = new AnonymousClass3sr();
        this.f34045S = new CopyOnWriteArraySet();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass5en.CameraPreviewView, 0, 0);
        try {
            this.f34058f = AnonymousClass2nC.m17179B(obtainStyledAttributes.getInt(5, 0));
            this.f34044R = AnonymousClass2nC.m17179B(obtainStyledAttributes.getInt(3, 0));
            this.f34031E = obtainStyledAttributes.getBoolean(0, true);
            setInitialCameraFacing(AnonymousClass2nA.m17174C(obtainStyledAttributes.getInt(1, AnonymousClass2nA.BACK.f33989B)));
            int i2 = obtainStyledAttributes.getInt(4, 3);
            this.f34052Z = (i2 & 1) == 1;
            if ((i2 & 2) != 2) {
                z = false;
            }
            this.f34053a = z;
            setMediaOrientationLocked(obtainStyledAttributes.getBoolean(2, false));
            setSurfaceTextureListener(this);
            this.f34039M = new GestureDetector(context, new AnonymousClass2nK(this));
            this.f34048V = new ScaleGestureDetector(context, new AnonymousClass2nM(this));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public final void m17189A(float f, float f2) {
        Matrix matrix = this.f34037K;
        if (matrix != null) {
            AnonymousClass0Nc D;
            int i;
            int i2;
            Rect rect;
            float[] fArr = new float[]{f, f2};
            matrix.mapPoints(fArr);
            if (this.f34053a) {
                D = AnonymousClass0Nc.D();
                i = (int) fArr[0];
                i2 = (int) fArr[1];
                rect = new Rect(i, i2, i, i2);
                rect.inset(-30, -30);
                D.f3636p.B(new AnonymousClass2mb(D, rect), "spot_meter");
            }
            if (this.f34052Z) {
                D = AnonymousClass0Nc.D();
                i = (int) fArr[0];
                i2 = (int) fArr[1];
                rect = new Rect(i, i2, i, i2);
                rect.inset(-30, -30);
                D.f3636p.C(new AnonymousClass2mc(D, rect), "focus", new AnonymousClass43I(D));
            }
        }
    }

    /* renamed from: B */
    public final void m17190B() {
        AnonymousClass0Nc.D().N("openCamera", this);
        if (this.f34035I == null) {
            this.f34035I = new AnonymousClass3sx(getSurfaceTexture());
        }
        this.f34028B = new AnonymousClass2nG(this.f34036J, this.f34034H);
        this.f34055c = new AnonymousClass3ss(this.f34044R, this.f34058f, this.f34054b);
        AnonymousClass0Nc D = AnonymousClass0Nc.D();
        float f = this.f34038L;
        float f2 = this.f34047U;
        D.f3602H = f;
        D.f3603I = f2;
        this.f34051Y = D.V(this.f34046T, this.f34041O, this.f34055c, this.f34028B, this.f34035I, getDisplayRotation(this), new AnonymousClass43R(this));
        this.f34035I.hy(getSurfaceTexture(), this.f34036J, this.f34034H);
    }

    /* renamed from: B */
    public static void m17185B(CameraPreviewView cameraPreviewView) {
        if ((cameraPreviewView.getContext() instanceof Activity) && cameraPreviewView.f34050X) {
            ((Activity) cameraPreviewView.getContext()).setRequestedOrientation(cameraPreviewView.f34049W);
            cameraPreviewView.f34050X = false;
        }
    }

    /* renamed from: C */
    public static void m17186C(CameraPreviewView cameraPreviewView, int i) {
        cameraPreviewView.f34030D = i;
        AnonymousClass0Nc.D().W(i, new AnonymousClass43S(cameraPreviewView));
    }

    /* renamed from: C */
    public final void m17191C(float[] fArr) {
        if (this.f34037K != null) {
            Matrix matrix = new Matrix();
            this.f34037K.invert(matrix);
            matrix.mapPoints(fArr);
        }
    }

    /* renamed from: D */
    public final void m17192D() {
        AnonymousClass0Nc.D().N("releaseCamera", this);
        AnonymousClass0Nc.D().P(this.f34051Y, getSurfaceTexture());
    }

    /* renamed from: D */
    public static void m17187D(CameraPreviewView cameraPreviewView, int i, int i2, int i3, int i4) {
        Iterator it = cameraPreviewView.f34045S.iterator();
        while (it.hasNext()) {
            ((AnonymousClass2ng) it.next()).onDimensionsSet(i3, i4, AnonymousClass0Nc.D().F());
        }
        Matrix transform = cameraPreviewView.getTransform(new Matrix());
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = f / f2;
        int F = AnonymousClass0Nc.D().F();
        if (F == 90 || F == 270) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        float f4 = (float) i3;
        float f5 = (float) i4;
        float f6 = f4 / f5 > f3 ? f2 / f5 : f / f4;
        transform.setScale((f4 / f) * f6, (f5 / f2) * f6, (float) (i / 2), (float) (i2 / 2));
        if (cameraPreviewView.f34057e) {
            cameraPreviewView.setTransform(transform);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) cameraPreviewView.getWidth(), (float) cameraPreviewView.getHeight());
        transform.mapRect(rectF);
        Matrix matrix = new Matrix();
        matrix.setScale(AnonymousClass0Nc.D().f3598D == AnonymousClass2nA.FRONT ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate((float) AnonymousClass0Nc.D().F());
        transform = new Matrix();
        transform.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), rectF, ScaleToFit.FILL);
        matrix.setConcat(transform, matrix);
        Matrix matrix2 = new Matrix();
        cameraPreviewView.f34037K = matrix2;
        matrix.invert(matrix2);
    }

    /* renamed from: E */
    private void m17188E() {
        if (!this.f34050X) {
            if (getContext() instanceof Activity) {
                Activity activity = (Activity) getContext();
                this.f34049W = activity.getRequestedOrientation();
                int displayRotation = getDisplayRotation(this);
                if (displayRotation == 0) {
                    activity.setRequestedOrientation(1);
                } else if (displayRotation == 1) {
                    activity.setRequestedOrientation(0);
                } else if (displayRotation == 3) {
                    activity.setRequestedOrientation(8);
                }
                this.f34050X = true;
            }
        }
    }

    /* renamed from: E */
    public final void m17193E(AnonymousClass3sw anonymousClass3sw, String str) {
        m17188E();
        AnonymousClass0Nc.Q(AnonymousClass0Nc.D(), anonymousClass3sw, str, null);
    }

    public AnonymousClass2nA getCameraFacing() {
        return AnonymousClass0Nc.D().f3598D;
    }

    public int getCurrentZoomLevel() {
        return AnonymousClass0Nc.D().G();
    }

    public static int getDisplayRotation(CameraPreviewView cameraPreviewView) {
        return ((WindowManager) cameraPreviewView.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public String getFlashMode() {
        return AnonymousClass0Nc.D().H();
    }

    public AnonymousClass2nA getInitialCameraFacing() {
        return this.f34041O;
    }

    public int getMaxZoomLevel() {
        return AnonymousClass0Nc.D().f3623c;
    }

    public Bitmap getPreviewFrame() {
        return getBitmap();
    }

    public UUID getSessionId() {
        return this.f34051Y;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1635036473);
        super.onAttachedToWindow();
        Context context = getContext();
        if (this.f34032F == null) {
            this.f34032F = new AnonymousClass2nJ(this, context);
        }
        if (this.f34032F.canDetectOrientation()) {
            this.f34032F.enable();
        }
        AnonymousClass0cQ.O(this, -1855641872, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -529818320);
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.f34032F;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        setCameraInitialisedCallback(null);
        setFocusCallbackListener(null);
        AnonymousClass0cQ.O(this, 284104733, N);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f34036J = i;
        this.f34034H = i2;
        if (this.f34040N) {
            m17190B();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m17192D();
        AnonymousClass2no anonymousClass2no = this.f34035I;
        if (anonymousClass2no != null) {
            anonymousClass2no.iy(surfaceTexture);
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f34036J = i;
        this.f34034H = i2;
        if (this.f34040N) {
            this.f34035I.gy(i, i2);
            m17186C(this, getDisplayRotation(this));
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AnonymousClass2nO anonymousClass2nO = this.f34043Q;
        if (anonymousClass2nO != null) {
            anonymousClass2nO.WCA();
            this.f34043Q = null;
        }
        AnonymousClass2nk anonymousClass2nk = AnonymousClass0Nc.D().f3628h.f34083D;
        anonymousClass2nk.f34087B.lock();
        try {
            Object obj;
            if (anonymousClass2nk.m17209C() || anonymousClass2nk.m17207A()) {
                obj = null;
            } else {
                anonymousClass2nk.f34088C |= 2;
                obj = 1;
            }
            anonymousClass2nk.f34087B.unlock();
            if (obj != null) {
                AnonymousClass2nN anonymousClass2nN = this.f34042P;
                if (anonymousClass2nN != null) {
                    anonymousClass2nN.rw();
                }
            }
            AnonymousClass2nb.m17197B().m17197B();
        } catch (Throwable th) {
            anonymousClass2nk.f34087B.unlock();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1930103679);
        boolean z = false;
        if (this.f34056d) {
            boolean onTouchEvent = this.f34039M.onTouchEvent(motionEvent);
            boolean onTouchEvent2 = this.f34048V.onTouchEvent(motionEvent);
            if (onTouchEvent || onTouchEvent2) {
                z = true;
            }
            AnonymousClass0cQ.L(this, -1431285821, M);
            return z;
        }
        AnonymousClass0cQ.L(this, -427839286, M);
        return false;
    }

    public void setCameraInitialisedCallback(AnonymousClass2nL anonymousClass2nL) {
        if (AnonymousClass0Nc.D().L() && anonymousClass2nL != null) {
            anonymousClass2nL.jD();
        }
        synchronized (this) {
            this.f34029C = anonymousClass2nL;
        }
    }

    public void setFaceDetectionEnabled(boolean z) {
        AnonymousClass0Nc.D().T(z);
    }

    public void setFlashMode(String str, AnonymousClass3sw anonymousClass3sw) {
        AnonymousClass0Nc D = AnonymousClass0Nc.D();
        D.f3636p.C(new AnonymousClass2my(D, str), "set_flash", anonymousClass3sw);
    }

    public void setFocusCallbackListener(AnonymousClass2nV anonymousClass2nV) {
        if (anonymousClass2nV == null) {
            AnonymousClass0Nc.D().f3610P = null;
            return;
        }
        AnonymousClass0Nc.D().f3610P = new AnonymousClass3sq(this, anonymousClass2nV);
    }

    public void setInitCameraOnSurfaceTextureAvailable(boolean z) {
        this.f34040N = z;
    }

    public void setInitialCameraFacing(AnonymousClass2nA anonymousClass2nA) {
        this.f34041O = anonymousClass2nA;
    }

    public void setMediaOrientationLocked(boolean z) {
        AnonymousClass0Nc D = AnonymousClass0Nc.D();
        D.f3616V = z;
        if (z) {
            D.f3627g = 0;
        }
    }

    public void setOnPreviewRenderingStartedListener(AnonymousClass2nN anonymousClass2nN) {
        this.f34042P = anonymousClass2nN;
    }

    public void setOnPreviewStartedListener(AnonymousClass3xG anonymousClass3xG) {
        AnonymousClass2nf anonymousClass2nf = AnonymousClass0Nc.D().f3628h;
        anonymousClass2nf.f34081B = anonymousClass3xG;
        if (anonymousClass3xG != null) {
            anonymousClass2nf.f34083D.f34087B.lock();
            try {
                if (anonymousClass2nf.f34083D.m17208B()) {
                    AnonymousClass3xG anonymousClass3xG2 = anonymousClass2nf.f34081B;
                    anonymousClass3xG2.f47379B.mo5412f(new AnonymousClass3xF(anonymousClass3xG2));
                }
                anonymousClass2nf.f34083D.m17211E();
            } catch (Throwable th) {
                anonymousClass2nf.f34083D.m17211E();
            }
        }
    }

    public void setOnPreviewStoppedListener(AnonymousClass2nY anonymousClass2nY) {
        AnonymousClass0Nc.D().f3628h.f34082C = anonymousClass2nY;
    }

    public void setOnSurfaceTextureUpdatedListener(AnonymousClass2nO anonymousClass2nO) {
        this.f34043Q = anonymousClass2nO;
    }

    public void setPinchZoomListener(AnonymousClass2nP anonymousClass2nP) {
        this.f34033G = anonymousClass2nP;
    }

    public void setProductName(String str) {
        this.f34046T = str;
    }

    public void setSizeSetter(AnonymousClass2nn anonymousClass2nn) {
        this.f34054b = anonymousClass2nn;
    }

    public void setSurfacePipeCoordinator(AnonymousClass2no anonymousClass2no) {
        this.f34035I = anonymousClass2no;
    }

    public void setTouchEnabled(boolean z) {
        this.f34056d = z;
    }

    public void setTransformMatrixEnabled(boolean z) {
        this.f34057e = z;
    }

    public void setZoomLevel(int i) {
        AnonymousClass0Nc.D().X(i);
    }
}

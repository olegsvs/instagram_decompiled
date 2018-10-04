package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.WindowManager;
import com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper;

/* renamed from: X.2iA */
public final class AnonymousClass2iA {
    /* renamed from: B */
    public final Sensor f32751B;
    /* renamed from: C */
    public final SensorEventListener f32752C;
    /* renamed from: D */
    public boolean f32753D;
    /* renamed from: E */
    public final Sensor f32754E;
    /* renamed from: F */
    public final SensorEventListener f32755F;
    /* renamed from: G */
    public boolean f32756G;
    /* renamed from: H */
    public MotionDataSourceWrapper f32757H = this;
    /* renamed from: I */
    public final Sensor f32758I;
    /* renamed from: J */
    public final SensorEventListener f32759J;
    /* renamed from: K */
    public final Sensor f32760K;
    /* renamed from: L */
    public final SensorEventListener f32761L;
    /* renamed from: M */
    public final Sensor f32762M;
    /* renamed from: N */
    public final SensorEventListener f32763N;
    /* renamed from: O */
    public int f32764O;
    /* renamed from: P */
    public final Sensor f32765P;
    /* renamed from: Q */
    public final SensorEventListener f32766Q;
    /* renamed from: R */
    public final Sensor f32767R;
    /* renamed from: S */
    public final SensorEventListener f32768S;
    /* renamed from: T */
    public final int f32769T;
    /* renamed from: U */
    public final SensorManager f32770U;
    /* renamed from: V */
    private final float[] f32771V;
    /* renamed from: W */
    private final float[] f32772W;
    /* renamed from: X */
    private final float[] f32773X;
    /* renamed from: Y */
    private float f32774Y;
    /* renamed from: Z */
    private final float[] f32775Z;
    /* renamed from: a */
    private final float[] f32776a;
    /* renamed from: b */
    private final float[] f32777b;
    /* renamed from: c */
    private double f32778c;
    /* renamed from: d */
    private final WindowManager f32779d;

    public AnonymousClass2iA(Context context) {
        this(context, 1, false);
    }

    public AnonymousClass2iA(Context context, int i, boolean z) {
        this.f32776a = new float[16];
        this.f32773X = new float[16];
        this.f32775Z = new float[16];
        this.f32771V = new float[3];
        this.f32772W = new float[3];
        this.f32777b = new float[3];
        this.f32756G = false;
        this.f32753D = false;
        this.f32768S = new AnonymousClass2i3(this);
        this.f32752C = new AnonymousClass2i4(this);
        this.f32755F = new AnonymousClass2i5(this);
        this.f32766Q = new AnonymousClass2i6(this);
        this.f32759J = new AnonymousClass2i7(this);
        this.f32761L = new AnonymousClass2i8(this);
        this.f32763N = new AnonymousClass2i9(this);
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f32770U = sensorManager;
        if (sensorManager != null) {
            Sensor defaultSensor = this.f32770U.getDefaultSensor(15);
            if (defaultSensor == null) {
                defaultSensor = this.f32770U.getDefaultSensor(11);
            }
            this.f32767R = defaultSensor;
            this.f32751B = this.f32770U.getDefaultSensor(1);
            this.f32754E = this.f32770U.getDefaultSensor(9);
            this.f32765P = this.f32770U.getDefaultSensor(4);
            if (z) {
                Sensor sensor = this.f32751B;
                defaultSensor = this.f32770U.getDefaultSensor(35);
                if (defaultSensor != null) {
                    sensor = defaultSensor;
                }
                this.f32758I = sensor;
                this.f32760K = this.f32770U.getDefaultSensor(16);
                this.f32762M = this.f32770U.getDefaultSensor(14);
            } else {
                this.f32758I = null;
                this.f32760K = null;
                this.f32762M = null;
            }
        } else {
            this.f32767R = null;
            this.f32751B = null;
            this.f32754E = null;
            this.f32765P = null;
            this.f32758I = null;
            this.f32760K = null;
            this.f32762M = null;
        }
        this.f32779d = (WindowManager) context.getSystemService("window");
        this.f32769T = i;
        Matrix.setIdentityM(this.f32776a, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final boolean m16974A(int r3) {
        /*
        r2 = this;
        r1 = 1;
        r0 = 0;
        switch(r3) {
            case 0: goto L_0x0017;
            case 1: goto L_0x0012;
            case 2: goto L_0x000d;
            case 3: goto L_0x0006;
            default: goto L_0x0005;
        };
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = r2.f32765P;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x000c;
    L_0x000b:
        r1 = 0;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r2.f32754E;
        if (r0 == 0) goto L_0x000b;
    L_0x0011:
        goto L_0x000c;
    L_0x0012:
        r0 = r2.f32751B;
        if (r0 == 0) goto L_0x000b;
    L_0x0016:
        goto L_0x000c;
    L_0x0017:
        r0 = r2.f32767R;
        if (r0 == 0) goto L_0x000b;
    L_0x001b:
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2iA.A(int):boolean");
    }

    /* renamed from: B */
    public static synchronized void m16969B(AnonymousClass2iA anonymousClass2iA, SensorEvent sensorEvent) {
        synchronized (anonymousClass2iA) {
            if (anonymousClass2iA.f32753D) {
                if (sensorEvent.sensor.getType() == 1) {
                    anonymousClass2iA.f32771V[0] = sensorEvent.values[0];
                    anonymousClass2iA.f32771V[1] = sensorEvent.values[1];
                    anonymousClass2iA.f32771V[2] = sensorEvent.values[2];
                    anonymousClass2iA.f32778c = (double) sensorEvent.timestamp;
                }
            }
        }
    }

    /* renamed from: C */
    public static synchronized void m16970C(AnonymousClass2iA anonymousClass2iA, SensorEvent sensorEvent) {
        synchronized (anonymousClass2iA) {
            if (anonymousClass2iA.f32753D) {
                if (sensorEvent.sensor.getType() == 9) {
                    anonymousClass2iA.f32772W[0] = sensorEvent.values[0];
                    anonymousClass2iA.f32772W[1] = sensorEvent.values[1];
                    anonymousClass2iA.f32772W[2] = sensorEvent.values[2];
                    anonymousClass2iA.f32778c = (double) sensorEvent.timestamp;
                }
            }
        }
    }

    /* renamed from: D */
    public static synchronized void m16971D(AnonymousClass2iA anonymousClass2iA, SensorEvent sensorEvent) {
        synchronized (anonymousClass2iA) {
            if (anonymousClass2iA.f32753D) {
                if (sensorEvent.sensor.getType() == 4) {
                    anonymousClass2iA.f32777b[0] = sensorEvent.values[0];
                    anonymousClass2iA.f32777b[1] = sensorEvent.values[1];
                    anonymousClass2iA.f32777b[2] = sensorEvent.values[2];
                    anonymousClass2iA.f32778c = (double) sensorEvent.timestamp;
                }
            }
        }
    }

    /* renamed from: E */
    public static synchronized void m16972E(AnonymousClass2iA anonymousClass2iA, SensorEvent sensorEvent) {
        synchronized (anonymousClass2iA) {
            if (anonymousClass2iA.f32753D) {
                if (sensorEvent.sensor.getType() == 11 || sensorEvent.sensor.getType() == 15) {
                    SensorManager.getRotationMatrixFromVector(anonymousClass2iA.f32773X, sensorEvent.values);
                    int rotation = anonymousClass2iA.f32779d.getDefaultDisplay().getRotation();
                    float[] fArr = anonymousClass2iA.f32773X;
                    float[] fArr2 = anonymousClass2iA.f32775Z;
                    int i = 131;
                    int i2 = 129;
                    switch (rotation) {
                        case 1:
                            i = 3;
                            break;
                        case 2:
                            i = 129;
                            i2 = 131;
                            break;
                        case 3:
                            i2 = 1;
                            break;
                        default:
                            i = 1;
                            i2 = 3;
                            break;
                    }
                    SensorManager.remapCoordinateSystem(fArr, i, i2, fArr2);
                    float[] fArr3 = anonymousClass2iA.f32775Z;
                    fArr2 = anonymousClass2iA.f32776a;
                    fArr2[0] = fArr3[0];
                    fArr2[1] = fArr3[2];
                    fArr2[2] = -fArr3[1];
                    fArr2[3] = 0.0f;
                    fArr2[4] = fArr3[8];
                    fArr2[5] = fArr3[10];
                    fArr2[6] = -fArr3[9];
                    fArr2[7] = 0.0f;
                    fArr2[8] = -fArr3[4];
                    fArr2[9] = -fArr3[6];
                    fArr2[10] = fArr3[5];
                    fArr2[11] = 0.0f;
                    fArr2[12] = 0.0f;
                    fArr2[13] = 0.0f;
                    fArr2[14] = 0.0f;
                    fArr2[15] = 1.0f;
                    if (!anonymousClass2iA.f32756G) {
                        int i3 = 0;
                        if (sensorEvent.values[0] == 0.0f && sensorEvent.values[1] == 0.0f && sensorEvent.values[2] == 0.0f) {
                            i3 = 1;
                        }
                        if (i3 == 0) {
                            float[] fArr4 = new float[3];
                            SensorManager.getOrientation(anonymousClass2iA.f32776a, fArr4);
                            anonymousClass2iA.f32774Y = (float) Math.toDegrees((double) fArr4[2]);
                            anonymousClass2iA.f32756G = true;
                        }
                    }
                    Matrix.rotateM(anonymousClass2iA.f32776a, 0, anonymousClass2iA.f32774Y, 0.0f, 1.0f, 0.0f);
                    Matrix.invertM(anonymousClass2iA.f32776a, 0, anonymousClass2iA.f32776a, 0);
                    anonymousClass2iA.f32778c = (double) sensorEvent.timestamp;
                    AnonymousClass2iA.m16973F(anonymousClass2iA);
                }
            }
        }
    }

    /* renamed from: F */
    private static synchronized void m16973F(AnonymousClass2iA anonymousClass2iA) {
        synchronized (anonymousClass2iA) {
            if (anonymousClass2iA.f32764O > 0) {
                anonymousClass2iA.f32764O--;
            } else if (anonymousClass2iA.f32757H != null) {
                anonymousClass2iA.f32757H.onDataChanged(anonymousClass2iA.f32776a, anonymousClass2iA.f32771V, anonymousClass2iA.f32772W, anonymousClass2iA.f32777b, anonymousClass2iA.f32778c);
            }
        }
    }
}

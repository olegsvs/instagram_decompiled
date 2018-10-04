package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.1Yq */
public final class AnonymousClass1Yq implements SensorEventListener {
    /* renamed from: B */
    private Sensor f20103B;
    /* renamed from: C */
    private final AnonymousClass2Nf f20104C;
    /* renamed from: D */
    private final AnonymousClass2Ni f20105D = new AnonymousClass2Ni();
    /* renamed from: E */
    private SensorManager f20106E;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass1Yq(AnonymousClass2Nf anonymousClass2Nf) {
        this.f20104C = anonymousClass2Nf;
    }

    /* renamed from: A */
    public final boolean m11858A(SensorManager sensorManager) {
        if (this.f20103B != null) {
            return true;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f20103B = defaultSensor;
        if (defaultSensor != null) {
            this.f20106E = sensorManager;
            sensorManager.registerListener(this, defaultSensor, 0);
        }
        if (this.f20103B != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final void m11859B() {
        Sensor sensor = this.f20103B;
        if (sensor != null) {
            this.f20106E.unregisterListener(this, sensor);
            this.f20106E = null;
            this.f20103B = null;
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        AnonymousClass2Ng anonymousClass2Ng;
        Object obj;
        AnonymousClass2Ni anonymousClass2Ni;
        boolean z = false;
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float f3 = sensorEvent.values[2];
        if (Math.sqrt((double) (((f * f) + (f2 * f2)) + (f3 * f3))) > 13.0d) {
            z = true;
        }
        long j = sensorEvent.timestamp;
        AnonymousClass2Ni anonymousClass2Ni2 = this.f20105D;
        long j2 = j - 500000000;
        while (anonymousClass2Ni2.f29821F >= 4) {
            anonymousClass2Ng = anonymousClass2Ni2.f29819D;
            if (anonymousClass2Ng == null || j2 - anonymousClass2Ng.f29815D <= 0) {
                break;
            }
            AnonymousClass2Ng anonymousClass2Ng2 = anonymousClass2Ni2.f29819D;
            if (anonymousClass2Ng2.f29813B) {
                anonymousClass2Ni2.f29817B--;
            }
            anonymousClass2Ni2.f29821F--;
            anonymousClass2Ng = anonymousClass2Ng2.f29814C;
            anonymousClass2Ni2.f29819D = anonymousClass2Ng;
            if (anonymousClass2Ng == null) {
                anonymousClass2Ni2.f29818C = null;
            }
            AnonymousClass2Nh anonymousClass2Nh = anonymousClass2Ni2.f29820E;
            anonymousClass2Ng2.f29814C = anonymousClass2Nh.f29816B;
            anonymousClass2Nh.f29816B = anonymousClass2Ng2;
        }
        AnonymousClass2Nh anonymousClass2Nh2 = anonymousClass2Ni2.f29820E;
        AnonymousClass2Ng anonymousClass2Ng3 = anonymousClass2Nh2.f29816B;
        if (anonymousClass2Ng3 == null) {
            anonymousClass2Ng3 = new AnonymousClass2Ng();
        } else {
            anonymousClass2Nh2.f29816B = anonymousClass2Ng3.f29814C;
        }
        anonymousClass2Ng3.f29815D = j;
        anonymousClass2Ng3.f29813B = z;
        anonymousClass2Ng3.f29814C = null;
        anonymousClass2Ng = anonymousClass2Ni2.f29818C;
        if (anonymousClass2Ng != null) {
            anonymousClass2Ng.f29814C = anonymousClass2Ng3;
        }
        anonymousClass2Ni2.f29818C = anonymousClass2Ng3;
        if (anonymousClass2Ni2.f29819D == null) {
            anonymousClass2Ni2.f29819D = anonymousClass2Ng3;
        }
        anonymousClass2Ni2.f29821F++;
        if (z) {
            anonymousClass2Ni2.f29817B++;
        }
        AnonymousClass2Ni anonymousClass2Ni3 = this.f20105D;
        anonymousClass2Ng3 = anonymousClass2Ni3.f29818C;
        if (!(anonymousClass2Ng3 == null || anonymousClass2Ni3.f29819D == null || anonymousClass2Ng3.f29815D - anonymousClass2Ni3.f29819D.f29815D < 250000000)) {
            int i = anonymousClass2Ni3.f29817B;
            int i2 = anonymousClass2Ni3.f29821F;
            if (i >= (i2 >> 1) + (i2 >> 2)) {
                obj = 1;
                if (obj != null) {
                    anonymousClass2Ni = this.f20105D;
                    while (true) {
                        anonymousClass2Ng2 = anonymousClass2Ni.f29819D;
                        if (anonymousClass2Ng2 == null) {
                            anonymousClass2Ni.f29819D = anonymousClass2Ng2.f29814C;
                            anonymousClass2Nh = anonymousClass2Ni.f29820E;
                            anonymousClass2Ng2.f29814C = anonymousClass2Nh.f29816B;
                            anonymousClass2Nh.f29816B = anonymousClass2Ng2;
                        } else {
                            anonymousClass2Ni.f29818C = null;
                            anonymousClass2Ni.f29821F = 0;
                            anonymousClass2Ni.f29817B = 0;
                            this.f20104C.cV();
                            return;
                        }
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
            anonymousClass2Ni = this.f20105D;
            while (true) {
                anonymousClass2Ng2 = anonymousClass2Ni.f29819D;
                if (anonymousClass2Ng2 == null) {
                    anonymousClass2Ni.f29818C = null;
                    anonymousClass2Ni.f29821F = 0;
                    anonymousClass2Ni.f29817B = 0;
                    this.f20104C.cV();
                    return;
                }
                anonymousClass2Ni.f29819D = anonymousClass2Ng2.f29814C;
                anonymousClass2Nh = anonymousClass2Ni.f29820E;
                anonymousClass2Ng2.f29814C = anonymousClass2Nh.f29816B;
                anonymousClass2Nh.f29816B = anonymousClass2Ng2;
            }
        }
    }
}

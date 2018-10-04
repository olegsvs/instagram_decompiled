package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass1s7;
import X.AnonymousClass2iA;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.facebook.jni.HybridData;

public class MotionDataSourceWrapper {
    private final AnonymousClass2iA mDataSource;
    private final HybridData mHybridData = initHybrid();
    private boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, double d);

    private native void setRawSensorResult(int i, float[] fArr, double d);

    public MotionDataSourceWrapper(AnonymousClass2iA anonymousClass2iA) {
        this.mDataSource = anonymousClass2iA;
    }

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public boolean hasRawData() {
        AnonymousClass2iA anonymousClass2iA = this.mDataSource;
        if (anonymousClass2iA.f32758I == null && anonymousClass2iA.f32760K == null) {
            if (anonymousClass2iA.f32762M == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isSensorAvailable(int i) {
        return this.mDataSource.m16974A(i);
    }

    public final void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, double d) {
        if (this.mIsAlive) {
            setData(fArr, fArr2, fArr3, fArr4, d);
        }
    }

    public final void onRawSensorMeasurementChanged(AnonymousClass1s7 anonymousClass1s7, float[] fArr, double d) {
        if (this.mIsAlive) {
            setRawSensorResult(anonymousClass1s7.m13530A(), fArr, d);
        }
    }

    public void start() {
        AnonymousClass2iA anonymousClass2iA = this.mDataSource;
        if (!anonymousClass2iA.f32753D) {
            SensorManager sensorManager = anonymousClass2iA.f32770U;
            if (sensorManager != null) {
                anonymousClass2iA.f32753D = true;
                anonymousClass2iA.f32756G = false;
                anonymousClass2iA.f32764O = 2;
                Sensor sensor = anonymousClass2iA.f32767R;
                if (sensor != null) {
                    sensorManager.registerListener(anonymousClass2iA.f32768S, sensor, anonymousClass2iA.f32769T);
                }
                Sensor sensor2 = anonymousClass2iA.f32751B;
                if (sensor2 != null) {
                    anonymousClass2iA.f32770U.registerListener(anonymousClass2iA.f32752C, sensor2, anonymousClass2iA.f32769T);
                }
                sensor2 = anonymousClass2iA.f32754E;
                if (sensor2 != null) {
                    anonymousClass2iA.f32770U.registerListener(anonymousClass2iA.f32755F, sensor2, anonymousClass2iA.f32769T);
                }
                sensor2 = anonymousClass2iA.f32765P;
                if (sensor2 != null) {
                    anonymousClass2iA.f32770U.registerListener(anonymousClass2iA.f32766Q, sensor2, anonymousClass2iA.f32769T);
                }
                sensor2 = anonymousClass2iA.f32758I;
                if (sensor2 != null) {
                    anonymousClass2iA.f32770U.registerListener(anonymousClass2iA.f32759J, sensor2, anonymousClass2iA.f32769T);
                }
                sensor2 = anonymousClass2iA.f32760K;
                if (sensor2 != null) {
                    anonymousClass2iA.f32770U.registerListener(anonymousClass2iA.f32761L, sensor2, anonymousClass2iA.f32769T);
                }
                sensor2 = anonymousClass2iA.f32762M;
                if (sensor2 != null) {
                    anonymousClass2iA.f32770U.registerListener(anonymousClass2iA.f32763N, sensor2, anonymousClass2iA.f32769T);
                }
            }
        }
    }
}

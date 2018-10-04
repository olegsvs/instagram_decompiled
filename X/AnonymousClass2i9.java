package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.2i9 */
public final class AnonymousClass2i9 implements SensorEventListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2iA f32750B;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass2i9(AnonymousClass2iA anonymousClass2iA) {
        this.f32750B = anonymousClass2iA;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f32750B.f32757H != null) {
            this.f32750B.f32757H.onRawSensorMeasurementChanged(AnonymousClass1s7.RAW_MAGNETOMETER, sensorEvent.values, (double) sensorEvent.timestamp);
        }
    }
}

package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.2i7 */
public final class AnonymousClass2i7 implements SensorEventListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2iA f32748B;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass2i7(AnonymousClass2iA anonymousClass2iA) {
        this.f32748B = anonymousClass2iA;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f32748B.f32757H != null) {
            this.f32748B.f32757H.onRawSensorMeasurementChanged(AnonymousClass1s7.RAW_ACCELEROMETER, sensorEvent.values, (double) sensorEvent.timestamp);
        }
    }
}

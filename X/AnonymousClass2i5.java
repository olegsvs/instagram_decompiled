package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.2i5 */
public final class AnonymousClass2i5 implements SensorEventListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2iA f32746B;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass2i5(AnonymousClass2iA anonymousClass2iA) {
        this.f32746B = anonymousClass2iA;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        AnonymousClass2iA.m16970C(this.f32746B, sensorEvent);
    }
}

package X;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureState;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureType;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import java.util.Map;

/* renamed from: X.2k6 */
public final class AnonymousClass2k6 implements OnScaleGestureListener {
    /* renamed from: B */
    public boolean f33169B = true;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3s7 f33170C;
    /* renamed from: D */
    public float f33171D;
    /* renamed from: E */
    public float f33172E;
    /* renamed from: F */
    private float f33173F;
    /* renamed from: G */
    private float f33174G;
    /* renamed from: H */
    private float f33175H;

    public AnonymousClass2k6(AnonymousClass3s7 anonymousClass3s7) {
        this.f33170C = anonymousClass3s7;
    }

    /* renamed from: B */
    private float m17003B(float f) {
        float f2 = this.f33173F;
        return f2 > 0.0f ? f / f2 : 1.0f;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f33170C.f45600K.m17007B(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), this.f33174G, this.f33175H);
        float B = m17003B(scaleGestureDetector.getCurrentSpan());
        if (this.f33170C.f45591B.containsKey(GestureType.PINCH) || Math.abs(1.0f - B) >= 0.1f) {
            long longValue;
            this.f33170C.f45594E = true;
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            Map map = this.f33170C.f45591B;
            GestureType gestureType = GestureType.PINCH;
            if (map.containsKey(gestureType)) {
                longValue = ((Long) this.f33170C.f45591B.get(gestureType)).longValue();
                if (AnonymousClass3s7.m21021E(this.f33170C, longValue)) {
                }
            } else {
                longValue = AnonymousClass3s7.m21022F(this.f33170C, gestureType);
                AnonymousClass3s7.m21019C(this.f33170C, new PinchGesture(longValue, B, focusX, focusY, GestureState.BEGAN, this.f33169B, this.f33171D, this.f33172E));
            }
            AnonymousClass3s7.m21019C(this.f33170C, new PinchGesture(longValue, B, focusX, focusY, GestureState.CHANGED, this.f33169B, this.f33171D, this.f33172E));
            return true;
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f33174G = scaleGestureDetector.getFocusX();
        this.f33175H = scaleGestureDetector.getFocusY();
        AnonymousClass2kC anonymousClass2kC = this.f33170C.f45600K;
        float f = this.f33174G;
        float f2 = this.f33175H;
        anonymousClass2kC.f33214R = false;
        if (anonymousClass2kC.f33208L == null) {
            anonymousClass2kC.f33208L = Float.valueOf(f);
            anonymousClass2kC.f33209M = Float.valueOf(f2);
        }
        anonymousClass2kC.f33210N = f - anonymousClass2kC.f33208L.floatValue();
        anonymousClass2kC.f33211O = f2 - anonymousClass2kC.f33209M.floatValue();
        anonymousClass2kC.f33215S = null;
        AnonymousClass2kC anonymousClass2kC2 = this.f33170C.f45600K;
        anonymousClass2kC2.f33215S = Boolean.valueOf(anonymousClass2kC2.f33199C.E());
        boolean contains = this.f33170C.f45601L.contains(GestureType.PINCH);
        if (contains) {
            this.f33173F = scaleGestureDetector.getCurrentSpan();
        }
        return contains;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass2kC anonymousClass2kC = this.f33170C.f45600K;
        anonymousClass2kC.f33214R = true;
        anonymousClass2kC.f33215S = null;
        Map map = this.f33170C.f45591B;
        GestureType gestureType = GestureType.PINCH;
        if (map.containsKey(gestureType)) {
            long longValue = ((Long) this.f33170C.f45591B.get(gestureType)).longValue();
            if (AnonymousClass3s7.m21021E(this.f33170C, longValue)) {
                this.f33170C.f45599J.add(gestureType);
            } else {
                AnonymousClass3s7.m21019C(this.f33170C, new PinchGesture(longValue, m17003B(scaleGestureDetector.getCurrentSpan()), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), GestureState.ENDED, this.f33169B, this.f33171D, this.f33172E));
            }
        }
    }
}

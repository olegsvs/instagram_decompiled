package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.facebook.optic.CameraPreviewView;

/* renamed from: X.2nK */
public final class AnonymousClass2nK extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ CameraPreviewView f34022B;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass2nK(CameraPreviewView cameraPreviewView) {
        this.f34022B = cameraPreviewView;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f34022B.m17189A(motionEvent.getX(), motionEvent.getY());
        return true;
    }
}

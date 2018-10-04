package X;

import android.content.Context;
import android.view.OrientationEventListener;
import com.facebook.optic.CameraPreviewView;

/* renamed from: X.2nJ */
public final class AnonymousClass2nJ extends OrientationEventListener {
    /* renamed from: B */
    public final /* synthetic */ CameraPreviewView f34021B;

    public AnonymousClass2nJ(CameraPreviewView cameraPreviewView, Context context) {
        this.f34021B = cameraPreviewView;
        super(context);
    }

    public final void onOrientationChanged(int i) {
        AnonymousClass0Nc D = AnonymousClass0Nc.D();
        if (!D.f3616V) {
            D.f3627g = i;
        }
        int displayRotation = CameraPreviewView.getDisplayRotation(this.f34021B);
        if (displayRotation != this.f34021B.f34030D) {
            CameraPreviewView.m17186C(this.f34021B, displayRotation);
        }
    }
}

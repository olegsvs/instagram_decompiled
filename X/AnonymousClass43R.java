package X;

import android.hardware.Camera.Size;
import android.util.Log;
import com.facebook.optic.CameraPreviewView;

/* renamed from: X.43R */
public final class AnonymousClass43R extends AnonymousClass3sw {
    /* renamed from: B */
    public final /* synthetic */ CameraPreviewView f49064B;

    public AnonymousClass43R(CameraPreviewView cameraPreviewView) {
        this.f49064B = cameraPreviewView;
    }

    /* renamed from: A */
    public final void mo5128A(Exception exception) {
        Log.e(CameraPreviewView.f34027g, exception.getMessage(), exception);
        synchronized (this) {
            if (this.f49064B.f34029C != null) {
                this.f49064B.f34029C.iD(exception);
            }
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo5129B(Object obj) {
        Size size = (Size) obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Started camera preview ");
        stringBuilder.append(size.width);
        stringBuilder.append(" x ");
        stringBuilder.append(size.height);
        stringBuilder.toString();
        CameraPreviewView cameraPreviewView = this.f49064B;
        CameraPreviewView.m17187D(cameraPreviewView, cameraPreviewView.f34036J, this.f49064B.f34034H, size.width, size.height);
        synchronized (this) {
            if (this.f49064B.f34029C != null && AnonymousClass0Nc.D().L()) {
                this.f49064B.f34029C.jD();
            }
        }
    }
}

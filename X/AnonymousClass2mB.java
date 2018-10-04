package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import java.io.IOException;

/* renamed from: X.2mB */
public final class AnonymousClass2mB implements FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2mC f33784B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2mF f33785C;

    public AnonymousClass2mB(AnonymousClass2mC anonymousClass2mC, AnonymousClass2mF anonymousClass2mF) {
        this.f33784B = anonymousClass2mC;
        this.f33785C = anonymousClass2mF;
    }

    public final void handleLoadError(String str) {
        this.f33784B.f33786B.m21139A(new IOException(str), this.f33785C.f33836I);
    }
}

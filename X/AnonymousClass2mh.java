package X;

import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Camera.Face;
import android.hardware.Camera.FaceDetectionListener;

/* renamed from: X.2mh */
public final class AnonymousClass2mh implements FaceDetectionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Nc f33934B;

    public AnonymousClass2mh(AnonymousClass0Nc anonymousClass0Nc) {
        this.f33934B = anonymousClass0Nc;
    }

    public final void onFaceDetection(Face[] faceArr, Camera camera) {
        if (faceArr != null) {
            float[] fArr = new float[2];
            RectF rectF = new RectF();
            for (Face face : faceArr) {
                rectF.set(face.rect);
                this.f33934B.f3605K.mapRect(rectF);
                face.rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                if (face.leftEye != null) {
                    fArr[0] = (float) face.leftEye.x;
                    fArr[1] = (float) face.leftEye.y;
                    this.f33934B.f3605K.mapPoints(fArr);
                    face.leftEye.set((int) fArr[0], (int) fArr[1]);
                }
                if (face.rightEye != null) {
                    fArr[0] = (float) face.rightEye.x;
                    fArr[1] = (float) face.rightEye.y;
                    this.f33934B.f3605K.mapPoints(fArr);
                    face.rightEye.set((int) fArr[0], (int) fArr[1]);
                }
                if (face.mouth != null) {
                    fArr[0] = (float) face.mouth.x;
                    fArr[1] = (float) face.mouth.y;
                    this.f33934B.f3605K.mapPoints(fArr);
                    face.mouth.set((int) fArr[0], (int) fArr[1]);
                }
            }
        }
        AnonymousClass2oP.m17272C(new AnonymousClass2mZ(this, faceArr));
    }
}

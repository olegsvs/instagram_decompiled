package X;

import android.graphics.Point;

/* renamed from: X.4IQ */
public final class AnonymousClass4IQ implements AnonymousClass2nV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SU f52463B;

    public AnonymousClass4IQ(AnonymousClass5SU anonymousClass5SU) {
        this.f52463B = anonymousClass5SU;
    }

    public final void am(AnonymousClass2nU anonymousClass2nU, Point point) {
        switch (anonymousClass2nU.ordinal()) {
            case 0:
                int min = Math.min(this.f52463B.f63949B.mo5395O(), this.f52463B.f63949B.mo5392L()) / 4;
                this.f52463B.f63959L.getLayoutParams().width = min;
                this.f52463B.f63959L.getLayoutParams().height = min;
                this.f52463B.f63959L.requestLayout();
                float[] fArr = new float[]{(float) point.x, (float) point.y};
                if (AnonymousClass0e8.D(this.f52463B.getContext())) {
                    fArr[0] = ((float) this.f52463B.getWidth()) - fArr[0];
                }
                min = (int) (fArr[1] - ((float) (this.f52463B.f63958K.getHeight() / 2)));
                AnonymousClass0Nm.g(this.f52463B.f63958K, (int) (fArr[0] - ((float) (this.f52463B.f63958K.getWidth() / 2))));
                AnonymousClass0Nm.h(this.f52463B.f63958K, min);
                this.f52463B.f63959L.m23753B();
                return;
            case 1:
                this.f52463B.f63959L.setBackground(null);
                return;
            case 3:
                this.f52463B.f63959L.m23754C();
                return;
            case 4:
                this.f52463B.f63959L.m23752A();
                return;
            case 5:
                AnonymousClass0Gn.C("InAppCaptureView.CameraFocusError", "Exception when focusing camera.");
                this.f52463B.f63959L.setBackground(null);
                return;
            default:
                return;
        }
    }
}

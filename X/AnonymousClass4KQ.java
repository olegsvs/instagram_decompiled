package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.4KQ */
public final class AnonymousClass4KQ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0eB f52821B;
    /* renamed from: C */
    private final Rect f52822C = new Rect();

    public AnonymousClass4KQ(AnonymousClass0eB anonymousClass0eB) {
        this.f52821B = anonymousClass0eB;
    }

    /* renamed from: A */
    public final boolean m23891A(MotionEvent motionEvent) {
        switch (AnonymousClass4Ki.f52844C[AnonymousClass0eB.J(this.f52821B).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 8:
                if (!this.f52821B.f7598L.m18698P()) {
                    return false;
                }
                if (!this.f52821B.QB && !this.f52821B.f7598L.m18695M()) {
                    return false;
                }
                if (motionEvent.getAction() == 0 && AnonymousClass4KQ.m23890B(this, motionEvent)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    private static boolean m23890B(X.AnonymousClass4KQ r4, android.view.MotionEvent r5) {
        /*
        r0 = r4.f52821B;
        r0 = r0.f7595I;
        r0 = r0.getVisibility();
        r3 = 1;
        if (r0 != 0) goto L_0x0027;
    L_0x000b:
        r0 = r4.f52821B;
        r1 = r0.f7595I;
        r0 = r4.f52822C;
        r1.getHitRect(r0);
        r2 = r4.f52822C;
        r0 = r5.getRawX();
        r1 = (int) r0;
        r0 = r5.getRawY();
        r0 = (int) r0;
        r0 = r2.contains(r1, r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        return r3;
    L_0x0027:
        r0 = r4.f52821B;
        r0 = r0.bB;
        if (r0 == 0) goto L_0x0053;
    L_0x002d:
        r0 = r4.f52821B;
        r0 = r0.bB;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0053;
    L_0x0037:
        r0 = r4.f52821B;
        r1 = r0.bB;
        r0 = r4.f52822C;
        r1.getHitRect(r0);
        r2 = r4.f52822C;
        r0 = r5.getRawX();
        r1 = (int) r0;
        r0 = r5.getRawY();
        r0 = (int) r0;
        r0 = r2.contains(r1, r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0026;
    L_0x0053:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.4KQ.B(X.4KQ, android.view.MotionEvent):boolean");
    }
}

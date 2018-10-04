package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.5CT */
public final class AnonymousClass5CT implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0QX f61081B;
    /* renamed from: C */
    public final /* synthetic */ GestureDetector f61082C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5CU f61083D;
    /* renamed from: E */
    private float f61084E;
    /* renamed from: F */
    private float f61085F;

    public AnonymousClass5CT(GestureDetector gestureDetector, AnonymousClass5CU anonymousClass5CU, AnonymousClass0QX anonymousClass0QX) {
        this.f61082C = gestureDetector;
        this.f61083D = anonymousClass5CU;
        this.f61081B = anonymousClass0QX;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouchEvent = this.f61082C.onTouchEvent(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f61084E = motionEvent.getRawX();
                this.f61085F = motionEvent.getRawY();
                break;
            case 1:
            case 3:
                this.f61081B.kEA(false);
                AnonymousClass5CU anonymousClass5CU = this.f61083D;
                anonymousClass5CU.f61087C.A();
                anonymousClass5CU.f61086B = false;
                break;
            case 2:
                if (this.f61083D.f61086B) {
                    return this.f61081B.eq(motionEvent.getRawX() - this.f61084E, motionEvent.getRawY() - this.f61085F);
                }
                break;
            default:
                break;
        }
        return onTouchEvent;
    }
}

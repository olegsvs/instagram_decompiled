package X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.0zS */
public final class AnonymousClass0zS implements OnTouchListener {
    /* renamed from: B */
    public final AnonymousClass0kA f13030B;
    /* renamed from: C */
    public boolean f13031C;
    /* renamed from: D */
    public final AnonymousClass0P7 f13032D;
    /* renamed from: E */
    public final int f13033E;
    /* renamed from: F */
    public final AnonymousClass0m3 f13034F;
    /* renamed from: G */
    private final AnonymousClass0px f13035G;

    public AnonymousClass0zS(AnonymousClass0px anonymousClass0px, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0kA anonymousClass0kA) {
        this.f13035G = anonymousClass0px;
        this.f13032D = anonymousClass0P7;
        this.f13034F = anonymousClass0m3;
        this.f13033E = i;
        this.f13030B = anonymousClass0kA;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if ((motionEvent.getX() >= ((float) this.f13035G.f10800E.getLeft()) && motionEvent.getX() <= ((float) this.f13035G.f10800E.getLeft())) || motionEvent.getX() >= ((float) this.f13035G.f10800E.getRight())) {
                        this.f13031C = true;
                        AnonymousClass0OR.m3626F(new Handler(), new AnonymousClass1As(this), 280, 1502032119);
                        break;
                    }
                case 1:
                    break;
                default:
                    break;
            }
        }
        this.f13031C = false;
        return true;
    }
}

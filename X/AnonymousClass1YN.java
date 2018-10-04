package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.1YN */
public final class AnonymousClass1YN implements AnonymousClass1AI {
    /* renamed from: B */
    public final AnonymousClass1AH f19995B;
    /* renamed from: C */
    public final View f19996C;
    /* renamed from: D */
    public float f19997D;
    /* renamed from: E */
    public AnonymousClass1YU f19998E;
    /* renamed from: F */
    public final AnonymousClass0P7 f19999F;
    /* renamed from: G */
    private final GestureDetector f20000G;
    /* renamed from: H */
    private final Runnable f20001H = new AnonymousClass3OC(this);
    /* renamed from: I */
    private final View f20002I;
    /* renamed from: J */
    private final AnonymousClass0vl f20003J;
    /* renamed from: K */
    private final Runnable f20004K = new AnonymousClass3OB(this);

    public AnonymousClass1YN(Context context, AnonymousClass1AH anonymousClass1AH, View view, View view2, AnonymousClass0P7 anonymousClass0P7) {
        Object anonymousClass1VJ = new AnonymousClass1VJ(this);
        GestureDetector gestureDetector = new GestureDetector(context, anonymousClass1VJ);
        this.f20000G = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f20003J = new AnonymousClass0vl(context);
        this.f20003J.m8364A(anonymousClass1VJ);
        this.f19995B = anonymousClass1AH;
        this.f19996C = view;
        this.f20002I = view2;
        this.f19999F = anonymousClass0P7;
        this.f19998E = AnonymousClass1YU.IDLE;
    }

    /* renamed from: B */
    public static void m11842B(AnonymousClass1YN anonymousClass1YN) {
        AnonymousClass1YN.m11843C(anonymousClass1YN);
        anonymousClass1YN.f19995B.Yq();
    }

    /* renamed from: C */
    public static void m11843C(AnonymousClass1YN anonymousClass1YN) {
        anonymousClass1YN.f20002I.removeCallbacks(anonymousClass1YN.f20001H);
        anonymousClass1YN.f20002I.removeCallbacks(anonymousClass1YN.f20004K);
    }

    /* renamed from: D */
    public static boolean m11844D(AnonymousClass1YN anonymousClass1YN, float f) {
        return Math.abs(f - anonymousClass1YN.f19997D) / ((float) anonymousClass1YN.f19996C.getWidth()) > 0.01f;
    }

    /* renamed from: E */
    public static void m11845E(AnonymousClass1YN anonymousClass1YN, boolean z) {
        if (anonymousClass1YN.f20002I.getParent() != null) {
            anonymousClass1YN.f20002I.getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: F */
    private void m11846F(MotionEvent motionEvent) {
        if (this.f19998E == AnonymousClass1YU.IDLE) {
            Rect rect = new Rect();
            this.f19996C.getGlobalVisibleRect(rect);
            if ((((float) rect.height()) >= ((float) this.f19996C.getHeight()) * 0.8f ? 1 : null) != null) {
                this.f19997D = motionEvent.getX();
                this.f20002I.removeCallbacks(this.f20004K);
                this.f20002I.removeCallbacks(this.f20001H);
                this.f20002I.postDelayed(this.f20004K, 130);
                this.f20002I.postDelayed(this.f20001H, (long) ViewConfiguration.getLongPressTimeout());
                this.f19998E = AnonymousClass1YU.WAITING;
            }
        }
    }

    public final boolean ql(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            AnonymousClass1YN.m11845E(this, true);
            AnonymousClass1YN.m11842B(this);
        }
        Object obj = null;
        switch (motionEvent.getAction()) {
            case 0:
                m11846F(motionEvent);
                break;
            case 1:
                if (this.f19998E == AnonymousClass1YU.CONFIRMED) {
                    obj = 1;
                }
                AnonymousClass1YN.m11845E(this, false);
                switch (this.f19998E.ordinal()) {
                    case 1:
                    case 2:
                        AnonymousClass1YN.m11842B(this);
                        break;
                    case 3:
                    case 4:
                        this.f19995B.aq(motionEvent.getX());
                        break;
                    default:
                        break;
                }
                this.f19998E = AnonymousClass1YU.IDLE;
                break;
            case 2:
                switch (this.f19998E.ordinal()) {
                    case 1:
                    case 2:
                        if (AnonymousClass1YN.m11844D(this, motionEvent.getX())) {
                            AnonymousClass1YN.m11845E(this, false);
                            AnonymousClass1YN.m11842B(this);
                            this.f19998E = AnonymousClass1YU.IDLE;
                            break;
                        }
                        break;
                    case 3:
                        if (AnonymousClass1YN.m11844D(this, motionEvent.getX())) {
                            AnonymousClass1YN.m11845E(this, true);
                            this.f19995B.bq(motionEvent.getX());
                            this.f19998E = AnonymousClass1YU.SCRUBBING;
                            break;
                        }
                        break;
                    case 4:
                        this.f19995B.bq(motionEvent.getX());
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                AnonymousClass1YN.m11845E(this, false);
                AnonymousClass1YU anonymousClass1YU = this.f19998E;
                AnonymousClass1YU anonymousClass1YU2 = AnonymousClass1YU.IDLE;
                if (anonymousClass1YU != anonymousClass1YU2) {
                    AnonymousClass1YN.m11842B(this);
                    this.f19998E = anonymousClass1YU2;
                }
                break;
            default:
                break;
        }
        this.f20003J.m8366C(motionEvent);
        if (obj == null) {
            this.f20000G.onTouchEvent(motionEvent);
        }
        return true;
    }
}

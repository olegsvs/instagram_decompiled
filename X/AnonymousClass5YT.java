package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.5YT */
public final class AnonymousClass5YT implements OnGestureListener, AnonymousClass4uu {
    /* renamed from: B */
    public boolean f66149B = true;
    /* renamed from: C */
    public long f66150C;
    /* renamed from: D */
    private final Context f66151D;
    /* renamed from: E */
    private final GestureDetector f66152E;
    /* renamed from: F */
    private final IGTVViewerFragment f66153F;
    /* renamed from: G */
    private boolean f66154G;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public AnonymousClass5YT(Context context, IGTVViewerFragment iGTVViewerFragment) {
        this.f66151D = context;
        this.f66152E = new GestureDetector(context, this);
        this.f66153F = iGTVViewerFragment;
    }

    public final boolean JX() {
        return this.f66149B;
    }

    public final void dc(MotionEvent motionEvent, boolean z) {
        float rawX = motionEvent.getRawX();
        float B = AnonymousClass4wI.m25434B(this.f66151D);
        Context context = this.f66151D;
        Object obj = null;
        Object obj2 = rawX >= ((float) AnonymousClass0Nm.J(context)) - AnonymousClass4wI.m25434B(context) ? 1 : null;
        if (rawX <= B) {
            obj = 1;
        }
        if (obj2 != null || obj != null) {
            this.f66152E.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3) {
                return;
            }
            if (this.f66154G && !z) {
                AnonymousClass4uq B2 = AnonymousClass4uq.m25339B(this.f66151D);
                IGTVViewerFragment iGTVViewerFragment;
                AnonymousClass5YU g;
                AnonymousClass5c3 anonymousClass5c3;
                AnonymousClass4vx anonymousClass4vx;
                AnonymousClass3pz anonymousClass3pz;
                if (obj2 != null) {
                    this.f66150C = System.currentTimeMillis();
                    iGTVViewerFragment = this.f66153F;
                    g = iGTVViewerFragment.m27487g(iGTVViewerFragment.mChannelPager.getCurrentRawDataIndex());
                    if (g != null && g.fT() == AnonymousClass4wX.ORGANIC) {
                        iGTVViewerFragment.f66103R.D(true, g.NU().C(), iGTVViewerFragment.mChannelPager.getCurrentDataIndex());
                        anonymousClass5c3 = (AnonymousClass5c3) g;
                        anonymousClass4vx = (AnonymousClass4vx) iGTVViewerFragment.mVideoPlayerController.f66142G.get(anonymousClass5c3);
                        if (anonymousClass4vx != null) {
                            anonymousClass3pz = anonymousClass4vx.f58598I;
                            if (anonymousClass3pz != null) {
                                anonymousClass4vx.m25428F(anonymousClass3pz.A() + AnonymousClass4vx.m25421B(anonymousClass4vx), true);
                            }
                        }
                        AnonymousClass5c3.m27968B(anonymousClass5c3, anonymousClass5c3.f67241G, 1.0f);
                    }
                } else if (obj != null) {
                    this.f66150C = System.currentTimeMillis();
                    iGTVViewerFragment = this.f66153F;
                    g = iGTVViewerFragment.m27487g(iGTVViewerFragment.mChannelPager.getCurrentRawDataIndex());
                    if (g != null && g.fT() == AnonymousClass4wX.ORGANIC) {
                        iGTVViewerFragment.f66103R.D(false, g.NU().C(), iGTVViewerFragment.mChannelPager.getCurrentDataIndex());
                        anonymousClass5c3 = (AnonymousClass5c3) g;
                        anonymousClass4vx = (AnonymousClass4vx) iGTVViewerFragment.mVideoPlayerController.f66142G.get(anonymousClass5c3);
                        if (anonymousClass4vx != null) {
                            anonymousClass3pz = anonymousClass4vx.f58598I;
                            if (anonymousClass3pz != null) {
                                anonymousClass4vx.m25428F(anonymousClass3pz.A() - AnonymousClass4vx.m25421B(anonymousClass4vx), true);
                            }
                        }
                        AnonymousClass5c3.m27968B(anonymousClass5c3, anonymousClass5c3.f67237C, -1.0f);
                    }
                } else {
                    return;
                }
                B2.m25346D(AnonymousClass4un.REVEAL_TAP_SEEK);
            }
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f66154G = false;
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f66154G = true;
        return false;
    }
}

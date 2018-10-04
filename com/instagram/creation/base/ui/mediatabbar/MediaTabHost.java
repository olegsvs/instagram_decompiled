package com.instagram.creation.base.ui.mediatabbar;

import X.AnonymousClass0G5;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass27D;
import X.AnonymousClass3DH;
import X.AnonymousClass3DJ;
import X.AnonymousClass3DK;
import X.AnonymousClass3DL;
import X.AnonymousClass3DM;
import X.AnonymousClass3DN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class MediaTabHost extends FrameLayout implements OnGestureListener {
    /* renamed from: B */
    public boolean f39221B;
    /* renamed from: C */
    public boolean f39222C;
    /* renamed from: D */
    public boolean f39223D;
    /* renamed from: E */
    public float f39224E;
    /* renamed from: F */
    public final Set f39225F;
    /* renamed from: G */
    public final AnonymousClass0cN f39226G;
    /* renamed from: H */
    public AnonymousClass3DM f39227H;
    /* renamed from: I */
    public AnonymousClass3DM f39228I;
    /* renamed from: J */
    public final MediaTabBar f39229J;
    /* renamed from: K */
    public View f39230K;
    /* renamed from: L */
    private boolean f39231L;
    /* renamed from: M */
    private boolean f39232M;
    /* renamed from: N */
    private final GestureDetector f39233N;
    /* renamed from: O */
    private final AnonymousClass3DK f39234O;
    /* renamed from: P */
    private Runnable f39235P;
    /* renamed from: Q */
    private boolean f39236Q;
    /* renamed from: R */
    private boolean f39237R;
    /* renamed from: S */
    private boolean f39238S;
    /* renamed from: T */
    private final AnonymousClass0cN f39239T;
    /* renamed from: U */
    private final AnonymousClass3DL f39240U;
    /* renamed from: V */
    private TextView f39241V;
    /* renamed from: W */
    private float f39242W;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public MediaTabHost(Context context) {
        this(context, null);
    }

    public MediaTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39225F = new CopyOnWriteArraySet();
        this.f39238S = true;
        this.f39236Q = true;
        AnonymousClass0cN O = AnonymousClass0e6.B().C().O(AnonymousClass3DH.f39206B);
        O.f7108F = true;
        this.f39226G = O;
        this.f39234O = new AnonymousClass3DK(this);
        this.f39223D = AnonymousClass0e8.D(getContext());
        this.f39239T = AnonymousClass0e6.B().C();
        this.f39240U = new AnonymousClass3DL(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f39233N = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        LayoutInflater.from(AnonymousClass0G5.C(context, C0164R.attr.mediaTabStyle)).inflate(C0164R.layout.media_tab_host, this);
        MediaTabBar mediaTabBar = (MediaTabBar) findViewById(C0164R.id.media_tab_bar);
        this.f39229J = mediaTabBar;
        mediaTabBar.getLayoutParams().height = getResources().getDimensionPixelSize(AnonymousClass27D.m14491D(getContext()) ? C0164R.dimen.media_tab_bar_height : C0164R.dimen.media_tab_bar_height_small);
    }

    /* renamed from: A */
    public final void m19059A(AnonymousClass3DN anonymousClass3DN) {
        this.f39225F.add(anonymousClass3DN);
        AnonymousClass3DM currentTab = getCurrentTab();
        anonymousClass3DN.kCA(currentTab, currentTab);
    }

    /* renamed from: B */
    public final void m19060B(AnonymousClass3DM anonymousClass3DM, boolean z) {
        if (this.f39231L) {
            int max = Math.max(Math.min(this.f39229J.getChildCount() - 1, this.f39223D ? (this.f39229J.getChildCount() - 1) - anonymousClass3DM.f39243B : anonymousClass3DM.f39243B), 0);
            if (z) {
                this.f39226G.N((double) (max * getWidth()));
            } else {
                this.f39226G.L((double) (max * getWidth()));
            }
            if (!this.f39237R) {
                m19055D(this);
                this.f39228I = getCurrentTab();
                this.f39237R = true;
            }
            return;
        }
        this.f39235P = new AnonymousClass3DJ(this, anonymousClass3DM, z);
    }

    /* renamed from: B */
    public static void m19053B(MediaTabHost mediaTabHost) {
        if (mediaTabHost.f39230K == null) {
            View inflate = ((ViewStub) mediaTabHost.findViewById(C0164R.id.media_tab_bar_text_info_stub)).inflate();
            mediaTabHost.f39230K = inflate;
            mediaTabHost.f39241V = (TextView) inflate.findViewById(C0164R.id.media_tab_bar_text_info);
        }
    }

    /* renamed from: C */
    public final void m19061C(boolean z, boolean z2) {
        double d = z ? StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED : 1.0d;
        this.f39229J.setEnabled(z);
        if (z2) {
            this.f39239T.N(d);
        } else {
            this.f39239T.L(d);
        }
    }

    /* renamed from: C */
    public static boolean m19054C(MediaTabHost mediaTabHost) {
        return mediaTabHost.f39239T.f7106D == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    /* renamed from: D */
    public static void m19055D(MediaTabHost mediaTabHost) {
        for (AnonymousClass3DN lCA : mediaTabHost.f39225F) {
            lCA.lCA(mediaTabHost.getCurrentTab());
        }
    }

    /* renamed from: D */
    public final void m19062D(boolean z) {
        this.f39236Q = z;
        if (z) {
            this.f39229J.setVisibility(0);
        } else {
            this.f39229J.setVisibility(8);
        }
    }

    /* renamed from: E */
    private float m19056E(float f) {
        if (this.f39221B) {
            return f - this.f39224E;
        }
        return 0.0f;
    }

    /* renamed from: F */
    private static void m19057F(MediaTabHost mediaTabHost, float f) {
        mediaTabHost.setDragOffset(getClampedSpringValue(mediaTabHost) - f);
    }

    /* renamed from: G */
    private void m19058G(float f, float f2) {
        m19057F(this, f);
        this.f39226G.P((double) (f2 * -1.0f));
        this.f39226G.N((double) getTargetOffset());
    }

    public static float getClampedSpringValue(MediaTabHost mediaTabHost) {
        return (float) AnonymousClass0dh.B(mediaTabHost.f39226G.E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) ((mediaTabHost.f39229J.getChildCount() - 1) * mediaTabHost.getWidth()));
    }

    private int getCurrentIndex() {
        return (int) AnonymousClass0dh.B((double) Math.round(getCurrentProgress(this)), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (this.f39229J.getChildCount() - 1));
    }

    public static float getCurrentProgress(MediaTabHost mediaTabHost) {
        return getClampedSpringValue(mediaTabHost) / ((float) mediaTabHost.getWidth());
    }

    public AnonymousClass3DM getCurrentTab() {
        MediaTabBar mediaTabBar = this.f39229J;
        View childAt = mediaTabBar.getChildAt(this.f39223D ? (mediaTabBar.getChildCount() - 1) - getCurrentIndex() : getCurrentIndex());
        return childAt != null ? (AnonymousClass3DM) childAt.getTag() : null;
    }

    private float getDragOffset() {
        return getClampedSpringValue(this);
    }

    public int getTabCount() {
        return this.f39229J.getChildCount();
    }

    public int getTabHeight() {
        int i = this.f39229J.getLayoutParams().height;
        return i > 0 ? i : this.f39229J.getHeight();
    }

    private int getTargetIndex() {
        int currentIndex = getCurrentIndex();
        float currentProgress = getCurrentProgress(this) % 1.0f;
        if (this.f39226G.F() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            if (((double) currentProgress) <= 0.5d) {
                currentIndex++;
            }
        } else if (this.f39226G.F() < StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            if (((double) currentProgress) >= 0.5d) {
                currentIndex--;
            }
        }
        return Math.min(Math.max(currentIndex, 0), this.f39229J.getChildCount() - 1);
    }

    private float getTargetOffset() {
        return (float) (getTargetIndex() * getWidth());
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 876257023);
        super.onAttachedToWindow();
        this.f39226G.A(this.f39234O);
        if (this.f39236Q) {
            this.f39239T.A(this.f39240U);
        } else {
            this.f39229J.setVisibility(8);
        }
        AnonymousClass0cQ.O(this, -1558042344, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 455441176);
        super.onDetachedFromWindow();
        this.f39226G.J(this.f39234O);
        this.f39239T.J(this.f39240U);
        AnonymousClass0cQ.O(this, 510412799, N);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f39242W = f;
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.f39232M = false;
            this.f39242W = 0.0f;
            this.f39221B = false;
            this.f39222C = false;
            this.f39224E = 0.0f;
        }
        if (m19054C(this)) {
            if (this.f39238S) {
                if (this.f39221B && !this.f39232M) {
                    z = true;
                }
                this.f39233N.onTouchEvent(motionEvent);
                return z;
            }
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f39231L) {
            this.f39231L = true;
            Runnable runnable = this.f39235P;
            if (runnable != null) {
                runnable.run();
                this.f39235P = null;
            }
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        float abs = Math.abs(motionEvent.getRawX() - motionEvent2.getRawX());
        float abs2 = Math.abs(motionEvent.getRawY() - motionEvent2.getRawY());
        abs = (float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
        float toDegrees = (float) Math.toDegrees(Math.asin((double) (abs2 / abs)));
        if (!(abs <= scaledTouchSlop || this.f39221B || this.f39222C)) {
            this.f39224E = motionEvent2.getRawX();
            if (toDegrees < 45.0f) {
                this.f39221B = true;
            } else {
                this.f39222C = true;
            }
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 891406714);
        if (m19054C(this)) {
            if (this.f39238S) {
                this.f39233N.onTouchEvent(motionEvent);
                float E = m19056E(motionEvent.getRawX());
                switch (motionEvent.getAction()) {
                    case 0:
                    case 3:
                        break;
                    case 1:
                        m19058G(E, this.f39242W);
                        break;
                    case 2:
                        if (this.f39221B) {
                            m19057F(this, E);
                            break;
                        }
                        break;
                    default:
                        break;
                }
                this.f39224E = motionEvent.getRawX();
                AnonymousClass0cQ.L(this, -257315910, M);
                return true;
            }
        }
        AnonymousClass0cQ.L(this, 20990423, M);
        return false;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f39232M = z;
    }

    private void setDragOffset(float f) {
        this.f39226G.L((double) f);
    }

    public void setTabPagingEnabled(boolean z) {
        this.f39238S = z;
    }

    public void setTabTranslationX(float f) {
        MediaTabBar mediaTabBar = this.f39229J;
        mediaTabBar.setTranslationX(f * ((float) mediaTabBar.getWidth()));
    }

    public void setTextInfoBar(String str) {
        m19053B(this);
        m19062D(false);
        this.f39230K.setVisibility(0);
        this.f39241V.setText(str);
    }
}

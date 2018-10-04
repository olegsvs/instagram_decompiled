package com.instagram.common.ui.widget.draggable;

import X.AnonymousClass0cQ;
import X.AnonymousClass3B1;
import X.AnonymousClass3B2;
import X.AnonymousClass3B3;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.lang.ref.WeakReference;

public class DraggableContainer extends FrameLayout implements AnimationListener {
    /* renamed from: B */
    public final Rect f38652B;
    /* renamed from: C */
    public RoundedCornerImageView f38653C;
    /* renamed from: D */
    public float f38654D;
    /* renamed from: E */
    public float f38655E;
    /* renamed from: F */
    public Rect f38656F;
    /* renamed from: G */
    private final Rect f38657G;
    /* renamed from: H */
    private float f38658H;
    /* renamed from: I */
    private float f38659I;
    /* renamed from: J */
    private final int[] f38660J;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public DraggableContainer(Context context) {
        super(context);
        this.f38660J = new int[2];
        this.f38652B = new Rect();
        this.f38657G = new Rect();
        this.f38656F = new Rect();
        m18857C();
    }

    public DraggableContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38660J = new int[2];
        this.f38652B = new Rect();
        this.f38657G = new Rect();
        this.f38656F = new Rect();
        m18857C();
    }

    public DraggableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38660J = new int[2];
        this.f38652B = new Rect();
        this.f38657G = new Rect();
        this.f38656F = new Rect();
        m18857C();
    }

    /* renamed from: B */
    public static void m18856B(DraggableContainer draggableContainer) {
        LayoutParams layoutParams = (LayoutParams) draggableContainer.f38653C.getLayoutParams();
        layoutParams.leftMargin = (int) draggableContainer.f38654D;
        layoutParams.topMargin = (int) draggableContainer.f38655E;
        draggableContainer.f38653C.setLayoutParams(layoutParams);
    }

    /* renamed from: C */
    private void m18857C() {
        RoundedCornerImageView roundedCornerImageView = new RoundedCornerImageView(getContext());
        this.f38653C = roundedCornerImageView;
        roundedCornerImageView.setVisibility(4);
        addView(this.f38653C);
    }

    /* renamed from: D */
    private boolean m18858D(int i, int i2) {
        View findViewById = findViewById(C0164R.id.drag_target);
        if (findViewById != null) {
            if (findViewById.isShown()) {
                if (this.f38656F.isEmpty()) {
                    findViewById.getGlobalVisibleRect(this.f38656F);
                }
                return this.f38656F.contains(i, i2);
            }
        }
        return false;
    }

    /* renamed from: E */
    private boolean m18859E() {
        View findViewById = findViewById(C0164R.id.drag_target);
        if (findViewById != null) {
            if (findViewById.isShown()) {
                if (this.f38656F.isEmpty()) {
                    findViewById.getGlobalVisibleRect(this.f38656F);
                }
                this.f38653C.getGlobalVisibleRect(this.f38657G);
                return this.f38656F.contains(this.f38657G);
            }
        }
        return false;
    }

    public static float getDragCenterX(DraggableContainer draggableContainer) {
        return (((float) draggableContainer.f38652B.left) + draggableContainer.f38654D) + ((float) (draggableContainer.f38653C.getWidth() / 2));
    }

    public static float getDragCenterY(DraggableContainer draggableContainer) {
        return (((float) draggableContainer.f38652B.top) + draggableContainer.f38655E) + ((float) (draggableContainer.f38653C.getHeight() / 2));
    }

    public final void onAnimationEnd(Animation animation) {
        this.f38653C.setVisibility(4);
        AnonymousClass3B2 anonymousClass3B2 = AnonymousClass3B1.f38644B;
        anonymousClass3B2.m18849B(m18859E());
        anonymousClass3B2.f38646C = null;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1671160262);
        super.onAttachedToWindow();
        AnonymousClass3B1.f38644B.f38645B = new WeakReference(this);
        AnonymousClass0cQ.O(this, -1598039035, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1001398252);
        super.onDetachedFromWindow();
        AnonymousClass3B1.f38644B.f38646C = null;
        AnonymousClass0cQ.O(this, -652822441, N);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean D = AnonymousClass3B1.f38644B.m18851D();
        if (D) {
            this.f38658H = motionEvent.getRawX();
            this.f38659I = motionEvent.getRawY();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                onAnimationEnd(null);
            }
        }
        return D;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1042661076);
        if (AnonymousClass3B1.f38644B.m18851D()) {
            int action = motionEvent.getAction();
            this.f38654D += motionEvent.getRawX() - this.f38658H;
            this.f38655E += motionEvent.getRawY() - this.f38659I;
            this.f38654D = Math.min(this.f38654D, (float) (getMeasuredWidth() - 1));
            this.f38655E = Math.min(this.f38655E, (float) (getMeasuredHeight() - 1));
            if (action == 2) {
                m18856B(this);
                AnonymousClass3B2 anonymousClass3B2 = AnonymousClass3B1.f38644B;
                View view = this.f38653C;
                float dragCenterX = getDragCenterX(this);
                float dragCenterY = getDragCenterY(this);
                boolean E = m18859E();
                boolean D = m18858D((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                synchronized (anonymousClass3B2) {
                    for (AnonymousClass3B3 pj : AnonymousClass3B2.m18847B(anonymousClass3B2, anonymousClass3B2.f38646C.getClass())) {
                        pj.pj(view, dragCenterX, dragCenterY, E, D);
                    }
                }
            } else if (action == 1 || action == 3) {
                AnonymousClass3B1.f38644B.m18850C();
                if (this.f38653C.getVisibility() == 0) {
                    float centerX;
                    float dragCenterX2;
                    float centerY;
                    View view2 = (View) AnonymousClass3B1.f38644B.f38646C.m18854A().get();
                    Rect rect = new Rect();
                    Point point = new Point();
                    if (view2.getGlobalVisibleRect(rect, point)) {
                        rect.top = point.y;
                        rect.left = point.x;
                    } else {
                        view2.getLocationInWindow(this.f38660J);
                        int[] iArr = this.f38660J;
                        rect.top = iArr[1];
                        rect.left = iArr[0];
                    }
                    if (m18859E()) {
                        centerX = (float) this.f38656F.centerX();
                        dragCenterX2 = getDragCenterX(this);
                    } else {
                        centerX = ((float) rect.left) - this.f38654D;
                        dragCenterX2 = (float) this.f38652B.left;
                    }
                    centerX -= dragCenterX2;
                    if (m18859E()) {
                        centerY = (float) this.f38656F.centerY();
                        dragCenterX2 = getDragCenterY(this);
                    } else {
                        centerY = ((float) rect.top) - this.f38655E;
                        dragCenterX2 = (float) this.f38652B.top;
                    }
                    centerY -= dragCenterX2;
                    Animation translateAnimation = new TranslateAnimation(0.0f, centerX, 0.0f, centerY);
                    translateAnimation.setDuration((long) Math.sqrt((double) ((centerX * centerX) + (centerY * centerY))));
                    translateAnimation.setAnimationListener(this);
                    this.f38653C.startAnimation(translateAnimation);
                } else {
                    onAnimationEnd(null);
                }
            }
            this.f38658H = motionEvent.getRawX();
            this.f38659I = motionEvent.getRawY();
            AnonymousClass0cQ.L(this, 1080396345, M);
            return true;
        }
        AnonymousClass0cQ.L(this, -144497518, M);
        return false;
    }
}

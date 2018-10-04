package com.instagram.ui.widget.switchbutton;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Se;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass2M3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;

public class IgSwitch extends CompoundButton {
    /* renamed from: B */
    public Drawable f4958B;
    /* renamed from: C */
    public float f4959C;
    /* renamed from: D */
    public int f4960D;
    /* renamed from: E */
    public int f4961E;
    /* renamed from: F */
    public int f4962F;
    /* renamed from: G */
    private Boolean f4963G;
    /* renamed from: H */
    private boolean f4964H;
    /* renamed from: I */
    private final Rect f4965I = new Rect();
    /* renamed from: J */
    private Drawable f4966J;
    /* renamed from: K */
    private int f4967K;
    /* renamed from: L */
    private AnonymousClass0Se f4968L;
    /* renamed from: M */
    private int f4969M;
    /* renamed from: N */
    private float f4970N;
    /* renamed from: O */
    private float f4971O;
    /* renamed from: P */
    private Drawable f4972P;
    /* renamed from: Q */
    private VelocityTracker f4973Q;

    public IgSwitch(Context context) {
        super(context);
        m4380C(context, null, 0);
    }

    public IgSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0164R.attr.igSwitchStyle);
        m4380C(context, attributeSet, C0164R.attr.igSwitchStyle);
    }

    public IgSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4380C(context, attributeSet, i);
    }

    /* renamed from: B */
    private void m4379B(boolean z) {
        this.f4964H = true;
        Boolean bool = this.f4963G;
        if (bool == null || bool.booleanValue() != z) {
            toggle();
        }
    }

    /* renamed from: C */
    private void m4380C(Context context, AttributeSet attributeSet, int i) {
        setClickable(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4962F = viewConfiguration.getScaledTouchSlop();
        this.f4967K = viewConfiguration.getScaledMinimumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.IgSwitch, i, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f4958B = obtainStyledAttributes.getDrawable(1);
        } else {
            this.f4958B = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.toggle_nub);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.f4972P = obtainStyledAttributes.getDrawable(2);
        } else {
            this.f4972P = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.toggle);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f4966J = obtainStyledAttributes.getDrawable(0);
        } else {
            this.f4966J = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.toggle_active);
        }
        obtainStyledAttributes.recycle();
        this.f4961E = this.f4958B.getIntrinsicWidth();
        this.f4960D = this.f4972P.getIntrinsicWidth() - this.f4961E;
    }

    /* renamed from: D */
    private void m4381D(MotionEvent motionEvent) {
        boolean z = false;
        this.f4969M = 0;
        Object obj = (motionEvent.getAction() == 1 && isEnabled()) ? 1 : null;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
        if (obj != null) {
            this.f4973Q.computeCurrentVelocity(JsonMappingException.MAX_REFS_TO_LIST);
            float xVelocity = this.f4973Q.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f4967K)) {
                z = getTargetCheckedState();
            } else if (xVelocity > 0.0f) {
                z = true;
            }
            m4379B(z);
            return;
        }
        m4379B(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f4959C >= ((float) (this.f4960D / 2));
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 21263062);
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.f4973Q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4973Q = null;
        }
        AnonymousClass0cQ.m5865O(this, -1724577684, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4966J.setAlpha((int) ((this.f4959C / ((float) this.f4960D)) * 255.0f));
        this.f4972P.draw(canvas);
        this.f4966J.draw(canvas);
        int intrinsicHeight = (int) (this.f4959C + ((float) ((this.f4972P.getIntrinsicHeight() - this.f4961E) / 2)));
        this.f4958B.setBounds(getPaddingLeft() + intrinsicHeight, getPaddingTop(), (intrinsicHeight + this.f4961E) + getPaddingLeft(), getPaddingTop() + this.f4958B.getIntrinsicHeight());
        this.f4958B.draw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4965I.set(getPaddingLeft(), getPaddingTop(), this.f4972P.getIntrinsicWidth() + getPaddingLeft(), this.f4972P.getIntrinsicHeight() + getPaddingTop());
        this.f4972P.setBounds(this.f4965I);
        this.f4966J.setBounds(this.f4965I);
        this.f4959C = isChecked() ? (float) this.f4960D : 0.0f;
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.m5864N(this, 933151759);
        setMeasuredDimension((this.f4966J.getIntrinsicWidth() + getPaddingLeft()) + getPaddingRight(), (this.f4966J.getIntrinsicHeight() + getPaddingTop()) + getPaddingBottom());
        AnonymousClass0cQ.m5865O(this, 336538255, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, 1258422648);
        if (this.f4973Q == null) {
            this.f4973Q = VelocityTracker.obtain();
        }
        this.f4973Q.addMovement(motionEvent);
        float x;
        float y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                if (isEnabled()) {
                    int paddingTop = getPaddingTop() - this.f4962F;
                    float paddingLeft = ((float) getPaddingLeft()) + (this.f4959C + 0.5f);
                    int i = this.f4962F;
                    int i2 = (int) (paddingLeft - ((float) i));
                    Object obj = (x <= ((float) i2) || x >= ((float) ((this.f4961E + i2) + (i * 2))) || y <= ((float) paddingTop) || y >= ((float) ((this.f4958B.getIntrinsicHeight() + paddingTop) + (this.f4962F * 2)))) ? null : 1;
                    if (obj != null) {
                        this.f4969M = 1;
                        this.f4970N = x;
                        this.f4971O = y;
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.f4969M != 2) {
                    this.f4969M = 0;
                    this.f4973Q.clear();
                    this.f4973Q.recycle();
                    this.f4973Q = null;
                    break;
                }
                m4381D(motionEvent);
                AnonymousClass0cQ.m5862L(this, -1268269815, M);
                return true;
            case 2:
                float x2;
                switch (this.f4969M) {
                    case 0:
                        break;
                    case 1:
                        x2 = motionEvent.getX();
                        x = motionEvent.getY();
                        if (Math.abs(x2 - this.f4970N) > ((float) this.f4962F) || Math.abs(x - this.f4971O) > ((float) this.f4962F)) {
                            this.f4969M = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f4970N = x2;
                            this.f4971O = x;
                            AnonymousClass0cQ.m5862L(this, 2007210332, M);
                            return true;
                        }
                    case 2:
                        x2 = motionEvent.getX();
                        y = Math.max(0.0f, Math.min(this.f4959C + (x2 - this.f4970N), (float) this.f4960D));
                        if (y != this.f4959C) {
                            this.f4959C = y;
                            this.f4970N = x2;
                            invalidate();
                        }
                        AnonymousClass0cQ.m5862L(this, -353676197, M);
                        return true;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.m5862L(this, 1350255161, M);
        return onTouchEvent;
    }

    public final boolean performClick() {
        this.f4964H = true;
        return super.performClick();
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        Boolean bool = this.f4963G;
        if (!(bool == null || bool.booleanValue() == z)) {
            clearAnimation();
        }
        this.f4963G = Boolean.valueOf(z);
        int i = z ? this.f4960D : 0;
        if (!this.f4964H || getWindowToken() == null) {
            this.f4959C = (float) i;
            invalidate();
        } else {
            clearAnimation();
            startAnimation(new AnonymousClass2M3(this, this.f4959C, (float) i));
        }
        this.f4964H = false;
    }

    public void setCheckedAnimated(boolean z) {
        this.f4964H = true;
        setChecked(z);
    }

    public void setToggleListener(AnonymousClass0Se anonymousClass0Se) {
        this.f4968L = anonymousClass0Se;
    }

    public final void toggle() {
        AnonymousClass0Se anonymousClass0Se = this.f4968L;
        if (anonymousClass0Se == null || anonymousClass0Se.dDA(isChecked() ^ 1)) {
            super.toggle();
        }
    }
}

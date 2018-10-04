package com.instagram.ui.igeditseekbar;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0cQ;
import X.AnonymousClass2lj;
import X.AnonymousClass2lk;
import X.AnonymousClass2ll;
import X.AnonymousClass2lm;
import X.AnonymousClass3it;
import X.AnonymousClass3iu;
import X.AnonymousClass3sb;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;

public class IgEditSeekBar extends FrameLayout implements AnonymousClass2lk, AnonymousClass2lj, AnonymousClass2ll {
    /* renamed from: B */
    public AnonymousClass3it f48658B;
    /* renamed from: C */
    public float f48659C;
    /* renamed from: D */
    public AnonymousClass3iu f48660D;
    /* renamed from: E */
    public ValueAnimator f48661E;
    /* renamed from: F */
    private AccessibilityManager f48662F;
    /* renamed from: G */
    private int f48663G;
    /* renamed from: H */
    private boolean f48664H;
    /* renamed from: I */
    private AnonymousClass3sb f48665I;
    /* renamed from: J */
    private boolean f48666J;
    /* renamed from: K */
    private int f48667K;
    /* renamed from: L */
    private float f48668L;
    /* renamed from: M */
    private Paint f48669M;
    /* renamed from: N */
    private Paint f48670N;
    /* renamed from: O */
    private Drawable f48671O;
    /* renamed from: P */
    private int f48672P;
    /* renamed from: Q */
    private Drawable f48673Q;
    /* renamed from: R */
    private int f48674R;
    /* renamed from: S */
    private int f48675S;
    /* renamed from: T */
    private Paint f48676T;

    public final boolean MTA(float f, float f2) {
        return true;
    }

    public IgEditSeekBar(Context context) {
        this(context, null);
    }

    public IgEditSeekBar(Context context, AttributeSet attributeSet) {
        super(AnonymousClass0G5.C(context, C0164R.attr.seekBarStyle), attributeSet);
        this.f48667K = 100;
        this.f48664H = true;
        this.f48666J = true;
        AnonymousClass3sb anonymousClass3sb = new AnonymousClass3sb(context);
        this.f48665I = anonymousClass3sb;
        AnonymousClass2lm[] anonymousClass2lmArr = new AnonymousClass2lm[]{AnonymousClass2lm.LEFT, AnonymousClass2lm.RIGHT};
        anonymousClass3sb.f45847G = 0;
        for (int i = 0; i < anonymousClass2lmArr.length; i++) {
            if (anonymousClass2lmArr[i] != null) {
                anonymousClass3sb.f45847G = anonymousClass2lmArr[i].m17122A() | anonymousClass3sb.f45847G;
            }
        }
        this.f48665I.f45843C = this;
        this.f48665I.f45842B = this;
        this.f48665I.f45850J = this;
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.f48670N = paint;
        paint.setColor(AnonymousClass0G5.D(getContext(), C0164R.attr.seekBarInactiveColor));
        this.f48670N.setStrokeWidth((float) resources.getDimensionPixelSize(C0164R.dimen.seek_bar_width));
        paint = new Paint();
        this.f48669M = paint;
        paint.setColor(AnonymousClass0G5.D(getContext(), C0164R.attr.seekBarActiveColor));
        this.f48669M.setStrokeWidth((float) resources.getDimensionPixelSize(C0164R.dimen.seek_bar_width));
        paint = new Paint();
        this.f48676T = paint;
        paint.setColor(AnonymousClass0G5.D(getContext(), C0164R.attr.seekBarTextColor));
        this.f48676T.setTextSize((float) resources.getDimensionPixelSize(C0164R.dimen.seek_bar_text_size));
        this.f48676T.setAlpha(AnonymousClass0G5.D(getContext(), C0164R.attr.seekBarTextAlpha));
        this.f48676T.setTextAlign(Align.CENTER);
        this.f48676T.setAntiAlias(true);
        this.f48674R = resources.getDimensionPixelSize(C0164R.dimen.seek_bar_root_size);
        this.f48672P = resources.getDimensionPixelSize(AnonymousClass0G5.F(getContext(), C0164R.attr.seekBarKnobSize));
        this.f48675S = resources.getDimensionPixelSize(C0164R.dimen.seek_bar_tappable_height);
        this.f48663G = resources.getDimensionPixelSize(C0164R.dimen.seek_bar_default_gap);
        int F = AnonymousClass0G5.F(getContext(), C0164R.attr.seekBarRoot);
        this.f48673Q = F != 0 ? AnonymousClass0Ca.E(getContext(), F) : null;
        this.f48671O = AnonymousClass0Ca.E(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.seekBarKnob));
        setWillNotDraw(false);
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: B */
    private float m22205B(int i) {
        i += i > 0 ? getFatZeroRadiusSegmentSize() : -getFatZeroRadiusSegmentSize();
        if (Math.abs(i) <= getFatZeroRadiusSegmentSize()) {
            return this.f48668L;
        }
        return (((float) i) / ((float) getSeekerBarSegmentSize())) + this.f48668L;
    }

    /* renamed from: C */
    private boolean m22206C(float f, float f2) {
        if (!m22207D(f2)) {
            return false;
        }
        if (f < ((float) (getWidth() / 3))) {
            setCurrentValue(getCurrentPositionAsValue() - 1);
        } else if (f > ((float) ((getWidth() * 2) / 3))) {
            setCurrentValue(getCurrentPositionAsValue() + 1);
        }
        AnonymousClass3iu anonymousClass3iu = this.f48660D;
        if (anonymousClass3iu != null) {
            anonymousClass3iu.ej();
        }
        return true;
    }

    /* renamed from: D */
    private boolean m22207D(float f) {
        return Math.abs(f - ((float) getCenterY())) <= ((float) this.f48675S);
    }

    /* renamed from: E */
    private void m22208E(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean EDA(float f, float f2) {
        return m22206C(f, f2);
    }

    public final void Wj() {
        m22208E(false);
    }

    public final void Xj(float f, float f2) {
        m22208E(false);
        AnonymousClass3iu anonymousClass3iu = this.f48660D;
        if (anonymousClass3iu != null) {
            anonymousClass3iu.ej();
        }
    }

    public final void cj(float f, float f2, AnonymousClass2lm anonymousClass2lm, int i) {
        m22208E(false);
        AnonymousClass3iu anonymousClass3iu = this.f48660D;
        if (anonymousClass3iu != null) {
            anonymousClass3iu.ej();
        }
    }

    public final void dj(float f, float f2) {
        m22206C(f, f2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f48671O.setState(getDrawableState());
    }

    public CharSequence getAccessibilityClassName() {
        return IgEditSeekBar.class.getName();
    }

    private int getAccessibilityScrollSegmentsSize() {
        return this.f48667K / 20;
    }

    private int getCenterY() {
        return getHeight() / 2;
    }

    private int getCurrentPositionAsValue() {
        int round = Math.round((this.f48659C - this.f48668L) * ((float) getSeekerBarSegmentSize()));
        if (Math.abs(round) <= getFatZeroRadiusSegmentSize()) {
            return 0;
        }
        return round - (round > 0 ? getFatZeroRadiusSegmentSize() : -getFatZeroRadiusSegmentSize());
    }

    private int getFatZeroExtraSegmentSize() {
        float f = this.f48668L;
        if (f != 0.0f) {
            if (f != 1.0f) {
                return getFatZeroRadiusSegmentSize() * 2;
            }
        }
        return getFatZeroRadiusSegmentSize();
    }

    private int getFatZeroRadiusSegmentSize() {
        return Math.round(((float) this.f48667K) / 100.0f);
    }

    private int getKnobCenterX() {
        return getLeftBound() + ((int) (this.f48659C * ((float) getLengthPx())));
    }

    public int getKnobWidthInPx() {
        return this.f48672P;
    }

    private int getLeftBound() {
        return (this.f48672P / 2) + this.f48663G;
    }

    private int getLengthPx() {
        return ((getWidth() - (this.f48672P / 2)) - this.f48663G) - getLeftBound();
    }

    private int getMax() {
        return Math.round((1.0f - this.f48668L) * ((float) this.f48667K));
    }

    private int getMin() {
        return Math.round((-this.f48668L) * ((float) this.f48667K));
    }

    private int getRootCenterX() {
        return getLeftBound() + (((int) (this.f48668L * ((float) getLengthPx()))) * this.f48666J);
    }

    private int getSeekerBarSegmentSize() {
        return this.f48667K + getFatZeroExtraSegmentSize();
    }

    public final void gj(float f, float f2, AnonymousClass2lm anonymousClass2lm) {
        setCurrentPositionWithBounds(this, this.f48659C + (f / ((float) getLengthPx())));
    }

    public final boolean jj(float f, float f2, AnonymousClass2lm anonymousClass2lm) {
        AnonymousClass3iu anonymousClass3iu = this.f48660D;
        if (anonymousClass3iu != null) {
            anonymousClass3iu.mj();
        }
        m22208E(true);
        return true;
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -975113420);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f48661E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Runnable runnable = this.f48658B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        AnonymousClass0cQ.O(this, 806346548, N);
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int rootCenterX;
        int centerY;
        int i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) getLeftBound(), (float) getCenterY(), (float) (getLeftBound() + getLengthPx()), (float) getCenterY(), this.f48670N);
        canvas2.drawLine((float) getRootCenterX(), (float) getCenterY(), (float) getKnobCenterX(), (float) getCenterY(), this.f48669M);
        Drawable drawable = this.f48673Q;
        if (drawable != null) {
            i = this.f48674R;
            rootCenterX = getRootCenterX();
            centerY = getCenterY();
            i2 = i / 2;
            drawable.setBounds(rootCenterX - i2, centerY - i2, rootCenterX + i2, centerY + i2);
            this.f48673Q.draw(canvas);
        }
        drawable = this.f48671O;
        i = this.f48672P;
        rootCenterX = getKnobCenterX();
        centerY = getCenterY();
        i2 = i / 2;
        drawable.setBounds(rootCenterX - i2, centerY - i2, rootCenterX + i2, centerY + i2);
        this.f48671O.draw(canvas);
        if (this.f48664H) {
            i = getCurrentPositionAsValue();
            if (i != 0) {
                canvas.drawText(String.valueOf(i), (float) getKnobCenterX(), (((float) getCenterY()) / 2.0f) + this.f48676T.getFontMetrics().bottom, this.f48676T);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(getMax());
        accessibilityEvent.setCurrentItemIndex(getCurrentPositionAsValue());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED);
            accessibilityNodeInfo.addAction(DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f48665I.m21115D(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            switch (i) {
                case 21:
                case 69:
                    setCurrentValue(getCurrentPositionAsValue() - getAccessibilityScrollSegmentsSize());
                    return true;
                case 22:
                case 70:
                case 81:
                    setCurrentValue(getCurrentPositionAsValue() + getAccessibilityScrollSegmentsSize());
                    return true;
                default:
                    break;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setContentDescription(getContext().getString(C0164R.string.position_and_range, new Object[]{Integer.valueOf(getCurrentPositionAsValue()), Integer.valueOf(getMin()), Integer.valueOf(getMax())}));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1934054377);
        boolean F = this.f48665I.m21117F(motionEvent);
        boolean z = true;
        if (!F || motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            z = false;
        }
        if (z != isPressed()) {
            setPressed(z);
            invalidate();
        }
        AnonymousClass0cQ.L(this, 1826911806, M);
        return F;
    }

    public final boolean pY(float f, float f2) {
        return m22207D(f2);
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (isEnabled()) {
            if (i == DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED) {
                setCurrentValue(getCurrentPositionAsValue() + getAccessibilityScrollSegmentsSize());
                return true;
            } else if (i == DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED) {
                setCurrentValue(getCurrentPositionAsValue() - getAccessibilityScrollSegmentsSize());
                return true;
            }
        }
        return false;
    }

    public void setActiveColor(int i) {
        this.f48669M.setColor(i);
        Drawable mutate = this.f48671O.mutate();
        this.f48671O = mutate;
        mutate.setColorFilter(i, Mode.SRC_IN);
    }

    public static void setCurrentPositionWithBounds(IgEditSeekBar igEditSeekBar, float f) {
        igEditSeekBar.f48659C = Math.min(1.0f, Math.max(0.0f, f));
        AnonymousClass3iu anonymousClass3iu = igEditSeekBar.f48660D;
        if (anonymousClass3iu != null) {
            anonymousClass3iu.Ev(igEditSeekBar.getCurrentPositionAsValue());
        }
        if (igEditSeekBar.f48662F == null) {
            igEditSeekBar.f48662F = (AccessibilityManager) igEditSeekBar.getContext().getSystemService("accessibility");
        }
        if (igEditSeekBar.f48662F.isEnabled()) {
            Runnable runnable = igEditSeekBar.f48658B;
            if (runnable == null) {
                igEditSeekBar.f48658B = new AnonymousClass3it(igEditSeekBar);
            } else {
                igEditSeekBar.removeCallbacks(runnable);
            }
            igEditSeekBar.postDelayed(igEditSeekBar.f48658B, 200);
        }
        igEditSeekBar.invalidate();
    }

    public void setCurrentValue(int i) {
        setCurrentPositionWithBounds(this, m22205B(i));
    }

    public void setDisplayCurrentValueText(boolean z) {
        this.f48664H = z;
    }

    public void setInactiveColor(int i) {
        this.f48670N.setColor(i);
    }

    public void setIsCenteredInZero(boolean z) {
        this.f48666J = z;
    }

    public void setOnSeekBarChangeListener(AnonymousClass3iu anonymousClass3iu) {
        this.f48660D = anonymousClass3iu;
        if (anonymousClass3iu != null) {
            anonymousClass3iu.Ev(getCurrentPositionAsValue());
        }
    }

    public void setRootPosition(float f) {
        this.f48668L = f;
    }

    public void setSeekBarHeight(float f) {
        this.f48669M.setStrokeWidth(f);
        this.f48670N.setStrokeWidth(f);
    }

    public void setValueRangeSize(int i) {
        this.f48667K = i;
    }
}

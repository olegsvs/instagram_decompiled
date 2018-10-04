package com.facebook.react.views.text;

import X.AnonymousClass0cQ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.views.view.ReactViewBackgroundManager;

public final class ReactTextView extends TextView implements ReactCompoundView {
    private static final LayoutParams EMPTY_LAYOUT_PARAMS = new LayoutParams(0, 0);
    private boolean mContainsImages;
    private int mDefaultGravityHorizontal = (getGravity() & 8388615);
    private int mDefaultGravityVertical = (getGravity() & 112);
    private TruncateAt mEllipsizeLocation = TruncateAt.END;
    private float mLineHeight = Float.NaN;
    private int mNumberOfLines = Integer.MAX_VALUE;
    private ReactViewBackgroundManager mReactBackgroundManager = new ReactViewBackgroundManager(this);
    private int mTextAlign = 0;
    private boolean mTextIsSelectable;

    public ReactTextView(Context context) {
        super(context);
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                if (textInlineImageSpanArr[i].getDrawable() == drawable) {
                    invalidate();
                }
                i++;
            }
        }
        super.invalidateDrawable(drawable);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1808876537);
        super.onAttachedToWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onAttachedToWindow();
                i++;
            }
        }
        AnonymousClass0cQ.O(this, 29603842, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 425109165);
        super.onDetachedFromWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onDetachedFromWindow();
                i++;
            }
        }
        AnonymousClass0cQ.O(this, 1565659421, N);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onFinishTemporaryDetach();
                i++;
            }
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onStartTemporaryDetach();
                i++;
            }
        }
    }

    public final int reactTagForTouch(float f, float f2) {
        CharSequence text = getText();
        int id = getId();
        int i = (int) f;
        int i2 = (int) f2;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i2);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i >= lineLeft && i <= lineRight) {
                Spanned spanned = (Spanned) text;
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i);
                ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
                if (reactTagSpanArr != null) {
                    int length = text.length();
                    for (lineForVertical = 0; lineForVertical < reactTagSpanArr.length; lineForVertical++) {
                        lineLeft = spanned.getSpanStart(reactTagSpanArr[lineForVertical]);
                        lineRight = spanned.getSpanEnd(reactTagSpanArr[lineForVertical]);
                        if (lineRight > offsetForHorizontal) {
                            lineRight -= lineLeft;
                            if (lineRight <= length) {
                                id = reactTagSpanArr[lineForVertical].getReactTag();
                                length = lineRight;
                            }
                        }
                    }
                }
            }
        }
        return id;
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public final void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.setBorderRadius(f);
    }

    public final void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.setBorderRadius(f, i);
    }

    public void setBorderStyle(String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public final void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.setBorderWidth(i, f);
    }

    public void setEllipsizeLocation(TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.mDefaultGravityHorizontal;
        }
        setGravity(i | ((getGravity() & -8) & -8388616));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.mDefaultGravityVertical;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.mNumberOfLines);
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        this.mContainsImages = reactTextUpdate.containsImages();
        if (getLayoutParams() == null) {
            setLayoutParams(EMPTY_LAYOUT_PARAMS);
        }
        setText(reactTextUpdate.getText());
        setPadding((int) Math.floor((double) reactTextUpdate.getPaddingLeft()), (int) Math.floor((double) reactTextUpdate.getPaddingTop()), (int) Math.floor((double) reactTextUpdate.getPaddingRight()), (int) Math.floor((double) reactTextUpdate.getPaddingBottom()));
        int textAlign = reactTextUpdate.getTextAlign();
        if (this.mTextAlign != textAlign) {
            this.mTextAlign = textAlign;
        }
        setGravityHorizontal(this.mTextAlign);
        if (VERSION.SDK_INT >= 23 && getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
            setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
        }
    }

    public void setTextIsSelectable(boolean z) {
        this.mTextIsSelectable = z;
        super.setTextIsSelectable(z);
    }

    public final void updateView() {
        setEllipsize(this.mNumberOfLines == Integer.MAX_VALUE ? null : this.mEllipsizeLocation);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                if (textInlineImageSpanArr[i].getDrawable() == drawable) {
                    return true;
                }
                i++;
            }
        }
        return super.verifyDrawable(drawable);
    }
}

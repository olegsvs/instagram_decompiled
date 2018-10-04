package com.instagram.common.ui.text;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0qJ;
import X.AnonymousClass186;
import X.AnonymousClass25r;
import X.AnonymousClass25s;
import X.AnonymousClass25t;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpandingTextView extends TextView {
    /* renamed from: B */
    public AnonymousClass25s f25871B;
    /* renamed from: C */
    private boolean f25872C;
    /* renamed from: D */
    private int f25873D;
    /* renamed from: E */
    private int f25874E;
    /* renamed from: F */
    private int f25875F;
    /* renamed from: G */
    private CharSequence f25876G;
    /* renamed from: H */
    private CharSequence f25877H;
    /* renamed from: I */
    private boolean f25878I;
    /* renamed from: J */
    private boolean f25879J;
    /* renamed from: K */
    private int f25880K;
    /* renamed from: L */
    private AnonymousClass25t f25881L;
    /* renamed from: M */
    private int f25882M;
    /* renamed from: N */
    private boolean f25883N;

    public void setEllipsize(TruncateAt truncateAt) {
    }

    public ExpandingTextView(Context context) {
        super(context);
        m14389D(context, null);
    }

    public ExpandingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14389D(context, attributeSet);
    }

    public ExpandingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14389D(context, attributeSet);
    }

    /* renamed from: B */
    public static void m14387B(ExpandingTextView expandingTextView) {
        if (expandingTextView.f25879J) {
            m14390E(expandingTextView, expandingTextView.f25875F);
            AnonymousClass25t anonymousClass25t = expandingTextView.f25881L;
            if (anonymousClass25t != null) {
                anonymousClass25t.onCollapse();
            }
        }
    }

    /* renamed from: C */
    public static void m14388C(ExpandingTextView expandingTextView) {
        m14390E(expandingTextView, expandingTextView.getTextLayoutParams().A(expandingTextView.f25877H).getLineCount());
        AnonymousClass25t anonymousClass25t = expandingTextView.f25881L;
        if (anonymousClass25t != null) {
            anonymousClass25t.onExpand();
        }
    }

    /* renamed from: D */
    private void m14389D(Context context, AttributeSet attributeSet) {
        super.setEllipsize(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.ExpandingTextView);
        this.f25879J = obtainStyledAttributes.getBoolean(4, true);
        if (obtainStyledAttributes.getString(3) != null) {
            this.f25876G = Html.fromHtml(obtainStyledAttributes.getString(3));
        } else {
            this.f25876G = "…";
        }
        this.f25874E = obtainStyledAttributes.getInteger(2, 10);
        this.f25872C = obtainStyledAttributes.getBoolean(0, false);
        this.f25873D = obtainStyledAttributes.getInteger(1, StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS);
        obtainStyledAttributes.recycle();
        this.f25871B = AnonymousClass25s.COLLAPSED;
        this.f25881L = null;
        this.f25882M = getMaxLines();
        this.f25875F = getMaxLines();
        super.setOnClickListener(new AnonymousClass25r(this));
    }

    /* renamed from: E */
    private static void m14390E(ExpandingTextView expandingTextView, int i) {
        if (expandingTextView.f25872C) {
            expandingTextView.setMaxLines(expandingTextView.getLineCount());
            int abs = Math.abs(expandingTextView.getLineCount() - i);
            if (abs > 0) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(expandingTextView, "maxLines", new int[]{i});
                ofInt.setDuration((long) Math.min(expandingTextView.f25874E * abs, expandingTextView.f25873D));
                ofInt.start();
            } else {
                expandingTextView.setMaxLines(i);
            }
            return;
        }
        expandingTextView.setMaxLines(i);
    }

    public int getMaxLines() {
        return this.f25882M;
    }

    private AnonymousClass0qJ getTextLayoutParams() {
        return new AnonymousClass0qJ(getPaint(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 0.0f, 1.0f, false);
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.N(this, -2122387954);
        super.onMeasure(i, i2);
        if (this.f25883N || this.f25880K != getMeasuredWidth()) {
            this.f25878I = true;
            CharSequence B = AnonymousClass186.B(JsonProperty.USE_DEFAULT_NAME, this.f25877H, this.f25876G, this.f25882M, getTextLayoutParams(), true, false);
            if (B.length() != this.f25877H.length()) {
                B = TextUtils.concat(new CharSequence[]{B, this.f25876G});
            }
            setText(B, BufferType.SPANNABLE);
            this.f25878I = false;
            this.f25883N = false;
            this.f25880K = getMeasuredWidth();
            super.onMeasure(i, i2);
        }
        AnonymousClass0cQ.O(this, 2107952014, N);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f25878I) {
            this.f25877H = charSequence;
            this.f25883N = true;
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f25882M = i;
        this.f25883N = true;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new UnsupportedOperationException("Can't override the onClickListener for this view");
    }

    public void setOnExpandedStateChangeListener(AnonymousClass25t anonymousClass25t) {
        this.f25881L = anonymousClass25t;
    }
}

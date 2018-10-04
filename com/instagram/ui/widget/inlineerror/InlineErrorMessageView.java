package com.instagram.ui.widget.inlineerror;

import X.AnonymousClass0Ca;
import X.AnonymousClass0LH;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass3jg;
import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class InlineErrorMessageView extends LinearLayout {
    /* renamed from: K */
    public static final TimeInterpolator f43786K = new DecelerateInterpolator();
    /* renamed from: B */
    public int f43787B;
    /* renamed from: C */
    public int f43788C;
    /* renamed from: D */
    public String f43789D;
    /* renamed from: E */
    public int f43790E;
    /* renamed from: F */
    public int f43791F;
    /* renamed from: G */
    public TextView f43792G;
    /* renamed from: H */
    private boolean f43793H;
    /* renamed from: I */
    private Drawable f43794I;
    /* renamed from: J */
    private View f43795J;

    public InlineErrorMessageView(Context context) {
        super(context);
        m20521D(context, null);
    }

    public InlineErrorMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20521D(context, attributeSet);
    }

    public InlineErrorMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20521D(context, attributeSet);
    }

    /* renamed from: A */
    public final void m20525A() {
        TextView textView = this.f43792G;
        if (textView != null) {
            boolean z = this.f43793H;
            this.f43793H = false;
            textView.setVisibility(8);
            if (z) {
                m20523F(false);
            }
            m20524G();
        }
    }

    /* renamed from: B */
    public static void m20519B(ViewGroup viewGroup) {
        AnonymousClass0LH.E(viewGroup);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
            viewGroup.setLayoutTransition(layoutTransition);
        }
        layoutTransition.enableTransitionType(4);
        viewGroup.setClipChildren(false);
    }

    /* renamed from: B */
    public final void m20526B(String str) {
        if (str == null) {
            return;
        }
        if (!str.trim().isEmpty()) {
            boolean z = this.f43793H;
            TextView textView = this.f43792G;
            Object obj = (textView == null || textView.getVisibility() != 0) ? null : 1;
            this.f43793H = true;
            m20522E();
            this.f43792G.setVisibility(0);
            this.f43792G.setText(str);
            this.f43792G.setTextColor(this.f43788C);
            if (!z) {
                m20523F(true);
            }
            if (obj == null) {
                this.f43792G.setAlpha(0.0f);
                this.f43792G.animate().alpha(1.0f).setDuration(200).setInterpolator(f43786K).start();
            }
        }
    }

    /* renamed from: C */
    public static void m20520C(InlineErrorMessageView inlineErrorMessageView) {
        boolean z = true;
        if (inlineErrorMessageView.f43787B == 0) {
            if (inlineErrorMessageView.f43791F != 0) {
                z = false;
            }
            AnonymousClass0LH.I(z, "Descendant view was provided without specifying the error background");
            return;
        }
        int i = inlineErrorMessageView.f43791F;
        View childAt;
        if (i == 0) {
            childAt = inlineErrorMessageView.getChildAt(0);
            inlineErrorMessageView.f43795J = childAt;
            if (childAt == null) {
                z = false;
            }
            AnonymousClass0LH.I(z, "Error background was provided but no child view exists to apply it to");
        } else {
            childAt = inlineErrorMessageView.findViewById(i);
            inlineErrorMessageView.f43795J = childAt;
            if (childAt == null) {
                z = false;
            }
            AnonymousClass0LH.I(z, "Descendant view (to apply error background to) wasn't found by provided id");
        }
        inlineErrorMessageView.f43794I = inlineErrorMessageView.f43795J.getBackground();
    }

    /* renamed from: D */
    private void m20521D(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.InlineErrorMessageView);
            this.f43791F = obtainStyledAttributes.getResourceId(0, 0);
            this.f43787B = obtainStyledAttributes.getResourceId(1, 0);
            this.f43789D = obtainStyledAttributes.getString(3);
            this.f43790E = obtainStyledAttributes.getColor(4, AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
            this.f43788C = obtainStyledAttributes.getColor(2, AnonymousClass0Ca.C(getContext(), C0164R.color.red_5));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: E */
    private void m20522E() {
        if (this.f43792G == null) {
            this.f43792G = (TextView) LayoutInflater.from(getContext()).inflate(C0164R.layout.inline_error_text_view, this, false);
            boolean z = false;
            View childAt = getChildAt(0);
            if (childAt != null) {
                z = true;
            }
            AnonymousClass0LH.I(z, "InlineErrorMessageView has no children; it has to wrap at least one view.");
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f43792G.getLayoutParams();
            marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
            addView(this.f43792G);
        }
    }

    /* renamed from: F */
    private void m20523F(boolean z) {
        View view = this.f43795J;
        if (view != null) {
            if (z) {
                int i = this.f43787B;
                if (i != 0) {
                    view.setBackgroundResource(i);
                    return;
                }
            }
            if (!z) {
                this.f43795J.setBackgroundDrawable(this.f43794I);
                Drawable drawable = this.f43794I;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
        }
    }

    /* renamed from: G */
    private void m20524G() {
        if (this.f43789D != null && !this.f43793H) {
            m20522E();
            this.f43792G.setVisibility(0);
            this.f43792G.setText(this.f43789D);
            this.f43792G.setTextColor(this.f43790E);
        }
    }

    public final void onFinishInflate() {
        int N = AnonymousClass0cQ.N(this, 883834395);
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3jg(this));
        m20524G();
        AnonymousClass0cQ.O(this, -1027431541, N);
    }

    public void setHint(String str) {
        this.f43789D = str;
        m20524G();
    }
}

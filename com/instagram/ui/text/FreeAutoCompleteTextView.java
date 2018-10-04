package com.instagram.ui.text;

import X.AnonymousClass0cQ;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;

public class FreeAutoCompleteTextView extends AutoCompleteTextView {
    /* renamed from: B */
    private int f28855B;

    public FreeAutoCompleteTextView(Context context) {
        super(context);
        m15011B();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15011B();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15011B();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m15011B();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, Theme theme) {
        super(context, attributeSet, i, i2, theme);
    }

    /* renamed from: B */
    private void m15011B() {
        this.f28855B = super.getThreshold();
    }

    /* renamed from: C */
    private void m15012C() {
        if ((VERSION.SDK_INT < 24 || !isTemporarilyDetached()) && enoughToFilter() && getAdapter() != null) {
            performFiltering(getText(), 0);
            showDropDown();
        }
    }

    public final boolean enoughToFilter() {
        if (this.f28855B != 0) {
            if (getText() == null || getText().length() < this.f28855B) {
                return false;
            }
        }
        return true;
    }

    public int getThreshold() {
        return this.f28855B;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int N = AnonymousClass0cQ.N(this, -2073548998);
        super.onFocusChanged(z, i, rect);
        if (z) {
            m15012C();
        }
        AnonymousClass0cQ.O(this, 942823085, N);
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        m15012C();
    }

    public void setThreshold(int i) {
        if (i < 0) {
            i = 1;
        }
        this.f28855B = i;
        m15012C();
    }
}

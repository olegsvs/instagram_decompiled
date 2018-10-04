package com.instagram.ui.animation;

import android.view.View;

public class PaddingPropertyDelegatingTarget {
    /* renamed from: B */
    private final View f17994B;

    public void setPaddingBottom(int i) {
        View view = this.f17994B;
        view.setPadding(view.getPaddingLeft(), this.f17994B.getPaddingTop(), this.f17994B.getPaddingRight(), i);
    }

    public void setPaddingLeft(int i) {
        View view = this.f17994B;
        view.setPadding(i, view.getPaddingTop(), this.f17994B.getPaddingRight(), this.f17994B.getPaddingBottom());
    }

    public void setPaddingLeftAndRight(int i) {
        View view = this.f17994B;
        view.setPadding(i, view.getPaddingTop(), i, this.f17994B.getPaddingBottom());
    }

    public void setPaddingRight(int i) {
        View view = this.f17994B;
        view.setPadding(view.getPaddingLeft(), this.f17994B.getPaddingTop(), i, this.f17994B.getPaddingBottom());
    }

    public void setPaddingTop(int i) {
        View view = this.f17994B;
        view.setPadding(view.getPaddingLeft(), i, this.f17994B.getPaddingRight(), this.f17994B.getPaddingBottom());
    }

    public void setPaddingTopAndBottom(int i) {
        View view = this.f17994B;
        view.setPadding(view.getPaddingLeft(), i, this.f17994B.getPaddingRight(), i);
    }
}

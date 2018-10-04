package com.instagram.ui.listview;

import X.AnonymousClass0cQ;
import X.AnonymousClass0iW;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;

public class StickyHeaderListView extends FrameLayout {
    /* renamed from: B */
    public boolean f9394B;
    /* renamed from: C */
    public View f9395C;
    /* renamed from: D */
    public View f9396D;
    /* renamed from: E */
    private Rect f9397E = new Rect();
    /* renamed from: F */
    private AnonymousClass0iW f9398F;
    /* renamed from: G */
    private int f9399G = Integer.MAX_VALUE;
    /* renamed from: H */
    private final Rect f9400H = new Rect();

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    private void m7226B() {
        if (!this.f9394B) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof ListView) {
                    setListView((ListView) childAt);
                }
            }
            this.f9395C = new View(getContext());
            this.f9395C.setLayoutParams(new LayoutParams(-1, 1, 48));
            this.f9395C.setBackgroundColor(0);
            this.f9394B = true;
        }
        this.f9398F = AnonymousClass0iW.m6907C(getContext());
    }

    private float getContentPosition() {
        AnonymousClass0iW anonymousClass0iW = this.f9398F;
        return anonymousClass0iW == null ? 0.0f : anonymousClass0iW.m6910A();
    }

    public Rect getTopChromeArea() {
        Rect rect = this.f9397E;
        if (rect == null || rect.height() == 0) {
            rect = new Rect();
            this.f9397E = rect;
            getGlobalVisibleRect(rect);
        }
        View view = this.f9396D;
        if (view == null || view == this.f9395C) {
            this.f9400H.top = this.f9397E.top;
            this.f9400H.bottom = this.f9397E.top + Math.round(getContentPosition());
            this.f9400H.left = this.f9397E.left;
            this.f9400H.right = this.f9397E.right;
            return this.f9400H;
        }
        Rect rect2 = this.f9400H;
        rect2.top = 0;
        rect2.bottom = (this.f9397E.top + this.f9396D.getHeight()) + this.f9399G;
        this.f9400H.left = this.f9397E.left;
        this.f9400H.right = this.f9397E.right;
        return this.f9400H;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 599425621);
        super.onAttachedToWindow();
        m7226B();
        AnonymousClass0cQ.m5865O(this, 580546913, N);
    }

    public final void onFinishInflate() {
        int N = AnonymousClass0cQ.m5864N(this, -1974584638);
        super.onFinishInflate();
        m7226B();
        AnonymousClass0cQ.m5865O(this, 47742888, N);
    }

    public void setListView(ListView listView) {
    }
}

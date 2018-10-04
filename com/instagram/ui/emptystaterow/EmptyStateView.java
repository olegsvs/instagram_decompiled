package com.instagram.ui.emptystaterow;

import X.AnonymousClass0eS;
import X.AnonymousClass2Hx;
import X.AnonymousClass2Hy;
import X.AnonymousClass2Hz;
import X.AnonymousClass2I0;
import X.AnonymousClass2I1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ScrollView;
import java.util.HashMap;

public class EmptyStateView extends ScrollView {
    /* renamed from: B */
    public final HashMap f28623B;
    /* renamed from: C */
    private final View f28624C;
    /* renamed from: D */
    private AnonymousClass2I0 f28625D;

    public EmptyStateView(Context context) {
        this(context, null);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HashMap hashMap = new HashMap();
        this.f28623B = hashMap;
        hashMap.put(AnonymousClass2I0.EMPTY, new AnonymousClass2Hx());
        this.f28623B.put(AnonymousClass2I0.LOADING, new AnonymousClass2Hx());
        this.f28623B.put(AnonymousClass2I0.ERROR, new AnonymousClass2Hx());
        this.f28623B.put(AnonymousClass2I0.GONE, new AnonymousClass2Hx());
        setFillViewport(true);
        View C = AnonymousClass2I1.m14956C(context, this);
        this.f28624C = C;
        addView(C);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.EmptyStateView, 0, 0);
        AnonymousClass2Hx anonymousClass2Hx = (AnonymousClass2Hx) this.f28623B.get(AnonymousClass2I0.EMPTY);
        anonymousClass2Hx.f28600F = obtainStyledAttributes.getResourceId(7, 0);
        anonymousClass2Hx.f28599E = obtainStyledAttributes.getColor(1, -1);
        anonymousClass2Hx.f28608N = obtainStyledAttributes.getString(13);
        anonymousClass2Hx.f28606L = obtainStyledAttributes.getString(12);
        anonymousClass2Hx.f28597C = obtainStyledAttributes.getString(0);
        AnonymousClass2Hx anonymousClass2Hx2 = (AnonymousClass2Hx) this.f28623B.get(AnonymousClass2I0.LOADING);
        anonymousClass2Hx2.f28608N = obtainStyledAttributes.getString(10);
        anonymousClass2Hx2.f28606L = obtainStyledAttributes.getString(9);
        anonymousClass2Hx2.f28597C = obtainStyledAttributes.getString(8);
        anonymousClass2Hx2 = (AnonymousClass2Hx) this.f28623B.get(AnonymousClass2I0.ERROR);
        anonymousClass2Hx2.f28600F = obtainStyledAttributes.getResourceId(4, 0);
        anonymousClass2Hx.f28599E = obtainStyledAttributes.getColor(3, -1);
        anonymousClass2Hx2.f28608N = obtainStyledAttributes.getString(6);
        anonymousClass2Hx2.f28606L = obtainStyledAttributes.getString(5);
        anonymousClass2Hx2.f28597C = obtainStyledAttributes.getString(2);
        m14967K(AnonymousClass2I0.values()[obtainStyledAttributes.getInt(11, 0)]);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public final EmptyStateView m14957A() {
        AnonymousClass2I1.m14955B(new AnonymousClass2Hz(this.f28624C), (AnonymousClass2Hx) this.f28623B.get(this.f28625D), this.f28625D);
        return this;
    }

    /* renamed from: B */
    public final EmptyStateView m14958B(int i, AnonymousClass2I0 anonymousClass2I0) {
        ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28597C = getResources().getString(i);
        return this;
    }

    /* renamed from: C */
    public final EmptyStateView m14959C(AnonymousClass2Hy anonymousClass2Hy, AnonymousClass2I0 anonymousClass2I0) {
        if (this.f28623B.get(anonymousClass2I0) != null) {
            ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28598D = anonymousClass2Hy;
        }
        return this;
    }

    /* renamed from: D */
    public final EmptyStateView m14960D() {
        return m14967K(AnonymousClass2I0.EMPTY);
    }

    /* renamed from: E */
    public final EmptyStateView m14961E() {
        return m14967K(AnonymousClass2I0.ERROR);
    }

    /* renamed from: F */
    public final EmptyStateView m14962F() {
        return m14967K(AnonymousClass2I0.GONE);
    }

    /* renamed from: G */
    public final EmptyStateView m14963G(int i, AnonymousClass2I0 anonymousClass2I0) {
        ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28600F = i;
        return this;
    }

    /* renamed from: H */
    public final EmptyStateView m14964H(int i, AnonymousClass2I0 anonymousClass2I0) {
        ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28599E = i;
        return this;
    }

    /* renamed from: I */
    public final EmptyStateView m14965I() {
        return m14967K(AnonymousClass2I0.LOADING);
    }

    /* renamed from: J */
    public final EmptyStateView m14966J(OnClickListener onClickListener, AnonymousClass2I0 anonymousClass2I0) {
        if (this.f28623B.containsKey(anonymousClass2I0)) {
            ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28610P = onClickListener;
        }
        return this;
    }

    /* renamed from: K */
    public final EmptyStateView m14967K(AnonymousClass2I0 anonymousClass2I0) {
        if (anonymousClass2I0 == this.f28625D) {
            return this;
        }
        this.f28625D = anonymousClass2I0;
        return m14957A();
    }

    /* renamed from: L */
    public final EmptyStateView m14968L(int i, AnonymousClass2I0 anonymousClass2I0) {
        return m14969M(getResources().getString(i), anonymousClass2I0);
    }

    /* renamed from: M */
    public final EmptyStateView m14969M(String str, AnonymousClass2I0 anonymousClass2I0) {
        ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28606L = str;
        return this;
    }

    /* renamed from: N */
    public final EmptyStateView m14970N(int i, AnonymousClass2I0 anonymousClass2I0) {
        ((AnonymousClass2Hx) this.f28623B.get(anonymousClass2I0)).f28608N = getResources().getString(i);
        return this;
    }
}

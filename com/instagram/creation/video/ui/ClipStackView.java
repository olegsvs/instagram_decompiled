package com.instagram.creation.video.ui;

import X.AnonymousClass0eS;
import X.AnonymousClass3Hi;
import X.AnonymousClass3pF;
import X.AnonymousClass3pG;
import X.AnonymousClass3zt;
import X.AnonymousClass3zv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.Iterator;

public class ClipStackView extends LinearLayout implements AnonymousClass3Hi {
    /* renamed from: B */
    public AnonymousClass3zt f48128B;
    /* renamed from: C */
    private final Drawable f48129C;
    /* renamed from: D */
    private final Drawable f48130D;

    public final void ax() {
    }

    public final void jg(AnonymousClass3pG anonymousClass3pG, AnonymousClass3pF anonymousClass3pF) {
    }

    public final void kg(AnonymousClass3pG anonymousClass3pG) {
    }

    public final void ng() {
    }

    public ClipStackView(Context context) {
        this(context, null);
    }

    public ClipStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.ClipStackView, 0, 0);
        this.f48129C = obtainStyledAttributes.getDrawable(0);
        this.f48130D = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public static void m21962B(ClipStackView clipStackView, AnonymousClass3pG anonymousClass3pG) {
        clipStackView.addView(new AnonymousClass3zv(clipStackView.getContext(), anonymousClass3pG, clipStackView.f48129C.getConstantState().newDrawable(), clipStackView.f48130D.getConstantState().newDrawable()));
    }

    public final void ig(AnonymousClass3pG anonymousClass3pG) {
        m21962B(this, anonymousClass3pG);
    }

    public final void mg(AnonymousClass3pG anonymousClass3pG) {
        AnonymousClass3zv anonymousClass3zv = (AnonymousClass3zv) findViewWithTag(anonymousClass3pG);
        anonymousClass3pG.f44940E.remove(anonymousClass3zv);
        removeView(anonymousClass3zv);
    }

    public void setClipStack(AnonymousClass3zt anonymousClass3zt) {
        this.f48128B = anonymousClass3zt;
        Iterator it = this.f48128B.iterator();
        while (it.hasNext()) {
            m21962B(this, (AnonymousClass3pG) it.next());
        }
    }
}

package com.instagram.ui.viewpager;

import X.AnonymousClass1MI;
import X.AnonymousClass1MS;
import android.content.Context;
import android.util.AttributeSet;

public class SwipeConfigurableViewPager extends AnonymousClass1MI {
    /* renamed from: B */
    private AnonymousClass1MS f17589B = AnonymousClass1MS.ALL;

    public SwipeConfigurableViewPager(Context context) {
        super(context);
    }

    public SwipeConfigurableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final boolean mo2476D(android.view.View r4, boolean r5, int r6, int r7, int r8) {
        /*
        r3 = this;
        r1 = X.AnonymousClass5J2.f61931B;
        r0 = r3.f17589B;
        r0 = r0.ordinal();
        r2 = r1[r0];
        r1 = 0;
        r0 = 1;
        switch(r2) {
            case 1: goto L_0x0027;
            case 2: goto L_0x001e;
            case 3: goto L_0x0014;
            default: goto L_0x000f;
        };
    L_0x000f:
        r0 = super.mo2476D(r4, r5, r6, r7, r8);
        return r0;
    L_0x0014:
        if (r6 < 0) goto L_0x001c;
    L_0x0016:
        r0 = super.mo2476D(r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        r1 = 1;
    L_0x001d:
        return r1;
    L_0x001e:
        if (r6 > 0) goto L_0x001c;
    L_0x0020:
        r0 = super.mo2476D(r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x001d;
    L_0x0026:
        goto L_0x001c;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.viewpager.SwipeConfigurableViewPager.D(android.view.View, boolean, int, int, int):boolean");
    }

    public AnonymousClass1MS getSwipeConfiguration() {
        return this.f17589B;
    }

    public void setSwipeConfiguration(AnonymousClass1MS anonymousClass1MS) {
        this.f17589B = anonymousClass1MS;
    }
}

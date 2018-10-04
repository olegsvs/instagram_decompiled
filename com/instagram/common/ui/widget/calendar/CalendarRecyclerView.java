package com.instagram.common.ui.widget.calendar;

import X.AnonymousClass0la;
import X.AnonymousClass0nJ;
import X.AnonymousClass12f;
import X.AnonymousClass1oG;
import X.AnonymousClass25x;
import X.AnonymousClass2Uv;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class CalendarRecyclerView extends RecyclerView {
    /* renamed from: B */
    private final AnonymousClass1oG f25893B;

    public CalendarRecyclerView(Context context) {
        this(context, null);
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass0la anonymousClass1oG = new AnonymousClass1oG(getContext(), AnonymousClass25x.f25887G);
        this.f25893B = anonymousClass1oG;
        setLayoutManager(anonymousClass1oG);
        AnonymousClass12f recycledViewPool = getRecycledViewPool();
        recycledViewPool.C(2, 21);
        recycledViewPool.C(0, 90);
        recycledViewPool.C(1, 28);
    }

    public void setAdapter(AnonymousClass0nJ anonymousClass0nJ) {
        if (anonymousClass0nJ instanceof AnonymousClass25x) {
            AnonymousClass25x anonymousClass25x = (AnonymousClass25x) anonymousClass0nJ;
            this.f25893B.f22918I = new AnonymousClass2Uv(anonymousClass25x);
            super.setAdapter(anonymousClass25x);
            return;
        }
        throw new IllegalArgumentException("adapter must be an instance of CalendarAdapter");
    }
}

package com.instagram.common.ui.text;

import X.AnonymousClass0eS;
import X.AnonymousClass1Dp;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;

public class TitleTextView extends TextView {
    /* renamed from: B */
    private static Typeface f7720B;

    public TitleTextView(Context context) {
        super(context);
        m6307B(context, null, 0);
    }

    public TitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6307B(context, attributeSet, 0);
    }

    public TitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6307B(context, attributeSet, i);
    }

    /* renamed from: B */
    private void m6307B(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.TitleTextView, i, 0);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.hasValue(20) ? obtainStyledAttributes.getBoolean(20, true) ^ true : true;
        if (obtainStyledAttributes.hasValue(10)) {
            z = obtainStyledAttributes.getBoolean(10, true);
        }
        obtainStyledAttributes.recycle();
        setIsBold(z2);
        if (z) {
            Locale locale = getResources().getConfiguration().locale;
            AnonymousClass1Dp anonymousClass1Dp = AnonymousClass1Dp.f15726C;
            if (anonymousClass1Dp == null || !anonymousClass1Dp.f15727B.equals(locale)) {
                AnonymousClass1Dp.f15726C = new AnonymousClass1Dp(locale);
            }
            setTransformationMethod(AnonymousClass1Dp.f15726C);
        }
    }

    public void setIsBold(boolean z) {
        if (!z) {
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            if (f7720B == null) {
                f7720B = Typeface.create("sans-serif-medium", 0);
            }
            setTypeface(f7720B);
            return;
        }
        getPaint().setFakeBoldText(true);
    }
}

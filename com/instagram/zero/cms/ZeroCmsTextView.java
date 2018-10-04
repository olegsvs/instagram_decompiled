package com.instagram.zero.cms;

import X.AnonymousClass0eS;
import X.AnonymousClass5Qy;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class ZeroCmsTextView extends TextView {
    /* renamed from: B */
    public String f63362B;
    /* renamed from: C */
    public AnonymousClass5Qy f63363C;

    public ZeroCmsTextView(Context context) {
        super(context);
        m26492B(context, null);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26492B(context, attributeSet);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26492B(context, attributeSet);
    }

    /* renamed from: B */
    private void m26492B(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.ZeroCmsTextView);
        this.f63362B = obtainStyledAttributes.getString(1);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setText((String) context.getText(resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    public void setText(String str, String str2) {
        this.f63362B = str;
        AnonymousClass5Qy anonymousClass5Qy = this.f63363C;
        if (anonymousClass5Qy != null) {
            str2 = anonymousClass5Qy.getString(str, str2);
        }
        setText(str2);
        setContentDescription(str2);
    }
}

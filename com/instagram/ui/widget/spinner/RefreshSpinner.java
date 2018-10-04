package com.instagram.ui.widget.spinner;

import X.AnonymousClass0Ca;
import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.C0164R;

public class RefreshSpinner extends SpinnerImageView {
    public RefreshSpinner(Context context) {
        super(context);
        m6309C(null);
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6309C(attributeSet);
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6309C(attributeSet);
    }

    /* renamed from: C */
    private void m6309C(AttributeSet attributeSet) {
        setImageResource(C0164R.drawable.nav_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.RefreshSpinner);
            setDark(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public void setDark(boolean z) {
        getDrawable().mutate().setColorFilter(z ? AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_9)) : null);
    }
}

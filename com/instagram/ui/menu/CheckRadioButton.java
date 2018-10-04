package com.instagram.ui.menu;

import X.AnonymousClass0Ca;
import X.AnonymousClass0ca;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.facebook.C0164R;

public class CheckRadioButton extends RadioButton {
    /* renamed from: B */
    private Drawable f28703B;

    public CheckRadioButton(Context context) {
        super(context);
        m14986B();
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14986B();
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14986B();
    }

    /* renamed from: B */
    private void m14986B() {
        Drawable E = AnonymousClass0Ca.E(getContext(), C0164R.drawable.circle_check);
        this.f28703B = E;
        E.mutate().setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5)));
        setCompoundDrawablePadding(getContext().getResources().getDimensionPixelSize(C0164R.dimen.row_text_button_padding));
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        if (z) {
            setTextColor(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5));
        } else {
            setTextColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_9));
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], z ? this.f28703B : null, compoundDrawables[3]);
    }
}

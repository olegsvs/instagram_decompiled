package com.instagram.ui.widget.checkbox;

import X.AnonymousClass0Ca;
import X.AnonymousClass2KS;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.facebook.C0164R;

public class IgCheckBox extends CheckBox {
    /* renamed from: B */
    public int f29006B;
    /* renamed from: C */
    public int f29007C;

    public IgCheckBox(Context context) {
        super(context);
        m15092B();
    }

    public IgCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15092B();
    }

    public IgCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15092B();
    }

    /* renamed from: B */
    private void m15092B() {
        this.f29006B = C0164R.color.blue_5;
        this.f29007C = C0164R.color.grey_2;
        Drawable anonymousClass2KS = new AnonymousClass2KS(this);
        anonymousClass2KS.addState(new int[]{16842912}, AnonymousClass0Ca.E(getContext(), C0164R.drawable.checkbox_checked));
        anonymousClass2KS.addState(new int[]{-16842912}, AnonymousClass0Ca.E(getContext(), C0164R.drawable.checkbox_unchecked));
        setButtonDrawable(anonymousClass2KS);
    }
}

package com.instagram.wellbeing.accounttransparency.ui;

import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class NavigationItemLayout extends LinearLayout {
    /* renamed from: B */
    private TextView f63274B;
    /* renamed from: C */
    private TextView f63275C;
    /* renamed from: D */
    private TextView f63276D;
    /* renamed from: E */
    private TextView f63277E;

    public NavigationItemLayout(Context context) {
        super(context);
        m26471B(context, null);
    }

    public NavigationItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26471B(context, attributeSet);
    }

    public NavigationItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26471B(context, attributeSet);
    }

    /* renamed from: B */
    private void m26471B(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.NavigationItemLayout, 0, 0);
        inflate(context, C0164R.layout.navigation_item_layout, this);
        this.f63277E = (TextView) findViewById(C0164R.id.item_title);
        m26472C(obtainStyledAttributes.getString(3), this.f63277E);
        this.f63274B = (TextView) findViewById(C0164R.id.item_action_text);
        m26472C(obtainStyledAttributes.getString(0), this.f63274B);
        this.f63276D = (TextView) findViewById(C0164R.id.item_subtitle);
        m26472C(obtainStyledAttributes.getString(2), this.f63276D);
        this.f63275C = (TextView) findViewById(C0164R.id.item_body_text);
        m26472C(obtainStyledAttributes.getString(1), this.f63275C);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: C */
    private static void m26472C(CharSequence charSequence, TextView textView) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public void setActionText(CharSequence charSequence) {
        m26472C(charSequence, this.f63274B);
    }

    public void setBodyText(CharSequence charSequence) {
        m26472C(charSequence, this.f63275C);
    }

    public void setSubtitleText(CharSequence charSequence) {
        m26472C(charSequence, this.f63276D);
    }
}

package com.instagram.wellbeing.accounttransparency.ui;

import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class InfoItemLayout extends LinearLayout {
    /* renamed from: B */
    private TextView f63271B;
    /* renamed from: C */
    private TextView f63272C;
    /* renamed from: D */
    private TextView f63273D;

    public InfoItemLayout(Context context) {
        super(context);
        m26469B(context, null);
    }

    public InfoItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26469B(context, attributeSet);
    }

    public InfoItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26469B(context, attributeSet);
    }

    /* renamed from: B */
    private void m26469B(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.InfoItemLayout, 0, 0);
        inflate(context, C0164R.layout.info_item_layout, this);
        this.f63273D = (TextView) findViewById(C0164R.id.item_title);
        m26470C(obtainStyledAttributes.getString(2), this.f63273D);
        this.f63272C = (TextView) findViewById(C0164R.id.item_subtitle);
        m26470C(obtainStyledAttributes.getString(1), this.f63272C);
        this.f63271B = (TextView) findViewById(C0164R.id.item_body_text);
        m26470C(obtainStyledAttributes.getString(0), this.f63271B);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: C */
    private static void m26470C(CharSequence charSequence, TextView textView) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public void setBodyText(CharSequence charSequence) {
        m26470C(charSequence, this.f63271B);
    }

    public void setSubtitleText(CharSequence charSequence) {
        m26470C(charSequence, this.f63272C);
    }
}

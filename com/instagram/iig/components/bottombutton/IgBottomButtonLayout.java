package com.instagram.iig.components.bottombutton;

import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class IgBottomButtonLayout extends LinearLayout {
    /* renamed from: B */
    private View f41203B;
    /* renamed from: C */
    private TextView f41204C;
    /* renamed from: D */
    private TextView f41205D;
    /* renamed from: E */
    private TextView f41206E;

    public IgBottomButtonLayout(Context context) {
        super(context);
        m19642B(context, null);
    }

    public IgBottomButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19642B(context, attributeSet);
    }

    public IgBottomButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19642B(context, attributeSet);
    }

    /* renamed from: B */
    private void m19642B(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.BottomButtonLayout, 0, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            inflate(context, C0164R.layout.bottom_button_full_width, this);
            this.f41205D = (TextView) findViewById(C0164R.id.bb_primary_action);
            m19644D(obtainStyledAttributes.getString(2), this.f41205D);
        } else {
            inflate(context, C0164R.layout.bottom_button_layout, this);
            this.f41205D = (TextView) findViewById(C0164R.id.bb_primary_action);
            m19644D(obtainStyledAttributes.getString(2), this.f41205D);
            this.f41206E = (TextView) findViewById(C0164R.id.bb_secondary_action);
            m19644D(obtainStyledAttributes.getString(3), this.f41206E);
            this.f41204C = (TextView) findViewById(C0164R.id.bb_footer);
            m19644D(obtainStyledAttributes.getString(0), this.f41204C);
            this.f41203B = findViewById(C0164R.id.bb_extra_padding);
            m19643C();
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: C */
    private void m19643C() {
        if (this.f41203B != null) {
            Object obj;
            View view;
            TextView textView = this.f41206E;
            Object obj2 = 1;
            int i = 0;
            if (textView != null) {
                if (textView.getVisibility() != 8) {
                    obj = null;
                    textView = this.f41204C;
                    if (textView != null) {
                        if (textView.getVisibility() == 8) {
                            obj2 = null;
                        }
                    }
                    view = this.f41203B;
                    if (obj != null || r4 == null) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            }
            obj = 1;
            textView = this.f41204C;
            if (textView != null) {
                if (textView.getVisibility() == 8) {
                    obj2 = null;
                }
            }
            view = this.f41203B;
            if (obj != null) {
            }
            i = 8;
            view.setVisibility(i);
        }
    }

    /* renamed from: D */
    private static void m19644D(CharSequence charSequence, TextView textView) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public void setFooterText(CharSequence charSequence) {
        TextView textView = this.f41204C;
        if (textView != null) {
            m19644D(charSequence, textView);
            m19643C();
        }
    }

    public void setPrimaryAction(CharSequence charSequence, OnClickListener onClickListener) {
        setPrimaryActionText(charSequence);
        setPrimaryActionOnClickListener(onClickListener);
    }

    public void setPrimaryActionOnClickListener(OnClickListener onClickListener) {
        this.f41205D.setOnClickListener(onClickListener);
    }

    public void setPrimaryActionText(CharSequence charSequence) {
        m19644D(charSequence, this.f41205D);
    }

    public void setSecondaryAction(CharSequence charSequence, OnClickListener onClickListener) {
        setSecondaryActionText(charSequence);
        setSecondaryActionOnClickListener(onClickListener);
    }

    public void setSecondaryActionOnClickListener(OnClickListener onClickListener) {
        TextView textView = this.f41206E;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setSecondaryActionText(CharSequence charSequence) {
        TextView textView = this.f41206E;
        if (textView != null) {
            m19644D(charSequence, textView);
            m19643C();
        }
    }
}

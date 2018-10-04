package com.instagram.business.ui;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ci;
import X.AnonymousClass0eS;
import X.AnonymousClass0rE;
import X.AnonymousClass1dB;
import X.AnonymousClass1g3;
import X.AnonymousClass35f;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.spinner.RefreshSpinner;

public class BusinessNavBar extends LinearLayout {
    /* renamed from: B */
    public TextView f37735B;
    /* renamed from: C */
    public LinearLayout f37736C;
    /* renamed from: D */
    public View f37737D;
    /* renamed from: E */
    public RefreshSpinner f37738E;
    /* renamed from: F */
    public TextView f37739F;
    /* renamed from: G */
    public TitleTextView f37740G;
    /* renamed from: H */
    public boolean f37741H;
    /* renamed from: I */
    private CharSequence f37742I;

    public BusinessNavBar(Context context) {
        super(context);
        m18467B(null);
    }

    public BusinessNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18467B(attributeSet);
    }

    /* renamed from: A */
    public final void m18466A(CharSequence charSequence, int i, boolean z, int i2) {
        this.f37740G.setText(charSequence);
        this.f37740G.setIsBold(z);
        this.f37740G.setTextColor(i);
        this.f37740G.setTextSize(0, (float) i2);
    }

    /* renamed from: B */
    public final void m18467B(AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.business_nav_bar, this);
        this.f37737D = inflate.findViewById(C0164R.id.primary_button_container);
        this.f37739F = (TextView) inflate.findViewById(C0164R.id.primary_button_text);
        this.f37738E = (RefreshSpinner) inflate.findViewById(C0164R.id.primary_button_progress);
        this.f37740G = (TitleTextView) inflate.findViewById(C0164R.id.secondary_button);
        this.f37736C = (LinearLayout) inflate.findViewById(C0164R.id.business_fb_page_footer);
        this.f37735B = (TextView) inflate.findViewById(C0164R.id.business_fb_page_footer_text);
        inflate.findViewById(C0164R.id.divider_line);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.BusinessNavBar);
            if (obtainStyledAttributes.hasValue(0)) {
                setPrimaryButtonText(obtainStyledAttributes.getString(0));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setSecondaryButtonText(obtainStyledAttributes.getString(1));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.f37740G.setVisibility(0);
            }
            if (obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.getBoolean(3, false)) {
                this.f37736C.setVisibility(0);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: C */
    public final void m18468C(View view, boolean z) {
        getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass35f(this, z, view));
    }

    /* renamed from: D */
    public final void m18469D(boolean z) {
        this.f37737D.setVisibility(z ? 0 : 8);
    }

    /* renamed from: E */
    public final void m18470E(boolean z) {
        this.f37740G.setVisibility(z ? 0 : 8);
    }

    public void setFooterTerms(AnonymousClass0Ci anonymousClass0Ci) {
        Context context = getContext();
        TextView textView = this.f37735B;
        CharSequence string = context.getString(C0164R.string.business_profile_terms_and_guidelines, new Object[]{context.getString(C0164R.string.business_landing_terms)});
        int C = AnonymousClass0Ca.C(context, C0164R.color.grey_5);
        textView.setText(AnonymousClass1g3.C(r7, new SpannableStringBuilder(string), new AnonymousClass1dB(context, anonymousClass0Ci, AnonymousClass0rE.B("https://www.facebook.com/page_guidelines.php", context), AnonymousClass0Ca.C(context, C0164R.color.grey_8))));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(C);
    }

    public void setPrimaryButtonEnabled(boolean z) {
        this.f37739F.setEnabled(z);
        this.f37737D.getBackground().setAlpha(z ? 255 : 64);
    }

    public void setPrimaryButtonOnclickListeners(OnClickListener onClickListener) {
        this.f37739F.setOnClickListener(onClickListener);
    }

    public void setPrimaryButtonText(int i) {
        setPrimaryButtonText(getResources().getString(i));
    }

    public void setPrimaryButtonText(CharSequence charSequence) {
        this.f37742I = charSequence;
        this.f37739F.setText(charSequence);
    }

    public void setSecondaryButtonOnclickListeners(OnClickListener onClickListener) {
        this.f37740G.setOnClickListener(onClickListener);
    }

    public void setSecondaryButtonText(int i) {
        this.f37740G.setText(getResources().getString(i));
    }

    public void setSecondaryButtonText(CharSequence charSequence) {
        this.f37740G.setText(charSequence);
    }

    public void setShowProgressBarOnPrimaryButton(boolean z) {
        if (this.f37741H != z) {
            this.f37741H = z;
            this.f37738E.setVisibility(z ? 0 : 4);
            this.f37739F.setText(z ? JsonProperty.USE_DEFAULT_NAME : this.f37742I);
            setPrimaryButtonEnabled(z ^ 1);
        }
    }
}

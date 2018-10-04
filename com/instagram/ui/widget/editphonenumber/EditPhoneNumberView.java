package com.instagram.ui.widget.editphonenumber;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cm;
import X.AnonymousClass0FC;
import X.AnonymousClass0IL;
import X.AnonymousClass0IU;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass1P7;
import X.AnonymousClass3X4;
import X.AnonymousClass3a1;
import X.AnonymousClass3a3;
import X.AnonymousClass3jP;
import X.AnonymousClass3jQ;
import X.AnonymousClass3jR;
import X.AnonymousClass3jS;
import X.AnonymousClass3jT;
import X.AnonymousClass3jU;
import X.AnonymousClass3jV;
import X.AnonymousClass3jW;
import android.content.Context;
import android.content.res.TypedArray;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.ArrayList;
import java.util.List;

public class EditPhoneNumberView extends LinearLayout {
    /* renamed from: B */
    public ImageView f43746B;
    /* renamed from: C */
    public ImageView f43747C;
    /* renamed from: D */
    public boolean f43748D = false;
    /* renamed from: E */
    public EditText f43749E;
    /* renamed from: F */
    public InlineErrorMessageView f43750F;
    /* renamed from: G */
    public ViewGroup f43751G;
    /* renamed from: H */
    public final Runnable f43752H = new AnonymousClass3jV(this);
    /* renamed from: I */
    private final List f43753I = new ArrayList();
    /* renamed from: J */
    private TextView f43754J;
    /* renamed from: K */
    private boolean f43755K;
    /* renamed from: L */
    private final List f43756L = new ArrayList();
    /* renamed from: M */
    private final PhoneNumberUtil f43757M = PhoneNumberUtil.m13830C(getContext());

    public EditPhoneNumberView(Context context) {
        super(context);
        m20512C(context, null);
    }

    public EditPhoneNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20512C(context, attributeSet);
    }

    /* renamed from: A */
    public final void m20513A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, AnonymousClass3jW anonymousClass3jW, AnonymousClass1P7 anonymousClass1P7) {
        m20511B(this, anonymousClass0Cm, null, anonymousClass0IL, anonymousClass3jW, anonymousClass1P7, null);
    }

    /* renamed from: B */
    public static void m20511B(EditPhoneNumberView editPhoneNumberView, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IU anonymousClass0IU, AnonymousClass0IL anonymousClass0IL, AnonymousClass3jW anonymousClass3jW, AnonymousClass1P7 anonymousClass1P7, AnonymousClass3a1 anonymousClass3a1) {
        EditPhoneNumberView editPhoneNumberView2 = editPhoneNumberView;
        CountryCodeData E = AnonymousClass3a3.m20064E(editPhoneNumberView.getContext());
        if (TextUtils.isEmpty(editPhoneNumberView.f43754J.getText())) {
            CharSequence charSequence = "+1";
            if (E.m14823A().equals(charSequence) || !((Boolean) AnonymousClass0CC.RF.H(anonymousClass0Cm)).booleanValue()) {
                editPhoneNumberView.f43754J.setText(charSequence);
            } else {
                editPhoneNumberView.setCountryCodeWithPlus(E);
            }
        }
        editPhoneNumberView.f43754J.setOnClickListener(new AnonymousClass3jP(editPhoneNumberView2, anonymousClass3a1, anonymousClass0IL, anonymousClass0IU, anonymousClass3jW));
        if (editPhoneNumberView2.f43755K) {
            editPhoneNumberView2.f43746B.setOnClickListener(new AnonymousClass3jQ(editPhoneNumberView2));
        }
        editPhoneNumberView2.f43749E.setOnFocusChangeListener(new AnonymousClass3jR(editPhoneNumberView2));
        editPhoneNumberView2.f43749E.setOnEditorActionListener(new AnonymousClass3jS(editPhoneNumberView2, anonymousClass3jW));
        editPhoneNumberView2.f43749E.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        editPhoneNumberView2.f43749E.addTextChangedListener(new AnonymousClass3jT(editPhoneNumberView2, anonymousClass1P7, anonymousClass3jW));
        editPhoneNumberView2.f43754J.addTextChangedListener(new AnonymousClass3jU(editPhoneNumberView2, anonymousClass3jW));
    }

    /* renamed from: B */
    public final boolean m20514B() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r3 = r4.f43757M;	 Catch:{ 1w5 -> 0x0012 }
        r2 = r4.f43757M;	 Catch:{ 1w5 -> 0x0012 }
        r1 = r4.getPhoneNumber();	 Catch:{ 1w5 -> 0x0012 }
        r0 = 0;	 Catch:{ 1w5 -> 0x0012 }
        r0 = r2.m13871T(r1, r0);	 Catch:{ 1w5 -> 0x0012 }
        r0 = r3.m13865N(r0);	 Catch:{ 1w5 -> 0x0012 }
        return r0;	 Catch:{ 1w5 -> 0x0012 }
    L_0x0012:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.editphonenumber.EditPhoneNumberView.B():boolean");
    }

    /* renamed from: C */
    private void m20512C(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C0164R.layout.layout_edit_phone_view, this);
        this.f43751G = viewGroup;
        this.f43754J = (TextView) viewGroup.findViewById(C0164R.id.country_code_picker);
        this.f43749E = (EditText) this.f43751G.findViewById(C0164R.id.phone_number);
        this.f43746B = (ImageView) this.f43751G.findViewById(C0164R.id.clear_button);
        this.f43747C = (ImageView) this.f43751G.findViewById(C0164R.id.country_code_drop_down);
        this.f43750F = (InlineErrorMessageView) this.f43751G.findViewById(C0164R.id.phone_inline_error);
        if (attributeSet != null) {
            boolean z;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.EditPhoneNumberView);
            if (obtainStyledAttributes.hasValue(4)) {
                z = obtainStyledAttributes.getBoolean(4, false);
                if (z) {
                    this.f43754J.setCompoundDrawablesWithIntrinsicBounds(C0164R.drawable.profile_glyph_phone, 0, 0, 0);
                }
            } else {
                z = false;
            }
            if (z && obtainStyledAttributes.hasValue(5)) {
                this.f43754J.setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(5, C0164R.dimen.field_with_glyph_drawable_padding));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.f43754J.setTypeface(null, 1);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.f43754J.setTextColor(obtainStyledAttributes.getColor(3, 0));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.f43755K = obtainStyledAttributes.getBoolean(0, false);
            }
            int dimensionPixelSize = obtainStyledAttributes.hasValue(6) ? obtainStyledAttributes.getDimensionPixelSize(6, 0) : 0;
            int dimensionPixelSize2 = obtainStyledAttributes.hasValue(7) ? obtainStyledAttributes.getDimensionPixelSize(7, 0) : 0;
            int dimensionPixelSize3 = obtainStyledAttributes.hasValue(8) ? obtainStyledAttributes.getDimensionPixelSize(8, 0) : 0;
            this.f43754J.setPadding(dimensionPixelSize2, 0, dimensionPixelSize, 0);
            this.f43749E.setPadding(dimensionPixelSize, 0, dimensionPixelSize3, 0);
            if (obtainStyledAttributes.hasValue(10)) {
                float dimension = obtainStyledAttributes.getDimension(10, 0.0f);
                this.f43754J.setTextSize(0, dimension);
                this.f43749E.setTextSize(0, dimension);
            }
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            this.f43748D = z2;
            if (z2) {
                dimensionPixelSize2 = getResources().getDimensionPixelSize(C0164R.dimen.container_horizontal_padding);
                this.f43751G.findViewById(C0164R.id.phone_number_container).setBackgroundResource(C0164R.drawable.textbox_container_background);
                this.f43751G.findViewById(C0164R.id.phone_number_container).setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                this.f43751G.findViewById(C0164R.id.phone_number_container).getLayoutParams().height = getResources().getDimensionPixelSize(C0164R.dimen.container_height);
                this.f43751G.findViewById(C0164R.id.phone_number_container).requestLayout();
                this.f43747C.setVisibility(0);
                this.f43749E.setPadding(getResources().getDimensionPixelSize(C0164R.dimen.container_edittext_left_padding), 0, 0, 0);
                this.f43747C.setBackgroundResource(C0164R.drawable.container_divider);
            }
            obtainStyledAttributes.recycle();
        }
        AnonymousClass0FC.B().IJA(this.f43749E);
    }

    public String getCountryCode() {
        return this.f43754J.getText().toString();
    }

    public String getCountryCodeWithoutPlus() {
        return this.f43754J.getText().toString().replace("+", JsonProperty.USE_DEFAULT_NAME);
    }

    public String getPhone() {
        return this.f43749E.getText().toString();
    }

    public String getPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getCountryCode());
        stringBuilder.append(" ");
        stringBuilder.append(getPhone());
        return PhoneNumberUtils.stripSeparators(stringBuilder.toString());
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1312548448);
        super.onDetachedFromWindow();
        this.f43749E.removeCallbacks(this.f43752H);
        for (TextWatcher removeTextChangedListener : this.f43753I) {
            this.f43754J.removeTextChangedListener(removeTextChangedListener);
        }
        for (TextWatcher removeTextChangedListener2 : this.f43756L) {
            this.f43749E.removeTextChangedListener(removeTextChangedListener2);
        }
        AnonymousClass0FC.B().qVA(this.f43749E);
        AnonymousClass0cQ.O(this, -656689200, N);
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.f43754J.setText(countryCodeData.m14825C());
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        this.f43754J.setText(countryCodeData.m14823A());
        this.f43749E.postDelayed(this.f43752H, 200);
    }

    public void setHint(int i) {
        this.f43749E.setHint(i);
    }

    public void setupEditPhoneNumberView(CountryCodeData countryCodeData, String str) {
        setCountryCodeWithCountryPrefix(countryCodeData);
        if (str != null && !str.isEmpty()) {
            this.f43749E.setText(AnonymousClass3X4.m19838C(str, null));
        }
    }

    public void setupEditPhoneNumberView(String str, String str2) {
        if (!(str == null || str.isEmpty())) {
            if (str.startsWith("+")) {
                this.f43754J.setText(str);
            } else {
                TextView textView = this.f43754J;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("+");
                stringBuilder.append(str);
                textView.setText(stringBuilder.toString());
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            this.f43749E.setText(AnonymousClass3X4.m19838C(str2, null));
        }
    }
}

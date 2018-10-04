package com.instagram.business.ui;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IE;
import X.AnonymousClass0IL;
import X.AnonymousClass2MA;
import X.AnonymousClass35Z;
import X.AnonymousClass35a;
import X.AnonymousClass35b;
import X.AnonymousClass35c;
import X.AnonymousClass35d;
import X.AnonymousClass35e;
import X.AnonymousClass3X4;
import X.AnonymousClass3a3;
import X.AnonymousClass3xA;
import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.switchbutton.IgSwitch;

public class BusinessInfoSectionView extends LinearLayout {
    /* renamed from: B */
    public TextView f37709B;
    /* renamed from: C */
    public TextView f37710C;
    /* renamed from: D */
    public TextView f37711D;
    /* renamed from: E */
    private TextView f37712E;
    /* renamed from: F */
    private TextView f37713F;
    /* renamed from: G */
    private ViewGroup f37714G;
    /* renamed from: H */
    private CompoundButton f37715H;
    /* renamed from: I */
    private View f37716I;
    /* renamed from: J */
    private TextView f37717J;
    /* renamed from: K */
    private TextView f37718K;
    /* renamed from: L */
    private EditPhoneNumberView f37719L;
    /* renamed from: M */
    private EditText f37720M;
    /* renamed from: N */
    private TextWatcher f37721N;
    /* renamed from: O */
    private ViewGroup f37722O;
    /* renamed from: P */
    private TextView f37723P;
    /* renamed from: Q */
    private TextView f37724Q;
    /* renamed from: R */
    private ViewGroup f37725R;
    /* renamed from: S */
    private boolean f37726S;
    /* renamed from: T */
    private boolean f37727T;
    /* renamed from: U */
    private TextView f37728U;
    /* renamed from: V */
    private View f37729V;
    /* renamed from: W */
    private TextWatcher f37730W;
    /* renamed from: X */
    private View f37731X;

    public BusinessInfoSectionView(Context context) {
        super(context);
        m18458B(context);
    }

    public BusinessInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18458B(context);
    }

    /* renamed from: A */
    public final boolean m18459A() {
        return m18460B() && getContext().getString(C0164R.string.business_signup_address_hint).equals(this.f37713F.getText().toString()) && TextUtils.isEmpty(getEmail());
    }

    /* renamed from: B */
    private void m18458B(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.layout_business_info_section, this);
        this.f37731X = inflate;
        this.f37717J = (TextView) inflate.findViewById(C0164R.id.bottom_text);
        this.f37714G = (ViewGroup) this.f37731X.findViewById(C0164R.id.book_switch_container);
        this.f37715H = (IgSwitch) this.f37731X.findViewById(C0164R.id.book_switch);
        this.f37716I = this.f37731X.findViewById(C0164R.id.book_switch_divider);
        this.f37718K = (TextView) this.f37731X.findViewById(C0164R.id.cta_label);
        this.f37725R = (ViewGroup) this.f37731X.findViewById(C0164R.id.ix_self_serve_container);
        this.f37724Q = (TextView) this.f37731X.findViewById(C0164R.id.ix_self_serve_label);
        this.f37722O = (ViewGroup) this.f37731X.findViewById(C0164R.id.ix_self_serve_partner);
        this.f37723P = (TextView) this.f37731X.findViewById(C0164R.id.bottom_text);
    }

    /* renamed from: B */
    public final boolean m18460B() {
        if (this.f37726S) {
            return TextUtils.isEmpty(getNationalNumber());
        }
        return getContext().getString(C0164R.string.phone).equals(this.f37728U.getText().toString());
    }

    /* renamed from: C */
    public final boolean m18461C() {
        if (!TextUtils.isEmpty(getEmail())) {
            if (!AnonymousClass0IE.L(getEmail())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final void m18462D() {
        TextView textView = this.f37728U;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        this.f37713F.setOnClickListener(null);
        this.f37720M.removeTextChangedListener(this.f37721N);
        this.f37721N = null;
        EditPhoneNumberView editPhoneNumberView = this.f37719L;
        editPhoneNumberView.f43749E.removeTextChangedListener(this.f37730W);
        this.f37730W = null;
    }

    /* renamed from: E */
    public final void m18463E(Address address) {
        if (address != null) {
            if (!TextUtils.isEmpty(address.f27740E)) {
                if (this.f37727T) {
                    TextView textView = this.f37712E;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                }
                this.f37713F.setText(address.f27740E);
                return;
            }
        }
        this.f37713F.setTextColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        this.f37713F.setText(getResources().getString(C0164R.string.business_signup_address_hint));
    }

    /* renamed from: F */
    public final void m18464F(boolean z, boolean z2, String str, String str2) {
        if (z) {
            this.f37714G.setVisibility(8);
            if (!z2 || str2 == null) {
                this.f37725R.setVisibility(0);
                this.f37722O.setVisibility(8);
            } else {
                ((TextView) this.f37722O.findViewById(C0164R.id.row_title)).setText(getContext().getString(C0164R.string.contact_options_ix_action, new Object[]{str}));
                ((TextView) this.f37722O.findViewById(C0164R.id.row_subtitle)).setText(str2);
                this.f37725R.setVisibility(8);
                this.f37722O.setVisibility(0);
            }
            this.f37723P.setText(C0164R.string.contact_from_new_button_ix);
        } else if (str2 != null) {
            this.f37714G.setVisibility(0);
            this.f37725R.setVisibility(8);
            this.f37722O.setVisibility(8);
            this.f37715H.setChecked(z2);
            this.f37723P.setText(C0164R.string.contact_from_new_button);
        }
    }

    /* renamed from: G */
    public final void m18465G(PublicPhoneContact publicPhoneContact, Context context) {
        String str;
        String str2;
        if (publicPhoneContact != null) {
            str = publicPhoneContact.f27761C;
            str2 = publicPhoneContact.f27762D;
        } else {
            str = AnonymousClass3a3.m20064E(context).m14823A();
            str2 = null;
        }
        if (this.f37726S) {
            this.f37719L.setupEditPhoneNumberView(str, str2);
        } else if (TextUtils.isEmpty(str2)) {
            this.f37728U.setText(C0164R.string.phone);
            this.f37728U.setTextColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        } else {
            TextView textView = this.f37728U;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(AnonymousClass3X4.m19838C(str2, null));
            textView.setText(stringBuilder.toString());
        }
    }

    public String getAddress() {
        if (getContext().getString(C0164R.string.business_signup_address_hint).equals(this.f37713F.getText().toString())) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        return this.f37713F.getText().toString();
    }

    public boolean getCallToActionEnabled() {
        return this.f37715H.isChecked();
    }

    public String getCountryCode() {
        return this.f37719L.getCountryCodeWithoutPlus();
    }

    public String getEmail() {
        return this.f37720M.getText().toString();
    }

    public String getNationalNumber() {
        return this.f37719L.getPhone();
    }

    public String getPhoneNumber() {
        return this.f37719L.getPhoneNumber();
    }

    public PublicPhoneContact getSubmitPublicPhoneContact() {
        return !TextUtils.isEmpty(getNationalNumber()) ? new PublicPhoneContact(getCountryCode(), getNationalNumber(), getPhoneNumber(), AnonymousClass2MA.f29500D.m15202A()) : null;
    }

    public void setBottomText(String str) {
        this.f37717J.setText(str);
    }

    public void setBusinessInfo(AnonymousClass0Cm anonymousClass0Cm, BusinessInfo businessInfo, AnonymousClass0IL anonymousClass0IL, boolean z, boolean z2, AnonymousClass3xA anonymousClass3xA) {
        OnClickListener anonymousClass35Z;
        this.f37720M.setText(businessInfo.f27750J);
        this.f37719L.setHint(C0164R.string.business_signup_phone_hint);
        this.f37726S = z;
        m18465G(businessInfo.f27752L, anonymousClass0IL.getContext());
        if (this.f37726S) {
            this.f37719L.m20513A(anonymousClass0Cm, anonymousClass0IL, anonymousClass3xA, null);
        } else {
            this.f37719L.setVisibility(8);
            this.f37728U.setVisibility(0);
            this.f37729V.setVisibility(0);
        }
        m18463E(businessInfo.f27742B);
        if (TextUtils.isEmpty(businessInfo.f27745E)) {
            if (TextUtils.isEmpty(businessInfo.f27747G)) {
                this.f37714G.setVisibility(8);
                this.f37716I.setVisibility(8);
                anonymousClass35Z = new AnonymousClass35Z(this, anonymousClass3xA);
                this.f37724Q.setOnClickListener(anonymousClass35Z);
                this.f37722O.setOnClickListener(anonymousClass35Z);
                m18464F(z2, businessInfo.f27744D, businessInfo.f27748H, businessInfo.f27747G);
            }
        }
        this.f37714G.setVisibility(0);
        this.f37715H.setChecked(businessInfo.f27744D);
        this.f37716I.setVisibility(0);
        anonymousClass35Z = new AnonymousClass35Z(this, anonymousClass3xA);
        this.f37724Q.setOnClickListener(anonymousClass35Z);
        this.f37722O.setOnClickListener(anonymousClass35Z);
        m18464F(z2, businessInfo.f27744D, businessInfo.f27748H, businessInfo.f27747G);
    }

    public void setBusinessInfoListeners(AnonymousClass3xA anonymousClass3xA) {
        this.f37721N = new AnonymousClass35a(this, anonymousClass3xA);
        this.f37720M.addTextChangedListener(this.f37721N);
        this.f37730W = new AnonymousClass35b(this, anonymousClass3xA);
        EditPhoneNumberView editPhoneNumberView = this.f37719L;
        editPhoneNumberView.f43749E.addTextChangedListener(this.f37730W);
        if (!this.f37726S) {
            TextView textView = this.f37728U;
            if (textView != null) {
                textView.setOnClickListener(new AnonymousClass35c(this, anonymousClass3xA));
            }
        }
        this.f37713F.setOnClickListener(new AnonymousClass35d(this, anonymousClass3xA));
        this.f37715H.setOnCheckedChangeListener(new AnonymousClass35e(this, anonymousClass3xA));
    }

    public void setContactInfoStyle(boolean z) {
        ViewStub viewStub;
        this.f37727T = z;
        if (z) {
            viewStub = (ViewStub) this.f37731X.findViewById(C0164R.id.conversion_editable_contact_info_container);
        } else {
            viewStub = (ViewStub) this.f37731X.findViewById(C0164R.id.default_contact_info_view_container);
        }
        viewStub.inflate();
        this.f37720M = (EditText) this.f37731X.findViewById(C0164R.id.email);
        this.f37713F = (TextView) this.f37731X.findViewById(C0164R.id.address);
        this.f37719L = (EditPhoneNumberView) this.f37731X.findViewById(C0164R.id.phone_number_edit_view);
        if (this.f37727T) {
            this.f37712E = (TextView) this.f37731X.findViewById(C0164R.id.address_label);
            this.f37719L.f43747C.setVisibility(0);
        } else {
            this.f37713F.getCompoundDrawables()[0].mutate().setAlpha(64);
            this.f37728U = (TextView) this.f37731X.findViewById(C0164R.id.phone_number_text_view);
            this.f37729V = this.f37731X.findViewById(C0164R.id.phone_number_text_divider);
        }
        TextView textView = (TextView) this.f37731X.findViewById(C0164R.id.email_inline_error_message);
        this.f37710C = textView;
        textView.setText(C0164R.string.please_enter_a_valid_email_address);
        textView = (TextView) this.f37731X.findViewById(C0164R.id.phone_inline_error_message);
        this.f37711D = textView;
        textView.setText(C0164R.string.phone_inline_error_message);
        textView = (TextView) this.f37731X.findViewById(C0164R.id.bottom_inline_error_message);
        this.f37709B = textView;
        textView.setText(C0164R.string.please_fill_one_form_of_contact);
    }

    public void setCountryCode(CountryCodeData countryCodeData) {
        this.f37719L.setCountryCodeWithPlus(countryCodeData);
    }

    public void setCtaLabel(String str) {
        this.f37718K.setText(str);
    }
}

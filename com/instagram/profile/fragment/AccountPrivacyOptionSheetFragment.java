package com.instagram.profile.fragment;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Co;
import X.AnonymousClass0IJ;
import X.AnonymousClass0NN;
import X.AnonymousClass0cQ;
import X.AnonymousClass1g3;
import X.AnonymousClass2Hh;
import X.AnonymousClass5oA;
import X.AnonymousClass5oB;
import X.AnonymousClass5oC;
import X.AnonymousClass5oD;
import X.AnonymousClass5oE;
import X.AnonymousClass5oH;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.menu.CheckRadioButton;

public class AccountPrivacyOptionSheetFragment extends AnonymousClass0IJ {
    /* renamed from: B */
    public boolean f69082B;
    /* renamed from: C */
    public AnonymousClass2Hh f69083C;
    /* renamed from: D */
    public AnonymousClass0Cm f69084D;
    public TextView mFooterButton;
    public TextView mPrivacyStatusTextView;
    public CheckRadioButton mPrivateCheckButton;
    public CheckRadioButton mPublicCheckButton;
    public ScrollView mScrollView;

    public final String getModuleName() {
        return "account_privacy_option_sheet";
    }

    /* renamed from: B */
    public static void m28465B(AccountPrivacyOptionSheetFragment accountPrivacyOptionSheetFragment) {
        int i = AnonymousClass0Co.H(accountPrivacyOptionSheetFragment.f69084D) ? C0164R.string.account_privacy_option_status_private : C0164R.string.account_privacy_option_status_public;
        accountPrivacyOptionSheetFragment.mPrivacyStatusTextView.setText(Html.fromHtml(accountPrivacyOptionSheetFragment.getString(C0164R.string.account_privacy_option_status, new Object[]{accountPrivacyOptionSheetFragment.getString(i)})));
        accountPrivacyOptionSheetFragment.mPublicCheckButton.setChecked(accountPrivacyOptionSheetFragment.f69082B ^ 1);
        accountPrivacyOptionSheetFragment.mPrivateCheckButton.setChecked(accountPrivacyOptionSheetFragment.f69082B);
        Object obj = accountPrivacyOptionSheetFragment.f69082B != AnonymousClass0Co.H(accountPrivacyOptionSheetFragment.f69084D) ? 1 : null;
        accountPrivacyOptionSheetFragment.mFooterButton.setText(obj != null ? C0164R.string.save : C0164R.string.cancel);
        accountPrivacyOptionSheetFragment.mFooterButton.setTextColor(AnonymousClass0Ca.C(accountPrivacyOptionSheetFragment.getContext(), obj != null ? C0164R.color.white : C0164R.color.grey_9));
        accountPrivacyOptionSheetFragment.mFooterButton.setBackgroundResource(obj != null ? C0164R.drawable.button_blue_background_no_rounding : C0164R.drawable.button_white_background_no_rounding);
        if (obj != null) {
            accountPrivacyOptionSheetFragment.mFooterButton.setOnClickListener(new AnonymousClass5oD(accountPrivacyOptionSheetFragment));
        } else {
            accountPrivacyOptionSheetFragment.mFooterButton.setOnClickListener(new AnonymousClass5oE(accountPrivacyOptionSheetFragment));
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int F = AnonymousClass0cQ.F(this, 1828263197);
        super.onCreate(bundle);
        this.f69084D = AnonymousClass0Ce.G(getArguments());
        if (bundle != null) {
            z = bundle.getBoolean("is_private_selected");
        } else {
            z = AnonymousClass0Co.H(this.f69084D);
        }
        this.f69082B = z;
        this.f69083C = new AnonymousClass2Hh(this, new AnonymousClass5oH());
        AnonymousClass0cQ.G(this, 1237148963, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1444021567);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_account_privacy_option_sheet, viewGroup, false);
        this.mScrollView = (ScrollView) inflate.findViewById(C0164R.id.scroll_view);
        this.mPrivacyStatusTextView = (TextView) inflate.findViewById(C0164R.id.privacy_status);
        this.mPublicCheckButton = (CheckRadioButton) inflate.findViewById(C0164R.id.public_check_button);
        this.mPrivateCheckButton = (CheckRadioButton) inflate.findViewById(C0164R.id.private_check_button);
        this.mFooterButton = (TextView) inflate.findViewById(C0164R.id.footer_button);
        OnClickListener anonymousClass5oA = new AnonymousClass5oA(this);
        OnClickListener anonymousClass5oB = new AnonymousClass5oB(this);
        this.mPublicCheckButton.setOnClickListener(anonymousClass5oA);
        this.mPrivateCheckButton.setOnClickListener(anonymousClass5oB);
        inflate.findViewById(C0164R.id.public_option_container).setOnClickListener(anonymousClass5oA);
        inflate.findViewById(C0164R.id.private_option_container).setOnClickListener(anonymousClass5oB);
        AnonymousClass1g3.B((TextView) inflate.findViewById(C0164R.id.settings_text), getString(C0164R.string.account_privacy_option_settings_noun), getString(C0164R.string.account_privacy_option_settings_full_text, new Object[]{getString(C0164R.string.account_privacy_option_settings_noun)}), new AnonymousClass5oC(this, AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5)));
        AnonymousClass0NN.B("ig_privacy_sheet_shown", this).R();
        AnonymousClass0cQ.G(this, -2022970286, F);
        return inflate;
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 591142435);
        super.onResume();
        m28465B(this);
        AnonymousClass0cQ.G(this, 688033671, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("is_private_selected", this.f69082B);
        super.onSaveInstanceState(bundle);
    }
}

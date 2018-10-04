package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.1Y6 */
public class AnonymousClass1Y6 extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0IT, AnonymousClass0bt, AnonymousClass0Rz {
    /* renamed from: B */
    public AnonymousClass0Rx f19939B = AnonymousClass0Il.getInstance().newIgReactDelegate(this);

    /* renamed from: b */
    public final TextView m11810b() {
        return this.f19939B.mo1206F();
    }

    public final boolean bW() {
        return getArguments().getBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN");
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        if (getArguments().getBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN")) {
            anonymousClass0eT.m6362k(false);
            return;
        }
        boolean z = getArguments().getBoolean("IgReactFragment.ARGUMENT_IS_MODAL");
        String string = getArguments().getString("IgReactFragment.ARGUMENT_TITLE");
        boolean z2 = getArguments().getBoolean("IgReactFragment.ARGUMENT_LOGO_AS_TITLE", false);
        if (z) {
            AnonymousClass0eT.m6317H(anonymousClass0eT, string);
            return;
        }
        if (z2) {
            anonymousClass0eT.m6349X(C0164R.layout.action_bar_title_logo, getResources().getDimensionPixelSize(C0164R.dimen.action_bar_item_padding), 0);
        } else {
            anonymousClass0eT.m6352a(string);
        }
        anonymousClass0eT.m6365n(true);
    }

    public final String getModuleName() {
        String string = getArguments().getString("IgReactFragment.ARGUMENT_ANALYTICS_MODULE");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rn_");
        stringBuilder.append(getArguments().getString("IgReactFragment.ARGUMENT_APP_KEY"));
        return stringBuilder.toString();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f19939B.mo1210J(i, i2, intent);
    }

    public boolean onBackPressed() {
        return this.f19939B.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 647684239);
        super.onCreate(bundle);
        this.f19939B.mo1201A(bundle);
        AnonymousClass0cQ.m5857G(this, 1142474185, F);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -25043463);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View K = this.f19939B.mo1211K(layoutInflater, viewGroup, bundle);
        AnonymousClass0cQ.m5857G(this, -2038747028, F);
        return K;
    }

    public void onDestroy() {
        int F = AnonymousClass0cQ.m5856F(this, -595431062);
        this.f19939B.mo1212L();
        super.onDestroy();
        AnonymousClass0cQ.m5857G(this, 341609362, F);
    }

    public void onDestroyView() {
        int F = AnonymousClass0cQ.m5856F(this, 196522243);
        this.f19939B.mo1213M();
        super.onDestroyView();
        AnonymousClass0cQ.m5857G(this, 1902799669, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.m5856F(this, 1608681833);
        super.onPause();
        this.f19939B.mo1202B();
        AnonymousClass0cQ.m5857G(this, 1277653628, F);
    }

    public void onResume() {
        int F = AnonymousClass0cQ.m5856F(this, 1447143849);
        super.onResume();
        this.f19939B.mo1203C();
        AnonymousClass0cQ.m5857G(this, -789331928, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19939B.mo1214N(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f19939B.mo1215O(view, bundle);
    }

    public final boolean sU(int i, KeyEvent keyEvent) {
        return this.f19939B.sU(i, keyEvent);
    }
}

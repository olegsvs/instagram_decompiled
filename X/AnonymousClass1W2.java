package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.1W2 */
public final class AnonymousClass1W2 extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass0Cm f19427B;

    public final String getModuleName() {
        return "igtv_settings";
    }

    /* renamed from: B */
    public static void m11717B(AnonymousClass1W2 anonymousClass1W2, boolean z) {
        String string;
        AnonymousClass0IH.m2174H("logout_d2_loaded", anonymousClass1W2);
        Context context = anonymousClass1W2.getContext();
        if (z) {
            string = context.getString(C0164R.string.igtv_log_out_all);
        } else {
            string = context.getString(C0164R.string.igtv_log_out_account, new Object[]{anonymousClass1W2.f19427B.m1037B().uT()});
        }
        new AnonymousClass0Sb(anonymousClass1W2.getActivity()).m4376R(string).m4373O(C0164R.string.igtv_log_out, new AnonymousClass4ub(anonymousClass1W2, z, context)).m4370L(C0164R.string.cancel, new AnonymousClass4uZ(anonymousClass1W2, z)).m4361C().show();
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.m6351Z(C0164R.string.settings);
        anonymousClass0eT.m6365n(true);
    }

    public final void onAttachFragment(AnonymousClass0IL anonymousClass0IL) {
        super.onAttachFragment(anonymousClass0IL);
        if (anonymousClass0IL instanceof AnonymousClass53I) {
            ((AnonymousClass53I) anonymousClass0IL).f59593B = new AnonymousClass5YJ(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -1776727062);
        super.onCreate(bundle);
        this.f19427B = AnonymousClass0Ce.m950G(getArguments());
        AnonymousClass0cQ.m5857G(this, 498819655, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.m5856F(this, 1836736520);
        super.onResume();
        Collection arrayList = new ArrayList();
        if (AnonymousClass0EF.m1361L(getContext()) && !AnonymousClass0HV.m2008D(this.f19427B).m2021I()) {
            arrayList.add(new AnonymousClass2If(C0164R.string.igtv_channel_settings_header));
            AnonymousClass2Ig anonymousClass2Ig = new AnonymousClass2Ig(C0164R.string.igtv_create_channel_settings, new AnonymousClass4uc(this));
            anonymousClass2Ig.f28727E = AnonymousClass0Ca.m937C(getContext(), C0164R.color.blue_5);
            arrayList.add(anonymousClass2Ig);
        }
        arrayList.add(new AnonymousClass2If(C0164R.string.igtv_account_settings_header));
        AnonymousClass2Ii anonymousClass2Ii = new AnonymousClass2Ii(getContext().getString(C0164R.string.igtv_switch_account), this.f19427B.m1037B().uT());
        anonymousClass2Ii.f28733D = Typeface.DEFAULT;
        anonymousClass2Ii.f28738I = new AnonymousClass4ud(this);
        arrayList.add(anonymousClass2Ii);
        arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_linked_accounts, new AnonymousClass4ue(this)));
        arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_report_problem, new AnonymousClass4uf(this)));
        arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_log_out, new AnonymousClass4ug(this)));
        if (AnonymousClass0Co.m1042B(this.f19427B)) {
            arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_internal_settings, new AnonymousClass4uh(this)));
        }
        arrayList.add(new AnonymousClass2Io());
        arrayList.add(new AnonymousClass2If(C0164R.string.igtv_about_settings_header));
        arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_terms_and_privacy, new AnonymousClass4ui(this)));
        arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_open_source_libraries, new AnonymousClass4uj(this)));
        arrayList.add(new AnonymousClass2bo(C0164R.string.igtv_help_center, new AnonymousClass4uk(this)));
        setItems(arrayList);
        AnonymousClass0cQ.m5857G(this, -781923632, F);
    }
}

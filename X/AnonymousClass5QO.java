package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5QO */
public final class AnonymousClass5QO extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5QX f63242B;

    public final String getModuleName() {
        return "account_transparency";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.account_info_learn_more_fragment_title);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1653273317);
        super.onCreate(bundle);
        this.f63242B = AnonymousClass5QX.m26465B(getArguments().getString("EXTRA_ACCOUNT_DETAILS_MODE"));
        AnonymousClass0cQ.G(this, -2011636705, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 186409501);
        View inflate = layoutInflater.inflate(C0164R.layout.account_info_learn_more_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(C0164R.id.header_body)).setText(this.f63242B == AnonymousClass5QX.f63259E ? C0164R.string.account_info_learn_more_fragment_body : C0164R.string.account_info_learn_more_fragment_body_after_launch);
        AnonymousClass0cQ.G(this, -145264410, F);
        return inflate;
    }
}

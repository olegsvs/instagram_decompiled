package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.4qw */
public final class AnonymousClass4qw extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3Pn {
    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    public final AnonymousClass3Pp YM() {
        return AnonymousClass3Pp.BLOCK_SCREEN;
    }

    public final boolean onBackPressed() {
        getFragmentManager().Q(AnonymousClass3Q6.f41061I, 1);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -903548640);
        View inflate = layoutInflater.inflate(C0164R.layout.gdpr_age_blocking_layout, viewGroup, false);
        ((ProgressButton) inflate.findViewById(C0164R.id.ok_button)).setOnClickListener(new AnonymousClass4qv(this));
        AnonymousClass3Po.C().F(AnonymousClass3Pm.CONSENT_VIEW, this, this);
        AnonymousClass0cQ.G(this, 959791611, F);
        return inflate;
    }
}

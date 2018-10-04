package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.6FE */
public final class AnonymousClass6FE extends AnonymousClass61M {
    /* renamed from: B */
    private String f73327B;

    public final String getModuleName() {
        return "data_download_confirm";
    }

    public final boolean onBackPressed() {
        m28788b();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1781648070);
        super.onCreate(bundle);
        this.f73327B = getArguments().getString("email");
        AnonymousClass0cQ.G(this, 194864849, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 759602529);
        View inflate = layoutInflater.inflate(C0164R.layout.data_download_confirm_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(C0164R.id.header_text)).setText(C0164R.string.data_download_confirm_header_text);
        ((TextView) inflate.findViewById(C0164R.id.body_text)).setText(getString(C0164R.string.data_download_confirm_body_text, new Object[]{this.f73327B}));
        ((ImageView) inflate.findViewById(C0164R.id.header_icon)).setImageDrawable(AnonymousClass1lw.C(getResources(), C0164R.drawable.checkmark_icon, null));
        ((ProgressButton) inflate.findViewById(C0164R.id.download_request_button)).setOnClickListener(new AnonymousClass61N(this));
        AnonymousClass0cQ.G(this, 1056499004, F);
        return inflate;
    }
}

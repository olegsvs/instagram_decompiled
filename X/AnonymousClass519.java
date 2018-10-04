package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.519 */
public final class AnonymousClass519 extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0IT {
    public final String getModuleName() {
        return "two_fac";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.h(C0164R.string.two_fac_option_authenticator_app);
    }

    public final boolean onBackPressed() {
        getFragmentManager().N("two_fac_choose_security_method_state_name", 0);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1377734908);
        View inflate = layoutInflater.inflate(C0164R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C0164R.id.authenticator_image_view);
        LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(C0164R.dimen.two_fac_download_image_size);
        layoutParams.height = getResources().getDimensionPixelSize(C0164R.dimen.two_fac_download_image_size);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(AnonymousClass0Ca.E(getContext(), C0164R.drawable.twofac_password));
        ((TextView) inflate.findViewById(C0164R.id.content_title)).setText(C0164R.string.two_fac_authenticator_app_download_fragment_title);
        ((TextView) inflate.findViewById(C0164R.id.content_first_paragraph)).setText(C0164R.string.two_fac_authenticator_app_download_fragment_para1);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.content_second_paragraph);
        if (((Boolean) AnonymousClass0CC.th.H(AnonymousClass0Ce.G(getArguments()))).booleanValue()) {
            textView.setText(C0164R.string.two_fac_authenticator_app_download_fragment_para2_duo);
        } else {
            textView.setText(C0164R.string.two_fac_authenticator_app_download_fragment_para2);
        }
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(C0164R.id.next_button);
        progressButton.setText(C0164R.string.two_fac_authenticator_app_download_fragment_primary_button);
        progressButton.setOnClickListener(new AnonymousClass515(this));
        ((TextView) inflate.findViewById(C0164R.id.setup_manually_button)).setOnClickListener(new AnonymousClass516(this));
        registerLifecycleListener(new AnonymousClass235(getActivity()));
        AnonymousClass0cQ.G(this, 2139971346, F);
        return inflate;
    }
}

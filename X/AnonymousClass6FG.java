package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* renamed from: X.6FG */
public final class AnonymousClass6FG extends AnonymousClass61M {
    /* renamed from: B */
    public DataDownloadStatusCheckResponse f73335B;
    /* renamed from: C */
    public EditText f73336C;
    /* renamed from: D */
    private InlineErrorMessageView f73337D;

    public final String getModuleName() {
        return "data_download_request";
    }

    /* renamed from: B */
    public static void m29625B(AnonymousClass6FG anonymousClass6FG) {
        if (AnonymousClass0IE.L(anonymousClass6FG.f73336C.getText().toString())) {
            anonymousClass6FG.f73337D.A();
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass6FG.getActivity());
            AnonymousClass0Jl.f2940B.A();
            String obj = anonymousClass6FG.f73336C.getText().toString();
            AnonymousClass0IL anonymousClass6FF = new AnonymousClass6FF();
            Bundle bundle = new Bundle();
            bundle.putString("email", obj);
            anonymousClass6FF.setArguments(bundle);
            anonymousClass0IZ.f2754D = anonymousClass6FF;
            anonymousClass0IZ.B();
            return;
        }
        anonymousClass6FG.f73337D.B(anonymousClass6FG.getString(C0164R.string.invalid_email));
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 467452371);
        super.onCreate(bundle);
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = (DataDownloadStatusCheckResponse) getArguments().getParcelable("data_download_status_parcel_key");
        this.f73335B = dataDownloadStatusCheckResponse;
        if (!(dataDownloadStatusCheckResponse == null || dataDownloadStatusCheckResponse.f43022E == JobStatus.NO_VALID_DOWNLOADABLE)) {
            m28789c(this.f73335B.f43021D, this.f73335B.f43020C, new AnonymousClass61U(this));
        }
        AnonymousClass0cQ.G(this, 586726786, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1475376005);
        View inflate = layoutInflater.inflate(C0164R.layout.data_download_request_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(C0164R.id.header_text)).setText(C0164R.string.data_download_request_header_text);
        ((TextView) inflate.findViewById(C0164R.id.body_text)).setText(C0164R.string.data_download_request_body_text);
        ((ImageView) inflate.findViewById(C0164R.id.header_icon)).setImageDrawable(AnonymousClass1lw.C(getResources(), C0164R.drawable.download_your_data_icon, null));
        ((ViewStub) inflate.findViewById(C0164R.id.inline_error_stub)).inflate();
        EditText editText = (EditText) inflate.findViewById(C0164R.id.text_field);
        this.f73336C = editText;
        editText.setHint(C0164R.string.email);
        this.f73336C.setInputType(32);
        this.f73336C.setImeOptions(6);
        this.f73336C.setOnEditorActionListener(new AnonymousClass61V(this));
        this.f73337D = (InlineErrorMessageView) inflate.findViewById(C0164R.id.inline_error);
        ((ProgressButton) inflate.findViewById(C0164R.id.download_request_button)).setOnClickListener(new AnonymousClass61W(this));
        ScrollView scrollView = (ScrollView) inflate.findViewById(C0164R.id.scroll_view);
        scrollView.setVerticalScrollBarEnabled(false);
        inflate.addOnLayoutChangeListener(new AnonymousClass61Y(this, scrollView));
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = this.f73335B;
        if (dataDownloadStatusCheckResponse == null || dataDownloadStatusCheckResponse.f43022E == JobStatus.NO_VALID_DOWNLOADABLE) {
            CharSequence charSequence;
            dataDownloadStatusCheckResponse = this.f73335B;
            if (dataDownloadStatusCheckResponse != null) {
                charSequence = dataDownloadStatusCheckResponse.f43019B;
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                List E = AnonymousClass3KN.E(getContext());
                if (!E.isEmpty()) {
                    charSequence = (String) E.get(0);
                }
            }
            if (charSequence != null) {
                this.f73336C.append(charSequence);
            }
        }
        AnonymousClass0cQ.G(this, -318296173, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 557122421);
        super.onPause();
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0Nm.N(getView());
        AnonymousClass0cQ.G(this, 1781358446, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 224311025);
        super.onResume();
        Z().getWindow().setSoftInputMode(16);
        AnonymousClass0cQ.G(this, 170450405, F);
    }
}

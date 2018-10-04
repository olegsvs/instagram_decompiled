package X;

import android.view.View;
import com.instagram.igtv.uploadflow.IGTVUploadMetadataFragment;

/* renamed from: X.4vK */
public final class AnonymousClass4vK extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ IGTVUploadMetadataFragment f58480B;

    public AnonymousClass4vK(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        this.f58480B = iGTVUploadMetadataFragment;
    }

    public final boolean yCA(View view) {
        AnonymousClass0IL anonymousClass0IL = this.f58480B;
        IGTVUploadMetadataFragment.m25373C(anonymousClass0IL);
        AnonymousClass3RE anonymousClass3RE = anonymousClass0IL.f58490B;
        view = anonymousClass0IL.f58492D.m25370A();
        boolean TX = anonymousClass0IL.f58494F.TX();
        boolean z = anonymousClass0IL.f58493E;
        AnonymousClass0bP B = AnonymousClass3RE.B(anonymousClass3RE, "igtv_composer_post_video");
        B.fB = Boolean.valueOf(view);
        B.gB = Boolean.valueOf(TX);
        B.hB = Boolean.valueOf(z);
        AnonymousClass0bN.f(B.B(), AnonymousClass0dd.REGULAR);
        AnonymousClass0OT anonymousClass0ZU = new AnonymousClass0ZU();
        anonymousClass0IL.f58494F.lC = anonymousClass0IL.mTitleTextView.getText().toString().replaceAll("\\n", " ");
        anonymousClass0IL.f58494F.f3809W = anonymousClass0IL.mDescriptionTextView.getText().toString();
        anonymousClass0IL.f58494F.B(anonymousClass0ZU);
        AnonymousClass0GK.E(anonymousClass0IL.getActivity(), anonymousClass0IL.f58495G).I(anonymousClass0IL.f58494F, anonymousClass0ZU);
        IGTVUploadMetadataFragment.m25374D(anonymousClass0IL);
        anonymousClass0IL.f58490B.A("post");
        anonymousClass0IL.getActivity().finish();
        return true;
    }
}

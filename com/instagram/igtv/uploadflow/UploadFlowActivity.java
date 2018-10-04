package com.instagram.igtv.uploadflow;

import X.AnonymousClass0IL;
import X.AnonymousClass0IU;
import X.AnonymousClass0cQ;
import X.AnonymousClass2CO;
import X.AnonymousClass2CP;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class UploadFlowActivity extends IgFragmentActivity {
    public final void finish() {
        super.finish();
        overridePendingTransition(0, C0164R.anim.bottom_out);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 486376889);
        super.onCreate(bundle);
        setContentView(C0164R.layout.upload_flow_activity);
        Bundle extras = getIntent().getExtras();
        AnonymousClass0IU D = D();
        AnonymousClass0IL A = AnonymousClass2CP.f27395B.D().m25326A(AnonymousClass2CO.PICK_UPLOAD_VIDEO, null, extras.getString("com.instagram.igtv.uploadflow.extra.EXTRA_IGTV_VIEWER_SESSION_ID"), null);
        Bundle arguments = A.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        String str = "IgSessionManager.USER_ID";
        arguments.putString(str, extras.getString(str));
        A.setArguments(arguments);
        D.B().A(C0164R.id.layout_container_main, A).F();
        overridePendingTransition(C0164R.anim.bottom_in, 0);
        AnonymousClass0cQ.C(this, -262605580, B);
    }
}

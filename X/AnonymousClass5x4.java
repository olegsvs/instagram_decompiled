package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.fragment.ReelDashboardFragment;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5x4 */
public final class AnonymousClass5x4 implements AnonymousClass0PG {
    /* renamed from: B */
    public final Activity f70258B;
    /* renamed from: C */
    private final AnonymousClass0IL f70259C;

    public final void yc(int i, int i2) {
    }

    public AnonymousClass5x4(AnonymousClass0IL anonymousClass0IL, Activity activity) {
        this.f70259C = anonymousClass0IL;
        this.f70258B = activity;
    }

    public final void AV(Intent intent) {
        WeakReference weakReference = AnonymousClass0cS.f7158B;
        AnonymousClass0Hm anonymousClass0Hm = weakReference != null ? (AnonymousClass0Hl) weakReference.get() : null;
        AnonymousClass0NN A = AnonymousClass0g3.ShareSuccessful.A();
        if (intent.getStringExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE").equals("CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED")) {
            if (!(this.f70259C instanceof ReelDashboardFragment)) {
                A.F("return_to", "feed").R();
                if (anonymousClass0Hm != null) {
                    anonymousClass0Hm.oLA();
                    anonymousClass0Hm.BSA(AnonymousClass0cA.FEED);
                    anonymousClass0Hm.OWA(AnonymousClass3jF.B().B(anonymousClass0Hm.fS().F()).A(false).C("return_from_main_camera_to_inbox").ID());
                }
            }
            Activity activity = this.f70258B;
            if (activity instanceof ModalActivity) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Camera activity action not handled");
    }

    public final void VUA(File file, int i) {
        AnonymousClass1h1.C(this.f70258B, i, file);
    }

    public final void jUA(Intent intent, int i) {
        AnonymousClass0IW.L(intent, i, this.f70259C);
    }
}

package X;

import android.content.Context;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.facebook.optic.CameraPreviewView;

/* renamed from: X.0Nb */
public final class AnonymousClass0Nb {
    /* renamed from: B */
    public static final AnonymousClass2o8 f3594B = new AnonymousClass1d7();
    /* renamed from: C */
    public static boolean f3595C;

    /* renamed from: B */
    public static AnonymousClass44N m3341B(AnonymousClass0Cm anonymousClass0Cm, String str) {
        return new AnonymousClass44N(anonymousClass0Cm, str);
    }

    /* renamed from: C */
    public static AnonymousClass45f m3342C(Context context, AnonymousClass0Cm anonymousClass0Cm, String str) {
        AnonymousClass0Nc.IB = AnonymousClass36g.C(anonymousClass0Cm);
        return new AnonymousClass45f(anonymousClass0Cm, new CameraPreviewView(context), str);
    }

    /* renamed from: D */
    public static AnonymousClass45f m3343D(AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub, String str) {
        AnonymousClass0Nc.IB = AnonymousClass36g.C(anonymousClass0Cm);
        viewStub.setLayoutResource(C0164R.layout.optic_camera);
        return new AnonymousClass45f(anonymousClass0Cm, viewStub.inflate(), str);
    }
}

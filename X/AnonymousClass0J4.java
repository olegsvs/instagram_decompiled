package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.instagram.arlink.util.ArLinkModelDownloadService;

/* renamed from: X.0J4 */
public final class AnonymousClass0J4 extends AnonymousClass0J5 {
    /* renamed from: B */
    private AnonymousClass4An f2885B;
    /* renamed from: C */
    private AnonymousClass1Py f2886C;

    /* renamed from: A */
    public final AnonymousClass4An mo510A() {
        if (this.f2885B == null) {
            this.f2885B = new AnonymousClass4An();
        }
        return this.f2885B;
    }

    /* renamed from: B */
    public final AnonymousClass1Py mo511B() {
        if (this.f2886C == null) {
            this.f2886C = new AnonymousClass1Py();
        }
        return this.f2886C;
    }

    /* renamed from: C */
    public final void mo512C(int i) {
        AnonymousClass311.f36907K.A().m3294B("fail_count", i).m3310R();
    }

    /* renamed from: D */
    public final void mo513D() {
        AnonymousClass311.f36930h.B();
    }

    /* renamed from: E */
    public final AnonymousClass49a mo514E(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass318 anonymousClass318) {
        return new AnonymousClass49a(anonymousClass0IJ, anonymousClass0Cm, anonymousClass318);
    }

    /* renamed from: F */
    public final AnonymousClass4AI mo515F(Activity activity, ViewGroup viewGroup, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass31A anonymousClass31A) {
        return new AnonymousClass4AI(activity, viewGroup, anonymousClass0Cm, anonymousClass31A);
    }

    /* renamed from: G */
    public final void mo516G(Context context) {
        ArLinkModelDownloadService.m10673F(context);
    }

    /* renamed from: H */
    public final void mo517H(Context context, AnonymousClass319 anonymousClass319) {
        AnonymousClass311.f36928f.A().m3298F("origin", anonymousClass319.A()).m3300H("has_camera_permission", AnonymousClass1Ba.m9838D(context, "android.permission.CAMERA")).m3300H("has_storage_permission", AnonymousClass1Ba.m9838D(context, "android.permission.READ_EXTERNAL_STORAGE")).m3310R();
    }

    /* renamed from: I */
    public final void mo518I() {
        AnonymousClass311.f36927e.B();
        AnonymousClass311.D();
    }
}

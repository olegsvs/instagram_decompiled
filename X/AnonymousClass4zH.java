package X;

import android.graphics.Bitmap;
import com.facebook.C0164R;

/* renamed from: X.4zH */
public final class AnonymousClass4zH extends AnonymousClass17n {
    /* renamed from: B */
    public Bitmap f59093B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4zI f59094C;

    public AnonymousClass4zH(AnonymousClass4zI anonymousClass4zI, Bitmap bitmap) {
        this.f59094C = anonymousClass4zI;
        this.f59093B = bitmap;
    }

    /* renamed from: A */
    public final void m25522A(Exception exception) {
        AnonymousClass0IG.E(C0164R.string.backup_codes_take_screenshot_failed_toast);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25523B(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AnonymousClass0IG.E(C0164R.string.backup_codes_screenshot_taken_toast);
            AnonymousClass0FH.f2099C.O(true);
            return;
        }
        AnonymousClass0IG.E(C0164R.string.backup_codes_take_screenshot_failed_toast);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(AnonymousClass4zI.m25524B(this.f59094C, this.f59093B));
    }

    public final void onFinish() {
        super.onFinish();
        this.f59094C.f59097D = false;
        AnonymousClass0eT.D(AnonymousClass0eT.E(this.f59094C.getActivity()));
        this.f59093B.recycle();
    }
}

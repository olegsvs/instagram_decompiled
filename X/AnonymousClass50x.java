package X;

import android.graphics.Bitmap;
import com.facebook.C0164R;

/* renamed from: X.50x */
public final class AnonymousClass50x extends AnonymousClass17n {
    /* renamed from: B */
    public Bitmap f59291B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass50y f59292C;

    public AnonymousClass50x(AnonymousClass50y anonymousClass50y, Bitmap bitmap) {
        this.f59292C = anonymousClass50y;
        this.f59291B = bitmap;
    }

    /* renamed from: A */
    public final void m25589A(Exception exception) {
        AnonymousClass1TN.makeText(this.f59292C.getContext(), C0164R.string.backup_codes_take_screenshot_failed_toast, 0).show();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25590B(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AnonymousClass1TN.makeText(this.f59292C.getContext(), C0164R.string.backup_codes_screenshot_taken_toast, 0).show();
            AnonymousClass0FH.f2099C.O(true);
            return;
        }
        AnonymousClass1TN.makeText(this.f59292C.getContext(), C0164R.string.backup_codes_take_screenshot_failed_toast, 0).show();
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(AnonymousClass50y.m25591B(this.f59292C, this.f59291B));
    }

    public final void onFinish() {
        super.onFinish();
        this.f59291B.recycle();
    }
}

package X;

import android.view.MotionEvent;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.4Nc */
public final class AnonymousClass4Nc implements AnonymousClass0Wj {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5TC f53401B;

    public AnonymousClass4Nc(AnonymousClass5TC anonymousClass5TC) {
        this.f53401B = anonymousClass5TC;
    }

    public final /* bridge */ /* synthetic */ Object RC(Object obj) {
        if (((MotionEvent) obj).getActionMasked() == 0) {
            obj = this.f53401B.f64372F;
            Toast toast = obj.f64319K;
            if (toast != null) {
                toast.cancel();
            }
            toast = Toast.makeText(obj.f64311C, obj.f64311C.getString(C0164R.string.captured_max_items, new Object[]{Integer.valueOf(10)}), 0);
            obj.f64319K = toast;
            toast.show();
        }
        return null;
    }
}

package X;

import android.view.View;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.4P9 */
public final class AnonymousClass4P9 extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4PD f53660B;

    public AnonymousClass4P9(AnonymousClass4PD anonymousClass4PD) {
        this.f53660B = anonymousClass4PD;
    }

    public final boolean yCA(View view) {
        AnonymousClass4PD anonymousClass4PD = this.f53660B;
        if (AnonymousClass4PD.m24118F(anonymousClass4PD)) {
            anonymousClass4PD.f53676J.f7402p.C(new AnonymousClass3Ed());
        } else {
            Toast.makeText(anonymousClass4PD.f53674H, C0164R.string.caption_required_error_message, 0).show();
        }
        return true;
    }
}

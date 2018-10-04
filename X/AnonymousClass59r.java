package X;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.widget.Toast;
import com.facebook.C0164R;
import java.io.File;

/* renamed from: X.59r */
public final class AnonymousClass59r extends AnonymousClass0nF {
    /* renamed from: B */
    public final /* synthetic */ Context f60688B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0IU f60689C;
    /* renamed from: D */
    public final /* synthetic */ OnDismissListener f60690D;

    public AnonymousClass59r(AnonymousClass0IU anonymousClass0IU, OnDismissListener onDismissListener, Context context) {
        this.f60689C = anonymousClass0IU;
        this.f60690D = onDismissListener;
        this.f60688B = context;
    }

    /* renamed from: A */
    public final void m25879A(Exception exception) {
        AnonymousClass5AB.m25884C(this.f60689C, this.f60690D);
        Toast.makeText(this.f60688B, C0164R.string.error, 0).show();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25880B(Object obj) {
        File file = (File) obj;
        AnonymousClass5AB.m25884C(this.f60689C, this.f60690D);
        AnonymousClass1RC.G(this.f60688B, file);
        Toast.makeText(this.f60688B, C0164R.string.saved_to_camera_roll, 0).show();
    }
}

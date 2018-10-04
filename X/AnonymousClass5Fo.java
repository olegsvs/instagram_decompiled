package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: X.5Fo */
public final class AnonymousClass5Fo implements OnCancelListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Fv f61616B;

    public AnonymousClass5Fo(AnonymousClass5Fv anonymousClass5Fv) {
        this.f61616B = anonymousClass5Fv;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f61616B.f61624B = false;
        AnonymousClass5Fv.m26087C(this.f61616B, true);
    }
}

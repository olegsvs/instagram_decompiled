package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: X.3JA */
public final class AnonymousClass3JA implements OnCancelListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4sv f40006B;

    public AnonymousClass3JA(AnonymousClass3JC anonymousClass3JC, AnonymousClass4sv anonymousClass4sv) {
        this.f40006B = anonymousClass4sv;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f40006B.f58130B.getFragmentManager().O();
    }
}

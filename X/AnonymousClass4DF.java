package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: X.4DF */
public final class AnonymousClass4DF implements OnCancelListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4DM f51548B;
    /* renamed from: C */
    public final /* synthetic */ boolean f51549C;

    public AnonymousClass4DF(AnonymousClass4DM anonymousClass4DM, boolean z) {
        this.f51548B = anonymousClass4DM;
        this.f51549C = z;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f51548B.f51568I = false;
        this.f51548B.f51572M.setChecked(this.f51549C);
    }
}

package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;

/* renamed from: X.3f1 */
public final class AnonymousClass3f1 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3f2 f43085B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3ew f43086C;
    /* renamed from: D */
    public final /* synthetic */ View f43087D;

    public AnonymousClass3f1(AnonymousClass3f2 anonymousClass3f2, AnonymousClass3ew anonymousClass3ew, View view) {
        this.f43085B = anonymousClass3f2;
        this.f43086C = anonymousClass3ew;
        this.f43087D = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f43086C.mo5022O(this.f43085B.f43089C);
        ((AnonymousClass2Ia) this.f43087D).setChecked(false);
        dialogInterface.dismiss();
    }
}

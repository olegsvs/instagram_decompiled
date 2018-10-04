package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

/* renamed from: X.3aT */
public final class AnonymousClass3aT implements OnKeyListener {
    /* renamed from: B */
    public final /* synthetic */ FragmentActivity f42457B;

    public AnonymousClass3aT(FragmentActivity fragmentActivity) {
        this.f42457B = fragmentActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.f42457B.finish();
        }
        return false;
    }
}

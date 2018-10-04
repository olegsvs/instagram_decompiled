package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: X.5Pc */
public final class AnonymousClass5Pc implements OnKeyListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5b4 f63149B;

    public AnonymousClass5Pc(AnonymousClass5b4 anonymousClass5b4) {
        this.f63149B = anonymousClass5b4;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f63149B.f66803H != null) {
            AnonymousClass6GC anonymousClass6GC = this.f63149B.f66803H.f73650D;
            if (anonymousClass6GC != null) {
                anonymousClass6GC.mo6818D(view, i, keyEvent);
            }
        }
        return false;
    }
}

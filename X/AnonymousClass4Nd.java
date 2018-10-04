package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.4Nd */
public final class AnonymousClass4Nd implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Wj f53402B;

    public AnonymousClass4Nd(AnonymousClass5TC anonymousClass5TC, AnonymousClass0Wj anonymousClass0Wj) {
        this.f53402B = anonymousClass0Wj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass0Wj anonymousClass0Wj = this.f53402B;
        if (anonymousClass0Wj != null) {
            anonymousClass0Wj.RC(motionEvent);
        }
        return true;
    }
}

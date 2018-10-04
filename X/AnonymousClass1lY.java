package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* renamed from: X.1lY */
public final class AnonymousClass1lY extends EpicenterCallback {
    /* renamed from: B */
    public final /* synthetic */ Rect f22495B;

    public AnonymousClass1lY(Rect rect) {
        this.f22495B = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f22495B;
    }
}

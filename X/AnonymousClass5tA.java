package X;

import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.image.ImageLoadEvent;

/* renamed from: X.5tA */
public final class AnonymousClass5tA implements AnonymousClass26D {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5tC f69639B;
    /* renamed from: C */
    public final /* synthetic */ EventDispatcher f69640C;

    public AnonymousClass5tA(AnonymousClass5tC anonymousClass5tC, EventDispatcher eventDispatcher) {
        this.f69639B = anonymousClass5tC;
        this.f69640C = eventDispatcher;
    }

    public final void Jx() {
        this.f69640C.dispatchEvent(new ImageLoadEvent(this.f69639B.getId(), 4));
    }
}

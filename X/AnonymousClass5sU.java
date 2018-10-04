package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.react.delegate.IgReactDelegate$RCTViewEventEmitter;

/* renamed from: X.5sU */
public final class AnonymousClass5sU implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5sV f69527B;

    public AnonymousClass5sU(AnonymousClass5sV anonymousClass5sV) {
        this.f69527B = anonymousClass5sV;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1165289723);
        ((IgReactDelegate$RCTViewEventEmitter) this.f69527B.f69528B.getReactApplicationContext().getJSModule(IgReactDelegate$RCTViewEventEmitter.class)).emit("didTapRightBarButton", Double.valueOf(this.f69527B.f69532F));
        AnonymousClass0cQ.L(this, 210564331, M);
    }
}

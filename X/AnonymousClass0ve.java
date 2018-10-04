package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0ve */
public final class AnonymousClass0ve extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0jf f12116B;

    public AnonymousClass0ve(AnonymousClass0jf anonymousClass0jf) {
        this.f12116B = anonymousClass0jf;
    }

    public final void handleMessage(Message message) {
        if (message.what == 0 && this.f12116B.f9235B.getView() != null) {
            AnonymousClass0vf anonymousClass0vf = (AnonymousClass0vf) message.obj;
            int E = AnonymousClass0m2.m7425E(this.f12116B.f9235B.getListView(), anonymousClass0vf.f12117B);
            if (E != -1 && AnonymousClass0m2.m7435O(this.f12116B.f9235B.getListView(), E)) {
                AnonymousClass0q0 L = AnonymousClass0m2.m7432L(this.f12116B.f9235B.getListView(), E);
                if (anonymousClass0vf.f12117B.equals(AnonymousClass0m2.m7433M(L.f10829D))) {
                    AnonymousClass0vg anonymousClass0vg = L.f10838M;
                    AnonymousClass0m3 anonymousClass0m3 = anonymousClass0vf.f12118C;
                    if (anonymousClass0vg.f12119B.getChildCount() == 0 && anonymousClass0vg.f12121D.getGlobalVisibleRect(anonymousClass0vg.f12120C)) {
                        anonymousClass0m3.f9701j = false;
                        AnonymousClass0vh.m8360D(anonymousClass0vg.f12121D);
                    }
                }
            }
        }
    }
}

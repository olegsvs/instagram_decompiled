package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.5sK */
public final class AnonymousClass5sK implements AnonymousClass0gl {
    /* renamed from: B */
    public final /* synthetic */ Bundle f69507B;
    /* renamed from: C */
    public final /* synthetic */ ReadableMap f69508C;

    public AnonymousClass5sK(Bundle bundle, ReadableMap readableMap) {
        this.f69507B = bundle;
        this.f69508C = readableMap;
    }

    public final void iB(AnonymousClass0NN anonymousClass0NN) {
        Bundle bundle = (Bundle) this.f69507B.getParcelable("fb_analyticsExtras");
        AnonymousClass5sI.m28578C(bundle, this.f69508C);
        for (String str : bundle.keySet()) {
            anonymousClass0NN.F(str, bundle.getString(str));
        }
    }
}

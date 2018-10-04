package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.6HF */
public final class AnonymousClass6HF extends AnonymousClass6CL {
    public AnonymousClass6HF(Context context) {
        super(context);
    }

    /* renamed from: C */
    public final AnonymousClass21F mo6792C() {
        AnonymousClass20f anonymousClass6CS = new AnonymousClass6CS(this);
        AnonymousClass21G anonymousClass21G = new AnonymousClass21G();
        AnonymousClass20K anonymousClass20K = this.f24966G;
        AnonymousClass1zy anonymousClass2Sm = new AnonymousClass2Sm(1, anonymousClass6CS, anonymousClass21G, this.f24965F);
        Handler handler = anonymousClass20K.f25179C;
        handler.sendMessage(handler.obtainMessage(4, new AnonymousClass20W(anonymousClass2Sm, anonymousClass20K.f25187K.get(), this)));
        return anonymousClass21G.f25283B;
    }
}

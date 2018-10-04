package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;

/* renamed from: X.2qI */
public final class AnonymousClass2qI extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3tn f34778B;

    public AnonymousClass2qI(AnonymousClass3tn anonymousClass3tn, Looper looper) {
        this.f34778B = anonymousClass3tn;
        super(looper);
    }

    public final void handleMessage(Message message) {
        AnonymousClass3tn anonymousClass3tn = this.f34778B;
        Iterator it;
        Iterator it2;
        switch (message.what) {
            case 1:
                Object obj = message.obj;
                Object obj2 = anonymousClass3tn.f46150H;
                System.arraycopy(obj, 0, obj2, 0, obj2.length);
                anonymousClass3tn.f46148F = message.arg1;
                it = anonymousClass3tn.f46145C.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass2qG) it.next()).tt(anonymousClass3tn.f46144B ? anonymousClass3tn.f46149G : anonymousClass3tn.f46147E, anonymousClass3tn.f46148F);
                }
                return;
            case 2:
                anonymousClass3tn.f46148F = message.arg1;
                it = anonymousClass3tn.f46145C.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass2qG) it.next()).tt(anonymousClass3tn.f46144B ? anonymousClass3tn.f46149G : anonymousClass3tn.f46147E, anonymousClass3tn.f46148F);
                }
                return;
            case 3:
                int i = anonymousClass3tn.f46146D - 1;
                anonymousClass3tn.f46146D = i;
                if (i == 0) {
                    anonymousClass3tn.f46149G = ((Boolean) message.obj).booleanValue();
                    it = anonymousClass3tn.f46145C.iterator();
                    while (it.hasNext()) {
                        AnonymousClass2qG anonymousClass2qG = (AnonymousClass2qG) it.next();
                        anonymousClass2qG.nt();
                        if (anonymousClass3tn.f46144B) {
                            boolean z = anonymousClass3tn.f46149G;
                            if (z) {
                                anonymousClass2qG.tt(z, anonymousClass3tn.f46148F);
                            }
                        }
                    }
                    return;
                }
                return;
            case 4:
                AnonymousClass2qE anonymousClass2qE = (AnonymousClass2qE) message.obj;
                it2 = anonymousClass3tn.f46145C.iterator();
                while (it2.hasNext()) {
                    ((AnonymousClass2qG) it2.next()).rt(anonymousClass2qE);
                }
                return;
            case 5:
                it2 = anonymousClass3tn.f46145C.iterator();
                while (it2.hasNext()) {
                    ((AnonymousClass2qG) it2.next()).vt();
                }
                return;
            default:
                return;
        }
    }
}

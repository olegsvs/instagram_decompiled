package X;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: X.4mD */
public final class AnonymousClass4mD implements Callback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass18T f57126B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f57127C;

    public AnonymousClass4mD(AnonymousClass18T anonymousClass18T, AnonymousClass0Cm anonymousClass0Cm) {
        this.f57126B = anonymousClass18T;
        this.f57127C = anonymousClass0Cm;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass0Tw anonymousClass0Tw;
        AnonymousClass18T anonymousClass18T;
        switch (message.what) {
            case 1:
                anonymousClass0Tw = this.f57126B.f14982G;
                anonymousClass18T = this.f57126B;
                synchronized (anonymousClass0Tw) {
                    anonymousClass0Tw.f5290J.add(anonymousClass18T);
                    anonymousClass0Tw.k();
                    break;
                }
            case 2:
                anonymousClass0Tw = this.f57126B.f14982G;
                anonymousClass18T = this.f57126B;
                synchronized (anonymousClass0Tw) {
                    anonymousClass0Tw.f5290J.remove(anonymousClass18T);
                    break;
                }
            case 3:
                AnonymousClass18T.B(this.f57126B, (AnonymousClass0Ws) message.obj, this.f57126B.f14980E);
                break;
            case 4:
                AnonymousClass0Tt.C(this.f57127C).B();
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Message with what = ");
                stringBuilder.append(message.what);
                stringBuilder.append(" is not supported");
                throw new IllegalStateException(stringBuilder.toString());
        }
        return false;
    }
}

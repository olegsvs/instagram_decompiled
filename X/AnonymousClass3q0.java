package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3q0 */
public final class AnonymousClass3q0 extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1RB f45117B;

    public AnonymousClass3q0(AnonymousClass1RB anonymousClass1RB, Looper looper) {
        this.f45117B = anonymousClass1RB;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.f45117B.f18543L != null) {
            int i = 1;
            switch (message.what) {
                case 0:
                    if (this.f45117B.f18550S) {
                        this.f45117B.f18548Q = 0.0f;
                        this.f45117B.f18550S = false;
                    }
                    float max = Math.max(this.f45117B.f18548Q, (((float) this.f45117B.f18543L.C()) * 1.0f) / ((float) this.f45117B.f18535D));
                    long E = AnonymousClass0Gd.E();
                    if (E - this.f45117B.f18539H >= 1500) {
                        this.f45117B.f18539H = E;
                        float f = max - this.f45117B.f18548Q;
                        if (this.f45117B.f18553V != null) {
                            Object obj = (f < 0.0f || f > 15.0f / ((float) this.f45117B.f18535D)) ? null : 1;
                            if (this.f45117B.f18535D >= 0) {
                                i = 0;
                            }
                            if (obj == null) {
                                if (i == 0) {
                                    this.f45117B.f18553V.ZSA(8);
                                }
                            }
                            this.f45117B.f18553V.ZSA(0);
                        }
                    }
                    this.f45117B.f18548Q = max;
                    this.f45117B.f18540I.Nv(this.f45117B.f18534C, this.f45117B.f18548Q);
                    if (this.f45117B.f18538G) {
                        this.f45117B.f18536E.removeMessages(0);
                        sendEmptyMessageDelayed(0, 100);
                        return;
                    }
                    sendEmptyMessage(0);
                    return;
                case 1:
                    if (this.f45117B.f18556Y) {
                        if (AnonymousClass0LQ.B(this.f45117B.f18534C.getId(), (String) message.obj) && !this.f45117B.f18546O && !this.f45117B.f18533B) {
                            int B = this.f45117B.f18543L.B();
                            int I = this.f45117B.f18543L.I();
                            if (this.f45117B.f18534C.oW()) {
                                AnonymousClass0up anonymousClass0up = this.f45117B.f18542K;
                                AnonymousClass0Pk anonymousClass0Pk = this.f45117B.f18534C;
                                int i2 = this.f45117B.f18554W;
                                AnonymousClass1RB anonymousClass1RB = this.f45117B;
                                anonymousClass0up.sKA(anonymousClass0Pk, B, I, i2, AnonymousClass1RB.C(anonymousClass1RB, anonymousClass1RB.C(), AnonymousClass1RB.D(this.f45117B)));
                            }
                            AnonymousClass1RB anonymousClass1RB2 = this.f45117B;
                            anonymousClass1RB2.f18554W++;
                            if (((Boolean) AnonymousClass0CC.nR.H(this.f45117B.f18552U)).booleanValue() && this.f45117B.f18543L != null) {
                                this.f45117B.f18542K.lKA(this.f45117B.f18534C, this.f45117B.f18543L.J());
                            }
                            sendMessageDelayed(Message.obtain(this.f45117B.f18536E, 1, this.f45117B.f18534C.getId()), this.f45117B.f18555X);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

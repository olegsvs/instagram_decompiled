package com.instagram.direct.store;

import X.AnonymousClass0Cb;
import X.AnonymousClass0Uj;
import X.AnonymousClass0cQ;
import android.os.Message;
import com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi$Stub;

public final class DirectAppThreadStoreServiceClient$1 extends DirectAppThreadStoreServiceClientApi$Stub {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Uj f65671B;

    public DirectAppThreadStoreServiceClient$1(AnonymousClass0Uj anonymousClass0Uj) {
        this.f65671B = anonymousClass0Uj;
        AnonymousClass0cQ.H(this, 1374348504, AnonymousClass0cQ.I(this, -1800875349));
    }

    public final void Ie(String str, int i) {
        int I = AnonymousClass0cQ.I(this, 1897335153);
        if (AnonymousClass0Cb.B(this.f65671B.f5540C)) {
            Message obtainMessage = this.f65671B.f5542E.obtainMessage(1);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            AnonymousClass0cQ.H(this, -2118540539, I);
            return;
        }
        AnonymousClass0cQ.H(this, -1022894344, I);
    }

    public final void Qw(boolean z) {
        int I = AnonymousClass0cQ.I(this, -1553577589);
        if (AnonymousClass0Cb.B(this.f65671B.f5540C)) {
            Message obtainMessage = this.f65671B.f5542E.obtainMessage(2);
            obtainMessage.arg1 = z;
            obtainMessage.sendToTarget();
            AnonymousClass0cQ.H(this, 401581361, I);
            return;
        }
        AnonymousClass0cQ.H(this, 1535888174, I);
    }
}

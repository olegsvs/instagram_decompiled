package com.instagram.direct.store;

import X.AnonymousClass0Cb;
import X.AnonymousClass0cQ;
import android.util.Pair;
import com.instagram.direct.ipc.DirectAppThreadStoreServiceApi$Stub;
import com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi;

public final class DirectAppThreadStoreService$1 extends DirectAppThreadStoreServiceApi$Stub {
    /* renamed from: B */
    public final /* synthetic */ DirectAppThreadStoreService f67166B;

    public DirectAppThreadStoreService$1(DirectAppThreadStoreService directAppThreadStoreService) {
        this.f67166B = directAppThreadStoreService;
        AnonymousClass0cQ.H(this, -375594362, AnonymousClass0cQ.I(this, -1776317186));
    }

    public final void CJA(String str, DirectAppThreadStoreServiceClientApi directAppThreadStoreServiceClientApi) {
        int I = AnonymousClass0cQ.I(this, 1608730549);
        if (AnonymousClass0Cb.B(this.f67166B)) {
            this.f67166B.f5862B.obtainMessage(1, new Pair(str, directAppThreadStoreServiceClientApi)).sendToTarget();
            AnonymousClass0cQ.H(this, 488568466, I);
            return;
        }
        AnonymousClass0cQ.H(this, -2122850316, I);
    }

    public final void oVA(String str, DirectAppThreadStoreServiceClientApi directAppThreadStoreServiceClientApi) {
        int I = AnonymousClass0cQ.I(this, 1007160652);
        if (AnonymousClass0Cb.B(this.f67166B)) {
            this.f67166B.f5862B.obtainMessage(2, new Pair(str, directAppThreadStoreServiceClientApi)).sendToTarget();
            AnonymousClass0cQ.H(this, -906320824, I);
            return;
        }
        AnonymousClass0cQ.H(this, -1427853705, I);
    }
}

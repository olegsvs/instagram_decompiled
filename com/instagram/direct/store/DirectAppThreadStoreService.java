package com.instagram.direct.store;

import X.AnonymousClass0O8;
import X.AnonymousClass0Ul;
import X.AnonymousClass0cQ;
import X.AnonymousClass4jl;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.instagram.direct.ipc.DirectAppThreadStoreServiceApi;

public final class DirectAppThreadStoreService extends Service {
    /* renamed from: B */
    public final Handler f5862B = new AnonymousClass4jl(this);
    /* renamed from: C */
    public final AnonymousClass0O8 f5863C = new AnonymousClass0O8();
    /* renamed from: D */
    private final DirectAppThreadStoreServiceApi f5864D = new DirectAppThreadStoreService$1(this);

    public final IBinder onBind(Intent intent) {
        return this.f5864D.asBinder();
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.m5860J(this, -514139855);
        super.onCreate();
        AnonymousClass0Ul.f5552D.add(this);
        AnonymousClass0cQ.m5861K(this, -198856431, J);
    }

    public final void onDestroy() {
        int J = AnonymousClass0cQ.m5860J(this, -760895873);
        super.onDestroy();
        int size = this.f5863C.size();
        for (int i = 0; i < size; i++) {
            ((RemoteCallbackList) this.f5863C.m3532I(i)).kill();
        }
        AnonymousClass0Ul.f5552D.remove(this);
        AnonymousClass0cQ.m5861K(this, -1136684037, J);
    }
}

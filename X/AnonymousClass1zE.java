package X;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1zE */
public final class AnonymousClass1zE implements Callback {
    /* renamed from: B */
    public final Handler f25015B;
    /* renamed from: C */
    public final Object f25016C = new Object();
    /* renamed from: D */
    public final AnonymousClass1zF f25017D;
    /* renamed from: E */
    public final ArrayList f25018E = new ArrayList();
    /* renamed from: F */
    public ArrayList f25019F = new ArrayList();
    /* renamed from: G */
    public final ArrayList f25020G = new ArrayList();
    /* renamed from: H */
    public volatile boolean f25021H = false;
    /* renamed from: I */
    public final AtomicInteger f25022I = new AtomicInteger(0);
    /* renamed from: J */
    public boolean f25023J = false;

    public AnonymousClass1zE(Looper looper, AnonymousClass1zF anonymousClass1zF) {
        this.f25017D = anonymousClass1zF;
        this.f25015B = new Handler(looper, this);
    }

    /* renamed from: A */
    public final void m14077A(AnonymousClass1yr anonymousClass1yr) {
        AnonymousClass1Ew.I(anonymousClass1yr);
        synchronized (this.f25016C) {
            if (this.f25018E.contains(anonymousClass1yr)) {
                String valueOf = String.valueOf(anonymousClass1yr);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder.append("registerConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f25018E.add(anonymousClass1yr);
            }
        }
        if (this.f25017D.isConnected()) {
            Handler handler = this.f25015B;
            handler.sendMessage(handler.obtainMessage(1, anonymousClass1yr));
        }
    }

    /* renamed from: B */
    public final void m14078B(AnonymousClass1ys anonymousClass1ys) {
        AnonymousClass1Ew.I(anonymousClass1ys);
        synchronized (this.f25016C) {
            if (this.f25020G.contains(anonymousClass1ys)) {
                String valueOf = String.valueOf(anonymousClass1ys);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f25020G.add(anonymousClass1ys);
            }
        }
    }

    /* renamed from: C */
    public final void m14079C(ConnectionResult connectionResult) {
        int i = 0;
        AnonymousClass1Ew.C(Looper.myLooper() == this.f25015B.getLooper(), "onConnectionFailure must only be called on the Handler thread");
        this.f25015B.removeMessages(1);
        synchronized (this.f25016C) {
            ArrayList arrayList = new ArrayList(this.f25020G);
            int i2 = this.f25022I.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AnonymousClass1ys anonymousClass1ys = (AnonymousClass1ys) obj;
                if (!this.f25021H) {
                    break;
                } else if (this.f25022I.get() != i2) {
                    break;
                } else if (this.f25020G.contains(anonymousClass1ys)) {
                    anonymousClass1ys.bh(connectionResult);
                }
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            AnonymousClass1yr anonymousClass1yr = (AnonymousClass1yr) message.obj;
            synchronized (this.f25016C) {
                if (this.f25021H && this.f25017D.isConnected() && this.f25018E.contains(anonymousClass1yr)) {
                    anonymousClass1yr.Xh(this.f25017D.UYA());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("GmsClientEvents", stringBuilder.toString(), new Exception());
        return false;
    }
}

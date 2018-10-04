package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.6CX */
public final class AnonymousClass6CX extends AnonymousClass5fi {
    /* renamed from: B */
    private final AnonymousClass5fl f72909B;

    public AnonymousClass6CX(Context context, Looper looper, AnonymousClass1yr anonymousClass1yr, AnonymousClass1ys anonymousClass1ys, String str, AnonymousClass1za anonymousClass1za) {
        super(context, looper, anonymousClass1yr, anonymousClass1ys, str, anonymousClass1za);
        this.f72909B = new AnonymousClass5fl(context, this.f67998B);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void gG() {
        /*
        r13 = this;
        r1 = r13.f72909B;
        monitor-enter(r1);
        r0 = r13.isConnected();	 Catch:{ all -> 0x0094 }
        if (r0 == 0) goto L_0x008f;
    L_0x0009:
        r0 = r13.f72909B;	 Catch:{ Exception -> 0x0087 }
        r4 = r0.f68003B;	 Catch:{ RemoteException -> 0x009d }
        monitor-enter(r4);	 Catch:{ RemoteException -> 0x009d }
        r2 = r0.f68003B;	 Catch:{ all -> 0x009a }
        r2 = r2.values();	 Catch:{ all -> 0x009a }
        r5 = r2.iterator();	 Catch:{ all -> 0x009a }
    L_0x0018:
        r2 = r5.hasNext();	 Catch:{ all -> 0x009a }
        if (r2 == 0) goto L_0x0040;
    L_0x001e:
        r3 = r5.next();	 Catch:{ all -> 0x009a }
        r3 = (com.google.android.gms.internal.zzcdh) r3;	 Catch:{ all -> 0x009a }
        if (r3 == 0) goto L_0x0018;
    L_0x0026:
        r2 = r0.f68004C;	 Catch:{ all -> 0x009a }
        r2 = r2.cYA();	 Catch:{ all -> 0x009a }
        r2 = (com.google.android.gms.internal.zzccz) r2;	 Catch:{ all -> 0x009a }
        r6 = new com.google.android.gms.internal.zzcdp;	 Catch:{ all -> 0x009a }
        r9 = r3.asBinder();	 Catch:{ all -> 0x009a }
        r12 = 0;
        r7 = 2;
        r8 = 0;
        r10 = 0;
        r11 = 0;
        r6.<init>(r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x009a }
        r2.gXA(r6);	 Catch:{ all -> 0x009a }
        goto L_0x0018;
    L_0x0040:
        r2 = r0.f68003B;	 Catch:{ all -> 0x009a }
        r2.clear();	 Catch:{ all -> 0x009a }
        monitor-exit(r4);	 Catch:{ all -> 0x009a }
        r4 = r0.f68006E;	 Catch:{ RemoteException -> 0x009d }
        monitor-enter(r4);	 Catch:{ RemoteException -> 0x009d }
        r2 = r0.f68006E;	 Catch:{ all -> 0x0097 }
        r2 = r2.values();	 Catch:{ all -> 0x0097 }
        r5 = r2.iterator();	 Catch:{ all -> 0x0097 }
    L_0x0053:
        r2 = r5.hasNext();	 Catch:{ all -> 0x0097 }
        if (r2 == 0) goto L_0x007b;
    L_0x0059:
        r3 = r5.next();	 Catch:{ all -> 0x0097 }
        r3 = (com.google.android.gms.internal.zzcde) r3;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0053;
    L_0x0061:
        r2 = r0.f68004C;	 Catch:{ all -> 0x0097 }
        r2 = r2.cYA();	 Catch:{ all -> 0x0097 }
        r2 = (com.google.android.gms.internal.zzccz) r2;	 Catch:{ all -> 0x0097 }
        r6 = new com.google.android.gms.internal.zzcdp;	 Catch:{ all -> 0x0097 }
        r11 = r3.asBinder();	 Catch:{ all -> 0x0097 }
        r12 = 0;
        r7 = 2;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r6.<init>(r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0097 }
        r2.gXA(r6);	 Catch:{ all -> 0x0097 }
        goto L_0x0053;
    L_0x007b:
        r0 = r0.f68006E;	 Catch:{ all -> 0x0097 }
        r0.clear();	 Catch:{ all -> 0x0097 }
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        r0 = r13.f72909B;	 Catch:{ Exception -> 0x0087 }
        r0.m28242A();	 Catch:{ Exception -> 0x0087 }
        goto L_0x008f;
    L_0x0087:
        r3 = move-exception;
        r2 = "LocationClientImpl";
        r0 = "Client disconnected before listeners could be cleaned up";
        android.util.Log.e(r2, r0, r3);	 Catch:{ all -> 0x0094 }
    L_0x008f:
        super.gG();	 Catch:{ all -> 0x0094 }
        monitor-exit(r1);	 Catch:{ all -> 0x0094 }
        return;
    L_0x0094:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0094 }
        throw r0;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
    L_0x0099:
        throw r0;	 Catch:{ RemoteException -> 0x009d }
    L_0x009a:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x009a }
        goto L_0x0099;
    L_0x009d:
        r2 = move-exception;
        r0 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x0087 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0087 }
        throw r0;	 Catch:{ Exception -> 0x0087 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.6CX.gG():void");
    }
}

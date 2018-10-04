package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.0FU */
public final class AnonymousClass0FU {
    /* renamed from: D */
    public static AnonymousClass0FU f2165D;
    /* renamed from: B */
    public File f2166B;
    /* renamed from: C */
    private final HashMap f2167C = new HashMap();

    public AnonymousClass0FU(Context context) {
        this.f2166B = context.getDir("per_event_counter", 0);
    }

    public AnonymousClass0FU(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append("per_event_counter");
        this.f2166B = context.getDir(stringBuilder.toString(), 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static synchronized X.AnonymousClass0NK m1625B(X.AnonymousClass0FU r3, X.AnonymousClass0NN r4, X.AnonymousClass0dd r5) {
        /*
        monitor-enter(r3);
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0046 }
        r2.<init>();	 Catch:{ all -> 0x0046 }
        r0 = r3.f2166B;	 Catch:{ all -> 0x0046 }
        r0 = r0.getName();	 Catch:{ all -> 0x0046 }
        r2.append(r0);	 Catch:{ all -> 0x0046 }
        r1 = "_";
        r2.append(r1);	 Catch:{ all -> 0x0046 }
        r0 = r4.f3556F;	 Catch:{ all -> 0x0046 }
        r2.append(r0);	 Catch:{ all -> 0x0046 }
        r2.append(r1);	 Catch:{ all -> 0x0046 }
        r0 = r5.toString();	 Catch:{ all -> 0x0046 }
        r2.append(r0);	 Catch:{ all -> 0x0046 }
        r2 = r2.toString();	 Catch:{ all -> 0x0046 }
        r0 = r3.f2167C;	 Catch:{ all -> 0x0046 }
        r1 = r0.get(r2);	 Catch:{ all -> 0x0046 }
        r1 = (X.AnonymousClass0NK) r1;	 Catch:{ all -> 0x0046 }
        if (r1 != 0) goto L_0x0044;
    L_0x0031:
        r0 = X.AnonymousClass0FU.m1627D(r3, r2);	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x003a;
    L_0x0037:
        r0 = 0;
        monitor-exit(r3);
        return r0;
    L_0x003a:
        r1 = new X.0NK;	 Catch:{ all -> 0x0046 }
        r1.<init>(r0);	 Catch:{ all -> 0x0046 }
        r0 = r3.f2167C;	 Catch:{ all -> 0x0046 }
        r0.put(r2, r1);	 Catch:{ all -> 0x0046 }
    L_0x0044:
        monitor-exit(r3);
        return r1;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0FU.B(X.0FU, X.0NN, X.0dd):X.0NK");
    }

    /* renamed from: C */
    public static synchronized AnonymousClass0FU m1626C() {
        AnonymousClass0FU anonymousClass0FU;
        synchronized (AnonymousClass0FU.class) {
            anonymousClass0FU = f2165D;
        }
        return anonymousClass0FU;
    }

    /* renamed from: D */
    private static File m1627D(AnonymousClass0FU anonymousClass0FU, String str) {
        File file = new File(anonymousClass0FU.f2166B, str);
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not create event ");
        stringBuilder.append(str);
        stringBuilder.append(" counter directory");
        AnonymousClass0Gn.m1876C("PerEventAnalyticsEventCounter", stringBuilder.toString());
        return null;
    }
}

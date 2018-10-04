package X;

import com.facebook.proxygen.ReadBuffer;
import java.io.InputStream;

/* renamed from: X.0gz */
public final class AnonymousClass0gz extends InputStream {
    /* renamed from: B */
    public boolean f8321B;
    /* renamed from: C */
    public AnonymousClass240 f8322C;
    /* renamed from: D */
    private final ReadBuffer f8323D;

    public final boolean markSupported() {
        return false;
    }

    public AnonymousClass0gz(ReadBuffer readBuffer) {
        this.f8323D = readBuffer;
    }

    public final synchronized int available() {
        return this.f8323D.size();
    }

    public final synchronized void close() {
        if (!this.f8321B) {
            this.f8323D.close();
            this.f8321B = true;
        }
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final synchronized int read() {
        int i;
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        i = -1;
        if (read != -1) {
            if (read == 1) {
                i = bArr[0];
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Liger ReadBufferInputStream n=");
                stringBuilder.append(read);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return i;
    }

    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] r3, int r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f8321B;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x002c;	 Catch:{ all -> 0x0029 }
    L_0x0005:
        r0 = r2.f8322C;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0026;	 Catch:{ all -> 0x0029 }
    L_0x0009:
        r0 = r2.f8323D;	 Catch:{ all -> 0x0029 }
        r0 = r0.read(r3, r4, r5);	 Catch:{ all -> 0x0029 }
    L_0x000f:
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0029 }
    L_0x0011:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0029 }
        r2.wait(r0);	 Catch:{ InterruptedException -> 0x0016 }
    L_0x0016:
        r0 = r2.f8322C;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0021;	 Catch:{ all -> 0x0029 }
    L_0x001a:
        r0 = r2.f8323D;	 Catch:{ all -> 0x0029 }
        r0 = r0.read(r3, r4, r5);	 Catch:{ all -> 0x0029 }
        goto L_0x000f;	 Catch:{ all -> 0x0029 }
    L_0x0021:
        r0 = r2.f8322C;	 Catch:{ all -> 0x0029 }
        throw r0;	 Catch:{ all -> 0x0029 }
    L_0x0024:
        monitor-exit(r2);
        return r0;
    L_0x0026:
        r0 = r2.f8322C;	 Catch:{ all -> 0x0029 }
        throw r0;	 Catch:{ all -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x002c:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0029 }
        r0 = "Buffer is Closed";	 Catch:{ all -> 0x0029 }
        r1.<init>(r0);	 Catch:{ all -> 0x0029 }
        throw r1;	 Catch:{ all -> 0x0029 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0gz.read(byte[], int, int):int");
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        throw new UnsupportedOperationException();
    }
}

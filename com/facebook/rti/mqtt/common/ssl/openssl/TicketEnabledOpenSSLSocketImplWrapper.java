package com.facebook.rti.mqtt.common.ssl.openssl;

import java.lang.reflect.Method;
import java.net.Socket;
import org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImplWrapper;
import org.apache.harmony.xnet.provider.jsse.SSLParametersImpl;

public class TicketEnabledOpenSSLSocketImplWrapper extends OpenSSLSocketImplWrapper {
    /* renamed from: C */
    private static Method f433C;
    /* renamed from: D */
    private static boolean f434D = true;
    /* renamed from: E */
    private static Method f435E;
    /* renamed from: F */
    private static boolean f436F = true;
    /* renamed from: B */
    private Socket f437B;

    public final boolean isConnected() {
        return true;
    }

    static {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = java.net.Socket.class;	 Catch:{ Throwable -> 0x002a }
        r2 = "setSoSndTimeout";	 Catch:{ Throwable -> 0x002a }
        r4 = 1;	 Catch:{ Throwable -> 0x002a }
        r1 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x002a }
        r0 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x002a }
        r3 = 0;	 Catch:{ Throwable -> 0x002a }
        r1[r3] = r0;	 Catch:{ Throwable -> 0x002a }
        r0 = r5.getDeclaredMethod(r2, r1);	 Catch:{ Throwable -> 0x002a }
        f435E = r0;	 Catch:{ Throwable -> 0x002a }
        r0 = f435E;	 Catch:{ Throwable -> 0x002a }
        r0.setAccessible(r4);	 Catch:{ Throwable -> 0x002a }
        f436F = r4;	 Catch:{ Throwable -> 0x002a }
        r1 = "getSoSNDTimeout";	 Catch:{ Throwable -> 0x002a }
        r0 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x002a }
        r0 = r5.getDeclaredMethod(r1, r0);	 Catch:{ Throwable -> 0x002a }
        f433C = r0;	 Catch:{ Throwable -> 0x002a }
        r0 = f433C;	 Catch:{ Throwable -> 0x002a }
        r0.setAccessible(r4);	 Catch:{ Throwable -> 0x002a }
        f434D = r4;	 Catch:{ Throwable -> 0x002a }
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.common.ssl.openssl.TicketEnabledOpenSSLSocketImplWrapper.<clinit>():void");
    }

    public TicketEnabledOpenSSLSocketImplWrapper(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i, z, sSLParametersImpl);
        this.f437B = socket;
    }

    public int getSoSNDTimeout() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = f434D;
        if (r0 == 0) goto L_0x0016;
    L_0x0004:
        r2 = f433C;	 Catch:{ Throwable -> 0x0016 }
        r1 = r3.f437B;	 Catch:{ Throwable -> 0x0016 }
        r0 = 0;	 Catch:{ Throwable -> 0x0016 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x0016 }
        r0 = r2.invoke(r1, r0);	 Catch:{ Throwable -> 0x0016 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Throwable -> 0x0016 }
        r0 = r0.intValue();	 Catch:{ Throwable -> 0x0016 }
        return r0;	 Catch:{ Throwable -> 0x0016 }
    L_0x0016:
        r0 = r3.f437B;
        r0 = r0.getSoTimeout();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.common.ssl.openssl.TicketEnabledOpenSSLSocketImplWrapper.getSoSNDTimeout():int");
    }

    public void setSoSndTimeout(int i) {
        Throwable th;
        if (f436F) {
            try {
                f435E.invoke(this.f437B, new Object[]{Integer.valueOf(i)});
            } catch (Throwable th2) {
                th = th2;
            }
        }
        th = null;
        if (th != null || !f436F) {
            this.f437B.setSoTimeout(i);
        }
    }

    public final void setSoTimeout(int i) {
        this.f437B.setSoTimeout(i);
    }
}

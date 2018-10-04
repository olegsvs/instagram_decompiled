package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* renamed from: X.06v */
public final class AnonymousClass06v extends SocketImpl {
    /* renamed from: D */
    private static Constructor f438D;
    /* renamed from: E */
    public static boolean f439E = true;
    /* renamed from: B */
    private InetAddress f440B;
    /* renamed from: C */
    private int f441C;

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
        r3 = java.net.Inet4Address.class;	 Catch:{ Throwable -> 0x001c }
        r0 = 2;	 Catch:{ Throwable -> 0x001c }
        r2 = new java.lang.Class[r0];	 Catch:{ Throwable -> 0x001c }
        r1 = 0;	 Catch:{ Throwable -> 0x001c }
        r0 = byte[].class;	 Catch:{ Throwable -> 0x001c }
        r2[r1] = r0;	 Catch:{ Throwable -> 0x001c }
        r0 = java.lang.String.class;	 Catch:{ Throwable -> 0x001c }
        r1 = 1;	 Catch:{ Throwable -> 0x001c }
        r2[r1] = r0;	 Catch:{ Throwable -> 0x001c }
        r0 = r3.getDeclaredConstructor(r2);	 Catch:{ Throwable -> 0x001c }
        f438D = r0;	 Catch:{ Throwable -> 0x001c }
        r0 = f438D;	 Catch:{ Throwable -> 0x001c }
        r0.setAccessible(r1);	 Catch:{ Throwable -> 0x001c }
        f439E = r1;	 Catch:{ Throwable -> 0x001c }
    L_0x001c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.06v.<clinit>():void");
    }

    public AnonymousClass06v(byte[] bArr, String str, int i) {
        Constructor constructor = f438D;
        if (constructor != null) {
            try {
                this.f440B = (InetAddress) constructor.newInstance(new Object[]{bArr, str});
                this.f441C = i;
                return;
            } catch (Exception e) {
                throw new AnonymousClass06t(e);
            } catch (Exception e2) {
                throw new AnonymousClass06t(e2);
            } catch (Exception e22) {
                throw new AnonymousClass06t(e22);
            }
        }
        throw new AnonymousClass06t("getDeclaredConstructor failed");
    }

    public final void accept(SocketImpl socketImpl) {
        throw new IllegalStateException("calling accept() on FakeSocketImpl");
    }

    public final int available() {
        throw new IllegalStateException("calling available() on FakeSocketImpl");
    }

    public final void bind(InetAddress inetAddress, int i) {
        throw new IllegalStateException("calling bind(InetAddress, int) on FakeSocketImpl");
    }

    public final void close() {
        throw new IllegalStateException("calling close() on FakeSocketImpl");
    }

    public final void connect(String str, int i) {
        throw new IllegalStateException("calling connect(String, int) on FakeSocketImpl");
    }

    public final void connect(InetAddress inetAddress, int i) {
        throw new IllegalStateException("calling connect(InetAddress, int) on FakeSocketImpl");
    }

    public final void connect(SocketAddress socketAddress, int i) {
        throw new IllegalStateException("calling connect(SocketAddress, int) on FakeSocketImpl");
    }

    public final void create(boolean z) {
        throw new IllegalStateException("calling create() on FakeSocketImpl");
    }

    public final InetAddress getInetAddress() {
        return this.f440B;
    }

    public final InputStream getInputStream() {
        throw new IllegalStateException("calling getInputStream() on FakeSocketImpl");
    }

    public final Object getOption(int i) {
        throw new IllegalStateException("calling getOption(int) on FakeSocketImpl");
    }

    public final OutputStream getOutputStream() {
        throw new IllegalStateException("calling getOutputStream() on FakeSocketImpl");
    }

    public final int getPort() {
        return this.f441C;
    }

    public final void listen(int i) {
        throw new IllegalStateException("calling listen(int) on FakeSocketImpl");
    }

    public final void sendUrgentData(int i) {
        throw new IllegalStateException("calling sendUrgentData(int) on FakeSocketImpl");
    }

    public final void setOption(int i, Object obj) {
        throw new IllegalStateException("calling setOption(int, Object) on FakeSocketImpl");
    }
}

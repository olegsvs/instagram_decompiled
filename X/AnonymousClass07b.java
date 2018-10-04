package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.07b */
public final class AnonymousClass07b {
    /* renamed from: B */
    public final InetAddress f571B;
    /* renamed from: C */
    public final int f572C;
    /* renamed from: D */
    public final InetAddress f573D;
    /* renamed from: E */
    public final ScheduledExecutorService f574E;
    /* renamed from: F */
    public Socket f575F;
    /* renamed from: G */
    public final AnonymousClass06o f576G;
    /* renamed from: H */
    private final int f577H;
    /* renamed from: I */
    private final int f578I;

    public AnonymousClass07b(InetAddress inetAddress, InetAddress inetAddress2, int i, int i2, AnonymousClass06o anonymousClass06o, ScheduledExecutorService scheduledExecutorService, int i3) {
        this.f576G = anonymousClass06o;
        this.f573D = inetAddress;
        this.f571B = inetAddress2;
        this.f577H = i;
        this.f578I = i2;
        this.f574E = scheduledExecutorService;
        this.f572C = i3;
    }

    /* renamed from: B */
    public static void m447B(AnonymousClass07b anonymousClass07b, Socket socket, InetAddress inetAddress, Socket socket2) {
        AnonymousClass07r.m472C(socket);
        socket.connect(new InetSocketAddress(inetAddress, anonymousClass07b.f577H), anonymousClass07b.f578I);
        synchronized (anonymousClass07b) {
            if (anonymousClass07b.f575F == null) {
                anonymousClass07b.f575F = socket;
                AnonymousClass07r.m471B(socket2);
            }
        }
    }
}

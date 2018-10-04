package X;

import com.facebook.rti.mqtt.common.ssl.openssl.TicketEnabledOpenSSLSocketImplWrapper;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* renamed from: X.0AV */
public final class AnonymousClass0AV extends AnonymousClass06o {
    /* renamed from: B */
    private final AnonymousClass06r f1254B;

    public AnonymousClass0AV(ExecutorService executorService, AnonymousClass06r anonymousClass06r) {
        super(executorService);
        this.f1254B = anonymousClass06r;
    }

    /* renamed from: B */
    public final Socket mo98B(Socket socket, String str, int i) {
        Socket socket2 = socket;
        AnonymousClass1DG.m10046B(socket.isConnected());
        AnonymousClass06r anonymousClass06r = this.f1254B;
        TicketEnabledOpenSSLSocketImplWrapper ticketEnabledOpenSSLSocketImplWrapper = new TicketEnabledOpenSSLSocketImplWrapper(socket2, str, i, true, anonymousClass06r.f431B);
        try {
            ticketEnabledOpenSSLSocketImplWrapper.setHostname(str);
            ticketEnabledOpenSSLSocketImplWrapper.setUseSessionTickets(true);
            ticketEnabledOpenSSLSocketImplWrapper.setHandshakeTimeout(socket2.getSoTimeout());
            AnonymousClass06y.m422B(ticketEnabledOpenSSLSocketImplWrapper, socket2.getInetAddress().getAddress(), str, i);
            anonymousClass06r.f432C.m424A(ticketEnabledOpenSSLSocketImplWrapper, str);
            return ticketEnabledOpenSSLSocketImplWrapper;
        } catch (Throwable e) {
            throw new IOException(e);
        }
    }
}

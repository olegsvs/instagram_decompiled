package X;

import com.instagram.realtimeclient.RealtimeConstants;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.06z */
public final class AnonymousClass06z {
    /* renamed from: B */
    private final HostnameVerifier f449B;

    public AnonymousClass06z(HostnameVerifier hostnameVerifier) {
        this.f449B = hostnameVerifier;
    }

    /* renamed from: A */
    public final void m424A(SSLSocket sSLSocket, String str) {
        sSLSocket.getInputStream();
        SSLSession session = sSLSocket.getSession();
        if (session != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                Object[] objArr = new Object[7];
                objArr[0] = sSLSocket.isClosed() ? "closed" : "open";
                objArr[1] = sSLSocket.isConnected() ? RealtimeConstants.MQTT_CONNECTED : RealtimeConstants.MQTT_DISCONNECTED;
                objArr[2] = sSLSocket.isBound() ? "bound" : "unbound";
                objArr[3] = sSLSocket.isInputShutdown() ? "input_shutdown" : "input_open";
                objArr[4] = sSLSocket.isOutputShutdown() ? "output_shutdown" : "output_open";
                objArr[5] = str;
                objArr[6] = String.valueOf(sSLSocket.getInetAddress());
                throw new SSLException(AnonymousClass1Cn.m9922B("SSL handshake returned an invalid session. Socket state (%s, %s, %s, %s, %s, %s, %s)", objArr));
            } else if (!this.f449B.verify(str, session)) {
                throw new SSLException(AnonymousClass1Cn.m9922B("could not verify hostname for (%s, %s). (%s)", str, sSLSocket.getInetAddress().toString(), AnonymousClass06z.m423B(session)));
            } else {
                return;
            }
        }
        throw new SSLException("SSL Session is null");
    }

    /* renamed from: B */
    private static String m423B(SSLSession sSLSession) {
        try {
            sSLSession = sSLSession.getPeerCertificates();
            if (sSLSession == null || sSLSession.length <= 0) {
                return "No certificates";
            }
            return AnonymousClass1Cn.m9922B("num: %d, %s", Integer.valueOf(sSLSession.length), sSLSession[0].toString());
        } catch (SSLException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception getting certificates ");
            stringBuilder.append(e.toString());
            return stringBuilder.toString();
        }
    }
}

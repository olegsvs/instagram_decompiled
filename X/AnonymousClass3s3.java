package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.http.client.ResponseHandler;

/* renamed from: X.3s3 */
public final class AnonymousClass3s3 {
    /* renamed from: A */
    public final void m21012A(String str, String str2, String str3, String[] strArr, String[] strArr2, ResponseHandler responseHandler, AnonymousClass1Fs anonymousClass1Fs) {
        AnonymousClass0gK anonymousClass0gK = null;
        AnonymousClass0aB anonymousClass0aB = new AnonymousClass0aB(null);
        URI create = URI.create(str);
        if (!"https".equals(create.getScheme())) {
            throw new IllegalArgumentException("Protocol not supported");
        } else if (AnonymousClass2k0.f33146C.contains(Integer.valueOf(create.getPort()))) {
            throw new IllegalArgumentException("Port not supported");
        } else {
            AnonymousClass0Pu anonymousClass0Pu;
            StringBuilder stringBuilder;
            String toUpperCase = str2.toUpperCase(Locale.US);
            Object obj = -1;
            int hashCode = toUpperCase.hashCode();
            int i = 0;
            if (hashCode != 70454) {
                if (hashCode == 2461856) {
                    if (toUpperCase.equals(ReactWebViewManager.HTTP_METHOD_POST)) {
                        obj = 1;
                    }
                }
            } else if (toUpperCase.equals("GET")) {
                obj = null;
            }
            switch (obj) {
                case null:
                    anonymousClass0Pu = AnonymousClass0Pu.GET;
                    break;
                case 1:
                    anonymousClass0Pu = AnonymousClass0Pu.f4247G;
                    if (!(str3 == null || str3.isEmpty())) {
                        anonymousClass0gK = new AnonymousClass23w(str3.getBytes(Charset.forName("UTF-8")));
                        break;
                    }
                default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Method '");
                    stringBuilder.append(str2);
                    stringBuilder.append("' is not supported");
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            anonymousClass0aB.f6466F = str;
            anonymousClass0aB.f6464D = anonymousClass0Pu;
            if (anonymousClass0gK != null) {
                anonymousClass0aB.f6462B = anonymousClass0gK;
            }
            while (i < strArr.length) {
                if (AnonymousClass2k0.f33145B.contains(strArr[i])) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Header '");
                    stringBuilder.append(strArr[i]);
                    stringBuilder.append("' is not supported");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                anonymousClass0aB.A(strArr[i], strArr2[i]);
                i++;
            }
            AnonymousClass0Ix.D(new AnonymousClass0Iu(AnonymousClass0Xx.B(new AnonymousClass2jz(anonymousClass0aB)).C(AnonymousClass0gO.f8154B).D(new AnonymousClass2jy())));
        }
    }
}

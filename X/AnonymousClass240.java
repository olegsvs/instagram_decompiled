package X;

import com.facebook.proxygen.HTTPRequestError;
import java.io.IOException;

/* renamed from: X.240 */
public final class AnonymousClass240 extends IOException {
    /* renamed from: B */
    public final HTTPRequestError f25553B;

    public AnonymousClass240(HTTPRequestError hTTPRequestError) {
        super(hTTPRequestError.getErrMsg());
        this.f25553B = hTTPRequestError;
    }
}

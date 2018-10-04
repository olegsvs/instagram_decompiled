package X;

import com.facebook.phonenumbers.PhoneNumberUtil;
import java.io.InputStream;

/* renamed from: X.2Rt */
public final class AnonymousClass2Rt implements AnonymousClass1w3 {
    public final InputStream NZ(String str) {
        return PhoneNumberUtil.class.getResourceAsStream(str);
    }
}

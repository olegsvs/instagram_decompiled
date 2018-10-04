package X;

import com.facebook.phonenumbers.PhoneNumberUtil;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.2Rx */
public final class AnonymousClass2Rx implements AnonymousClass1wF {
    public final char xH(char c, char c2) {
        char xH = PhoneNumberUtil.f24399J.xH(c, '?');
        if (xH != '?') {
            return xH;
        }
        switch (c) {
            case ParserMinimalBase.INT_ASTERISK /*42*/:
                return '*';
            case '+':
                return '+';
            default:
                return c2;
        }
    }
}

package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.0nu */
public final class AnonymousClass0nu extends IOException {
    /* renamed from: B */
    public final String f10147B;

    public AnonymousClass0nu(String str, AnonymousClass0aG anonymousClass0aG, String str2) {
        super(StringFormatUtil.formatStrLocaleSafe("Expected 'Content-Type: %s' but got '%s'", str, anonymousClass0aG));
        this.f10147B = str2;
    }
}

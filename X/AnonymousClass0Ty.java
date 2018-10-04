package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

/* renamed from: X.0Ty */
public final class AnonymousClass0Ty extends AnonymousClass0Tz {
    /* renamed from: C */
    public static final AnonymousClass0Oc f5317C = new AnonymousClass0XU();
    /* renamed from: B */
    public String f5318B;

    /* renamed from: A */
    public final String mo1287A() {
        return "send_text_message";
    }

    public AnonymousClass0Ty(DirectThreadKey directThreadKey, String str, Long l, long j) {
        super(Collections.singletonList(directThreadKey), l, j);
        this.f5318B = str;
    }

    public AnonymousClass0Ty(DirectThreadKey directThreadKey, String str, String str2, Long l, long j) {
        super(Collections.singletonList(directThreadKey), l, j);
        this.f5319B = str;
        this.f5318B = str2;
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ Object mo1288E() {
        return this.f5318B;
    }

    /* renamed from: F */
    public final AnonymousClass0V0 mo1289F() {
        return AnonymousClass0V0.TEXT;
    }
}

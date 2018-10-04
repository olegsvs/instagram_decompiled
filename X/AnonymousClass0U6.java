package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

/* renamed from: X.0U6 */
public final class AnonymousClass0U6 extends AnonymousClass0Tz {
    /* renamed from: B */
    public static final AnonymousClass0Oc f5358B = new AnonymousClass0YA();
    /* renamed from: C */
    private static final AnonymousClass0YB f5359C = new AnonymousClass0YB();

    /* renamed from: A */
    public final String mo1287A() {
        return "send_like_message";
    }

    public AnonymousClass0U6(DirectThreadKey directThreadKey, Long l, long j) {
        super(Collections.singletonList(directThreadKey), l, j);
    }

    public AnonymousClass0U6(DirectThreadKey directThreadKey, String str, Long l, long j) {
        super(Collections.singletonList(directThreadKey), l, j);
        this.f5319B = str;
    }

    /* renamed from: E */
    public final Object mo1288E() {
        return f5359C;
    }

    /* renamed from: F */
    public final AnonymousClass0V0 mo1289F() {
        return AnonymousClass0V0.LIKE;
    }
}

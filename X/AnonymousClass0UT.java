package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.UUID;

/* renamed from: X.0UT */
public final class AnonymousClass0UT extends AnonymousClass0U0 {
    /* renamed from: F */
    public static final AnonymousClass0Oc f5449F = new AnonymousClass0ZB();
    /* renamed from: B */
    public String f5450B;
    /* renamed from: C */
    public String f5451C;
    /* renamed from: D */
    public int f5452D;
    /* renamed from: E */
    public DirectThreadKey f5453E;

    /* renamed from: A */
    public final String mo1287A() {
        return "send_poll_vote";
    }

    /* renamed from: B */
    public final boolean mo1290B() {
        return false;
    }

    public AnonymousClass0UT(DirectThreadKey directThreadKey, String str, int i) {
        this.f5453E = directThreadKey;
        this.f5451C = str;
        this.f5452D = i;
        this.f5450B = UUID.randomUUID().toString();
    }
}

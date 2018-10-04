package X;

/* renamed from: X.0x8 */
public enum AnonymousClass0x8 {
    SAVED("save"),
    NOT_SAVED("unsave");
    
    /* renamed from: B */
    public String f12478B;

    private AnonymousClass0x8(String str) {
        this.f12478B = str;
    }

    /* renamed from: A */
    public final boolean m8495A() {
        return this == SAVED;
    }

    /* renamed from: B */
    public static AnonymousClass0x8 m8494B(boolean z) {
        return z ? SAVED : NOT_SAVED;
    }

    public final String toString() {
        return this.f12478B;
    }
}

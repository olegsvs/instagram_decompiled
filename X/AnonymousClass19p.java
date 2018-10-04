package X;

/* renamed from: X.19p */
public enum AnonymousClass19p {
    NotFollowing("not_following"),
    Following("following"),
    Unknown("unknown");
    
    /* renamed from: B */
    private final String f15186B;

    private AnonymousClass19p(String str) {
        this.f15186B = str;
    }

    /* renamed from: B */
    public static AnonymousClass19p m9701B(int i) {
        switch (i) {
            case 0:
                return NotFollowing;
            case 1:
                return Following;
            default:
                return Unknown;
        }
    }

    public final String toString() {
        return this.f15186B;
    }
}

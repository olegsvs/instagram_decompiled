package X;

/* renamed from: X.5NW */
public enum AnonymousClass5NW {
    Normal("normal", 0),
    Nux("nux", 1),
    SingleUserJoined("single_user_joined", 2),
    MultipleUsersJoined("multiple_users_joined", 3),
    SendJoinRequest("r2j_prompt", 4),
    SentJoinRequest("r2j_pending", 5),
    ViewJoinRequest("guest_r2j", 6),
    TypingIndicator("typing_indicator", 7);
    
    /* renamed from: B */
    private final String f62771B;
    /* renamed from: C */
    private final int f62772C;

    private AnonymousClass5NW(String str, int i) {
        this.f62771B = str;
        this.f62772C = i;
    }

    /* renamed from: A */
    public final String m26368A() {
        return this.f62771B;
    }

    /* renamed from: B */
    public final int m26369B() {
        return this.f62772C;
    }
}

package X;

/* renamed from: X.19F */
public enum AnonymousClass19F {
    NOT_STARTED("start time in future."),
    ALREADY_ENDED("past end time."),
    TTL_EXPIRED("TTL expired."),
    TIMING_RULE_INCOMPLETE("Timing rule is incomplete. (Empty TTL or missing start/end timestamp.)"),
    CONTENT_NOT_QUALIFIED("The creative does not exist or the content is not qualified to show."),
    TRIGGER_NOT_QUALIFIED("The QP trigger is not supported by this surface.");
    
    /* renamed from: B */
    private final String f15113B;

    private AnonymousClass19F(String str) {
        this.f15113B = str;
    }

    /* renamed from: A */
    public final String m9660A() {
        return this.f15113B;
    }
}

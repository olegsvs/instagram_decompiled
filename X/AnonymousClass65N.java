package X;

/* renamed from: X.65N */
public enum AnonymousClass65N {
    UNANSWERED("unanswered"),
    ANSWERED("answered"),
    SKIPPED("skipped"),
    DESELECTED("deselected");
    
    /* renamed from: B */
    private final String f71596B;

    private AnonymousClass65N(String str) {
        this.f71596B = str;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("QuestionState: ");
        stringBuilder.append(this.f71596B);
        return stringBuilder.toString();
    }
}

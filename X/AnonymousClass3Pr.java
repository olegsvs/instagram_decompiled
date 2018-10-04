package X;

/* renamed from: X.3Pr */
public enum AnonymousClass3Pr {
    SUBHEADING("subheading"),
    PARAGRAPH("paragraph"),
    BOLD_PARAGRAPH("bold_paragraph"),
    BULLETPOINT("bulletpoint"),
    BULLETPOINT_CHECKMARK("bulletpoint_checkmark"),
    BULLETPOINT_CROSS("bulletpoint_cross"),
    NONE("none");
    
    /* renamed from: B */
    private String f40994B;

    private AnonymousClass3Pr(String str) {
        this.f40994B = str;
    }

    /* renamed from: A */
    public final String m19570A() {
        return this.f40994B;
    }

    /* renamed from: B */
    public static AnonymousClass3Pr m19569B(String str) {
        for (AnonymousClass3Pr anonymousClass3Pr : AnonymousClass3Pr.values()) {
            if (anonymousClass3Pr.m19570A().equals(str)) {
                return anonymousClass3Pr;
            }
        }
        return NONE;
    }
}

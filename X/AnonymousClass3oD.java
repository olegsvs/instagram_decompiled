package X;

/* renamed from: X.3oD */
public enum AnonymousClass3oD {
    IG_REPORT_ACTION_OPEN_USER_DIALOG("open_user_dialog", true),
    IG_REPORT_ACTION_OPEN_MEDIA_DIALOG("open_media_dialog", true),
    IG_REPORT_ACTION_OPEN_DIRECT_MENU("open_direct_menu", true),
    IG_REPORT_ACTION_OPEN_BROADCAST_DIALOG("open_broadcast_dialog", true),
    IG_REPORT_ACTION_OPEN_PRODUCT_DIALOG("open_product_dialog", true),
    IG_REPORT_ACTION_OPEN_REPORT_COMMENT_DIALOG("open_report_comment_dialog", true),
    IG_REPORT_ACTION_OPEN_LIVE_COMMENT_DIALOG("open_live_comment_dialog", true),
    IG_REPORT_ACTION_REPORT_DIRECT_CONVERSATION_WEBVIEW("open_report_direct_conversation_webview", true),
    IG_REPORT_ACTION_OPEN_REPORT_LIVE_COMMENT_DIALOG("open_report_live_comment_dialog", false),
    IG_REPORT_ACTION_OPRN_REPORT_DIALOG("open_report_dialog", false),
    IG_REPORT_ACTION_REPORT_IN_WEBVIEW("report_in_webview", false),
    IG_REPORT_ACTION_REPORT_AS_SPAM("report_as_spam", false),
    IG_REPORT_ACTION_DONE_REPORT_IN_WEBVIEW("done_report_in_webview", false);
    
    /* renamed from: B */
    private final String f44725B;
    /* renamed from: C */
    private final boolean f44726C;

    private AnonymousClass3oD(String str, boolean z) {
        this.f44725B = str;
        this.f44726C = z;
    }

    /* renamed from: A */
    public final String m20725A() {
        return this.f44725B;
    }

    /* renamed from: B */
    public final boolean m20726B() {
        return this.f44726C;
    }
}

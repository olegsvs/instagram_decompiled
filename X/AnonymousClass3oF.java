package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3oF */
public enum AnonymousClass3oF {
    USER_ID("ig_userid"),
    TARGET_USER_ID("target_user_id"),
    MEDIA_ID("media_id"),
    MEDIA_TYPE("media_type"),
    THREAD_ID("thread_id"),
    MESSAGE_ID("message_id"),
    COMMENT_ID("comment_id"),
    BROADCAST_ID(TraceFieldType.BroadcastId),
    PRODUCT_ID("product_id"),
    LIVE_COMMENT_ID("live_comment_id"),
    REPORT_FLOW_ID("report_flow_id"),
    EVENT_TYPE("event_type"),
    REPORT_TYPE("report_type");
    
    /* renamed from: B */
    private final String f44751B;

    private AnonymousClass3oF(String str) {
        this.f44751B = str;
    }

    /* renamed from: A */
    public final String m20728A() {
        return this.f44751B;
    }
}

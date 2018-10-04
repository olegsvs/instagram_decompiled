package X;

import com.facebook.C0164R;

/* renamed from: X.1i0 */
public enum AnonymousClass1i0 {
    RAVEN_SENT(C0164R.string.direct_story_action_log_sent, C0164R.drawable.direct_visual_message_sent, true),
    RAVEN_CANNOT_DELIVER(C0164R.string.direct_story_action_log_cannot_deliver, 0, false),
    RAVEN_SENDING(0, 0, false),
    RAVEN_BLOCKED(C0164R.string.direct_story_action_log_blocked, 0, false),
    RAVEN_UNKNOWN(0, 0, false),
    RAVEN_SUGGESTED(C0164R.string.direct_story_action_suggested, 0, false),
    RAVEN_DELIVERED(C0164R.string.direct_story_action_log_delivered, C0164R.drawable.direct_visual_message_sent, true),
    RAVEN_OPENED(C0164R.string.direct_story_action_log_opened, C0164R.drawable.direct_visual_message_opened, false),
    RAVEN_SCREENSHOT(C0164R.string.direct_story_action_log_screenshot, C0164R.drawable.screenshot_icon, false),
    RAVEN_REPLAYED(C0164R.string.direct_story_action_log_replayed, C0164R.drawable.direct_visual_message_replayed, false);
    
    /* renamed from: B */
    private final boolean f21579B;
    /* renamed from: C */
    private final int f21580C;
    /* renamed from: D */
    private final int f21581D;

    private AnonymousClass1i0(int i, int i2, boolean z) {
        this.f21581D = i;
        this.f21580C = i2;
        this.f21579B = z;
    }

    /* renamed from: A */
    public final int m12643A() {
        return this.f21580C;
    }

    /* renamed from: B */
    public final int m12644B() {
        return this.f21581D;
    }

    /* renamed from: C */
    public final boolean m12645C() {
        return this.f21579B;
    }
}

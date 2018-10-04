package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.18R */
public final class AnonymousClass18R {
    /* renamed from: B */
    public final boolean f14965B;
    /* renamed from: C */
    public final boolean f14966C;
    /* renamed from: D */
    public final boolean f14967D;
    /* renamed from: E */
    public final Long f14968E;
    /* renamed from: F */
    public final String f14969F;
    /* renamed from: G */
    public final Long f14970G;
    /* renamed from: H */
    public final String f14971H;
    /* renamed from: I */
    public final String f14972I;

    public AnonymousClass18R(String str, boolean z, boolean z2, boolean z3, String str2, String str3, Long l, Long l2) {
        this.f14972I = str;
        this.f14965B = z;
        this.f14966C = z2;
        this.f14967D = z3;
        this.f14969F = str2;
        this.f14971H = str3;
        this.f14970G = l;
        this.f14968E = l2;
    }

    /* renamed from: B */
    private static String m9607B(Long l) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.US).format(new Date(Long.valueOf(l.longValue() / 1000).longValue()));
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("thread_id: (");
        stringBuilder.append(this.f14972I);
        stringBuilder.append(") ");
        stringBuilder.append(this.f14967D ? "is_marked_as_unread" : "is_not_marked_as_unread");
        stringBuilder.append("; ");
        stringBuilder.append(this.f14965B ? "unseen_permanent" : "seen_permanent");
        stringBuilder.append("; ");
        stringBuilder.append(this.f14966C ? "unseen_visual" : "seen_visual");
        stringBuilder.append(" | last_received_permanent_message type: (");
        stringBuilder.append(this.f14971H);
        stringBuilder.append(") message_id: (");
        stringBuilder.append(this.f14969F);
        stringBuilder.append(") message_timestamp_us: (");
        Long l = this.f14970G;
        if (l == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        } else {
            str = AnonymousClass18R.m9607B(l);
        }
        stringBuilder.append(str);
        stringBuilder.append(") last_activity_timestamp_us: (");
        l = this.f14968E;
        if (l == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        } else {
            str = AnonymousClass18R.m9607B(l);
        }
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

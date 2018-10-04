package X;

import android.util.SparseArray;
import com.fasterxml.jackson.core.JsonParser;

/* renamed from: X.1Or */
public enum AnonymousClass1Or {
    USER_SINGLE_MEDIA(1),
    ENTITY_MULTI_MEDIA(2),
    USER_FOLLOW(3),
    USER_SIMPLE(4),
    GROUPED_FRIEND_REQUEST(6),
    DIRECT_SHARE(9),
    COPYRIGHT_VIDEO_REMOVED(10),
    COPYRIGHT_VIDEO_REINSTATED(11),
    CAMPAIGN_MESSAGE(13),
    USER_COMMENT_LIKED_SINGLE_MEDIA(14),
    INSIGHTS_ENTRY(15),
    CANVAS_PREVIEW(16),
    USER_REEL(17);
    
    /* renamed from: Q */
    private static final SparseArray f18040Q = null;
    /* renamed from: B */
    public int f18041B;

    static {
        f18040Q = new SparseArray();
        AnonymousClass1Or[] values = AnonymousClass1Or.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass1Or anonymousClass1Or = values[i];
            f18040Q.put(anonymousClass1Or.f18041B, anonymousClass1Or);
            i++;
        }
    }

    private AnonymousClass1Or(int i) {
        this.f18041B = i;
    }

    public static AnonymousClass1Or parseFromJson(JsonParser jsonParser) {
        return (AnonymousClass1Or) f18040Q.get(jsonParser.getIntValue());
    }
}

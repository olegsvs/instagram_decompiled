package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ow */
public enum AnonymousClass1Ow {
    USER("user"),
    LIKE_COUNT_CHRONO("like_count_chrono"),
    FOLLOW_COUNT_CHRONO("follow_count_chrono"),
    COMMENT_COUNT("comment_count"),
    LOCATION("location"),
    PHOTOMAP("photomap"),
    HASHTAG("hashtag"),
    TAG("tag"),
    MENTION("mention"),
    STORY_VIEWER_LIST("story_viewer_list"),
    PROFILE_IMAGE_DESTINATION("profile_image_destination"),
    DESTINATION("destination");
    
    /* renamed from: P */
    public static final Map f18094P = null;
    /* renamed from: B */
    private String f18095B;

    static {
        f18094P = new HashMap();
        AnonymousClass1Ow[] values = AnonymousClass1Ow.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass1Ow anonymousClass1Ow = values[i];
            f18094P.put(anonymousClass1Ow.f18095B, anonymousClass1Ow);
            i++;
        }
    }

    private AnonymousClass1Ow(String str) {
        this.f18095B = str;
    }
}

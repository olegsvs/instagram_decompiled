package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.30z */
public enum AnonymousClass30z {
    ARCHIVE("archive"),
    CREATE_STORY_LONG_PRESS("create_story_long_press"),
    DIRECT_RECIPIENT_PICKER("direct_recipient_picker"),
    NETEGO_UNIT("highlights_netego_unit"),
    SELF_PROFILE("self_profile"),
    STORY_VIEWER_ARCHIVE("story_viewer_archive"),
    STORY_VIEWER_DEFAULT("story_viewer_default"),
    STORY_VIEWER_FEED("story_viewer_feed"),
    STORY_VIEWER_PROFILE("story_viewer_profile"),
    STORY_VIEWER_SUGGESTED_HIGHLIGHT("story_viewer_suggested_highlight"),
    STORY_VIEWER_EDIT_SUGGESTED_HIGHLIGHT("story_viewer_edit_suggested_highlight");
    
    /* renamed from: O */
    private static final Map f36894O = null;
    /* renamed from: B */
    public final String f36895B;

    static {
        f36894O = new HashMap();
        AnonymousClass30z[] values = AnonymousClass30z.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass30z anonymousClass30z = values[i];
            f36894O.put(anonymousClass30z.f36895B, anonymousClass30z);
            i++;
        }
    }

    private AnonymousClass30z(String str) {
        this.f36895B = str;
    }

    /* renamed from: B */
    public static AnonymousClass30z m18201B(String str) {
        return (AnonymousClass30z) f36894O.get(str);
    }
}

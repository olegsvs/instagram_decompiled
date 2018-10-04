package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.2HL */
public enum AnonymousClass2HL {
    PUBLISH_AS_SELF("publish_actions"),
    EMAIL_READ_ONLY("email"),
    READ_ONLY(new String[0]),
    PUBLISH_AS_SELF_OR_MANAGED_PAGE("manage_pages", "publish_actions", "publish_pages");
    
    /* renamed from: B */
    public final List f28505B;

    private AnonymousClass2HL(String... strArr) {
        this.f28505B = Arrays.asList(strArr);
    }
}

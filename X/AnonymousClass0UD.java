package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0UD */
public final class AnonymousClass0UD extends AnonymousClass0Tz {
    /* renamed from: E */
    public static final AnonymousClass0Oc f5394E = new AnonymousClass0YU();
    /* renamed from: B */
    public String f5395B;
    /* renamed from: C */
    public List f5396C;
    /* renamed from: D */
    public AnonymousClass0YV f5397D;

    /* renamed from: A */
    public final String mo1287A() {
        return "send_story_share_message";
    }

    public AnonymousClass0UD(List list, String str, AnonymousClass0P7 anonymousClass0P7, String str2, Long l, long j) {
        super(AnonymousClass0Uz.m4808B(list), l, j);
        this.f5396C = new ArrayList(list);
        this.f5395B = str;
        this.f5397D = new AnonymousClass0YV(anonymousClass0P7, str2);
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ Object mo1288E() {
        return this.f5397D;
    }

    /* renamed from: F */
    public final AnonymousClass0V0 mo1289F() {
        return AnonymousClass0V0.STORY_SHARE;
    }
}

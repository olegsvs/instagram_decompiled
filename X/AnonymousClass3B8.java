package X;

import com.facebook.forker.Process;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.3B8 */
public final class AnonymousClass3B8 {
    /* renamed from: B */
    public final int f38661B;
    /* renamed from: C */
    public final Set f38662C = new TreeSet(new AnonymousClass3B7(this));
    /* renamed from: D */
    public final Set f38663D = new HashSet();
    /* renamed from: E */
    public List f38664E;
    /* renamed from: F */
    public final String f38665F;

    public AnonymousClass3B8(int i, String str) {
        this.f38661B = i;
        this.f38665F = str;
    }

    /* renamed from: A */
    public final void m18861A(Medium medium) {
        this.f38662C.add(medium);
        this.f38663D.add(Integer.valueOf(medium.f30922L));
        this.f38664E = null;
    }

    /* renamed from: B */
    public final String m18862B() {
        switch (this.f38661B) {
            case Process.SD_STDOUT /*-5*/:
                return "instagram";
            case Process.SD_PIPE /*-4*/:
                return "external";
            case Process.SD_BLACK_HOLE /*-3*/:
                return "videos";
            case -2:
                return "photos";
            case -1:
                return "all";
            default:
                return "user_folder";
        }
    }

    /* renamed from: B */
    public static Map m18860B(Map map, List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                Map linkedHashMap = new LinkedHashMap();
                for (AnonymousClass3B8 anonymousClass3B8 : map.values()) {
                    if (list.contains(Integer.valueOf(anonymousClass3B8.f38661B))) {
                        linkedHashMap.put(Integer.valueOf(anonymousClass3B8.f38661B), anonymousClass3B8);
                    }
                }
                return linkedHashMap;
            }
        }
        return map;
    }

    /* renamed from: C */
    public final List m18863C() {
        if (this.f38664E == null) {
            this.f38664E = new ArrayList(this.f38662C);
        }
        return this.f38664E;
    }

    /* renamed from: D */
    public final boolean m18864D() {
        return this.f38662C.isEmpty();
    }
}

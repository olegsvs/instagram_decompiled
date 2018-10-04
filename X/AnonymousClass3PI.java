package X;

import com.instagram.model.hashtag.Hashtag;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3PI */
public final class AnonymousClass3PI extends AnonymousClass0wR {
    /* renamed from: B */
    private final AnonymousClass3PC f40838B;
    /* renamed from: C */
    private final Set f40839C = new HashSet();
    /* renamed from: D */
    private final AnonymousClass3PT f40840D;
    /* renamed from: E */
    private final Set f40841E = new HashSet();

    public AnonymousClass3PI(AnonymousClass3PT anonymousClass3PT, AnonymousClass3PC anonymousClass3PC) {
        this.f40840D = anonymousClass3PT;
        this.f40838B = anonymousClass3PC;
    }

    public final Class WT() {
        return AnonymousClass0mf.class;
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        Object obj = this.f40838B.f40829B.get(i);
        if (obj instanceof AnonymousClass0mf) {
            AnonymousClass0mf anonymousClass0mf = (AnonymousClass0mf) obj;
            switch (anonymousClass0mf.f9875E.ordinal()) {
                case 0:
                    Hashtag hashtag = anonymousClass0mf.f9873C;
                    if (this.f40839C.add(hashtag.f2786F)) {
                        this.f40840D.m19552A("similar_entity_impression", hashtag, i);
                        return;
                    }
                    return;
                case 1:
                    AnonymousClass0Ci anonymousClass0Ci = anonymousClass0mf.f9880J;
                    if (this.f40841E.add(anonymousClass0Ci.getId())) {
                        this.f40840D.m19553B("similar_entity_impression", anonymousClass0Ci, i);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

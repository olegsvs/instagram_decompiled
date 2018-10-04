package X;

import com.instagram.reels.fragment.ReelViewerFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5xQ */
public final class AnonymousClass5xQ {
    /* renamed from: B */
    public final AnonymousClass0EE f70315B;
    /* renamed from: C */
    public ReelViewerFragment f70316C;
    /* renamed from: D */
    public Runnable f70317D;
    /* renamed from: E */
    public AnonymousClass0iq f70318E;
    /* renamed from: F */
    public final AnonymousClass0Cm f70319F;
    /* renamed from: G */
    private final Map f70320G = new HashMap();

    public AnonymousClass5xQ(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        this.f70319F = anonymousClass0Cm;
        this.f70315B = anonymousClass0EE;
        this.f70320G.put(AnonymousClass5xP.INTERNAL_ONLY_MEDIA, new AnonymousClass6Ey());
        this.f70320G.put(AnonymousClass5xP.ONE_TAP_FB_SHARE, new AnonymousClass6F0());
        this.f70320G.put(AnonymousClass5xP.HIGHLIGHTS, new AnonymousClass6Ex());
        this.f70320G.put(AnonymousClass5xP.SLIDER_VOTERS_RESULTS, new AnonymousClass1Xr());
        this.f70320G.put(AnonymousClass5xP.QUESTION_VIEWER, new AnonymousClass6F3());
        this.f70320G.put(AnonymousClass5xP.QUESTION_VOTERS_RESULTS, new AnonymousClass6F4());
        this.f70320G.put(AnonymousClass5xP.SLIDER, new AnonymousClass6F6());
        this.f70320G.put(AnonymousClass5xP.POLL, new AnonymousClass6F1());
        this.f70320G.put(AnonymousClass5xP.FAVORITES_BADGE, new AnonymousClass6Ew());
        this.f70320G.put(AnonymousClass5xP.PRODUCT_STICKER, new AnonymousClass6F2());
        this.f70320G.put(AnonymousClass5xP.REACT, new AnonymousClass6F5());
        this.f70320G.put(AnonymousClass5xP.MULTI_AUTHOR_STORY_VIEW_COUNT, new AnonymousClass6Ez());
    }

    /* renamed from: A */
    public final boolean m28669A(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        AnonymousClass5xQ anonymousClass5xQ = this;
        if ((this.f70318E != null ? 1 : null) == null) {
            for (Object obj : AnonymousClass5xP.values()) {
                AnonymousClass5xO anonymousClass5xO = (AnonymousClass5xO) anonymousClass5xQ.f70320G.get(obj);
                if (anonymousClass5xO.kTA(anonymousClass5xQ.f70319F, anonymousClass0Pj, anonymousClass14t, anonymousClass14a)) {
                    anonymousClass14t = anonymousClass5xO.FT(anonymousClass14a);
                    anonymousClass5xQ.f70317D = new AnonymousClass5xN(anonymousClass5xQ, anonymousClass14t.getContext(), anonymousClass5xO, anonymousClass0Pj, anonymousClass14t);
                    anonymousClass14t.post(anonymousClass5xQ.f70317D);
                    return true;
                }
            }
        }
        return false;
    }
}

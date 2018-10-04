package X;

import android.widget.ListAdapter;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0wc */
public final class AnonymousClass0wc extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass0fQ f12302B;
    /* renamed from: C */
    public final AnonymousClass0PZ f12303C;
    /* renamed from: D */
    public long f12304D;
    /* renamed from: E */
    public final AnonymousClass0hq f12305E;
    /* renamed from: F */
    private ListAdapter f12306F;

    public AnonymousClass0wc(AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0hq anonymousClass0hq, AnonymousClass0fQ anonymousClass0fQ, ListAdapter listAdapter) {
        this.f12303C = anonymousClass0PZ;
        this.f12305E = anonymousClass0hq;
        this.f12302B = anonymousClass0fQ;
        this.f12306F = listAdapter;
    }

    public final Class WT() {
        return AnonymousClass0qp.class;
    }

    public final void Xc(Object obj) {
        AnonymousClass0qp anonymousClass0qp = (AnonymousClass0qp) obj;
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        AnonymousClass0qp anonymousClass0qp = (AnonymousClass0qp) obj;
        List arrayList = new ArrayList();
        long now = this.f12302B.now();
        if (now - this.f12304D > 3000) {
            for (AnonymousClass0fH anonymousClass0fH : anonymousClass0qp.f11022G) {
                arrayList.add(anonymousClass0fH.f7904T);
            }
            AnonymousClass0NN.m3292C("ig_main_feed_tile_unit_impression", this.f12303C.getModuleName()).m3298F("session_id", this.f12305E.kR()).m3299G("media_ids", arrayList).m3298F("tile_unit_id", anonymousClass0qp.getId()).m3298F(TraceFieldType.ContentType, anonymousClass0qp.f11017B).m3310R();
            this.f12304D = now;
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass0qp anonymousClass0qp = (AnonymousClass0qp) this.f12306F.getItem(i);
        if (anonymousClass0qp != null) {
            anonymousClass0wM.tWA(anonymousClass0qp.getId(), anonymousClass0qp, i);
        }
    }
}

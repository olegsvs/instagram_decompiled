package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0fs */
public final class AnonymousClass0fs extends AnonymousClass0ft {
    /* renamed from: B */
    public Boolean f8001B;
    /* renamed from: C */
    public String f8002C;
    /* renamed from: D */
    public List f8003D;
    /* renamed from: E */
    public List f8004E;
    /* renamed from: F */
    public AnonymousClass0nP f8005F;
    /* renamed from: G */
    public AnonymousClass0XM f8006G;
    /* renamed from: H */
    public AnonymousClass0lB f8007H;
    /* renamed from: I */
    public AnonymousClass0ne f8008I;
    /* renamed from: J */
    public AnonymousClass3UD f8009J;
    /* renamed from: K */
    public AnonymousClass0ly f8010K;
    /* renamed from: L */
    public String f8011L;

    /* renamed from: F */
    public final AnonymousClass0XM mo1552F() {
        return this.f8006G;
    }

    /* renamed from: H */
    public final /* bridge */ /* synthetic */ AnonymousClass0ft mo1553H() {
        return m6572J();
    }

    /* renamed from: I */
    public final List m6571I() {
        List list = this.f8003D;
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: J */
    public final AnonymousClass0fs m6572J() {
        List arrayList;
        List list;
        super.mo1553H();
        List<AnonymousClass0fH> list2 = this.f8003D;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (AnonymousClass0fH anonymousClass0fH : list2) {
                if (anonymousClass0fH.f7894J != AnonymousClass0mZ.UNKNOWN) {
                    arrayList.add(anonymousClass0fH);
                }
            }
        } else {
            if (this.f8015E != null) {
                List<AnonymousClass0P7> list3 = this.f8015E;
                arrayList = new ArrayList();
                for (AnonymousClass0P7 anonymousClass0P7 : list3) {
                    arrayList.add(new AnonymousClass0fH(anonymousClass0P7.getId(), anonymousClass0P7));
                }
            }
            list = this.f8004E;
            if (!(list == null || list.isEmpty())) {
                this.f8005F = new AnonymousClass0nP(((Integer) ((AnonymousClass11f) this.f8004E.get(0)).f13439B.get(0)).intValue(), ((Integer) ((AnonymousClass11f) this.f8004E.get(1)).f13439B.get(1)).intValue(), ((Integer) ((AnonymousClass11f) this.f8004E.get(0)).f13439B.get(1)).intValue());
            }
            return this;
        }
        this.f8003D = arrayList;
        list = this.f8004E;
        this.f8005F = new AnonymousClass0nP(((Integer) ((AnonymousClass11f) this.f8004E.get(0)).f13439B.get(0)).intValue(), ((Integer) ((AnonymousClass11f) this.f8004E.get(1)).f13439B.get(1)).intValue(), ((Integer) ((AnonymousClass11f) this.f8004E.get(0)).f13439B.get(1)).intValue());
        return this;
    }
}

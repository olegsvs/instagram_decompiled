package X;

import android.content.Context;
import android.widget.SectionIndexer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3wg */
public final class AnonymousClass3wg extends AnonymousClass0Rq implements AnonymousClass0ou, SectionIndexer, AnonymousClass2zx, AnonymousClass0Rr, AnonymousClass30X {
    /* renamed from: O */
    public static final SimpleDateFormat f47202O = new SimpleDateFormat("MMM yyyy", Locale.getDefault());
    /* renamed from: B */
    public final Map f47203B = new HashMap();
    /* renamed from: C */
    public boolean f47204C = false;
    /* renamed from: D */
    public final AnonymousClass2zt f47205D;
    /* renamed from: E */
    public final AnonymousClass3wh f47206E = new AnonymousClass3wh();
    /* renamed from: F */
    public final Map f47207F = new HashMap();
    /* renamed from: G */
    public final Map f47208G = new HashMap();
    /* renamed from: H */
    public final List f47209H = new ArrayList();
    /* renamed from: I */
    public final List f47210I = new ArrayList();
    /* renamed from: J */
    private final AnonymousClass0qL f47211J;
    /* renamed from: K */
    private final AnonymousClass2zs f47212K;
    /* renamed from: L */
    private boolean f47213L;
    /* renamed from: M */
    private boolean f47214M;
    /* renamed from: N */
    private final AnonymousClass2zu f47215N;

    public final Object YQ(int i) {
        return null;
    }

    public final int getPositionForSection(int i) {
        return 0;
    }

    public AnonymousClass3wg(Context context, AnonymousClass302 anonymousClass302, boolean z, boolean z2, AnonymousClass0nJ anonymousClass0nJ) {
        this.f47211J = new AnonymousClass0qL(context);
        this.f47205D = new AnonymousClass2zt(context, 3, anonymousClass302, this);
        this.f47212K = new AnonymousClass2zs();
        this.f47215N = anonymousClass0nJ != null ? new AnonymousClass2zu(anonymousClass0nJ) : null;
        AnonymousClass1VC anonymousClass1VC = new AnonymousClass1VC(context);
        this.f47214M = z;
        this.f47213L = z2;
        List arrayList = new ArrayList();
        arrayList.add(this.f47211J);
        arrayList.add(this.f47205D);
        AnonymousClass2zu anonymousClass2zu = this.f47215N;
        if (anonymousClass2zu != null) {
            arrayList.add(anonymousClass2zu);
        }
        arrayList.add(this.f47212K);
        arrayList.add(anonymousClass1VC);
        AnonymousClass0TB[] anonymousClass0TBArr = new AnonymousClass0TB[arrayList.size()];
        arrayList.toArray(anonymousClass0TBArr);
        D(anonymousClass0TBArr);
    }

    /* renamed from: F */
    public final void m21647F() {
        C();
        this.f47206E.G();
        this.f47208G.clear();
        this.f47207F.clear();
        this.f47210I.clear();
        this.f47209H.clear();
        if (!isEmpty()) {
            int i;
            if (r2.f47214M) {
                A(null, r2.f47211J);
            }
            Collection linkedHashSet = new LinkedHashSet();
            for (i = 0; i < r2.f47206E.K(); i++) {
                AnonymousClass2zi anonymousClass2zi = (AnonymousClass2zi) r2.f47206E.J(i);
                if (anonymousClass2zi.f36703F != null) {
                    linkedHashSet.add(anonymousClass2zi.f36703F);
                }
            }
            List arrayList = new ArrayList(linkedHashSet);
            int I = r2.f47206E.I();
            int count = getCount();
            String str = JsonProperty.USE_DEFAULT_NAME;
            int i2 = 0;
            for (int i3 = 0; i3 < I; i3++) {
                boolean z;
                String format;
                AnonymousClass2MJ T = r2.f47206E.m18140T(i3);
                int i4 = i3 + count;
                r2.f47209H.add(Integer.valueOf(i2));
                i = 0;
                while (true) {
                    z = true;
                    if (i >= T.m15208C()) {
                        break;
                    }
                    AnonymousClass2zi anonymousClass2zi2 = (AnonymousClass2zi) T.m15206A(i);
                    if (anonymousClass2zi2.f36706I == AnonymousClass2zh.MEDIA) {
                        AnonymousClass0MI anonymousClass0MI = anonymousClass2zi2.f36702E;
                        AnonymousClass0Pj anonymousClass0Pj = anonymousClass2zi2.f36704G;
                        if (!r2.f47208G.containsKey(anonymousClass0MI.getId())) {
                            r2.f47208G.put(anonymousClass0MI.getId(), Integer.valueOf(i4));
                        }
                        r2.f47207F.put(anonymousClass0Pj.getId(), Integer.valueOf(i4));
                    }
                    if (anonymousClass2zi2.f36706I != AnonymousClass2zh.SPACE && anonymousClass2zi2.f36705H == 0) {
                        format = f47202O.format(new Date(anonymousClass2zi2.f36699B * 1000));
                        if (r2.f47210I.isEmpty() || !format.equals(r6)) {
                            r2.f47210I.add(format);
                            i2 = r2.f47210I.size() - 1;
                            str = format;
                        }
                        List list = r2.f47209H;
                        list.remove(list.size() - 1);
                        r2.f47209H.add(Integer.valueOf(i2));
                    }
                    i++;
                }
                format = T.m15207B();
                AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Vy) r2.f47203B.get(format);
                if (anonymousClass1Xu == null) {
                    anonymousClass1Xu = new AnonymousClass2zU(r2);
                    r2.f47203B.put(format, anonymousClass1Xu);
                }
                if (i3 != I - 1) {
                    z = false;
                }
                anonymousClass1Xu.B(i4, z);
                B(new AnonymousClass2zV(arrayList, T), anonymousClass1Xu, r2.f47205D);
            }
            AnonymousClass2zu anonymousClass2zu = r2.f47215N;
            if (anonymousClass2zu != null) {
                if ((anonymousClass2zu.f36744B.B() > 0 ? 1 : null) != null) {
                    A(null, r2.f47215N);
                }
            }
            if (!r2.f47213L) {
                A(null, r2.f47212K);
            }
            r2.f47209H.add(Integer.valueOf(r2.f47210I.size() - 1));
        }
        E();
    }

    public final void UOA(int i) {
        this.f47211J.f10915C = i;
        m21647F();
    }

    public final void ar() {
        m21647F();
    }

    public final Set bR() {
        return AnonymousClass30Y.m18171E().m18178G();
    }

    public final int getSectionForPosition(int i) {
        return (i < 0 || i >= this.f47209H.size()) ? -1 : ((Integer) this.f47209H.get(i)).intValue();
    }

    public final Object[] getSections() {
        return this.f47210I.toArray();
    }

    public final boolean isEmpty() {
        return this.f47206E.M() ^ 1;
    }

    public final int qV(AnonymousClass0MI anonymousClass0MI) {
        return this.f47208G.containsKey(anonymousClass0MI.getId()) ? ((Integer) this.f47208G.get(anonymousClass0MI.getId())).intValue() : -1;
    }

    public final int rV(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        return this.f47207F.containsKey(anonymousClass0Pj.getId()) ? ((Integer) this.f47207F.get(anonymousClass0Pj.getId())).intValue() : -1;
    }
}

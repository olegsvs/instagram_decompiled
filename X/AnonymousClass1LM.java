package X;

import android.support.v4.view.ViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1LM */
public class AnonymousClass1LM extends AnonymousClass1LN implements AnonymousClass0mS {
    /* renamed from: B */
    public FixedTabBar f17319B;
    /* renamed from: C */
    public ViewPager f17320C;
    /* renamed from: D */
    public final AnonymousClass0bw f17321D;
    /* renamed from: E */
    public final List f17322E;
    /* renamed from: F */
    private final boolean f17323F;

    public AnonymousClass1LM(AnonymousClass0bw anonymousClass0bw, AnonymousClass0IU anonymousClass0IU, ViewPager viewPager, FixedTabBar fixedTabBar, List list) {
        this(anonymousClass0bw, anonymousClass0IU, viewPager, fixedTabBar, list, false);
    }

    public AnonymousClass1LM(AnonymousClass0bw anonymousClass0bw, AnonymousClass0IU anonymousClass0IU, ViewPager viewPager, FixedTabBar fixedTabBar, List list, boolean z) {
        super(anonymousClass0IU);
        this.f17321D = anonymousClass0bw;
        this.f17320C = viewPager;
        this.f17319B = fixedTabBar;
        this.f17322E = list;
        this.f17323F = AnonymousClass0e8.m6200D(viewPager.getContext());
        this.f17319B.setMaybeUseIconFallbackTabs(z);
        this.f17319B.setDelegate(this);
        List arrayList = new ArrayList(this.f17322E.size());
        for (Object vF : this.f17322E) {
            arrayList.add(this.f17321D.vF(vF));
        }
        this.f17319B.setTabs(arrayList);
        this.f17324B = this.f17320C;
        this.f17320C.mo2477B(new AnonymousClass1ZY(this));
        this.f17320C.mo2477B(this.f17319B);
        this.f17320C.setAdapter(this);
    }

    /* renamed from: B */
    public static int m10819B(AnonymousClass1LM anonymousClass1LM, int i) {
        return anonymousClass1LM.f17323F ? (anonymousClass1LM.f17322E.size() - 1) - i : i;
    }

    /* renamed from: C */
    public static Object m10820C(AnonymousClass1LM anonymousClass1LM, int i) {
        return anonymousClass1LM.f17322E.get(AnonymousClass1LM.m10819B(anonymousClass1LM, i));
    }

    /* renamed from: J */
    public final AnonymousClass0IL mo2426J(int i) {
        return this.f17321D.aF(AnonymousClass1LM.m10820C(this, i));
    }

    /* renamed from: L */
    public final AnonymousClass0IL m10822L(Object obj) {
        return m10833K(AnonymousClass1LM.m10819B(this, this.f17322E.indexOf(obj)));
    }

    /* renamed from: M */
    public final AnonymousClass0IL m10823M() {
        return m10833K(this.f17320C.getCurrentItem());
    }

    /* renamed from: N */
    public final Object m10824N() {
        return AnonymousClass1LM.m10820C(this, this.f17320C.getCurrentItem());
    }

    /* renamed from: O */
    public final void m10825O(Object obj) {
        hPA(AnonymousClass1LM.m10819B(this, this.f17322E.indexOf(obj)));
    }

    public final int getCount() {
        return this.f17322E.size();
    }

    public void hPA(int i) {
        this.f17320C.setCurrentItem(i);
        this.f17319B.m10899A(i);
    }
}

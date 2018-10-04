package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.10n */
public class AnonymousClass10n extends AnonymousClass10o {
    /* renamed from: M */
    private static TimeInterpolator f13310M;
    /* renamed from: B */
    public ArrayList f13311B = new ArrayList();
    /* renamed from: C */
    public ArrayList f13312C = new ArrayList();
    /* renamed from: D */
    public ArrayList f13313D = new ArrayList();
    /* renamed from: E */
    public ArrayList f13314E = new ArrayList();
    /* renamed from: F */
    public ArrayList f13315F = new ArrayList();
    /* renamed from: G */
    public ArrayList f13316G = new ArrayList();
    /* renamed from: H */
    public ArrayList f13317H = new ArrayList();
    /* renamed from: I */
    private ArrayList f13318I = new ArrayList();
    /* renamed from: J */
    private ArrayList f13319J = new ArrayList();
    /* renamed from: K */
    private ArrayList f13320K = new ArrayList();
    /* renamed from: L */
    private ArrayList f13321L = new ArrayList();

    /* renamed from: B */
    public static final void m8727B(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((AnonymousClass0oo) list.get(size)).f10370B.animate().cancel();
        }
    }

    /* renamed from: C */
    private void m8728C(List list, AnonymousClass0oo anonymousClass0oo) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass1o6 anonymousClass1o6 = (AnonymousClass1o6) list.get(size);
            if (m8730E(anonymousClass1o6, anonymousClass0oo) && anonymousClass1o6.f22890E == null && anonymousClass1o6.f22889D == null) {
                list.remove(anonymousClass1o6);
            }
        }
    }

    /* renamed from: D */
    private void m8729D(AnonymousClass1o6 anonymousClass1o6) {
        if (anonymousClass1o6.f22890E != null) {
            m8730E(anonymousClass1o6, anonymousClass1o6.f22890E);
        }
        if (anonymousClass1o6.f22889D != null) {
            m8730E(anonymousClass1o6, anonymousClass1o6.f22889D);
        }
    }

    /* renamed from: E */
    private boolean m8730E(AnonymousClass1o6 anonymousClass1o6, AnonymousClass0oo anonymousClass0oo) {
        if (anonymousClass1o6.f22889D == anonymousClass0oo) {
            anonymousClass1o6.f22889D = null;
        } else if (anonymousClass1o6.f22890E != anonymousClass0oo) {
            return false;
        } else {
            anonymousClass1o6.f22890E = null;
        }
        anonymousClass0oo.f10370B.setAlpha(1.0f);
        anonymousClass0oo.f10370B.setTranslationX(0.0f);
        anonymousClass0oo.f10370B.setTranslationY(0.0f);
        m8756G(anonymousClass0oo);
        return true;
    }

    /* renamed from: F */
    private void m8731F(AnonymousClass0oo anonymousClass0oo) {
        if (f13310M == null) {
            f13310M = new ValueAnimator().getInterpolator();
        }
        anonymousClass0oo.f10370B.animate().setInterpolator(f13310M);
        mo2024I(anonymousClass0oo);
    }

    /* renamed from: F */
    public final boolean mo2023F(AnonymousClass0oo anonymousClass0oo, List list) {
        if (list.isEmpty()) {
            if (!super.mo2023F(anonymousClass0oo, list)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final void mo2024I(AnonymousClass0oo anonymousClass0oo) {
        int size;
        View view = anonymousClass0oo.f10370B;
        view.animate().cancel();
        for (size = this.f13320K.size() - 1; size >= 0; size--) {
            if (((AnonymousClass1Lb) this.f13320K.get(size)).f17444D == anonymousClass0oo) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m8752S(anonymousClass0oo);
                this.f13320K.remove(size);
            }
        }
        m8728C(this.f13319J, anonymousClass0oo);
        if (this.f13321L.remove(anonymousClass0oo)) {
            view.setAlpha(1.0f);
            m8753T(anonymousClass0oo);
        }
        if (this.f13318I.remove(anonymousClass0oo)) {
            view.setAlpha(1.0f);
            m8751R(anonymousClass0oo);
        }
        for (size = this.f13314E.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) this.f13314E.get(size);
            m8728C(arrayList, anonymousClass0oo);
            if (arrayList.isEmpty()) {
                this.f13314E.remove(size);
            }
        }
        for (int size2 = this.f13316G.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = (ArrayList) this.f13316G.get(size2);
            size = arrayList2.size() - 1;
            while (size >= 0) {
                if (((AnonymousClass1Lb) arrayList2.get(size)).f17444D == anonymousClass0oo) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m8752S(anonymousClass0oo);
                    arrayList2.remove(size);
                    if (arrayList2.isEmpty()) {
                        this.f13316G.remove(size2);
                    }
                } else {
                    size--;
                }
            }
        }
        for (int size3 = this.f13312C.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList3 = (ArrayList) this.f13312C.get(size3);
            if (arrayList3.remove(anonymousClass0oo)) {
                view.setAlpha(1.0f);
                m8751R(anonymousClass0oo);
                if (arrayList3.isEmpty()) {
                    this.f13312C.remove(size3);
                }
            }
        }
        this.f13317H.remove(anonymousClass0oo);
        this.f13311B.remove(anonymousClass0oo);
        this.f13313D.remove(anonymousClass0oo);
        this.f13315F.remove(anonymousClass0oo);
        m8741W();
    }

    /* renamed from: J */
    public final void mo2025J() {
        int size;
        int size2;
        for (size = this.f13320K.size() - 1; size >= 0; size--) {
            AnonymousClass1Lb anonymousClass1Lb = (AnonymousClass1Lb) this.f13320K.get(size);
            View view = anonymousClass1Lb.f17444D.f10370B;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m8752S(anonymousClass1Lb.f17444D);
            this.f13320K.remove(size);
        }
        for (size2 = this.f13321L.size() - 1; size2 >= 0; size2--) {
            m8753T((AnonymousClass0oo) this.f13321L.get(size2));
            this.f13321L.remove(size2);
        }
        for (size = this.f13318I.size() - 1; size >= 0; size--) {
            AnonymousClass0oo anonymousClass0oo = (AnonymousClass0oo) this.f13318I.get(size);
            anonymousClass0oo.f10370B.setAlpha(1.0f);
            m8751R(anonymousClass0oo);
            this.f13318I.remove(size);
        }
        for (size2 = this.f13319J.size() - 1; size2 >= 0; size2--) {
            m8729D((AnonymousClass1o6) this.f13319J.get(size2));
        }
        this.f13319J.clear();
        if (mo2026K()) {
            int size3;
            ArrayList arrayList;
            for (size3 = this.f13316G.size() - 1; size3 >= 0; size3--) {
                arrayList = (ArrayList) this.f13316G.get(size3);
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    anonymousClass1Lb = (AnonymousClass1Lb) arrayList.get(size);
                    view = anonymousClass1Lb.f17444D.f10370B;
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m8752S(anonymousClass1Lb.f17444D);
                    arrayList.remove(size);
                    if (arrayList.isEmpty()) {
                        this.f13316G.remove(arrayList);
                    }
                }
            }
            for (size3 = this.f13312C.size() - 1; size3 >= 0; size3--) {
                arrayList = (ArrayList) this.f13312C.get(size3);
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    anonymousClass0oo = (AnonymousClass0oo) arrayList.get(size);
                    anonymousClass0oo.f10370B.setAlpha(1.0f);
                    m8751R(anonymousClass0oo);
                    arrayList.remove(size);
                    if (arrayList.isEmpty()) {
                        this.f13312C.remove(arrayList);
                    }
                }
            }
            for (int size4 = this.f13314E.size() - 1; size4 >= 0; size4--) {
                ArrayList arrayList2 = (ArrayList) this.f13314E.get(size4);
                for (size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    m8729D((AnonymousClass1o6) arrayList2.get(size2));
                    if (arrayList2.isEmpty()) {
                        this.f13314E.remove(arrayList2);
                    }
                }
            }
            AnonymousClass10n.m8727B(this.f13317H);
            AnonymousClass10n.m8727B(this.f13315F);
            AnonymousClass10n.m8727B(this.f13311B);
            AnonymousClass10n.m8727B(this.f13313D);
            m8764H();
        }
    }

    /* renamed from: K */
    public final boolean mo2026K() {
        if (this.f13318I.isEmpty() && this.f13319J.isEmpty() && this.f13320K.isEmpty() && this.f13321L.isEmpty() && this.f13315F.isEmpty() && this.f13317H.isEmpty() && this.f13311B.isEmpty() && this.f13313D.isEmpty() && this.f13316G.isEmpty() && this.f13312C.isEmpty()) {
            if (this.f13314E.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public final void mo2027M() {
        int isEmpty = this.f13321L.isEmpty() ^ 1;
        int isEmpty2 = this.f13320K.isEmpty() ^ 1;
        int isEmpty3 = this.f13319J.isEmpty() ^ 1;
        int isEmpty4 = this.f13318I.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            ArrayList arrayList;
            Runnable anonymousClass1Lc;
            int size = this.f13321L.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0oo anonymousClass0oo = (AnonymousClass0oo) this.f13321L.get(i);
                View view = anonymousClass0oo.f10370B;
                ViewPropertyAnimator animate = view.animate();
                this.f13317H.add(anonymousClass0oo);
                animate.setDuration(this.f13328G).alpha(0.0f).setListener(new AnonymousClass1Ki(this, anonymousClass0oo, animate, view)).start();
            }
            this.f13321L.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f13320K);
                this.f13316G.add(arrayList);
                this.f13320K.clear();
                anonymousClass1Lc = new AnonymousClass1Lc(this, arrayList);
                if (isEmpty != 0) {
                    AnonymousClass0mE.m7522L(((AnonymousClass1Lb) arrayList.get(0)).f17444D.f10370B, anonymousClass1Lc, this.f13328G);
                } else {
                    anonymousClass1Lc.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f13319J);
                this.f13314E.add(arrayList);
                this.f13319J.clear();
                anonymousClass1Lc = new AnonymousClass1o3(this, arrayList);
                if (isEmpty != 0) {
                    AnonymousClass0mE.m7522L(((AnonymousClass1o6) arrayList.get(0)).f22890E.f10370B, anonymousClass1Lc, this.f13328G);
                } else {
                    anonymousClass1Lc.run();
                }
            }
            if (isEmpty4 != 0) {
                long j;
                long j2;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f13318I);
                this.f13312C.add(arrayList2);
                this.f13318I.clear();
                Runnable anonymousClass1AS = new AnonymousClass1AS(this, arrayList2);
                if (isEmpty == 0 && isEmpty2 == 0) {
                    if (isEmpty3 == 0) {
                        anonymousClass1AS.run();
                        return;
                    }
                }
                long j3 = 0;
                if (isEmpty != 0) {
                    j = this.f13328G;
                } else {
                    j = 0;
                }
                if (isEmpty2 != 0) {
                    j2 = this.f13327F;
                } else {
                    j2 = 0;
                }
                if (isEmpty3 != 0) {
                    j3 = this.f13324C;
                }
                AnonymousClass0mE.m7522L(((AnonymousClass0oo) arrayList2.get(0)).f10370B, anonymousClass1AS, j + Math.max(j2, j3));
            }
        }
    }

    /* renamed from: N */
    public boolean mo2028N(AnonymousClass0oo anonymousClass0oo) {
        m8731F(anonymousClass0oo);
        anonymousClass0oo.f10370B.setAlpha(0.0f);
        this.f13318I.add(anonymousClass0oo);
        return true;
    }

    /* renamed from: O */
    public final boolean mo2029O(AnonymousClass0oo anonymousClass0oo, AnonymousClass0oo anonymousClass0oo2, int i, int i2, int i3, int i4) {
        AnonymousClass10o anonymousClass10o = this;
        AnonymousClass0oo anonymousClass0oo3 = anonymousClass0oo;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (anonymousClass0oo == anonymousClass0oo2) {
            return mo2030P(anonymousClass0oo3, i5, i6, i7, i8);
        }
        float translationX = anonymousClass0oo.f10370B.getTranslationX();
        float translationY = anonymousClass0oo.f10370B.getTranslationY();
        float alpha = anonymousClass0oo.f10370B.getAlpha();
        m8731F(anonymousClass0oo);
        int i9 = (int) (((float) (i3 - i)) - translationX);
        int i10 = (int) (((float) (i4 - i2)) - translationY);
        anonymousClass0oo.f10370B.setTranslationX(translationX);
        anonymousClass0oo.f10370B.setTranslationY(translationY);
        anonymousClass0oo.f10370B.setAlpha(alpha);
        if (anonymousClass0oo2 != null) {
            m8731F(anonymousClass0oo2);
            anonymousClass0oo2.f10370B.setTranslationX((float) (-i9));
            anonymousClass0oo2.f10370B.setTranslationY((float) (-i10));
            anonymousClass0oo2.f10370B.setAlpha(0.0f);
        }
        this.f13319J.add(new AnonymousClass1o6(anonymousClass0oo, anonymousClass0oo2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: P */
    public boolean mo2030P(AnonymousClass0oo anonymousClass0oo, int i, int i2, int i3, int i4) {
        AnonymousClass0oo anonymousClass0oo2 = anonymousClass0oo;
        View view = anonymousClass0oo.f10370B;
        int translationX = i + ((int) anonymousClass0oo.f10370B.getTranslationX());
        int translationY = i2 + ((int) anonymousClass0oo.f10370B.getTranslationY());
        m8731F(anonymousClass0oo);
        int i5 = i3;
        int i6 = i3 - translationX;
        int i7 = i4;
        int i8 = i4 - translationY;
        if (i6 == 0 && i8 == 0) {
            m8752S(anonymousClass0oo);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i8 != 0) {
            view.setTranslationY((float) (-i8));
        }
        this.f13320K.add(new AnonymousClass1Lb(anonymousClass0oo2, translationX, translationY, i5, i7));
        return true;
    }

    /* renamed from: Q */
    public boolean mo2031Q(AnonymousClass0oo anonymousClass0oo) {
        m8731F(anonymousClass0oo);
        this.f13321L.add(anonymousClass0oo);
        return true;
    }

    /* renamed from: W */
    public final void m8741W() {
        if (!mo2026K()) {
            m8764H();
        }
    }
}

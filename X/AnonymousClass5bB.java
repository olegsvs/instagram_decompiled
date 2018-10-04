package X;

import android.view.ViewGroup;

/* renamed from: X.5bB */
public final class AnonymousClass5bB extends AnonymousClass5R8 {
    public AnonymousClass5bB(AnonymousClass1MK anonymousClass1MK, AnonymousClass1LO anonymousClass1LO) {
        super(anonymousClass1LO);
    }

    /* renamed from: B */
    public final float mo5911B(int i) {
        return super.mo5911B(m27794C(i));
    }

    /* renamed from: C */
    private int m27794C(int i) {
        return (getCount() - i) - 1;
    }

    /* renamed from: G */
    public final void mo5912G(ViewGroup viewGroup, int i, Object obj) {
        super.mo5912G(viewGroup, (getCount() - i) - 1, obj);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, m27794C(i), obj);
    }

    public final int getItemPosition(Object obj) {
        int itemPosition = super.getItemPosition(obj);
        return itemPosition < 0 ? itemPosition : m27794C(itemPosition);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, m27794C(i));
    }
}

package X;

import android.widget.AbsListView;

/* renamed from: X.5lI */
public final class AnonymousClass5lI implements AnonymousClass0lE {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0PY f68776B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lD f68777C;

    public final float EL(AbsListView absListView, float f) {
        return f;
    }

    public AnonymousClass5lI(AnonymousClass0PY anonymousClass0PY, AnonymousClass0lD anonymousClass0lD) {
        this.f68776B = anonymousClass0PY;
        this.f68777C = anonymousClass0lD;
    }

    public final boolean KTA(AbsListView absListView) {
        int D = AnonymousClass0PY.D(this.f68776B);
        boolean z = false;
        if (D != 0) {
            if (absListView.getFirstVisiblePosition() < D) {
                return true;
            }
            if (absListView.getFirstVisiblePosition() == D && absListView.getChildAt(0).getHeight() + absListView.getChildAt(0).getTop() > this.f68776B.f4113j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean LTA(AbsListView absListView) {
        int D = AnonymousClass0PY.D(this.f68776B);
        if (absListView.getChildCount() != 0) {
            if (D != 0) {
                boolean z;
                if (!this.f68777C.LTA(absListView)) {
                    if (absListView.getFirstVisiblePosition() != D) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            }
        }
        return this.f68777C.LTA(absListView);
    }

    public final void TEA(float f) {
        this.f68777C.TEA(f);
        if (this.f68776B.f4098U != null) {
            this.f68776B.f4098U.B(f);
        }
        this.f68776B.f4108e.C();
        this.f68776B.f4086I.C();
    }
}

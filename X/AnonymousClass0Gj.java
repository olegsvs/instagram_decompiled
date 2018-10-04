package X;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Gj */
public final class AnonymousClass0Gj {
    /* renamed from: B */
    private List f2409B = new CopyOnWriteArrayList();

    /* renamed from: A */
    public final void m1844A(Activity activity) {
        for (AnonymousClass0Fl uc : this.f2409B) {
            uc.uc(activity);
        }
    }

    /* renamed from: B */
    public final void m1845B(Activity activity) {
        for (AnonymousClass0Fl vc : this.f2409B) {
            vc.vc(activity);
        }
    }

    /* renamed from: C */
    public final void m1846C(Activity activity) {
        for (AnonymousClass0Fl wc : this.f2409B) {
            wc.wc(activity);
        }
    }

    /* renamed from: D */
    public final void m1847D(Activity activity) {
        for (AnonymousClass0Fl zc : this.f2409B) {
            zc.zc(activity);
        }
    }

    /* renamed from: E */
    public final void m1848E(AnonymousClass0Fl anonymousClass0Fl) {
        if (!this.f2409B.contains(anonymousClass0Fl)) {
            this.f2409B.add(anonymousClass0Fl);
        }
    }

    /* renamed from: F */
    public final void m1849F(AnonymousClass0Fl anonymousClass0Fl) {
        if (this.f2409B.contains(anonymousClass0Fl)) {
            this.f2409B.remove(anonymousClass0Fl);
        }
    }
}

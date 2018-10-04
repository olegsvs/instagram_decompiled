package X;

import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.10J */
public final class AnonymousClass10J {
    /* renamed from: B */
    public final AnonymousClass0cN f13223B = AnonymousClass0e6.m6190B().m6193C().m5756A(new AnonymousClass1Ya(this)).m5767L(1.0d);
    /* renamed from: C */
    public final View f13224C;

    private AnonymousClass10J(View view) {
        this.f13224C = view;
    }

    /* renamed from: A */
    public final AnonymousClass10J m8713A() {
        if (AnonymousClass0Sy.m4436E()) {
            this.f13223B.m5771P((double) 1082130432);
        } else {
            this.f13224C.post(new AnonymousClass10K(this, 4.0f));
        }
        return this;
    }

    /* renamed from: B */
    public static AnonymousClass10J m8712B(View view) {
        AnonymousClass10J anonymousClass10J = (AnonymousClass10J) view.getTag(C0164R.id.view_bouncer);
        if (anonymousClass10J != null) {
            return anonymousClass10J;
        }
        AnonymousClass10J anonymousClass10J2 = new AnonymousClass10J(view);
        view.setTag(C0164R.id.view_bouncer, anonymousClass10J2);
        return anonymousClass10J2;
    }
}

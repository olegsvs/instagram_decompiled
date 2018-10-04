package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: X.1o3 */
public final class AnonymousClass1o3 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10n f22877B;
    /* renamed from: C */
    public final /* synthetic */ ArrayList f22878C;

    public AnonymousClass1o3(AnonymousClass10n anonymousClass10n, ArrayList arrayList) {
        this.f22877B = anonymousClass10n;
        this.f22878C = arrayList;
    }

    public final void run() {
        int size = this.f22878C.size();
        for (int i = 0; i < size; i++) {
            View view;
            AnonymousClass1o6 anonymousClass1o6 = (AnonymousClass1o6) this.f22878C.get(i);
            AnonymousClass10p anonymousClass10p = this.f22877B;
            AnonymousClass0oo anonymousClass0oo = anonymousClass1o6.f22890E;
            View view2 = null;
            if (anonymousClass0oo == null) {
                view = null;
            } else {
                view = anonymousClass0oo.f10370B;
            }
            anonymousClass0oo = anonymousClass1o6.f22889D;
            if (anonymousClass0oo != null) {
                view2 = anonymousClass0oo.f10370B;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(anonymousClass10p.f13324C);
                anonymousClass10p.f13313D.add(anonymousClass1o6.f22890E);
                duration.translationX((float) (anonymousClass1o6.f22891F - anonymousClass1o6.f22887B));
                duration.translationY((float) (anonymousClass1o6.f22892G - anonymousClass1o6.f22888C));
                duration.alpha(0.0f).setListener(new AnonymousClass1o4(anonymousClass10p, anonymousClass1o6, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                anonymousClass10p.f13313D.add(anonymousClass1o6.f22889D);
                animate.translationX(0.0f).translationY(0.0f).setDuration(anonymousClass10p.f13324C).alpha(1.0f).setListener(new AnonymousClass1o5(anonymousClass10p, anonymousClass1o6, animate, view2)).start();
            }
        }
        this.f22878C.clear();
        this.f22877B.f13314E.remove(this.f22878C);
    }
}

package X;

import android.view.View;

/* renamed from: X.50u */
public final class AnonymousClass50u extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass50y f59288B;

    public AnonymousClass50u(AnonymousClass50y anonymousClass50y, int i) {
        this.f59288B = anonymousClass50y;
        super(i);
    }

    public final void onClick(View view) {
        view = this.f59288B;
        AnonymousClass0GA D = AnonymousClass2DM.D();
        D.f2849B = view.f59294C;
        view.schedule(D);
    }
}

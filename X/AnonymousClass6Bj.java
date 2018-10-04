package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.6Bj */
public final class AnonymousClass6Bj {
    /* renamed from: B */
    public AnonymousClass2FI f72811B;
    /* renamed from: C */
    public AnonymousClass6Gy f72812C;
    /* renamed from: D */
    private final ViewGroup f72813D;

    public AnonymousClass6Bj(ViewGroup viewGroup) {
        this.f72813D = viewGroup;
    }

    /* renamed from: A */
    public final void m29363A() {
        if (this.f72811B == null) {
            Context context = this.f72813D.getContext();
            String H = AnonymousClass0G5.H(context, C0164R.attr.appName);
            AnonymousClass2FI E = new AnonymousClass2FI(this.f72813D, C0164R.layout.permission_empty_state_view).H(context.getString(C0164R.string.camera_permission_rationale_title, new Object[]{H})).G(context.getString(C0164R.string.camera_permission_rationale_message, new Object[]{H})).E(C0164R.string.camera_permission_rationale_link);
            this.f72811B = E;
            E.F(new AnonymousClass6Bi(this));
        }
    }
}

package X;

import android.app.Activity;
import android.view.View;
import android.widget.AbsListView;
import com.facebook.C0164R;

/* renamed from: X.0lD */
public final class AnonymousClass0lD implements AnonymousClass0lE {
    /* renamed from: B */
    private final AnonymousClass0iW f9454B;
    /* renamed from: C */
    private boolean f9455C;
    /* renamed from: D */
    private final View f9456D;

    public final float EL(AbsListView absListView, float f) {
        return f;
    }

    public final boolean KTA(AbsListView absListView) {
        return false;
    }

    public AnonymousClass0lD(Activity activity) {
        this.f9456D = AnonymousClass0eT.m6314E(activity).f7727C.findViewById(C0164R.id.action_bar_shadow);
        this.f9454B = AnonymousClass0iW.m6907C(activity);
    }

    public final boolean LTA(AbsListView absListView) {
        return absListView.getFirstVisiblePosition() == 0;
    }

    public final void TEA(float f) {
        if (this.f9454B.m6910A() == 0.0f && this.f9456D.getVisibility() == 0) {
            this.f9455C = true;
            this.f9456D.setVisibility(8);
        } else if (this.f9455C) {
            this.f9455C = false;
            this.f9456D.setVisibility(0);
        }
    }
}

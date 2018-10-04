package X;

import android.view.MenuInflater;
import android.view.View;

/* renamed from: X.0cJ */
public final class AnonymousClass0cJ {
    /* renamed from: B */
    public static View m5752B(AnonymousClass0cP anonymousClass0cP) {
        if (anonymousClass0cP.f7126C != null) {
            for (int i = 0; i < anonymousClass0cP.f7126C.size(); i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) anonymousClass0cP.f7126C.get(i);
                if (anonymousClass0IL != null && (anonymousClass0IL instanceof AnonymousClass0IM)) {
                    View performCreateOptionsView = ((AnonymousClass0IM) anonymousClass0IL).performCreateOptionsView();
                    if (performCreateOptionsView != null) {
                        return performCreateOptionsView;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static MenuInflater m5753C(AnonymousClass0cP anonymousClass0cP) {
        if (anonymousClass0cP.f7126C != null) {
            for (int i = 0; i < anonymousClass0cP.f7126C.size(); i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) anonymousClass0cP.f7126C.get(i);
                if (anonymousClass0IL != null && (anonymousClass0IL instanceof AnonymousClass0IN)) {
                    MenuInflater performGetMenuInflater = ((AnonymousClass0IM) anonymousClass0IL).performGetMenuInflater();
                    if (performGetMenuInflater != null) {
                        return performGetMenuInflater;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public static void m5754D(AnonymousClass0cP anonymousClass0cP) {
        if (anonymousClass0cP.f7126C != null) {
            for (int i = 0; i < anonymousClass0cP.f7126C.size(); i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) anonymousClass0cP.f7126C.get(i);
                if (anonymousClass0IL != null && (anonymousClass0IL instanceof AnonymousClass0IM)) {
                    ((AnonymousClass0IM) anonymousClass0IL).performOnInvalidateOptionsMenu();
                }
            }
        }
    }

    /* renamed from: E */
    public static boolean m5755E(AnonymousClass0IU anonymousClass0IU) {
        if (!(anonymousClass0IU instanceof AnonymousClass0cP)) {
            return false;
        }
        AnonymousClass0cP anonymousClass0cP = (AnonymousClass0cP) anonymousClass0IU;
        if (anonymousClass0cP.f7149Z || anonymousClass0cP.f7141R != null) {
            return false;
        }
        return true;
    }
}

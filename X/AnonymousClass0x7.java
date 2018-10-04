package X;

import android.os.Bundle;
import com.instagram.audience.FavoritesHomeFragment;
import com.instagram.audience.FavoritesListFragment;

/* renamed from: X.0x7 */
public final class AnonymousClass0x7 extends AnonymousClass0x6 {
    /* renamed from: A */
    public final AnonymousClass0IL mo1982A() {
        return mo1983B(AnonymousClass1Zf.MEMBERS);
    }

    /* renamed from: B */
    public final AnonymousClass0IL mo1983B(AnonymousClass1Zf anonymousClass1Zf) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("initial_tab", anonymousClass1Zf);
        AnonymousClass0IL favoritesHomeFragment = new FavoritesHomeFragment();
        favoritesHomeFragment.setArguments(bundle);
        return favoritesHomeFragment;
    }

    /* renamed from: C */
    public final AnonymousClass0IL mo1984C(String str, AnonymousClass1Zf anonymousClass1Zf) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putSerializable("tab", anonymousClass1Zf);
        AnonymousClass0IL favoritesListFragment = new FavoritesListFragment();
        favoritesListFragment.setArguments(bundle);
        return favoritesListFragment;
    }

    /* renamed from: D */
    public final AnonymousClass0IL mo1985D() {
        return new AnonymousClass1Vi();
    }

    /* renamed from: E */
    public final AnonymousClass0IL mo1986E(String str) {
        AnonymousClass0IL anonymousClass1Vi = new AnonymousClass1Vi();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        anonymousClass1Vi.setArguments(bundle);
        return anonymousClass1Vi;
    }
}

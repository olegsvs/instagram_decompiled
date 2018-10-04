package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4S4 */
public final class AnonymousClass4S4 extends AnonymousClass0nJ {
    /* renamed from: B */
    public final Set f54191B = new HashSet();
    /* renamed from: C */
    public int f54192C;

    /* renamed from: B */
    public final int m24252B() {
        return AnonymousClass4S7.m24257B(this.f54192C);
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m24253I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass4RS anonymousClass4RS = (AnonymousClass4RS) anonymousClass0oo;
        boolean contains = this.f54191B.contains(Integer.valueOf(i));
        anonymousClass4RS.f54096B.m24222A(i % 2 == 0 ? AnonymousClass4RO.TALL : AnonymousClass4RO.SHORT);
        anonymousClass4RS.f54096B.m24224C(contains);
        if (AnonymousClass0mE.I(anonymousClass4RS.f10370B)) {
            anonymousClass4RS.m24226V();
        } else {
            AnonymousClass0Nm.T(anonymousClass4RS.f10370B, new AnonymousClass4RR(anonymousClass4RS));
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m24254J(ViewGroup viewGroup, int i) {
        return new AnonymousClass4RS(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.equalizer_bar_item, viewGroup, false));
    }
}

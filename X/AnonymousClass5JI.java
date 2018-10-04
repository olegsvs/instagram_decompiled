package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.5JI */
public final class AnonymousClass5JI implements AnonymousClass3Af {
    /* renamed from: B */
    public final int f62045B;
    /* renamed from: C */
    public final AnonymousClass0Ro f62046C;
    /* renamed from: D */
    public final int f62047D;

    public AnonymousClass5JI(int i, int i2, AnonymousClass0Ro anonymousClass0Ro) {
        this.f62047D = i;
        this.f62045B = i2;
        this.f62046C = anonymousClass0Ro;
    }

    public final Class Ac() {
        return AnonymousClass5JH.class;
    }

    public final /* bridge */ /* synthetic */ int OU(AnonymousClass3Ag anonymousClass3Ag) {
        AnonymousClass5JH anonymousClass5JH = (AnonymousClass5JH) anonymousClass3Ag;
        return this.f62047D;
    }

    public final /* bridge */ /* synthetic */ void oC(AnonymousClass3Ag anonymousClass3Ag, AnonymousClass0oo anonymousClass0oo) {
        AnonymousClass5JH anonymousClass5JH = (AnonymousClass5JH) anonymousClass3Ag;
        ((AnonymousClass5JG) anonymousClass0oo).f62043B.A(this.f62046C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0oo zF(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        return new AnonymousClass5JG(LoadMoreButton.B(viewGroup.getContext(), viewGroup, this.f62045B));
    }
}

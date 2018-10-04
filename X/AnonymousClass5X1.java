package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.5X1 */
public final class AnonymousClass5X1 extends AnonymousClass4ki {
    public AnonymousClass5X1(AnonymousClass4kh anonymousClass4kh) {
        super(anonymousClass4kh);
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m27359I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass4km anonymousClass4km = (AnonymousClass4km) anonymousClass0oo;
        AnonymousClass4ko anonymousClass4ko = (AnonymousClass4ko) this.f56802B.get(i);
        anonymousClass4km.f56812B.setText(anonymousClass4ko.f56821E);
        anonymousClass4km.f56815E.setText(anonymousClass4ko.f56820D);
        anonymousClass4km.f56814D.setText(anonymousClass4km.f56814D.getContext().getString(anonymousClass4ko.f56818B.B()));
        String str = anonymousClass4ko.f56819C;
        if (str != null) {
            anonymousClass4km.f56813C.setUrl(str);
        } else {
            anonymousClass4km.f56813C.setImageDrawable(AnonymousClass0Ca.E(anonymousClass4km.f56813C.getContext(), C0164R.drawable.profile_anonymous_user));
        }
        anonymousClass4km.f10370B.setOnClickListener(new AnonymousClass4kl(this, anonymousClass4ko));
    }

    /* renamed from: J */
    public final AnonymousClass0oo m27360J(ViewGroup viewGroup, int i) {
        return new AnonymousClass4km(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.direct_action_row, viewGroup, false));
    }
}

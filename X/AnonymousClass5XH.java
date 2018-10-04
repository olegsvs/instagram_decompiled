package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.5XH */
public final class AnonymousClass5XH implements AnonymousClass4o2 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4o0 f65786B;

    public AnonymousClass5XH(AnonymousClass4o0 anonymousClass4o0) {
        this.f65786B = anonymousClass4o0;
    }

    public final void rC(ViewGroup viewGroup, AnonymousClass44v anonymousClass44v, int i, int i2) {
        AnonymousClass3Jh anonymousClass3Jh = (AnonymousClass3Jh) AnonymousClass0LH.E((AnonymousClass3Jh) anonymousClass44v.C().f20795E);
        AnonymousClass4o6 anonymousClass4o6 = (AnonymousClass4o6) viewGroup.getTag();
        AnonymousClass4o5 anonymousClass4o5 = this.f65786B.f57456M;
        anonymousClass4o6.f57473D.setUrl(anonymousClass3Jh.f40081D.x(anonymousClass4o6.f57473D.getContext()));
        anonymousClass4o6.f57472C.setText(anonymousClass3Jh.f40079B);
        anonymousClass4o6.f57474E.setText(anonymousClass3Jh.f40082E);
        anonymousClass4o6.f57471B.setOnClickListener(new AnonymousClass4o4(anonymousClass4o5, anonymousClass3Jh, i, i2));
    }

    public final ViewGroup yF(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.spotlight, viewGroup, false);
        viewGroup2.setTag(new AnonymousClass4o6(viewGroup2));
        return viewGroup2;
    }
}

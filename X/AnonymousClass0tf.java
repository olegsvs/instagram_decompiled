package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.0tf */
public final class AnonymousClass0tf implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0jw f11692B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0qv f11693C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0qw f11694D;

    public AnonymousClass0tf(AnonymousClass0jw anonymousClass0jw, AnonymousClass0qv anonymousClass0qv, AnonymousClass0qw anonymousClass0qw) {
        this.f11692B = anonymousClass0jw;
        this.f11693C = anonymousClass0qv;
        this.f11694D = anonymousClass0qw;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, 400312962);
        AnonymousClass0jw anonymousClass0jw = this.f11692B;
        AnonymousClass0qv anonymousClass0qv = this.f11693C;
        Object obj = this.f11694D;
        AnonymousClass0ms anonymousClass0ms = new AnonymousClass0ms(anonymousClass0qv, obj);
        AnonymousClass1Wi anonymousClass1Wi = new AnonymousClass1Wi(anonymousClass0jw.f9292E.getContext(), anonymousClass0jw.f9292E.getActivity());
        anonymousClass1Wi.f19600D = new AnonymousClass1WB(anonymousClass0jw, anonymousClass0ms, obj);
        new AnonymousClass0Sb(anonymousClass1Wi.f19598B).m4365G(AnonymousClass1Wi.m11741B(anonymousClass1Wi), new AnonymousClass5l6(anonymousClass1Wi)).m4363E(true).m4364F(true).m4361C().show();
        AnonymousClass0cQ.m5862L(this, -631161288, M);
    }
}

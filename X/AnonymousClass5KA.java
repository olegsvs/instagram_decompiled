package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5KA */
public final class AnonymousClass5KA implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1bK f62247B;
    /* renamed from: C */
    public final /* synthetic */ int f62248C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f62249D;

    public AnonymousClass5KA(AnonymousClass1bK anonymousClass1bK, int i, AnonymousClass0Ci anonymousClass0Ci) {
        this.f62247B = anonymousClass1bK;
        this.f62248C = i;
        this.f62249D = anonymousClass0Ci;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -2106545894);
        Object obj = this.f62247B;
        int i = this.f62248C;
        AnonymousClass0Ci anonymousClass0Ci = this.f62249D;
        AnonymousClass5K7.IGNORE_TAP.m26255A(obj, i, anonymousClass0Ci.getId());
        AnonymousClass1bK.D(obj, anonymousClass0Ci, AnonymousClass2MC.UserActionIgnore);
        AnonymousClass0cQ.L(this, 521552227, M);
    }
}

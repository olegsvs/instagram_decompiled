package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0sM */
public final class AnonymousClass0sM implements AnonymousClass0lS {
    /* renamed from: B */
    public final /* synthetic */ Context f11421B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lS f11422C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f11423D;

    public AnonymousClass0sM(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0lS anonymousClass0lS) {
        this.f11421B = context;
        this.f11423D = anonymousClass0Cm;
        this.f11422C = anonymousClass0lS;
    }

    public final void Mo(View view, int i, ViewGroup viewGroup) {
        view.setTag(AnonymousClass0s0.m8048B(this.f11421B, this.f11423D, view));
        this.f11422C.Mo(view, i, viewGroup);
    }
}

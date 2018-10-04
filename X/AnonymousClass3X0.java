package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: X.3X0 */
public final class AnonymousClass3X0 implements OnItemSelectedListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3X1 f41988B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3Vp f41989C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3Vr[] f41990D;

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AnonymousClass3X0(AnonymousClass3X1 anonymousClass3X1, AnonymousClass3Vp anonymousClass3Vp, AnonymousClass3Vr[] anonymousClass3VrArr) {
        this.f41988B = anonymousClass3X1;
        this.f41989C = anonymousClass3Vp;
        this.f41990D = anonymousClass3VrArr;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String B = this.f41989C.m19778B();
        AnonymousClass3Vr[] anonymousClass3VrArr = this.f41990D;
        String str = i < anonymousClass3VrArr.length ? anonymousClass3VrArr[i].f41803B : null;
        if (!AnonymousClass0LQ.B(str, B)) {
            AnonymousClass3Vp anonymousClass3Vp = this.f41989C;
            AnonymousClass0FZ.B().f2177B.edit().putString(anonymousClass3Vp.f41797G, str).apply();
            this.f41988B.f41991B.finish();
            AnonymousClass0IW.I(AnonymousClass0EM.f1972B.B(this.f41988B.f41991B, 0), this.f41988B.f41991B);
        }
    }
}

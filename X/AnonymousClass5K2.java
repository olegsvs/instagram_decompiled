package X;

import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5K2 */
public final class AnonymousClass5K2 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Jv f62226B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5Jx f62227C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5K3 f62228D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass5K4 f62229E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0Cm f62230F;

    public AnonymousClass5K2(AnonymousClass5Jx anonymousClass5Jx, AnonymousClass5Jv anonymousClass5Jv, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5K4 anonymousClass5K4, AnonymousClass5K3 anonymousClass5K3) {
        this.f62227C = anonymousClass5Jx;
        this.f62226B = anonymousClass5Jv;
        this.f62230F = anonymousClass0Cm;
        this.f62229E = anonymousClass5K4;
        this.f62228D = anonymousClass5K3;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1829058807);
        AnonymousClass5Jx anonymousClass5Jx = this.f62227C;
        AnonymousClass5Jv anonymousClass5Jv = this.f62226B;
        AnonymousClass0Cm anonymousClass0Cm = this.f62230F;
        AnonymousClass5K4 anonymousClass5K4 = this.f62229E;
        AnonymousClass5K3 anonymousClass5K3 = this.f62228D;
        anonymousClass5Jx.setVisibility(8);
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
        String lP = anonymousClass5Jv.lP();
        Editor edit = D.f2646B.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dismissed_find_people_card");
        stringBuilder.append(lP);
        edit.putBoolean(stringBuilder.toString(), true).apply();
        AnonymousClass0Ow anonymousClass0Ow = anonymousClass5K4.f62231B;
        int i = 0;
        for (int i2 = 0; i2 < anonymousClass0Ow.size(); i2++) {
            i |= ((AnonymousClass5Jx) anonymousClass0Ow.get(i2)).isShown();
        }
        if (i == 0) {
            anonymousClass5K3.Rd();
        }
        AnonymousClass0cQ.L(this, -1597798031, M);
    }
}

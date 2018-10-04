package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collections;

/* renamed from: X.4O4 */
public final class AnonymousClass4O4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bK f53503B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0MI f53504C;

    public AnonymousClass4O4(AnonymousClass5bK anonymousClass5bK, AnonymousClass0MI anonymousClass0MI) {
        this.f53503B = anonymousClass5bK;
        this.f53504C = anonymousClass0MI;
    }

    public final void run() {
        AnonymousClass5bK anonymousClass5bK = this.f53503B;
        AnonymousClass0MI anonymousClass0MI = this.f53504C;
        Context context = anonymousClass5bK.f66871l.getContext();
        AnonymousClass0P7 anonymousClass0P7 = anonymousClass0MI.E(0).f4134F;
        String x = anonymousClass0P7.x(context);
        int i = anonymousClass0P7.BC;
        int i2 = anonymousClass0P7.AC;
        String id = anonymousClass0MI.getId();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("highlight_");
        stringBuilder.append(id);
        String stringBuilder2 = stringBuilder.toString();
        AnonymousClass27l anonymousClass27l = new AnonymousClass27l(stringBuilder2, Collections.singletonList(AnonymousClass27n.m14514B(stringBuilder2, stringBuilder2, x, (float) i, (float) i2, 0.5f)));
        anonymousClass27l.f26359E = AnonymousClass27p.HIGHLIGHT;
        int round = Math.round((((float) Math.round(((float) AnonymousClass0Nm.J(context)) * 0.5f)) / ((float) i)) * ((float) i2));
        AnonymousClass0Ci pT = anonymousClass0MI.f3385R.pT();
        stringBuilder2 = anonymousClass0MI.getId();
        String id2 = pT.getId();
        Context context2 = context;
        String str = x;
        x = anonymousClass0MI.f3391X;
        Drawable anonymousClass2VC = new AnonymousClass2VC(context, new AnonymousClass27M(context2, stringBuilder2, id2, x, pT.uT(), str, pT.DQ(), r5, round));
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29359I = AnonymousClass2Le.AUTOMATICALLY_ADDED;
        anonymousClass2Lb.f29357G = false;
        anonymousClass2Lb.f29352B = false;
        anonymousClass5bK.f66867h.C(anonymousClass27l, anonymousClass2VC, anonymousClass2Lb);
    }
}

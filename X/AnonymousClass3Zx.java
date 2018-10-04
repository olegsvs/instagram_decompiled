package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.3Zx */
public final class AnonymousClass3Zx extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f42368B;
    /* renamed from: C */
    private final AnonymousClass0Ij f42369C;
    /* renamed from: D */
    private final boolean f42370D;
    /* renamed from: E */
    private final AnonymousClass0Cm f42371E;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3Zx(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ij anonymousClass0Ij, boolean z) {
        this.f42368B = context;
        this.f42371E = anonymousClass0Cm;
        this.f42369C = anonymousClass0Ij;
        this.f42370D = z;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        int I = AnonymousClass0cQ.I(this, -700974731);
        if (view == null) {
            Context context = this.f42368B;
            view = AnonymousClass3nG.m20654C(context, viewGroup);
            AnonymousClass3nF anonymousClass3nF = (AnonymousClass3nF) view.getTag();
            anonymousClass3nF.f44541K.setBackgroundResource(AnonymousClass0G5.F(context, C0164R.attr.peopleTagSearchItemBackground));
            anonymousClass3nF.f44542L.setTextColor(AnonymousClass0G5.D(context, C0164R.attr.textColorPrimary));
            anonymousClass3nF.f44535E.setTextColor(AnonymousClass0G5.D(context, C0164R.attr.textColorSecondary));
            anonymousClass3nF.f44533C.setBackground(new ColorDrawable(AnonymousClass0Ca.C(context, C0164R.color.grey_5)));
        }
        AnonymousClass3nG.m20653B((AnonymousClass3nF) view.getTag(), this.f42371E, (AnonymousClass0Ci) obj4, (Integer) obj3, null, false, false, false, this.f42370D, false, this.f42369C);
        AnonymousClass0cQ.H(this, -1256598203, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        Integer num = (Integer) obj2;
        anonymousClass0p9.A(0);
    }
}

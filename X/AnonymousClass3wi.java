package X;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0164R;

/* renamed from: X.3wi */
public final class AnonymousClass3wi extends AnonymousClass0oo {
    /* renamed from: B */
    public final View f47216B;
    /* renamed from: C */
    public final AnonymousClass2zX f47217C;
    /* renamed from: D */
    public ViewGroup f47218D;
    /* renamed from: E */
    private boolean f47219E;

    public AnonymousClass3wi(View view, AnonymousClass2zX anonymousClass2zX) {
        super(view);
        this.f47217C = anonymousClass2zX;
        View inflate = ((ViewStub) view.findViewById(C0164R.id.create_highlight_button_view_stub)).inflate();
        inflate.setTag(new AnonymousClass3c3(inflate));
        this.f47216B = inflate;
        AnonymousClass3c4.m20178B((AnonymousClass3c3) inflate.getTag(), this, true, C0164R.color.white, C0164R.color.black, 2, C0164R.drawable.highlights_tray_plus, C0164R.string.common_new);
        this.f47218D = (ViewGroup) view.findViewById(C0164R.id.tray_empty_state_container);
    }

    /* renamed from: B */
    public static void m21649B(AnonymousClass3wi anonymousClass3wi, boolean z) {
        AnonymousClass3wi anonymousClass3wi2 = anonymousClass3wi;
        if (!anonymousClass3wi.f47219E) {
            anonymousClass3wi.f47219E = true;
            Context context = anonymousClass3wi.f10370B.getContext();
            int i = 0;
            anonymousClass3wi.f47216B.measure(MeasureSpec.makeMeasureSpec(0, 0), 1073741824);
            int measuredWidth = anonymousClass3wi.f47216B.getMeasuredWidth();
            int J = AnonymousClass0Nm.J(context);
            if (z) {
                J -= measuredWidth;
            }
            float f = (float) measuredWidth;
            int round = Math.round(((float) J) / f);
            if (((float) (J - (measuredWidth * round))) >= f / 2.0f) {
                round++;
            }
            while (i < round) {
                View C = AnonymousClass3c4.m20179C(context, anonymousClass3wi2.f47218D);
                AnonymousClass3c4.m20178B((AnonymousClass3c3) C.getTag(), anonymousClass3wi2, true, C0164R.color.grey_1, 0, 0, null, false);
                anonymousClass3wi2.f47218D.addView(C);
                i++;
            }
        }
    }
}

package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5xt */
public final class AnonymousClass5xt extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f70400B;
    /* renamed from: C */
    public final AnonymousClass6F7 f70401C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5xt(Context context, AnonymousClass6F7 anonymousClass6F7) {
        this.f70400B = context;
        this.f70401C = anonymousClass6F7;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Context context;
        int i2;
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, 2042142131);
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj3;
        AnonymousClass5xu anonymousClass5xu = view != null ? (AnonymousClass5xu) view.getTag() : null;
        if (anonymousClass5xu == null || anonymousClass5xu.f70402B.length != anonymousClass2MJ.C()) {
            context = this.f70400B;
            int C = anonymousClass2MJ.C();
            view = new LinearLayout(context);
            AnonymousClass5xu anonymousClass5xu2 = new AnonymousClass5xu(C);
            for (i2 = 0; i2 < C; i2++) {
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.saved_product_grid_item_layout, view, false);
                viewGroup2.setTag(new AnonymousClass5xs(context, viewGroup2));
                view.addView(viewGroup2);
                anonymousClass5xu2.f70402B[i2] = (AnonymousClass5xs) viewGroup2.getTag();
            }
            view.setTag(anonymousClass5xu2);
        }
        int I2 = AnonymousClass0cQ.I(this, -566005163);
        context = this.f70400B;
        AnonymousClass5xu anonymousClass5xu3 = (AnonymousClass5xu) view.getTag();
        AnonymousClass6F7 anonymousClass6F7 = this.f70401C;
        for (i2 = 0; i2 < anonymousClass5xu3.f70402B.length; i2++) {
            AnonymousClass5xs anonymousClass5xs = anonymousClass5xu3.f70402B[i2];
            AnonymousClass3dV anonymousClass3dV = (AnonymousClass3dV) anonymousClass2MJ.A(i2);
            anonymousClass5xs.f70397B.setVisibility(0);
            anonymousClass5xs.f70398C.D(8);
            anonymousClass5xs.f70399D.D(0);
            if (anonymousClass3dV.f42899B.B() != null) {
                ((IgImageView) ((ViewGroup) anonymousClass5xs.f70399D.A()).findViewById(C0164R.id.saved_product_thumbnail)).setUrl(anonymousClass3dV.f42899B.B().C(context));
            }
            ((TextView) ((ViewGroup) anonymousClass5xs.f70399D.A()).findViewById(C0164R.id.saved_product_title)).setText(anonymousClass3dV.f42899B.f4988J);
            ((TextView) ((ViewGroup) anonymousClass5xs.f70399D.A()).findViewById(C0164R.id.saved_product_secondary_title)).setText(AnonymousClass1fg.C(anonymousClass3dV.f42899B, context, null));
            anonymousClass5xs.f70397B.setOnClickListener(new AnonymousClass5xp(anonymousClass6F7, anonymousClass3dV));
        }
        AnonymousClass0cQ.H(this, 540426269, I2);
        AnonymousClass0cQ.H(this, 1803146063, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}

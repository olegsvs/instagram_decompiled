package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.0qb */
public final class AnonymousClass0qb extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f10977B;
    /* renamed from: C */
    public final AnonymousClass0iH f10978C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass0qb(Context context, AnonymousClass0iH anonymousClass0iH) {
        this.f10977B = context;
        this.f10978C = anonymousClass0iH;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.m5859I(this, 1655645098);
        if (view == null) {
            view = LayoutInflater.from(this.f10977B).inflate(C0164R.layout.layout_end_of_feed_unit, viewGroup, false);
            view.setTag(new AnonymousClass0tO((IgImageView) view.findViewById(C0164R.id.end_of_feed_image), view.findViewById(C0164R.id.end_of_feed_hide_button), view.findViewById(C0164R.id.end_of_feed_top_divider), (TextView) view.findViewById(C0164R.id.end_of_feed_title), (TextView) view.findViewById(C0164R.id.end_of_feed_subtitle)));
        }
        AnonymousClass0qz anonymousClass0qz = (AnonymousClass0qz) obj;
        AnonymousClass0qy anonymousClass0qy = (AnonymousClass0qy) obj2;
        int I2 = AnonymousClass0cQ.m5859I(this, -575987843);
        AnonymousClass0tO anonymousClass0tO = (AnonymousClass0tO) view.getTag();
        AnonymousClass0iH anonymousClass0iH = this.f10978C;
        anonymousClass0tO.f11649E.setText(anonymousClass0qz.f11067E);
        anonymousClass0tO.f11648D.setText(anonymousClass0qz.f11066D);
        int i2 = 0;
        anonymousClass0tO.f11647C.setVisibility(anonymousClass0qz.f11065C ? 0 : 8);
        View view2 = anonymousClass0tO.f11650F;
        if (anonymousClass0qy.f11063B) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        anonymousClass0tO.f11646B.setOnClickListener(new AnonymousClass0tP(anonymousClass0iH));
        AnonymousClass0cQ.m5858H(this, -1958946797, I2);
        AnonymousClass0cQ.m5858H(this, 2030760165, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0qz anonymousClass0qz = (AnonymousClass0qz) obj;
        AnonymousClass0qy anonymousClass0qy = (AnonymousClass0qy) obj2;
        anonymousClass0p9.m7787A(0);
    }
}

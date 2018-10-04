package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import java.util.List;

/* renamed from: X.52c */
public final class AnonymousClass52c extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f59482B;
    /* renamed from: C */
    private final AnonymousClass0Ph f59483C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass52c(Context context, AnonymousClass0Ph anonymousClass0Ph) {
        this.f59482B = context;
        this.f59483C = anonymousClass0Ph;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, 500152585);
        if (view == null) {
            view = LayoutInflater.from(this.f59482B).inflate(C0164R.layout.fb_upsell_megaphone, viewGroup, false);
            AnonymousClass1WY anonymousClass1WY = new AnonymousClass1WY();
            anonymousClass1WY.f19544F = (TextView) view.findViewById(C0164R.id.title);
            anonymousClass1WY.f19542D = (TextView) view.findViewById(C0164R.id.message);
            anonymousClass1WY.f19541C = (ViewGroup) view.findViewById(C0164R.id.facepile);
            anonymousClass1WY.f19543E = (ImageWithTitleTextView) view.findViewById(C0164R.id.primary_button);
            anonymousClass1WY.f19540B = view.findViewById(C0164R.id.dismiss_button);
            view.setTag(anonymousClass1WY);
        }
        Context context = this.f59482B;
        AnonymousClass0XM anonymousClass0XM = (AnonymousClass0XM) obj3;
        AnonymousClass0Ph anonymousClass0Ph = this.f59483C;
        AnonymousClass1Vo anonymousClass1Vo = (AnonymousClass1Vo) anonymousClass0XM.f6154H;
        AnonymousClass1WY anonymousClass1WY2 = (AnonymousClass1WY) view.getTag();
        anonymousClass1WY2.f19544F.setText(anonymousClass1Vo.f19392E);
        anonymousClass1WY2.f19542D.setText(anonymousClass1Vo.f19390C);
        anonymousClass1WY2.f19543E.setText(anonymousClass1Vo.f19391D);
        anonymousClass1WY2.f19543E.setImageScaleX(0.8f);
        anonymousClass1WY2.f19543E.setImageScaleY(0.8f);
        anonymousClass1WY2.f19543E.getDrawable().mutate().setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context, C0164R.color.white)));
        anonymousClass1WY2.f19543E.setOnClickListener(new AnonymousClass52d(anonymousClass0Ph, anonymousClass0XM));
        anonymousClass1WY2.f19540B.setOnClickListener(new AnonymousClass52e(anonymousClass0Ph, anonymousClass0XM));
        List list = anonymousClass1Vo.f19389B;
        if (anonymousClass1WY2.f19541C.getChildCount() == 0 && list.size() == 6) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.facepile_overlap);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0164R.dimen.facepile_diameter);
            int i2 = dimensionPixelSize2 - dimensionPixelSize;
            double d = (double) i2;
            Double.isNaN(d);
            int i3 = (int) (d * -2.5d);
            for (int i4 = 0; i4 < 6; i4++) {
                LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                layoutParams.setMargins((i2 * i4) + i3, 0, 0, 0);
                layoutParams.gravity = 17;
                View circularImageView = new CircularImageView(context);
                circularImageView.setUrl((String) list.get(i4));
                circularImageView.setLayoutParams(layoutParams);
                circularImageView.H(context.getResources().getDimensionPixelSize(C0164R.dimen.facepile_stroke_width), AnonymousClass0Ca.C(context, C0164R.color.white));
                anonymousClass1WY2.f19541C.addView(circularImageView);
            }
        }
        AnonymousClass0cQ.H(this, 2127258753, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0XM anonymousClass0XM = (AnonymousClass0XM) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}

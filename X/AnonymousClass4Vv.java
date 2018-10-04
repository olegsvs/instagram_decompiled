package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.imagebutton.IgMultiImageButton;

/* renamed from: X.4Vv */
public final class AnonymousClass4Vv extends AnonymousClass0TA {
    /* renamed from: B */
    private AnonymousClass1ex f54785B;
    /* renamed from: C */
    private AnonymousClass0EE f54786C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4Vv(AnonymousClass1ex anonymousClass1ex, AnonymousClass0EE anonymousClass0EE) {
        this.f54785B = anonymousClass1ex;
        this.f54786C = anonymousClass0EE;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        View igMultiImageButton;
        int i2;
        View view2 = view;
        Object obj3 = obj2;
        Object obj4 = obj;
        int I = AnonymousClass0cQ.I(this, -458584984);
        Context context = viewGroup.getContext();
        if (view == null) {
            int i3 = this.f54785B.f21066B;
            view2 = new LinearLayout(context);
            AnonymousClass4Vw anonymousClass4Vw = new AnonymousClass4Vw();
            anonymousClass4Vw.f54788C = view2;
            anonymousClass4Vw.f54787B = new IgMultiImageButton[i3];
            int i4 = 0;
            while (i4 < i3) {
                Object obj5 = i4 < i3 + -1 ? 1 : null;
                igMultiImageButton = new IgMultiImageButton(context);
                LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (obj5 != null) {
                    AnonymousClass0eY.D(layoutParams, context.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing));
                }
                igMultiImageButton.setLayoutParams(layoutParams);
                igMultiImageButton.setEnableTouchOverlay(false);
                anonymousClass4Vw.f54787B[i4] = igMultiImageButton;
                view2.addView(igMultiImageButton);
                i4++;
            }
            view2.setTag(anonymousClass4Vw);
        }
        AnonymousClass4Vw anonymousClass4Vw2 = (AnonymousClass4Vw) view2.getTag();
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj4;
        boolean z = ((AnonymousClass1Xu) obj3).f19895C;
        AnonymousClass0EE anonymousClass0EE = this.f54786C;
        igMultiImageButton = anonymousClass4Vw2.f54788C;
        if (z) {
            i2 = 0;
        } else {
            i2 = anonymousClass4Vw2.f54788C.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing);
        }
        AnonymousClass0Nm.a(igMultiImageButton, i2);
        for (int i5 = 0; i5 < anonymousClass4Vw2.f54787B.length; i5++) {
            IgImageView igImageView = anonymousClass4Vw2.f54787B[i5];
            if (i5 < anonymousClass2MJ.m15208C()) {
                AnonymousClass4Vy anonymousClass4Vy = (AnonymousClass4Vy) anonymousClass2MJ.m15206A(i5);
                boolean z2 = true;
                boolean z3 = !AnonymousClass1fg.f21244B.contains(anonymousClass0EE.getModuleName()) && anonymousClass4Vy.m24395A();
                igImageView.H();
                igImageView.setColorFilter(null);
                igImageView.setVisibility(0);
                igImageView.setImageAlpha(255);
                igImageView.K(false);
                igImageView.setClickable(false);
                igImageView.setSource(anonymousClass0EE.getModuleName());
                igImageView.setUrl(anonymousClass4Vy.f54790B);
                igImageView.O(anonymousClass4Vy.m24397C());
                igImageView.M(false);
                igImageView.N(z3);
                if (z3 || !anonymousClass4Vy.m24396B()) {
                    z2 = false;
                }
                igImageView.J(z2);
            } else {
                AnonymousClass3O4.m19508D(igImageView);
            }
        }
        AnonymousClass0cQ.H(this, 1772331693, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj2;
        anonymousClass0p9.A(0);
    }
}

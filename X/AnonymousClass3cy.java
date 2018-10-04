package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.ui.widget.imagebutton.IgImageButton;

/* renamed from: X.3cy */
public final class AnonymousClass3cy extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f42831B;
    /* renamed from: C */
    public final AnonymousClass3d1 f42832C;
    /* renamed from: D */
    public final AnonymousClass1ex f42833D;
    /* renamed from: E */
    public final boolean f42834E;
    /* renamed from: F */
    public final AnonymousClass0EE f42835F;
    /* renamed from: G */
    public final AnonymousClass0jC f42836G;
    /* renamed from: H */
    public final AnonymousClass1TP f42837H;
    /* renamed from: I */
    public final AnonymousClass0Ci f42838I;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3cy(Context context, AnonymousClass3d1 anonymousClass3d1, boolean z, AnonymousClass1TP anonymousClass1TP, AnonymousClass0jC anonymousClass0jC, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass1ex anonymousClass1ex, AnonymousClass0EE anonymousClass0EE) {
        this.f42831B = context;
        this.f42832C = anonymousClass3d1;
        this.f42834E = z;
        this.f42837H = anonymousClass1TP;
        this.f42836G = anonymousClass0jC;
        this.f42838I = anonymousClass0Ci;
        this.f42833D = anonymousClass1ex;
        this.f42835F = anonymousClass0EE;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        Object obj3 = obj;
        Object obj4 = obj2;
        View view2 = view;
        int I = AnonymousClass0cQ.I(this, 112965465);
        if (view == null) {
            Context context = r5.f42831B;
            int i3 = r5.f42833D.f21066B;
            view2 = new LinearLayout(context);
            AnonymousClass3d2 anonymousClass3d2 = new AnonymousClass3d2(view2, i3);
            for (int i4 = 0; i4 < i3; i4++) {
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.selectable_grid_item, view2, false);
                anonymousClass3d2.f42847B[i4] = (IgImageButton) viewGroup2.findViewById(C0164R.id.image_button);
                anonymousClass3d2.f42849D[i4] = (CheckBox) viewGroup2.findViewById(C0164R.id.media_toggle);
                if (i4 < i3 - 1) {
                    ((LayoutParams) viewGroup2.getLayoutParams()).rightMargin = context.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing);
                }
                view2.addView(viewGroup2);
            }
            view2.setTag(anonymousClass3d2);
        }
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj3;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj4;
        int I2 = AnonymousClass0cQ.I(r5, 1114568950);
        AnonymousClass3d2 anonymousClass3d22 = (AnonymousClass3d2) view2.getTag();
        boolean z = anonymousClass1Xu.f19895C;
        int i5 = anonymousClass1Xu.f19896D;
        AnonymousClass3d1 anonymousClass3d1 = r5.f42832C;
        AnonymousClass1TP anonymousClass1TP = r5.f42837H;
        AnonymousClass0jC anonymousClass0jC = r5.f42836G;
        boolean z2 = r5.f42834E;
        AnonymousClass0Ci anonymousClass0Ci = r5.f42838I;
        AnonymousClass0EE anonymousClass0EE = r5.f42835F;
        View view3 = anonymousClass3d22.f42848C;
        if (z) {
            i2 = 0;
        } else {
            i2 = anonymousClass3d22.f42848C.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing);
        }
        AnonymousClass0Nm.a(view3, i2);
        for (int i6 = 0; i6 < anonymousClass3d22.f42847B.length; i6++) {
            IgImageButton igImageButton = anonymousClass3d22.f42847B[i6];
            if (i6 >= anonymousClass2MJ.m15208C()) {
                AnonymousClass3O4.m19508D(igImageButton);
                anonymousClass3d22.f42849D[i6].setVisibility(8);
            } else {
                AnonymousClass3dS anonymousClass3dS = (AnonymousClass3dS) anonymousClass2MJ.m15206A(i6);
                AnonymousClass0P7 anonymousClass0P7 = anonymousClass3dS.f42896B;
                if (z2) {
                    AnonymousClass0m3 RO = anonymousClass1TP.RO(anonymousClass0P7);
                    anonymousClass3d22.f42849D[i6].setVisibility(0);
                    anonymousClass3d22.f42849D[i6].setChecked(RO.f9699h);
                    igImageButton.f11501E = RO.f9699h;
                    igImageButton.invalidate();
                    igImageButton.setEnableTouchOverlay(false);
                } else {
                    anonymousClass3d22.f42849D[i6].setVisibility(8);
                }
                AnonymousClass3cz anonymousClass3cz = new AnonymousClass3cz(anonymousClass3d1, anonymousClass3dS, i5, i6);
                AnonymousClass3d0 anonymousClass3d0 = new AnonymousClass3d0(anonymousClass3d1, anonymousClass0P7, i5, i6);
                if (anonymousClass0P7.MA().equals(anonymousClass0Ci) || !anonymousClass0P7.qA()) {
                    AnonymousClass3O4.m19507C(igImageButton, anonymousClass0P7, anonymousClass0jC, null, anonymousClass3cz, anonymousClass3d0, i5, i6, null, anonymousClass0EE);
                } else {
                    AnonymousClass1YR.B(igImageButton, anonymousClass0P7, anonymousClass3cz, i5, i6, true);
                }
            }
        }
        AnonymousClass0cQ.H(r5, -424601216, I2);
        AnonymousClass0cQ.H(r5, -1473842813, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj2;
        anonymousClass0p9.A(0);
    }
}

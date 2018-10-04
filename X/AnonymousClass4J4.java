package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.4J4 */
public final class AnonymousClass4J4 extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f52600B;
    /* renamed from: C */
    public final AnonymousClass5SW f52601C;
    /* renamed from: D */
    public final AnonymousClass0Cm f52602D;

    public final int getViewTypeCount() {
        return 2;
    }

    public AnonymousClass4J4(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5SW anonymousClass5SW) {
        this.f52600B = context;
        this.f52602D = anonymousClass0Cm;
        this.f52601C = anonymousClass5SW;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        View view2 = view;
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, -2075311924);
        AnonymousClass4JJ anonymousClass4JJ = (AnonymousClass4JJ) obj3;
        if (view == null) {
            i2 = anonymousClass4JJ.f52650C;
            AnonymousClass0Cm anonymousClass0Cm = this.f52602D;
            Context context = this.f52600B;
            view2 = new LinearLayout(context);
            AnonymousClass4J7 anonymousClass4J7 = new AnonymousClass4J7(view2, i2);
            view2.setTag(anonymousClass4J7);
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.asset_picker_side_padding);
            view2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, resources.getDimensionPixelSize(C0164R.dimen.asset_picker_row_padding));
            int i3 = 0;
            while (i3 < i2) {
                View[] viewArr = anonymousClass4J7.f52615B;
                Object obj4 = i3 < i2 + -1 ? 1 : null;
                View inflate = LayoutInflater.from(view2.getContext()).inflate(C0164R.layout.asset_grid_row_item, view2, false);
                inflate.setTag(new AnonymousClass4J6(anonymousClass0Cm, inflate));
                LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (obj4 != null) {
                    AnonymousClass0eY.D(layoutParams, view2.getResources().getDimensionPixelSize(C0164R.dimen.asset_picker_cell_margin));
                }
                inflate.setLayoutParams(layoutParams);
                viewArr[i3] = inflate;
                view2.addView(anonymousClass4J7.f52615B[i3]);
                i3++;
            }
        }
        i2 = AnonymousClass0cQ.I(this, 2022892569);
        AnonymousClass0Cm anonymousClass0Cm2 = this.f52602D;
        AnonymousClass4J7 anonymousClass4J72 = (AnonymousClass4J7) view2.getTag();
        AnonymousClass2MJ anonymousClass2MJ = anonymousClass4JJ.f52649B;
        Object obj5 = this.f52601C;
        for (int i4 = 0; i4 < anonymousClass4J72.f52615B.length; i4++) {
            AnonymousClass4J6 anonymousClass4J6 = (AnonymousClass4J6) anonymousClass4J72.f52615B[i4].getTag();
            if (i4 < anonymousClass2MJ.m15208C()) {
                AnonymousClass27h anonymousClass27h = (AnonymousClass27h) anonymousClass2MJ.m15206A(i4);
                int i5 = 0;
                int i6 = anonymousClass27h.eT() == AnonymousClass27i.EMOJI ? anonymousClass4J6.f52609D : 0;
                anonymousClass4J6.f52607B.E();
                anonymousClass4J6.f52614I.A();
                anonymousClass4J6.f52614I.setPadding(i6, i6, i6, i6);
                anonymousClass4J6.f52614I.setVisibility(0);
                anonymousClass4J6.f52613H.setPadding(i6, i6, i6, i6);
                ConstrainedImageView constrainedImageView = anonymousClass4J6.f52613H;
                if (!anonymousClass27h.YV()) {
                    i5 = 8;
                }
                constrainedImageView.setVisibility(i5);
                anonymousClass4J6.f52614I.setFocusable(true);
                if (anonymousClass27h.eT() == AnonymousClass27i.EMOJI) {
                    int B = AnonymousClass2Hl.m14945B(anonymousClass27h.ZL());
                    i5 = anonymousClass4J6.f52614I.getWidth() - (i6 * 2);
                    if (B >= 0) {
                        if (i5 > 0) {
                            float f = ((float) i5) / ((float) anonymousClass4J6.f52610E);
                            anonymousClass4J6.f52611F.reset();
                            anonymousClass4J6.f52611F.setTranslate((float) ((-B) * anonymousClass4J6.f52610E), 0.0f);
                            anonymousClass4J6.f52611F.postScale(f, f);
                            anonymousClass4J6.f52614I.setImageMatrix(anonymousClass4J6.f52611F);
                            anonymousClass4J6.f52614I.setScaleType(ScaleType.MATRIX);
                            anonymousClass4J6.f52614I.setUrl(AnonymousClass2Hl.m14946C(anonymousClass27h.ZL()));
                            anonymousClass4J6.f52614I.setContentDescription(anonymousClass27h.ZL().f28577D);
                        }
                    }
                    anonymousClass4J6.f52614I.setImageMatrix(null);
                    anonymousClass4J6.f52614I.setScaleType(ScaleType.FIT_CENTER);
                    anonymousClass4J6.f52614I.setUrl(anonymousClass27h.getUri());
                    anonymousClass4J6.f52614I.setContentDescription(anonymousClass27h.ZL().f28577D);
                } else {
                    Context context2 = anonymousClass4J6.f52614I.getContext();
                    Resources resources2 = context2.getResources();
                    AnonymousClass4Jk C = AnonymousClass4Jl.m23842C(context2, anonymousClass0Cm2, anonymousClass27h.JS(), anonymousClass4J6.f52614I.getDrawable(), obj5);
                    anonymousClass4J6.f52614I.setImageDrawable(C.f52718C);
                    anonymousClass4J6.f52614I.setImageMatrix(null);
                    anonymousClass4J6.f52614I.setScaleType(ScaleType.FIT_CENTER);
                    anonymousClass4J6.f52614I.setContentDescription(resources2.getString(C.f52717B));
                }
                anonymousClass4J6.f52612G = anonymousClass27h;
                anonymousClass4J6.f52608C = obj5;
            } else {
                anonymousClass4J6.f52607B.E();
                anonymousClass4J6.f52614I.setVisibility(4);
                anonymousClass4J6.f52613H.setVisibility(8);
                anonymousClass4J6.f52612G = null;
                anonymousClass4J6.f52608C = null;
            }
        }
        AnonymousClass0cQ.H(this, -1552219998, i2);
        AnonymousClass0cQ.H(this, -1535985122, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass4JJ anonymousClass4JJ = (AnonymousClass4JJ) obj;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj2;
        if (anonymousClass4JJ.f52650C == 3) {
            anonymousClass0p9.A(0);
        } else if (anonymousClass4JJ.f52650C == 4) {
            anonymousClass0p9.A(1);
        }
    }
}

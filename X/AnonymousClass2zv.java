package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Set;

/* renamed from: X.2zv */
public final class AnonymousClass2zv extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f36745B;
    /* renamed from: C */
    public final AnonymousClass491 f36746C;
    /* renamed from: D */
    public final AnonymousClass2zx f36747D;
    /* renamed from: E */
    public final int f36748E;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2zv(Context context, AnonymousClass491 anonymousClass491, int i, AnonymousClass2zx anonymousClass2zx) {
        this.f36745B = context;
        this.f36748E = i;
        this.f36746C = anonymousClass491;
        this.f36747D = anonymousClass2zx;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        int i3;
        Object obj3 = obj2;
        Object obj4 = obj;
        View view2 = view;
        AnonymousClass2zv anonymousClass2zv = this;
        obj2 = AnonymousClass0cQ.I(this, 1427200249);
        if (view == null) {
            Context context = this.f36745B;
            int i4 = anonymousClass2zv.f36748E;
            obj = context.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing);
            DisplayMetrics G = AnonymousClass0Nm.G(context);
            int i5 = i4 - 1;
            i2 = (G.widthPixels - (obj * i5)) / i4;
            float H = AnonymousClass0Nm.H(G);
            view2 = new LinearLayout(context);
            AnonymousClass30E anonymousClass30E = new AnonymousClass30E(view2, i4);
            int i6 = 0;
            while (i6 < i4) {
                Math.round(((float) i2) / H);
                MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) LayoutInflater.from(context).inflate(C0164R.layout.layout_highlights_media_item, view2, false);
                mediaFrameLayout.setAspectRatio(H);
                i = new AnonymousClass30D(mediaFrameLayout, (IgImageView) mediaFrameLayout.findViewById(C0164R.id.media_image), (CheckBox) mediaFrameLayout.findViewById(C0164R.id.media_toggle), mediaFrameLayout.findViewById(C0164R.id.selected_item_overlay));
                mediaFrameLayout.setTag(i);
                anonymousClass30E.f36789C[i6] = i;
                LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2);
                layoutParams.rightMargin = i6 == i5 ? 0 : obj;
                view2.addView(i.f36783C, layoutParams);
                i6++;
            }
            view2.setTag(anonymousClass30E);
        }
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj4;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj3;
        i2 = AnonymousClass0cQ.I(anonymousClass2zv, -1528826987);
        AnonymousClass30E anonymousClass30E2 = (AnonymousClass30E) view2.getTag();
        AnonymousClass491 anonymousClass491 = anonymousClass2zv.f36746C;
        Set bR = anonymousClass2zv.f36747D.bR();
        View view3 = anonymousClass30E2.f36788B;
        boolean z = anonymousClass1Xu.f19895C;
        if (z) {
            i3 = 0;
        } else {
            i3 = anonymousClass30E2.f36788B.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing);
        }
        AnonymousClass0Nm.a(view3, i3);
        for (int i7 = 0; i7 < anonymousClass30E2.f36789C.length; i7++) {
            AnonymousClass30D anonymousClass30D = anonymousClass30E2.f36789C[i7];
            if (i7 < anonymousClass2MJ.m15208C()) {
                AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) anonymousClass2MJ.m15206A(i7);
                i = bR.contains(anonymousClass0P7.getId());
                anonymousClass30D.f36782B.E();
                anonymousClass30D.f36783C.setVisibility(0);
                anonymousClass30D.f36785E.setVisibility(0);
                anonymousClass30D.f36785E.setChecked(i);
                anonymousClass30D.f36787G.setVisibility(i != 0 ? 0 : 8);
                anonymousClass30D.f36784D.setVisibility(0);
                anonymousClass30D.f36784D.setUrl(anonymousClass0P7.w(anonymousClass30D.f36783C.getMeasuredWidth()));
                anonymousClass30D.f36786F = new AnonymousClass3wp(anonymousClass491, anonymousClass0P7);
            } else {
                anonymousClass30D.f36783C.setVisibility(8);
                anonymousClass30D.f36784D.setVisibility(8);
                anonymousClass30D.f36785E.setVisibility(8);
                anonymousClass30D.f36787G.setVisibility(8);
                anonymousClass30D.f36782B.E();
                anonymousClass30D.f36786F = null;
            }
        }
        AnonymousClass0cQ.H(anonymousClass2zv, -1672234637, i2);
        AnonymousClass0cQ.H(anonymousClass2zv, 1722911341, obj2);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj2;
        anonymousClass0p9.A(0);
    }
}

package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.ui.widget.triangleshape.TriangleShape;

/* renamed from: X.3PH */
public final class AnonymousClass3PH {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m19547B(android.content.Context r3, X.AnonymousClass0Cm r4, X.AnonymousClass3PG r5, X.AnonymousClass44w r6, java.util.List r7, int r8, java.lang.String r9, X.AnonymousClass40D r10, android.os.Parcelable r11, X.AnonymousClass0db r12) {
        /*
        if (r10 != 0) goto L_0x0009;
    L_0x0002:
        r1 = r5.f40835D;
        r0 = 0;
        r1.setOnScrollListener(r0);
        goto L_0x0013;
    L_0x0009:
        r1 = r5.f40835D;
        r0 = new X.3PF;
        r0.<init>(r10);
        r1.setOnScrollListener(r0);
    L_0x0013:
        if (r9 != 0) goto L_0x001e;
    L_0x0015:
        r1 = r5.f40837F;
        r0 = 2131692808; // 0x7f0f0d08 float:1.9014727E38 double:1.053196184E-314;
        r1.setText(r0);
        goto L_0x0023;
    L_0x001e:
        r0 = r5.f40837F;
        r0.setText(r9);
    L_0x0023:
        if (r8 == 0) goto L_0x0036;
    L_0x0025:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 23;
        if (r1 >= r0) goto L_0x0031;
    L_0x002b:
        r0 = r5.f40837F;
        r0.setTextAppearance(r3, r8);
        goto L_0x0036;
    L_0x0031:
        r0 = r5.f40837F;
        r0.setTextAppearance(r8);
    L_0x0036:
        r1 = r5.f40834C;
        r0 = 2131692660; // 0x7f0f0c74 float:1.9014426E38 double:1.053196111E-314;
        r1.setText(r0);
        r1 = r5.f40834C;
        r0 = new X.3PE;
        r0.<init>(r6);
        r1.setOnClickListener(r0);
        r0 = r5.f40835D;
        r2 = r0.getAdapter();
        r2 = (X.AnonymousClass3P7) r2;
        if (r2 != 0) goto L_0x007e;
    L_0x0052:
        r0 = r6.f49617C;
        r0.clear();
        r0 = r6.f49618D;
        r0.clear();
        r2 = new X.3P7;
        r0 = new X.3PD;
        r0.<init>(r5);
        r2.<init>(r3, r4, r0);
        r2.f40811D = r6;
        r2.f40813F = r7;
        r2.notifyDataSetChanged();
        r0 = r5.f40835D;
        r0.setAdapter(r2);
        if (r11 == 0) goto L_0x009e;
    L_0x0074:
        r0 = r5.f40835D;
        r0 = r0.getLayoutManager();
        r0.AA(r11);
        goto L_0x009e;
    L_0x007e:
        r0 = r2.f40813F;
        r0 = r0.equals(r7);
        r0 = r0 ^ 1;
        if (r0 == 0) goto L_0x0099;
    L_0x0088:
        r2.f40811D = r6;
        r2.f40813F = r7;
        r2.notifyDataSetChanged();
        if (r11 == 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0074;
    L_0x0092:
        r1 = r5.f40835D;
        r0 = 0;
        r1.FA(r0);
        goto L_0x009e;
    L_0x0099:
        r2.f40811D = r6;
        r2.notifyDataSetChanged();
    L_0x009e:
        r2.f40812E = r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3PH.B(android.content.Context, X.0Cm, X.3PG, X.44w, java.util.List, int, java.lang.String, X.40D, android.os.Parcelable, X.0db):void");
    }

    /* renamed from: C */
    public static View m19548C(Context context, ViewGroup viewGroup, View view, AnonymousClass0la anonymousClass0la) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.similar_accounts_carousel_redesign, viewGroup, false);
        AnonymousClass3PG anonymousClass3PG = new AnonymousClass3PG();
        anonymousClass3PG.f40836E = (TriangleShape) inflate.findViewById(C0164R.id.similar_accounts_notch);
        anonymousClass3PG.f40833B = inflate.findViewById(C0164R.id.bottom_divider);
        View findViewById = inflate.findViewById(C0164R.id.top_divider);
        if (view != null) {
            anonymousClass3PG.f40836E.setNotchCenterXOn(view);
            anonymousClass3PG.f40833B.setVisibility(0);
            findViewById.setVisibility(8);
        } else {
            anonymousClass3PG.f40836E.setVisibility(8);
            anonymousClass3PG.f40833B.setVisibility(8);
            findViewById.setVisibility(0);
        }
        anonymousClass3PG.f40837F = (TextView) inflate.findViewById(C0164R.id.netego_carousel_title);
        ViewStub viewStub = (ViewStub) inflate.findViewById(C0164R.id.netego_carousel_cta);
        viewStub.setLayoutResource(C0164R.layout.netego_carousel_text_cta);
        anonymousClass3PG.f40834C = (TextView) viewStub.inflate();
        if (VERSION.SDK_INT < 21) {
            anonymousClass3PG.f40837F.getPaint().setFakeBoldText(true);
            anonymousClass3PG.f40834C.getPaint().setFakeBoldText(true);
        }
        anonymousClass3PG.f40835D = (HorizontalRecyclerPager) inflate.findViewById(C0164R.id.netego_carousel_view);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.card_spacing);
        anonymousClass3PG.f40835D.A(new AnonymousClass0ru(dimensionPixelSize, dimensionPixelSize));
        anonymousClass3PG.f40835D.setHorizontalPeekOffset(context.getResources().getDimensionPixelSize(C0164R.dimen.carousel_horizontal_padding));
        anonymousClass3PG.f40835D.setLayoutManager(anonymousClass0la);
        inflate.setTag(anonymousClass3PG);
        return inflate;
    }
}

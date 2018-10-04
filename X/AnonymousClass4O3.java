package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4O3 */
public final class AnonymousClass4O3 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bK f53501B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f53502C;

    public AnonymousClass4O3(AnonymousClass5bK anonymousClass5bK, AnonymousClass0P7 anonymousClass0P7) {
        this.f53501B = anonymousClass5bK;
        this.f53502C = anonymousClass0P7;
    }

    public final void run() {
        AnonymousClass5bK anonymousClass5bK = this.f53501B;
        AnonymousClass0P7 anonymousClass0P7 = this.f53502C;
        AnonymousClass0P7 S = anonymousClass0P7.kA() ? anonymousClass0P7.S(anonymousClass5bK.f66846M) : anonymousClass0P7;
        Context context = anonymousClass5bK.f66871l.getContext();
        String EA = S.EA();
        String x = S.x(context);
        int i = S.BC;
        int i2 = S.AC;
        int round = Math.round(AnonymousClass0Nm.C(context, 10));
        int round2 = Math.round(AnonymousClass0Nm.C(context, 8));
        float floatValue = ((Double) AnonymousClass0CC.YU.G()).floatValue();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("media_simple_");
        stringBuilder.append(EA);
        String stringBuilder2 = stringBuilder.toString();
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = floatValue;
        AnonymousClass27n B = AnonymousClass27n.m14514B(stringBuilder2, stringBuilder2, x, f, f2, f3);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("media_post_");
        stringBuilder3.append(EA);
        stringBuilder2 = stringBuilder3.toString();
        AnonymousClass27n B2 = AnonymousClass27n.m14514B(stringBuilder2, stringBuilder2, x, f, f2, f3);
        List arrayList = new ArrayList();
        arrayList.add(B);
        arrayList.add(B2);
        stringBuilder = new StringBuilder();
        stringBuilder.append("media_");
        stringBuilder.append(EA);
        AnonymousClass27l anonymousClass27l = new AnonymousClass27l(stringBuilder.toString(), arrayList);
        anonymousClass27l.f26359E = AnonymousClass27p.MEDIA;
        int round3 = Math.round(((float) AnonymousClass0Nm.J(context)) * floatValue);
        int round4 = Math.round((((float) round3) / ((float) i)) * ((float) i2));
        int i3 = round3 - (round * 2);
        Resources resources = context.getResources();
        Layout layout = null;
        if (anonymousClass0P7.SA()) {
            i2 = AnonymousClass0G5.D(context, C0164R.attr.textColorPrimary);
            int D = AnonymousClass0G5.D(context, C0164R.attr.textColorRegularLink);
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = D;
            textPaint.setTextSize(resources.getDimension(C0164R.dimen.font_medium));
            textPaint.setColor(i2);
            AnonymousClass0qI anonymousClass0qI = new AnonymousClass0qI();
            anonymousClass0qI.f10899E = textPaint;
            anonymousClass0qI.f10900F = i3;
            anonymousClass0qI.f10897C = (float) resources.getDimensionPixelSize(C0164R.dimen.feed_comment_extra_line_space);
            layout = AnonymousClass0zW.B(anonymousClass0P7.f4028c, AnonymousClass0ty.B(false, false, false), anonymousClass0qI.A(), context, AnonymousClass0kW.E(anonymousClass5bK.f66868i));
        }
        String id = anonymousClass0P7.MA().getId();
        String uT = anonymousClass0P7.MA().uT();
        String DQ = anonymousClass0P7.MA().DQ();
        String x2 = S.x(context);
        List arrayList2 = new ArrayList();
        for (AnonymousClass27n anonymousClass27n : anonymousClass27l.f26360F) {
            if (anonymousClass27n.f26370G.startsWith("media_post_")) {
                arrayList2.add(new AnonymousClass27Q(context, AnonymousClass27P.f26197C, EA, id, uT, DQ, x2, layout, round3, round4, round, round2));
            } else if (anonymousClass27n.f26370G.startsWith("media_simple_")) {
                arrayList2.add(new AnonymousClass27Q(context, AnonymousClass27P.SIMPLE, EA, id, uT, DQ, x2, layout, round3, round4, round, round2));
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("invalid static sticker configuration");
        }
        Drawable anonymousClass2VC = new AnonymousClass2VC(context, arrayList2);
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29359I = AnonymousClass2Le.AUTOMATICALLY_ADDED;
        anonymousClass2Lb.f29357G = false;
        anonymousClass2Lb.f29352B = false;
        anonymousClass5bK.f66867h.C(anonymousClass27l, anonymousClass2VC, anonymousClass2Lb);
    }
}

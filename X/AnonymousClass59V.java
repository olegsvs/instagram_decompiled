package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.59V */
public final class AnonymousClass59V {
    /* renamed from: B */
    public AnonymousClass5AM f60622B;
    /* renamed from: C */
    public View f60623C;
    /* renamed from: D */
    public final AnonymousClass3bt f60624D;

    public AnonymousClass59V(AnonymousClass0Cm anonymousClass0Cm) {
        this.f60624D = new AnonymousClass3bt(anonymousClass0Cm);
    }

    /* renamed from: B */
    public static void m25867B(Context context, List list, AnonymousClass1IU anonymousClass1IU, long j) {
        Iterator it = anonymousClass1IU.f16883I.iterator();
        while (it.hasNext() && list.size() < 5) {
            AnonymousClass1IW anonymousClass1IW = (AnonymousClass1IW) it.next();
            if (anonymousClass1IW.f16889F > j) {
                list.add(new AnonymousClass5AO(anonymousClass1IW.f16887D, new AnonymousClass5AN(context, C0164R.drawable.reel_questions_badge_icon)));
            }
        }
    }
}

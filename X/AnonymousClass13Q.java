package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.13Q */
public final class AnonymousClass13Q {
    /* renamed from: B */
    public static void m9108B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass13P anonymousClass13P, AnonymousClass0ov anonymousClass0ov, int i, AnonymousClass0hP anonymousClass0hP, List list, boolean z) {
        AnonymousClass16g.m9432B(context, anonymousClass0Cm, anonymousClass13P.f13721C, anonymousClass0ov, i, anonymousClass0hP, list, z, false, false);
        AnonymousClass1NA.m11032B(anonymousClass0Cm, anonymousClass13P.f13720B, anonymousClass0ov);
    }

    /* renamed from: C */
    public static AnonymousClass13P m9109C(Context context, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.reel_item_livewith_unit, viewGroup, false);
        AnonymousClass13P anonymousClass13P = new AnonymousClass13P(inflate, context, z);
        inflate.setTag(anonymousClass13P);
        return anonymousClass13P;
    }
}

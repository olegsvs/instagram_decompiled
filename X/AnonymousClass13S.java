package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.13S */
public final class AnonymousClass13S {
    /* renamed from: B */
    public static void m9110B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass13R anonymousClass13R, AnonymousClass0ov anonymousClass0ov, int i, AnonymousClass0ov anonymousClass0ov2, AnonymousClass0hP anonymousClass0hP, List list, boolean z, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass16g.m9432B(context, anonymousClass0Cm, anonymousClass13R.f13725C, anonymousClass0ov, i, anonymousClass0hP, list, z, false, false);
        AnonymousClass1IP.m10650B(anonymousClass13R.f13724B, anonymousClass0ov, i, anonymousClass0ov2, anonymousClass0EE);
    }

    /* renamed from: C */
    public static AnonymousClass13R m9111C(Context context, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.reel_item_replay_unit, viewGroup, false);
        AnonymousClass13R anonymousClass13R = new AnonymousClass13R(inflate, context, z);
        inflate.setTag(anonymousClass13R);
        return anonymousClass13R;
    }
}

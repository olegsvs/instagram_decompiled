package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;

/* renamed from: X.27H */
public final class AnonymousClass27H {
    /* renamed from: B */
    public static AnonymousClass2eY m14495B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass27n anonymousClass27n, AnonymousClass294 anonymousClass294) {
        int i;
        String str;
        Context context2 = context;
        Resources resources = context2.getResources();
        AnonymousClass27n anonymousClass27n2 = anonymousClass27n;
        AnonymousClass27n anonymousClass27n3 = anonymousClass27n2.f26369F;
        int round = Math.round(anonymousClass27n2.f26371H * anonymousClass27n2.f26373J);
        if (anonymousClass27n3 == null) {
            i = -1;
        } else {
            i = Math.round(anonymousClass27n3.f26373J * anonymousClass27n3.f26371H);
        }
        if (i > round) {
            str = anonymousClass27n2.f26369F.f26372I;
        } else {
            str = null;
        }
        return new AnonymousClass2eY(context2, anonymousClass0Cm, anonymousClass27n2.f26372I, str, anonymousClass27n2.m14515A(), anonymousClass27n2.f26373J / anonymousClass27n2.f26371H, (float) resources.getDimensionPixelSize(C0164R.dimen.loading_indicator_drawable_stroke_width), resources.getDimensionPixelSize(C0164R.dimen.loading_indicator_drawable_size), AnonymousClass0Ca.C(context2, C0164R.color.white_20_transparent), AnonymousClass0Ca.C(context2, C0164R.color.white_60_transparent), anonymousClass294);
    }

    /* renamed from: C */
    public static AnonymousClass25n m14496C(Context context, float f) {
        Resources resources = context.getResources();
        return new AnonymousClass25n((float) resources.getDimensionPixelSize(C0164R.dimen.loading_indicator_drawable_stroke_width), f, resources.getDimensionPixelSize(C0164R.dimen.loading_indicator_drawable_size), resources.getDimensionPixelSize(C0164R.dimen.loading_indicator_drawable_size), AnonymousClass0Ca.C(context, C0164R.color.white_20_transparent), AnonymousClass0Ca.C(context, C0164R.color.white_60_transparent));
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.4Yh */
public abstract class AnonymousClass4Yh {
    /* renamed from: B */
    public static void m24479B(Context context, AnonymousClass0eT anonymousClass0eT) {
        context = context.getResources().getDimensionPixelOffset(C0164R.dimen.direct_action_bar_horizontal_padding);
        View view = anonymousClass0eT.f7726B;
        view.setPadding(context, view.getPaddingTop(), context, view.getPaddingBottom());
    }
}

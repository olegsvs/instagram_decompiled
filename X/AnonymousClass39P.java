package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.39P */
public final class AnonymousClass39P {
    /* renamed from: B */
    public static void m18768B(View view, AnonymousClass39H anonymousClass39H) {
        view.setPadding(AnonymousClass39P.m18770D(anonymousClass39H.f38384C, view.getContext()), AnonymousClass39P.m18770D(anonymousClass39H.f38386E, view.getContext()), AnonymousClass39P.m18770D(anonymousClass39H.f38385D, view.getContext()), AnonymousClass39P.m18770D(anonymousClass39H.f38383B, view.getContext()));
    }

    /* renamed from: C */
    public static GradientDrawable m18769C(Context context, List list, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) context.getResources().getDimensionPixelSize(C0164R.dimen.canvas_button_corner_radius));
        if (list == null || !list.contains(AnonymousClass39B.f38344E)) {
            gradientDrawable.setColor(i);
        } else {
            gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(C0164R.dimen.canvas_button_stroke), i);
            gradientDrawable.setColor(0);
        }
        return gradientDrawable;
    }

    /* renamed from: D */
    public static int m18770D(AnonymousClass39G anonymousClass39G, Context context) {
        if (anonymousClass39G == null) {
            return 0;
        }
        float f = 0.0f;
        switch (anonymousClass39G.f38381C.ordinal()) {
            case 1:
                f = anonymousClass39G.f38380B;
                break;
            case 2:
                f = AnonymousClass0Nm.B(context, anonymousClass39G.f38380B);
                break;
            default:
                break;
        }
        return Math.round(f);
    }
}

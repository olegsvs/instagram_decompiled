package X;

import android.content.Context;
import android.widget.Toast;

/* renamed from: X.0IG */
public final class AnonymousClass0IG {
    /* renamed from: B */
    public static Toast m2160B(Context context, CharSequence charSequence, int i, int i2) {
        context = Toast.makeText(context, charSequence, 0);
        context.setGravity(81, i, i2);
        context.show();
        return context;
    }

    /* renamed from: C */
    public static Toast m2161C(Context context, int i) {
        return AnonymousClass0IG.m2162D(context, context.getResources().getString(i));
    }

    /* renamed from: D */
    public static Toast m2162D(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return makeText;
    }

    /* renamed from: E */
    public static void m2163E(int i) {
        AnonymousClass0IG.m2161C(AnonymousClass0EV.f1977B, i);
    }

    /* renamed from: F */
    public static void m2164F(int i) {
        AnonymousClass0IG.m2165G(AnonymousClass0EV.f1977B, i);
    }

    /* renamed from: G */
    public static void m2165G(Context context, int i) {
        Toast makeText = Toast.makeText(context, i, 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
    }

    /* renamed from: H */
    public static void m2166H(Context context, CharSequence charSequence) {
        Toast makeText = Toast.makeText(context, charSequence, 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
    }

    /* renamed from: I */
    public static void m2167I(CharSequence charSequence) {
        AnonymousClass0IG.m2166H(AnonymousClass0EV.f1977B, charSequence);
    }
}

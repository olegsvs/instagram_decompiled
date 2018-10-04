package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.0z6 */
public final class AnonymousClass0z6 {
    /* renamed from: B */
    public static final float[] f12945B = new float[]{25.0f, 50.0f, 75.0f};

    /* renamed from: B */
    public static void m8665B(AnonymousClass0z5 anonymousClass0z5) {
        if (anonymousClass0z5.f12943B == null) {
            return;
        }
        if (AnonymousClass0z6.m8667D()) {
            anonymousClass0z5.f12944C.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1A9(anonymousClass0z5));
            return;
        }
        for (int i = 0; i < f12945B.length; i++) {
            AnonymousClass0Nm.m3436O(anonymousClass0z5.f12943B[i]);
        }
    }

    /* renamed from: C */
    public static AnonymousClass0z5 m8666C(ViewGroup viewGroup) {
        return new AnonymousClass0z5(viewGroup, AnonymousClass0z6.m8668E(viewGroup));
    }

    /* renamed from: D */
    public static boolean m8667D() {
        return !AnonymousClass0CB.m840J() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("show_media_percentage_debug_lines", false);
    }

    /* renamed from: E */
    public static View[] m8668E(ViewGroup viewGroup) {
        if (!AnonymousClass0z6.m8667D()) {
            return null;
        }
        View[] viewArr = new View[f12945B.length];
        for (int i = 0; i < f12945B.length; i++) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.media_debug_line, null, false);
            viewGroup.addView(inflate);
            viewArr[i] = inflate;
        }
        return viewArr;
    }
}

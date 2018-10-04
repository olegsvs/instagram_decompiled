package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.4Mr */
public final class AnonymousClass4Mr {
    /* renamed from: B */
    public static void m24022B(View view, View view2, float f, int i, int i2) {
        AnonymousClass4Mr.m24025E(view);
        AnonymousClass4Mr.m24025E(view2);
        if (i == i2) {
            AnonymousClass4Mr.m24026F(view, view2, 1.0f);
        } else {
            AnonymousClass4Mr.m24026F(view, view2, 1.0f - f);
        }
    }

    /* renamed from: C */
    public static void m24023C(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
        View childAt;
        float C = (float) AnonymousClass0dh.C((double) (1.0f - f), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 0.4000000059604645d, 1.0d);
        float C2 = (float) AnonymousClass0dh.C((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 0.4000000059604645d, 1.0d);
        ReboundHorizontalScrollView reboundHorizontalScrollView2 = reboundHorizontalScrollView;
        int i3 = i;
        if (i3 > 1) {
            AnonymousClass4Mr.m24024D(reboundHorizontalScrollView2.getChildAt(i - 1), 0.4f);
        }
        int i4 = i2;
        if (i4 < reboundHorizontalScrollView2.getChildCount() - 2) {
            childAt = reboundHorizontalScrollView2.getChildAt(i2 + 1);
            childAt.setAlpha(0.4f);
            AnonymousClass4Mr.m24024D(childAt, 0.4f);
        }
        View childAt2 = reboundHorizontalScrollView2.getChildAt(i3);
        childAt = reboundHorizontalScrollView2.getChildAt(i4);
        if (i3 != i4) {
            childAt2.setAlpha(C);
            childAt.setAlpha(C2);
            AnonymousClass4Mr.m24024D(childAt2, C);
            AnonymousClass4Mr.m24024D(childAt, C2);
            return;
        }
        childAt2.setAlpha(C);
        AnonymousClass4Mr.m24024D(childAt2, C);
    }

    /* renamed from: D */
    private static void m24024D(View view, float f) {
        Drawable background = view.getBackground();
        if (background != null) {
            background.mutate().setAlpha((int) (f * 255.0f));
        }
    }

    /* renamed from: E */
    private static void m24025E(View view) {
        view.setAlpha(0.0f);
        view.setTranslationX(0.0f);
        view.setRotationY(0.0f);
        view.setPivotX(((float) view.getWidth()) / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
    }

    /* renamed from: F */
    private static void m24026F(View view, View view2, float f) {
        View view3 = view;
        float width = (float) view3.getWidth();
        float height = (float) view3.getHeight();
        double d = (double) f;
        float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, -90.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        float C2 = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (-width), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        double d2 = d;
        view3.setAlpha((float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d));
        view3.setTranslationX(C2);
        view3.setRotationY(C);
        view3.setPivotX(width);
        view3.setPivotY(height / 2.0f);
        View view4 = view2;
        C = (float) view4.getWidth();
        height = (float) view4.getHeight();
        double d3 = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        double d4 = 1.0d;
        double d5 = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        C2 = (float) AnonymousClass0dh.C(d2, d3, d4, d5, 0);
        C = (float) AnonymousClass0dh.C(d2, d3, d4, d5, (double) C);
        view4.setAlpha((float) AnonymousClass0dh.C(d2, d3, d4, 1.0d, null));
        view4.setTranslationX(C);
        view4.setRotationY(C2);
        view4.setPivotX(0.0f);
        view4.setPivotY(height / 2.0f);
    }
}

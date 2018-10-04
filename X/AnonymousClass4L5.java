package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.4L5 */
public abstract class AnonymousClass4L5 {
    /* renamed from: B */
    public static int m23929B(Set set, boolean z) {
        int i = 3000;
        for (Drawable B : set) {
            i = Math.max(i, (int) AnonymousClass3G3.m19157B(B));
        }
        if (z) {
            i = Math.max(i, 5000);
        }
        return Math.min(i, 15000);
    }

    /* renamed from: C */
    public static void m23930C(Context context, AnonymousClass0OA anonymousClass0OA, AnonymousClass3nl anonymousClass3nl, int i, AnonymousClass1Oi anonymousClass1Oi, Bitmap bitmap) {
        anonymousClass0OA.AD = i;
        anonymousClass0OA.zC = ((Integer) AnonymousClass1Ta.C().get(i, Integer.valueOf(100))).intValue();
        List arrayList = new ArrayList();
        arrayList.add(anonymousClass1Oi);
        anonymousClass0OA.yC = arrayList;
        BackgroundGradientColors backgroundGradientColors = anonymousClass3nl.f44595C;
        if (backgroundGradientColors != null) {
            BackgroundGradientColors backgroundGradientColors2 = new BackgroundGradientColors(backgroundGradientColors.f26047C, backgroundGradientColors.f26046B);
            if (anonymousClass3nl.f44611S == 180 || anonymousClass3nl.f44611S == 270) {
                int i2 = backgroundGradientColors2.f26047C;
                backgroundGradientColors2.f26047C = backgroundGradientColors2.f26046B;
                backgroundGradientColors2.f26046B = i2;
            }
            anonymousClass0OA.f3802P = backgroundGradientColors2;
        }
        if (bitmap != null) {
            try {
                anonymousClass0OA.f3819g = AnonymousClass3G5.m19165B(context, bitmap).getCanonicalPath();
            } catch (Throwable e) {
                AnonymousClass0Dc.G("ConvertPhotoToVideoUtil", "IOException on setPendingMediaWhenPostCaptureAREffectAvailable", e);
            }
        }
    }
}

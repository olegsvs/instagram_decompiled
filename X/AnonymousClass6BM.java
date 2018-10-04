package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import com.facebook.C0164R;

/* renamed from: X.6BM */
public final class AnonymousClass6BM {
    /* renamed from: B */
    private static final int[] f72730B = new int[]{C0164R.color.blueteal_2, C0164R.color.blueteal_4, C0164R.color.blueteal_7, C0164R.color.blueteal_10};
    /* renamed from: C */
    private static final int[] f72731C = new int[]{C0164R.color.purple_5, C0164R.color.pink_5, C0164R.color.orange_5, C0164R.color.yellow_5};
    /* renamed from: D */
    public static final float[] f72732D = new float[]{0.0f, 0.2f, 0.8f, 1.0f};

    /* renamed from: B */
    public static Drawable m29325B(Context context) {
        if (AnonymousClass0EF.I(context)) {
            return AnonymousClass6BM.m29326C(context, f72730B);
        }
        return AnonymousClass6BM.m29326C(context, f72731C);
    }

    /* renamed from: C */
    private static Drawable m29326C(Context context, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = AnonymousClass0Ca.C(context, iArr[i]);
        }
        ShaderFactory anonymousClass6BL = new AnonymousClass6BL(iArr2);
        Drawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(anonymousClass6BL);
        return paintDrawable;
    }
}

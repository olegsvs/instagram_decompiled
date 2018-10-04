package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.31T */
public final class AnonymousClass31T {
    /* renamed from: B */
    public static Drawable m18234B(Context context, int i, int i2) {
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{AnonymousClass31T.m18239G(), AnonymousClass31T.m18235C(context, i)});
        int round = Math.round(AnonymousClass0Nm.C(context, i2));
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, round, round, round, round);
        return layerDrawable;
    }

    /* renamed from: C */
    public static Drawable m18235C(Context context, int i) {
        return AnonymousClass0TJ.L(context, i, C0164R.color.green_4, C0164R.color.green_5);
    }

    /* renamed from: D */
    public static Drawable m18236D(Context context, Drawable drawable) {
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, AnonymousClass0Ca.E(context, C0164R.drawable.story_shortcut_ring)});
        int round = Math.round(AnonymousClass0Nm.C(context, 3));
        layerDrawable.setLayerInset(0, round, round, round, round);
        layerDrawable.setLayerInset(1, 0, 0, null, null);
        return layerDrawable;
    }

    /* renamed from: E */
    public static Drawable m18237E(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        Collection hashSet = new HashSet();
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        String str = (String) AnonymousClass0CC.UB.H(anonymousClass0Cm2);
        AnonymousClass1BN C = AnonymousClass1BN.C(anonymousClass0Cm2);
        C.B(str, JsonProperty.USE_DEFAULT_NAME, hashSet, new AnonymousClass31a());
        List arrayList = new ArrayList(hashSet);
        C.D(str, arrayList, null);
        Context context2 = context;
        Drawable C2 = AnonymousClass31T.m18235C(context, C0164R.drawable.close_friends_star_60);
        int C3 = AnonymousClass0Ca.C(context, C0164R.color.grey_1);
        if (arrayList.isEmpty()) {
            return C2;
        }
        int C4 = (int) AnonymousClass0Nm.C(context, 3);
        int C5 = ((int) AnonymousClass0Nm.C(context, 50)) + (C4 * 2);
        InsetDrawable insetDrawable = new InsetDrawable(C2, C4);
        new ShapeDrawable(new OvalShape()).setColorFilter(AnonymousClass0ca.B(-1));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{r4, insetDrawable});
        List arrayList2 = new ArrayList();
        arrayList2.add(layerDrawable);
        int i = 0;
        while (i < 4 && i < arrayList.size()) {
            arrayList2.add(new AnonymousClass1JG(C5, C4, -1, C3, ((AnonymousClass0Ci) arrayList.get(i)).DQ()));
            i++;
        }
        return new AnonymousClass1JI(context2, arrayList2, C5, 0.3f, true, AnonymousClass13H.HORIZONTAL);
    }

    /* renamed from: F */
    public static Drawable m18238F(Context context, int i) {
        int i2 = AnonymousClass0TJ.f5132B;
        int[] iArr = new int[]{16842912};
        int[] iArr2 = new int[0];
        return AnonymousClass0TJ.E(context, new int[]{C0164R.drawable.circle_check, C0164R.drawable.checkbox}, new int[]{i, i2}, new int[][]{iArr, iArr2});
    }

    /* renamed from: G */
    public static Drawable m18239G() {
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(-1);
        paint.setStyle(Style.FILL);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }
}

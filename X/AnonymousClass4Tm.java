package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Tm */
public final class AnonymousClass4Tm {
    /* renamed from: E */
    public static final int[] f54426E = new int[]{Color.parseColor("#27c4f5"), f54427F};
    /* renamed from: F */
    public static final int f54427F = Color.parseColor("#70c050");
    /* renamed from: B */
    public final Context f54428B;
    /* renamed from: C */
    private final AnonymousClass5cl f54429C;
    /* renamed from: D */
    private final String f54430D;

    public AnonymousClass4Tm(Context context, AnonymousClass5cl anonymousClass5cl, String str) {
        this.f54428B = context;
        this.f54429C = anonymousClass5cl;
        this.f54430D = str;
    }

    /* renamed from: A */
    public final void m24314A(Product product, Spannable spannable, int i, InteractiveDrawableContainer interactiveDrawableContainer) {
        Drawable B = AnonymousClass4Tm.m24310B(interactiveDrawableContainer, product);
        if (B == null) {
            String str;
            AnonymousClass2VC anonymousClass2VC;
            Resources resources = this.f54428B.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.product_sticker_text_size);
            AnonymousClass166 anonymousClass165 = new AnonymousClass165(resources, AnonymousClass0Nm.J(this.f54428B), dimensionPixelSize, true);
            AnonymousClass166 anonymousClass1652 = new AnonymousClass165(resources, AnonymousClass0Nm.J(this.f54428B), dimensionPixelSize, false);
            if (spannable == null) {
                str = null;
            } else {
                str = spannable.toString();
            }
            anonymousClass165.D(product, str, i);
            anonymousClass1652.D(product, str, i);
            if (((Boolean) AnonymousClass0E6.C(AnonymousClass09e.f1097C)).booleanValue()) {
                anonymousClass2VC = new AnonymousClass2VC(this.f54428B, anonymousClass165, anonymousClass1652);
            } else {
                AnonymousClass166 anonymousClass167 = new AnonymousClass167(this.f54428B, true);
                AnonymousClass166 anonymousClass1672 = new AnonymousClass167(this.f54428B, false);
                anonymousClass167.D(product, str, i);
                anonymousClass1672.D(product, str, i);
                anonymousClass2VC = new AnonymousClass2VC(this.f54428B, anonymousClass165, anonymousClass1652, anonymousClass167, anonymousClass1672);
            }
            AnonymousClass4Tm.m24312D(this, product, anonymousClass2VC);
            return;
        }
        interactiveDrawableContainer.m16529J(B);
        if (B.f31023F != 0) {
            B.m16113F(0);
        }
        AnonymousClass4Tm.m24312D(this, product, B);
    }

    /* renamed from: B */
    public static AnonymousClass2VC m24310B(InteractiveDrawableContainer interactiveDrawableContainer, Product product) {
        for (AnonymousClass2VC anonymousClass2VC : interactiveDrawableContainer.m16525F(AnonymousClass2VC.class)) {
            if (anonymousClass2VC.m16110C(AnonymousClass166.class)) {
                List B = anonymousClass2VC.m16109B(AnonymousClass166.class);
                if (product == null || ((AnonymousClass166) B.get(0)).B().getId().equals(product.getId())) {
                    return anonymousClass2VC;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static Map m24311C(Product product) {
        Map hashMap = new HashMap();
        hashMap.put("product_id", product.getId());
        hashMap.put("product_name", product.f4988J);
        return hashMap;
    }

    /* renamed from: D */
    public static void m24312D(AnonymousClass4Tm anonymousClass4Tm, Product product, AnonymousClass2VC anonymousClass2VC) {
        List arrayList = new ArrayList();
        arrayList.add("product_item_text_sticker_vibrant");
        arrayList.add("product_item_text_sticker_subtle");
        arrayList.add("product_item_icon_sticker_vibrant");
        arrayList.add("product_item_icon_sticker_subtle");
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = true;
        anonymousClass2Lb.f29354D = 8.0f;
        anonymousClass2Lb.f29364N = anonymousClass4Tm.f54430D;
        anonymousClass4Tm.f54429C.S(arrayList, anonymousClass2VC, anonymousClass2Lb.m15170A(), AnonymousClass4Tm.m24311C(product));
    }

    /* renamed from: E */
    public static boolean m24313E(Drawable drawable) {
        return (drawable instanceof AnonymousClass2VC) && (((AnonymousClass2VC) drawable).m16108A() instanceof AnonymousClass166);
    }
}

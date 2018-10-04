package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.3we */
public final class AnonymousClass3we implements AnonymousClass0QP {
    /* renamed from: B */
    public Map f47196B;
    /* renamed from: C */
    public final AnonymousClass0cN f47197C;
    /* renamed from: D */
    public int f47198D;
    /* renamed from: E */
    public final AnonymousClass3wd f47199E;
    /* renamed from: F */
    private final AnonymousClass0e5 f47200F = AnonymousClass0e5.C(10.0d, 14.0d);
    /* renamed from: G */
    private final Matrix f47201G = new Matrix();

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass3we(AnonymousClass3wd anonymousClass3wd) {
        AnonymousClass0cN O = AnonymousClass0e6.B().C().O(this.f47200F);
        O.f7108F = true;
        this.f47197C = O.A(this);
        this.f47199E = anonymousClass3wd;
        this.f47196B = new HashMap();
    }

    /* renamed from: B */
    public static void m21645B(AnonymousClass3we anonymousClass3we, IgImageView igImageView) {
        Drawable drawable = igImageView.getDrawable();
        if (drawable != null) {
            float f;
            float f2;
            float f3;
            int width = igImageView.getWidth();
            int height = igImageView.getHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth * height > width * intrinsicHeight) {
                f = ((float) height) / ((float) intrinsicHeight);
                f2 = (((float) width) - (((float) intrinsicWidth) * f)) * 0.5f;
                f3 = 0.0f;
            } else {
                f = ((float) width) / ((float) intrinsicWidth);
                f3 = (((float) height) - (((float) intrinsicHeight) * f)) * 0.5f;
                f2 = 0.0f;
            }
            anonymousClass3we.f47201G.reset();
            anonymousClass3we.f47201G.setScale(f, f);
            anonymousClass3we.f47201G.postTranslate((float) Math.round(f2), (float) Math.round(f3));
            anonymousClass3we.f47201G.postTranslate((float) anonymousClass3we.f47198D, 0.0f);
            igImageView.setImageMatrix(anonymousClass3we.f47201G);
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        Iterator it = this.f47196B.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            IgImageView igImageView = (IgImageView) entry.getValue();
            if (!((String) entry.getKey()).equals(igImageView.getUrl())) {
                it.remove();
            } else if (igImageView.getMeasuredHeight() != 0) {
                Drawable drawable = igImageView.getDrawable();
                if (drawable != null) {
                    int width = igImageView.getWidth();
                    float height = ((float) igImageView.getHeight()) / ((float) drawable.getIntrinsicHeight());
                    this.f47198D = Math.round(((((float) width) - (((float) drawable.getIntrinsicWidth()) * height)) * E) / 2.0f);
                    AnonymousClass3we.m21645B(this, igImageView);
                }
            }
        }
    }
}

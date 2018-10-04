package X;

import android.graphics.RectF;
import com.instagram.ui.widget.drawing.ColourPalette;

/* renamed from: X.2Ke */
public final class AnonymousClass2Ke extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ ColourPalette f29031B;

    public AnonymousClass2Ke(ColourPalette colourPalette) {
        this.f29031B = colourPalette;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        int size = this.f29031B.f29055F.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass2Kf anonymousClass2Kf = (AnonymousClass2Kf) this.f29031B.f29055F.get(i);
            anonymousClass2Kf.f29036F = AnonymousClass2Km.m15108C(E, anonymousClass2Kf.f29033C.width() / 2.0f, 0.0f);
            RectF rectF = anonymousClass2Kf.f29033C;
            RectF rectF2 = anonymousClass2Kf.f29032B;
            anonymousClass2Kf.f29037G.set(rectF.left + ((rectF2.left - rectF.left) * E), rectF.top + ((rectF2.top - rectF.top) * E), rectF.right + ((rectF2.right - rectF.right) * E), rectF.bottom + ((rectF2.bottom - rectF.bottom) * E));
            int C = (int) AnonymousClass2Km.m15108C(E, 255.0f, 0.0f);
            anonymousClass2Kf.f29040J.f29052C.setAlpha(C);
            anonymousClass2Kf.f29035E.setAlpha(C);
            anonymousClass2Kf.f29038H.setAlpha(255 - C);
        }
        this.f29031B.invalidate();
    }
}

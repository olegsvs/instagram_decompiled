package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.0rk */
public final class AnonymousClass0rk extends AnonymousClass0rj {
    /* renamed from: B */
    private int f11268B;

    public AnonymousClass0rk(Drawable drawable, int i) {
        super(drawable);
        this.f11268B = i;
    }

    /* renamed from: A */
    public final void mo1871A() {
        Rect bounds = getBounds();
        double width = (double) ((bounds.width() + this.f11268B) * (this.f11267B.f25935E.getLevel() % 5000));
        Double.isNaN(width);
        int i = (int) (width / 5000.0d);
        this.f11267B.f25935E.setBounds((-this.f11268B) + i, bounds.top, i, bounds.bottom);
    }
}

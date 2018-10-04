package X;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.2V4 */
public final class AnonymousClass2V4 implements AnonymousClass26a {
    /* renamed from: B */
    public final /* synthetic */ int f30999B;
    /* renamed from: C */
    public final /* synthetic */ int f31000C;
    /* renamed from: D */
    public final /* synthetic */ String f31001D;
    /* renamed from: E */
    public final /* synthetic */ Alignment f31002E;
    /* renamed from: F */
    public final /* synthetic */ TextPaint f31003F;

    public AnonymousClass2V4(TextPaint textPaint, String str, int i, Alignment alignment, int i2) {
        this.f31003F = textPaint;
        this.f31001D = str;
        this.f31000C = i;
        this.f31002E = alignment;
        this.f30999B = i2;
    }

    public final boolean ME(float f) {
        this.f31003F.setTextSize(f);
        return new StaticLayout(this.f31001D, this.f31003F, this.f31000C, this.f31002E, 1.0f, 0.0f, true).getLineCount() <= this.f30999B;
    }
}

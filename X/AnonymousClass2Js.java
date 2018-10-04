package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.2Js */
public final class AnonymousClass2Js extends CharacterStyle {
    /* renamed from: B */
    public final int f28900B;
    /* renamed from: C */
    private final Context f28901C;
    /* renamed from: D */
    private AnonymousClass2Ju f28902D;
    /* renamed from: E */
    private float f28903E;
    /* renamed from: F */
    private float f28904F;

    public AnonymousClass2Js(Context context, AnonymousClass2K5 anonymousClass2K5, int i) {
        this.f28901C = context;
        this.f28900B = i;
        m15045A(anonymousClass2K5);
    }

    /* renamed from: A */
    public final void m15045A(AnonymousClass2K5 anonymousClass2K5) {
        AnonymousClass2Ju VF = anonymousClass2K5.f28941L.VF(this.f28900B);
        this.f28902D = VF;
        this.f28903E = (float) this.f28901C.getResources().getDimensionPixelSize(VF.f28908C.f28952C);
        this.f28904F = this.f28902D.f28908C.m15069A(this.f28901C);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f28902D.f28907B);
        textPaint.setShadowLayer(this.f28904F, 0.0f, this.f28903E, this.f28902D.f28908C.f28951B);
    }
}

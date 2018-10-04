package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;

/* renamed from: X.0nD */
public final class AnonymousClass0nD implements AnonymousClass0RL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0n2 f10028B;
    /* renamed from: C */
    public final /* synthetic */ long f10029C;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass0nD(AnonymousClass0n2 anonymousClass0n2, long j) {
        this.f10028B = anonymousClass0n2;
        this.f10029C = j;
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        this.f10028B.f9985F = false;
        this.f10028B.f9984E = true;
        AnonymousClass0Gn.m1881H("StaticAnimationDrawableTextureLoadFailed", "failed fetching from IgImageCache");
        this.f10028B.invalidateSelf();
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        this.f10028B.f9981B = bitmap;
        AnonymousClass0n2 anonymousClass0n2 = this.f10028B;
        Bitmap bitmap2 = anonymousClass0n2.f9981B;
        TileMode tileMode = TileMode.REPEAT;
        anonymousClass0n2.f9982C = new BitmapShader(bitmap2, tileMode, tileMode);
        this.f10028B.f9983D.setShader(this.f10028B.f9982C);
        this.f10028B.f9985F = false;
        this.f10028B.f9984E = false;
        AnonymousClass0n2.m7592C(bitmap, "read from image cache", System.currentTimeMillis() - this.f10029C);
        this.f10028B.invalidateSelf();
    }
}

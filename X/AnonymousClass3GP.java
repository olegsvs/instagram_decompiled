package X;

import com.facebook.C0164R;

/* renamed from: X.3GP */
public enum AnonymousClass3GP {
    BRIGHTNESS(C0164R.attr.creationBrightnessDrawable, C0164R.string.brightness),
    CONTRAST(C0164R.attr.creationContrastDrawable, C0164R.string.contrast),
    SATURATION(C0164R.attr.creationSaturationDrawable, C0164R.string.saturation),
    WARMTH(C0164R.attr.creationWarmthDrawable, C0164R.string.warmth),
    VIGNETTE(C0164R.attr.creationVignetteDrawable, C0164R.string.vignette),
    FADE(C0164R.attr.creationFadeDrawable, C0164R.string.fade),
    TINT(C0164R.attr.creationTintDrawable, C0164R.string.color),
    SHARPEN(C0164R.attr.creationSharpenDrawable, C0164R.string.sharpen),
    SHADOWS(C0164R.attr.creationShadowsDrawable, C0164R.string.shadows),
    HIGHLIGHTS(C0164R.attr.creationHighlightsDrawable, C0164R.string.highlights);
    
    /* renamed from: B */
    private final int f39660B;
    /* renamed from: C */
    private final int f39661C;

    private AnonymousClass3GP(int i, int i2) {
        this.f39660B = i;
        this.f39661C = i2;
    }

    /* renamed from: A */
    public final int m19196A() {
        return this.f39660B;
    }

    /* renamed from: B */
    public final int m19197B() {
        return this.f39661C;
    }
}

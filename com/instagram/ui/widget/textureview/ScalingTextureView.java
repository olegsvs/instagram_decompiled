package com.instagram.ui.widget.textureview;

import X.AnonymousClass15o;
import X.AnonymousClass15p;
import X.AnonymousClass1eK;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.TextureView;

public class ScalingTextureView extends TextureView {
    /* renamed from: B */
    public int f14346B;
    /* renamed from: C */
    public int f14347C;
    /* renamed from: D */
    private float f14348D;
    /* renamed from: E */
    private float f14349E;
    /* renamed from: F */
    private AnonymousClass15o f14350F;

    public ScalingTextureView(Context context) {
        this(context, null);
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14350F = AnonymousClass15o.FILL;
        this.f14349E = 0.8f;
        this.f14348D = 1.91f;
        if (VERSION.SDK_INT == 19) {
            setSurfaceTexture(new AnonymousClass15p());
        }
    }

    /* renamed from: A */
    public final boolean m9339A() {
        return this.f14347C > 0 && this.f14346B > 0;
    }

    /* renamed from: B */
    public static void m9338B(ScalingTextureView scalingTextureView) {
        TextureView textureView = scalingTextureView;
        if (scalingTextureView.m9339A()) {
            AnonymousClass1eK.m12271B(textureView, scalingTextureView.f14350F, scalingTextureView.f14347C, scalingTextureView.f14346B, scalingTextureView.f14349E, scalingTextureView.f14348D, null);
        }
    }

    public int getVideoHeight() {
        return this.f14346B;
    }

    public int getVideoWidth() {
        return this.f14347C;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m9338B(this);
    }

    public void setScaleType(AnonymousClass15o anonymousClass15o) {
        if (this.f14350F != anonymousClass15o) {
            this.f14350F = anonymousClass15o;
            m9338B(this);
        }
    }
}

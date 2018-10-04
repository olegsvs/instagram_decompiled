package com.instagram.ui.widget.textureview;

import X.AnonymousClass0LH;
import X.AnonymousClass0cQ;
import X.AnonymousClass1vc;
import X.AnonymousClass3jJ;
import X.AnonymousClass42B;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

public class CircularTextureView extends TextureView implements SurfaceTextureListener {
    /* renamed from: B */
    public boolean f43907B;
    /* renamed from: C */
    public float f43908C;
    /* renamed from: D */
    public float f43909D;
    /* renamed from: E */
    public SurfaceTextureListener f43910E;
    /* renamed from: F */
    public AnonymousClass3jJ f43911F;
    /* renamed from: G */
    public Rect f43912G;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public CircularTextureView(Context context) {
        this(context, null);
    }

    public CircularTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43907B = false;
        this.f43908C = 1.0f;
        this.f43909D = 1.0f;
        setOpaque(false);
    }

    /* renamed from: A */
    public final boolean m20542A() {
        if (super.isAvailable() && this.f43907B) {
            AnonymousClass3jJ anonymousClass3jJ = this.f43911F;
            if (!(anonymousClass3jJ == null || anonymousClass3jJ.f43703I == null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    private void m20541B(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass0LH.B(i == i2);
        AnonymousClass3jJ anonymousClass3jJ = new AnonymousClass3jJ();
        this.f43911F = anonymousClass3jJ;
        anonymousClass3jJ.m20508C(AnonymousClass1vc.TEXTURE_EXT_CIRCULAR);
        this.f43911F.m20509D(i, i2);
        this.f43911F.f43699E = new AnonymousClass42B(this, i, i2);
        this.f43911F.m20510E(new Surface(surfaceTexture));
    }

    public SurfaceTexture getSurfaceTexture() {
        if (m20542A()) {
            return this.f43911F.f43703I;
        }
        return null;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -769432212);
        super.onAttachedToWindow();
        if (super.isAvailable()) {
            m20541B(super.getSurfaceTexture(), super.getWidth(), super.getHeight());
        } else {
            super.setSurfaceTextureListener(this);
        }
        AnonymousClass0cQ.O(this, 1823821905, N);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m20541B(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass3jJ anonymousClass3jJ = this.f43911F;
        if (anonymousClass3jJ != null) {
            anonymousClass3jJ.m20506A();
            this.f43911F = null;
        }
        this.f43907B = false;
        return true;
    }

    public void setIsMirrored(boolean z) {
        this.f43911F.f43698D = z;
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f43910E = surfaceTextureListener;
    }
}

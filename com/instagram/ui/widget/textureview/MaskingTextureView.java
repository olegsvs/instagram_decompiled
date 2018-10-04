package com.instagram.ui.widget.textureview;

import X.AnonymousClass0cQ;
import X.AnonymousClass1vc;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass3jJ;
import X.AnonymousClass42C;
import X.AnonymousClass4Ty;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.instagram.filterkit.filter.MaskingTextureFilter;
import com.instagram.filterkit.filter.VideoFilter;

public class MaskingTextureView extends TextureView implements SurfaceTextureListener {
    /* renamed from: B */
    public boolean f43913B;
    /* renamed from: C */
    public int f43914C;
    /* renamed from: D */
    public int f43915D;
    /* renamed from: E */
    public int f43916E;
    /* renamed from: F */
    public int f43917F;
    /* renamed from: G */
    public SurfaceTextureListener f43918G;
    /* renamed from: H */
    private MaskingTextureFilter f43919H;
    /* renamed from: I */
    private final AnonymousClass2Mf f43920I;
    /* renamed from: J */
    private AnonymousClass3jJ f43921J;

    public MaskingTextureView(Context context) {
        this(context, null);
    }

    public MaskingTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskingTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43920I = AnonymousClass2Mk.m15236B();
        setOpaque(false);
    }

    /* renamed from: A */
    public final void m20546A() {
        AnonymousClass3jJ anonymousClass3jJ = this.f43921J;
        if (anonymousClass3jJ != null) {
            anonymousClass3jJ.m20506A();
            this.f43921J = null;
        }
        this.f43913B = false;
    }

    /* renamed from: B */
    public static void m20543B(MaskingTextureView maskingTextureView) {
        int i = maskingTextureView.f43917F;
        if (i > 0) {
            int i2 = maskingTextureView.f43916E;
            if (i2 > 0) {
                int i3 = maskingTextureView.f43915D;
                if (i3 > 0) {
                    int i4 = maskingTextureView.f43914C;
                    if (i4 > 0) {
                        maskingTextureView.f43920I.f29572D.put(AnonymousClass2Mk.m15240F(((float) i) / ((float) i2), ((float) i3) / ((float) i4)));
                        maskingTextureView.f43920I.f29572D.position(0);
                    }
                }
            }
        }
        VideoFilter videoFilter = maskingTextureView.f43919H;
        if (videoFilter != null) {
            videoFilter.f49568I = maskingTextureView.f43920I;
        }
    }

    /* renamed from: C */
    public static boolean m20544C(MaskingTextureView maskingTextureView) {
        if (super.isAvailable() && maskingTextureView.f43913B) {
            AnonymousClass3jJ anonymousClass3jJ = maskingTextureView.f43921J;
            if (!(anonymousClass3jJ == null || anonymousClass3jJ.f43703I == null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    private void m20545D(SurfaceTexture surfaceTexture, int i, int i2) {
        m20546A();
        this.f43915D = i;
        this.f43914C = i2;
        m20543B(this);
        AnonymousClass3jJ anonymousClass3jJ = new AnonymousClass3jJ();
        this.f43921J = anonymousClass3jJ;
        anonymousClass3jJ.m20508C(AnonymousClass1vc.TEXTURE_EXT);
        this.f43921J.m20509D(i, i2);
        this.f43921J.m20507B(this.f43919H);
        this.f43921J.f43699E = new AnonymousClass42C(this, i, i2);
        this.f43921J.m20510E(new Surface(surfaceTexture));
    }

    public SurfaceTexture getSurfaceTexture() {
        if (m20544C(this)) {
            return this.f43921J.f43703I;
        }
        return null;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 581367302);
        super.onAttachedToWindow();
        if (super.isAvailable()) {
            m20545D(super.getSurfaceTexture(), getWidth(), getHeight());
        } else {
            super.setSurfaceTextureListener(this);
        }
        AnonymousClass0cQ.O(this, -1545961521, N);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m20545D(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m20546A();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f43915D = i;
        this.f43914C = i2;
        m20543B(this);
        AnonymousClass3jJ anonymousClass3jJ = this.f43921J;
        if (anonymousClass3jJ != null) {
            anonymousClass3jJ.m20509D(i, i2);
            this.f43921J.m20510E(new Surface(surfaceTexture));
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f43918G != null && m20544C(this)) {
            this.f43918G.onSurfaceTextureUpdated(getSurfaceTexture());
        }
    }

    public void setFilter(MaskingTextureFilter maskingTextureFilter) {
        this.f43919H = maskingTextureFilter;
        m20543B(this);
        maskingTextureFilter = this.f43921J;
        if (maskingTextureFilter != null) {
            maskingTextureFilter.m20507B(this.f43919H);
        }
    }

    public void setRenderDelegate(AnonymousClass4Ty anonymousClass4Ty) {
        AnonymousClass3jJ anonymousClass3jJ = this.f43921J;
        if (anonymousClass3jJ != null) {
            anonymousClass3jJ.f43702H = anonymousClass4Ty;
        }
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f43918G = surfaceTextureListener;
    }
}

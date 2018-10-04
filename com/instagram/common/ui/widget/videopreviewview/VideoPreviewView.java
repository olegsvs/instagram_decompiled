package com.instagram.common.ui.widget.videopreviewview;

import X.AnonymousClass0Dc;
import X.AnonymousClass0Gn;
import X.AnonymousClass0cQ;
import X.AnonymousClass15o;
import X.AnonymousClass1eK;
import X.AnonymousClass25v;
import X.AnonymousClass3BQ;
import X.AnonymousClass3BR;
import X.AnonymousClass3BS;
import X.AnonymousClass3BT;
import X.AnonymousClass3BU;
import X.AnonymousClass3BV;
import X.AnonymousClass3yW;
import X.AnonymousClass3yX;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.instagram.common.gallery.Medium;

public class VideoPreviewView extends TextureView implements SurfaceTextureListener, AnonymousClass25v, OnPreparedListener {
    /* renamed from: I */
    private static final Class f38806I = VideoPreviewView.class;
    /* renamed from: B */
    public AnonymousClass3BT f38807B;
    /* renamed from: C */
    public MediaPlayer f38808C;
    /* renamed from: D */
    public AnonymousClass3BV f38809D;
    /* renamed from: E */
    public Runnable f38810E;
    /* renamed from: F */
    public final Runnable f38811F;
    /* renamed from: G */
    private AnonymousClass15o f38812G;
    /* renamed from: H */
    private Surface f38813H;

    public float getMaxFitAspectRatio() {
        return 1.0f;
    }

    public float getMinFitAspectRatio() {
        return 1.0f;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public VideoPreviewView(Context context) {
        this(context, null);
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38811F = new AnonymousClass3BQ(this);
        this.f38812G = AnonymousClass15o.FILL;
    }

    /* renamed from: A */
    public final boolean m18916A() {
        return this.f38809D == AnonymousClass3BV.PAUSED;
    }

    /* renamed from: B */
    private void m18911B() {
        if (this.f38808C != null) {
            m18921H();
        }
        this.f38808C = new MediaPlayer();
        setMediaPlayerState(AnonymousClass3BV.IDLE);
        this.f38810E = new AnonymousClass3BR(this);
        Surface surface = this.f38813H;
        if (surface != null) {
            this.f38808C.setSurface(surface);
        }
    }

    /* renamed from: B */
    public final boolean m18917B() {
        if (!(this.f38809D == AnonymousClass3BV.PREPARED || this.f38809D == AnonymousClass3BV.STARTED || this.f38809D == AnonymousClass3BV.PAUSED)) {
            if (this.f38809D != AnonymousClass3BV.STOPPED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private void m18912C(AnonymousClass3BU anonymousClass3BU, AnonymousClass3BT anonymousClass3BT) {
        if (this.f38808C == null) {
            m18911B();
        }
        AnonymousClass3BV anonymousClass3BV = this.f38809D;
        AnonymousClass3BV anonymousClass3BV2 = AnonymousClass3BV.PREPARING;
        if ((anonymousClass3BV == anonymousClass3BV2 ? 1 : null) == null) {
            try {
                this.f38807B = anonymousClass3BT;
                m18915F();
                this.f38808C.reset();
                if (getSurfaceTexture() != null) {
                    this.f38813H = new Surface(getSurfaceTexture());
                    this.f38808C.setSurface(this.f38813H);
                }
                anonymousClass3BU.cNA(this.f38808C);
                setMediaPlayerState(AnonymousClass3BV.INITIALIZED);
                this.f38808C.setLooping(true);
                this.f38808C.prepareAsync();
                setMediaPlayerState(anonymousClass3BV2);
                this.f38808C.setOnPreparedListener(this);
            } catch (Throwable e) {
                AnonymousClass0Dc.C(f38806I, "failed to load video", e);
            } catch (IllegalStateException e2) {
                m18913D(e2);
            }
        }
    }

    /* renamed from: C */
    public final boolean m18918C() {
        return m18911B() && !m18919D();
    }

    /* renamed from: D */
    private void m18913D(IllegalStateException illegalStateException) {
        String str = "VideoPreviewView_IllegalStateException";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("current state: ");
        stringBuilder.append(this.f38809D);
        String stringBuilder2 = stringBuilder.toString();
        AnonymousClass0Dc.C(f38806I, str, illegalStateException);
        AnonymousClass0Gn.E(str, stringBuilder2, illegalStateException);
    }

    /* renamed from: D */
    public final boolean m18919D() {
        return this.f38809D == AnonymousClass3BV.STARTED;
    }

    /* renamed from: E */
    private void m18914E() {
        int videoWidth;
        int videoHeight;
        TextureView textureView = this;
        if (this.f38808C != null) {
            if (m18911B()) {
                videoWidth = this.f38808C.getVideoWidth();
                if (this.f38808C != null) {
                    if (!m18911B()) {
                        videoHeight = this.f38808C.getVideoHeight();
                        AnonymousClass1eK.B(textureView, getScaleType(), videoWidth, videoHeight, getMinFitAspectRatio(), getMaxFitAspectRatio(), this);
                    }
                }
                videoHeight = 0;
                AnonymousClass1eK.B(textureView, getScaleType(), videoWidth, videoHeight, getMinFitAspectRatio(), getMaxFitAspectRatio(), this);
            }
        }
        videoWidth = 0;
        if (this.f38808C != null) {
            if (!m18911B()) {
                videoHeight = this.f38808C.getVideoHeight();
                AnonymousClass1eK.B(textureView, getScaleType(), videoWidth, videoHeight, getMinFitAspectRatio(), getMaxFitAspectRatio(), this);
            }
        }
        videoHeight = 0;
        AnonymousClass1eK.B(textureView, getScaleType(), videoWidth, videoHeight, getMinFitAspectRatio(), getMaxFitAspectRatio(), this);
    }

    /* renamed from: F */
    private void m18915F() {
        Runnable runnable = this.f38810E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (m18919D() || m18916A()) {
            try {
                this.f38808C.stop();
                setMediaPlayerState(AnonymousClass3BV.STOPPED);
            } catch (IllegalStateException e) {
                m18913D(e);
            }
        }
    }

    /* renamed from: G */
    public final void m18920G() {
        Runnable runnable = this.f38810E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (m18919D()) {
            try {
                this.f38808C.pause();
                setMediaPlayerState(AnonymousClass3BV.PAUSED);
            } catch (IllegalStateException e) {
                m18913D(e);
            }
        }
    }

    /* renamed from: H */
    public final void m18921H() {
        if (this.f38808C != null) {
            removeCallbacks(this.f38810E);
            this.f38807B = null;
            this.f38813H = null;
            this.f38808C.setOnPreparedListener(null);
            m18915F();
            try {
                this.f38808C.release();
                setMediaPlayerState(AnonymousClass3BV.RELEASED);
                this.f38808C = null;
                setMediaPlayerState(null);
            } catch (IllegalStateException e) {
                m18913D(e);
            }
        }
    }

    /* renamed from: I */
    public final void m18922I() {
        if (!m18918C()) {
            return;
        }
        if (this.f38807B != null) {
            this.f38808C.setOnInfoListener(new AnonymousClass3BS(this));
            postDelayed(this.f38810E, 500);
            m18914E();
            try {
                this.f38808C.start();
                setMediaPlayerState(AnonymousClass3BV.STARTED);
            } catch (IllegalStateException e) {
                m18913D(e);
            }
        }
    }

    public AnonymousClass15o getScaleType() {
        return this.f38812G;
    }

    public final void gu(float f) {
        AnonymousClass3BT anonymousClass3BT = this.f38807B;
        if (anonymousClass3BT != null) {
            anonymousClass3BT.hu(this, f);
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1413965078);
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        AnonymousClass0cQ.O(this, 583309646, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 749203486);
        super.onDetachedFromWindow();
        m18921H();
        AnonymousClass0cQ.O(this, 1492552835, N);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m18914E();
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        setMediaPlayerState(AnonymousClass3BV.PREPARED);
        m18914E();
        if (this.f38807B != null) {
            this.f38807B.lp(this, this.f38808C.getVideoWidth(), this.f38808C.getVideoHeight());
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f38813H = new Surface(surfaceTexture);
        MediaPlayer mediaPlayer = this.f38808C;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(this.f38813H);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f38813H = new Surface(surfaceTexture);
        MediaPlayer mediaPlayer = this.f38808C;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(this.f38813H);
        }
    }

    private void setMediaPlayerState(AnonymousClass3BV anonymousClass3BV) {
        this.f38809D = anonymousClass3BV;
        AnonymousClass3BT anonymousClass3BT = this.f38807B;
        if (anonymousClass3BT != null) {
            anonymousClass3BT.TBA(anonymousClass3BV);
        }
    }

    public void setScaleType(AnonymousClass15o anonymousClass15o) {
        this.f38812G = anonymousClass15o;
    }

    public void setVideoAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, AnonymousClass3BT anonymousClass3BT) {
        m18912C(new AnonymousClass3yX(this, assetFileDescriptor), anonymousClass3BT);
    }

    public void setVideoMedium(Medium medium, AnonymousClass3BT anonymousClass3BT) {
        setVideoPath(medium.f30924N, anonymousClass3BT);
    }

    public void setVideoPath(String str, AnonymousClass3BT anonymousClass3BT) {
        m18912C(new AnonymousClass3yW(this, str), anonymousClass3BT);
    }
}

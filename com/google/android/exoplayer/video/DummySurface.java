package com.google.android.exoplayer.video;

import X.AnonymousClass2td;
import X.AnonymousClass2u9;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class DummySurface extends Surface {
    /* renamed from: B */
    private final AnonymousClass2u9 f35527B;
    /* renamed from: C */
    private boolean f35528C;

    public DummySurface(AnonymousClass2u9 anonymousClass2u9, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f35527B = anonymousClass2u9;
    }

    public final void release() {
        super.release();
        synchronized (this.f35527B) {
            if (!this.f35528C) {
                AnonymousClass2u9 anonymousClass2u9 = this.f35527B;
                AnonymousClass2td.m17605D(anonymousClass2u9.f35523C);
                anonymousClass2u9.f35523C.sendEmptyMessage(2);
                this.f35528C = true;
            }
        }
    }
}

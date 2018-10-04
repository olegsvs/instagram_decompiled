package com.instagram.camera.effect.mq;

import X.AnonymousClass0OR;
import X.AnonymousClass1rn;
import X.AnonymousClass2iW;
import X.AnonymousClass2ib;
import X.AnonymousClass2ic;
import X.AnonymousClass2id;
import X.AnonymousClass37H;
import X.AnonymousClass3xd;
import X.AnonymousClass4Ol;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class IgCameraAudioControllerImpl {
    /* renamed from: B */
    public Handler f47424B;
    /* renamed from: C */
    public AnonymousClass2ib f47425C;
    /* renamed from: D */
    public boolean f47426D;
    /* renamed from: E */
    public boolean f47427E;
    /* renamed from: F */
    private Handler f47428F;
    /* renamed from: G */
    private HandlerThread f47429G;

    /* renamed from: A */
    public final void m21730A(int i, int i2, AnonymousClass4Ol anonymousClass4Ol) {
        if (!this.f47427E) {
            if (!this.f47426D) {
                this.f47426D = true;
                HandlerThread handlerThread = new HandlerThread("IgMQAudioThread#audioHandlerThread");
                this.f47429G = handlerThread;
                handlerThread.start();
                this.f47428F = new Handler(this.f47429G.getLooper());
                this.f47424B = new Handler(Looper.myLooper());
                AnonymousClass2ic anonymousClass2ic = new AnonymousClass2ic();
                anonymousClass2ic.f32902H = i2;
                anonymousClass2ic.f32900F = i;
                this.f47425C = new AnonymousClass2ib(new AnonymousClass2id(anonymousClass2ic), this.f47428F, new AnonymousClass3xd(this, anonymousClass4Ol));
                AnonymousClass2ib anonymousClass2ib = this.f47425C;
                AnonymousClass1rn anonymousClass37H = new AnonymousClass37H(this);
                Handler handler = this.f47424B;
                AnonymousClass2ib.m16987D(anonymousClass2ib, handler);
                AnonymousClass0OR.D(anonymousClass2ib.f32892H, new AnonymousClass2iW(anonymousClass2ib, anonymousClass37H, handler), 1784661085);
            }
        }
    }

    /* renamed from: B */
    public static void m21729B(IgCameraAudioControllerImpl igCameraAudioControllerImpl) {
        igCameraAudioControllerImpl.f47427E = false;
        igCameraAudioControllerImpl.f47426D = false;
        HandlerThread handlerThread = igCameraAudioControllerImpl.f47429G;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        igCameraAudioControllerImpl.f47425C = null;
        igCameraAudioControllerImpl.f47429G = null;
        igCameraAudioControllerImpl.f47424B = null;
        igCameraAudioControllerImpl.f47428F = null;
    }
}

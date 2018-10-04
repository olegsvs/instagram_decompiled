package com.facebook.video.heroplayer.service;

import X.AnonymousClass0cQ;
import X.AnonymousClass2pR;
import X.AnonymousClass2pd;
import X.AnonymousClass2pz;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener.Stub;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.util.List;

public final class HeroServicePlayerCallback extends Stub implements AnonymousClass2pz {
    /* renamed from: B */
    public volatile HeroServicePlayerListener f46025B;
    /* renamed from: C */
    private final AnonymousClass2pd f46026C;

    public HeroServicePlayerCallback(AnonymousClass2pd anonymousClass2pd, HeroServicePlayerListener heroServicePlayerListener) {
        int I = AnonymousClass0cQ.I(this, -117765904);
        if (heroServicePlayerListener != null) {
            this.f46026C = anonymousClass2pd;
            this.f46025B = heroServicePlayerListener;
            AnonymousClass0cQ.H(this, -1857756399, I);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("HeroServicePlayerListener cannot be null");
        AnonymousClass0cQ.H(this, -1977037932, I);
        throw illegalArgumentException;
    }

    public final void Cf(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -111934130);
        try {
            this.f46025B.Cf(servicePlayerState);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed send onCancelled() callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, -1496001159, I);
    }

    public final void Ci(List list) {
        int I = AnonymousClass0cQ.I(this, -1689992518);
        try {
            this.f46025B.Ci(list);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed send onCues(list = %s) callback", list);
        }
        AnonymousClass0cQ.H(this, -1735509832, I);
    }

    public final void GGA(int i, int i2) {
        int I = AnonymousClass0cQ.I(this, 1004818338);
        try {
            this.f46025B.GGA(i, i2);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", Integer.valueOf(i), Integer.valueOf(i2));
        }
        AnonymousClass0cQ.H(this, 1299814260, I);
    }

    public final void Qh(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -819147993);
        try {
            this.f46025B.Qh(servicePlayerState);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onCompletion(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.f16688G));
        }
        AnonymousClass0cQ.H(this, -1517432692, I);
    }

    public final void Qj(ParcelableFormat parcelableFormat, String str, List list) {
        int I = AnonymousClass0cQ.I(this, -723880463);
        try {
            this.f46025B.Qj(parcelableFormat, str, list);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed send onDownstreamFormatChanged() callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, -1003137353, I);
    }

    public final void Rz(long j, ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -804474279);
        try {
            this.f46025B.Rz(j, servicePlayerState);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onSeeking callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, -668507010, I);
    }

    public final void SBA(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.I(this, 382621137);
        try {
            this.f46025B.SBA(servicePlayerState, z);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onStartedPlaying(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.f16688G));
        }
        AnonymousClass0cQ.H(this, -2085194723, I);
    }

    public final void Si(String str, boolean z, long j) {
        int I = AnonymousClass0cQ.I(this, -449249565);
        try {
            this.f46025B.Si(str, z, j);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send decoder initialized callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, 1669447850, I);
    }

    public final void Ut(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, 170596854);
        try {
            this.f46025B.Ut(servicePlayerState);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onPaused(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.f16688G));
        }
        AnonymousClass0cQ.H(this, 787144674, I);
    }

    public final void Vw(boolean z) {
        int I = AnonymousClass0cQ.I(this, 17932924);
        try {
            this.f46025B.Vw(z);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onRelease(isEvicted = %s) callback", Boolean.valueOf(z));
        }
        AnonymousClass0cQ.H(this, 992411661, I);
    }

    public final void aDA(List list) {
        int I = AnonymousClass0cQ.I(this, -1104695663);
        try {
            this.f46025B.aDA(list);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send gaps changed callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, 1618968679, I);
    }

    public final void du(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -2091136776);
        try {
            this.f46025B.du(servicePlayerState);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onPrepared callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, -345358547, I);
    }

    public final void ie(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.I(this, -1021784650);
        try {
            this.f46025B.ie(servicePlayerState, z);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onBufferingStarted(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.f16688G));
        }
        AnonymousClass0cQ.H(this, 1452435677, I);
    }

    public final void kGA(String str) {
        int I = AnonymousClass0cQ.I(this, 163015575);
        try {
            this.f46025B.kGA(str);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onWarn callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, -1817342903, I);
    }

    public final void ke(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.I(this, 442410504);
        try {
            this.f46025B.ke(servicePlayerState, z);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onBufferingStopped(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.f16688G));
        }
        AnonymousClass0cQ.H(this, 1392072305, I);
    }

    public final void rk(String str, String str2) {
        int I = AnonymousClass0cQ.I(this, -1532894960);
        try {
            this.f46025B.rk(str, str2);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onError(cause = %s) callback", str);
        }
        AnonymousClass0cQ.H(this, -756033159, I);
    }

    public final void ut(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, 1779628021);
        try {
            this.f46025B.ut(servicePlayerState);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.f16688G));
        }
        AnonymousClass0cQ.H(this, -1083667345, I);
    }

    public final void vAA(int i) {
        int I = AnonymousClass0cQ.I(this, -2034284100);
        try {
            this.f46025B.vAA(i);
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed send onSpatialAudioBufferUnderrun(count = %s) callback", Integer.valueOf(i));
        }
        AnonymousClass0cQ.H(this, 1525898575, I);
    }

    public final void zj() {
        int I = AnonymousClass0cQ.I(this, 650704696);
        try {
            this.f46025B.zj();
        } catch (Throwable e) {
            AnonymousClass2pR.m17345E(this.f46026C, e, "Failed to send onDrawnToSurface callback", new Object[0]);
        }
        AnonymousClass0cQ.H(this, 25752036, I);
    }
}

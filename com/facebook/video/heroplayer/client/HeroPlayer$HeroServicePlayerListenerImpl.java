package com.facebook.video.heroplayer.client;

import X.AnonymousClass0cQ;
import X.AnonymousClass1H4;
import X.AnonymousClass1eC;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener.Stub;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.ref.WeakReference;
import java.util.List;

public final class HeroPlayer$HeroServicePlayerListenerImpl extends Stub {
    /* renamed from: B */
    private final WeakReference f16702B;

    public HeroPlayer$HeroServicePlayerListenerImpl(AnonymousClass1H4 anonymousClass1H4) {
        int I = AnonymousClass0cQ.m5859I(this, 1538213256);
        this.f16702B = new WeakReference(anonymousClass1H4);
        AnonymousClass0cQ.m5858H(this, 2007819227, I);
    }

    public final void Cf(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.m5859I(this, 1525877476);
        ut(servicePlayerState);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            long A = servicePlayerState.m10610A();
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onCancelled", new Object[0]);
            anonymousClass1H4.f16652F.ZFA(A);
        }
        AnonymousClass0cQ.m5858H(this, -1497070282, I);
    }

    public final void Ci(List list) {
        int I = AnonymousClass0cQ.m5859I(this, -1789479185);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onCues", new Object[0]);
            anonymousClass1H4.f16652F.Ci(list);
        }
        AnonymousClass0cQ.m5858H(this, 998790273, I);
    }

    public final void GGA(int i, int i2) {
        int I = AnonymousClass0cQ.m5859I(this, -1263187823);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onVideoSizeChanged: w=%d, h=%d", Integer.valueOf(i), Integer.valueOf(i2));
            anonymousClass1H4.f16652F.GGA(i, i2);
        }
        AnonymousClass0cQ.m5858H(this, -391371686, I);
    }

    public final void Qh(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.m5859I(this, -623485732);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
            long A = servicePlayerState.m10610A();
            String str = servicePlayerState.f16700S;
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onCompletion", new Object[0]);
            Pair D = anonymousClass1H4.m10592D();
            anonymousClass1H4.f16652F.aFA(A, ((Long) D.first).longValue(), ((Integer) ((Pair) D.second).first).intValue(), ((Long) ((Pair) D.second).second).longValue(), AnonymousClass1eC.valueOf(str));
        }
        AnonymousClass0cQ.m5858H(this, 1860056190, I);
    }

    public final void Qj(ParcelableFormat parcelableFormat, String str, List list) {
        int I = AnonymousClass0cQ.m5859I(this, 236034535);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            long C;
            if (anonymousClass1H4.f16651E.YC) {
                C = anonymousClass1H4.m10591C();
            } else {
                C = anonymousClass1H4.m10590B();
            }
            ParcelableFormat parcelableFormat2 = parcelableFormat;
            if (parcelableFormat != null) {
                AnonymousClass1H4.m10583D(anonymousClass1H4, "onDownStreamFormatChanged Format: %s, bitrate: %d kbps, w: %d, h: %d", parcelableFormat.f20863S, Integer.valueOf(parcelableFormat.f20848D / JsonMappingException.MAX_REFS_TO_LIST), Integer.valueOf(parcelableFormat.f20864T), Integer.valueOf(parcelableFormat.f20860P));
            }
            String str2 = "<none>";
            List list2 = list;
            if (list != null) {
                str2 = TextUtils.join(", ", list2);
            }
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onDownStreamFormatChanged customQualities: %s", str2);
            anonymousClass1H4.f16652F.Pj(parcelableFormat2, C, str, list2);
        }
        AnonymousClass0cQ.m5858H(this, 199848880, I);
    }

    public final void Rz(long j, ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.m5859I(this, -711015995);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onSeeking", new Object[0]);
            anonymousClass1H4.f16652F.Qz(j);
        }
        AnonymousClass0cQ.m5858H(this, 875374821, I);
    }

    public final void SBA(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.m5859I(this, 444514525);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
            long A = servicePlayerState.m10610A();
            String str = servicePlayerState.f16700S;
            int i = servicePlayerState.f16694M;
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onStartedPlaying", new Object[0]);
            anonymousClass1H4.f16652F.LGA(A, AnonymousClass1eC.valueOf(str), i, z);
        }
        AnonymousClass0cQ.m5858H(this, 915056814, I);
    }

    public final void Si(String str, boolean z, long j) {
        int I = AnonymousClass0cQ.m5859I(this, -319340447);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onDecoderInitialized name: %s, isVideo %s, duration: %d", str, Boolean.valueOf(z), Long.valueOf(j));
            anonymousClass1H4.f16652F.Si(str, z, j);
        }
        AnonymousClass0cQ.m5858H(this, 799982153, I);
    }

    public final void Ut(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.m5859I(this, 495288509);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
            long A = servicePlayerState.m10610A();
            String str = servicePlayerState.f16700S;
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onPaused", new Object[0]);
            Pair D = anonymousClass1H4.m10592D();
            anonymousClass1H4.f16652F.oFA(A, ((Long) D.first).longValue(), ((Integer) ((Pair) D.second).first).intValue(), ((Long) ((Pair) D.second).second).longValue(), AnonymousClass1eC.valueOf(str));
        }
        AnonymousClass0cQ.m5858H(this, 1169916521, I);
    }

    public final void Vw(boolean z) {
        int I = AnonymousClass0cQ.m5859I(this, 1096561834);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null && anonymousClass1H4.m10593E()) {
            String str = "Service player was %s";
            Object[] objArr = new Object[1];
            objArr[0] = z ? "evicted" : "released";
            AnonymousClass1H4.m10583D(anonymousClass1H4, str, objArr);
            AnonymousClass1H4.m10581B(anonymousClass1H4, anonymousClass1H4.f16650D.obtainMessage(12, Boolean.valueOf(z)));
        }
        AnonymousClass0cQ.m5858H(this, -611015134, I);
    }

    public final void aDA(List list) {
        int I = AnonymousClass0cQ.m5859I(this, -1259377739);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onWarn", new Object[0]);
            anonymousClass1H4.f16652F.aDA(list);
        }
        AnonymousClass0cQ.m5858H(this, 848435255, I);
    }

    public final void du(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.m5859I(this, -972667472);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
            long A = servicePlayerState.m10610A();
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onPrepared", new Object[0]);
            anonymousClass1H4.f16652F.cu(A);
        }
        AnonymousClass0cQ.m5858H(this, 1615735359, I);
    }

    public final void ie(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.m5859I(this, 1303031161);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            ServicePlayerState servicePlayerState2 = servicePlayerState;
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onBufferingStarted", new Object[0]);
            anonymousClass1H4.f16652F.JBA(servicePlayerState2, 0, 0, z);
        }
        AnonymousClass0cQ.m5858H(this, 574334045, I);
    }

    public final void kGA(String str) {
        int I = AnonymousClass0cQ.m5859I(this, 1466130525);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onWarn", new Object[0]);
            anonymousClass1H4.f16652F.BXA(AnonymousClass1H4.f16647V, str);
        }
        AnonymousClass0cQ.m5858H(this, 51366208, I);
    }

    public final void ke(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.m5859I(this, 1543033675);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, z);
        }
        AnonymousClass0cQ.m5858H(this, 1171042110, I);
    }

    public final void rk(String str, String str2) {
        int I = AnonymousClass0cQ.m5859I(this, 1438677166);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onError", new Object[0]);
            if ("DISMISS".equals(str)) {
                AnonymousClass1H4.m10581B(anonymousClass1H4, anonymousClass1H4.f16650D.obtainMessage(17, new String[]{str, str2}));
            } else {
                anonymousClass1H4.f16652F.ot(str, str2);
            }
        }
        AnonymousClass0cQ.m5858H(this, -235716852, I);
    }

    public final void ut(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.m5859I(this, 497005886);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10582C(anonymousClass1H4, servicePlayerState, false);
        }
        AnonymousClass0cQ.m5858H(this, -1130543083, I);
    }

    public final void vAA(int i) {
        int I = AnonymousClass0cQ.m5859I(this, -1312437304);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onSpatialAudioBufferUnderrun: %s", Integer.valueOf(i));
            anonymousClass1H4.f16652F.vAA(i);
        }
        AnonymousClass0cQ.m5858H(this, 1497659176, I);
    }

    public final void zj() {
        int I = AnonymousClass0cQ.m5859I(this, -1062430938);
        AnonymousClass1H4 anonymousClass1H4 = (AnonymousClass1H4) this.f16702B.get();
        if (anonymousClass1H4 != null) {
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onDrawnToSurface", new Object[0]);
            anonymousClass1H4.f16652F.zj();
        }
        AnonymousClass0cQ.m5858H(this, -2128545266, I);
    }
}

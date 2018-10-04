package X;

import com.facebook.video.heroplayer.ipc.ParcelableCue;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1H5 */
public final class AnonymousClass1H5 implements AnonymousClass1H6 {
    /* renamed from: B */
    private final WeakReference f16667B;
    /* renamed from: C */
    private boolean f16668C;

    public final void EGA() {
    }

    public final void FGA(long j) {
    }

    public final void ZFA(long j) {
    }

    public final void aDA(List list) {
    }

    public final void oFA(long j, long j2, int i, long j3, AnonymousClass1eC anonymousClass1eC) {
    }

    public final void vAA(int i) {
    }

    public AnonymousClass1H5(AnonymousClass1c2 anonymousClass1c2) {
        this.f16667B = new WeakReference(anonymousClass1c2);
    }

    public final void BXA(String str, String str2) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            AnonymousClass1c2.m12077E(anonymousClass1c2, str, str2);
        }
    }

    public final void Ci(List list) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null && anonymousClass1c2.f20547E != null) {
            List arrayList = new ArrayList();
            for (ParcelableCue parcelableCue : list) {
                arrayList.add(parcelableCue.f24699B);
            }
            anonymousClass1c2.f20547E.Bi(anonymousClass1c2, arrayList);
        }
    }

    public final void GGA(int i, int i2) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null && anonymousClass1c2.f20556N != null) {
            anonymousClass1c2.f20556N.IGA(anonymousClass1c2, i, i2);
        }
    }

    public final void JBA(ServicePlayerState servicePlayerState, long j, long j2, boolean z) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null && anonymousClass1c2.f20545C != null) {
            anonymousClass1c2.f20545C.je(anonymousClass1c2);
        }
    }

    public final void LGA(long j, AnonymousClass1eC anonymousClass1eC, int i, boolean z) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            AnonymousClass1c2.m12076D(anonymousClass1c2, anonymousClass1c2.f20564G);
        }
    }

    public final void Pj(ParcelableFormat parcelableFormat, long j, String str, List list) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            Integer.valueOf(parcelableFormat.f20864T);
            Integer.valueOf(parcelableFormat.f20860P);
            Integer.valueOf(parcelableFormat.f20848D);
            Float.valueOf(parcelableFormat.f20859O);
            anonymousClass1c2.f20564G = parcelableFormat;
            if (anonymousClass1c2.f20548F != null) {
                AnonymousClass1c2.m12076D(anonymousClass1c2, parcelableFormat);
            }
        }
    }

    public final void Qz(long j) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null && anonymousClass1c2.f20554L != null) {
            anonymousClass1c2.f20554L.Sz(anonymousClass1c2, j);
        }
    }

    public final void Si(String str, boolean z, long j) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            if (z) {
                AnonymousClass3pO anonymousClass3pO = anonymousClass1c2.f20563F;
                anonymousClass3pO.f44955D = str;
                anonymousClass3pO.f44954C = (int) j;
            } else {
                anonymousClass1c2.f20563F.f44953B = str;
            }
            AnonymousClass1hZ anonymousClass1hZ = anonymousClass1c2.f20561D;
            if (anonymousClass1hZ != null && z) {
                anonymousClass1hZ.f21514D = str;
            }
        }
    }

    public final void aFA(long j, long j2, int i, long j3, AnonymousClass1eC anonymousClass1eC) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            if (anonymousClass1c2.mo2606N()) {
                if (anonymousClass1c2.f20551I != null) {
                    anonymousClass1c2.f20551I.gq(anonymousClass1c2);
                }
            } else if (anonymousClass1c2.f20546D != null) {
                anonymousClass1c2.f20546D.Sh(anonymousClass1c2);
            }
            VideoSource videoSource = anonymousClass1c2.f20576S;
            if (videoSource != null && videoSource.f14750O != null) {
                AnonymousClass1eC anonymousClass1eC2;
                switch (anonymousClass1c2.f20576S.f14751P.ordinal()) {
                    case 0:
                        anonymousClass1eC2 = AnonymousClass1eC.DASH;
                        break;
                    case 1:
                        anonymousClass1eC2 = AnonymousClass1eC.DASH_LIVE;
                        break;
                    default:
                        anonymousClass1eC2 = AnonymousClass1eC.PROGRESSIVE_DOWNLOAD;
                        break;
                }
                AnonymousClass1dF.m12189E(anonymousClass1c2.f20575R, AnonymousClass1xF.f24610D, anonymousClass1c2.f20576S.f14750O, anonymousClass1c2.mo2603K(), (int) j, anonymousClass1eC2, 0, null, 0, null, 0, Boolean.valueOf(anonymousClass1c2.f20576S.m9474A()));
            }
        }
    }

    public final void cu(long j) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            if (!anonymousClass1c2.f20569L) {
                anonymousClass1c2.f20566I = -1;
                anonymousClass1c2.f20574Q = null;
                if (anonymousClass1c2.f20552J != null) {
                    anonymousClass1c2.f20552J.fu(anonymousClass1c2, j);
                }
            }
            anonymousClass1c2.f20569L = true;
        }
    }

    public final void eBA(long j, boolean z) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            int i = (int) j;
            if (anonymousClass1c2.f20545C != null) {
                anonymousClass1c2.f20545C.he(anonymousClass1c2, i);
            }
        }
    }

    public final void gGA(boolean z) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null) {
            AnonymousClass1c3 anonymousClass1c3 = anonymousClass1c2.f20567J;
            synchronized (anonymousClass1c3) {
                if (!z) {
                    if (anonymousClass1c3.f20586B > 0) {
                        anonymousClass1c3.f20587C += AnonymousClass0Gd.m1840E() - anonymousClass1c3.f20586B;
                    }
                    anonymousClass1c3.f20586B = -1;
                } else if (anonymousClass1c3.f20586B < 0) {
                    anonymousClass1c3.f20586B = AnonymousClass0Gd.m1840E();
                }
            }
        }
    }

    public final void ot(String str, String str2) {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if ("LOCAL_SOCKET_NO_CONNECTION".equals(str)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(", address in use: ");
            stringBuilder.append(AnonymousClass1Gg.m10512D().f16311F.hashCode());
            AnonymousClass0Gn.m1876C("local_socket_no_connection", stringBuilder.toString());
            if (!(this.f16668C || anonymousClass1c2 == null)) {
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass1c2.f20572O;
                if (!((Boolean) AnonymousClass0CC.gk.m846H(anonymousClass0Cm)).booleanValue()) {
                    AnonymousClass1Gg.m10512D().m10519A();
                    AnonymousClass0a1.m5412F(anonymousClass0Cm);
                    AnonymousClass0a1.m5411E();
                }
                this.f16668C = true;
            }
        }
        if (anonymousClass1c2 != null) {
            VideoSource videoSource = anonymousClass1c2.f20576S;
            anonymousClass1c2.f20574Q = videoSource != null ? videoSource.f14750O : null;
            if (anonymousClass1c2.f20550H != null) {
                anonymousClass1c2.f20550H.mk(anonymousClass1c2, str, str2);
            }
            AnonymousClass1hZ anonymousClass1hZ = anonymousClass1c2.f20561D;
            if (anonymousClass1hZ != null) {
                anonymousClass1hZ.f21520J = str;
                anonymousClass1hZ.f21521K = str2;
            }
        }
    }

    public final void zj() {
        AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) this.f16667B.get();
        if (anonymousClass1c2 != null && anonymousClass1c2.f20549G != null) {
            anonymousClass1c2.f20549G.Bk(anonymousClass1c2);
        }
    }
}

package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$CallStartResult;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;
import com.instagram.video.videocall.intf.VideoCallSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6A5 */
public final class AnonymousClass6A5 implements AnonymousClass0Uy {
    /* renamed from: B */
    public AnonymousClass6Gg f72464B;
    /* renamed from: C */
    public final AnonymousClass6Ga f72465C;
    /* renamed from: D */
    public AnonymousClass6Gf f72466D;
    /* renamed from: E */
    public final Map f72467E = new HashMap();
    /* renamed from: F */
    public final Map f72468F = new HashMap();
    /* renamed from: G */
    public int f72469G;
    /* renamed from: H */
    public final AnonymousClass6AS f72470H;
    /* renamed from: I */
    public final AnonymousClass0Uw f72471I;
    /* renamed from: J */
    public final AnonymousClass1Hb f72472J;
    /* renamed from: K */
    public VideoCallInfo f72473K;
    /* renamed from: L */
    public final AnonymousClass5cI f72474L;
    /* renamed from: M */
    public final AnonymousClass6AU f72475M;
    /* renamed from: N */
    public final AnonymousClass69e f72476N;
    /* renamed from: O */
    public final AnonymousClass6HM f72477O;
    /* renamed from: P */
    private final AnonymousClass3AL f72478P = new AnonymousClass6A2(this);

    public AnonymousClass6A5(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass69e anonymousClass69e, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f72472J = new AnonymousClass1Hb((String) AnonymousClass0LH.E(AnonymousClass0Dt.f1941C.B()), anonymousClass0Cm);
        AnonymousClass0Uw anonymousClass0Uw = new AnonymousClass0Uw("VideoCallClient", AnonymousClass6AG.READY);
        anonymousClass0Uw.A(this);
        anonymousClass0Uw.B(AnonymousClass6AG.READY, AnonymousClass6AF.class, AnonymousClass6AG.STARTING);
        AnonymousClass6AG anonymousClass6AG = AnonymousClass6AG.STARTING;
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AA.class, AnonymousClass6AG.STARTED);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AB.class, AnonymousClass6AG.ENDING);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6A8.class, AnonymousClass6AG.ERROR);
        anonymousClass0Uw.D(anonymousClass6AG, AnonymousClass6AE.class);
        anonymousClass0Uw.D(anonymousClass6AG, AnonymousClass6AD.class);
        anonymousClass6AG = AnonymousClass6AG.STARTED;
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AB.class, AnonymousClass6AG.ENDING);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6A6.class, AnonymousClass6AG.DISCONNECTED);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AD.class, anonymousClass6AG);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AE.class, anonymousClass6AG);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6A8.class, AnonymousClass6AG.ERROR);
        anonymousClass6AG = AnonymousClass6AG.DISCONNECTED;
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AE.class, anonymousClass6AG);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6A9.class, AnonymousClass6AG.STARTED);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AB.class, AnonymousClass6AG.ENDING);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6A8.class, AnonymousClass6AG.ERROR);
        anonymousClass6AG = AnonymousClass6AG.ERROR;
        anonymousClass0Uw.D(anonymousClass6AG, AnonymousClass6A7.class);
        anonymousClass0Uw.B(anonymousClass6AG, AnonymousClass6AB.class, AnonymousClass6AG.ENDING);
        anonymousClass0Uw.B(AnonymousClass6AG.ENDING, AnonymousClass6A7.class, AnonymousClass6AG.ENDED);
        this.f72471I = anonymousClass0Uw;
        this.f72465C = new AnonymousClass6Ga(this, anonymousClass0Cm);
        this.f72476N = anonymousClass69e;
        this.f72477O = new AnonymousClass6HM();
        this.f72474L = new AnonymousClass5cI(this.f72472J, this.f72478P, str, str2);
        String str3 = anonymousClass0Cm.f1759C;
        AnonymousClass6Gc anonymousClass6Gc = new AnonymousClass6Gc(this);
        AnonymousClass5cI anonymousClass5cI = this.f72474L;
        AnonymousClass5jI anonymousClass5jI = new AnonymousClass5jI(applicationContext, null, this.f72477O);
        AnonymousClass4u1 B = AnonymousClass4tP.m25300B(new AnonymousClass6AT(((Integer) AnonymousClass0CC.Qj.H(anonymousClass0Cm)).intValue(), ((Integer) AnonymousClass0CC.Rj.H(anonymousClass0Cm)).intValue(), ((Integer) AnonymousClass0CC.Sj.H(anonymousClass0Cm)).intValue()), anonymousClass0Cm);
        B.f58318R = AnonymousClass4u6.valueOf((String) AnonymousClass0CC.Zj.H(anonymousClass0Cm));
        this.f72470H = new AnonymousClass6AS(str3, anonymousClass6Gc, anonymousClass5cI, anonymousClass5jI, B);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fbid:");
        stringBuilder.append(AnonymousClass5Y5.m27420E(anonymousClass0Cm.f1759C));
        this.f72475M = new AnonymousClass6AU("igvc", stringBuilder.toString());
    }

    /* renamed from: B */
    public static void m29257B(AnonymousClass6A5 anonymousClass6A5, boolean z) {
        DLog.d(DLogTag.VIDEO_CALL, "setAudioMute: %b", new Object[]{Boolean.valueOf(z)});
        anonymousClass6A5.f72470H.m27432M(z);
        anonymousClass6A5.f72476N.lMA(z);
    }

    /* renamed from: C */
    public static void m29258C(AnonymousClass6A5 anonymousClass6A5, boolean z) {
        DLog.d(DLogTag.VIDEO_CALL, "setCameraOff: %b", new Object[]{Boolean.valueOf(z)});
        AnonymousClass5Y5 anonymousClass5Y5;
        AnonymousClass5jH anonymousClass5jH;
        if (z) {
            anonymousClass5Y5 = anonymousClass6A5.f72470H;
            if (anonymousClass5Y5.f66005C != null) {
                anonymousClass5jH = anonymousClass5Y5.f66005C;
                AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5jE(anonymousClass5jH));
                anonymousClass5Y5.m27426G();
            }
        } else {
            anonymousClass5Y5 = anonymousClass6A5.f72470H;
            if (anonymousClass5Y5.f66005C != null) {
                anonymousClass5jH = anonymousClass5Y5.f66005C;
                AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5jD(anonymousClass5jH));
                anonymousClass5Y5.m27426G();
            }
        }
        anonymousClass6A5.f72476N.BNA(z);
    }

    /* renamed from: D */
    public static void m29259D(AnonymousClass6A5 anonymousClass6A5, VideoCallInfo videoCallInfo) {
        anonymousClass6A5.f72473K = videoCallInfo;
        anonymousClass6A5.f72472J.f16787E = anonymousClass6A5.f72473K.f4468C;
        anonymousClass6A5.f72472J.f16785C = anonymousClass6A5.f72473K.f4467B;
        anonymousClass6A5.f72476N.WSA(anonymousClass6A5.f72473K.f4468C);
    }

    /* renamed from: E */
    public static AnonymousClass6Ae m29260E(AnonymousClass4u2 anonymousClass4u2) {
        return new AnonymousClass6Ae(anonymousClass4u2.f58322D, anonymousClass4u2.f58320B, anonymousClass4u2.f58321C);
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass6AG anonymousClass6AG = (AnonymousClass6AG) obj;
        AnonymousClass6AG anonymousClass6AG2 = (AnonymousClass6AG) obj2;
        DLogTag dLogTag = DLogTag.VIDEO_CALL;
        DLog.d(dLogTag, "State Transition %s -> (%s) -> %s", new Object[]{anonymousClass6AG, obj3.getClass().getSimpleName(), anonymousClass6AG2});
        VideoCallInfo videoCallInfo;
        AnonymousClass6Gg anonymousClass6Gg;
        VideoCallInfo videoCallInfo2;
        AnonymousClass6Gi anonymousClass6Gi;
        String message;
        switch (anonymousClass6AG2.ordinal()) {
            case 1:
                videoCallInfo = ((AnonymousClass6AF) obj3).f72488B;
                if (videoCallInfo != null) {
                    AnonymousClass6A5.m29259D(this, videoCallInfo);
                }
                this.f72470H.mo6251O();
                AnonymousClass5ig anonymousClass5ig = this.f72475M.f72529C;
                if (anonymousClass5ig != null) {
                    anonymousClass5ig.f68422B = true;
                    anonymousClass5ig.f68425E.start();
                    return;
                }
                return;
            case 2:
                if (obj3 instanceof AnonymousClass6A9) {
                    anonymousClass6Gg = this.f72464B;
                    if (anonymousClass6Gg != null) {
                        if (anonymousClass6Gg.f73817B != null) {
                            DLog.d(dLogTag, "Connected!", new Object[0]);
                        }
                        return;
                    }
                    return;
                } else if (obj3 instanceof AnonymousClass6AA) {
                    AnonymousClass6Gg anonymousClass6Gg2 = this.f72464B;
                    if (anonymousClass6Gg2 != null) {
                        videoCallInfo2 = (VideoCallInfo) AnonymousClass0LH.E(this.f72473K);
                        anonymousClass6Gi = anonymousClass6Gg2.f73818C;
                        if (anonymousClass6Gi != null) {
                            AnonymousClass6HX.m29946C(anonymousClass6Gi.f73821B);
                        }
                        if (anonymousClass6Gg2.f73817B != null) {
                            DLog.d(DLogTag.VIDEO_CALL, "Connected!", new Object[0]);
                        }
                        if ((anonymousClass6Gg2.f73819D.f4524C == AnonymousClass6AM.CREATE ? 1 : null) != null) {
                            anonymousClass6Gg2.f73819D.f4523B.f73806C = anonymousClass6Gg2;
                            AnonymousClass6GZ anonymousClass6GZ = anonymousClass6Gg2.f73819D.f4523B;
                            VideoCallSource videoCallSource = anonymousClass6Gg2.f73819D.f4539R;
                            if (anonymousClass6GZ.f73805B != null) {
                                videoCallInfo2.toString();
                                anonymousClass6GZ.f73805B.A(videoCallInfo2, videoCallSource, new AnonymousClass69y(anonymousClass6GZ, videoCallSource, videoCallInfo2));
                            } else {
                                AnonymousClass0Gn.C("VideoCallAttachManager", String.format("attempt to attach while attach delegate is null. video call info\n%s", new Object[]{videoCallInfo2.toString()}));
                            }
                        } else {
                            anonymousClass6Gg2.f73819D.F(VideoCallWaterfall$CallStartResult.SUCCESS);
                        }
                        AnonymousClass0Qz anonymousClass0Qz = anonymousClass6Gg2.f73819D;
                        AnonymousClass0OR.G(anonymousClass0Qz.f4526E, anonymousClass0Qz.f4533L, -399966465);
                        AnonymousClass0OR.G(anonymousClass0Qz.f4526E, anonymousClass0Qz.f4525D, -227046605);
                        AnonymousClass0OR.F(anonymousClass0Qz.f4526E, anonymousClass0Qz.f4533L, TimeUnit.SECONDS.toMillis((long) AnonymousClass0FZ.B().f2177B.getInt("vc_timeout_sec", 30)), 1723108873);
                        AnonymousClass0OR.D(anonymousClass0Qz.f4526E, anonymousClass0Qz.f4525D, 1082508463);
                        anonymousClass0Qz.f4529H = SystemClock.elapsedRealtime();
                    }
                    AnonymousClass5Y5 anonymousClass5Y5 = this.f72470H;
                    if (anonymousClass5Y5.f66005C != null) {
                        AnonymousClass5jH anonymousClass5jH = anonymousClass5Y5.f66005C;
                        AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5jB(anonymousClass5jH));
                        anonymousClass5Y5.m27426G();
                    }
                    return;
                } else if (obj3 instanceof AnonymousClass6AD) {
                    AnonymousClass6AD anonymousClass6AD = (AnonymousClass6AD) obj3;
                    AnonymousClass4u2 anonymousClass4u2 = anonymousClass6AD.f72486C;
                    AnonymousClass6Ae E;
                    AnonymousClass69e anonymousClass69e;
                    switch (anonymousClass6AD.f72485B.ordinal()) {
                        case 0:
                            DLog.d(dLogTag, "onMediaStreamsAdded", new Object[0]);
                            this.f72467E.put(anonymousClass4u2.f58322D, anonymousClass4u2);
                            AnonymousClass6Gf anonymousClass6Gf = this.f72466D;
                            if (anonymousClass6Gf != null) {
                                E = AnonymousClass6A5.m29260E(anonymousClass4u2);
                                int B = anonymousClass6Gf.f73814B.m29811B() ^ 1;
                                if (anonymousClass6Gf.f73814B.m29810A(E)) {
                                    anonymousClass6Gf.f73816D.f4532K.m29309C();
                                    AnonymousClass0Qz anonymousClass0Qz2 = anonymousClass6Gf.f73816D;
                                    AnonymousClass0OR.G(anonymousClass0Qz2.f4526E, anonymousClass0Qz2.f4533L, 781663551);
                                    AnonymousClass69e anonymousClass69e2 = (AnonymousClass69e) anonymousClass6Gf.f73815C.get();
                                    if (anonymousClass69e2 != null) {
                                        anonymousClass69e2.tB(E);
                                        if (anonymousClass6Gf.f73814B.f73823C && B != 0) {
                                            anonymousClass69e2.Qa();
                                        }
                                        anonymousClass69e2.ia();
                                    } else {
                                        AnonymousClass0Dc.P("VideoCallManager", "Waterfall is not initialized");
                                    }
                                } else {
                                    AnonymousClass0Dc.R("VideoCallManager", "onMediaStreamAdded: participant not added %s", new Object[]{E});
                                }
                                return;
                            }
                            return;
                        case 1:
                            DLog.d(dLogTag, "onMediaStreamsRemoved", new Object[0]);
                            this.f72467E.remove(anonymousClass4u2.f58322D);
                            Object obj4 = this.f72468F.get(anonymousClass4u2.f58322D);
                            if (obj4 != null) {
                                this.f72470H.m27421A(anonymousClass4u2, obj4);
                            }
                            AnonymousClass6Gf anonymousClass6Gf2 = this.f72466D;
                            if (anonymousClass6Gf2 != null) {
                                E = AnonymousClass6A5.m29260E(anonymousClass4u2);
                                boolean F = anonymousClass6Gf2.f73814B.m29815F(E);
                                anonymousClass6Gf2.f73816D.f4532K.m29310D();
                                if (F) {
                                    anonymousClass69e = (AnonymousClass69e) anonymousClass6Gf2.f73815C.get();
                                    if (anonymousClass69e != null) {
                                        anonymousClass69e.oJA(E);
                                        anonymousClass69e.ia();
                                    } else {
                                        AnonymousClass0Dc.P("VideoCallManager", "Waterfall is not initialized");
                                    }
                                } else {
                                    AnonymousClass0Dc.R("VideoCallManager", "onMediaStreamRemoved: participant not removed %s", new Object[]{E});
                                }
                                return;
                            }
                            return;
                        case 2:
                            DLog.d(dLogTag, "onMediaStreamsUpdated", new Object[0]);
                            AnonymousClass6Gf anonymousClass6Gf3 = this.f72466D;
                            if (anonymousClass6Gf3 != null) {
                                E = AnonymousClass6A5.m29260E(anonymousClass4u2);
                                E.toString();
                                if (anonymousClass6Gf3.f73814B.m29816G(E)) {
                                    anonymousClass69e = (AnonymousClass69e) anonymousClass6Gf3.f73815C.get();
                                    if (anonymousClass69e != null) {
                                        anonymousClass69e.NWA(E);
                                        anonymousClass69e.ia();
                                    } else {
                                        AnonymousClass0Dc.P("VideoCallManager", "Waterfall is not initialized");
                                    }
                                } else {
                                    AnonymousClass0Dc.R("VideoCallManager", "onMediaStreamUpdated: participant not updated %s", new Object[]{E});
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                break;
            case 3:
                if (obj3 instanceof AnonymousClass6A6) {
                    anonymousClass6Gg = this.f72464B;
                    if (anonymousClass6Gg != null) {
                        if (anonymousClass6Gg.f73817B != null) {
                            DLog.d(dLogTag, "Connecting...", new Object[0]);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 4:
                if (obj3 instanceof AnonymousClass6A8) {
                    AnonymousClass6A8 anonymousClass6A8 = (AnonymousClass6A8) obj3;
                    Exception exception = anonymousClass6A8.f72479B;
                    DLog.e(dLogTag, exception.getMessage(), new Object[0]);
                    if (anonymousClass6A8.f72480C == AnonymousClass6AG.STARTING) {
                        AnonymousClass6Gg anonymousClass6Gg3 = this.f72464B;
                        if (anonymousClass6Gg3 != null) {
                            Integer num;
                            videoCallInfo2 = this.f72473K;
                            AnonymousClass69e B2 = anonymousClass6Gg3.f73819D.B();
                            if (anonymousClass6Gg3.f73819D.f4524C == AnonymousClass6AM.CREATE) {
                                B2.Ja(AnonymousClass69b.INITIATE_CALL, exception);
                            } else if (anonymousClass6Gg3.f73819D.f4524C == AnonymousClass6AM.JOIN) {
                                B2.Ja(AnonymousClass69b.JOIN, exception);
                            }
                            AnonymousClass0Qz anonymousClass0Qz3 = anonymousClass6Gg3.f73819D;
                            VideoCallWaterfall$CallStartResult videoCallWaterfall$CallStartResult = VideoCallWaterfall$CallStartResult.CLIENT_ERROR;
                            message = exception.getMessage();
                            if (exception instanceof AnonymousClass4uE) {
                                videoCallWaterfall$CallStartResult = VideoCallWaterfall$CallStartResult.JOIN_ERROR_SERVER_ERROR;
                                num = ((AnonymousClass4uE) exception).f58339B;
                                if (exception instanceof AnonymousClass5YB) {
                                    videoCallWaterfall$CallStartResult = VideoCallWaterfall$CallStartResult.VIDEO_CALL_PERMISSION_DENIED;
                                } else if (exception instanceof AnonymousClass5YE) {
                                    videoCallWaterfall$CallStartResult = VideoCallWaterfall$CallStartResult.VIDEO_CALL_IS_FULL;
                                } else if (exception instanceof AnonymousClass5YD) {
                                    videoCallWaterfall$CallStartResult = VideoCallWaterfall$CallStartResult.VIDEO_CALL_IS_TERMINATED;
                                }
                            } else {
                                num = null;
                            }
                            anonymousClass0Qz3.G(videoCallWaterfall$CallStartResult, num, message);
                            anonymousClass6Gi = anonymousClass6Gg3.f73818C;
                            anonymousClass6Gg3.m29803B(exception, videoCallInfo2);
                        }
                    } else {
                        AnonymousClass6Gg anonymousClass6Gg4 = this.f72464B;
                        if (anonymousClass6Gg4 != null) {
                            anonymousClass6Gg4.m29803B(exception, this.f72473K);
                        }
                        if (this.f72469G > 0) {
                            this.f72476N.Ja(AnonymousClass69b.REJOIN, exception);
                        } else {
                            this.f72476N.Ja(AnonymousClass69b.LEAVE, exception);
                        }
                    }
                    this.f72471I.C(new AnonymousClass6A7());
                    return;
                }
                return;
            case 5:
                if (obj3 instanceof AnonymousClass6AB) {
                    DLog.d(dLogTag, "leaveCall", new Object[0]);
                    this.f72470H.mo6245B();
                    AnonymousClass5YA anonymousClass5YA = this.f72474L;
                    anonymousClass5YA.f66024C = true;
                    anonymousClass5YA.f66023B.removeCallbacksAndMessages(null);
                    if (this.f72473K != null) {
                        AnonymousClass1Hb anonymousClass1Hb = this.f72472J;
                        AnonymousClass3AL anonymousClass6A3 = new AnonymousClass6A3(this);
                        AnonymousClass0Cn anonymousClass0Cn = anonymousClass1Hb.f16786D;
                        String str = (String) AnonymousClass0LH.E(anonymousClass1Hb.f16787E);
                        String str2 = anonymousClass1Hb.f16784B;
                        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
                        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                        AnonymousClass0GA H = anonymousClass0Pt.L("video_call/%s/leave/", new Object[]{str}).D("device_id", str2).M(AnonymousClass0Pv.class).N().H();
                        H.f2849B = new AnonymousClass5Pk(anonymousClass1Hb, "Leaving Video Call", anonymousClass6A3);
                        AnonymousClass0Ix.D(H);
                    }
                    return;
                }
                return;
            case 6:
                if (obj3 instanceof AnonymousClass6A7) {
                    DLog.d(dLogTag, "callLeft", new Object[0]);
                    AnonymousClass5ig anonymousClass5ig2 = this.f72475M.f72529C;
                    if (anonymousClass5ig2 != null) {
                        anonymousClass5ig2.f68425E.stop();
                    }
                    this.f72476N.Sb(this.f72475M.m29269A());
                    AnonymousClass6Gg anonymousClass6Gg5 = this.f72464B;
                    if (anonymousClass6Gg5 != null) {
                        if (anonymousClass6Gg5.f73819D.f4542U != null) {
                            anonymousClass6Gg5.f73819D.f4542U.iZ(anonymousClass6Gg5.f73819D.f4536O);
                            anonymousClass6Gg5.f73819D.f4542U.kZ();
                            if (anonymousClass6Gg5.f73819D.f4536O == VideoCallWaterfall$LeaveReason.UNKNOWN) {
                                videoCallInfo = anonymousClass6Gg5.f73819D.A();
                                message = videoCallInfo != null ? videoCallInfo.f4468C : "null";
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Leaving the call without reason provided: ");
                                stringBuilder.append(message);
                                AnonymousClass0Gn.H("VideoCallManager", stringBuilder.toString());
                            }
                        }
                        anonymousClass6Gi = anonymousClass6Gg5.f73818C;
                        if (anonymousClass6Gi != null) {
                            AnonymousClass6HX.m29947D(anonymousClass6Gi.f73821B);
                        }
                        AnonymousClass0Qz.D(anonymousClass6Gg5.f73819D);
                        AnonymousClass6Gi anonymousClass6Gi2 = anonymousClass6Gg5.f73818C;
                        if (!(anonymousClass6Gi2 == null || !anonymousClass6Gi2.f73821B.f74099H || anonymousClass6Gi2.f73821B.f74101J == null)) {
                            VideoCallInfo videoCallInfo3 = anonymousClass6Gi2.f73821B.f74101J;
                            anonymousClass6Gi2.f73821B.f74099H = false;
                            anonymousClass6Gi2.f73821B.f74101J = null;
                            AnonymousClass6HX anonymousClass6HX = anonymousClass6Gi2.f73821B;
                            AnonymousClass6HX.m29948E(anonymousClass6HX, videoCallInfo3, anonymousClass6HX.f74095D, VideoCallWaterfall$LeaveReason.USER_INITIATED);
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
        if (obj3 instanceof AnonymousClass6AE) {
            AnonymousClass6A5.m29257B(this, ((AnonymousClass6AE) obj3).f72487B);
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5O5 */
public final class AnonymousClass5O5 extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5cH f62883B;

    public AnonymousClass5O5(AnonymousClass5cH anonymousClass5cH, Looper looper) {
        this.f62883B = anonymousClass5cH;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        AnonymousClass5cH anonymousClass5cH;
        AnonymousClass5Nc anonymousClass5Nc;
        float f;
        AnonymousClass5Nd anonymousClass5Nd;
        float f2;
        float[] fArr;
        float f3;
        float[] fArr2;
        AnonymousClass5cH anonymousClass5cH2;
        AnonymousClass5Nc anonymousClass5Nc2;
        switch (i) {
            case 1:
                AnonymousClass5cH.m28026D(this.f62883B, (Surface) message.obj);
                return;
            case 2:
                anonymousClass5cH = this.f62883B;
                anonymousClass5cH.f67371N = ((float) message.arg1) / ((float) message.arg2);
                anonymousClass5Nc = anonymousClass5cH.f67361D;
                if (anonymousClass5Nc != null) {
                    message = anonymousClass5cH.f67371N;
                    f = ((float) anonymousClass5cH.f67373P) / ((float) anonymousClass5cH.f67372O);
                    anonymousClass5Nd = anonymousClass5Nc.f62791E.f62812C;
                    if (f > message) {
                        f2 = (1.0f - (message / f)) * 0.5f;
                        fArr = new float[8];
                        f3 = 1.0f - f2;
                        fArr[5] = f3;
                        fArr[6] = 1.0f;
                        fArr[7] = f3;
                        fArr2 = new float[]{1.0f, f2, 0.0f, f2, 1.0f, f3, 0.0f, f3};
                    } else {
                        f2 = (1.0f - (f / message)) * 0.5f;
                        fArr = new float[8];
                        f3 = 1.0f - f2;
                        fArr[2] = f3;
                        fArr[3] = 0.0f;
                        fArr[4] = f2;
                        fArr[5] = 1.0f;
                        fArr[6] = f3;
                        fArr[7] = 1.0f;
                        fArr2 = new float[]{f3, 0.0f, f2, 0.0f, f3, 1.0f, f2, 1.0f};
                    }
                    anonymousClass5Nd.f62805C = AnonymousClass1va.D(fArr);
                    anonymousClass5Nd.f62806D = AnonymousClass1va.D(fArr2);
                }
                return;
            case 3:
                this.f62883B.f67360C.A();
                if (AnonymousClass5cH.m28025C(this.f62883B, ((Boolean) message.obj).booleanValue(), true)) {
                    this.f62883B.f67360C.B();
                    return;
                }
                AnonymousClass48H anonymousClass48H = this.f62883B.f67360C;
                anonymousClass48H.f50696D++;
                AnonymousClass48H.B(anonymousClass48H);
                return;
            case 4:
                AnonymousClass5cH anonymousClass5cH3 = this.f62883B;
                List<AnonymousClass1he> list = (List) message.obj;
                if (anonymousClass5cH3.f67359B != null && anonymousClass5cH3.f67368K.isEmpty()) {
                    for (AnonymousClass1he anonymousClass1he : list) {
                        AnonymousClass5Nx anonymousClass5Nx = new AnonymousClass5Nx();
                        AnonymousClass1vX anonymousClass1vX = anonymousClass5cH3.f67359B;
                        if (anonymousClass5Nx.f62871C != null || anonymousClass1vX == null) {
                            AnonymousClass0Dc.R("IgLiveStreamOutputSurface", "Discarding the recorder init surface request.Current encode surface %s, EglCore %s", new Object[]{anonymousClass5Nx.f62871C, anonymousClass1vX});
                        } else {
                            anonymousClass5Nx.f62872D = anonymousClass1he;
                            if (anonymousClass1he == null || !anonymousClass1he.f21542D.isValid()) {
                                AnonymousClass0Dc.P("IgLiveStreamOutputSurface", "The recorder surface invalid");
                            } else {
                                anonymousClass5Nx.f62871C = new AnonymousClass2Rg(anonymousClass1vX, anonymousClass5Nx.f62872D.f21542D, false);
                            }
                            anonymousClass5Nx.f62872D.f21541C = new AnonymousClass5al(anonymousClass5Nx, anonymousClass1vX);
                        }
                        anonymousClass5Nx.f62870B = true;
                        anonymousClass5cH3.f67368K.add(anonymousClass5Nx);
                    }
                }
                AnonymousClass0Sy.F(new AnonymousClass5O1(anonymousClass5cH3.f67365H));
                return;
            case 5:
                anonymousClass5cH = this.f62883B;
                for (AnonymousClass5Nx A : anonymousClass5cH.f67368K) {
                    A.m26387A();
                }
                anonymousClass5cH.f67368K.clear();
                anonymousClass5cH.f67366I.removeMessages(11);
                AnonymousClass0Sy.F(new AnonymousClass5O2(anonymousClass5cH.f67365H));
                return;
            case 6:
                anonymousClass5cH2 = this.f62883B;
                AnonymousClass2Rg anonymousClass2Rg = anonymousClass5cH2.f67374Q;
                if (anonymousClass2Rg != null) {
                    anonymousClass2Rg.E();
                    anonymousClass5cH2.f67374Q = null;
                }
                for (AnonymousClass5Nx A2 : anonymousClass5cH2.f67368K) {
                    A2.m26387A();
                }
                anonymousClass5cH2.f67368K.clear();
                AnonymousClass5Ni anonymousClass5Ni = anonymousClass5cH2.f67369L;
                if (anonymousClass5Ni != null) {
                    anonymousClass5Ni.m26377A();
                    anonymousClass5cH2.f67369L = null;
                }
                anonymousClass5Nc2 = anonymousClass5cH2.f67361D;
                if (anonymousClass5Nc2 != null) {
                    anonymousClass5Nc2.m26374B();
                    anonymousClass5cH2.f67361D = null;
                }
                AnonymousClass1vX anonymousClass1vX2 = anonymousClass5cH2.f67359B;
                if (anonymousClass1vX2 != null) {
                    anonymousClass1vX2.B();
                    anonymousClass5cH2.f67359B = null;
                }
                AnonymousClass0Sy.F(new AnonymousClass5O0(anonymousClass5cH2.f67365H));
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                anonymousClass5cH = this.f62883B;
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                anonymousClass5Nc2 = anonymousClass5cH.f67361D;
                if (anonymousClass5Nc2 != null) {
                    anonymousClass5Nc2.f62788B = booleanValue;
                }
                return;
            case 8:
                anonymousClass5cH = this.f62883B;
                int i2 = message.arg1;
                int i3 = message.arg2;
                anonymousClass5cH.f67373P = i2;
                anonymousClass5cH.f67372O = i3;
                anonymousClass5Nc = anonymousClass5cH.f67361D;
                if (anonymousClass5Nc != null) {
                    message = anonymousClass5cH.f67371N;
                    f = ((float) anonymousClass5cH.f67373P) / ((float) anonymousClass5cH.f67372O);
                    anonymousClass5Nd = anonymousClass5Nc.f62791E.f62812C;
                    if (f > message) {
                        f2 = (1.0f - (message / f)) * 0.5f;
                        fArr = new float[8];
                        f3 = 1.0f - f2;
                        fArr[5] = f3;
                        fArr[6] = 1.0f;
                        fArr[7] = f3;
                        fArr2 = new float[]{1.0f, f2, 0.0f, f2, 1.0f, f3, 0.0f, f3};
                    } else {
                        f2 = (1.0f - (f / message)) * 0.5f;
                        fArr = new float[8];
                        f3 = 1.0f - f2;
                        fArr[2] = f3;
                        fArr[3] = 0.0f;
                        fArr[4] = f2;
                        fArr[5] = 1.0f;
                        fArr[6] = f3;
                        fArr[7] = 1.0f;
                        fArr2 = new float[]{f3, 0.0f, f2, 0.0f, f3, 1.0f, f2, 1.0f};
                    }
                    anonymousClass5Nd.f62805C = AnonymousClass1va.D(fArr);
                    anonymousClass5Nd.f62806D = AnonymousClass1va.D(fArr2);
                }
                return;
            case 9:
                AnonymousClass5cH anonymousClass5cH4 = this.f62883B;
                AnonymousClass3AL anonymousClass3AL = (AnonymousClass3AL) message.obj;
                if (anonymousClass5cH4.f67367J != null) {
                    anonymousClass3AL.A(new IllegalStateException("Can't handle two frame saves simultaneously"));
                } else {
                    anonymousClass5cH4.f67367J = anonymousClass3AL;
                    anonymousClass5cH4.f67362E = 0;
                }
                return;
            case 10:
                anonymousClass5cH2 = this.f62883B;
                if (anonymousClass5cH2.f67374Q != null) {
                    AnonymousClass5Ng anonymousClass5Ng;
                    anonymousClass5Nc2 = anonymousClass5cH2.f67361D;
                    if (anonymousClass5Nc2 != null) {
                        anonymousClass5Ng = anonymousClass5Nc2.f62795I;
                        anonymousClass5cH2.f67361D.f62793G.setOnFrameAvailableListener(null);
                        anonymousClass5cH2.f67361D.m26374B();
                    } else {
                        anonymousClass5Ng = new AnonymousClass5Ng(anonymousClass5cH2.f67363F);
                    }
                    anonymousClass5cH2.f67374Q.C();
                    anonymousClass5cH2.f67361D = new AnonymousClass5Nc(anonymousClass5Ng);
                    anonymousClass5cH2.f67361D.f62793G.setOnFrameAvailableListener(anonymousClass5cH2);
                    AnonymousClass5O3.m26389C(anonymousClass5cH2.f67365H, anonymousClass5cH2.f67361D.f62793G);
                }
                anonymousClass5cH2.f67370M = 6;
                return;
            case 11:
                anonymousClass5cH = this.f62883B;
                AnonymousClass5cH.m28025C(anonymousClass5cH, anonymousClass5cH.f67364G, false);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid msg what:");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

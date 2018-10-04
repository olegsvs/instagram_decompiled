package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.video.player.common.LiveVideoDebugStatsView;

/* renamed from: X.3pM */
public final class AnonymousClass3pM implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1c2 f44950B;

    public AnonymousClass3pM(AnonymousClass1c2 anonymousClass1c2) {
        this.f44950B = anonymousClass1c2;
    }

    public final void run() {
        long B;
        AnonymousClass1c2 anonymousClass1c2 = this.f44950B;
        Context context = anonymousClass1c2.f20559B;
        if (context != null && anonymousClass1c2.f20561D == null && anonymousClass1c2.f20565H) {
            anonymousClass1c2.f20561D = new AnonymousClass1hZ(context);
            anonymousClass1c2.f20561D.show();
        }
        AnonymousClass1hZ anonymousClass1hZ = anonymousClass1c2.f20561D;
        if (anonymousClass1hZ != null) {
            VideoSource videoSource = anonymousClass1c2.f20576S;
            anonymousClass1hZ.f21525O = null;
            if (videoSource == null) {
                anonymousClass1hZ.f21518H = -1;
                anonymousClass1hZ.f21516F = null;
                anonymousClass1hZ.f21526P = null;
            } else {
                anonymousClass1hZ.f21526P = videoSource.f14751P;
                if (videoSource.A()) {
                    anonymousClass1hZ.f21518H = videoSource.f14749N.getPath().contains("-abr");
                } else {
                    anonymousClass1hZ.f21518H = videoSource.f14744I != null ? 1 : 0;
                }
            }
            VideoSource videoSource2 = anonymousClass1c2.f20576S;
            if (!(videoSource2 == null || !videoSource2.A() || anonymousClass1c2.f20576S.f14749N == null)) {
                String uri = anonymousClass1c2.f20576S.f14749N.toString();
                AnonymousClass1hZ anonymousClass1hZ2 = anonymousClass1c2.f20561D;
                boolean z = uri.contains("dash-ll") && ((Boolean) AnonymousClass0CC.HR.H(anonymousClass1c2.f20572O)).booleanValue();
                anonymousClass1hZ2.B(z, ((Boolean) AnonymousClass0CC.FR.H(anonymousClass1c2.f20572O)).booleanValue(), ((Integer) AnonymousClass0CC.GR.H(anonymousClass1c2.f20572O)).intValue(), ((Boolean) AnonymousClass0CC.ER.H(anonymousClass1c2.f20572O)).booleanValue(), ((Boolean) AnonymousClass0CC.CR.H(anonymousClass1c2.f20572O)).booleanValue());
            }
            anonymousClass1c2.f20561D.f21527Q = anonymousClass1c2.A();
            ParcelableFormat parcelableFormat = anonymousClass1c2.f20564G;
            if (parcelableFormat != null) {
                anonymousClass1c2.f20561D.f21516F = parcelableFormat;
            }
            anonymousClass1c2.f20561D.f21519I = anonymousClass1c2.O();
            AnonymousClass1hZ anonymousClass1hZ3 = anonymousClass1c2.f20561D;
            B = (long) anonymousClass1c2.B();
            long I = (long) anonymousClass1c2.I();
            anonymousClass1hZ3.f21513C = (long) anonymousClass1c2.C();
            anonymousClass1hZ3.f21512B = B;
            anonymousClass1hZ3.f21522L = I;
            anonymousClass1c2.f20561D.f21523M = anonymousClass1c2.f20573P;
            AnonymousClass1hZ anonymousClass1hZ4 = anonymousClass1c2.f20561D;
            CharSequence stringBuilder = new StringBuilder();
            stringBuilder.append(" abr:");
            stringBuilder.append(anonymousClass1hZ4.f21518H);
            if (anonymousClass1hZ4.f21516F != null) {
                stringBuilder.append(AnonymousClass0IE.E(" w:%d h:%d br:%d", new Object[]{Integer.valueOf(anonymousClass1hZ4.f21516F.f20864T), Integer.valueOf(anonymousClass1hZ4.f21516F.f20860P), Integer.valueOf(anonymousClass1hZ4.f21516F.f20848D / JsonMappingException.MAX_REFS_TO_LIST)}));
            }
            if (anonymousClass1hZ4.f21527Q >= 0) {
                stringBuilder.append(" bw:");
                stringBuilder.append(anonymousClass1hZ4.f21527Q);
            }
            long j = 0;
            if (anonymousClass1hZ4.f21522L > 0) {
                float f;
                AnonymousClass3pR anonymousClass3pR;
                long j2;
                LiveVideoDebugStatsView liveVideoDebugStatsView;
                long j3;
                String str = "\n pos:%.1f buf:%.1f edge:%.1f";
                Object[] objArr = new Object[3];
                I = anonymousClass1hZ4.f21513C;
                float f2 = -1.0f;
                objArr[0] = Float.valueOf(I > 0 ? ((float) I) / 1000.0f : -1.0f);
                B = anonymousClass1hZ4.f21512B;
                if (B > 0) {
                    I = anonymousClass1hZ4.f21513C;
                    if (I > 0) {
                        f = ((float) (B - I)) / 1000.0f;
                        objArr[1] = Float.valueOf(f);
                        B = anonymousClass1hZ4.f21512B;
                        if (B > 0) {
                            f2 = ((float) (anonymousClass1hZ4.f21522L - B)) / 1000.0f;
                        }
                        objArr[2] = Float.valueOf(f2);
                        stringBuilder.append(AnonymousClass0IE.E(str, objArr));
                        anonymousClass3pR = anonymousClass1hZ4.f21523M;
                        j2 = anonymousClass3pR != null ? 0 : anonymousClass3pR.f44957C;
                        anonymousClass3pR = anonymousClass1hZ4.f21523M;
                        if (anonymousClass3pR == null) {
                            j = anonymousClass3pR.f44956B;
                        }
                        liveVideoDebugStatsView = anonymousClass1hZ4.f21524N;
                        j3 = anonymousClass1hZ4.f21513C;
                        B = anonymousClass1hZ4.f21512B;
                        I = anonymousClass1hZ4.f21522L;
                        if (liveVideoDebugStatsView.getVisibility() != 0) {
                            liveVideoDebugStatsView.setVisibility(0);
                        }
                        liveVideoDebugStatsView.f44970H = j2;
                        liveVideoDebugStatsView.f44965C = j;
                        liveVideoDebugStatsView.f44966D = j3;
                        liveVideoDebugStatsView.f44964B = B;
                        liveVideoDebugStatsView.f44969G = I;
                    }
                }
                f = -1.0f;
                objArr[1] = Float.valueOf(f);
                B = anonymousClass1hZ4.f21512B;
                if (B > 0) {
                    f2 = ((float) (anonymousClass1hZ4.f21522L - B)) / 1000.0f;
                }
                objArr[2] = Float.valueOf(f2);
                stringBuilder.append(AnonymousClass0IE.E(str, objArr));
                anonymousClass3pR = anonymousClass1hZ4.f21523M;
                if (anonymousClass3pR != null) {
                }
                anonymousClass3pR = anonymousClass1hZ4.f21523M;
                if (anonymousClass3pR == null) {
                    j = anonymousClass3pR.f44956B;
                }
                liveVideoDebugStatsView = anonymousClass1hZ4.f21524N;
                j3 = anonymousClass1hZ4.f21513C;
                B = anonymousClass1hZ4.f21512B;
                I = anonymousClass1hZ4.f21522L;
                if (liveVideoDebugStatsView.getVisibility() != 0) {
                    liveVideoDebugStatsView.setVisibility(0);
                }
                liveVideoDebugStatsView.f44970H = j2;
                liveVideoDebugStatsView.f44965C = j;
                liveVideoDebugStatsView.f44966D = j3;
                liveVideoDebugStatsView.f44964B = B;
                liveVideoDebugStatsView.f44969G = I;
            }
            ParcelableFormat parcelableFormat2 = anonymousClass1hZ4.f21516F;
            if (!(parcelableFormat2 == null || parcelableFormat2.f20849E == null || !anonymousClass1hZ4.f21516F.f20849E.contains("vp9") || anonymousClass1hZ4.f21514D == null)) {
                stringBuilder.append("\n ");
                stringBuilder.append(anonymousClass1hZ4.f21514D);
            }
            AnonymousClass3pX anonymousClass3pX = anonymousClass1hZ4.f21525O;
            if (anonymousClass3pX != null && anonymousClass3pX.f44979C) {
                stringBuilder.append("\n cdn:");
                stringBuilder.append(anonymousClass1hZ4.f21525O.f44978B ? "1" : "0");
                stringBuilder.append(" limit:");
                stringBuilder.append(String.valueOf(anonymousClass1hZ4.f21525O.f44980D));
                stringBuilder.append(" strm:");
                stringBuilder.append(anonymousClass1hZ4.f21525O.f44981E ? "1" : "0");
                stringBuilder.append(" !msft:");
                stringBuilder.append(anonymousClass1hZ4.f21525O.f44981E ? "1" : "0");
            }
            anonymousClass1hZ4.f21517G.setText(stringBuilder);
            anonymousClass1hZ4.f21517G.setAlpha(anonymousClass1hZ4.f21519I ? 1.0f : 0.5f);
            anonymousClass1hZ4.f21517G.setTranslationY(anonymousClass1hZ4.f21519I ? 0.0f : 50.0f);
            CharSequence stringBuilder2 = new StringBuilder();
            String str2 = anonymousClass1hZ4.f21520J;
            if (str2 != null) {
                stringBuilder2.append(str2);
            }
            if (anonymousClass1hZ4.f21521K != null) {
                stringBuilder2.append(" \n");
                stringBuilder2.append(anonymousClass1hZ4.f21521K);
            }
            anonymousClass1hZ4.f21515E.setText(stringBuilder2);
        }
        AnonymousClass1hZ anonymousClass1hZ5 = anonymousClass1c2.f20561D;
        B = anonymousClass1hZ5 == null ? -1 : anonymousClass1hZ5.f21522L > 0 ? anonymousClass1hZ5.f21524N.getPreferredTimePeriod() : -1;
        Handler handler = anonymousClass1c2.f20571N;
        Runnable runnable = anonymousClass1c2.f20562E;
        if (B <= 0) {
            B = 1000;
        }
        AnonymousClass0OR.F(handler, runnable, B, 1406558360);
    }
}

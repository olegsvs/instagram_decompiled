package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ig */
public final class AnonymousClass4Ig extends AnonymousClass0ay {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Ij f52510B;

    public AnonymousClass4Ig(AnonymousClass4Ij anonymousClass4Ij) {
        this.f52510B = anonymousClass4Ij;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object m23782A(Object[] objArr) {
        AnonymousClass0OA anonymousClass0OA = ((AnonymousClass0OA[]) objArr)[0];
        AnonymousClass3zj anonymousClass3zj = this.f52510B.f52519E;
        if (anonymousClass3zj.f47998B.m19271D() >= 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass3pG E = anonymousClass3zj.f47998B.m21952E();
            int i = E.f44945J;
            int i2 = E.f44937B;
            if (i <= i2) {
                int i3 = i;
                i = i2;
                i2 = i3;
            }
            anonymousClass0OA.aC = 1;
            anonymousClass0OA.sB = i2;
            anonymousClass0OA.pB = i;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            Iterator it = anonymousClass3zj.f47998B.iterator();
            while (it.hasNext()) {
                AnonymousClass3pG anonymousClass3pG = (AnonymousClass3pG) it.next();
                if (anonymousClass3pG.f44941F == AnonymousClass3pF.RECORDED && anonymousClass3pG.f44944I != null) {
                    String str = anonymousClass3pG.f44944I;
                    arrayList.add(new File(str));
                    AnonymousClass1Km anonymousClass1Km = new AnonymousClass1Km();
                    anonymousClass1Km.G(str);
                    anonymousClass1Km.f17207D = anonymousClass3pG.f44938C;
                    long j = anonymousClass3pG.f44939D;
                    anonymousClass1Km.f17220Q = 0;
                    anonymousClass1Km.f17209F = (int) j;
                    anonymousClass1Km.D(i2, i);
                    arrayList2.add(anonymousClass1Km);
                    Long.valueOf(j);
                    Integer.valueOf(i2);
                    Integer.valueOf(i);
                }
            }
            anonymousClass0OA.f3812Z = arrayList2;
            String absolutePath = ((File) arrayList.get(0)).getAbsolutePath();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(absolutePath.substring(0, absolutePath.length() - 4));
            stringBuilder.append("-stitched.mp4");
            String stringBuilder2 = stringBuilder.toString();
            File file = new File(stringBuilder2);
            stringBuilder = new StringBuilder();
            stringBuilder.append("Saving stitched file to: ");
            stringBuilder.append(stringBuilder2);
            stringBuilder.toString();
            float B = AnonymousClass2NI.m15314B(arrayList, file, false);
            AnonymousClass1Km anonymousClass1Km2 = new AnonymousClass1Km();
            anonymousClass1Km2.G(stringBuilder2);
            anonymousClass1Km2.f17207D = this.f52510B.f52517C.f52448B.f63949B.getCameraFacing().f33989B;
            anonymousClass1Km2.f17220Q = 0;
            B *= 1000.0f;
            anonymousClass1Km2.f17209F = (int) B;
            anonymousClass1Km2.f17216M = (long) B;
            anonymousClass1Km2.D(i2, i);
            anonymousClass0OA.bC = anonymousClass1Km2;
            anonymousClass0OA.tB = AnonymousClass3Zr.m20055D(stringBuilder2);
            Context context = (Context) this.f52510B.f52520F.get();
            if (context != null) {
                ((AnonymousClass0PI) context).VK().m18989Z(file.getPath()).m18986W(anonymousClass0OA.UB).m18984U(1.0f);
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Splitting and stitching took: ");
            stringBuilder.append(elapsedRealtime2 - elapsedRealtime);
            stringBuilder.append("ms");
            stringBuilder.toString();
        }
        return anonymousClass0OA;
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void m23783D(Object obj) {
        AnonymousClass0OA anonymousClass0OA = (AnonymousClass0OA) obj;
        super.D(anonymousClass0OA);
        if (anonymousClass0OA.bC == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Null stitchedClipInfo clipStackManager.size(): ");
            stringBuilder.append(this.f52510B.f52519E.f47998B.m19271D());
            stringBuilder.append(" ");
            stringBuilder.append("hasClips() ");
            stringBuilder.append(this.f52510B.f52519E.f47998B.f39868B.isEmpty() ^ 1);
            AnonymousClass0Gn.C("VideoCaptureController", stringBuilder.toString());
        }
        AnonymousClass4Ii anonymousClass4Ii = (AnonymousClass4Ii) this.f52510B.f52526L.get();
        if (anonymousClass4Ii != null) {
            anonymousClass4Ii.iV();
        }
        AnonymousClass0PN anonymousClass0PN = (AnonymousClass0PN) this.f52510B.f52523I.get();
        if (anonymousClass0PN != null) {
            anonymousClass0PN.sUA(anonymousClass0OA);
        }
        if (anonymousClass4Ii != null) {
            anonymousClass4Ii.Hc(anonymousClass0OA);
        }
    }

    /* renamed from: E */
    public final void m23784E() {
        super.E();
        AnonymousClass4Ii anonymousClass4Ii = (AnonymousClass4Ii) this.f52510B.f52526L.get();
        if (anonymousClass4Ii != null) {
            anonymousClass4Ii.FUA();
        }
    }
}

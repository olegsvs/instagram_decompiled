package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.C0164R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReporterActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0ax */
public final class AnonymousClass0ax extends AnonymousClass0ay {
    /* renamed from: B */
    public Activity f6613B;
    /* renamed from: C */
    public BugReport f6614C;
    /* renamed from: D */
    public Bitmap f6615D;
    /* renamed from: E */
    public final AnonymousClass0Cm f6616E;
    /* renamed from: F */
    private AnonymousClass0Ur f6617F;

    public AnonymousClass0ax(AnonymousClass0Cm anonymousClass0Cm, Activity activity, BugReport bugReport, Bitmap bitmap) {
        this.f6616E = anonymousClass0Cm;
        this.f6613B = activity;
        this.f6614C = bugReport;
        this.f6615D = bitmap;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo1397A(Object[] objArr) {
        Uri D;
        Void[] voidArr = (Void[]) objArr;
        ArrayList arrayList = this.f6614C.f37287K;
        ArrayList arrayList2 = this.f6614C.f37286J;
        AnonymousClass0Sy.m4433B();
        if (this.f6615D != null) {
            try {
                D = AnonymousClass3AU.D(this.f6615D, AnonymousClass339.B(this.f6613B, "image/png"));
                if (D != null) {
                    arrayList.add(D.getPath());
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.m1244G("LaunchBugReporterTask", "Could not create temporary file for screenshot.", e);
            }
        }
        if (arrayList2.isEmpty()) {
            AnonymousClass0Sy.m4433B();
            try {
                File createTempFile = File.createTempFile("logcat", ".txt", this.f6613B.getCacheDir());
                boolean z = AnonymousClass0Co.m1042B(this.f6616E) && AnonymousClass0FZ.m1634B().f2177B.getBoolean("add_debug_logs_to_rage_shakes", false);
                D = AnonymousClass3AU.C(createTempFile, z);
                if (D != null) {
                    arrayList2.add(D.getPath());
                }
            } catch (Throwable e2) {
                AnonymousClass0Dc.m1244G("LaunchBugReporterTask", "Could not create temporary file for logcat dump.", e2);
            }
            AnonymousClass0Sy.m4433B();
            try {
                D = AnonymousClass3AU.E(File.createTempFile("stacktrace", ".txt", this.f6613B.getCacheDir()));
                if (D != null) {
                    arrayList2.add(D.getPath());
                }
            } catch (Throwable e22) {
                AnonymousClass0Dc.m1244G("LaunchBugReporterTask", "Could not create temporary file for stack trace dump.", e22);
            }
            AnonymousClass0Sy.m4433B();
            AnonymousClass0FJ B = AnonymousClass0FJ.m1552B();
            if (B instanceof AnonymousClass0Nq) {
                AnonymousClass0Nq anonymousClass0Nq = (AnonymousClass0Nq) B;
                D = AnonymousClass0Nq.f3707Q.m4511A(this.f6613B);
                if (D != null) {
                    arrayList2.add(D.getPath());
                }
            }
            try {
                Collection B2 = AnonymousClass0Jt.m2726B(this.f6613B.getCacheDir());
                if (!B2.isEmpty()) {
                    arrayList2.addAll(B2);
                }
            } catch (Throwable e222) {
                AnonymousClass0Dc.m1244G("LaunchBugReporterTask", "Could not create temporary file for camera AR bug report.", e222);
            }
        }
        AnonymousClass0Sy.m4433B();
        AnonymousClass0Cm anonymousClass0Cm = this.f6616E;
        List arrayList3 = new ArrayList();
        arrayList3.add(new AnonymousClass09o(anonymousClass0Cm));
        AnonymousClass0J7 anonymousClass0J7 = AnonymousClass0J7.f2895B;
        if (anonymousClass0J7 != null) {
            arrayList3.addAll(anonymousClass0J7.mo531M(anonymousClass0Cm));
        }
        AnonymousClass0ny B3 = AnonymousClass1Va.m11686B(anonymousClass0Cm);
        if (B3 != null) {
            arrayList3.add(B3);
        }
        arrayList3.add(AnonymousClass2CP.f27395B.B());
        AnonymousClass3pL B4 = AnonymousClass3pL.B();
        if (B4 != null) {
            arrayList3.add(B4);
        }
        List<AnonymousClass0Ui> unmodifiableList = Collections.unmodifiableList(arrayList3);
        File file = new File(this.f6613B.getCacheDir(), "flytrap_attachments");
        if (!file.exists()) {
            file.mkdir();
        }
        for (AnonymousClass0Ui anonymousClass0Ui : unmodifiableList) {
            String HK = anonymousClass0Ui.HK();
            if (HK != null) {
                try {
                    String canonicalPath = new File(this.f6613B.getCacheDir(), "flytrap_attachments").getCanonicalPath();
                    String sL = anonymousClass0Ui.sL();
                    String tL = anonymousClass0Ui.tL();
                    if (tL != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(sL);
                        stringBuilder.append(tL);
                        sL = stringBuilder.toString();
                    }
                    File file2 = new File(canonicalPath, sL);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    D = AnonymousClass3AU.B(file2, HK);
                    if (D != null) {
                        arrayList2.add(D.getPath());
                    }
                } catch (Throwable e2222) {
                    AnonymousClass0Dc.m1244G("LaunchBugReporterTask", "Could not create log file for attachment.", e2222);
                }
            }
        }
        BugReport bugReport = new BugReport();
        BugReport bugReport2 = this.f6614C;
        BugReport bugReport3 = new BugReport();
        bugReport3.f37278B = bugReport2.f37278B;
        bugReport3.f37280D = bugReport2.f37280D;
        bugReport3.f37281E = bugReport2.f37281E;
        bugReport3.f37282F = bugReport2.f37282F;
        bugReport3.f37283G = bugReport2.f37283G;
        bugReport3.f37284H = bugReport2.f37284H;
        bugReport3.f37286J = bugReport2.f37286J;
        bugReport3.f37289M = bugReport2.f37289M;
        bugReport3.f37279C = bugReport2.f37279C;
        bugReport3.f37287K = bugReport2.f37287K;
        bugReport3.f37288L = bugReport2.f37288L;
        bugReport3.f37285I = bugReport2.f37285I;
        bugReport3.f37287K = arrayList;
        bugReport3.f37286J = arrayList2;
        this.f6614C = bugReport3;
        return null;
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void mo1398D(Object obj) {
        Void voidR = (Void) obj;
        if (this.f6613B != null) {
            m5499F();
            if (this.f6614C.f37287K.isEmpty()) {
                if (this.f6614C.f37286J.isEmpty()) {
                    AnonymousClass0IG.m2164F(C0164R.string.bugreporter_error_prepare_bugreport_failed);
                    return;
                }
            }
            Intent intent = new Intent(this.f6613B, BugReporterActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT", this.f6614C);
            intent.putExtra("IgSessionManager.USER_ID", this.f6616E.f1759C);
            AnonymousClass0Fl D = AnonymousClass33N.D(this.f6616E);
            AnonymousClass0Gj anonymousClass0Gj = AnonymousClass0Gi.f2408B;
            anonymousClass0Gj.m1848E(D);
            anonymousClass0Gj.m1848E(new AnonymousClass33K());
            AnonymousClass0IW.m2243I(intent, this.f6613B);
        }
    }

    /* renamed from: E */
    public final void mo1399E() {
        AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(this.f6613B);
        this.f6617F = anonymousClass0Ur;
        anonymousClass0Ur.m4776A(this.f6613B.getString(C0164R.string.bugreporter_wait));
        this.f6617F.show();
    }

    /* renamed from: F */
    public final void m5499F() {
        AnonymousClass0Ur anonymousClass0Ur = this.f6617F;
        if (anonymousClass0Ur != null) {
            anonymousClass0Ur.dismiss();
            this.f6617F = null;
        }
    }
}

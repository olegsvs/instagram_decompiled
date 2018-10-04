package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.common.patch.core.PatchException;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fbreact.autoupdater.patch.OtaPatchFunction$PatchNativeImpl;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.1eN */
public final class AnonymousClass1eN {
    /* renamed from: B */
    public AnonymousClass1Lz f20971B;
    /* renamed from: C */
    public Context f20972C;
    /* renamed from: D */
    public AnonymousClass1eQ f20973D;
    /* renamed from: E */
    public AnonymousClass1eP f20974E;
    /* renamed from: F */
    private AnonymousClass1eX f20975F;
    /* renamed from: G */
    private AnonymousClass1W9 f20976G;
    /* renamed from: H */
    private AnonymousClass1eW f20977H;

    public AnonymousClass1eN(Context context, AnonymousClass1Lz anonymousClass1Lz, AnonymousClass1eP anonymousClass1eP, AnonymousClass1eQ anonymousClass1eQ, AnonymousClass1W9 anonymousClass1W9) {
        this(context, anonymousClass1Lz, anonymousClass1eP, anonymousClass1eQ, anonymousClass1W9, null, new AnonymousClass1eW(anonymousClass1eQ));
    }

    public AnonymousClass1eN(Context context, AnonymousClass1Lz anonymousClass1Lz, AnonymousClass1eP anonymousClass1eP, AnonymousClass1eQ anonymousClass1eQ, AnonymousClass1W9 anonymousClass1W9, AnonymousClass1eX anonymousClass1eX, AnonymousClass1eW anonymousClass1eW) {
        this.f20972C = context;
        this.f20971B = anonymousClass1Lz;
        this.f20974E = anonymousClass1eP;
        this.f20973D = anonymousClass1eQ;
        this.f20976G = anonymousClass1W9;
        this.f20977H = anonymousClass1eW;
        this.f20975F = anonymousClass1eX;
        AnonymousClass1W9 B = AnonymousClass1eZ.m12320B(anonymousClass1eQ);
        if (B != null) {
            this.f20976G = B;
        }
    }

    /* renamed from: A */
    public final void m12290A() {
        if (!(AnonymousClass1Lz.m10920C(this.f20971B).m10939E("download_start_time", 0) == 0 || AnonymousClass1Lz.m10920C(this.f20971B).m10939E("download_end_time", 0) != 0 || AnonymousClass1Lz.m10920C(this.f20971B).m10937C("download_fail_reported", false))) {
            int D = AnonymousClass1Lz.m10920C(this.f20971B).m10938D("download_version", 0);
            int D2 = AnonymousClass1Lz.m10920C(this.f20971B).m10938D("update_version", 0);
            if (!(D == 0 || D2 == 0)) {
                Integer.valueOf(D);
                this.f20974E.mo2660D(new AnonymousClass1eS(D2, D, AnonymousClass1Lz.m10920C(this.f20971B).m10938D("download_size", 0), null), new AnonymousClass1eU("Job killed while downloading the update"));
            }
            this.f20971B.m10927F();
        }
        AnonymousClass1eN.m12273B(this, false, 0);
        AnonymousClass1eQ anonymousClass1eQ = this.f20973D;
        AnonymousClass1Lz anonymousClass1Lz = this.f20971B;
        AnonymousClass1eQ.m12307F(anonymousClass1eQ.f20980B, null);
        AnonymousClass1eQ.m12304C(anonymousClass1eQ, anonymousClass1Lz);
        AnonymousClass1eQ.m12303B(anonymousClass1eQ, anonymousClass1Lz);
    }

    /* renamed from: B */
    public static void m12273B(AnonymousClass1eN anonymousClass1eN, boolean z, long j) {
        if (!z) {
            if (AnonymousClass1eN.m12275D(anonymousClass1eN, j)) {
                AnonymousClass0Dc.m1253P("AutoUpdaterImpl", "Update check skipped: on cooldown");
                return;
            } else if (AnonymousClass1eN.m12276E(anonymousClass1eN)) {
                AnonymousClass0Dc.m1253P("AutoUpdaterImpl", "Update check skipped: previous download failures");
                return;
            }
        }
        AnonymousClass1bO FLA = anonymousClass1eN.f20976G.FLA(anonymousClass1eN.f20972C);
        AnonymousClass1Lz anonymousClass1Lz = anonymousClass1eN.f20971B;
        AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10936B().SIA("check_updates_time", AnonymousClass1eN.m12274C()).apply();
        if (FLA != null) {
            if (FLA.f20458B != AnonymousClass1eb.NOOP) {
                if (FLA.f20458B == AnonymousClass1eb.REVERT) {
                    if (anonymousClass1eN.f20971B.m10924C() != 0) {
                        AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10936B().QIA("next", -1).apply();
                    } else if (anonymousClass1eN.f20971B.m10926E() != 0) {
                        anonymousClass1eN.f20971B.m10923B();
                    }
                } else if (!AnonymousClass1eN.m12285N(anonymousClass1eN, FLA)) {
                    if (AnonymousClass1eN.m12287P(anonymousClass1eN, FLA)) {
                        anonymousClass1Lz = anonymousClass1eN.f20971B;
                        AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10936B().QIA("next", FLA.OL()).apply();
                        anonymousClass1Lz = anonymousClass1eN.f20971B;
                        AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10936B().UIA("release_id", FLA.m11986I());
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public static long m12274C() {
        return System.currentTimeMillis();
    }

    /* renamed from: D */
    private static boolean m12275D(AnonymousClass1eN anonymousClass1eN, long j) {
        boolean z = false;
        if (j > 0) {
            long E = AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10939E("check_updates_time", 0);
            if (E != 0) {
                long C = AnonymousClass1eN.m12274C();
                if (E > C) {
                    AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10936B().VJA("check_updates_time").apply();
                    return false;
                } else if (C - E < TimeUnit.MINUTES.toMillis(j)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: E */
    private static boolean m12276E(AnonymousClass1eN anonymousClass1eN) {
        String str = "download_start_time";
        long E = AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10939E(str, 0);
        boolean z = false;
        if (E != 0) {
            long C = AnonymousClass1eN.m12274C();
            if (E > C) {
                AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10936B().VJA("update_version").VJA("update_attempts").VJA("download_version").VJA("download_size").VJA(str).VJA("download_end_time").VJA("download_fail_reported").commit();
                return false;
            }
            if (C - E < TimeUnit.HOURS.toMillis((long) AnonymousClass5ee.f67808B[Math.min(AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10938D("update_attempts", 0), AnonymousClass5ee.f67808B.length - 1)])) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F */
    private static AnonymousClass1ec m12277F(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        int D = anonymousClass1bO.m11981D();
        if (D != 0) {
            Object C = anonymousClass1bO.m11980C();
            if (!TextUtils.isEmpty(C)) {
                File C2 = anonymousClass1eN.f20973D.m12312C(D);
                if (AnonymousClass1eN.m12280I(anonymousClass1eN, new AnonymousClass1eS(anonymousClass1bO.OL(), anonymousClass1bO.m11981D(), 0, anonymousClass1bO.HQ()), C, C2)) {
                    File D2 = anonymousClass1eN.f20973D.m12313D(D);
                    D2.mkdir();
                    for (File name : AnonymousClass1eN.m12286O(C2, D2)) {
                        name.getName();
                    }
                    return new AnonymousClass1ec(D2, D, anonymousClass1eN.f20975F);
                }
            }
        }
        return null;
    }

    /* renamed from: G */
    private static AnonymousClass1ec m12278G(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        int OL = anonymousClass1bO.OL();
        if (OL != 0) {
            File C = anonymousClass1eN.f20973D.m12312C(OL);
            if (AnonymousClass1eN.m12280I(anonymousClass1eN, anonymousClass1bO, anonymousClass1bO.m11983F(), C)) {
                File file = anonymousClass1eN.f20973D.f20980B;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Integer.toString(OL));
                stringBuilder.append("_delta");
                File file2 = new File(file, stringBuilder.toString());
                file2.mkdirs();
                for (File name : AnonymousClass1eN.m12286O(C, file2)) {
                    name.getName();
                }
                return new AnonymousClass1ec(file2, OL);
            }
        }
        return null;
    }

    /* renamed from: H */
    private static AnonymousClass1eY m12279H(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        int OL = anonymousClass1bO.OL();
        if (OL != 0) {
            Object G = anonymousClass1bO.m11984G();
            if (!TextUtils.isEmpty(G)) {
                File C = anonymousClass1eN.f20973D.m12312C(OL);
                if (AnonymousClass1eN.m12280I(anonymousClass1eN, anonymousClass1bO, G, C)) {
                    File E = anonymousClass1eN.f20973D.m12314E(OL);
                    for (File name : AnonymousClass1eN.m12286O(C, E)) {
                        name.getName();
                    }
                    return new AnonymousClass1ec(E, OL);
                }
            }
        }
        return null;
    }

    /* renamed from: I */
    private static boolean m12280I(AnonymousClass1eN anonymousClass1eN, AnonymousClass1eT anonymousClass1eT, String str, File file) {
        long j;
        if (anonymousClass1eT.HQ() == null) {
            j = Long.MAX_VALUE;
        } else {
            j = anonymousClass1eT.HQ().getTime();
        }
        long C = AnonymousClass1eN.m12274C();
        AnonymousClass1Lz anonymousClass1Lz = anonymousClass1eN.f20971B;
        int lT = anonymousClass1eT.lT();
        int OL = anonymousClass1eT.OL();
        int PL = anonymousClass1eT.PL();
        int i = 0;
        int D = AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10938D("update_attempts", 0);
        if (OL == lT) {
            int D2 = AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10938D("update_version", 0);
            if (D2 != 0 && lT == D2) {
                i = 1;
            }
            D = i != 0 ? D + 1 : 1;
        }
        AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10936B().QIA("update_version", lT).QIA("update_attempts", D).QIA("download_version", OL).QIA("download_size", PL).SIA("download_start_time", C).VJA("download_end_time").VJA("download_fail_reported").commit();
        C = Math.max(0, C - j);
        Long.valueOf(TimeUnit.MILLISECONDS.toHours(C));
        anonymousClass1eN.f20974E.mo2658B(anonymousClass1eT, C);
        StringBuilder stringBuilder;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass1eN.f20976G.qG(str, file);
            C = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (!file.exists() || file.length() == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed OTA update from '");
                stringBuilder.append(str);
                stringBuilder.append("'.");
                stringBuilder.append("Downloaded file was empty");
                throw new AnonymousClass1eU(stringBuilder.toString());
            }
            if (anonymousClass1eT.PL() != 0) {
                if (file.length() != ((long) anonymousClass1eT.PL())) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Failed OTA update from '");
                    stringBuilder2.append(str);
                    stringBuilder2.append("'.");
                    stringBuilder2.append(" Downloaded file was of size ");
                    stringBuilder2.append(file.length());
                    stringBuilder2.append(" but expecting file of size ");
                    stringBuilder2.append(anonymousClass1eT.PL());
                    throw new AnonymousClass1eU(stringBuilder2.toString());
                }
            }
            AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10936B().SIA("download_end_time", AnonymousClass1eN.m12274C()).commit();
            anonymousClass1eN.f20974E.mo2659C(anonymousClass1eT, C);
            return file.isFile();
        } catch (Throwable th) {
            Throwable anonymousClass1eU;
            AnonymousClass0Dc.m1254Q("AutoUpdaterImpl", "Failed to download", th);
            if (TextUtils.isEmpty(th.getMessage())) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed OTA update from '");
                stringBuilder.append(str);
                stringBuilder.append("'.");
                stringBuilder.append(" Throwable of type: ");
                stringBuilder.append(th.getClass().getSimpleName());
                stringBuilder.append(" during download update");
                anonymousClass1eU = new AnonymousClass1eU(stringBuilder.toString());
            } else {
                anonymousClass1eU = th;
            }
            anonymousClass1eN.f20974E.mo2660D(anonymousClass1eT, anonymousClass1eU);
            anonymousClass1eN.f20971B.m10927F();
            AnonymousClass1eN.m12282K(anonymousClass1eN, "Failed to download", th);
            return false;
        }
    }

    /* renamed from: J */
    private static AnonymousClass1eY m12281J(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO, Set set) {
        int D = anonymousClass1bO.m11981D();
        if (D == 0 || !anonymousClass1eN.f20973D.m12315F(D)) {
            AnonymousClass1eX anonymousClass1eX = anonymousClass1eN.f20975F;
            if (anonymousClass1eX != null && anonymousClass1eX.f20995B.m10925D() == D && anonymousClass1eN.f20975F.m12318B(set)) {
                Integer.valueOf(anonymousClass1bO.OL());
                return anonymousClass1eN.f20975F;
            }
            AnonymousClass1eY F;
            int D2 = AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10938D("delta_base_version", 0);
            if (D2 == 0 || D2 != D) {
                F = AnonymousClass1eN.m12277F(anonymousClass1eN, anonymousClass1bO);
                if (F != null) {
                    AnonymousClass1Lz anonymousClass1Lz = anonymousClass1eN.f20971B;
                    AnonymousClass1Lz.m10920C(anonymousClass1Lz).m10936B().QIA("delta_base_version", F.f21004C).apply();
                }
            } else {
                F = new AnonymousClass1ec(anonymousClass1eN.f20973D.m12313D(D2), D, anonymousClass1eN.f20975F);
            }
            if (F == null || !F.m12321A(set)) {
                F = null;
            }
            return F;
        }
        Integer.valueOf(D);
        Integer.valueOf(anonymousClass1bO.OL());
        return new AnonymousClass1ec(anonymousClass1eN.f20973D.m12314E(D), D, anonymousClass1eN.f20975F);
    }

    /* renamed from: K */
    private static void m12282K(AnonymousClass1eN anonymousClass1eN, String str, Throwable th) {
        String str2 = "ota_update_failure";
        AnonymousClass1eP anonymousClass1eP = anonymousClass1eN.f20974E;
        if (anonymousClass1eP instanceof AnonymousClass1ed) {
            ((AnonymousClass1ed) anonymousClass1eP).reportSoftError(str2, str, th);
        }
    }

    /* renamed from: L */
    private static AnonymousClass1eY m12283L(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        PatchException anonymousClass1eU;
        Throwable e;
        try {
            AnonymousClass1ec G = AnonymousClass1eN.m12278G(anonymousClass1eN, anonymousClass1bO);
            String str;
            if (G != null) {
                File sQ = G.sQ("ota_delta_update_manifest.json");
                if (sQ == null || !sQ.isFile()) {
                    str = "Delta bundle missing manifest file";
                    AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
                    anonymousClass1eU = new AnonymousClass1eU(str);
                } else {
                    AnonymousClass1ee B = AnonymousClass1ee.m12322B(sQ);
                    AnonymousClass1eY J = AnonymousClass1eN.m12281J(anonymousClass1eN, anonymousClass1bO, B.m12323A());
                    if (J == null) {
                        str = "Unable to obtain base bundle for delta update";
                        AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
                        anonymousClass1eU = new AnonymousClass1eU(str);
                    } else if (AnonymousClass1eN.m12288Q(J, B)) {
                        AnonymousClass1eW anonymousClass1eW = anonymousClass1eN.f20977H;
                        Set A = B.m12323A();
                        if (G.f21003B != null) {
                            File[] listFiles = G.f21003B.listFiles();
                            if (listFiles != null) {
                                int i = G.f21004C;
                                File E = anonymousClass1eW.f20994B.m12314E(i);
                                E.mkdirs();
                                for (File file : listFiles) {
                                    Object name = file.getName();
                                    if (!name.equals("ota_delta_update_manifest.json")) {
                                        if (A.contains(name)) {
                                            sQ = J.sQ(name);
                                            if (sQ != null) {
                                                OtaPatchFunction$PatchNativeImpl.patch(sQ.getAbsolutePath(), file.getAbsolutePath(), new File(E, name).getAbsolutePath());
                                            } else {
                                                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Unable to obtain base file for resource %s", name);
                                                AnonymousClass0Dc.m1253P("AutoUpdaterImpl", formatStrLocaleSafe);
                                                throw new AnonymousClass1eU(formatStrLocaleSafe);
                                            }
                                        }
                                        AnonymousClass1eQ.m12306E(file, new File(E, name));
                                    }
                                }
                                return new AnonymousClass1ec(E, i);
                            }
                            str = "No files in delta update";
                            AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
                            anonymousClass1eU = new AnonymousClass1eU(str);
                        } else {
                            str = "No files in delta update";
                            AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
                            anonymousClass1eU = new AnonymousClass1eU(str);
                        }
                    } else {
                        str = "Base bundle Verification failed";
                        AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
                        anonymousClass1eU = new AnonymousClass1eU(str);
                    }
                }
            } else {
                str = "Failed to download and extract a delta bundle";
                AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
                anonymousClass1eU = new AnonymousClass1eU(str);
            }
        } catch (Throwable e2) {
            anonymousClass1eU = new PatchException("Error applying patch.", e2);
        } catch (Throwable th) {
            AnonymousClass0Dc.m1254Q("AutoUpdaterImpl", "Failed Delta Update", th);
            if (TextUtils.isEmpty(th.getMessage())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Throwable of type: ");
                stringBuilder.append(th.getClass().getSimpleName());
                stringBuilder.append(" during delta update");
                e2 = new AnonymousClass1eU(stringBuilder.toString());
            } else {
                e2 = th;
            }
            anonymousClass1eN.f20974E.mo2660D(anonymousClass1bO, e2);
            AnonymousClass1eN.m12282K(anonymousClass1eN, "Failed Delta Update", th);
            return null;
        }
        throw anonymousClass1eU;
    }

    /* renamed from: M */
    private static AnonymousClass1eY m12284M(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        try {
            return AnonymousClass1eN.m12279H(anonymousClass1eN, anonymousClass1bO);
        } catch (Throwable th) {
            Throwable anonymousClass1eU;
            AnonymousClass0Dc.m1254Q("AutoUpdaterImpl", "Failed Full Update", th);
            if (TextUtils.isEmpty(th.getMessage())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Throwable of type: ");
                stringBuilder.append(th.getClass().getSimpleName());
                stringBuilder.append(" during full update");
                anonymousClass1eU = new AnonymousClass1eU(stringBuilder.toString());
            } else {
                anonymousClass1eU = th;
            }
            anonymousClass1eN.f20974E.mo2660D(anonymousClass1bO, anonymousClass1eU);
            AnonymousClass1eN.m12282K(anonymousClass1eN, "Failed Full Update", th);
            return null;
        }
    }

    /* renamed from: N */
    private static boolean m12285N(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        int OL = anonymousClass1bO.OL();
        if (OL <= 0) {
            AnonymousClass0Dc.m1255R("AutoUpdaterImpl", "Invalid build number %d", Integer.valueOf(OL));
            return true;
        } else if (anonymousClass1eN.f20971B.m10924C() == OL && anonymousClass1eN.f20973D.m12315F(OL)) {
            anonymousClass1eN.f20971B.m10923B();
            Integer.valueOf(OL);
            return true;
        } else if (anonymousClass1eN.f20971B.m10926E() == OL && anonymousClass1eN.f20973D.m12315F(OL)) {
            Integer.valueOf(OL);
            return true;
        } else if (TextUtils.isEmpty(anonymousClass1bO.m11984G()) && TextUtils.isEmpty(anonymousClass1bO.m11983F())) {
            AnonymousClass0Dc.m1255R("AutoUpdaterImpl", "No download url with update %d", Integer.valueOf(OL));
            return true;
        } else {
            if (anonymousClass1bO.m11978A() == AnonymousClass1ef.WIFI) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) anonymousClass1eN.f20972C.getSystemService("connectivity")).getActiveNetworkInfo();
                Object obj = 1;
                if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
                    obj = null;
                }
                if (obj == null) {
                    AnonymousClass0Dc.m1255R("AutoUpdaterImpl", "Update %d needs to be downloaded on wifi", Integer.valueOf(OL));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: O */
    private static List m12286O(File file, File file2) {
        file2.mkdirs();
        List arrayList = new ArrayList();
        Closeable zipInputStream = new ZipInputStream(new FileInputStream(file));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                File file3 = new File(file2, nextEntry.getName());
                AnonymousClass1eQ.m12308G(file3, zipInputStream);
                arrayList.add(file3);
                zipInputStream.closeEntry();
            } finally {
                AnonymousClass1eQ.m12305D(zipInputStream);
            }
        }
        return arrayList;
    }

    /* renamed from: P */
    private static boolean m12287P(AnonymousClass1eN anonymousClass1eN, AnonymousClass1bO anonymousClass1bO) {
        AnonymousClass1eY L;
        boolean z = true;
        if (!(TextUtils.isEmpty(anonymousClass1bO.m11983F()) || AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10935A("native_version_override"))) {
            AnonymousClass1el anonymousClass1el = new AnonymousClass1el(anonymousClass1bO.f20459C);
            anonymousClass1el.f21028H = anonymousClass1bO.m11982E();
            AnonymousClass1bO anonymousClass1bO2 = new AnonymousClass1bO(anonymousClass1el);
            L = AnonymousClass1eN.m12283L(anonymousClass1eN, anonymousClass1bO2);
            if (L == null || !AnonymousClass1eN.m12289R(anonymousClass1eN, L, anonymousClass1bO2)) {
                if (!anonymousClass1bO.m11985H()) {
                    return false;
                }
            }
            return z;
        }
        L = AnonymousClass1eN.m12284M(anonymousClass1eN, anonymousClass1bO);
        if (L == null || !AnonymousClass1eN.m12289R(anonymousClass1eN, L, anonymousClass1bO)) {
            z = false;
        }
        return z;
    }

    /* renamed from: Q */
    private static boolean m12288Q(AnonymousClass1eY anonymousClass1eY, AnonymousClass1ee anonymousClass1ee) {
        for (String str : anonymousClass1ee.m12323A()) {
            AnonymousClass5ed anonymousClass5ed = (AnonymousClass5ed) anonymousClass1ee.f21014C.get(str);
            File sQ = anonymousClass1eY.sQ(str);
            if (sQ != null) {
                if (AnonymousClass1eg.m12326D(sQ, anonymousClass5ed.f67806B)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private static boolean m12289R(AnonymousClass1eN anonymousClass1eN, AnonymousClass1eY anonymousClass1eY, AnonymousClass1bO anonymousClass1bO) {
        if (anonymousClass1eY == null) {
            return false;
        }
        boolean C = AnonymousClass1eg.m12325C(anonymousClass1eY, anonymousClass1bO);
        if (C) {
            anonymousClass1eN.f20974E.mo2661E(anonymousClass1bO);
            AnonymousClass1Lz.m10921D(anonymousClass1eN.f20971B, anonymousClass1eY, "next_js_file_size");
            AnonymousClass1Lz.m10920C(anonymousClass1eN.f20971B).m10936B().VJA("update_attempts").apply();
        } else {
            String str = "Verification failed";
            AnonymousClass0Dc.m1253P("AutoUpdaterImpl", str);
            anonymousClass1eN.f20974E.mo2660D(anonymousClass1bO, new AnonymousClass1eU(str));
        }
        return C;
    }
}

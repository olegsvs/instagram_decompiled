package com.instagram.arlink.util;

import X.AnonymousClass005;
import X.AnonymousClass09p;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Du;
import X.AnonymousClass0F4;
import X.AnonymousClass0FH;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gd;
import X.AnonymousClass0Gp;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Qv;
import X.AnonymousClass0a9;
import X.AnonymousClass0aJ;
import X.AnonymousClass0gN;
import X.AnonymousClass1Ag;
import X.AnonymousClass1dr;
import X.AnonymousClass1ds;
import X.AnonymousClass317;
import X.AnonymousClass31N;
import X.AnonymousClass3Ai;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.common.dextricks.DexStore;
import com.instagram.service.session.ShouldInitUserSession;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

@ShouldInitUserSession
public class ArLinkModelDownloadService extends AnonymousClass09p {
    /* renamed from: B */
    public static final long f16904B = TimeUnit.HOURS.toMillis(1);
    /* renamed from: C */
    private static final String f16905C = "com.instagram.arlink.util.ArLinkModelDownloadService";

    /* renamed from: C */
    public final void mo173C(Intent intent) {
        long C = AnonymousClass0Gd.m1838C() - AnonymousClass0FH.f2099C.f2100B.getLong("arlink_model_last_check_timestamp", 0);
        if (!m10671D() || C > f16904B) {
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0Ce.m951H(this));
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "users/arlink_download_info/";
            AnonymousClass0GA H = anonymousClass0Pt.m3944M(AnonymousClass1dr.class).m3939H();
            H.f2849B = new AnonymousClass1ds(this);
            AnonymousClass0Ix.m2383C(H);
        }
    }

    /* renamed from: D */
    public static boolean m10671D() {
        return (TextUtils.isEmpty(AnonymousClass0FH.f2099C.m1529A()) || TextUtils.isEmpty(AnonymousClass0FH.f2099C.f2100B.getString("arlink_model_version", null))) ? false : true;
    }

    /* renamed from: E */
    public static void m10672E(ArLinkModelDownloadService arLinkModelDownloadService, String str, String str2, String str3, long j) {
        Throwable e;
        Throwable th;
        Object A = AnonymousClass0FH.f2099C.m1529A();
        if (A != null && A.equals(str2)) {
            AnonymousClass0Dc.m1253P(f16905C, "Model checksum unchanged. No need to update.");
        } else if (TextUtils.isEmpty(str3)) {
            AnonymousClass0Dc.m1253P(f16905C, "Unknown model version.");
        } else {
            if (j <= 0) {
                j = 1048576;
            }
            if (AnonymousClass1Ag.m9745I(arLinkModelDownloadService) < j * 3) {
                AnonymousClass0Dc.m1253P(f16905C, "Not sufficient internal storage for model.");
                return;
            }
            AnonymousClass0a9 AHA = AnonymousClass0a9.f6449F.AHA(str);
            AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
            anonymousClass0gN.f8152H = AnonymousClass0Qv.API;
            Closeable closeable = null;
            try {
                AnonymousClass0aJ B = AnonymousClass0Gp.f2421B.mo355B(AHA, anonymousClass0gN.m6617A());
                File cacheDir = arLinkModelDownloadService.getCacheDir();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(".tmp");
                File file = new File(cacheDir, stringBuilder.toString());
                closeable = B.EN();
                try {
                    AnonymousClass1Ag.m9738B(closeable, file);
                    if (AnonymousClass31N.B(file, str2)) {
                        cacheDir = new File(arLinkModelDownloadService.getFilesDir(), "ig_arlink_model");
                        if (m10674G(file.getAbsolutePath(), new File(cacheDir, str2))) {
                            AnonymousClass0FH.f2099C.m1537I(str2);
                            AnonymousClass0FH.f2099C.f2100B.edit().putString("arlink_model_version", str3).apply();
                            file.delete();
                            if (!TextUtils.isEmpty(A)) {
                                AnonymousClass1Ag.m9740D(new File(cacheDir, A).getAbsolutePath());
                            }
                            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass317());
                        }
                    } else {
                        AnonymousClass0Dc.m1243F(f16905C, "Fail to verify checksum of downloaded model.");
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        AnonymousClass0Dc.m1244G(f16905C, "Fail to download ARLink model.", e);
                        AnonymousClass0Du.m1315C(closeable);
                    } catch (Throwable th2) {
                        th = th2;
                        AnonymousClass0Du.m1315C(closeable);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    AnonymousClass0Du.m1315C(closeable);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                AnonymousClass0Dc.m1244G(f16905C, "Fail to download ARLink model.", e);
                AnonymousClass0Du.m1315C(closeable);
            }
            AnonymousClass0Du.m1315C(closeable);
        }
    }

    /* renamed from: F */
    public static void m10673F(Context context) {
        Class cls = ArLinkModelDownloadService.class;
        AnonymousClass005.m5B(context, cls, AnonymousClass3Ai.f38579B, new Intent(context, cls));
    }

    /* renamed from: G */
    private static boolean m10674G(String str, File file) {
        try {
            BufferedOutputStream bufferedOutputStream;
            Throwable th;
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath);
            if (!file2.exists()) {
                file2.mkdir();
            }
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            while (true) {
                str = zipInputStream.getNextEntry();
                if (str != null) {
                    String name = str.getName();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("..");
                    String str2 = File.separator;
                    stringBuilder.append(str2);
                    if (name.contains(stringBuilder.toString())) {
                        throw new IOException("zipEntryName contains ../");
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(absolutePath);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(name);
                    String stringBuilder3 = stringBuilder2.toString();
                    if (str.isDirectory()) {
                        new File(stringBuilder3).mkdir();
                    } else {
                        int lastIndexOf = stringBuilder3.lastIndexOf(str2);
                        if (lastIndexOf != -1) {
                            new File(stringBuilder3.substring(0, lastIndexOf)).mkdirs();
                        }
                        bufferedOutputStream = null;
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(stringBuilder3));
                            try {
                                byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED];
                                while (true) {
                                    lastIndexOf = zipInputStream.read(bArr);
                                    if (lastIndexOf == -1) {
                                        break;
                                    }
                                    bufferedOutputStream2.write(bArr, 0, lastIndexOf);
                                }
                                bufferedOutputStream2.close();
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream = bufferedOutputStream2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    zipInputStream.closeEntry();
                } else {
                    zipInputStream.close();
                    return true;
                }
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        } catch (Throwable e) {
            AnonymousClass0Dc.m1244G(f16905C, "Fail to unzip downloaded model.", e);
            return false;
        }
    }
}

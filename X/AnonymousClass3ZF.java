package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3ZF */
public final class AnonymousClass3ZF {
    /* renamed from: B */
    public static final Class f42291B = AnonymousClass3ZF.class;

    /* renamed from: B */
    public static void m20017B(AnonymousClass2FE anonymousClass2FE, boolean z) {
        String str;
        AnonymousClass2FE anonymousClass2FE2 = anonymousClass2FE;
        AnonymousClass0OA anonymousClass0OA = anonymousClass2FE2.f27997G;
        boolean z2 = z;
        if (z) {
            str = anonymousClass0OA.f3819g;
        } else {
            str = anonymousClass0OA.DB;
        }
        File file = new File(str);
        if (file.exists() && file.isFile() && file.length() > 0) {
            try {
                AnonymousClass2bJ anonymousClass2bJ = anonymousClass2FE2.f28002L;
                anonymousClass2bJ.m16406A(0, file.length() - 1, file.length(), "i.instagram.com/rupload_igphoto");
                String B = AnonymousClass3ZG.m20018B(str, anonymousClass2FE2.f28006P, anonymousClass2FE2.f27997G.f3835w);
                z = ((Boolean) AnonymousClass0CC.Ke.G()).booleanValue() ? AnonymousClass3ZG.m20019C(anonymousClass0OA) : true;
                Boolean.valueOf(z);
                AnonymousClass0OA anonymousClass0OA2 = anonymousClass2FE2.f27997G;
                Map hashMap = new HashMap();
                hashMap.put("X-Instagram-Rupload-Params", new JSONObject(AnonymousClass3Ye.m19964G(anonymousClass2FE2.f28007Q, anonymousClass0OA2, anonymousClass2FE2.f28006P, z2)).toString());
                hashMap.put("X_FB_PHOTO_WATERFALL_ID", anonymousClass0OA2.G());
                AnonymousClass1u6 anonymousClass1u6 = new AnonymousClass1u6(AnonymousClass1u2.INSTAGRAM_PHOTO, hashMap, new AnonymousClass1u4(2, 100, 30000), new AnonymousClass1u1(false, DexStore.LOAD_RESULT_MIXED_MODE, "SHA256"), null, AnonymousClass0fz.C(), null, z);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AnonymousClass2Qg anonymousClass2Qg = new AnonymousClass2Qg(new AnonymousClass3ZJ(anonymousClass2FE2.f28007Q, new AnonymousClass3ZS(anonymousClass2FE2.f28001K)));
                AnonymousClass1uP B2 = anonymousClass2Qg.m15679B(anonymousClass2Qg.m15678A(new AnonymousClass1u8(file, "image/jpeg", B), anonymousClass1u6, anonymousClass2bJ));
                Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                anonymousClass0OA.b().f16859C = B2.f23976D;
                anonymousClass2FE2.m14813I();
                anonymousClass2bJ.f31397E = 0;
                anonymousClass2bJ.f31396D = -1;
                anonymousClass2bJ.f31398F = -1;
                return;
            } catch (Throwable e) {
                AnonymousClass0Dc.E(f42291B, e, "fbuploader upload error", new Object[0]);
                throw new IOException(e.getMessage(), e.getCause());
            }
        }
        AnonymousClass0Dc.D(f42291B, "content file does not exist: %s", new Object[]{file.getCanonicalPath()});
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("content file does not exist:");
        stringBuilder.append(file.getPath());
        throw new FileNotFoundException(stringBuilder.toString());
    }
}

package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.05g */
public final class AnonymousClass05g {
    /* renamed from: B */
    public static String m341B(long j) {
        Object[] objArr = new Object[1];
        double d = (double) j;
        Double.isNaN(d);
        objArr[0] = Double.valueOf(d / 1000.0d);
        return AnonymousClass1Cn.m9922B("%.3f", objArr);
    }

    /* renamed from: C */
    public static File m342C(Context context, String str) {
        File filesDir = context.getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mqtt_analytics.");
        stringBuilder.append(str);
        return new File(filesDir, stringBuilder.toString());
    }

    /* renamed from: D */
    public static Map m343D(String... strArr) {
        if (strArr.length % 2 == 0) {
            Map hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i += 2) {
                hashMap.put(AnonymousClass1Cn.m9925E(strArr[i]), AnonymousClass1Cn.m9925E(strArr[i + 1]));
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Map must have an even (or zero) number of parameters");
    }
}

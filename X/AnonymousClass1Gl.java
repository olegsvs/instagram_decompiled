package X;

import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LruCache;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Gl */
public final class AnonymousClass1Gl {
    /* renamed from: B */
    private static final String f16381B = "Util";
    /* renamed from: C */
    public static volatile boolean f16382C;

    /* renamed from: B */
    public static String m10572B(String str, String str2, Uri uri, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        if (uri != null && "127.0.0.1".equals(uri.getHost())) {
            uri = Uri.parse(uri.getQueryParameter("remote-uri"));
        }
        if (str == null && z) {
            str = Integer.toHexString(uri.hashCode());
        }
        stringBuilder.append(str2);
        String str3 = ".";
        stringBuilder.append(str3);
        stringBuilder.append(str);
        stringBuilder.append(str3);
        stringBuilder.append(uri.getLastPathSegment());
        String stringBuilder2 = stringBuilder.toString();
        new Object[1][0] = stringBuilder2;
        return stringBuilder2;
    }

    /* renamed from: C */
    public static void m10573C(String str, String str2, Object... objArr) {
        if (f16382C) {
            Log.w(str, String.format(str2, objArr));
        } else {
            String.format(str2, objArr);
        }
    }

    /* renamed from: D */
    public static void m10574D(String str, Throwable th, String str2, Object... objArr) {
        if (f16382C) {
            Log.w(str, String.format(str2, objArr), th);
        } else {
            String.format(str2, objArr);
        }
    }

    /* renamed from: E */
    public static void m10575E(String str, String str2, Object... objArr) {
        Log.e(str, String.format(str2, objArr));
    }

    /* renamed from: F */
    public static void m10576F(String str, Throwable th, String str2, Object... objArr) {
        Log.e(str, String.format(str2, objArr), th);
    }

    /* renamed from: G */
    public static void m10577G(AtomicReference atomicReference, int i, String str) {
        LruCache lruCache = (LruCache) atomicReference.get();
        String str2 = f16381B;
        AnonymousClass1Gl.m10573C(str2, "Trying to resize cache for %s: old=%d, new=%d, SDK=%d", str, Integer.valueOf(lruCache.maxSize()), Integer.valueOf(i), Integer.valueOf(VERSION.SDK_INT));
        if (lruCache != null && lruCache.maxSize() != i && i > 0) {
            AnonymousClass1Gl.m10573C(str2, "Resizing cache for %s: old=%d, new=%d, %d existing items", str, Integer.valueOf(lruCache.maxSize()), Integer.valueOf(i), Integer.valueOf(lruCache.size()));
            if (VERSION.SDK_INT >= 21) {
                lruCache.resize(i);
                return;
            }
            LruCache lruCache2 = new LruCache(i);
            for (Entry entry : lruCache.snapshot().entrySet()) {
                lruCache2.put(entry.getKey(), entry.getValue());
            }
            atomicReference.set(lruCache2);
        }
    }
}

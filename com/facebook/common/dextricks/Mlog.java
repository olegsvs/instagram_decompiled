package com.facebook.common.dextricks;

import android.util.Log;

public final class Mlog {
    public static final String TAG = "DexLibLoader";
    public static final boolean VERBOSE = true;

    public static void assertThat(boolean z, String str, Object... objArr) {
        if (!z) {
            objArr = safeFmt(str, objArr);
            Log.e(TAG, objArr);
            z = new StringBuilder();
            z.append("DexLibLoader: ");
            z.append(objArr);
            throw new AssertionError(z.toString());
        }
    }

    /* renamed from: d */
    public static void m50d(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: d */
    public static void m51d(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: e */
    public static void m52e(String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr));
    }

    /* renamed from: e */
    public static void m53e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr), th);
    }

    /* renamed from: i */
    public static void m54i(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: i */
    public static void m55i(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    private static String safeFmt(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[bad fmt: \"");
            stringBuilder.append(str);
            stringBuilder.append("\" (");
            stringBuilder.append(e);
            stringBuilder.append(")]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: v */
    public static void m56v(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: v */
    public static void m57v(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: w */
    public static void m58w(String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr));
    }

    /* renamed from: w */
    public static void m59w(Throwable th, String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr), th);
    }
}

package com.facebook.fbreact.i18n;

import X.AnonymousClass0CF;
import android.content.Context;
import com.facebook.C0164R;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.fasterxml.jackson.annotation.JsonProperty;

@ReactModule(isCxxModule = true, name = "I18nAssets")
public class FbReactI18nAssetsModule extends CxxModuleWrapper {
    private static final String IS_TESTING = "IS_TESTING";

    private static native HybridData initHybrid(Context context, int i, int i2, int i3, int i4, int i5, String str, boolean z);

    static {
        AnonymousClass0CF.E("fbreact-i18nassetsmodule");
    }

    public FbReactI18nAssetsModule(Context context, int i) {
        this(context, 0, i);
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2) {
        super(initHybridWithLogging(context, i, i2, JsonProperty.USE_DEFAULT_NAME));
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2, String str) {
        super(initHybridWithLogging(context, i, i2, str));
    }

    private static java.nio.ByteBuffer getAsset(android.content.Context r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = 0;
        if (r7 != 0) goto L_0x0004;
    L_0x0003:
        return r5;
    L_0x0004:
        r0 = r6.getResources();	 Catch:{ IOException -> 0x003d, all -> 0x003a }
        r4 = r0.openRawResource(r7);	 Catch:{ IOException -> 0x003d, all -> 0x003a }
        r0 = r4.available();	 Catch:{ IOException -> 0x0038 }
        r3 = r0 + 1;	 Catch:{ IOException -> 0x0038 }
        r2 = java.nio.ByteBuffer.allocateDirect(r3);	 Catch:{ IOException -> 0x0038 }
        r1 = r2.array();	 Catch:{ IOException -> 0x0038 }
        r0 = r2.arrayOffset();	 Catch:{ IOException -> 0x0038 }
        r0 = r4.read(r1, r0, r3);	 Catch:{ IOException -> 0x0038 }
        r1 = r3 + -1;	 Catch:{ IOException -> 0x0038 }
        if (r0 != r1) goto L_0x0030;	 Catch:{ IOException -> 0x0038 }
    L_0x0026:
        r0 = 0;	 Catch:{ IOException -> 0x0038 }
        r2.put(r1, r0);	 Catch:{ IOException -> 0x0038 }
        if (r4 == 0) goto L_0x002f;	 Catch:{ IOException -> 0x0038 }
    L_0x002c:
        r4.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        return r2;
    L_0x0030:
        r1 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x0038 }
        r0 = "stream.available is incorrect and so are your assumptions";	 Catch:{ IOException -> 0x0038 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0038 }
        throw r1;	 Catch:{ IOException -> 0x0038 }
    L_0x0038:
        r2 = move-exception;
        goto L_0x003f;
    L_0x003a:
        r0 = move-exception;
        r4 = r5;
        goto L_0x004d;
    L_0x003d:
        r2 = move-exception;
        r4 = r5;
    L_0x003f:
        r1 = "ReactNative";	 Catch:{ all -> 0x004c }
        r0 = "Unable to process I18n asset";	 Catch:{ all -> 0x004c }
        X.AnonymousClass0Df.I(r1, r0, r2);	 Catch:{ all -> 0x004c }
        if (r4 == 0) goto L_0x004b;	 Catch:{ all -> 0x004c }
    L_0x0048:
        r4.close();	 Catch:{ IOException -> 0x004b }
    L_0x004b:
        return r5;
    L_0x004c:
        r0 = move-exception;
    L_0x004d:
        if (r4 == 0) goto L_0x0052;
    L_0x004f:
        r4.close();	 Catch:{ IOException -> 0x0052 }
    L_0x0052:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbreact.i18n.FbReactI18nAssetsModule.getAsset(android.content.Context, int):java.nio.ByteBuffer");
    }

    private static HybridData initHybridWithLogging(Context context, int i, int i2, String str) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_I18N_ASSETS_MODULE_START);
        HybridData initHybrid = initHybrid(context, i, C0164R.raw.currency_format_config, C0164R.raw.date_format_config, C0164R.raw.number_format_config, i2, str, shouldExportDebugConstants());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_I18N_ASSETS_MODULE_END);
        return initHybrid;
    }

    private static boolean shouldExportDebugConstants() {
        return false;
    }
}

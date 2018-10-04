package com.facebook.fbreact.i18n;

import X.AnonymousClass1Ia;
import X.AnonymousClass6CH;
import com.facebook.fbreact.specs.NativeI18nSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "I18n")
public class FbReactI18nModule extends NativeI18nSpec {
    public static final String NAME = "I18n";
    private final AnonymousClass6CH mLocales;

    public String getName() {
        return NAME;
    }

    public FbReactI18nModule(ReactApplicationContext reactApplicationContext, AnonymousClass6CH anonymousClass6CH) {
        super(reactApplicationContext);
        this.mLocales = anonymousClass6CH;
    }

    public Map getTypedExportedConstants() {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_I18N_MODULE_CONSTANTS_START);
        AnonymousClass6CH anonymousClass6CH = this.mLocales;
        Map hashMap = new HashMap();
        Locale A = anonymousClass6CH.m29414A();
        hashMap.put("localeIdentifier", A.toString());
        hashMap.put("localeCountryCode", A.getCountry());
        String str = "fbLocaleIdentifier";
        Locale locale = (Locale) anonymousClass6CH.f72891D.get();
        if (locale == null) {
            locale = anonymousClass6CH.m29415B(anonymousClass6CH.m29414A());
        }
        hashMap.put(str, AnonymousClass1Ia.B(locale));
        Map hashMap2 = new HashMap();
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(A);
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(A);
        hashMap2.put("decimalSeparator", String.valueOf(instance.getDecimalSeparator()));
        hashMap2.put("numberDelimiter", String.valueOf(instance.getGroupingSeparator()));
        hashMap2.put("minDigitsForThousandsSeparator", Integer.valueOf(decimalFormat.getGroupingSize()));
        hashMap.put("FallbackNumberFormatConfig", hashMap2);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_I18N_MODULE_CONSTANTS_END);
        return hashMap;
    }

    public static java.lang.String readLocalizedJSONFile(android.content.Context r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = 0;
        r0 = r4.getResources();	 Catch:{ IOException -> 0x0026 }
        r3 = r0.openRawResource(r5);	 Catch:{ IOException -> 0x0026 }
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
        r0 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
        r0.<init>();	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
        X.AnonymousClass1t4.B(r3, r0);	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
        r0 = r0.toByteArray();	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
        if (r3 == 0) goto L_0x001f;	 Catch:{ IOException -> 0x0022, all -> 0x0020 }
    L_0x001c:
        r3.close();	 Catch:{ IOException -> 0x001f }
    L_0x001f:
        return r1;
    L_0x0020:
        r0 = move-exception;
        goto L_0x002f;
    L_0x0022:
        r2 = move-exception;
        goto L_0x0027;
    L_0x0024:
        r0 = move-exception;
        goto L_0x002f;
    L_0x0026:
        r2 = move-exception;
    L_0x0027:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0024 }
        r0 = "Could not read localized JSON file from resources";	 Catch:{ all -> 0x0024 }
        r1.<init>(r0, r2);	 Catch:{ all -> 0x0024 }
        throw r1;	 Catch:{ all -> 0x0024 }
    L_0x002f:
        if (r3 == 0) goto L_0x0034;	 Catch:{ all -> 0x0024 }
    L_0x0031:
        r3.close();	 Catch:{ IOException -> 0x0034 }
    L_0x0034:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbreact.i18n.FbReactI18nModule.readLocalizedJSONFile(android.content.Context, int):java.lang.String");
    }
}

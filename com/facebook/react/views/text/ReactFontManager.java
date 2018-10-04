package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

public final class ReactFontManager {
    private static final String[] EXTENSIONS = new String[]{JsonProperty.USE_DEFAULT_NAME, "_bold", "_italic", "_bold_italic"};
    private static final String[] FILE_EXTENSIONS = new String[]{".ttf", ".otf"};
    private static ReactFontManager sReactFontManagerInstance;
    private Map mFontCache = new HashMap();

    public final class FontFamily {
        private SparseArray mTypefaceSparseArray = new SparseArray(4);

        public final Typeface getTypeface(int i) {
            return (Typeface) this.mTypefaceSparseArray.get(i);
        }

        public final void setTypeface(int i, Typeface typeface) {
            this.mTypefaceSparseArray.put(i, typeface);
        }
    }

    private ReactFontManager() {
    }

    private static android.graphics.Typeface createTypeface(java.lang.String r7, int r8, android.content.res.AssetManager r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = EXTENSIONS;
        r6 = r0[r8];
        r5 = FILE_EXTENSIONS;
        r4 = r5.length;
        r3 = 0;
    L_0x0008:
        if (r3 >= r4) goto L_0x002b;
    L_0x000a:
        r2 = r5[r3];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "fonts/";
        r1.append(r0);
        r1.append(r7);
        r1.append(r6);
        r1.append(r2);
        r0 = r1.toString();
        r0 = android.graphics.Typeface.createFromAsset(r9, r0);	 Catch:{ RuntimeException -> 0x0028 }
        return r0;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x0028:
        r3 = r3 + 1;
        goto L_0x0008;
    L_0x002b:
        r0 = android.graphics.Typeface.create(r7, r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactFontManager.createTypeface(java.lang.String, int, android.content.res.AssetManager):android.graphics.Typeface");
    }

    public static ReactFontManager getInstance() {
        if (sReactFontManagerInstance == null) {
            sReactFontManagerInstance = new ReactFontManager();
        }
        return sReactFontManagerInstance;
    }

    public final Typeface getTypeface(String str, int i, AssetManager assetManager) {
        FontFamily fontFamily = (FontFamily) this.mFontCache.get(str);
        if (fontFamily == null) {
            fontFamily = new FontFamily();
            this.mFontCache.put(str, fontFamily);
        }
        Typeface typeface = fontFamily.getTypeface(i);
        if (typeface == null) {
            typeface = createTypeface(str, i, assetManager);
            if (typeface != null) {
                fontFamily.setTypeface(i, typeface);
            }
        }
        return typeface;
    }
}

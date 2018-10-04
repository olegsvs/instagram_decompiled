package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.2cs */
public final class AnonymousClass2cs implements AnonymousClass2Mw {
    /* renamed from: B */
    public String f31721B;
    /* renamed from: C */
    private final ContentResolver f31722C;
    /* renamed from: D */
    private int f31723D;
    /* renamed from: E */
    private final Uri f31724E;
    /* renamed from: F */
    private int f31725F;

    public final int CL() {
        return 0;
    }

    public AnonymousClass2cs(ContentResolver contentResolver, Uri uri) {
        this.f31722C = contentResolver;
        this.f31724E = uri;
    }

    /* renamed from: B */
    public static void m16562B(AnonymousClass2cs anonymousClass2cs) {
        if (anonymousClass2cs.f31721B == null) {
            ParcelFileDescriptor C = anonymousClass2cs.m16563C();
            if (C == null) {
                anonymousClass2cs.f31721B = JsonProperty.USE_DEFAULT_NAME;
                return;
            }
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(C.getFileDescriptor(), null, options);
                anonymousClass2cs.f31721B = options.outMimeType != null ? options.outMimeType : JsonProperty.USE_DEFAULT_NAME;
                anonymousClass2cs.f31725F = options.outWidth;
                anonymousClass2cs.f31723D = options.outHeight;
            } finally {
                AnonymousClass2N1.m15275B(C);
            }
        }
    }

    /* renamed from: C */
    private android.os.ParcelFileDescriptor m16563C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f31724E;	 Catch:{ FileNotFoundException -> 0x002b }
        r1 = r0.getScheme();	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = "file";	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = r1.equals(r0);	 Catch:{ FileNotFoundException -> 0x002b }
        if (r0 == 0) goto L_0x0020;	 Catch:{ FileNotFoundException -> 0x002b }
    L_0x000e:
        r0 = r3.f31724E;	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = r0.getPath();	 Catch:{ FileNotFoundException -> 0x002b }
        r1 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x002b }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = android.os.ParcelFileDescriptor.open(r1, r0);	 Catch:{ FileNotFoundException -> 0x002b }
        return r0;	 Catch:{ FileNotFoundException -> 0x002b }
    L_0x0020:
        r2 = r3.f31722C;	 Catch:{ FileNotFoundException -> 0x002b }
        r1 = r3.f31724E;	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = "r";	 Catch:{ FileNotFoundException -> 0x002b }
        r0 = r2.openFileDescriptor(r1, r0);	 Catch:{ FileNotFoundException -> 0x002b }
        return r0;	 Catch:{ FileNotFoundException -> 0x002b }
    L_0x002b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2cs.C():android.os.ParcelFileDescriptor");
    }

    public final int getHeight() {
        AnonymousClass2cs.m16562B(this);
        return this.f31723D;
    }

    public final int getWidth() {
        AnonymousClass2cs.m16562B(this);
        return this.f31725F;
    }

    public final boolean mX() {
        AnonymousClass2cs.m16562B(this);
        return "image/jpeg".equals(this.f31721B);
    }

    public final Bitmap tH(int i, int i2, int i3, boolean z) {
        try {
            Options options;
            ParcelFileDescriptor C = m16563C();
            if (z) {
                options = new Options();
                options.inPurgeable = true;
                options.inInputShareable = true;
            } else {
                options = null;
            }
            return AnonymousClass2N1.m15279F(i, i2, null, null, C, options);
        } catch (Throwable e) {
            AnonymousClass0Dc.G("UriImage", "got exception decoding bitmap ", e);
            return null;
        }
    }

    public final Uri uH() {
        return this.f31724E;
    }

    public final String vK() {
        return this.f31724E.getPath();
    }
}

package com.instagram.common.graphics;

import X.AnonymousClass0CF;
import X.AnonymousClass0Gn;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;

public class IgBitmapReferenceFactory {
    private static final Class TAG = IgBitmapReferenceFactory.class;
    private static Boolean sIsIgBitmapReferenceSupported;

    private static native IgBitmapReference nativeDecodeByteArray(byte[] bArr, int i, int i2, Options options);

    public static IgBitmapReference decodeByteArray(byte[] bArr, int i, int i2, Options options) {
        if (isIgBitmapReferenceSupported()) {
            return nativeDecodeByteArray(bArr, i, i2, options);
        }
        throw new IllegalStateException("IgBitmapReference is not supported");
    }

    public static synchronized boolean isIgBitmapReferenceSupported() {
        boolean booleanValue;
        synchronized (IgBitmapReferenceFactory.class) {
            if (sIsIgBitmapReferenceSupported == null) {
                int i = VERSION.SDK_INT;
                if (i >= 21 && i <= 23) {
                    if (!VERSION.CODENAME.equals("N")) {
                        try {
                            RuntimeException runtimeException;
                            long currentTimeMillis = System.currentTimeMillis();
                            AnonymousClass0CF.E(VERSION.SDK_INT == 23 ? "igbitmap_runtime_for_v23" : "igbitmap_runtime_for_v21");
                            byte[] bArr = new byte[]{(byte) -1, (byte) -40, (byte) -1, (byte) -32, (byte) 0, (byte) 16, (byte) 74, (byte) 70, (byte) 73, (byte) 70, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 96, (byte) 0, (byte) 96, (byte) 0, (byte) 0, (byte) -1, (byte) -31, (byte) 0, (byte) 22, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 73, (byte) 73, (byte) 42, (byte) 0, (byte) 8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -37, (byte) 0, (byte) 67, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -37, (byte) 0, (byte) 67, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -64, (byte) 0, (byte) 17, (byte) 8, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 3, (byte) 1, (byte) 34, (byte) 0, (byte) 2, (byte) 17, (byte) 1, (byte) 3, (byte) 17, (byte) 1, (byte) -1, (byte) -60, (byte) 0, (byte) 21, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -60, (byte) 0, (byte) 20, (byte) 16, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -60, (byte) 0, (byte) 20, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -60, (byte) 0, (byte) 20, (byte) 17, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -38, (byte) 0, (byte) 12, (byte) 3, (byte) 1, (byte) 0, (byte) 2, (byte) 17, (byte) 3, (byte) 17, (byte) 0, (byte) 63, (byte) 0, (byte) -65, Byte.MIN_VALUE, (byte) 1, (byte) -1, (byte) -39};
                            Bitmap orCreateBitmap = nativeDecodeByteArray(bArr, 0, bArr.length, new Options()).getOrCreateBitmap();
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                            if (decodeByteArray.getHeight() == orCreateBitmap.getHeight() && decodeByteArray.getWidth() == orCreateBitmap.getWidth()) {
                                for (int i2 = 0; i2 < decodeByteArray.getWidth(); i2++) {
                                    int i3 = 0;
                                    while (i3 < decodeByteArray.getHeight()) {
                                        if (decodeByteArray.getPixel(i2, i3) == orCreateBitmap.getPixel(i2, i3)) {
                                            i3++;
                                        } else {
                                            runtimeException = new RuntimeException("the decoded image has wrong data");
                                        }
                                    }
                                }
                                Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                                sIsIgBitmapReferenceSupported = Boolean.valueOf(true);
                                if (sIsIgBitmapReferenceSupported != null) {
                                    throw new RuntimeException("Failed to init sIsIgBitmapReferenceSupported");
                                }
                            } else {
                                runtimeException = new RuntimeException("the decoded image has a wrong size");
                            }
                            throw runtimeException;
                        } catch (Throwable th) {
                            AnonymousClass0Gn.J("IgBitmapReferenceFactory", "failed_to_decode", th);
                            sIsIgBitmapReferenceSupported = Boolean.valueOf(false);
                        }
                    }
                }
                sIsIgBitmapReferenceSupported = Boolean.valueOf(false);
                if (sIsIgBitmapReferenceSupported != null) {
                    throw new RuntimeException("Failed to init sIsIgBitmapReferenceSupported");
                }
            }
            booleanValue = sIsIgBitmapReferenceSupported.booleanValue();
        }
        return booleanValue;
    }
}

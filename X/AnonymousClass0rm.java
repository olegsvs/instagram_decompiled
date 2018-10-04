package X;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.util.Pair;
import java.lang.reflect.Method;

/* renamed from: X.0rm */
public final class AnonymousClass0rm {
    /* renamed from: B */
    public static final Class f11270B = AnonymousClass0rm.class;
    /* renamed from: C */
    public static Method f11271C;
    /* renamed from: D */
    public static boolean f11272D;

    /* renamed from: B */
    public static boolean m7973B() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        boolean z = true;
        if (f11271C == null && !f11272D) {
            try {
                f11272D = true;
                f11271C = Class.forName("android.graphics.Bitmap").getMethod("createAshmemBitmap", new Class[0]);
            } catch (Throwable e) {
                AnonymousClass0Dc.m1240C(f11270B, "failed to reflect on android.graphics.Bitmap#createAshmemBitmap", e);
            }
        }
        if (f11271C == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: C */
    public static Bitmap m7974C(Bitmap bitmap) {
        return VERSION.SDK_INT >= 23 ? AnonymousClass0rm.m7991T(bitmap) : bitmap;
    }

    /* renamed from: D */
    public static Pair m7975D(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        bitmap = bitmap.getHeight();
        int i = width - 1;
        int i2 = bitmap - 1;
        int[] iArr = new int[(width * bitmap)];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, bitmap);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < bitmap2.getHeight(); i5++) {
            for (int i6 = 0; i6 < bitmap2.getWidth(); i6++) {
                if (Color.alpha(iArr[(i5 * width) + i6]) > 0) {
                    if (i6 < i) {
                        i = i6;
                    } else if (i6 > i3) {
                        i3 = i6;
                    }
                    if (i5 < i2) {
                        i2 = i5;
                    } else if (i5 > i4) {
                        i4 = i5;
                    }
                }
            }
        }
        if (i3 >= i) {
            if (i4 >= i2) {
                return new Pair(Bitmap.createBitmap(bitmap2, i, i2, (i3 - i) + 1, (i4 - i2) + 1), new int[]{i, i2});
            }
        }
        return null;
    }

    /* renamed from: E */
    public static android.graphics.Bitmap m7976E(android.content.Context r0, android.net.Uri r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = r0.getContentResolver();
        r0 = r0.openInputStream(r1);	 Catch:{ FileNotFoundException -> 0x000d }
        r0 = android.graphics.BitmapFactory.decodeStream(r0);	 Catch:{ FileNotFoundException -> 0x000d }
        return r0;	 Catch:{ FileNotFoundException -> 0x000d }
    L_0x000d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0rm.E(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    /* renamed from: F */
    public static Bitmap m7977F(String str, int i, int i2) {
        int P = AnonymousClass0rm.m7987P(str, i, i2);
        Options options = new Options();
        options.inSampleSize = Math.max(P, 1);
        options.inPreferredConfig = Config.ARGB_8888;
        return AnonymousClass0rm.m7988Q(BitmapFactory.decodeFile(str, options), i, i2);
    }

    /* renamed from: G */
    public static Bitmap m7978G(String str, int i, int i2, int i3, int i4) {
        int P = AnonymousClass0rm.m7987P(str, i, i2);
        Options options = new Options();
        options.inSampleSize = Math.max(P, 1);
        options.inPreferredConfig = Config.ARGB_8888;
        return AnonymousClass0rm.m7982K(BitmapFactory.decodeFile(str, options), i3, i4, 0, false);
    }

    /* renamed from: H */
    public static Bitmap m7979H(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        Bitmap G = AnonymousClass0rm.m7978G(str, i, i2, i3, i4);
        if (i5 == 0 && !z) {
            return G;
        }
        i4 = new Matrix();
        i4.postRotate((float) i5);
        if (z) {
            i4.preScale(1.0f, -1.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(G, null, 0, G.getWidth(), G.getHeight(), i4, 1);
        G.recycle();
        return createBitmap;
    }

    /* renamed from: I */
    public static Rect m7980I(String str) {
        Rect rect = new Rect();
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        rect.right = options.outWidth;
        rect.bottom = options.outHeight;
        return rect;
    }

    /* renamed from: J */
    public static Matrix m7981J(int i, int i2, int i3, int i4, int i5, boolean z) {
        RectF rectF;
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        int i6 = i5 % 360;
        if (i6 != 0) {
            matrix.setRotate((float) i5);
            matrix.mapRect(rectF2);
        }
        Object obj = i5 % 180 == 90 ? 1 : null;
        int i7 = obj != null ? i2 : i;
        if (obj == null) {
            i = i2;
        }
        if (i7 * i4 > i * i3) {
            rectF = new RectF(-100000.0f, 0.0f, ((float) i3) + 100000.0f, (float) i4);
        } else {
            rectF = new RectF(0.0f, -100000.0f, (float) i3, ((float) i4) + 100000.0f);
        }
        matrix.setRectToRect(rectF2, rectF, ScaleToFit.CENTER);
        if (i6 != 0) {
            matrix.preRotate((float) i5);
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            matrix.postTranslate((float) i3, 0.0f);
        }
        return matrix;
    }

    /* renamed from: K */
    public static Bitmap m7982K(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        return AnonymousClass0rm.m7984M(bitmap, i, i2, AnonymousClass0rm.m7981J(bitmap.getWidth(), bitmap.getHeight(), i, i2, i3, z));
    }

    /* renamed from: L */
    public static Bitmap m7983L(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        TileMode tileMode = TileMode.CLAMP;
        Shader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        new Canvas(createBitmap).drawCircle((float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2), (float) (bitmap.getWidth() / 2), paint);
        return createBitmap;
    }

    /* renamed from: M */
    public static Bitmap m7984M(Bitmap bitmap, int i, int i2, Matrix matrix) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, null);
        return createBitmap;
    }

    /* renamed from: N */
    public static Bitmap m7985N(Bitmap bitmap, int i, int i2, RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, (float) i, (float) i2), ScaleToFit.CENTER);
        return AnonymousClass0rm.m7984M(bitmap, i, i2, matrix);
    }

    /* renamed from: O */
    public static Bitmap m7986O(Bitmap bitmap, int i, int i2) {
        if (!(bitmap == null || (bitmap.getWidth() == i && bitmap.getHeight() == i2))) {
            bitmap.recycle();
            bitmap = null;
        }
        if (bitmap == null) {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: P */
    public static int m7987P(String str, int i, int i2) {
        str = AnonymousClass0rm.m7980I(str);
        return Math.min(Math.max(str.width() / i, str.height() / i2), Math.max(str.width() / i2, str.height() / i));
    }

    /* renamed from: Q */
    public static Bitmap m7988Q(Bitmap bitmap, int i, int i2) {
        if (bitmap != null) {
            float f = (float) i;
            float f2 = (float) i2;
            float max = Math.max(Math.min(f / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight())), Math.min(f2 / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight())));
            if (max < 1.0f) {
                int round = Math.round(((float) bitmap.getWidth()) * max);
                int round2 = Math.round(((float) bitmap.getHeight()) * max);
                if (round == 0) {
                    round = 1;
                }
                if (round2 == 0) {
                    round2 = 1;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, true);
                if (createScaledBitmap != bitmap) {
                    bitmap.recycle();
                }
                return createScaledBitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: R */
    public static boolean m7989R(android.graphics.Bitmap r4, java.io.File r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = r5.getParentFile();
        r0 = r0.exists();
        r3 = 0;
        if (r0 != 0) goto L_0x0016;
    L_0x000b:
        r0 = r5.getParentFile();
        r0 = r0.mkdirs();
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        return r3;
    L_0x0016:
        r1 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0032, all -> 0x002d }
        r2.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0032, all -> 0x002d }
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ FileNotFoundException -> 0x002b, all -> 0x0028 }
        r0 = 100;	 Catch:{ FileNotFoundException -> 0x002b, all -> 0x0028 }
        r4.compress(r1, r0, r2);	 Catch:{ FileNotFoundException -> 0x002b, all -> 0x0028 }
        X.AnonymousClass0Du.m1315C(r2);
        r0 = 1;
        return r0;
    L_0x0028:
        r0 = move-exception;
        r1 = r2;
        goto L_0x002e;
    L_0x002b:
        r1 = r2;
        goto L_0x0032;
    L_0x002d:
        r0 = move-exception;
    L_0x002e:
        X.AnonymousClass0Du.m1315C(r1);
        throw r0;
    L_0x0032:
        X.AnonymousClass0Du.m1315C(r1);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0rm.R(android.graphics.Bitmap, java.io.File):boolean");
    }

    /* renamed from: S */
    public static Bitmap m7990S(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        Rect rect;
        int min = Math.min(width, height);
        if (width > height) {
            width = (width - height) / 2;
            rect = new Rect(width, 0, min + width, min);
        } else {
            width = (height - width) / 2;
            rect = new Rect(0, width, min, min + width);
        }
        Rect rect2 = new Rect(0, 0, min, min);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, rect, rect2, null);
        return createBitmap;
    }

    /* renamed from: T */
    private static Bitmap m7991T(Bitmap bitmap) {
        if (!AnonymousClass0rm.m7973B()) {
            return bitmap;
        }
        try {
            return (Bitmap) f11271C.invoke(bitmap, new Object[0]);
        } catch (Throwable e) {
            AnonymousClass0Dc.m1240C(f11270B, "failed to invoke android.graphics.Bitmap#createAshmemBitmap", e);
            return bitmap;
        }
    }
}

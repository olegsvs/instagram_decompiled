package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.gallery.Medium;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Uf */
public final class AnonymousClass2Uf implements AnonymousClass0RL {
    /* renamed from: K */
    public static final AnonymousClass24j f30897K = new AnonymousClass24j((int) (Runtime.getRuntime().maxMemory() / 8));
    /* renamed from: L */
    private static final String[] f30898L;
    /* renamed from: M */
    public static final Set f30899M = new HashSet();
    /* renamed from: N */
    private static final Class f30900N = AnonymousClass2Uf.class;
    /* renamed from: O */
    private static final Map f30901O = new ConcurrentHashMap();
    /* renamed from: P */
    private static final String[] f30902P = new String[]{"_id", TraceFieldType.VideoId, "_data"};
    /* renamed from: B */
    public final boolean f30903B;
    /* renamed from: C */
    public final ScheduledExecutorService f30904C;
    /* renamed from: D */
    public final boolean f30905D;
    /* renamed from: E */
    private final Options f30906E;
    /* renamed from: F */
    private final Context f30907F;
    /* renamed from: G */
    private final Executor f30908G;
    /* renamed from: H */
    private final int f30909H;
    /* renamed from: I */
    private final int f30910I;
    /* renamed from: J */
    private final Handler f30911J;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    static {
        String[] strArr = new String[3];
        strArr[0] = "_id";
        strArr[1] = "image_id";
        strArr[2] = "_data";
        f30898L = strArr;
    }

    public AnonymousClass2Uf(Context context, int i) {
        Context context2 = context;
        this(context2, i, i, AnonymousClass25A.f25726B, true, false);
    }

    public AnonymousClass2Uf(Context context, int i, int i2, Executor executor, boolean z, boolean z2) {
        this.f30904C = Executors.newScheduledThreadPool(1);
        this.f30907F = context;
        this.f30908G = executor;
        this.f30906E = new Options();
        this.f30911J = new Handler(Looper.getMainLooper());
        this.f30910I = i;
        this.f30909H = i2;
        this.f30903B = z;
        this.f30905D = z2;
    }

    /* renamed from: A */
    public final void m16055A(Medium medium, AnonymousClass25B anonymousClass25B) {
        WeakReference weakReference = new WeakReference(anonymousClass25B);
        if (f30899M.contains(Integer.valueOf(medium.f30922L))) {
            anonymousClass25B.ko(medium);
            return;
        }
        AnonymousClass24j anonymousClass24j = f30897K;
        if (anonymousClass24j.get(Integer.valueOf(medium.f30922L)) != null) {
            anonymousClass25B.TDA(medium, true, true, (Bitmap) anonymousClass24j.get(Integer.valueOf(medium.f30922L)));
            this.f30904C.schedule(new AnonymousClass251(this, medium, weakReference), 150, TimeUnit.MILLISECONDS);
            return;
        }
        if (!this.f30903B) {
            Map map = f30901O;
            if (map.containsKey(m16052E(medium))) {
                AnonymousClass256 anonymousClass256 = (AnonymousClass256) map.get(m16052E(medium));
                medium.f30926P = anonymousClass256.f25725C;
                medium.f30923M = anonymousClass256.f25724B;
                m16053F(medium, weakReference);
                return;
            }
        }
        try {
            AnonymousClass0GG.B(this.f30908G, new AnonymousClass250(this, medium, weakReference), -1428124987);
        } catch (Throwable e) {
            AnonymousClass0Gn.L("GalleryThumbnailLoader#rejectedExectutionException", e);
        }
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        AnonymousClass2Uf.m16054G(this, new AnonymousClass253(this, anonymousClass0aa));
    }

    /* renamed from: B */
    public static void m16049B(AnonymousClass2Uf anonymousClass2Uf, Medium medium, Options options) {
        if (medium.f30926P == null || medium.f30926P.equals(medium.f30924N)) {
            if (medium.wY()) {
                Thumbnails.getThumbnail(anonymousClass2Uf.f30907F.getContentResolver(), (long) medium.f30922L, 1, options);
            } else {
                Images.Thumbnails.getThumbnail(anonymousClass2Uf.f30907F.getContentResolver(), (long) medium.f30922L, 1, options);
            }
            try {
                Closeable query;
                ContentResolver contentResolver;
                Uri uri;
                String[] strArr;
                StringBuilder stringBuilder;
                if (medium.wY()) {
                    contentResolver = anonymousClass2Uf.f30907F.getContentResolver();
                    uri = Thumbnails.EXTERNAL_CONTENT_URI;
                    strArr = f30902P;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("video_id = ");
                    stringBuilder.append(medium.f30922L);
                    query = contentResolver.query(uri, strArr, stringBuilder.toString(), null, null);
                } else {
                    contentResolver = anonymousClass2Uf.f30907F.getContentResolver();
                    uri = Images.Thumbnails.EXTERNAL_CONTENT_URI;
                    strArr = f30898L;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("image_id = ");
                    stringBuilder.append(medium.f30922L);
                    query = contentResolver.query(uri, strArr, stringBuilder.toString(), null, null);
                }
                if (query != null && query.moveToFirst()) {
                    if (medium.wY()) {
                        medium.f30926P = query.getString(query.getColumnIndex("_data"));
                    } else {
                        medium.f30926P = query.getString(query.getColumnIndex("_data"));
                    }
                }
                AnonymousClass0Du.C(query);
            } catch (Throwable th) {
                AnonymousClass0Du.C(null);
            }
        }
    }

    /* renamed from: C */
    public static void m16050C(AnonymousClass2Uf anonymousClass2Uf, Medium medium, WeakReference weakReference) {
        AnonymousClass25B anonymousClass25B = (AnonymousClass25B) weakReference.get();
        if (anonymousClass25B != null) {
            if (anonymousClass25B.rX(medium)) {
                int i;
                int i2;
                int i3;
                int i4;
                Options options = new Options();
                options.inJustDecodeBounds = true;
                if (anonymousClass2Uf.f30905D && medium.m16057B() && medium.isValid()) {
                    String str = medium.f30924N;
                    if (AnonymousClass26V.f26029B.contains(str.substring(str.lastIndexOf(46)))) {
                        medium.f30926P = str;
                        if (medium.f30926P != null) {
                            BitmapFactory.decodeFile(medium.f30926P, options);
                            i = options.outWidth;
                            i2 = options.outHeight;
                            if (i <= 0 || i2 <= 0) {
                                Integer.valueOf(i);
                                Integer.valueOf(i2);
                            }
                            i3 = 1;
                            while (i / i3 > anonymousClass2Uf.f30910I && i2 / i3 > anonymousClass2Uf.f30909H) {
                                i3 *= 2;
                            }
                            medium.f30923M = Math.max(i3, 1);
                            f30901O.put(anonymousClass2Uf.m16052E(medium), new AnonymousClass256(medium.f30926P, medium.f30923M));
                            i4 = ((i / medium.f30923M) * (i2 / medium.f30923M)) * 4;
                            Integer.valueOf(i);
                            Integer.valueOf(i2);
                            Float.valueOf(((float) i4) / 1024.0f);
                            anonymousClass2Uf.m16053F(medium, weakReference);
                        }
                    }
                }
                AnonymousClass2Uf.m16049B(anonymousClass2Uf, medium, options);
                if (medium.f30926P != null) {
                    BitmapFactory.decodeFile(medium.f30926P, options);
                    i = options.outWidth;
                    i2 = options.outHeight;
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    i3 = 1;
                    while (i / i3 > anonymousClass2Uf.f30910I) {
                        i3 *= 2;
                    }
                    medium.f30923M = Math.max(i3, 1);
                    f30901O.put(anonymousClass2Uf.m16052E(medium), new AnonymousClass256(medium.f30926P, medium.f30923M));
                    i4 = ((i / medium.f30923M) * (i2 / medium.f30923M)) * 4;
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    Float.valueOf(((float) i4) / 1024.0f);
                    anonymousClass2Uf.m16053F(medium, weakReference);
                }
            }
        }
    }

    /* renamed from: D */
    public static void m16051D(AnonymousClass2Uf anonymousClass2Uf, Medium medium, WeakReference weakReference) {
        AnonymousClass25B anonymousClass25B = (AnonymousClass25B) weakReference.get();
        if (anonymousClass25B == null) {
            return;
        }
        if (anonymousClass25B.rX(medium)) {
            Bitmap bitmap = null;
            try {
                if (medium.wY()) {
                    bitmap = Thumbnails.getThumbnail(anonymousClass2Uf.f30907F.getContentResolver(), (long) medium.f30922L, 3, anonymousClass2Uf.f30906E);
                } else {
                    bitmap = Images.Thumbnails.getThumbnail(anonymousClass2Uf.f30907F.getContentResolver(), (long) medium.f30922L, 3, anonymousClass2Uf.f30906E);
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.C(f30900N, "error calling getThumbnail", e);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("error generating micro thumbnail - mediumId:");
                stringBuilder.append(medium.f30922L);
                stringBuilder.append(" type: ");
                stringBuilder.append(medium.f30927Q);
                AnonymousClass0Gn.E("GalleryThumbnailLoader_failed_to_generate_micro_thumbnail", stringBuilder.toString(), e);
            }
            if (bitmap != null) {
                f30897K.put(Integer.valueOf(medium.f30922L), bitmap);
                medium.f30920J = false;
            } else {
                f30899M.add(Integer.valueOf(medium.f30922L));
                medium.f30920J = true;
            }
            anonymousClass25B = (AnonymousClass25B) weakReference.get();
            if (anonymousClass25B != null && anonymousClass25B.rX(medium)) {
                AnonymousClass2Uf.m16054G(anonymousClass2Uf, new AnonymousClass252(anonymousClass2Uf, weakReference, medium, bitmap));
            }
        }
    }

    /* renamed from: E */
    private String m16052E(Medium medium) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(medium.f30924N);
        stringBuilder.append("?");
        stringBuilder.append(this.f30910I);
        stringBuilder.append("x");
        stringBuilder.append(this.f30909H);
        return stringBuilder.toString();
    }

    /* renamed from: F */
    private void m16053F(Medium medium, WeakReference weakReference) {
        String uri = Uri.fromFile(new File(medium.f30926P)).toString();
        if (medium.f30923M > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sample_size_");
            stringBuilder.append(medium.f30923M);
            uri = AnonymousClass0Gz.B(uri, stringBuilder.toString());
        }
        AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.D(uri);
        D.f4635F = false;
        D.f4646Q = new AnonymousClass255(medium, weakReference);
        D = D.C(this);
        D.f4636G = medium.f30923M;
        D.B();
    }

    /* renamed from: G */
    private static void m16054G(AnonymousClass2Uf anonymousClass2Uf, Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            AnonymousClass0OR.D(anonymousClass2Uf.f30911J, runnable, -2142870265);
        }
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        AnonymousClass2Uf.m16054G(this, new AnonymousClass254(this, anonymousClass0aa, bitmap));
    }
}

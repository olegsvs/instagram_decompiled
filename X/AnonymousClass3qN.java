package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: X.3qN */
public final class AnonymousClass3qN implements Callable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3qO f45224B;
    /* renamed from: C */
    private final Context f45225C;
    /* renamed from: D */
    private final WeakReference f45226D;
    /* renamed from: E */
    private final AnonymousClass3nn f45227E;

    public AnonymousClass3qN(AnonymousClass3qO anonymousClass3qO, Context context, AnonymousClass3nn anonymousClass3nn, AnonymousClass3z3 anonymousClass3z3) {
        this.f45224B = anonymousClass3qO;
        this.f45225C = context;
        this.f45227E = anonymousClass3nn;
        this.f45226D = new WeakReference(anonymousClass3z3);
    }

    /* renamed from: A */
    public final String m20892A() {
        Throwable th;
        AnonymousClass3z3 anonymousClass3z3 = (AnonymousClass3z3) this.f45226D.get();
        Closeable closeable = null;
        if (anonymousClass3z3 != null) {
            if (this.f45227E.equals(anonymousClass3z3.f47824C)) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f45227E.f44628O);
                    long j = (long) (this.f45227E.f44643d * JsonMappingException.MAX_REFS_TO_LIST);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
                    if (frameAtTime == null) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 0);
                    }
                    if (frameAtTime == null) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 1);
                    }
                    if (frameAtTime == null) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
                    }
                    mediaMetadataRetriever.release();
                    StringBuilder stringBuilder;
                    if (frameAtTime != null) {
                        Bitmap createScaledBitmap;
                        int i = this.f45224B.f45230D;
                        int i2 = this.f45224B.f45229C;
                        int width = frameAtTime.getWidth();
                        int height = frameAtTime.getHeight();
                        int i3 = 1;
                        while (true) {
                            int i4 = i3 * 2;
                            if (width / i4 > i && height / i4 > i2) {
                                i3 = i4;
                            } else if (i3 > 1) {
                                createScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, width / i3, height / i3, true);
                                frameAtTime.recycle();
                                frameAtTime = createScaledBitmap;
                            }
                        }
                        if (i3 > 1) {
                            createScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, width / i3, height / i3, true);
                            frameAtTime.recycle();
                            frameAtTime = createScaledBitmap;
                        }
                        AnonymousClass2NO.m15332M(this.f45225C).mkdirs();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("_thumbnail_");
                        stringBuilder.append(this.f45227E.f44643d);
                        stringBuilder.append("_");
                        stringBuilder.append(this.f45227E.f44626M);
                        String stringBuilder2 = stringBuilder.toString();
                        File M = AnonymousClass2NO.m15332M(this.f45225C);
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("cover_photo_");
                        stringBuilder3.append(System.currentTimeMillis());
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(".jpeg");
                        File file = new File(M, stringBuilder3.toString());
                        try {
                            Closeable bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                frameAtTime.compress(CompressFormat.JPEG, 100, bufferedOutputStream);
                                frameAtTime.recycle();
                                AnonymousClass0Du.C(bufferedOutputStream);
                                return Uri.fromFile(file).toString();
                            } catch (Throwable th2) {
                                th = th2;
                                closeable = bufferedOutputStream;
                                frameAtTime.recycle();
                                AnonymousClass0Du.C(closeable);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            frameAtTime.recycle();
                            AnonymousClass0Du.C(closeable);
                            throw th;
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to extract frame at time");
                    stringBuilder.append(this.f45227E.f44643d);
                    throw new Exception(stringBuilder.toString());
                } catch (Throwable th4) {
                    mediaMetadataRetriever.release();
                }
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return m20892A();
    }
}

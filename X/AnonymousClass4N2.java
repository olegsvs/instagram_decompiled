package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.instagram.common.gallery.Medium;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.4N2 */
public final class AnonymousClass4N2 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5T8 f53313B;
    /* renamed from: C */
    public final /* synthetic */ Context f53314C;
    /* renamed from: D */
    public final /* synthetic */ Medium f53315D;

    public AnonymousClass4N2(Context context, Medium medium, AnonymousClass5T8 anonymousClass5T8) {
        this.f53314C = context;
        this.f53315D = medium;
        this.f53313B = anonymousClass5T8;
    }

    public final void run() {
        DisplayMetrics displayMetrics = this.f53314C.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("share_sticker_");
        stringBuilder.append(currentTimeMillis);
        stringBuilder.append(".jpg");
        String stringBuilder2 = stringBuilder.toString();
        String C = AnonymousClass0G1.C(this.f53314C, false);
        new File(C).mkdirs();
        File file = new File(C, stringBuilder2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(4);
        BackgroundGradientColors backgroundGradientColors = this.f53315D.f30914D;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, backgroundGradientColors.f26047C, backgroundGradientColors.f26046B, TileMode.CLAMP));
        canvas.drawPaint(paint);
        try {
            createBitmap.compress(CompressFormat.JPEG, 90, new FileOutputStream(file));
            Context context = r0.f53314C;
            AnonymousClass5T8 anonymousClass5T8 = r0.f53313B;
            stringBuilder2 = r0.f53315D.f30912B;
            C = r0.f53315D.f30913C;
            long currentTimeMillis2 = System.currentTimeMillis();
            Medium medium = new Medium(0, 1, file.getAbsolutePath(), 0, null, 0, 0, currentTimeMillis2 / 1000, currentTimeMillis2, Uri.fromFile(file));
            medium.f30912B = stringBuilder2;
            medium.f30913C = C;
            AnonymousClass0Sy.F(new AnonymousClass4N3(anonymousClass5T8, (AnonymousClass3nl) new AnonymousClass4NP(context, context.getContentResolver(), medium, true).call()));
        } catch (Throwable e) {
            AnonymousClass0Gn.L("unable to create platform sticker background input file", e);
            AnonymousClass0Sy.F(new AnonymousClass4N1(r0, e));
        }
    }
}

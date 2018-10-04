package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;

/* renamed from: X.3BG */
public final class AnonymousClass3BG extends View implements OnClickListener, AnonymousClass25B, AnonymousClass24n, OnLongClickListener {
    /* renamed from: Z */
    private static final Paint f38709Z;
    /* renamed from: a */
    public static final int f38710a = Color.argb(75, 255, 255, 255);
    /* renamed from: b */
    private static final Paint f38711b = new Paint(2);
    /* renamed from: B */
    public final int f38712B;
    /* renamed from: C */
    public final int f38713C;
    /* renamed from: D */
    public final Paint f38714D;
    /* renamed from: E */
    public final Paint f38715E;
    /* renamed from: F */
    public final int f38716F;
    /* renamed from: G */
    public boolean f38717G;
    /* renamed from: H */
    public final int f38718H;
    /* renamed from: I */
    public AnonymousClass1SE f38719I;
    /* renamed from: J */
    private final Bitmap f38720J;
    /* renamed from: K */
    private final Paint f38721K;
    /* renamed from: L */
    private Bitmap f38722L;
    /* renamed from: M */
    private final int f38723M;
    /* renamed from: N */
    private final AnonymousClass3BH f38724N;
    /* renamed from: O */
    private final Paint f38725O;
    /* renamed from: P */
    private GalleryItem f38726P;
    /* renamed from: Q */
    private String f38727Q;
    /* renamed from: R */
    private boolean f38728R;
    /* renamed from: S */
    private boolean f38729S;
    /* renamed from: T */
    private final Paint f38730T = new Paint(2);
    /* renamed from: U */
    private final Paint f38731U;
    /* renamed from: V */
    private AnonymousClass257 f38732V;
    /* renamed from: W */
    private final RectF f38733W;
    /* renamed from: X */
    private final int f38734X;
    /* renamed from: Y */
    private final Paint f38735Y;

    static {
        Paint paint = new Paint();
        f38709Z = paint;
        paint.setStyle(Style.FILL);
        f38709Z.setColor(Color.argb(204, 255, 255, 255));
    }

    public AnonymousClass3BG(Context context, AnonymousClass3BH anonymousClass3BH) {
        super(context, null, C0164R.attr.mediaPickerItemStyle);
        this.f38724N = anonymousClass3BH;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AnonymousClass0eS.MediaPickerItemView, C0164R.attr.mediaPickerItemStyle, 0);
        int color = obtainStyledAttributes.getColor(0, -12303292);
        int color2 = obtainStyledAttributes.getColor(2, Color.argb(200, 0, 0, 0));
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, getResources().getDimensionPixelSize(C0164R.dimen.selection_stroke_width));
        this.f38718H = obtainStyledAttributes.getColor(1, Color.argb(255, 113, 191, 255));
        obtainStyledAttributes.recycle();
        Resources resources = getResources();
        this.f38712B = resources.getDimensionPixelSize(C0164R.dimen.counter_circle_size);
        this.f38713C = resources.getDimensionPixelSize(C0164R.dimen.counter_circle_stroke_width);
        this.f38723M = resources.getDimensionPixelOffset(C0164R.dimen.counter_circle_margin);
        this.f38716F = resources.getDimensionPixelOffset(C0164R.dimen.counter_text_size);
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f38725O = paint;
        paint.setStyle(Style.FILL);
        this.f38725O.setColor(color);
        this.f38730T.setColorFilter(new PorterDuffColorFilter(color2, Mode.SRC_ATOP));
        paint = new Paint();
        this.f38731U = paint;
        paint.setStyle(Style.STROKE);
        this.f38731U.setStrokeWidth((float) dimensionPixelOffset);
        Paint paint2 = new Paint();
        this.f38714D = paint2;
        paint2.setAntiAlias(true);
        paint2 = new Paint(1);
        this.f38715E = paint2;
        paint2.setColor(-1);
        this.f38715E.setTextAlign(Align.CENTER);
        this.f38715E.setTextSize((float) this.f38716F);
        paint2 = new Paint(1);
        this.f38735Y = paint2;
        paint2.setColor(-1);
        this.f38735Y.setTextAlign(Align.RIGHT);
        this.f38734X = resources.getDimensionPixelSize(C0164R.dimen.duration_text_size);
        this.f38735Y.setTextSize((float) this.f38734X);
        this.f38720J = BitmapFactory.decodeResource(resources, C0164R.drawable.filled_grid_album_icon);
        this.f38721K = new Paint(2);
        this.f38733W = new RectF();
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    /* renamed from: B */
    public static void m18878B(AnonymousClass3BG anonymousClass3BG, GalleryItem galleryItem, AnonymousClass1SE anonymousClass1SE, boolean z, AnonymousClass257 anonymousClass257) {
        anonymousClass3BG.f38717G = z;
        if (!anonymousClass257.SN().equals(anonymousClass3BG.f38727Q) || anonymousClass3BG.f38719I != anonymousClass1SE) {
            int i;
            anonymousClass3BG.f38719I = anonymousClass1SE;
            anonymousClass3BG.f38726P = galleryItem;
            anonymousClass3BG.f38722L = null;
            anonymousClass3BG.f38727Q = anonymousClass257.SN();
            anonymousClass3BG.f38732V = anonymousClass257;
            if (anonymousClass3BG.f38726P.m14351B()) {
                i = C0164R.string.gallery_album_thumbnail;
            } else if (anonymousClass3BG.f38726P.m14354E()) {
                i = C0164R.string.gallery_video_thumbnail;
            } else {
                i = C0164R.string.gallery_photo_thumbnail;
            }
            anonymousClass3BG.setContentDescription(anonymousClass3BG.getContext().getString(i));
        }
    }

    /* renamed from: C */
    private static void m18879C(Canvas canvas, int i, Bitmap bitmap, RectF rectF, Paint paint) {
        canvas.save();
        canvas.rotate((float) i, ((float) canvas.getWidth()) / 2.0f, ((float) canvas.getHeight()) / 2.0f);
        canvas.drawBitmap(bitmap, null, rectF, paint);
        canvas.restore();
    }

    /* renamed from: D */
    private void m18880D() {
        CharSequence string;
        Resources resources = getResources();
        if (this.f38732V.wY()) {
            string = resources.getString(C0164R.string.failed_to_load_video_toast);
        } else {
            string = resources.getString(C0164R.string.failed_to_load_photo_toast);
        }
        Toast.makeText(getContext(), string, 0).show();
    }

    public final void SDA(Draft draft, Bitmap bitmap) {
        if (draft.SN().equals(this.f38727Q)) {
            this.f38722L = bitmap;
            invalidate();
        }
    }

    public final void TDA(Medium medium, boolean z, boolean z2, Bitmap bitmap) {
        if (medium.SN().equals(this.f38727Q)) {
            this.f38729S = z2;
            this.f38722L = bitmap;
            invalidate();
        }
    }

    public final void ko(Medium medium) {
        if (medium.SN().equals(this.f38727Q)) {
            this.f38722L = null;
            invalidate();
        }
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 796877423);
        if (!this.f38717G && this.f38719I.f18738C) {
            AnonymousClass0cQ.L(this, -270444246, M);
        } else if (this.f38732V.isValid()) {
            this.f38724N.qo(this.f38726P);
            AnonymousClass0cQ.L(this, -56296210, M);
        } else {
            m18880D();
            AnonymousClass0cQ.L(this, 1948356991, M);
        }
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f38722L != null) {
            float width;
            float height;
            boolean z;
            int i;
            int i2;
            String valueOf;
            if (this.f38729S) {
                this.f38733W.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            } else {
                float max = Math.max(((float) canvas.getWidth()) / ((float) this.f38722L.getWidth()), ((float) canvas.getHeight()) / ((float) this.f38722L.getHeight()));
                width = ((float) this.f38722L.getWidth()) * max;
                max *= (float) this.f38722L.getHeight();
                float width2 = (((float) canvas.getWidth()) - width) / 2.0f;
                height = (((float) canvas.getHeight()) - max) / 2.0f;
                this.f38733W.set(width2, height, width + width2, max + height);
            }
            width = (float) this.f38723M;
            height = (float) ((canvas.getWidth() - this.f38712B) - this.f38723M);
            if (!this.f38719I.f18738C) {
                if (!this.f38719I.f18737B) {
                    AnonymousClass3BG.m18879C(canvas, this.f38732V.zQ(), this.f38722L, this.f38733W, f38711b);
                    if (this.f38732V.eW()) {
                        canvas.drawBitmap(this.f38720J, (float) (canvas.getWidth() - this.f38720J.getWidth()), 0.0f, this.f38721K);
                    } else if (this.f38717G) {
                        z = this.f38719I.f18738C;
                        i = z ? this.f38718H : f38710a;
                        canvas.save();
                        canvas.translate(height, width);
                        this.f38714D.setStyle(Style.FILL);
                        this.f38714D.setColor(i);
                        i2 = this.f38712B;
                        canvas.drawCircle(((float) i2) / 2.0f, ((float) i2) / 2.0f, ((float) i2) / 2.0f, this.f38714D);
                        this.f38714D.setStyle(Style.STROKE);
                        this.f38714D.setColor(-1);
                        this.f38714D.setStrokeWidth((float) this.f38713C);
                        i2 = this.f38712B;
                        canvas.drawCircle(((float) i2) / 2.0f, ((float) i2) / 2.0f, ((float) i2) / 2.0f, this.f38714D);
                        if (this.f38717G && z) {
                            valueOf = String.valueOf(this.f38719I.f18739D + 1);
                            i2 = this.f38712B;
                            canvas.drawText(valueOf, ((float) i2) / 2.0f, (((float) i2) / 2.0f) + (((float) this.f38716F) / 3.0f), this.f38715E);
                        }
                        canvas.restore();
                    }
                    if (this.f38732V.wY() && this.f38732V.getDuration() > 0) {
                        canvas.drawText(this.f38732V.RM(), (float) (canvas.getWidth() - (this.f38734X / 2)), (float) (canvas.getHeight() - (this.f38734X / 2)), this.f38735Y);
                    }
                }
            }
            AnonymousClass3BG.m18879C(canvas, this.f38732V.zQ(), this.f38722L, this.f38733W, this.f38719I.f18737B ? this.f38730T : f38711b);
            this.f38731U.setColor(-1);
            canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f38731U);
            if (this.f38732V.eW()) {
                canvas.drawBitmap(this.f38720J, (float) (canvas.getWidth() - this.f38720J.getWidth()), 0.0f, this.f38721K);
            } else if (this.f38717G) {
                z = this.f38719I.f18738C;
                if (z) {
                }
                canvas.save();
                canvas.translate(height, width);
                this.f38714D.setStyle(Style.FILL);
                this.f38714D.setColor(i);
                i2 = this.f38712B;
                canvas.drawCircle(((float) i2) / 2.0f, ((float) i2) / 2.0f, ((float) i2) / 2.0f, this.f38714D);
                this.f38714D.setStyle(Style.STROKE);
                this.f38714D.setColor(-1);
                this.f38714D.setStrokeWidth((float) this.f38713C);
                i2 = this.f38712B;
                canvas.drawCircle(((float) i2) / 2.0f, ((float) i2) / 2.0f, ((float) i2) / 2.0f, this.f38714D);
                valueOf = String.valueOf(this.f38719I.f18739D + 1);
                i2 = this.f38712B;
                canvas.drawText(valueOf, ((float) i2) / 2.0f, (((float) i2) / 2.0f) + (((float) this.f38716F) / 3.0f), this.f38715E);
                canvas.restore();
            }
            canvas.drawText(this.f38732V.RM(), (float) (canvas.getWidth() - (this.f38734X / 2)), (float) (canvas.getHeight() - (this.f38734X / 2)), this.f38735Y);
        } else {
            canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f38725O);
        }
        if (this.f38728R) {
            canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), f38709Z);
        }
    }

    public final boolean onLongClick(View view) {
        if (this.f38717G) {
            return false;
        }
        if (this.f38732V.isValid()) {
            return this.f38724N.yo(this.f38726P);
        }
        m18880D();
        return false;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public final boolean qX(Draft draft) {
        return this.f38732V != null && draft.SN().equals(this.f38732V.SN());
    }

    public final boolean rX(Medium medium) {
        return this.f38732V != null && medium.SN().equals(this.f38732V.SN());
    }

    public void setIsDisabled(boolean z) {
        if (this.f38728R != z) {
            this.f38728R = z;
            invalidate();
        }
    }
}

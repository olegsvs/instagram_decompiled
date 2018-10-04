package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.facebook.C0164R;

/* renamed from: X.27J */
public final class AnonymousClass27J extends Drawable implements FrameCallback {
    /* renamed from: B */
    public boolean f26158B;
    /* renamed from: C */
    private final AnonymousClass2Jq f26159C;
    /* renamed from: D */
    private final AnonymousClass2Jq f26160D;
    /* renamed from: E */
    private final AnonymousClass2Jq f26161E;
    /* renamed from: F */
    private final Drawable f26162F;
    /* renamed from: G */
    private final AnonymousClass2bu f26163G;
    /* renamed from: H */
    private final AnonymousClass2Ju f26164H = new AnonymousClass2Ju(0, AnonymousClass2KA.f28949E);
    /* renamed from: I */
    private final AnonymousClass2Ju f26165I = AnonymousClass2Ju.f28905D;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass27J(Context context, int i, int i2, int i3) {
        Resources resources = context.getResources();
        int i4 = resources.getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_icon_width);
        Spannable spannableStringBuilder = new SpannableStringBuilder("  GIF");
        this.f26162F = AnonymousClass0TJ.K(context, C0164R.drawable.search_small, C0164R.color.white);
        this.f26162F.setBounds(0, 0, dimensionPixelSize, Math.round(((float) this.f26162F.getIntrinsicHeight()) * (((float) dimensionPixelSize) / ((float) this.f26162F.getIntrinsicWidth()))));
        AnonymousClass2JU anonymousClass2JU = new AnonymousClass2JU(this.f26162F);
        anonymousClass2JU.f28821B = AnonymousClass2JT.CENTER_BETWEEN_TOP_AND_BOTTOM;
        spannableStringBuilder.setSpan(anonymousClass2JU, 0, 1, 33);
        spannableStringBuilder.setSpan(new AnonymousClass2Jc(AnonymousClass0Ca.C(context, C0164R.color.sticker_subtle_light_background), i3, i2), 0, spannableStringBuilder.length(), 33);
        this.f26160D = new AnonymousClass2Jq(context, this.f26164H);
        this.f26161E = new AnonymousClass2Jq(context, this.f26164H);
        this.f26159C = new AnonymousClass2Jq(context, this.f26164H);
        spannableStringBuilder.setSpan(this.f26160D, 2, 3, 33);
        spannableStringBuilder.setSpan(this.f26161E, 3, 4, 33);
        spannableStringBuilder.setSpan(this.f26159C, 4, 5, 33);
        AnonymousClass2bu anonymousClass2bu = new AnonymousClass2bu(context, i4);
        this.f26163G = anonymousClass2bu;
        float f = (float) i2;
        AnonymousClass27w.m14526C(context, anonymousClass2bu, (float) i, f, f);
        this.f26163G.m16450H(spannableStringBuilder);
    }

    public final void doFrame(long j) {
        invalidateSelf();
        if (this.f26158B) {
            Choreographer.getInstance().postFrameCallbackDelayed(this, 700);
        }
    }

    public final void draw(Canvas canvas) {
        switch ((int) ((System.currentTimeMillis() / 700) % 4)) {
            case 0:
                this.f26160D.m15044A(this.f26164H);
                this.f26161E.m15044A(this.f26164H);
                this.f26159C.m15044A(this.f26164H);
                break;
            case 1:
                this.f26160D.m15044A(this.f26165I);
                this.f26161E.m15044A(this.f26164H);
                this.f26159C.m15044A(this.f26164H);
                break;
            case 2:
                this.f26160D.m15044A(this.f26165I);
                this.f26161E.m15044A(this.f26165I);
                this.f26159C.m15044A(this.f26164H);
                break;
            case 3:
                this.f26160D.m15044A(this.f26165I);
                this.f26161E.m15044A(this.f26165I);
                this.f26159C.m15044A(this.f26165I);
                break;
            default:
                break;
        }
        this.f26163G.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.f26163G.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f26163G.getIntrinsicWidth();
    }

    public final void setAlpha(int i) {
        this.f26163G.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26163G.setColorFilter(colorFilter);
    }
}

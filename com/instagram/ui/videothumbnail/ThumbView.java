package com.instagram.ui.videothumbnail;

import X.AnonymousClass0Ea;
import X.AnonymousClass0i5;
import X.AnonymousClass0vX;
import X.AnonymousClass1dF;
import X.AnonymousClass2KL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;

public class ThumbView extends View implements AnonymousClass0vX {
    /* renamed from: B */
    public Bitmap f12100B;
    /* renamed from: C */
    public boolean f12101C;
    /* renamed from: D */
    public int f12102D;
    /* renamed from: E */
    public Rect f12103E;
    /* renamed from: F */
    public AnonymousClass2KL f12104F;
    /* renamed from: G */
    private final Path f12105G = new Path();
    /* renamed from: H */
    private int f12106H;
    /* renamed from: I */
    private int f12107I;
    /* renamed from: J */
    private final Rect f12108J = new Rect();
    /* renamed from: K */
    private final RectF f12109K = new RectF();
    /* renamed from: L */
    private int f12110L;

    public final void RDA(int i, int i2) {
    }

    public ThumbView(Context context) {
        super(context);
    }

    public ThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m8341A(AnonymousClass0i5 anonymousClass0i5) {
        AnonymousClass2KL anonymousClass2KL = this.f12104F;
        if (anonymousClass2KL == null) {
            this.f12104F = new AnonymousClass2KL(anonymousClass0i5);
        } else if (!anonymousClass2KL.f28977E.f8557G.equals(anonymousClass0i5.f8557G)) {
            m8340B(this);
            this.f12104F = null;
            this.f12100B = null;
            this.f12103E = null;
            this.f12101C = false;
            invalidate();
            this.f12104F = new AnonymousClass2KL(anonymousClass0i5);
        }
        this.f12104F.f28976D.add(this);
        anonymousClass0i5 = anonymousClass0i5.f8557G;
        int C = AnonymousClass1dF.m12187C(anonymousClass0i5);
        AnonymousClass0Ea.f1980C.markerStart(1900591, C);
        Map hashMap = new HashMap();
        hashMap.put(TraceFieldType.VideoId, anonymousClass0i5);
        AnonymousClass1dF.m12186B(1900591, C, hashMap);
    }

    /* renamed from: B */
    public final void m8342B() {
        AnonymousClass2KL anonymousClass2KL = this.f12104F;
        if (anonymousClass2KL != null && !this.f12101C) {
            AnonymousClass0Ea.f1980C.m1451Y(1900591, AnonymousClass1dF.m12187C(anonymousClass2KL.f28977E.f8557G), "thumbnail_drawn");
            this.f12101C = true;
        }
    }

    /* renamed from: B */
    public static void m8340B(ThumbView thumbView) {
        AnonymousClass2KL anonymousClass2KL = thumbView.f12104F;
        if (anonymousClass2KL != null) {
            String str = anonymousClass2KL.f28977E.f8557G;
            int i = thumbView.f12102D;
            int i2 = thumbView.f12110L;
            int i3 = thumbView.f12107I;
            long j = thumbView.f12104F.f28975C;
            int C = AnonymousClass1dF.m12187C(str);
            Map hashMap = new HashMap();
            hashMap.put("number_of_seeks", Integer.toString(i));
            hashMap.put("number_of_thumbs_served", Integer.toString(i2));
            hashMap.put("number_of_thumbnail_errors", Integer.toString(i3));
            hashMap.put("max_thumbnail_delay", Long.toString(j));
            AnonymousClass1dF.m12186B(1900591, C, hashMap);
            AnonymousClass0Ea.f1980C.markerEnd(1900591, C, (short) 2);
            thumbView.f12104F.f28975C = 0;
        }
        thumbView.f12110L = 0;
        thumbView.f12102D = 0;
        thumbView.f12107I = 0;
    }

    /* renamed from: C */
    public final void m8343C(int i, int i2) {
        AnonymousClass2KL anonymousClass2KL = this.f12104F;
        if (anonymousClass2KL != null) {
            anonymousClass2KL.A(i, i2);
        }
    }

    public final void JUA(Bitmap bitmap, Rect rect, int i, int i2, double d) {
        this.f12100B = bitmap;
        this.f12103E = rect;
        this.f12110L++;
    }

    public AnonymousClass2KL getThumbnailController() {
        return this.f12104F;
    }

    public final void onDraw(Canvas canvas) {
        this.f12108J.set(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.f12106H > 0) {
            this.f12109K.set(this.f12108J);
            this.f12105G.rewind();
            Path path = this.f12105G;
            RectF rectF = this.f12109K;
            int i = this.f12106H;
            path.addRoundRect(rectF, (float) i, (float) i, Direction.CW);
            canvas.clipPath(this.f12105G);
        }
        Bitmap bitmap = this.f12100B;
        if (bitmap != null) {
            Rect rect = this.f12103E;
            if (rect != null) {
                canvas.drawBitmap(bitmap, rect, this.f12108J, null);
            }
        }
        super.onDraw(canvas);
        postInvalidate();
    }

    public void setBitmap(Bitmap bitmap) {
        this.f12100B = bitmap;
    }

    public void setScrubberThumbnailCallback(AnonymousClass0vX anonymousClass0vX) {
        AnonymousClass2KL anonymousClass2KL = this.f12104F;
        if (anonymousClass2KL != null) {
            anonymousClass2KL.f28976D.add(anonymousClass0vX);
        }
    }

    public void setSrcRect(Rect rect) {
        this.f12103E = rect;
    }

    public void setThumbRoundRadius(int i) {
        this.f12106H = i;
    }
}

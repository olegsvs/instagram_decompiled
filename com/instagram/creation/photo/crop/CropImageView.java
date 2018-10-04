package com.instagram.creation.photo.crop;

import X.AnonymousClass3Cf;
import X.AnonymousClass3DD;
import X.AnonymousClass4Xs;
import X.AnonymousClass4Xu;
import X.AnonymousClass4Xv;
import X.AnonymousClass4Xz;
import X.AnonymousClass4Y2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;

public class CropImageView extends AnonymousClass4Y2 {
    /* renamed from: B */
    public final AnonymousClass4Xu f65025B;
    /* renamed from: C */
    public AnonymousClass4Xz f65026C;
    /* renamed from: D */
    public RectF f65027D;
    /* renamed from: E */
    public AnonymousClass4Xv f65028E;
    /* renamed from: F */
    private boolean f65029F;
    /* renamed from: G */
    private boolean f65030G;
    /* renamed from: H */
    private Rect f65031H;
    /* renamed from: I */
    private RectF f65032I;
    /* renamed from: J */
    private AnonymousClass3Cf f65033J;

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65032I = new RectF();
        this.f65031H = new Rect();
        this.f65025B = new AnonymousClass4Xu(this);
        this.f65030G = true;
        this.f65029F = true;
    }

    /* renamed from: C */
    public final void m27083C(boolean z) {
        if (z != this.f65030G) {
            this.f65030G = z;
            super.C(z);
            m27082E(this, this.f65030G ^ 1);
        }
    }

    /* renamed from: E */
    public static void m27082E(CropImageView cropImageView, boolean z) {
        AnonymousClass4Xz anonymousClass4Xz = cropImageView.f65026C;
        if (anonymousClass4Xz != null) {
            if ((anonymousClass4Xz.f55041E != null ? 1 : null) != null) {
                cropImageView.f65025B.cancel();
                if (!z) {
                    AnonymousClass4Xu anonymousClass4Xu = cropImageView.f65025B;
                    anonymousClass4Xu.f55031B.f65025B.setStartTime(-1);
                    anonymousClass4Xu.f55031B.f65025B.setStartOffset(500);
                    anonymousClass4Xu.f55031B.f65025B.setDuration(250);
                    cropImageView.startAnimation(cropImageView.f65025B);
                } else if (cropImageView.f65026C.A(1.0f)) {
                    cropImageView.invalidate();
                }
            }
        }
    }

    /* renamed from: G */
    public final void m27084G() {
        if (this.f65029F) {
            AnonymousClass3Cf anonymousClass3Cf = new AnonymousClass3Cf();
            this.f65033J = anonymousClass3Cf;
            anonymousClass3Cf.f39090C = 1.0f;
            setOnTouchListener(this.f65033J);
            this.f65033J.f39089B = new AnonymousClass4Xs(this);
        }
    }

    /* renamed from: H */
    public final void m27085H() {
        AnonymousClass3Cf anonymousClass3Cf = this.f65033J;
        if (anonymousClass3Cf != null) {
            anonymousClass3Cf.A();
            setOnTouchListener(null);
            this.f65033J = null;
        }
    }

    public AnonymousClass4Xz getHighlightView() {
        return this.f65026C;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass4Xv anonymousClass4Xv = this.f65028E;
        if (anonymousClass4Xv != null) {
            anonymousClass4Xv.rj(((double) (AnonymousClass4Y2.D(this, getImageMatrix()) / AnonymousClass4Y2.D(this, this.f55051C))) >= 1.0d);
        }
        if (this.f65026C != null) {
            this.f65032I.set(this.f65027D);
            getImageMatrix().mapRect(this.f65032I);
            this.f65031H.left = Math.max(Math.round(this.f65032I.left), 0);
            this.f65031H.top = Math.max(Math.round(this.f65032I.top), 0);
            this.f65031H.right = Math.min(Math.round(this.f65032I.right), getWidth());
            this.f65031H.bottom = Math.min(Math.round(this.f65032I.bottom), getHeight());
            AnonymousClass4Xz anonymousClass4Xz = this.f65026C;
            Rect rect = this.f65031H;
            AnonymousClass3DD anonymousClass3DD = anonymousClass4Xz.f55041E;
            if (anonymousClass3DD != null) {
                anonymousClass3DD.C(rect);
            }
            AnonymousClass4Xz anonymousClass4Xz2 = this.f65026C;
            Path path = anonymousClass4Xz2.f55042F;
            if (path != null) {
                canvas.drawPath(path, anonymousClass4Xz2.f55040D);
            } else {
                anonymousClass4Xz2.f55038B.getDrawingRect(anonymousClass4Xz2.f55043G);
                anonymousClass4Xz2.f55043G.bottom = Math.round((float) anonymousClass4Xz2.f55039C.top);
                canvas.drawRect(anonymousClass4Xz2.f55043G, anonymousClass4Xz2.f55040D);
                anonymousClass4Xz2.f55038B.getDrawingRect(anonymousClass4Xz2.f55043G);
                anonymousClass4Xz2.f55043G.top = Math.round((float) anonymousClass4Xz2.f55039C.bottom);
                canvas.drawRect(anonymousClass4Xz2.f55043G, anonymousClass4Xz2.f55040D);
                Object obj = 1;
                Object obj2 = anonymousClass4Xz2.f55043G.left < anonymousClass4Xz2.f55039C.left ? 1 : null;
                if (anonymousClass4Xz2.f55043G.right <= anonymousClass4Xz2.f55039C.right) {
                    obj = null;
                }
                if (obj2 != null) {
                    anonymousClass4Xz2.f55038B.getDrawingRect(anonymousClass4Xz2.f55043G);
                    anonymousClass4Xz2.f55043G.top = Math.round((float) anonymousClass4Xz2.f55039C.top);
                    anonymousClass4Xz2.f55043G.bottom = Math.round((float) anonymousClass4Xz2.f55039C.bottom);
                    anonymousClass4Xz2.f55043G.right = Math.round((float) anonymousClass4Xz2.f55039C.left);
                    canvas.drawRect(anonymousClass4Xz2.f55043G, anonymousClass4Xz2.f55040D);
                }
                if (obj != null) {
                    anonymousClass4Xz2.f55038B.getDrawingRect(anonymousClass4Xz2.f55043G);
                    anonymousClass4Xz2.f55043G.top = Math.round((float) anonymousClass4Xz2.f55039C.top);
                    anonymousClass4Xz2.f55043G.bottom = Math.round((float) anonymousClass4Xz2.f55039C.bottom);
                    anonymousClass4Xz2.f55043G.left = Math.round((float) anonymousClass4Xz2.f55039C.right);
                    canvas.drawRect(anonymousClass4Xz2.f55043G, anonymousClass4Xz2.f55040D);
                }
            }
            anonymousClass3DD = anonymousClass4Xz2.f55041E;
            if (anonymousClass3DD != null) {
                anonymousClass3DD.A(canvas);
            }
        }
    }

    public void setHighlightView(AnonymousClass4Xz anonymousClass4Xz) {
        this.f65026C = anonymousClass4Xz;
        invalidate();
    }

    public void setListener(AnonymousClass4Xv anonymousClass4Xv) {
        this.f65028E = anonymousClass4Xv;
    }

    public void setTouchEnabled(boolean z) {
        this.f65029F = z;
    }
}

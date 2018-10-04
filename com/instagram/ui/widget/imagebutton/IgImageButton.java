package com.instagram.ui.widget.imagebutton;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass2bu;
import X.AnonymousClass3jd;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public class IgImageButton extends ConstrainedImageView implements AnimatorUpdateListener {
    /* renamed from: k */
    private static final CharSequence f11496k = "…";
    /* renamed from: l */
    private static final AnonymousClass3jd f11497l = new AnonymousClass3jd();
    /* renamed from: B */
    public ValueAnimator f11498B;
    /* renamed from: C */
    public Drawable f11499C;
    /* renamed from: D */
    public int f11500D;
    /* renamed from: E */
    public boolean f11501E;
    /* renamed from: F */
    public float f11502F;
    /* renamed from: G */
    private Drawable f11503G;
    /* renamed from: H */
    private Drawable f11504H;
    /* renamed from: I */
    private int f11505I;
    /* renamed from: J */
    private boolean f11506J;
    /* renamed from: K */
    private Drawable f11507K;
    /* renamed from: L */
    private Drawable f11508L;
    /* renamed from: M */
    private OnClickListener f11509M;
    /* renamed from: N */
    private Drawable f11510N;
    /* renamed from: O */
    private int f11511O;
    /* renamed from: P */
    private int f11512P;
    /* renamed from: Q */
    private int f11513Q;
    /* renamed from: R */
    private Drawable f11514R;
    /* renamed from: S */
    private boolean f11515S;
    /* renamed from: T */
    private boolean f11516T;
    /* renamed from: U */
    private boolean f11517U;
    /* renamed from: V */
    private boolean f11518V;
    /* renamed from: W */
    private boolean f11519W;
    /* renamed from: X */
    private boolean f11520X;
    /* renamed from: Y */
    private boolean f11521Y;
    /* renamed from: Z */
    private boolean f11522Z;
    /* renamed from: a */
    private boolean f11523a;
    /* renamed from: b */
    private Drawable f11524b;
    /* renamed from: c */
    private int f11525c;
    /* renamed from: d */
    private int f11526d;
    /* renamed from: e */
    private int f11527e;
    /* renamed from: f */
    private int f11528f;
    /* renamed from: g */
    private int f11529g;
    /* renamed from: h */
    private AnonymousClass2bu f11530h;
    /* renamed from: i */
    private int f11531i;
    /* renamed from: j */
    private Drawable f11532j;

    static {
        new int[1][0] = 16842913;
    }

    public IgImageButton(Context context) {
        this(context, null);
    }

    public IgImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11506J = true;
        setAdjustViewBounds(false);
        setScaleType(ScaleType.CENTER_CROP);
        setPlaceHolderColor(AnonymousClass0Ca.m937C(context, C0164R.color.grey_1));
        this.f11504H = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.dismissed_icon);
        this.f11505I = getResources().getDimensionPixelSize(C0164R.dimen.grid_hidden_icon_size);
    }

    /* renamed from: C */
    public static void m8127C(IgImageButton igImageButton) {
        ValueAnimator valueAnimator = igImageButton.f11498B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(400);
        igImageButton.f11498B = valueAnimator;
        valueAnimator.addUpdateListener(igImageButton);
        igImageButton.f11498B.start();
    }

    /* renamed from: D */
    private void m8128D(int i, int i2) {
        Drawable drawable = this.f11504H;
        int i3 = this.f11505I;
        drawable.setBounds((i - i3) / 2, (i2 - i3) / 2, ((i - i3) / 2) + i3, ((i2 - i3) / 2) + i3);
    }

    /* renamed from: G */
    public final void m8129G() {
        this.f11515S = false;
        this.f11516T = false;
        this.f11517U = false;
        this.f11518V = false;
        this.f11519W = false;
        this.f11520X = false;
        this.f11523a = false;
        invalidate();
    }

    /* renamed from: H */
    public final void m8130H() {
        this.f11522Z = false;
        invalidate();
    }

    /* renamed from: I */
    public final void m8131I(String str, float f, int i, boolean z) {
        this.f11522Z = true;
        if (this.f11507K == null) {
            this.f11507K = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.gradient_background);
        }
        if (this.f11530h == null) {
            AnonymousClass2bu anonymousClass2bu = new AnonymousClass2bu(getContext(), getWidth());
            this.f11530h = anonymousClass2bu;
            CharSequence charSequence = f11496k;
            anonymousClass2bu.f31515N = 1;
            anonymousClass2bu.f31516O = charSequence;
            anonymousClass2bu.f31504C = true;
            anonymousClass2bu.D();
            this.f11528f = getResources().getDimensionPixelSize(C0164R.dimen.text_background_height);
            this.f11529g = getResources().getDimensionPixelSize(C0164R.dimen.text_bottom_margin);
            this.f11531i = getResources().getDimensionPixelSize(C0164R.dimen.text_horizontal_margin);
        }
        this.f11530h.I(str);
        this.f11530h.K(f);
        this.f11530h.N(Typeface.SANS_SERIF, i);
        this.f11521Y = z;
        if (this.f11521Y && this.f11524b == null) {
            Drawable E = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.forward_arrow);
            this.f11524b = E;
            E.mutate().setColorFilter(AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(getContext(), C0164R.color.white)));
            this.f11525c = getResources().getDimensionPixelOffset(C0164R.dimen.text_arrow_bottom_margin);
            this.f11526d = getResources().getDimensionPixelOffset(C0164R.dimen.text_arrow_icon_height);
            this.f11527e = getResources().getDimensionPixelOffset(C0164R.dimen.text_arrow_icon_horizontal_padding);
        }
        setBackgroundGradientBounds(getWidth());
        setTextBounds(getWidth());
        invalidate();
    }

    /* renamed from: J */
    public final void m8132J(boolean z) {
        this.f11515S = z;
        if (z) {
            if (this.f11503G == null) {
                this.f11503G = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.filled_grid_album_icon);
            }
            setAlbumIconBounds(getWidth());
        }
        invalidate();
    }

    /* renamed from: K */
    public final void m8133K(boolean z) {
        this.f11516T = z;
        if (z) {
            m8128D(getWidth(), getHeight());
        }
        invalidate();
    }

    /* renamed from: L */
    public final void m8134L(boolean z) {
        this.f11517U = z;
        if (z) {
            if (this.f11508L == null) {
                this.f11508L = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.filled_grid_hashtag_icon);
            }
            setHashtagIconBounds(getWidth());
        }
        invalidate();
    }

    /* renamed from: M */
    public final void m8135M(boolean z) {
        this.f11519W = z;
        if (z) {
            if (this.f11510N == null) {
                this.f11510N = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.live_replay_badge);
                this.f11511O = getResources().getDimensionPixelSize(C0164R.dimen.live_replay_icon_height);
                this.f11512P = getResources().getDimensionPixelSize(C0164R.dimen.live_replay_icon_margin);
                this.f11513Q = getResources().getDimensionPixelSize(C0164R.dimen.live_replay_icon_width);
            }
            setLiveReplayIconBounds(getWidth());
        }
        invalidate();
    }

    /* renamed from: N */
    public final void m8136N(boolean z) {
        this.f11520X = z;
        if (z) {
            if (this.f11514R == null) {
                this.f11514R = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.filled_grid_shopping_icon);
            }
            setShoppingIconBounds(getWidth());
        }
        invalidate();
    }

    /* renamed from: O */
    public final void m8137O(boolean z) {
        this.f11523a = z;
        if (z) {
            if (this.f11532j == null) {
                this.f11532j = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.grid_camera_icon);
            }
            setVideoIconBounds(getWidth());
        }
        invalidate();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11502F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11523a) {
            this.f11532j.draw(canvas);
        }
        if (this.f11506J) {
            float f = this.f11502F;
            if (f != 0.0f) {
                canvas.drawColor(((int) (f * 128.0f)) * 16777216);
            }
        }
        if (this.f11516T) {
            this.f11504H.draw(canvas);
        }
        if (this.f11501E) {
            canvas.drawColor(AnonymousClass0Ca.m937C(getContext(), C0164R.color.white_75_transparent));
        }
        if (this.f11522Z) {
            this.f11507K.draw(canvas);
            this.f11530h.draw(canvas);
            if (this.f11521Y) {
                this.f11524b.draw(canvas);
            }
        }
        if (this.f11515S) {
            this.f11503G.draw(canvas);
        }
        if (this.f11517U) {
            this.f11508L.draw(canvas);
        }
        if (this.f11520X) {
            this.f11514R.draw(canvas);
        }
        if (this.f11519W) {
            this.f11510N.draw(canvas);
        }
        if (this.f11518V) {
            this.f11499C.draw(canvas);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, 678335759);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f11523a) {
            setVideoIconBounds(i);
        }
        if (this.f11516T) {
            m8128D(i, i2);
        }
        if (this.f11522Z) {
            setBackgroundGradientBounds(i);
            setTextBounds(i);
        }
        if (this.f11515S) {
            setAlbumIconBounds(i);
        }
        if (this.f11517U) {
            setHashtagIconBounds(i);
        }
        if (this.f11520X) {
            setShoppingIconBounds(i);
        }
        if (this.f11519W) {
            setLiveReplayIconBounds(i);
        }
        if (this.f11518V) {
            Drawable drawable = this.f11499C;
            int intrinsicWidth = (i - drawable.getIntrinsicWidth()) - this.f11500D;
            int intrinsicHeight = i2 - this.f11499C.getIntrinsicHeight();
            int i5 = this.f11500D;
            drawable.setBounds(intrinsicWidth, intrinsicHeight - i5, i - i5, i2 - i5);
        }
        AnonymousClass0cQ.m5865O(this, -404313161, N);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r0 = 1483753445; // 0x587047e5 float:1.0567663E15 double:7.33071604E-315;
        r5 = X.AnonymousClass0cQ.m5863M(r7, r0);
        r0 = r7.f11506J;
        r4 = 1;
        if (r0 == 0) goto L_0x00d1;
    L_0x000c:
        r1 = r8.getActionMasked();
        r0 = 3;
        if (r1 == r0) goto L_0x00c4;
    L_0x0013:
        r6 = 2;
        switch(r1) {
            case 0: goto L_0x007e;
            case 1: goto L_0x0019;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x00d1;
    L_0x0019:
        r0 = r7.f11518V;
        if (r0 == 0) goto L_0x0055;
    L_0x001d:
        r0 = r7.f11509M;
        if (r0 == 0) goto L_0x0055;
    L_0x0021:
        r2 = r8.getX();
        r1 = r7.getWidth();
        r0 = r7.f11499C;
        r0 = r0.getIntrinsicWidth();
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0055;
    L_0x0035:
        r2 = r8.getY();
        r1 = r7.getHeight();
        r0 = r7.f11499C;
        r0 = r0.getIntrinsicHeight();
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0055;
    L_0x0049:
        r0 = r7.f11509M;
        r0.onClick(r7);
        r0 = 1040698909; // 0x3e07ce1d float:0.1326222 double:5.141735786E-315;
        X.AnonymousClass0cQ.m5862L(r7, r0, r5);
        return r4;
    L_0x0055:
        r0 = f11497l;
        r0 = r0.hasMessages(r4, r7);
        if (r0 == 0) goto L_0x007a;
    L_0x005d:
        r3 = f11497l;
        r3.removeMessages(r4, r7);
        r0 = r7.f11498B;
        if (r0 == 0) goto L_0x0069;
    L_0x0066:
        r0.cancel();
    L_0x0069:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7.f11502F = r0;
        r7.invalidate();
        r2 = android.os.Message.obtain(r3, r6, r7);
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3.sendMessageDelayed(r2, r0);
        goto L_0x00d1;
    L_0x007a:
        m8127C(r7);
        goto L_0x00d1;
    L_0x007e:
        r0 = r7.f11518V;
        if (r0 == 0) goto L_0x00b5;
    L_0x0082:
        r0 = r7.f11509M;
        if (r0 == 0) goto L_0x00b5;
    L_0x0086:
        r2 = r8.getX();
        r1 = r7.getWidth();
        r0 = r7.f11499C;
        r0 = r0.getIntrinsicWidth();
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x00b5;
    L_0x009a:
        r2 = r8.getY();
        r1 = r7.getHeight();
        r0 = r7.f11499C;
        r0 = r0.getIntrinsicHeight();
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x00b5;
    L_0x00ae:
        r0 = 1264961787; // 0x4b65c8fb float:1.5059195E7 double:6.249741623E-315;
        X.AnonymousClass0cQ.m5862L(r7, r0, r5);
        return r4;
    L_0x00b5:
        r3 = f11497l;
        r3.removeMessages(r6, r7);
        r2 = android.os.Message.obtain(r3, r4, r7);
        r0 = 75;
        r3.sendMessageDelayed(r2, r0);
        goto L_0x00d1;
    L_0x00c4:
        r0 = f11497l;
        r0 = r0.hasMessages(r4, r7);
        if (r0 == 0) goto L_0x007a;
    L_0x00cc:
        r0 = f11497l;
        r0.removeMessages(r4, r7);
    L_0x00d1:
        r0 = super.onTouchEvent(r8);
        if (r0 != 0) goto L_0x00dd;
    L_0x00d7:
        r0 = r7.f11506J;
        if (r0 == 0) goto L_0x00dc;
    L_0x00db:
        goto L_0x00dd;
    L_0x00dc:
        r4 = 0;
    L_0x00dd:
        r0 = -1033019414; // 0xffffffffc26d5fea float:-59.343666 double:NaN;
        X.AnonymousClass0cQ.m5862L(r7, r0, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.imagebutton.IgImageButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setAlbumIconBounds(int i) {
        Drawable drawable = this.f11503G;
        drawable.setBounds(i - drawable.getIntrinsicWidth(), 0, i, this.f11503G.getIntrinsicHeight());
    }

    private void setBackgroundGradientBounds(int i) {
        this.f11507K.setBounds(0, i - this.f11528f, i, i);
    }

    public void setDismissedIconAlpha(int i) {
        this.f11504H.setAlpha(i);
    }

    public void setDismissedIconColor(int i) {
        this.f11504H.setColorFilter(AnonymousClass0Ca.m937C(getContext(), i), Mode.SRC_ATOP);
    }

    public void setEnableTouchOverlay(boolean z) {
        this.f11506J = z;
    }

    private void setHashtagIconBounds(int i) {
        Drawable drawable = this.f11508L;
        drawable.setBounds(i - drawable.getIntrinsicWidth(), 0, i, this.f11508L.getIntrinsicHeight());
    }

    public void setLikeIconClickListener(OnClickListener onClickListener) {
        this.f11509M = onClickListener;
    }

    private void setLiveReplayIconBounds(int i) {
        Drawable drawable = this.f11510N;
        int i2 = i - this.f11513Q;
        int i3 = this.f11512P;
        drawable.setBounds(i2 - i3, i3, i - i3, this.f11511O + i3);
    }

    private void setShoppingIconBounds(int i) {
        Drawable drawable = this.f11514R;
        drawable.setBounds(i - drawable.getIntrinsicWidth(), 0, i, this.f11514R.getIntrinsicHeight());
    }

    private void setTextArrowIconBounds(int i) {
        int intrinsicWidth = (int) ((((float) this.f11524b.getIntrinsicWidth()) / ((float) this.f11524b.getIntrinsicHeight())) * ((float) this.f11526d));
        int intrinsicWidth2 = (this.f11530h.getIntrinsicWidth() + this.f11531i) + this.f11527e;
        Drawable drawable = this.f11524b;
        int i2 = i - this.f11526d;
        int i3 = this.f11525c;
        drawable.setBounds(intrinsicWidth2, i2 - i3, intrinsicWidth + intrinsicWidth2, i - i3);
    }

    private void setTextBounds(int i) {
        int intrinsicWidth = this.f11521Y ? this.f11524b.getIntrinsicWidth() + this.f11527e : 0;
        this.f11530h.F(Math.max((i - (this.f11531i * 2)) - intrinsicWidth, 0));
        AnonymousClass2bu anonymousClass2bu = this.f11530h;
        anonymousClass2bu.setBounds(this.f11531i, (i - anonymousClass2bu.getIntrinsicHeight()) - this.f11529g, (this.f11530h.getIntrinsicWidth() + this.f11531i) - intrinsicWidth, i - this.f11529g);
        if (this.f11521Y) {
            setTextArrowIconBounds(i);
        }
    }

    private void setVideoIconBounds(int i) {
        Drawable drawable = this.f11532j;
        drawable.setBounds(i - drawable.getIntrinsicWidth(), 0, i, this.f11532j.getIntrinsicHeight());
    }
}

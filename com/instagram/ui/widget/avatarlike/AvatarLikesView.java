package com.instagram.ui.widget.avatarlike;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Gs;
import X.AnonymousClass0KX;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0dh;
import X.AnonymousClass0e8;
import X.AnonymousClass16n;
import X.AnonymousClass5J3;
import X.AnonymousClass5J5;
import X.AnonymousClass5J6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AvatarLikesView extends View {
    /* renamed from: B */
    public boolean f61951B;
    /* renamed from: C */
    public Bitmap f61952C;
    /* renamed from: D */
    public List f61953D;
    /* renamed from: E */
    public Bitmap f61954E;
    /* renamed from: F */
    public List f61955F;
    /* renamed from: G */
    public boolean f61956G;
    /* renamed from: H */
    public Bitmap f61957H;
    /* renamed from: I */
    public Paint f61958I;
    /* renamed from: J */
    public Paint f61959J;
    /* renamed from: K */
    public long f61960K;
    /* renamed from: L */
    public ArrayList f61961L;
    /* renamed from: M */
    public boolean f61962M;
    /* renamed from: N */
    public boolean f61963N;
    /* renamed from: O */
    private List f61964O;
    /* renamed from: P */
    private Paint f61965P;
    /* renamed from: Q */
    private int f61966Q;
    /* renamed from: R */
    private List f61967R;
    /* renamed from: S */
    private int f61968S;
    /* renamed from: T */
    private boolean f61969T;
    /* renamed from: U */
    private long f61970U;
    /* renamed from: V */
    private long f61971V;
    /* renamed from: W */
    private AnonymousClass0KX f61972W;
    /* renamed from: X */
    private RectF f61973X;

    /* renamed from: K */
    private static float m26200K(float f, int i, int i2) {
        return ((float) (i2 - i)) - (f * ((float) i2));
    }

    public AvatarLikesView(Context context) {
        super(context);
        m26203N();
    }

    public AvatarLikesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26203N();
    }

    public AvatarLikesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26203N();
    }

    /* renamed from: A */
    public final void m26204A(boolean z) {
        AvatarLikesView avatarLikesView = this;
        if (this.f61955F == null) {
            this.f61955F = new ArrayList();
            Bitmap bitmap = this.f61957H;
            this.f61954E = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 0.5f), (int) (((float) this.f61957H.getHeight()) * 0.5f), false);
            this.f61953D = new ArrayList();
            bitmap = this.f61957H;
            this.f61952C = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 2.0f), (int) (((float) this.f61957H.getHeight()) * 2.0f), false);
        }
        m26196G(this, this.f61955F);
        int i = 0;
        while (true) {
            boolean z2 = z;
            if (i >= 30) {
                break;
            }
            m26191B(this, z, null, true);
            i++;
        }
        m26196G(this, this.f61953D);
        if (this.f61953D.size() < 3) {
            this.f61953D.add(m26194E(avatarLikesView, Math.max(SystemClock.elapsedRealtime(), this.f61960K + m26195F(1, 0, 50)), z2, null, false));
        }
        invalidate();
    }

    /* renamed from: B */
    public final void m26205B(int i, List list, boolean z) {
        m26196G(this, this.f61967R);
        m26196G(this, this.f61964O);
        if (!(list == null || list.isEmpty())) {
            for (AnonymousClass5J3 anonymousClass5J3 : list) {
                AnonymousClass0Gs.f2431j.D(anonymousClass5J3.f61933C).C(new AnonymousClass5J5(this, z, anonymousClass5J3)).B();
                i -= anonymousClass5J3.f61932B;
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            m26191B(this, z, null, false);
        }
        invalidate();
    }

    /* renamed from: B */
    public static void m26191B(AvatarLikesView avatarLikesView, boolean z, Bitmap bitmap, boolean z2) {
        AvatarLikesView avatarLikesView2 = avatarLikesView;
        if (z2) {
            if (avatarLikesView.f61955F.size() < 180) {
                avatarLikesView.f61960K = Math.max(SystemClock.elapsedRealtime(), avatarLikesView.f61960K + m26195F(1, 0, 50));
                avatarLikesView.f61955F.add(m26194E(avatarLikesView2, avatarLikesView.f61960K, z, null, true));
            }
        } else if (bitmap != null) {
            if (avatarLikesView.f61964O.size() < 200) {
                long elapsedRealtime;
                long F = m26195F(1, 100, 400);
                if (z) {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    elapsedRealtime = Math.max(SystemClock.elapsedRealtime(), avatarLikesView.f61970U + F);
                }
                avatarLikesView.f61970U = elapsedRealtime;
                avatarLikesView.f61964O.add(m26194E(avatarLikesView2, avatarLikesView.f61970U, z, bitmap, false));
            }
        } else if (avatarLikesView.f61967R.size() < 200) {
            long elapsedRealtime2;
            if (z) {
                elapsedRealtime2 = SystemClock.elapsedRealtime();
            } else {
                elapsedRealtime2 = Math.max(SystemClock.elapsedRealtime(), avatarLikesView.f61971V + m26195F(1, 100, 400));
                avatarLikesView2.f61971V = elapsedRealtime2;
            }
            avatarLikesView2.f61967R.add(m26194E(avatarLikesView2, elapsedRealtime2, z, null, false));
        }
    }

    /* renamed from: C */
    public final void m26206C() {
        this.f61971V = 0;
        this.f61970U = 0;
        this.f61960K = 0;
        this.f61967R.clear();
        this.f61964O.clear();
        List list = this.f61955F;
        if (list != null) {
            list.clear();
        }
        list = this.f61953D;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: C */
    public static void m26192C(AvatarLikesView avatarLikesView, Canvas canvas, AnonymousClass5J6 anonymousClass5J6, float f, float f2, float f3, int i) {
        canvas.save();
        canvas.translate(f, f2);
        avatarLikesView.f61965P.setAlpha(i);
        canvas.drawCircle(0.0f, 0.0f, f3, avatarLikesView.f61965P);
        avatarLikesView = (1073741824 * f3) / ((float) anonymousClass5J6.f61946H.getIntrinsicWidth());
        float f4 = -f3;
        canvas.translate(f4, f4);
        canvas.scale(avatarLikesView, avatarLikesView);
        anonymousClass5J6.f61946H.setAlpha(i);
        anonymousClass5J6.f61946H.draw(canvas);
        canvas.restore();
    }

    /* renamed from: D */
    public static void m26193D(AvatarLikesView avatarLikesView, Bitmap bitmap, Canvas canvas, AnonymousClass5J6 anonymousClass5J6, float f, float f2, float f3, int i) {
        if (avatarLikesView.f61956G) {
            bitmap = new Paint();
            bitmap.setTextSize(2.0f * f3);
            bitmap.setAlpha(i);
            avatarLikesView = new Rect();
            bitmap.getTextBounds(anonymousClass5J6.f61942D, 0, anonymousClass5J6.f61942D.length(), avatarLikesView);
            canvas.drawText(anonymousClass5J6.f61942D, f - f3, (f2 + f3) - ((float) avatarLikesView.bottom), bitmap);
            return;
        }
        Paint paint;
        RectF rectF = avatarLikesView.f61973X;
        rectF.left = f - f3;
        rectF.right = f + f3;
        rectF.top = f2 - f3;
        rectF.bottom = f2 + f3;
        if (anonymousClass5J6.f61943E) {
            paint = avatarLikesView.f61963N ? avatarLikesView.f61958I : (Paint) avatarLikesView.f61961L.get(anonymousClass5J6.f61941C);
        } else {
            paint = avatarLikesView.f61962M ? avatarLikesView.f61959J : (Paint) avatarLikesView.f61961L.get(anonymousClass5J6.f61941C);
        }
        paint.setAlpha(i);
        canvas.drawBitmap(bitmap, null, avatarLikesView.f61973X, paint);
    }

    /* renamed from: E */
    public static AnonymousClass5J6 m26194E(AvatarLikesView avatarLikesView, long j, boolean z, Bitmap bitmap, boolean z2) {
        int log;
        AnonymousClass5J6 anonymousClass5J6 = (AnonymousClass5J6) avatarLikesView.f61972W.acquire();
        if (anonymousClass5J6 == null) {
            anonymousClass5J6 = new AnonymousClass5J6();
        }
        Resources resources = avatarLikesView.getResources();
        anonymousClass5J6.f61948J = j;
        anonymousClass5J6.f61950L = Math.random() < 0.5d ? -1 : 1;
        anonymousClass5J6.f61943E = z;
        anonymousClass5J6.f61949K = 0.1f;
        if (z) {
            anonymousClass5J6.f61949K += anonymousClass5J6.f61947I.nextFloat() * 0.3f;
        }
        if (z2) {
            log = (int) ((0 - Math.log(Math.random() + 0.01d)) * 3000.0d);
        } else {
            log = 4000;
        }
        anonymousClass5J6.f61940B = log;
        int dimensionPixelSize = resources.getDimensionPixelSize(z2 ? C0164R.dimen.burst_like_oscillation_width : C0164R.dimen.avatar_like_oscillation_width);
        anonymousClass5J6.f61945G = anonymousClass5J6.f61947I.nextInt(dimensionPixelSize * 2) - dimensionPixelSize;
        avatarLikesView = Math.random();
        double d = (double) dimensionPixelSize;
        Double.isNaN(d);
        anonymousClass5J6.f61944F = (int) (avatarLikesView * d);
        if (bitmap != null) {
            avatarLikesView = new AnonymousClass16n(bitmap);
            anonymousClass5J6.f61946H = avatarLikesView;
            avatarLikesView.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            anonymousClass5J6.f61946H = null;
        }
        String[] strArr = AnonymousClass5J6.f61939M;
        anonymousClass5J6.f61942D = strArr[anonymousClass5J6.f61947I.nextInt(strArr.length)];
        anonymousClass5J6.f61941C = anonymousClass5J6.f61947I.nextInt(6);
        return anonymousClass5J6;
    }

    /* renamed from: F */
    public static long m26195F(int i, int i2, int i3) {
        double d = (double) i;
        double d2 = (double) i2;
        double d3 = (double) (i3 - i2);
        double random = Math.random();
        Double.isNaN(d3);
        d3 *= random;
        Double.isNaN(d2);
        d2 += d3;
        Double.isNaN(d);
        return (long) (d * d2);
    }

    /* renamed from: G */
    public static void m26196G(AvatarLikesView avatarLikesView, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass5J6 anonymousClass5J6 = (AnonymousClass5J6) it.next();
            if (SystemClock.elapsedRealtime() - anonymousClass5J6.f61948J > ((long) anonymousClass5J6.f61940B)) {
                it.remove();
                avatarLikesView.f61972W.release(anonymousClass5J6);
            }
        }
    }

    /* renamed from: H */
    private int m26197H(float f) {
        if (f > 0.1f) {
            return this.f61952C.getWidth() / 2;
        }
        return (int) AnonymousClass0dh.C((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.10000000149011612d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (this.f61952C.getWidth() / 2));
    }

    /* renamed from: I */
    private float m26198I(AnonymousClass5J6 anonymousClass5J6, float f) {
        return ((float) getHeartsColumnCenterX()) + (((float) (anonymousClass5J6.f61950L * anonymousClass5J6.f61944F)) * f);
    }

    /* renamed from: J */
    private float m26199J(AnonymousClass5J6 anonymousClass5J6, float f) {
        float heartsColumnCenterX = (float) (getHeartsColumnCenterX() + anonymousClass5J6.f61945G);
        double d = (double) f;
        double d2 = (double) (anonymousClass5J6.f61950L * 6);
        Double.isNaN(d2);
        return heartsColumnCenterX + ((float) AnonymousClass0dh.C((double) ((float) ((Math.sin((d2 * 3.141592653589793d) * d) + 1.0d) / 2.0d)), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (-anonymousClass5J6.f61944F), (double) anonymousClass5J6.f61944F));
    }

    /* renamed from: L */
    private static float m26201L(AnonymousClass5J6 anonymousClass5J6) {
        return anonymousClass5J6.f61949K + 0.05f;
    }

    /* renamed from: M */
    private static int m26202M(float f, float f2) {
        if (f < 0.07f) {
            return (int) AnonymousClass0dh.C((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.07000000029802322d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.0f);
        }
        if (f < f2) {
            return 255;
        }
        return f < 0.9f ? (int) AnonymousClass0dh.C((double) f, (double) f2, 0.8999999761581421d, 255.0d, 0.0f) : 0;
    }

    /* renamed from: N */
    private void m26203N() {
        this.f61972W = new AnonymousClass0KX(583);
        this.f61967R = new ArrayList();
        this.f61964O = new ArrayList();
        this.f61957H = BitmapFactory.decodeResource(getResources(), C0164R.drawable.live_like);
        Paint paint = new Paint(1);
        this.f61959J = paint;
        paint.setStyle(Style.FILL);
        this.f61959J.setColorFilter(new PorterDuffColorFilter(AnonymousClass0Ca.C(getContext(), C0164R.color.white), Mode.SRC_IN));
        paint = new Paint(1);
        this.f61958I = paint;
        paint.setStyle(Style.FILL);
        this.f61958I.setColorFilter(new PorterDuffColorFilter(AnonymousClass0Ca.C(getContext(), C0164R.color.red_5), Mode.SRC_IN));
        paint = new Paint(1);
        this.f61965P = paint;
        paint.setStyle(Style.STROKE);
        this.f61965P.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.white_90_transparent)));
        this.f61966Q = getResources().getDimensionPixelSize(C0164R.dimen.avatar_like_stroke_width);
        this.f61965P.setStrokeWidth((float) this.f61966Q);
        this.f61973X = new RectF();
        this.f61968S = getContext().getResources().getDimensionPixelSize(C0164R.dimen.avatar_likes_width);
        this.f61969T = AnonymousClass0e8.D(getContext());
        this.f61961L = new ArrayList();
        r6 = new int[6];
        int i = 0;
        r6[0] = C0164R.color.red_5;
        r6[1] = C0164R.color.orange_5;
        r6[2] = C0164R.color.yellow_5;
        r6[3] = C0164R.color.green_5;
        r6[4] = C0164R.color.blue_5;
        r6[5] = C0164R.color.purple_5;
        int length = r6.length;
        while (i < length) {
            int i2 = r6[i];
            Paint paint2 = new Paint(1);
            paint2.setStyle(Style.FILL);
            paint2.setColorFilter(new PorterDuffColorFilter(AnonymousClass0Ca.C(getContext(), i2), Mode.SRC_IN));
            this.f61961L.add(paint2);
            i++;
        }
    }

    private int getHeartsColumnCenterX() {
        return this.f61969T ? getLeft() + (this.f61968S / 2) : getRight() - (this.f61968S / 2);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 631067396);
        super.onAttachedToWindow();
        this.f61951B = true;
        AnonymousClass0cQ.O(this, 1359953749, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1917294537);
        super.onDetachedFromWindow();
        this.f61951B = false;
        AnonymousClass0cQ.O(this, -886921347, N);
    }

    public final void onDraw(Canvas canvas) {
        long elapsedRealtime;
        Canvas canvas2 = canvas;
        int height = canvas2.getHeight();
        Object obj = null;
        for (AnonymousClass5J6 anonymousClass5J6 : this.f61967R) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - anonymousClass5J6.f61948J;
            if (elapsedRealtime2 > 0 && elapsedRealtime2 < 4000) {
                float f = ((float) elapsedRealtime2) / 4000.0f;
                float K = m26200K(f, r0.f61957H.getHeight() / 2, height);
                float J = m26199J(anonymousClass5J6, f);
                Bitmap bitmap = r0.f61957H;
                Bitmap bitmap2 = bitmap;
                AnonymousClass5J6 anonymousClass5J62 = anonymousClass5J6;
                m26193D(r0, bitmap2, canvas2, anonymousClass5J62, J, K, (float) (bitmap.getWidth() / 2), m26202M(f, m26201L(anonymousClass5J6)));
                obj = 1;
            }
        }
        for (AnonymousClass5J6 anonymousClass5J63 : r0.f61964O) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - anonymousClass5J63.f61948J;
            if (elapsedRealtime2 > 0 && elapsedRealtime2 < 4000) {
                float f2 = ((float) elapsedRealtime2) / 4000.0f;
                K = m26200K(f2, r0.f61957H.getHeight() / 2, height);
                J = m26199J(anonymousClass5J63, f2);
                int M = m26202M(f2, m26201L(anonymousClass5J63));
                if (f2 < 0.07f) {
                    m26192C(r0, canvas2, anonymousClass5J63, J, K, ((float) r0.f61957H.getWidth()) / 2.0f, M);
                } else if (f2 < anonymousClass5J63.f61949K) {
                    m26192C(r0, canvas2, anonymousClass5J63, J, K, ((float) r0.f61957H.getWidth()) / 2.0f, 255);
                } else if (f2 < anonymousClass5J63.f61949K + 0.05f) {
                    f2 = (float) AnonymousClass0dh.C((double) f2, (double) anonymousClass5J63.f61949K, (double) (anonymousClass5J63.f61949K + 0.05f), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
                    m26192C(r0, canvas2, anonymousClass5J63, J, K, (float) ((int) ((((f2 / 2.0f) + 1.0f) * ((float) r0.f61957H.getWidth())) / 2.0f)), (int) ((1.0f - f2) * 255.0f));
                    int width = (int) ((f2 * ((float) r0.f61957H.getWidth())) / 2.0f);
                    m26193D(r0, r0.f61957H, canvas2, anonymousClass5J63, J, K, (float) width, 255);
                } else {
                    Bitmap bitmap3 = r0.f61957H;
                    m26193D(r0, bitmap3, canvas2, anonymousClass5J63, J, K, (float) (bitmap3.getWidth() / 2), M);
                }
                obj = 1;
            }
        }
        List<AnonymousClass5J6> list = r0.f61955F;
        if (list != null) {
            for (AnonymousClass5J6 anonymousClass5J632 : list) {
                elapsedRealtime = SystemClock.elapsedRealtime() - anonymousClass5J632.f61948J;
                if (elapsedRealtime > 0 && elapsedRealtime < ((long) anonymousClass5J632.f61940B)) {
                    f = (float) Math.pow((double) ((((float) elapsedRealtime) / ((float) anonymousClass5J632.f61940B)) * 3.0f), 0.6000000238418579d);
                    float K2 = m26200K(f, 0, height);
                    float I = m26198I(anonymousClass5J632, f);
                    bitmap = r0.f61954E;
                    m26193D(r0, bitmap, canvas2, anonymousClass5J632, I, K2, (float) (bitmap.getWidth() / 2), m26202M(f, m26201L(anonymousClass5J632)));
                    obj = 1;
                }
            }
        }
        list = r0.f61953D;
        if (list != null) {
            for (AnonymousClass5J6 anonymousClass5J6322 : list) {
                elapsedRealtime = SystemClock.elapsedRealtime() - anonymousClass5J6322.f61948J;
                if (elapsedRealtime > 0 && elapsedRealtime < 4000) {
                    f = ((float) elapsedRealtime) / 4000.0f;
                    K2 = m26200K(f, 0, height);
                    I = m26199J(anonymousClass5J6322, f);
                    m26193D(r0, r0.f61952C, canvas2, anonymousClass5J6322, I, K2, (float) m26197H(f), m26202M(f, m26201L(anonymousClass5J6322)));
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            postInvalidateOnAnimation();
        }
    }

    public void setHeartColor(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r3 = android.graphics.Color.parseColor(r5);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r2 = r4.f61959J;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1 = new android.graphics.PorterDuffColorFilter;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r0 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1.<init>(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r2.setColorFilter(r1);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r0 = 1;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r4.f61962M = r0;	 Catch:{ IllegalArgumentException -> 0x0013 }
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.avatarlike.AvatarLikesView.setHeartColor(java.lang.String):void");
    }

    public void setHeartHighlightColor(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r3 = android.graphics.Color.parseColor(r5);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r2 = r4.f61958I;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1 = new android.graphics.PorterDuffColorFilter;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r0 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1.<init>(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r2.setColorFilter(r1);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r0 = 1;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r4.f61963N = r0;	 Catch:{ IllegalArgumentException -> 0x0013 }
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.avatarlike.AvatarLikesView.setHeartHighlightColor(java.lang.String):void");
    }
}

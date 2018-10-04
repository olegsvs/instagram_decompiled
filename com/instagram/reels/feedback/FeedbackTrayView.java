package com.instagram.reels.feedback;

import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0e7;
import X.AnonymousClass15z;
import X.AnonymousClass2Fm;
import X.AnonymousClass5AP;
import X.AnonymousClass5Zu;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;

public class FeedbackTrayView extends FrameLayout implements AnonymousClass0QP {
    /* renamed from: L */
    private static final AnonymousClass0e5 f60792L = AnonymousClass0e5.B(5.0d, 5.0d);
    /* renamed from: M */
    private static final AnonymousClass0e5 f60793M = AnonymousClass0e5.B(12.0d, 2.0d);
    /* renamed from: B */
    public boolean f60794B;
    /* renamed from: C */
    public int f60795C;
    /* renamed from: D */
    public final ArrayList f60796D = new ArrayList();
    /* renamed from: E */
    public AnonymousClass0cN f60797E;
    /* renamed from: F */
    public AnonymousClass0cN f60798F;
    /* renamed from: G */
    public final ArrayList f60799G = new ArrayList();
    /* renamed from: H */
    public int f60800H;
    /* renamed from: I */
    public AnonymousClass5Zu f60801I;
    /* renamed from: J */
    public int f60802J;
    /* renamed from: K */
    public int f60803K;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public FeedbackTrayView(Context context) {
        super(context);
        m25904B();
    }

    public FeedbackTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25904B();
    }

    public FeedbackTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25904B();
    }

    /* renamed from: B */
    private void m25904B() {
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.story_tray_reaction_padding);
        this.f60800H = resources.getDimensionPixelSize(C0164R.dimen.story_tray_reaction_size) + (dimensionPixelSize * 2);
        AnonymousClass0e7 B = AnonymousClass0e6.B();
        this.f60797E = B.C().O(f60792L).A(this);
        this.f60798F = B.C().O(f60793M).A(this);
        AnonymousClass2Fm[] anonymousClass2FmArr = AnonymousClass2Fm.f28135M;
        this.f60795C = anonymousClass2FmArr.length;
        int i = this.f60800H;
        LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        for (AnonymousClass2Fm anonymousClass2Fm : anonymousClass2FmArr) {
            View imageView = new ImageView(getContext());
            imageView.setImageResource(anonymousClass2Fm.A());
            imageView.setContentDescription(resources.getString(anonymousClass2Fm.B()));
            imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            AnonymousClass15z anonymousClass15z = new AnonymousClass15z(imageView);
            anonymousClass15z.f14386F = true;
            anonymousClass15z.f14389I = 0.75f;
            anonymousClass15z.f14385E = new AnonymousClass5AP(this, anonymousClass2Fm);
            anonymousClass15z.A();
            addView(imageView, layoutParams);
        }
        View imageView2 = new ImageView(getContext());
        imageView2.setImageResource(C0164R.drawable.instagram_close_outline_44);
        imageView2.setContentDescription(resources.getString(C0164R.string.close));
        imageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(imageView2, layoutParams);
    }

    /* renamed from: C */
    private void m25905C() {
        if (getChildCount() >= 1) {
            ImageView imageView = (ImageView) getChildAt(getChildCount() - 1);
            float E = (float) r0.f60797E.E();
            double d = (double) E;
            float B = (float) AnonymousClass0dh.B(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
            float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 0.5d, 1.0d);
            for (int i = 0; i < r0.f60795C; i++) {
                float f;
                ImageView imageView2 = (ImageView) getChildAt(i);
                PointF pointF = (PointF) r0.f60796D.get(i);
                if (E < 0.5f) {
                    f = (float) r0.f60802J;
                } else {
                    f = ((float) r0.f60802J) + ((float) AnonymousClass0dh.C(d, 0.5d, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (pointF.x - ((float) r0.f60802J))));
                }
                imageView2.setX(f);
                imageView2.setY(((float) r0.f60803K) + ((float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (pointF.y - ((float) r0.f60803K)))));
                imageView2.setScaleX(C);
                imageView2.setScaleY(C);
                imageView2.setAlpha(B);
            }
            imageView.setX((float) r0.f60802J);
            imageView.setY(((float) r0.f60803K) + ((float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (r0.f60800H / 4))));
            imageView.setAlpha(B);
        }
    }

    /* renamed from: D */
    private void m25906D() {
        if (getChildCount() >= 1) {
            ImageView imageView = (ImageView) getChildAt(getChildCount() - 1);
            float E = (float) r0.f60798F.E();
            for (int i = 0; i < r0.f60795C; i++) {
                ((ImageView) getChildAt(i)).setRotation((float) AnonymousClass0dh.C((double) E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) ((Float) r0.f60799G.get(i)).floatValue(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
            }
            imageView.setRotation((float) AnonymousClass0dh.C((double) E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) ((Float) r0.f60799G.get(0)).floatValue(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        this.f60794B = false;
        if (anonymousClass0cN.E() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            AnonymousClass5Zu anonymousClass5Zu = this.f60801I;
            if (anonymousClass5Zu.f66416B.f60628D != null) {
                anonymousClass5Zu.f66416B.f60628D.setVisibility(8);
            }
        }
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
        anonymousClass0cN.f7108F = anonymousClass0cN.f7106D == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN == this.f60797E) {
            m25905C();
        } else if (anonymousClass0cN == this.f60798F) {
            m25906D();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f60796D.clear();
        this.f60799G.clear();
        int measuredWidth = getMeasuredWidth();
        int i5 = (int) (((float) measuredWidth) * 0.75f);
        int i6 = (measuredWidth - i5) / 2;
        int measuredHeight = (int) (((float) getMeasuredHeight()) * 0.8f);
        int i7 = i5 / 2;
        float f = (3.1415927f / ((float) (this.f60795C - 1))) * 0.5f;
        double d = (double) (i7 * 2);
        double sin = Math.sin(0.7853981633974483d);
        Double.isNaN(d);
        measuredWidth = (int) (d * sin);
        float f2 = ((float) i5) / ((float) measuredWidth);
        i6 = (i6 + i7) - (this.f60800H / 2);
        double d2 = (double) i7;
        double d3 = (double) (measuredWidth / 2);
        d = Math.sqrt(Math.pow(d2, 2.0d) - Math.pow(d3, 2.0d));
        sin = (double) f2;
        Double.isNaN(sin);
        int i8 = ((int) (d * sin)) + measuredHeight;
        float f3 = ((float) i7) * f2;
        sin = Math.sqrt(Math.pow(d2, 2.0d) - Math.pow(d3, 2.0d));
        Double.isNaN(d2);
        i5 = (int) (((float) ((int) (d2 - sin))) * f2);
        measuredWidth = getMeasuredWidth() / 2;
        int i9 = this.f60800H;
        this.f60802J = measuredWidth - (i9 / 2);
        this.f60803K = (measuredHeight - (i9 / 2)) + i5;
        float f4 = 210.0f / ((float) (this.f60795C - 1));
        int i10 = 0;
        while (true) {
            int i11 = r6.f60795C;
            if (i10 >= i11) {
                break;
            }
            d2 = (double) f3;
            sin = (double) ((((float) ((i11 - 1) - i10)) * f) + 0.7853982f);
            double cos = Math.cos(sin);
            Double.isNaN(d2);
            int i12 = ((int) (d2 * cos)) + i6;
            d2 = (double) (-f3);
            sin = Math.sin(sin);
            Double.isNaN(d2);
            r6.f60796D.add(new PointF((float) i12, (float) (((int) (d2 * sin)) + i8)));
            r6.f60799G.add(Float.valueOf(120.0f - (((float) i10) * f4)));
            i10++;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (r6.f60794B) {
            r6.f60797E.N(1.0d);
            r6.f60798F.N(1.0d);
        }
    }

    public void setReactionsAnimationListener(AnonymousClass5Zu anonymousClass5Zu) {
        this.f60801I = anonymousClass5Zu;
    }
}

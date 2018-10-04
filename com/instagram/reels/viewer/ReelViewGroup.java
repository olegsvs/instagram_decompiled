package com.instagram.reels.viewer;

import X.AnonymousClass0HV;
import X.AnonymousClass0QF;
import X.AnonymousClass0ZF;
import X.AnonymousClass0cQ;
import X.AnonymousClass0jh;
import X.AnonymousClass0vl;
import X.AnonymousClass15j;
import X.AnonymousClass15k;
import X.AnonymousClass15l;
import X.AnonymousClass15m;
import X.AnonymousClass15n;
import X.AnonymousClass5Cw;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReelViewGroup extends FrameLayout {
    /* renamed from: B */
    public IgProgressImageView f14238B;
    /* renamed from: C */
    public final int f14239C;
    /* renamed from: D */
    public AnonymousClass0QF f14240D;
    /* renamed from: E */
    public float f14241E;
    /* renamed from: F */
    public final List f14242F;
    /* renamed from: G */
    public final Rect f14243G;
    /* renamed from: H */
    public TextureView f14244H;
    /* renamed from: I */
    private final GestureDetector f14245I;
    /* renamed from: J */
    private final SimpleOnGestureListener f14246J;
    /* renamed from: K */
    private final AnonymousClass0vl f14247K;
    /* renamed from: L */
    private AnonymousClass0jh f14248L;
    /* renamed from: M */
    private final Paint f14249M;
    /* renamed from: N */
    private final GestureDetector f14250N;
    /* renamed from: O */
    private final OnGestureListener f14251O;

    public ReelViewGroup(Context context) {
        this(context, null);
    }

    public ReelViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReelViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14251O = new AnonymousClass15j(this);
        this.f14242F = new ArrayList();
        this.f14249M = new Paint();
        this.f14243G = new Rect();
        this.f14250N = new GestureDetector(getContext(), this.f14251O);
        this.f14249M.setStyle(Style.FILL);
        this.f14249M.setColor(Color.argb(150, 0, 0, 0));
        this.f14246J = new AnonymousClass15l(this, new AnonymousClass15k(context));
        this.f14248L = new AnonymousClass15m(this);
        this.f14247K = new AnonymousClass0vl(context);
        this.f14245I = new GestureDetector(getContext(), this.f14246J);
        this.f14247K.m8364A(this.f14248L);
        this.f14239C = context.getResources().getDimensionPixelOffset(C0164R.dimen.reel_viewer_forward_backward_dividing_line);
    }

    /* renamed from: A */
    public final void m9300A(float f, List list) {
        this.f14241E = f;
        this.f14242F.clear();
        if (list != null) {
            this.f14242F.addAll(list);
        }
        Collections.sort(this.f14242F, new AnonymousClass5Cw(this));
        if (m9299B()) {
            invalidate();
        }
    }

    /* renamed from: B */
    private static boolean m9299B() {
        return AnonymousClass0HV.m2007C().f2646B.getBoolean("show_reel_mention_boundaries", false);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (m9299B()) {
            for (AnonymousClass0ZF anonymousClass0ZF : this.f14242F) {
                AnonymousClass15n.m9337D(anonymousClass0ZF, getWidth(), getHeight(), this.f14241E, this.f14243G);
                canvas.save();
                canvas.rotate(anonymousClass0ZF.yQ() * 360.0f, (float) this.f14243G.centerX(), (float) this.f14243G.centerY());
                canvas.drawRect(this.f14243G, this.f14249M);
                canvas.restore();
            }
        }
    }

    public final void onFinishInflate() {
        int N = AnonymousClass0cQ.m5864N(this, -330024126);
        super.onFinishInflate();
        this.f14238B = (IgProgressImageView) findViewById(C0164R.id.reel_viewer_image_view);
        this.f14244H = (TextureView) findViewById(C0164R.id.reel_viewer_texture_view);
        AnonymousClass0cQ.m5865O(this, -107618409, N);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f14245I.onTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        int M = AnonymousClass0cQ.m5863M(this, 1239293290);
        if (!this.f14245I.onTouchEvent(motionEvent)) {
            if (!this.f14250N.onTouchEvent(motionEvent)) {
                z = false;
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 || actionMasked == 3) {
                    this.f14240D.kEA(z);
                }
                AnonymousClass0cQ.m5862L(this, 1681717133, M);
                return z;
            }
        }
        z = true;
        actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
        }
        this.f14240D.kEA(z);
        AnonymousClass0cQ.m5862L(this, 1681717133, M);
        return z;
    }

    public void setListener(AnonymousClass0QF anonymousClass0QF) {
        this.f14240D = anonymousClass0QF;
    }
}

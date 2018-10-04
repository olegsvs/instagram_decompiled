package com.instagram.creation.base.ui.filterview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0F4;
import X.AnonymousClass0F6;
import X.AnonymousClass0F8;
import X.AnonymousClass0G5;
import X.AnonymousClass0PI;
import X.AnonymousClass0PP;
import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ch;
import X.AnonymousClass0ci;
import X.AnonymousClass0e6;
import X.AnonymousClass0g0;
import X.AnonymousClass3D7;
import X.AnonymousClass3D8;
import X.AnonymousClass3D9;
import X.AnonymousClass3DA;
import X.AnonymousClass3DB;
import X.AnonymousClass3DC;
import X.AnonymousClass3Hb;
import X.AnonymousClass4Yc;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.ui.TagPeopleDrawable;
import com.instagram.creation.state.CreationState;

public class FilterViewContainer extends MediaFrameLayout implements AnonymousClass0QP, OnGestureListener, AnonymousClass0F8 {
    /* renamed from: B */
    public View f39157B;
    /* renamed from: C */
    public ImageView f39158C;
    /* renamed from: D */
    public AnonymousClass4Yc f39159D;
    /* renamed from: E */
    public boolean f39160E;
    /* renamed from: F */
    public CreationSession f39161F;
    /* renamed from: G */
    public final AnonymousClass0cN f39162G = AnonymousClass0e6.B().C();
    /* renamed from: H */
    public View f39163H;
    /* renamed from: I */
    public View f39164I;
    /* renamed from: J */
    public AnimationDrawable f39165J;
    /* renamed from: K */
    private GestureDetector f39166K;
    /* renamed from: L */
    private final Handler f39167L = new AnonymousClass3D7(this);

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public FilterViewContainer(Context context) {
        super(context);
        m19044C();
    }

    public FilterViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19044C();
    }

    public FilterViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19044C();
    }

    /* renamed from: A */
    public final void m19045A(boolean z, Drawable drawable) {
        if (z) {
            Bitmap bitmap = this.f39161F.f38963Q;
            if (bitmap != null) {
                this.f39158C.addOnLayoutChangeListener(new AnonymousClass3D8(this, this.f39161F.f38964R, this.f39161F.m18967D().f38981D));
                this.f39158C.setImageBitmap(bitmap);
                this.f39161F.m18987X(null, null);
            } else {
                this.f39158C.setImageDrawable(drawable);
            }
            this.f39158C.setVisibility(0);
            return;
        }
        this.f39158C.setVisibility(4);
    }

    /* renamed from: B */
    public static void m19043B(View view, float f) {
        if (view.getVisibility() != 8) {
            view.setAlpha(Math.min(1.0f, Math.max(0.0f, f)));
            view.setVisibility(0);
        }
    }

    /* renamed from: C */
    private void m19044C() {
        this.f39161F = ((AnonymousClass0PI) getContext()).VK();
        this.f39166K = new GestureDetector(getContext(), this);
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        int i = 4;
        if (this.f39157B.getVisibility() != 8) {
            this.f39157B.setVisibility(anonymousClass0cN.E() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED ? 4 : 0);
        }
        if (this.f39163H.getVisibility() != 8) {
            this.f39163H.setVisibility(anonymousClass0cN.E() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED ? 4 : 0);
        }
        if (this.f39164I.getVisibility() != 8) {
            View view = this.f39164I;
            if (anonymousClass0cN.E() != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        m19043B(this.f39157B, E);
        m19043B(this.f39163H, E);
        m19043B(this.f39164I, E);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 985958785);
        super.onAttachedToWindow();
        ((AnonymousClass0PP) getContext()).AJA(this);
        this.f39162G.A(this).L(1.0d);
        AnonymousClass0cQ.O(this, -1757303389, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 898253361);
        super.onDetachedFromWindow();
        AnonymousClass0F4.f2058E.D(AnonymousClass3Hb.class, this);
        this.f39162G.J(this);
        this.f39167L.removeCallbacksAndMessages(null);
        AnonymousClass0cQ.O(this, -1430928286, N);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -735449900);
        AnonymousClass3Hb anonymousClass3Hb = (AnonymousClass3Hb) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, 1276643228);
        if (anonymousClass3Hb.f39847D == CreationState.SHARE) {
            if (this.f39161F.m18981R() && this.f39161F.f38954H == 0) {
                ((TagPeopleDrawable) this.f39163H.findViewById(C0164R.id.tag_people_pill_icon)).setNumPeopleTagged(this.f39161F.f38962P.size());
                this.f39163H.setOnClickListener(new AnonymousClass3DB(this));
                this.f39163H.setVisibility(0);
                m19043B(this.f39163H, (float) this.f39162G.E());
            } else {
                this.f39163H.setVisibility(8);
            }
            this.f39157B.setOnClickListener(new AnonymousClass3D9(this));
            int i = 0;
            this.f39157B.setVisibility(0);
            this.f39164I.setOnClickListener(new AnonymousClass3DA(this));
            View view = this.f39164I;
            if (this.f39161F.m18981R() || !this.f39161F.m18968E().f38992F) {
                i = 8;
            }
            view.setVisibility(i);
            this.f39165J.stop();
        } else {
            this.f39162G.L(1.0d);
            this.f39157B.setVisibility(8);
            this.f39163H.setVisibility(8);
            this.f39164I.setVisibility(8);
        }
        AnonymousClass0cQ.H(this, 1498972405, I2);
        AnonymousClass0cQ.H(this, 483817408, I);
    }

    public final void onFinishInflate() {
        int N = AnonymousClass0cQ.N(this, 1639287623);
        super.onFinishInflate();
        this.f39158C = (ImageView) findViewById(C0164R.id.loading_cover_for_surface_view);
        this.f39157B = findViewById(C0164R.id.edit_pill);
        this.f39163H = findViewById(C0164R.id.tag_people_pill);
        View findViewById = findViewById(C0164R.id.trim_pill);
        this.f39164I = findViewById;
        this.f39165J = (AnimationDrawable) ((ImageView) findViewById.findViewById(C0164R.id.trim_pill_icon)).getDrawable();
        if (((AnonymousClass0PI) getContext()).VK().f38951E == AnonymousClass0g0.PROFILE_PHOTO) {
            PunchedOverlayView punchedOverlayView = (PunchedOverlayView) ((ViewStub) findViewById(C0164R.id.avatar_punched_stub)).inflate();
            punchedOverlayView.setDarkenColor(AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.creationTertiaryBackground)));
            punchedOverlayView.post(new AnonymousClass3DC(this, punchedOverlayView));
        }
        AnonymousClass0cQ.O(this, 934044002, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1564346410);
        this.f39166K.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    if (this.f39159D != null) {
                        this.f39167L.sendEmptyMessageDelayed(0, 300);
                        break;
                    }
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        actionMasked = motionEvent.getActionMasked();
        this.f39167L.removeMessages(0);
        getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f39160E) {
            AnonymousClass4Yc anonymousClass4Yc = this.f39159D;
            if (anonymousClass4Yc != null) {
                this.f39160E = false;
                if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7232C) {
                    anonymousClass4Yc.m24472A();
                }
            }
        }
        AnonymousClass0cQ.L(this, -671123914, M);
        return true;
    }

    public void setLongPressListener(AnonymousClass4Yc anonymousClass4Yc) {
        this.f39159D = anonymousClass4Yc;
    }
}

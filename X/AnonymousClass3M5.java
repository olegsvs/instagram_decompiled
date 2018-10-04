package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.venue.Venue;

/* renamed from: X.3M5 */
public final class AnonymousClass3M5 extends AnonymousClass1V4 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Uw f40416B;
    /* renamed from: C */
    public final /* synthetic */ Context f40417C;
    /* renamed from: D */
    public final /* synthetic */ boolean f40418D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0hq f40419E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0Cm f40420F;

    /* renamed from: E */
    public final boolean m19451E(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass3M5(AnonymousClass1Uw anonymousClass1Uw, Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0hq anonymousClass0hq, boolean z) {
        this.f40416B = anonymousClass1Uw;
        this.f40417C = context;
        this.f40420F = anonymousClass0Cm;
        this.f40419E = anonymousClass0hq;
        this.f40418D = z;
    }

    /* renamed from: A */
    public final boolean m19447A(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f40416B.f19247d == AnonymousClass3MY.PEEK || this.f40416B.f19247d == AnonymousClass3MY.HOLD) {
            int H;
            AnonymousClass0F4.f2058E.C(new AnonymousClass3kC(AnonymousClass3MY.PEEK.mo4924A()));
            this.f40416B.f19232O = false;
            z = AnonymousClass1Uw.H(this.f40416B, motionEvent.getRawX(), motionEvent.getRawY(), this.f40416B.f19236S.f40341D, this.f40416B.f19223F.getString(AnonymousClass0ek.B(this.f40420F).R(this.f40416B.f19240W) ? C0164R.string.unlike : C0164R.string.like));
            if (this.f40418D) {
                H = z | AnonymousClass1Uw.H(this.f40416B, motionEvent.getRawX(), motionEvent.getRawY(), this.f40416B.f19236S.f40340C, this.f40416B.f19223F.getString(C0164R.string.comment));
            } else {
                H = z | AnonymousClass1Uw.H(this.f40416B, motionEvent.getRawX(), motionEvent.getRawY(), this.f40416B.f19236S.f40343F, this.f40416B.f19223F.getString(C0164R.string.view_profile));
            }
            z = (H | AnonymousClass1Uw.H(this.f40416B, motionEvent.getRawX(), motionEvent.getRawY(), this.f40416B.f19236S.f40344G, this.f40416B.f19223F.getString(C0164R.string.share))) | AnonymousClass1Uw.H(this.f40416B, motionEvent.getRawX(), motionEvent.getRawY(), this.f40416B.f19236S.f40342E, this.f40416B.f19223F.getString(C0164R.string.menu_options));
            if (z) {
                this.f40416B.f19247d = AnonymousClass3MY.HOLD;
            } else {
                this.f40416B.f19224G = null;
                this.f40416B.f19247d = AnonymousClass3MY.PEEK;
            }
        }
        return z;
    }

    /* renamed from: B */
    public final boolean m19448B(MotionEvent motionEvent) {
        if (this.f40416B.f19248e == null) {
            ViewParent parent = r11.f40416B.f19250g.getParent();
            while (parent != null && !(parent instanceof TouchInterceptorFrameLayout)) {
                parent = parent.getParent();
            }
            r11.f40416B.f19248e = (TouchInterceptorFrameLayout) parent;
        }
        if (r11.f40416B.f19248e == null) {
            return false;
        }
        CharSequence string;
        Drawable bitmapDrawable;
        r11.f40416B.f19248e.A(r11.f40416B);
        r11.f40416B.f19248e.setOnKeyListener(r11.f40416B);
        r11.f40416B.f19248e.setFocusable(true);
        r11.f40416B.f19248e.requestFocusFromTouch();
        r11.f40416B.f19237T = true;
        AnonymousClass1Wv anonymousClass1Wv = r11.f40416B.f19221D;
        AnonymousClass0Cm anonymousClass0Cm = r11.f40416B.f19249f;
        View view = r11.f40416B.f19243Z;
        AnonymousClass0P7 anonymousClass0P7 = r11.f40416B.f19240W;
        AnonymousClass0pj anonymousClass0pj = AnonymousClass0pj.AUTOPLAY;
        AnonymousClass1Uw anonymousClass1Uw = r11.f40416B;
        AnonymousClass0m3 RO = anonymousClass1Uw.RO(anonymousClass1Uw.f19240W);
        boolean z = r11.f40416B.f19239V;
        AnonymousClass0EE anonymousClass0EE = r11.f40416B;
        AnonymousClass3LU anonymousClass3LU = (AnonymousClass3LU) view.getTag();
        anonymousClass3LU.f40350M.setUrl(anonymousClass0P7.MA().DQ());
        anonymousClass3LU.f40351N.setText(anonymousClass0P7.MA().uT());
        Venue venue = anonymousClass0P7.AD;
        boolean z2 = (venue == null || venue.f6716M == null) ? false : true;
        if (anonymousClass0P7.fA()) {
            anonymousClass3LU.f40355R.setVisibility(0);
            CharSequence I = AnonymousClass0Gk.I(anonymousClass0P7.z().uT(), anonymousClass1Wv.f19627B.getString(C0164R.string.sponsor_tag_label), new AnonymousClass0yF());
            anonymousClass3LU.f40355R.setSingleLine(true);
            anonymousClass3LU.f40355R.setText(I);
            anonymousClass3LU.f40355R.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3LT(anonymousClass1Wv, anonymousClass3LU, anonymousClass0P7, z2, venue, I));
        } else if (z2) {
            anonymousClass3LU.f40355R.setVisibility(0);
            anonymousClass3LU.f40355R.setText(venue.f6716M);
            if (anonymousClass0P7.c() != AnonymousClass0xx.Foursquare) {
                if (anonymousClass0P7.c() == AnonymousClass0xx.User) {
                    if (!anonymousClass0P7.WA()) {
                        anonymousClass3LU.f40355R.setTextColor(anonymousClass1Wv.f19631F);
                    }
                }
            }
            anonymousClass3LU.f40355R.setTextColor(anonymousClass1Wv.f19630E);
        } else {
            anonymousClass3LU.f40355R.setVisibility(8);
            AnonymousClass0Nm.O(anonymousClass3LU.f40345H);
        }
        anonymousClass3LU.f40349L.f10834I.setAspectRatio(anonymousClass0P7.L());
        AnonymousClass0tk.B(anonymousClass0P7, anonymousClass3LU.f40349L.f10829D, anonymousClass0EE);
        if (anonymousClass1Wv.f19628C == null) {
            anonymousClass1Wv.f19628C = new AnonymousClass0vo();
        }
        anonymousClass1Wv.f19628C.A(anonymousClass3LU.f40349L.f10831F, anonymousClass3LU.f40349L.f10829D, anonymousClass0pj, anonymousClass0P7.wY(), anonymousClass0P7.qA(), RO);
        if (!(anonymousClass3LU.f40349L.f10836K == null || anonymousClass3LU.f40349L.f10836K == RO)) {
            anonymousClass3LU.f40349L.f10836K.X(anonymousClass3LU.f40349L.f10830E);
            anonymousClass3LU.f40349L.f10836K.Y(anonymousClass3LU.f40349L.f10835J.f12002B);
        }
        anonymousClass3LU.f40349L.f10836K = RO;
        AnonymousClass0zI.B(anonymousClass3LU.f40349L.OO(), anonymousClass0P7, RO, anonymousClass0Cm);
        AnonymousClass3Nv.m19504C(anonymousClass3LU.f40349L.f10829D, anonymousClass0P7);
        anonymousClass3LU.f40341D.setSelected(AnonymousClass0ek.B(anonymousClass0Cm).R(anonymousClass0P7));
        ImageView imageView = anonymousClass3LU.f40341D;
        if (AnonymousClass0ek.B(anonymousClass0Cm).R(anonymousClass0P7)) {
            string = anonymousClass1Wv.f19627B.getString(C0164R.string.liked);
        } else {
            string = anonymousClass1Wv.f19627B.getString(C0164R.string.like);
        }
        imageView.setContentDescription(string);
        if (anonymousClass0P7.wA()) {
            anonymousClass3LU.f40344G.setVisibility(8);
            anonymousClass3LU.f40354Q.setVisibility(8);
        } else {
            anonymousClass3LU.f40344G.setVisibility(0);
            anonymousClass3LU.f40354Q.setVisibility(0);
        }
        if (z) {
            anonymousClass3LU.f40343F.setVisibility(8);
            if (anonymousClass0P7.f4039n) {
                anonymousClass3LU.f40340C.setVisibility(8);
                anonymousClass3LU.f40352O.setVisibility(8);
            } else {
                anonymousClass3LU.f40340C.setVisibility(0);
                anonymousClass3LU.f40352O.setVisibility(0);
            }
        } else {
            anonymousClass3LU.f40343F.setVisibility(0);
            anonymousClass3LU.f40340C.setVisibility(8);
        }
        if (AnonymousClass0Co.F(anonymousClass0Cm, anonymousClass0P7)) {
            anonymousClass3LU.f40342E.setVisibility(8);
            anonymousClass3LU.f40353P.setVisibility(8);
        } else {
            anonymousClass3LU.f40342E.setVisibility(0);
            anonymousClass3LU.f40353P.setVisibility(0);
        }
        View view2 = r11.f40416B.f19243Z;
        Context context = r11.f40417C;
        ViewGroup viewGroup = r11.f40416B.f19245b;
        viewGroup.setDrawingCacheEnabled(true);
        viewGroup.buildDrawingCache();
        Bitmap drawingCache = viewGroup.getDrawingCache();
        if (drawingCache != null) {
            Bitmap blur = BlurUtil.blur(drawingCache, 0.1f, 3);
            new Canvas(blur).drawColor(AnonymousClass0Ca.C(context, C0164R.color.black), Mode.DST_OVER);
            bitmapDrawable = new BitmapDrawable(context.getResources(), blur);
        } else {
            bitmapDrawable = null;
        }
        viewGroup.destroyDrawingCache();
        viewGroup.setDrawingCacheEnabled(false);
        view2.setBackgroundDrawable(bitmapDrawable);
        View view3 = r11.f40416B.f19236S.f40348K;
        view3.setScaleX(0.8f);
        view3.setScaleY(0.8f);
        r11.f40416B.f19236S.f40339B.setVisibility(4);
        r11.f40416B.f19236S.f40347J.setVisibility(8);
        r11.f40416B.f19236S.f40347J.setAlpha(0.0f);
        AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
        anonymousClass0Iz.K(r11.f40416B.f19241X, r11.f40416B.f19229L.H(), "long_press");
        anonymousClass0Iz.H(r11.f40416B);
        r11.f40416B.f19238U.F(r11.f40416B.f19240W, r11.f40416B.f19244a, r11.f40416B.f19222E, null);
        r11.f40416B.f19238U.K(r11.f40416B.f19240W, r11.f40416B.f19244a, AnonymousClass0w9.f12220C);
        r11.f40416B.f19247d = AnonymousClass3MY.PEEK_ANIMATION;
        if (AnonymousClass1Uw.B(r11.f40416B.f19240W, r11.f40416B.f19222E).wY()) {
            AnonymousClass0vA anonymousClass0vA = new AnonymousClass0vA(AnonymousClass1Uw.B(r11.f40416B.f19240W, r11.f40416B.f19222E).OA());
            anonymousClass0vA.f11973G = true;
            anonymousClass0vA.f11974H = r11.f40416B.getModuleName();
            AnonymousClass0vB.C(anonymousClass0vA, r11.f40416B.f19249f);
        }
        return true;
    }

    /* renamed from: C */
    public final void m19449C(MotionEvent motionEvent) {
        this.f40416B.f19235R = null;
        this.f40416B.f19224G = null;
        this.f40416B.f19247d = AnonymousClass3MY.NONE;
    }

    /* renamed from: D */
    public final boolean m19450D(MotionEvent motionEvent) {
        this.f40416B.f19243Z.setVisibility(4);
        this.f40416B.f19247d = AnonymousClass3MY.DOWN;
        return true;
    }

    /* renamed from: F */
    public final void m19452F(MotionEvent motionEvent, AnonymousClass0cN anonymousClass0cN) {
        if (this.f40416B.f19247d != AnonymousClass3MY.NONE && anonymousClass0cN.E() != AnonymousClass3Mc.f40472U) {
            this.f40416B.f19236S.f40347J.setVisibility(8);
            this.f40416B.f19236S.f40347J.setAlpha(0.0f);
            this.f40416B.f19224G = null;
            this.f40416B.f19232O = false;
            if (this.f40416B.f19247d == AnonymousClass3MY.HOLD) {
                this.f40416B.f19247d = AnonymousClass3MY.PEEK;
            }
        }
    }

    /* renamed from: G */
    public final void m19453G(MotionEvent motionEvent, AnonymousClass0cN anonymousClass0cN) {
        AnonymousClass1Uw anonymousClass1Uw = this.f40416B;
        double E = anonymousClass0cN.E();
        if (anonymousClass1Uw.f19247d == AnonymousClass3MY.HOLD) {
            if (!anonymousClass1Uw.f19232O) {
                anonymousClass1Uw.f19236S.f40347J.setAlpha((float) E);
            }
            if (E >= 1.0d) {
                anonymousClass1Uw.f19232O = true;
            }
            anonymousClass1Uw.f19236S.f40347J.setVisibility(0);
            anonymousClass1Uw.f19236S.f40347J.setTranslationX((float) ((anonymousClass1Uw.f19225H[0] + (anonymousClass1Uw.f19224G.getWidth() / 2)) - (anonymousClass1Uw.f19236S.f40347J.getWidth() / 2)));
            anonymousClass1Uw.f19236S.f40347J.setTranslationY(((float) (((anonymousClass1Uw.f19225H[1] + (anonymousClass1Uw.f19224G.getHeight() / 2)) - (anonymousClass1Uw.f19236S.f40347J.getHeight() / 2)) - anonymousClass1Uw.f19234Q)) - (((float) E) * ((float) anonymousClass1Uw.f19233P)));
        }
        if (anonymousClass0cN.f7106D != AnonymousClass3Mc.f40472U) {
            this.f40416B.f19235R = null;
        } else if (this.f40416B.f19235R == null && anonymousClass0cN.E() > 0.800000011920929d) {
            AnonymousClass1Uw anonymousClass1Uw2 = this.f40416B;
            anonymousClass1Uw2.f19235R = anonymousClass1Uw2.f19224G;
            AnonymousClass0HT.f2637C.C();
        }
    }

    /* renamed from: H */
    public final boolean m19454H(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f40416B.f19247d == AnonymousClass3MY.HOLD && AnonymousClass1Uw.F(motionEvent2.getRawX(), motionEvent2.getRawY(), this.f40416B.f19224G);
    }

    /* renamed from: I */
    public final void m19455I(MotionEvent motionEvent) {
        if (this.f40416B.f19247d == AnonymousClass3MY.PEEK_ANIMATION) {
            this.f40416B.f19247d = AnonymousClass3MY.PEEK;
            if (this.f40416B.f19226I != null) {
                this.f40416B.f19226I.Vt();
            }
            AnonymousClass0Gl.f2412B.B();
            View view = this.f40416B.f19236S.f40348K;
            if (AnonymousClass1Uw.B(this.f40416B.f19240W, this.f40416B.f19222E).wY()) {
                this.f40416B.f19227J.M(this.f40416B.f19240W, this.f40416B.f19236S.f40349L, this.f40416B.f19244a, this.f40416B.f19222E, this.f40416B.f19219B.RO(this.f40416B.f19240W).f9710s, true, this.f40416B);
            }
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    /* renamed from: J */
    public final void m19456J(MotionEvent motionEvent, AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.E() != AnonymousClass3Mc.f40472U && this.f40416B.f19247d != AnonymousClass3MY.NONE) {
            this.f40416B.f19243Z.setVisibility(4);
            if (this.f40416B.f19242Y != null) {
                this.f40416B.f19242Y.run();
                this.f40416B.f19242Y = null;
            }
            this.f40416B.f19247d = AnonymousClass3MY.NONE;
            if (this.f40416B.f19226I != null) {
                this.f40416B.f19226I.Wt();
            }
            AnonymousClass0Gl.f2412B.B();
        }
    }

    /* renamed from: K */
    public final void m19457K(MotionEvent motionEvent) {
        AnonymousClass1Uw.D(this.f40416B);
    }

    /* renamed from: L */
    public final void m19458L(MotionEvent motionEvent, AnonymousClass0cN anonymousClass0cN) {
        motionEvent = this.f40416B;
        double E = anonymousClass0cN.E();
        if (motionEvent.f19247d == AnonymousClass3MY.PEEK || motionEvent.f19247d == AnonymousClass3MY.PEEK_ANIMATION) {
            View view = motionEvent.f19236S.f40348K;
            float f = (float) E;
            motionEvent.f19243Z.setAlpha(f);
            f = (f * 0.19999999f) + 0.8f;
            view.setScaleX(f);
            view.setScaleY(f);
            motionEvent.f19243Z.setVisibility(0);
        }
    }

    /* renamed from: M */
    public final boolean m19459M(MotionEvent motionEvent) {
        if (this.f40416B.f19235R == this.f40416B.f19236S.f40340C) {
            r0.f40416B.f19242Y = new AnonymousClass3M1(r0);
        } else if (r0.f40416B.f19235R == r0.f40416B.f19236S.f40344G) {
            AnonymousClass0P7 anonymousClass0P7 = r0.f40416B.f19240W;
            AnonymousClass0PZ anonymousClass0PZ = r0.f40416B;
            AnonymousClass0bN.c("share_button", anonymousClass0P7, anonymousClass0PZ, anonymousClass0PZ.f19222E, r0.f40416B.f19244a, r0.f40416B.f19236S.f40349L.f10829D.getCurrentScans());
            AnonymousClass0EE anonymousClass0EE = r0.f40416B;
            AnonymousClass0xk.D(anonymousClass0EE, anonymousClass0EE.f19240W, r0.f40416B.f19246c != null ? r0.f40416B.f19246c.kR() : null);
            AnonymousClass0bz.B(r0.f40416B.f19228K.getContext()).C(AnonymousClass0J7.f2895B.O().D(r0.f40416B.f19249f, r0.f40416B.f19240W.getId(), AnonymousClass0V0.MEDIA_SHARE, r0.f40416B).dOA(r0.f40416B).HNA(r0.f40416B.f19222E).ED());
        } else if (r0.f40416B.f19235R == r0.f40416B.f19236S.f40341D) {
            AnonymousClass1Uw anonymousClass1Uw = r0.f40416B;
            double d = AnonymousClass3Mc.f40473V;
            double d2 = AnonymousClass3Mc.f40472U;
            AnonymousClass0xJ anonymousClass0xJ = AnonymousClass0ek.B(r0.f40420F).R(r0.f40416B.f19240W) ? AnonymousClass0xJ.NOT_LIKED : AnonymousClass0xJ.LIKED;
            AnonymousClass0xL.B(anonymousClass1Uw.f19223F, anonymousClass1Uw.f19240W, anonymousClass1Uw.f19244a, anonymousClass1Uw.f19222E, anonymousClass1Uw.f19236S.f40349L.f10829D.getCurrentScans(), anonymousClass0xJ, AnonymousClass0xK.PEEK_MEDIA, anonymousClass1Uw, anonymousClass1Uw.f19228K.getActivity(), anonymousClass1Uw.f19249f, anonymousClass1Uw.f19246c);
            boolean z = false;
            if (anonymousClass0xJ == AnonymousClass0xJ.LIKED) {
                anonymousClass1Uw.f19231N.L(d).N(d2);
                anonymousClass1Uw.f19236S.f40339B.setVisibility(0);
                anonymousClass1Uw.f19247d = AnonymousClass3MY.END_PEEK;
            }
            ImageView imageView = anonymousClass1Uw.f19236S.f40341D;
            if (anonymousClass0xJ == AnonymousClass0xJ.LIKED) {
                z = true;
            }
            imageView.setSelected(z);
        } else if (r0.f40416B.f19235R == r0.f40416B.f19236S.f40343F) {
            r0.f40416B.f19242Y = new AnonymousClass3M2(r0);
        } else if (r0.f40416B.f19235R == r0.f40416B.f19236S.f40342E) {
            new AnonymousClass0Sb(r0.f40416B.f19223F).G(AnonymousClass1Uw.C(r0.f40416B), new AnonymousClass3M4(r0)).E(true).F(true).C().show();
            AnonymousClass10A.C(r0.f40416B.f19228K.getActivity(), r0.f40416B.f19241X, r0.f40416B.f19240W.NO(), AnonymousClass109.ACTION_OPEN_IN_QUICKVIEW, r0.f40420F.B());
        }
        if (r0.f40416B.f19247d == AnonymousClass3MY.PEEK || r0.f40416B.f19247d == AnonymousClass3MY.PEEK_ANIMATION || r0.f40416B.f19247d == AnonymousClass3MY.HOLD) {
            AnonymousClass1Uw.D(r0.f40416B);
        }
        if (AnonymousClass1Uw.B(r0.f40416B.f19240W, r0.f40416B.f19222E).wY()) {
            r0.f40416B.f19227J.U("end_peek", true, false);
        }
        return true;
    }
}

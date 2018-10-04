package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Uw */
public final class AnonymousClass1Uw extends AnonymousClass0VA implements AnonymousClass0IS, AnonymousClass0uD, AnonymousClass0gg, OnTouchListener, AnonymousClass1TP, AnonymousClass0jb, OnKeyListener, AnonymousClass0F6 {
    /* renamed from: l */
    private static final AnonymousClass0e5 f19218l = AnonymousClass0e5.m6189C(60.0d, 5.0d);
    /* renamed from: B */
    public final AnonymousClass0iE f19219B;
    /* renamed from: C */
    public final AnonymousClass0db f19220C;
    /* renamed from: D */
    public final AnonymousClass1Wv f19221D;
    /* renamed from: E */
    public int f19222E;
    /* renamed from: F */
    public final Context f19223F;
    /* renamed from: G */
    public View f19224G;
    /* renamed from: H */
    public int[] f19225H = new int[2];
    /* renamed from: I */
    public AnonymousClass1MY f19226I;
    /* renamed from: J */
    public final AnonymousClass0uk f19227J;
    /* renamed from: K */
    public AnonymousClass0IL f19228K;
    /* renamed from: L */
    public AnonymousClass0IU f19229L;
    /* renamed from: M */
    public Handler f19230M;
    /* renamed from: N */
    public final AnonymousClass0cN f19231N;
    /* renamed from: O */
    public boolean f19232O;
    /* renamed from: P */
    public final int f19233P;
    /* renamed from: Q */
    public final int f19234Q;
    /* renamed from: R */
    public View f19235R;
    /* renamed from: S */
    public AnonymousClass3LU f19236S;
    /* renamed from: T */
    public boolean f19237T;
    /* renamed from: U */
    public final AnonymousClass0w0 f19238U;
    /* renamed from: V */
    public final boolean f19239V;
    /* renamed from: W */
    public AnonymousClass0P7 f19240W;
    /* renamed from: X */
    public AnonymousClass0PZ f19241X;
    /* renamed from: Y */
    public Runnable f19242Y;
    /* renamed from: Z */
    public View f19243Z;
    /* renamed from: a */
    public int f19244a;
    /* renamed from: b */
    public ViewGroup f19245b;
    /* renamed from: c */
    public final AnonymousClass0hq f19246c;
    /* renamed from: d */
    public AnonymousClass3MY f19247d;
    /* renamed from: e */
    public TouchInterceptorFrameLayout f19248e;
    /* renamed from: f */
    public final AnonymousClass0Cm f19249f;
    /* renamed from: g */
    public View f19250g;
    /* renamed from: h */
    private final AnonymousClass14I f19251h;
    /* renamed from: i */
    private final Map f19252i;
    /* renamed from: j */
    private String f19253j;
    /* renamed from: k */
    private final AnonymousClass3Mc f19254k;

    public final void au(AnonymousClass0P7 anonymousClass0P7, int i) {
    }

    public AnonymousClass1Uw(Context context, AnonymousClass0IL anonymousClass0IL, AnonymousClass0IU anonymousClass0IU, boolean z, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0hq anonymousClass0hq, AnonymousClass0iE anonymousClass0iE, AnonymousClass0db anonymousClass0db) {
        Context context2 = context;
        this.f19221D = new AnonymousClass1Wv(context2);
        this.f19228K = anonymousClass0IL;
        this.f19229L = anonymousClass0IU;
        this.f19219B = anonymousClass0iE;
        this.f19239V = z;
        this.f19230M = new Handler();
        this.f19223F = context2;
        this.f19241X = anonymousClass0PZ;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f19249f = anonymousClass0Cm2;
        this.f19220C = anonymousClass0db;
        Resources resources = context2.getResources();
        this.f19233P = resources.getDimensionPixelSize(C0164R.dimen.peek_view_hold_indicator_move_distance);
        this.f19234Q = resources.getDimensionPixelSize(C0164R.dimen.peek_view_hold_indicator_offset);
        AnonymousClass0hq anonymousClass0hq2 = anonymousClass0hq;
        AnonymousClass0uk anonymousClass0uk = new AnonymousClass0uk(context2, true, true, true, false, false, false, anonymousClass0Cm2, this.f19241X, anonymousClass0hq != null ? anonymousClass0hq2.kR() : null);
        this.f19227J = anonymousClass0uk;
        anonymousClass0uk.m8259A(this);
        this.f19246c = anonymousClass0hq2;
        this.f19238U = new AnonymousClass0w0((AnonymousClass0PZ) this, this.f19246c, this.f19249f);
        this.f19247d = AnonymousClass3MY.f40464F;
        this.f19252i = new HashMap();
        this.f19231N = AnonymousClass0e6.m6190B().m6193C().m5770O(f19218l);
        this.f19251h = new AnonymousClass3M0(this);
        AnonymousClass3Mc anonymousClass3Mc = new AnonymousClass3Mc(this.f19223F, new AnonymousClass3M5(this, context, anonymousClass0Cm2, anonymousClass0hq2, z));
        this.f19254k = anonymousClass3Mc;
        anonymousClass3Mc.f40484K = false;
        anonymousClass3Mc.f40480G = 0;
        anonymousClass3Mc.f40479F.m5770O(AnonymousClass0e5.m6188B(10.0d, 20.0d));
        anonymousClass3Mc.f40486M.m5770O(AnonymousClass0e5.m6188B(8.0d, 12.0d));
    }

    /* renamed from: A */
    public final boolean m11643A(View view, MotionEvent motionEvent, AnonymousClass0P9 anonymousClass0P9, int i) {
        if (motionEvent.getActionMasked() == 0) {
            AnonymousClass0P7 A = AnonymousClass107.f13182C.m8703A(anonymousClass0P9.NO());
            this.f19240W = A;
            int i2 = (A == null || !A.kA()) ? -1 : 0;
            this.f19222E = i2;
            this.f19244a = i;
            this.f19250g = view;
        }
        if (this.f19237T && motionEvent.getActionMasked() == 3) {
            this.f19237T = false;
        } else {
            this.f19254k.onTouch(view, motionEvent);
        }
        return false;
    }

    /* renamed from: B */
    public static AnonymousClass0P7 m11635B(AnonymousClass0P7 anonymousClass0P7, int i) {
        if (anonymousClass0P7.kA()) {
            return anonymousClass0P7.m3763S(i);
        }
        return anonymousClass0P7.lA() ? anonymousClass0P7.m3766V() : anonymousClass0P7;
    }

    /* renamed from: C */
    public static CharSequence[] m11636C(AnonymousClass1Uw anonymousClass1Uw) {
        List arrayList = new ArrayList();
        if (!AnonymousClass0Co.m1046F(anonymousClass1Uw.f19249f, anonymousClass1Uw.f19240W)) {
            arrayList.add(anonymousClass1Uw.f19223F.getString(C0164R.string.report_options));
        }
        if (AnonymousClass0xX.f12594U.contains(anonymousClass1Uw.f19241X.getModuleName())) {
            arrayList.add(anonymousClass1Uw.f19223F.getString(C0164R.string.see_fewer_posts_like_this));
        }
        if (AnonymousClass3Qr.B(anonymousClass1Uw.f19228K)) {
            arrayList.add(anonymousClass1Uw.f19223F.getString(C0164R.string.dont_show_for_this_hashtag));
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
    }

    public final AnonymousClass0db CIA(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0PZ anonymousClass0PZ = this.f19241X;
        if (anonymousClass0PZ instanceof AnonymousClass0uD) {
            return ((AnonymousClass0uD) anonymousClass0PZ).CIA(anonymousClass0P7);
        }
        return AnonymousClass0db.m6067C();
    }

    /* renamed from: D */
    public static void m11637D(AnonymousClass1Uw anonymousClass1Uw) {
        anonymousClass1Uw.f19238U.m8408J(anonymousClass1Uw.f19240W, anonymousClass1Uw.f19222E);
        anonymousClass1Uw.f19238U.m8403E(anonymousClass1Uw.f19240W, anonymousClass1Uw.f19222E);
        anonymousClass1Uw.f19254k.A();
        anonymousClass1Uw.f19236S.f40339B.setVisibility(4);
        anonymousClass1Uw.f19247d = AnonymousClass3MY.f40466H;
        AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
        anonymousClass0Iz.m2408K(anonymousClass1Uw, anonymousClass1Uw.f19229L.mo1456H(), "back");
        anonymousClass0Iz.m2405H(anonymousClass1Uw.f19241X);
    }

    /* renamed from: E */
    public static void m11638E(AnonymousClass1Uw anonymousClass1Uw) {
        AnonymousClass0nL.m7653B().m7656C(anonymousClass1Uw.f19240W, true);
        AnonymousClass0IL anonymousClass0IL = anonymousClass1Uw.f19228K;
        if (anonymousClass0IL instanceof AnonymousClass1MZ) {
            ((AnonymousClass1MZ) anonymousClass0IL).Dr();
            return;
        }
        ListAdapter listAdapter = ((AnonymousClass0Ie) anonymousClass0IL).getListAdapter();
        if (listAdapter instanceof AnonymousClass0iE) {
            ((AnonymousClass0iE) listAdapter).notifyDataSetChanged();
        }
    }

    /* renamed from: F */
    public static boolean m11639F(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= ((float) i) || f >= ((float) (i + view.getWidth())) || f2 <= ((float) i2) || f2 >= ((float) (i2 + view.getHeight()))) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static void m11640G(AnonymousClass1Uw anonymousClass1Uw) {
        AnonymousClass1Uw.m11638E(anonymousClass1Uw);
        Toast.makeText(anonymousClass1Uw.f19223F, C0164R.string.report_thanks_toast_msg, 1).show();
    }

    public final Map GIA() {
        AnonymousClass0IL anonymousClass0IL = this.f19228K;
        return anonymousClass0IL instanceof AnonymousClass0gg ? ((AnonymousClass0gg) anonymousClass0IL).GIA() : null;
    }

    /* renamed from: H */
    public static boolean m11641H(AnonymousClass1Uw anonymousClass1Uw, float f, float f2, View view, String str) {
        if (view.getVisibility() != 0 || !AnonymousClass1Uw.m11639F(f, f2, view)) {
            return false;
        }
        anonymousClass1Uw.f19236S.f40347J.setAlpha(0.0f);
        anonymousClass1Uw.f19236S.f40347J.bringToFront();
        ((TextView) anonymousClass1Uw.f19236S.f40347J).setText(str);
        anonymousClass1Uw.f19224G = view;
        view.getLocationInWindow(anonymousClass1Uw.f19225H);
        return true;
    }

    /* renamed from: I */
    private ViewGroup m11642I() {
        if (this.f19245b == null) {
            this.f19245b = AnonymousClass1Vz.m11708B((Activity) this.f19223F);
        }
        return this.f19245b;
    }

    public final AnonymousClass0m3 RO(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0m3 anonymousClass0m3 = (AnonymousClass0m3) this.f19252i.get(anonymousClass0P7.NO());
        if (anonymousClass0m3 != null) {
            return anonymousClass0m3;
        }
        anonymousClass0m3 = new AnonymousClass0m3(anonymousClass0P7);
        this.f19252i.put(anonymousClass0P7.NO(), anonymousClass0m3);
        return anonymousClass0m3;
    }

    public final void St() {
        this.f19247d = AnonymousClass3MY.f40464F;
        AnonymousClass0MJ anonymousClass0MJ = this.f19240W;
        if (anonymousClass0MJ != null) {
            this.f19238U.m8408J(anonymousClass0MJ, this.f19222E);
            this.f19238U.m8403E(this.f19240W, this.f19222E);
            if (AnonymousClass1Uw.m11635B(this.f19240W, this.f19222E).wY()) {
                this.f19227J.m8279U("fragment_paused", false, false);
            }
        }
        this.f19243Z.setVisibility(4);
        AnonymousClass3Mc anonymousClass3Mc = this.f19254k;
        anonymousClass3Mc.f40478E.removeCallbacksAndMessages(null);
        anonymousClass3Mc.f40486M.m5769N(AnonymousClass3Mc.f40473V);
        anonymousClass3Mc.f40479F.m5769N(AnonymousClass3Mc.f40473V);
        anonymousClass3Mc.f40486M.m5768M(AnonymousClass3Mc.f40473V, true);
        anonymousClass3Mc.f40479F.m5768M(AnonymousClass3Mc.f40473V, true);
        anonymousClass3Mc.f40475B = false;
        this.f19231N.m5765J(this.f19251h).m5766K();
        this.f19236S.f40339B.setVisibility(4);
        this.f19250g = null;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.f19248e;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.m6300A(null);
            this.f19248e = null;
        }
        this.f19238U.St();
    }

    public final void ei() {
        this.f19238U.ei();
    }

    public final String getModuleName() {
        if (this.f19253j == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("peek_media_");
            stringBuilder.append(this.f19241X.getModuleName());
            this.f19253j = stringBuilder.toString();
        }
        return this.f19253j;
    }

    public final void gi() {
        ViewGroup I = m11642I();
        if (I != null) {
            I.removeView(this.f19243Z);
        }
        this.f19243Z = null;
        this.f19236S = null;
        this.f19240W = null;
        this.f19238U.gi();
    }

    public final void gx() {
        this.f19231N.m5756A(this.f19251h);
        this.f19238U.gx();
        AnonymousClass106 anonymousClass106 = AnonymousClass106.f13177F;
        if (anonymousClass106.f13179C && anonymousClass106.f13178B) {
            AnonymousClass0P7 A = AnonymousClass107.f13182C.m8703A(anonymousClass106.f13181E);
            this.f19240W = A;
            if (A != null) {
                AnonymousClass1Uw.m11640G(this);
                AnonymousClass10A.m8706C(this.f19228K.getActivity(), this.f19241X, this.f19240W.NO(), AnonymousClass109.ACTION_DONE_REPORT_IN_WEBVIEW, this.f19249f.m1037B());
            }
            anonymousClass106.m8702A();
        }
    }

    public final void iBA(AnonymousClass0P7 anonymousClass0P7, int i, int i2, int i3) {
        this.f19219B.RO(anonymousClass0P7).f9710s = i;
    }

    public final boolean isOrganicEligible() {
        return this.f19241X.isOrganicEligible();
    }

    public final boolean isSponsoredEligible() {
        return this.f19241X.isSponsoredEligible();
    }

    public final void oh() {
        this.f19238U.oh();
    }

    public final boolean onBackPressed() {
        return (this.f19247d == AnonymousClass3MY.f40464F || this.f19247d == AnonymousClass3MY.f40461C) ? false : true;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.f19227J.onKey(view, i, keyEvent);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.f19248e;
            if (touchInterceptorFrameLayout != null) {
                touchInterceptorFrameLayout.m6300A(null);
                this.f19248e = null;
            }
        }
        this.f19254k.onTouch(this.f19250g, motionEvent);
        if (this.f19247d != AnonymousClass3MY.f40464F) {
            return true;
        }
        return false;
    }

    public final void wh(View view) {
        AnonymousClass1Wv anonymousClass1Wv = this.f19221D;
        View inflate = LayoutInflater.from(this.f19223F).inflate(C0164R.layout.peek_media, null, false);
        AnonymousClass3LU anonymousClass3LU = new AnonymousClass3LU();
        anonymousClass3LU.f40348K = inflate.findViewById(C0164R.id.media_item);
        anonymousClass3LU.f40339B = inflate.findViewById(C0164R.id.peek_view_heart);
        anonymousClass3LU.f40347J = inflate.findViewById(C0164R.id.hold_indicator);
        anonymousClass3LU.f40350M = (CircularImageView) inflate.findViewById(C0164R.id.row_feed_photo_profile_imageview);
        anonymousClass3LU.f40351N = (TextView) inflate.findViewById(C0164R.id.row_feed_photo_profile_name);
        anonymousClass3LU.f40355R = (TextView) inflate.findViewById(C0164R.id.row_feed_photo_location);
        anonymousClass3LU.f40351N.getPaint().setFakeBoldText(true);
        anonymousClass3LU.f40346I = (ViewStub) inflate.findViewById(C0164R.id.extra_location_label_stub);
        AnonymousClass0q0 anonymousClass0q0 = new AnonymousClass0q0((MediaFrameLayout) inflate.findViewById(C0164R.id.media_group), (IgProgressImageView) inflate.findViewById(C0164R.id.row_feed_photo_imageview), (LikeActionView) inflate.findViewById(C0164R.id.like_heart), (MediaActionsView) inflate.findViewById(C0164R.id.row_feed_media_actions), null, null, new AnonymousClass0vI((ViewStub) inflate.findViewById(C0164R.id.media_indicator_view_stub), null), AnonymousClass0vS.m8329C((ViewStub) inflate.findViewById(C0164R.id.media_subtitle_view_stub)), AnonymousClass0z8.m8670C((ViewStub) inflate.findViewById(C0164R.id.media_gating_view_stub)), null, null, null, null, null, null);
        anonymousClass3LU.f40349L = anonymousClass0q0;
        anonymousClass0q0.f10834I.setTag(anonymousClass3LU);
        anonymousClass3LU.f40349L.f10829D.setImageRenderer(anonymousClass1Wv.f19629D);
        anonymousClass3LU.f40349L.f10829D.f9969L.setText(C0164R.string.unclickable_error_message);
        anonymousClass3LU.f40349L.f10829D.setProgressiveImageConfig(new AnonymousClass0ag());
        anonymousClass3LU.f40341D = (ImageView) inflate.findViewById(C0164R.id.row_feed_button_like);
        anonymousClass3LU.f40340C = (ImageView) inflate.findViewById(C0164R.id.row_feed_button_comment);
        anonymousClass3LU.f40343F = (ImageView) inflate.findViewById(C0164R.id.row_feed_button_profile);
        anonymousClass3LU.f40344G = (ImageView) inflate.findViewById(C0164R.id.row_feed_button_share);
        anonymousClass3LU.f40342E = (ImageView) inflate.findViewById(C0164R.id.row_feed_button_options);
        anonymousClass3LU.f40354Q = (Space) inflate.findViewById(C0164R.id.extra_space_before_button_share);
        anonymousClass3LU.f40352O = (Space) inflate.findViewById(C0164R.id.extra_space_after_button_like);
        anonymousClass3LU.f40353P = (Space) inflate.findViewById(C0164R.id.extra_space_before_button_options);
        inflate.setTag(anonymousClass3LU);
        this.f19243Z = inflate;
        this.f19236S = (AnonymousClass3LU) inflate.getTag();
        this.f19243Z.setVisibility(4);
        ViewGroup I = m11642I();
        if (I != null) {
            I.addView(r2.f19243Z, new LayoutParams(-1, -1));
        }
        r2.f19238U.wh(view);
    }
}

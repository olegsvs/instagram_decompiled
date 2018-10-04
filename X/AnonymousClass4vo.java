package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.4vo */
public final class AnonymousClass4vo implements AnonymousClass2I2, AnonymousClass0QV {
    /* renamed from: B */
    private IGTVViewerFragment f58556B;
    /* renamed from: C */
    private RectF f58557C;
    /* renamed from: D */
    private boolean f58558D;
    /* renamed from: E */
    private float f58559E;
    /* renamed from: F */
    private final AnonymousClass2bz f58560F;
    /* renamed from: G */
    private final View f58561G = this.f58565K.findViewById(C0164R.id.inner_container);
    /* renamed from: H */
    private final int f58562H;
    /* renamed from: I */
    private final int f58563I;
    /* renamed from: J */
    private final int f58564J;
    /* renamed from: K */
    private final View f58565K;

    public final boolean Hj(AnonymousClass2bz anonymousClass2bz, float f, float f2) {
        return false;
    }

    public final boolean eAA(AnonymousClass2bz anonymousClass2bz, float f, float f2) {
        return false;
    }

    public final void jEA(AnonymousClass2bz anonymousClass2bz) {
    }

    public AnonymousClass4vo(View view, IGTVViewerFragment iGTVViewerFragment) {
        this.f58565K = view;
        this.f58556B = iGTVViewerFragment;
        this.f58560F = new AnonymousClass2bz(view.getContext(), this);
        Resources resources = view.getResources();
        this.f58562H = resources.getDimensionPixelSize(C0164R.dimen.igtv_minimum_drag_to_dismiss_start_pixels);
        this.f58563I = resources.getDimensionPixelSize(C0164R.dimen.igtv_minimum_drag_to_dismiss_distance);
        this.f58564J = resources.getDimensionPixelSize(C0164R.dimen.igtv_minimum_drag_to_dismiss_velocity);
        this.f58557C = new RectF();
    }

    /* renamed from: A */
    public final void m25412A(float f, float f2) {
        this.f58558D = true;
        AnonymousClass0Nm.M(this.f58561G, this.f58557C);
        this.f58559E = f;
        this.f58561G.setLayerType(2, null);
        AnonymousClass4vi.m25397B(this.f58565K.getContext()).m25401C(true);
        this.f58560F.A(0.0f, m25411B(), 0.0f, f2, AnonymousClass0e5.f7577D, Float.MIN_VALUE);
    }

    /* renamed from: B */
    private float m25411B() {
        return ((float) this.f58561G.getHeight()) / 0.5f;
    }

    public final void ILA(float f, float f2) {
        this.f58560F.ILA(f, f2);
    }

    public final void Tj(AnonymousClass2bz anonymousClass2bz, float f, float f2, float f3, boolean z) {
        AnonymousClass4vo anonymousClass4vo = this;
        float f4 = f2;
        boolean z2 = z;
        if (z || f2 != m25411B()) {
            float f5 = f2 * 0.5f;
            AnonymousClass0IL anonymousClass0IL = anonymousClass4vo.f58556B;
            RectF rectF = anonymousClass0IL.getArguments().getBoolean("igtv_disable_targeted_viewer_dismissal", false) ? null : anonymousClass0IL.f66098M;
            float D;
            float D2;
            View view;
            if (!anonymousClass4vo.f58558D || rectF == null) {
                D = AnonymousClass0nB.D((float) AnonymousClass0dh.C((double) f5, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) anonymousClass4vo.f58561G.getHeight(), 0.0f, 0.0f), 0.0f, 1.0f, 1.0f, 0.0f);
                anonymousClass4vo.f58561G.setTranslationX(0.0f);
                anonymousClass4vo.f58561G.setTranslationY(f5);
                D2 = AnonymousClass0nB.D(D, 0.0f, 1.0f, 0.75f, 1.0f);
                view = anonymousClass4vo.f58561G;
                view.setPivotX(((float) view.getWidth()) / 2.0f);
                view = anonymousClass4vo.f58561G;
                view.setPivotY(((float) view.getHeight()) / 2.0f);
                anonymousClass4vo.f58561G.setScaleX(D2);
                anonymousClass4vo.f58561G.setScaleY(D2);
            } else {
                f4 = AnonymousClass0nB.E(f4, anonymousClass4vo.f58559E, m25411B(), 0.0f, 1.0f, true);
                float width = anonymousClass4vo.f58557C.width() / ((float) anonymousClass4vo.f58561G.getWidth());
                float f6 = anonymousClass4vo.f58557C.top;
                width = AnonymousClass0nB.D(f4, 0.0f, 1.0f, width, 0.0f);
                float E = AnonymousClass0nB.E(f4, 0.0f, 1.0f, 0.0f, (rectF.left + (rectF.width() / 2.0f)) - (((float) anonymousClass4vo.f58561G.getWidth()) / 2.0f), true);
                D2 = AnonymousClass0nB.E(f4, 0.0f, 1.0f, f6, (rectF.top + (rectF.height() / 2.0f)) - (((float) anonymousClass4vo.f58561G.getHeight()) / 2.0f), true);
                D = AnonymousClass0nB.D(f4, 0.5f, 1.0f, 1.0f, 0.0f);
                anonymousClass4vo.f58561G.setScaleX(width);
                anonymousClass4vo.f58561G.setScaleY(width);
                view = anonymousClass4vo.f58561G;
                view.setPivotX(((float) view.getWidth()) / 2.0f);
                view = anonymousClass4vo.f58561G;
                view.setPivotY(((float) view.getHeight()) / 2.0f);
                anonymousClass4vo.f58561G.setTranslationX(E);
                anonymousClass4vo.f58561G.setTranslationY(D2);
                anonymousClass4vo.f58561G.setAlpha(D);
            }
            int round = Math.round(AnonymousClass0nB.E(f5, 0.0f, (float) anonymousClass4vo.f58561G.getHeight(), 255.0f, 0.0f, true));
            AnonymousClass4vi.m25397B(anonymousClass4vo.f58565K.getContext()).m25403E(z2);
            AnonymousClass4vi.m25397B(anonymousClass4vo.f58565K.getContext()).m25402D(round);
            return;
        }
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass4vo.f58556B;
        anonymousClass0IL2.f66088C = AnonymousClass4wH.COMPLETED;
        if (anonymousClass0IL2.f66092G == null) {
            anonymousClass0IL2.f66092G = "swipe_down";
        }
        Activity activity = anonymousClass0IL2.getActivity();
        if (AnonymousClass0cJ.E(anonymousClass0IL2.getFragmentManager()) && activity != null) {
            anonymousClass0IL2.f66099N = true;
            activity.onBackPressed();
        }
    }

    public final boolean Uo(MotionEvent motionEvent) {
        return this.f58560F.Uo(motionEvent);
    }

    public final void bj(AnonymousClass2bz anonymousClass2bz, float f, float f2, float f3, float f4, float f5) {
        f = f5;
        if (f5 <= ((float) this.f58564J) || f2 <= ((float) this.f58563I)) {
            anonymousClass2bz.A(0.0f, 0.0f, f4, f, AnonymousClass0e5.f7577D, Float.MIN_VALUE);
            return;
        }
        m25412A(f2, f5);
    }

    public final void destroy() {
        this.f58560F.destroy();
    }

    public final boolean lj(AnonymousClass2bz anonymousClass2bz, float f, float f2, float f3, boolean z) {
        this.f58558D = false;
        this.f58559E = 0.0f;
        this.f58557C.set(0.0f, 0.0f, 0.0f, 0.0f);
        IGTVViewerFragment iGTVViewerFragment = this.f58556B;
        AnonymousClass5Yb anonymousClass5Yb = iGTVViewerFragment.mTVGuideController;
        Object obj = ((anonymousClass5Yb == null || !anonymousClass5Yb.f66228N.C()) && !iGTVViewerFragment.mInAppNuxContoller.m25436B()) ? 1 : null;
        if (obj == null || f3 < ((float) Math.abs(this.f58562H)) || f2 >= 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean zDA(MotionEvent motionEvent) {
        return this.f58560F.zDA(motionEvent);
    }
}

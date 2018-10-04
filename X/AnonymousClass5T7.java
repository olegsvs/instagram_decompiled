package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.blur.BlurUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: X.5T7 */
public final class AnonymousClass5T7 implements AnonymousClass4MO, AnonymousClass0QP, AnonymousClass0Uy {
    /* renamed from: B */
    public final Context f64279B;
    /* renamed from: C */
    public final AnonymousClass0cN f64280C;
    /* renamed from: D */
    public final int f64281D;
    /* renamed from: E */
    public final Drawable f64282E;
    /* renamed from: F */
    public final Runnable f64283F;
    /* renamed from: G */
    public final AnonymousClass4Ml f64284G;
    /* renamed from: H */
    public final AnonymousClass0dF f64285H;
    /* renamed from: I */
    public final AnonymousClass0rr f64286I;
    /* renamed from: J */
    public final AnonymousClass24z f64287J;
    /* renamed from: K */
    public final AnonymousClass4Tc f64288K;
    /* renamed from: L */
    public final AnonymousClass2Uf f64289L;
    /* renamed from: M */
    public final int f64290M;
    /* renamed from: N */
    public boolean f64291N;
    /* renamed from: O */
    public final ImageView f64292O;
    /* renamed from: P */
    public final View f64293P;
    /* renamed from: Q */
    public final int f64294Q;
    /* renamed from: R */
    public final boolean f64295R;
    /* renamed from: S */
    public Medium f64296S;
    /* renamed from: T */
    public int f64297T = -1;
    /* renamed from: U */
    public int f64298U;
    /* renamed from: V */
    public final RecyclerView f64299V;
    /* renamed from: W */
    public final AnonymousClass0Cm f64300W;
    /* renamed from: X */
    public boolean f64301X;
    /* renamed from: Y */
    private final ViewGroup f64302Y;
    /* renamed from: Z */
    private final View f64303Z;
    /* renamed from: a */
    private boolean f64304a;
    /* renamed from: b */
    private final int f64305b;
    /* renamed from: c */
    private final TextView f64306c;
    public AnonymousClass25B mGalleryButtonThumbnailLoaderListener;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean Jn(boolean z, boolean z2, float f, float f2, float f3, float f4, float f5) {
        return false;
    }

    public final boolean YX() {
        return true;
    }

    public final void Ym(boolean z, boolean z2, float f, float f2) {
    }

    public final boolean ZX() {
        return true;
    }

    public final boolean cX() {
        return false;
    }

    public final void eGA() {
    }

    public final void gi() {
    }

    public final void gx() {
    }

    public final void ln() {
    }

    public final void mLA() {
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void qy(boolean z, boolean z2, float f, float f2, float f3, float f4) {
    }

    public final void xDA() {
    }

    public final boolean zVA(float f, float f2, float f3) {
        return true;
    }

    public AnonymousClass5T7(AnonymousClass0Uw anonymousClass0Uw, Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, ViewGroup viewGroup, AnonymousClass4Tc anonymousClass4Tc, ImageView imageView, AnonymousClass0dF anonymousClass0dF) {
        Executor B;
        anonymousClass0Uw.A(this);
        Context context2 = context;
        this.f64279B = context2;
        this.f64300W = anonymousClass0Cm;
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f64280C = C.A(this);
        this.f64292O = imageView;
        this.f64283F = new AnonymousClass4Mf(this);
        Resources resources = context2.getResources();
        ViewGroup viewGroup2 = viewGroup;
        this.f64302Y = viewGroup2;
        this.f64288K = anonymousClass4Tc;
        this.f64302Y.setOnTouchListener(new AnonymousClass4Mg(this));
        this.f64305b = resources.getDimensionPixelSize(C0164R.dimen.gallery_item_height);
        this.f64290M = resources.getDimensionPixelSize(C0164R.dimen.quick_capture_gallery_item_padding);
        this.f64281D = resources.getDimensionPixelSize(C0164R.dimen.quick_capture_gallery_edge_padding);
        this.f64285H = anonymousClass0dF;
        if (((Boolean) AnonymousClass0CC.Wf.G()).booleanValue()) {
            B = AnonymousClass0Fx.B();
        } else {
            B = AnonymousClass25A.f25726B;
        }
        int i = r0.f64305b;
        r0.f64289L = new AnonymousClass2Uf(context2, i, i, B, false, false);
        r0.f64284G = new AnonymousClass4Ml(r0.f64289L, r0);
        r0.f64286I = new AnonymousClass0rr(context2, 0, false);
        int round = Math.round(((float) System.currentTimeMillis()) / 1000.0f);
        int B2 = AnonymousClass4MP.B();
        if (B2 != Integer.MAX_VALUE) {
            B2 *= 86400;
        }
        Context context3 = context2;
        AnonymousClass0Fz anonymousClass0Fz2 = anonymousClass0Fz;
        r0.f64287J = new AnonymousClass24z(context3, anonymousClass0Fz2, AnonymousClass24y.PHOTO_AND_VIDEO, Integer.MAX_VALUE, round - B2, false, ((Boolean) AnonymousClass0CC.gM.G()).booleanValue(), new AnonymousClass4Mh(r0), -1, -1, null);
        r0.f64306c = (TextView) viewGroup2.findViewById(C0164R.id.gallery_title);
        r0.f64303Z = viewGroup2.findViewById(C0164R.id.gallery_empty);
        r0.f64293P = viewGroup2.findViewById(C0164R.id.gallery_loading_spinner);
        r0.f64299V = (RecyclerView) viewGroup2.findViewById(C0164R.id.gallery_recycler_view);
        r0.f64294Q = r0.f64279B.getResources().getDimensionPixelSize(AnonymousClass0G5.F(r0.f64279B, C0164R.attr.quickCaptureControllerGalleryButtonSize));
        r0.f64295R = AnonymousClass0G5.B(r0.f64279B, C0164R.attr.quickCaptureControllerGalleryButtonCircular, false);
        r0.f64282E = AnonymousClass0Ca.E(r0.f64279B, AnonymousClass0G5.F(context2, C0164R.attr.quickCaptureControllerGalleryButton));
        r0.f64299V.setAdapter(r0.f64284G);
        r0.f64299V.setLayoutManager(r0.f64286I);
        r0.f64299V.A(new AnonymousClass4Mi(r0));
        int B3 = AnonymousClass4MP.B();
        if (B3 == 1) {
            r0.f64306c.setText(C0164R.string.gallery_title_recent);
        } else if (B3 == 7) {
            r0.f64306c.setText(C0164R.string.gallery_title_recent_week);
        } else {
            r0.f64306c.setText(C0164R.string.gallery_title_no_limit);
        }
    }

    /* renamed from: B */
    public static void m26813B(AnonymousClass5T7 anonymousClass5T7, Medium medium, Bitmap bitmap) {
        if (medium.isValid()) {
            Bitmap blur = BlurUtil.blur(bitmap, 0.25f, 10);
            anonymousClass5T7.f64292O.setImageBitmap(blur);
            anonymousClass5T7.f64292O.setImageMatrix(AnonymousClass0rm.J(blur.getWidth(), blur.getHeight(), anonymousClass5T7.f64292O.getWidth(), anonymousClass5T7.f64292O.getHeight(), medium.zQ(), false));
            anonymousClass5T7.f64292O.setVisibility(0);
            anonymousClass5T7.f64280C.L(1.0d);
            if (medium.B()) {
                anonymousClass5T7.f64285H.I(anonymousClass5T7, medium);
            } else {
                anonymousClass5T7.f64285H.K(anonymousClass5T7, medium);
            }
        }
    }

    /* renamed from: C */
    public static void m26814C(AnonymousClass5T7 anonymousClass5T7) {
        if (anonymousClass5T7.f64291N) {
            anonymousClass5T7.f64293P.setVisibility(0);
            anonymousClass5T7.f64306c.setVisibility(4);
            anonymousClass5T7.f64299V.setVisibility(4);
            anonymousClass5T7.f64303Z.setVisibility(4);
        } else if (anonymousClass5T7.f64284G.B() == 0) {
            anonymousClass5T7.f64293P.setVisibility(8);
            anonymousClass5T7.f64306c.setVisibility(4);
            anonymousClass5T7.f64299V.setVisibility(4);
            anonymousClass5T7.f64303Z.setVisibility(0);
        } else {
            anonymousClass5T7.f64293P.setVisibility(8);
            anonymousClass5T7.f64306c.setVisibility(0);
            anonymousClass5T7.f64299V.setVisibility(0);
            anonymousClass5T7.f64303Z.setVisibility(4);
        }
    }

    /* renamed from: D */
    private void m26815D() {
        if (AnonymousClass4MP.D()) {
            if (!this.f64304a) {
                this.f64304a = true;
                this.f64288K.hSA(true);
                this.f64288K.Qc().KNA(new AnonymousClass5T6(this)).LPA(new AnonymousClass5T5(this)).JD();
                this.f64287J.A();
            }
        }
    }

    public final void Dn(float f, float f2) {
        if (f2 > 0.0f) {
            m26816E();
            return;
        }
        this.f64301X = false;
        this.f64299V.removeCallbacks(this.f64283F);
        AnonymousClass24z.B(this.f64287J);
        int aA = this.f64286I.aA();
        if (aA >= 0 && this.f64284G.B() > aA) {
            this.f64297T = ((Medium) this.f64284G.f53248C.get(aA)).f30922L;
            this.f64298U = this.f64299V.getChildAt(0).getLeft();
        }
        AnonymousClass0nJ anonymousClass0nJ = this.f64284G;
        Collection arrayList = new ArrayList();
        anonymousClass0nJ.f53248C.clear();
        anonymousClass0nJ.f53248C.addAll(arrayList);
        anonymousClass0nJ.notifyDataSetChanged();
        AnonymousClass5T7.m26814C(this);
    }

    /* renamed from: E */
    private void m26816E() {
        if (!this.f64301X) {
            this.f64301X = true;
            this.f64291N = true;
            AnonymousClass5T7.m26814C(this);
            this.f64293P.setVisibility(0);
            this.f64287J.A();
            this.f64299V.FA(0);
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        this.f64292O.setImageAlpha(Math.round(255.0f * E));
        if (E > 0.0f) {
            this.f64292O.setVisibility(0);
            return;
        }
        this.f64292O.setImageBitmap(null);
        this.f64292O.setVisibility(4);
    }

    public final int GO() {
        return this.f64284G.B();
    }

    public final void St() {
        AnonymousClass24z.B(this.f64287J);
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj;
        if (AnonymousClass4Mk.f53246B[((AnonymousClass3AM) obj2).ordinal()] == 1) {
            this.f64297T = -1;
            this.f64298U = 0;
        }
    }

    public final void fV(boolean z) {
        if (z) {
            this.f64280C.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        } else {
            this.f64280C.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
    }

    public final void ve() {
        yb();
    }

    public final void yb() {
        if (AnonymousClass4MP.D()) {
            m26815D();
            this.f64287J.A();
        }
    }
}

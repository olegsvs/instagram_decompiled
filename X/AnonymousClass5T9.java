package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5T9 */
public final class AnonymousClass5T9 implements AnonymousClass0QP, AnonymousClass15K {
    /* renamed from: Y */
    public static boolean f64309Y;
    /* renamed from: B */
    public final AnonymousClass0eB f64310B;
    /* renamed from: C */
    public final Context f64311C;
    /* renamed from: D */
    public final AnonymousClass0dF f64312D;
    /* renamed from: E */
    public final boolean f64313E;
    /* renamed from: F */
    public final List f64314F = new ArrayList();
    /* renamed from: G */
    public final AnonymousClass0IP f64315G;
    /* renamed from: H */
    public final int f64316H;
    /* renamed from: I */
    public final AnonymousClass5Td f64317I;
    /* renamed from: J */
    public final int f64318J;
    /* renamed from: K */
    public Toast f64319K;
    /* renamed from: L */
    public final AnonymousClass0Cm f64320L;
    /* renamed from: M */
    private final AnonymousClass4UE f64321M;
    /* renamed from: N */
    private final ViewGroup f64322N;
    /* renamed from: O */
    private final boolean f64323O;
    /* renamed from: P */
    private AnonymousClass4NK f64324P = AnonymousClass4NK.NOT_STARTED;
    /* renamed from: Q */
    private final AnonymousClass5TB f64325Q;
    /* renamed from: R */
    private final Rect f64326R = new Rect();
    /* renamed from: S */
    private int f64327S;
    /* renamed from: T */
    private final ImageView f64328T;
    /* renamed from: U */
    private final ViewGroup f64329U;
    /* renamed from: V */
    private final RoundedCornerImageView f64330V;
    /* renamed from: W */
    private final AnonymousClass0cN f64331W;
    /* renamed from: X */
    private final AnonymousClass5TY f64332X;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Ux(AnonymousClass13K anonymousClass13K) {
    }

    public final void Ye(AnonymousClass13K anonymousClass13K) {
    }

    public final void Ze(AnonymousClass13K anonymousClass13K) {
    }

    public AnonymousClass5T9(AnonymousClass4UE anonymousClass4UE, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0eB anonymousClass0eB, AnonymousClass5TB anonymousClass5TB, AnonymousClass5TY anonymousClass5TY, ViewGroup viewGroup, ViewGroup viewGroup2, AnonymousClass0dF anonymousClass0dF, boolean z, boolean z2) {
        this.f64321M = anonymousClass4UE;
        this.f64320L = anonymousClass0Cm;
        this.f64310B = anonymousClass0eB;
        this.f64325Q = anonymousClass5TB;
        this.f64332X = anonymousClass5TY;
        this.f64311C = viewGroup.getContext();
        this.f64322N = viewGroup;
        this.f64312D = anonymousClass0dF;
        this.f64313E = z;
        this.f64323O = z2;
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "MultiCaptureController";
        this.f64315G = new AnonymousClass0Mo(B.A());
        this.f64317I = new AnonymousClass5Td(viewGroup2, this);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0164R.id.multi_capture_thumbnail_button);
        this.f64329U = viewGroup3;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) viewGroup3.findViewById(C0164R.id.multi_capture_thumbnail_button_image);
        this.f64330V = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass26J.CENTER_CROP);
        this.f64328T = (ImageView) viewGroup.findViewById(C0164R.id.multi_capture_thumbnail_animating_view);
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f64331W = C.A(this);
        Resources resources = viewGroup.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.multi_capture_thumbnail_tray_height);
        this.f64316H = dimensionPixelSize;
        this.f64318J = (int) (((float) dimensionPixelSize) * AnonymousClass0Nm.H(resources.getDisplayMetrics()));
        AnonymousClass0Nm.X(this.f64329U, this.f64318J, this.f64316H);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f64329U);
        anonymousClass15z.f14382B = this;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass4ND(this);
        anonymousClass15z.A();
    }

    /* renamed from: A */
    public final void m26822A() {
        switch (this.f64324P.ordinal()) {
            case 1:
                AnonymousClass14H.E(true, new View[]{this.f64329U});
                return;
            case 2:
                AnonymousClass14H.E(true, new View[]{this.f64317I.f64544D});
                return;
            default:
                return;
        }
    }

    /* renamed from: B */
    public static void m26817B(AnonymousClass5T9 anonymousClass5T9) {
        if (!(anonymousClass5T9.f64314F.isEmpty() || f64309Y)) {
            if (AnonymousClass0HV.D(anonymousClass5T9.f64320L).f2646B.getInt("camera_multi_capture_entry_point_tooltip_display_count", 0) < 2) {
                CharSequence string;
                if (((AnonymousClass3FJ) anonymousClass5T9.f64314F.get(0)).f39427C == AnonymousClass3FK.PHOTO) {
                    string = anonymousClass5T9.f64311C.getString(C0164R.string.keep_photo_and_take_more);
                } else {
                    string = anonymousClass5T9.f64311C.getString(C0164R.string.keep_video_and_take_more);
                }
                AnonymousClass173 B = new AnonymousClass173(anonymousClass5T9.f64311C, anonymousClass5T9.f64322N, new AnonymousClass174(string)).B(0, ((-anonymousClass5T9.f64329U.getHeight()) / 2) - anonymousClass5T9.f64311C.getResources().getDimensionPixelSize(C0164R.dimen.multi_capture_thumbnail_button_tooltip_margin_bottom), true, anonymousClass5T9.f64329U);
                B.f14642H = AnonymousClass177.ABOVE_ANCHOR;
                B.f14636B = false;
                B.f14640F = new AnonymousClass4NF(anonymousClass5T9);
                B.A().C();
            }
        }
    }

    /* renamed from: B */
    public final boolean m26823B() {
        return this.f64324P == AnonymousClass4NK.MULTI_CAPTURE;
    }

    /* renamed from: C */
    public static void m26818C(AnonymousClass5T9 anonymousClass5T9) {
        Object obj = anonymousClass5T9.f64314F.size() >= 10 ? 1 : null;
        if (obj != null) {
            anonymousClass5T9.m26826E();
        }
        anonymousClass5T9 = anonymousClass5T9.f64312D.f7395i;
        if (obj != null) {
            AnonymousClass5TC.m26842B(anonymousClass5T9, false, new AnonymousClass4Nc(anonymousClass5T9));
        }
    }

    /* renamed from: C */
    public final boolean m26824C() {
        if (!m26823B()) {
            return false;
        }
        m26828G(null);
        return true;
    }

    /* renamed from: D */
    public static void m26819D(AnonymousClass5T9 anonymousClass5T9) {
        AnonymousClass4NK anonymousClass4NK = anonymousClass5T9.f64324P;
        AnonymousClass4NK anonymousClass4NK2 = AnonymousClass4NK.NOT_STARTED;
        if (anonymousClass4NK != anonymousClass4NK2) {
            AnonymousClass5T9.m26820E(anonymousClass5T9, anonymousClass4NK2);
            AnonymousClass14H.E(false, new View[]{anonymousClass5T9.f64329U});
            anonymousClass5T9.f64317I.m26915E();
            anonymousClass5T9.f64314F.clear();
        }
    }

    /* renamed from: D */
    public final void m26825D(boolean z) {
        if (!this.f64323O || !z) {
            return;
        }
        if (!((Boolean) AnonymousClass0CC.sU.H(this.f64320L)).booleanValue()) {
            return;
        }
        if (m26823B()) {
            this.f64317I.m26917G();
        } else {
            AnonymousClass5T9.m26821F(this);
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.f7106D == 1.0d) {
            this.f64329U.post(new AnonymousClass4NG(this));
        }
    }

    /* renamed from: E */
    public final void m26826E() {
        AnonymousClass0dF anonymousClass0dF = this.f64312D;
        List<AnonymousClass3FJ> unmodifiableList = Collections.unmodifiableList(this.f64314F);
        if (unmodifiableList.size() == 1) {
            AnonymousClass3FJ anonymousClass3FJ = (AnonymousClass3FJ) unmodifiableList.get(0);
            switch (anonymousClass3FJ.f39427C.ordinal()) {
                case 0:
                    AnonymousClass0dF.M(anonymousClass0dF, anonymousClass3FJ.f39426B);
                    return;
                case 1:
                    AnonymousClass0dF.N(anonymousClass0dF, anonymousClass3FJ.f39428D);
                    return;
            }
        }
        AnonymousClass5Tf anonymousClass5Tf = anonymousClass0dF.f7386Z;
        AnonymousClass5Tf.m26921E(anonymousClass5Tf).XB = AnonymousClass3FO.CAMERA;
        AnonymousClass4RA anonymousClass4RA = anonymousClass5Tf.f64576W;
        List arrayList = new ArrayList();
        for (AnonymousClass3FJ anonymousClass3FJ2 : unmodifiableList) {
            switch (anonymousClass3FJ2.f39427C.ordinal()) {
                case 0:
                    arrayList.add(new AnonymousClass3Fh(anonymousClass3FJ2.f39426B));
                    continue;
                case 1:
                    arrayList.add(new AnonymousClass3Fh(anonymousClass3FJ2.f39428D));
                    continue;
                default:
                    break;
            }
        }
        anonymousClass4RA.A(arrayList);
        anonymousClass5Tf.f64575V.B(true);
        anonymousClass5Tf.f64557D.H(unmodifiableList);
        anonymousClass5Tf.f64573T.C(new AnonymousClass3E5());
        return;
        throw new UnsupportedOperationException("Unknown captured media type");
    }

    /* renamed from: E */
    public static void m26820E(AnonymousClass5T9 anonymousClass5T9, AnonymousClass4NK anonymousClass4NK) {
        if (anonymousClass5T9.f64324P != anonymousClass4NK) {
            boolean B = anonymousClass5T9.m26823B();
            anonymousClass5T9.f64324P = anonymousClass4NK;
            boolean B2 = anonymousClass5T9.m26823B();
            if (B != B2) {
                AnonymousClass5Td anonymousClass5Td = anonymousClass5T9.f64317I;
                anonymousClass5Td.f64548H.setVisibility(B2 ? 0 : 4);
                AnonymousClass0Nm.R(anonymousClass5Td.f64548H, new AnonymousClass4Qv(anonymousClass5Td));
                AnonymousClass5TC anonymousClass5TC = anonymousClass5T9.f64312D.f7395i;
                anonymousClass5TC.f64369C.X(B2);
                if (!B2) {
                    AnonymousClass5TC.m26842B(anonymousClass5TC, true, null);
                }
            }
        }
    }

    /* renamed from: F */
    public final void m26827F() {
        switch (this.f64324P.ordinal()) {
            case 1:
                AnonymousClass14H.H(true, new View[]{this.f64329U});
                return;
            case 2:
                AnonymousClass14H.H(true, new View[]{this.f64317I.f64544D});
                return;
            default:
                return;
        }
    }

    /* renamed from: F */
    private static void m26821F(AnonymousClass5T9 anonymousClass5T9) {
        AnonymousClass3FJ A = anonymousClass5T9.f64321M.A();
        if (A.B()) {
            if (A.f39427C != AnonymousClass3FK.VIDEO || (TextUtils.isEmpty(A.f39428D.f44640a) ^ 1) == 0) {
                AnonymousClass5T9.m26820E(anonymousClass5T9, AnonymousClass4NK.ENTRY_POINT);
                Bitmap createBitmap = Bitmap.createBitmap(Math.round(((float) anonymousClass5T9.f64328T.getWidth()) * 0.25f), Math.round(((float) anonymousClass5T9.f64328T.getHeight()) * 0.25f), Config.ARGB_8888);
                switch (anonymousClass5T9.f64321M.B().ordinal()) {
                    case 0:
                        AnonymousClass5TB anonymousClass5TB = anonymousClass5T9.f64325Q;
                        if (createBitmap != null) {
                            anonymousClass5TB.f64348N.getBitmap(createBitmap);
                            createBitmap.setPixel(0, 0, createBitmap.getPixel(0, 0));
                            break;
                        }
                        anonymousClass5TB.f64348N.getBitmap();
                        break;
                    case 1:
                        anonymousClass5T9.f64332X.m26893B(createBitmap);
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown captured media type");
                }
                anonymousClass5T9.f64328T.setImageBitmap(createBitmap);
                anonymousClass5T9.f64330V.setImageBitmap(createBitmap);
                AnonymousClass14H.H(false, new View[]{anonymousClass5T9.f64328T});
                AnonymousClass14H.E(false, new View[]{anonymousClass5T9.f64329U});
                anonymousClass5T9.f64314F.add(A);
                anonymousClass5T9.f64317I.m26912B(createBitmap);
                anonymousClass5T9.f64317I.m26916F(false);
                anonymousClass5T9.f64327S = 0;
                anonymousClass5T9.f64331W.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).N(1.0d);
            }
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        AnonymousClass5T9 anonymousClass5T9 = this;
        AnonymousClass5Td anonymousClass5Td = this.f64317I;
        int i = this.f64327S;
        Rect rect = this.f64326R;
        AnonymousClass0oo a = anonymousClass5Td.f64549I.a(i);
        if (a != null) {
            a.f10370B.getGlobalVisibleRect(rect);
        }
        if (!this.f64326R.isEmpty()) {
            float E = (float) anonymousClass0cN.E();
            float height = ((float) anonymousClass5T9.f64316H) / ((float) anonymousClass5T9.f64328T.getHeight());
            anonymousClass5T9.f64328T.setScaleX(AnonymousClass0nB.E(E, 0.0f, 1.0f, 1.0f, ((float) this.f64318J) / ((float) anonymousClass5T9.f64328T.getWidth()), true));
            anonymousClass5T9.f64328T.setScaleY(AnonymousClass0nB.E(E, 0.0f, 1.0f, 1.0f, height, true));
            anonymousClass5T9.f64328T.setTranslationX((anonymousClass5T9.f64326R.exactCenterX() - (((float) anonymousClass5T9.f64328T.getWidth()) / 2.0f)) * E);
            anonymousClass5T9.f64328T.setTranslationY((anonymousClass5T9.f64326R.exactCenterY() - (((float) anonymousClass5T9.f64328T.getHeight()) / 2.0f)) * E);
            if (E == 1.0f) {
                AnonymousClass14H.F(4, false, new View[]{anonymousClass5T9.f64328T});
                AnonymousClass14H.H(false, new View[]{anonymousClass5T9.f64329U});
            }
        }
    }

    /* renamed from: G */
    public final void m26828G(AnonymousClass5TG anonymousClass5TG) {
        String string;
        int i = 0;
        int i2 = 0;
        for (AnonymousClass3FJ anonymousClass3FJ : this.f64314F) {
            switch (anonymousClass3FJ.f39427C.ordinal()) {
                case 0:
                    i++;
                    break;
                case 1:
                    i2++;
                    break;
                default:
                    break;
            }
        }
        Resources resources = this.f64311C.getResources();
        if (i > 1 && i2 > 1) {
            string = resources.getString(C0164R.string.save_multiple_photos_and_multiple_videos_captured);
        } else if (i > 1 && i2 == 1) {
            string = resources.getString(C0164R.string.save_multiple_photos_and_one_video_captured);
        } else if (i == 1 && i2 > 1) {
            string = resources.getString(C0164R.string.save_one_photo_and_multiple_videos_captured);
        } else if (i == 1 && i2 == 1) {
            string = resources.getString(C0164R.string.save_one_photo_and_one_video_captured);
        } else if (i > 0) {
            string = resources.getQuantityString(C0164R.plurals.save_photos_captured, i);
        } else {
            string = resources.getQuantityString(C0164R.plurals.save_videos_captured, i2);
        }
        new AnonymousClass4NJ(this, string, anonymousClass5TG).f53345B.show();
    }

    public final void ae(AnonymousClass13K anonymousClass13K) {
        float A = anonymousClass13K.A();
        this.f64329U.setScaleX(A);
        this.f64329U.setScaleY(A);
        if (m26823B()) {
            if (this.f64329U.getVisibility() == 0) {
                AnonymousClass14H.E(false, new View[]{this.f64329U});
            }
            this.f64317I.m26916F(true);
            AnonymousClass0oo a = this.f64317I.f64549I.a(0);
            if (a != null) {
                a.f10370B.setScaleX(A);
                a.f10370B.setScaleY(A);
            }
        }
    }
}

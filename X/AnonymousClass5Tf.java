package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;

/* renamed from: X.5Tf */
public final class AnonymousClass5Tf implements AnonymousClass0EE, AnonymousClass3Ff, AnonymousClass4O6, AnonymousClass3Fy, AnonymousClass0Uy {
    /* renamed from: B */
    public boolean f64555B;
    /* renamed from: C */
    public final Activity f64556C;
    /* renamed from: D */
    public final AnonymousClass4UE f64557D;
    /* renamed from: E */
    public final Map f64558E = new HashMap();
    /* renamed from: F */
    public IgImageView f64559F;
    /* renamed from: G */
    public final AnonymousClass5bK f64560G;
    /* renamed from: H */
    public boolean f64561H;
    /* renamed from: I */
    public final TouchInterceptorFrameLayout f64562I;
    /* renamed from: J */
    public final OnTouchListener f64563J;
    /* renamed from: K */
    public final Map f64564K = new HashMap();
    /* renamed from: L */
    public final AnonymousClass0ct f64565L;
    /* renamed from: M */
    public final AnonymousClass5BN f64566M;
    /* renamed from: N */
    public final AnonymousClass5TB f64567N;
    /* renamed from: O */
    public final Queue f64568O = new LinkedList();
    /* renamed from: P */
    public final AnonymousClass5UG f64569P;
    /* renamed from: Q */
    public final AnonymousClass0IP f64570Q;
    /* renamed from: R */
    public final Runnable f64571R = new AnonymousClass4R3(this);
    /* renamed from: S */
    public boolean f64572S;
    /* renamed from: T */
    public final AnonymousClass0Uw f64573T;
    /* renamed from: U */
    public final ViewGroup f64574U;
    /* renamed from: V */
    public final AnonymousClass3z1 f64575V;
    /* renamed from: W */
    public final AnonymousClass4RA f64576W = new AnonymousClass4RA();
    /* renamed from: X */
    public final AnonymousClass0Cm f64577X;
    /* renamed from: Y */
    public Bitmap f64578Y;
    /* renamed from: Z */
    public final AnonymousClass0ct f64579Z;
    /* renamed from: a */
    public final AnonymousClass5TY f64580a;
    /* renamed from: b */
    public final View f64581b;
    /* renamed from: c */
    private final AnonymousClass4LH f64582c;
    /* renamed from: d */
    private final AnonymousClass0dF f64583d;
    /* renamed from: e */
    private final AnonymousClass0ct f64584e;

    public final void Hp() {
    }

    public final void Ip(List list) {
    }

    public final String getModuleName() {
        return "reel_composer_preview";
    }

    public final void oo(AnonymousClass3Fh anonymousClass3Fh, int i) {
    }

    public AnonymousClass5Tf(AnonymousClass4UE anonymousClass4UE, AnonymousClass5UG anonymousClass5UG, AnonymousClass0Uw anonymousClass0Uw, Activity activity, AnonymousClass0Cm anonymousClass0Cm, View view, AnonymousClass0ct anonymousClass0ct, AnonymousClass5TB anonymousClass5TB, AnonymousClass5TY anonymousClass5TY, AnonymousClass5bK anonymousClass5bK, AnonymousClass4LH anonymousClass4LH, AnonymousClass0dF anonymousClass0dF) {
        this.f64557D = anonymousClass4UE;
        this.f64569P = anonymousClass5UG;
        this.f64573T = anonymousClass0Uw;
        this.f64573T.A(this);
        this.f64556C = activity;
        this.f64577X = anonymousClass0Cm;
        this.f64581b = view;
        this.f64574U = (ViewGroup) view.findViewById(C0164R.id.texture_view_container);
        this.f64567N = anonymousClass5TB;
        this.f64580a = anonymousClass5TY;
        this.f64560G = anonymousClass5bK;
        this.f64582c = anonymousClass4LH;
        this.f64583d = anonymousClass0dF;
        this.f64584e = anonymousClass0ct;
        this.f64579Z = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.video_screenshot_view_stub));
        this.f64565L = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.media_navigation_affordance_stub));
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "MultiMediaEditController";
        this.f64570Q = new AnonymousClass0Mo(B.A());
        this.f64575V = new AnonymousClass3z1(this.f64556C, (TouchInterceptorFrameLayout) view.findViewById(C0164R.id.multi_media_thumbnail_tray), this.f64576W, this, true);
        this.f64576W.nB(this);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view.findViewById(C0164R.id.post_capture_interactive_contents_container);
        this.f64562I = touchInterceptorFrameLayout;
        touchInterceptorFrameLayout.setKeepObservingAfterRequestDisallowTouchEvent(true);
        this.f64566M = new AnonymousClass5BN(this.f64556C, true, true, this);
        this.f64563J = new AnonymousClass4R4(this);
    }

    /* renamed from: A */
    public final void m26931A() {
        if (this.f64572S) {
            AnonymousClass5TB anonymousClass5TB = this.f64567N;
            if (anonymousClass5TB.f64337C.B() != AnonymousClass3FK.PHOTO) {
                anonymousClass5TB.f64348N.setVisibility(8);
            }
            AnonymousClass5TY anonymousClass5TY = this.f64580a;
            if (anonymousClass5TY.f64465C.B() != AnonymousClass3FK.VIDEO) {
                anonymousClass5TY.f64487Y.setVisibility(8);
            }
            this.f64579Z.D(8);
            this.f64581b.removeCallbacks(this.f64571R);
            String D = AnonymousClass5Tf.m26920D(this);
            String str = (String) this.f64558E.get(D);
            boolean z = false;
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                AnonymousClass5Tf.m26924H(this);
            } else {
                if (this.f64559F == null) {
                    this.f64559F = new IgImageView(this.f64556C);
                    ((ViewGroup) AnonymousClass5Tf.m26922F(this).getParent()).addView(this.f64559F, ((ViewGroup) AnonymousClass5Tf.m26922F(this).getParent()).indexOfChild(AnonymousClass5Tf.m26922F(this)) + 1, new LayoutParams(-1, -1));
                }
                IgImageView igImageView = this.f64559F;
                igImageView.setUrl(str);
                igImageView.setVisibility(0);
            }
            AnonymousClass5Tf.m26922F(this).setVisibility(4);
            AnonymousClass4R2 anonymousClass4R2 = (AnonymousClass4R2) this.f64564K.get(D);
            if (anonymousClass4R2 == null || anonymousClass4R2.f54018B.f54013B.f54017B == null) {
                z = true;
            }
            AnonymousClass5Te anonymousClass5Te = new AnonymousClass5Te(this, z);
            AnonymousClass5bK anonymousClass5bK = this.f64560G;
            AnonymousClass5cl anonymousClass5cl = anonymousClass5bK.f66867h;
            InteractiveDrawableContainer interactiveDrawableContainer = anonymousClass5cl.f67415N;
            interactiveDrawableContainer.f31644D.clear();
            interactiveDrawableContainer.invalidate();
            anonymousClass5cl.f67428a.f64414N.clear();
            AnonymousClass2V0 anonymousClass2V0 = AnonymousClass5Sw.m26785C(anonymousClass5bK.f66844K).f53107B;
            anonymousClass2V0.E(new AnonymousClass2L9(anonymousClass2V0, new AnonymousClass2LA(anonymousClass2V0, anonymousClass5Te)));
            anonymousClass5bK.f66859Z.m26867B(null, null, null);
            AnonymousClass5UG anonymousClass5UG = this.f64569P;
            anonymousClass5UG.f64859B = new AnonymousClass4Ts();
            AnonymousClass5UG.m26999B(anonymousClass5UG);
            if (anonymousClass4R2 != null) {
                AnonymousClass5bK anonymousClass5bK2 = this.f64560G;
                AnonymousClass4R0 anonymousClass4R0 = anonymousClass4R2.f54018B;
                AnonymousClass5cl anonymousClass5cl2 = anonymousClass5bK2.f66867h;
                AnonymousClass4RC anonymousClass4RC = anonymousClass4R0.f54015D;
                if (anonymousClass4RC.f54052B != null) {
                    InteractiveDrawableContainer interactiveDrawableContainer2 = anonymousClass5cl2.f67415N;
                    for (AnonymousClass2cS add : anonymousClass4RC.f54052B) {
                        interactiveDrawableContainer2.f31644D.add(add);
                    }
                    Collections.sort(interactiveDrawableContainer2.f31644D);
                    interactiveDrawableContainer2.invalidate();
                }
                AnonymousClass5TL anonymousClass5TL = anonymousClass5cl2.f67428a;
                SparseArray sparseArray = anonymousClass4RC.f54054D.f54055B;
                for (int i = 0; i < sparseArray.size(); i++) {
                    anonymousClass5TL.f64414N.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
                if (sparseArray.size() > 0) {
                    anonymousClass5TL.f64409I.Nw(anonymousClass5TL);
                }
                AnonymousClass5Sw anonymousClass5Sw = anonymousClass5bK2.f66844K;
                AnonymousClass4R1 anonymousClass4R1 = anonymousClass4R0.f54013B;
                if (AnonymousClass5Sw.m26786D(anonymousClass5Sw)) {
                    AnonymousClass5Sw.m26785C(anonymousClass5Sw).f53107B.J(anonymousClass4R1.f54017B, anonymousClass5Te);
                }
                AnonymousClass5TK anonymousClass5TK = anonymousClass5bK2.f66859Z;
                AnonymousClass4ON anonymousClass4ON = anonymousClass4R0.f54016E;
                anonymousClass5TK.m26867B(anonymousClass4ON.f53542C, anonymousClass4ON.f53543D, anonymousClass4ON.f53541B);
                anonymousClass5bK2.f66852S.m26961F(anonymousClass4R0.f54014C, null);
                anonymousClass5UG = this.f64569P;
                anonymousClass5UG.f64859B = anonymousClass4R2.f54020D.f54451B;
                AnonymousClass5UG.m26999B(anonymousClass5UG);
            }
            this.f64560G.m27823Q(this.f64557D.B());
            this.f64555B = true;
        }
    }

    /* renamed from: B */
    public final void m26932B() {
        AnonymousClass3z1 anonymousClass3z1 = this.f64575V;
        AnonymousClass3z1.D(anonymousClass3z1, Math.max(0, anonymousClass3z1.f47817N.cR() - 1));
    }

    /* renamed from: B */
    public static void m26918B(AnonymousClass5Tf anonymousClass5Tf, TreeMap treeMap, AnonymousClass3FJ anonymousClass3FJ, int i, int i2) {
        AnonymousClass5Tf.m26921E(anonymousClass5Tf).C();
        treeMap.put(Integer.valueOf(i), anonymousClass3FJ);
        if (treeMap.size() >= i2) {
            anonymousClass5Tf.f64557D.H(new ArrayList(treeMap.values()));
            anonymousClass5Tf.f64573T.C(new AnonymousClass3E5());
            anonymousClass5Tf.f64561H = false;
        }
    }

    public final void Bp(AnonymousClass3Fh anonymousClass3Fh, int i) {
        anonymousClass3Fh = this.f64557D;
        anonymousClass3Fh.f54561C.remove(i);
        int i2 = anonymousClass3Fh.f54560B;
        if (i < i2 || i2 >= anonymousClass3Fh.f54561C.size()) {
            anonymousClass3Fh.f54560B--;
        }
    }

    /* renamed from: C */
    public static IgFilterGroup m26919C(AnonymousClass0OA anonymousClass0OA, AnonymousClass3nl anonymousClass3nl) {
        IgFilterGroup C = AnonymousClass3GU.C(AnonymousClass0ch.REEL, anonymousClass3nl.f44610R, AnonymousClass2N0.C(anonymousClass3nl.f44605M), null, null);
        List<AnonymousClass1Oi> list = anonymousClass0OA.yC;
        if (list != null) {
            for (AnonymousClass1Oi anonymousClass1Oi : list) {
                if (anonymousClass1Oi.f17999F == 7) {
                    AnonymousClass4MC.C(anonymousClass3nl, C);
                    AnonymousClass4MC.D(C, anonymousClass1Oi);
                }
            }
        }
        return C;
    }

    /* renamed from: C */
    public final void m26933C() {
        AnonymousClass3z1 anonymousClass3z1 = this.f64575V;
        AnonymousClass3z1.D(anonymousClass3z1, Math.min(anonymousClass3z1.f47817N.getCount() - 1, anonymousClass3z1.f47817N.cR() + 1));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cp(X.AnonymousClass3Fh r6, int r7) {
        /*
        r5 = this;
        r5.m26930N();
        r0 = r5.f64557D;
        r0 = r0.B();
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x0018;
            default: goto L_0x0010;
        };
    L_0x0010:
        r1 = new java.lang.UnsupportedOperationException;
        r0 = "Unknown captured media type";
        r1.<init>(r0);
        throw r1;
    L_0x0018:
        r1 = r5.f64580a;
        r0 = r5.f64578Y;
        r0 = r1.m26893B(r0);
        r5.f64578Y = r0;
        if (r0 == 0) goto L_0x0042;
    L_0x0024:
        r1 = r5.f64579Z;
        r0 = 0;
        r1.D(r0);
        r0 = r5.f64579Z;
        r1 = r0.A();
        r1 = (android.widget.ImageView) r1;
        r0 = r5.f64578Y;
        r1.setImageBitmap(r0);
        r0 = r5.f64579Z;
        r0 = r0.A();
        r0 = (android.widget.ImageView) r0;
        r0.invalidate();
    L_0x0042:
        r0 = r5.f64580a;
        X.AnonymousClass5TY.m26888I(r0);
        goto L_0x0067;
    L_0x0048:
        r4 = r5.f64567N;
        r1 = r4.f64349O;
        r0 = r4.f64353S;
        r1.removeCallbacks(r0);
        r3 = 0;
        r4.f64353S = r3;
        r2 = r4.f64343I;
        r1 = r2.f64193U;
        r0 = r2.f64181I;
        r1.removeCallbacks(r0);
        r0 = 0;
        r2.f64181I = r0;
        r4.f64344J = r3;
        r0 = r4.f64345K;
        r0.m26939B();
    L_0x0067:
        r0 = 0;
        r5.f64555B = r0;
        r0 = r5.f64557D;
        r0.f54560B = r7;
        r0 = r5.f64557D;
        r0 = r0.B();
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0082;
            case 1: goto L_0x007c;
            default: goto L_0x007b;
        };
    L_0x007b:
        goto L_0x0010;
    L_0x007c:
        r0 = r5.f64580a;
        r0.m26894C();
        goto L_0x0087;
    L_0x0082:
        r0 = r5.f64567N;
        r0.m26841B();
    L_0x0087:
        r5.m26929M();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5Tf.Cp(X.3Fh, int):void");
    }

    /* renamed from: D */
    public static String m26920D(AnonymousClass5Tf anonymousClass5Tf) {
        return anonymousClass5Tf.f64557D.A().A();
    }

    /* renamed from: E */
    public static AnonymousClass3FR m26921E(AnonymousClass5Tf anonymousClass5Tf) {
        return anonymousClass5Tf.f64557D.E();
    }

    /* renamed from: F */
    public static View m26922F(AnonymousClass5Tf anonymousClass5Tf) {
        return anonymousClass5Tf.f64584e.A();
    }

    /* renamed from: G */
    public static boolean m26923G(AnonymousClass4R0 anonymousClass4R0, AnonymousClass4R0 anonymousClass4R02) {
        return AnonymousClass0LQ.B(anonymousClass4R0.f54013B.f54017B, anonymousClass4R02.f54013B.f54017B) && AnonymousClass0LQ.B(anonymousClass4R0.f54015D.f54053C, anonymousClass4R02.f54015D.f54053C);
    }

    /* renamed from: H */
    public static void m26924H(AnonymousClass5Tf anonymousClass5Tf) {
        IgImageView igImageView = anonymousClass5Tf.f64559F;
        if (igImageView != null) {
            igImageView.A();
            anonymousClass5Tf.f64559F.setVisibility(8);
        }
    }

    /* renamed from: I */
    public static void m26925I(AnonymousClass5Tf anonymousClass5Tf, List list, List list2, AnonymousClass0Um anonymousClass0Um, boolean z) {
        Bitmap bitmap;
        if (anonymousClass0Um != AnonymousClass0Um.NONE) {
            AnonymousClass0HV.D(anonymousClass5Tf.f64577X).IA(AnonymousClass0Ps.STORY.name());
            AnonymousClass0cO B = AnonymousClass0cO.B();
            bitmap = B.f7119B;
            B.f7119B = null;
        } else {
            bitmap = null;
        }
        AnonymousClass0dF anonymousClass0dF = anonymousClass5Tf.f64583d;
        AnonymousClass3Fe anonymousClass3Fe = AnonymousClass3Fe.POSTED_FROM_RECIPIENT_PICKER;
        boolean z2 = true;
        boolean z3 = anonymousClass0Um != AnonymousClass0Um.NONE;
        AnonymousClass3FR H = AnonymousClass0dF.H(anonymousClass0dF);
        H.MB = new ArrayList(list);
        H.hB = anonymousClass3Fe;
        if (list2 == null || list2.isEmpty()) {
            z2 = false;
        }
        H.RB = z2;
        H.SB = list2 != null ? list2.size() : 0;
        H.VB = z3;
        for (AnonymousClass0OA j : list) {
            if (j.j() && AnonymousClass0Co.B(anonymousClass0dF.f7407u)) {
                Toast.makeText(anonymousClass0dF.f7362B, C0164R.string.direct_send_gated_feature_employee_warning, 0).show();
                break;
            }
        }
        if (z) {
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.K(anonymousClass5Tf, anonymousClass0dF.f7391e + 2, null);
            anonymousClass0Iz.F(anonymousClass5Tf, anonymousClass0dF.f7362B);
            anonymousClass0Iz.H(anonymousClass0dF.f7367G);
            anonymousClass0dF.f7370J.G();
            if (AnonymousClass0dF.Y(anonymousClass0dF, list2, z3)) {
                anonymousClass0dF.f7366F.C(bitmap);
            }
            anonymousClass0dF.f7376P.kE(anonymousClass0Um, bitmap, list2);
        }
        if (z) {
            anonymousClass5Tf.f64573T.C(new AnonymousClass3E2());
        }
    }

    public final void Ik() {
        if (this.f64572S) {
            this.f64575V.B(false);
            this.f64562I.A(this.f64563J);
        }
    }

    /* renamed from: J */
    public static void m26926J(List list) {
        String uuid = UUID.randomUUID().toString();
        for (AnonymousClass0OA anonymousClass0OA : list) {
            anonymousClass0OA.SB = true;
            anonymousClass0OA.eC = uuid;
        }
    }

    public final void Jk() {
        if (this.f64572S) {
            this.f64575V.A(false);
            this.f64562I.A(null);
        }
    }

    /* renamed from: K */
    private void m26927K(String str, AnonymousClass0OA anonymousClass0OA, AnonymousClass4R0 anonymousClass4R0, AnonymousClass0OA anonymousClass0OA2, AnonymousClass4R0 anonymousClass4R02) {
        if (anonymousClass4R0.f54013B.f54017B != null || anonymousClass4R0.f54015D.f54053C != null) {
            if (anonymousClass4R02 == null || !AnonymousClass5Tf.m26923G(anonymousClass4R0, anonymousClass4R02)) {
                anonymousClass0OA2 = (Bitmap) this.f64568O.poll();
                if (anonymousClass0OA2 == null) {
                    anonymousClass0OA2 = this.f64582c.B(null, false);
                } else {
                    anonymousClass0OA2.eraseColor(0);
                    this.f64582c.B(anonymousClass0OA2, false);
                }
                AnonymousClass0Ix.D(new AnonymousClass4R8(this, str, anonymousClass0OA, anonymousClass4R0, anonymousClass0OA2));
                return;
            }
            anonymousClass0OA.f3819g = anonymousClass0OA2.f3819g;
            anonymousClass0OA.EA(anonymousClass0OA2.KB);
        }
    }

    /* renamed from: L */
    private void m26928L(String str, AnonymousClass4R0 anonymousClass4R0, AnonymousClass4R0 anonymousClass4R02) {
        if (anonymousClass4R0.f54013B.f54017B == null) {
            this.f64558E.remove(str);
        } else if (anonymousClass4R02 == null || !AnonymousClass0LQ.B(anonymousClass4R0.f54013B.f54017B, anonymousClass4R02.f54013B.f54017B)) {
            Bitmap bitmap = (Bitmap) this.f64568O.poll();
            if (bitmap == null) {
                bitmap = this.f64560G.m27812F(null);
            } else {
                bitmap.eraseColor(0);
                this.f64560G.m27812F(bitmap);
            }
            AnonymousClass0Ix.D(new AnonymousClass4R9(this, str, anonymousClass4R0.f54013B.f54017B, bitmap));
        }
    }

    /* renamed from: M */
    private void m26929M() {
        AnonymousClass4R2 anonymousClass4R2 = (AnonymousClass4R2) this.f64564K.get(AnonymousClass5Tf.m26920D(this));
        if (anonymousClass4R2 != null) {
            AnonymousClass286 anonymousClass286;
            if (anonymousClass4R2.f54019C != null) {
                AnonymousClass5TB anonymousClass5TB = this.f64567N;
                AnonymousClass4RE anonymousClass4RE = anonymousClass4R2.f54019C;
                AnonymousClass5Ug anonymousClass5Ug = anonymousClass5TB.f64347M;
                if (anonymousClass5Ug != null) {
                    anonymousClass5Ug.m27093A(anonymousClass4RE.f54057C);
                }
                AnonymousClass5Sy anonymousClass5Sy = anonymousClass5TB.f64343I;
                anonymousClass286 = anonymousClass4RE.f54058D;
                anonymousClass5Sy.f64183K = anonymousClass286.f26471C;
                anonymousClass5Sy.f64188P = anonymousClass286.f26470B;
                anonymousClass5Sy.f64191S = anonymousClass286.f26472D;
                anonymousClass5Sy.f64192T = anonymousClass286.f26473E;
                AnonymousClass5Sy.m26800E(anonymousClass5Sy);
            }
            if (anonymousClass4R2.f54021E != null) {
                AnonymousClass5TY anonymousClass5TY = this.f64580a;
                AnonymousClass4RF anonymousClass4RF = anonymousClass4R2.f54021E;
                if (anonymousClass5TY.f64471I != null) {
                    AnonymousClass0OA anonymousClass0OA = anonymousClass4RF.f54062C;
                    int i = anonymousClass0OA.AD;
                    boolean z = anonymousClass0OA.hB;
                    anonymousClass5TY.f64474L.AD = i;
                    anonymousClass5TY.f64474L.zC = anonymousClass0OA.zC;
                    anonymousClass5TY.f64474L.hB = z;
                    AnonymousClass5TW anonymousClass5TW = anonymousClass5TY.f64471I;
                    int indexOf = anonymousClass5TW.f64455F.indexOf(Integer.valueOf(i));
                    if (indexOf >= 0) {
                        synchronized (anonymousClass5TW.f64459J) {
                            anonymousClass5TW.f64453D = indexOf;
                            anonymousClass5TW.f64458I = indexOf;
                            anonymousClass5TW.f64457H = AnonymousClass4Yg.END_CURRENT;
                        }
                        anonymousClass5TW.f64454E.G();
                    }
                    anonymousClass5TY.f64470H.m27821O(z ? AnonymousClass4TP.SOUND_OFF : AnonymousClass4TP.SOUND_ON);
                }
                AnonymousClass5T0 anonymousClass5T0 = anonymousClass5TY.f64472J;
                anonymousClass286 = anonymousClass4RF.f54061B;
                anonymousClass5T0.f64211M = anonymousClass286.f26471C;
                anonymousClass5T0.f64210L = anonymousClass286.f26470B;
                anonymousClass5T0.f64212N = anonymousClass286.f26472D;
                anonymousClass5T0.f64213O = anonymousClass286.f26473E;
                AnonymousClass5T0.m26804D(anonymousClass5T0);
            }
        }
    }

    /* renamed from: N */
    private void m26930N() {
        if (this.f64555B) {
            AnonymousClass0OA anonymousClass0OA;
            AnonymousClass4R0 anonymousClass4R0;
            List arrayList;
            AnonymousClass2cR M;
            AnonymousClass4RE anonymousClass4RE;
            String D = AnonymousClass5Tf.m26920D(r6);
            AnonymousClass4R2 anonymousClass4R2 = (AnonymousClass4R2) r6.f64564K.get(D);
            AnonymousClass4RF anonymousClass4RF = null;
            if (anonymousClass4R2 == null) {
                anonymousClass0OA = null;
            } else {
                anonymousClass0OA = anonymousClass4R2.A();
            }
            if (anonymousClass4R2 == null) {
                anonymousClass4R0 = null;
            } else {
                anonymousClass4R0 = anonymousClass4R2.f54018B;
            }
            AnonymousClass5bK anonymousClass5bK = r6.f64560G;
            AnonymousClass5cl anonymousClass5cl = anonymousClass5bK.f66867h;
            if (anonymousClass5cl.f67415N.getDrawableCount() > 0) {
                InteractiveDrawableContainer interactiveDrawableContainer = anonymousClass5cl.f67415N;
                arrayList = new ArrayList();
                for (AnonymousClass2cS add : interactiveDrawableContainer.f31644D) {
                    arrayList.add(add);
                }
            } else {
                arrayList = null;
            }
            AnonymousClass4RC anonymousClass4RC = new AnonymousClass4RC(arrayList, anonymousClass5cl.m28115F(), new AnonymousClass4RD(anonymousClass5cl.f67428a.f64414N));
            AnonymousClass5Sw anonymousClass5Sw = anonymousClass5bK.f66844K;
            if (AnonymousClass5Sw.m26786D(anonymousClass5Sw)) {
                M = AnonymousClass5Sw.m26785C(anonymousClass5Sw).f53107B.f32098D.M();
            } else {
                M = null;
            }
            AnonymousClass4R1 anonymousClass4R1 = new AnonymousClass4R1(M);
            AnonymousClass5TK anonymousClass5TK = anonymousClass5bK.f66859Z;
            AnonymousClass4R0 anonymousClass4R02 = new AnonymousClass4R0(anonymousClass4RC, anonymousClass4R1, new AnonymousClass4ON(anonymousClass5TK.f64388C, anonymousClass5TK.f64399N, anonymousClass5TK.f64390E), anonymousClass5bK.f66852S.m26962G());
            switch (r6.f64557D.B().ordinal()) {
                case 0:
                    AnonymousClass5TB anonymousClass5TB = r6.f64567N;
                    AnonymousClass4U9 A = anonymousClass5TB.f64358X.A(anonymousClass5TB.f64347M);
                    AnonymousClass0OA B = AnonymousClass5TB.m26829B(anonymousClass5TB, anonymousClass5TB.f64337C.C(), A, null);
                    AnonymousClass5Sy anonymousClass5Sy = anonymousClass5TB.f64343I;
                    anonymousClass4RE = new AnonymousClass4RE(new AnonymousClass286(anonymousClass5Sy.f64183K, anonymousClass5Sy.f64188P, anonymousClass5Sy.f64191S, anonymousClass5Sy.f64192T), anonymousClass5TB.f64347M.hK(), anonymousClass5TB.f64342H.D(), B, A);
                    break;
                case 1:
                    AnonymousClass5TY anonymousClass5TY = r6.f64580a;
                    AnonymousClass4U9 A2 = anonymousClass5TY.f64490b.A(anonymousClass5TY.f64471I);
                    AnonymousClass0OA B2 = AnonymousClass5TY.m26881B(anonymousClass5TY, anonymousClass5TY.f64465C.D(), A2, null);
                    AnonymousClass5T0 anonymousClass5T0 = anonymousClass5TY.f64472J;
                    AnonymousClass4RF anonymousClass4RF2 = new AnonymousClass4RF(new AnonymousClass286(anonymousClass5T0.f64211M, anonymousClass5T0.f64210L, anonymousClass5T0.f64212N, anonymousClass5T0.f64213O), B2, A2);
                    anonymousClass4RE = null;
                    anonymousClass4RF = anonymousClass4RF2;
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown captured media type");
            }
            AnonymousClass4R2 anonymousClass4R22 = new AnonymousClass4R2(new AnonymousClass4Tr(r6.f64569P.f64859B), anonymousClass4R02, anonymousClass4RE, anonymousClass4RF);
            r6.f64564K.put(D, anonymousClass4R22);
            m26927K(D, anonymousClass4R22.A(), anonymousClass4R02, anonymousClass0OA, anonymousClass4R0);
            m26928L(D, anonymousClass4R02, anonymousClass4R0);
        }
    }

    public final void VEA() {
        m26930N();
        this.f64573T.C(new AnonymousClass3ER());
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        Object obj4 = obj3;
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj2;
        switch (((AnonymousClass3AM) obj).ordinal()) {
            case 15:
            case 22:
                Intent intent;
                Integer num = null;
                if (obj4 instanceof AnonymousClass3EE) {
                    AnonymousClass3EE anonymousClass3EE = (AnonymousClass3EE) obj4;
                    num = Integer.valueOf(anonymousClass3EE.f39337C);
                    intent = anonymousClass3EE.f39336B;
                } else {
                    intent = null;
                }
                if (this.f64557D.f54562D == AnonymousClass4QH.MULTI_MEDIA && r3 != null && r3.intValue() == -1) {
                    List parcelableArrayListExtra = intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                    AnonymousClass0Um anonymousClass0Um = (AnonymousClass0Um) intent.getSerializableExtra("bundle_extra_user_story_target");
                    int i = 0;
                    boolean booleanExtra = intent.getBooleanExtra("bundle_extra_is_one_tap_send", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("bundle_extra_add_to_fb_story_option", false);
                    List arrayList;
                    if (booleanExtra) {
                        boolean booleanExtra3 = intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false);
                        String[] stringArrayExtra = intent.getStringArrayExtra("bundle_extra_pending_media_keys");
                        arrayList = new ArrayList();
                        int length = stringArrayExtra.length;
                        while (i < length) {
                            AnonymousClass0OA A = PendingMediaStore.C().A(stringArrayExtra[i]);
                            if (A != null) {
                                arrayList.add(A);
                            }
                            i++;
                        }
                        AnonymousClass5Tf.m26925I(r9, arrayList, parcelableArrayListExtra, anonymousClass0Um, booleanExtra3);
                        return;
                    }
                    if (anonymousClass0Um == null) {
                        anonymousClass0Um = AnonymousClass0Um.NONE;
                    }
                    List arrayList2 = new ArrayList();
                    long currentTimeMillis = System.currentTimeMillis();
                    List<AnonymousClass3FJ> unmodifiableList = Collections.unmodifiableList(r9.f64557D.f54561C);
                    Context context = r9.f64556C;
                    AnonymousClass3FK anonymousClass3FK = AnonymousClass3FK.PHOTO;
                    arrayList = new ArrayList();
                    for (AnonymousClass3FJ anonymousClass3FJ : unmodifiableList) {
                        if (anonymousClass3FJ.f39427C == anonymousClass3FK) {
                            arrayList.add(anonymousClass3FJ);
                        }
                    }
                    AnonymousClass4R7 anonymousClass4R7 = new AnonymousClass4R7(context, arrayList);
                    int size = unmodifiableList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AnonymousClass0OA A2;
                        long j = currentTimeMillis - ((long) (((size - i2) - 1) * JsonMappingException.MAX_REFS_TO_LIST));
                        AnonymousClass3FJ anonymousClass3FJ2 = (AnonymousClass3FJ) unmodifiableList.get(i2);
                        AnonymousClass4R2 anonymousClass4R2;
                        switch (anonymousClass3FJ2.f39427C.ordinal()) {
                            case 0:
                                IgFilterGroup igFilterGroup;
                                AnonymousClass4R7 anonymousClass4R72 = anonymousClass4R7;
                                AnonymousClass3nl anonymousClass3nl = anonymousClass3FJ2.f39426B;
                                anonymousClass4R2 = (AnonymousClass4R2) r9.f64564K.get(anonymousClass3FJ2.A());
                                if (anonymousClass4R2 != null) {
                                    A2 = anonymousClass4R2.A();
                                    igFilterGroup = anonymousClass4R2.f54019C.f54056B;
                                } else {
                                    A2 = AnonymousClass4Os.B(anonymousClass3nl, r9.f64574U, r9);
                                    igFilterGroup = AnonymousClass5Tf.m26919C(A2, anonymousClass3nl);
                                }
                                AnonymousClass3Go anonymousClass3Go = new AnonymousClass3Go(new AnonymousClass4M9(anonymousClass3nl).A(), r9.f64574U.getWidth(), r9.f64574U.getHeight());
                                Activity activity = r9.f64556C;
                                AnonymousClass4Os.F(activity, r9.f64577X, A2, anonymousClass3nl, igFilterGroup, anonymousClass3Go, anonymousClass0Um, booleanExtra2, null, parcelableArrayListExtra, anonymousClass4R72, r9.f64570Q, true);
                                break;
                            case 1:
                                AnonymousClass4U9 anonymousClass4U9;
                                AnonymousClass3nn anonymousClass3nn = anonymousClass3FJ2.f39428D;
                                anonymousClass4R2 = (AnonymousClass4R2) r9.f64564K.get(anonymousClass3FJ2.A());
                                if (anonymousClass4R2 != null) {
                                    A2 = anonymousClass4R2.A();
                                    anonymousClass4U9 = anonymousClass4R2.f54021E.f54063D;
                                } else {
                                    A2 = AnonymousClass4Os.C(anonymousClass3nn, r9.f64574U, AnonymousClass3pG.B(anonymousClass3nn.f44628O), r9, false);
                                    anonymousClass4U9 = null;
                                }
                                Context context2 = r9.f64556C;
                                AnonymousClass4Os.G(context2, r9.f64577X, A2, anonymousClass0Um, booleanExtra2, null, anonymousClass4U9, parcelableArrayListExtra, r9.f64570Q);
                                break;
                            default:
                                throw new UnsupportedOperationException("Unknown captured media type");
                        }
                        A2.t(j);
                        arrayList2.add(A2);
                    }
                    AnonymousClass5Tf.m26926J(arrayList2);
                    AnonymousClass5Tf.m26925I(r9, arrayList2, parcelableArrayListExtra, anonymousClass0Um, true);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

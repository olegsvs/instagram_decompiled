package X;

import android.widget.BaseAdapter;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Collections;

/* renamed from: X.1RE */
public final class AnonymousClass1RE extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass5x3 f18578B;
    /* renamed from: C */
    private final BaseAdapter f18579C;

    public AnonymousClass1RE(BaseAdapter baseAdapter, AnonymousClass5x3 anonymousClass5x3) {
        this.f18579C = baseAdapter;
        this.f18578B = anonymousClass5x3;
    }

    public final Class WT() {
        return AnonymousClass0Pj.class;
    }

    public final /* bridge */ /* synthetic */ void Xc(Object obj) {
        Object obj2;
        ReboundViewPager reboundViewPager;
        String str;
        AnonymousClass14t D;
        String str2;
        AnonymousClass14t E;
        int B;
        AnonymousClass0Zc H;
        String str3;
        AnonymousClass0MI anonymousClass0MI;
        AnonymousClass14s F;
        AnonymousClass0MI D2;
        AnonymousClass3at anonymousClass3at;
        boolean z;
        boolean z2;
        float f;
        float f2;
        double d;
        AnonymousClass3Um anonymousClass3Um;
        boolean z3;
        boolean z4;
        int i;
        AnonymousClass3aj anonymousClass3aj;
        AnonymousClass5Ca anonymousClass5Ca;
        AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) obj;
        AnonymousClass5x3 anonymousClass5x3 = this.f18578B;
        AnonymousClass14s F2 = anonymousClass5x3.f70247B.F(anonymousClass0Pj);
        boolean z5 = AnonymousClass0SS.m4337B().f4920B.getBoolean(anonymousClass0Pj.f4136H, false);
        Object obj3 = (anonymousClass0Pj.m3888l() && AnonymousClass0nL.m7653B().m7655B(anonymousClass0Pj.f4134F)) ? 1 : null;
        Object obj4 = (!anonymousClass0Pj.m3888l() || anonymousClass0Pj.f4134F.f4042q == 0) ? null : 1;
        if (anonymousClass0Pj.m3889m()) {
            if (!PendingMediaStore.m3537C().f3787B.containsKey(anonymousClass0Pj.f4135G.UB)) {
                obj2 = 1;
                if (obj3 == null) {
                    if (z5) {
                        if (obj4 != null) {
                            F2.f14083K = AnonymousClass3Um.f41659E;
                        } else if (obj2 != null) {
                            F2.f14083K = AnonymousClass3Um.f41660F;
                        }
                        reboundViewPager = anonymousClass5x3.f70252G.mViewPager;
                        str = null;
                        D = (reboundViewPager != null || reboundViewPager.getCurrentWrappedDataIndex() >= anonymousClass5x3.f70247B.getCount()) ? null : anonymousClass5x3.f70247B.D(reboundViewPager.getCurrentWrappedDataIndex());
                        str2 = AnonymousClass3at.f42534b;
                        if (F2.f14083K != AnonymousClass3Um.f41666L) {
                            str2 = "dashboard";
                        } else {
                            if (F2.f14083K != AnonymousClass3Um.f41664J) {
                                if (F2.f14083K != AnonymousClass3Um.f41669O) {
                                    if (D != null) {
                                        str2 = anonymousClass5x3.A(D);
                                    }
                                }
                            }
                            str2 = anonymousClass5x3.f70255J;
                        }
                        E = anonymousClass5x3.f70247B.E(anonymousClass0Pj.f4136H);
                        B = AnonymousClass0LQ.m2954B(E, D) ^ 1;
                        H = E == null ? E.m9245H() : null;
                        if (E == null) {
                            str3 = E.f14103H.f3394a;
                        } else {
                            str3 = null;
                        }
                        if (E != null) {
                            anonymousClass0MI = E.f14103H;
                            F = anonymousClass5x3.f70247B.F(anonymousClass0Pj);
                            anonymousClass5x3.f70251F.K("reel_playback_navigation", anonymousClass0MI, anonymousClass0Pj, str3, H, F.f14083K, anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J) ? AnonymousClass3ar.f42524F : AnonymousClass3ar.f42523E, str2, F.f14090R, F.f14074B, F.f14087O, F.f14089Q, F.f14078F, Collections.unmodifiableMap(F.f14086N), Collections.unmodifiableMap(F.f14085M), Collections.unmodifiableMap(F.f14075C), Collections.unmodifiableMap(F.f14088P), F.f14092T, F.f14093U);
                        }
                        if (E != null) {
                            D2 = AnonymousClass0MB.m3078C(anonymousClass5x3.f70256K).m3085D(anonymousClass0Pj.f4136H);
                        } else {
                            D2 = E.f14103H;
                        }
                        if (D2 == null) {
                            anonymousClass3at = anonymousClass5x3.f70251F;
                            z = F2.f14081I;
                            z2 = F2.f14095W;
                            f = F2.f14090R;
                            f2 = F2.f14074B;
                            d = F2.f14087O;
                            anonymousClass3Um = F2.f14083K;
                            z3 = anonymousClass5x3.f70247B.G(D2) != anonymousClass5x3.f70247B.getCount() - 1;
                            if (B == 0) {
                                if (anonymousClass5x3.f70248C.isResumed()) {
                                    z4 = false;
                                    z5 = true;
                                    i = 0;
                                    anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                                }
                            }
                            z4 = true;
                            z5 = true;
                            i = 0;
                            anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                        } else {
                            z5 = true;
                            i = 0;
                        }
                        if (!(anonymousClass5x3.f70250E || B == 0 || E == null || !E.f14102G || !anonymousClass0Pj.m3882f() || E.f14098C)) {
                            if (AnonymousClass0xM.AD_DESTINATION_APP_STORE.equals(((AnonymousClass0vq) anonymousClass0Pj.f4134F.m3791u().get(i)).f12147F)) {
                                switch (F2.f14083K.ordinal()) {
                                    case 0:
                                        str = "121231282027134";
                                        break;
                                    case 2:
                                        str = "202809247109408";
                                        break;
                                    case 4:
                                        str = "235063170559712";
                                        break;
                                }
                                if (str != null) {
                                    anonymousClass5x3.f70250E = z5;
                                    AnonymousClass0SZ.m4356B(anonymousClass5x3.f70248C.getActivity(), anonymousClass5x3.f70256K, str);
                                }
                            }
                        }
                        F2.f14086N.clear();
                        F2.f14085M.clear();
                        F2.f14075C.clear();
                        F2.f14088P.clear();
                        if (F2.f14083K != AnonymousClass3Um.f41669O) {
                            AnonymousClass14s.m9231B(F2, 5);
                            anonymousClass3aj = F2.f14082J;
                            if (anonymousClass3aj != null) {
                                anonymousClass5Ca = anonymousClass3aj.f42496Q;
                                if (anonymousClass5Ca != null) {
                                    anonymousClass3aj.f42481B = false;
                                    AnonymousClass5Cb.B(anonymousClass5Ca, false);
                                }
                            }
                        }
                        F2.f14084L.clear();
                        F2.f14083K = AnonymousClass3Um.f41669O;
                        F2.f14074B = 0.0f;
                        F2.f14090R = 0.0f;
                        F2.f14087O = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
                        F2.f14089Q = 0;
                        F2.f14078F = false;
                        F2.f14094V = false;
                        F2.f14079G = false;
                        F2.f14092T = null;
                        F2.f14093U = null;
                    }
                }
                F2.f14083K = anonymousClass0Pj.eY() ? AnonymousClass3Um.f41662H : AnonymousClass3Um.f41661G;
                reboundViewPager = anonymousClass5x3.f70252G.mViewPager;
                str = null;
                if (reboundViewPager != null) {
                }
                str2 = AnonymousClass3at.f42534b;
                if (F2.f14083K != AnonymousClass3Um.f41666L) {
                    if (F2.f14083K != AnonymousClass3Um.f41664J) {
                        if (F2.f14083K != AnonymousClass3Um.f41669O) {
                            if (D != null) {
                                str2 = anonymousClass5x3.A(D);
                            }
                        }
                    }
                    str2 = anonymousClass5x3.f70255J;
                } else {
                    str2 = "dashboard";
                }
                E = anonymousClass5x3.f70247B.E(anonymousClass0Pj.f4136H);
                B = AnonymousClass0LQ.m2954B(E, D) ^ 1;
                if (E == null) {
                }
                if (E == null) {
                    str3 = null;
                } else {
                    str3 = E.f14103H.f3394a;
                }
                if (E != null) {
                    anonymousClass0MI = E.f14103H;
                    F = anonymousClass5x3.f70247B.F(anonymousClass0Pj);
                    if (anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J)) {
                    }
                    anonymousClass5x3.f70251F.K("reel_playback_navigation", anonymousClass0MI, anonymousClass0Pj, str3, H, F.f14083K, anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J) ? AnonymousClass3ar.f42524F : AnonymousClass3ar.f42523E, str2, F.f14090R, F.f14074B, F.f14087O, F.f14089Q, F.f14078F, Collections.unmodifiableMap(F.f14086N), Collections.unmodifiableMap(F.f14085M), Collections.unmodifiableMap(F.f14075C), Collections.unmodifiableMap(F.f14088P), F.f14092T, F.f14093U);
                }
                if (E != null) {
                    D2 = E.f14103H;
                } else {
                    D2 = AnonymousClass0MB.m3078C(anonymousClass5x3.f70256K).m3085D(anonymousClass0Pj.f4136H);
                }
                if (D2 == null) {
                    z5 = true;
                    i = 0;
                } else {
                    anonymousClass3at = anonymousClass5x3.f70251F;
                    z = F2.f14081I;
                    z2 = F2.f14095W;
                    f = F2.f14090R;
                    f2 = F2.f14074B;
                    d = F2.f14087O;
                    anonymousClass3Um = F2.f14083K;
                    if (anonymousClass5x3.f70247B.G(D2) != anonymousClass5x3.f70247B.getCount() - 1) {
                    }
                    if (B == 0) {
                        if (anonymousClass5x3.f70248C.isResumed()) {
                            z4 = false;
                            z5 = true;
                            i = 0;
                            anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                        }
                    }
                    z4 = true;
                    z5 = true;
                    i = 0;
                    anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                }
                if (AnonymousClass0xM.AD_DESTINATION_APP_STORE.equals(((AnonymousClass0vq) anonymousClass0Pj.f4134F.m3791u().get(i)).f12147F)) {
                    switch (F2.f14083K.ordinal()) {
                        case 0:
                            str = "121231282027134";
                            break;
                        case 2:
                            str = "202809247109408";
                            break;
                        case 4:
                            str = "235063170559712";
                            break;
                    }
                    if (str != null) {
                        anonymousClass5x3.f70250E = z5;
                        AnonymousClass0SZ.m4356B(anonymousClass5x3.f70248C.getActivity(), anonymousClass5x3.f70256K, str);
                    }
                }
                F2.f14086N.clear();
                F2.f14085M.clear();
                F2.f14075C.clear();
                F2.f14088P.clear();
                if (F2.f14083K != AnonymousClass3Um.f41669O) {
                    AnonymousClass14s.m9231B(F2, 5);
                    anonymousClass3aj = F2.f14082J;
                    if (anonymousClass3aj != null) {
                        anonymousClass5Ca = anonymousClass3aj.f42496Q;
                        if (anonymousClass5Ca != null) {
                            anonymousClass3aj.f42481B = false;
                            AnonymousClass5Cb.B(anonymousClass5Ca, false);
                        }
                    }
                }
                F2.f14084L.clear();
                F2.f14083K = AnonymousClass3Um.f41669O;
                F2.f14074B = 0.0f;
                F2.f14090R = 0.0f;
                F2.f14087O = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
                F2.f14089Q = 0;
                F2.f14078F = false;
                F2.f14094V = false;
                F2.f14079G = false;
                F2.f14092T = null;
                F2.f14093U = null;
            }
        }
        obj2 = null;
        if (obj3 == null) {
            if (z5) {
                if (obj4 != null) {
                    F2.f14083K = AnonymousClass3Um.f41659E;
                } else if (obj2 != null) {
                    F2.f14083K = AnonymousClass3Um.f41660F;
                }
                reboundViewPager = anonymousClass5x3.f70252G.mViewPager;
                str = null;
                if (reboundViewPager != null) {
                }
                str2 = AnonymousClass3at.f42534b;
                if (F2.f14083K != AnonymousClass3Um.f41666L) {
                    str2 = "dashboard";
                } else {
                    if (F2.f14083K != AnonymousClass3Um.f41664J) {
                        if (F2.f14083K != AnonymousClass3Um.f41669O) {
                            if (D != null) {
                                str2 = anonymousClass5x3.A(D);
                            }
                        }
                    }
                    str2 = anonymousClass5x3.f70255J;
                }
                E = anonymousClass5x3.f70247B.E(anonymousClass0Pj.f4136H);
                B = AnonymousClass0LQ.m2954B(E, D) ^ 1;
                if (E == null) {
                }
                if (E == null) {
                    str3 = E.f14103H.f3394a;
                } else {
                    str3 = null;
                }
                if (E != null) {
                    anonymousClass0MI = E.f14103H;
                    F = anonymousClass5x3.f70247B.F(anonymousClass0Pj);
                    if (anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J)) {
                    }
                    anonymousClass5x3.f70251F.K("reel_playback_navigation", anonymousClass0MI, anonymousClass0Pj, str3, H, F.f14083K, anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J) ? AnonymousClass3ar.f42524F : AnonymousClass3ar.f42523E, str2, F.f14090R, F.f14074B, F.f14087O, F.f14089Q, F.f14078F, Collections.unmodifiableMap(F.f14086N), Collections.unmodifiableMap(F.f14085M), Collections.unmodifiableMap(F.f14075C), Collections.unmodifiableMap(F.f14088P), F.f14092T, F.f14093U);
                }
                if (E != null) {
                    D2 = AnonymousClass0MB.m3078C(anonymousClass5x3.f70256K).m3085D(anonymousClass0Pj.f4136H);
                } else {
                    D2 = E.f14103H;
                }
                if (D2 == null) {
                    anonymousClass3at = anonymousClass5x3.f70251F;
                    z = F2.f14081I;
                    z2 = F2.f14095W;
                    f = F2.f14090R;
                    f2 = F2.f14074B;
                    d = F2.f14087O;
                    anonymousClass3Um = F2.f14083K;
                    if (anonymousClass5x3.f70247B.G(D2) != anonymousClass5x3.f70247B.getCount() - 1) {
                    }
                    if (B == 0) {
                        if (anonymousClass5x3.f70248C.isResumed()) {
                            z4 = false;
                            z5 = true;
                            i = 0;
                            anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                        }
                    }
                    z4 = true;
                    z5 = true;
                    i = 0;
                    anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                } else {
                    z5 = true;
                    i = 0;
                }
                if (AnonymousClass0xM.AD_DESTINATION_APP_STORE.equals(((AnonymousClass0vq) anonymousClass0Pj.f4134F.m3791u().get(i)).f12147F)) {
                    switch (F2.f14083K.ordinal()) {
                        case 0:
                            str = "121231282027134";
                            break;
                        case 2:
                            str = "202809247109408";
                            break;
                        case 4:
                            str = "235063170559712";
                            break;
                    }
                    if (str != null) {
                        anonymousClass5x3.f70250E = z5;
                        AnonymousClass0SZ.m4356B(anonymousClass5x3.f70248C.getActivity(), anonymousClass5x3.f70256K, str);
                    }
                }
                F2.f14086N.clear();
                F2.f14085M.clear();
                F2.f14075C.clear();
                F2.f14088P.clear();
                if (F2.f14083K != AnonymousClass3Um.f41669O) {
                    AnonymousClass14s.m9231B(F2, 5);
                    anonymousClass3aj = F2.f14082J;
                    if (anonymousClass3aj != null) {
                        anonymousClass5Ca = anonymousClass3aj.f42496Q;
                        if (anonymousClass5Ca != null) {
                            anonymousClass3aj.f42481B = false;
                            AnonymousClass5Cb.B(anonymousClass5Ca, false);
                        }
                    }
                }
                F2.f14084L.clear();
                F2.f14083K = AnonymousClass3Um.f41669O;
                F2.f14074B = 0.0f;
                F2.f14090R = 0.0f;
                F2.f14087O = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
                F2.f14089Q = 0;
                F2.f14078F = false;
                F2.f14094V = false;
                F2.f14079G = false;
                F2.f14092T = null;
                F2.f14093U = null;
            }
        }
        if (anonymousClass0Pj.eY()) {
        }
        F2.f14083K = anonymousClass0Pj.eY() ? AnonymousClass3Um.f41662H : AnonymousClass3Um.f41661G;
        reboundViewPager = anonymousClass5x3.f70252G.mViewPager;
        str = null;
        if (reboundViewPager != null) {
        }
        str2 = AnonymousClass3at.f42534b;
        if (F2.f14083K != AnonymousClass3Um.f41666L) {
            if (F2.f14083K != AnonymousClass3Um.f41664J) {
                if (F2.f14083K != AnonymousClass3Um.f41669O) {
                    if (D != null) {
                        str2 = anonymousClass5x3.A(D);
                    }
                }
            }
            str2 = anonymousClass5x3.f70255J;
        } else {
            str2 = "dashboard";
        }
        E = anonymousClass5x3.f70247B.E(anonymousClass0Pj.f4136H);
        B = AnonymousClass0LQ.m2954B(E, D) ^ 1;
        if (E == null) {
        }
        if (E == null) {
            str3 = null;
        } else {
            str3 = E.f14103H.f3394a;
        }
        if (E != null) {
            anonymousClass0MI = E.f14103H;
            F = anonymousClass5x3.f70247B.F(anonymousClass0Pj);
            if (anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J)) {
            }
            anonymousClass5x3.f70251F.K("reel_playback_navigation", anonymousClass0MI, anonymousClass0Pj, str3, H, F.f14083K, anonymousClass5x3.f70256K.m1037B().equals(anonymousClass0Pj.f4138J) ? AnonymousClass3ar.f42524F : AnonymousClass3ar.f42523E, str2, F.f14090R, F.f14074B, F.f14087O, F.f14089Q, F.f14078F, Collections.unmodifiableMap(F.f14086N), Collections.unmodifiableMap(F.f14085M), Collections.unmodifiableMap(F.f14075C), Collections.unmodifiableMap(F.f14088P), F.f14092T, F.f14093U);
        }
        if (E != null) {
            D2 = E.f14103H;
        } else {
            D2 = AnonymousClass0MB.m3078C(anonymousClass5x3.f70256K).m3085D(anonymousClass0Pj.f4136H);
        }
        if (D2 == null) {
            z5 = true;
            i = 0;
        } else {
            anonymousClass3at = anonymousClass5x3.f70251F;
            z = F2.f14081I;
            z2 = F2.f14095W;
            f = F2.f14090R;
            f2 = F2.f14074B;
            d = F2.f14087O;
            anonymousClass3Um = F2.f14083K;
            if (anonymousClass5x3.f70247B.G(D2) != anonymousClass5x3.f70247B.getCount() - 1) {
            }
            if (B == 0) {
                if (anonymousClass5x3.f70248C.isResumed()) {
                    z4 = false;
                    z5 = true;
                    i = 0;
                    anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
                }
            }
            z4 = true;
            z5 = true;
            i = 0;
            anonymousClass3at.D(D2, anonymousClass0Pj, z, z2, f, f2, d, anonymousClass3Um, z3, z4, anonymousClass5x3.f70249D);
        }
        if (AnonymousClass0xM.AD_DESTINATION_APP_STORE.equals(((AnonymousClass0vq) anonymousClass0Pj.f4134F.m3791u().get(i)).f12147F)) {
            switch (F2.f14083K.ordinal()) {
                case 0:
                    str = "121231282027134";
                    break;
                case 2:
                    str = "202809247109408";
                    break;
                case 4:
                    str = "235063170559712";
                    break;
            }
            if (str != null) {
                anonymousClass5x3.f70250E = z5;
                AnonymousClass0SZ.m4356B(anonymousClass5x3.f70248C.getActivity(), anonymousClass5x3.f70256K, str);
            }
        }
        F2.f14086N.clear();
        F2.f14085M.clear();
        F2.f14075C.clear();
        F2.f14088P.clear();
        if (F2.f14083K != AnonymousClass3Um.f41669O) {
            AnonymousClass14s.m9231B(F2, 5);
            anonymousClass3aj = F2.f14082J;
            if (anonymousClass3aj != null) {
                anonymousClass5Ca = anonymousClass3aj.f42496Q;
                if (anonymousClass5Ca != null) {
                    anonymousClass3aj.f42481B = false;
                    AnonymousClass5Cb.B(anonymousClass5Ca, false);
                }
            }
        }
        F2.f14084L.clear();
        F2.f14083K = AnonymousClass3Um.f41669O;
        F2.f14074B = 0.0f;
        F2.f14090R = 0.0f;
        F2.f14087O = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        F2.f14089Q = 0;
        F2.f14078F = false;
        F2.f14094V = false;
        F2.f14079G = false;
        F2.f14092T = null;
        F2.f14093U = null;
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        Object obj2;
        AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) obj;
        AnonymousClass5x3 anonymousClass5x3 = this.f18578B;
        anonymousClass5x3.f70251F.E(anonymousClass5x3.f70247B.D(i), i, anonymousClass5x3.f70249D, anonymousClass5x3.f70247B.F(anonymousClass0Pj).f14082J);
        AnonymousClass0rK B = AnonymousClass0rK.m7951B(anonymousClass5x3.f70256K);
        AnonymousClass0Qf anonymousClass0Qf = anonymousClass5x3.f70254I;
        String str = anonymousClass5x3.f70253H;
        Object obj3 = null;
        if (anonymousClass0Qf != AnonymousClass0Qf.MAIN_FEED_TRAY) {
            if (anonymousClass0Qf != AnonymousClass0Qf.PUSH_NOTIFICATION || !"story_daily_digest".equals(str)) {
                obj2 = null;
                if (!(anonymousClass0Pj.eY() || anonymousClass0Pj.f4138J.equals(B.f11175C.m1037B()) || anonymousClass0Pj.f4133E || !anonymousClass0Pj.m3888l())) {
                    obj3 = 1;
                }
                if (obj2 != null && r3 != null) {
                    B.f11174B = System.currentTimeMillis();
                    return;
                }
            }
        }
        obj2 = 1;
        obj3 = 1;
        if (obj2 != null) {
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass0Pj C = ((AnonymousClass14t) this.f18579C.getItem(i)).m9240C();
        if (!C.m3886j()) {
            anonymousClass0wM.tWA(AnonymousClass3ao.B(C.getId(), C.f4136H), C, i);
        }
    }
}

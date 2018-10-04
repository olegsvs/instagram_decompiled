package com.instagram.ui.swipenavigation;

import X.AnonymousClass0CC;
import X.AnonymousClass0CL;
import X.AnonymousClass0EE;
import X.AnonymousClass0Ht;
import X.AnonymousClass0IL;
import X.AnonymousClass0IU;
import X.AnonymousClass0Iz;
import X.AnonymousClass0LH;
import X.AnonymousClass0QP;
import X.AnonymousClass0bo;
import X.AnonymousClass0bq;
import X.AnonymousClass0br;
import X.AnonymousClass0c0;
import X.AnonymousClass0c6;
import X.AnonymousClass0cB;
import X.AnonymousClass0cD;
import X.AnonymousClass0cE;
import X.AnonymousClass0cF;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ct;
import X.AnonymousClass0cv;
import X.AnonymousClass0dF;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass0e9;
import X.AnonymousClass0eA;
import X.AnonymousClass1Kw;
import X.AnonymousClass25u;
import X.AnonymousClass3DU;
import X.AnonymousClass3jF;
import X.AnonymousClass42A;
import android.content.Context;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.mainactivity.MainActivity;

public class SwipeNavigationContainer extends FrameLayout implements AnonymousClass0QP, AnonymousClass0cB, OnGestureListener {
    /* renamed from: f */
    private static final AnonymousClass0e5 f7022f = AnonymousClass0e5.m6189C(40.0d, 8.0d);
    /* renamed from: B */
    public AnonymousClass0cv f7023B;
    /* renamed from: C */
    public final RectF f7024C;
    /* renamed from: D */
    public AnonymousClass0Ht f7025D;
    /* renamed from: E */
    public AnonymousClass0cv f7026E;
    /* renamed from: F */
    public boolean f7027F;
    /* renamed from: G */
    public final AnonymousClass0cN f7028G;
    /* renamed from: H */
    public AnonymousClass0cv f7029H;
    /* renamed from: I */
    private String f7030I;
    /* renamed from: J */
    private AnonymousClass0cD f7031J;
    /* renamed from: K */
    private boolean f7032K;
    /* renamed from: L */
    private boolean f7033L;
    /* renamed from: M */
    private float f7034M;
    /* renamed from: N */
    private float f7035N;
    /* renamed from: O */
    private float f7036O;
    /* renamed from: P */
    private final GestureDetector f7037P;
    /* renamed from: Q */
    private boolean f7038Q;
    /* renamed from: R */
    private final boolean f7039R;
    /* renamed from: S */
    private float f7040S;
    /* renamed from: T */
    private float f7041T;
    /* renamed from: U */
    private String f7042U;
    /* renamed from: V */
    private AnonymousClass0cE f7043V;
    /* renamed from: W */
    private final int f7044W;
    /* renamed from: X */
    private final AnonymousClass0eA f7045X;
    /* renamed from: Y */
    private float f7046Y;
    /* renamed from: Z */
    private boolean f7047Z;
    /* renamed from: a */
    private AnonymousClass0e9 f7048a;
    /* renamed from: b */
    private String f7049b;
    /* renamed from: c */
    private final float f7050c;
    /* renamed from: d */
    private float f7051d;
    /* renamed from: e */
    private final int f7052e;

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new AnonymousClass1Kw();
        /* renamed from: B */
        public final float f7704B;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7704B = parcel.readFloat();
        }

        public SavedState(Parcelable parcelable, float f) {
            super(parcelable);
            this.f7704B = f;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f7704B);
        }
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 1) != 0;
    }

    public SwipeNavigationContainer(Context context) {
        this(context, null);
    }

    public SwipeNavigationContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeNavigationContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7042U = "none";
        this.f7041T = Float.MAX_VALUE;
        this.f7024C = new RectF();
        this.f7037P = new GestureDetector(context, this);
        this.f7050c = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.f7044W = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        AnonymousClass0cN C = AnonymousClass0e6.m6190B().m6193C();
        C.f7108F = true;
        AnonymousClass0cN O = C.m5770O(f7022f);
        O.f7105C = 0.0010000000474974513d;
        O.f7110H = 1.0d;
        this.f7028G = O;
        this.f7052e = ((Integer) AnonymousClass0CC.Wh.m845G()).intValue();
        this.f7039R = AnonymousClass0e8.m6200D(context);
        this.f7048a = null;
        this.f7045X = new AnonymousClass0eA(this);
    }

    /* renamed from: A */
    public final void m5735A(float f) {
        float f2;
        String str;
        if (this.f7039R) {
            f = -f;
        }
        this.f7028G.m5771P((double) f);
        if (this.f7027F) {
            f2 = this.f7023B.f7278E;
            str = "tap_partially_visible_panel";
        } else {
            str = "swipe";
            AnonymousClass0cv startMostEnabledPanel = getStartMostEnabledPanel();
            AnonymousClass0cv endMostEnabledPanel = getEndMostEnabledPanel();
            float E = (float) this.f7028G.m5760E();
            if (E > endMostEnabledPanel.f7278E) {
                f2 = endMostEnabledPanel.f7278E;
            } else if (E < startMostEnabledPanel.f7278E) {
                f2 = startMostEnabledPanel.f7278E;
            } else if (f > 0.0f) {
                f2 = ((float) Math.floor((double) E)) + 1.0f;
            } else if (f < 0.0f) {
                f2 = ((float) Math.ceil((double) E)) - 1.0f;
            } else {
                f2 = (float) Math.round(E);
            }
        }
        if (!(m5730F(this.f7034M, true) == f2 || this.f7043V == null || this.f7048a != null)) {
            this.f7048a = new AnonymousClass0e9(f2, "swipe");
            AnonymousClass0cE anonymousClass0cE = this.f7043V;
            AnonymousClass0cF.m5739C(anonymousClass0cE.f7067B.f2668M, this.f7048a.f7585B, this.f7048a.f7586C, false);
        }
        setInternalPosition(AnonymousClass3jF.B().B(f2).A(true).C(str).ID());
        this.f7027F = false;
    }

    /* renamed from: B */
    public static void m5726B(SwipeNavigationContainer swipeNavigationContainer) {
        SwipeNavigationContainer swipeNavigationContainer2 = swipeNavigationContainer;
        int width = swipeNavigationContainer2.getWidth();
        float G = m5731G(swipeNavigationContainer2, true);
        AnonymousClass0cv startMostEnabledPanel = swipeNavigationContainer2.getStartMostEnabledPanel();
        AnonymousClass0cv endMostEnabledPanel = swipeNavigationContainer2.getEndMostEnabledPanel();
        int width2 = startMostEnabledPanel.f7280G.getWidth();
        float width3 = (float) endMostEnabledPanel.f7280G.getWidth();
        float f = (float) (-width2);
        float f2 = (float) width;
        float min = Math.min(Math.max(G * f2, (float) ((int) (f - (((float) width2) * startMostEnabledPanel.f7277D)))), (float) ((int) (width3 + (endMostEnabledPanel.f7277D * width3))));
        float f3 = startMostEnabledPanel.f7279F * (f - min);
        View view = startMostEnabledPanel.f7280G;
        if (swipeNavigationContainer2.f7039R) {
            f3 = -f3;
        }
        view.setTranslationX(f3);
        swipeNavigationContainer2.f7023B.f7280G.setTranslationX(swipeNavigationContainer2.f7023B.f7279F * (swipeNavigationContainer2.f7039R ? min : -min));
        f3 = endMostEnabledPanel.f7279F * ((Math.abs(endMostEnabledPanel.f7278E) * f2) - min);
        view = endMostEnabledPanel.f7280G;
        if (swipeNavigationContainer2.f7039R) {
            f3 = -f3;
        }
        view.setTranslationX(f3);
        if (G != swipeNavigationContainer2.f7041T) {
            swipeNavigationContainer2.f7041T = G;
            if (swipeNavigationContainer2.f7043V != null) {
                float f4;
                float H;
                int ceil;
                AnonymousClass0EE anonymousClass0EE;
                AnonymousClass0c0 anonymousClass0c0;
                AnonymousClass0br anonymousClass0br;
                AnonymousClass0dF anonymousClass0dF;
                AnonymousClass3DU anonymousClass3DU;
                AnonymousClass0br anonymousClass0br2;
                AnonymousClass0dF anonymousClass0dF2;
                AnonymousClass0IU H2;
                AnonymousClass0IL anonymousClass0IL;
                AnonymousClass0IL anonymousClass0IL2;
                AnonymousClass0bo anonymousClass0bo;
                AnonymousClass0IL E;
                AnonymousClass0bq anonymousClass0bq;
                boolean z;
                float f5;
                AnonymousClass0ct anonymousClass0ct;
                MainActivity mainActivity;
                AnonymousClass0c0 anonymousClass0c02;
                if (G < startMostEnabledPanel.f7278E) {
                    f4 = startMostEnabledPanel.f7278E;
                    H = m5732H(startMostEnabledPanel, swipeNavigationContainer2.f7023B, G);
                    ceil = (int) Math.ceil((double) (((float) startMostEnabledPanel.f7280G.getWidth()) * (startMostEnabledPanel.f7278E - G)));
                } else if (G > endMostEnabledPanel.f7278E) {
                    f4 = endMostEnabledPanel.f7278E;
                    H = m5732H(swipeNavigationContainer2.f7023B, endMostEnabledPanel, G);
                    ceil = (int) Math.ceil((double) (((float) endMostEnabledPanel.f7280G.getWidth()) * (G - endMostEnabledPanel.f7278E)));
                } else {
                    f4 = G;
                    H = 0.0f;
                    ceil = 0;
                }
                AnonymousClass0cE anonymousClass0cE = swipeNavigationContainer2.f7043V;
                swipeNavigationContainer = swipeNavigationContainer2.f7039R ? -min : min;
                String str = swipeNavigationContainer2.f7042U;
                AnonymousClass0cD anonymousClass0cD = swipeNavigationContainer2.f7031J;
                String str2 = swipeNavigationContainer2.f7030I;
                String str3 = swipeNavigationContainer2.f7049b;
                anonymousClass0cE.f7067B.f2658C = (float) Math.round(f4);
                AnonymousClass0IU H3 = anonymousClass0cE.f7067B.f2662G.f6981B.f6954C.m5694H();
                float f6 = anonymousClass0cE.f7067B.f2663H;
                if (anonymousClass0cE.f7067B.f2667L != null) {
                    anonymousClass0EE = anonymousClass0cE.f7067B.f2667L.f6876G;
                } else {
                    anonymousClass0EE = null;
                }
                AnonymousClass0EE anonymousClass0EE2 = anonymousClass0cE.f7067B.f2661F;
                AnonymousClass0bq anonymousClass0bq2 = anonymousClass0cE.f7068C;
                AnonymousClass0IL E2 = H3.mo1453E(C0164R.id.layout_container_main);
                if (f6 != f4) {
                    if (f6 == anonymousClass0bq2.mo1417G() && anonymousClass0EE != null) {
                        AnonymousClass0Iz.f2854L.m2408K(anonymousClass0EE, H3.mo1456H() + 1, str);
                    } else if (anonymousClass0EE2 != null && f6 == anonymousClass0bq2.mo1415E()) {
                        AnonymousClass0Iz.f2854L.m2408K(anonymousClass0EE2, H3.mo1456H() + 1, str);
                    } else if (f6 == anonymousClass0bq2.mo1416F()) {
                        AnonymousClass0Iz.f2854L.m2408K((AnonymousClass0EE) E2, H3.mo1456H(), str);
                    }
                }
                AnonymousClass0c6 anonymousClass0c6 = anonymousClass0cE.f7067B.f2662G;
                if (f4 > 0.0f) {
                    anonymousClass0c0 = anonymousClass0c6.f6996Q;
                    if (!(anonymousClass0c0 == null || anonymousClass0c6.f6981B == anonymousClass0c0)) {
                        if (anonymousClass0c0 != null) {
                            anonymousClass0c6.f6981B.f6954C.m5688B();
                            if (!anonymousClass0c0.f6956E) {
                                AnonymousClass0c0.m5671B(anonymousClass0c0);
                                anonymousClass0c6.f6987H.un(anonymousClass0c0);
                            }
                            anonymousClass0c0.f6958G = true;
                            anonymousClass0c0.f6954C.m5694H().mo1452D();
                            anonymousClass0c0.f6954C.m5689C();
                            AnonymousClass0LH.m2924B(true ^ anonymousClass0c6.f6997R);
                            anonymousClass0c6.f6981B = anonymousClass0c0;
                        }
                        if (!(anonymousClass0cD == null || anonymousClass0cE.f7067B.f2667L == null)) {
                            anonymousClass0br = anonymousClass0cE.f7067B.f2667L;
                            anonymousClass0dF = anonymousClass0br.f6876G;
                            if (anonymousClass0dF == null) {
                                anonymousClass0br.f6872C = anonymousClass0cD;
                            } else if (anonymousClass0cD != null) {
                                switch (anonymousClass0cD.ordinal()) {
                                    case 1:
                                        anonymousClass3DU = AnonymousClass3DU.f39300Y;
                                        break;
                                    case 2:
                                        anonymousClass3DU = AnonymousClass3DU.f39293R;
                                        break;
                                    case 3:
                                        anonymousClass3DU = AnonymousClass3DU.f39290O;
                                        break;
                                    case 4:
                                        anonymousClass3DU = AnonymousClass3DU.f39296U;
                                        break;
                                    case 5:
                                        anonymousClass3DU = AnonymousClass3DU.f39292Q;
                                        break;
                                    case 6:
                                        anonymousClass3DU = AnonymousClass3DU.f39298W;
                                        break;
                                    case 9:
                                        anonymousClass3DU = AnonymousClass3DU.f39294S;
                                        break;
                                    default:
                                        anonymousClass3DU = AnonymousClass3DU.f39295T;
                                        break;
                                }
                                anonymousClass0dF.f7369I.L(anonymousClass3DU, anonymousClass0dF.f7382V.f53919W);
                            }
                        }
                        if (!(str2 == null || anonymousClass0cE.f7067B.f2667L == null)) {
                            anonymousClass0br2 = anonymousClass0cE.f7067B.f2667L;
                            anonymousClass0dF2 = anonymousClass0br2.f6876G;
                            if (anonymousClass0dF2 == null) {
                                anonymousClass0br2.f6871B = str2;
                            } else if (str2 != null) {
                                anonymousClass0dF2.f7367G.m6249J(str2, null, str3);
                            }
                        }
                        anonymousClass0cE.f7067B.f2668M.m5631C(swipeNavigationContainer, f4, H, str);
                        H2 = anonymousClass0cE.f7067B.f2662G.f6981B.f6954C.m5694H();
                        anonymousClass0IL = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0IL2 = anonymousClass0cE.f7067B.f2661F;
                        anonymousClass0bo = anonymousClass0cE.f7067B.f2668M;
                        E = H2.mo1453E(C0164R.id.layout_container_main);
                        anonymousClass0bq = anonymousClass0bo.f6866D;
                        G = anonymousClass0bo.f6865C;
                        z = true;
                        if (anonymousClass0IL2 != null) {
                            anonymousClass0IL2.setUserVisibleHint(anonymousClass0bq.mo1412B(G) != 1.0f);
                        }
                        if (anonymousClass0IL != null) {
                            anonymousClass0IL.setUserVisibleHint(anonymousClass0bq.mo1414D(G) != 1.0f);
                        }
                        if (E != null) {
                            if (anonymousClass0bq.mo1413C(G) != 1.0f) {
                                z = false;
                            }
                            E.setUserVisibleHint(z);
                        }
                        f5 = anonymousClass0cE.f7067B.f2659D;
                        anonymousClass0ct = anonymousClass0cE.f7067B.f2660E;
                        mainActivity = anonymousClass0cE.f7067B;
                        AnonymousClass0cF.m5740D(ceil, H, f5, anonymousClass0ct, mainActivity, mainActivity.f2671P, anonymousClass0cE.f7067B.f2657B);
                        anonymousClass0cE.f7067B.f2663H = f4;
                    }
                }
                if (f4 < 0.0f) {
                    anonymousClass0c02 = anonymousClass0c6.f6981B;
                    anonymousClass0c0 = anonymousClass0c6.f6989J;
                    if (anonymousClass0c02 != anonymousClass0c0) {
                        if (anonymousClass0c0 != null) {
                            anonymousClass0c6.f6981B.f6954C.m5688B();
                            if (anonymousClass0c0.f6956E) {
                                AnonymousClass0c0.m5671B(anonymousClass0c0);
                                anonymousClass0c6.f6987H.un(anonymousClass0c0);
                            }
                            anonymousClass0c0.f6958G = true;
                            anonymousClass0c0.f6954C.m5694H().mo1452D();
                            anonymousClass0c0.f6954C.m5689C();
                            AnonymousClass0LH.m2924B(true ^ anonymousClass0c6.f6997R);
                            anonymousClass0c6.f6981B = anonymousClass0c0;
                        }
                        anonymousClass0br = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0dF = anonymousClass0br.f6876G;
                        if (anonymousClass0dF == null) {
                            anonymousClass0br.f6872C = anonymousClass0cD;
                        } else if (anonymousClass0cD != null) {
                            switch (anonymousClass0cD.ordinal()) {
                                case 1:
                                    anonymousClass3DU = AnonymousClass3DU.f39300Y;
                                    break;
                                case 2:
                                    anonymousClass3DU = AnonymousClass3DU.f39293R;
                                    break;
                                case 3:
                                    anonymousClass3DU = AnonymousClass3DU.f39290O;
                                    break;
                                case 4:
                                    anonymousClass3DU = AnonymousClass3DU.f39296U;
                                    break;
                                case 5:
                                    anonymousClass3DU = AnonymousClass3DU.f39292Q;
                                    break;
                                case 6:
                                    anonymousClass3DU = AnonymousClass3DU.f39298W;
                                    break;
                                case 9:
                                    anonymousClass3DU = AnonymousClass3DU.f39294S;
                                    break;
                                default:
                                    anonymousClass3DU = AnonymousClass3DU.f39295T;
                                    break;
                            }
                            anonymousClass0dF.f7369I.L(anonymousClass3DU, anonymousClass0dF.f7382V.f53919W);
                        }
                        anonymousClass0br2 = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0dF2 = anonymousClass0br2.f6876G;
                        if (anonymousClass0dF2 == null) {
                            anonymousClass0br2.f6871B = str2;
                        } else if (str2 != null) {
                            anonymousClass0dF2.f7367G.m6249J(str2, null, str3);
                        }
                        anonymousClass0cE.f7067B.f2668M.m5631C(swipeNavigationContainer, f4, H, str);
                        H2 = anonymousClass0cE.f7067B.f2662G.f6981B.f6954C.m5694H();
                        anonymousClass0IL = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0IL2 = anonymousClass0cE.f7067B.f2661F;
                        anonymousClass0bo = anonymousClass0cE.f7067B.f2668M;
                        E = H2.mo1453E(C0164R.id.layout_container_main);
                        anonymousClass0bq = anonymousClass0bo.f6866D;
                        G = anonymousClass0bo.f6865C;
                        z = true;
                        if (anonymousClass0IL2 != null) {
                            if (anonymousClass0bq.mo1412B(G) != 1.0f) {
                            }
                            anonymousClass0IL2.setUserVisibleHint(anonymousClass0bq.mo1412B(G) != 1.0f);
                        }
                        if (anonymousClass0IL != null) {
                            if (anonymousClass0bq.mo1414D(G) != 1.0f) {
                            }
                            anonymousClass0IL.setUserVisibleHint(anonymousClass0bq.mo1414D(G) != 1.0f);
                        }
                        if (E != null) {
                            if (anonymousClass0bq.mo1413C(G) != 1.0f) {
                                z = false;
                            }
                            E.setUserVisibleHint(z);
                        }
                        f5 = anonymousClass0cE.f7067B.f2659D;
                        anonymousClass0ct = anonymousClass0cE.f7067B.f2660E;
                        mainActivity = anonymousClass0cE.f7067B;
                        AnonymousClass0cF.m5740D(ceil, H, f5, anonymousClass0ct, mainActivity, mainActivity.f2671P, anonymousClass0cE.f7067B.f2657B);
                        anonymousClass0cE.f7067B.f2663H = f4;
                    }
                }
                if (f4 == 0.0f) {
                    anonymousClass0c02 = anonymousClass0c6.f6981B;
                    anonymousClass0c0 = anonymousClass0c6.f6985F;
                    if (anonymousClass0c02 != anonymousClass0c0) {
                        if (anonymousClass0c0 != null) {
                            anonymousClass0c6.f6981B.f6954C.m5688B();
                            if (anonymousClass0c0.f6956E) {
                                AnonymousClass0c0.m5671B(anonymousClass0c0);
                                anonymousClass0c6.f6987H.un(anonymousClass0c0);
                            }
                            anonymousClass0c0.f6958G = true;
                            anonymousClass0c0.f6954C.m5694H().mo1452D();
                            anonymousClass0c0.f6954C.m5689C();
                            AnonymousClass0LH.m2924B(true ^ anonymousClass0c6.f6997R);
                            anonymousClass0c6.f6981B = anonymousClass0c0;
                        }
                        anonymousClass0br = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0dF = anonymousClass0br.f6876G;
                        if (anonymousClass0dF == null) {
                            anonymousClass0br.f6872C = anonymousClass0cD;
                        } else if (anonymousClass0cD != null) {
                            switch (anonymousClass0cD.ordinal()) {
                                case 1:
                                    anonymousClass3DU = AnonymousClass3DU.f39300Y;
                                    break;
                                case 2:
                                    anonymousClass3DU = AnonymousClass3DU.f39293R;
                                    break;
                                case 3:
                                    anonymousClass3DU = AnonymousClass3DU.f39290O;
                                    break;
                                case 4:
                                    anonymousClass3DU = AnonymousClass3DU.f39296U;
                                    break;
                                case 5:
                                    anonymousClass3DU = AnonymousClass3DU.f39292Q;
                                    break;
                                case 6:
                                    anonymousClass3DU = AnonymousClass3DU.f39298W;
                                    break;
                                case 9:
                                    anonymousClass3DU = AnonymousClass3DU.f39294S;
                                    break;
                                default:
                                    anonymousClass3DU = AnonymousClass3DU.f39295T;
                                    break;
                            }
                            anonymousClass0dF.f7369I.L(anonymousClass3DU, anonymousClass0dF.f7382V.f53919W);
                        }
                        anonymousClass0br2 = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0dF2 = anonymousClass0br2.f6876G;
                        if (anonymousClass0dF2 == null) {
                            anonymousClass0br2.f6871B = str2;
                        } else if (str2 != null) {
                            anonymousClass0dF2.f7367G.m6249J(str2, null, str3);
                        }
                        anonymousClass0cE.f7067B.f2668M.m5631C(swipeNavigationContainer, f4, H, str);
                        H2 = anonymousClass0cE.f7067B.f2662G.f6981B.f6954C.m5694H();
                        anonymousClass0IL = anonymousClass0cE.f7067B.f2667L;
                        anonymousClass0IL2 = anonymousClass0cE.f7067B.f2661F;
                        anonymousClass0bo = anonymousClass0cE.f7067B.f2668M;
                        E = H2.mo1453E(C0164R.id.layout_container_main);
                        anonymousClass0bq = anonymousClass0bo.f6866D;
                        G = anonymousClass0bo.f6865C;
                        z = true;
                        if (anonymousClass0IL2 != null) {
                            if (anonymousClass0bq.mo1412B(G) != 1.0f) {
                            }
                            anonymousClass0IL2.setUserVisibleHint(anonymousClass0bq.mo1412B(G) != 1.0f);
                        }
                        if (anonymousClass0IL != null) {
                            if (anonymousClass0bq.mo1414D(G) != 1.0f) {
                            }
                            anonymousClass0IL.setUserVisibleHint(anonymousClass0bq.mo1414D(G) != 1.0f);
                        }
                        if (E != null) {
                            if (anonymousClass0bq.mo1413C(G) != 1.0f) {
                                z = false;
                            }
                            E.setUserVisibleHint(z);
                        }
                        f5 = anonymousClass0cE.f7067B.f2659D;
                        anonymousClass0ct = anonymousClass0cE.f7067B.f2660E;
                        mainActivity = anonymousClass0cE.f7067B;
                        AnonymousClass0cF.m5740D(ceil, H, f5, anonymousClass0ct, mainActivity, mainActivity.f2671P, anonymousClass0cE.f7067B.f2657B);
                        anonymousClass0cE.f7067B.f2663H = f4;
                    }
                }
                anonymousClass0c0 = null;
                if (anonymousClass0c0 != null) {
                    anonymousClass0c6.f6981B.f6954C.m5688B();
                    if (anonymousClass0c0.f6956E) {
                        AnonymousClass0c0.m5671B(anonymousClass0c0);
                        anonymousClass0c6.f6987H.un(anonymousClass0c0);
                    }
                    anonymousClass0c0.f6958G = true;
                    anonymousClass0c0.f6954C.m5694H().mo1452D();
                    anonymousClass0c0.f6954C.m5689C();
                    AnonymousClass0LH.m2924B(true ^ anonymousClass0c6.f6997R);
                    anonymousClass0c6.f6981B = anonymousClass0c0;
                }
                anonymousClass0br = anonymousClass0cE.f7067B.f2667L;
                anonymousClass0dF = anonymousClass0br.f6876G;
                if (anonymousClass0dF == null) {
                    anonymousClass0br.f6872C = anonymousClass0cD;
                } else if (anonymousClass0cD != null) {
                    switch (anonymousClass0cD.ordinal()) {
                        case 1:
                            anonymousClass3DU = AnonymousClass3DU.f39300Y;
                            break;
                        case 2:
                            anonymousClass3DU = AnonymousClass3DU.f39293R;
                            break;
                        case 3:
                            anonymousClass3DU = AnonymousClass3DU.f39290O;
                            break;
                        case 4:
                            anonymousClass3DU = AnonymousClass3DU.f39296U;
                            break;
                        case 5:
                            anonymousClass3DU = AnonymousClass3DU.f39292Q;
                            break;
                        case 6:
                            anonymousClass3DU = AnonymousClass3DU.f39298W;
                            break;
                        case 9:
                            anonymousClass3DU = AnonymousClass3DU.f39294S;
                            break;
                        default:
                            anonymousClass3DU = AnonymousClass3DU.f39295T;
                            break;
                    }
                    anonymousClass0dF.f7369I.L(anonymousClass3DU, anonymousClass0dF.f7382V.f53919W);
                }
                anonymousClass0br2 = anonymousClass0cE.f7067B.f2667L;
                anonymousClass0dF2 = anonymousClass0br2.f6876G;
                if (anonymousClass0dF2 == null) {
                    anonymousClass0br2.f6871B = str2;
                } else if (str2 != null) {
                    anonymousClass0dF2.f7367G.m6249J(str2, null, str3);
                }
                anonymousClass0cE.f7067B.f2668M.m5631C(swipeNavigationContainer, f4, H, str);
                H2 = anonymousClass0cE.f7067B.f2662G.f6981B.f6954C.m5694H();
                anonymousClass0IL = anonymousClass0cE.f7067B.f2667L;
                anonymousClass0IL2 = anonymousClass0cE.f7067B.f2661F;
                anonymousClass0bo = anonymousClass0cE.f7067B.f2668M;
                E = H2.mo1453E(C0164R.id.layout_container_main);
                anonymousClass0bq = anonymousClass0bo.f6866D;
                G = anonymousClass0bo.f6865C;
                z = true;
                if (anonymousClass0IL2 != null) {
                    if (anonymousClass0bq.mo1412B(G) != 1.0f) {
                    }
                    anonymousClass0IL2.setUserVisibleHint(anonymousClass0bq.mo1412B(G) != 1.0f);
                }
                if (anonymousClass0IL != null) {
                    if (anonymousClass0bq.mo1414D(G) != 1.0f) {
                    }
                    anonymousClass0IL.setUserVisibleHint(anonymousClass0bq.mo1414D(G) != 1.0f);
                }
                if (E != null) {
                    if (anonymousClass0bq.mo1413C(G) != 1.0f) {
                        z = false;
                    }
                    E.setUserVisibleHint(z);
                }
                f5 = anonymousClass0cE.f7067B.f2659D;
                anonymousClass0ct = anonymousClass0cE.f7067B.f2660E;
                mainActivity = anonymousClass0cE.f7067B;
                AnonymousClass0cF.m5740D(ceil, H, f5, anonymousClass0ct, mainActivity, mainActivity.f2671P, anonymousClass0cE.f7067B.f2657B);
                anonymousClass0cE.f7067B.f2663H = f4;
            }
        }
        if (swipeNavigationContainer2.f7039R) {
            G = Math.max(min, 0.0f);
            f2 = Math.min(f2, min + f2);
        } else {
            G = Math.max(-min, 0.0f);
            f2 = Math.min(f2, f2 - min);
        }
        swipeNavigationContainer2.f7024C.set(G, 0.0f, f2, (float) swipeNavigationContainer2.getHeight());
    }

    /* renamed from: C */
    private static void m5727C(int i, AnonymousClass0cv anonymousClass0cv) {
        anonymousClass0cv.f7280G.getLayoutParams().width = Math.min((int) (Math.abs(anonymousClass0cv.f7278E) * ((float) i)), anonymousClass0cv.f7276C);
    }

    /* renamed from: D */
    private boolean m5728D(View view, boolean z, float f, int i, int i2, int i3) {
        if (z) {
            AnonymousClass0cv anonymousClass0cv = this.f7029H;
            if (anonymousClass0cv == null || anonymousClass0cv.f7280G != view || f == this.f7029H.f7278E) {
                anonymousClass0cv = this.f7026E;
                if (anonymousClass0cv == null || anonymousClass0cv.f7280G != view || f == this.f7026E.f7278E) {
                    if (this.f7023B.f7280G == view && f != this.f7023B.f7278E) {
                    }
                }
            }
            return false;
        }
        return AnonymousClass25u.B(view, z, i, i2, i3);
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        AnonymousClass0CL.m884C("igcam_swipe_anim", 0);
    }

    /* renamed from: E */
    private void m5729E(MotionEvent motionEvent) {
        if (!this.f7033L) {
            if (!this.f7032K) {
                float abs = Math.abs(this.f7035N - motionEvent.getRawX());
                float abs2 = Math.abs(this.f7036O - motionEvent.getRawY());
                Object obj = null;
                Object obj2 = abs > this.f7050c ? 1 : null;
                if (abs2 > this.f7050c) {
                    obj = 1;
                }
                double toDegrees = Math.toDegrees(Math.atan((double) Math.abs(abs2 / abs)));
                if (obj != null && toDegrees >= ((double) (((float) this.f7052e) / 2.0f))) {
                    this.f7033L = true;
                } else if (obj2 != null && toDegrees < ((double) (((float) this.f7052e) / 2.0f))) {
                    this.f7032K = true;
                }
            }
        }
    }

    /* renamed from: F */
    private float m5730F(float f, boolean z) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            AnonymousClass0cv startMostEnabledPanel = getStartMostEnabledPanel();
            if (z) {
                f2 = startMostEnabledPanel.f7277D;
            }
            return (float) AnonymousClass0dh.m6102B((double) f, (double) (startMostEnabledPanel.f7278E - f2), (double) this.f7023B.f7278E);
        }
        AnonymousClass0cv endMostEnabledPanel = getEndMostEnabledPanel();
        if (z) {
            f2 = endMostEnabledPanel.f7277D;
        }
        return (float) AnonymousClass0dh.m6102B((double) f, (double) this.f7023B.f7278E, (double) (endMostEnabledPanel.f7278E + f2));
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        m5726B(this);
    }

    /* renamed from: G */
    private static float m5731G(SwipeNavigationContainer swipeNavigationContainer, boolean z) {
        return swipeNavigationContainer.m5730F((float) swipeNavigationContainer.f7028G.m5760E(), z);
    }

    /* renamed from: H */
    private static float m5732H(AnonymousClass0cv anonymousClass0cv, AnonymousClass0cv anonymousClass0cv2, float f) {
        float f2;
        float f3;
        if (f > anonymousClass0cv2.f7278E) {
            f2 = anonymousClass0cv2.f7278E;
            f3 = anonymousClass0cv2.f7278E + anonymousClass0cv2.f7277D;
        } else {
            f2 = anonymousClass0cv.f7278E - anonymousClass0cv.f7277D;
            f3 = anonymousClass0cv.f7278E;
        }
        return (float) AnonymousClass0dh.m6102B((double) ((float) AnonymousClass0dh.m6103C((double) f, (double) f2, (double) f3, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0)), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
    }

    /* renamed from: I */
    private boolean m5733I() {
        float G = m5731G(this, true);
        if (G == this.f7023B.f7278E || G == getStartMostEnabledPanel().f7278E) {
            return true;
        }
        if (G == getEndMostEnabledPanel().f7278E) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private boolean m5734J(float f, float f2) {
        return this.f7024C.width() < ((float) getWidth()) && this.f7024C.contains(f, f2);
    }

    private AnonymousClass0cv getEndMostEnabledPanel() {
        AnonymousClass0cv anonymousClass0cv = this.f7026E;
        if (anonymousClass0cv != null) {
            if (anonymousClass0cv.f7275B) {
                return this.f7026E;
            }
        }
        return this.f7023B;
    }

    public int getNestedScrollAxes() {
        return this.f7045X.f7587B;
    }

    public float getPosition() {
        return m5731G(this, true);
    }

    private AnonymousClass0cv getStartMostEnabledPanel() {
        AnonymousClass0cv anonymousClass0cv = this.f7029H;
        if (anonymousClass0cv != null) {
            if (anonymousClass0cv.f7275B) {
                return this.f7029H;
            }
        }
        return this.f7023B;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 972910576);
        super.onAttachedToWindow();
        this.f7028G.m5756A(this);
        m5726B(this);
        AnonymousClass0cQ.m5865O(this, 1531959936, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -182695494);
        super.onDetachedFromWindow();
        this.f7028G.m5765J(this);
        AnonymousClass0cQ.m5865O(this, 1549773247, N);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f7051d = Math.min(-f, (float) this.f7044W) / ((float) getWidth());
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        View view = this;
        if (actionMasked == 0) {
            float width;
            Object obj;
            AnonymousClass0cE anonymousClass0cE;
            AnonymousClass0e9 anonymousClass0e9;
            this.f7032K = false;
            this.f7033L = false;
            this.f7051d = 0.0f;
            this.f7034M = m5731G(this, true);
            this.f7035N = motionEvent.getRawX();
            this.f7036O = motionEvent.getRawY();
            this.f7040S = motionEvent.getRawX();
            this.f7028G.m5766K();
            this.f7027F = false;
            if (m5733I()) {
                this.f7047Z = false;
                if (m5734J(this.f7035N, this.f7036O)) {
                }
                width = this.f7024C.width();
                obj = (width > 0.0f || width >= ((float) getWidth())) ? null : 1;
                if (obj == null) {
                    anonymousClass0cE = this.f7043V;
                    if (anonymousClass0cE != null) {
                        return z;
                    }
                    anonymousClass0e9 = this.f7048a;
                    if (anonymousClass0e9 != null) {
                        return z;
                    }
                    AnonymousClass0cF.m5739C(anonymousClass0cE.f7067B.f2668M, anonymousClass0e9.f7585B, this.f7048a.f7586C, true);
                    return z;
                }
                this.f7048a = null;
                return z;
            }
            this.f7047Z = true;
            z = true;
            width = this.f7024C.width();
            if (width > 0.0f) {
            }
            if (obj == null) {
                this.f7048a = null;
                return z;
            }
            anonymousClass0cE = this.f7043V;
            if (anonymousClass0cE != null) {
                return z;
            }
            anonymousClass0e9 = this.f7048a;
            if (anonymousClass0e9 != null) {
                return z;
            }
            AnonymousClass0cF.m5739C(anonymousClass0cE.f7067B.f2668M, anonymousClass0e9.f7585B, this.f7048a.f7586C, true);
            return z;
        } else if (actionMasked != 2) {
            return false;
        } else {
            m5729E(motionEvent);
            if (!this.f7032K) {
                return false;
            }
            if ((this.f7025D.mY() ? m5728D(view, false, m5731G(this, true), (int) (motionEvent.getRawX() - this.f7040S), (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) ^ 1 : 0) == 0) {
                return false;
            }
            view.f7040S = motionEvent.getRawX();
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m5726B(this);
        this.f7031J = null;
        this.f7030I = null;
        this.f7049b = null;
    }

    public final void onMeasure(int i, int i2) {
        int max = Math.max(0, (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight());
        AnonymousClass0cv anonymousClass0cv = this.f7029H;
        if (anonymousClass0cv != null) {
            m5727C(max, anonymousClass0cv);
        }
        anonymousClass0cv = this.f7026E;
        if (anonymousClass0cv != null) {
            m5727C(max, anonymousClass0cv);
        }
        super.onMeasure(i, i2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (getPosition() != this.f7046Y && this.f7025D.mY()) {
            iArr[0] = i;
            setInternalPosition(AnonymousClass3jF.B().B(((float) this.f7028G.m5760E()) + (((float) iArr[0]) / ((float) getWidth()))).A(false).C("swipe").ID());
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        boolean z = this.f7038Q | (i != 0 ? 1 : 0);
        this.f7038Q = z;
        if (!z && i3 != 0 && this.f7025D.mY()) {
            setInternalPosition(AnonymousClass3jF.B().B(((float) this.f7028G.m5760E()) + (((float) i3) / ((float) getWidth()))).A(false).C("swipe").ID());
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f7045X.m6201A(view, view2, i);
        this.f7046Y = getPosition();
        this.f7038Q = false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f7028G.m5767L((double) savedState.f7704B);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getPosition());
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f7033L) {
            return false;
        }
        if (this.f7047Z) {
            f /= (float) getWidth();
            AnonymousClass42A B = AnonymousClass3jF.B();
            float E = (float) this.f7028G.m5760E();
            if (this.f7039R) {
                f = -f;
            }
            setInternalPosition(B.B(E + f).A(false).C("swipe").ID());
            return true;
        }
        this.f7047Z = true;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!m5734J(motionEvent.getRawX(), motionEvent.getRawY())) {
            return false;
        }
        this.f7027F = true;
        return true;
    }

    public final void onStopNestedScroll(View view) {
        this.f7045X.m6202B(view);
        m5735A(0.0f);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, 805481628);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (getChildCount() != 0) {
            if (this.f7025D.mY()) {
                int actionMasked;
                if (!this.f7037P.onTouchEvent(motionEvent)) {
                    if (!onTouchEvent) {
                        onTouchEvent = false;
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 1 || actionMasked == 3) {
                            m5735A(this.f7051d);
                        }
                        AnonymousClass0cQ.m5862L(this, -135379567, M);
                        return onTouchEvent;
                    }
                }
                onTouchEvent = true;
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                }
                m5735A(this.f7051d);
                AnonymousClass0cQ.m5862L(this, -135379567, M);
                return onTouchEvent;
            }
        }
        AnonymousClass0cQ.m5862L(this, -411788747, M);
        return onTouchEvent;
    }

    private void setInternalPosition(AnonymousClass3jF anonymousClass3jF) {
        AnonymousClass0CL.m883B("igcam_swipe_anim", 0);
        this.f7042U = anonymousClass3jF.f43693G;
        this.f7031J = anonymousClass3jF.f43690D;
        this.f7030I = anonymousClass3jF.f43688B;
        this.f7049b = anonymousClass3jF.f43692F;
        float F = m5730F(anonymousClass3jF.f43691E, true);
        if (anonymousClass3jF.f43689C) {
            this.f7028G.m5769N((double) F);
        } else {
            this.f7028G.m5767L((double) F);
        }
    }

    public void setListener(AnonymousClass0cE anonymousClass0cE) {
        if (this.f7043V != anonymousClass0cE) {
            this.f7043V = anonymousClass0cE;
            this.f7041T = Float.MAX_VALUE;
        }
    }

    public void setPosition(AnonymousClass3jF anonymousClass3jF) {
        AnonymousClass0cE anonymousClass0cE = this.f7043V;
        if (anonymousClass0cE != null) {
            AnonymousClass0cF.m5739C(anonymousClass0cE.f7067B.f2668M, anonymousClass3jF.f43691E, anonymousClass3jF.f43693G, false);
        }
        setInternalPosition(anonymousClass3jF);
    }
}

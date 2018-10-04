package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;

/* renamed from: X.6E6 */
public final class AnonymousClass6E6 implements OnScrollListener, AnonymousClass0Pd {
    /* renamed from: B */
    public int f73070B;
    /* renamed from: C */
    public AnonymousClass0eZ f73071C;
    /* renamed from: D */
    public final int f73072D;
    /* renamed from: E */
    public final Activity f73073E;
    /* renamed from: F */
    public float f73074F;
    /* renamed from: G */
    public Handler f73075G;
    /* renamed from: H */
    public boolean f73076H;
    /* renamed from: I */
    public boolean f73077I;
    /* renamed from: J */
    public AnonymousClass10p f73078J;
    /* renamed from: K */
    public final AnonymousClass0Ie f73079K;
    /* renamed from: L */
    public final Runnable f73080L = new AnonymousClass5kn(this);
    /* renamed from: M */
    public View f73081M;
    /* renamed from: N */
    public RecyclerView f73082N;
    /* renamed from: O */
    public boolean f73083O;
    /* renamed from: P */
    public final AnonymousClass0iW f73084P;
    /* renamed from: Q */
    public int f73085Q;
    /* renamed from: R */
    private int f73086R;
    /* renamed from: S */
    private int f73087S;
    /* renamed from: T */
    private final Context f73088T;
    /* renamed from: U */
    private final AnonymousClass0jv f73089U;
    /* renamed from: V */
    private boolean f73090V;
    /* renamed from: W */
    private final AnonymousClass0hO f73091W;
    /* renamed from: X */
    private AnonymousClass5kw f73092X;
    /* renamed from: Y */
    private final AnonymousClass0Cm f73093Y;

    public AnonymousClass6E6(Context context, Activity activity, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0hO anonymousClass0hO, AnonymousClass0jv anonymousClass0jv, AnonymousClass0iW anonymousClass0iW) {
        this.f73088T = context;
        this.f73073E = activity;
        this.f73093Y = anonymousClass0Cm;
        this.f73079K = anonymousClass0Ie;
        this.f73089U = anonymousClass0jv;
        this.f73091W = anonymousClass0hO;
        this.f73090V = ((Boolean) AnonymousClass0CC.Eg.H(this.f73093Y)).booleanValue();
        this.f73087S = ((Double) AnonymousClass0CC.Jg.H(this.f73093Y)).intValue();
        this.f73086R = ((Double) AnonymousClass0CC.Gg.H(this.f73093Y)).intValue();
        this.f73070B = ((Double) AnonymousClass0CC.Fg.H(this.f73093Y)).intValue();
        this.f73084P = anonymousClass0iW;
        this.f73072D = AnonymousClass0ip.B(context);
        this.f73092X = new AnonymousClass5kw(this.f73088T, this.f73093Y, this.f73089U, this);
        this.f73083O = true;
        this.f73075G = new Handler(Looper.getMainLooper());
    }

    /* renamed from: A */
    public final void m29560A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f73090V) {
            View inflate = layoutInflater.inflate(C0164R.layout.stories_tray_persistent, viewGroup, false);
            this.f73081M = inflate;
            this.f73082N = (RecyclerView) inflate.findViewById(C0164R.id.stories_tray_recycler_view);
            this.f73091W.f8402R = this.f73082N;
            this.f73078J = this.f73082N.getItemAnimator();
            if (this.f73085Q == 0) {
                this.f73081M.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass5ko(this));
            }
            this.f73082N.D(new AnonymousClass5kp(this));
        }
    }

    /* renamed from: B */
    public static void m29551B(AnonymousClass6E6 anonymousClass6E6, float f) {
        AnonymousClass0ot anonymousClass0ot;
        if (f != 0.0f) {
            if (f != 1.0f) {
                anonymousClass6E6.f73082N.post(new AnonymousClass5kt(anonymousClass6E6));
                anonymousClass0ot = (AnonymousClass0ot) anonymousClass6E6.f73082N.getAdapter();
                anonymousClass0ot.f10421C = f;
                anonymousClass0ot.notifyDataSetChanged();
                anonymousClass6E6.f73074F = f;
            }
        }
        anonymousClass6E6.f73082N.post(new AnonymousClass5ks(anonymousClass6E6));
        anonymousClass0ot = (AnonymousClass0ot) anonymousClass6E6.f73082N.getAdapter();
        anonymousClass0ot.f10421C = f;
        anonymousClass0ot.notifyDataSetChanged();
        anonymousClass6E6.f73074F = f;
    }

    /* renamed from: B */
    public final void m29561B(View view) {
        this.f73084P.D((float) this.f73072D, null, new View[]{view});
    }

    /* renamed from: C */
    public static void m29552C(AnonymousClass6E6 anonymousClass6E6) {
        if (anonymousClass6E6.f73074F == 1.0f) {
            AnonymousClass6E6.m29557H(anonymousClass6E6, 1.0f, 0.0f);
        }
        anonymousClass6E6.f73075G.removeCallbacksAndMessages(null);
        AnonymousClass0OR.F(anonymousClass6E6.f73075G, anonymousClass6E6.f73080L, (long) anonymousClass6E6.f73070B, -1785340218);
    }

    /* renamed from: D */
    public static float m29553D(AnonymousClass6E6 anonymousClass6E6) {
        return (float) ((-anonymousClass6E6.f73085Q) + anonymousClass6E6.m29559J());
    }

    /* renamed from: E */
    public static float m29554E(AnonymousClass6E6 anonymousClass6E6) {
        return (float) anonymousClass6E6.m29559J();
    }

    /* renamed from: F */
    public static boolean m29555F(AnonymousClass6E6 anonymousClass6E6) {
        return anonymousClass6E6.f73089U.A() == 0.0f;
    }

    /* renamed from: G */
    public static void m29556G(AnonymousClass6E6 anonymousClass6E6) {
        if (anonymousClass6E6.f73081M.getTranslationY() != AnonymousClass6E6.m29554E(anonymousClass6E6)) {
            AnonymousClass6E6.m29558I(anonymousClass6E6, AnonymousClass6E6.m29553D(anonymousClass6E6), AnonymousClass6E6.m29554E(anonymousClass6E6));
        }
    }

    /* renamed from: H */
    public static void m29557H(AnonymousClass6E6 anonymousClass6E6, float f, float f2) {
        if (!anonymousClass6E6.f73076H) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
            ofFloat.addUpdateListener(new AnonymousClass5kq(anonymousClass6E6));
            ofFloat.addListener(new AnonymousClass5kr(anonymousClass6E6));
            ofFloat.setDuration((long) anonymousClass6E6.f73086R);
            ofFloat.start();
        }
    }

    /* renamed from: I */
    public static void m29558I(AnonymousClass6E6 anonymousClass6E6, float f, float f2) {
        if (!anonymousClass6E6.f73077I) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
            ofFloat.addUpdateListener(new AnonymousClass5ku(anonymousClass6E6));
            ofFloat.addListener(new AnonymousClass5kv(anonymousClass6E6, f2));
            ofFloat.setDuration((long) anonymousClass6E6.f73087S);
            ofFloat.start();
        }
    }

    /* renamed from: J */
    private int m29559J() {
        AnonymousClass0eZ anonymousClass0eZ = this.f73071C;
        return anonymousClass0eZ != null ? anonymousClass0eZ.A() : 0;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 481803566);
        if (this.f73090V && absListView.getChildCount() != 0) {
            if (AnonymousClass0mE.I(this.f73081M)) {
                AnonymousClass0eZ anonymousClass0eZ = this.f73071C;
                if (anonymousClass0eZ != null && (anonymousClass0eZ.f7780K.G() ^ 1) == 0 && this.f73071C.E()) {
                    this.f73081M.setTranslationY((float) m29559J());
                    AnonymousClass0cQ.H(this, 478731342, I);
                    return;
                }
                AnonymousClass5kw anonymousClass5kw = this.f73092X;
                float A = anonymousClass5kw.f68712G.A();
                float f = A - anonymousClass5kw.f68708C;
                float f2;
                if (f > 0.0f) {
                    f2 = anonymousClass5kw.f68711F;
                    if (f > f2) {
                        anonymousClass5kw.f68711F = 0.0f;
                        anonymousClass5kw.f68710E = 2;
                    } else {
                        anonymousClass5kw.f68711F = f2 - f;
                        anonymousClass5kw.f68710E = 0;
                    }
                } else if (f < 0.0f) {
                    float f3 = -f;
                    f2 = anonymousClass5kw.f68713H;
                    if (f3 > f2) {
                        anonymousClass5kw.f68713H = 0.0f;
                        anonymousClass5kw.f68710E = 1;
                    } else {
                        anonymousClass5kw.f68713H = f2 + f;
                        anonymousClass5kw.f68710E = 0;
                    }
                } else {
                    anonymousClass5kw.f68710E = 0;
                }
                int i4 = anonymousClass5kw.f68710E;
                if (i4 != anonymousClass5kw.f68707B) {
                    AnonymousClass6E6 anonymousClass6E6 = anonymousClass5kw.f68709D;
                    switch (i4) {
                        case 1:
                            AnonymousClass6E6.m29556G(anonymousClass6E6);
                            break;
                        case 2:
                            if (anonymousClass6E6.f73081M.getTranslationY() != AnonymousClass6E6.m29553D(anonymousClass6E6)) {
                                AnonymousClass6E6.m29558I(anonymousClass6E6, AnonymousClass6E6.m29554E(anonymousClass6E6), AnonymousClass6E6.m29553D(anonymousClass6E6));
                            }
                            break;
                        default:
                            break;
                    }
                    anonymousClass5kw.f68713H = anonymousClass5kw.f68715J;
                    anonymousClass5kw.f68711F = anonymousClass5kw.f68714I;
                }
                anonymousClass5kw.f68707B = anonymousClass5kw.f68710E;
                anonymousClass5kw.f68708C = A;
                if (AnonymousClass6E6.m29555F(this)) {
                    AnonymousClass6E6.m29556G(this);
                    AnonymousClass6E6.m29552C(this);
                }
                AnonymousClass0cQ.H(this, -2089902808, I);
                return;
            }
        }
        AnonymousClass0cQ.H(this, 1701141711, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.H(this, -1098750278, AnonymousClass0cQ.I(this, 2095454186));
    }

    public final void sc(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f73081M.getLayoutParams();
        marginLayoutParams.setMargins(0, i, 0, 0);
        this.f73081M.setLayoutParams(marginLayoutParams);
        this.f73084P.H(this.f73079K.getListView(), (AnonymousClass0iA) this.f73079K.getListAdapter(), i + this.f73085Q);
        this.f73084P.F((float) this.f73072D);
    }
}

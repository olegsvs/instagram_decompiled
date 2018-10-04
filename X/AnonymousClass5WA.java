package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5WA */
public final class AnonymousClass5WA extends AnonymousClass0nJ {
    /* renamed from: d */
    public static final String f65547d = "MessageThreadListAdapter";
    /* renamed from: B */
    public AnonymousClass5W9 f65548B = null;
    /* renamed from: C */
    public final AnonymousClass5WP f65549C;
    /* renamed from: D */
    public final AnonymousClass0EE f65550D;
    /* renamed from: E */
    public final ContextThemeWrapper f65551E;
    /* renamed from: F */
    public final Context f65552F;
    /* renamed from: G */
    public final AnonymousClass0Ci f65553G;
    /* renamed from: H */
    public AnonymousClass5W6 f65554H;
    /* renamed from: I */
    public AnonymousClass5WR f65555I;
    /* renamed from: J */
    public final String f65556J;
    /* renamed from: K */
    public AnonymousClass0W7 f65557K;
    /* renamed from: L */
    public final AnonymousClass5WS f65558L;
    /* renamed from: M */
    public final Set f65559M = new HashSet();
    /* renamed from: N */
    public AnonymousClass5WT f65560N;
    /* renamed from: O */
    public AnonymousClass0WF f65561O;
    /* renamed from: P */
    public final AnonymousClass0e5 f65562P = new AnonymousClass0e5(100.0d, 5.0d);
    /* renamed from: Q */
    public final AnonymousClass0e6 f65563Q = AnonymousClass0e6.B();
    /* renamed from: R */
    public final boolean f65564R;
    /* renamed from: S */
    public AnonymousClass4gQ f65565S;
    /* renamed from: T */
    public final AnonymousClass26Y f65566T;
    /* renamed from: U */
    public AnonymousClass4gT f65567U;
    /* renamed from: V */
    public final AnonymousClass0Cm f65568V;
    /* renamed from: W */
    private AnonymousClass5WO f65569W;
    /* renamed from: X */
    private final ContextThemeWrapper f65570X;
    /* renamed from: Y */
    private final AnonymousClass4m8 f65571Y;
    /* renamed from: Z */
    private final AnonymousClass4mA f65572Z;
    /* renamed from: a */
    private final AnonymousClass5bQ f65573a;
    /* renamed from: b */
    private final HashMap f65574b = new HashMap();
    /* renamed from: c */
    private final HashMap f65575c = new HashMap();

    public AnonymousClass5WA(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass4mA anonymousClass4mA, AnonymousClass4m8 anonymousClass4m8, boolean z, String str, AnonymousClass0EE anonymousClass0EE) {
        this.f65552F = context;
        this.f65568V = anonymousClass0Cm;
        this.f65553G = anonymousClass0Cm.B();
        this.f65567U = AnonymousClass4gU.C(this.f65552F, this.f65568V, null);
        this.f65566T = new AnonymousClass26Y(AnonymousClass4gR.class, new AnonymousClass4es(this));
        this.f65573a = anonymousClass5bQ;
        this.f65572Z = anonymousClass4mA;
        this.f65571Y = anonymousClass4m8;
        this.f65564R = z;
        this.f65556J = str;
        this.f65550D = anonymousClass0EE;
        this.f65570X = new ContextThemeWrapper(context, C0164R.style.DirectMessageBordered);
        this.f65551E = new ContextThemeWrapper(context, C0164R.style.DirectMessageBorderless);
        this.f65558L = new AnonymousClass5WS(anonymousClass0Ro);
        this.f65566T.A(this.f65558L);
        this.f65549C = new AnonymousClass5WP(context);
    }

    /* renamed from: B */
    public final int m27279B() {
        return this.f65566T.f26034D;
    }

    /* renamed from: B */
    public static void m27267B(AnonymousClass5WA anonymousClass5WA, AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        if (!TextUtils.isEmpty(anonymousClass0W7.f5885O)) {
            anonymousClass5WA.f65575c.put(anonymousClass0W7.f5885O, anonymousClass5WQ);
        }
        if (!TextUtils.isEmpty(anonymousClass0W7.f5875E)) {
            anonymousClass5WA.f65574b.put(anonymousClass0W7.f5875E, anonymousClass5WQ);
        }
    }

    /* renamed from: C */
    public static AnonymousClass5WQ m27268C(AnonymousClass5WA anonymousClass5WA, String str) {
        if (!anonymousClass5WA.f65575c.containsKey(str)) {
            return anonymousClass5WA.f65574b.containsKey(str) ? (AnonymousClass5WQ) anonymousClass5WA.f65574b.get(str) : null;
        } else {
            AnonymousClass5WQ anonymousClass5WQ = (AnonymousClass5WQ) anonymousClass5WA.f65575c.get(str);
            anonymousClass5WA.f65574b.get(anonymousClass5WQ.f65618B.f5875E);
            return anonymousClass5WQ;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public static X.AnonymousClass5WQ m27269D(X.AnonymousClass5WA r3, X.AnonymousClass0W7 r4) {
        /*
        r1 = r4.f5885O;
        if (r1 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r3.f65575c;
        r2 = r0.get(r1);
        r2 = (X.AnonymousClass5WQ) r2;
        if (r2 == 0) goto L_0x000f;
    L_0x000e:
        return r2;
    L_0x000f:
        r1 = r4.f5875E;
        if (r1 == 0) goto L_0x0026;
    L_0x0013:
        r0 = r3.f65574b;
        r2 = r0.get(r1);
        r2 = (X.AnonymousClass5WQ) r2;
        if (r2 == 0) goto L_0x0026;
    L_0x001d:
        r1 = r4.f5915s;
        r0 = r2.f65618B;
        r0 = r0.f5915s;
        if (r1 != r0) goto L_0x0026;
    L_0x0025:
        goto L_0x000e;
    L_0x0026:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5WA.D(X.5WA, X.0W7):X.5WQ");
    }

    /* renamed from: E */
    public static int m27270E(AnonymousClass5WA anonymousClass5WA, AnonymousClass4gR anonymousClass4gR) {
        int C = AnonymousClass26Y.C(anonymousClass5WA.f65566T, anonymousClass4gR, 4);
        if (C == -1) {
            C = 0;
            int i = anonymousClass5WA.f65566T.f26034D;
            while (C < i) {
                if (anonymousClass5WA.f65566T.D(C) != anonymousClass4gR) {
                    C++;
                }
            }
            return -1;
        }
        return C;
    }

    /* renamed from: F */
    public static boolean m27271F(AnonymousClass5WA anonymousClass5WA) {
        return (AnonymousClass0EF.M(anonymousClass5WA.f65570X) || !((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.DG, anonymousClass5WA.f65568V)).booleanValue()) && ((Boolean) AnonymousClass0CC.YI.H(anonymousClass5WA.f65568V)).booleanValue();
    }

    /* renamed from: G */
    public static int m27272G(AnonymousClass5WA anonymousClass5WA, AnonymousClass5WQ anonymousClass5WQ) {
        int E = AnonymousClass5WA.m27270E(anonymousClass5WA, anonymousClass5WQ);
        AnonymousClass5WA.m27278M(anonymousClass5WA, anonymousClass5WQ);
        if (E == -1) {
            return -1;
        }
        AnonymousClass26Y anonymousClass26Y = anonymousClass5WA.f65566T;
        anonymousClass26Y.D(E);
        AnonymousClass26Y.D(anonymousClass26Y, E, true);
        return E;
    }

    /* renamed from: H */
    public static void m27273H(AnonymousClass5WA anonymousClass5WA, int i, int i2, long j) {
        int max = Math.max(i, 0);
        for (int min = Math.min(i2, anonymousClass5WA.f65566T.f26034D) - 1; min >= max; min--) {
            AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) anonymousClass5WA.f65566T.D(min);
            if (((anonymousClass4gR instanceof AnonymousClass1Sz) || (anonymousClass4gR instanceof AnonymousClass5WH)) && anonymousClass4gR.zS() != j) {
                AnonymousClass26Y anonymousClass26Y = anonymousClass5WA.f65566T;
                anonymousClass26Y.D(min);
                AnonymousClass26Y.D(anonymousClass26Y, min, true);
            }
        }
    }

    /* renamed from: I */
    public static boolean m27274I(AnonymousClass0W7 anonymousClass0W7, AnonymousClass0W7 anonymousClass0W72) {
        if (!AnonymousClass0Tf.f5226B.A(anonymousClass0W7.f5915s).nY()) {
            return false;
        }
        boolean z = true;
        if (anonymousClass0W72 != null) {
            if ((anonymousClass0W7.K() - anonymousClass0W72.K() >= 3600000000L ? 1 : null) == null) {
                long K = anonymousClass0W7.K();
                long K2 = anonymousClass0W72.K();
                Calendar calendar = AnonymousClass4do.f55884B;
                calendar.setTimeInMillis(K / 1000);
                Calendar calendar2 = AnonymousClass4do.f55884B;
                int i = 1;
                int i2 = calendar.get(1);
                int i3 = calendar.get(6);
                calendar.setTimeInMillis(K2 / 1000);
                int i4 = calendar.get(1);
                if (i3 == calendar2.get(6)) {
                    if (i2 == i4) {
                        i = 0;
                    }
                }
                if (i == 0) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: J */
    public static void m27275J(AnonymousClass5WA anonymousClass5WA, int i) {
        if (i >= 0) {
            if (i < anonymousClass5WA.f65566T.f26034D) {
                anonymousClass5WA = anonymousClass5WA.f65566T;
                anonymousClass5WA.F(i, anonymousClass5WA.D(i));
            }
        }
    }

    /* renamed from: K */
    private static View m27276K(ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        return LayoutInflater.from(contextThemeWrapper).inflate(C0164R.layout.message, viewGroup, false);
    }

    /* renamed from: L */
    private static View m27277L(ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        return LayoutInflater.from(contextThemeWrapper).inflate(C0164R.layout.my_message, viewGroup, false);
    }

    /* renamed from: M */
    public final /* bridge */ /* synthetic */ void m27282M(AnonymousClass0oo anonymousClass0oo) {
        AnonymousClass4gA anonymousClass4gA = (AnonymousClass4gA) anonymousClass0oo;
        int E = anonymousClass4gA.E();
        if (E >= 0 && E < this.f65566T.f26034D) {
            AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) this.f65566T.D(E);
            if (anonymousClass4gR instanceof AnonymousClass5WQ) {
                ((AnonymousClass5WQ) anonymousClass4gR).f65628L = false;
            }
        }
        anonymousClass4gA.Z();
        anonymousClass4gA.f56220C = null;
        super.M(anonymousClass4gA);
    }

    /* renamed from: M */
    private static void m27278M(AnonymousClass5WA anonymousClass5WA, AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        if (anonymousClass0W7 != null) {
            if (!TextUtils.isEmpty(anonymousClass0W7.f5885O)) {
                anonymousClass5WA.f65575c.remove(anonymousClass0W7.f5885O);
            }
            if (!TextUtils.isEmpty(anonymousClass0W7.f5875E)) {
                anonymousClass5WA.f65574b.remove(anonymousClass0W7.f5875E);
            }
        }
    }

    /* renamed from: P */
    public final AnonymousClass0W7 m27283P(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) this.f65566T.D(i2);
            if (anonymousClass4gR instanceof AnonymousClass5WQ) {
                return ((AnonymousClass5WQ) anonymousClass4gR).f65618B;
            }
        }
        return null;
    }

    /* renamed from: Q */
    public final AnonymousClass0W7 m27284Q() {
        int i = this.f65566T.f26034D;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) this.f65566T.D(i2);
            if (anonymousClass4gR instanceof AnonymousClass5WQ) {
                return ((AnonymousClass5WQ) anonymousClass4gR).f65618B;
            }
        }
        return null;
    }

    /* renamed from: R */
    public final AnonymousClass0W7 m27285R(int i) {
        int i2 = this.f65566T.f26034D;
        while (i < i2) {
            AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) this.f65566T.D(i);
            if (anonymousClass4gR instanceof AnonymousClass5WQ) {
                AnonymousClass0W7 anonymousClass0W7 = ((AnonymousClass5WQ) anonymousClass4gR).f65618B;
                if (!anonymousClass0W7.S(this.f65553G)) {
                    return anonymousClass0W7;
                }
            }
            i++;
        }
        return null;
    }

    /* renamed from: S */
    public final AnonymousClass0W7 m27286S(int i) {
        if (i == -1) {
            return null;
        }
        AnonymousClass5WQ T = m27287T(i);
        if (T == null) {
            return null;
        }
        return T.f65618B;
    }

    /* renamed from: T */
    public final AnonymousClass5WQ m27287T(int i) {
        if (i < 0) {
            return null;
        }
        if (i >= this.f65566T.f26034D) {
            return null;
        }
        AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) this.f65566T.D(i);
        if (anonymousClass4gR instanceof AnonymousClass5WQ) {
            return (AnonymousClass5WQ) anonymousClass4gR;
        }
        return null;
    }

    /* renamed from: U */
    public final int m27288U() {
        int i = this.f65566T.f26034D;
        for (int i2 = 0; i2 < i; i2++) {
            if (((AnonymousClass4gR) this.f65566T.D(i2)) instanceof AnonymousClass5WQ) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: V */
    public final boolean m27289V() {
        if (this.f65574b.isEmpty()) {
            if (this.f65575c.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    public final int m27290W(int i) {
        int i2 = this.f65566T.f26034D;
        for (int i3 = i + 1; i3 < i2; i3++) {
            if (this.f65566T.D(i3) instanceof AnonymousClass5WQ) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: X */
    public final int m27291X(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (this.f65566T.D(i2) instanceof AnonymousClass5WQ) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: Y */
    public final void m27292Y(AnonymousClass4gR anonymousClass4gR) {
        int E = AnonymousClass5WA.m27270E(this, anonymousClass4gR);
        if (E == -1) {
            String str = f65547d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("threadRowData to be updated does not exist in the list.type = ");
            stringBuilder.append(anonymousClass4gR.bT());
            AnonymousClass0Gn.H(str, stringBuilder.toString());
            return;
        }
        this.f65566T.F(E, anonymousClass4gR);
        if (anonymousClass4gR instanceof AnonymousClass5WQ) {
            AnonymousClass5WA.m27267B(this, (AnonymousClass5WQ) anonymousClass4gR);
        }
    }

    /* renamed from: Z */
    public final void m27293Z(int i, int i2) {
        int min = Math.min(i2 + i, this.f65566T.f26034D);
        while (i < min) {
            AnonymousClass4gR anonymousClass4gR = (AnonymousClass4gR) this.f65566T.D(i);
            if (anonymousClass4gR instanceof AnonymousClass5WQ) {
                ((AnonymousClass5WQ) anonymousClass4gR).f65618B.f5882L = false;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void m27294a() {
        AnonymousClass4gQ anonymousClass4gQ = this.f65565S;
        if (anonymousClass4gQ != null && !anonymousClass4gQ.f56243D) {
            if (AnonymousClass5WA.m27271F(this)) {
                if ((this.f65549C.f65616B.B() == 0 ? 1 : null) != null) {
                    this.f65566T.E(this.f65549C);
                } else {
                    this.f65566T.A(this.f65549C);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m27295b(AnonymousClass5WL anonymousClass5WL) {
        if (AnonymousClass5WA.m27271F(this)) {
            int B;
            int B2;
            AnonymousClass4gM anonymousClass4gM = this.f65549C.f65616B;
            AnonymousClass0Sy.C();
            anonymousClass4gM.f56239D.B();
            if (anonymousClass5WL.f65610B == 0) {
                B = AnonymousClass4gM.B(anonymousClass4gM, anonymousClass5WL.f65611C.getId());
                if (B != -1) {
                    AnonymousClass26Y anonymousClass26Y = anonymousClass4gM.f56239D;
                    anonymousClass26Y.D(B);
                    AnonymousClass26Y.D(anonymousClass26Y, B, true);
                }
            } else {
                int B3 = AnonymousClass4gM.B(anonymousClass4gM, anonymousClass5WL.f65611C.getId());
                if (B3 == -1) {
                    anonymousClass4gM.f56239D.A(anonymousClass5WL);
                } else {
                    anonymousClass4gM.f56239D.F(B3, anonymousClass5WL);
                    AnonymousClass26Y anonymousClass26Y2 = anonymousClass4gM.f56239D;
                    Object D = anonymousClass26Y2.D(B3);
                    AnonymousClass26Y.D(anonymousClass26Y2, B3, false);
                    B2 = AnonymousClass26Y.B(anonymousClass26Y2, D, false);
                    if (B3 != B2) {
                        anonymousClass26Y2.f26032B.F(B3, B2);
                    }
                }
            }
            B2 = 0;
            for (B = 0; B < anonymousClass4gM.f56239D.f26034D; B++) {
                if (((AnonymousClass4gP) anonymousClass4gM.f56239D.D(B2)).bT() == 0) {
                    B2++;
                }
            }
            AnonymousClass5WM anonymousClass5WM;
            if (B2 == 0) {
                anonymousClass5WM = anonymousClass4gM.f56237B;
                if (anonymousClass5WM != null) {
                    anonymousClass4gM.f56239D.E(anonymousClass5WM);
                    anonymousClass4gM.f56237B = null;
                }
                AnonymousClass4gM.D(anonymousClass4gM);
            } else if (B2 == 1) {
                AnonymousClass4gM.E(anonymousClass4gM);
                AnonymousClass4gM.C(anonymousClass4gM);
            } else {
                anonymousClass5WM = anonymousClass4gM.f56237B;
                if (anonymousClass5WM != null) {
                    anonymousClass4gM.f56239D.E(anonymousClass5WM);
                    anonymousClass4gM.f56237B = null;
                }
                AnonymousClass4gM.E(anonymousClass4gM);
            }
            anonymousClass4gM.f56239D.C();
            m27294a();
        } else if (anonymousClass5WL.f65610B == 3) {
        } else {
            if (anonymousClass5WL.f65610B != 0) {
                AnonymousClass5WO anonymousClass5WO = this.f65569W;
                if (anonymousClass5WO == null || !AnonymousClass0LQ.B(anonymousClass5WO.f65615B, anonymousClass5WL.f65611C.getId())) {
                    this.f65569W = new AnonymousClass5WO(anonymousClass5WL.f65611C.getId());
                    this.f65566T.A(this.f65569W);
                    return;
                }
                return;
            }
            AnonymousClass5WO anonymousClass5WO2 = this.f65569W;
            if (anonymousClass5WO2 != null) {
                this.f65566T.E(anonymousClass5WO2);
                this.f65569W = null;
            }
        }
    }

    /* renamed from: c */
    public final AnonymousClass4gA m27296c(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new AnonymousClass5W9(LoadMoreButton.B(viewGroup.getContext(), viewGroup, C0164R.layout.thread_message_load_more_empty), this.f65573a);
            case 2:
                return new AnonymousClass5ca(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65573a, this.f65568V, this.f65550D);
            case 3:
                return new AnonymousClass5bh(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65573a, this.f65568V, this.f65550D);
            case 5:
                return new AnonymousClass5WE(LayoutInflater.from(this.f65551E).inflate(C0164R.layout.message_content, viewGroup, false), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 6:
                return new AnonymousClass5cY(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return new AnonymousClass5bf(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 8:
                return new AnonymousClass5cZ(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65572Z, this.f65568V, this.f65550D);
            case 9:
                return new AnonymousClass5bg(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65572Z, this.f65568V, this.f65550D);
            case 10:
                return new AnonymousClass5cR(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 11:
                return new AnonymousClass5bY(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 12:
                return new AnonymousClass5cX(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case ParserMinimalBase.INT_CR /*13*/:
                return new AnonymousClass5be(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 14:
                return new AnonymousClass5cc(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 15:
                return new AnonymousClass5bj(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 16:
                return new AnonymousClass5cU(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65573a, this.f65568V, this.f65550D);
            case 17:
                return new AnonymousClass5bb(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65573a, this.f65568V, this.f65550D);
            case Process.SIGCONT /*18*/:
                return new AnonymousClass5Vv(this.f65568V, LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_action_log, viewGroup, false), this.f65573a);
            case Process.SIGSTOP /*19*/:
                return new AnonymousClass5WF(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_timestamp_separator, viewGroup, false), this.f65573a);
            case Process.SIGTSTP /*20*/:
                return new AnonymousClass5WI(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_username, viewGroup, false), this.f65573a);
            case 21:
                return new AnonymousClass5WC(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_seen_indicator, viewGroup, false), this.f65573a);
            case 22:
                return new AnonymousClass1TD(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 23:
                return new AnonymousClass4fq(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 24:
                return new AnonymousClass5Vw(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_activity_indicator, viewGroup, false), this.f65573a);
            case 25:
                return new AnonymousClass5bc(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 26:
                return new AnonymousClass5cV(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 27:
            case 29:
                return new AnonymousClass5bW(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, false, this.f65556J, this.f65550D);
            case 28:
            case 30:
                return new AnonymousClass5bW(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, true, this.f65556J, this.f65550D);
            case 31:
                return new AnonymousClass5bX(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, false, this.f65550D);
            case 32:
                return new AnonymousClass5bX(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, true, this.f65550D);
            case 33:
                return new AnonymousClass4fc(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return new AnonymousClass5WB(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 35:
                return new AnonymousClass4g3(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 36:
                return new AnonymousClass1ZL(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 37:
                return new AnonymousClass5W8(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_ephemeral_reply_pill, viewGroup, false), this.f65573a);
            case 38:
                return new AnonymousClass5bd(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                return new AnonymousClass5cW(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 40:
                return new AnonymousClass5bi(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 41:
                return new AnonymousClass5cb(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case ParserMinimalBase.INT_ASTERISK /*42*/:
                return new AnonymousClass5Vx(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_activity_indicator_with_presence, viewGroup, false), this.f65573a);
            case 43:
                return new AnonymousClass5WJ(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_action_log, viewGroup, false), this.f65573a, this.f65568V);
            case ParserMinimalBase.INT_COMMA /*44*/:
                return new AnonymousClass5ba(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 45:
                return new AnonymousClass5cT(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 46:
                return new AnonymousClass5W7(this.f65568V, LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_emoji_bar, viewGroup, false), this.f65573a);
            case ParserMinimalBase.INT_SLASH /*47*/:
                return new AnonymousClass5bV(AnonymousClass5WA.m27276K(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 48:
                return new AnonymousClass5cQ(AnonymousClass5WA.m27277L(viewGroup, this.f65570X), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 49:
                return new AnonymousClass5bT(this.f65552F, AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D, this);
            case 50:
                return new AnonymousClass5cO(this.f65552F, AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D, this);
            case 51:
                return new AnonymousClass5bk(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 52:
                return new AnonymousClass5cd(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 53:
                return new AnonymousClass5bl(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 54:
                return new AnonymousClass5ce(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 55:
                return new AnonymousClass5bZ(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 56:
                return new AnonymousClass5cS(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case 57:
                return new AnonymousClass5bm(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65571Y, this.f65568V, this.f65550D);
            case ParserMinimalBase.INT_COLON /*58*/:
                return new AnonymousClass5cf(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65571Y, this.f65568V, this.f65550D);
            case 59:
                return new AnonymousClass5bU(AnonymousClass5WA.m27276K(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            case StartupQEsConfig.DEFAULT_FPS_EXPECTED_FPS /*60*/:
                return new AnonymousClass5cP(AnonymousClass5WA.m27277L(viewGroup, this.f65551E), this.f65567U, this.f65573a, this.f65568V, this.f65550D);
            default:
                String str = f65547d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown thread list item type detected: ");
                stringBuilder.append(i);
                AnonymousClass0Gn.C(str, stringBuilder.toString());
                return new AnonymousClass5WG(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_unknown, viewGroup, false), this.f65573a);
        }
    }

    /* renamed from: d */
    public final boolean m27297d(AnonymousClass0W7 anonymousClass0W7) {
        if (this.f65557K == anonymousClass0W7) {
            return false;
        }
        AnonymousClass0W7 Q = m27284Q();
        if (Q == null || !AnonymousClass0W7.B(anonymousClass0W7, Q)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m27298e() {
        AnonymousClass5W9 anonymousClass5W9 = this.f65548B;
        if (anonymousClass5W9 != null) {
            anonymousClass5W9.f65545B.A(anonymousClass5W9.f65546C);
        }
    }

    public final int getItemViewType(int i) {
        return ((AnonymousClass4gR) this.f65566T.D(i)).bT();
    }
}

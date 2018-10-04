package X;

import android.os.Build.VERSION;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0hg */
public final class AnonymousClass0hg extends AnonymousClass0IV implements AnonymousClass0hh, AnonymousClass1lN {
    /* renamed from: B */
    public boolean f8500B;
    /* renamed from: C */
    public boolean f8501C = true;
    /* renamed from: D */
    public int f8502D;
    /* renamed from: E */
    public CharSequence f8503E;
    /* renamed from: F */
    public int f8504F;
    /* renamed from: G */
    public CharSequence f8505G;
    /* renamed from: H */
    public ArrayList f8506H;
    /* renamed from: I */
    public boolean f8507I;
    /* renamed from: J */
    public int f8508J;
    /* renamed from: K */
    public int f8509K;
    /* renamed from: L */
    public int f8510L = -1;
    /* renamed from: M */
    public final AnonymousClass0cP f8511M;
    /* renamed from: N */
    public String f8512N;
    /* renamed from: O */
    public ArrayList f8513O = new ArrayList();
    /* renamed from: P */
    public int f8514P;
    /* renamed from: Q */
    public int f8515Q;
    /* renamed from: R */
    public boolean f8516R = false;
    /* renamed from: S */
    public ArrayList f8517S;
    /* renamed from: T */
    public ArrayList f8518T;
    /* renamed from: U */
    public int f8519U;
    /* renamed from: V */
    public int f8520V;

    static {
        int i = VERSION.SDK_INT;
    }

    public AnonymousClass0hg(AnonymousClass0cP anonymousClass0cP) {
        this.f8511M = anonymousClass0cP;
    }

    /* renamed from: A */
    public final AnonymousClass0IV mo1610A(int i, AnonymousClass0IL anonymousClass0IL) {
        m6782C(i, anonymousClass0IL, null, 1);
        return this;
    }

    /* renamed from: B */
    public final AnonymousClass0IV mo1611B(int i, AnonymousClass0IL anonymousClass0IL, String str) {
        m6782C(i, anonymousClass0IL, str, 1);
        return this;
    }

    /* renamed from: B */
    public static boolean m6781B(AnonymousClass0m9 anonymousClass0m9) {
        anonymousClass0m9 = anonymousClass0m9.f9723E;
        return (anonymousClass0m9 == null || !anonymousClass0m9.mAdded || anonymousClass0m9.mView == null || anonymousClass0m9.mDetached || anonymousClass0m9.mHidden || !anonymousClass0m9.isPostponed()) ? false : true;
    }

    /* renamed from: C */
    public final AnonymousClass0IV mo1612C(AnonymousClass0IL anonymousClass0IL, String str) {
        m6782C(0, anonymousClass0IL, str, 1);
        return this;
    }

    /* renamed from: C */
    private void m6782C(int i, AnonymousClass0IL anonymousClass0IL, String str, int i2) {
        Class cls = anonymousClass0IL.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(cls.getCanonicalName());
            stringBuilder.append(" must be a public static class to be  properly recreated from");
            stringBuilder.append(" instance state.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        anonymousClass0IL.mFragmentManager = this.f8511M;
        if (str != null) {
            if (anonymousClass0IL.mTag != null) {
                if (!str.equals(anonymousClass0IL.mTag)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change tag of fragment ");
                    stringBuilder.append(anonymousClass0IL);
                    stringBuilder.append(": was ");
                    stringBuilder.append(anonymousClass0IL.mTag);
                    stringBuilder.append(" now ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            anonymousClass0IL.mTag = str;
        }
        if (i != 0) {
            if (i != -1) {
                if (anonymousClass0IL.mFragmentId != 0) {
                    if (anonymousClass0IL.mFragmentId != i) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Can't change container ID of fragment ");
                        stringBuilder.append(anonymousClass0IL);
                        stringBuilder.append(": was ");
                        stringBuilder.append(anonymousClass0IL.mFragmentId);
                        stringBuilder.append(" now ");
                        stringBuilder.append(i);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                anonymousClass0IL.mFragmentId = i;
                anonymousClass0IL.mContainerId = i;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can't add fragment ");
                stringBuilder.append(anonymousClass0IL);
                stringBuilder.append(" with tag ");
                stringBuilder.append(str);
                stringBuilder.append(" to container view with no id");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m6799Q(new AnonymousClass0m9(i2, anonymousClass0IL));
    }

    /* renamed from: D */
    public final AnonymousClass0IV mo1613D(String str) {
        if (this.f8501C) {
            this.f8500B = true;
            this.f8512N = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: E */
    public final AnonymousClass0IV mo1614E(AnonymousClass0IL anonymousClass0IL) {
        m6799Q(new AnonymousClass0m9(7, anonymousClass0IL));
        return this;
    }

    /* renamed from: F */
    public final int mo1615F() {
        return m6801S(false);
    }

    /* renamed from: G */
    public final int mo1616G() {
        return m6801S(true);
    }

    /* renamed from: H */
    public final void mo1617H() {
        m6802T();
        this.f8511M.BA(this, false);
    }

    /* renamed from: I */
    public final void mo1618I() {
        m6802T();
        this.f8511M.BA(this, true);
    }

    /* renamed from: J */
    public final AnonymousClass0IV mo1619J(AnonymousClass0IL anonymousClass0IL) {
        m6799Q(new AnonymousClass0m9(6, anonymousClass0IL));
        return this;
    }

    /* renamed from: K */
    public final AnonymousClass0IV mo1620K(AnonymousClass0IL anonymousClass0IL) {
        m6799Q(new AnonymousClass0m9(4, anonymousClass0IL));
        return this;
    }

    /* renamed from: L */
    public final AnonymousClass0IV mo1621L(AnonymousClass0IL anonymousClass0IL) {
        m6799Q(new AnonymousClass0m9(3, anonymousClass0IL));
        return this;
    }

    /* renamed from: M */
    public final AnonymousClass0IV mo1622M(int i, AnonymousClass0IL anonymousClass0IL) {
        return mo1623N(i, anonymousClass0IL, null);
    }

    /* renamed from: N */
    public final AnonymousClass0IV mo1623N(int i, AnonymousClass0IL anonymousClass0IL, String str) {
        if (i != 0) {
            m6782C(i, anonymousClass0IL, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: O */
    public final AnonymousClass0IV mo1624O(int i, int i2, int i3, int i4) {
        this.f8508J = i;
        this.f8509K = i2;
        this.f8514P = i3;
        this.f8515Q = i4;
        return this;
    }

    /* renamed from: P */
    public final AnonymousClass0IV mo1625P(AnonymousClass0IL anonymousClass0IL) {
        m6799Q(new AnonymousClass0m9(5, anonymousClass0IL));
        return this;
    }

    /* renamed from: Q */
    public final void m6799Q(AnonymousClass0m9 anonymousClass0m9) {
        this.f8513O.add(anonymousClass0m9);
        anonymousClass0m9.f9721C = this.f8508J;
        anonymousClass0m9.f9722D = this.f8509K;
        anonymousClass0m9.f9724F = this.f8514P;
        anonymousClass0m9.f9725G = this.f8515Q;
    }

    /* renamed from: R */
    public final void m6800R(int i) {
        if (this.f8500B) {
            StringBuilder stringBuilder;
            if (AnonymousClass0cP.f7121e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Bump nesting in ");
                stringBuilder.append(this);
                stringBuilder.append(" by ");
                stringBuilder.append(i);
                stringBuilder.toString();
            }
            int size = this.f8513O.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) this.f8513O.get(i2);
                if (anonymousClass0m9.f9723E != null) {
                    AnonymousClass0IL anonymousClass0IL = anonymousClass0m9.f9723E;
                    anonymousClass0IL.mBackStackNesting += i;
                    if (AnonymousClass0cP.f7121e) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Bump nesting of ");
                        stringBuilder.append(anonymousClass0m9.f9723E);
                        stringBuilder.append(" to ");
                        stringBuilder.append(anonymousClass0m9.f9723E.mBackStackNesting);
                        stringBuilder.toString();
                    }
                }
            }
        }
    }

    /* renamed from: S */
    public final int m6801S(boolean z) {
        if (this.f8507I) {
            throw new IllegalStateException("commit already called");
        }
        if (AnonymousClass0cP.f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Commit: ");
            stringBuilder.append(this);
            stringBuilder.toString();
            PrintWriter printWriter = new PrintWriter(new AnonymousClass1mT("FragmentManager"));
            m6803U("  ", printWriter, true);
            printWriter.close();
        }
        this.f8507I = true;
        if (this.f8500B) {
            this.f8510L = this.f8511M.m5821V(this);
        } else {
            this.f8510L = -1;
        }
        this.f8511M.m5851z(this, z);
        return this.f8510L;
    }

    /* renamed from: T */
    public final AnonymousClass0IV m6802T() {
        if (this.f8500B) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8501C = false;
        return this;
    }

    /* renamed from: U */
    public final void m6803U(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8512N);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8510L);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8507I);
            if (this.f8519U != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8519U));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f8520V));
            }
            if (!(this.f8508J == 0 && this.f8509K == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8508J));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8509K));
            }
            if (!(this.f8514P == 0 && this.f8515Q == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8514P));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8515Q));
            }
            if (!(this.f8504F == 0 && this.f8505G == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8504F));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8505G);
            }
            if (!(this.f8502D == 0 && this.f8503E == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8502D));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8503E);
            }
        }
        if (!this.f8513O.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            stringBuilder.toString();
            int size = this.f8513O.size();
            for (int i = 0; i < size; i++) {
                String str2;
                AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) this.f8513O.get(i);
                switch (anonymousClass0m9.f9720B) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("cmd=");
                        stringBuilder2.append(anonymousClass0m9.f9720B);
                        str2 = stringBuilder2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(anonymousClass0m9.f9723E);
                if (z) {
                    if (!(anonymousClass0m9.f9721C == 0 && anonymousClass0m9.f9722D == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(anonymousClass0m9.f9721C));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(anonymousClass0m9.f9722D));
                    }
                    if (anonymousClass0m9.f9724F != 0 || anonymousClass0m9.f9725G != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(anonymousClass0m9.f9724F));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(anonymousClass0m9.f9725G));
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public final void m6804V() {
        int size = this.f8513O.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) this.f8513O.get(i);
            AnonymousClass0IL anonymousClass0IL = anonymousClass0m9.f9723E;
            if (anonymousClass0IL != null) {
                anonymousClass0IL.setNextTransition(this.f8519U, this.f8520V);
            }
            int i2 = anonymousClass0m9.f9720B;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9722D);
                        this.f8511M.NA(anonymousClass0IL);
                        break;
                    case 4:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9722D);
                        AnonymousClass0cP.m5778F(anonymousClass0IL);
                        break;
                    case 5:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9721C);
                        AnonymousClass0cP.m5787O(anonymousClass0IL);
                        break;
                    case 6:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9722D);
                        this.f8511M.m5824Y(anonymousClass0IL);
                        break;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9721C);
                        this.f8511M.m5823X(anonymousClass0IL);
                        break;
                    case 8:
                        this.f8511M.TA(anonymousClass0IL);
                        break;
                    case 9:
                        this.f8511M.TA(null);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(anonymousClass0m9.f9720B);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            anonymousClass0IL.setNextAnim(anonymousClass0m9.f9721C);
            this.f8511M.m5820U(anonymousClass0IL, false);
            if (!(this.f8516R || anonymousClass0m9.f9720B == 1 || anonymousClass0IL == null)) {
                this.f8511M.GA(anonymousClass0IL);
            }
        }
        if (!this.f8516R) {
            AnonymousClass0cP anonymousClass0cP = this.f8511M;
            anonymousClass0cP.HA(anonymousClass0cP.f7133J, true);
        }
    }

    /* renamed from: W */
    public final void m6805W(boolean z) {
        for (int size = this.f8513O.size() - 1; size >= 0; size--) {
            AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) this.f8513O.get(size);
            AnonymousClass0IL anonymousClass0IL = anonymousClass0m9.f9723E;
            if (anonymousClass0IL != null) {
                int i = this.f8519U;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                anonymousClass0IL.setNextTransition(i2, this.f8520V);
            }
            int i3 = anonymousClass0m9.f9720B;
            if (i3 != 1) {
                switch (i3) {
                    case 3:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9724F);
                        this.f8511M.m5820U(anonymousClass0IL, false);
                        break;
                    case 4:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9724F);
                        AnonymousClass0cP.m5787O(anonymousClass0IL);
                        break;
                    case 5:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9725G);
                        AnonymousClass0cP.m5778F(anonymousClass0IL);
                        break;
                    case 6:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9724F);
                        this.f8511M.m5823X(anonymousClass0IL);
                        break;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        anonymousClass0IL.setNextAnim(anonymousClass0m9.f9725G);
                        this.f8511M.m5824Y(anonymousClass0IL);
                        break;
                    case 8:
                        this.f8511M.TA(null);
                        break;
                    case 9:
                        this.f8511M.TA(anonymousClass0IL);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(anonymousClass0m9.f9720B);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            anonymousClass0IL.setNextAnim(anonymousClass0m9.f9725G);
            this.f8511M.NA(anonymousClass0IL);
            if (!(this.f8516R || anonymousClass0m9.f9720B == 3 || anonymousClass0IL == null)) {
                this.f8511M.GA(anonymousClass0IL);
            }
        }
        if (!this.f8516R && z) {
            AnonymousClass0cP anonymousClass0cP = this.f8511M;
            anonymousClass0cP.HA(anonymousClass0cP.f7133J, true);
        }
    }

    /* renamed from: X */
    public final boolean m6806X(int i) {
        int size = this.f8513O.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) this.f8513O.get(i2);
            int i3 = anonymousClass0m9.f9723E != null ? anonymousClass0m9.f9723E.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public final boolean m6807Y(ArrayList arrayList, int i, int i2) {
        if (i2 != i) {
            int size = this.f8513O.size();
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) this.f8513O.get(i4);
                int i5 = anonymousClass0m9.f9723E != null ? anonymousClass0m9.f9723E.mContainerId : 0;
                if (!(i5 == 0 || i5 == r2)) {
                    for (int i6 = i; i6 < i2; i6++) {
                        AnonymousClass0hg anonymousClass0hg = (AnonymousClass0hg) arrayList.get(i6);
                        int size2 = anonymousClass0hg.f8513O.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            anonymousClass0m9 = (AnonymousClass0m9) anonymousClass0hg.f8513O.get(i3);
                            if ((anonymousClass0m9.f9723E != null ? anonymousClass0m9.f9723E.mContainerId : 0) == i5) {
                                return true;
                            }
                        }
                    }
                    i3 = i5;
                }
            }
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean m6808Z() {
        for (int i = 0; i < this.f8513O.size(); i++) {
            if (AnonymousClass0hg.m6781B((AnonymousClass0m9) this.f8513O.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final String getName() {
        return this.f8512N;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8510L >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f8510L);
        }
        if (this.f8512N != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f8512N);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean wH(ArrayList arrayList, ArrayList arrayList2) {
        if (AnonymousClass0cP.f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append(this);
            stringBuilder.toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f8500B) {
            AnonymousClass0cP anonymousClass0cP = this.f8511M;
            if (anonymousClass0cP.f7128E == null) {
                anonymousClass0cP.f7128E = new ArrayList();
            }
            anonymousClass0cP.f7128E.add(this);
        }
        return true;
    }
}

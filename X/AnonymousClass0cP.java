package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0cP */
public final class AnonymousClass0cP extends AnonymousClass0IU implements Factory2 {
    /* renamed from: e */
    public static boolean f7121e;
    /* renamed from: f */
    public static final Interpolator f7122f = new DecelerateInterpolator(1.5f);
    /* renamed from: g */
    public static final Interpolator f7123g = new DecelerateInterpolator(2.5f);
    /* renamed from: h */
    public static Field f7124h;
    /* renamed from: B */
    public SparseArray f7125B;
    /* renamed from: C */
    public final ArrayList f7126C = new ArrayList();
    /* renamed from: D */
    public ArrayList f7127D;
    /* renamed from: E */
    public ArrayList f7128E;
    /* renamed from: F */
    public ArrayList f7129F;
    /* renamed from: G */
    public ArrayList f7130G;
    /* renamed from: H */
    public AnonymousClass0c9 f7131H;
    /* renamed from: I */
    public ArrayList f7132I;
    /* renamed from: J */
    public int f7133J = 0;
    /* renamed from: K */
    public boolean f7134K;
    /* renamed from: L */
    public Runnable f7135L = new AnonymousClass0dX(this);
    /* renamed from: M */
    public boolean f7136M;
    /* renamed from: N */
    public boolean f7137N;
    /* renamed from: O */
    public AnonymousClass0c8 f7138O;
    /* renamed from: P */
    public boolean f7139P;
    /* renamed from: Q */
    public int f7140Q = 0;
    /* renamed from: R */
    public String f7141R;
    /* renamed from: S */
    public AnonymousClass0IL f7142S;
    /* renamed from: T */
    public ArrayList f7143T;
    /* renamed from: U */
    public ArrayList f7144U;
    /* renamed from: V */
    public AnonymousClass0IL f7145V;
    /* renamed from: W */
    public AnonymousClass0e2 f7146W;
    /* renamed from: X */
    public SparseArray f7147X = null;
    /* renamed from: Y */
    public Bundle f7148Y = null;
    /* renamed from: Z */
    public boolean f7149Z;
    /* renamed from: a */
    public ArrayList f7150a;
    /* renamed from: b */
    public ArrayList f7151b;
    /* renamed from: c */
    public ArrayList f7152c;
    /* renamed from: d */
    private final CopyOnWriteArrayList f7153d = new CopyOnWriteArrayList();

    static {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(2.5f);
        accelerateInterpolator = new AccelerateInterpolator(1.5f);
    }

    /* renamed from: A */
    public final void mo1449A(AnonymousClass0cK anonymousClass0cK) {
        if (this.f7129F == null) {
            this.f7129F = new ArrayList();
        }
        this.f7129F.add(anonymousClass0cK);
    }

    public final boolean AA() {
        m5791S(true);
        boolean z = false;
        while (m5796X(this.f7152c, this.f7151b)) {
            this.f7136M = true;
            try {
                m5798Z(this.f7152c, this.f7151b);
                m5790R();
                z = true;
            } catch (Throwable th) {
                m5790R();
                throw th;
            }
        }
        m5850y();
        m5788P();
        return z;
    }

    /* renamed from: B */
    public final AnonymousClass0IV mo1450B() {
        return new AnonymousClass0hg(this);
    }

    /* renamed from: B */
    public static void m5774B(AnonymousClass0cP anonymousClass0cP, AnonymousClass1mS anonymousClass1mS) {
        AnonymousClass0cP anonymousClass0cP2 = anonymousClass0cP;
        int i = anonymousClass0cP.f7133J;
        if (i >= 1) {
            int min = Math.min(i, 4);
            int size = anonymousClass0cP.f7126C.size();
            for (i = 0; i < size; i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) anonymousClass0cP2.f7126C.get(i);
                if (anonymousClass0IL.mState < min) {
                    anonymousClass0cP2.JA(anonymousClass0IL, min, anonymousClass0IL.getNextAnim(), anonymousClass0IL.getNextTransition(), null);
                    if (!(anonymousClass0IL.mView == null || anonymousClass0IL.mHidden || !anonymousClass0IL.mIsNewlyAdded)) {
                        anonymousClass1mS.add(anonymousClass0IL);
                    }
                }
            }
        }
    }

    public final void BA(AnonymousClass0hh anonymousClass0hh, boolean z) {
        if (!z || (this.f7138O != null && !this.f7134K)) {
            m5791S(z);
            if (anonymousClass0hh.wH(this.f7152c, this.f7151b)) {
                this.f7136M = true;
                try {
                    m5798Z(this.f7152c, this.f7151b);
                } finally {
                    m5790R();
                }
            }
            m5850y();
            m5788P();
        }
    }

    /* renamed from: C */
    public static void m5775C(AnonymousClass0cP anonymousClass0cP, AnonymousClass0hg anonymousClass0hg, boolean z, boolean z2, boolean z3) {
        boolean z4 = z3;
        if (z) {
            anonymousClass0hg.m6805W(z4);
        } else {
            anonymousClass0hg.m6804V();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(anonymousClass0hg);
        arrayList2.add(Boolean.valueOf(z));
        AnonymousClass0cP anonymousClass0cP2 = anonymousClass0cP;
        if (z2) {
            AnonymousClass0mA.m7482I(anonymousClass0cP2, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            anonymousClass0cP2.HA(anonymousClass0cP2.f7133J, true);
        }
        SparseArray sparseArray = anonymousClass0cP2.f7125B;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) anonymousClass0cP2.f7125B.valueAt(i);
                if (anonymousClass0IL != null && anonymousClass0IL.mView != null && anonymousClass0IL.mIsNewlyAdded && anonymousClass0hg.m6806X(anonymousClass0IL.mContainerId)) {
                    if (anonymousClass0IL.mPostponedAlpha > 0.0f) {
                        anonymousClass0IL.mView.setAlpha(anonymousClass0IL.mPostponedAlpha);
                    }
                    if (z3) {
                        anonymousClass0IL.mPostponedAlpha = 0.0f;
                    } else {
                        anonymousClass0IL.mPostponedAlpha = -1.0f;
                        anonymousClass0IL.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo1451C(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        AnonymousClass0IL anonymousClass0IL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("    ");
        String stringBuilder2 = stringBuilder.toString();
        SparseArray sparseArray = this.f7125B;
        if (sparseArray != null) {
            size = sparseArray.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(anonymousClass0IL);
                    if (anonymousClass0IL != null) {
                        anonymousClass0IL.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        size = this.f7126C.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(anonymousClass0IL.toString());
            }
        }
        ArrayList arrayList = this.f7132I;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    anonymousClass0IL = (AnonymousClass0IL) this.f7132I.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(anonymousClass0IL.toString());
                }
            }
        }
        arrayList = this.f7128E;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    AnonymousClass0hg anonymousClass0hg = (AnonymousClass0hg) this.f7128E.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(anonymousClass0hg.toString());
                    anonymousClass0hg.m6803U(stringBuilder2, printWriter, true);
                }
            }
        }
        synchronized (this) {
            if (this.f7130G != null) {
                size = this.f7130G.size();
                if (size > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size; i++) {
                        anonymousClass0hg = (AnonymousClass0hg) this.f7130G.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(anonymousClass0hg);
                    }
                }
            }
            if (this.f7127D != null && this.f7127D.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f7127D.toArray()));
            }
        }
        arrayList = this.f7143T;
        if (arrayList != null) {
            i = arrayList.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i2 = 0; i2 < i; i2++) {
                    AnonymousClass0hh anonymousClass0hh = (AnonymousClass0hh) this.f7143T.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(anonymousClass0hh);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7138O);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7131H);
        if (this.f7142S != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7142S);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7133J);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7149Z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7134K);
        if (this.f7139P) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7139P);
        }
        if (this.f7141R != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f7141R);
        }
    }

    public final AnonymousClass0IL CA(String str) {
        SparseArray sparseArray = this.f7125B;
        if (!(sparseArray == null || str == null)) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(size);
                if (anonymousClass0IL != null) {
                    anonymousClass0IL = anonymousClass0IL.findFragmentByWho(str);
                    if (anonymousClass0IL != null) {
                        return anonymousClass0IL;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public static void m5776D(AnonymousClass0cP anonymousClass0cP, int i) {
        try {
            anonymousClass0cP.f7136M = true;
            anonymousClass0cP.HA(i, false);
            anonymousClass0cP.AA();
        } finally {
            anonymousClass0cP.f7136M = false;
        }
    }

    /* renamed from: D */
    public final boolean mo1452D() {
        boolean AA = AA();
        m5795W();
        return AA;
    }

    public final X.AnonymousClass1lT DA(X.AnonymousClass0IL r7, int r8, boolean r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r6 = this;
        r2 = r7.getNextAnim();
        r1 = r7.onCreateAnimation(r8, r9, r2);
        r5 = 0;
        if (r1 == 0) goto L_0x0011;
    L_0x000b:
        r0 = new X.1lT;
        r0.<init>(r1);
        return r0;
    L_0x0011:
        r1 = r7.onCreateAnimator(r8, r9, r2);
        if (r1 == 0) goto L_0x001d;
    L_0x0017:
        r0 = new X.1lT;
        r0.<init>(r1);
        return r0;
    L_0x001d:
        if (r2 == 0) goto L_0x0069;
    L_0x001f:
        r0 = r6.f7138O;
        r0 = r0.f7002C;
        r0 = r0.getResources();
        r1 = r0.getResourceTypeName(r2);
        r0 = "anim";
        r4 = r0.equals(r1);
        r3 = 0;
        if (r4 == 0) goto L_0x0048;
    L_0x0034:
        r0 = r6.f7138O;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        r0 = r0.f7002C;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        r1 = android.view.animation.AnimationUtils.loadAnimation(r0, r2);	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        if (r1 == 0) goto L_0x0044;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
    L_0x003e:
        r0 = new X.1lT;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        r0.<init>(r1);	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
    L_0x0043:
        return r0;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
    L_0x0044:
        r3 = 1;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        goto L_0x0048;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        if (r3 != 0) goto L_0x0069;
    L_0x004a:
        r0 = r6.f7138O;	 Catch:{ RuntimeException -> 0x005a }
        r0 = r0.f7002C;	 Catch:{ RuntimeException -> 0x005a }
        r1 = android.animation.AnimatorInflater.loadAnimator(r0, r2);	 Catch:{ RuntimeException -> 0x005a }
        if (r1 == 0) goto L_0x0069;	 Catch:{ RuntimeException -> 0x005a }
    L_0x0054:
        r0 = new X.1lT;	 Catch:{ RuntimeException -> 0x005a }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x005a }
        goto L_0x0043;	 Catch:{ RuntimeException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        if (r4 != 0) goto L_0x0068;
    L_0x005d:
        r0 = r6.f7138O;
        r0 = r0.f7002C;
        r1 = android.view.animation.AnimationUtils.loadAnimation(r0, r2);
        if (r1 == 0) goto L_0x0069;
    L_0x0067:
        goto L_0x000b;
    L_0x0068:
        throw r0;
    L_0x0069:
        if (r8 != 0) goto L_0x006c;
    L_0x006b:
        return r5;
    L_0x006c:
        r0 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r8 == r0) goto L_0x0086;
    L_0x0070:
        r0 = 4099; // 0x1003 float:5.744E-42 double:2.025E-320;
        if (r8 == r0) goto L_0x0080;
    L_0x0074:
        r0 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        if (r8 == r0) goto L_0x007a;
    L_0x0078:
        r0 = -1;
        goto L_0x008b;
    L_0x007a:
        if (r9 == 0) goto L_0x007e;
    L_0x007c:
        r0 = 3;
        goto L_0x008b;
    L_0x007e:
        r0 = 4;
        goto L_0x008b;
    L_0x0080:
        if (r9 == 0) goto L_0x0084;
    L_0x0082:
        r0 = 5;
        goto L_0x008b;
    L_0x0084:
        r0 = 6;
        goto L_0x008b;
    L_0x0086:
        if (r9 == 0) goto L_0x008a;
    L_0x0088:
        r0 = 1;
        goto L_0x008b;
    L_0x008a:
        r0 = 2;
    L_0x008b:
        if (r0 >= 0) goto L_0x008e;
    L_0x008d:
        goto L_0x006b;
    L_0x008e:
        r1 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r3 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r0) {
            case 1: goto L_0x00d8;
            case 2: goto L_0x00cf;
            case 3: goto L_0x00c6;
            case 4: goto L_0x00ba;
            case 5: goto L_0x00b1;
            case 6: goto L_0x00a8;
            default: goto L_0x0097;
        };
    L_0x0097:
        if (r10 != 0) goto L_0x00e3;
    L_0x0099:
        r0 = r6.f7138O;
        r0 = r0.mo1485P();
        if (r0 == 0) goto L_0x00e3;
    L_0x00a1:
        r0 = r6.f7138O;
        r10 = r0.mo1484O();
        goto L_0x00e3;
    L_0x00a8:
        r0 = r6.f7138O;
        r0 = r0.f7002C;
        r0 = X.AnonymousClass0cP.m5779G(r0, r2, r3);
        return r0;
    L_0x00b1:
        r0 = r6.f7138O;
        r0 = r0.f7002C;
        r0 = X.AnonymousClass0cP.m5779G(r0, r3, r2);
        return r0;
    L_0x00ba:
        r0 = r6.f7138O;
        r1 = r0.f7002C;
        r0 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r0 = X.AnonymousClass0cP.m5780H(r1, r2, r0, r2, r3);
        return r0;
    L_0x00c6:
        r0 = r6.f7138O;
        r0 = r0.f7002C;
        r0 = X.AnonymousClass0cP.m5780H(r0, r1, r2, r3, r2);
        return r0;
    L_0x00cf:
        r0 = r6.f7138O;
        r0 = r0.f7002C;
        r0 = X.AnonymousClass0cP.m5780H(r0, r2, r1, r2, r3);
        return r0;
    L_0x00d8:
        r0 = r6.f7138O;
        r1 = r0.f7002C;
        r0 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r0 = X.AnonymousClass0cP.m5780H(r1, r0, r2, r3, r2);
        return r0;
    L_0x00e3:
        if (r10 != 0) goto L_0x006b;
    L_0x00e5:
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cP.DA(X.0IL, int, boolean, int):X.1lT");
    }

    /* renamed from: E */
    public final AnonymousClass0IL mo1453E(int i) {
        int size;
        for (size = this.f7126C.size() - 1; size >= 0; size--) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(size);
            if (anonymousClass0IL != null && anonymousClass0IL.mFragmentId == i) {
                break;
            }
        }
        SparseArray sparseArray = this.f7125B;
        if (sparseArray != null) {
            for (size = sparseArray.size() - 1; size >= 0; size--) {
                anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(size);
                if (anonymousClass0IL != null && anonymousClass0IL.mFragmentId == i) {
                    return anonymousClass0IL;
                }
            }
        }
        return null;
    }

    /* renamed from: E */
    public static AnimationListener m5777E(Animation animation) {
        try {
            if (f7124h == null) {
                f7124h = Animation.class.getDeclaredField("mListener");
                f7124h.setAccessible(true);
            }
            return (AnimationListener) f7124h.get(animation);
        } catch (Animation animation2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", animation2);
            return null;
        } catch (Animation animation22) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", animation22);
            return null;
        }
    }

    public final void EA(AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL.mIndex < 0) {
            int i = this.f7140Q;
            this.f7140Q = i + 1;
            anonymousClass0IL.setIndex(i, this.f7142S);
            if (this.f7125B == null) {
                this.f7125B = new SparseArray();
            }
            this.f7125B.put(anonymousClass0IL.mIndex, anonymousClass0IL);
            if (f7121e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Allocated fragment index ");
                stringBuilder.append(anonymousClass0IL);
                stringBuilder.toString();
            }
        }
    }

    /* renamed from: F */
    public final AnonymousClass0IL mo1454F(String str) {
        int size;
        AnonymousClass0IL anonymousClass0IL;
        if (str != null) {
            for (size = this.f7126C.size() - 1; size >= 0; size--) {
                anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(size);
                if (anonymousClass0IL != null && str.equals(anonymousClass0IL.mTag)) {
                    break;
                }
            }
        }
        SparseArray sparseArray = this.f7125B;
        if (!(sparseArray == null || str == null)) {
            for (size = sparseArray.size() - 1; size >= 0; size--) {
                anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(size);
                if (anonymousClass0IL != null && str.equals(anonymousClass0IL.mTag)) {
                    return anonymousClass0IL;
                }
            }
        }
        return null;
    }

    /* renamed from: F */
    public static final void m5778F(AnonymousClass0IL anonymousClass0IL) {
        if (f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.toString();
        }
        if (!anonymousClass0IL.mHidden) {
            anonymousClass0IL.mHidden = true;
            anonymousClass0IL.mHiddenChanged = true ^ anonymousClass0IL.mHiddenChanged;
        }
    }

    public final void FA(AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL.mIndex >= 0) {
            if (f7121e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing fragment index ");
                stringBuilder.append(anonymousClass0IL);
                stringBuilder.toString();
            }
            this.f7125B.put(anonymousClass0IL.mIndex, null);
            this.f7138O.mo1500J(anonymousClass0IL.mWho);
            anonymousClass0IL.initState();
        }
    }

    /* renamed from: G */
    public final AnonymousClass1lN mo1455G(int i) {
        return (AnonymousClass1lN) this.f7128E.get(i);
    }

    /* renamed from: G */
    public static AnonymousClass1lT m5779G(Context context, float f, float f2) {
        context = new AlphaAnimation(f, f2);
        context.setInterpolator(f7122f);
        context.setDuration(220);
        return new AnonymousClass1lT(context);
    }

    public final void GA(AnonymousClass0IL anonymousClass0IL) {
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        if (anonymousClass0IL != null) {
            int indexOfChild;
            AnonymousClass0cP anonymousClass0cP = this;
            int i = this.f7133J;
            if (anonymousClass0IL.mRemoving) {
                if (anonymousClass0IL.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            JA(anonymousClass0IL2, i, anonymousClass0IL.getNextTransition(), anonymousClass0IL.getNextTransitionStyle(), null);
            if (anonymousClass0IL2.mView != null) {
                AnonymousClass0IL V = m5794V(anonymousClass0IL2);
                if (V != null) {
                    View view = V.mView;
                    ViewGroup viewGroup = anonymousClass0IL2.mContainer;
                    indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(anonymousClass0IL2.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(anonymousClass0IL2.mView, indexOfChild);
                    }
                }
                if (anonymousClass0IL2.mIsNewlyAdded && anonymousClass0IL2.mContainer != null) {
                    if (anonymousClass0IL2.mPostponedAlpha > 0.0f) {
                        anonymousClass0IL2.mView.setAlpha(anonymousClass0IL2.mPostponedAlpha);
                    }
                    anonymousClass0IL2.mPostponedAlpha = 0.0f;
                    anonymousClass0IL2.mIsNewlyAdded = false;
                    AnonymousClass1lT DA = DA(anonymousClass0IL2, anonymousClass0IL2.getNextTransition(), true, anonymousClass0IL2.getNextTransitionStyle());
                    if (DA != null) {
                        AnonymousClass0cP.m5784L(anonymousClass0IL2.mView, DA);
                        if (DA.f22486B != null) {
                            anonymousClass0IL2.mView.startAnimation(DA.f22486B);
                        } else {
                            DA.f22487C.setTarget(anonymousClass0IL2.mView);
                            DA.f22487C.start();
                        }
                    }
                }
            }
            if (anonymousClass0IL2.mHiddenChanged) {
                if (anonymousClass0IL2.mView != null) {
                    AnonymousClass1lT DA2 = DA(anonymousClass0IL2, anonymousClass0IL2.getNextTransition(), anonymousClass0IL2.mHidden ^ true, anonymousClass0IL2.getNextTransitionStyle());
                    if (DA2 == null || DA2.f22487C == null) {
                        if (DA2 != null) {
                            AnonymousClass0cP.m5784L(anonymousClass0IL2.mView, DA2);
                            anonymousClass0IL2.mView.startAnimation(DA2.f22486B);
                            DA2.f22486B.start();
                        }
                        indexOfChild = (!anonymousClass0IL2.mHidden || anonymousClass0IL2.isHideReplaced()) ? 0 : 8;
                        anonymousClass0IL2.mView.setVisibility(indexOfChild);
                        if (anonymousClass0IL2.isHideReplaced()) {
                            anonymousClass0IL2.setHideReplaced(false);
                        }
                    } else {
                        DA2.f22487C.setTarget(anonymousClass0IL2.mView);
                        if (!anonymousClass0IL2.mHidden) {
                            anonymousClass0IL2.mView.setVisibility(0);
                        } else if (anonymousClass0IL2.isHideReplaced()) {
                            anonymousClass0IL2.setHideReplaced(false);
                        } else {
                            ViewGroup viewGroup2 = anonymousClass0IL2.mContainer;
                            View view2 = anonymousClass0IL2.mView;
                            viewGroup2.startViewTransition(view2);
                            DA2.f22487C.addListener(new AnonymousClass1lQ(anonymousClass0cP, viewGroup2, view2, anonymousClass0IL2));
                        }
                        AnonymousClass0cP.m5784L(anonymousClass0IL2.mView, DA2);
                        DA2.f22487C.start();
                    }
                }
                if (anonymousClass0IL2.mAdded && anonymousClass0IL2.mHasMenu && anonymousClass0IL2.mMenuVisible) {
                    anonymousClass0cP.f7139P = true;
                }
                anonymousClass0IL2.mHiddenChanged = false;
                anonymousClass0IL2.onHiddenChanged(anonymousClass0IL2.mHidden);
            }
        }
    }

    /* renamed from: H */
    public final int mo1456H() {
        ArrayList arrayList = this.f7128E;
        return arrayList != null ? arrayList.size() : 0;
    }

    /* renamed from: H */
    public static AnonymousClass1lT m5780H(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f7123g);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        Animation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f7122f);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new AnonymousClass1lT(animationSet);
    }

    public final void HA(int i, boolean z) {
        if (this.f7138O == null) {
            if (i != 0) {
                throw new IllegalStateException("No activity");
            }
        }
        if (z || i != this.f7133J) {
            this.f7133J = i;
            if (this.f7125B != null) {
                int i2;
                AnonymousClass0IL anonymousClass0IL;
                int size = this.f7126C.size();
                int i3 = 0;
                for (i2 = 0; i2 < size; i2++) {
                    anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i2);
                    GA(anonymousClass0IL);
                    if (anonymousClass0IL.mLoaderManager != null) {
                        i3 |= anonymousClass0IL.mLoaderManager.m1709J();
                    }
                }
                size = this.f7125B.size();
                for (i2 = 0; i2 < size; i2++) {
                    anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(i2);
                    if (anonymousClass0IL != null && ((anonymousClass0IL.mRemoving || anonymousClass0IL.mDetached) && !anonymousClass0IL.mIsNewlyAdded)) {
                        GA(anonymousClass0IL);
                        if (anonymousClass0IL.mLoaderManager != null) {
                            i3 |= anonymousClass0IL.mLoaderManager.m1709J();
                        }
                    }
                }
                if (i3 == 0) {
                    UA();
                }
                if (this.f7139P) {
                    AnonymousClass0c8 anonymousClass0c8 = this.f7138O;
                    if (anonymousClass0c8 != null && this.f7133J == 5) {
                        anonymousClass0c8.mo1491V();
                        this.f7139P = false;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final AnonymousClass0IL mo1457I(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7125B.get(i);
        if (anonymousClass0IL == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": index ");
            stringBuilder.append(i);
            m5799a(new IllegalStateException(stringBuilder.toString()));
        }
        return anonymousClass0IL;
    }

    /* renamed from: I */
    public static boolean m5781I(Animator animator) {
        if (animator != null) {
            if (animator instanceof ValueAnimator) {
                PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
                int i = 0;
                while (i < values.length) {
                    if (!"alpha".equals(values[i].getPropertyName())) {
                        i++;
                    }
                }
            } else if (animator instanceof AnimatorSet) {
                List childAnimations = ((AnimatorSet) animator).getChildAnimations();
                int i2 = 0;
                while (i2 < childAnimations.size()) {
                    if (!AnonymousClass0cP.m5781I((Animator) childAnimations.get(i2))) {
                        i2++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void IA(AnonymousClass0IL anonymousClass0IL) {
        JA(anonymousClass0IL, this.f7133J, 0, 0, false);
    }

    /* renamed from: J */
    public final List mo1458J() {
        if (this.f7126C.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list;
        synchronized (this.f7126C) {
            list = (List) this.f7126C.clone();
        }
        return list;
    }

    /* renamed from: J */
    public static boolean m5782J(AnonymousClass1lT anonymousClass1lT) {
        if (!(anonymousClass1lT.f22486B instanceof AlphaAnimation)) {
            if (!(anonymousClass1lT.f22486B instanceof AnimationSet)) {
                return AnonymousClass0cP.m5781I(anonymousClass1lT.f22487C);
            }
            List animations = ((AnimationSet) anonymousClass1lT.f22486B).getAnimations();
            int i = 0;
            while (i < animations.size()) {
                if (!(animations.get(i) instanceof AlphaAnimation)) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void JA(X.AnonymousClass0IL r14, int r15, int r16, int r17, boolean r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r13 = this;
        r3 = r15;
        r4 = r14;
        r0 = r14.mAdded;
        r2 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r14.mDetached;
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        if (r15 <= r2) goto L_0x000e;
    L_0x000d:
        r3 = 1;
    L_0x000e:
        r0 = r14.mRemoving;
        if (r0 == 0) goto L_0x0024;
    L_0x0012:
        r0 = r14.mState;
        if (r3 <= r0) goto L_0x0024;
    L_0x0016:
        r0 = r14.mState;
        if (r0 != 0) goto L_0x0022;
    L_0x001a:
        r0 = r14.isInBackStack();
        if (r0 == 0) goto L_0x0022;
    L_0x0020:
        r3 = 1;
        goto L_0x0024;
    L_0x0022:
        r3 = r14.mState;
    L_0x0024:
        r0 = r14.mDeferStart;
        r6 = 4;
        r5 = 3;
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = r14.mState;
        if (r0 >= r6) goto L_0x0031;
    L_0x002e:
        if (r3 <= r5) goto L_0x0031;
    L_0x0030:
        r3 = 3;
    L_0x0031:
        r8 = r14.mState;
        r7 = 2;
        r1 = 0;
        r0 = 0;
        if (r8 > r3) goto L_0x02f2;
    L_0x0038:
        r8 = r14.mFromLayout;
        if (r8 == 0) goto L_0x0041;
    L_0x003c:
        r8 = r14.mInLayout;
        if (r8 != 0) goto L_0x0041;
    L_0x0040:
        return;
    L_0x0041:
        r8 = r14.getAnimatingAway();
        if (r8 != 0) goto L_0x004d;
    L_0x0047:
        r8 = r14.getAnimator();
        if (r8 == 0) goto L_0x0060;
    L_0x004d:
        r14.setAnimatingAway(r1);
        r14.setAnimator(r1);
        r15 = r14.getStateAfterAnimating();
        r16 = 0;
        r17 = 0;
        r18 = 1;
        r13.JA(r14, r15, r16, r17, r18);
    L_0x0060:
        r8 = r14.mState;
        switch(r8) {
            case 0: goto L_0x0067;
            case 1: goto L_0x017f;
            case 2: goto L_0x02b0;
            case 3: goto L_0x02b4;
            case 4: goto L_0x02d0;
            default: goto L_0x0065;
        };
    L_0x0065:
        goto L_0x047e;
    L_0x0067:
        if (r3 <= 0) goto L_0x017f;
    L_0x0069:
        r8 = f7121e;
        if (r8 == 0) goto L_0x007d;
    L_0x006d:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r8 = "moveto CREATED: ";
        r9.append(r8);
        r9.append(r14);
        r9.toString();
    L_0x007d:
        r8 = r14.mSavedFragmentState;
        if (r8 == 0) goto L_0x00bf;
    L_0x0081:
        r9 = r14.mSavedFragmentState;
        r8 = r13.f7138O;
        r8 = r8.f7002C;
        r8 = r8.getClassLoader();
        r9.setClassLoader(r8);
        r9 = r14.mSavedFragmentState;
        r8 = "android:view_state";
        r8 = r9.getSparseParcelableArray(r8);
        r14.mSavedViewState = r8;
        r9 = r14.mSavedFragmentState;
        r8 = "android:target_state";
        r8 = r13.mo1457I(r9, r8);
        r14.mTarget = r8;
        if (r8 == 0) goto L_0x00ae;
    L_0x00a4:
        r9 = r14.mSavedFragmentState;
        r8 = "android:target_req_state";
        r8 = r9.getInt(r8, r0);
        r14.mTargetRequestCode = r8;
    L_0x00ae:
        r9 = r14.mSavedFragmentState;
        r8 = "android:user_visible_hint";
        r8 = r9.getBoolean(r8, r2);
        r14.mUserVisibleHint = r8;
        if (r8 != 0) goto L_0x00bf;
    L_0x00ba:
        r14.mDeferStart = r2;
        if (r3 <= r5) goto L_0x00bf;
    L_0x00be:
        r3 = 3;
    L_0x00bf:
        r9 = r13.f7138O;
        r14.mHost = r9;
        r8 = r13.f7142S;
        r14.mParentFragment = r8;
        if (r8 == 0) goto L_0x00cc;
    L_0x00c9:
        r8 = r8.mChildFragmentManager;
        goto L_0x00ce;
    L_0x00cc:
        r8 = r9.f7003D;
    L_0x00ce:
        r14.mFragmentManager = r8;
        r8 = r14.mTarget;
        if (r8 == 0) goto L_0x011b;
    L_0x00d4:
        r9 = r13.f7125B;
        r8 = r14.mTarget;
        r8 = r8.mIndex;
        r9 = r9.get(r8);
        r8 = r14.mTarget;
        if (r9 != r8) goto L_0x00f5;
    L_0x00e2:
        r8 = r14.mTarget;
        r8 = r8.mState;
        if (r8 >= r2) goto L_0x011b;
    L_0x00e8:
        r14 = r14.mTarget;
        r15 = 1;
        r16 = 0;
        r17 = 0;
        r18 = 1;
        r13.JA(r14, r15, r16, r17, r18);
        goto L_0x011b;
    L_0x00f5:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Fragment ";
        r1.append(r0);
        r1.append(r14);
        r0 = " declared target fragment ";
        r1.append(r0);
        r0 = r14.mTarget;
        r1.append(r0);
        r0 = " that does not belong to this FragmentManager!";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x011b:
        r8 = r13.f7138O;
        r8 = r8.f7002C;
        r13.m5838m(r4, r8, r0);
        r4.mCalled = r0;
        r8 = r13.f7138O;
        r8 = r8.f7002C;
        r4.onAttach(r8);
        r8 = r4.mCalled;
        if (r8 == 0) goto L_0x0163;
    L_0x012f:
        r8 = r4.mParentFragment;
        if (r8 != 0) goto L_0x0139;
    L_0x0133:
        r8 = r13.f7138O;
        r8.mo1480K(r4);
        goto L_0x013e;
    L_0x0139:
        r8 = r4.mParentFragment;
        r8.onAttachFragment(r4);
    L_0x013e:
        r8 = r13.f7138O;
        r8 = r8.f7002C;
        r13.m5833h(r4, r8, r0);
        r8 = r4.mIsCreated;
        if (r8 != 0) goto L_0x0159;
    L_0x0149:
        r8 = r4.mSavedFragmentState;
        r13.m5839n(r4, r8, r0);
        r8 = r4.mSavedFragmentState;
        r4.performCreate(r8);
        r8 = r4.mSavedFragmentState;
        r13.m5834i(r4, r8, r0);
        goto L_0x0160;
    L_0x0159:
        r8 = r4.mSavedFragmentState;
        r4.restoreChildFragmentState(r8);
        r4.mState = r2;
    L_0x0160:
        r4.mRetaining = r0;
        goto L_0x017f;
    L_0x0163:
        r2 = new X.1lr;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Fragment ";
        r1.append(r0);
        r1.append(r4);
        r0 = " did not call through to super.onAttach()";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x017f:
        r8 = r4.mFromLayout;
        if (r8 == 0) goto L_0x01be;
    L_0x0183:
        r8 = r4.mPerformedCreateView;
        if (r8 != 0) goto L_0x01be;
    L_0x0187:
        r8 = r4.mSavedFragmentState;
        r10 = r4.performGetLayoutInflater(r8);
        r8 = r4.mSavedFragmentState;
        r9 = 0;
        r8 = r4.performCreateView(r10, r9, r8);
        r4.mView = r8;
        if (r8 == 0) goto L_0x01bc;
    L_0x0198:
        r8 = r4.mView;
        r4.mInnerView = r8;
        r8 = r4.mView;
        r10 = 0;
        r8.setSaveFromParentEnabled(r10);
        r8 = r4.mHidden;
        if (r8 == 0) goto L_0x01ad;
    L_0x01a6:
        r9 = r4.mView;
        r8 = 8;
        r9.setVisibility(r8);
    L_0x01ad:
        r9 = r4.mView;
        r8 = r4.mSavedFragmentState;
        r4.onViewCreated(r9, r8);
        r9 = r4.mView;
        r8 = r4.mSavedFragmentState;
        r13.m5844s(r4, r9, r8, r10);
        goto L_0x01be;
    L_0x01bc:
        r4.mInnerView = r9;
    L_0x01be:
        if (r3 <= r2) goto L_0x02b0;
    L_0x01c0:
        r8 = f7121e;
        if (r8 == 0) goto L_0x01d4;
    L_0x01c4:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r8 = "moveto ACTIVITY_CREATED: ";
        r9.append(r8);
        r9.append(r4);
        r9.toString();
    L_0x01d4:
        r8 = r4.mFromLayout;
        if (r8 != 0) goto L_0x029b;
    L_0x01d8:
        r8 = r4.mContainerId;
        if (r8 == 0) goto L_0x024c;
    L_0x01dc:
        r9 = r4.mContainerId;
        r8 = -1;
        if (r9 != r8) goto L_0x01ff;
    L_0x01e1:
        r10 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r8 = "Cannot create fragment ";
        r9.append(r8);
        r9.append(r4);
        r8 = " for a container view with no id";
        r9.append(r8);
        r8 = r9.toString();
        r10.<init>(r8);
        r13.m5799a(r10);
    L_0x01ff:
        r9 = r13.f7131H;
        r8 = r4.mContainerId;
        r10 = r9.mo1436B(r8);
        r10 = (android.view.ViewGroup) r10;
        if (r10 != 0) goto L_0x024d;
    L_0x020b:
        r8 = r4.mRestored;
        if (r8 != 0) goto L_0x024d;
    L_0x020f:
        r9 = r4.getResources();	 Catch:{ NotFoundException -> 0x021a }
        r8 = r4.mContainerId;	 Catch:{ NotFoundException -> 0x021a }
        r12 = r9.getResourceName(r8);	 Catch:{ NotFoundException -> 0x021a }
        goto L_0x021c;	 Catch:{ NotFoundException -> 0x021a }
    L_0x021a:
        r12 = "unknown";
    L_0x021c:
        r9 = new java.lang.IllegalArgumentException;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r8 = "No view found for id 0x";
        r11.append(r8);
        r8 = r4.mContainerId;
        r8 = java.lang.Integer.toHexString(r8);
        r11.append(r8);
        r8 = " (";
        r11.append(r8);
        r11.append(r12);
        r8 = ") for fragment ";
        r11.append(r8);
        r11.append(r4);
        r8 = r11.toString();
        r9.<init>(r8);
        r13.m5799a(r9);
        goto L_0x024d;
    L_0x024c:
        r10 = r1;
    L_0x024d:
        r4.mContainer = r10;
        r8 = r4.mSavedFragmentState;
        r9 = r4.performGetLayoutInflater(r8);
        r8 = r4.mSavedFragmentState;
        r8 = r4.performCreateView(r9, r10, r8);
        r4.mView = r8;
        if (r8 == 0) goto L_0x0299;
    L_0x025f:
        r8 = r4.mView;
        r4.mInnerView = r8;
        r8 = r4.mView;
        r8.setSaveFromParentEnabled(r0);
        if (r10 == 0) goto L_0x026f;
    L_0x026a:
        r8 = r4.mView;
        r10.addView(r8);
    L_0x026f:
        r8 = r4.mHidden;
        if (r8 == 0) goto L_0x027a;
    L_0x0273:
        r9 = r4.mView;
        r8 = 8;
        r9.setVisibility(r8);
    L_0x027a:
        r9 = r4.mView;
        r8 = r4.mSavedFragmentState;
        r4.onViewCreated(r9, r8);
        r9 = r4.mView;
        r8 = r4.mSavedFragmentState;
        r13.m5844s(r4, r9, r8, r0);
        r8 = r4.mView;
        r8 = r8.getVisibility();
        if (r8 != 0) goto L_0x0295;
    L_0x0290:
        r8 = r4.mContainer;
        if (r8 == 0) goto L_0x0295;
    L_0x0294:
        goto L_0x0296;
    L_0x0295:
        r2 = 0;
    L_0x0296:
        r4.mIsNewlyAdded = r2;
        goto L_0x029b;
    L_0x0299:
        r4.mInnerView = r1;
    L_0x029b:
        r2 = r4.mSavedFragmentState;
        r4.performActivityCreated(r2);
        r2 = r4.mSavedFragmentState;
        r13.m5832g(r4, r2, r0);
        r2 = r4.mView;
        if (r2 == 0) goto L_0x02ae;
    L_0x02a9:
        r2 = r4.mSavedFragmentState;
        r4.restoreViewState(r2);
    L_0x02ae:
        r4.mSavedFragmentState = r1;
    L_0x02b0:
        if (r3 <= r7) goto L_0x02b4;
    L_0x02b2:
        r4.mState = r5;
    L_0x02b4:
        if (r3 <= r5) goto L_0x02d0;
    L_0x02b6:
        r2 = f7121e;
        if (r2 == 0) goto L_0x02ca;
    L_0x02ba:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r2 = "moveto STARTED: ";
        r5.append(r2);
        r5.append(r4);
        r5.toString();
    L_0x02ca:
        r4.performStart();
        r13.m5842q(r4, r0);
    L_0x02d0:
        if (r3 <= r6) goto L_0x047e;
    L_0x02d2:
        r2 = f7121e;
        if (r2 == 0) goto L_0x02e6;
    L_0x02d6:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r2 = "moveto RESUMED: ";
        r5.append(r2);
        r5.append(r4);
        r5.toString();
    L_0x02e6:
        r4.performResume();
        r13.m5840o(r4, r0);
        r4.mSavedFragmentState = r1;
        r4.mSavedViewState = r1;
        goto L_0x047e;
    L_0x02f2:
        r8 = r14.mState;
        if (r8 <= r3) goto L_0x047e;
    L_0x02f6:
        r8 = r14.mState;
        switch(r8) {
            case 1: goto L_0x040e;
            case 2: goto L_0x034f;
            case 3: goto L_0x0336;
            case 4: goto L_0x031a;
            case 5: goto L_0x02fd;
            default: goto L_0x02fb;
        };
    L_0x02fb:
        goto L_0x047e;
    L_0x02fd:
        r8 = 5;
        if (r3 >= r8) goto L_0x031a;
    L_0x0300:
        r8 = f7121e;
        if (r8 == 0) goto L_0x0314;
    L_0x0304:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r8 = "movefrom RESUMED: ";
        r9.append(r8);
        r9.append(r14);
        r9.toString();
    L_0x0314:
        r14.performPause();
        r13.m5837l(r14, r0);
    L_0x031a:
        if (r3 >= r6) goto L_0x0336;
    L_0x031c:
        r6 = f7121e;
        if (r6 == 0) goto L_0x0330;
    L_0x0320:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r6 = "movefrom STARTED: ";
        r8.append(r6);
        r8.append(r14);
        r8.toString();
    L_0x0330:
        r14.performStop();
        r13.m5843r(r14, r0);
    L_0x0336:
        if (r3 >= r5) goto L_0x034f;
    L_0x0338:
        r5 = f7121e;
        if (r5 == 0) goto L_0x034c;
    L_0x033c:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r5 = "movefrom STOPPED: ";
        r6.append(r5);
        r6.append(r14);
        r6.toString();
    L_0x034c:
        r14.performReallyStop();
    L_0x034f:
        if (r3 >= r7) goto L_0x040e;
    L_0x0351:
        r5 = f7121e;
        if (r5 == 0) goto L_0x0365;
    L_0x0355:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r5 = "movefrom ACTIVITY_CREATED: ";
        r6.append(r5);
        r6.append(r14);
        r6.toString();
    L_0x0365:
        r5 = r14.mView;
        if (r5 == 0) goto L_0x0378;
    L_0x0369:
        r5 = r13.f7138O;
        r5 = r5.mo1487R(r14);
        if (r5 == 0) goto L_0x0378;
    L_0x0371:
        r5 = r14.mSavedViewState;
        if (r5 != 0) goto L_0x0378;
    L_0x0375:
        r13.RA(r14);
    L_0x0378:
        r14.performDestroyView();
        r13.m5845t(r14, r0);
        r5 = r14.mView;
        if (r5 == 0) goto L_0x0406;
    L_0x0382:
        r5 = r14.mContainer;
        if (r5 == 0) goto L_0x0406;
    L_0x0386:
        r5 = r14.mView;
        r5.clearAnimation();
        r6 = r14.mContainer;
        r5 = r14.mView;
        r6.endViewTransition(r5);
        r5 = r13.f7133J;
        r6 = 0;
        if (r5 <= 0) goto L_0x03b2;
    L_0x0397:
        r5 = r13.f7134K;
        if (r5 != 0) goto L_0x03b2;
    L_0x039b:
        r5 = r14.mView;
        r5 = r5.getVisibility();
        if (r5 != 0) goto L_0x03b2;
    L_0x03a3:
        r5 = r14.mPostponedAlpha;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 < 0) goto L_0x03b2;
    L_0x03a9:
        r7 = r16;
        r5 = r17;
        r8 = r13.DA(r14, r7, r0, r5);
        goto L_0x03b3;
    L_0x03b2:
        r8 = r1;
    L_0x03b3:
        r14.mPostponedAlpha = r6;
        if (r8 == 0) goto L_0x03ff;
    L_0x03b7:
        r9 = r14.mView;
        r14.setStateAfterAnimating(r3);
        r5 = r8.f22486B;
        if (r5 == 0) goto L_0x03dc;
    L_0x03c0:
        r7 = r8.f22486B;
        r5 = r14.mView;
        r14.setAnimatingAway(r5);
        r6 = X.AnonymousClass0cP.m5777E(r7);
        r5 = new X.2O5;
        r5.<init>(r13, r6, r14);
        r7.setAnimationListener(r5);
        X.AnonymousClass0cP.m5784L(r9, r8);
        r5 = r14.mView;
        r5.startAnimation(r7);
        goto L_0x03ff;
    L_0x03dc:
        r7 = r8.f22487C;
        r5 = r8.f22487C;
        r14.setAnimator(r5);
        r6 = r14.mContainer;
        if (r6 == 0) goto L_0x03ea;
    L_0x03e7:
        r6.startViewTransition(r9);
    L_0x03ea:
        r5 = new X.1lP;
        r5.<init>(r13, r6, r9, r14);
        r7.addListener(r5);
        r5 = r14.mView;
        r7.setTarget(r5);
        r5 = r14.mView;
        X.AnonymousClass0cP.m5784L(r5, r8);
        r7.start();
    L_0x03ff:
        r6 = r14.mContainer;
        r5 = r14.mView;
        r6.removeView(r5);
    L_0x0406:
        r14.mContainer = r1;
        r14.mView = r1;
        r14.mInnerView = r1;
        r14.mInLayout = r0;
    L_0x040e:
        if (r3 >= r2) goto L_0x047e;
    L_0x0410:
        r5 = r13.f7134K;
        if (r5 == 0) goto L_0x0435;
    L_0x0414:
        r5 = r14.getAnimatingAway();
        if (r5 == 0) goto L_0x0425;
    L_0x041a:
        r5 = r14.getAnimatingAway();
        r14.setAnimatingAway(r1);
        r5.clearAnimation();
        goto L_0x0435;
    L_0x0425:
        r5 = r14.getAnimator();
        if (r5 == 0) goto L_0x0435;
    L_0x042b:
        r5 = r14.getAnimator();
        r14.setAnimator(r1);
        r5.cancel();
    L_0x0435:
        r5 = r14.getAnimatingAway();
        if (r5 != 0) goto L_0x047a;
    L_0x043b:
        r5 = r14.getAnimator();
        if (r5 == 0) goto L_0x0442;
    L_0x0441:
        goto L_0x047a;
    L_0x0442:
        r2 = f7121e;
        if (r2 == 0) goto L_0x0456;
    L_0x0446:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r2 = "movefrom CREATED: ";
        r5.append(r2);
        r5.append(r14);
        r5.toString();
    L_0x0456:
        r2 = r14.mRetaining;
        if (r2 != 0) goto L_0x0461;
    L_0x045a:
        r14.performDestroy();
        r13.m5835j(r14, r0);
        goto L_0x0463;
    L_0x0461:
        r14.mState = r0;
    L_0x0463:
        r14.performDetach();
        r13.m5836k(r14, r0);
        if (r18 != 0) goto L_0x047e;
    L_0x046b:
        r0 = r14.mRetaining;
        if (r0 != 0) goto L_0x0473;
    L_0x046f:
        r13.FA(r14);
        goto L_0x047e;
    L_0x0473:
        r14.mHost = r1;
        r14.mParentFragment = r1;
        r14.mFragmentManager = r1;
        goto L_0x047e;
    L_0x047a:
        r14.setStateAfterAnimating(r3);
        goto L_0x047f;
    L_0x047e:
        r2 = r3;
    L_0x047f:
        r0 = r4.mState;
        if (r0 == r2) goto L_0x0040;
    L_0x0483:
        r3 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "moveToState: Fragment state for ";
        r1.append(r0);
        r1.append(r4);
        r0 = " not updated inline; ";
        r1.append(r0);
        r0 = "expected state ";
        r1.append(r0);
        r1.append(r2);
        r0 = " found ";
        r1.append(r0);
        r0 = r4.mState;
        r1.append(r0);
        r0 = r1.toString();
        android.util.Log.w(r3, r0);
        r4.mState = r2;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cP.JA(X.0IL, int, int, int, boolean):void");
    }

    /* renamed from: K */
    public static void m5783K(AnonymousClass0cP anonymousClass0cP) {
        synchronized (anonymousClass0cP) {
            Object obj = null;
            Object obj2 = (anonymousClass0cP.f7144U == null || anonymousClass0cP.f7144U.isEmpty()) ? null : 1;
            if (anonymousClass0cP.f7143T != null && anonymousClass0cP.f7143T.size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null && r3 == null)) {
                AnonymousClass0OR.m3627G(anonymousClass0cP.f7138O.f7004E, anonymousClass0cP.f7135L, 1995786188);
                AnonymousClass0OR.m3624D(anonymousClass0cP.f7138O.f7004E, anonymousClass0cP.f7135L, -193365251);
            }
        }
    }

    /* renamed from: K */
    public final boolean mo1459K() {
        return this.f7149Z;
    }

    public final void KA() {
        this.f7146W = null;
        int i = 0;
        this.f7149Z = false;
        int size = this.f7126C.size();
        while (i < size) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.noteStateNotSaved();
            }
            i++;
        }
    }

    /* renamed from: L */
    public final void mo1460L() {
        m5851z(new AnonymousClass1lW(this, null, -1, 0), false);
    }

    /* renamed from: L */
    public static void m5784L(View view, AnonymousClass1lT anonymousClass1lT) {
        if (view == null) {
            return;
        }
        if (anonymousClass1lT != null) {
            if (!AnonymousClass0cP.m5786N(view, anonymousClass1lT)) {
                return;
            }
            if (anonymousClass1lT.f22487C != null) {
                anonymousClass1lT.f22487C.addListener(new AnonymousClass1lU(view));
                return;
            }
            AnimationListener E = AnonymousClass0cP.m5777E(anonymousClass1lT.f22486B);
            view.setLayerType(2, null);
            anonymousClass1lT.f22486B.setAnimationListener(new AnonymousClass2O6(view, E));
        }
    }

    public final void LA(AnonymousClass0IL anonymousClass0IL) {
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        if (anonymousClass0IL.mDeferStart) {
            AnonymousClass0cP anonymousClass0cP = this;
            if (this.f7136M) {
                this.f7137N = true;
            } else {
                anonymousClass0IL.mDeferStart = false;
                JA(anonymousClass0IL2, this.f7133J, 0, 0, null);
            }
        }
    }

    /* renamed from: M */
    public final void mo1461M(int i, int i2) {
        if (i >= 0) {
            m5851z(new AnonymousClass1lW(this, null, i, i2), false);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: M */
    public static void m5785M(AnonymousClass0e2 anonymousClass0e2) {
        if (anonymousClass0e2 != null) {
            List<AnonymousClass0IL> list = anonymousClass0e2.f7572C;
            if (list != null) {
                for (AnonymousClass0IL anonymousClass0IL : list) {
                    anonymousClass0IL.mRetaining = true;
                }
            }
            List<AnonymousClass0e2> list2 = anonymousClass0e2.f7571B;
            if (list2 != null) {
                for (AnonymousClass0e2 M : list2) {
                    AnonymousClass0cP.m5785M(M);
                }
            }
        }
    }

    public final boolean MA(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        ArrayList arrayList3 = this.f7128E;
        if (arrayList3 != null) {
            int size;
            if (str == null && i < 0 && (i2 & 1) == 0) {
                size = arrayList3.size() - 1;
                if (size >= 0) {
                    arrayList.add(this.f7128E.remove(size));
                    arrayList2.add(Boolean.valueOf(true));
                }
            } else {
                int i3;
                AnonymousClass0hg anonymousClass0hg;
                if (str == null) {
                    if (i < 0) {
                        i3 = -1;
                        if (i3 == this.f7128E.size() - 1) {
                            for (size = this.f7128E.size() - 1; size > i3; size--) {
                                arrayList.add(this.f7128E.remove(size));
                                arrayList2.add(Boolean.valueOf(true));
                            }
                        }
                    }
                }
                i3 = this.f7128E.size() - 1;
                while (i3 >= 0) {
                    anonymousClass0hg = (AnonymousClass0hg) this.f7128E.get(i3);
                    if (str == null || !str.equals(anonymousClass0hg.getName())) {
                        if (i >= 0 && i == anonymousClass0hg.f8510L) {
                            break;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
                if (i3 >= 0) {
                    if ((i2 & 1) != 0) {
                        while (true) {
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                            anonymousClass0hg = (AnonymousClass0hg) this.f7128E.get(i3);
                            if (str == null || !str.equals(anonymousClass0hg.getName())) {
                                if (i < 0 || i != anonymousClass0hg.f8510L) {
                                    break;
                                }
                            }
                        }
                    }
                    if (i3 == this.f7128E.size() - 1) {
                        for (size = this.f7128E.size() - 1; size > i3; size--) {
                            arrayList.add(this.f7128E.remove(size));
                            arrayList2.add(Boolean.valueOf(true));
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void mo1462N(String str, int i) {
        m5851z(new AnonymousClass1lW(this, str, -1, i), false);
    }

    /* renamed from: N */
    public static boolean m5786N(View view, AnonymousClass1lT anonymousClass1lT) {
        if (view == null) {
            return false;
        }
        if (anonymousClass1lT == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && AnonymousClass0mE.f9733B.mo2075M(view) && AnonymousClass0cP.m5782J(anonymousClass1lT)) {
            return true;
        }
        return false;
    }

    public final void NA(AnonymousClass0IL anonymousClass0IL) {
        if (f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.append(" nesting=");
            stringBuilder.append(anonymousClass0IL.mBackStackNesting);
            stringBuilder.toString();
        }
        int isInBackStack = anonymousClass0IL.isInBackStack() ^ 1;
        if (!anonymousClass0IL.mDetached || isInBackStack != 0) {
            synchronized (this.f7126C) {
                this.f7126C.remove(anonymousClass0IL);
            }
            if (anonymousClass0IL.mHasMenu && anonymousClass0IL.mMenuVisible) {
                this.f7139P = true;
            }
            anonymousClass0IL.mAdded = false;
            anonymousClass0IL.mRemoving = true;
        }
    }

    /* renamed from: O */
    public static final void m5787O(AnonymousClass0IL anonymousClass0IL) {
        if (f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.toString();
        }
        if (anonymousClass0IL.mHidden) {
            anonymousClass0IL.mHidden = false;
            anonymousClass0IL.mHiddenChanged ^= 1;
        }
    }

    /* renamed from: O */
    public final boolean mo1463O() {
        m5789Q();
        return m5797Y(null, -1, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void OA(android.os.Parcelable r13, X.AnonymousClass0e2 r14) {
        /*
        r12 = this;
        if (r13 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r13 = (android.support.v4.app.FragmentManagerState) r13;
        r0 = r13.f17229B;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0002;
    L_0x000a:
        r2 = 0;
        r3 = 0;
        if (r14 == 0) goto L_0x009c;
    L_0x000e:
        r8 = r14.f7572C;
        r7 = r14.f7571B;
        if (r8 == 0) goto L_0x0019;
    L_0x0014:
        r6 = r8.size();
        goto L_0x001a;
    L_0x0019:
        r6 = 0;
    L_0x001a:
        r5 = 0;
    L_0x001b:
        if (r5 >= r6) goto L_0x009d;
    L_0x001d:
        r4 = r8.get(r5);
        r4 = (X.AnonymousClass0IL) r4;
        r0 = f7121e;
        if (r0 == 0) goto L_0x0037;
    L_0x0027:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "restoreAllState: re-attaching retained ";
        r1.append(r0);
        r1.append(r4);
        r1.toString();
    L_0x0037:
        r9 = 0;
    L_0x0038:
        r0 = r13.f17229B;
        r0 = r0.length;
        if (r9 >= r0) goto L_0x004a;
    L_0x003d:
        r0 = r13.f17229B;
        r0 = r0[r9];
        r1 = r0.f17241I;
        r0 = r4.mIndex;
        if (r1 == r0) goto L_0x004a;
    L_0x0047:
        r9 = r9 + 1;
        goto L_0x0038;
    L_0x004a:
        r0 = r13.f17229B;
        r0 = r0.length;
        if (r9 != r0) goto L_0x006a;
    L_0x004f:
        r10 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Could not find active fragment with index ";
        r1.append(r0);
        r0 = r4.mIndex;
        r1.append(r0);
        r0 = r1.toString();
        r10.<init>(r0);
        r12.m5799a(r10);
    L_0x006a:
        r0 = r13.f17229B;
        r9 = r0[r9];
        r9.f17242J = r4;
        r4.mSavedViewState = r2;
        r4.mBackStackNesting = r3;
        r4.mInLayout = r3;
        r4.mAdded = r3;
        r4.mTarget = r2;
        r0 = r9.f17244L;
        if (r0 == 0) goto L_0x0099;
    L_0x007e:
        r1 = r9.f17244L;
        r0 = r12.f7138O;
        r0 = r0.f7002C;
        r0 = r0.getClassLoader();
        r1.setClassLoader(r0);
        r1 = r9.f17244L;
        r0 = "android:view_state";
        r0 = r1.getSparseParcelableArray(r0);
        r4.mSavedViewState = r0;
        r0 = r9.f17244L;
        r4.mSavedFragmentState = r0;
    L_0x0099:
        r5 = r5 + 1;
        goto L_0x001b;
    L_0x009c:
        r7 = r2;
    L_0x009d:
        r1 = new android.util.SparseArray;
        r0 = r13.f17229B;
        r0 = r0.length;
        r1.<init>(r0);
        r12.f7125B = r1;
        r6 = 0;
    L_0x00a8:
        r0 = r13.f17229B;
        r0 = r0.length;
        if (r6 >= r0) goto L_0x0171;
    L_0x00ad:
        r0 = r13.f17229B;
        r5 = r0[r6];
        if (r5 == 0) goto L_0x016d;
    L_0x00b3:
        if (r7 == 0) goto L_0x00c2;
    L_0x00b5:
        r0 = r7.size();
        if (r6 >= r0) goto L_0x00c2;
    L_0x00bb:
        r8 = r7.get(r6);
        r8 = (X.AnonymousClass0e2) r8;
        goto L_0x00c3;
    L_0x00c2:
        r8 = r2;
    L_0x00c3:
        r4 = r12.f7138O;
        r11 = r12.f7131H;
        r9 = r12.f7142S;
        r0 = r5.f17242J;
        if (r0 != 0) goto L_0x0144;
    L_0x00cd:
        r10 = r4.f7002C;
        r1 = r5.f17234B;
        if (r1 == 0) goto L_0x00da;
    L_0x00d3:
        r0 = r10.getClassLoader();
        r1.setClassLoader(r0);
    L_0x00da:
        if (r11 == 0) goto L_0x00e7;
    L_0x00dc:
        r1 = r5.f17235C;
        r0 = r5.f17234B;
        r0 = r11.mo2047A(r10, r1, r0);
        r5.f17242J = r0;
        goto L_0x00f1;
    L_0x00e7:
        r1 = r5.f17235C;
        r0 = r5.f17234B;
        r0 = X.AnonymousClass0IL.instantiate(r10, r1, r0);
        r5.f17242J = r0;
    L_0x00f1:
        r1 = r5.f17244L;
        if (r1 == 0) goto L_0x0102;
    L_0x00f5:
        r0 = r10.getClassLoader();
        r1.setClassLoader(r0);
        r1 = r5.f17242J;
        r0 = r5.f17244L;
        r1.mSavedFragmentState = r0;
    L_0x0102:
        r1 = r5.f17242J;
        r0 = r5.f17241I;
        r1.setIndex(r0, r9);
        r1 = r5.f17242J;
        r0 = r5.f17239G;
        r1.mFromLayout = r0;
        r0 = 1;
        r1.mRestored = r0;
        r0 = r5.f17238F;
        r1.mFragmentId = r0;
        r0 = r5.f17236D;
        r1.mContainerId = r0;
        r0 = r5.f17245M;
        r1.mTag = r0;
        r0 = r5.f17243K;
        r1.mRetainInstance = r0;
        r0 = r5.f17237E;
        r1.mDetached = r0;
        r0 = r5.f17240H;
        r1.mHidden = r0;
        r0 = r4.f7003D;
        r1.mFragmentManager = r0;
        r0 = f7121e;
        if (r0 == 0) goto L_0x0144;
    L_0x0132:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Instantiated fragment ";
        r1.append(r0);
        r0 = r5.f17242J;
        r1.append(r0);
        r1.toString();
    L_0x0144:
        r4 = r5.f17242J;
        r4.mChildNonConfig = r8;
        r0 = f7121e;
        if (r0 == 0) goto L_0x0164;
    L_0x014c:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "restoreAllState: active #";
        r1.append(r0);
        r1.append(r6);
        r0 = ": ";
        r1.append(r0);
        r1.append(r4);
        r1.toString();
    L_0x0164:
        r1 = r12.f7125B;
        r0 = r4.mIndex;
        r1.put(r0, r4);
        r5.f17242J = r2;
    L_0x016d:
        r6 = r6 + 1;
        goto L_0x00a8;
    L_0x0171:
        if (r14 == 0) goto L_0x01bb;
    L_0x0173:
        r7 = r14.f7572C;
        if (r7 == 0) goto L_0x017c;
    L_0x0177:
        r6 = r7.size();
        goto L_0x017d;
    L_0x017c:
        r6 = 0;
    L_0x017d:
        r5 = 0;
    L_0x017e:
        if (r5 >= r6) goto L_0x01bb;
    L_0x0180:
        r8 = r7.get(r5);
        r8 = (X.AnonymousClass0IL) r8;
        r0 = r8.mTargetIndex;
        if (r0 < 0) goto L_0x01b8;
    L_0x018a:
        r1 = r12.f7125B;
        r0 = r8.mTargetIndex;
        r0 = r1.get(r0);
        r0 = (X.AnonymousClass0IL) r0;
        r8.mTarget = r0;
        if (r0 != 0) goto L_0x01b8;
    L_0x0198:
        r4 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Re-attaching retained fragment ";
        r1.append(r0);
        r1.append(r8);
        r0 = " target no longer exists: ";
        r1.append(r0);
        r0 = r8.mTargetIndex;
        r1.append(r0);
        r0 = r1.toString();
        android.util.Log.w(r4, r0);
    L_0x01b8:
        r5 = r5 + 1;
        goto L_0x017e;
    L_0x01bb:
        r0 = r12.f7126C;
        r0.clear();
        r0 = r13.f17230C;
        if (r0 == 0) goto L_0x0233;
    L_0x01c4:
        r5 = 0;
    L_0x01c5:
        r0 = r13.f17230C;
        r0 = r0.length;
        if (r5 >= r0) goto L_0x0233;
    L_0x01ca:
        r1 = r12.f7125B;
        r0 = r13.f17230C;
        r0 = r0[r5];
        r4 = r1.get(r0);
        r4 = (X.AnonymousClass0IL) r4;
        if (r4 != 0) goto L_0x01f5;
    L_0x01d8:
        r6 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "No instantiated fragment for index #";
        r1.append(r0);
        r0 = r13.f17230C;
        r0 = r0[r5];
        r1.append(r0);
        r0 = r1.toString();
        r6.<init>(r0);
        r12.m5799a(r6);
    L_0x01f5:
        r0 = 1;
        r4.mAdded = r0;
        r0 = f7121e;
        if (r0 == 0) goto L_0x0214;
    L_0x01fc:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "restoreAllState: added #";
        r1.append(r0);
        r1.append(r5);
        r0 = ": ";
        r1.append(r0);
        r1.append(r4);
        r1.toString();
    L_0x0214:
        r0 = r12.f7126C;
        r0 = r0.contains(r4);
        if (r0 != 0) goto L_0x022b;
    L_0x021c:
        r1 = r12.f7126C;
        monitor-enter(r1);
        r0 = r12.f7126C;	 Catch:{ all -> 0x0228 }
        r0.add(r4);	 Catch:{ all -> 0x0228 }
        monitor-exit(r1);	 Catch:{ all -> 0x0228 }
        r5 = r5 + 1;
        goto L_0x01c5;
    L_0x0228:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0228 }
    L_0x022a:
        throw r0;
    L_0x022b:
        r1 = new java.lang.IllegalStateException;
        r0 = "Already added!";
        r1.<init>(r0);
        throw r1;
    L_0x0233:
        r0 = r13.f17231D;
        if (r0 == 0) goto L_0x03d8;
    L_0x0237:
        r1 = new java.util.ArrayList;
        r0 = r13.f17231D;
        r0 = r0.length;
        r1.<init>(r0);
        r12.f7128E = r1;
        r4 = 0;
    L_0x0242:
        r0 = r13.f17231D;
        r0 = r0.length;
        if (r4 >= r0) goto L_0x03da;
    L_0x0247:
        r0 = r13.f17231D;
        r5 = r0[r4];
        r2 = new X.0hg;
        r2.<init>(r12);
        r1 = 0;
        r8 = 0;
    L_0x0252:
        r0 = r5.f17252H;
        r0 = r0.length;
        if (r1 >= r0) goto L_0x02d2;
    L_0x0257:
        r7 = new X.0m9;
        r7.<init>();
        r0 = r5.f17252H;
        r6 = r1 + 1;
        r0 = r0[r1];
        r7.f9720B = r0;
        r0 = f7121e;
        if (r0 == 0) goto L_0x028c;
    L_0x0268:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Instantiate ";
        r1.append(r0);
        r1.append(r2);
        r0 = " op #";
        r1.append(r0);
        r1.append(r8);
        r0 = " base fragment #";
        r1.append(r0);
        r0 = r5.f17252H;
        r0 = r0[r6];
        r1.append(r0);
        r1.toString();
    L_0x028c:
        r0 = r5.f17252H;
        r10 = r6 + 1;
        r1 = r0[r6];
        if (r1 < 0) goto L_0x029f;
    L_0x0294:
        r0 = r12.f7125B;
        r0 = r0.get(r1);
        r0 = (X.AnonymousClass0IL) r0;
        r7.f9723E = r0;
        goto L_0x02a2;
    L_0x029f:
        r0 = 0;
        r7.f9723E = r0;
    L_0x02a2:
        r9 = r5.f17252H;
        r6 = r10 + 1;
        r0 = r9[r10];
        r7.f9721C = r0;
        r1 = r6 + 1;
        r0 = r9[r6];
        r7.f9722D = r0;
        r6 = r1 + 1;
        r0 = r9[r1];
        r7.f9724F = r0;
        r1 = r6 + 1;
        r0 = r9[r6];
        r7.f9725G = r0;
        r0 = r7.f9721C;
        r2.f8508J = r0;
        r0 = r7.f9722D;
        r2.f8509K = r0;
        r0 = r7.f9724F;
        r2.f8514P = r0;
        r0 = r7.f9725G;
        r2.f8515Q = r0;
        r2.m6799Q(r7);
        r8 = r8 + 1;
        goto L_0x0252;
    L_0x02d2:
        r0 = r5.f17256L;
        r2.f8519U = r0;
        r0 = r5.f17257M;
        r2.f8520V = r0;
        r0 = r5.f17251G;
        r2.f8512N = r0;
        r0 = r5.f17250F;
        r2.f8510L = r0;
        r1 = 1;
        r2.f8500B = r1;
        r0 = r5.f17248D;
        r2.f8504F = r0;
        r0 = r5.f17249E;
        r2.f8505G = r0;
        r0 = r5.f17246B;
        r2.f8502D = r0;
        r0 = r5.f17247C;
        r2.f8503E = r0;
        r0 = r5.f17254J;
        r2.f8517S = r0;
        r0 = r5.f17255K;
        r2.f8518T = r0;
        r0 = r5.f17253I;
        r2.f8516R = r0;
        r2.m6800R(r1);
        r0 = f7121e;
        if (r0 == 0) goto L_0x033e;
    L_0x0308:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "restoreAllState: back stack #";
        r1.append(r0);
        r1.append(r4);
        r0 = " (index ";
        r1.append(r0);
        r0 = r2.f8510L;
        r1.append(r0);
        r0 = "): ";
        r1.append(r0);
        r1.append(r2);
        r1.toString();
        r5 = new X.1mT;
        r0 = "FragmentManager";
        r5.<init>(r0);
        r1 = new java.io.PrintWriter;
        r1.<init>(r5);
        r0 = "  ";
        r2.m6803U(r0, r1, r3);
        r1.close();
    L_0x033e:
        r0 = r12.f7128E;
        r0.add(r2);
        r0 = r2.f8510L;
        if (r0 < 0) goto L_0x03d4;
    L_0x0347:
        r5 = r2.f8510L;
        monitor-enter(r12);
        r0 = r12.f7130G;	 Catch:{ all -> 0x03ef }
        if (r0 != 0) goto L_0x0355;
    L_0x034e:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x03ef }
        r0.<init>();	 Catch:{ all -> 0x03ef }
        r12.f7130G = r0;	 Catch:{ all -> 0x03ef }
    L_0x0355:
        r0 = r12.f7130G;	 Catch:{ all -> 0x03ef }
        r6 = r0.size();	 Catch:{ all -> 0x03ef }
        if (r5 >= r6) goto L_0x037f;
    L_0x035d:
        r0 = f7121e;	 Catch:{ all -> 0x03ef }
        if (r0 == 0) goto L_0x0379;
    L_0x0361:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03ef }
        r1.<init>();	 Catch:{ all -> 0x03ef }
        r0 = "Setting back stack index ";
        r1.append(r0);	 Catch:{ all -> 0x03ef }
        r1.append(r5);	 Catch:{ all -> 0x03ef }
        r0 = " to ";
        r1.append(r0);	 Catch:{ all -> 0x03ef }
        r1.append(r2);	 Catch:{ all -> 0x03ef }
        r1.toString();	 Catch:{ all -> 0x03ef }
    L_0x0379:
        r0 = r12.f7130G;	 Catch:{ all -> 0x03ef }
        r0.set(r5, r2);	 Catch:{ all -> 0x03ef }
        goto L_0x03d3;
    L_0x037f:
        if (r6 >= r5) goto L_0x03b2;
    L_0x0381:
        r1 = r12.f7130G;	 Catch:{ all -> 0x03ef }
        r0 = 0;
        r1.add(r0);	 Catch:{ all -> 0x03ef }
        r0 = r12.f7127D;	 Catch:{ all -> 0x03ef }
        if (r0 != 0) goto L_0x0392;
    L_0x038b:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x03ef }
        r0.<init>();	 Catch:{ all -> 0x03ef }
        r12.f7127D = r0;	 Catch:{ all -> 0x03ef }
    L_0x0392:
        r0 = f7121e;	 Catch:{ all -> 0x03ef }
        if (r0 == 0) goto L_0x03a6;
    L_0x0396:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03ef }
        r1.<init>();	 Catch:{ all -> 0x03ef }
        r0 = "Adding available back stack index ";
        r1.append(r0);	 Catch:{ all -> 0x03ef }
        r1.append(r6);	 Catch:{ all -> 0x03ef }
        r1.toString();	 Catch:{ all -> 0x03ef }
    L_0x03a6:
        r1 = r12.f7127D;	 Catch:{ all -> 0x03ef }
        r0 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x03ef }
        r1.add(r0);	 Catch:{ all -> 0x03ef }
        r6 = r6 + 1;
        goto L_0x037f;
    L_0x03b2:
        r0 = f7121e;	 Catch:{ all -> 0x03ef }
        if (r0 == 0) goto L_0x03ce;
    L_0x03b6:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03ef }
        r1.<init>();	 Catch:{ all -> 0x03ef }
        r0 = "Adding back stack index ";
        r1.append(r0);	 Catch:{ all -> 0x03ef }
        r1.append(r5);	 Catch:{ all -> 0x03ef }
        r0 = " with ";
        r1.append(r0);	 Catch:{ all -> 0x03ef }
        r1.append(r2);	 Catch:{ all -> 0x03ef }
        r1.toString();	 Catch:{ all -> 0x03ef }
    L_0x03ce:
        r0 = r12.f7130G;	 Catch:{ all -> 0x03ef }
        r0.add(r2);	 Catch:{ all -> 0x03ef }
    L_0x03d3:
        monitor-exit(r12);	 Catch:{ all -> 0x03ef }
    L_0x03d4:
        r4 = r4 + 1;
        goto L_0x0242;
    L_0x03d8:
        r12.f7128E = r2;
    L_0x03da:
        r0 = r13.f17233F;
        if (r0 < 0) goto L_0x03ea;
    L_0x03de:
        r1 = r12.f7125B;
        r0 = r13.f17233F;
        r0 = r1.get(r0);
        r0 = (X.AnonymousClass0IL) r0;
        r12.f7145V = r0;
    L_0x03ea:
        r0 = r13.f17232E;
        r12.f7140Q = r0;
        return;
    L_0x03ef:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x03ef }
        goto L_0x022a;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cP.OA(android.os.Parcelable, X.0e2):void");
    }

    /* renamed from: P */
    private void m5788P() {
        SparseArray sparseArray = this.f7125B;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f7125B.valueAt(size) == null) {
                    SparseArray sparseArray2 = this.f7125B;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: P */
    public final boolean mo1464P(int i, int i2) {
        m5789Q();
        AA();
        if (i >= 0) {
            return m5797Y(null, i, i2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final Parcelable PA() {
        AnonymousClass0cP anonymousClass0cP = this;
        m5795W();
        SparseArray sparseArray = this.f7125B;
        int i = 0;
        int size = sparseArray == null ? 0 : sparseArray.size();
        while (i < size) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) anonymousClass0cP.f7125B.valueAt(i);
            if (anonymousClass0IL != null) {
                if (anonymousClass0IL.getAnimatingAway() != null) {
                    int stateAfterAnimating = anonymousClass0IL.getStateAfterAnimating();
                    View animatingAway = anonymousClass0IL.getAnimatingAway();
                    anonymousClass0IL.setAnimatingAway(null);
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    JA(anonymousClass0IL, stateAfterAnimating, 0, 0, false);
                } else if (anonymousClass0IL.getAnimator() != null) {
                    anonymousClass0IL.getAnimator().end();
                }
            }
            i++;
        }
        AA();
        anonymousClass0cP.f7149Z = true;
        BackStackState[] backStackStateArr = null;
        anonymousClass0cP.f7146W = null;
        sparseArray = anonymousClass0cP.f7125B;
        if (sparseArray != null) {
            if (sparseArray.size() > 0) {
                StringBuilder stringBuilder;
                int size2 = anonymousClass0cP.f7125B.size();
                FragmentState[] fragmentStateArr = new FragmentState[size2];
                Object obj = null;
                for (i = 0; i < size2; i++) {
                    AnonymousClass0IL anonymousClass0IL2 = (AnonymousClass0IL) anonymousClass0cP.f7125B.valueAt(i);
                    if (anonymousClass0IL2 != null) {
                        if (anonymousClass0IL2.mIndex < 0) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Failure saving state: active ");
                            stringBuilder.append(anonymousClass0IL2);
                            stringBuilder.append(" has cleared index: ");
                            stringBuilder.append(anonymousClass0IL2.mIndex);
                            m5799a(new IllegalStateException(stringBuilder.toString()));
                        }
                        FragmentState fragmentState = new FragmentState(anonymousClass0IL2);
                        fragmentStateArr[i] = fragmentState;
                        if (anonymousClass0IL2.mState <= 0 || fragmentState.f17244L != null) {
                            fragmentState.f17244L = anonymousClass0IL2.mSavedFragmentState;
                        } else {
                            fragmentState.f17244L = QA(anonymousClass0IL2);
                            if (anonymousClass0IL2.mTarget != null) {
                                if (anonymousClass0IL2.mTarget.mIndex < 0) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failure saving state: ");
                                    stringBuilder.append(anonymousClass0IL2);
                                    stringBuilder.append(" has target not in fragment manager: ");
                                    stringBuilder.append(anonymousClass0IL2.mTarget);
                                    m5799a(new IllegalStateException(stringBuilder.toString()));
                                }
                                if (fragmentState.f17244L == null) {
                                    fragmentState.f17244L = new Bundle();
                                }
                                mo1466R(fragmentState.f17244L, "android:target_state", anonymousClass0IL2.mTarget);
                                if (anonymousClass0IL2.mTargetRequestCode != 0) {
                                    fragmentState.f17244L.putInt("android:target_req_state", anonymousClass0IL2.mTargetRequestCode);
                                }
                            }
                        }
                        if (f7121e) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Saved state of ");
                            stringBuilder.append(anonymousClass0IL2);
                            stringBuilder.append(": ");
                            stringBuilder.append(fragmentState.f17244L);
                            stringBuilder.toString();
                        }
                        obj = 1;
                    }
                }
                if (obj == null) {
                    boolean z = f7121e;
                } else {
                    int[] iArr;
                    size2 = anonymousClass0cP.f7126C.size();
                    if (size2 > 0) {
                        iArr = new int[size2];
                        for (size = 0; size < size2; size++) {
                            int i2 = ((AnonymousClass0IL) anonymousClass0cP.f7126C.get(size)).mIndex;
                            iArr[size] = i2;
                            if (i2 < 0) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Failure saving state: active ");
                                stringBuilder.append(anonymousClass0cP.f7126C.get(size));
                                stringBuilder.append(" has cleared index: ");
                                stringBuilder.append(iArr[size]);
                                m5799a(new IllegalStateException(stringBuilder.toString()));
                            }
                            if (f7121e) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("saveAllState: adding fragment #");
                                stringBuilder.append(size);
                                stringBuilder.append(": ");
                                stringBuilder.append(anonymousClass0cP.f7126C.get(size));
                                stringBuilder.toString();
                            }
                        }
                    } else {
                        iArr = null;
                    }
                    ArrayList arrayList = anonymousClass0cP.f7128E;
                    if (arrayList != null) {
                        size = arrayList.size();
                        if (size > 0) {
                            backStackStateArr = new BackStackState[size];
                            for (int i3 = 0; i3 < size; i3++) {
                                backStackStateArr[i3] = new BackStackState((AnonymousClass0hg) anonymousClass0cP.f7128E.get(i3));
                                if (f7121e) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("saveAllState: adding back stack #");
                                    stringBuilder.append(i3);
                                    stringBuilder.append(": ");
                                    stringBuilder.append(anonymousClass0cP.f7128E.get(i3));
                                    stringBuilder.toString();
                                }
                            }
                        }
                    }
                    Parcelable fragmentManagerState = new FragmentManagerState();
                    fragmentManagerState.f17229B = fragmentStateArr;
                    fragmentManagerState.f17230C = iArr;
                    fragmentManagerState.f17231D = backStackStateArr;
                    AnonymousClass0IL anonymousClass0IL3 = anonymousClass0cP.f7145V;
                    if (anonymousClass0IL3 != null) {
                        fragmentManagerState.f17233F = anonymousClass0IL3.mIndex;
                    }
                    fragmentManagerState.f17232E = anonymousClass0cP.f7140Q;
                    SA();
                    return fragmentManagerState;
                }
            }
        }
        return null;
    }

    /* renamed from: Q */
    private void m5789Q() {
        if (this.f7149Z) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f7141R != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not perform this action inside of ");
            stringBuilder.append(this.f7141R);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: Q */
    public final boolean mo1465Q(String str, int i) {
        m5789Q();
        return m5797Y(str, -1, i);
    }

    public final Bundle QA(AnonymousClass0IL anonymousClass0IL) {
        Bundle bundle;
        if (this.f7148Y == null) {
            this.f7148Y = new Bundle();
        }
        anonymousClass0IL.performSaveInstanceState(this.f7148Y);
        m5841p(anonymousClass0IL, this.f7148Y, false);
        if (this.f7148Y.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f7148Y;
            this.f7148Y = null;
        }
        if (anonymousClass0IL.mView != null) {
            RA(anonymousClass0IL);
        }
        if (anonymousClass0IL.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", anonymousClass0IL.mSavedViewState);
        }
        if (!anonymousClass0IL.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", anonymousClass0IL.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: R */
    private void m5790R() {
        this.f7136M = false;
        this.f7151b.clear();
        this.f7152c.clear();
    }

    /* renamed from: R */
    public final void mo1466R(Bundle bundle, String str, AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.append(" is not currently in the FragmentManager");
            m5799a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, anonymousClass0IL.mIndex);
    }

    public final void RA(AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL.mInnerView != null) {
            SparseArray sparseArray = this.f7147X;
            if (sparseArray == null) {
                this.f7147X = new SparseArray();
            } else {
                sparseArray.clear();
            }
            anonymousClass0IL.mInnerView.saveHierarchyState(this.f7147X);
            if (this.f7147X.size() > 0) {
                anonymousClass0IL.mSavedViewState = this.f7147X;
                this.f7147X = null;
            }
        }
    }

    /* renamed from: S */
    public final void mo1467S(AnonymousClass0cK anonymousClass0cK) {
        ArrayList arrayList = this.f7129F;
        if (arrayList != null) {
            arrayList.remove(anonymousClass0cK);
        }
    }

    /* renamed from: S */
    private void m5791S(boolean z) {
        if (this.f7136M) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() == this.f7138O.f7004E.getLooper()) {
            if (!z) {
                m5789Q();
            }
            if (this.f7152c == null) {
                this.f7152c = new ArrayList();
                this.f7151b = new ArrayList();
            }
            this.f7136M = true;
            try {
                m5793U(null, null);
            } finally {
                this.f7136M = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public final void SA() {
        List list;
        List list2;
        if (this.f7125B != null) {
            list = null;
            list2 = null;
            for (int i = 0; i < this.f7125B.size(); i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(i);
                if (anonymousClass0IL != null) {
                    Object obj;
                    if (anonymousClass0IL.mRetainInstance) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(anonymousClass0IL);
                        anonymousClass0IL.mTargetIndex = anonymousClass0IL.mTarget != null ? anonymousClass0IL.mTarget.mIndex : -1;
                        if (f7121e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("retainNonConfig: keeping retained ");
                            stringBuilder.append(anonymousClass0IL);
                            stringBuilder.toString();
                        }
                    }
                    if (anonymousClass0IL.mChildFragmentManager != null) {
                        anonymousClass0IL.mChildFragmentManager.SA();
                        obj = anonymousClass0IL.mChildFragmentManager.f7146W;
                    } else {
                        obj = anonymousClass0IL.mChildNonConfig;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.f7125B.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        if (list == null && list2 == null) {
            this.f7146W = null;
        } else {
            this.f7146W = new AnonymousClass0e2(list, list2);
        }
    }

    /* renamed from: T */
    public final Fragment$SavedState mo1468T(AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.append(" is not currently in the FragmentManager");
            m5799a(new IllegalStateException(stringBuilder.toString()));
        }
        if (anonymousClass0IL.mState <= 0) {
            return null;
        }
        Bundle QA = QA(anonymousClass0IL);
        if (QA != null) {
            return new Fragment$SavedState(QA);
        }
        return null;
    }

    /* renamed from: T */
    private void m5792T(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3 = i;
        ArrayList arrayList3 = arrayList;
        boolean z = ((AnonymousClass0hg) arrayList3.get(i3)).f8516R;
        ArrayList arrayList4 = this.f7150a;
        if (arrayList4 == null) {
            r13.f7150a = new ArrayList();
        } else {
            arrayList4.clear();
        }
        r13.f7150a.addAll(r13.f7126C);
        AnonymousClass0IL anonymousClass0IL = r13.f7145V;
        int i4 = i3;
        Object obj = null;
        while (true) {
            ArrayList arrayList5 = arrayList2;
            int i5 = i2;
            AnonymousClass0hg anonymousClass0hg;
            int i6;
            int i7;
            AnonymousClass0IL anonymousClass0IL2;
            if (i4 < i5) {
                anonymousClass0hg = (AnonymousClass0hg) arrayList3.get(i4);
                int i8;
                if (((Boolean) arrayList5.get(i4)).booleanValue()) {
                    ArrayList arrayList6 = r13.f7150a;
                    for (i8 = 0; i8 < anonymousClass0hg.f8513O.size(); i8++) {
                        AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) anonymousClass0hg.f8513O.get(i8);
                        i6 = anonymousClass0m9.f9720B;
                        if (i6 != 1) {
                            if (i6 != 3) {
                                switch (i6) {
                                    case 6:
                                        break;
                                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                                        break;
                                    case 8:
                                        anonymousClass0IL = null;
                                        break;
                                    case 9:
                                        anonymousClass0IL = anonymousClass0m9.f9723E;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            arrayList6.add(anonymousClass0m9.f9723E);
                        }
                        arrayList6.remove(anonymousClass0m9.f9723E);
                    }
                } else {
                    ArrayList arrayList7 = r13.f7150a;
                    i7 = 0;
                    while (i7 < anonymousClass0hg.f8513O.size()) {
                        AnonymousClass0m9 anonymousClass0m92 = (AnonymousClass0m9) anonymousClass0hg.f8513O.get(i7);
                        switch (anonymousClass0m92.f9720B) {
                            case 1:
                            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                                arrayList7.add(anonymousClass0m92.f9723E);
                                break;
                            case 2:
                                AnonymousClass0IL anonymousClass0IL3 = anonymousClass0m92.f9723E;
                                arrayList = anonymousClass0IL3.mContainerId;
                                Object obj2 = null;
                                for (i8 = arrayList7.size() - 1; i8 >= 0; i8--) {
                                    anonymousClass0IL2 = (AnonymousClass0IL) arrayList7.get(i8);
                                    if (anonymousClass0IL2.mContainerId == arrayList) {
                                        if (anonymousClass0IL2 == anonymousClass0IL3) {
                                            obj2 = 1;
                                        } else {
                                            if (anonymousClass0IL2 == anonymousClass0IL) {
                                                anonymousClass0hg.f8513O.add(i7, new AnonymousClass0m9(9, anonymousClass0IL2));
                                                i7++;
                                                anonymousClass0IL = null;
                                            }
                                            AnonymousClass0m9 anonymousClass0m93 = new AnonymousClass0m9(3, anonymousClass0IL2);
                                            anonymousClass0m93.f9721C = anonymousClass0m92.f9721C;
                                            anonymousClass0m93.f9724F = anonymousClass0m92.f9724F;
                                            anonymousClass0m93.f9722D = anonymousClass0m92.f9722D;
                                            anonymousClass0m93.f9725G = anonymousClass0m92.f9725G;
                                            anonymousClass0hg.f8513O.add(i7, anonymousClass0m93);
                                            arrayList7.remove(anonymousClass0IL2);
                                            i7++;
                                        }
                                    }
                                }
                                if (obj2 == null) {
                                    anonymousClass0m92.f9720B = 1;
                                    arrayList7.add(anonymousClass0IL3);
                                    break;
                                }
                                anonymousClass0hg.f8513O.remove(i7);
                                i7--;
                                break;
                            case 3:
                            case 6:
                                arrayList7.remove(anonymousClass0m92.f9723E);
                                if (anonymousClass0m92.f9723E != anonymousClass0IL) {
                                    break;
                                }
                                anonymousClass0hg.f8513O.add(i7, new AnonymousClass0m9(9, anonymousClass0m92.f9723E));
                                i7++;
                                anonymousClass0IL = null;
                                break;
                            case 4:
                            case 5:
                                break;
                            case 8:
                                anonymousClass0hg.f8513O.add(i7, new AnonymousClass0m9(9, anonymousClass0IL));
                                i7++;
                                anonymousClass0IL = anonymousClass0m92.f9723E;
                                break;
                            default:
                                break;
                        }
                        i7++;
                    }
                }
                if (obj == null) {
                    if (!anonymousClass0hg.f8500B) {
                        obj = null;
                        i4++;
                    }
                }
                obj = 1;
                i4++;
            } else {
                int i9;
                r13.f7150a.clear();
                if (!z) {
                    AnonymousClass0mA.m7482I(r13, arrayList3, arrayList5, i3, i5, 0);
                }
                for (i9 = i3; i9 < i5; i9++) {
                    AnonymousClass0hg anonymousClass0hg2 = (AnonymousClass0hg) arrayList3.get(i9);
                    boolean z2 = true;
                    if (((Boolean) arrayList5.get(i9)).booleanValue()) {
                        anonymousClass0hg2.m6800R(-1);
                        if (i9 != i2 - 1) {
                            z2 = false;
                        }
                        anonymousClass0hg2.m6805W(z2);
                    } else {
                        anonymousClass0hg2.m6800R(1);
                        anonymousClass0hg2.m6804V();
                    }
                }
                if (z) {
                    AnonymousClass1mS anonymousClass1mS = new AnonymousClass1mS();
                    AnonymousClass0cP.m5774B(r13, anonymousClass1mS);
                    i7 = i5;
                    for (i4 = i2 - 1; i4 >= i3; i4--) {
                        anonymousClass0hg = (AnonymousClass0hg) arrayList3.get(i4);
                        boolean booleanValue = ((Boolean) arrayList5.get(i4)).booleanValue();
                        Object obj3 = (!anonymousClass0hg.m6808Z() || anonymousClass0hg.m6807Y(arrayList3, i4 + 1, i5)) ? null : 1;
                        if (obj3 != null) {
                            if (r13.f7144U == null) {
                                r13.f7144U = new ArrayList();
                            }
                            AnonymousClass1lK anonymousClass2O7 = new AnonymousClass2O7(anonymousClass0hg, booleanValue);
                            r13.f7144U.add(anonymousClass2O7);
                            for (i6 = 0; i6 < anonymousClass0hg.f8513O.size(); i6++) {
                                AnonymousClass0m9 anonymousClass0m94 = (AnonymousClass0m9) anonymousClass0hg.f8513O.get(i6);
                                if (AnonymousClass0hg.m6781B(anonymousClass0m94)) {
                                    anonymousClass0m94.f9723E.setOnStartEnterTransitionListener(anonymousClass2O7);
                                }
                            }
                            if (booleanValue) {
                                anonymousClass0hg.m6804V();
                            } else {
                                anonymousClass0hg.m6805W(false);
                            }
                            i7--;
                            if (i4 != i7) {
                                arrayList3.remove(i4);
                                arrayList3.add(i7, anonymousClass0hg);
                            }
                            AnonymousClass0cP.m5774B(r13, anonymousClass1mS);
                        }
                    }
                    int size = anonymousClass1mS.size();
                    for (i9 = 0; i9 < size; i9++) {
                        anonymousClass0IL2 = (AnonymousClass0IL) anonymousClass1mS.f22596B[i9];
                        if (!anonymousClass0IL2.mAdded) {
                            View view = anonymousClass0IL2.getView();
                            anonymousClass0IL2.mPostponedAlpha = view.getAlpha();
                            view.setAlpha(0.0f);
                        }
                    }
                } else {
                    i7 = i5;
                }
                if (i7 != i3 && z) {
                    AnonymousClass0mA.m7482I(r13, arrayList3, arrayList5, i3, i7, true);
                    HA(r13.f7133J, true);
                }
                while (i3 < i5) {
                    int i10;
                    AnonymousClass0hg anonymousClass0hg3 = (AnonymousClass0hg) arrayList3.get(i3);
                    if (((Boolean) arrayList5.get(i3)).booleanValue() && anonymousClass0hg3.f8510L >= 0) {
                        i10 = anonymousClass0hg3.f8510L;
                        synchronized (r13) {
                            r13.f7130G.set(i10, null);
                            if (r13.f7127D == null) {
                                r13.f7127D = new ArrayList();
                            }
                            if (f7121e) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Freeing back stack index ");
                                stringBuilder.append(i10);
                                stringBuilder.toString();
                            }
                            r13.f7127D.add(Integer.valueOf(i10));
                        }
                        anonymousClass0hg3.f8510L = -1;
                    }
                    arrayList4 = anonymousClass0hg3.f8506H;
                    if (arrayList4 != null) {
                        i6 = arrayList4.size();
                        for (i10 = 0; i10 < i6; i10++) {
                            ((Runnable) anonymousClass0hg3.f8506H.get(i10)).run();
                        }
                        anonymousClass0hg3.f8506H = null;
                    }
                    i3++;
                }
                if (obj != null && r13.f7129F != null) {
                    for (i6 = 0; i6 < r13.f7129F.size(); i6++) {
                        ((AnonymousClass0cK) r13.f7129F.get(i6)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void TA(AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL != null) {
            if (this.f7125B.get(anonymousClass0IL.mIndex) == anonymousClass0IL) {
                if (anonymousClass0IL.mHost != null) {
                    if (anonymousClass0IL.getFragmentManager() == this) {
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.append(" is not an active fragment of FragmentManager ");
            stringBuilder.append(this);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f7145V = anonymousClass0IL;
    }

    /* renamed from: U */
    public final void m5820U(AnonymousClass0IL anonymousClass0IL, boolean z) {
        if (f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add: ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.toString();
        }
        EA(anonymousClass0IL);
        if (!anonymousClass0IL.mDetached) {
            if (this.f7126C.contains(anonymousClass0IL)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment already added: ");
                stringBuilder.append(anonymousClass0IL);
                throw new IllegalStateException(stringBuilder.toString());
            }
            synchronized (this.f7126C) {
                this.f7126C.add(anonymousClass0IL);
            }
            anonymousClass0IL.mAdded = true;
            anonymousClass0IL.mRemoving = false;
            if (anonymousClass0IL.mView == null) {
                anonymousClass0IL.mHiddenChanged = false;
            }
            if (anonymousClass0IL.mHasMenu && anonymousClass0IL.mMenuVisible) {
                this.f7139P = true;
            }
            if (z) {
                IA(anonymousClass0IL);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: U */
    private void m5793U(java.util.ArrayList r8, java.util.ArrayList r9) {
        /*
        r7 = this;
        r0 = r7.f7144U;
        r6 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r5 = 0;
        goto L_0x000b;
    L_0x0007:
        r5 = r0.size();
    L_0x000b:
        r4 = 0;
    L_0x000c:
        if (r4 >= r5) goto L_0x007f;
    L_0x000e:
        r0 = r7.f7144U;
        r1 = r0.get(r4);
        r1 = (X.AnonymousClass2O7) r1;
        r3 = -1;
        if (r8 == 0) goto L_0x003e;
    L_0x0019:
        r0 = r1.f29887B;
        if (r0 != 0) goto L_0x003e;
    L_0x001d:
        r0 = r1.f29889D;
        r0 = r8.indexOf(r0);
        if (r0 == r3) goto L_0x003e;
    L_0x0025:
        r0 = r9.get(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x003e;
    L_0x0031:
        r0 = r1.f29889D;
        r3 = r0.f8511M;
        r2 = r1.f29889D;
        r1 = r1.f29887B;
        r0 = 0;
        X.AnonymousClass0cP.m5775C(r3, r2, r1, r0, r0);
        goto L_0x007c;
    L_0x003e:
        r0 = r1.f29888C;
        if (r0 != 0) goto L_0x0044;
    L_0x0042:
        r0 = 1;
        goto L_0x0045;
    L_0x0044:
        r0 = 0;
    L_0x0045:
        if (r0 != 0) goto L_0x0055;
    L_0x0047:
        if (r8 == 0) goto L_0x007c;
    L_0x0049:
        r2 = r1.f29889D;
        r0 = r8.size();
        r0 = r2.m6807Y(r8, r6, r0);
        if (r0 == 0) goto L_0x007c;
    L_0x0055:
        r0 = r7.f7144U;
        r0.remove(r4);
        r4 = r4 + -1;
        r5 = r5 + -1;
        if (r8 == 0) goto L_0x0079;
    L_0x0060:
        r0 = r1.f29887B;
        if (r0 != 0) goto L_0x0079;
    L_0x0064:
        r0 = r1.f29889D;
        r0 = r8.indexOf(r0);
        if (r0 == r3) goto L_0x0079;
    L_0x006c:
        r0 = r9.get(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0031;
    L_0x0079:
        r1.A();
    L_0x007c:
        r4 = r4 + 1;
        goto L_0x000c;
    L_0x007f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cP.U(java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void UA() {
        if (this.f7125B != null) {
            for (int i = 0; i < this.f7125B.size(); i++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(i);
                if (anonymousClass0IL != null) {
                    LA(anonymousClass0IL);
                }
            }
        }
    }

    /* renamed from: V */
    public final int m5821V(AnonymousClass0hg anonymousClass0hg) {
        int intValue;
        synchronized (this) {
            if (this.f7127D != null) {
                if (this.f7127D.size() > 0) {
                    intValue = ((Integer) this.f7127D.remove(this.f7127D.size() - 1)).intValue();
                    if (f7121e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Adding back stack index ");
                        stringBuilder.append(intValue);
                        stringBuilder.append(" with ");
                        stringBuilder.append(anonymousClass0hg);
                        stringBuilder.toString();
                    }
                    this.f7130G.set(intValue, anonymousClass0hg);
                }
            }
            if (this.f7130G == null) {
                this.f7130G = new ArrayList();
            }
            intValue = this.f7130G.size();
            if (f7121e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Setting back stack index ");
                stringBuilder.append(intValue);
                stringBuilder.append(" to ");
                stringBuilder.append(anonymousClass0hg);
                stringBuilder.toString();
            }
            this.f7130G.add(anonymousClass0hg);
        }
        return intValue;
    }

    /* renamed from: V */
    private AnonymousClass0IL m5794V(AnonymousClass0IL anonymousClass0IL) {
        ViewGroup viewGroup = anonymousClass0IL.mContainer;
        View view = anonymousClass0IL.mView;
        if (viewGroup != null) {
            if (view != null) {
                for (int indexOf = this.f7126C.indexOf(anonymousClass0IL) - 1; indexOf >= 0; indexOf--) {
                    AnonymousClass0IL anonymousClass0IL2 = (AnonymousClass0IL) this.f7126C.get(indexOf);
                    if (anonymousClass0IL2.mContainer == viewGroup && anonymousClass0IL2.mView != null) {
                        return anonymousClass0IL2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: W */
    private void m5795W() {
        if (this.f7144U != null) {
            while (!this.f7144U.isEmpty()) {
                ((AnonymousClass2O7) this.f7144U.remove(0)).A();
            }
        }
    }

    /* renamed from: W */
    public final void m5822W(AnonymousClass0c8 anonymousClass0c8, AnonymousClass0c9 anonymousClass0c9, AnonymousClass0IL anonymousClass0IL) {
        if (this.f7138O == null) {
            this.f7138O = anonymousClass0c8;
            this.f7131H = anonymousClass0c9;
            this.f7142S = anonymousClass0IL;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: X */
    public final void m5823X(AnonymousClass0IL anonymousClass0IL) {
        if (f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.toString();
        }
        if (anonymousClass0IL.mDetached) {
            anonymousClass0IL.mDetached = false;
            if (!anonymousClass0IL.mAdded) {
                if (this.f7126C.contains(anonymousClass0IL)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Fragment already added: ");
                    stringBuilder.append(anonymousClass0IL);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (f7121e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append(anonymousClass0IL);
                    stringBuilder.toString();
                }
                synchronized (this.f7126C) {
                    this.f7126C.add(anonymousClass0IL);
                }
                anonymousClass0IL.mAdded = true;
                if (anonymousClass0IL.mHasMenu && anonymousClass0IL.mMenuVisible) {
                    this.f7139P = true;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: X */
    private boolean m5796X(java.util.ArrayList r5, java.util.ArrayList r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f7143T;	 Catch:{ all -> 0x003d }
        r2 = 0;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r0 = r4.f7143T;	 Catch:{ all -> 0x003d }
        r0 = r0.size();	 Catch:{ all -> 0x003d }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x003b;
    L_0x000f:
        r0 = r4.f7143T;	 Catch:{ all -> 0x003d }
        r1 = r0.size();	 Catch:{ all -> 0x003d }
        r3 = 0;
    L_0x0016:
        if (r2 >= r1) goto L_0x0028;
    L_0x0018:
        r0 = r4.f7143T;	 Catch:{ all -> 0x003d }
        r0 = r0.get(r2);	 Catch:{ all -> 0x003d }
        r0 = (X.AnonymousClass0hh) r0;	 Catch:{ all -> 0x003d }
        r0 = r0.wH(r5, r6);	 Catch:{ all -> 0x003d }
        r3 = r3 | r0;
        r2 = r2 + 1;
        goto L_0x0016;
    L_0x0028:
        r0 = r4.f7143T;	 Catch:{ all -> 0x003d }
        r0.clear();	 Catch:{ all -> 0x003d }
        r0 = r4.f7138O;	 Catch:{ all -> 0x003d }
        r2 = r0.f7004E;	 Catch:{ all -> 0x003d }
        r1 = r4.f7135L;	 Catch:{ all -> 0x003d }
        r0 = 615765916; // 0x24b3d79c float:7.799413E-17 double:3.04228785E-315;
        X.AnonymousClass0OR.m3627G(r2, r1, r0);	 Catch:{ all -> 0x003d }
        monitor-exit(r4);	 Catch:{ all -> 0x003d }
        return r3;
    L_0x003b:
        monitor-exit(r4);	 Catch:{ all -> 0x003d }
        return r2;
    L_0x003d:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cP.X(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: Y */
    public final void m5824Y(AnonymousClass0IL anonymousClass0IL) {
        if (f7121e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.toString();
        }
        if (!anonymousClass0IL.mDetached) {
            anonymousClass0IL.mDetached = true;
            if (anonymousClass0IL.mAdded) {
                if (f7121e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("remove from detach: ");
                    stringBuilder.append(anonymousClass0IL);
                    stringBuilder.toString();
                }
                synchronized (this.f7126C) {
                    this.f7126C.remove(anonymousClass0IL);
                }
                if (anonymousClass0IL.mHasMenu && anonymousClass0IL.mMenuVisible) {
                    this.f7139P = true;
                }
                anonymousClass0IL.mAdded = false;
            }
        }
    }

    /* renamed from: Y */
    private boolean m5797Y(String str, int i, int i2) {
        AnonymousClass0cP anonymousClass0cP = this;
        AA();
        m5791S(true);
        AnonymousClass0IL anonymousClass0IL = this.f7145V;
        if (anonymousClass0IL != null && i < 0 && str == null) {
            AnonymousClass0IU peekChildFragmentManager = anonymousClass0IL.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.mo1463O()) {
                return true;
            }
        }
        boolean MA = MA(this.f7152c, this.f7151b, str, i, i2);
        if (MA) {
            anonymousClass0cP.f7136M = true;
            try {
                m5798Z(anonymousClass0cP.f7152c, anonymousClass0cP.f7151b);
            } finally {
                m5790R();
            }
        }
        m5850y();
        m5788P();
        return MA;
    }

    /* renamed from: Z */
    public final void m5825Z(Configuration configuration) {
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: Z */
    private void m5798Z(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return;
        }
        if (!arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m5793U(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((AnonymousClass0hg) arrayList.get(i)).f8516R) {
                    if (i2 != i) {
                        m5792T(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((AnonymousClass0hg) arrayList.get(i2)).f8516R) {
                            i2++;
                        }
                    }
                    m5792T(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m5792T(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: a */
    private void m5799a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new AnonymousClass1mT("FragmentManager"));
        AnonymousClass0c8 anonymousClass0c8 = this.f7138O;
        if (anonymousClass0c8 != null) {
            try {
                anonymousClass0c8.mo1481L("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo1451C("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public final boolean m5826a(MenuItem menuItem) {
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null && anonymousClass0IL.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m5827b() {
        this.f7149Z = false;
        AnonymousClass0cP.m5776D(this, 1);
    }

    /* renamed from: c */
    public final boolean m5828c(Menu menu, MenuInflater menuInflater) {
        ArrayList arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null && anonymousClass0IL.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(anonymousClass0IL);
                z = true;
            }
        }
        if (this.f7132I != null) {
            for (int i2 = 0; i2 < this.f7132I.size(); i2++) {
                anonymousClass0IL = (AnonymousClass0IL) this.f7132I.get(i2);
                if (arrayList == null || !arrayList.contains(anonymousClass0IL)) {
                    anonymousClass0IL.onDestroyOptionsMenu();
                }
            }
        }
        this.f7132I = arrayList;
        return z;
    }

    /* renamed from: d */
    public final void m5829d() {
        this.f7134K = true;
        AA();
        AnonymousClass0cP.m5776D(this, 0);
        this.f7138O = null;
        this.f7131H = null;
        this.f7142S = null;
    }

    /* renamed from: e */
    public final void m5830e() {
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.performLowMemory();
            }
        }
    }

    /* renamed from: f */
    public final void m5831f(boolean z) {
        for (int size = this.f7126C.size() - 1; size >= 0; size--) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(size);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: g */
    public final void m5832g(AnonymousClass0IL anonymousClass0IL, Bundle bundle, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5832g(anonymousClass0IL, bundle, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: h */
    public final void m5833h(AnonymousClass0IL anonymousClass0IL, Context context, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5833h(anonymousClass0IL, context, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: i */
    public final void m5834i(AnonymousClass0IL anonymousClass0IL, Bundle bundle, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5834i(anonymousClass0IL, bundle, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: j */
    public final void m5835j(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5835j(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: k */
    public final void m5836k(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5836k(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: l */
    public final void m5837l(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5837l(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: m */
    public final void m5838m(AnonymousClass0IL anonymousClass0IL, Context context, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5838m(anonymousClass0IL, context, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: n */
    public final void m5839n(AnonymousClass0IL anonymousClass0IL, Bundle bundle, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5839n(anonymousClass0IL, bundle, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: o */
    public final void m5840o(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5840o(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1lV.f22489B);
            int i = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            AnonymousClass0cP anonymousClass0cP = this;
            if (AnonymousClass0IL.isSupportFragmentClass(this.f7138O.f7002C, attributeValue)) {
                StringBuilder stringBuilder;
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1) {
                    if (string == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                        stringBuilder.append(attributeValue);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                AnonymousClass0IL E = resourceId != -1 ? mo1453E(resourceId) : null;
                if (E == null && string != null) {
                    E = mo1454F(string);
                }
                if (E == null && i != -1) {
                    E = mo1453E(i);
                }
                if (f7121e) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("onCreateView: id=0x");
                    stringBuilder2.append(Integer.toHexString(resourceId));
                    stringBuilder2.append(" fname=");
                    stringBuilder2.append(attributeValue);
                    stringBuilder2.append(" existing=");
                    stringBuilder2.append(E);
                    stringBuilder2.toString();
                }
                if (E == null) {
                    E = anonymousClass0cP.f7131H.mo2047A(context, attributeValue, null);
                    E.mFromLayout = true;
                    E.mFragmentId = resourceId != 0 ? resourceId : i;
                    E.mContainerId = i;
                    E.mTag = string;
                    E.mInLayout = true;
                    E.mFragmentManager = anonymousClass0cP;
                    AnonymousClass0c8 anonymousClass0c8 = anonymousClass0cP.f7138O;
                    E.mHost = anonymousClass0c8;
                    E.onInflate(anonymousClass0c8.f7002C, attributeSet, E.mSavedFragmentState);
                    m5820U(E, true);
                } else if (E.mInLayout) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(attributeSet.getPositionDescription());
                    stringBuilder.append(": Duplicate id 0x");
                    stringBuilder.append(Integer.toHexString(resourceId));
                    stringBuilder.append(", tag ");
                    stringBuilder.append(string);
                    stringBuilder.append(", or parent id 0x");
                    stringBuilder.append(Integer.toHexString(i));
                    stringBuilder.append(" with another fragment for ");
                    stringBuilder.append(attributeValue);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else {
                    E.mInLayout = true;
                    E.mHost = anonymousClass0cP.f7138O;
                    if (!E.mRetaining) {
                        E.onInflate(anonymousClass0cP.f7138O.f7002C, attributeSet, E.mSavedFragmentState);
                    }
                }
                if (anonymousClass0cP.f7133J >= 1 || !E.mFromLayout) {
                    IA(E);
                } else {
                    JA(E, 1, null, null, null);
                }
                if (E.mView != null) {
                    if (resourceId != 0) {
                        E.mView.setId(resourceId);
                    }
                    if (E.mView.getTag() == null) {
                        E.mView.setTag(string);
                    }
                    return E.mView;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment ");
                stringBuilder.append(attributeValue);
                stringBuilder.append(" did not create a view.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return null;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public final void m5841p(AnonymousClass0IL anonymousClass0IL, Bundle bundle, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5841p(anonymousClass0IL, bundle, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: q */
    public final void m5842q(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5842q(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: r */
    public final void m5843r(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5843r(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: s */
    public final void m5844s(AnonymousClass0IL anonymousClass0IL, View view, Bundle bundle, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5844s(anonymousClass0IL, view, bundle, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    /* renamed from: t */
    public final void m5845t(AnonymousClass0IL anonymousClass0IL, boolean z) {
        AnonymousClass0IL anonymousClass0IL2 = this.f7142S;
        if (anonymousClass0IL2 != null) {
            AnonymousClass0IU fragmentManager = anonymousClass0IL2.getFragmentManager();
            if (fragmentManager instanceof AnonymousClass0cP) {
                ((AnonymousClass0cP) fragmentManager).m5845t(anonymousClass0IL, true);
            }
        }
        Iterator it = this.f7153d.iterator();
        while (it.hasNext()) {
            AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) it.next();
            if (!z || ((Boolean) anonymousClass0IC.f2728C).booleanValue()) {
                AnonymousClass1lO anonymousClass1lO = (AnonymousClass1lO) anonymousClass0IC.f2727B;
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        AnonymousClass0IL anonymousClass0IL = this.f7142S;
        if (anonymousClass0IL != null) {
            AnonymousClass1IL.m10648B(anonymousClass0IL, stringBuilder);
        } else {
            AnonymousClass1IL.m10648B(this.f7138O, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: u */
    public final boolean m5846u(MenuItem menuItem) {
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null && anonymousClass0IL.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m5847v(Menu menu) {
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: w */
    public final void m5848w(boolean z) {
        for (int size = this.f7126C.size() - 1; size >= 0; size--) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(size);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: x */
    public final boolean m5849x(Menu menu) {
        boolean z = false;
        for (int i = 0; i < this.f7126C.size(); i++) {
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7126C.get(i);
            if (anonymousClass0IL != null && anonymousClass0IL.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: y */
    public final void m5850y() {
        if (this.f7137N) {
            int i = 0;
            for (int i2 = 0; i2 < this.f7125B.size(); i2++) {
                AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) this.f7125B.valueAt(i2);
                if (!(anonymousClass0IL == null || anonymousClass0IL.mLoaderManager == null)) {
                    i |= anonymousClass0IL.mLoaderManager.m1709J();
                }
            }
            if (i == 0) {
                this.f7137N = false;
                UA();
            }
        }
    }

    /* renamed from: z */
    public final void m5851z(AnonymousClass0hh anonymousClass0hh, boolean z) {
        if (!z) {
            m5789Q();
        }
        synchronized (this) {
            if (!this.f7134K) {
                if (this.f7138O != null) {
                    if (this.f7143T == null) {
                        this.f7143T = new ArrayList();
                    }
                    this.f7143T.add(anonymousClass0hh);
                    AnonymousClass0cP.m5783K(this);
                }
            }
            if (z) {
            } else {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }
}

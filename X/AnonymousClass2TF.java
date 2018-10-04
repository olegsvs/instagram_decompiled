package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2TF */
public final class AnonymousClass2TF extends AnonymousClass1yt implements AnonymousClass20P {
    /* renamed from: B */
    public final Context f30731B;
    /* renamed from: C */
    public final Queue f30732C = new LinkedList();
    /* renamed from: D */
    public final Lock f30733D;
    /* renamed from: E */
    public final Map f30734E;
    /* renamed from: F */
    public Set f30735F = new HashSet();
    /* renamed from: G */
    public Set f30736G = null;
    /* renamed from: H */
    public final AnonymousClass20h f30737H;
    /* renamed from: I */
    private final int f30738I;
    /* renamed from: J */
    private final AnonymousClass1En f30739J;
    /* renamed from: K */
    private AnonymousClass2ST f30740K;
    /* renamed from: L */
    private boolean f30741L;
    /* renamed from: M */
    private AnonymousClass1za f30742M;
    /* renamed from: N */
    private Map f30743N;
    /* renamed from: O */
    private volatile boolean f30744O;
    /* renamed from: P */
    private long f30745P = 120000;
    /* renamed from: Q */
    private long f30746Q = 5000;
    /* renamed from: R */
    private final AnonymousClass20E f30747R;
    /* renamed from: S */
    private AnonymousClass1Et f30748S;
    /* renamed from: T */
    private final AnonymousClass20V f30749T = new AnonymousClass20V();
    /* renamed from: U */
    private final ArrayList f30750U;
    /* renamed from: V */
    private Integer f30751V = null;
    /* renamed from: W */
    private final AnonymousClass1zF f30752W = new AnonymousClass2TG(this);
    /* renamed from: X */
    private final AnonymousClass1zE f30753X;
    /* renamed from: Y */
    private AnonymousClass20O f30754Y = null;
    /* renamed from: Z */
    private final Looper f30755Z;

    public AnonymousClass2TF(Context context, Lock lock, Looper looper, AnonymousClass1za anonymousClass1za, AnonymousClass1En anonymousClass1En, AnonymousClass2ST anonymousClass2ST, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList, boolean z) {
        this.f30731B = context;
        this.f30733D = lock;
        this.f30741L = false;
        this.f30753X = new AnonymousClass1zE(looper, this.f30752W);
        this.f30755Z = looper;
        this.f30747R = new AnonymousClass20E(this, looper);
        this.f30739J = anonymousClass1En;
        this.f30738I = i;
        if (i >= 0) {
            this.f30751V = Integer.valueOf(i2);
        }
        this.f30743N = map;
        this.f30734E = map2;
        this.f30750U = arrayList;
        this.f30737H = new AnonymousClass20h(this.f30734E);
        for (AnonymousClass1yr A : list) {
            this.f30753X.m14077A(A);
        }
        for (AnonymousClass1ys B : list2) {
            this.f30753X.m14078B(B);
        }
        this.f30742M = anonymousClass1za;
        this.f30740K = anonymousClass2ST;
    }

    /* renamed from: C */
    public static final void m15891C(AnonymousClass2TF anonymousClass2TF) {
        anonymousClass2TF.f30733D.lock();
        try {
            if (anonymousClass2TF.f30744O) {
                AnonymousClass2TF.m15894F(anonymousClass2TF);
            }
            anonymousClass2TF.f30733D.unlock();
        } catch (Throwable th) {
            anonymousClass2TF.f30733D.unlock();
        }
    }

    /* renamed from: D */
    public static int m15892D(Iterable iterable, boolean z) {
        Object obj = null;
        Object obj2 = null;
        for (AnonymousClass2SU anonymousClass2SU : iterable) {
            if (anonymousClass2SU.SYA()) {
                obj = 1;
            }
            if (anonymousClass2SU.PYA()) {
                obj2 = 1;
            }
        }
        return obj != null ? (obj2 == null || !z) ? 1 : 2 : 3;
    }

    /* renamed from: E */
    public static final void m15893E(AnonymousClass2TF anonymousClass2TF, int i) {
        AnonymousClass2TF anonymousClass2TF2 = anonymousClass2TF;
        Integer num = anonymousClass2TF2.f30751V;
        int i2 = i;
        if (num == null) {
            anonymousClass2TF2.f30751V = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String valueOf = String.valueOf(AnonymousClass2TF.m15895G(i2));
            String valueOf2 = String.valueOf(AnonymousClass2TF.m15895G(anonymousClass2TF2.f30751V.intValue()));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length());
            stringBuilder.append("Cannot use sign-in mode: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(". Mode was already set to ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (anonymousClass2TF2.f30754Y == null) {
            AnonymousClass2SU anonymousClass2SU;
            Map map;
            Object obj = null;
            Object obj2 = null;
            for (AnonymousClass2SU anonymousClass2SU2 : anonymousClass2TF2.f30734E.values()) {
                if (anonymousClass2SU2.SYA()) {
                    obj = 1;
                }
                if (anonymousClass2SU2.PYA()) {
                    obj2 = 1;
                }
            }
            switch (anonymousClass2TF2.f30751V.intValue()) {
                case 1:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (obj2 == null) {
                        break;
                    } else {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                case 2:
                    if (obj != null) {
                        if (anonymousClass2TF2.f30741L) {
                            anonymousClass2TF2.f30754Y = new AnonymousClass2Sx(anonymousClass2TF2.f30731B, anonymousClass2TF2.f30733D, anonymousClass2TF2.f30755Z, anonymousClass2TF2.f30739J, anonymousClass2TF2.f30734E, anonymousClass2TF2.f30742M, anonymousClass2TF2.f30743N, anonymousClass2TF2.f30740K, anonymousClass2TF2.f30750U, anonymousClass2TF2, true);
                            return;
                        }
                        Context context = anonymousClass2TF2.f30731B;
                        Lock lock = anonymousClass2TF2.f30733D;
                        Looper looper = anonymousClass2TF2.f30755Z;
                        AnonymousClass1Eo anonymousClass1Eo = anonymousClass2TF2.f30739J;
                        Map map2 = anonymousClass2TF2.f30734E;
                        AnonymousClass1za anonymousClass1za = anonymousClass2TF2.f30742M;
                        map = anonymousClass2TF2.f30743N;
                        AnonymousClass2ST anonymousClass2ST = anonymousClass2TF2.f30740K;
                        ArrayList arrayList = anonymousClass2TF2.f30750U;
                        Map anonymousClass0O7 = new AnonymousClass0O7();
                        Map anonymousClass0O72 = new AnonymousClass0O7();
                        AnonymousClass2SU anonymousClass2SU3 = null;
                        for (Entry entry : map2.entrySet()) {
                            anonymousClass2SU2 = (AnonymousClass2SU) entry.getValue();
                            if (anonymousClass2SU2.PYA()) {
                                anonymousClass2SU3 = anonymousClass2SU2;
                            }
                            if (anonymousClass2SU2.SYA()) {
                                anonymousClass0O7.put((AnonymousClass1yj) entry.getKey(), anonymousClass2SU2);
                            } else {
                                anonymousClass0O72.put((AnonymousClass1yj) entry.getKey(), anonymousClass2SU2);
                            }
                        }
                        AnonymousClass1Ew.C(anonymousClass0O7.isEmpty() ^ 1, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        Map anonymousClass0O73 = new AnonymousClass0O7();
                        Map anonymousClass0O74 = new AnonymousClass0O7();
                        for (AnonymousClass1yl anonymousClass1yl : map.keySet()) {
                            AnonymousClass1yj B = anonymousClass1yl.m13989B();
                            if (anonymousClass0O7.containsKey(B)) {
                                anonymousClass0O73.put(anonymousClass1yl, (Boolean) map.get(anonymousClass1yl));
                            } else if (anonymousClass0O72.containsKey(B)) {
                                anonymousClass0O74.put(anonymousClass1yl, (Boolean) map.get(anonymousClass1yl));
                            } else {
                                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList = arrayList;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            AnonymousClass2Sr anonymousClass2Sr = (AnonymousClass2Sr) obj3;
                            if (anonymousClass0O73.containsKey(anonymousClass2Sr.f30644C)) {
                                arrayList2.add(anonymousClass2Sr);
                            } else if (anonymousClass0O74.containsKey(anonymousClass2Sr.f30644C)) {
                                arrayList3.add(anonymousClass2Sr);
                            } else {
                                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            }
                        }
                        Context context2 = context;
                        Lock lock2 = lock;
                        anonymousClass2TF2.f30754Y = new AnonymousClass2St(context2, anonymousClass2TF2, lock2, looper, anonymousClass1Eo, anonymousClass0O7, anonymousClass0O72, anonymousClass1za, anonymousClass2ST, anonymousClass2SU3, arrayList2, arrayList3, anonymousClass0O73, anonymousClass0O74);
                        return;
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            if (anonymousClass2TF2.f30741L && obj2 == null) {
                anonymousClass2TF2.f30754Y = new AnonymousClass2Sx(anonymousClass2TF2.f30731B, anonymousClass2TF2.f30733D, anonymousClass2TF2.f30755Z, anonymousClass2TF2.f30739J, anonymousClass2TF2.f30734E, anonymousClass2TF2.f30742M, anonymousClass2TF2.f30743N, anonymousClass2TF2.f30740K, anonymousClass2TF2.f30750U, anonymousClass2TF2, false);
                return;
            }
            Context context3 = anonymousClass2TF2.f30731B;
            Lock lock3 = anonymousClass2TF2.f30733D;
            Looper looper2 = anonymousClass2TF2.f30755Z;
            AnonymousClass1Eo anonymousClass1Eo2 = anonymousClass2TF2.f30739J;
            Map map3 = anonymousClass2TF2.f30734E;
            AnonymousClass1za anonymousClass1za2 = anonymousClass2TF2.f30742M;
            map = anonymousClass2TF2.f30743N;
            AnonymousClass1za anonymousClass1za3 = anonymousClass1za2;
            Lock lock4 = lock3;
            Looper looper3 = looper2;
            AnonymousClass1Eo anonymousClass1Eo3 = anonymousClass1Eo2;
            Map map4 = map3;
            Context context4 = context3;
            AnonymousClass2TF anonymousClass2TF3 = anonymousClass2TF2;
            anonymousClass2TF2.f30754Y = new AnonymousClass2dm(context4, anonymousClass2TF3, lock4, looper3, anonymousClass1Eo3, map4, anonymousClass1za3, map, anonymousClass2TF2.f30740K, anonymousClass2TF2.f30750U, anonymousClass2TF2);
        }
    }

    /* renamed from: F */
    public static final void m15894F(AnonymousClass2TF anonymousClass2TF) {
        anonymousClass2TF.f30753X.f25021H = true;
        anonymousClass2TF.f30754Y.connect();
    }

    /* renamed from: G */
    private static String m15895G(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: A */
    public final ConnectionResult mo3088A() {
        boolean z = true;
        AnonymousClass1Ew.C(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f30733D.lock();
        try {
            if (this.f30738I >= 0) {
                if (this.f30751V == null) {
                    z = false;
                }
                AnonymousClass1Ew.C(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f30751V == null) {
                this.f30751V = Integer.valueOf(AnonymousClass2TF.m15892D(this.f30734E.values(), false));
            } else if (this.f30751V.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            AnonymousClass2TF.m15893E(this, this.f30751V.intValue());
            this.f30753X.f25021H = true;
            ConnectionResult vC = this.f30754Y.vC();
            return vC;
        } finally {
            this.f30733D.unlock();
        }
    }

    /* renamed from: B */
    public final AnonymousClass1yv mo3089B() {
        AnonymousClass1Ew.C(mo3093H(), "GoogleApiClient is not connected yet.");
        AnonymousClass1Ew.C(this.f30751V.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        AnonymousClass1yv anonymousClass2dp = new AnonymousClass2dp(this);
        if (this.f30734E.containsKey(AnonymousClass20k.f25226D)) {
            AnonymousClass20k.f25225C.AYA(this).mo3068B(new AnonymousClass2TJ(this, anonymousClass2dp, false, this));
        } else {
            AtomicReference atomicReference = new AtomicReference();
            AnonymousClass2TH anonymousClass2TH = new AnonymousClass2TH(this, atomicReference, anonymousClass2dp);
            AnonymousClass2TI anonymousClass2TI = new AnonymousClass2TI(this, anonymousClass2dp);
            AnonymousClass1yq A = new AnonymousClass1yq(this.f30731B).m13994A(AnonymousClass20k.f25224B);
            AnonymousClass1Ew.E(anonymousClass2TH, "Listener must not be null");
            A.f24977H.add(anonymousClass2TH);
            AnonymousClass1Ew.E(anonymousClass2TI, "Listener must not be null");
            A.f24978I.add(anonymousClass2TI);
            Handler handler = this.f30747R;
            AnonymousClass1Ew.E(handler, "Handler must not be null");
            A.f24980K = handler.getLooper();
            AnonymousClass1yt B = A.m13995B();
            atomicReference.set(B);
            B.mo3090C();
        }
        return anonymousClass2dp;
    }

    /* renamed from: C */
    public final void mo3090C() {
        this.f30733D.lock();
        IllegalStateException illegalStateException;
        try {
            boolean z = false;
            if (this.f30738I >= 0) {
                if (this.f30751V != null) {
                    z = true;
                }
                AnonymousClass1Ew.C(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f30751V == null) {
                this.f30751V = Integer.valueOf(AnonymousClass2TF.m15892D(this.f30734E.values(), false));
            } else if (this.f30751V.intValue() == 2) {
                illegalStateException = new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                throw illegalStateException;
            }
            int intValue = this.f30751V.intValue();
            this.f30733D.lock();
            boolean z2 = true;
            if (!(intValue == 3 || intValue == 1)) {
                if (intValue != 2) {
                    z2 = false;
                }
            }
            illegalStateException = new StringBuilder(33);
            illegalStateException.append("Illegal sign-in mode: ");
            illegalStateException.append(intValue);
            AnonymousClass1Ew.F(z2, illegalStateException.toString());
            AnonymousClass2TF.m15893E(this, intValue);
            AnonymousClass2TF.m15894F(this);
            this.f30733D.unlock();
        } catch (Throwable th) {
            illegalStateException = th;
        } finally {
            this.f30733D.unlock();
        }
    }

    /* renamed from: D */
    public final void mo3091D() {
        this.f30733D.lock();
        try {
            this.f30737H.m14157A();
            if (this.f30754Y != null) {
                this.f30754Y.gG();
            }
            AnonymousClass20V anonymousClass20V = this.f30749T;
            for (AnonymousClass20T anonymousClass20T : anonymousClass20V.f25204B) {
                anonymousClass20T.f25203B = null;
            }
            anonymousClass20V.f25204B.clear();
            for (AnonymousClass2dk anonymousClass2dk : this.f30732C) {
                anonymousClass2dk.m15839I(null);
                anonymousClass2dk.m15835E();
            }
            this.f30732C.clear();
            if (this.f30754Y != null) {
                m15914S();
                AnonymousClass1zE anonymousClass1zE = this.f30753X;
                anonymousClass1zE.f25021H = false;
                anonymousClass1zE.f25022I.incrementAndGet();
            }
            this.f30733D.unlock();
        } catch (Throwable th) {
            this.f30733D.unlock();
        }
    }

    /* renamed from: E */
    public final void mo3092E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f30731B);
        printWriter.append(str).append("mResuming=").print(this.f30744O);
        printWriter.append(" mWorkQueue.size()=").print(this.f30732C.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f30737H.f25222B.size());
        AnonymousClass20O anonymousClass20O = this.f30754Y;
        if (anonymousClass20O != null) {
            anonymousClass20O.vG(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: F */
    public final Context mo3109F() {
        return this.f30731B;
    }

    /* renamed from: G */
    public final Looper mo3110G() {
        return this.f30755Z;
    }

    public final void GYA(int i, boolean z) {
        int i2;
        int size;
        if (!(i != 1 || z || this.f30744O)) {
            this.f30744O = true;
            if (this.f30748S == null) {
                this.f30748S = AnonymousClass1En.C(this.f30731B.getApplicationContext(), new AnonymousClass20F(this));
            }
            AnonymousClass20E anonymousClass20E = this.f30747R;
            anonymousClass20E.sendMessageDelayed(anonymousClass20E.obtainMessage(1), this.f30745P);
            anonymousClass20E = this.f30747R;
            anonymousClass20E.sendMessageDelayed(anonymousClass20E.obtainMessage(2), this.f30746Q);
        }
        for (AnonymousClass2Sq L : (AnonymousClass2Sq[]) this.f30737H.f25222B.toArray(AnonymousClass20h.f25221E)) {
            L.m15842L(AnonymousClass20h.f25220D);
        }
        AnonymousClass1zE anonymousClass1zE = this.f30753X;
        AnonymousClass1Ew.C(Looper.myLooper() == anonymousClass1zE.f25015B.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        anonymousClass1zE.f25015B.removeMessages(1);
        synchronized (anonymousClass1zE.f25016C) {
            anonymousClass1zE.f25023J = true;
            ArrayList arrayList = new ArrayList(anonymousClass1zE.f25018E);
            int i3 = anonymousClass1zE.f25022I.get();
            arrayList = arrayList;
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                AnonymousClass1yr anonymousClass1yr = (AnonymousClass1yr) obj;
                if (!anonymousClass1zE.f25021H || anonymousClass1zE.f25022I.get() != i3) {
                    break;
                } else if (anonymousClass1zE.f25018E.contains(anonymousClass1yr)) {
                    anonymousClass1yr.fh(i);
                }
            }
            anonymousClass1zE.f25019F.clear();
            anonymousClass1zE.f25023J = false;
        }
        AnonymousClass1zE anonymousClass1zE2 = this.f30753X;
        anonymousClass1zE2.f25021H = false;
        anonymousClass1zE2.f25022I.incrementAndGet();
        if (i == 2) {
            AnonymousClass2TF.m15894F(this);
        }
    }

    /* renamed from: H */
    public final boolean mo3093H() {
        AnonymousClass20O anonymousClass20O = this.f30754Y;
        return anonymousClass20O != null && anonymousClass20O.isConnected();
    }

    /* renamed from: I */
    public final void mo3094I(AnonymousClass1yr anonymousClass1yr) {
        this.f30753X.m14077A(anonymousClass1yr);
    }

    /* renamed from: J */
    public final void mo3095J(AnonymousClass1ys anonymousClass1ys) {
        this.f30753X.m14078B(anonymousClass1ys);
    }

    /* renamed from: K */
    public final void mo3096K(AnonymousClass1yr anonymousClass1yr) {
        AnonymousClass1zE anonymousClass1zE = this.f30753X;
        AnonymousClass1Ew.I(anonymousClass1yr);
        synchronized (anonymousClass1zE.f25016C) {
            if (!anonymousClass1zE.f25018E.remove(anonymousClass1yr)) {
                String valueOf = String.valueOf(anonymousClass1yr);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("unregisterConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else if (anonymousClass1zE.f25023J) {
                anonymousClass1zE.f25019F.add(anonymousClass1yr);
            }
        }
    }

    /* renamed from: L */
    public final void mo3097L(AnonymousClass1ys anonymousClass1ys) {
        AnonymousClass1zE anonymousClass1zE = this.f30753X;
        AnonymousClass1Ew.I(anonymousClass1ys);
        synchronized (anonymousClass1zE.f25016C) {
            if (!anonymousClass1zE.f25020G.remove(anonymousClass1ys)) {
                String valueOf = String.valueOf(anonymousClass1ys);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    /* renamed from: M */
    public final AnonymousClass2SU mo3111M(AnonymousClass1yj anonymousClass1yj) {
        AnonymousClass2SU anonymousClass2SU = (AnonymousClass2SU) this.f30734E.get(anonymousClass1yj);
        AnonymousClass1Ew.E(anonymousClass2SU, "Appropriate Api was not requested.");
        return anonymousClass2SU;
    }

    /* renamed from: N */
    public final boolean mo3112N(AnonymousClass1yl anonymousClass1yl) {
        return this.f30734E.containsKey(anonymousClass1yl.m13989B());
    }

    public final void NYA(Bundle bundle) {
        while (!this.f30732C.isEmpty()) {
            mo3115Q((AnonymousClass2dk) this.f30732C.remove());
        }
        AnonymousClass1zE anonymousClass1zE = this.f30753X;
        boolean z = true;
        AnonymousClass1Ew.C(Looper.myLooper() == anonymousClass1zE.f25015B.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (anonymousClass1zE.f25016C) {
            IllegalStateException illegalStateException;
            if ((!anonymousClass1zE.f25023J ? 1 : null) != null) {
                anonymousClass1zE.f25015B.removeMessages(1);
                anonymousClass1zE.f25023J = true;
                if (anonymousClass1zE.f25019F.size() != 0) {
                    z = false;
                }
                if (z) {
                    ArrayList arrayList = new ArrayList(anonymousClass1zE.f25018E);
                    int i = anonymousClass1zE.f25022I.get();
                    arrayList = arrayList;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        AnonymousClass1yr anonymousClass1yr = (AnonymousClass1yr) obj;
                        if (!anonymousClass1zE.f25021H || !anonymousClass1zE.f25017D.isConnected() || anonymousClass1zE.f25022I.get() != i) {
                            break;
                        } else if (!anonymousClass1zE.f25019F.contains(anonymousClass1yr)) {
                            anonymousClass1yr.Xh(bundle);
                        }
                    }
                    anonymousClass1zE.f25019F.clear();
                    anonymousClass1zE.f25023J = false;
                } else {
                    illegalStateException = new IllegalStateException();
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    /* renamed from: O */
    public final boolean mo3113O(AnonymousClass20Z anonymousClass20Z) {
        AnonymousClass20O anonymousClass20O = this.f30754Y;
        return anonymousClass20O != null && anonymousClass20O.nXA(anonymousClass20Z);
    }

    /* renamed from: P */
    public final AnonymousClass2dk mo3114P(AnonymousClass2dk anonymousClass2dk) {
        AnonymousClass1Ew.F(anonymousClass2dk.f31891B != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f30734E.containsKey(anonymousClass2dk.f31891B);
        String str = anonymousClass2dk.f31892C != null ? anonymousClass2dk.f31892C.f24955B : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(str);
        stringBuilder.append(" required for this call.");
        AnonymousClass1Ew.F(containsKey, stringBuilder.toString());
        this.f30733D.lock();
        try {
            if (this.f30754Y == null) {
                this.f30732C.add(anonymousClass2dk);
            } else {
                anonymousClass2dk = this.f30754Y.BYA(anonymousClass2dk);
            }
            this.f30733D.unlock();
            return anonymousClass2dk;
        } catch (Throwable th) {
            this.f30733D.unlock();
        }
    }

    /* renamed from: Q */
    public final AnonymousClass2dk mo3115Q(AnonymousClass2dk anonymousClass2dk) {
        AnonymousClass1Ew.F(anonymousClass2dk.f31891B != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f30734E.containsKey(anonymousClass2dk.f31891B);
        String str = anonymousClass2dk.f31892C != null ? anonymousClass2dk.f31892C.f24955B : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(str);
        stringBuilder.append(" required for this call.");
        AnonymousClass1Ew.F(containsKey, stringBuilder.toString());
        this.f30733D.lock();
        try {
            if (this.f30754Y != null) {
                if (this.f30744O) {
                    this.f30732C.add(anonymousClass2dk);
                    while (!this.f30732C.isEmpty()) {
                        AnonymousClass2dk anonymousClass2dk2 = (AnonymousClass2dk) this.f30732C.remove();
                        this.f30737H.m14158B(anonymousClass2dk2);
                        anonymousClass2dk2.m16642O(Status.f30575H);
                    }
                } else {
                    anonymousClass2dk = this.f30754Y.FYA(anonymousClass2dk);
                }
                this.f30733D.unlock();
                return anonymousClass2dk;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f30733D.unlock();
        }
    }

    /* renamed from: R */
    public final void mo3116R() {
        AnonymousClass20O anonymousClass20O = this.f30754Y;
        if (anonymousClass20O != null) {
            anonymousClass20O.YYA();
        }
    }

    /* renamed from: S */
    public final boolean m15914S() {
        boolean z = false;
        if (this.f30744O) {
            this.f30744O = false;
            this.f30747R.removeMessages(2);
            z = true;
            this.f30747R.removeMessages(1);
            AnonymousClass1Et anonymousClass1Et = this.f30748S;
            if (anonymousClass1Et != null) {
                anonymousClass1Et.A();
                this.f30748S = null;
            }
        }
        return z;
    }

    /* renamed from: T */
    public final boolean m15915T() {
        this.f30733D.lock();
        try {
            if (this.f30736G == null) {
                return false;
            }
            boolean isEmpty = this.f30736G.isEmpty() ^ 1;
            this.f30733D.unlock();
            return isEmpty;
        } finally {
            this.f30733D.unlock();
        }
    }

    /* renamed from: U */
    public final String m15916U() {
        Writer stringWriter = new StringWriter();
        mo3092E(JsonProperty.USE_DEFAULT_NAME, null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final void xXA(ConnectionResult connectionResult) {
        if (!AnonymousClass1Eu.G(this.f30731B, connectionResult.f15967C)) {
            m15914S();
        }
        if (!this.f30744O) {
            this.f30753X.m14079C(connectionResult);
            AnonymousClass1zE anonymousClass1zE = this.f30753X;
            anonymousClass1zE.f25021H = false;
            anonymousClass1zE.f25022I.incrementAndGet();
        }
    }
}

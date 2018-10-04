package X;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.Collections;
import java.util.TreeSet;

/* renamed from: X.45N */
public final class AnonymousClass45N extends AnonymousClass43c implements Callback {
    /* renamed from: B */
    public int f49831B;
    /* renamed from: C */
    public final StringBuilder f49832C;
    /* renamed from: D */
    public final AnonymousClass2ql f49833D;
    /* renamed from: E */
    private String f49834E;
    /* renamed from: F */
    private int f49835F;
    /* renamed from: G */
    private final AnonymousClass2t2 f49836G;
    /* renamed from: H */
    private final AnonymousClass2qj f49837H;
    /* renamed from: I */
    private boolean f49838I;
    /* renamed from: J */
    private String f49839J;
    /* renamed from: K */
    private final TreeSet f49840K;
    /* renamed from: L */
    private AnonymousClass3ub f49841L;
    /* renamed from: M */
    private final AnonymousClass2sz f49842M;
    /* renamed from: N */
    private final Handler f49843N;

    /* renamed from: D */
    public final long mo5166D() {
        return -3;
    }

    /* renamed from: J */
    public final boolean mo5171J() {
        return true;
    }

    public AnonymousClass45N(AnonymousClass2qn anonymousClass2qn, AnonymousClass2sz anonymousClass2sz, Looper looper) {
        Handler handler;
        super(anonymousClass2qn);
        this.f49842M = (AnonymousClass2sz) AnonymousClass2td.m17605D(anonymousClass2sz);
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f49843N = handler;
        this.f49836G = new AnonymousClass2t2();
        this.f49837H = new AnonymousClass2qj();
        this.f49833D = new AnonymousClass2ql(1);
        this.f49832C = new StringBuilder();
        this.f49840K = new TreeSet();
    }

    /* renamed from: B */
    private void m22845B(AnonymousClass2t1 anonymousClass2t1) {
        int length = anonymousClass2t1.f35381B.length;
        if (length != 0) {
            int i = 0;
            Object obj = null;
            while (true) {
                Object obj2 = 1;
                if (i >= length) {
                    break;
                }
                AnonymousClass2t0 anonymousClass2t0 = anonymousClass2t1.f35381B[i];
                if (anonymousClass2t0.f35380B == 0) {
                    byte b;
                    Object obj3;
                    AnonymousClass3ub anonymousClass3ub;
                    AnonymousClass3ub anonymousClass3ub2 = (AnonymousClass3ub) anonymousClass2t0;
                    if (length == 1) {
                        b = anonymousClass3ub2.f46597B;
                        obj3 = (b < (byte) 16 || b > (byte) 31) ? null : 1;
                        if (obj3 != null) {
                            if (obj2 != null) {
                                anonymousClass3ub = this.f49841L;
                                if (anonymousClass3ub != null && anonymousClass3ub.f46597B == anonymousClass3ub2.f46597B && this.f49841L.f46598C == anonymousClass3ub2.f46598C) {
                                    this.f49841L = null;
                                    obj = obj2;
                                }
                            }
                            if (obj2 != null) {
                                this.f49841L = anonymousClass3ub2;
                            }
                            b = anonymousClass3ub2.f46597B;
                            if (b == (byte) 20 || b == (byte) 28) {
                                b = anonymousClass3ub2.f46598C;
                                if (b >= (byte) 32 && b <= (byte) 47) {
                                    obj3 = 1;
                                    if (obj3 != null) {
                                        AnonymousClass45N.m22847D(this, anonymousClass3ub2);
                                    } else {
                                        b = anonymousClass3ub2.f46597B;
                                        if (b >= (byte) 16 && b <= (byte) 31) {
                                            b = anonymousClass3ub2.f46598C;
                                            if (b >= (byte) 64 && b <= Byte.MAX_VALUE) {
                                                obj3 = 1;
                                                if (obj3 != null) {
                                                    AnonymousClass45N.m22851H(this);
                                                }
                                            }
                                        }
                                        obj3 = null;
                                        if (obj3 != null) {
                                            AnonymousClass45N.m22851H(this);
                                        }
                                    }
                                    obj = obj2;
                                }
                            }
                            obj3 = null;
                            if (obj3 != null) {
                                b = anonymousClass3ub2.f46597B;
                                b = anonymousClass3ub2.f46598C;
                                obj3 = 1;
                                if (obj3 != null) {
                                    AnonymousClass45N.m22851H(this);
                                }
                            } else {
                                AnonymousClass45N.m22847D(this, anonymousClass3ub2);
                            }
                            obj = obj2;
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                        anonymousClass3ub = this.f49841L;
                        this.f49841L = null;
                        obj = obj2;
                    }
                    if (obj2 != null) {
                        this.f49841L = anonymousClass3ub2;
                    }
                    b = anonymousClass3ub2.f46597B;
                    b = anonymousClass3ub2.f46598C;
                    obj3 = 1;
                    if (obj3 != null) {
                        AnonymousClass45N.m22847D(this, anonymousClass3ub2);
                    } else {
                        b = anonymousClass3ub2.f46597B;
                        b = anonymousClass3ub2.f46598C;
                        obj3 = 1;
                        if (obj3 != null) {
                            AnonymousClass45N.m22851H(this);
                        }
                    }
                    obj = obj2;
                } else {
                    AnonymousClass3uc anonymousClass3uc = (AnonymousClass3uc) anonymousClass2t0;
                    if (this.f49831B != 0) {
                        this.f49832C.append(anonymousClass3uc.f46599B);
                    }
                }
                i++;
            }
            if (obj == null) {
                this.f49841L = null;
            }
            int i2 = this.f49831B;
            if (i2 == 1 || i2 == 3) {
                this.f49834E = AnonymousClass45N.m22846C(this);
            }
        }
    }

    /* renamed from: C */
    private static String m22846C(AnonymousClass45N anonymousClass45N) {
        int length = anonymousClass45N.f49832C.length();
        if (length != 0) {
            int i = length - 1;
            Object obj = anonymousClass45N.f49832C.charAt(i) == '\n' ? 1 : null;
            if (length != 1 || obj == null) {
                if (obj != null) {
                    length = i;
                }
                if (anonymousClass45N.f49831B != 1) {
                    return anonymousClass45N.f49832C.substring(0, length);
                }
                int i2 = length;
                for (i = 0; i < anonymousClass45N.f49835F && i2 != -1; i++) {
                    i2 = anonymousClass45N.f49832C.lastIndexOf("\n", i2 - 1);
                }
                int i3 = i2 != -1 ? i2 + 1 : 0;
                anonymousClass45N.f49832C.delete(0, i3);
                return anonymousClass45N.f49832C.substring(0, length - i3);
            }
        }
        return null;
    }

    /* renamed from: D */
    private static void m22847D(AnonymousClass45N anonymousClass45N, AnonymousClass3ub anonymousClass3ub) {
        byte b = anonymousClass3ub.f46598C;
        if (b == (byte) 32) {
            AnonymousClass45N.m22853J(anonymousClass45N, 2);
        } else if (b != (byte) 41) {
            switch (b) {
                case (byte) 37:
                    anonymousClass45N.f49835F = 2;
                    AnonymousClass45N.m22853J(anonymousClass45N, 1);
                    return;
                case (byte) 38:
                    anonymousClass45N.f49835F = 3;
                    AnonymousClass45N.m22853J(anonymousClass45N, 1);
                    return;
                case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                    anonymousClass45N.f49835F = 4;
                    AnonymousClass45N.m22853J(anonymousClass45N, 1);
                    return;
                default:
                    if (anonymousClass45N.f49831B != 0) {
                        b = anonymousClass3ub.f46598C;
                        if (b != (byte) 33) {
                            switch (b) {
                                case ParserMinimalBase.INT_COMMA /*44*/:
                                    anonymousClass45N.f49834E = null;
                                    int i = anonymousClass45N.f49831B;
                                    if (i == 1 || i == 3) {
                                        anonymousClass45N.f49832C.setLength(0);
                                        break;
                                    }
                                case (byte) 45:
                                    AnonymousClass45N.m22851H(anonymousClass45N);
                                    return;
                                case (byte) 46:
                                    anonymousClass45N.f49832C.setLength(0);
                                    return;
                                case ParserMinimalBase.INT_SLASH /*47*/:
                                    anonymousClass45N.f49834E = AnonymousClass45N.m22846C(anonymousClass45N);
                                    anonymousClass45N.f49832C.setLength(0);
                                    return;
                                default:
                                    break;
                            }
                        } else if (anonymousClass45N.f49832C.length() > 0) {
                            StringBuilder stringBuilder = anonymousClass45N.f49832C;
                            stringBuilder.setLength(stringBuilder.length() - 1);
                        }
                    }
                    return;
            }
        } else {
            AnonymousClass45N.m22853J(anonymousClass45N, 3);
        }
    }

    /* renamed from: E */
    private void m22848E(String str) {
        if (!AnonymousClass2u6.m17649B(this.f49839J, str)) {
            this.f49839J = str;
            Handler handler = this.f49843N;
            if (handler != null) {
                handler.obtainMessage(0, str).sendToTarget();
            } else {
                m22849F(str);
            }
        }
    }

    /* renamed from: F */
    private void m22849F(String str) {
        if (str == null) {
            this.f49842M.Ci(Collections.emptyList());
        } else {
            this.f49842M.Ci(Collections.singletonList(new AnonymousClass2sv(str)));
        }
    }

    /* renamed from: G */
    private boolean m22850G() {
        return this.f49833D.f34881F != -1;
    }

    /* renamed from: H */
    private static void m22851H(AnonymousClass45N anonymousClass45N) {
        int length = anonymousClass45N.f49832C.length();
        if (length > 0 && anonymousClass45N.f49832C.charAt(length - 1) != '\n') {
            anonymousClass45N.f49832C.append('\n');
        }
    }

    /* renamed from: I */
    private void m22852I(long j) {
        if (this.f49833D.f34881F <= j + 5000000) {
            AnonymousClass2t1 A = this.f49836G.m17586A(this.f49833D);
            AnonymousClass2ql anonymousClass2ql = this.f49833D;
            anonymousClass2ql.f34881F = -1;
            anonymousClass2ql.m17466A();
            if (A != null) {
                this.f49840K.add(A);
            }
        }
    }

    /* renamed from: I */
    public final boolean mo5170I() {
        return this.f49838I;
    }

    /* renamed from: J */
    private static void m22853J(AnonymousClass45N anonymousClass45N, int i) {
        if (anonymousClass45N.f49831B != i) {
            anonymousClass45N.f49831B = i;
            anonymousClass45N.f49832C.setLength(0);
            if (i == 1 || i == 0) {
                anonymousClass45N.f49834E = null;
            }
        }
    }

    /* renamed from: S */
    public final void mo5363S(long j, long j2, boolean z) {
        if (m22850G()) {
            m22852I(j);
        }
        int i = this.f49838I ? -1 : -3;
        while (!m22850G() && r1 == -3) {
            i = m22398V(j, this.f49837H, this.f49833D);
            if (i == -3) {
                m22852I(j);
            } else if (i == -1) {
                this.f49838I = true;
            }
        }
        while (!this.f49840K.isEmpty() && ((AnonymousClass2t1) this.f49840K.first()).f35383D <= j) {
            AnonymousClass2t1 anonymousClass2t1 = (AnonymousClass2t1) this.f49840K.pollFirst();
            m22845B(anonymousClass2t1);
            if (!anonymousClass2t1.f35382C) {
                m22848E(this.f49834E);
            }
        }
    }

    /* renamed from: T */
    public final boolean mo5364T(AnonymousClass2qi anonymousClass2qi) {
        return anonymousClass2qi.f34866O.equals("application/eia-608");
    }

    /* renamed from: U */
    public final void mo5365U(long j) {
        this.f49838I = false;
        this.f49841L = null;
        this.f49840K.clear();
        AnonymousClass2ql anonymousClass2ql = this.f49833D;
        anonymousClass2ql.f34881F = -1;
        anonymousClass2ql.m17466A();
        this.f49835F = 4;
        AnonymousClass45N.m22853J(this, 0);
        m22848E(null);
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        m22849F((String) message.obj);
        return true;
    }
}

package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.0SK */
public class AnonymousClass0SK implements Comparable {
    /* renamed from: B */
    public int f4882B;
    /* renamed from: C */
    public String f4883C;
    /* renamed from: D */
    public String f4884D;
    /* renamed from: E */
    public int f4885E;
    /* renamed from: F */
    public String f4886F;
    /* renamed from: G */
    public int f4887G;
    /* renamed from: H */
    public String f4888H;
    /* renamed from: I */
    public long f4889I;
    /* renamed from: J */
    public boolean f4890J;
    /* renamed from: K */
    public boolean f4891K;
    /* renamed from: L */
    public boolean f4892L;
    /* renamed from: M */
    public boolean f4893M;
    /* renamed from: N */
    public boolean f4894N;
    /* renamed from: O */
    public boolean f4895O;
    /* renamed from: P */
    public String f4896P;
    /* renamed from: Q */
    public AnonymousClass28L f4897Q;
    /* renamed from: R */
    public AnonymousClass0P7 f4898R;
    /* renamed from: S */
    public String f4899S;
    /* renamed from: T */
    public HashMap f4900T;
    /* renamed from: U */
    public String f4901U;
    /* renamed from: V */
    public String f4902V;
    /* renamed from: W */
    public int f4903W;
    /* renamed from: X */
    public int f4904X;
    /* renamed from: Y */
    public String f4905Y;
    /* renamed from: Z */
    public String f4906Z = String.valueOf(super.hashCode());
    /* renamed from: a */
    public AnonymousClass0zV f4907a;
    /* renamed from: b */
    public List f4908b;
    /* renamed from: c */
    public String f4909c;
    /* renamed from: d */
    public String f4910d;
    /* renamed from: e */
    public String f4911e;
    /* renamed from: f */
    public Integer f4912f;
    /* renamed from: g */
    public AnonymousClass0uU f4913g = AnonymousClass0uU.f11843D;
    /* renamed from: h */
    public long f4914h;
    /* renamed from: i */
    public AnonymousClass0Ci f4915i;
    /* renamed from: j */
    private AnonymousClass28Q f4916j;

    /* renamed from: A */
    public final int m4313A(AnonymousClass0SK anonymousClass0SK) {
        if (equals(anonymousClass0SK)) {
            return 0;
        }
        AnonymousClass0uU anonymousClass0uU = this.f4913g;
        int i = -1;
        if (anonymousClass0uU == anonymousClass0SK.f4913g) {
            long j = this.f4889I - anonymousClass0SK.f4889I;
            if (j == 0) {
                String str = this.f4906Z;
                if (str != null) {
                    String str2 = anonymousClass0SK.f4906Z;
                    if (str2 != null) {
                        int compareTo = str.compareTo(str2);
                        if (compareTo != 0) {
                            return compareTo;
                        }
                    }
                }
                return hashCode() - anonymousClass0SK.hashCode();
            }
            if (j > 0) {
            }
            return i;
        } else if (anonymousClass0uU == AnonymousClass0uU.Caption) {
            return i;
        }
        i = 1;
        return i;
    }

    /* renamed from: B */
    public final void m4314B() {
        if (!m4321I()) {
            this.f4885E = Math.max(0, this.f4885E - 1);
        }
    }

    /* renamed from: C */
    public final AnonymousClass28Q m4315C() {
        if (this.f4916j == null) {
            this.f4916j = new AnonymousClass28Q(this);
        }
        return this.f4916j;
    }

    /* renamed from: D */
    public final String m4316D() {
        if (this.f4896P == null) {
            this.f4896P = UUID.randomUUID().toString();
        }
        return this.f4896P;
    }

    /* renamed from: E */
    public final List m4317E() {
        List list = this.f4908b;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    /* renamed from: F */
    public final boolean m4318F() {
        List list = this.f4908b;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* renamed from: G */
    public final boolean m4319G(String str) {
        String str2 = this.f4906Z;
        if (str2 != null) {
            if (str != null) {
                return str2.equals(str);
            }
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m4320H() {
        return this.f4913g == AnonymousClass0uU.Caption;
    }

    /* renamed from: I */
    public final boolean m4321I() {
        return this.f4905Y != null;
    }

    /* renamed from: J */
    public final boolean m4322J() {
        return this.f4907a == AnonymousClass0zV.Posting;
    }

    /* renamed from: K */
    public final void m4323K(AnonymousClass0P7 anonymousClass0P7) {
        String str;
        this.f4898R = anonymousClass0P7;
        if (anonymousClass0P7 == null) {
            str = null;
        } else {
            str = anonymousClass0P7.NO();
        }
        this.f4899S = str;
        if (m4318F()) {
            for (AnonymousClass0SK K : this.f4908b) {
                K.m4323K(anonymousClass0P7);
            }
        }
    }

    public final long UK() {
        return this.f4889I;
    }

    public final String XP() {
        return this.f4906Z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m4313A((AnonymousClass0SK) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof AnonymousClass0SK ? m4319G(((AnonymousClass0SK) obj).f4906Z) : false;
    }

    public final int hashCode() {
        String str = this.f4906Z;
        return str != null ? str.hashCode() : 0;
    }

    public final AnonymousClass0Ci pT() {
        return this.f4915i;
    }

    public final String toString() {
        Locale locale = Locale.getDefault();
        String str = "Comment{mCreatedAtSeconds=%d, mUser=@%s, mText='%s'}";
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(this.f4889I);
        AnonymousClass0Ci anonymousClass0Ci = this.f4915i;
        objArr[1] = anonymousClass0Ci != null ? anonymousClass0Ci.uT() : "null";
        objArr[2] = this.f4910d;
        return String.format(locale, str, objArr);
    }
}

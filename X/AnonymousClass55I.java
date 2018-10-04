package X;

import android.app.Notification;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.55I */
public final class AnonymousClass55I {
    /* renamed from: B */
    public final String f59967B = this.f59969D.m27592F();
    /* renamed from: C */
    public Map f59968C = new LinkedHashMap();
    /* renamed from: D */
    public final AnonymousClass5ZM f59969D;
    /* renamed from: E */
    public boolean f59970E;
    /* renamed from: F */
    public final AnonymousClass0RZ f59971F;
    /* renamed from: G */
    public final SharedPreferences f59972G = this.f59969D.m27593G();
    /* renamed from: H */
    public Set f59973H = new HashSet();

    public AnonymousClass55I(AnonymousClass0RZ anonymousClass0RZ, AnonymousClass5ZM anonymousClass5ZM) {
        this.f59971F = anonymousClass0RZ;
        this.f59969D = anonymousClass5ZM;
        if (this.f59967B.contains("|")) {
            throw new IllegalArgumentException("category cannot contain delimiter");
        }
    }

    /* renamed from: A */
    public final synchronized AnonymousClass55I m25687A() {
        if (!this.f59970E) {
            if (!this.f59970E && this.f59968C.isEmpty() && this.f59973H.isEmpty()) {
                for (Entry entry : this.f59972G.getAll().entrySet()) {
                    String str = (String) entry.getKey();
                    int indexOf = str.indexOf("|");
                    if (indexOf != -1) {
                        String substring = str.substring(0, indexOf);
                        String substring2 = str.substring(indexOf + 1);
                        if ("showing".equals(substring2)) {
                            this.f59973H.add(substring);
                        } else {
                            List list = (List) this.f59968C.get(substring);
                            if (list == null) {
                                list = new ArrayList();
                                this.f59968C.put(substring, list);
                            }
                            int parseInt = Integer.parseInt(substring2);
                            while (parseInt >= list.size()) {
                                list.add(null);
                            }
                            list.set(parseInt, this.f59969D.m27591E((String) entry.getValue()));
                        }
                    }
                }
                this.f59970E = true;
            } else {
                throw new IllegalStateException("attempted to initialize twice");
            }
        }
        return this;
    }

    /* renamed from: B */
    public final void m25688B() {
        AnonymousClass55I.m25685B(this);
        this.f59971F.A(this.f59967B, 64278);
        this.f59972G.edit().remove("aggregated").apply();
    }

    /* renamed from: B */
    public static void m25685B(AnonymousClass55I anonymousClass55I) {
        if (!anonymousClass55I.f59970E) {
            throw new IllegalStateException("notification category not initialized");
        }
    }

    /* renamed from: C */
    public final void m25689C(String str) {
        AnonymousClass55I.m25685B(this);
        this.f59971F.A(AnonymousClass1Ic.B(this.f59967B, str), 64278);
        this.f59973H.remove(str);
        this.f59972G.edit().remove(AnonymousClass55S.m25698C(str)).apply();
    }

    /* renamed from: C */
    public static boolean m25686C(AnonymousClass55I anonymousClass55I) {
        return anonymousClass55I.f59972G.getBoolean("aggregated", false);
    }

    /* renamed from: D */
    public final void m25690D(AnonymousClass0Cm anonymousClass0Cm, String str) {
        AnonymousClass55I.m25685B(this);
        Editor edit = this.f59972G.edit();
        List list = (List) this.f59968C.remove(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                edit.remove(AnonymousClass55S.m25697B(str, i));
            }
        }
        if (!AnonymousClass55I.m25686C(this)) {
            this.f59971F.A(AnonymousClass1Ic.B(this.f59967B, str), 64278);
            this.f59973H.remove(str);
            edit.remove(AnonymousClass55S.m25698C(str));
        } else if (this.f59968C.size() <= 0 || this.f59969D.m27595I()) {
            m25688B();
        } else {
            this.f59971F.B(this.f59967B, 64278, this.f59969D.m27588B(anonymousClass0Cm, this.f59968C, null));
        }
        edit.apply();
    }

    /* renamed from: E */
    public final boolean m25691E(AnonymousClass0Cm anonymousClass0Cm, String str, List list, boolean z) {
        Notification notification;
        boolean z2;
        String str2 = null;
        if (AnonymousClass55I.m25686C(this)) {
            notification = null;
        } else {
            this.f59973H.size();
            boolean contains = this.f59973H.contains(str);
            str2 = AnonymousClass1Ic.B(this.f59967B, str);
            if (z) {
                notification = this.f59969D.m27589C(anonymousClass0Cm, str, list);
            } else {
                notification = this.f59969D.m27590D(anonymousClass0Cm, str, list);
            }
            if (!this.f59973H.contains(str)) {
                this.f59973H.add(str);
                this.f59972G.edit().putBoolean(AnonymousClass55S.m25698C(str), true).apply();
            }
        }
        if (notification == null) {
            notification = this.f59969D.m27588B(anonymousClass0Cm, this.f59968C, str);
            if (this.f59969D.m27595I()) {
                str2 = AnonymousClass1Ic.B(this.f59967B, str);
            } else {
                str2 = this.f59967B;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.f59971F.B(str2, 64278, notification);
        return z2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        AnonymousClass25E anonymousClass25E = new AnonymousClass25E(AnonymousClass0RR.C("\n"), " = ");
        stringBuilder.append("\nmCategoryName: ");
        stringBuilder.append(this.f59967B);
        stringBuilder.append("\nmAggregateMode: ");
        stringBuilder.append(Boolean.toString(AnonymousClass55I.m25686C(this)));
        stringBuilder.append("\nmData: \n");
        stringBuilder.append(anonymousClass25E.A(this.f59968C.entrySet()));
        stringBuilder.append("\nmShowing: \n");
        stringBuilder.append(this.f59973H.toString());
        stringBuilder.append("\nmPreferences: \n");
        stringBuilder.append(anonymousClass25E.A(this.f59972G.getAll().entrySet()));
        return stringBuilder.toString();
    }
}

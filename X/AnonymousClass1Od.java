package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;

/* renamed from: X.1Od */
public final class AnonymousClass1Od extends AnonymousClass0Rq implements AnonymousClass0Ro, AnonymousClass0VB, Filterable {
    /* renamed from: B */
    public AnonymousClass3e1 f17987B;
    /* renamed from: C */
    public final AnonymousClass3e1 f17988C;
    /* renamed from: D */
    public final AnonymousClass3e1 f17989D;
    /* renamed from: E */
    private final AnonymousClass3Ql f17990E;
    /* renamed from: F */
    private final AnonymousClass3Qn f17991F;
    /* renamed from: G */
    private Filter f17992G;
    /* renamed from: H */
    private final AnonymousClass2Lm f17993H;

    public final boolean QV() {
        return false;
    }

    private AnonymousClass1Od(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3e1 anonymousClass3e1, AnonymousClass3e1 anonymousClass3e12, boolean z, boolean z2) {
        this.f17988C = anonymousClass3e1;
        this.f17989D = anonymousClass3e12;
        this.f17990E = new AnonymousClass3Ql(context, z2);
        this.f17991F = new AnonymousClass3Qn(context, anonymousClass0Cm, z);
        this.f17993H = new AnonymousClass2Lm(context);
        m4249D(this.f17990E, this.f17991F, this.f17993H);
    }

    /* renamed from: B */
    public static AnonymousClass1Od m11173B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Px anonymousClass0Px, List list, boolean z, boolean z2, boolean z3) {
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        AnonymousClass0Px anonymousClass0Px2 = anonymousClass0Px;
        return new AnonymousClass1Od(context, anonymousClass0Cm, new AnonymousClass41h(anonymousClass0Px2, new AnonymousClass41i(anonymousClass0Px2, anonymousClass0EE, new AnonymousClass40f(anonymousClass0Cm)), new AnonymousClass40g(), Boolean.valueOf(false)), AnonymousClass3dl.B(anonymousClass0Cm, anonymousClass0Px2, anonymousClass0EE2, "autocomplete_user_list", new AnonymousClass40e(anonymousClass0Cm), list, null, z), z2, z3);
    }

    /* renamed from: C */
    public static AnonymousClass3e1 m11174C(AnonymousClass1Od anonymousClass1Od, String str) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            if (charAt == '#') {
                return anonymousClass1Od.f17988C;
            }
            if (charAt == '@') {
                return anonymousClass1Od.f17989D;
            }
        }
        return null;
    }

    /* renamed from: D */
    private void m11175D(AnonymousClass3e1 anonymousClass3e1, AnonymousClass0TA anonymousClass0TA) {
        m4248C();
        for (Object B : (List) anonymousClass3e1.uQ()) {
            m4247B(B, null, anonymousClass0TA);
        }
        if (anonymousClass3e1.uX() || anonymousClass3e1.UX()) {
            m4247B(this, null, this.f17993H);
        }
        m4250E();
    }

    public final boolean NV() {
        AnonymousClass3e1 anonymousClass3e1 = this.f17987B;
        return anonymousClass3e1 != null ? ((List) anonymousClass3e1.uQ()).isEmpty() : false;
    }

    public final void OZ() {
        AnonymousClass3e1 anonymousClass3e1 = this.f17987B;
        if (anonymousClass3e1 != null && anonymousClass3e1.UX()) {
            this.f17987B.WLA();
        }
    }

    public final void Pv(AnonymousClass3e1 anonymousClass3e1) {
        AnonymousClass3e1 anonymousClass3e12 = this.f17989D;
        if (anonymousClass3e1 == anonymousClass3e12) {
            m11175D(anonymousClass3e12, this.f17991F);
            return;
        }
        anonymousClass3e12 = this.f17988C;
        if (anonymousClass3e1 == anonymousClass3e12) {
            m11175D(anonymousClass3e12, this.f17990E);
        }
    }

    public final boolean UX() {
        AnonymousClass3e1 anonymousClass3e1 = this.f17987B;
        return anonymousClass3e1 != null && anonymousClass3e1.UX();
    }

    public final Filter getFilter() {
        if (this.f17992G == null) {
            this.f17992G = new AnonymousClass3Qp(this);
        }
        return this.f17992G;
    }

    public final boolean tX() {
        AnonymousClass3e1 anonymousClass3e1 = this.f17987B;
        return anonymousClass3e1 != null && (anonymousClass3e1.uX() || this.f17987B.UX());
    }

    public final boolean uX() {
        AnonymousClass3e1 anonymousClass3e1 = this.f17987B;
        return anonymousClass3e1 != null && anonymousClass3e1.uX();
    }
}

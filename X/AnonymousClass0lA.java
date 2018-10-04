package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.0lA */
public final class AnonymousClass0lA implements AnonymousClass0NO {
    /* renamed from: E */
    public static final AnonymousClass0N0 f9442E = new AnonymousClass0N0(20);
    /* renamed from: F */
    public static final Class f9443F = AnonymousClass0lA.class;
    /* renamed from: B */
    public ArrayList f9444B = new ArrayList(16);
    /* renamed from: C */
    public boolean f9445C;
    /* renamed from: D */
    public boolean f9446D;

    private AnonymousClass0lA() {
    }

    /* renamed from: A */
    public final AnonymousClass0lA m7237A(int i) {
        this.f9444B.add(Integer.valueOf(i));
        return this;
    }

    /* renamed from: B */
    public static AnonymousClass0lA m7236B() {
        AnonymousClass0lA anonymousClass0lA = (AnonymousClass0lA) f9442E.m3259A();
        if (anonymousClass0lA == null) {
            return new AnonymousClass0lA();
        }
        anonymousClass0lA.f9446D = false;
        return anonymousClass0lA;
    }

    /* renamed from: B */
    public final AnonymousClass0lA m7238B(AnonymousClass0db anonymousClass0db) {
        this.f9444B.add(anonymousClass0db);
        this.f9445C = true;
        return this;
    }

    /* renamed from: C */
    public final AnonymousClass0lA m7239C(String str) {
        this.f9444B.add(str);
        return this;
    }

    /* renamed from: D */
    public final AnonymousClass0lA m7240D(boolean z) {
        this.f9444B.add(Boolean.valueOf(z));
        return this;
    }

    /* renamed from: E */
    public final String m7241E(String str) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("[\n");
        for (int i = 0; i < this.f9444B.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            StringWriter append = stringWriter.append(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            append.append(AnonymousClass18G.m9544B(stringBuilder.toString(), this.f9444B.get(i))).append('\n');
        }
        stringWriter.append(str).append("]");
        return stringWriter.toString();
    }

    public final AnalyticsEventDebugInfo ZVA() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo();
        for (int i = 0; i < this.f9444B.size(); i++) {
            AnonymousClass18G.m9549G(analyticsEventDebugInfo, null, this.f9444B.get(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        stringBuilder.append(m7241E("| "));
        stringBuilder.append("\n}");
        analyticsEventDebugInfo.f25483B = stringBuilder.toString();
        return analyticsEventDebugInfo;
    }

    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("[");
        for (int i = 0; i < this.f9444B.size(); i++) {
            Object obj = this.f9444B.get(i);
            CharSequence obj2 = obj != null ? obj.toString() : JsonProperty.USE_DEFAULT_NAME;
            if (obj2.isEmpty()) {
                obj2 = "null";
            }
            stringWriter.append(obj2);
            if (i < this.f9444B.size() - 1) {
                stringWriter.append(", ");
            }
        }
        stringWriter.append("]");
        return stringWriter.toString();
    }
}

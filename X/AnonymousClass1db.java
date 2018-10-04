package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

/* renamed from: X.1db */
public final class AnonymousClass1db {
    /* renamed from: B */
    public AnonymousClass223 f20772B;
    /* renamed from: C */
    private final String f20773C;
    /* renamed from: D */
    private final AnonymousClass223 f20774D;
    /* renamed from: E */
    private boolean f20775E = false;

    public AnonymousClass1db(String str) {
        AnonymousClass223 anonymousClass223 = new AnonymousClass223();
        this.f20774D = anonymousClass223;
        this.f20772B = anonymousClass223;
        this.f20773C = (String) AnonymousClass1Cy.m9952G(str);
    }

    /* renamed from: A */
    public final AnonymousClass1db m12225A(String str, Object obj) {
        AnonymousClass223 anonymousClass223 = new AnonymousClass223();
        this.f20772B.f25354C = anonymousClass223;
        this.f20772B = anonymousClass223;
        anonymousClass223.f25355D = obj;
        anonymousClass223.f25353B = (String) AnonymousClass1Cy.m9952G(str);
        return this;
    }

    public final String toString() {
        boolean z = this.f20775E;
        String str = JsonProperty.USE_DEFAULT_NAME;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.f20773C);
        stringBuilder.append('{');
        for (AnonymousClass223 anonymousClass223 = this.f20774D.f25354C; anonymousClass223 != null; anonymousClass223 = anonymousClass223.f25354C) {
            Object obj = anonymousClass223.f25355D;
            if (!z || obj != null) {
                stringBuilder.append(str);
                str = ", ";
                if (anonymousClass223.f25353B != null) {
                    stringBuilder.append(anonymousClass223.f25353B);
                    stringBuilder.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    stringBuilder.append(obj);
                } else {
                    CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                    stringBuilder.append(deepToString, 1, deepToString.length() - 1);
                }
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

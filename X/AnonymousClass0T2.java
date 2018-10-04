package X;

import java.util.List;

/* renamed from: X.0T2 */
public final class AnonymousClass0T2 {
    /* renamed from: B */
    public String f5068B;
    /* renamed from: C */
    public List f5069C;

    /* renamed from: A */
    public final AnonymousClass1bR m4442A(String str) {
        List<AnonymousClass1bR> list = this.f5069C;
        if (!(list == null || str == null)) {
            for (AnonymousClass1bR anonymousClass1bR : list) {
                if (str.equals(anonymousClass1bR.f20462D)) {
                    return anonymousClass1bR;
                }
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ QpToolTipTemplate name: ");
        stringBuilder.append(this.f5068B);
        stringBuilder.append(",parameters: ");
        stringBuilder.append(this.f5069C);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

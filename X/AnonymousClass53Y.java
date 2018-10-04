package X;

import java.util.List;

/* renamed from: X.53Y */
public final class AnonymousClass53Y {
    /* renamed from: B */
    public static final int m25655B(List list, Integer num, Double d, int i, int i2) {
        int intValue;
        Integer num2 = (Integer) AnonymousClass0Ww.F(list);
        if (num2 != null) {
            intValue = num2.intValue();
        } else if (num != null) {
            intValue = num.intValue();
        } else if (d != null) {
            list = (double) i;
            double doubleValue = d.doubleValue();
            Double.isNaN(list);
            intValue = (int) (list * doubleValue);
        } else {
            intValue = 0;
        }
        if (intValue + i2 < i) {
            return intValue;
        }
        return Math.max(i - i2, 0);
    }
}

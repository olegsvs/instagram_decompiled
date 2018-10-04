package X;

/* renamed from: X.56D */
public final class AnonymousClass56D {
    /* renamed from: B */
    public static boolean m25726B(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case ' ':
                case '#':
                case '(':
                case ')':
                case '+':
                case '-':
                case '.':
                    break;
                default:
                    if (Character.isDigit(charAt)) {
                        break;
                    }
                    return true;
            }
        }
        return false;
    }
}

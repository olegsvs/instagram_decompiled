package X;

/* renamed from: X.1Cy */
public final class AnonymousClass1Cy {
    /* renamed from: B */
    public static String m9947B(int i, int i2, String str) {
        if (i < 0) {
            return AnonymousClass1Cy.m9958M("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return AnonymousClass1Cy.m9958M("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: C */
    public static String m9948C(int i, int i2, String str) {
        if (i < 0) {
            return AnonymousClass1Cy.m9958M("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return AnonymousClass1Cy.m9958M("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: D */
    public static void m9949D(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: E */
    public static void m9950E(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: F */
    public static int m9951F(int i, int i2) {
        String str = "index";
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(AnonymousClass1Cy.m9947B(i, i2, str));
    }

    /* renamed from: G */
    public static Object m9952G(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: H */
    public static Object m9953H(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: I */
    public static int m9954I(int i, int i2) {
        String str = "index";
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(AnonymousClass1Cy.m9948C(i, i2, str));
    }

    /* renamed from: J */
    public static void m9955J(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(AnonymousClass1Cy.m9959N(i, i2, i3));
        }
    }

    /* renamed from: K */
    public static void m9956K(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: L */
    public static void m9957L(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: M */
    public static String m9958M(String str, Object... objArr) {
        str = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = str.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(str, i2, indexOf);
            int i3 = i + 1;
            stringBuilder.append(objArr[i]);
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(str, i2, str.length());
        if (i < objArr.length) {
            stringBuilder.append(" [");
            i3 = i + 1;
            stringBuilder.append(objArr[i]);
            while (i3 < objArr.length) {
                stringBuilder.append(", ");
                i2 = i3 + 1;
                stringBuilder.append(objArr[i3]);
                i3 = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    /* renamed from: N */
    private static String m9959N(int i, int i2, int i3) {
        if (i >= 0) {
            if (i <= i3) {
                if (i2 >= 0) {
                    if (i2 <= i3) {
                        return AnonymousClass1Cy.m9958M("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                    }
                }
                return AnonymousClass1Cy.m9948C(i2, i3, "end index");
            }
        }
        return AnonymousClass1Cy.m9948C(i, i3, "start index");
    }
}

package com.fasterxml.jackson.databind.util;

public abstract class NameTransformer {
    public static final NameTransformer NOP = new NameTransformer$1();

    public abstract String reverse(String str);

    public abstract String transform(String str);

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new NameTransformer$Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        Object obj = 1;
        Object obj2 = (str == null || str.length() <= 0) ? null : 1;
        if (str2 == null || str2.length() <= 0) {
            obj = null;
        }
        if (obj2 != null) {
            if (obj != null) {
                return new NameTransformer$2(str, str2);
            }
            return new NameTransformer$3(str);
        } else if (obj != null) {
            return new NameTransformer$4(str2);
        } else {
            return NOP;
        }
    }
}

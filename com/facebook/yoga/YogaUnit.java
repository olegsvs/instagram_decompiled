package com.facebook.yoga;

public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    /* renamed from: B */
    private final int f34747B;

    private YogaUnit(int i) {
        this.f34747B = i;
    }

    /* renamed from: A */
    public final int m17424A() {
        return this.f34747B;
    }

    /* renamed from: B */
    public static YogaUnit m17423B(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown enum value: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

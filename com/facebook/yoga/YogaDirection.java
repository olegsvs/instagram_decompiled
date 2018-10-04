package com.facebook.yoga;

public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    /* renamed from: B */
    private final int f34690B;

    private YogaDirection(int i) {
        this.f34690B = i;
    }

    /* renamed from: A */
    public final int m17413A() {
        return this.f34690B;
    }

    /* renamed from: B */
    public static YogaDirection m17412B(int i) {
        switch (i) {
            case 0:
                return INHERIT;
            case 1:
                return LTR;
            case 2:
                return RTL;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown enum value: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

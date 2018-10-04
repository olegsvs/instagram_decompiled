package com.facebook.yoga;

public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private YogaMeasureMode(int i) {
    }

    /* renamed from: B */
    public static YogaMeasureMode m17419B(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return EXACTLY;
            case 2:
                return AT_MOST;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown enum value: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

package com.facebook.yoga;

public class YogaValue {
    public static final YogaValue AUTO = new YogaValue(1.0E21f, YogaUnit.AUTO);
    public static final YogaValue UNDEFINED = new YogaValue(1.0E21f, YogaUnit.UNDEFINED);
    public static final YogaValue ZERO = new YogaValue(0.0f, YogaUnit.POINT);
    public final YogaUnit unit;
    public final float value;

    public YogaValue(float f, int i) {
        this(f, YogaUnit.m17423B(i));
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.value = f;
        this.unit = yogaUnit;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.unit;
        if (yogaUnit != yogaValue.unit) {
            return false;
        }
        if (yogaUnit == YogaUnit.UNDEFINED || this.unit == YogaUnit.AUTO || Float.compare(this.value, yogaValue.value) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.value) + this.unit.m17424A();
    }

    public final String toString() {
        switch (this.unit.ordinal()) {
            case 0:
                return "undefined";
            case 1:
                return Float.toString(this.value);
            case 2:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.value);
                stringBuilder.append("%");
                return stringBuilder.toString();
            case 3:
                return "auto";
            default:
                throw new IllegalStateException();
        }
    }
}

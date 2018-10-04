package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5L6 */
public final class AnonymousClass5L6 implements Comparable {
    /* renamed from: B */
    public int f62361B;
    /* renamed from: C */
    public final float[] f62362C;

    public AnonymousClass5L6(int i, float[] fArr) {
        this.f62361B = i;
        this.f62362C = fArr;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f62361B - ((AnonymousClass5L6) obj).f62361B;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnonymousClass5L6) && ((AnonymousClass5L6) obj).f62361B == this.f62361B;
    }

    public final int hashCode() {
        return this.f62361B;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        String str = JsonProperty.USE_DEFAULT_NAME;
        for (float valueOf : this.f62362C) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(String.valueOf(valueOf));
            stringBuilder.append(" ");
            str = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(this.f62361B));
        stringBuilder.append("_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}

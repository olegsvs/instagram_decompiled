package X;

import com.facebook.fbuploader.fbmediauploader.serialization.JsonField;
import java.util.Arrays;

/* renamed from: X.1uS */
public final class AnonymousClass1uS implements Comparable {
    @JsonField(name = "mimeType")
    /* renamed from: B */
    public String f24004B;
    @JsonField(name = "segmentPath")
    /* renamed from: C */
    public String f24005C;
    @JsonField(name = "segmentType")
    /* renamed from: D */
    public int f24006D;
    @JsonField(name = "startOffset")
    /* renamed from: E */
    public long f24007E;

    public AnonymousClass1uS(String str, String str2, int i, long j) {
        this.f24005C = str;
        this.f24004B = str2;
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                throw new IllegalArgumentException("Segment type has to be either Audio, Video or Mixed");
            }
        }
        this.f24006D = i;
        this.f24007E = j;
    }

    /* renamed from: A */
    public final int m13672A(AnonymousClass1uS anonymousClass1uS) {
        int compare = Integer.compare(anonymousClass1uS.f24006D, this.f24006D);
        return compare == 0 ? Integer.compare((int) this.f24007E, (int) anonymousClass1uS.f24007E) : compare;
    }

    /* renamed from: B */
    private String m13671B() {
        switch (this.f24006D) {
            case 1:
                return "Audio";
            case 2:
                return "Video";
            case 3:
                return "Mixed";
            default:
                return "Unknown";
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m13672A((AnonymousClass1uS) obj);
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AnonymousClass1uS) {
                AnonymousClass1uS anonymousClass1uS = (AnonymousClass1uS) obj;
                if (AnonymousClass1uY.m13675B(this.f24005C, anonymousClass1uS.f24005C) && AnonymousClass1uY.m13675B(this.f24004B, anonymousClass1uS.f24004B) && AnonymousClass1uY.m13675B(Integer.valueOf(this.f24006D), Integer.valueOf(anonymousClass1uS.f24006D)) && this.f24007E == anonymousClass1uS.f24007E) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24005C, this.f24004B, Integer.valueOf(this.f24006D), Long.valueOf(this.f24007E)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("SegmentPath: ");
        stringBuilder.append(this.f24005C);
        stringBuilder.append(", MimeType: ");
        stringBuilder.append(this.f24004B);
        stringBuilder.append(", SegmentType: ");
        stringBuilder.append(m13671B());
        stringBuilder.append(", mStartOffset: ");
        stringBuilder.append(this.f24007E);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

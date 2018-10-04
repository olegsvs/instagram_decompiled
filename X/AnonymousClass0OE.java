package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0OE */
public final class AnonymousClass0OE {
    /* renamed from: B */
    public int f3852B;
    /* renamed from: C */
    public List f3853C = new ArrayList(AnonymousClass0OF.values().length);
    /* renamed from: D */
    public List f3854D = new ArrayList(AnonymousClass0OF.values().length);

    public AnonymousClass0OE() {
        for (int i = 0; i < AnonymousClass0OF.values().length; i++) {
            this.f3853C.add(Integer.valueOf(0));
            this.f3854D.add(Integer.valueOf(0));
        }
    }

    /* renamed from: B */
    public static AnonymousClass0OF m3613B(AnonymousClass0OC anonymousClass0OC, boolean z) {
        switch (anonymousClass0OC.ordinal()) {
            case 0:
            case 1:
            case 2:
                return z ? AnonymousClass0OF.VIDEO_UPLOAD : AnonymousClass0OF.PHOTO_UPLOAD;
            case 3:
            case 5:
                return AnonymousClass0OF.CONFIGURE;
            case 4:
                return AnonymousClass0OF.PHOTO_UPLOAD;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(anonymousClass0OC.name());
                stringBuilder.append(":");
                stringBuilder.append(anonymousClass0OC.ordinal());
                AnonymousClass0Gn.m1876C("wrong_endpoint_map", stringBuilder.toString());
                return AnonymousClass0OF.CONFIGURE;
        }
    }
}

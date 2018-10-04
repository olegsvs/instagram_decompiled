package X;

/* renamed from: X.36l */
public enum AnonymousClass36l {
    FOCUS("focus"),
    SUPERZOOM("superzoom"),
    COLOR_ENHANCE("color_enhance"),
    COLOR_ENHANCE_SMOOTHING("color_enhance_smoothing"),
    COLOR_ENHANCE_SHARPENING("color_enhance_sharpening"),
    NORMAL("normal"),
    SIMPLE_FILTER("simple_filter"),
    WORLD("world"),
    GALLERY_UPLOAD("gallery_upload");
    
    /* renamed from: B */
    private final String f37920B;

    private AnonymousClass36l(String str) {
        this.f37920B = str;
    }

    /* renamed from: A */
    public final String m18543A() {
        return this.f37920B;
    }

    /* renamed from: B */
    public static AnonymousClass36l m18542B(String str) {
        for (AnonymousClass36l anonymousClass36l : AnonymousClass36l.values()) {
            if (anonymousClass36l.f37920B.equals(str)) {
                return anonymousClass36l;
            }
        }
        return NORMAL;
    }
}

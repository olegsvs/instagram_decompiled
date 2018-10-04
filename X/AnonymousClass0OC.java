package X;

/* renamed from: X.0OC */
public enum AnonymousClass0OC {
    DRAFT,
    NOT_UPLOADED,
    CREATED_MEDIA,
    UPLOADED_DECOR_IMAGE,
    UPLOADED_VIDEO,
    UPLOADED,
    CONFIGURING_MULTIPLE_TARGETS,
    CONFIGURED;

    /* renamed from: A */
    public final boolean m3607A(AnonymousClass0OC anonymousClass0OC) {
        return ordinal() >= anonymousClass0OC.ordinal();
    }

    /* renamed from: B */
    public final boolean m3608B(AnonymousClass0OC anonymousClass0OC) {
        return ordinal() < anonymousClass0OC.ordinal();
    }
}

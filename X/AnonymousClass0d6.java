package X;

/* renamed from: X.0d6 */
public abstract class AnonymousClass0d6 {
    /* renamed from: B */
    public static final AnonymousClass0EE f7313B = new AnonymousClass0NM("camera_crash");

    /* renamed from: B */
    public static void m5941B(AnonymousClass0Cm anonymousClass0Cm) {
        String str = "pending_capture_intent_capture_mode";
        if ((AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getString(str, null) != null ? 1 : null) != null) {
            AnonymousClass0HV D = AnonymousClass0HV.m2008D(anonymousClass0Cm);
            String string = D.f2646B.getString(str, null);
            AnonymousClass0NN.m3291B("story_media_lost", f7313B).m3298F("capture_mode", string).m3298F("media_type", D.f2646B.getString("pending_capture_intent_media_type", null)).m3300H("is_reply", D.f2646B.getBoolean("pending_capture_intent_is_reply", false)).m3310R();
            AnonymousClass0d6.m5942C(anonymousClass0Cm);
        }
    }

    /* renamed from: C */
    public static void m5942C(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.edit().remove("pending_capture_intent_capture_mode").remove("pending_capture_intent_media_type").remove("pending_capture_intent_is_reply").apply();
    }
}

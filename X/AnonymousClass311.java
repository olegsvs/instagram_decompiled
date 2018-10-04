package X;

/* renamed from: X.311 */
public enum AnonymousClass311 {
    SESSION_START("ig_nametag_session_start"),
    CONFIG_MODE_CHANGED("ig_nametag_config_mode_changed"),
    CONFIG_GRADIENT_CHANGED("ig_nametag_config_gradient_changed"),
    CONFIG_EMOJI_CHANGED("ig_nametag_config_emoji_changed"),
    CONFIG_SELFIE_STICKER_CHANGED("ig_nametag_config_selfie_sticker_changed"),
    CONFIG_SELFIE_RETAKE_TAPPED("ig_nametag_selfie_retake_tapped"),
    CONFIG_SELFIE_PHOTO_CAPTURED("ig_nametag_selfie_photo_captured"),
    CONFIG_SELFIE_RETAKE_CANCELLED("ig_nametag_selfie_retake_cancelled"),
    SHARE_TAPPED("ig_nametag_share_tapped"),
    SCAN_NAMETAG_TAPPED("ig_nametag_scan_tapped"),
    VIEW_SELF_NAMETAG_TAPPED("ig_nametag_view_self_nametag_tapped"),
    CAMERA_PREVIEW_STARTED("ig_nametag_camera_preview_started"),
    CAMERA_PERMISSION_GRANTED("ig_nametag_camera_permission_granted"),
    CAMERA_PERMISSION_DENIED("ig_nametag_camera_permission_denied"),
    ARLINK_MODEL_LOAD_SUCCESS("ig_nametag_arlink_model_load_success"),
    ARLINK_MODEL_LOAD_FAIL("ig_nametag_arlink_model_load_fail"),
    GALLERY_TAPPED("ig_nametag_gallery_tapped"),
    GALLERY_PERMISSION_GRANTED("ig_nametag_gallery_permission_granted"),
    GALLERY_PERMISSION_DENIED("ig_nametag_gallery_permission_denied"),
    GALLERY_MEDIUM_SELECTED("ig_nametag_gallery_medium_selected"),
    GALLERY_MEDIUM_DETECT_FAIL("ig_nametag_gallery_medium_detect_fail"),
    GALLERY_CLOSED("ig_nametag_gallery_closed"),
    CANDIDATE_DETECTED("ig_nametag_candidate_detected"),
    USER_LOOKUP_SUCCESS("ig_nametag_user_lookup_success"),
    USER_LOOKUP_FAIL("ig_nametag_user_lookup_fail"),
    STORY_CAMERA_LONG_PRESSED("ig_nametag_story_camera_long_pressed"),
    CAMERA_SCAN_FAILED("ig_nametag_camera_scan_failed"),
    FOLLOW_BUTTON_TAPPED("ig_nametag_follow_button_tapped"),
    SELF_NAMETAG_SCANNED("ig_nametag_self_nametag_scanned"),
    ALREADY_FOLLOWING("ig_nametag_already_following"),
    ALREADY_REQUESTED_TO_FOLLOW("ig_nametag_already_requested_to_follow"),
    VIEW_PROFILE_TAPPED("ig_nametag_view_profile_tapped"),
    CLOSE_TAPPED("ig_nametag_close_tapped"),
    RESULT_DISMISSED("ig_nametag_result_dismissed"),
    SESSION_END("ig_nametag_session_end");
    
    /* renamed from: B */
    private final String f36935B;

    private AnonymousClass311(String str) {
        this.f36935B = str;
    }

    /* renamed from: A */
    public final AnonymousClass0NN m18207A() {
        return AnonymousClass311.m18205C().A(this.f36935B);
    }

    /* renamed from: B */
    public static String m18204B() {
        return AnonymousClass311.m18205C().E();
    }

    /* renamed from: B */
    public final void m18208B() {
        m18207A().R();
    }

    /* renamed from: C */
    public static AnonymousClass0NS m18205C() {
        return AnonymousClass0NS.B("instagram_nametag");
    }

    /* renamed from: D */
    public static void m18206D() {
        AnonymousClass311.m18205C().G();
    }
}

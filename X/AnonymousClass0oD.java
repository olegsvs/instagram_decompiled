package X;

import java.util.EnumSet;
import java.util.Locale;

/* renamed from: X.0oD */
public enum AnonymousClass0oD {
    ADD_PHONE_NUMBER("instagram://change_phone"),
    OPEN_PLAY_STORE_LINK("instagram://play_store"),
    OPEN_WEBVIEW("instagram://webview"),
    REQUEST_CONFIRM_PHONE_NUMBER("instagram://confirm_phone"),
    REQUEST_CONFIRM_EMAIL("instagram://confirm_email"),
    REQUEST_CHANGE_EMAIL("instagram://change_email"),
    REQUEST_CHANGE_PASSWORD("instagram://change_password"),
    REQUEST_TURN_ON_PUSH("instagram://enable_push"),
    REQUEST_TURN_ON_SMS("instagram://enable_sms"),
    REQUEST_OPEN_INVITE_CONTACTS("instagram://invite_contacts"),
    REQUEST_ZERO_VIDEO_SETTING("instagram://zero_video_setting"),
    REQUEST_DATA_SAVER_MODE_SETTING("instagram://datasaver"),
    REQUEST_APP_LANGUAGE_SETTING("instagram://language_setting"),
    REQUEST_GDPR_CONSENT("instagram://gdpr_consent"),
    REQUEST_GDPR_DISMISS("instagram://gdpr_dismiss"),
    REQUEST_CLAIM_FB_PAGE("instagram://claim_page/"),
    REQUEST_DIRECT_INBOX_CAMERA("instagram://direct-inbox-camera"),
    REQUEST_BUSINESS_TUTORIALS("instagram://business_tutorials"),
    REQUEST_BUSINESS_CONVERSION("instagram://business_conversion"),
    REQUEST_BRANDED_CONTENT_LEARN_MORE("instagram://branded_content"),
    REQUEST_SHOPPING_GET_STARTED("instagram://shopping/get_started"),
    REQUEST_BUSINESS_SIGN_UP("instagram://business_signup"),
    REQUEST_FACEBOOK_CONNECT("instagram://facebook_connect"),
    REQUEST_CONTACT_IMPORT("instagram://contact_import"),
    REQUEST_CONTACT_PERMISSION("instagram://contact_permission"),
    REQUEST_ADD_SCHOOL("instagram://school"),
    REQUEST_ADD_PROFILE_PHOTO("instagram://add_profile_photo"),
    OPEN_FEEDBACK_FLOW("instagram://open_leave_feedback_flow"),
    ACCOUNT_PRIVACY_SHEET("instagram://account_privacy"),
    CREATE_SECONDARY_ACCOUNT("instagram://create_new_account"),
    REQUEST_TWOFAC_TOTP("instagram://twofac_totp"),
    REQUEST_NAMETAG("instagram://nametag"),
    REQUEST_ACCOUNT_TRANSPARENCY("instagram://account_transparency"),
    REQUEST_ARBITRARY_API("instagram://api/"),
    HANDLED_EXTERNAL_URL(null),
    WEB_SITE("https://");
    
    /* renamed from: B */
    private final String f10276B;

    public AnonymousClass0oD(String str) {
        this.f10276B = str;
    }

    /* renamed from: A */
    public boolean mo1838A(String str, AnonymousClass0Cm anonymousClass0Cm) {
        return str.startsWith(this.f10276B);
    }

    /* renamed from: B */
    public static AnonymousClass0oD m7689B(String str, AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0oD.m7690C(EnumSet.allOf(AnonymousClass0oD.class), str, anonymousClass0Cm);
    }

    /* renamed from: C */
    public static AnonymousClass0oD m7690C(EnumSet enumSet, String str, AnonymousClass0Cm anonymousClass0Cm) {
        if (enumSet.remove(f10243H) && f10243H.mo1838A(str, anonymousClass0Cm)) {
            return f10243H;
        }
        str = str.toLowerCase(Locale.US);
        enumSet = enumSet.iterator();
        while (enumSet.hasNext()) {
            AnonymousClass0oD anonymousClass0oD = (AnonymousClass0oD) enumSet.next();
            if (anonymousClass0oD.mo1838A(str, anonymousClass0Cm)) {
                return anonymousClass0oD;
            }
        }
        return null;
    }
}

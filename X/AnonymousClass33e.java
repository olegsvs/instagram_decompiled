package X;

import android.os.Build.VERSION;

/* renamed from: X.33e */
public enum AnonymousClass33e {
    EDIT_PROFILE_TAP_ENTRY_POINT("edit_profile_tap_entry_point"),
    EDIT_PROFILE_TAP_COMPONENT("edit_profile_tap_component"),
    EDIT_PROFILE_CHANGE_OPTION("edit_profile_change_option"),
    EDIT_PROFILE_START_STEP("edit_profile_start_step"),
    EDIT_PROFILE_START_STEP_ERROR("edit_profile_start_step_error"),
    EDIT_PROFILE_FINISH_STEP("edit_profile_finish_step"),
    EDIT_PROFILE_CANCEL("edit_profile_cancel"),
    EDIT_PROFILE_SUBMIT("edit_profile_submit"),
    EDIT_PROFILE_SUBMIT_ERROR("edit_profile_submit_error");
    
    /* renamed from: B */
    private final String f37448B;

    private AnonymousClass33e(String str) {
        this.f37448B = str;
    }

    /* renamed from: A */
    public final AnonymousClass0NN m18380A() {
        return AnonymousClass33e.m18379C().A(this.f37448B).B("api_level", VERSION.SDK_INT);
    }

    /* renamed from: B */
    public static void m18378B() {
        AnonymousClass33e.m18379C().G();
    }

    /* renamed from: C */
    private static AnonymousClass0NS m18379C() {
        return AnonymousClass0NS.B("edit_profile_flow");
    }
}

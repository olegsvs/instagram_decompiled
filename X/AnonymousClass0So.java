package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.0So */
public final class AnonymousClass0So {
    /* renamed from: A */
    public final AnonymousClass0IL m4410A(String str, boolean z, ArrayList arrayList, String str2) {
        return AnonymousClass0So.m4409B(AnonymousClass0Ik.Contacts, null, str, z, false, false, arrayList, str2);
    }

    /* renamed from: B */
    public static AnonymousClass0IL m4409B(AnonymousClass0Ik anonymousClass0Ik, String str, String str2, boolean z, boolean z2, boolean z3, ArrayList arrayList, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("UserListWithSocialConnectFragment.ARGUMENTS_TYPE", anonymousClass0Ik.ordinal());
        bundle.putString("UserListWithSocialConnectFragment.ARGUMENTS_TITLE", str2);
        if (str != null) {
            bundle.putString("UserListWithSocialConnectFragment.ARGUMENTS_ACCESS_TOKEN", str);
        }
        if (str3 != null) {
            bundle.putString("IgSessionManager.USER_ID", str3);
        }
        if (z) {
            bundle.putBoolean("IS_SIGN_UP_FLOW", true);
            bundle.putBoolean("UserListWithSocialConnectFragment.ARGUMENTS_CLICK_THROUGH", false);
            if (!(arrayList == null || arrayList.isEmpty())) {
                bundle.putStringArrayList("NuxHelper.ARGUMENT_SEEN_SOURCES", arrayList);
            }
        }
        if (z2) {
            bundle.putBoolean("NuxHelper.ARGUMENT_IS_FACEBOOK_LINKING_FLOW", true);
        }
        if (z3) {
            bundle.putBoolean("UserListWithSocialConnectFragment.ARGUMENTS_IS_FB_FOLLOW_INVITE_FLOW", true);
            bundle.putBoolean("UserListWithSocialConnectFragment.ARGUMENTS_OPEN_BACK_BUTTON", true);
        }
        AnonymousClass0IL anonymousClass0Id = new AnonymousClass0Id();
        anonymousClass0Id.setArguments(bundle);
        return anonymousClass0Id;
    }

    /* renamed from: B */
    public final AnonymousClass0IL m4411B(String str, String str2, boolean z, boolean z2, String str3) {
        return AnonymousClass0So.m4409B(AnonymousClass0Ik.Facebook, str, str2, z, z2, false, null, str3);
    }
}

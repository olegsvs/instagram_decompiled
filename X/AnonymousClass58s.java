package X;

import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;
import com.instagram.nux.impl.OnboardingActivity;
import java.util.Map;

/* renamed from: X.58s */
public final class AnonymousClass58s implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ OnboardingActivity f60520B;

    public AnonymousClass58s(OnboardingActivity onboardingActivity) {
        this.f60520B = onboardingActivity;
    }

    public final void Zt(Map map) {
        switch (((AnonymousClass1Bb) map.get("android.permission.READ_CONTACTS")).ordinal()) {
            case 0:
                AnonymousClass0Fr.ContactsUpsellAccepted.C(AnonymousClass2Na.CONTACTS_UPSELL).R();
                FragmentActivity fragmentActivity = this.f60520B;
                AnonymousClass1fn.L(fragmentActivity, fragmentActivity, fragmentActivity.f3945C, this.f60520B.getString(C0164R.string.find_contacts_nux_title), null, true, this.f60520B.f3945C.f1759C);
                return;
            case 2:
                OnboardingActivity.D(this.f60520B, AnonymousClass0Fr.ContactsUpsellAutoDeclined);
                return;
            default:
                OnboardingActivity.D(this.f60520B, AnonymousClass0Fr.ContactsUpsellDeclined);
                return;
        }
    }
}

package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.user.recommended.FollowListData;

/* renamed from: X.5KY */
public final class AnonymousClass5KY extends AnonymousClass1LN {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ka f62294B;

    public AnonymousClass5KY(AnonymousClass5Ka anonymousClass5Ka, AnonymousClass0IU anonymousClass0IU) {
        this.f62294B = anonymousClass5Ka;
        super(anonymousClass0IU);
    }

    /* renamed from: J */
    public final AnonymousClass0IL m26259J(int i) {
        String string = this.f62294B.getArguments().getString("IgSessionManager.USER_ID");
        AnonymousClass0IL anonymousClass5aQ;
        switch (((AnonymousClass5KZ) this.f62294B.f62306H.get(i)).ordinal()) {
            case 0:
                Parcelable B = FollowListData.B(AnonymousClass3m9.Following, this.f62294B.f62307I);
                AnonymousClass0Jp.f2944B.A();
                anonymousClass5aQ = new AnonymousClass5aQ();
                Bundle bundle = new Bundle();
                AnonymousClass5KT anonymousClass5KT = B.f44276E == AnonymousClass3m9.Following ? AnonymousClass5KT.Following : AnonymousClass5KT.Followers;
                bundle.putString("IgSessionManager.USER_ID", string);
                bundle.putInt("FollowListFragment.EntryType", anonymousClass5KT.ordinal());
                bundle.putParcelable("FollowListFragment.FollowListData", B);
                anonymousClass5aQ.setArguments(bundle);
                return anonymousClass5aQ;
            case 1:
                AnonymousClass0Jp.f2944B.A();
                String str = this.f62294B.f62307I;
                String str2 = this.f62294B.f62309K;
                anonymousClass5aQ = new AnonymousClass5aS();
                Bundle bundle2 = new Bundle();
                bundle2.putString("IgSessionManager.USER_ID", string);
                bundle2.putString("UserDetailFragment.EXTRA_USER_ID", str);
                bundle2.putString("UserDetailFragment.EXTRA_USER_NAME", str2);
                anonymousClass5aQ.setArguments(bundle2);
                return anonymousClass5aQ;
            default:
                throw new IllegalArgumentException("Invalid position");
        }
    }

    public final int getCount() {
        return this.f62294B.f62306H.size();
    }
}

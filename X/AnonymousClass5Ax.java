package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.reels.friendlist.view.FriendListTabFragment;

/* renamed from: X.5Ax */
public final class AnonymousClass5Ax implements AnonymousClass2IP {
    /* renamed from: B */
    public final /* synthetic */ FriendListTabFragment f60882B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5An f60883C;
    /* renamed from: D */
    public final /* synthetic */ int f60884D;
    /* renamed from: E */
    public final /* synthetic */ String f60885E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0Ci f60886F;

    public AnonymousClass5Ax(FriendListTabFragment friendListTabFragment, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass5An anonymousClass5An, int i, String str) {
        this.f60882B = friendListTabFragment;
        this.f60886F = anonymousClass0Ci;
        this.f60883C = anonymousClass5An;
        this.f60884D = i;
        this.f60885E = str;
    }

    public final View qR() {
        FriendListTabFragment friendListTabFragment = this.f60882B;
        if (friendListTabFragment.mListRemovalAnimationShimHolder == null) {
            ViewGroup viewGroup = (ViewGroup) friendListTabFragment.mList.getParent();
            View C = AnonymousClass5Am.m25911C(viewGroup);
            viewGroup.addView(C, 0);
            friendListTabFragment.mListRemovalAnimationShimHolder = (AnonymousClass5Al) C.getTag();
        }
        AnonymousClass5Al anonymousClass5Al = friendListTabFragment.mListRemovalAnimationShimHolder;
        AnonymousClass5Am.m25910B(anonymousClass5Al, this.f60886F, this.f60883C, this.f60884D, this.f60885E, false, this.f60882B);
        anonymousClass5Al.f60850F.setBackgroundColor(AnonymousClass0Ca.C(anonymousClass5Al.f60850F.getContext(), C0164R.color.grey_1));
        anonymousClass5Al.f60850F.setPressed(true);
        anonymousClass5Al.f60850F.setAlpha(1.0f);
        return anonymousClass5Al.f60850F;
    }
}

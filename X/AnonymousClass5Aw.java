package X;

import com.android.internal.util.Predicate;
import com.instagram.reels.friendlist.view.FriendListTabFragment;

/* renamed from: X.5Aw */
public final class AnonymousClass5Aw implements Predicate {
    /* renamed from: B */
    public final /* synthetic */ FriendListTabFragment f60881B;

    public AnonymousClass5Aw(FriendListTabFragment friendListTabFragment) {
        this.f60881B = friendListTabFragment;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        return (this.f60881B.f66445G.m25930B(anonymousClass0Ci) || this.f60881B.f66444F.contains(anonymousClass0Ci)) ? false : true;
    }
}

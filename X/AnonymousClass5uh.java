package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.reels.fragment.FriendListEligibleViewersFragment;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.5uh */
public final class AnonymousClass5uh extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ FriendListEligibleViewersFragment f69957B;

    public AnonymousClass5uh(FriendListEligibleViewersFragment friendListEligibleViewersFragment) {
        this.f69957B = friendListEligibleViewersFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 400110136);
        Toast.makeText(this.f69957B.getActivity(), this.f69957B.getString(C0164R.string.request_error), 1).show();
        AnonymousClass0cQ.H(this, -1344612001, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1055759206);
        this.f69957B.mRecyclerView.setVisibility(0);
        this.f69957B.mLoadingView.setVisibility(8);
        AnonymousClass0cQ.H(this, 523989302, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -293477082);
        AnonymousClass3ax anonymousClass3ax = (AnonymousClass3ax) obj;
        int I2 = AnonymousClass0cQ.I(this, -1536250707);
        Collection collection = anonymousClass3ax.f42570B;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        AnonymousClass0nJ anonymousClass0nJ = this.f69957B.f69962B;
        anonymousClass0nJ.f69958B.clear();
        anonymousClass0nJ.f69958B.addAll(collection);
        anonymousClass0nJ.notifyDataSetChanged();
        this.f69957B.mRecyclerView.setAdapter(this.f69957B.f69962B);
        AnonymousClass0cQ.H(this, -998717229, I2);
        AnonymousClass0cQ.H(this, -317584235, I);
    }
}

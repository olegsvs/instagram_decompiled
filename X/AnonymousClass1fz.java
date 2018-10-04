package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.1fz */
public final class AnonymousClass1fz implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ UserDetailFragment f21289B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1WV f21290C;

    public AnonymousClass1fz(UserDetailFragment userDetailFragment, AnonymousClass1WV anonymousClass1WV) {
        this.f21289B = userDetailFragment;
        this.f21290C = anonymousClass1WV;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.f21289B;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("not_now_");
        stringBuilder.append(this.f21290C.toString().toLowerCase());
        UserDetailFragment.m6682L(userDetailFragment, stringBuilder.toString());
        UserDetailFragment.m6684N(this.f21289B);
    }
}

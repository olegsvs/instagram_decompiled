package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.audience.FavoritesHomeFragment;

/* renamed from: X.31s */
public final class AnonymousClass31s implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass31u f37122B;

    public AnonymousClass31s(AnonymousClass31u anonymousClass31u) {
        this.f37122B = anonymousClass31u;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f37122B.f37124B.f47269B = this.f37122B.f37124B.f47277J.m18247A().m18245A() ^ 1;
        FavoritesHomeFragment.m21660B(this.f37122B.f37124B);
    }
}

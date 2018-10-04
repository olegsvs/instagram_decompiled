package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.audience.FavoritesHomeFragment;

/* renamed from: X.31o */
public final class AnonymousClass31o implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ FavoritesHomeFragment f37117B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass32C f37118C;

    public AnonymousClass31o(FavoritesHomeFragment favoritesHomeFragment, AnonymousClass32C anonymousClass32C) {
        this.f37117B = favoritesHomeFragment;
        this.f37118C = anonymousClass32C;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                dialogInterface.cancel();
                return;
            case -1:
                AnonymousClass0HV.D(this.f37117B.f47279L).y(true);
                FavoritesHomeFragment.m21662D(this.f37117B, this.f37118C);
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}

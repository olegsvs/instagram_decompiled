package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.63V */
public final class AnonymousClass63V implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass63W f71322B;

    public AnonymousClass63V(AnonymousClass63W anonymousClass63W) {
        this.f71322B = anonymousClass63W;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass63U.m28839C(this.f71322B.f71326E[i].equals(this.f71322B.f71324C.getString(C0164R.string.shopping_viewer_add_posts)) ? AnonymousClass1Rz.ADD_POSTS : AnonymousClass1Rz.REMOVE_POSTS, this.f71322B.f71327F, this.f71322B.f71325D, this.f71322B.f71328G, this.f71322B.f71324C, this.f71322B.f71329H.f1759C);
    }
}

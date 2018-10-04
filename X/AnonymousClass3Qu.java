package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.hashtag.ui.HashtagFollowButton;

/* renamed from: X.3Qu */
public final class AnonymousClass3Qu implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ HashtagFollowButton f41184B;

    public AnonymousClass3Qu(HashtagFollowButton hashtagFollowButton) {
        this.f41184B = hashtagFollowButton;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f41184B.setEnabled(true);
    }
}

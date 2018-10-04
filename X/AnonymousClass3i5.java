package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.model.fbfriend.FbFriend;

/* renamed from: X.3i5 */
public final class AnonymousClass3i5 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass421 f43519B;
    /* renamed from: C */
    public final /* synthetic */ FbFriend f43520C;
    /* renamed from: D */
    public final /* synthetic */ int f43521D;

    public AnonymousClass3i5(AnonymousClass421 anonymousClass421, FbFriend fbFriend, int i) {
        this.f43519B = anonymousClass421;
        this.f43520C = fbFriend;
        this.f43521D = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0HV.D(this.f43519B.f48624N).f2646B.edit().putBoolean("preference_fb_friend_tag_dialog_has_been_shown", true).apply();
        AnonymousClass421.m22191B(this.f43519B, this.f43520C, this.f43521D);
    }
}

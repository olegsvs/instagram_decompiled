package X;

import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.activity.TagActivity;

/* renamed from: X.3hb */
public final class AnonymousClass3hb extends AnonymousClass0sJ {
    /* renamed from: B */
    public final /* synthetic */ TagActivity f43458B;

    public AnonymousClass3hb(TagActivity tagActivity) {
        this.f43458B = tagActivity;
    }

    public final void eCA(int i, int i2) {
        TagActivity tagActivity = this.f43458B;
        if (i2 < 0 || i2 >= tagActivity.f48600D.size()) {
            i2 = i;
        }
        tagActivity.f48598B = i2;
        if (((MediaTaggingInfo) this.f43458B.f48600D.get(i)).f43452G == AnonymousClass0ON.PHOTO) {
            ((AnonymousClass3hj) this.f43458B.f48604H.D(i).getTag()).f43474D.jH();
        } else {
            this.f43458B.pCA();
        }
        TagActivity.m22188C(this.f43458B);
    }
}

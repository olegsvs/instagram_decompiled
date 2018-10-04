package X;

import android.os.Bundle;

/* renamed from: X.4Fk */
public final class AnonymousClass4Fk implements AnonymousClass3AD {
    /* renamed from: B */
    private final Bundle f52008B;

    public AnonymousClass4Fk(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PZ anonymousClass0PZ, String str, String str2) {
        Bundle bundle = new Bundle();
        this.f52008B = bundle;
        bundle.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        this.f52008B.putString("CommentThreadFragment.SOURCE_MODULE", anonymousClass0PZ.getModuleName());
        this.f52008B.putBoolean("CommentThreadFragment.IS_ORGANIC", anonymousClass0PZ.isOrganicEligible());
        this.f52008B.putBoolean("CommentThreadFragment.IS_SPONSORED", anonymousClass0PZ.isSponsoredEligible());
        this.f52008B.putString("CommentThreadFragment.MEDIA_ID", str);
        this.f52008B.putString("CommentComposerModalFragment.ENTRY_POINT", str2);
    }

    public final AnonymousClass3AD BUA() {
        this.f52008B.putBoolean("intent_extra_show_inapp_notification_on_post", true);
        return this;
    }

    public final AnonymousClass0IL DD() {
        AnonymousClass0IL anonymousClass5S2 = new AnonymousClass5S2();
        anonymousClass5S2.setArguments(this.f52008B);
        return anonymousClass5S2;
    }

    public final AnonymousClass3AD ERA(AnonymousClass0SK anonymousClass0SK) {
        this.f52008B.putString("intent_extra_replied_to_comment_id", anonymousClass0SK.XP());
        this.f52008B.putString("intent_extra_replied_to_comment_user_id", anonymousClass0SK.pT().getId());
        this.f52008B.putString("intent_extra_replied_to_comment_username", anonymousClass0SK.pT().uT());
        return this;
    }

    public final AnonymousClass3AD kNA(String str) {
        this.f52008B.putString("CommentComposerModalFragment.DRAFT_COMMENT", str);
        return this;
    }

    public final AnonymousClass3AD tPA(String str) {
        this.f52008B.putString("intent_extra_newsfeed_story_pk", str);
        return this;
    }
}

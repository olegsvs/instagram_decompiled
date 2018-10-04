package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;
import com.instagram.creation.fragment.FollowersShareFragment;

/* renamed from: X.4VQ */
public final class AnonymousClass4VQ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ FollowersShareFragment f54738B;

    public AnonymousClass4VQ(FollowersShareFragment followersShareFragment) {
        this.f54738B = followersShareFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass2NY.m15348B().f29710G = "add tag";
        if (AnonymousClass0HV.D(this.f54738B.f64938V).f2646B.getBoolean("seen_story_branded_content_tagging_upsell_tooltip", false)) {
            FollowersShareFragment.F(this.f54738B);
            return;
        }
        AnonymousClass0HV.D(this.f54738B.f64938V).f2646B.edit().putBoolean("seen_feed_branded_content_tagging_upsell_tooltip", true).apply();
        if (this.f54738B.getView() != null && this.f54738B.mAdvancedSettingRow != null) {
            this.f54738B.f64920D.m18285C(this.f54738B.mAdvancedSettingRow.findViewById(C0164R.id.advanced_settings_text_view));
        }
    }
}

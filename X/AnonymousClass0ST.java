package X;

import android.os.Bundle;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.0ST */
public final class AnonymousClass0ST {
    /* renamed from: A */
    public final AnonymousClass0IL m4339A(String str, String str2) {
        AnonymousClass0IL anonymousClass6Eq = new AnonymousClass6Eq();
        Bundle bundle = new Bundle();
        bundle.putString("ReelQuestionResponsesListFragment.REEL_ID", str);
        bundle.putString("ReelQuestionResponsesListFragment.REEL_ITEM_ID", str2);
        anonymousClass6Eq.setArguments(bundle);
        return anonymousClass6Eq;
    }

    /* renamed from: B */
    public final AnonymousClass0IL m4340B() {
        return AnonymousClass0ST.m4338B(AnonymousClass2Fj.f28117C);
    }

    /* renamed from: B */
    public static AnonymousClass0IL m4338B(AnonymousClass2Fj anonymousClass2Fj) {
        AnonymousClass0IL anonymousClass5w7 = new AnonymousClass5w7();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_MODE", anonymousClass2Fj);
        anonymousClass5w7.setArguments(bundle);
        return anonymousClass5w7;
    }

    /* renamed from: C */
    public final AnonymousClass0IL m4341C(Bundle bundle) {
        AnonymousClass0IL reelViewerFragment = new ReelViewerFragment();
        reelViewerFragment.setArguments(bundle);
        return reelViewerFragment;
    }
}

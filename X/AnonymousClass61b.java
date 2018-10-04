package X;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: X.61b */
public final class AnonymousClass61b implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass61c f70996B;

    public AnonymousClass61b(AnonymousClass61c anonymousClass61c) {
        this.f70996B = anonymousClass61c;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioGroup = this.f70996B;
        AnonymousClass0NN.B("data_saver_feature_toggled", radioGroup).F("feature", radioGroup.f70997B.name()).B("network_pref_value", i).R();
        AnonymousClass61h anonymousClass61h = (AnonymousClass61h) radioGroup.getTargetFragment();
        AnonymousClass0cX anonymousClass0cX = radioGroup.f70997B;
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass61h.f71009F);
        switch (anonymousClass0cX.ordinal()) {
            case 0:
                D.f2646B.edit().putInt("data_saver_network_resources_quality", i).apply();
                return;
            case 1:
                D.f2646B.edit().putInt("data_saver_network_feed_autoplay", i).apply();
                return;
            case 2:
                D.f2646B.edit().putInt("data_saver_network_story_autoplay", i).apply();
                return;
            default:
                throw new IllegalArgumentException("Non recognized Data Saver mode");
        }
    }
}

package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0rU */
public final class AnonymousClass0rU {
    /* renamed from: B */
    public static ViewGroup m7959B(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, AnonymousClass0rT anonymousClass0rT, AnonymousClass0rT anonymousClass0rT2) {
        if (anonymousClass0rT != null && anonymousClass0rT.equals(anonymousClass0rT2)) {
            return viewGroup3;
        }
        Integer num;
        ViewGroup viewGroup4 = null;
        switch (AnonymousClass1Wp.f19623B[anonymousClass0rT2.ordinal()]) {
            case 1:
                num = null;
                break;
            case 2:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_one_button_primary);
                break;
            case 3:
                num = Integer.valueOf(C0164R.layout.condensed_generic_v3_megaphone_one_button_primary);
                break;
            case 4:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_one_button_primary_inverse);
                break;
            case 5:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_two_buttons_vertical_with_primary_inverse);
                break;
            case 6:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_two_buttons_vertical_with_secondary);
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_two_buttons_vertical_secondary_with_primary_inverse);
                break;
            case 8:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_two_buttons_horizontal);
                break;
            case 9:
                num = Integer.valueOf(C0164R.layout.generic_v3_megaphone_three_buttons);
                break;
            default:
                throw new IllegalStateException("Unsupported button layout");
        }
        viewGroup2.removeAllViews();
        if (num != null) {
            viewGroup4 = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(num.intValue(), viewGroup, false);
            viewGroup2.addView(viewGroup4);
        }
        return viewGroup4;
    }
}

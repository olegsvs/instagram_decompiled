package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.6Co */
public final class AnonymousClass6Co extends AnonymousClass5go {
    /* renamed from: B */
    private AnonymousClass5go f72961B;

    public AnonymousClass6Co(Context context) {
        try {
            this.f72961B = (AnonymousClass5go) Class.forName("com.instagram.business.instantexperiences.InstantExperiencesLibImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable e) {
            AnonymousClass0Gn.J("InstantExperiencesWrapper", StringFormatUtil.formatStrLocaleSafe("Failed to initialize IXLib"), e);
        }
    }

    public final Intent getInstantExperiencesIntent(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass5go anonymousClass5go = this.f72961B;
        return anonymousClass5go != null ? anonymousClass5go.getInstantExperiencesIntent(context, str, str2, str3, str4, str5, str6) : null;
    }
}

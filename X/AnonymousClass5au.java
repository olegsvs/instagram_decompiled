package X;

import android.app.Activity;
import android.content.Intent;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5au */
public final class AnonymousClass5au {
    /* renamed from: B */
    public final Activity f66759B;
    /* renamed from: C */
    public AnonymousClass6GA f66760C;
    /* renamed from: D */
    public final AnonymousClass0Cm f66761D;

    public AnonymousClass5au(Activity activity, AnonymousClass0Cm anonymousClass0Cm) {
        this.f66759B = activity;
        this.f66761D = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m27750A(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0x5.F(AnonymousClass0x5.C(this.f66761D), anonymousClass0Ci, JsonProperty.USE_DEFAULT_NAME, null, null, null, null, null, null, null);
        Intent intent = new Intent("com.instagram.android.widget.BROADCAST_FOLLOW_STATUS_CHANGED");
        intent.putExtra("com.instagram.android.widget.BROADCAST_FOLLOW_STATUS_CHANGED_USER_ID", anonymousClass0Ci.getId());
        AnonymousClass0dB.C(intent);
    }
}

package X;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.3NR */
public final class AnonymousClass3NR {
    /* renamed from: B */
    public final FragmentActivity f40629B;
    /* renamed from: C */
    public final AnonymousClass0EE f40630C;
    /* renamed from: D */
    public AnonymousClass1V6 f40631D;
    /* renamed from: E */
    public AnonymousClass0mt f40632E;
    /* renamed from: F */
    private CharSequence[] f40633F = null;

    public AnonymousClass3NR(FragmentActivity fragmentActivity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0mt anonymousClass0mt) {
        this.f40629B = fragmentActivity;
        this.f40630C = anonymousClass0EE;
        this.f40632E = anonymousClass0mt;
    }

    /* renamed from: B */
    public static CharSequence[] m19494B(AnonymousClass3NR anonymousClass3NR) {
        if (anonymousClass3NR.f40633F == null) {
            Resources resources = anonymousClass3NR.f40629B.getResources();
            ArrayList arrayList = new ArrayList();
            arrayList.add(resources.getString(C0164R.string.hide_survey));
            arrayList.add(resources.getString(C0164R.string.hide_all_sponsored_poll_survey));
            arrayList.add(resources.getString(C0164R.string.sponsored_label_dialog_title));
            CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
            anonymousClass3NR.f40633F = charSequenceArr;
            arrayList.toArray(charSequenceArr);
        }
        return anonymousClass3NR.f40633F;
    }
}

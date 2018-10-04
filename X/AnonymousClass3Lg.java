package X;

import android.content.res.Resources;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.3Lg */
public final class AnonymousClass3Lg {
    /* renamed from: B */
    public final AnonymousClass0ri f40377B;
    /* renamed from: C */
    private CharSequence[] f40378C = null;

    public AnonymousClass3Lg(AnonymousClass0ri anonymousClass0ri) {
        this.f40377B = anonymousClass0ri;
    }

    /* renamed from: B */
    public static CharSequence[] m19440B(AnonymousClass3Lg anonymousClass3Lg) {
        if (anonymousClass3Lg.f40378C == null) {
            Resources resources = anonymousClass3Lg.f40377B.C().getResources();
            ArrayList arrayList = new ArrayList();
            if (!anonymousClass3Lg.f40377B.D().L(anonymousClass3Lg.f40377B.f11260I).hC()) {
                arrayList.add(resources.getString(C0164R.string.pending_media_retry_now));
            } else if (anonymousClass3Lg.f40377B.f11260I.n()) {
                arrayList.add(resources.getString(C0164R.string.pending_media_retry_now));
                arrayList.add(resources.getString(C0164R.string.pending_media_post_later_instead));
            } else {
                arrayList.add(resources.getString(C0164R.string.pending_media_auto_post_on_connection));
            }
            arrayList.add(resources.getString(C0164R.string.pending_media_discard_post));
            CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
            anonymousClass3Lg.f40378C = charSequenceArr;
            arrayList.toArray(charSequenceArr);
        }
        return anonymousClass3Lg.f40378C;
    }
}

package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.65I */
public final class AnonymousClass65I extends AnonymousClass5Lj {
    /* renamed from: A */
    public final AnonymousClass65O mo6239A(AnonymousClass0Cm anonymousClass0Cm, Context context, AnonymousClass0IU anonymousClass0IU) {
        AnonymousClass65J anonymousClass65J = new AnonymousClass65J(AnonymousClass65U.m28946B(anonymousClass0Cm));
        AnonymousClass65j anonymousClass65j = new AnonymousClass65j(new AnonymousClass6Fn(context, anonymousClass0IU));
        AnonymousClass65h anonymousClass65h = new AnonymousClass65h();
        anonymousClass65h.f71645D = true;
        return new AnonymousClass65O(anonymousClass0Cm, anonymousClass65j, anonymousClass65J, anonymousClass65h.m28960A());
    }

    /* renamed from: B */
    public final AnonymousClass65Q mo6240B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5Lk anonymousClass5Lk, TextView textView, View view, AnonymousClass0IU anonymousClass0IU) {
        String string;
        Resources resources = textView.getResources();
        if (anonymousClass5Lk == AnonymousClass5Lk.QUICK_CAPTURE) {
            string = resources.getString(C0164R.string.interactivity_ama_broadcaster_question_sheet_header_camera);
        } else if (anonymousClass5Lk == AnonymousClass5Lk.LIVE) {
            string = resources.getString(C0164R.string.interactivity_ama_broadcaster_question_sheet_header_live);
        } else {
            throw new RuntimeException("Undefined questions sheet header");
        }
        return new AnonymousClass65Q(new AnonymousClass65s(new AnonymousClass6Fv(textView.getContext(), anonymousClass0IU), textView, view, string), new AnonymousClass65K(AnonymousClass65U.m28946B(anonymousClass0Cm)));
    }
}

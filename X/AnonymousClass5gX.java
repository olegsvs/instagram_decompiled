package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;
import java.util.List;

/* renamed from: X.5gX */
public final class AnonymousClass5gX implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Cf f68106B;
    /* renamed from: C */
    public final /* synthetic */ List f68107C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5h2 f68108D;
    /* renamed from: E */
    public final /* synthetic */ View f68109E;

    public AnonymousClass5gX(AnonymousClass6Cf anonymousClass6Cf, View view, List list, AnonymousClass5h2 anonymousClass5h2) {
        this.f68106B = anonymousClass6Cf;
        this.f68109E = view;
        this.f68107C = list;
        this.f68108D = anonymousClass5h2;
    }

    public final void run() {
        if (this.f68106B.f72936B == null) {
            ViewStub viewStub = (ViewStub) this.f68109E.findViewById(C0164R.id.instant_experiences_autofill_bar);
            this.f68106B.f72936B = (InstantExperiencesAutofillBar) viewStub.inflate();
        }
        this.f68106B.f72936B.m28263A(this.f68107C, new AnonymousClass6Ce(this));
        this.f68106B.f72937C.m28269F(true);
    }
}

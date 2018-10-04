package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.5En */
public final class AnonymousClass5En implements AnonymousClass0VE {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5a0 f61501B;

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public AnonymousClass5En(AnonymousClass5a0 anonymousClass5a0) {
        this.f61501B = anonymousClass5a0;
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        this.f61501B.f66471H = AnonymousClass0IE.G(searchEditText.getTextForSearch());
        AnonymousClass5a0 anonymousClass5a0 = this.f61501B;
        if (!(AnonymousClass5a0.m27653B(anonymousClass5a0, anonymousClass5a0.f66465B) == AnonymousClass5Eq.ALL || charSequence == null || charSequence.length() <= 0)) {
            char charAt = charSequence.charAt(0);
            if (charAt == '@') {
                this.f61501B.f66473J.O(AnonymousClass5Eq.USERS);
            } else if (charAt == '#') {
                this.f61501B.f66473J.O(AnonymousClass5Eq.TAGS);
            }
        }
        AnonymousClass5a0.m27654C(this.f61501B).Iz(this.f61501B.f66471H);
    }
}

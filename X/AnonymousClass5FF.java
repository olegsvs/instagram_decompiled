package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.5FF */
public final class AnonymousClass5FF implements AnonymousClass0VE {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5a2 f61569B;

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public AnonymousClass5FF(AnonymousClass5a2 anonymousClass5a2) {
        this.f61569B = anonymousClass5a2;
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        i = AnonymousClass0IE.G(searchEditText.getTextForSearch());
        if (i != 0 && !i.equals(this.f61569B.f66484C)) {
            charSequence = this.f61569B;
            charSequence.f66484C = i;
            charSequence.f66491J.m26043F();
            charSequence.f66487F = true;
            charSequence.f66488G = true;
            if (charSequence.f66483B.m27684M(charSequence.f66484C)) {
                charSequence.f66483B.m27680I();
                AnonymousClass5a2.m27668C(charSequence, true);
            } else {
                charSequence.f66490I.C(i);
                AnonymousClass5a2.m27669D(charSequence, i, true);
            }
            AnonymousClass5a2.m27670E(charSequence);
        }
    }
}

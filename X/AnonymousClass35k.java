package X;

import android.text.TextUtils;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Locale;

/* renamed from: X.35k */
public final class AnonymousClass35k implements AnonymousClass0VE {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3xB f37749B;

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public AnonymousClass35k(AnonymousClass3xB anonymousClass3xB) {
        this.f37749B = anonymousClass3xB;
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        searchEditText = AnonymousClass0IE.G(charSequence);
        i3 = this.f37749B.f47364C;
        i3.f37384D.clear();
        if (TextUtils.isEmpty(searchEditText)) {
            i3.f37384D.addAll(i3.f37382B);
        } else {
            i2 = searchEditText.toLowerCase(Locale.getDefault());
            for (AnonymousClass2Xv anonymousClass2Xv : i3.f37382B) {
                if (AnonymousClass0IE.Q(anonymousClass2Xv.f31205C, i2) || AnonymousClass0IE.P(anonymousClass2Xv.f31205C, i2, 0)) {
                    i3.f37384D.add(anonymousClass2Xv);
                }
            }
        }
        AnonymousClass33S.m18319B(i3, true);
    }
}

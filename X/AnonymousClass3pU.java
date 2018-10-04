package X;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pU */
public final class AnonymousClass3pU implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3pW f44975B;

    public AnonymousClass3pU(AnonymousClass3pW anonymousClass3pW) {
        this.f44975B = anonymousClass3pW;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1870990145);
        AnonymousClass3pW anonymousClass3pW = this.f44975B;
        List arrayList = new ArrayList();
        arrayList.add("Disable Throttling");
        for (int i = 3000; i >= 300; i -= 300) {
            arrayList.add(Integer.toString(i));
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        new AnonymousClass0Sb(anonymousClass3pW.getContext()).G(charSequenceArr, new AnonymousClass3pV(anonymousClass3pW, charSequenceArr)).I("Set Bandwidth (Kbps)").E(true).F(true).C().show();
        AnonymousClass0cQ.L(this, 2119761527, M);
    }
}

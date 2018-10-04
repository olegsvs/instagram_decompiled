package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5lg */
public final class AnonymousClass5lg implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0iB f68816B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0r0 f68817C;

    public AnonymousClass5lg(AnonymousClass0r0 anonymousClass0r0, AnonymousClass0iB anonymousClass0iB) {
        this.f68817C = anonymousClass0r0;
        this.f68816B = anonymousClass0iB;
    }

    public final void onClick(View view) {
        String str;
        int M = AnonymousClass0cQ.M(this, 901776790);
        AnonymousClass0r0 anonymousClass0r0 = this.f68817C;
        AnonymousClass0iB anonymousClass0iB = this.f68816B;
        AnonymousClass3MM anonymousClass3MM = anonymousClass0r0.f11072E;
        String string = view.getContext().getResources().getString(C0164R.string.hide);
        String str2 = anonymousClass0r0.f11070C;
        String str3 = anonymousClass0r0.f11069B;
        if (anonymousClass3MM != null) {
            str = anonymousClass3MM.f40444C;
        } else {
            str = null;
        }
        List arrayList = new ArrayList();
        if (!(str2 == null || str3 == null)) {
            arrayList.add(str2);
        }
        arrayList.add(string);
        if (str != null) {
            arrayList.add(str);
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
        new AnonymousClass0Sb(view.getContext()).G(charSequenceArr, new AnonymousClass5lh(charSequenceArr, string, anonymousClass0iB, anonymousClass0r0, str2, str3, str, anonymousClass3MM, view)).E(true).F(true).C().show();
        this.f68816B.dk(this.f68817C.YT());
        AnonymousClass0cQ.L(this, -1218863234, M);
    }
}

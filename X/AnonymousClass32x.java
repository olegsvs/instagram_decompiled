package X;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

/* renamed from: X.32x */
public final class AnonymousClass32x implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass338 f37291B;

    public AnonymousClass32x(AnonymousClass338 anonymousClass338) {
        this.f37291B = anonymousClass338;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 272200650);
        AnonymousClass0IL anonymousClass0IL = this.f37291B;
        if (anonymousClass0IL.f37314C == null) {
            Object obj = (VERSION.SDK_INT < 21 || !((Boolean) AnonymousClass0CC.FK.H(anonymousClass0IL.f37319H)).booleanValue()) ? null : 1;
            AnonymousClass334[] values = AnonymousClass334.values();
            for (AnonymousClass334 anonymousClass334 : values) {
                if (anonymousClass334 != AnonymousClass334.TAKE_SCREENRECORDING || obj != null) {
                    anonymousClass0IL.f37315D.add(anonymousClass0IL.getString(anonymousClass334.m18293A()));
                }
            }
            AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(anonymousClass0IL.getContext());
            List list = anonymousClass0IL.f37315D;
            anonymousClass0IL.f37314C = anonymousClass0Sb.G((CharSequence[]) list.toArray(new CharSequence[list.size()]), new AnonymousClass335(anonymousClass0IL)).E(true).F(true);
        }
        anonymousClass0IL.f37314C.C().show();
        AnonymousClass0cQ.L(this, -6169715, M);
    }
}

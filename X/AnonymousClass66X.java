package X;

import com.facebook.C0164R;

/* renamed from: X.66X */
public final class AnonymousClass66X {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6G3 f71828B;

    public AnonymousClass66X(AnonymousClass6G3 anonymousClass6G3) {
        this.f71828B = anonymousClass6G3;
    }

    /* renamed from: A */
    public final void m29021A(AnonymousClass3ob anonymousClass3ob) {
        int i = 0;
        AnonymousClass0LH.H(this.f71828B.f73548G != null);
        String[] strArr = (String[]) this.f71828B.f73543B.toArray(new String[0]);
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            this.f71828B.f73543B.remove(str);
            AnonymousClass6G3.m29669B(this.f71828B, str, AnonymousClass5Mw.CANCEL_INVITE, new AnonymousClass66W(this, anonymousClass3ob, str));
            i++;
        }
    }

    /* renamed from: B */
    public final void m29022B() {
        AnonymousClass0LH.H(this.f71828B.f73548G != null);
        for (AnonymousClass64k anonymousClass64k : this.f71828B.m29677I()) {
            AnonymousClass5NB anonymousClass5NB = this.f71828B.f73548G;
            String uT = ((AnonymousClass0Ci) AnonymousClass0LH.E(this.f71828B.f73550I.B(anonymousClass64k.f71536B))).uT();
            String str = anonymousClass64k.f71536B;
            AnonymousClass66X anonymousClass66X = this.f71828B.f73544C;
            CharSequence string = anonymousClass5NB.f62703B.getString(C0164R.string.live_broadcast_remove_guest_confirm, new Object[]{uT});
            String string2 = anonymousClass5NB.f62703B.getString(C0164R.string.cancel);
            CharSequence[] charSequenceArr = new CharSequence[]{string, string2};
            new AnonymousClass0Sb(anonymousClass5NB.f62703B).G(charSequenceArr, new AnonymousClass5N9(anonymousClass5NB, charSequenceArr, string, anonymousClass66X, str)).E(true).F(true).C().show();
        }
    }
}

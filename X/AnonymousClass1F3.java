package X;

import android.content.Intent;

/* renamed from: X.1F3 */
public final class AnonymousClass1F3 extends AnonymousClass1Eq {
    /* renamed from: B */
    private /* synthetic */ Intent f15962B;
    /* renamed from: C */
    private /* synthetic */ int f15963C;
    /* renamed from: D */
    private /* synthetic */ AnonymousClass1F2 f15964D;

    public AnonymousClass1F3(Intent intent, AnonymousClass1F2 anonymousClass1F2, int i) {
        this.f15962B = intent;
        this.f15964D = anonymousClass1F2;
        this.f15963C = i;
    }

    /* renamed from: A */
    public final void mo2260A() {
        Intent intent = this.f15962B;
        if (intent != null) {
            this.f15964D.startActivityForResult(intent, this.f15963C);
        }
    }
}

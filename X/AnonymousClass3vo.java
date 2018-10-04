package X;

import android.util.Log;

/* renamed from: X.3vo */
public final class AnonymousClass3vo implements AnonymousClass2ww {
    /* renamed from: B */
    public final AnonymousClass3vl[] f47027B;
    /* renamed from: C */
    private final int[] f47028C;

    public AnonymousClass3vo(int[] iArr, AnonymousClass3vl[] anonymousClass3vlArr) {
        this.f47028C = iArr;
        this.f47027B = anonymousClass3vlArr;
    }

    /* renamed from: A */
    public final void m21554A(long j) {
        for (AnonymousClass3vl anonymousClass3vl : this.f47027B) {
            if (!(anonymousClass3vl == null || anonymousClass3vl.f47008H == j)) {
                anonymousClass3vl.f47008H = j;
                anonymousClass3vl.f47006F = true;
            }
        }
    }

    public final AnonymousClass2vT fVA(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f47028C;
            if (i3 >= iArr.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unmatched track of type: ");
                stringBuilder.append(i2);
                Log.e("BaseMediaChunkOutput", stringBuilder.toString());
                return new AnonymousClass3vH();
            } else if (i2 == iArr[i3]) {
                return this.f47027B[i3];
            } else {
                i3++;
            }
        }
    }
}

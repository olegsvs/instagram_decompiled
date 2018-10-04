package X;

/* renamed from: X.0o6 */
public final class AnonymousClass0o6 {
    /* renamed from: D */
    public static AnonymousClass0o6 f10223D;
    /* renamed from: B */
    public final AnonymousClass0o3[] f10224B;
    /* renamed from: C */
    public final int f10225C;

    public AnonymousClass0o6(AnonymousClass0o3[] anonymousClass0o3Arr) {
        this.f10224B = anonymousClass0o3Arr;
        this.f10225C = anonymousClass0o3Arr.length;
    }

    /* renamed from: A */
    public final int m7681A(AnonymousClass0o3 anonymousClass0o3, AnonymousClass0o3 anonymousClass0o32, AnonymousClass0o3 anonymousClass0o33) {
        int B = AnonymousClass0o6.m7680B(anonymousClass0o32, this.f10224B);
        int B2 = AnonymousClass0o6.m7680B(anonymousClass0o33, this.f10224B);
        int B3 = AnonymousClass0o6.m7680B(anonymousClass0o3, this.f10224B);
        B = B3 < B ? B - B3 : B + (this.f10225C - B3);
        B2 = B3 < B2 ? B2 - B3 : B2 + (this.f10225C - B3);
        if (B == B2) {
            return 0;
        }
        return B > B2 ? 1 : -1;
    }

    /* renamed from: B */
    private static int m7680B(AnonymousClass0o3 anonymousClass0o3, AnonymousClass0o3[] anonymousClass0o3Arr) {
        for (int i = 0; i < anonymousClass0o3Arr.length; i++) {
            if (anonymousClass0o3Arr[i] == anonymousClass0o3) {
                return i;
            }
        }
        return -1;
    }
}

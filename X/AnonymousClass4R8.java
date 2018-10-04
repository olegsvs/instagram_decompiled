package X;

import android.graphics.Bitmap;

/* renamed from: X.4R8 */
public final class AnonymousClass4R8 extends AnonymousClass17n {
    /* renamed from: B */
    public final AnonymousClass4R0 f54036B;
    /* renamed from: C */
    public final Bitmap f54037C;
    /* renamed from: D */
    public final String f54038D;
    /* renamed from: E */
    public final AnonymousClass0OA f54039E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass5Tf f54040F;

    public AnonymousClass4R8(AnonymousClass5Tf anonymousClass5Tf, String str, AnonymousClass0OA anonymousClass0OA, AnonymousClass4R0 anonymousClass4R0, Bitmap bitmap) {
        this.f54040F = anonymousClass5Tf;
        this.f54038D = str;
        this.f54039E = anonymousClass0OA;
        this.f54036B = anonymousClass4R0;
        this.f54037C = bitmap;
        this.f54039E.EA(true);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m24211B(Object obj) {
        String str = (String) obj;
        AnonymousClass5Tf anonymousClass5Tf = this.f54040F;
        Bitmap bitmap = this.f54037C;
        if (anonymousClass5Tf.f64572S) {
            anonymousClass5Tf.f64568O.offer(bitmap);
        } else {
            bitmap.recycle();
        }
        this.f54039E.f3819g = str;
        this.f54039E.EA(false);
        if (this.f54040F.f64564K.containsKey(this.f54038D)) {
            AnonymousClass0OA A = ((AnonymousClass4R2) this.f54040F.f64564K.get(this.f54038D)).m24205A();
            AnonymousClass4R0 anonymousClass4R0 = ((AnonymousClass4R2) this.f54040F.f64564K.get(this.f54038D)).f54018B;
            if (A != this.f54039E && AnonymousClass5Tf.G(this.f54036B, anonymousClass4R0)) {
                A.f3819g = str;
                A.EA(false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return AnonymousClass3G5.m19166C(this.f54040F.f64556C, this.f54037C, false).getAbsolutePath();
    }
}

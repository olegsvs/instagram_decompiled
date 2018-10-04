package X;

import java.util.Map;

/* renamed from: X.1U1 */
public final class AnonymousClass1U1 implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0dt f19018B;

    public AnonymousClass1U1(AnonymousClass0dt anonymousClass0dt) {
        this.f19018B = anonymousClass0dt;
    }

    public final void Zt(Map map) {
        if (((AnonymousClass1Bb) map.get("android.permission.WRITE_EXTERNAL_STORAGE")) == AnonymousClass1Bb.GRANTED) {
            AnonymousClass0dt.m6133B(this.f19018B);
        } else {
            AnonymousClass0Dc.m1239B(AnonymousClass0dt.f7538C, "Must grant permission to store txt file");
        }
    }
}

package X;

import java.util.Map;

/* renamed from: X.3g4 */
public final class AnonymousClass3g4 implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3g5 f43241B;
    /* renamed from: C */
    public final /* synthetic */ String f43242C;

    public AnonymousClass3g4(AnonymousClass3g5 anonymousClass3g5, String str) {
        this.f43241B = anonymousClass3g5;
        this.f43242C = str;
    }

    public final void Zt(Map map) {
        if (((AnonymousClass1Bb) map.get("android.permission.READ_EXTERNAL_STORAGE")) == AnonymousClass1Bb.GRANTED) {
            AnonymousClass3g5.m20397B(this.f43241B, this.f43242C);
        } else {
            this.f43241B.f43243B.onActivityResult(AnonymousClass3g9.f43249H, 0, null);
        }
    }
}

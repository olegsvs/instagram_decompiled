package X;

import android.content.SharedPreferences.Editor;

/* renamed from: X.5TS */
public final class AnonymousClass5TS implements AnonymousClass4TZ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5TU f64435B;

    public AnonymousClass5TS(AnonymousClass5TU anonymousClass5TU) {
        this.f64435B = anonymousClass5TU;
    }

    public final boolean lf() {
        this.f64435B.f64441F = true;
        AnonymousClass5TU anonymousClass5TU = this.f64435B;
        anonymousClass5TU.f64443H = (anonymousClass5TU.f64443H + 1) % this.f64435B.f64444I.f28940K.length;
        AnonymousClass0HV anonymousClass0HV = this.f64435B.f64446K;
        String str = this.f64435B.f64444I.f28931B;
        int i = this.f64435B.f64443H;
        Editor edit = anonymousClass0HV.f2646B.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("text_to_camera_gradient_background_index_");
        stringBuilder.append(str);
        edit.putInt(stringBuilder.toString(), i).apply();
        AnonymousClass5TU.m26876B(this.f64435B);
        AnonymousClass5TU.m26877C(this.f64435B);
        return true;
    }
}

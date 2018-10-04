package X;

import android.app.Activity;
import com.facebook.C0164R;
import java.util.Map;

/* renamed from: X.4I7 */
public final class AnonymousClass4I7 implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SU f52437B;
    /* renamed from: C */
    public final /* synthetic */ Activity f52438C;
    /* renamed from: D */
    public final /* synthetic */ boolean f52439D;
    /* renamed from: E */
    public final /* synthetic */ boolean f52440E;

    public AnonymousClass4I7(AnonymousClass5SU anonymousClass5SU, boolean z, Activity activity, boolean z2) {
        this.f52437B = anonymousClass5SU;
        this.f52440E = z;
        this.f52438C = activity;
        this.f52439D = z2;
    }

    public final void Zt(Map map) {
        AnonymousClass1Bb anonymousClass1Bb = (AnonymousClass1Bb) map.get("android.permission.CAMERA");
        AnonymousClass1Bb anonymousClass1Bb2 = (AnonymousClass1Bb) map.get("android.permission.RECORD_AUDIO");
        AnonymousClass1Bb anonymousClass1Bb3 = AnonymousClass1Bb.GRANTED;
        if (anonymousClass1Bb == anonymousClass1Bb3 && anonymousClass1Bb2 == anonymousClass1Bb3) {
            this.f52437B.H();
            return;
        }
        AnonymousClass1Bb anonymousClass1Bb4 = AnonymousClass1Bb.DENIED_DONT_ASK_AGAIN;
        if (anonymousClass1Bb == anonymousClass1Bb4 && !this.f52440E) {
            AnonymousClass1Ba.G(this.f52438C, C0164R.string.camera_permission_name);
        } else if (anonymousClass1Bb2 == anonymousClass1Bb4 && !this.f52439D) {
            AnonymousClass1Ba.G(this.f52438C, C0164R.string.microphone_permission_name);
        }
    }
}

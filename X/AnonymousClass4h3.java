package X;

import com.facebook.C0164R;
import com.instagram.direct.notifications.DirectNotificationActionService;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.4h3 */
public final class AnonymousClass4h3 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ DirectNotificationActionService f56350B;
    /* renamed from: C */
    public final /* synthetic */ CharSequence f56351C;
    /* renamed from: D */
    public final /* synthetic */ DirectThreadKey f56352D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f56353E;

    public AnonymousClass4h3(DirectNotificationActionService directNotificationActionService, AnonymousClass0Cm anonymousClass0Cm, DirectThreadKey directThreadKey, CharSequence charSequence) {
        this.f56350B = directNotificationActionService;
        this.f56353E = anonymousClass0Cm;
        this.f56352D = directThreadKey;
        this.f56351C = charSequence;
    }

    public final void run() {
        AnonymousClass0Uu.B(this.f56353E).F(this.f56352D, this.f56351C.toString());
        DirectNotificationActionService.m24797B(this.f56350B, this.f56353E, this.f56352D);
        DirectNotificationActionService.m24799D(this.f56350B, C0164R.string.sending);
    }
}

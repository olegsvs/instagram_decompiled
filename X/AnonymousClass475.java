package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.475 */
public final class AnonymousClass475 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rh f50392B;
    /* renamed from: C */
    public final /* synthetic */ Throwable f50393C;
    /* renamed from: D */
    public final /* synthetic */ boolean f50394D;

    public AnonymousClass475(AnonymousClass5Rh anonymousClass5Rh, boolean z, Throwable th) {
        this.f50392B = anonymousClass5Rh;
        this.f50394D = z;
        this.f50393C = th;
    }

    public final void run() {
        if (this.f50392B.f63439U == null) {
            return;
        }
        if (this.f50394D) {
            AnonymousClass68k anonymousClass68k = this.f50392B.f63439U;
            AnonymousClass47L anonymousClass47L = this.f50392B.f63442X;
            if (!((Boolean) AnonymousClass0CC.IR.G()).booleanValue()) {
                AnonymousClass0OR.F(anonymousClass68k.f72181B, anonymousClass68k.f72183D, anonymousClass47L.f50459j.longValue() * 1000, 309562983);
            }
            return;
        }
        AnonymousClass68k anonymousClass68k2 = this.f50392B.f63439U;
        Throwable th = this.f50393C;
        String str = "LiveStreamerInitPrefetchingListener";
        String str2 = "onVideoInitDataDownloadFailed";
        Object[] objArr = new Object[1];
        objArr[0] = th != null ? th : JsonProperty.USE_DEFAULT_NAME;
        AnonymousClass0Dc.H(str, str2, objArr);
        anonymousClass68k2.f72182C.m18797A(new AnonymousClass5Nj(BroadcastFailureType.f62828D, "VideoInitDataDownload", th != null ? th.toString() : JsonProperty.USE_DEFAULT_NAME));
    }
}

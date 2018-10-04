package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.4tW */
public final class AnonymousClass4tW extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Y5 f58257B;

    public AnonymousClass4tW(AnonymousClass5Y5 anonymousClass5Y5) {
        this.f58257B = anonymousClass5Y5;
    }

    /* renamed from: A */
    public final void m25305A(Exception exception) {
        AnonymousClass5Y5 anonymousClass5Y5 = this.f58257B;
        DLogTag dLogTag = DLogTag.RTC;
        DLog.e(dLogTag, "onJoinResultFail", new Object[0]);
        AnonymousClass0Sy.C();
        DLog.d(dLogTag, "renegotiate - failed", new Object[0]);
        anonymousClass5Y5.m27425E(exception);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25306B(Object obj) {
        AnonymousClass4uA anonymousClass4uA = (AnonymousClass4uA) obj;
        AnonymousClass5Y5 anonymousClass5Y5 = this.f58257B;
        DLogTag dLogTag = DLogTag.RTC;
        DLog.d(dLogTag, "onJoinResultSuccess", new Object[0]);
        AnonymousClass0Sy.C();
        DLog.d(dLogTag, "renegotiate - done", new Object[0]);
        if (anonymousClass5Y5.f66005C != null) {
            DLog.d(dLogTag, "setAnswerSDP", new Object[0]);
            AnonymousClass5jH anonymousClass5jH = anonymousClass5Y5.f66005C;
            AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5ix(anonymousClass5jH, anonymousClass4uA.f58336B, anonymousClass4uA.f58337C));
        }
    }
}

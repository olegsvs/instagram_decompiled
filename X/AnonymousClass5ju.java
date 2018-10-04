package X;

import android.support.v4.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import java.util.Set;

/* renamed from: X.5ju */
public final class AnonymousClass5ju implements AnonymousClass3Td {
    /* renamed from: B */
    public final /* synthetic */ SmartLockPluginImpl f68640B;
    /* renamed from: C */
    public final /* synthetic */ FragmentActivity f68641C;

    public AnonymousClass5ju(SmartLockPluginImpl smartLockPluginImpl, FragmentActivity fragmentActivity) {
        this.f68640B = smartLockPluginImpl;
        this.f68641C = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void Nh(Object obj) {
        AnonymousClass5jt anonymousClass5jt = (AnonymousClass5jt) obj;
        this.f68640B.f68643C.put(this.f68641C, anonymousClass5jt);
        Set<AnonymousClass3Td> set = (Set) this.f68640B.f68642B.remove(this.f68641C);
        if (set != null) {
            for (AnonymousClass3Td Nh : set) {
                Nh.Nh(anonymousClass5jt);
            }
        }
    }
}

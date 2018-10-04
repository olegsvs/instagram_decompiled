package X;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.C0063D;
import com.google.android.play.core.splitinstall.p002a.C0054a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2Tc */
public final class AnonymousClass2Tc extends AnonymousClass21P {
    /* renamed from: B */
    private final /* synthetic */ Collection f30809B;
    /* renamed from: C */
    private final /* synthetic */ AnonymousClass21y f30810C;
    /* renamed from: D */
    private final /* synthetic */ AnonymousClass21n f30811D;

    public AnonymousClass2Tc(AnonymousClass21n anonymousClass21n, AnonymousClass21y anonymousClass21y, Collection collection, AnonymousClass21y anonymousClass21y2) {
        this.f30811D = anonymousClass21n;
        this.f30809B = collection;
        this.f30810C = anonymousClass21y2;
        super(anonymousClass21y);
    }

    /* renamed from: A */
    public final void mo3140A() {
        try {
            C0054a c0054a = (C0054a) this.f30811D.f25335B.f25306K;
            String str = this.f30811D.f25337D;
            Collection<String> collection = this.f30809B;
            List arrayList = new ArrayList(collection.size());
            for (String str2 : collection) {
                Bundle bundle = new Bundle();
                bundle.putString("module_name", str2);
                arrayList.add(bundle);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("playcore_version_code", 10301);
            c0054a.OB(str, arrayList, bundle2, new C0063D(this.f30811D, this.f30810C));
        } catch (Throwable e) {
            AnonymousClass21n.f25333F.m14199B(e, "startInstall(%s)", this.f30809B);
            this.f30810C.m14215A(new RuntimeException(e));
        }
    }
}

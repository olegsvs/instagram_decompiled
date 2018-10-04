package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3sc */
public final class AnonymousClass3sc implements AnonymousClass2mQ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2mD f45864B;

    public AnonymousClass3sc(AnonymousClass2mD anonymousClass2mD) {
        this.f45864B = anonymousClass2mD;
    }

    public final void Pl(int i) {
        AnonymousClass2mD anonymousClass2mD = this.f45864B;
        if (anonymousClass2mD.f33792D != null && ((anonymousClass2mD.f33790B && i <= 0) || (!anonymousClass2mD.f33790B && i > 0))) {
            Map hashMap = new HashMap();
            hashMap.put("filter_event", "face_detected_changed");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("face_detected:");
            stringBuilder.append(Boolean.toString(anonymousClass2mD.f33790B));
            hashMap.put("extras", stringBuilder.toString());
            anonymousClass2mD.f33792D.La(hashMap);
        }
        anonymousClass2mD.f33790B = i > 0;
    }
}

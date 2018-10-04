package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.58q */
public final class AnonymousClass58q extends AnonymousClass1QX {
    public AnonymousClass58q(Context context, AnonymousClass0Og anonymousClass0Og) {
        Context applicationContext = context.getApplicationContext();
        AnonymousClass1QW anonymousClass1QW = new AnonymousClass1QW(anonymousClass0Og);
        Collection arrayList = new ArrayList();
        arrayList.add(anonymousClass1QW.A(AnonymousClass58t.CHECK_FOR_PHONE));
        Object obj = (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.lb)).booleanValue() || !"nux_start".equals(AnonymousClass0E6.B(AnonymousClass0CC.zV))) ? null : 1;
        if (obj != null) {
            arrayList.add(anonymousClass1QW.A(AnonymousClass58t.CHECK_FOR_EMAIL));
        }
        arrayList.add(anonymousClass1QW.A(AnonymousClass58t.FB_CONNECT));
        arrayList.add(anonymousClass1QW.A(AnonymousClass58t.FB_FOLLOW));
        if (((Boolean) AnonymousClass0CC.oK.G()).booleanValue()) {
            arrayList.add(anonymousClass1QW.A(AnonymousClass58t.FB_INVITE));
        }
        AnonymousClass58o[] anonymousClass58oArr = new AnonymousClass58o[]{anonymousClass1QW.A(AnonymousClass58t.CONTACT_INVITE), new AnonymousClass5Zq(AnonymousClass58t.CONTACT_INVITE, anonymousClass0Og, applicationContext)};
        arrayList.add(new AnonymousClass1SO(anonymousClass58oArr[0].f60518B, anonymousClass58oArr));
        arrayList.add(anonymousClass1QW.A(AnonymousClass58t.CONTACT_INVITE_WITHOUT_ALLOW_CONTACT_SYNC));
        obj = (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.lb)).booleanValue() || !"after_contact".equals(AnonymousClass0E6.B(AnonymousClass0CC.zV))) ? null : 1;
        if (obj != null) {
            arrayList.add(anonymousClass1QW.A(AnonymousClass58t.CHECK_FOR_EMAIL));
        }
        arrayList.add(anonymousClass1QW.A(AnonymousClass58t.TAKE_PROFILE_PHOTO));
        AnonymousClass58o A = anonymousClass1QW.A(AnonymousClass58t.ADD_PHONE);
        arrayList.add(A);
        AnonymousClass58t anonymousClass58t = AnonymousClass58t.TURN_ON_ONETAP;
        arrayList.add(new AnonymousClass5Zr(anonymousClass58t, A, anonymousClass1QW.A(anonymousClass58t)));
        if (!((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.lb)).booleanValue()) {
            arrayList.add(anonymousClass1QW.A(AnonymousClass58t.FIND_FRIENDS));
            arrayList.add(anonymousClass1QW.A(AnonymousClass58t.ADD_EMAIL));
        }
        arrayList.add(anonymousClass1QW.A(AnonymousClass58t.EXPLORE_PEOPLE));
        super(arrayList);
    }
}

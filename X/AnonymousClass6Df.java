package X;

import android.content.Intent;
import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Df */
public final class AnonymousClass6Df extends AnonymousClass5jk {
    /* renamed from: B */
    private final AnonymousClass3Td f73064B;
    /* renamed from: C */
    private final AnonymousClass2Na f73065C;

    public AnonymousClass6Df(AnonymousClass3Td anonymousClass3Td, AnonymousClass2Na anonymousClass2Na) {
        super(1);
        this.f73064B = anonymousClass3Td;
        this.f73065C = anonymousClass2Na;
    }

    /* renamed from: A */
    public final void mo6447A(int i, Intent intent) {
        Object obj;
        String str = null;
        if (i != -1 || intent == null) {
            AnonymousClass5jt.m28375C(this.f73065C, null, false, false);
            obj = null;
        } else {
            String str2;
            Credential credential = (Credential) intent.getExtras().getParcelable("com.google.android.gms.credentials.Credential");
            String str3 = credential.f67883C;
            if (Patterns.EMAIL_ADDRESS.matcher(str3).matches()) {
                str2 = null;
            } else if (Patterns.PHONE.matcher(str3).matches()) {
                str2 = str3;
                str3 = null;
            } else {
                str3 = null;
                str2 = null;
            }
            List<IdToken> list = credential.f67885E;
            List arrayList = new ArrayList();
            for (IdToken idToken : list) {
                arrayList.add(idToken.f67931C);
            }
            String str4 = credential.f67882B;
            if (credential.f67884D != null) {
                str = credential.f67884D.toString();
            }
            obj = new AnonymousClass3Te(str3, str2, str4, str, credential.f67887G, arrayList);
            AnonymousClass5jt.m28375C(this.f73065C, credential.f67883C, false, false);
        }
        this.f73064B.Nh(obj);
    }
}

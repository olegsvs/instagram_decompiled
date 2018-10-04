package X;

import android.content.Intent;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1ve */
public final class AnonymousClass1ve {
    /* renamed from: B */
    public static void m13791B(int i, Intent intent, AnonymousClass1oi anonymousClass1oi) {
        LoginClient$Request loginClient$Request = AnonymousClass1vi.m13798C().f24274B;
        if (loginClient$Request == null) {
            anonymousClass1oi.onCancel();
            return;
        }
        AccessToken accessToken;
        boolean z = false;
        String str = null;
        if (intent != null) {
            LoginClient$Result loginClient$Result = (LoginClient$Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (loginClient$Result != null) {
                if (i == -1) {
                    if (loginClient$Result.f24268B == AnonymousClass1vh.SUCCESS) {
                        accessToken = loginClient$Result.f24272F;
                    } else {
                        accessToken = null;
                        str = loginClient$Result.f24270D;
                    }
                    if (str == null && accessToken == null && !z) {
                        str = "Unexpected call to LoginManager.onActivityResult";
                    }
                    AnonymousClass1ve.m13792C(loginClient$Request, accessToken, str, z, anonymousClass1oi);
                }
            }
            accessToken = null;
            str = "Unexpected call to LoginManager.onActivityResult";
            AnonymousClass1ve.m13792C(loginClient$Request, accessToken, str, z, anonymousClass1oi);
        }
        if (i == 0) {
            accessToken = null;
            z = true;
            str = "Unexpected call to LoginManager.onActivityResult";
            AnonymousClass1ve.m13792C(loginClient$Request, accessToken, str, z, anonymousClass1oi);
        }
        accessToken = null;
        str = "Unexpected call to LoginManager.onActivityResult";
        AnonymousClass1ve.m13792C(loginClient$Request, accessToken, str, z, anonymousClass1oi);
    }

    /* renamed from: C */
    private static void m13792C(LoginClient$Request loginClient$Request, AccessToken accessToken, String str, boolean z, AnonymousClass1oi anonymousClass1oi) {
        AnonymousClass1vk anonymousClass1vk;
        if (accessToken != null) {
            Collection collection = loginClient$Request.f24262E;
            Object hashSet = new HashSet(accessToken.f2843F);
            if (loginClient$Request.f24261D) {
                hashSet.retainAll(collection);
            }
            Set hashSet2 = new HashSet(collection);
            hashSet2.removeAll(hashSet);
            anonymousClass1vk = new AnonymousClass1vk(accessToken, hashSet, hashSet2);
        } else {
            anonymousClass1vk = null;
        }
        if (!(z || anonymousClass1vk == null)) {
            z = anonymousClass1vk.f24276C.isEmpty() ^ 1;
        }
        if (z) {
            anonymousClass1oi.onCancel();
            return;
        }
        if (str == null) {
            if (anonymousClass1vk != null) {
                anonymousClass1oi.uBA(anonymousClass1vk);
            }
        }
        anonymousClass1oi.pk(str);
    }
}

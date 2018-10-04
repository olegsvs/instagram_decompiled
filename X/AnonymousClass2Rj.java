package X;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Rj */
public final class AnonymousClass2Rj {
    /* renamed from: B */
    public final AnonymousClass0IL f30496B;
    /* renamed from: C */
    public int f30497C;
    /* renamed from: D */
    public AnonymousClass2Rk f30498D;
    /* renamed from: E */
    public LoginClient$Request f30499E;
    /* renamed from: F */
    public String f30500F;
    /* renamed from: G */
    private AnonymousClass1vj[] f30501G = new AnonymousClass1vj[]{new AnonymousClass2Ri(this), new AnonymousClass2Ro(this, this.f30500F)};

    public AnonymousClass2Rj(AnonymousClass0IL anonymousClass0IL, LoginClient$Request loginClient$Request, int i) {
        this.f30496B = anonymousClass0IL;
        this.f30500F = loginClient$Request.f24263F;
        this.f30498D = (AnonymousClass2Rk) anonymousClass0IL;
        this.f30499E = loginClient$Request;
        this.f30497C = i;
    }

    /* renamed from: A */
    public final void m15754A(LoginClient$Result loginClient$Result) {
        this.f30499E = null;
        AnonymousClass0IL anonymousClass0IL = this.f30498D;
        if (anonymousClass0IL != null) {
            if (loginClient$Result.f24268B == AnonymousClass1vh.SUCCESS) {
                AccessToken accessToken = loginClient$Result.f24272F;
                if (accessToken != null) {
                    AnonymousClass0Iq.B(anonymousClass0IL.f30502B).C(accessToken);
                }
            }
            int i = loginClient$Result.f24268B == AnonymousClass1vh.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", loginClient$Result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            anonymousClass0IL.getActivity().setResult(i, intent);
            anonymousClass0IL.getActivity().finish();
        }
    }

    /* renamed from: B */
    public final FragmentActivity m15755B() {
        return this.f30496B.getActivity();
    }

    /* renamed from: B */
    public static AccessToken m15750B(Collection collection, Bundle bundle, AnonymousClass19W anonymousClass19W, String str) {
        Collection collection2 = collection;
        collection = AccessToken.C(bundle, new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!AnonymousClass19Y.E(string2)) {
            collection2 = new ArrayList(Arrays.asList(string2.split(",")));
        }
        String string3 = bundle.getString("denied_scopes");
        Collection arrayList = !AnonymousClass19Y.E(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        if (AnonymousClass19Y.E(string)) {
            return null;
        }
        return new AccessToken(string, str, AnonymousClass2Rj.m15753E(bundle.getString("signed_request")), collection2, arrayList, anonymousClass19W, collection, new Date());
    }

    /* renamed from: C */
    public static AnonymousClass1vj m15751C(AnonymousClass2Rj anonymousClass2Rj) {
        int i = anonymousClass2Rj.f30497C;
        AnonymousClass1vj[] anonymousClass1vjArr = anonymousClass2Rj.f30501G;
        return i < anonymousClass1vjArr.length ? anonymousClass1vjArr[i] : null;
    }

    /* renamed from: C */
    public final void m15756C(LoginClient$Result loginClient$Result) {
        if (loginClient$Result.f24272F == null || AnonymousClass0Iq.B(this.f30500F).B() == null) {
            m15754A(loginClient$Result);
        } else if (loginClient$Result.f24272F != null) {
            LoginClient$Result E;
            AccessToken B = AnonymousClass0Iq.B(this.f30500F).B();
            AccessToken accessToken = loginClient$Result.f24272F;
            if (!(B == null || accessToken == null)) {
                try {
                    if (B.f2846I.equals(accessToken.f2846I)) {
                        E = LoginClient$Result.m13796E(this.f30499E, loginClient$Result.f24272F);
                        m15754A(E);
                    }
                } catch (Exception e) {
                    m15754A(LoginClient$Result.m13794C(this.f30499E, "Caught exception", e.getMessage()));
                }
            }
            E = LoginClient$Result.m13794C(this.f30499E, "User logged in as different Facebook user.", null);
            m15754A(E);
        } else {
            throw new AnonymousClass1ol("Can't validate without a token");
        }
    }

    /* renamed from: D */
    public static String m15752D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException e) {
            AnonymousClass1v1.m13712B("LoginClient", e.toString());
        }
        return jSONObject.toString();
    }

    /* renamed from: D */
    public final void m15757D() {
        this.f30497C++;
        AnonymousClass1vj C = AnonymousClass2Rj.m15751C(this);
        if (C != null) {
            C.jVA(this.f30499E);
        } else {
            m15754A(LoginClient$Result.m13794C(this.f30499E, "Login attempt failed.", null));
        }
    }

    /* renamed from: E */
    private static String m15753E(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    String[] split = str.split("\\.");
                    if (split.length == 2) {
                        return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString(MemoryDumpUploadJob.EXTRA_USER_ID);
                    }
                } catch (Exception e) {
                    AnonymousClass1v1.m13712B("LoginClient", e.toString());
                }
            }
        }
        return null;
    }
}

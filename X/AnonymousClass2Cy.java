package X;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Cy */
public final class AnonymousClass2Cy implements AnonymousClass0EE {
    /* renamed from: B */
    public boolean f27503B;
    /* renamed from: C */
    private final AnonymousClass0NN f27504C = AnonymousClass0NN.B("si_native_webview_redirect", this);
    /* renamed from: D */
    private boolean f27505D;
    /* renamed from: E */
    private final List f27506E;

    public AnonymousClass2Cy(java.lang.String r5, X.AnonymousClass0hf r6, java.lang.String r7, java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r4.<init>();
        r0 = "si_native_webview_redirect";
        r0 = X.AnonymousClass0NN.B(r0, r4);
        r4.f27504C = r0;
        r0 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x0010 }
        java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0010 }
    L_0x0010:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4.f27506E = r0;
        r0 = 0;
        r4.f27505D = r0;
        r4.f27503B = r0;
        r1 = r4.f27504C;
        r0 = "original_url";
        r1.F(r0, r5);
        r2 = r4.f27504C;
        r1 = "ig_url_source";
        r0 = r6.toString();
        r2.F(r1, r0);
        if (r7 == 0) goto L_0x0037;
    L_0x0030:
        r1 = r4.f27504C;
        r0 = "m_pk";
        r1.F(r0, r7);
    L_0x0037:
        if (r8 == 0) goto L_0x0040;
    L_0x0039:
        r1 = r4.f27504C;
        r0 = "ig_profile_user_id";
        r1.F(r0, r8);
    L_0x0040:
        r0 = X.AnonymousClass107.f13182C;
        r3 = r0.A(r7);
        if (r3 == 0) goto L_0x006a;
    L_0x0048:
        r0 = r3.G();
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r2 = r4.f27504C;
        r1 = "ad_id";
        r0 = r3.G();
        r2.F(r1, r0);
    L_0x0059:
        r0 = r3.zR();
        if (r0 == 0) goto L_0x006a;
    L_0x005f:
        r2 = r4.f27504C;
        r1 = "tracking_token";
        r0 = r3.zR();
        r2.F(r1, r0);
    L_0x006a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Cy.<init>(java.lang.String, X.0hf, java.lang.String, java.lang.String):void");
    }

    /* renamed from: A */
    public final void m14705A(String str) {
        if (!this.f27505D) {
            Map hashMap = new HashMap();
            Uri parse = Uri.parse(str);
            hashMap.put("domain", parse.getHost());
            hashMap.put("md5Domain", AnonymousClass0IE.B(AnonymousClass2Cy.m14704B(parse)));
            hashMap.put("md5Path", AnonymousClass0IE.B(parse.getPath()));
            hashMap.put(IgReactNavigatorModule.URL, str);
            this.f27506E.add(hashMap);
            this.f27503B = false;
        }
    }

    /* renamed from: B */
    private static String m14704B(Uri uri) {
        uri = uri.getHost();
        return uri.startsWith("www.") ? uri.substring(4) : uri;
    }

    /* renamed from: B */
    public final void m14706B() {
        if (!this.f27505D) {
            this.f27505D = true;
            JSONArray jSONArray = new JSONArray();
            for (Map jSONObject : this.f27506E) {
                jSONArray.put(new JSONObject(jSONObject));
            }
            this.f27504C.F("redirect_chain", jSONArray.toString().replace("\\", JsonProperty.USE_DEFAULT_NAME));
            this.f27504C.H("is_page_loaded", this.f27503B);
            this.f27504C.R();
        }
    }

    public final String getModuleName() {
        return AnonymousClass2Cy.class.getCanonicalName();
    }
}

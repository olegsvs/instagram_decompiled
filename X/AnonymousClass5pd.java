package X;

import android.content.Intent;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;

/* renamed from: X.5pd */
public final class AnonymousClass5pd extends AnonymousClass3cI {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Up f69245B;

    public AnonymousClass5pd(AnonymousClass0Up anonymousClass0Up, AnonymousClass0IU anonymousClass0IU) {
        this.f69245B = anonymousClass0Up;
        super(anonymousClass0IU);
    }

    /* renamed from: B */
    public static void m28490B(AnonymousClass5pd anonymousClass5pd, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        HashMap hashMap = new HashMap();
        hashMap.put(IgReactNavigatorModule.URL, str);
        hashMap.put("media_owner_id", anonymousClass5pd.f69245B.f5562B.f5570H.getId());
        hashMap.put("option", "PROFILE");
        AnonymousClass0IW.Q(AnonymousClass3oI.B(anonymousClass5pd.f69245B.f5562B.f5564B, intent, "share_to_system_sheet_success", hashMap, anonymousClass5pd.f69245B.f5562B.f5566D.getModuleName()), anonymousClass5pd.f69245B.f5562B.f5564B);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 465885294);
        AnonymousClass5pd.m28490B(this, AnonymousClass0Up.B(this.f69245B));
        AnonymousClass0cQ.H(this, 2065306087, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1092412813);
        AnonymousClass3cR anonymousClass3cR = (AnonymousClass3cR) obj;
        int I2 = AnonymousClass0cQ.I(this, -824599554);
        AnonymousClass5pd.m28490B(this, anonymousClass3cR.f42756B);
        AnonymousClass0cQ.H(this, 885610868, I2);
        AnonymousClass0cQ.H(this, -674199019, I);
    }
}

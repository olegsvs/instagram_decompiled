package X;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;
import com.instagram.util.creation.ShaderBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4Jz */
public final class AnonymousClass4Jz implements AnonymousClass3P3, AnonymousClass3P2, AnonymousClass3H7 {
    /* renamed from: B */
    public final Activity f52749B;
    /* renamed from: C */
    public final Map f52750C = new HashMap();
    /* renamed from: D */
    private final Map f52751D = new HashMap();
    /* renamed from: E */
    private final AnonymousClass3Cd f52752E;
    /* renamed from: F */
    private final Map f52753F = new HashMap();
    /* renamed from: G */
    private final Map f52754G = new HashMap();
    /* renamed from: H */
    private Runnable f52755H;
    /* renamed from: I */
    private boolean f52756I;
    /* renamed from: J */
    private AnonymousClass40W f52757J;
    /* renamed from: K */
    private final AnonymousClass0PI f52758K;
    /* renamed from: L */
    private final AnonymousClass0Cm f52759L;

    public final void aB(AnonymousClass3P2 anonymousClass3P2) {
    }

    public AnonymousClass4Jz(Activity activity, AnonymousClass0PI anonymousClass0PI, AnonymousClass3Cd anonymousClass3Cd) {
        this.f52749B = activity;
        this.f52752E = anonymousClass3Cd;
        this.f52758K = anonymousClass0PI;
        this.f52759L = anonymousClass0PI.rT();
    }

    /* renamed from: A */
    public final void m23853A(String str) {
        AnonymousClass4Jz anonymousClass4Jz = this;
        String str2 = str;
        PhotoSession L = this.f52758K.VK().m18975L(str);
        if (!this.f52753F.containsKey(str)) {
            anonymousClass4Jz.f52753F.put(str2, new AnonymousClass3zH(anonymousClass4Jz.f52749B, anonymousClass4Jz.f52758K.rT(), anonymousClass4Jz, new AnonymousClass2cs(this.f52749B.getContentResolver(), Uri.parse(str)), L.f38980C, false, false, L.f38981D, m23855C(str), m23857E(str), anonymousClass4Jz));
            ShaderBridge.loadLibraries(m23856D(str2));
        }
        if (L.f38982E == null) {
            L.f38982E = AnonymousClass3GU.m19199C(AnonymousClass0ch.DEFAULT, L.f38984G, L.f38981D, m23855C(str2), m23857E(str2));
        }
    }

    /* renamed from: B */
    public final synchronized void m23854B() {
        if (this.f52757J != null) {
            this.f52757J.m22027C();
            this.f52757J = null;
            r1.f52755H = new AnonymousClass4Jy(r1, new ArrayList(this.f52753F.values()), new ArrayList(this.f52750C.values()), new ArrayList(this.f52751D.values()), new ArrayList(r1.f52754G.values()));
            r1.f52753F.clear();
            r1.f52750C.clear();
            r1.f52751D.clear();
            r1.f52754G.clear();
        }
    }

    /* renamed from: C */
    public final AnonymousClass3Gc m23855C(String str) {
        if (!this.f52751D.containsKey(str)) {
            this.f52751D.put(str, new AnonymousClass3Gc(AnonymousClass0ch.DEFAULT));
        }
        return (AnonymousClass3Gc) this.f52751D.get(str);
    }

    /* renamed from: D */
    public final AnonymousClass3zH m23856D(String str) {
        if (!this.f52753F.containsKey(str)) {
            m23853A(str);
        }
        return (AnonymousClass3zH) this.f52753F.get(str);
    }

    /* renamed from: E */
    public final AnonymousClass3Gh m23857E(String str) {
        if (!this.f52754G.containsKey(str)) {
            this.f52754G.put(str, new AnonymousClass3Gh(AnonymousClass0ch.DEFAULT, new WeakReference(this.f52752E)));
        }
        return (AnonymousClass3Gh) this.f52754G.get(str);
    }

    public final synchronized void OW() {
        if (this.f52757J == null) {
            this.f52757J = new AnonymousClass40W(this.f52749B, "CreationRenderController", this);
        }
    }

    public final void Um() {
        View findViewById = this.f52749B.findViewById(C0164R.id.creation_image_container);
        if (findViewById instanceof FilterViewContainer) {
            ((FilterViewContainer) findViewById).m19045A(false, null);
        }
        this.f52752E.m19015A(AnonymousClass3Cc.LOADING);
    }

    public final void Zs(String str, CropInfo cropInfo, int i) {
        PhotoSession L = this.f52758K.VK().m18975L(str);
        if (L.f38980C == null) {
            L.f38980C = new CropInfo(cropInfo.f38972D, cropInfo.f38971C, cropInfo.f38970B);
            L.f38981D = i;
        }
        if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7231B) {
            AnonymousClass3CJ.m18995D(this.f52759L).m19006H(str);
            AnonymousClass3CJ.m18995D(this.f52759L).m19004F(cropInfo, false, i);
        }
    }

    public final void fi() {
        this.f52752E.m19015A(AnonymousClass3Cc.LOADING);
    }

    public final synchronized AnonymousClass40W iQ() {
        return this.f52757J;
    }

    public final void lk(AnonymousClass3H6 anonymousClass3H6) {
        if (anonymousClass3H6 == AnonymousClass3H6.RENDER_ERROR) {
            this.f52752E.m19016B(AnonymousClass3Cc.RENDER_ERROR);
        } else if (anonymousClass3H6 == AnonymousClass3H6.SHADER_ERROR) {
            this.f52752E.m19016B(AnonymousClass3Cc.SHADER_ERROR);
        }
    }

    public final void nk(Exception exception) {
        if (!this.f52756I) {
            this.f52756I = true;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rendering error: ");
            stringBuilder.append(exception);
            AnonymousClass0g3.FilterPhotoError.A().F("error", stringBuilder.toString()).R();
            lk(AnonymousClass3H6.RENDER_ERROR);
        }
    }

    public final void nw() {
        this.f52756I = false;
        Runnable runnable = this.f52755H;
        if (runnable != null) {
            runnable.run();
            this.f52755H = null;
        }
    }

    public final void zKA(Object obj) {
        Void voidR = (Void) obj;
    }
}

package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1fW */
public final class AnonymousClass1fW extends AnonymousClass0Iw {
    /* renamed from: B */
    public final long f21161B = System.currentTimeMillis();
    /* renamed from: C */
    public final /* synthetic */ UserDetailFragment f21162C;

    public AnonymousClass1fW(UserDetailFragment userDetailFragment) {
        this.f21162C = userDetailFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass0cQ.m5858H(this, 1980759173, AnonymousClass0cQ.m5859I(this, 1103984607));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0MI anonymousClass0MI;
        List singletonList;
        int I = AnonymousClass0cQ.m5859I(this, -436529864);
        AnonymousClass3V6 anonymousClass3V6 = (AnonymousClass3V6) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -58272294);
        AnonymousClass0Pm anonymousClass0Pm = anonymousClass3V6.f41711C;
        AnonymousClass0r7 anonymousClass0r7 = anonymousClass3V6.f41712D;
        AnonymousClass19j anonymousClass19j = anonymousClass3V6.f41710B;
        UserDetailFragment userDetailFragment = this.f21162C;
        if (anonymousClass0r7 == null) {
            anonymousClass0MI = null;
        } else {
            AnonymousClass0MB M = AnonymousClass0Jd.f2931B.mo639M(this.f21162C.f8260s);
            boolean z = anonymousClass0r7.m7942G().gT() == AnonymousClass0Zd.USER && this.f21162C.f8260s.m1037B().equals(anonymousClass0r7.m7942G().pT());
            anonymousClass0MI = M.m3091J(anonymousClass0r7, z);
        }
        userDetailFragment.f8256o = anonymousClass0MI;
        UserDetailFragment userDetailFragment2 = this.f21162C;
        if (anonymousClass0Pm == null) {
            anonymousClass0MI = null;
        } else {
            anonymousClass0MI = AnonymousClass0Jd.f2931B.mo639M(this.f21162C.f8260s).m3089H(anonymousClass0Pm);
        }
        userDetailFragment2.f8220E = anonymousClass0MI;
        userDetailFragment2 = this.f21162C;
        if (anonymousClass19j == null) {
            anonymousClass0MI = null;
        } else {
            anonymousClass0MI = AnonymousClass0Jd.f2931B.mo639M(this.f21162C.f8260s).m3090I(anonymousClass19j);
        }
        userDetailFragment2.f8221F = anonymousClass0MI;
        AnonymousClass5nG Q = UserDetailFragment.m6687Q(this.f21162C);
        if (this.f21162C.f8219D != null && this.f21162C.f8219D.f8448B == AnonymousClass0hd.USER_STORY) {
            Object obj2;
            String str = this.f21162C.f8219D.f8449C;
            this.f21162C.f8219D = null;
            if (!(Q == null || str == null)) {
                Integer valueOf;
                List F = Q.G().m3108F();
                for (int i = 0; i < F.size(); i++) {
                    AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) F.get(i);
                    if (anonymousClass0Pj.m3888l() && anonymousClass0Pj.f4134F.getId().equals(str)) {
                        valueOf = Integer.valueOf(i);
                        break;
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                    obj2 = 1;
                    if (!(Q == null || Q.I())) {
                        if (obj2 != null) {
                            Q.f69016C = true;
                        }
                    }
                    this.f21162C.f8259r.f21254D = null;
                    Toast.makeText(this.f21162C.getContext(), C0164R.string.story_push_notification_launch_failure, 1).show();
                }
            }
            obj2 = null;
            if (obj2 != null) {
                Q.f69016C = true;
            } else {
                this.f21162C.f8259r.f21254D = null;
                Toast.makeText(this.f21162C.getContext(), C0164R.string.story_push_notification_launch_failure, 1).show();
            }
        }
        if (Q != null) {
            if (Q.D() != null) {
                singletonList = Collections.singletonList(Q.D());
                this.f21162C.f8247f.m7704D(System.currentTimeMillis() - this.f21161B, new AnonymousClass0op(singletonList, this.f21162C.f8260s), false);
                AnonymousClass0cQ.m5858H(this, -897981410, I2);
                AnonymousClass0cQ.m5858H(this, -440630615, I);
            }
        }
        singletonList = Collections.emptyList();
        this.f21162C.f8247f.m7704D(System.currentTimeMillis() - this.f21161B, new AnonymousClass0op(singletonList, this.f21162C.f8260s), false);
        AnonymousClass0cQ.m5858H(this, -897981410, I2);
        AnonymousClass0cQ.m5858H(this, -440630615, I);
    }
}

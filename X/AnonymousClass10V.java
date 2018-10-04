package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;

/* renamed from: X.10V */
public final class AnonymousClass10V {
    /* renamed from: B */
    public final Activity f13278B;
    /* renamed from: C */
    public final AnonymousClass0EE f13279C;
    /* renamed from: D */
    public final Context f13280D;
    /* renamed from: E */
    public final AnonymousClass10W f13281E;
    /* renamed from: F */
    public final AnonymousClass0IL f13282F;
    /* renamed from: G */
    public final AnonymousClass0MI f13283G;
    /* renamed from: H */
    public AnonymousClass10Y f13284H;
    /* renamed from: I */
    public final AnonymousClass0Cm f13285I;

    public AnonymousClass10V(Activity activity, Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass0IU anonymousClass0IU, AnonymousClass0IL anonymousClass0IL, AnonymousClass0MI anonymousClass0MI, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass10W anonymousClass10W, AnonymousClass10Y anonymousClass10Y) {
        this.f13278B = activity;
        this.f13280D = context;
        this.f13279C = anonymousClass0EE;
        this.f13282F = anonymousClass0IL;
        this.f13283G = anonymousClass0MI;
        this.f13281E = anonymousClass10W;
        this.f13284H = anonymousClass10Y;
        this.f13285I = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static CharSequence[] m8716B(AnonymousClass10V anonymousClass10V) {
        Resources resources = anonymousClass10V.f13278B.getResources();
        ArrayList arrayList = new ArrayList();
        AnonymousClass0Ci pT = anonymousClass10V.f13283G.f3385R.pT();
        if (anonymousClass10V.f13283G.f3384Q) {
            arrayList.add(resources.getString(C0164R.string.add_to_your_story_option));
            if (AnonymousClass0yJ.m8631D(anonymousClass10V.f13285I)) {
                arrayList.add(resources.getString(C0164R.string.edit_favorites_option));
            }
        } else if (!anonymousClass10V.f13283G.f3377J && pT != null) {
            arrayList.add(resources.getString(C0164R.string.view_profile));
            if (((Boolean) AnonymousClass0CC.mF.m846H(anonymousClass10V.f13285I)).booleanValue()) {
                arrayList.add(resources.getString(C0164R.string.message));
            }
            if (((Boolean) AnonymousClass0CC.gL.m846H(anonymousClass10V.f13285I)).booleanValue()) {
                Object string;
                if (anonymousClass10V.f13283G.f3383P) {
                    string = resources.getString(C0164R.string.mute_follow_unmute_story_option);
                } else {
                    string = resources.getString(C0164R.string.mute_follow_mute_option);
                }
                arrayList.add(string);
            } else {
                arrayList.add(resources.getString(anonymousClass10V.f13283G.f3383P ? C0164R.string.unmute_user : C0164R.string.mute_user, new Object[]{pT.uT()}));
            }
        } else if (anonymousClass10V.f13283G.f3385R.gT() == AnonymousClass0Zd.HASHTAG) {
            arrayList.add(resources.getString(C0164R.string.view_hashtag_page));
            Hashtag hashtag = new Hashtag(anonymousClass10V.f13283G.f3385R.getId());
            if (anonymousClass10V.f13283G.f3383P) {
                arrayList.add(resources.getString(C0164R.string.unmute_hashtag_story, new Object[]{hashtag.f2793M}));
            } else {
                arrayList.add(resources.getString(C0164R.string.mute_hashtag_story, new Object[]{hashtag.f2793M}));
            }
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
    }
}

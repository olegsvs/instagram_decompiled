package X;

import android.os.Bundle;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.61h */
public final class AnonymousClass61h extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: G */
    public static String f71003G = "data_saver_feature_title";
    /* renamed from: H */
    public static int f71004H;
    /* renamed from: B */
    public AnonymousClass2If f71005B;
    /* renamed from: C */
    public AnonymousClass2Ik f71006C;
    /* renamed from: D */
    public AnonymousClass2Ik f71007D;
    /* renamed from: E */
    public AnonymousClass2Ik f71008E;
    /* renamed from: F */
    public AnonymousClass0Cm f71009F;

    public final String getModuleName() {
        return "data_saver_options";
    }

    /* renamed from: B */
    public static void m28792B(AnonymousClass61h anonymousClass61h, boolean z) {
        anonymousClass61h.f71007D.f28742B = z;
        anonymousClass61h.f71006C.f28742B = z;
        anonymousClass61h.f71008E.f28742B = z;
        anonymousClass61h.f71005B.f28720B = z;
        AnonymousClass0rF.B((AnonymousClass2JC) anonymousClass61h.getListAdapter(), -1054802691);
    }

    /* renamed from: C */
    public static int m28793C(int i) {
        switch (i) {
            case 0:
                return C0164R.string.data_saver_feature_fully_enabled;
            case 1:
                return C0164R.string.data_saver_option_network_wifi_only;
            case 2:
                return C0164R.string.data_saver_option_network_wifi_cellular;
            default:
                throw new IllegalArgumentException("Unrecognized network setting");
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.data_saver);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1623371727);
        super.onCreate(bundle);
        this.f71009F = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, 985407814, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1601501263);
        super.onResume();
        AnonymousClass0HV D = AnonymousClass0HV.D(this.f71009F);
        boolean C = AnonymousClass0cW.C(this.f71009F);
        Collection arrayList = new ArrayList();
        arrayList.add(new AnonymousClass2If(C0164R.string.data_saver_title));
        AnonymousClass2Ik anonymousClass2Ik = new AnonymousClass2Ik(getString(C0164R.string.data_saver_resources_quality), new AnonymousClass61e(this));
        this.f71007D = anonymousClass2Ik;
        anonymousClass2Ik.f28743C = getString(AnonymousClass61h.m28793C(AnonymousClass0cW.B(this.f71009F, AnonymousClass0cX.HighQualityMedia)));
        this.f71005B = new AnonymousClass2If(C0164R.string.data_saver_autoplay_settings_title);
        anonymousClass2Ik = new AnonymousClass2Ik(getString(C0164R.string.data_saver_autoplay_feed), new AnonymousClass61f(this));
        this.f71006C = anonymousClass2Ik;
        anonymousClass2Ik.f28743C = getString(AnonymousClass61h.m28793C(AnonymousClass0cW.B(this.f71009F, AnonymousClass0cX.FeedVideoAutoplay)));
        anonymousClass2Ik = new AnonymousClass2Ik(getString(C0164R.string.data_saver_autoplay_stories), new AnonymousClass61g(this));
        this.f71008E = anonymousClass2Ik;
        anonymousClass2Ik.f28743C = getString(AnonymousClass61h.m28793C(AnonymousClass0cW.B(this.f71009F, AnonymousClass0cX.StoriesVideoAutoplay)));
        AnonymousClass61h.m28792B(this, C ^ 1);
        arrayList.add(new AnonymousClass1To(C0164R.string.data_saver_on, C, new AnonymousClass61d(this, D)));
        if (AnonymousClass0cW.M()) {
            arrayList.add(new AnonymousClass2JP(getString(C0164R.string.data_saver_on_description_v1_only)));
        } else {
            arrayList.add(new AnonymousClass2JP(getString(C0164R.string.data_saver_on_description)));
            arrayList.add(this.f71007D);
            arrayList.add(new AnonymousClass2Io());
            arrayList.add(this.f71005B);
            arrayList.add(this.f71006C);
            arrayList.add(this.f71008E);
        }
        setItems(arrayList);
        AnonymousClass0cQ.G(this, 1684619959, F);
    }
}

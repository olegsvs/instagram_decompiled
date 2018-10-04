package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.41e */
public final class AnonymousClass41e implements AnonymousClass0kB {
    /* renamed from: B */
    public final Activity f48503B;
    /* renamed from: C */
    public int f48504C;
    /* renamed from: D */
    public final AnonymousClass0PZ f48505D;
    /* renamed from: E */
    public AnonymousClass0P7 f48506E;
    /* renamed from: F */
    public int f48507F;
    /* renamed from: G */
    public final AnonymousClass0Cm f48508G;
    /* renamed from: H */
    private final AnonymousClass0jj f48509H;
    /* renamed from: I */
    private final AnonymousClass0hq f48510I;

    public final void dJA() {
    }

    public final boolean mV() {
        return false;
    }

    public AnonymousClass41e(Activity activity, AnonymousClass0hq anonymousClass0hq, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0jj anonymousClass0jj) {
        this.f48503B = activity;
        this.f48510I = anonymousClass0hq;
        this.f48505D = anonymousClass0PZ;
        this.f48508G = anonymousClass0Cm;
        this.f48509H = anonymousClass0jj;
    }

    /* renamed from: A */
    public final void m22113A(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, String str) {
        String str2;
        if (this.f48503B.getCurrentFocus() != null) {
            AnonymousClass0Nm.N(this.f48503B.getCurrentFocus());
        }
        AnonymousClass0NN B = AnonymousClass0NN.B("instagram_save_collections_init", this.f48505D).B("m_t", anonymousClass0P7.TO().A()).F("m_pk", anonymousClass0P7.NO()).F("a_pk", anonymousClass0P7.MA().getId()).B("position", i);
        if (!(anonymousClass0P7.K() == null || anonymousClass0P7.K().isEmpty())) {
            List arrayList = new ArrayList();
            ArrayList K = anonymousClass0P7.K();
            int size = K.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((Product) K.get(i2)).getId());
            }
            B.G("product_ids", arrayList);
        }
        B.R();
        AnonymousClass0Jf.f2933B.A();
        AnonymousClass0hq anonymousClass0hq = this.f48510I;
        String str3 = this.f48508G.f1759C;
        String moduleName = this.f48505D.getModuleName();
        boolean isSponsoredEligible = this.f48505D.isSponsoredEligible();
        boolean isOrganicEligible = this.f48505D.isOrganicEligible();
        AnonymousClass0PZ anonymousClass0PZ = this.f48505D;
        Parcelable saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(moduleName, isSponsoredEligible, isOrganicEligible, anonymousClass0PZ instanceof AnonymousClass0uD ? ((AnonymousClass0uD) anonymousClass0PZ).CIA(anonymousClass0P7) : null);
        AnonymousClass0IL anonymousClass5yQ = new AnonymousClass5yQ();
        Bundle bundle = new Bundle();
        bundle.putString("SaveToCollectionsFragment.ARGS_MEDIA_ID", anonymousClass0P7.getId());
        bundle.putInt("SaveToCollectionsFragment.ARGS_CAROUSEL_INDEX", anonymousClass0m3.f9673H);
        bundle.putInt("SaveToCollectionsFragment.ARGS_POSITION", i);
        bundle.putString("SaveToCollectionsFragment.ARGS_COLLECTION_ID_VIEWING", str);
        String str4 = "SaveToCollectionsFragment.ARGS_SESSION_ID";
        if (anonymousClass0hq == null) {
            str2 = null;
        } else {
            str2 = anonymousClass0hq.kR();
        }
        bundle.putString(str4, str2);
        bundle.putString("IgSessionManager.USER_ID", str3);
        bundle.putParcelable("SaveToCollectionsFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        anonymousClass5yQ.setArguments(bundle);
        AnonymousClass0bz.B(this.f48503B).A(new AnonymousClass44z(this)).C(anonymousClass5yQ);
        AnonymousClass0F4.f2058E.C(AnonymousClass0xC.C());
    }

    /* renamed from: B */
    public static void m22111B(AnonymousClass41e anonymousClass41e, String str) {
        anonymousClass41e = anonymousClass41e.f48503B;
        Toast.makeText(anonymousClass41e, anonymousClass41e.getResources().getString(C0164R.string.create_collection_failure_notification, new Object[]{str}), 1).show();
    }

    /* renamed from: B */
    public final void m22114B(SavedCollection savedCollection, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        m22115C(savedCollection, anonymousClass0P7, i, i2, null);
    }

    /* renamed from: C */
    private void m22112C() {
        AnonymousClass0x8 anonymousClass0x8 = this.f48506E.vA() ? AnonymousClass0x8.NOT_SAVED : AnonymousClass0x8.SAVED;
        if (anonymousClass0x8 == AnonymousClass0x8.NOT_SAVED) {
            AnonymousClass0F4.f2058E.B(new AnonymousClass0x9(this.f48506E));
        }
        AnonymousClass0P7 anonymousClass0P7 = this.f48506E;
        int i = this.f48507F;
        int i2 = this.f48504C;
        AnonymousClass0PZ anonymousClass0PZ = this.f48505D;
        Context context = this.f48503B;
        AnonymousClass0xA.J(anonymousClass0P7, i, i2, anonymousClass0x8, anonymousClass0PZ, context, this.f48508G, this.f48510I, context);
        AnonymousClass0F4.f2058E.B(new AnonymousClass3dT(new AnonymousClass3dS(this.f48506E), null));
    }

    /* renamed from: C */
    public final void m22115C(SavedCollection savedCollection, AnonymousClass0P7 anonymousClass0P7, int i, int i2, String str) {
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        SavedCollection savedCollection2 = savedCollection;
        AnonymousClass0xD anonymousClass0xD = anonymousClass0P72.eC.contains(savedCollection.f12480B) ? AnonymousClass0xD.REMOVE : AnonymousClass0xD.ADD;
        List arrayList = new ArrayList();
        arrayList.add(savedCollection.f12480B);
        AnonymousClass0xE anonymousClass0xE = AnonymousClass0xE.MEDIA;
        AnonymousClass41e anonymousClass41e = this;
        Context context = this.f48503B;
        List list = anonymousClass0xD == AnonymousClass0xD.ADD ? arrayList : null;
        if (anonymousClass0xD != AnonymousClass0xD.REMOVE) {
            arrayList = null;
        }
        AnonymousClass0GA E = AnonymousClass0xA.E(this.f48508G, anonymousClass0P72, AnonymousClass0xE.MEDIA, AnonymousClass0x8.SAVED, this.f48505D.getModuleName(), AnonymousClass0xA.G(anonymousClass0xE, context, list, arrayList));
        int i3 = i;
        int i4 = i2;
        if (!anonymousClass0P72.vA()) {
            AnonymousClass0x8 anonymousClass0x8 = AnonymousClass0x8.SAVED;
            AnonymousClass0PZ anonymousClass0PZ = this.f48505D;
            Activity activity = this.f48503B;
            AnonymousClass0xA.I(anonymousClass0P72, i4, i3, anonymousClass0x8, anonymousClass0PZ, activity, anonymousClass41e.f48508G, anonymousClass41e.f48510I, activity, E);
        }
        AnonymousClass0xD anonymousClass0xD2 = anonymousClass0xD;
        AnonymousClass0xB.G(anonymousClass0P72, i4, i3, anonymousClass0xD2, savedCollection2, anonymousClass41e.f48505D, anonymousClass41e.f48503B, anonymousClass41e.f48510I);
        E.f2849B = new AnonymousClass3dF(anonymousClass41e, anonymousClass0xD2, anonymousClass0P72, savedCollection2, str);
        AnonymousClass0Ix.D(E);
    }

    public final void Oy(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0kC anonymousClass0kC) {
        if (this.f48503B.getCurrentFocus() != null) {
            AnonymousClass0Nm.N(this.f48503B.getCurrentFocus());
        }
        if (!((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.PI)).booleanValue()) {
            this.f48509H.qUA(anonymousClass0P7, this.f48503B);
        }
        if (anonymousClass0m3.CB == null) {
            anonymousClass0m3.CB = new AnonymousClass0vx();
        }
        WeakReference weakReference = anonymousClass0m3.DB;
        if (weakReference != null) {
            anonymousClass0m3.CB.A(weakReference);
        }
        anonymousClass0m3.CB.C();
        this.f48506E = anonymousClass0P7;
        this.f48504C = anonymousClass0m3.f9673H;
        this.f48507F = i;
        if (!anonymousClass0P7.vA() || anonymousClass0P7.eC.isEmpty()) {
            if (!anonymousClass0P7.vA()) {
                AnonymousClass0m3.B(anonymousClass0m3, 9);
            }
            m22112C();
            return;
        }
        anonymousClass0m3 = new AnonymousClass0xG(this.f48503B, anonymousClass0kC);
        if (anonymousClass0m3.f12501C.mV()) {
            new AnonymousClass0Sb(anonymousClass0m3.f12500B).Q(C0164R.string.remove_from_saved_or_collection).S(C0164R.style.DialogTitleText).G(anonymousClass0m3.f12503E, anonymousClass0m3.f12502D).F(true).C().show();
        } else {
            new AnonymousClass0Sb(anonymousClass0m3.f12500B).Q(C0164R.string.remove_from_saves_and_collections_dialog_title).H(C0164R.string.remove_from_saved_explanation).K(17).O(C0164R.string.remove_from_saves, new AnonymousClass3dd(anonymousClass0m3)).L(C0164R.string.cancel, new AnonymousClass3dc(anonymousClass0m3)).F(true).C().show();
        }
    }

    public final void Py(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        m22113A(anonymousClass0P7, anonymousClass0m3, i, null);
    }

    public final void rVA() {
        m22112C();
    }
}

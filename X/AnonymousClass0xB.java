package X;

import android.app.Activity;
import com.instagram.save.model.SavedCollection;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0xB */
public final class AnonymousClass0xB {
    /* renamed from: B */
    public static AnonymousClass0bP m8508B(AnonymousClass0PA anonymousClass0PA, AnonymousClass0xD anonymousClass0xD, SavedCollection savedCollection, AnonymousClass0PZ anonymousClass0PZ) {
        anonymousClass0PA = AnonymousClass0bN.m5540D(anonymousClass0xD == AnonymousClass0xD.ADD ? "add_to_collection" : "remove_from_collection", anonymousClass0PA, anonymousClass0PZ);
        switch (AnonymousClass0xF.f12499B[anonymousClass0xD.ordinal()]) {
            case 1:
                anonymousClass0PA.f6738N = Arrays.asList(new String[]{savedCollection.f12480B});
                break;
            case 2:
                anonymousClass0PA.SD = Arrays.asList(new String[]{savedCollection.f12480B});
                break;
            default:
                throw new IllegalArgumentException("Unexpected update intention type");
        }
        return anonymousClass0PA;
    }

    /* renamed from: C */
    public static void m8509C(String str, SavedCollection savedCollection, AnonymousClass0EE anonymousClass0EE, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3298F("collection_id", savedCollection.f12480B).m3298F("collection_name", savedCollection.f12481C).m3294B("m_t", anonymousClass0P7.TO().m3618A()).m3298F("m_pk", anonymousClass0P7.NO()).m3298F("a_pk", anonymousClass0P7.MA().getId()).m3298F("algorithm", anonymousClass0P7.f4011L).m3298F("position", AnonymousClass28H.C(i, i2)).m3310R();
    }

    /* renamed from: D */
    public static void m8510D(String str, AnonymousClass0EE anonymousClass0EE, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3294B("m_t", anonymousClass0P7.TO().m3618A()).m3298F("m_pk", anonymousClass0P7.NO()).m3298F("a_pk", anonymousClass0P7.MA().getId()).m3298F("algorithm", anonymousClass0P7.f4011L).m3298F("position", AnonymousClass28H.C(i, i2)).m3310R();
    }

    /* renamed from: E */
    public static void m8511E(String str, String str2, AnonymousClass0EE anonymousClass0EE, String str3) {
        AnonymousClass0NN.m3291B("instagram_individual_collection_load_success", anonymousClass0EE).m3298F("collection_id", str).m3298F("collection_name", str2).m3303K("prior_module", str3).m3310R();
    }

    /* renamed from: F */
    public static void m8512F(SavedCollection savedCollection, List list, AnonymousClass0PZ anonymousClass0PZ) {
        for (AnonymousClass0P7 anonymousClass0P7 : list) {
            AnonymousClass0bP E = AnonymousClass0bN.m5541E("add_to_collection", anonymousClass0P7, anonymousClass0PZ);
            E.ZD = savedCollection;
            AnonymousClass0bN.m5555S(E, anonymousClass0P7, anonymousClass0PZ, 0);
        }
    }

    /* renamed from: G */
    public static void m8513G(AnonymousClass0P7 anonymousClass0P7, int i, int i2, AnonymousClass0xD anonymousClass0xD, SavedCollection savedCollection, AnonymousClass0PZ anonymousClass0PZ, Activity activity, AnonymousClass0hq anonymousClass0hq) {
        AnonymousClass0bP B = AnonymousClass0xB.m8508B(anonymousClass0P7, anonymousClass0xD, savedCollection, anonymousClass0PZ);
        B.m5581F(anonymousClass0P7).nB = i;
        if (!AnonymousClass0bN.m5549M(anonymousClass0P7, anonymousClass0PZ)) {
            B.m5578C(activity);
            if (anonymousClass0hq != null) {
                B.bD = anonymousClass0hq.kR();
            }
        }
        AnonymousClass0bN.m5555S(B, anonymousClass0P7, anonymousClass0PZ, i2);
    }
}

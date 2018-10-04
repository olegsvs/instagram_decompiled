package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0V1 */
public final class AnonymousClass0V1 {
    /* renamed from: B */
    public static AnonymousClass0NN m4813B(AnonymousClass0NN anonymousClass0NN, List list) {
        if (!(list == null || list.isEmpty())) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((AnonymousClass0Ck) list.get(i)).getId();
            }
            anonymousClass0NN.m3301I("recipient_ids", strArr);
        }
        return anonymousClass0NN;
    }

    /* renamed from: C */
    public static AnonymousClass0NN m4814C(AnonymousClass0NN anonymousClass0NN, boolean z) {
        if (z) {
            anonymousClass0NN.m3298F("is_silent", "1");
        }
        return anonymousClass0NN;
    }

    /* renamed from: D */
    public static AnonymousClass0db m4815D(AnonymousClass0db anonymousClass0db, AnonymousClass0Va anonymousClass0Va) {
        return anonymousClass0db.m6074G("channel", anonymousClass0Va.m4890A());
    }

    /* renamed from: E */
    public static AnonymousClass0NN m4816E(AnonymousClass0NN anonymousClass0NN, AnonymousClass0VN anonymousClass0VN) {
        anonymousClass0NN.m3298F(TraceFieldType.ErrorDomain, anonymousClass0VN.f5719C).m3298F(TraceFieldType.ErrorCode, anonymousClass0VN.f5718B).m3298F(TraceFieldType.Error, anonymousClass0VN.f5722F);
        return anonymousClass0NN;
    }

    /* renamed from: F */
    public static AnonymousClass0db m4817F(AnonymousClass0db anonymousClass0db, AnonymousClass0Va anonymousClass0Va, long j) {
        return anonymousClass0db.m6074G("channel", anonymousClass0Va.m4890A()).m6071D("total_duration", j);
    }

    /* renamed from: G */
    public static AnonymousClass0db m4818G(AnonymousClass0db anonymousClass0db, AnonymousClass0Va anonymousClass0Va, long j) {
        return anonymousClass0db.m6074G("channel", anonymousClass0Va.m4890A()).m6071D("total_duration", j);
    }

    /* renamed from: H */
    public static void m4819H(AnonymousClass0NN anonymousClass0NN, List list) {
        if (!list.isEmpty()) {
            Collection hashSet = new HashSet(list.size());
            List arrayList = new ArrayList(list.size());
            for (DirectShareTarget directShareTarget : list) {
                DirectThreadKey directThreadKey = directShareTarget.f5604E;
                if (!(directThreadKey == null || directThreadKey.f5871C == null)) {
                    arrayList.add(directThreadKey.f5871C);
                }
                for (PendingRecipient id : directShareTarget.m4804B()) {
                    hashSet.add(id.getId());
                }
            }
            anonymousClass0NN.m3299G("thread_ids", arrayList);
            anonymousClass0NN.m3299G("recipient_ids", new ArrayList(hashSet));
        }
    }

    /* renamed from: I */
    public static List m4820I(List list) {
        int size = list.size();
        if (size == 0) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AnonymousClass18R anonymousClass18R = (AnonymousClass18R) list.get(i);
            Object obj = anonymousClass18R.f14966C ? "visual_message" : anonymousClass18R.f14965B ? anonymousClass18R.f14971H : anonymousClass18R.f14967D ? "mark_as_unseen" : "unknown";
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: J */
    public static AnonymousClass0NN m4821J(AnonymousClass0EE anonymousClass0EE, String str, boolean z) {
        return AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3298F("composer_flow", z ? "1" : "0");
    }

    /* renamed from: K */
    public static AnonymousClass0NN m4822K(AnonymousClass0WG anonymousClass0WG, String str) {
        return AnonymousClass0NN.m3291B("direct_message_mark_waterfall", null).m3298F("type", anonymousClass0WG.mo1349B()).m3298F("client_context", anonymousClass0WG.f5946B).m3298F("thread_id", anonymousClass0WG.f5949E).m3298F("message_id", anonymousClass0WG.f5948D).m3295C("date_created", anonymousClass0WG.f5947C).m3298F("action", str);
    }

    /* renamed from: L */
    public static AnonymousClass0NN m4823L(AnonymousClass0EE anonymousClass0EE, String str, String str2, String str3, String str4) {
        anonymousClass0EE = AnonymousClass0NN.m3291B("direct_quick_reply_waterfall", anonymousClass0EE).m3298F("action", str).m3298F("source_module", str2).m3298F("waterfall_id", str3);
        if (str4 != null) {
            anonymousClass0EE.m3298F("thread_id", str4);
        }
        return anonymousClass0EE;
    }

    /* renamed from: M */
    public static AnonymousClass0NN m4824M(AnonymousClass0EE anonymousClass0EE, AnonymousClass0W7 anonymousClass0W7) {
        boolean z;
        anonymousClass0EE = AnonymousClass0NN.m3291B("direct_save_media", anonymousClass0EE);
        AnonymousClass0ON H = anonymousClass0W7.m5006H();
        if (H != AnonymousClass0ON.PHOTO) {
            if (H != AnonymousClass0ON.VIDEO) {
                z = false;
                AnonymousClass0LH.m2930H(z);
                anonymousClass0EE.m3298F("media_type", H != AnonymousClass0ON.PHOTO ? "photo" : MediaStreamTrack.VIDEO_TRACK_KIND);
                return anonymousClass0EE;
            }
        }
        z = true;
        AnonymousClass0LH.m2930H(z);
        if (H != AnonymousClass0ON.PHOTO) {
        }
        anonymousClass0EE.m3298F("media_type", H != AnonymousClass0ON.PHOTO ? "photo" : MediaStreamTrack.VIDEO_TRACK_KIND);
        return anonymousClass0EE;
    }

    /* renamed from: N */
    public static AnonymousClass0NN m4825N(AnonymousClass0EE anonymousClass0EE, String str, String str2) {
        return AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3298F("thread_id", str2);
    }

    /* renamed from: O */
    public static AnonymousClass0NN m4826O(AnonymousClass0EE anonymousClass0EE, String str, String str2, List list) {
        return AnonymousClass0V1.m4813B(AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3298F("thread_id", str2), list);
    }

    /* renamed from: P */
    public static String m4827P(AnonymousClass0W7 anonymousClass0W7) {
        String A = anonymousClass0W7.f5915s.m4811A();
        if (!AnonymousClass0V0.MEDIA.m4811A().equals(A)) {
            return A;
        }
        if (anonymousClass0W7.f5877G != null) {
            return AnonymousClass0V1.m4828Q(anonymousClass0W7.f5877G);
        }
        if (anonymousClass0W7.f5896Z != null) {
            return anonymousClass0W7.f5896Z.wY() ? MediaStreamTrack.VIDEO_TRACK_KIND : "photo";
        } else {
            return A;
        }
    }

    /* renamed from: Q */
    public static String m4828Q(AnonymousClass0WE anonymousClass0WE) {
        return anonymousClass0WE.m5050A() != null ? MediaStreamTrack.VIDEO_TRACK_KIND : "photo";
    }

    /* renamed from: R */
    public static void m4829R(AnonymousClass0EE anonymousClass0EE, String str) {
        AnonymousClass0NN.m3291B("direct_exit_search", anonymousClass0EE).m3294B("search_query_length", str.length()).m3310R();
    }

    /* renamed from: S */
    public static void m4830S(String str, String str2) {
        AnonymousClass0V1.m4850m(AnonymousClass0Va.Unset, str, str2, "cancelled").m3310R();
    }

    /* renamed from: T */
    public static void m4831T(String str, String str2) {
        AnonymousClass0V1.m4850m(AnonymousClass0Va.Unset, str, str2, "retry_attempt").m3310R();
        AnonymousClass0V1.m4835X(str, str2);
    }

    /* renamed from: U */
    public static void m4832U(String str, String str2, boolean z, AnonymousClass0db anonymousClass0db) {
        AnonymousClass0V1.m4814C(AnonymousClass0V1.m4851n("send_attempt").m3298F("type", str).m3298F("client_context", str2), z).m3307O(anonymousClass0db).m3310R();
    }

    /* renamed from: V */
    public static void m4833V(String str, String str2, boolean z, AnonymousClass0VN anonymousClass0VN, AnonymousClass0db anonymousClass0db) {
        AnonymousClass0V1.m4816E(AnonymousClass0V1.m4814C(AnonymousClass0V1.m4851n("failed").m3298F("type", str).m3298F("client_context", str2), z), anonymousClass0VN).m3307O(anonymousClass0db).m3310R();
        AnonymousClass0V1.m4816E(AnonymousClass0V1.m4814C(AnonymousClass0NN.m3291B("direct_message_failed", null).m3298F("type", str).m3298F("client_context", str2), z), anonymousClass0VN).m3307O(anonymousClass0db).m3310R();
    }

    /* renamed from: W */
    public static void m4834W(AnonymousClass0V0 anonymousClass0V0, String str) {
        AnonymousClass0LH.m2925C(anonymousClass0V0.equals(AnonymousClass0V0.MEDIA) ^ 1, "Must use String overload and DirectAnalyticsUtil#getMessageType() with MEDIA types");
        AnonymousClass0V1.m4835X(anonymousClass0V0.m4811A(), str);
    }

    /* renamed from: X */
    public static void m4835X(String str, String str2) {
        AnonymousClass0V1.m4850m(AnonymousClass0Va.Unset, str, str2, "send_intent").m3310R();
    }

    /* renamed from: Y */
    public static void m4836Y(String str, String str2, AnonymousClass0db anonymousClass0db) {
        AnonymousClass0V1.m4851n("sent").m3298F("type", str).m3298F("client_context", str2).m3307O(anonymousClass0db).m3310R();
    }

    /* renamed from: Z */
    public static void m4837Z(AnonymousClass0EE anonymousClass0EE, String str, int i, String str2, List list, String str3, String str4, String str5) {
        str = AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3294B("position", i);
        if (list != null) {
            i = new HashSet(list.size());
            for (PendingRecipient id : list) {
                i.add(id.getId());
            }
            str.m3299G("recipient_ids", new ArrayList(i));
        }
        if (str3 != null) {
            str.m3298F("recipient_removal_type", str3);
        }
        if (str2 != null) {
            str.m3298F("section_type", str2);
        }
        if (str4 != null) {
            str.m3294B("search_query_length", str4.length());
        }
        if (str5 != null) {
            str.m3298F("thread_id", str5);
        }
        str.m3310R();
    }

    /* renamed from: a */
    public static void m4838a(AnonymousClass0EE anonymousClass0EE, String str, int i, List list, String str2) {
        AnonymousClass0V1.m4837Z(anonymousClass0EE, str, i, null, list, str2, null, null);
    }

    /* renamed from: b */
    public static void m4839b(AnonymousClass0EE anonymousClass0EE, String str) {
        AnonymousClass0NN.m3291B("direct_compose_search", anonymousClass0EE).m3298F("search_string", str).m3310R();
    }

    /* renamed from: c */
    public static void m4840c(AnonymousClass0EE anonymousClass0EE, String str) {
        AnonymousClass0NN.m3291B("direct_thread_tap_permanent_media", anonymousClass0EE).m3298F("image_reveal_status", str).m3310R();
    }

    /* renamed from: d */
    public static void m4841d(AnonymousClass0EE anonymousClass0EE, String str, String str2, String str3) {
        AnonymousClass0NN.m3291B("direct_message_modal_send", anonymousClass0EE).m3298F("source", str).m3298F("m_pk", str2).m3298F("a_pk", str3).m3310R();
    }

    /* renamed from: e */
    public static void m4842e(AnonymousClass0EE anonymousClass0EE, String str, String str2, String str3) {
        AnonymousClass0NN.m3291B("direct_message_modal_tap", anonymousClass0EE).m3298F("source", str).m3298F("m_pk", str2).m3298F("a_pk", str3).m3310R();
    }

    /* renamed from: f */
    public static void m4843f(AnonymousClass0EE anonymousClass0EE, String str) {
        AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3310R();
    }

    /* renamed from: g */
    public static void m4844g(AnonymousClass0EE anonymousClass0EE, String str) {
        AnonymousClass0NN.m3291B("direct_thread_tap_small_media_to_enlarge", anonymousClass0EE).m3298F("media_type", str).m3310R();
    }

    /* renamed from: h */
    public static void m4845h(String str) {
        AnonymousClass0NN.m3291B("direct_mutation_migration", null).m3298F("mutation_type", str).m3310R();
    }

    /* renamed from: i */
    public static void m4846i(AnonymousClass0EE anonymousClass0EE, String str, int i, int i2, boolean z) {
        str = AnonymousClass0NN.m3291B(str, anonymousClass0EE).m3294B("num_requests_visible", i).m3300H("all_used", z);
        if (!z) {
            str.m3294B("num_selected", i2);
        }
        str.m3310R();
    }

    /* renamed from: j */
    public static void m4847j(DirectShareTarget directShareTarget, String str, AnonymousClass0EE anonymousClass0EE, int i) {
        AnonymousClass0NN B = AnonymousClass0NN.m3291B(str, anonymousClass0EE);
        if (directShareTarget.m4804B().size() == 1) {
            B.m3298F("a_pk", ((PendingRecipient) directShareTarget.m4804B().get(0)).getId());
        }
        DirectThreadKey directThreadKey = directShareTarget.f5604E;
        if (directThreadKey != null) {
            B.m3298F("thread_id", directThreadKey.f5871C);
        }
        B.m3294B("position", i);
        B.m3310R();
    }

    /* renamed from: k */
    public static void m4848k(String str, String str2) {
        AnonymousClass0NN.m3292C("direct_thread_action", "direct_thread").m3298F("action", "social_context_view_report_user").m3298F("thread_id", str).m3298F("sender_id", str2).m3310R();
    }

    /* renamed from: l */
    public static void m4849l(AnonymousClass0EE anonymousClass0EE, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0NN.m3291B("direct_thread_visual_message_tap", anonymousClass0EE).m3298F("thread_id", str).m3298F("sender_id", str2).m3298F("message_type", str3).m3298F("view_mode", str4).m3298F("action", str5).m3310R();
    }

    /* renamed from: m */
    private static AnonymousClass0NN m4850m(AnonymousClass0Va anonymousClass0Va, String str, String str2, String str3) {
        return AnonymousClass0V1.m4851n(str3).m3298F("type", str).m3298F("client_context", str2).m3298F("channel", anonymousClass0Va.m4890A());
    }

    /* renamed from: n */
    private static AnonymousClass0NN m4851n(String str) {
        return AnonymousClass0NN.m3291B("direct_message_waterfall", null).m3298F("action", str);
    }
}

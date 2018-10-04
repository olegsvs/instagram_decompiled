package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.37D */
public final class AnonymousClass37D {
    /* renamed from: B */
    public static void m18595B(String str, AnonymousClass0EE anonymousClass0EE, String str2, int i, boolean z) {
        AnonymousClass0NN.B("ig_face_effect_download_step", anonymousClass0EE).F("waterfall_id", str).F("download_type", "api").F("api_type", str2).B("num_attempts", i).F("step", z ? RealtimeConstants.SEND_SUCCESS : RealtimeConstants.SEND_FAIL).R();
    }

    /* renamed from: C */
    public static void m18596C(String str, AnonymousClass0EE anonymousClass0EE, AnonymousClass36h anonymousClass36h, boolean z, long j, long j2) {
        AnonymousClass37D.m18597D(str, anonymousClass0EE, anonymousClass36h.f37882L, anonymousClass36h.f37881K, z, j, j2);
    }

    /* renamed from: D */
    public static void m18597D(String str, AnonymousClass0EE anonymousClass0EE, String str2, String str3, boolean z, long j, long j2) {
        AnonymousClass0NN.B("ig_face_effect_unzip_step", anonymousClass0EE).F("waterfall_id", str).F("step", z ? RealtimeConstants.SEND_SUCCESS : RealtimeConstants.SEND_FAIL).F("effect_id", str2).F("effect_file_id", str3).C("uncompressed_size", j).C("time_to_decompress", j2).R();
    }

    /* renamed from: E */
    public static void m18598E(String str, AnonymousClass0EE anonymousClass0EE, String str2, String str3, long j, long j2) {
        AnonymousClass0NN.B("ig_face_effect_unzip_step", anonymousClass0EE).F("waterfall_id", str).F("step", "start").F("effect_id", str2).F("effect_file_id", str3).C("compressed_size", j).C("internal_space_available", j2).R();
    }
}

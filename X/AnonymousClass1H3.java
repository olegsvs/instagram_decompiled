package X;

import android.content.Context;
import com.facebook.video.cache.instrumentation.VideoCacheDatabase;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1H3 */
public final class AnonymousClass1H3 implements AnonymousClass0EJ {
    /* renamed from: C */
    public static volatile AnonymousClass1H3 f16644C;
    /* renamed from: B */
    private final Context f16645B;

    public final void onAppForegrounded() {
    }

    public AnonymousClass1H3(Context context) {
        this.f16645B = context;
    }

    public final void onAppBackgrounded() {
        if (((Boolean) AnonymousClass0CC.ID.m845G()).booleanValue()) {
            try {
                VideoCacheDatabase videoCacheDatabase = new VideoCacheDatabase(new AnonymousClass42j(this.f16645B).f48839B, new AnonymousClass3s9(AnonymousClass0Kq.m2860B().m2861A()), null);
                List<Map> cacheStats = videoCacheDatabase.getCacheStats();
                int size = cacheStats.size();
                for (Map map : cacheStats) {
                    AnonymousClass0NN C = AnonymousClass0NN.m3292C("ig_cache_stats", (String) map.remove("request_source"));
                    C.m3298F("cache_type", MediaStreamTrack.VIDEO_TRACK_KIND);
                    for (Entry entry : map.entrySet()) {
                        C.m3298F(AnonymousClass42j.B((String) entry.getKey()), AnonymousClass42j.C((String) entry.getKey(), (String) entry.getValue()));
                    }
                    C.m3310R();
                }
                if (size > 0) {
                    videoCacheDatabase.removeStaleCacheEvents();
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.m1244G("VideoCacheStatsReporterProxy", "Unable to instantiate reporter", e);
            }
        }
    }
}

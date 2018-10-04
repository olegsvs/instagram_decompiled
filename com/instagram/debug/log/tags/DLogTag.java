package com.instagram.debug.log.tags;

import android.graphics.Color;
import com.facebook.C0164R;

public class DLogTag {
    public static final DLogTag ASYNC_ADS = new DLogTag("async_ads", C0164R.string.debug_tag_async_ads, -16711681);
    public static final DLogTag CANVAS = new DLogTag("canvas", C0164R.string.debug_tag_canvas, -16711681);
    public static final DLogTag CONTEXTUAL_CONFIG = new DLogTag("contextual_config", C0164R.string.debug_tag_contextual_config, -16711681);
    public static final DLogTag DIRECT_HTTP = new DLogTag("direct_http", C0164R.string.debug_tag_direct_http, Color.argb(255, 255, 165, 0));
    public static final DLogTag DIRECT_REAL_TIME = new DLogTag("direct_real_time", C0164R.string.debug_tag_direct_realtime, -16711936);
    public static final DLogTag IG_VIDEO_REAL_TIME = new DLogTag("ig_video_real_time", C0164R.string.debug_tag_ig_video_realtime, -16711681);
    public static final DLogTag LIVE = new DLogTag("live", C0164R.string.debug_tag_live, -16711681);
    public static final DLogTag PENDING_MEDIA = new DLogTag("pending_media", C0164R.string.debug_tag_pending_media, -65281);
    public static final DLogTag QE_EXPOSURE = new DLogTag("qe_exposure", C0164R.string.debug_tag_qe_exposure, -256);
    public static final DLogTag REAL_TIME = new DLogTag("real_time", C0164R.string.debug_tag_real_time, -16711681);
    public static final DLogTag REEL = new DLogTag("reel", C0164R.string.debug_tag_reel, -16711681);
    public static final DLogTag RTC = new DLogTag("rtc", C0164R.string.debug_tag_rtc, -65281);
    public static final DLogTag VIDEO_CALL = new DLogTag("video_call", C0164R.string.debug_tag_video_call, -16711681);
    public final int color;
    public final String name;
    public final int nameResourceId;

    public DLogTag(String str, int i, int i2) {
        this.name = str;
        this.nameResourceId = i;
        this.color = i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DLogTag{");
        stringBuilder.append(this.name);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import java.util.HashMap;
import java.util.Map;

public class MediaCodecUtils {
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    public static final int[] DECODER_COLOR_FORMATS = new int[]{19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] ENCODER_COLOR_FORMATS = new int[]{19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final String EXYNOS_PREFIX = "OMX.Exynos.";
    public static final String INTEL_PREFIX = "OMX.Intel.";
    public static final String NVIDIA_PREFIX = "OMX.Nvidia.";
    public static final String QCOM_PREFIX = "OMX.qcom.";
    private static final String TAG = "MediaCodecUtils";
    public static final int[] TEXTURE_COLOR_FORMATS = new int[]{2130708361};

    /* renamed from: org.webrtc.MediaCodecUtils$1 */
    public /* synthetic */ class C02231 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecType = new int[VideoCodecType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.webrtc.VideoCodecType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$webrtc$VideoCodecType = r0;
            r2 = $SwitchMap$org$webrtc$VideoCodecType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = org.webrtc.VideoCodecType.VP8;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$org$webrtc$VideoCodecType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = org.webrtc.VideoCodecType.VP9;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$org$webrtc$VideoCodecType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = org.webrtc.VideoCodecType.H264;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecUtils.1.<clinit>():void");
        }
    }

    private MediaCodecUtils() {
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        for (Object equals : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecType.mimeType().equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static Map getCodecProperties(VideoCodecType videoCodecType, boolean z) {
        switch (videoCodecType.ordinal()) {
            case 0:
            case 1:
                return new HashMap();
            case 2:
                Map hashMap = new HashMap();
                String str = "1";
                hashMap.put(VideoCodecInfo.H264_FMTP_LEVEL_ASYMMETRY_ALLOWED, str);
                hashMap.put(VideoCodecInfo.H264_FMTP_PACKETIZATION_MODE, str);
                hashMap.put(VideoCodecInfo.H264_FMTP_PROFILE_LEVEL_ID, z ? VideoCodecInfo.H264_CONSTRAINED_HIGH_3_1 : VideoCodecInfo.H264_CONSTRAINED_BASELINE_3_1);
                return hashMap;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported codec: ");
                stringBuilder.append(videoCodecType);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static Integer selectColorFormat(int[] iArr, CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}

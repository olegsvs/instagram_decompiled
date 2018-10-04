package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14.Context;

public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final List H264_HW_EXCEPTION_MODELS = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HardwareVideoEncoderFactory";
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private final boolean fallbackToSoftware;
    private final Context sharedContext;

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1 */
    public /* synthetic */ class C02211 {
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
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.1.<clinit>():void");
        }
    }

    private static native boolean nativeIsSameH264Profile(Map map, Map map2);

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, true);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3) {
        if (context instanceof Context) {
            this.sharedContext = (Context) context;
        } else {
            Logging.m29387w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.sharedContext = null;
        }
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
        this.fallbackToSoftware = z3;
    }

    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this(null, z, z2);
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecType videoCodecType, String str) {
        if (!str.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            return new BaseBitrateAdjuster();
        }
        if (videoCodecType == VideoCodecType.VP8) {
            return new DynamicBitrateAdjuster();
        }
        return new FramerateBitrateAdjuster();
    }

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecType valueOf = VideoCodecType.valueOf(videoCodecInfo.name);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType != null) {
            String name = findCodecForType.getName();
            String mimeType = valueOf.mimeType();
            Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
            Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
            if (valueOf == VideoCodecType.H264) {
                boolean z = true;
                if (!nativeIsSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(valueOf, true)) || !isH264HighProfileSupported(findCodecForType)) {
                    z = false;
                }
                boolean nativeIsSameH264Profile = nativeIsSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(valueOf, false));
                if (!(z || nativeIsSameH264Profile)) {
                }
            }
            return new HardwareVideoEncoder(name, valueOf, selectColorFormat, selectColorFormat2, videoCodecInfo.params, getKeyFrameIntervalSec(valueOf), getForcedKeyFrameIntervalMs(valueOf, name), createBitrateAdjuster(valueOf, name), this.sharedContext);
        } else if (this.fallbackToSoftware) {
            return new SoftwareVideoEncoderFactory().createEncoder(videoCodecInfo);
        }
        return null;
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        MediaCodecInfo mediaCodecInfo;
        int i = 0;
        while (true) {
            mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                break;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (Throwable e) {
                Logging.m29385e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (mediaCodecInfo != null) {
                if (mediaCodecInfo.isEncoder()) {
                    if (isSupportedCodec(mediaCodecInfo, videoCodecType)) {
                        break;
                    }
                }
            }
            i++;
        }
        return mediaCodecInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getForcedKeyFrameIntervalMs(org.webrtc.VideoCodecType r1, java.lang.String r2) {
        /*
        r0 = this;
        r0 = org.webrtc.VideoCodecType.VP8;
        if (r1 != r0) goto L_0x0023;
    L_0x0004:
        r0 = "OMX.qcom.";
        r0 = r2.startsWith(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x000c:
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        r1 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        if (r2 == r0) goto L_0x0022;
    L_0x0014:
        r0 = 22;
        if (r2 != r0) goto L_0x0019;
    L_0x0018:
        goto L_0x0022;
    L_0x0019:
        r0 = 23;
        if (r2 != r0) goto L_0x0020;
    L_0x001d:
        r0 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        return r0;
    L_0x0020:
        if (r2 <= r0) goto L_0x0023;
    L_0x0022:
        return r1;
    L_0x0023:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.getForcedKeyFrameIntervalMs(org.webrtc.VideoCodecType, java.lang.String):int");
    }

    private int getKeyFrameIntervalSec(VideoCodecType videoCodecType) {
        switch (videoCodecType.ordinal()) {
            case 0:
            case 1:
                return 100;
            case 2:
                return 20;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported VideoCodecType ");
                stringBuilder.append(videoCodecType);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        List arrayList = new ArrayList();
        r9 = new VideoCodecType[3];
        int i = 0;
        r9[0] = VideoCodecType.VP8;
        r9[1] = VideoCodecType.VP9;
        r9[2] = VideoCodecType.H264;
        for (VideoCodecType videoCodecType : r9) {
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecType);
            if (findCodecForType != null) {
                String name = videoCodecType.name();
                if (videoCodecType == VideoCodecType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, true)));
                }
                arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        if (this.fallbackToSoftware) {
            VideoCodecInfo[] supportedCodecs = SoftwareVideoEncoderFactory.supportedCodecs();
            int length = supportedCodecs.length;
            while (i < length) {
                Object obj = supportedCodecs[i];
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
                i++;
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        return this.enableH264HighProfile && VERSION.SDK_INT > 23 && mediaCodecInfo.getName().startsWith(MediaCodecUtils.EXYNOS_PREFIX);
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        switch (videoCodecType.ordinal()) {
            case 0:
                return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
            case 1:
                return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
            case 2:
                return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
            default:
                return false;
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if ((!name.startsWith(MediaCodecUtils.QCOM_PREFIX) || VERSION.SDK_INT < 19) && (!name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) || VERSION.SDK_INT < 21)) {
            return false;
        }
        return true;
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return (name.startsWith(MediaCodecUtils.QCOM_PREFIX) && VERSION.SDK_INT >= 19) || ((name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) && VERSION.SDK_INT >= 23) || (name.startsWith(MediaCodecUtils.INTEL_PREFIX) && VERSION.SDK_INT >= 21 && this.enableIntelVp8Encoder));
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo = mediaCodecInfo.getName();
        return (mediaCodecInfo.startsWith(MediaCodecUtils.QCOM_PREFIX) || mediaCodecInfo.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) && VERSION.SDK_INT >= 24;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null) {
                return isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecType);
            }
        }
        return false;
    }
}

package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase.Context;

public class HardwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "HardwareVideoDecoderFactory";
    private final boolean fallbackToSoftware;
    private final Context sharedContext;

    public HardwareVideoDecoderFactory() {
        this(null);
    }

    public HardwareVideoDecoderFactory(Context context) {
        this(context, true);
    }

    public HardwareVideoDecoderFactory(Context context, boolean z) {
        this.sharedContext = context;
        this.fallbackToSoftware = z;
    }

    public VideoDecoder createDecoder(String str) {
        VideoCodecType valueOf = VideoCodecType.valueOf(str);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return this.fallbackToSoftware ? new SoftwareVideoDecoderFactory().createDecoder(str) : null;
        } else {
            return new HardwareVideoDecoder(findCodecForType.getName(), valueOf, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(valueOf.mimeType())).intValue(), this.sharedContext);
        }
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        if (VERSION.SDK_INT >= 19) {
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                MediaCodecInfo codecInfoAt;
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                } catch (Throwable e) {
                    Logging.m29385e(TAG, "Cannot retrieve encoder codec info", e);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null) {
                    if (!codecInfoAt.isEncoder()) {
                        if (isSupportedCodec(codecInfoAt, videoCodecType)) {
                            return codecInfoAt;
                        }
                    }
                }
            }
        }
        return null;
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
            VideoCodecInfo[] supportedCodecs = SoftwareVideoDecoderFactory.supportedCodecs();
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
        mediaCodecInfo = mediaCodecInfo.getName();
        int i = VERSION.SDK_INT;
        if (i < 21 || !mediaCodecInfo.startsWith(MediaCodecUtils.QCOM_PREFIX)) {
            if (i < 23 || !mediaCodecInfo.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isHardwareSupported(android.media.MediaCodecInfo r2, org.webrtc.VideoCodecType r3) {
        /*
        r1 = this;
        r1 = r2.getName();
        r2 = org.webrtc.HardwareVideoDecoderFactory.C02191.$SwitchMap$org$webrtc$VideoCodecType;
        r0 = r3.ordinal();
        r3 = r2[r0];
        r2 = 1;
        r0 = 0;
        switch(r3) {
            case 1: goto L_0x003e;
            case 2: goto L_0x002d;
            case 3: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        return r0;
    L_0x0012:
        r0 = "OMX.qcom.";
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x001a:
        r0 = "OMX.Intel.";
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x0022:
        r0 = "OMX.Exynos.";
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r2 = 0;
    L_0x002c:
        return r2;
    L_0x002d:
        r0 = "OMX.qcom.";
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x0035:
        r0 = "OMX.Exynos.";
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x003d:
        goto L_0x002c;
    L_0x003e:
        r0 = "OMX.qcom.";
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x0046:
        r0 = "OMX.Intel.";
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x004e:
        r0 = "OMX.Exynos.";
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x0056:
        r0 = "OMX.Nvidia.";
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x005e:
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.isHardwareSupported(android.media.MediaCodecInfo, org.webrtc.VideoCodecType):boolean");
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null) {
                return isHardwareSupported(mediaCodecInfo, videoCodecType);
            }
        }
        return false;
    }
}

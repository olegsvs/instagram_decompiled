package org.webrtc;

import X.AnonymousClass0Dc;
import X.AnonymousClass5Y8;
import X.AnonymousClass5bz;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14.Context;

public class GenericHardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final int H264_KEYFRAME_INTERVAL = 20;
    private static final String TAG = "GenericHardwareVideoEncoderFactory";
    private final AnonymousClass5bz mEncoderCompatProvider;
    private final Context mSharedContext;

    public GenericHardwareVideoEncoderFactory(EglBase.Context context, AnonymousClass5bz anonymousClass5bz) {
        this.mEncoderCompatProvider = anonymousClass5bz;
        if (context instanceof Context) {
            this.mSharedContext = (Context) context;
            return;
        }
        Logging.m29387w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
        this.mSharedContext = null;
    }

    private BitrateAdjuster createBitrateAdjuster(String str) {
        AnonymousClass5Y8 anonymousClass5Y8 = this.mEncoderCompatProvider;
        Object obj = (anonymousClass5Y8.uW(str) && "dynamic".equals(anonymousClass5Y8.f67232B)) ? 1 : null;
        if (obj != null) {
            return new DynamicBitrateAdjuster();
        }
        anonymousClass5Y8 = this.mEncoderCompatProvider;
        obj = (anonymousClass5Y8.uW(str) && "frame_rate".equals(anonymousClass5Y8.f67232B)) ? 1 : null;
        if (obj != null) {
            return new FramerateBitrateAdjuster();
        }
        return new BaseBitrateAdjuster();
    }

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecType valueOf = VideoCodecType.valueOf(videoCodecInfo.name);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = valueOf.mimeType();
        if (VERSION.SDK_INT >= 21 && !findCodecForType.getCapabilitiesForType(mimeType).getEncoderCapabilities().isBitrateModeSupported(2)) {
            videoCodecInfo.params.put("bitrate-mode", Integer.toString(1));
        }
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (selectColorFormat2 == null || selectColorFormat == null) {
            return null;
        }
        return new HardwareVideoEncoder(name, valueOf, selectColorFormat, selectColorFormat2, videoCodecInfo.params, 20, 0, createBitrateAdjuster(name), this.mSharedContext);
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
                AnonymousClass0Dc.Q(TAG, "Cannot retrieve encoder codec info", e);
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

    public VideoCodecInfo[] getSupportedCodecs() {
        List arrayList = new ArrayList();
        for (VideoCodecType videoCodecType : new VideoCodecType[]{VideoCodecType.H264}) {
            if (findCodecForType(videoCodecType) != null) {
                arrayList.add(new VideoCodecInfo(videoCodecType.name(), MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null) {
                return this.mEncoderCompatProvider.uW(mediaCodecInfo.getName());
            }
        }
        return false;
    }
}

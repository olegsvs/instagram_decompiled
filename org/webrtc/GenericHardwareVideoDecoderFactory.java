package org.webrtc;

import X.AnonymousClass0Dc;
import X.AnonymousClass4tg;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase.Context;

public class GenericHardwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "GenericHardwareVideoDecoderFactory";
    private final AnonymousClass4tg mCompatProvider;
    private final Context mSharedContext;

    public GenericHardwareVideoDecoderFactory(Context context, AnonymousClass4tg anonymousClass4tg) {
        this.mSharedContext = context;
        this.mCompatProvider = anonymousClass4tg;
    }

    public VideoDecoder createDecoder(String str) {
        VideoCodecType valueOf = VideoCodecType.valueOf(str);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(valueOf.mimeType()));
        if (selectColorFormat != null) {
            return new HardwareVideoDecoder(findCodecForType.getName(), valueOf, selectColorFormat.intValue(), this.mSharedContext);
        }
        return null;
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        if (VERSION.SDK_INT >= 19) {
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                MediaCodecInfo codecInfoAt;
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                } catch (Throwable e) {
                    AnonymousClass0Dc.Q(TAG, "Cannot retrieve encoder codec info", e);
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
        for (VideoCodecType videoCodecType : new VideoCodecType[]{VideoCodecType.H264}) {
            if (findCodecForType(videoCodecType) != null) {
                arrayList.add(new VideoCodecInfo(videoCodecType.name(), MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null) {
                return this.mCompatProvider.uW(mediaCodecInfo.getName());
            }
        }
        return false;
    }
}

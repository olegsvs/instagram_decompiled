package X;

import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.1P9 */
public final class AnonymousClass1P9 {
    /* renamed from: B */
    public static final Class f18122B = AnonymousClass1P9.class;

    /* renamed from: B */
    public static void m11240B(AnonymousClass0NN anonymousClass0NN, AudioCapabilities audioCapabilities) {
        if (audioCapabilities != null) {
            String M;
            anonymousClass0NN.m3298F("audio_bitrate_range", AnonymousClass1P9.m11245G(audioCapabilities.getBitrateRange()));
            anonymousClass0NN.m3294B("audio_max_input_channels", audioCapabilities.getMaxInputChannelCount());
            Range[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
            String str = "audio_supported_sample_rates";
            if (supportedSampleRateRanges != null) {
                M = AnonymousClass0IE.m2145M(",", Arrays.asList(supportedSampleRateRanges));
            } else {
                M = AnonymousClass0IE.m2146N(";", audioCapabilities.getSupportedSampleRates());
            }
            anonymousClass0NN.m3298F(str, M);
        }
    }

    /* renamed from: C */
    public static void m11241C(AnonymousClass0NN anonymousClass0NN, EncoderCapabilities encoderCapabilities) {
        if (encoderCapabilities != null) {
            anonymousClass0NN.m3298F("encoder_complexity_range", AnonymousClass1P9.m11245G(encoderCapabilities.getComplexityRange()));
            String str = "encoder_bitrate_modes";
            Collection arrayList = new ArrayList();
            if (encoderCapabilities.isBitrateModeSupported(2)) {
                arrayList.add("CBR");
            }
            if (encoderCapabilities.isBitrateModeSupported(1)) {
                arrayList.add("VBR");
            }
            if (encoderCapabilities.isBitrateModeSupported(0)) {
                arrayList.add("CQ");
            }
            anonymousClass0NN.m3298F(str, AnonymousClass0IE.m2145M(",", arrayList));
        }
    }

    /* renamed from: D */
    public static void m11242D(AnonymousClass0NN anonymousClass0NN, VideoCapabilities videoCapabilities) {
        if (videoCapabilities != null) {
            anonymousClass0NN.m3294B("video_height_alignment", videoCapabilities.getHeightAlignment());
            anonymousClass0NN.m3294B("video_width_alignment", videoCapabilities.getWidthAlignment());
            anonymousClass0NN.m3298F("video_bitrate_range", AnonymousClass1P9.m11245G(videoCapabilities.getBitrateRange()));
            anonymousClass0NN.m3298F("video_frame_rates", AnonymousClass1P9.m11245G(videoCapabilities.getSupportedFrameRates()));
            anonymousClass0NN.m3298F("video_supported_heights", AnonymousClass1P9.m11245G(videoCapabilities.getSupportedHeights()));
            anonymousClass0NN.m3298F("video_supported_widths", AnonymousClass1P9.m11245G(videoCapabilities.getSupportedWidths()));
            if (videoCapabilities.isSizeSupported(1280, 720)) {
                anonymousClass0NN.m3294B("video_hd_frame_rate", ((Double) videoCapabilities.getSupportedFrameRatesFor(1280, 720).getUpper()).intValue());
            }
        }
    }

    /* renamed from: E */
    public static String m11243E(CodecCapabilities codecCapabilities) {
        if (codecCapabilities.colorFormats != null) {
            if (codecCapabilities.colorFormats.length != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i : codecCapabilities.colorFormats) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(',');
                    }
                    stringBuilder.append(i);
                }
                return stringBuilder.toString();
            }
        }
        return null;
    }

    /* renamed from: F */
    public static String m11244F(CodecCapabilities codecCapabilities) {
        if (codecCapabilities.profileLevels != null) {
            if (codecCapabilities.profileLevels.length != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                for (CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(',');
                    }
                    stringBuilder.append('(');
                    stringBuilder.append(codecProfileLevel.profile);
                    stringBuilder.append(',');
                    stringBuilder.append(codecProfileLevel.level);
                    stringBuilder.append(')');
                }
                return stringBuilder.toString();
            }
        }
        return null;
    }

    /* renamed from: G */
    private static String m11245G(Object obj) {
        return obj == null ? null : obj.toString();
    }
}

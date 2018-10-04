package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";

    public static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (isLowLatencyInputSupported(context) != null) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinInputFrameSize(i, i2);
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        if (!WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
            return 256;
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    public static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (isLowLatencyOutputSupported(context) != null) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinOutputFrameSize(i, i2);
    }

    public static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m29383d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        audioManager = WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() ? getSampleRateOnJellyBeanMR10OrHigher(audioManager) : DEFAULT_SAMPLE_RATE_HZ;
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sample rate is set to ");
        stringBuilder.append(audioManager);
        stringBuilder.append(" Hz");
        Logging.m29383d(str, stringBuilder.toString());
        return audioManager;
    }

    private static int getSampleRateOnJellyBeanMR10OrHigher(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return DEFAULT_SAMPLE_RATE_HZ;
        }
        return Integer.parseInt(property);
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported(context);
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}

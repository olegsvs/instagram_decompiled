package org.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

public class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    public final AudioManager audioManager;
    private Timer timer;

    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            String str;
            StringBuilder stringBuilder;
            if (mode == 1) {
                str = VolumeLogger.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("STREAM_RING stream volume: ");
                stringBuilder.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                stringBuilder.append(" (max=");
                stringBuilder.append(this.maxRingVolume);
                stringBuilder.append(")");
                Logging.m29383d(str, stringBuilder.toString());
            } else if (mode == 3) {
                str = VolumeLogger.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("VOICE_CALL stream volume: ");
                stringBuilder.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                stringBuilder.append(" (max=");
                stringBuilder.append(this.maxVoiceCallVolume);
                stringBuilder.append(")");
                Logging.m29383d(str, stringBuilder.toString());
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("start");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        if (this.timer == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("audio mode is: ");
            stringBuilder.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            Logging.m29383d(str, stringBuilder.toString());
            this.timer = new Timer(THREAD_NAME);
            this.timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    public void stop() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stop");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}

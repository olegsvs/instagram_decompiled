package org.webrtc;

import android.content.Context;
import android.os.SystemClock;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoCapturer.CapturerObserver;
import org.webrtc.VideoFrame.Buffer;

public class FileVideoCapturer implements VideoCapturer {
    private static final String TAG = "FileVideoCapturer";
    private CapturerObserver capturerObserver;
    private final TimerTask tickTask = new C02171();
    private final Timer timer = new Timer();
    private final VideoReader videoReader;

    /* renamed from: org.webrtc.FileVideoCapturer$1 */
    public class C02171 extends TimerTask {
        public void run() {
            FileVideoCapturer.this.tick();
        }
    }

    public interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    public class VideoReaderY4M implements VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;

        public VideoReaderY4M(String str) {
            StringBuilder stringBuilder;
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder stringBuilder2 = new StringBuilder();
            while (true) {
                int read = this.mediaFile.read();
                if (read == -1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Found end of file before end of header for file: ");
                    stringBuilder.append(str);
                    throw new RuntimeException(stringBuilder.toString());
                } else if (read == 10) {
                    break;
                } else {
                    stringBuilder2.append((char) read);
                }
            }
            this.videoStart = this.mediaFileChannel.position();
            String[] split = stringBuilder2.toString().split("[ ]");
            String str2 = JsonProperty.USE_DEFAULT_NAME;
            int i = 0;
            int i2 = 0;
            for (String str3 : split) {
                char charAt = str3.charAt(0);
                if (charAt == 'C') {
                    str2 = str3.substring(1);
                } else if (charAt == 'H') {
                    i2 = Integer.parseInt(str3.substring(1));
                } else if (charAt == 'W') {
                    i = Integer.parseInt(str3.substring(1));
                }
            }
            String str32 = TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Color space: ");
            stringBuilder.append(str2);
            Logging.m29383d(str32, stringBuilder.toString());
            if (!str2.equals("420")) {
                if (!str2.equals("420mpeg2")) {
                    throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                }
            }
            if (i % 2 == 1 || i2 % 2 == 1) {
                throw new IllegalArgumentException("Does not support odd width or height");
            }
            this.frameWidth = i;
            this.frameHeight = i2;
            stringBuilder = new StringBuilder();
            stringBuilder.append("frame dim: (");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            stringBuilder.append(")");
            Logging.m29383d(str32, stringBuilder.toString());
        }

        public void close() {
            try {
                this.mediaFile.close();
            } catch (Throwable e) {
                Logging.m29385e(TAG, "Problem closing file", e);
            }
        }

        public VideoFrame getNextFrame() {
            long toNanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            Buffer allocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            allocate.getStrideY();
            allocate.getStrideU();
            allocate.getStrideV();
            try {
                RuntimeException runtimeException;
                ByteBuffer allocate2 = ByteBuffer.allocate(FRAME_DELIMETER_LENGTH);
                if (this.mediaFileChannel.read(allocate2) < FRAME_DELIMETER_LENGTH) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < FRAME_DELIMETER_LENGTH) {
                        runtimeException = new RuntimeException("Error looping video");
                        throw runtimeException;
                    }
                }
                String str = new String(allocate2.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(allocate, 0, toNanos);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Frames should be delimited by FRAME plus newline, found delimter was: '");
                stringBuilder.append(str);
                stringBuilder.append("'");
                runtimeException = new RuntimeException(stringBuilder.toString());
                throw runtimeException;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
    }

    public boolean isScreencast() {
        return false;
    }

    public FileVideoCapturer(String str) {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not open video file: ");
            stringBuilder.append(str);
            Logging.m29383d(TAG, stringBuilder.toString());
            throw e;
        }
    }

    public void dispose() {
        this.videoReader.close();
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    public void startCapture(int i, int i2, int i3) {
        this.timer.schedule(this.tickTask, 0, (long) (JsonMappingException.MAX_REFS_TO_LIST / i3));
    }

    public void stopCapture() {
        this.timer.cancel();
    }

    public void tick() {
        this.capturerObserver.onFrameCaptured(this.videoReader.getNextFrame());
    }
}

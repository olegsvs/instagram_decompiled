package org.webrtc;

import X.AnonymousClass0OR;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase.-CC;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.Buffer;

public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    public EglBase eglBase;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private ArrayList rawFrames = new ArrayList();
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i, int i2, final Context context) {
        if (i % 2 == 1 || i2 % 2 == 1) {
            throw new IllegalArgumentException("Does not support uneven width or height");
        }
        this.outputFileName = str;
        this.outputFileWidth = i;
        this.outputFileHeight = i2;
        int i3 = ((i * i2) * 3) / 2;
        this.outputFrameSize = i3;
        this.outputFrameBuffer = ByteBuffer.allocateDirect(i3);
        this.videoOutFile = new FileOutputStream(str);
        FileOutputStream fileOutputStream = this.videoOutFile;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YUV4MPEG2 C420 W");
        stringBuilder.append(i);
        stringBuilder.append(" H");
        stringBuilder.append(i2);
        stringBuilder.append(" Ip F30:1 A1:1\n");
        fileOutputStream.write(stringBuilder.toString().getBytes(Charset.forName("US-ASCII")));
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.renderThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.renderThread.getLooper());
        this.renderThreadHandler = handler;
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            public void run() {
                VideoFileRenderer.this.eglBase = -CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                VideoFileRenderer.this.eglBase.makeCurrent();
                VideoFileRenderer.this.yuvConverter = new YuvConverter();
            }
        });
    }

    public static /* synthetic */ void lambda$release$1(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        videoFileRenderer.yuvConverter.release();
        videoFileRenderer.eglBase.release();
        videoFileRenderer.renderThread.quit();
        countDownLatch.countDown();
    }

    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        AnonymousClass0OR.D(this.renderThreadHandler, new -$$Lambda$VideoFileRenderer$bKgq7kthmTRkJZ0wD92QUSGMogk(this, videoFrame), -1011174237);
    }

    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass0OR.D(this.renderThreadHandler, new -$$Lambda$VideoFileRenderer$QCcb-LtaypWf6FFZgygvKhIn8Qw(this, countDownLatch), 1278463003);
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        try {
            Iterator it = this.rawFrames.iterator();
            while (it.hasNext()) {
                ByteBuffer byteBuffer = (ByteBuffer) it.next();
                this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
                byte[] bArr = new byte[this.outputFrameSize];
                byteBuffer.get(bArr);
                this.videoOutFile.write(bArr);
                JniCommon.nativeFreeByteBuffer(byteBuffer);
            }
            this.videoOutFile.close();
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Video written to disk as ");
            stringBuilder.append(this.outputFileName);
            stringBuilder.append(". Number frames are ");
            stringBuilder.append(this.rawFrames.size());
            stringBuilder.append(" and the dimension of the frames are ");
            stringBuilder.append(this.outputFileWidth);
            stringBuilder.append("x");
            stringBuilder.append(this.outputFileHeight);
            stringBuilder.append(".");
            Logging.m29383d(str, stringBuilder.toString());
        } catch (Throwable e) {
            Logging.m29385e(TAG, "Error writing video to disk", e);
        }
    }

    public static void renderFrameOnRenderThread(VideoFileRenderer videoFileRenderer, VideoFrame videoFrame) {
        Buffer buffer = videoFrame.getBuffer();
        int i = videoFrame.getRotation() % 180 == 0 ? videoFileRenderer.outputFileWidth : videoFileRenderer.outputFileHeight;
        int i2 = videoFrame.getRotation() % 180 == 0 ? videoFileRenderer.outputFileHeight : videoFileRenderer.outputFileWidth;
        float width = ((float) buffer.getWidth()) / ((float) buffer.getHeight());
        float f = ((float) i) / ((float) i2);
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) (((float) height) * (width / f));
        } else {
            width2 = (int) (((float) width2) * (f / width));
        }
        Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i, i2);
        videoFrame.release();
        Buffer toI420 = cropAndScale.toI420();
        cropAndScale.release();
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(videoFileRenderer.outputFrameSize);
        YuvHelper.I420Rotate(toI420.getDataY(), toI420.getStrideY(), toI420.getDataU(), toI420.getStrideU(), toI420.getDataV(), toI420.getStrideV(), nativeAllocateByteBuffer, toI420.getWidth(), toI420.getHeight(), videoFrame.getRotation());
        toI420.release();
        nativeAllocateByteBuffer.rewind();
        videoFileRenderer.rawFrames.add(nativeAllocateByteBuffer);
    }
}

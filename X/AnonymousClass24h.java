package X;

import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaDemuxer.Options;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: X.24h */
public final class AnonymousClass24h {
    /* renamed from: B */
    public static float m14348B(File file, File file2, Options options) {
        file2.getCanonicalPath();
        AnonymousClass1ud anonymousClass1ud = AnonymousClass24g.f25652B;
        FFMpegMediaDemuxer fFMpegMediaDemuxer = new FFMpegMediaDemuxer(anonymousClass1ud, file.getAbsolutePath(), options);
        fFMpegMediaDemuxer.initialize();
        FFMpegMediaMuxer fFMpegMediaMuxer;
        try {
            int i;
            int i2 = 0;
            fFMpegMediaMuxer = new FFMpegMediaMuxer(anonymousClass1ud, file2.getAbsolutePath(), false);
            fFMpegMediaMuxer.initialize();
            FFMpegMediaFormat[] fFMpegMediaFormatArr = new FFMpegMediaFormat[fFMpegMediaDemuxer.getTrackCount()];
            FFMpegAVStream[] fFMpegAVStreamArr = new FFMpegAVStream[fFMpegMediaDemuxer.getTrackCount()];
            long[] jArr = new long[fFMpegMediaDemuxer.getTrackCount()];
            for (i = 0; i < fFMpegAVStreamArr.length; i++) {
                FFMpegMediaFormat trackFormat = fFMpegMediaDemuxer.getTrackFormat(i);
                fFMpegMediaFormatArr[i] = trackFormat;
                fFMpegAVStreamArr[i] = fFMpegMediaMuxer.addStream(trackFormat);
                jArr[i] = Long.MIN_VALUE;
                fFMpegMediaDemuxer.selectTrack(i);
            }
            fFMpegMediaMuxer.start();
            for (int i3 = 0; i3 < fFMpegMediaFormatArr.length; i3++) {
                ByteBuffer byteBuffer = fFMpegMediaFormatArr[i3].getByteBuffer("csd-0");
                if (byteBuffer != null) {
                    FFMpegBufferInfo fFMpegBufferInfo = new FFMpegBufferInfo();
                    fFMpegBufferInfo.set(0, byteBuffer.capacity(), 0, 2);
                    fFMpegAVStreamArr[i3].writeFrame(fFMpegBufferInfo, byteBuffer);
                }
            }
            long j = 0;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            while (true) {
                int readSampleData = fFMpegMediaDemuxer.readSampleData(allocateDirect, i2);
                if (readSampleData == -1) {
                    break;
                }
                i = fFMpegMediaDemuxer.getSampleTrackIndex();
                options = fFMpegMediaDemuxer.getSampleFlags();
                long sampleTime = fFMpegMediaDemuxer.getSampleTime();
                long sampleDuration = fFMpegMediaDemuxer.getSampleDuration();
                if (sampleTime == jArr[i]) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Number of tracks: ");
                    stringBuilder.append(fFMpegMediaFormatArr.length);
                    stringBuilder.append(", Track index: ");
                    stringBuilder.append(i);
                    stringBuilder.append(", Track media format: ");
                    stringBuilder.append(fFMpegMediaFormatArr[i].toString());
                    stringBuilder.append(", Sample time: ");
                    stringBuilder.append(sampleTime);
                    AnonymousClass0Gn.H("ffmpeg_muxer_invalid_sample_time", stringBuilder.toString());
                } else {
                    jArr[i] = sampleTime;
                    FFMpegBufferInfo fFMpegBufferInfo2 = new FFMpegBufferInfo();
                    FFMpegBufferInfo fFMpegBufferInfo3 = fFMpegBufferInfo2;
                    fFMpegBufferInfo2.set(0, readSampleData, sampleTime, options);
                    fFMpegAVStreamArr[i].writeFrame(fFMpegBufferInfo3, allocateDirect);
                    j = Math.max(j, sampleTime + sampleDuration);
                }
                if (!fFMpegMediaDemuxer.advance()) {
                    break;
                }
                i2 = 0;
            }
            float f = ((float) j) / 1000000.0f;
            fFMpegMediaMuxer.stop();
            fFMpegMediaDemuxer.release();
            return f;
        } catch (Throwable th) {
            fFMpegMediaDemuxer.release();
        }
    }
}

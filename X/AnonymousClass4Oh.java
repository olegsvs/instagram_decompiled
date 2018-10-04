package X;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.4Oh */
public final class AnonymousClass4Oh implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Ol f53591B;
    /* renamed from: C */
    public final /* synthetic */ String f53592C;

    public AnonymousClass4Oh(AnonymousClass4Ol anonymousClass4Ol, String str) {
        this.f53591B = anonymousClass4Ol;
        this.f53592C = str;
    }

    public final void run() {
        int i;
        File file;
        File createTempFile;
        Throwable th;
        File file2 = this.f53591B.f53611R;
        String[] list = file2.list();
        Collection arrayList = new ArrayList();
        for (String file3 : list) {
            String file32;
            arrayList.add(new File(file2, file32));
        }
        Collections.sort(arrayList, new AnonymousClass4Ok());
        if (AnonymousClass2NI.m15314B(arrayList, r4.f53591B.f53606M, true) == 0.0f) {
            r4.f53591B.m24096C(r4.f53592C);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("stitched video has duration 0 files: ");
            stringBuilder.append(AnonymousClass0IE.M(",", arrayList));
            AnonymousClass0Gn.C("ReverseCaptureController#onReverseFinished videoStitching failed", stringBuilder.toString());
            return;
        }
        MediaExtractor mediaExtractor;
        MediaCodec mediaCodec;
        boolean z = false;
        if (AnonymousClass4Ol.m24091B()) {
            try {
                byte[] toByteArray = r4.f53591B.f53595B.toByteArray();
                r4.f53591B.f53595B = null;
                short[] sArr = new short[(toByteArray.length / 2)];
                ByteBuffer.wrap(toByteArray).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
                AnonymousClass4KB.m23865C(sArr, 0, sArr.length);
                ByteBuffer.wrap(toByteArray).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr);
                File file4 = r4.f53591B.f53606M;
                file = file4;
                int i2 = 44100;
                MediaMuxer mediaMuxer = null;
                try {
                    MediaFormat createAudioFormat;
                    long parseLong;
                    createTempFile = File.createTempFile("audio_muxing_temp", ".mp4", file4.getParentFile());
                    try {
                        createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
                        createAudioFormat.setInteger(TraceFieldType.Bitrate, 64000);
                        createAudioFormat.setInteger("aac-profile", 1);
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(file4.getAbsolutePath());
                        file32 = mediaMetadataRetriever.extractMetadata(9);
                        parseLong = file32 != null ? Long.parseLong(file32) * 1000 : 15000000;
                        mediaMetadataRetriever.release();
                        mediaExtractor = new MediaExtractor();
                    } catch (Throwable th2) {
                        th = th2;
                        mediaExtractor = null;
                        mediaCodec = null;
                        if (mediaMuxer != null) {
                            mediaMuxer.release();
                            try {
                            } catch (Throwable e) {
                                AnonymousClass0Gn.L("AudioProcessingUtil#muxAudioDataToVideoFile failed to release MediaMuxer", e);
                            }
                        }
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                            try {
                            } catch (Throwable e2) {
                                AnonymousClass0Gn.L("AudioProcessingUtil#muxAudioDataToVideoFile failed to release MediaExtractor", e2);
                            }
                        }
                        if (mediaCodec != null) {
                            mediaCodec.release();
                            try {
                            } catch (Throwable e22) {
                                AnonymousClass0Gn.L("AudioProcessingUtil#muxAudioDataToVideoFile failed to release MediaCodec", e22);
                            }
                        }
                        if (createTempFile != null) {
                            createTempFile.renameTo(file);
                        }
                        throw th;
                    }
                    try {
                        MediaFormat trackFormat;
                        mediaExtractor.setDataSource(file4.getAbsolutePath());
                        for (i = 0; i < mediaExtractor.getTrackCount(); i++) {
                            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                                trackFormat = mediaExtractor.getTrackFormat(i);
                                mediaExtractor.selectTrack(i);
                                break;
                            }
                        }
                        trackFormat = null;
                        if (trackFormat != null) {
                            mediaCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");
                            try {
                                mediaCodec.configure(createAudioFormat, null, null, 1);
                                mediaCodec.start();
                                ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
                                ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                                MediaMuxer mediaMuxer2 = new MediaMuxer(createTempFile.getAbsolutePath(), 0);
                                try {
                                    int addTrack = mediaMuxer2.addTrack(trackFormat);
                                    BufferInfo bufferInfo = new BufferInfo();
                                    int i3 = 0;
                                    int i4 = 0;
                                    Object obj = null;
                                    long j = 0;
                                    while (true) {
                                        long j2;
                                        int dequeueOutputBuffer;
                                        if (obj == null) {
                                            try {
                                                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000);
                                                if (dequeueInputBuffer != -1) {
                                                    if (i4 != toByteArray.length) {
                                                        if (j < parseLong) {
                                                            int min = Math.min(inputBuffers[dequeueInputBuffer].capacity() + i4, toByteArray.length);
                                                            int i5 = min - i4;
                                                            j += (((long) (i5 / AnonymousClass4KB.m23864B(2))) * 1000000) / ((long) i2);
                                                            inputBuffers[dequeueInputBuffer].put(toByteArray, i4, i5);
                                                            try {
                                                                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i5, j, 0);
                                                                i4 = min;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                            }
                                                        }
                                                    }
                                                    mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                                                    j2 = 10000;
                                                    obj = 1;
                                                    dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
                                                    if (dequeueOutputBuffer == -1) {
                                                        if (dequeueOutputBuffer == -2) {
                                                            i3 = mediaMuxer2.addTrack(mediaCodec.getOutputFormat());
                                                            mediaMuxer2.start();
                                                        } else if (dequeueOutputBuffer != -3) {
                                                            outputBuffers = mediaCodec.getOutputBuffers();
                                                        } else if ((bufferInfo.flags & 4) != 0) {
                                                            break;
                                                        } else {
                                                            mediaMuxer2.writeSampleData(i3, outputBuffers[dequeueOutputBuffer], bufferInfo);
                                                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                        }
                                                    }
                                                    i2 = 44100;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        j2 = 10000;
                                        dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
                                        if (dequeueOutputBuffer == -1) {
                                            if (dequeueOutputBuffer == -2) {
                                                i3 = mediaMuxer2.addTrack(mediaCodec.getOutputFormat());
                                                mediaMuxer2.start();
                                            } else if (dequeueOutputBuffer != -3) {
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    break;
                                                }
                                                mediaMuxer2.writeSampleData(i3, outputBuffers[dequeueOutputBuffer], bufferInfo);
                                                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            } else {
                                                outputBuffers = mediaCodec.getOutputBuffers();
                                            }
                                        }
                                        i2 = 44100;
                                    }
                                    ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                    BufferInfo bufferInfo2 = new BufferInfo();
                                    try {
                                        mediaExtractor.seekTo(0, 2);
                                        while (true) {
                                            bufferInfo2.offset = 0;
                                            bufferInfo2.size = mediaExtractor.readSampleData(allocate, 0);
                                            if (bufferInfo2.size < 0) {
                                                mediaMuxer2.release();
                                                try {
                                                } catch (Throwable e222) {
                                                    AnonymousClass0Gn.L("AudioProcessingUtil#muxAudioDataToVideoFile failed to release MediaMuxer", e222);
                                                }
                                            } else {
                                                bufferInfo2.presentationTimeUs = mediaExtractor.getSampleTime();
                                                bufferInfo2.flags = mediaExtractor.getSampleFlags();
                                                mediaMuxer2.writeSampleData(addTrack, allocate, bufferInfo2);
                                                mediaExtractor.advance();
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    mediaMuxer = mediaMuxer2;
                                    if (mediaMuxer != null) {
                                        mediaMuxer.release();
                                    }
                                    if (mediaExtractor != null) {
                                        mediaExtractor.release();
                                    }
                                    if (mediaCodec != null) {
                                        mediaCodec.release();
                                    }
                                    if (createTempFile != null) {
                                        createTempFile.renameTo(file);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                if (mediaMuxer != null) {
                                    mediaMuxer.release();
                                }
                                if (mediaExtractor != null) {
                                    mediaExtractor.release();
                                }
                                if (mediaCodec != null) {
                                    mediaCodec.release();
                                }
                                if (createTempFile != null) {
                                    createTempFile.renameTo(file);
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("failed to select video track from input file");
                    } catch (Throwable th8) {
                        th = th8;
                        mediaCodec = null;
                        if (mediaMuxer != null) {
                            mediaMuxer.release();
                        }
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        if (createTempFile != null) {
                            createTempFile.renameTo(file);
                        }
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    createTempFile = null;
                    mediaExtractor = null;
                    mediaCodec = null;
                    if (mediaMuxer != null) {
                        mediaMuxer.release();
                    }
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    if (createTempFile != null) {
                        createTempFile.renameTo(file);
                    }
                    throw th;
                }
            } catch (Throwable e2222) {
                AnonymousClass0Gn.L("reverseCaptureAudioMuxingFailed", e2222);
            }
        }
        r4.f53591B.f53602I.A();
        AnonymousClass0OR.D(r4.f53591B.f53609P, new AnonymousClass4Og(r4, z), 1060500009);
        return;
        if (createTempFile != null) {
            createTempFile.renameTo(file);
        }
        z = true;
        r4.f53591B.f53602I.A();
        AnonymousClass0OR.D(r4.f53591B.f53609P, new AnonymousClass4Og(r4, z), 1060500009);
        return;
        if (mediaCodec != null) {
            mediaCodec.release();
            try {
            } catch (Throwable e22222) {
                AnonymousClass0Gn.L("AudioProcessingUtil#muxAudioDataToVideoFile failed to release MediaCodec", e22222);
            }
        }
        if (createTempFile != null) {
            createTempFile.renameTo(file);
        }
        z = true;
        r4.f53591B.f53602I.A();
        AnonymousClass0OR.D(r4.f53591B.f53609P, new AnonymousClass4Og(r4, z), 1060500009);
        return;
        mediaExtractor.release();
        try {
        } catch (Throwable e222222) {
            AnonymousClass0Gn.L("AudioProcessingUtil#muxAudioDataToVideoFile failed to release MediaExtractor", e222222);
        }
    }
}

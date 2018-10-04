package com.facebook.cameracore.mediapipeline.services.video.implementation;

import X.AnonymousClass0GG;
import X.AnonymousClass1uu;
import X.AnonymousClass2kJ;
import X.AnonymousClass2kK;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class VideoPlaybackItem implements OnFrameAvailableListener, OnErrorListener, OnPreparedListener {
    public final AtomicInteger mAvailableFrames;
    private final ExecutorService mBackgroundThread;
    public final AtomicBoolean mHasError;
    private boolean mIsLooping;
    public volatile boolean mIsPrepared = false;
    public final MediaPlayer mMediaPlayer;
    private final float[] mSMatrix = new float[16];
    private volatile boolean mStartRequested = false;
    public Surface mSurface;
    public SurfaceTexture mSurfaceTexture;
    public AnonymousClass1uu mTexture;
    private final VideoFrame mVideoFrame = new VideoFrame();
    public final String mVideoUri;

    public VideoPlaybackItem(String str, ExecutorService executorService) {
        this.mVideoUri = str;
        this.mAvailableFrames = new AtomicInteger(0);
        this.mHasError = new AtomicBoolean(false);
        this.mBackgroundThread = executorService;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnErrorListener(this);
        Matrix.setIdentityM(this.mSMatrix, 0);
    }

    public int getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    public boolean getHasError() {
        return this.mHasError.getAndSet(false);
    }

    public long getPosition() {
        return (long) this.mMediaPlayer.getCurrentPosition();
    }

    public VideoFrame getVideoFrameIfAvailable() {
        int i = 0;
        int andSet = this.mAvailableFrames.getAndSet(0);
        if (andSet <= 0 || this.mSurface == null || this.mTexture == null || this.mSurfaceTexture == null) {
            return null;
        }
        while (i < andSet) {
            this.mSurfaceTexture.updateTexImage();
            i++;
        }
        this.mSurfaceTexture.getTransformMatrix(this.mSMatrix);
        this.mVideoFrame.update(this.mTexture.f24087C, this.mTexture.f24088D, this.mSMatrix, (long) this.mMediaPlayer.getCurrentPosition());
        return this.mVideoFrame;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.mHasError.set(true);
        return false;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mAvailableFrames.incrementAndGet();
    }

    public void onPrepared(android.media.MediaPlayer r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        r1 = r2.mMediaPlayer;
        r0 = r2.mIsLooping;
        r1.setLooping(r0);
        r1 = new X.1ut;
        r1.<init>();
        r0 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r1.f24084I = r0;
        r0 = r1.m13709A();
        r2.mTexture = r0;
        r1 = new android.graphics.SurfaceTexture;
        r0 = r2.mTexture;
        r0 = r0.f24087C;
        r1.<init>(r0);
        r2.mSurfaceTexture = r1;
        r1.setOnFrameAvailableListener(r2);
        r1 = new android.view.Surface;
        r0 = r2.mSurfaceTexture;
        r1.<init>(r0);
        r2.mSurface = r1;
        r1 = r2.mMediaPlayer;
        r0 = r2.mSurface;
        r1.setSurface(r0);
        r1 = 1;
        r2.mIsPrepared = r1;
        r0 = r2.mStartRequested;
        if (r0 == 0) goto L_0x0047;
    L_0x003c:
        r0 = r2.mMediaPlayer;	 Catch:{ IllegalStateException -> 0x0042 }
        r0.start();	 Catch:{ IllegalStateException -> 0x0042 }
        goto L_0x0047;	 Catch:{ IllegalStateException -> 0x0042 }
    L_0x0042:
        r0 = r2.mHasError;
        r0.set(r1);
    L_0x0047:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem.onPrepared(android.media.MediaPlayer):void");
    }

    public void pause() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.mMediaPlayer;	 Catch:{ IllegalStateException -> 0x0006 }
        r0.pause();	 Catch:{ IllegalStateException -> 0x0006 }
        goto L_0x000c;	 Catch:{ IllegalStateException -> 0x0006 }
    L_0x0006:
        r1 = r1.mHasError;
        r0 = 1;
        r1.set(r0);
    L_0x000c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem.pause():void");
    }

    public void prepare() {
        AnonymousClass0GG.B(this.mBackgroundThread, new AnonymousClass2kJ(this), -89104775);
    }

    public void resume() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        r1 = 1;
        r2.mStartRequested = r1;
        r0 = r2.mIsPrepared;
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r2.mMediaPlayer;	 Catch:{ IllegalStateException -> 0x000d }
        r0.start();	 Catch:{ IllegalStateException -> 0x000d }
        goto L_0x0012;	 Catch:{ IllegalStateException -> 0x000d }
    L_0x000d:
        r0 = r2.mHasError;
        r0.set(r1);
    L_0x0012:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem.resume():void");
    }

    public void seek(int i) {
        this.mMediaPlayer.seekTo(i);
    }

    public void setLooping(boolean z) {
        this.mIsLooping = z;
        if (this.mMediaPlayer != null && this.mIsPrepared) {
            this.mMediaPlayer.setLooping(z);
        }
    }

    public void teardown() {
        if (!this.mBackgroundThread.isShutdown()) {
            AnonymousClass0GG.B(this.mBackgroundThread, new AnonymousClass2kK(this), -1802356885);
        }
    }
}

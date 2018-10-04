package org.webrtc;

import java.util.ArrayList;
import java.util.List;

public class MediaStream {
    private static final String TAG = "MediaStream";
    public final List audioTracks = new ArrayList();
    public final long nativeStream;
    public final List preservedVideoTracks = new ArrayList();
    public final List videoTracks = new ArrayList();

    private static native boolean nativeAddAudioTrackToNativeStream(long j, long j2);

    private static native boolean nativeAddVideoTrackToNativeStream(long j, long j2);

    private static native String nativeGetId(long j);

    private static native boolean nativeRemoveAudioTrack(long j, long j2);

    private static native boolean nativeRemoveVideoTrack(long j, long j2);

    public MediaStream(long j) {
        this.nativeStream = j;
    }

    public void addNativeAudioTrack(long j) {
        this.audioTracks.add(new AudioTrack(j));
    }

    public void addNativeVideoTrack(long j) {
        this.videoTracks.add(new VideoTrack(j));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.nativeTrack)) {
            return false;
        }
        this.preservedVideoTracks.add(videoTrack);
        return true;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        if (!nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.nativeTrack)) {
            return false;
        }
        this.audioTracks.add(audioTrack);
        return true;
    }

    public boolean addTrack(VideoTrack videoTrack) {
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.nativeTrack)) {
            return false;
        }
        this.videoTracks.add(videoTrack);
        return true;
    }

    public void dispose() {
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = (AudioTrack) this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = (VideoTrack) this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack((VideoTrack) this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(this.nativeStream);
    }

    public String getId() {
        return nativeGetId(this.nativeStream);
    }

    public void removeAudioTrack(long j) {
        removeMediaStreamTrack(this.audioTracks, j);
    }

    private static void removeMediaStreamTrack(List list, long j) {
        list = list.iterator();
        while (list.hasNext()) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) list.next();
            if (mediaStreamTrack.nativeTrack == j) {
                mediaStreamTrack.dispose();
                list.remove();
                return;
            }
        }
        Logging.m29384e(TAG, "Couldn't not find track");
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.nativeTrack);
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.nativeTrack);
    }

    public void removeVideoTrack(long j) {
        removeMediaStreamTrack(this.videoTracks, j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(getId());
        stringBuilder.append(":A=");
        stringBuilder.append(this.audioTracks.size());
        stringBuilder.append(":V=");
        stringBuilder.append(this.videoTracks.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

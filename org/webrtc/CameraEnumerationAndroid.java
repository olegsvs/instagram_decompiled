package org.webrtc;

import android.graphics.ImageFormat;
import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CameraEnumerationAndroid {
    public static final ArrayList COMMON_RESOLUTIONS = new ArrayList(Arrays.asList(new Size[]{new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(400, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, 640), new Size(DexStore.LOAD_RESULT_MIXED_MODE, 576), new Size(DexStore.LOAD_RESULT_MIXED_MODE, 600), new Size(1280, 720), new Size(1280, DexStore.LOAD_RESULT_MIXED_MODE), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)}));
    private static final String TAG = "CameraEnumerationAndroid";

    public class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min == framerateRange.min && this.max == framerateRange.max) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return ((this.min * 65537) + 1) + this.max;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                stringBuilder.append(((float) this.min) / 1000.0f);
                stringBuilder.append(":");
                stringBuilder.append(((float) this.max) / 1000.0f);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate)) {
                return true;
            }
            return false;
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public int hashCode() {
            return ((((this.width * 65497) + this.height) * 251) + 1) + this.framerate.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.width);
            stringBuilder.append("x");
            stringBuilder.append(this.height);
            stringBuilder.append("@");
            stringBuilder.append(this.framerate);
            return stringBuilder.toString();
        }
    }

    public abstract class ClosestComparator implements Comparator {
        public abstract int diff(Object obj);

        public int compare(Object obj, Object obj2) {
            return diff(obj) - diff(obj2);
        }
    }

    /* renamed from: org.webrtc.CameraEnumerationAndroid$1 */
    public class C02571 extends ClosestComparator {
        private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
        private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
        private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
        private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
        private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
        private static final int MIN_FPS_THRESHOLD = 8000;
        public final /* synthetic */ int val$requestedFps;

        private int progressivePenalty(int i, int i2, int i3, int i4) {
            if (i < i2) {
                return i * i3;
            }
            return ((i - i2) * i4) + (i3 * i2);
        }

        public C02571(int i) {
            this.val$requestedFps = i;
        }

        public int diff(FramerateRange framerateRange) {
            return progressivePenalty(framerateRange.min, MIN_FPS_THRESHOLD, 1, 4) + progressivePenalty(Math.abs((this.val$requestedFps * JsonMappingException.MAX_REFS_TO_LIST) - framerateRange.max), MAX_FPS_DIFF_THRESHOLD, 1, 3);
        }
    }

    /* renamed from: org.webrtc.CameraEnumerationAndroid$2 */
    public class C02582 extends ClosestComparator {
        public final /* synthetic */ int val$requestedHeight;
        public final /* synthetic */ int val$requestedWidth;

        public C02582(int i, int i2) {
            this.val$requestedWidth = i;
            this.val$requestedHeight = i2;
        }

        public int diff(Size size) {
            return Math.abs(this.val$requestedWidth - size.width) + Math.abs(this.val$requestedHeight - size.height);
        }
    }

    public static FramerateRange getClosestSupportedFramerateRange(List list, int i) {
        return (FramerateRange) Collections.min(list, new C02571(i));
    }

    public static Size getClosestSupportedSize(List list, int i, int i2) {
        return (Size) Collections.min(list, new C02582(i, i2));
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}

package org.webrtc;

import X.AnonymousClass09F;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;

public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public Camera1Enumerator(boolean z) {
        this.captureToTexture = z;
    }

    public static List convertFramerates(List list) {
        List arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List convertSizes(List list) {
        List arrayList = new ArrayList();
        for (Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    public CameraVideoCapturer createCapturer(String str, CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    private static List enumerateFormats(int i) {
        Throwable e;
        List arrayList;
        Throwable th;
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Get supported formats for camera index ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        Logging.m29383d(str, stringBuilder.toString());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Opening camera with index ");
            stringBuilder.append(i);
            Logging.m29383d(str, stringBuilder.toString());
            camera = AnonymousClass09F.B(i, 1463458924);
            try {
                Parameters parameters = camera.getParameters();
                if (camera != null) {
                    AnonymousClass09F.C(camera, -432250147);
                }
                List arrayList2 = new ArrayList();
                try {
                    int i2;
                    List supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i3 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = (int[]) supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i3 = iArr[0];
                        i2 = iArr[1];
                    } else {
                        i2 = 0;
                    }
                    for (Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList2.add(new CaptureFormat(size.width, size.height, i3, i2));
                    }
                } catch (Throwable e2) {
                    str = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("getSupportedFormats() failed on camera index ");
                    stringBuilder.append(i);
                    Logging.m29385e(str, stringBuilder.toString(), e2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                String str2 = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Get supported formats for camera index ");
                stringBuilder.append(i);
                stringBuilder.append(" done. Time spent: ");
                stringBuilder.append(elapsedRealtime2 - elapsedRealtime);
                stringBuilder.append(" ms.");
                Logging.m29383d(str2, stringBuilder.toString());
                return arrayList2;
            } catch (RuntimeException e3) {
                e2 = e3;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Open camera failed on camera index ");
                    stringBuilder.append(i);
                    Logging.m29385e(str, stringBuilder.toString(), e2);
                    arrayList = new ArrayList();
                    if (camera != null) {
                        AnonymousClass09F.C(camera, 597744114);
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (camera != null) {
                        AnonymousClass09F.C(camera, -1588847567);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (camera != null) {
                    AnonymousClass09F.C(camera, -1588847567);
                }
                throw th;
            }
        } catch (RuntimeException e4) {
            e2 = e4;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Open camera failed on camera index ");
            stringBuilder.append(i);
            Logging.m29385e(str, stringBuilder.toString(), e2);
            arrayList = new ArrayList();
            if (camera != null) {
                AnonymousClass09F.C(camera, 597744114);
            }
            return arrayList;
        }
    }

    public static int getCameraIndex(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getCameraIndex: ");
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No such camera: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static CameraInfo getCameraInfo(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Throwable e) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getCameraInfo failed on index ");
            stringBuilder.append(i);
            Logging.m29385e(str, stringBuilder.toString(), e);
            return null;
        }
    }

    public static String getDeviceName(int i) {
        CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        String str = cameraInfo.facing == 1 ? "front" : "back";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Camera ");
        stringBuilder.append(i);
        stringBuilder.append(", Facing ");
        stringBuilder.append(str);
        stringBuilder.append(", Orientation ");
        stringBuilder.append(cameraInfo.orientation);
        return stringBuilder.toString();
    }

    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            String str;
            StringBuilder stringBuilder;
            if (deviceName != null) {
                arrayList.add(deviceName);
                str = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Index: ");
                stringBuilder.append(i);
                stringBuilder.append(". ");
                stringBuilder.append(deviceName);
                Logging.m29383d(str, stringBuilder.toString());
            } else {
                str = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Index: ");
                stringBuilder.append(i);
                stringBuilder.append(". Failed to query camera name.");
                Logging.m29384e(str, stringBuilder.toString());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static synchronized List getSupportedFormats(int i) {
        List list;
        synchronized (Camera1Enumerator.class) {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                    cachedSupportedFormats.add(enumerateFormats(i2));
                }
            }
            list = (List) cachedSupportedFormats.get(i);
        }
        return list;
    }

    public List getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    public boolean isBackFacing(String str) {
        CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    public boolean isFrontFacing(String str) {
        CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 1) {
            return null;
        }
        return true;
    }
}

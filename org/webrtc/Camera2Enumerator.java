package org.webrtc;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.util.AndroidException;
import android.util.Range;
import android.util.Size;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;

public class Camera2Enumerator implements CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final String TAG = "Camera2Enumerator";
    private static final Map cachedSupportedFormats = new HashMap();
    public final CameraManager cameraManager;
    public final Context context;

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    public static List convertFramerates(Range[] rangeArr, int i) {
        List arrayList = new ArrayList();
        for (Range range : rangeArr) {
            arrayList.add(new FramerateRange(((Integer) range.getLower()).intValue() * i, ((Integer) range.getUpper()).intValue() * i));
        }
        return arrayList;
    }

    private static List convertSizes(Size[] sizeArr) {
        List arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public CameraVideoCapturer createCapturer(String str, CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (String str2) {
            String str3 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Camera access exception: ");
            stringBuilder.append(str2);
            Logging.m29384e(str3, stringBuilder.toString());
            return null;
        }
    }

    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (AndroidException e) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Camera access exception: ");
            stringBuilder.append(e);
            Logging.m29384e(str, stringBuilder.toString());
            return new String[0];
        }
    }

    public static int getFpsUnitFactor(Range[] rangeArr) {
        if (rangeArr.length == 0) {
            return JsonMappingException.MAX_REFS_TO_LIST;
        }
        if (((Integer) rangeArr[0].getUpper()).intValue() < JsonMappingException.MAX_REFS_TO_LIST) {
            return JsonMappingException.MAX_REFS_TO_LIST;
        }
        return 1;
    }

    public static List getSupportedFormats(Context context, String str) {
        return getSupportedFormats((CameraManager) context.getSystemService("camera"), str);
    }

    public static java.util.List getSupportedFormats(android.hardware.camera2.CameraManager r16, java.lang.String r17) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = cachedSupportedFormats;
        monitor-enter(r5);
        r7 = r17;	 Catch:{ all -> 0x012e }
        r0 = r5.containsKey(r7);	 Catch:{ all -> 0x012e }
        if (r0 == 0) goto L_0x0013;	 Catch:{ all -> 0x012e }
    L_0x000b:
        r0 = r5.get(r7);	 Catch:{ all -> 0x012e }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x012e }
        monitor-exit(r5);	 Catch:{ all -> 0x012e }
    L_0x0012:
        return r0;	 Catch:{ all -> 0x012e }
    L_0x0013:
        r2 = "Camera2Enumerator";	 Catch:{ all -> 0x012e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012e }
        r1.<init>();	 Catch:{ all -> 0x012e }
        r0 = "Get supported formats for camera index ";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r1.append(r7);	 Catch:{ all -> 0x012e }
        r0 = ".";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r0 = r1.toString();	 Catch:{ all -> 0x012e }
        org.webrtc.Logging.m29383d(r2, r0);	 Catch:{ all -> 0x012e }
        r14 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x012e }
        r0 = r16;	 Catch:{ Exception -> 0x0111 }
        r2 = r0.getCameraCharacteristics(r7);	 Catch:{ Exception -> 0x0111 }
        r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;	 Catch:{ all -> 0x012e }
        r9 = r2.get(r0);	 Catch:{ all -> 0x012e }
        r9 = (android.hardware.camera2.params.StreamConfigurationMap) r9;	 Catch:{ all -> 0x012e }
        r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;	 Catch:{ all -> 0x012e }
        r1 = r2.get(r0);	 Catch:{ all -> 0x012e }
        r1 = (android.util.Range[]) r1;	 Catch:{ all -> 0x012e }
        r0 = getFpsUnitFactor(r1);	 Catch:{ all -> 0x012e }
        r0 = convertFramerates(r1, r0);	 Catch:{ all -> 0x012e }
        r2 = getSupportedSizes(r2);	 Catch:{ all -> 0x012e }
        r1 = r0.iterator();	 Catch:{ all -> 0x012e }
        r8 = 0;	 Catch:{ all -> 0x012e }
        r4 = 0;	 Catch:{ all -> 0x012e }
    L_0x005a:
        r0 = r1.hasNext();	 Catch:{ all -> 0x012e }
        if (r0 == 0) goto L_0x006d;	 Catch:{ all -> 0x012e }
    L_0x0060:
        r0 = r1.next();	 Catch:{ all -> 0x012e }
        r0 = (org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange) r0;	 Catch:{ all -> 0x012e }
        r0 = r0.max;	 Catch:{ all -> 0x012e }
        r4 = java.lang.Math.max(r4, r0);	 Catch:{ all -> 0x012e }
        goto L_0x005a;	 Catch:{ all -> 0x012e }
    L_0x006d:
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x012e }
        r6.<init>();	 Catch:{ all -> 0x012e }
        r13 = r2.iterator();	 Catch:{ all -> 0x012e }
    L_0x0076:
        r0 = r13.hasNext();	 Catch:{ all -> 0x012e }
        if (r0 == 0) goto L_0x00e4;	 Catch:{ all -> 0x012e }
    L_0x007c:
        r10 = r13.next();	 Catch:{ all -> 0x012e }
        r10 = (org.webrtc.Size) r10;	 Catch:{ all -> 0x012e }
        r11 = 0;	 Catch:{ all -> 0x012e }
        r3 = android.graphics.SurfaceTexture.class;	 Catch:{ Exception -> 0x0094 }
        r2 = new android.util.Size;	 Catch:{ Exception -> 0x0094 }
        r1 = r10.width;	 Catch:{ Exception -> 0x0094 }
        r0 = r10.height;	 Catch:{ Exception -> 0x0094 }
        r2.<init>(r1, r0);	 Catch:{ Exception -> 0x0094 }
        r2 = r9.getOutputMinFrameDuration(r3, r2);	 Catch:{ Exception -> 0x0094 }
        goto L_0x0096;	 Catch:{ Exception -> 0x0094 }
    L_0x0094:
        r2 = 0;
    L_0x0096:
        r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r0 != 0) goto L_0x009c;
    L_0x009a:
        r3 = r4;
        goto L_0x00ad;
    L_0x009c:
        r11 = 4741671816366391296; // 0x41cdcd6500000000 float:0.0 double:1.0E9;
        r0 = (double) r2;
        java.lang.Double.isNaN(r0);
        r11 = r11 / r0;
        r0 = java.lang.Math.round(r11);	 Catch:{ all -> 0x012e }
        r0 = (int) r0;	 Catch:{ all -> 0x012e }
        r3 = r0 * 1000;	 Catch:{ all -> 0x012e }
    L_0x00ad:
        r2 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat;	 Catch:{ all -> 0x012e }
        r1 = r10.width;	 Catch:{ all -> 0x012e }
        r0 = r10.height;	 Catch:{ all -> 0x012e }
        r2.<init>(r1, r0, r8, r3);	 Catch:{ all -> 0x012e }
        r6.add(r2);	 Catch:{ all -> 0x012e }
        r2 = "Camera2Enumerator";	 Catch:{ all -> 0x012e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012e }
        r1.<init>();	 Catch:{ all -> 0x012e }
        r0 = "Format: ";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r0 = r10.width;	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r0 = "x";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r0 = r10.height;	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r0 = "@";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r1.append(r3);	 Catch:{ all -> 0x012e }
        r0 = r1.toString();	 Catch:{ all -> 0x012e }
        org.webrtc.Logging.m29383d(r2, r0);	 Catch:{ all -> 0x012e }
        goto L_0x0076;	 Catch:{ all -> 0x012e }
    L_0x00e4:
        r5.put(r7, r6);	 Catch:{ all -> 0x012e }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x012e }
        r2 = "Camera2Enumerator";	 Catch:{ all -> 0x012e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012e }
        r1.<init>();	 Catch:{ all -> 0x012e }
        r0 = "Get supported formats for camera index ";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r1.append(r7);	 Catch:{ all -> 0x012e }
        r0 = " done. Time spent: ";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r3 = r3 - r14;	 Catch:{ all -> 0x012e }
        r1.append(r3);	 Catch:{ all -> 0x012e }
        r0 = " ms.";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r0 = r1.toString();	 Catch:{ all -> 0x012e }
        org.webrtc.Logging.m29383d(r2, r0);	 Catch:{ all -> 0x012e }
        monitor-exit(r5);	 Catch:{ all -> 0x012e }
        return r6;	 Catch:{ all -> 0x012e }
    L_0x0111:
        r3 = move-exception;	 Catch:{ all -> 0x012e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012e }
        r1.<init>();	 Catch:{ all -> 0x012e }
        r0 = "getCameraCharacteristics(): ";	 Catch:{ all -> 0x012e }
        r1.append(r0);	 Catch:{ all -> 0x012e }
        r1.append(r3);	 Catch:{ all -> 0x012e }
        r0 = r1.toString();	 Catch:{ all -> 0x012e }
        org.webrtc.Logging.m29384e(r2, r0);	 Catch:{ all -> 0x012e }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x012e }
        r0.<init>();	 Catch:{ all -> 0x012e }
        monitor-exit(r5);	 Catch:{ all -> 0x012e }
        goto L_0x0012;	 Catch:{ all -> 0x012e }
    L_0x012e:
        r0 = move-exception;	 Catch:{ all -> 0x012e }
        monitor-exit(r5);	 Catch:{ all -> 0x012e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera2Enumerator.getSupportedFormats(android.hardware.camera2.CameraManager, java.lang.String):java.util.List");
    }

    public List getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    public static List getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        List<Size> convertSizes = convertSizes(streamConfigurationMap.getOutputSizes(SurfaceTexture.class));
        if (VERSION.SDK_INT >= 22 || intValue != 2) {
            return convertSizes;
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        List arrayList = new ArrayList();
        for (Size size : convertSizes) {
            if (rect.width() * size.height == rect.height() * size.width) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public boolean isBackFacing(String str) {
        str = getCameraCharacteristics(str);
        if (str == null || ((Integer) str.get(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }

    public boolean isFrontFacing(String str) {
        str = getCameraCharacteristics(str);
        return str != null && ((Integer) str.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static boolean isSupported(Context context) {
        if (VERSION.SDK_INT >= 21) {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                int length = cameraIdList.length;
                int i = 0;
                while (i < length) {
                    if (((Integer) cameraManager.getCameraCharacteristics(cameraIdList[i]).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() != 2) {
                        i++;
                    }
                }
                return true;
            } catch (AndroidException e) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Camera access exception: ");
                stringBuilder.append(e);
                Logging.m29384e(str, stringBuilder.toString());
                return false;
            }
        }
        return false;
    }
}

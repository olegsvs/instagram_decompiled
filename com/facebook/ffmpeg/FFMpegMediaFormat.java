package com.facebook.ffmpeg;

import X.AnonymousClass1t6;
import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FFMpegMediaFormat {
    public static final AnonymousClass1t6 ALL_KEYS;
    private final Map mMap = new HashMap();

    static {
        Map hashMap = new HashMap();
        Class cls = String.class;
        hashMap.put("mime", cls);
        hashMap.put("language", cls);
        cls = Integer.class;
        hashMap.put("sample-rate", cls);
        hashMap.put("channel-count", cls);
        hashMap.put("width", cls);
        hashMap.put("height", cls);
        hashMap.put("max-width", cls);
        hashMap.put("max-height", cls);
        hashMap.put("max-input-size", cls);
        hashMap.put(TraceFieldType.Bitrate, cls);
        hashMap.put("color-format", cls);
        hashMap.put("frame-rate", cls);
        hashMap.put("i-frame-interval", cls);
        hashMap.put("stride", cls);
        hashMap.put("slice-height", cls);
        hashMap.put("repeat-previous-frame-after", Long.class);
        hashMap.put("push-blank-buffers-on-shutdown", Integer.class);
        hashMap.put("durationUs", Long.class);
        cls = Integer.class;
        hashMap.put("is-adts", cls);
        hashMap.put("channel-mask", cls);
        hashMap.put("aac-profile", cls);
        hashMap.put("flac-compression-level", cls);
        hashMap.put("is-autoselect", cls);
        hashMap.put("is-default", cls);
        hashMap.put("is-forced-subtitle", cls);
        ALL_KEYS = new AnonymousClass1t6(hashMap);
    }

    public final boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public final ByteBuffer getByteBuffer(String str) {
        return (ByteBuffer) this.mMap.get(str);
    }

    public final float getFloat(String str) {
        return ((Float) this.mMap.get(str)).floatValue();
    }

    public final int getInteger(String str) {
        return ((Integer) this.mMap.get(str)).intValue();
    }

    public final int getInteger(java.lang.String r1, int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0 = r0.getInteger(r1);	 Catch:{ NullPointerException -> 0x0005, NullPointerException -> 0x0005 }
        return r0;	 Catch:{ NullPointerException -> 0x0005, NullPointerException -> 0x0005 }
    L_0x0005:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegMediaFormat.getInteger(java.lang.String, int):int");
    }

    public final long getLong(String str) {
        return ((Long) this.mMap.get(str)).longValue();
    }

    public final long getLong(java.lang.String r1, long r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0 = r0.getLong(r1);	 Catch:{ NullPointerException -> 0x0005, NullPointerException -> 0x0005 }
        return r0;	 Catch:{ NullPointerException -> 0x0005, NullPointerException -> 0x0005 }
    L_0x0005:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegMediaFormat.getLong(java.lang.String, long):long");
    }

    public final String getString(String str) {
        return (String) this.mMap.get(str);
    }

    public final void setByteBuffer(String str, ByteBuffer byteBuffer) {
        this.mMap.put(str, byteBuffer);
    }

    public final void setFloat(String str, float f) {
        this.mMap.put(str, new Float(f));
    }

    public final void setInteger(String str, int i) {
        this.mMap.put(str, new Integer(i));
    }

    public final void setLong(String str, long j) {
        this.mMap.put(str, new Long(j));
    }

    public final void setString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public static FFMpegMediaFormat toFFMpegMediaFormat(MediaFormat mediaFormat) {
        FFMpegMediaFormat fFMpegMediaFormat = new FFMpegMediaFormat();
        for (Entry entry : ALL_KEYS.entrySet()) {
            String str = (String) entry.getKey();
            Class cls = (Class) entry.getValue();
            if (mediaFormat.containsKey(str)) {
                if (cls == String.class) {
                    fFMpegMediaFormat.setString(str, mediaFormat.getString(str));
                } else if (cls == Integer.class) {
                    fFMpegMediaFormat.setInteger(str, mediaFormat.getInteger(str));
                } else if (cls == Long.class) {
                    fFMpegMediaFormat.setLong(str, mediaFormat.getLong(str));
                } else if (cls == Float.class) {
                    fFMpegMediaFormat.setFloat(str, mediaFormat.getFloat(str));
                }
            }
        }
        return fFMpegMediaFormat;
    }

    public final String toString() {
        return this.mMap.toString();
    }
}

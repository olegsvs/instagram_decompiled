package com.facebook.yoga;

import org.webrtc.audio.WebRtcAudioRecord;

public enum YogaEdge {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    
    /* renamed from: B */
    private final int f34705B;

    private YogaEdge(int i) {
        this.f34705B = i;
    }

    /* renamed from: A */
    public final int m17416A() {
        return this.f34705B;
    }

    /* renamed from: B */
    public static YogaEdge m17415B(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown enum value: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;

/* renamed from: X.3DU */
public enum AnonymousClass3DU {
    MUSIC(C0164R.string.capture_format_music, C0164R.drawable.music_shutter_icon, C0164R.drawable.video_stop_icon, "music", true, true, false),
    LIVE(C0164R.string.capture_format_live, -1, -1, "live", false, true, false),
    TEXT(C0164R.string.capture_format_text, -1, -1, "rich-text", false, false, false),
    NORMAL(C0164R.string.capture_format_normal, -1, -1, "normal", false, true, true),
    BOOMERANG(C0164R.string.capture_format_boomerang, C0164R.drawable.boomerang_shutter_icon, -1, "boomerang", false, true, false),
    SUPERZOOM(C0164R.string.capture_format_superzoom, C0164R.drawable.superzoom_shutter_icon, r5, "superzoom", true, false, false),
    SUPERZOOMV3(C0164R.string.capture_format_superzoom, C0164R.drawable.superzoom_shutter_icon, C0164R.drawable.video_stop_icon, "superzoom", true, false, false),
    FOCUS(C0164R.string.capture_format_focus, C0164R.drawable.focus_shutter_icon, r5, "focus", false, false, true),
    SLOWMO(C0164R.string.capture_format_slowmo, C0164R.drawable.slowmo_shutter_icon, -1, "slowmo", false, true, false),
    HANDSFREE(C0164R.string.capture_format_handsfree, C0164R.drawable.video_shutter_icon, C0164R.drawable.video_stop_icon, "handsfree", false, true, true),
    REVERSE(C0164R.string.capture_format_reverse, C0164R.drawable.reverse_shutter_icon, C0164R.drawable.video_stop_icon, "reverse", true, true, true),
    UNKNOWN(-1, -1, -1, "unknown", false, false, false);
    
    /* renamed from: B */
    public final String f39302B;
    /* renamed from: C */
    public final int f39303C;
    /* renamed from: D */
    public String f39304D;
    /* renamed from: E */
    public final int f39305E;
    /* renamed from: F */
    public final String f39306F;
    /* renamed from: G */
    public String f39307G;
    /* renamed from: H */
    public final int f39308H;
    /* renamed from: I */
    public final boolean f39309I;
    /* renamed from: J */
    public final boolean f39310J;
    /* renamed from: K */
    public final boolean f39311K;
    /* renamed from: L */
    private Drawable f39312L;
    /* renamed from: M */
    private Drawable f39313M;

    private AnonymousClass3DU(int i, int i2, int i3, String str, boolean z, boolean z2, boolean z3) {
        this.f39305E = i;
        this.f39303C = i2;
        this.f39302B = str;
        this.f39306F = str;
        this.f39308H = i3;
        this.f39309I = z;
        this.f39311K = z2;
        this.f39310J = z3;
    }

    /* renamed from: A */
    public final Drawable m19071A(Context context) {
        int i = this.f39303C;
        if (i != -1 && this.f39312L == null) {
            this.f39312L = AnonymousClass0Ca.E(context, i);
        }
        return this.f39312L;
    }

    /* renamed from: B */
    public static AnonymousClass3DU m19070B(String str) {
        for (AnonymousClass3DU anonymousClass3DU : AnonymousClass3DU.values()) {
            if (anonymousClass3DU.f39306F.equals(str)) {
                return anonymousClass3DU;
            }
        }
        return UNKNOWN;
    }

    /* renamed from: B */
    public final Drawable m19072B(Context context) {
        int i = this.f39308H;
        if (i != -1 && this.f39313M == null) {
            this.f39313M = AnonymousClass0Ca.E(context, i);
        }
        return this.f39313M;
    }

    /* renamed from: C */
    public final boolean m19073C() {
        if (!(this == SUPERZOOM || this == FOCUS)) {
            if (this != SUPERZOOMV3) {
                return false;
            }
        }
        return true;
    }
}

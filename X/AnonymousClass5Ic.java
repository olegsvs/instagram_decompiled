package X;

import android.content.Intent;
import android.net.Uri.Builder;
import com.facebook.C0164R;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.5Ic */
public enum AnonymousClass5Ic {
    CAMERA("camera", "story-camera", C0164R.string.camera_shortcut, C0164R.drawable.dock_camera_whiteout),
    POST("post", "share", C0164R.string.post_shortcut, C0164R.drawable.tab_camera_drawable),
    ACTIVITY("activity", "news", C0164R.string.activity_shortcut, C0164R.drawable.tab_activity_drawable),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "direct-inbox", C0164R.string.direct_shortcut, C0164R.drawable.instagram_direct_filled_24);
    
    /* renamed from: B */
    public final int f61877B;
    /* renamed from: C */
    public final String f61878C;
    /* renamed from: D */
    public final Intent f61879D;
    /* renamed from: E */
    public final int f61880E;

    private AnonymousClass5Ic(String str, String str2, int i, int i2) {
        this.f61878C = str;
        this.f61879D = new Intent("android.intent.action.VIEW");
        this.f61879D.setData(new Builder().scheme("instagram").authority(str2).appendQueryParameter("app_shortcut", "true").build());
        this.f61880E = i;
        this.f61877B = i2;
    }
}

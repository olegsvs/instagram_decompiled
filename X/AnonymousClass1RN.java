package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.video.videocall.activity.VideoCallActivity;

/* renamed from: X.1RN */
public final class AnonymousClass1RN implements AnonymousClass1mh {
    public AnonymousClass1RN(VideoCallActivity videoCallActivity) {
    }

    /* renamed from: B */
    private void m11431B(ViewGroup viewGroup, AnonymousClass1mx anonymousClass1mx) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getFitsSystemWindows()) {
                AnonymousClass0mE.f9733B.m9019T(childAt, anonymousClass1mx);
            }
            if (childAt instanceof ViewGroup) {
                m11431B((ViewGroup) childAt, anonymousClass1mx);
            }
        }
    }

    public final AnonymousClass1mx ad(View view, AnonymousClass1mx anonymousClass1mx) {
        if (view instanceof ViewGroup) {
            m11431B((ViewGroup) view, anonymousClass1mx);
        }
        return anonymousClass1mx;
    }
}

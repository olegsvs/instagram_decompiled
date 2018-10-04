package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.4ea */
public final class AnonymousClass4ea {
    /* renamed from: B */
    private AnonymousClass5Ul f56021B;
    /* renamed from: C */
    private final AnonymousClass2Hx f56022C = new AnonymousClass2Hx();
    /* renamed from: D */
    private final AnonymousClass2Hx f56023D = new AnonymousClass2Hx();
    /* renamed from: E */
    private final AnonymousClass2Hx f56024E = new AnonymousClass2Hx();

    public AnonymousClass4ea(Context context, AnonymousClass5Ul anonymousClass5Ul, AnonymousClass2Hy anonymousClass2Hy) {
        this.f56021B = anonymousClass5Ul;
        if (AnonymousClass0G5.B(context, C0164R.attr.directInboxEmptyStateDetailedEnabled, true)) {
            m24662B(context, AnonymousClass0Ws.ALL);
            this.f56022C.f28600F = C0164R.drawable.empty_state_direct;
            this.f56022C.f28599E = AnonymousClass0Ca.C(context, C0164R.color.grey_9);
            this.f56022C.f28598D = anonymousClass2Hy;
        } else {
            this.f56022C.f28608N = context.getString(C0164R.string.direct_inbox_empty_view_title_no_messages);
        }
        this.f56022C.f28596B = AnonymousClass0Ca.C(context, C0164R.color.white);
        this.f56024E.f28600F = C0164R.drawable.loadmore_icon_refresh_compound;
        this.f56024E.f28596B = this.f56022C.f28596B;
        this.f56023D.f28596B = this.f56022C.f28596B;
        this.f56023D.f28610P = new AnonymousClass4eY(this, anonymousClass5Ul);
    }

    /* renamed from: A */
    public final AnonymousClass4eZ m24661A(boolean z, boolean z2, boolean z3) {
        if (!(z || z2)) {
            if (AnonymousClass18O.L(this.f56021B.f65088B)) {
                return new AnonymousClass4eZ(this.f56024E, AnonymousClass2I0.LOADING);
            }
            if (this.f56021B.B()) {
                return new AnonymousClass4eZ(this.f56023D, AnonymousClass2I0.ERROR);
            }
            if (!z3) {
                return new AnonymousClass4eZ(this.f56022C, AnonymousClass2I0.EMPTY);
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m24662B(Context context, AnonymousClass0Ws anonymousClass0Ws) {
        int i;
        int i2;
        int i3;
        switch (anonymousClass0Ws.ordinal()) {
            case 0:
                i = C0164R.string.direct_inbox_empty_view_title;
                i2 = C0164R.string.direct_inbox_empty_view_subtitle;
                i3 = C0164R.string.direct_send_message;
                break;
            case 1:
                i = C0164R.string.direct_inbox_empty_view_title_unread;
                i2 = C0164R.string.direct_inbox_empty_view_subtitle_unread;
                i3 = C0164R.string.direct_inbox_empty_view_back_to_inbox;
                break;
            case 2:
                i = C0164R.string.direct_inbox_empty_view_title_flagged;
                i2 = C0164R.string.direct_inbox_empty_view_subtitle_flagged;
                i3 = C0164R.string.direct_inbox_empty_view_back_to_inbox;
                break;
            default:
                throw new RuntimeException("Invalid filter");
        }
        this.f56022C.f28608N = context.getString(i);
        this.f56022C.f28606L = context.getString(i2);
        this.f56022C.f28597C = context.getString(i3);
    }
}

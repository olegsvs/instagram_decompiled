package X;

import com.facebook.C0164R;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.6EG */
public final class AnonymousClass6EG {
    /* renamed from: B */
    public final /* synthetic */ EditProfileFieldsController f73124B;

    public AnonymousClass6EG(EditProfileFieldsController editProfileFieldsController) {
        this.f73124B = editProfileFieldsController;
    }

    /* renamed from: A */
    public final AnonymousClass5jT m29564A(AnonymousClass5jT anonymousClass5jT, CharSequence charSequence, boolean z) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.isEmpty()) {
            anonymousClass5jT.f68576C = "error";
            anonymousClass5jT.f68575B = this.f73124B.mContext.getResources().getString(C0164R.string.username_cannot_be_empty);
            return anonymousClass5jT;
        }
        if (this.f73124B.f73127D == null || !charSequence2.equals(this.f73124B.f73127D.f27904P)) {
            Integer num = (Integer) this.f73124B.f73129F.get(charSequence2);
            if (num != null) {
                if (num.equals(Integer.valueOf(1))) {
                    anonymousClass5jT.f68576C = "confirmed";
                    return anonymousClass5jT;
                } else if (num.equals(Integer.valueOf(2))) {
                    anonymousClass5jT.f68576C = "error";
                    anonymousClass5jT.f68575B = this.f73124B.mContext.getResources().getString(C0164R.string.username_not_available);
                    return anonymousClass5jT;
                } else if (num.equals(Integer.valueOf(0))) {
                }
            }
            AnonymousClass5nS anonymousClass5nS = this.f73124B.f73126C;
            anonymousClass5nS.removeMessages(1);
            anonymousClass5nS.sendEmptyMessageDelayed(1, 1000);
            anonymousClass5jT.f68576C = "loading";
            return anonymousClass5jT;
        }
        return anonymousClass5jT;
    }
}

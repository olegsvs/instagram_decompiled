package X;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.reels.fragment.ReelMoreOptionsFragment;

/* renamed from: X.5vY */
public class AnonymousClass5vY extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ ReelMoreOptionsFragment f70059B;

    public AnonymousClass5vY(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        this.f70059B = reelMoreOptionsFragment;
    }

    public void onClick(View view) {
        if (AnonymousClass5vX.EXPANDED_WEB_OPTION.equals(this.f70059B.f5158I)) {
            String str = this.f70059B.f5163N.f28714B;
            if (TextUtils.isEmpty(str.trim())) {
                AnonymousClass0IG.D(this.f70059B.getContext(), this.f70059B.getContext().getString(C0164R.string.weblink_empty_link_error));
                return;
            }
            String C = ReelMoreOptionsFragment.C(str);
            AnonymousClass3FR anonymousClass3FR = this.f70059B.f5166Q;
            anonymousClass3FR.xB++;
            new AnonymousClass0he(this.f70059B.getActivity(), this.f70059B.f5164O, C, AnonymousClass0hf.REEL_WEB_LINK_FROM_USER).E(this.f70059B.getModuleName()).D();
        } else if (AnonymousClass5vX.EXPANDED_IGTV_OPTION.equals(this.f70059B.f5158I)) {
            AnonymousClass0TP anonymousClass0TP = new AnonymousClass0TP(AnonymousClass2CQ.STORIES, System.currentTimeMillis());
            anonymousClass0TP.f5195I = this.f70059B.f5161L;
            anonymousClass0TP = anonymousClass0TP.C();
            anonymousClass0TP.f5197K = AnonymousClass0Nm.L(view);
            anonymousClass0TP.D(this.f70059B.getActivity(), this.f70059B.f5164O, this.f70059B.f5152C);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }
}

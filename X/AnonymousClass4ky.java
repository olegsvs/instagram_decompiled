package X;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.SpinningGradientBorder;

/* renamed from: X.4ky */
public final class AnonymousClass4ky {
    /* renamed from: B */
    public final int f56836B;
    /* renamed from: C */
    public final View f56837C;
    /* renamed from: D */
    public final SpinningGradientBorder f56838D;
    /* renamed from: E */
    public final TextView f56839E;

    public AnonymousClass4ky(View view, int i) {
        this.f56837C = view.findViewById(C0164R.id.one_tap_send_button_container);
        SpinningGradientBorder spinningGradientBorder = (SpinningGradientBorder) view.findViewById(C0164R.id.one_tap_send_button_spinning_gradient_border);
        this.f56838D = spinningGradientBorder;
        this.f56839E = (TextView) spinningGradientBorder.findViewById(C0164R.id.selectable_user_row_send_button_text_view);
        this.f56836B = i;
    }

    /* renamed from: A */
    public final void m24988A(AnonymousClass4ij anonymousClass4ij, AnonymousClass4kx anonymousClass4kx, int i) {
        AnonymousClass4ky anonymousClass4ky = this;
        if ((this.f56836B == 2 && i <= 1) || (this.f56836B != 2 && i > 1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("misconfigured holder. type=");
            stringBuilder.append(this.f56836B);
            stringBuilder.append(", numTargets=");
            stringBuilder.append(i);
            AnonymousClass0Gn.H("OneTapSendButtonHolder", stringBuilder.toString());
        }
        int xN = anonymousClass4kx.xN(this.f56839E);
        LayoutParams layoutParams = this.f56839E.getLayoutParams();
        if (layoutParams.width != xN) {
            layoutParams.width = xN;
            this.f56839E.setLayoutParams(layoutParams);
        }
        String string;
        switch (anonymousClass4ij.f56490C) {
            case -1:
            case 0:
                Context context = this.f56838D.getContext();
                switch (this.f56836B) {
                    case 1:
                        string = context.getResources().getString(C0164R.string.share);
                        break;
                    case 2:
                        string = context.getResources().getString(C0164R.string.direct_send_to_x, new Object[]{Integer.valueOf(i)});
                        break;
                    case 3:
                        string = context.getResources().getString(C0164R.string.add);
                        break;
                    case 4:
                        string = context.getResources().getString(C0164R.string.invites_button_text);
                        break;
                    default:
                        string = context.getResources().getString(C0164R.string.send);
                        break;
                }
                AnonymousClass4ky.m24987B(anonymousClass4ky, 0, string, AnonymousClass0G5.F(context, C0164R.attr.primaryButtonBackground), C0164R.color.white, new AnonymousClass4kv(anonymousClass4ky, anonymousClass4kx));
                return;
            case 1:
                long j = anonymousClass4ij.f56489B;
                AnonymousClass4ky.m24987B(anonymousClass4ky, 1, this.f56838D.getContext().getString(C0164R.string.undo), C0164R.drawable.bg_rounded_white, C0164R.color.grey_9, new AnonymousClass4kw(anonymousClass4ky, anonymousClass4kx));
                if (j > 0) {
                    anonymousClass4ky.f56838D.setCurrentPlayTime(j);
                }
                return;
            case 2:
                Context context2 = this.f56838D.getContext();
                switch (this.f56836B) {
                    case 1:
                        string = context2.getResources().getString(C0164R.string.direct_recipient_user_story_target_shared);
                        break;
                    case 2:
                        string = context2.getResources().getString(C0164R.string.direct_sent_to_x, new Object[]{Integer.valueOf(i)});
                        break;
                    case 3:
                        string = context2.getResources().getString(C0164R.string.added);
                        break;
                    default:
                        string = context2.getResources().getString(C0164R.string.direct_story_action_log_sent);
                        break;
                }
                AnonymousClass4ky.m24987B(anonymousClass4ky, 2, string, C0164R.drawable.bg_rounded_white, C0164R.color.grey_9, null);
                return;
            case 3:
                AnonymousClass4ky.m24987B(anonymousClass4ky, 0, this.f56837C.getResources().getString(C0164R.string.direct_story_action_log_sent), 0, C0164R.color.grey_6, null);
                return;
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unhandled OneTapSendState");
                stringBuilder.append(anonymousClass4ij.f56490C);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: B */
    public final void m24989B(AnonymousClass4ij anonymousClass4ij, AnonymousClass4kx anonymousClass4kx) {
        m24988A(anonymousClass4ij, anonymousClass4kx, 1);
    }

    /* renamed from: B */
    public static void m24987B(AnonymousClass4ky anonymousClass4ky, int i, String str, int i2, int i3, OnClickListener onClickListener) {
        anonymousClass4ky.f56839E.setText(str);
        anonymousClass4ky.f56839E.setTextColor(AnonymousClass0Ca.C(anonymousClass4ky.f56838D.getContext(), i3));
        anonymousClass4ky.f56838D.setBackgroundResource(i2);
        anonymousClass4ky.f56838D.setSpinnerState(i);
        anonymousClass4ky.f56837C.setOnClickListener(onClickListener);
    }

    /* renamed from: C */
    public final void m24990C(boolean z) {
        this.f56837C.setClickable(z);
    }
}

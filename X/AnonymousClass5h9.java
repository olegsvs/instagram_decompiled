package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.facebook.C0164R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;

/* renamed from: X.5h9 */
public final class AnonymousClass5h9 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ InstantExperiencesBrowserChrome f68177B;

    public AnonymousClass5h9(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        this.f68177B = instantExperiencesBrowserChrome;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CharSequence[] menuOptions = InstantExperiencesBrowserChrome.getMenuOptions(this.f68177B);
        if (menuOptions[i].equals(this.f68177B.getContext().getString(C0164R.string.instant_experiences_clear_autofill))) {
            AnonymousClass0HV D = AnonymousClass0HV.D(this.f68177B.f68187K);
            D.f2646B.edit().remove("ix_autofill_name").apply();
            D.f2646B.edit().remove("ix_autofill_phone").apply();
            D.f2646B.edit().remove("ix_autofill_address").apply();
            D.f2646B.edit().remove("ix_autofill_email").apply();
            AnonymousClass0IG.G(this.f68177B.getContext(), C0164R.string.instant_experiences_autofill_cleared);
        } else if (menuOptions[i].equals(this.f68177B.getContext().getString(C0164R.string.instant_experiences_refresh))) {
            this.f68177B.f68182F.m28274A().reload();
        } else if (menuOptions[i].equals(this.f68177B.getContext().getString(C0164R.string.instant_experiences_copy_link))) {
            ((ClipboardManager) this.f68177B.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Instant Experiences Link URL", this.f68177B.f68182F.m28274A().getUrl()));
            AnonymousClass0IG.G(this.f68177B.getContext(), C0164R.string.instant_experiences_link_copied);
        } else if (menuOptions[i].equals(this.f68177B.getContext().getString(C0164R.string.instant_experiences_open_with))) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f68177B.f68182F.m28274A().getUrl()));
            AnonymousClass0Kw.B().D().A(intent, this.f68177B.f68181E);
        }
    }
}

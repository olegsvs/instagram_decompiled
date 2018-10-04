package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.TextView.BufferType;
import com.facebook.C0164R;

/* renamed from: X.52G */
public final class AnonymousClass52G implements AnonymousClass0ui {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass52H f59416B;

    public final void pDA(AnonymousClass0iq anonymousClass0iq) {
    }

    public final void qDA(AnonymousClass0iq anonymousClass0iq) {
    }

    public final void sDA(AnonymousClass0iq anonymousClass0iq) {
    }

    public AnonymousClass52G(AnonymousClass52H anonymousClass52H) {
        this.f59416B = anonymousClass52H;
    }

    public final void nDA(AnonymousClass0iq anonymousClass0iq) {
        ClipData primaryClip = ((ClipboardManager) this.f59416B.f59417B.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip.getItemCount() > 0) {
            CharSequence text = primaryClip.getItemAt(0).getText();
            if (text.length() == this.f59416B.f59417B.f59423D.getMaximumSize()) {
                this.f59416B.f59417B.f59423D.setText(text, BufferType.EDITABLE);
                this.f59416B.f59417B.f59423D.setSelection(text.length());
            } else {
                AnonymousClass1TN.C(this.f59416B.f59417B.getContext(), this.f59416B.f59417B.getString(C0164R.string.two_fac_confirmation_code_invalid), 0).show();
            }
        }
        anonymousClass0iq.A(true);
    }
}
